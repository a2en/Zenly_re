package com.squareup.wire;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import okio.BufferedSource;
import okio.C13346d;

public final class ProtoReader {
    private static final int FIELD_ENCODING_MASK = 7;
    private static final int RECURSION_LIMIT = 65;
    private static final int STATE_END_GROUP = 4;
    private static final int STATE_FIXED32 = 5;
    private static final int STATE_FIXED64 = 1;
    private static final int STATE_LENGTH_DELIMITED = 2;
    private static final int STATE_PACKED_TAG = 7;
    private static final int STATE_START_GROUP = 3;
    private static final int STATE_TAG = 6;
    private static final int STATE_VARINT = 0;
    static final int TAG_FIELD_ENCODING_BITS = 3;
    private long limit = Long.MAX_VALUE;
    private FieldEncoding nextFieldEncoding;
    private long pos = 0;
    private long pushedLimit = -1;
    private int recursionDepth;
    private final BufferedSource source;
    private int state = 2;
    private int tag = -1;

    public ProtoReader(BufferedSource bufferedSource) {
        this.source = bufferedSource;
    }

    private void afterPackableScalar(int i) throws IOException {
        if (this.state == i) {
            this.state = 6;
            return;
        }
        long j = this.pos;
        long j2 = this.limit;
        if (j > j2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected to end at ");
            sb.append(this.limit);
            sb.append(" but was ");
            sb.append(this.pos);
            throw new IOException(sb.toString());
        } else if (j == j2) {
            this.limit = this.pushedLimit;
            this.pushedLimit = -1;
            this.state = 6;
        } else {
            this.state = 7;
        }
    }

    private long beforeLengthDelimitedScalar() throws IOException {
        if (this.state == 2) {
            long j = this.limit - this.pos;
            this.source.require(j);
            this.state = 6;
            this.pos = this.limit;
            this.limit = this.pushedLimit;
            this.pushedLimit = -1;
            return j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected LENGTH_DELIMITED but was ");
        sb.append(this.state);
        throw new ProtocolException(sb.toString());
    }

    private int internalReadVarint32() throws IOException {
        byte b;
        int i;
        this.source.require(1);
        this.pos++;
        byte readByte = this.source.readByte();
        if (readByte >= 0) {
            return readByte;
        }
        byte b2 = readByte & Byte.MAX_VALUE;
        this.source.require(1);
        this.pos++;
        byte readByte2 = this.source.readByte();
        if (readByte2 >= 0) {
            i = readByte2 << 7;
        } else {
            b2 |= (readByte2 & Byte.MAX_VALUE) << 7;
            this.source.require(1);
            this.pos++;
            byte readByte3 = this.source.readByte();
            if (readByte3 >= 0) {
                i = readByte3 << 14;
            } else {
                b2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                this.source.require(1);
                this.pos++;
                byte readByte4 = this.source.readByte();
                if (readByte4 >= 0) {
                    i = readByte4 << 21;
                } else {
                    byte b3 = b2 | ((readByte4 & Byte.MAX_VALUE) << 21);
                    this.source.require(1);
                    this.pos++;
                    byte readByte5 = this.source.readByte();
                    b = b3 | (readByte5 << 28);
                    if (readByte5 < 0) {
                        for (int i2 = 0; i2 < 5; i2++) {
                            this.source.require(1);
                            this.pos++;
                            if (this.source.readByte() >= 0) {
                                return b;
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return b;
                }
            }
        }
        b = b2 | i;
        return b;
    }

    private void skipGroup(int i) throws IOException {
        while (this.pos < this.limit && !this.source.exhausted()) {
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 != 0) {
                int i2 = internalReadVarint32 >> 3;
                int i3 = internalReadVarint32 & 7;
                if (i3 == 0) {
                    this.state = 0;
                    readVarint64();
                } else if (i3 == 1) {
                    this.state = 1;
                    readFixed64();
                } else if (i3 == 2) {
                    long internalReadVarint322 = (long) internalReadVarint32();
                    this.pos += internalReadVarint322;
                    this.source.skip(internalReadVarint322);
                } else if (i3 == 3) {
                    skipGroup(i2);
                } else if (i3 != 4) {
                    if (i3 == 5) {
                        this.state = 5;
                        readFixed32();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected field encoding: ");
                        sb.append(i3);
                        throw new ProtocolException(sb.toString());
                    }
                } else if (i2 != i) {
                    throw new ProtocolException("Unexpected end group");
                } else {
                    return;
                }
            } else {
                throw new ProtocolException("Unexpected tag 0");
            }
        }
        throw new EOFException();
    }

    public long beginMessage() throws IOException {
        if (this.state == 2) {
            int i = this.recursionDepth + 1;
            this.recursionDepth = i;
            if (i <= 65) {
                long j = this.pushedLimit;
                this.pushedLimit = -1;
                this.state = 6;
                return j;
            }
            throw new IOException("Wire recursion limit exceeded");
        }
        throw new IllegalStateException("Unexpected call to beginMessage()");
    }

    public void endMessage(long j) throws IOException {
        if (this.state == 6) {
            int i = this.recursionDepth - 1;
            this.recursionDepth = i;
            if (i < 0 || this.pushedLimit != -1) {
                throw new IllegalStateException("No corresponding call to beginMessage()");
            } else if (this.pos == this.limit || this.recursionDepth == 0) {
                this.limit = j;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected to end at ");
                sb.append(this.limit);
                sb.append(" but was ");
                sb.append(this.pos);
                throw new IOException(sb.toString());
            }
        } else {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
    }

    public int nextTag() throws IOException {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        } else if (i == 6) {
            while (this.pos < this.limit && !this.source.exhausted()) {
                int internalReadVarint32 = internalReadVarint32();
                if (internalReadVarint32 != 0) {
                    this.tag = internalReadVarint32 >> 3;
                    int i2 = internalReadVarint32 & 7;
                    if (i2 == 0) {
                        this.nextFieldEncoding = FieldEncoding.VARINT;
                        this.state = 0;
                        return this.tag;
                    } else if (i2 == 1) {
                        this.nextFieldEncoding = FieldEncoding.FIXED64;
                        this.state = 1;
                        return this.tag;
                    } else if (i2 == 2) {
                        this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                        this.state = 2;
                        int internalReadVarint322 = internalReadVarint32();
                        if (internalReadVarint322 < 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Negative length: ");
                            sb.append(internalReadVarint322);
                            throw new ProtocolException(sb.toString());
                        } else if (this.pushedLimit == -1) {
                            this.pushedLimit = this.limit;
                            this.limit = this.pos + ((long) internalReadVarint322);
                            if (this.limit <= this.pushedLimit) {
                                return this.tag;
                            }
                            throw new EOFException();
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (i2 == 3) {
                        skipGroup(this.tag);
                    } else if (i2 == 4) {
                        throw new ProtocolException("Unexpected end group");
                    } else if (i2 == 5) {
                        this.nextFieldEncoding = FieldEncoding.FIXED32;
                        this.state = 5;
                        return this.tag;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unexpected field encoding: ");
                        sb2.append(i2);
                        throw new ProtocolException(sb2.toString());
                    }
                } else {
                    throw new ProtocolException("Unexpected tag 0");
                }
            }
            return -1;
        } else {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
    }

    public FieldEncoding peekFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public C13346d readBytes() throws IOException {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.require(beforeLengthDelimitedScalar);
        return this.source.readByteString(beforeLengthDelimitedScalar);
    }

    public int readFixed32() throws IOException {
        int i = this.state;
        if (i == 5 || i == 2) {
            this.source.require(4);
            this.pos += 4;
            int readIntLe = this.source.readIntLe();
            afterPackableScalar(5);
            return readIntLe;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected FIXED32 or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        throw new ProtocolException(sb.toString());
    }

    public long readFixed64() throws IOException {
        int i = this.state;
        if (i == 1 || i == 2) {
            this.source.require(8);
            this.pos += 8;
            long readLongLe = this.source.readLongLe();
            afterPackableScalar(1);
            return readLongLe;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected FIXED64 or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        throw new ProtocolException(sb.toString());
    }

    public String readString() throws IOException {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.require(beforeLengthDelimitedScalar);
        return this.source.readUtf8(beforeLengthDelimitedScalar);
    }

    public int readVarint32() throws IOException {
        int i = this.state;
        if (i == 0 || i == 2) {
            int internalReadVarint32 = internalReadVarint32();
            afterPackableScalar(0);
            return internalReadVarint32;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        throw new ProtocolException(sb.toString());
    }

    public long readVarint64() throws IOException {
        int i = this.state;
        if (i == 0 || i == 2) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                this.source.require(1);
                this.pos++;
                byte readByte = this.source.readByte();
                j |= ((long) (readByte & Byte.MAX_VALUE)) << i2;
                if ((readByte & 128) == 0) {
                    afterPackableScalar(0);
                    return j;
                }
            }
            throw new ProtocolException("WireInput encountered a malformed varint");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        throw new ProtocolException(sb.toString());
    }

    public void skip() throws IOException {
        int i = this.state;
        if (i == 0) {
            readVarint64();
        } else if (i == 1) {
            readFixed64();
        } else if (i == 2) {
            this.source.skip(beforeLengthDelimitedScalar());
        } else if (i == 5) {
            readFixed32();
        } else {
            throw new IllegalStateException("Unexpected call to skip()");
        }
    }
}
