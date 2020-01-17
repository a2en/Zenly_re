package p213co.znly.models.services.sleepdetection;

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

/* renamed from: co.znly.models.services.sleepdetection.b */
public final class C8282b extends GeneratedMessageLite<C8282b, C8283a> implements SleepDetectionProto$IsSleepingErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8282b f20937g = new C8282b();

    /* renamed from: h */
    private static volatile Parser<C8282b> f20938h;

    /* renamed from: e */
    private int f20939e;

    /* renamed from: f */
    private String f20940f = "";

    /* renamed from: co.znly.models.services.sleepdetection.b$a */
    public static final class C8283a extends Builder<C8282b, C8283a> implements SleepDetectionProto$IsSleepingErrorOrBuilder {
        /* synthetic */ C8283a(C8281a aVar) {
            this();
        }

        public C8284b getCode() {
            return ((C8282b) this.instance).getCode();
        }

        public int getCodeValue() {
            return ((C8282b) this.instance).getCodeValue();
        }

        public String getMessage() {
            return ((C8282b) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((C8282b) this.instance).getMessageBytes();
        }

        private C8283a() {
            super(C8282b.f20937g);
        }
    }

    /* renamed from: co.znly.models.services.sleepdetection.b$b */
    public enum C8284b implements EnumLite {
        NO_ERROR(0),
        INVALID_REQUEST(3),
        INTERNAL_ERROR(13),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f20946e;

        /* renamed from: co.znly.models.services.sleepdetection.b$b$a */
        class C8285a implements EnumLiteMap<C8284b> {
            C8285a() {
            }

            public C8284b findValueByNumber(int i) {
                return C8284b.m19354a(i);
            }
        }

        static {
            new C8285a();
        }

        private C8284b(int i) {
            this.f20946e = i;
        }

        /* renamed from: a */
        public static C8284b m19354a(int i) {
            if (i == 0) {
                return NO_ERROR;
            }
            if (i == 3) {
                return INVALID_REQUEST;
            }
            if (i != 13) {
                return null;
            }
            return INTERNAL_ERROR;
        }

        public final int getNumber() {
            return this.f20946e;
        }
    }

    static {
        f20937g.makeImmutable();
    }

    private C8282b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8281a.f20936a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8282b();
            case 2:
                return f20937g;
            case 3:
                return null;
            case 4:
                return new C8283a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8282b bVar = (C8282b) obj2;
                boolean z2 = this.f20939e != 0;
                int i = this.f20939e;
                if (bVar.f20939e != 0) {
                    z = true;
                }
                this.f20939e = visitor.visitInt(z2, i, z, bVar.f20939e);
                this.f20940f = visitor.visitString(!this.f20940f.isEmpty(), this.f20940f, !bVar.f20940f.isEmpty(), bVar.f20940f);
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
                                this.f20939e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                this.f20940f = codedInputStream.readStringRequireUtf8();
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
                if (f20938h == null) {
                    synchronized (C8282b.class) {
                        if (f20938h == null) {
                            f20938h = new DefaultInstanceBasedParser(f20937g);
                        }
                    }
                }
                return f20938h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20937g;
    }

    public C8284b getCode() {
        C8284b a = C8284b.m19354a(this.f20939e);
        return a == null ? C8284b.UNRECOGNIZED : a;
    }

    public int getCodeValue() {
        return this.f20939e;
    }

    public String getMessage() {
        return this.f20940f;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f20940f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20939e != C8284b.NO_ERROR.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20939e);
        }
        if (!this.f20940f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getMessage());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20939e != C8284b.NO_ERROR.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20939e);
        }
        if (!this.f20940f.isEmpty()) {
            codedOutputStream.writeString(2, getMessage());
        }
    }
}
