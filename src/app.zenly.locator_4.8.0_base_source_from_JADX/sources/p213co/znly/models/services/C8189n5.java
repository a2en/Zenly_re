package p213co.znly.models.services;

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

/* renamed from: co.znly.models.services.n5 */
public final class C8189n5 extends GeneratedMessageLite<C8189n5, C8190a> implements ZenlyProto$UserBlockRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8189n5 f20724g = new C8189n5();

    /* renamed from: h */
    private static volatile Parser<C8189n5> f20725h;

    /* renamed from: e */
    private String f20726e = "";

    /* renamed from: f */
    private int f20727f;

    /* renamed from: co.znly.models.services.n5$a */
    public static final class C8190a extends Builder<C8189n5, C8190a> implements ZenlyProto$UserBlockRequestOrBuilder {
        /* synthetic */ C8190a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8190a mo22166a(String str) {
            copyOnWrite();
            ((C8189n5) this.instance).m19280a(str);
            return this;
        }

        public C8191b getReason() {
            return ((C8189n5) this.instance).getReason();
        }

        public int getReasonValue() {
            return ((C8189n5) this.instance).getReasonValue();
        }

        public String getTargetUuid() {
            return ((C8189n5) this.instance).getTargetUuid();
        }

        public ByteString getTargetUuidBytes() {
            return ((C8189n5) this.instance).getTargetUuidBytes();
        }

        private C8190a() {
            super(C8189n5.f20724g);
        }

        /* renamed from: a */
        public C8190a mo22165a(C8191b bVar) {
            copyOnWrite();
            ((C8189n5) this.instance).m19277a(bVar);
            return this;
        }
    }

    /* renamed from: co.znly.models.services.n5$b */
    public enum C8191b implements EnumLite {
        REASON_UNKNOWN(0),
        REASON_SPAM(1),
        REASON_BULLY(2),
        REASON_INAPPROPRIATE_MESSAGE(3),
        REASON_REPEATED_INVITES(4),
        REASON_INAPPROPRIATE_PICTURE(5),
        REASON_OFFENSIVE_NAME(6),
        REASON_OTHER(7),
        REASON_UNKNOWN_USER(8),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f20739e;

        /* renamed from: co.znly.models.services.n5$b$a */
        class C8192a implements EnumLiteMap<C8191b> {
            C8192a() {
            }

            public C8191b findValueByNumber(int i) {
                return C8191b.m19283a(i);
            }
        }

        static {
            new C8192a();
        }

        private C8191b(int i) {
            this.f20739e = i;
        }

        /* renamed from: a */
        public static C8191b m19283a(int i) {
            switch (i) {
                case 0:
                    return REASON_UNKNOWN;
                case 1:
                    return REASON_SPAM;
                case 2:
                    return REASON_BULLY;
                case 3:
                    return REASON_INAPPROPRIATE_MESSAGE;
                case 4:
                    return REASON_REPEATED_INVITES;
                case 5:
                    return REASON_INAPPROPRIATE_PICTURE;
                case 6:
                    return REASON_OFFENSIVE_NAME;
                case 7:
                    return REASON_OTHER;
                case 8:
                    return REASON_UNKNOWN_USER;
                default:
                    return null;
            }
        }

        public final int getNumber() {
            return this.f20739e;
        }
    }

    static {
        f20724g.makeImmutable();
    }

    private C8189n5() {
    }

    public static C8190a newBuilder() {
        return (C8190a) f20724g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8189n5();
            case 2:
                return f20724g;
            case 3:
                return null;
            case 4:
                return new C8190a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8189n5 n5Var = (C8189n5) obj2;
                this.f20726e = visitor.visitString(!this.f20726e.isEmpty(), this.f20726e, !n5Var.f20726e.isEmpty(), n5Var.f20726e);
                boolean z2 = this.f20727f != 0;
                int i = this.f20727f;
                if (n5Var.f20727f != 0) {
                    z = true;
                }
                this.f20727f = visitor.visitInt(z2, i, z, n5Var.f20727f);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f20726e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 24) {
                                this.f20727f = codedInputStream.readEnum();
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
                if (f20725h == null) {
                    synchronized (C8189n5.class) {
                        if (f20725h == null) {
                            f20725h = new DefaultInstanceBasedParser(f20724g);
                        }
                    }
                }
                return f20725h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20724g;
    }

    public C8191b getReason() {
        C8191b a = C8191b.m19283a(this.f20727f);
        return a == null ? C8191b.UNRECOGNIZED : a;
    }

    public int getReasonValue() {
        return this.f20727f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20726e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getTargetUuid());
        }
        if (this.f20727f != C8191b.REASON_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(3, this.f20727f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getTargetUuid() {
        return this.f20726e;
    }

    public ByteString getTargetUuidBytes() {
        return ByteString.copyFromUtf8(this.f20726e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20726e.isEmpty()) {
            codedOutputStream.writeString(1, getTargetUuid());
        }
        if (this.f20727f != C8191b.REASON_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(3, this.f20727f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19280a(String str) {
        if (str != null) {
            this.f20726e = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19277a(C8191b bVar) {
        if (bVar != null) {
            this.f20727f = bVar.getNumber();
            return;
        }
        throw new NullPointerException();
    }
}
