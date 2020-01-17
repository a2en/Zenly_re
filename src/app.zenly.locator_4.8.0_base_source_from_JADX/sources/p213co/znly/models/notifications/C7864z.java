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

/* renamed from: co.znly.models.notifications.z */
public final class C7864z extends GeneratedMessageLite<C7864z, C7865a> implements NotificationProto$ProfilePicNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7864z f19693f = new C7864z();

    /* renamed from: g */
    private static volatile Parser<C7864z> f19694g;

    /* renamed from: e */
    private UserProto$User f19695e;

    /* renamed from: co.znly.models.notifications.z$a */
    public static final class C7865a extends Builder<C7864z, C7865a> implements NotificationProto$ProfilePicNotificationOrBuilder {
        /* synthetic */ C7865a(C7790a aVar) {
            this();
        }

        public UserProto$User getUser() {
            return ((C7864z) this.instance).getUser();
        }

        public boolean hasUser() {
            return ((C7864z) this.instance).hasUser();
        }

        private C7865a() {
            super(C7864z.f19693f);
        }
    }

    static {
        f19693f.makeImmutable();
    }

    private C7864z() {
    }

    public static C7864z getDefaultInstance() {
        return f19693f;
    }

    public static Parser<C7864z> parser() {
        return f19693f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7864z();
            case 2:
                return f19693f;
            case 3:
                return null;
            case 4:
                return new C7865a(null);
            case 5:
                this.f19695e = (UserProto$User) ((Visitor) obj).visitMessage(this.f19695e, ((C7864z) obj2).f19695e);
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
                                Builder builder = this.f19695e != null ? (C6925a) this.f19695e.toBuilder() : null;
                                this.f19695e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19695e);
                                    this.f19695e = (UserProto$User) builder.buildPartial();
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
                if (f19694g == null) {
                    synchronized (C7864z.class) {
                        if (f19694g == null) {
                            f19694g = new DefaultInstanceBasedParser(f19693f);
                        }
                    }
                }
                return f19694g;
            default:
                throw new UnsupportedOperationException();
        }
        return f19693f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19695e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getUser());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getUser() {
        UserProto$User userProto$User = this.f19695e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasUser() {
        return this.f19695e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19695e != null) {
            codedOutputStream.writeMessage(1, getUser());
        }
    }
}
