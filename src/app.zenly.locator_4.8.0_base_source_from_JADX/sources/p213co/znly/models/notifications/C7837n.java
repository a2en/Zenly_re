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
import p213co.znly.models.TrackingContextProto$TrackingContext;
import p213co.znly.models.TrackingContextProto$TrackingContext.C6884d;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.notifications.n */
public final class C7837n extends GeneratedMessageLite<C7837n, C7838a> implements NotificationProto$EnableWifiAcceptedNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7837n f19590g = new C7837n();

    /* renamed from: h */
    private static volatile Parser<C7837n> f19591h;

    /* renamed from: e */
    private UserProto$User f19592e;

    /* renamed from: f */
    private TrackingContextProto$TrackingContext f19593f;

    /* renamed from: co.znly.models.notifications.n$a */
    public static final class C7838a extends Builder<C7837n, C7838a> implements NotificationProto$EnableWifiAcceptedNotificationOrBuilder {
        /* synthetic */ C7838a(C7790a aVar) {
            this();
        }

        public TrackingContextProto$TrackingContext getTrackingContext() {
            return ((C7837n) this.instance).getTrackingContext();
        }

        public UserProto$User getUser() {
            return ((C7837n) this.instance).getUser();
        }

        public boolean hasTrackingContext() {
            return ((C7837n) this.instance).hasTrackingContext();
        }

        public boolean hasUser() {
            return ((C7837n) this.instance).hasUser();
        }

        private C7838a() {
            super(C7837n.f19590g);
        }
    }

    static {
        f19590g.makeImmutable();
    }

    private C7837n() {
    }

    public static C7837n getDefaultInstance() {
        return f19590g;
    }

    public static Parser<C7837n> parser() {
        return f19590g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7837n();
            case 2:
                return f19590g;
            case 3:
                return null;
            case 4:
                return new C7838a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7837n nVar = (C7837n) obj2;
                this.f19592e = (UserProto$User) visitor.visitMessage(this.f19592e, nVar.f19592e);
                this.f19593f = (TrackingContextProto$TrackingContext) visitor.visitMessage(this.f19593f, nVar.f19593f);
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
                            if (readTag == 18) {
                                Builder builder = this.f19592e != null ? (C6925a) this.f19592e.toBuilder() : null;
                                this.f19592e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19592e);
                                    this.f19592e = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 34) {
                                Builder builder2 = this.f19593f != null ? (C6884d) this.f19593f.toBuilder() : null;
                                this.f19593f = (TrackingContextProto$TrackingContext) codedInputStream.readMessage(TrackingContextProto$TrackingContext.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19593f);
                                    this.f19593f = (TrackingContextProto$TrackingContext) builder2.buildPartial();
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
                if (f19591h == null) {
                    synchronized (C7837n.class) {
                        if (f19591h == null) {
                            f19591h = new DefaultInstanceBasedParser(f19590g);
                        }
                    }
                }
                return f19591h;
            default:
                throw new UnsupportedOperationException();
        }
        return f19590g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19592e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(2, getUser());
        }
        if (this.f19593f != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getTrackingContext());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public TrackingContextProto$TrackingContext getTrackingContext() {
        TrackingContextProto$TrackingContext trackingContextProto$TrackingContext = this.f19593f;
        return trackingContextProto$TrackingContext == null ? TrackingContextProto$TrackingContext.getDefaultInstance() : trackingContextProto$TrackingContext;
    }

    public UserProto$User getUser() {
        UserProto$User userProto$User = this.f19592e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasTrackingContext() {
        return this.f19593f != null;
    }

    public boolean hasUser() {
        return this.f19592e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19592e != null) {
            codedOutputStream.writeMessage(2, getUser());
        }
        if (this.f19593f != null) {
            codedOutputStream.writeMessage(4, getTrackingContext());
        }
    }
}
