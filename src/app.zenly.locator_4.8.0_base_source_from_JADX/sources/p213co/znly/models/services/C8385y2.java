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
import p213co.znly.models.C6947a3;
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6809a;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;
import p213co.znly.models.services.C8351w2.C8352a;

/* renamed from: co.znly.models.services.y2 */
public final class C8385y2 extends GeneratedMessageLite<C8385y2, C8386a> implements ZenlyProto$FriendRequestCreateResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C8385y2 f21236j = new C8385y2();

    /* renamed from: k */
    private static volatile Parser<C8385y2> f21237k;

    /* renamed from: e */
    private FriendRequestProto$FriendRequest f21238e;

    /* renamed from: f */
    private UserProto$User f21239f;

    /* renamed from: g */
    private UserProto$User f21240g;

    /* renamed from: h */
    private int f21241h;

    /* renamed from: i */
    private C8351w2 f21242i;

    /* renamed from: co.znly.models.services.y2$a */
    public static final class C8386a extends Builder<C8385y2, C8386a> implements ZenlyProto$FriendRequestCreateResponseOrBuilder {
        /* synthetic */ C8386a(C8104i0 i0Var) {
            this();
        }

        public UserProto$User getAuthor() {
            return ((C8385y2) this.instance).getAuthor();
        }

        public C6947a3 getBlockRelationship() {
            return ((C8385y2) this.instance).getBlockRelationship();
        }

        public int getBlockRelationshipValue() {
            return ((C8385y2) this.instance).getBlockRelationshipValue();
        }

        public C8351w2 getError() {
            return ((C8385y2) this.instance).getError();
        }

        public FriendRequestProto$FriendRequest getFriendRequest() {
            return ((C8385y2) this.instance).getFriendRequest();
        }

        public UserProto$User getTarget() {
            return ((C8385y2) this.instance).getTarget();
        }

        public boolean hasAuthor() {
            return ((C8385y2) this.instance).hasAuthor();
        }

        public boolean hasError() {
            return ((C8385y2) this.instance).hasError();
        }

        public boolean hasFriendRequest() {
            return ((C8385y2) this.instance).hasFriendRequest();
        }

        public boolean hasTarget() {
            return ((C8385y2) this.instance).hasTarget();
        }

        private C8386a() {
            super(C8385y2.f21236j);
        }
    }

    static {
        f21236j.makeImmutable();
    }

    private C8385y2() {
    }

    public static C8386a newBuilder() {
        return (C8386a) f21236j.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8385y2();
            case 2:
                return f21236j;
            case 3:
                return null;
            case 4:
                return new C8386a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8385y2 y2Var = (C8385y2) obj2;
                this.f21238e = (FriendRequestProto$FriendRequest) visitor.visitMessage(this.f21238e, y2Var.f21238e);
                this.f21239f = (UserProto$User) visitor.visitMessage(this.f21239f, y2Var.f21239f);
                this.f21240g = (UserProto$User) visitor.visitMessage(this.f21240g, y2Var.f21240g);
                boolean z2 = this.f21241h != 0;
                int i = this.f21241h;
                if (y2Var.f21241h != 0) {
                    z = true;
                }
                this.f21241h = visitor.visitInt(z2, i, z, y2Var.f21241h);
                this.f21242i = (C8351w2) visitor.visitMessage(this.f21242i, y2Var.f21242i);
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
                                Builder builder = this.f21238e != null ? (C6809a) this.f21238e.toBuilder() : null;
                                this.f21238e = (FriendRequestProto$FriendRequest) codedInputStream.readMessage(FriendRequestProto$FriendRequest.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21238e);
                                    this.f21238e = (FriendRequestProto$FriendRequest) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f21239f != null ? (C6925a) this.f21239f.toBuilder() : null;
                                this.f21239f = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f21239f);
                                    this.f21239f = (UserProto$User) builder2.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder3 = this.f21240g != null ? (C6925a) this.f21240g.toBuilder() : null;
                                this.f21240g = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f21240g);
                                    this.f21240g = (UserProto$User) builder3.buildPartial();
                                }
                            } else if (readTag == 32) {
                                this.f21241h = codedInputStream.readEnum();
                            } else if (readTag == 42) {
                                Builder builder4 = this.f21242i != null ? (C8352a) this.f21242i.toBuilder() : null;
                                this.f21242i = (C8351w2) codedInputStream.readMessage(C8351w2.parser(), extensionRegistryLite);
                                if (builder4 != null) {
                                    builder4.mergeFrom(this.f21242i);
                                    this.f21242i = (C8351w2) builder4.buildPartial();
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
                if (f21237k == null) {
                    synchronized (C8385y2.class) {
                        if (f21237k == null) {
                            f21237k = new DefaultInstanceBasedParser(f21236j);
                        }
                    }
                }
                return f21237k;
            default:
                throw new UnsupportedOperationException();
        }
        return f21236j;
    }

    public UserProto$User getAuthor() {
        UserProto$User userProto$User = this.f21239f;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public C6947a3 getBlockRelationship() {
        C6947a3 a = C6947a3.m17694a(this.f21241h);
        return a == null ? C6947a3.UNRECOGNIZED : a;
    }

    public int getBlockRelationshipValue() {
        return this.f21241h;
    }

    public C8351w2 getError() {
        C8351w2 w2Var = this.f21242i;
        return w2Var == null ? C8351w2.getDefaultInstance() : w2Var;
    }

    public FriendRequestProto$FriendRequest getFriendRequest() {
        FriendRequestProto$FriendRequest friendRequestProto$FriendRequest = this.f21238e;
        return friendRequestProto$FriendRequest == null ? FriendRequestProto$FriendRequest.getDefaultInstance() : friendRequestProto$FriendRequest;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f21238e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getFriendRequest());
        }
        if (this.f21239f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getAuthor());
        }
        if (this.f21240g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getTarget());
        }
        if (this.f21241h != C6947a3.UNKNOW.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(4, this.f21241h);
        }
        if (this.f21242i != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getTarget() {
        UserProto$User userProto$User = this.f21240g;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasAuthor() {
        return this.f21239f != null;
    }

    public boolean hasError() {
        return this.f21242i != null;
    }

    public boolean hasFriendRequest() {
        return this.f21238e != null;
    }

    public boolean hasTarget() {
        return this.f21240g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21238e != null) {
            codedOutputStream.writeMessage(1, getFriendRequest());
        }
        if (this.f21239f != null) {
            codedOutputStream.writeMessage(2, getAuthor());
        }
        if (this.f21240g != null) {
            codedOutputStream.writeMessage(3, getTarget());
        }
        if (this.f21241h != C6947a3.UNKNOW.getNumber()) {
            codedOutputStream.writeEnum(4, this.f21241h);
        }
        if (this.f21242i != null) {
            codedOutputStream.writeMessage(5, getError());
        }
    }
}
