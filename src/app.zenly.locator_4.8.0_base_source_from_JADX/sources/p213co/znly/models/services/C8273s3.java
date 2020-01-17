package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C7280e;
import p213co.znly.models.notifications.C7857w;
import p213co.znly.models.notifications.C7857w.C7858a;

/* renamed from: co.znly.models.services.s3 */
public final class C8273s3 extends GeneratedMessageLite<C8273s3, C8274a> implements ZenlyProto$NotificationStreamEventOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8273s3 f20914g = new C8273s3();

    /* renamed from: h */
    private static volatile Parser<C8273s3> f20915h;

    /* renamed from: e */
    private int f20916e;

    /* renamed from: f */
    private C7857w f20917f;

    /* renamed from: co.znly.models.services.s3$a */
    public static final class C8274a extends Builder<C8273s3, C8274a> implements ZenlyProto$NotificationStreamEventOrBuilder {
        /* synthetic */ C8274a(C8104i0 i0Var) {
            this();
        }

        public C7857w getNotification() {
            return ((C8273s3) this.instance).getNotification();
        }

        public C7280e getOp() {
            return ((C8273s3) this.instance).getOp();
        }

        public int getOpValue() {
            return ((C8273s3) this.instance).getOpValue();
        }

        public boolean hasNotification() {
            return ((C8273s3) this.instance).hasNotification();
        }

        private C8274a() {
            super(C8273s3.f20914g);
        }
    }

    static {
        f20914g.makeImmutable();
    }

    private C8273s3() {
    }

    public static C8274a newBuilder() {
        return (C8274a) f20914g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8273s3();
            case 2:
                return f20914g;
            case 3:
                return null;
            case 4:
                return new C8274a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8273s3 s3Var = (C8273s3) obj2;
                boolean z2 = this.f20916e != 0;
                int i = this.f20916e;
                if (s3Var.f20916e != 0) {
                    z = true;
                }
                this.f20916e = visitor.visitInt(z2, i, z, s3Var.f20916e);
                this.f20917f = (C7857w) visitor.visitMessage(this.f20917f, s3Var.f20917f);
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
                                this.f20916e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                Builder builder = this.f20917f != null ? (C7858a) this.f20917f.toBuilder() : null;
                                this.f20917f = (C7857w) codedInputStream.readMessage(C7857w.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20917f);
                                    this.f20917f = (C7857w) builder.buildPartial();
                                }
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
                if (f20915h == null) {
                    synchronized (C8273s3.class) {
                        if (f20915h == null) {
                            f20915h = new DefaultInstanceBasedParser(f20914g);
                        }
                    }
                }
                return f20915h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20914g;
    }

    public C7857w getNotification() {
        C7857w wVar = this.f20917f;
        return wVar == null ? C7857w.getDefaultInstance() : wVar;
    }

    public C7280e getOp() {
        C7280e a = C7280e.m17990a(this.f20916e);
        return a == null ? C7280e.UNRECOGNIZED : a;
    }

    public int getOpValue() {
        return this.f20916e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20916e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20916e);
        }
        if (this.f20917f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getNotification());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasNotification() {
        return this.f20917f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20916e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20916e);
        }
        if (this.f20917f != null) {
            codedOutputStream.writeMessage(2, getNotification());
        }
    }
}
