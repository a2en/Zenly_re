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

/* renamed from: co.znly.models.notifications.o */
public final class C7839o extends GeneratedMessageLite<C7839o, C7840a> implements NotificationProto$EnableWifiNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7839o f19594g = new C7839o();

    /* renamed from: h */
    private static volatile Parser<C7839o> f19595h;

    /* renamed from: e */
    private UserProto$User f19596e;

    /* renamed from: f */
    private UserProto$User f19597f;

    /* renamed from: co.znly.models.notifications.o$a */
    public static final class C7840a extends Builder<C7839o, C7840a> implements NotificationProto$EnableWifiNotificationOrBuilder {
        /* synthetic */ C7840a(C7790a aVar) {
            this();
        }

        public UserProto$User getAuthor() {
            return ((C7839o) this.instance).getAuthor();
        }

        public UserProto$User getTarget() {
            return ((C7839o) this.instance).getTarget();
        }

        public boolean hasAuthor() {
            return ((C7839o) this.instance).hasAuthor();
        }

        public boolean hasTarget() {
            return ((C7839o) this.instance).hasTarget();
        }

        private C7840a() {
            super(C7839o.f19594g);
        }
    }

    static {
        f19594g.makeImmutable();
    }

    private C7839o() {
    }

    public static C7839o getDefaultInstance() {
        return f19594g;
    }

    public static C7839o parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (C7839o) GeneratedMessageLite.parseFrom(f19594g, bArr);
    }

    public static Parser<C7839o> parser() {
        return f19594g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7839o();
            case 2:
                return f19594g;
            case 3:
                return null;
            case 4:
                return new C7840a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7839o oVar = (C7839o) obj2;
                this.f19596e = (UserProto$User) visitor.visitMessage(this.f19596e, oVar.f19596e);
                this.f19597f = (UserProto$User) visitor.visitMessage(this.f19597f, oVar.f19597f);
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
                                Builder builder = this.f19596e != null ? (C6925a) this.f19596e.toBuilder() : null;
                                this.f19596e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19596e);
                                    this.f19596e = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f19597f != null ? (C6925a) this.f19597f.toBuilder() : null;
                                this.f19597f = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19597f);
                                    this.f19597f = (UserProto$User) builder2.buildPartial();
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
                if (f19595h == null) {
                    synchronized (C7839o.class) {
                        if (f19595h == null) {
                            f19595h = new DefaultInstanceBasedParser(f19594g);
                        }
                    }
                }
                return f19595h;
            default:
                throw new UnsupportedOperationException();
        }
        return f19594g;
    }

    public UserProto$User getAuthor() {
        UserProto$User userProto$User = this.f19596e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19596e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getAuthor());
        }
        if (this.f19597f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getTarget());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getTarget() {
        UserProto$User userProto$User = this.f19597f;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasAuthor() {
        return this.f19596e != null;
    }

    public boolean hasTarget() {
        return this.f19597f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19596e != null) {
            codedOutputStream.writeMessage(1, getAuthor());
        }
        if (this.f19597f != null) {
            codedOutputStream.writeMessage(2, getTarget());
        }
    }
}
