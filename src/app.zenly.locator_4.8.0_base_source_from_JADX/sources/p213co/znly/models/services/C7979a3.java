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
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6809a;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.services.a3 */
public final class C7979a3 extends GeneratedMessageLite<C7979a3, C7980a> implements ZenlyProto$FriendRequestRespondResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7979a3 f20257h = new C7979a3();

    /* renamed from: i */
    private static volatile Parser<C7979a3> f20258i;

    /* renamed from: e */
    private FriendRequestProto$FriendRequest f20259e;

    /* renamed from: f */
    private UserProto$User f20260f;

    /* renamed from: g */
    private UserProto$User f20261g;

    /* renamed from: co.znly.models.services.a3$a */
    public static final class C7980a extends Builder<C7979a3, C7980a> implements ZenlyProto$FriendRequestRespondResponseOrBuilder {
        /* synthetic */ C7980a(C8104i0 i0Var) {
            this();
        }

        public UserProto$User getAuthor() {
            return ((C7979a3) this.instance).getAuthor();
        }

        public FriendRequestProto$FriendRequest getFriendRequest() {
            return ((C7979a3) this.instance).getFriendRequest();
        }

        public UserProto$User getTarget() {
            return ((C7979a3) this.instance).getTarget();
        }

        public boolean hasAuthor() {
            return ((C7979a3) this.instance).hasAuthor();
        }

        public boolean hasFriendRequest() {
            return ((C7979a3) this.instance).hasFriendRequest();
        }

        public boolean hasTarget() {
            return ((C7979a3) this.instance).hasTarget();
        }

        private C7980a() {
            super(C7979a3.f20257h);
        }
    }

    static {
        f20257h.makeImmutable();
    }

    private C7979a3() {
    }

    public static C7980a newBuilder() {
        return (C7980a) f20257h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7979a3();
            case 2:
                return f20257h;
            case 3:
                return null;
            case 4:
                return new C7980a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7979a3 a3Var = (C7979a3) obj2;
                this.f20259e = (FriendRequestProto$FriendRequest) visitor.visitMessage(this.f20259e, a3Var.f20259e);
                this.f20260f = (UserProto$User) visitor.visitMessage(this.f20260f, a3Var.f20260f);
                this.f20261g = (UserProto$User) visitor.visitMessage(this.f20261g, a3Var.f20261g);
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
                                Builder builder = this.f20259e != null ? (C6809a) this.f20259e.toBuilder() : null;
                                this.f20259e = (FriendRequestProto$FriendRequest) codedInputStream.readMessage(FriendRequestProto$FriendRequest.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20259e);
                                    this.f20259e = (FriendRequestProto$FriendRequest) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f20260f != null ? (C6925a) this.f20260f.toBuilder() : null;
                                this.f20260f = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20260f);
                                    this.f20260f = (UserProto$User) builder2.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder3 = this.f20261g != null ? (C6925a) this.f20261g.toBuilder() : null;
                                this.f20261g = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f20261g);
                                    this.f20261g = (UserProto$User) builder3.buildPartial();
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
                if (f20258i == null) {
                    synchronized (C7979a3.class) {
                        if (f20258i == null) {
                            f20258i = new DefaultInstanceBasedParser(f20257h);
                        }
                    }
                }
                return f20258i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20257h;
    }

    public UserProto$User getAuthor() {
        UserProto$User userProto$User = this.f20260f;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public FriendRequestProto$FriendRequest getFriendRequest() {
        FriendRequestProto$FriendRequest friendRequestProto$FriendRequest = this.f20259e;
        return friendRequestProto$FriendRequest == null ? FriendRequestProto$FriendRequest.getDefaultInstance() : friendRequestProto$FriendRequest;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20259e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getFriendRequest());
        }
        if (this.f20260f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getAuthor());
        }
        if (this.f20261g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getTarget());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getTarget() {
        UserProto$User userProto$User = this.f20261g;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasAuthor() {
        return this.f20260f != null;
    }

    public boolean hasFriendRequest() {
        return this.f20259e != null;
    }

    public boolean hasTarget() {
        return this.f20261g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20259e != null) {
            codedOutputStream.writeMessage(1, getFriendRequest());
        }
        if (this.f20260f != null) {
            codedOutputStream.writeMessage(2, getAuthor());
        }
        if (this.f20261g != null) {
            codedOutputStream.writeMessage(3, getTarget());
        }
    }
}
