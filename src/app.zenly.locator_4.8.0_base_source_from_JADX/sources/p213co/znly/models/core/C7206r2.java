package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.core.r2 */
public final class C7206r2 extends GeneratedMessageLite<C7206r2, C7207a> implements TypesProto$ValueTypeOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final C7206r2 f17865n = new C7206r2();

    /* renamed from: o */
    private static volatile Parser<C7206r2> f17866o;

    /* renamed from: e */
    private boolean f17867e;

    /* renamed from: f */
    private int f17868f;

    /* renamed from: g */
    private long f17869g;

    /* renamed from: h */
    private int f17870h;

    /* renamed from: i */
    private long f17871i;

    /* renamed from: j */
    private float f17872j;

    /* renamed from: k */
    private double f17873k;

    /* renamed from: l */
    private String f17874l = "";

    /* renamed from: m */
    private ByteString f17875m = ByteString.EMPTY;

    /* renamed from: co.znly.models.core.r2$a */
    public static final class C7207a extends Builder<C7206r2, C7207a> implements TypesProto$ValueTypeOrBuilder {
        /* synthetic */ C7207a(C7253x1 x1Var) {
            this();
        }

        /* renamed from: a */
        public C7207a mo19187a(boolean z) {
            copyOnWrite();
            ((C7206r2) this.instance).m17943a(z);
            return this;
        }

        public boolean getBool() {
            return ((C7206r2) this.instance).getBool();
        }

        public ByteString getBytes() {
            return ((C7206r2) this.instance).getBytes();
        }

        public double getDouble() {
            return ((C7206r2) this.instance).getDouble();
        }

        public float getFloat() {
            return ((C7206r2) this.instance).getFloat();
        }

        public int getInt32() {
            return ((C7206r2) this.instance).getInt32();
        }

        public long getInt64() {
            return ((C7206r2) this.instance).getInt64();
        }

        public String getString() {
            return ((C7206r2) this.instance).getString();
        }

        public ByteString getStringBytes() {
            return ((C7206r2) this.instance).getStringBytes();
        }

        public int getUint32() {
            return ((C7206r2) this.instance).getUint32();
        }

        public long getUint64() {
            return ((C7206r2) this.instance).getUint64();
        }

        private C7207a() {
            super(C7206r2.f17865n);
        }

        /* renamed from: a */
        public C7207a mo19183a(int i) {
            copyOnWrite();
            ((C7206r2) this.instance).m17934a(i);
            return this;
        }

        /* renamed from: a */
        public C7207a mo19184a(long j) {
            copyOnWrite();
            ((C7206r2) this.instance).m17935a(j);
            return this;
        }

        /* renamed from: a */
        public C7207a mo19186a(String str) {
            copyOnWrite();
            ((C7206r2) this.instance).m17942a(str);
            return this;
        }

        /* renamed from: a */
        public C7207a mo19185a(ByteString byteString) {
            copyOnWrite();
            ((C7206r2) this.instance).m17936a(byteString);
            return this;
        }
    }

    static {
        f17865n.makeImmutable();
    }

    private C7206r2() {
    }

    public static C7207a newBuilder() {
        return (C7207a) f17865n.toBuilder();
    }

    public static Parser<C7206r2> parser() {
        return f17865n.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7206r2();
            case 2:
                return f17865n;
            case 3:
                return null;
            case 4:
                return new C7207a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7206r2 r2Var = (C7206r2) obj2;
                boolean z2 = this.f17867e;
                boolean z3 = r2Var.f17867e;
                this.f17867e = visitor.visitBoolean(z2, z2, z3, z3);
                this.f17868f = visitor.visitInt(this.f17868f != 0, this.f17868f, r2Var.f17868f != 0, r2Var.f17868f);
                this.f17869g = visitor.visitLong(this.f17869g != 0, this.f17869g, r2Var.f17869g != 0, r2Var.f17869g);
                this.f17870h = visitor.visitInt(this.f17870h != 0, this.f17870h, r2Var.f17870h != 0, r2Var.f17870h);
                this.f17871i = visitor.visitLong(this.f17871i != 0, this.f17871i, r2Var.f17871i != 0, r2Var.f17871i);
                this.f17872j = visitor.visitFloat(this.f17872j != 0.0f, this.f17872j, r2Var.f17872j != 0.0f, r2Var.f17872j);
                this.f17873k = visitor.visitDouble(this.f17873k != 0.0d, this.f17873k, r2Var.f17873k != 0.0d, r2Var.f17873k);
                this.f17874l = visitor.visitString(!this.f17874l.isEmpty(), this.f17874l, !r2Var.f17874l.isEmpty(), r2Var.f17874l);
                boolean z4 = this.f17875m != ByteString.EMPTY;
                ByteString byteString = this.f17875m;
                if (r2Var.f17875m != ByteString.EMPTY) {
                    z = true;
                }
                this.f17875m = visitor.visitByteString(z4, byteString, z, r2Var.f17875m);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f17867e = codedInputStream.readBool();
                            } else if (readTag == 16) {
                                this.f17868f = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                this.f17869g = codedInputStream.readInt64();
                            } else if (readTag == 32) {
                                this.f17870h = codedInputStream.readUInt32();
                            } else if (readTag == 40) {
                                this.f17871i = codedInputStream.readUInt64();
                            } else if (readTag == 53) {
                                this.f17872j = codedInputStream.readFloat();
                            } else if (readTag == 57) {
                                this.f17873k = codedInputStream.readDouble();
                            } else if (readTag == 66) {
                                this.f17874l = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 74) {
                                this.f17875m = codedInputStream.readBytes();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw new RuntimeException(e.setUnfinishedMessage(this));
                    } catch (IOException e2) {
                        throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f17866o == null) {
                    synchronized (C7206r2.class) {
                        if (f17866o == null) {
                            f17866o = new DefaultInstanceBasedParser(f17865n);
                        }
                    }
                }
                return f17866o;
            default:
                throw new UnsupportedOperationException();
        }
        return f17865n;
    }

    public boolean getBool() {
        return this.f17867e;
    }

    public ByteString getBytes() {
        return this.f17875m;
    }

    public double getDouble() {
        return this.f17873k;
    }

    public float getFloat() {
        return this.f17872j;
    }

    public int getInt32() {
        return this.f17868f;
    }

    public long getInt64() {
        return this.f17869g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.f17867e;
        if (z) {
            i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
        }
        int i3 = this.f17868f;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(2, i3);
        }
        long j = this.f17869g;
        if (j != 0) {
            i2 += CodedOutputStream.computeInt64Size(3, j);
        }
        int i4 = this.f17870h;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeUInt32Size(4, i4);
        }
        long j2 = this.f17871i;
        if (j2 != 0) {
            i2 += CodedOutputStream.computeUInt64Size(5, j2);
        }
        float f = this.f17872j;
        if (f != 0.0f) {
            i2 += CodedOutputStream.computeFloatSize(6, f);
        }
        double d = this.f17873k;
        if (d != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(7, d);
        }
        if (!this.f17874l.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(8, getString());
        }
        if (!this.f17875m.isEmpty()) {
            i2 += CodedOutputStream.computeBytesSize(9, this.f17875m);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getString() {
        return this.f17874l;
    }

    public ByteString getStringBytes() {
        return ByteString.copyFromUtf8(this.f17874l);
    }

    public int getUint32() {
        return this.f17870h;
    }

    public long getUint64() {
        return this.f17871i;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z = this.f17867e;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
        int i = this.f17868f;
        if (i != 0) {
            codedOutputStream.writeInt32(2, i);
        }
        long j = this.f17869g;
        if (j != 0) {
            codedOutputStream.writeInt64(3, j);
        }
        int i2 = this.f17870h;
        if (i2 != 0) {
            codedOutputStream.writeUInt32(4, i2);
        }
        long j2 = this.f17871i;
        if (j2 != 0) {
            codedOutputStream.writeUInt64(5, j2);
        }
        float f = this.f17872j;
        if (f != 0.0f) {
            codedOutputStream.writeFloat(6, f);
        }
        double d = this.f17873k;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(7, d);
        }
        if (!this.f17874l.isEmpty()) {
            codedOutputStream.writeString(8, getString());
        }
        if (!this.f17875m.isEmpty()) {
            codedOutputStream.writeBytes(9, this.f17875m);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17943a(boolean z) {
        this.f17867e = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17934a(int i) {
        this.f17868f = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17935a(long j) {
        this.f17869g = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17942a(String str) {
        if (str != null) {
            this.f17874l = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17936a(ByteString byteString) {
        if (byteString != null) {
            this.f17875m = byteString;
            return;
        }
        throw new NullPointerException();
    }
}
