package p213co.znly.models.notifications;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.PublicShareProto$PublicShare;
import p213co.znly.models.PublicShareProto$PublicShare.C6853a;

/* renamed from: co.znly.models.notifications.a0 */
public final class C7791a0 extends GeneratedMessageLite<C7791a0, C7792a> implements NotificationProto$PublicShareOpenedNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7791a0 f19469f = new C7791a0();

    /* renamed from: g */
    private static volatile Parser<C7791a0> f19470g;

    /* renamed from: e */
    private PublicShareProto$PublicShare f19471e;

    /* renamed from: co.znly.models.notifications.a0$a */
    public static final class C7792a extends Builder<C7791a0, C7792a> implements NotificationProto$PublicShareOpenedNotificationOrBuilder {
        /* synthetic */ C7792a(C7790a aVar) {
            this();
        }

        public PublicShareProto$PublicShare getPublicShare() {
            return ((C7791a0) this.instance).getPublicShare();
        }

        public boolean hasPublicShare() {
            return ((C7791a0) this.instance).hasPublicShare();
        }

        private C7792a() {
            super(C7791a0.f19469f);
        }
    }

    static {
        f19469f.makeImmutable();
    }

    private C7791a0() {
    }

    public static C7791a0 getDefaultInstance() {
        return f19469f;
    }

    public static Parser<C7791a0> parser() {
        return f19469f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7791a0();
            case 2:
                return f19469f;
            case 3:
                return null;
            case 4:
                return new C7792a(null);
            case 5:
                this.f19471e = (PublicShareProto$PublicShare) ((Visitor) obj).visitMessage(this.f19471e, ((C7791a0) obj2).f19471e);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Builder builder = this.f19471e != null ? (C6853a) this.f19471e.toBuilder() : null;
                                this.f19471e = (PublicShareProto$PublicShare) codedInputStream.readMessage(PublicShareProto$PublicShare.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19471e);
                                    this.f19471e = (PublicShareProto$PublicShare) builder.buildPartial();
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
                if (f19470g == null) {
                    synchronized (C7791a0.class) {
                        if (f19470g == null) {
                            f19470g = new DefaultInstanceBasedParser(f19469f);
                        }
                    }
                }
                return f19470g;
            default:
                throw new UnsupportedOperationException();
        }
        return f19469f;
    }

    public PublicShareProto$PublicShare getPublicShare() {
        PublicShareProto$PublicShare publicShareProto$PublicShare = this.f19471e;
        return publicShareProto$PublicShare == null ? PublicShareProto$PublicShare.getDefaultInstance() : publicShareProto$PublicShare;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19471e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getPublicShare());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasPublicShare() {
        return this.f19471e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19471e != null) {
            codedOutputStream.writeMessage(1, getPublicShare());
        }
    }
}
