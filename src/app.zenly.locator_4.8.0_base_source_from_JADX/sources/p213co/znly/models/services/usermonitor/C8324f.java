package p213co.znly.models.services.usermonitor;

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

/* renamed from: co.znly.models.services.usermonitor.f */
public final class C8324f extends GeneratedMessageLite<C8324f, C8325a> implements UserMonitorProto$UserMonitorErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8324f f21072g = new C8324f();

    /* renamed from: h */
    private static volatile Parser<C8324f> f21073h;

    /* renamed from: e */
    private int f21074e;

    /* renamed from: f */
    private String f21075f = "";

    /* renamed from: co.znly.models.services.usermonitor.f$a */
    public static final class C8325a extends Builder<C8324f, C8325a> implements UserMonitorProto$UserMonitorErrorOrBuilder {
        /* synthetic */ C8325a(C8315a aVar) {
            this();
        }

        public C8326b getErrorCode() {
            return ((C8324f) this.instance).getErrorCode();
        }

        public int getErrorCodeValue() {
            return ((C8324f) this.instance).getErrorCodeValue();
        }

        public String getMessage() {
            return ((C8324f) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((C8324f) this.instance).getMessageBytes();
        }

        private C8325a() {
            super(C8324f.f21072g);
        }
    }

    /* renamed from: co.znly.models.services.usermonitor.f$b */
    public enum C8326b implements EnumLite {
        ERROR_NO_ERROR(0),
        ERROR_OTHER(1),
        ERROR_INVALID_UUID(2),
        ERROR_INVALID_EXPIRATION(3),
        ERROR_CANT_WATCH_ITSELF(4),
        ERROR_CANT_WATCH_NONFRIEND(5),
        ERROR_CANT_WATCH_BLURRED(6),
        ERROR_TTL_ALREADY_EXPIRE(7),
        ERROR_INVALID_TYPE(8),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f21087e;

        /* renamed from: co.znly.models.services.usermonitor.f$b$a */
        class C8327a implements EnumLiteMap<C8326b> {
            C8327a() {
            }

            public C8326b findValueByNumber(int i) {
                return C8326b.m19411a(i);
            }
        }

        static {
            new C8327a();
        }

        private C8326b(int i) {
            this.f21087e = i;
        }

        /* renamed from: a */
        public static C8326b m19411a(int i) {
            switch (i) {
                case 0:
                    return ERROR_NO_ERROR;
                case 1:
                    return ERROR_OTHER;
                case 2:
                    return ERROR_INVALID_UUID;
                case 3:
                    return ERROR_INVALID_EXPIRATION;
                case 4:
                    return ERROR_CANT_WATCH_ITSELF;
                case 5:
                    return ERROR_CANT_WATCH_NONFRIEND;
                case 6:
                    return ERROR_CANT_WATCH_BLURRED;
                case 7:
                    return ERROR_TTL_ALREADY_EXPIRE;
                case 8:
                    return ERROR_INVALID_TYPE;
                default:
                    return null;
            }
        }

        public final int getNumber() {
            return this.f21087e;
        }
    }

    static {
        f21072g.makeImmutable();
    }

    private C8324f() {
    }

    public static C8324f getDefaultInstance() {
        return f21072g;
    }

    public static Parser<C8324f> parser() {
        return f21072g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8315a.f21023a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8324f();
            case 2:
                return f21072g;
            case 3:
                return null;
            case 4:
                return new C8325a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8324f fVar = (C8324f) obj2;
                boolean z2 = this.f21074e != 0;
                int i = this.f21074e;
                if (fVar.f21074e != 0) {
                    z = true;
                }
                this.f21074e = visitor.visitInt(z2, i, z, fVar.f21074e);
                this.f21075f = visitor.visitString(!this.f21075f.isEmpty(), this.f21075f, !fVar.f21075f.isEmpty(), fVar.f21075f);
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
                                this.f21074e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                this.f21075f = codedInputStream.readStringRequireUtf8();
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
                if (f21073h == null) {
                    synchronized (C8324f.class) {
                        if (f21073h == null) {
                            f21073h = new DefaultInstanceBasedParser(f21072g);
                        }
                    }
                }
                return f21073h;
            default:
                throw new UnsupportedOperationException();
        }
        return f21072g;
    }

    public C8326b getErrorCode() {
        C8326b a = C8326b.m19411a(this.f21074e);
        return a == null ? C8326b.UNRECOGNIZED : a;
    }

    public int getErrorCodeValue() {
        return this.f21074e;
    }

    public String getMessage() {
        return this.f21075f;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f21075f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f21074e != C8326b.ERROR_NO_ERROR.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f21074e);
        }
        if (!this.f21075f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getMessage());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21074e != C8326b.ERROR_NO_ERROR.getNumber()) {
            codedOutputStream.writeEnum(1, this.f21074e);
        }
        if (!this.f21075f.isEmpty()) {
            codedOutputStream.writeString(2, getMessage());
        }
    }
}
