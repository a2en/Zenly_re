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
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.notifications.d0 */
public final class C7803d0 extends GeneratedMessageLite<C7803d0, C7804a> implements NotificationProto$RecommendationRewardNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7803d0 f19494g = new C7803d0();

    /* renamed from: h */
    private static volatile Parser<C7803d0> f19495h;

    /* renamed from: e */
    private UserProto$User f19496e;

    /* renamed from: f */
    private UserProto$User f19497f;

    /* renamed from: co.znly.models.notifications.d0$a */
    public static final class C7804a extends Builder<C7803d0, C7804a> implements NotificationProto$RecommendationRewardNotificationOrBuilder {
        /* synthetic */ C7804a(C7790a aVar) {
            this();
        }

        public UserProto$User getMatch() {
            return ((C7803d0) this.instance).getMatch();
        }

        public UserProto$User getRecommendedTo() {
            return ((C7803d0) this.instance).getRecommendedTo();
        }

        public boolean hasMatch() {
            return ((C7803d0) this.instance).hasMatch();
        }

        public boolean hasRecommendedTo() {
            return ((C7803d0) this.instance).hasRecommendedTo();
        }

        private C7804a() {
            super(C7803d0.f19494g);
        }
    }

    static {
        f19494g.makeImmutable();
    }

    private C7803d0() {
    }

    public static C7803d0 getDefaultInstance() {
        return f19494g;
    }

    public static Parser<C7803d0> parser() {
        return f19494g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7803d0();
            case 2:
                return f19494g;
            case 3:
                return null;
            case 4:
                return new C7804a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7803d0 d0Var = (C7803d0) obj2;
                this.f19496e = (UserProto$User) visitor.visitMessage(this.f19496e, d0Var.f19496e);
                this.f19497f = (UserProto$User) visitor.visitMessage(this.f19497f, d0Var.f19497f);
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
                                Builder builder = this.f19496e != null ? (C6925a) this.f19496e.toBuilder() : null;
                                this.f19496e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19496e);
                                    this.f19496e = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f19497f != null ? (C6925a) this.f19497f.toBuilder() : null;
                                this.f19497f = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19497f);
                                    this.f19497f = (UserProto$User) builder2.buildPartial();
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
                if (f19495h == null) {
                    synchronized (C7803d0.class) {
                        if (f19495h == null) {
                            f19495h = new DefaultInstanceBasedParser(f19494g);
                        }
                    }
                }
                return f19495h;
            default:
                throw new UnsupportedOperationException();
        }
        return f19494g;
    }

    public UserProto$User getMatch() {
        UserProto$User userProto$User = this.f19497f;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public UserProto$User getRecommendedTo() {
        UserProto$User userProto$User = this.f19496e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19496e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getRecommendedTo());
        }
        if (this.f19497f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getMatch());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasMatch() {
        return this.f19497f != null;
    }

    public boolean hasRecommendedTo() {
        return this.f19496e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19496e != null) {
            codedOutputStream.writeMessage(1, getRecommendedTo());
        }
        if (this.f19497f != null) {
            codedOutputStream.writeMessage(2, getMatch());
        }
    }
}
