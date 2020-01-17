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
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.notifications.t */
public final class C7851t extends GeneratedMessageLite<C7851t, C7852a> implements NotificationProto$FriendRequestSentNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7851t f19621h = new C7851t();

    /* renamed from: i */
    private static volatile Parser<C7851t> f19622i;

    /* renamed from: e */
    private FriendRequestProto$FriendRequest f19623e;

    /* renamed from: f */
    private UserProto$User f19624f;

    /* renamed from: g */
    private UserProto$User f19625g;

    /* renamed from: co.znly.models.notifications.t$a */
    public static final class C7852a extends Builder<C7851t, C7852a> implements NotificationProto$FriendRequestSentNotificationOrBuilder {
        /* synthetic */ C7852a(C7790a aVar) {
            this();
        }

        public UserProto$User getAuthor() {
            return ((C7851t) this.instance).getAuthor();
        }

        public FriendRequestProto$FriendRequest getFriendRequest() {
            return ((C7851t) this.instance).getFriendRequest();
        }

        public UserProto$User getTarget() {
            return ((C7851t) this.instance).getTarget();
        }

        public boolean hasAuthor() {
            return ((C7851t) this.instance).hasAuthor();
        }

        public boolean hasFriendRequest() {
            return ((C7851t) this.instance).hasFriendRequest();
        }

        public boolean hasTarget() {
            return ((C7851t) this.instance).hasTarget();
        }

        private C7852a() {
            super(C7851t.f19621h);
        }
    }

    static {
        f19621h.makeImmutable();
    }

    private C7851t() {
    }

    public static C7851t getDefaultInstance() {
        return f19621h;
    }

    public static Parser<C7851t> parser() {
        return f19621h.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7851t();
            case 2:
                return f19621h;
            case 3:
                return null;
            case 4:
                return new C7852a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7851t tVar = (C7851t) obj2;
                this.f19623e = (FriendRequestProto$FriendRequest) visitor.visitMessage(this.f19623e, tVar.f19623e);
                this.f19624f = (UserProto$User) visitor.visitMessage(this.f19624f, tVar.f19624f);
                this.f19625g = (UserProto$User) visitor.visitMessage(this.f19625g, tVar.f19625g);
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
                                Builder builder = this.f19623e != null ? (C6809a) this.f19623e.toBuilder() : null;
                                this.f19623e = (FriendRequestProto$FriendRequest) codedInputStream.readMessage(FriendRequestProto$FriendRequest.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19623e);
                                    this.f19623e = (FriendRequestProto$FriendRequest) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f19624f != null ? (C6925a) this.f19624f.toBuilder() : null;
                                this.f19624f = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19624f);
                                    this.f19624f = (UserProto$User) builder2.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder3 = this.f19625g != null ? (C6925a) this.f19625g.toBuilder() : null;
                                this.f19625g = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f19625g);
                                    this.f19625g = (UserProto$User) builder3.buildPartial();
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
                if (f19622i == null) {
                    synchronized (C7851t.class) {
                        if (f19622i == null) {
                            f19622i = new DefaultInstanceBasedParser(f19621h);
                        }
                    }
                }
                return f19622i;
            default:
                throw new UnsupportedOperationException();
        }
        return f19621h;
    }

    public UserProto$User getAuthor() {
        UserProto$User userProto$User = this.f19624f;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public FriendRequestProto$FriendRequest getFriendRequest() {
        FriendRequestProto$FriendRequest friendRequestProto$FriendRequest = this.f19623e;
        return friendRequestProto$FriendRequest == null ? FriendRequestProto$FriendRequest.getDefaultInstance() : friendRequestProto$FriendRequest;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19623e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getFriendRequest());
        }
        if (this.f19624f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getAuthor());
        }
        if (this.f19625g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getTarget());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getTarget() {
        UserProto$User userProto$User = this.f19625g;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasAuthor() {
        return this.f19624f != null;
    }

    public boolean hasFriendRequest() {
        return this.f19623e != null;
    }

    public boolean hasTarget() {
        return this.f19625g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19623e != null) {
            codedOutputStream.writeMessage(1, getFriendRequest());
        }
        if (this.f19624f != null) {
            codedOutputStream.writeMessage(2, getAuthor());
        }
        if (this.f19625g != null) {
            codedOutputStream.writeMessage(3, getTarget());
        }
    }
}
