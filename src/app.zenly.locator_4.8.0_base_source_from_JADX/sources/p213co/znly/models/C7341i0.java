package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.i0 */
public final class C7341i0 extends GeneratedMessageLite<C7341i0, C7344b> implements MediaProto$HashOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7341i0 f18253g = new C7341i0();

    /* renamed from: h */
    private static volatile Parser<C7341i0> f18254h;

    /* renamed from: e */
    private int f18255e;

    /* renamed from: f */
    private ByteString f18256f = ByteString.EMPTY;

    /* renamed from: co.znly.models.i0$a */
    public enum C7342a implements EnumLite {
        ALGORITHM_UNKWNOW(0),
        ALGORITHM_MD5(1),
        ALGORITHM_SHA1(2),
        ALGORITHM_SHA256(3),
        ALGORITHM_SHA512(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f18264e;

        /* renamed from: co.znly.models.i0$a$a */
        class C7343a implements EnumLiteMap<C7342a> {
            C7343a() {
            }

            public C7342a findValueByNumber(int i) {
                return C7342a.m18033a(i);
            }
        }

        static {
            new C7343a();
        }

        private C7342a(int i) {
            this.f18264e = i;
        }

        /* renamed from: a */
        public static C7342a m18033a(int i) {
            if (i == 0) {
                return ALGORITHM_UNKWNOW;
            }
            if (i == 1) {
                return ALGORITHM_MD5;
            }
            if (i == 2) {
                return ALGORITHM_SHA1;
            }
            if (i == 3) {
                return ALGORITHM_SHA256;
            }
            if (i != 4) {
                return null;
            }
            return ALGORITHM_SHA512;
        }

        public final int getNumber() {
            return this.f18264e;
        }
    }

    /* renamed from: co.znly.models.i0$b */
    public static final class C7344b extends Builder<C7341i0, C7344b> implements MediaProto$HashOrBuilder {
        /* synthetic */ C7344b(C7332h0 h0Var) {
            this();
        }

        public C7342a getAlgorithm() {
            return ((C7341i0) this.instance).getAlgorithm();
        }

        public int getAlgorithmValue() {
            return ((C7341i0) this.instance).getAlgorithmValue();
        }

        public ByteString getHash() {
            return ((C7341i0) this.instance).getHash();
        }

        private C7344b() {
            super(C7341i0.f18253g);
        }
    }

    static {
        f18253g.makeImmutable();
    }

    private C7341i0() {
    }

    public static C7341i0 getDefaultInstance() {
        return f18253g;
    }

    public static Parser<C7341i0> parser() {
        return f18253g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7332h0.f18217a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7341i0();
            case 2:
                return f18253g;
            case 3:
                return null;
            case 4:
                return new C7344b(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7341i0 i0Var = (C7341i0) obj2;
                this.f18255e = visitor.visitInt(this.f18255e != 0, this.f18255e, i0Var.f18255e != 0, i0Var.f18255e);
                boolean z2 = this.f18256f != ByteString.EMPTY;
                ByteString byteString = this.f18256f;
                if (i0Var.f18256f != ByteString.EMPTY) {
                    z = true;
                }
                this.f18256f = visitor.visitByteString(z2, byteString, z, i0Var.f18256f);
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
                                this.f18255e = codedInputStream.readEnum();
                            } else if (readTag == 26) {
                                this.f18256f = codedInputStream.readBytes();
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
                if (f18254h == null) {
                    synchronized (C7341i0.class) {
                        if (f18254h == null) {
                            f18254h = new DefaultInstanceBasedParser(f18253g);
                        }
                    }
                }
                return f18254h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18253g;
    }

    public C7342a getAlgorithm() {
        C7342a a = C7342a.m18033a(this.f18255e);
        return a == null ? C7342a.UNRECOGNIZED : a;
    }

    public int getAlgorithmValue() {
        return this.f18255e;
    }

    public ByteString getHash() {
        return this.f18256f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f18255e != C7342a.ALGORITHM_UNKWNOW.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f18255e);
        }
        if (!this.f18256f.isEmpty()) {
            i2 += CodedOutputStream.computeBytesSize(3, this.f18256f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f18255e != C7342a.ALGORITHM_UNKWNOW.getNumber()) {
            codedOutputStream.writeEnum(1, this.f18255e);
        }
        if (!this.f18256f.isEmpty()) {
            codedOutputStream.writeBytes(3, this.f18256f);
        }
    }
}
