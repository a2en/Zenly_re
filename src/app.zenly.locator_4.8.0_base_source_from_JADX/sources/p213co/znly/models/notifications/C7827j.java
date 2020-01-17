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

/* renamed from: co.znly.models.notifications.j */
public final class C7827j extends GeneratedMessageLite<C7827j, C7828a> implements NotificationProto$DisableGhostAcceptedNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7827j f19574f = new C7827j();

    /* renamed from: g */
    private static volatile Parser<C7827j> f19575g;

    /* renamed from: e */
    private UserProto$User f19576e;

    /* renamed from: co.znly.models.notifications.j$a */
    public static final class C7828a extends Builder<C7827j, C7828a> implements NotificationProto$DisableGhostAcceptedNotificationOrBuilder {
        /* synthetic */ C7828a(C7790a aVar) {
            this();
        }

        public UserProto$User getTarget() {
            return ((C7827j) this.instance).getTarget();
        }

        public boolean hasTarget() {
            return ((C7827j) this.instance).hasTarget();
        }

        private C7828a() {
            super(C7827j.f19574f);
        }
    }

    static {
        f19574f.makeImmutable();
    }

    private C7827j() {
    }

    public static C7827j getDefaultInstance() {
        return f19574f;
    }

    public static Parser<C7827j> parser() {
        return f19574f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7827j();
            case 2:
                return f19574f;
            case 3:
                return null;
            case 4:
                return new C7828a(null);
            case 5:
                this.f19576e = (UserProto$User) ((Visitor) obj).visitMessage(this.f19576e, ((C7827j) obj2).f19576e);
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
                                Builder builder = this.f19576e != null ? (C6925a) this.f19576e.toBuilder() : null;
                                this.f19576e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19576e);
                                    this.f19576e = (UserProto$User) builder.buildPartial();
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
                if (f19575g == null) {
                    synchronized (C7827j.class) {
                        if (f19575g == null) {
                            f19575g = new DefaultInstanceBasedParser(f19574f);
                        }
                    }
                }
                return f19575g;
            default:
                throw new UnsupportedOperationException();
        }
        return f19574f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19576e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(2, getTarget());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getTarget() {
        UserProto$User userProto$User = this.f19576e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasTarget() {
        return this.f19576e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19576e != null) {
            codedOutputStream.writeMessage(2, getTarget());
        }
    }
}
