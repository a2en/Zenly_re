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

/* renamed from: co.znly.models.notifications.u */
public final class C7853u extends GeneratedMessageLite<C7853u, C7854a> implements NotificationProto$LocationRequestNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7853u f19626f = new C7853u();

    /* renamed from: g */
    private static volatile Parser<C7853u> f19627g;

    /* renamed from: e */
    private UserProto$User f19628e;

    /* renamed from: co.znly.models.notifications.u$a */
    public static final class C7854a extends Builder<C7853u, C7854a> implements NotificationProto$LocationRequestNotificationOrBuilder {
        /* synthetic */ C7854a(C7790a aVar) {
            this();
        }

        public UserProto$User getAuthor() {
            return ((C7853u) this.instance).getAuthor();
        }

        public boolean hasAuthor() {
            return ((C7853u) this.instance).hasAuthor();
        }

        private C7854a() {
            super(C7853u.f19626f);
        }
    }

    static {
        f19626f.makeImmutable();
    }

    private C7853u() {
    }

    public static C7853u getDefaultInstance() {
        return f19626f;
    }

    public static Parser<C7853u> parser() {
        return f19626f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7853u();
            case 2:
                return f19626f;
            case 3:
                return null;
            case 4:
                return new C7854a(null);
            case 5:
                this.f19628e = (UserProto$User) ((Visitor) obj).visitMessage(this.f19628e, ((C7853u) obj2).f19628e);
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
                                Builder builder = this.f19628e != null ? (C6925a) this.f19628e.toBuilder() : null;
                                this.f19628e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19628e);
                                    this.f19628e = (UserProto$User) builder.buildPartial();
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
                if (f19627g == null) {
                    synchronized (C7853u.class) {
                        if (f19627g == null) {
                            f19627g = new DefaultInstanceBasedParser(f19626f);
                        }
                    }
                }
                return f19627g;
            default:
                throw new UnsupportedOperationException();
        }
        return f19626f;
    }

    public UserProto$User getAuthor() {
        UserProto$User userProto$User = this.f19628e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19628e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getAuthor());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasAuthor() {
        return this.f19628e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19628e != null) {
            codedOutputStream.writeMessage(1, getAuthor());
        }
    }
}
