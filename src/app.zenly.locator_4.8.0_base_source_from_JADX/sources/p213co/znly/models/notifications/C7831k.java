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

/* renamed from: co.znly.models.notifications.k */
public final class C7831k extends GeneratedMessageLite<C7831k, C7832a> implements NotificationProto$DisableGhostNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7831k f19580f = new C7831k();

    /* renamed from: g */
    private static volatile Parser<C7831k> f19581g;

    /* renamed from: e */
    private UserProto$User f19582e;

    /* renamed from: co.znly.models.notifications.k$a */
    public static final class C7832a extends Builder<C7831k, C7832a> implements NotificationProto$DisableGhostNotificationOrBuilder {
        /* synthetic */ C7832a(C7790a aVar) {
            this();
        }

        public UserProto$User getAuthor() {
            return ((C7831k) this.instance).getAuthor();
        }

        public boolean hasAuthor() {
            return ((C7831k) this.instance).hasAuthor();
        }

        private C7832a() {
            super(C7831k.f19580f);
        }
    }

    static {
        f19580f.makeImmutable();
    }

    private C7831k() {
    }

    public static C7831k getDefaultInstance() {
        return f19580f;
    }

    public static Parser<C7831k> parser() {
        return f19580f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7831k();
            case 2:
                return f19580f;
            case 3:
                return null;
            case 4:
                return new C7832a(null);
            case 5:
                this.f19582e = (UserProto$User) ((Visitor) obj).visitMessage(this.f19582e, ((C7831k) obj2).f19582e);
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
                                Builder builder = this.f19582e != null ? (C6925a) this.f19582e.toBuilder() : null;
                                this.f19582e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19582e);
                                    this.f19582e = (UserProto$User) builder.buildPartial();
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
                if (f19581g == null) {
                    synchronized (C7831k.class) {
                        if (f19581g == null) {
                            f19581g = new DefaultInstanceBasedParser(f19580f);
                        }
                    }
                }
                return f19581g;
            default:
                throw new UnsupportedOperationException();
        }
        return f19580f;
    }

    public UserProto$User getAuthor() {
        UserProto$User userProto$User = this.f19582e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19582e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getAuthor());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasAuthor() {
        return this.f19582e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19582e != null) {
            codedOutputStream.writeMessage(1, getAuthor());
        }
    }
}
