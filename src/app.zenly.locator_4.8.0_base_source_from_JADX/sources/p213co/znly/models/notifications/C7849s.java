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
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6809a;
import p213co.znly.models.TrackingContextProto$TrackingContext;
import p213co.znly.models.TrackingContextProto$TrackingContext.C6884d;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.notifications.s */
public final class C7849s extends GeneratedMessageLite<C7849s, C7850a> implements NotificationProto$FriendRequestAcceptedNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7849s f19615i = new C7849s();

    /* renamed from: j */
    private static volatile Parser<C7849s> f19616j;

    /* renamed from: e */
    private FriendRequestProto$FriendRequest f19617e;

    /* renamed from: f */
    private UserProto$User f19618f;

    /* renamed from: g */
    private UserProto$User f19619g;

    /* renamed from: h */
    private TrackingContextProto$TrackingContext f19620h;

    /* renamed from: co.znly.models.notifications.s$a */
    public static final class C7850a extends Builder<C7849s, C7850a> implements NotificationProto$FriendRequestAcceptedNotificationOrBuilder {
        /* synthetic */ C7850a(C7790a aVar) {
            this();
        }

        public UserProto$User getAuthor() {
            return ((C7849s) this.instance).getAuthor();
        }

        public FriendRequestProto$FriendRequest getFriendRequest() {
            return ((C7849s) this.instance).getFriendRequest();
        }

        public UserProto$User getTarget() {
            return ((C7849s) this.instance).getTarget();
        }

        public TrackingContextProto$TrackingContext getTrackingContext() {
            return ((C7849s) this.instance).getTrackingContext();
        }

        public boolean hasAuthor() {
            return ((C7849s) this.instance).hasAuthor();
        }

        public boolean hasFriendRequest() {
            return ((C7849s) this.instance).hasFriendRequest();
        }

        public boolean hasTarget() {
            return ((C7849s) this.instance).hasTarget();
        }

        public boolean hasTrackingContext() {
            return ((C7849s) this.instance).hasTrackingContext();
        }

        private C7850a() {
            super(C7849s.f19615i);
        }
    }

    static {
        f19615i.makeImmutable();
    }

    private C7849s() {
    }

    public static C7849s getDefaultInstance() {
        return f19615i;
    }

    public static Parser<C7849s> parser() {
        return f19615i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7849s();
            case 2:
                return f19615i;
            case 3:
                return null;
            case 4:
                return new C7850a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7849s sVar = (C7849s) obj2;
                this.f19617e = (FriendRequestProto$FriendRequest) visitor.visitMessage(this.f19617e, sVar.f19617e);
                this.f19618f = (UserProto$User) visitor.visitMessage(this.f19618f, sVar.f19618f);
                this.f19619g = (UserProto$User) visitor.visitMessage(this.f19619g, sVar.f19619g);
                this.f19620h = (TrackingContextProto$TrackingContext) visitor.visitMessage(this.f19620h, sVar.f19620h);
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
                                Builder builder = this.f19617e != null ? (C6809a) this.f19617e.toBuilder() : null;
                                this.f19617e = (FriendRequestProto$FriendRequest) codedInputStream.readMessage(FriendRequestProto$FriendRequest.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19617e);
                                    this.f19617e = (FriendRequestProto$FriendRequest) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f19618f != null ? (C6925a) this.f19618f.toBuilder() : null;
                                this.f19618f = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19618f);
                                    this.f19618f = (UserProto$User) builder2.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder3 = this.f19619g != null ? (C6925a) this.f19619g.toBuilder() : null;
                                this.f19619g = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f19619g);
                                    this.f19619g = (UserProto$User) builder3.buildPartial();
                                }
                            } else if (readTag == 34) {
                                Builder builder4 = this.f19620h != null ? (C6884d) this.f19620h.toBuilder() : null;
                                this.f19620h = (TrackingContextProto$TrackingContext) codedInputStream.readMessage(TrackingContextProto$TrackingContext.parser(), extensionRegistryLite);
                                if (builder4 != null) {
                                    builder4.mergeFrom(this.f19620h);
                                    this.f19620h = (TrackingContextProto$TrackingContext) builder4.buildPartial();
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
                if (f19616j == null) {
                    synchronized (C7849s.class) {
                        if (f19616j == null) {
                            f19616j = new DefaultInstanceBasedParser(f19615i);
                        }
                    }
                }
                return f19616j;
            default:
                throw new UnsupportedOperationException();
        }
        return f19615i;
    }

    public UserProto$User getAuthor() {
        UserProto$User userProto$User = this.f19618f;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public FriendRequestProto$FriendRequest getFriendRequest() {
        FriendRequestProto$FriendRequest friendRequestProto$FriendRequest = this.f19617e;
        return friendRequestProto$FriendRequest == null ? FriendRequestProto$FriendRequest.getDefaultInstance() : friendRequestProto$FriendRequest;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19617e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getFriendRequest());
        }
        if (this.f19618f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getAuthor());
        }
        if (this.f19619g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getTarget());
        }
        if (this.f19620h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getTrackingContext());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getTarget() {
        UserProto$User userProto$User = this.f19619g;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public TrackingContextProto$TrackingContext getTrackingContext() {
        TrackingContextProto$TrackingContext trackingContextProto$TrackingContext = this.f19620h;
        return trackingContextProto$TrackingContext == null ? TrackingContextProto$TrackingContext.getDefaultInstance() : trackingContextProto$TrackingContext;
    }

    public boolean hasAuthor() {
        return this.f19618f != null;
    }

    public boolean hasFriendRequest() {
        return this.f19617e != null;
    }

    public boolean hasTarget() {
        return this.f19619g != null;
    }

    public boolean hasTrackingContext() {
        return this.f19620h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19617e != null) {
            codedOutputStream.writeMessage(1, getFriendRequest());
        }
        if (this.f19618f != null) {
            codedOutputStream.writeMessage(2, getAuthor());
        }
        if (this.f19619g != null) {
            codedOutputStream.writeMessage(3, getTarget());
        }
        if (this.f19620h != null) {
            codedOutputStream.writeMessage(4, getTrackingContext());
        }
    }
}
