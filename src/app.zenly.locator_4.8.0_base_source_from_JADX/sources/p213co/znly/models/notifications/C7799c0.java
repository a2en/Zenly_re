package p213co.znly.models.notifications;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.notifications.c0 */
public final class C7799c0 extends GeneratedMessageLite<C7799c0, C7800a> implements NotificationProto$RecommendationNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7799c0 f19485i = new C7799c0();

    /* renamed from: j */
    private static volatile Parser<C7799c0> f19486j;

    /* renamed from: e */
    private UserProto$User f19487e;

    /* renamed from: f */
    private UserProto$User f19488f;

    /* renamed from: g */
    private UserProto$User f19489g;

    /* renamed from: h */
    private String f19490h = "";

    /* renamed from: co.znly.models.notifications.c0$a */
    public static final class C7800a extends Builder<C7799c0, C7800a> implements NotificationProto$RecommendationNotificationOrBuilder {
        /* synthetic */ C7800a(C7790a aVar) {
            this();
        }

        public UserProto$User getMatchMaker() {
            return ((C7799c0) this.instance).getMatchMaker();
        }

        public UserProto$User getPotentialMatch() {
            return ((C7799c0) this.instance).getPotentialMatch();
        }

        public String getRecommendationUuid() {
            return ((C7799c0) this.instance).getRecommendationUuid();
        }

        public ByteString getRecommendationUuidBytes() {
            return ((C7799c0) this.instance).getRecommendationUuidBytes();
        }

        public UserProto$User getRecommendedTo() {
            return ((C7799c0) this.instance).getRecommendedTo();
        }

        public boolean hasMatchMaker() {
            return ((C7799c0) this.instance).hasMatchMaker();
        }

        public boolean hasPotentialMatch() {
            return ((C7799c0) this.instance).hasPotentialMatch();
        }

        public boolean hasRecommendedTo() {
            return ((C7799c0) this.instance).hasRecommendedTo();
        }

        private C7800a() {
            super(C7799c0.f19485i);
        }
    }

    static {
        f19485i.makeImmutable();
    }

    private C7799c0() {
    }

    public static C7799c0 getDefaultInstance() {
        return f19485i;
    }

    public static Parser<C7799c0> parser() {
        return f19485i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7799c0();
            case 2:
                return f19485i;
            case 3:
                return null;
            case 4:
                return new C7800a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7799c0 c0Var = (C7799c0) obj2;
                this.f19487e = (UserProto$User) visitor.visitMessage(this.f19487e, c0Var.f19487e);
                this.f19488f = (UserProto$User) visitor.visitMessage(this.f19488f, c0Var.f19488f);
                this.f19489g = (UserProto$User) visitor.visitMessage(this.f19489g, c0Var.f19489g);
                this.f19490h = visitor.visitString(!this.f19490h.isEmpty(), this.f19490h, true ^ c0Var.f19490h.isEmpty(), c0Var.f19490h);
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
                                Builder builder = this.f19487e != null ? (C6925a) this.f19487e.toBuilder() : null;
                                this.f19487e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19487e);
                                    this.f19487e = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f19488f != null ? (C6925a) this.f19488f.toBuilder() : null;
                                this.f19488f = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19488f);
                                    this.f19488f = (UserProto$User) builder2.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder3 = this.f19489g != null ? (C6925a) this.f19489g.toBuilder() : null;
                                this.f19489g = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f19489g);
                                    this.f19489g = (UserProto$User) builder3.buildPartial();
                                }
                            } else if (readTag == 34) {
                                this.f19490h = codedInputStream.readStringRequireUtf8();
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
                if (f19486j == null) {
                    synchronized (C7799c0.class) {
                        if (f19486j == null) {
                            f19486j = new DefaultInstanceBasedParser(f19485i);
                        }
                    }
                }
                return f19486j;
            default:
                throw new UnsupportedOperationException();
        }
        return f19485i;
    }

    public UserProto$User getMatchMaker() {
        UserProto$User userProto$User = this.f19489g;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public UserProto$User getPotentialMatch() {
        UserProto$User userProto$User = this.f19488f;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public String getRecommendationUuid() {
        return this.f19490h;
    }

    public ByteString getRecommendationUuidBytes() {
        return ByteString.copyFromUtf8(this.f19490h);
    }

    public UserProto$User getRecommendedTo() {
        UserProto$User userProto$User = this.f19487e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19487e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getRecommendedTo());
        }
        if (this.f19488f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getPotentialMatch());
        }
        if (this.f19489g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getMatchMaker());
        }
        if (!this.f19490h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getRecommendationUuid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasMatchMaker() {
        return this.f19489g != null;
    }

    public boolean hasPotentialMatch() {
        return this.f19488f != null;
    }

    public boolean hasRecommendedTo() {
        return this.f19487e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19487e != null) {
            codedOutputStream.writeMessage(1, getRecommendedTo());
        }
        if (this.f19488f != null) {
            codedOutputStream.writeMessage(2, getPotentialMatch());
        }
        if (this.f19489g != null) {
            codedOutputStream.writeMessage(3, getMatchMaker());
        }
        if (!this.f19490h.isEmpty()) {
            codedOutputStream.writeString(4, getRecommendationUuid());
        }
    }
}
