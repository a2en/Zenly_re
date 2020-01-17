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
import p213co.znly.models.C7339i;
import p213co.znly.models.C7339i.C7340a;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.notifications.h */
public final class C7819h extends GeneratedMessageLite<C7819h, C7820a> implements NotificationProto$ContactJoinedNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7819h f19540g = new C7819h();

    /* renamed from: h */
    private static volatile Parser<C7819h> f19541h;

    /* renamed from: e */
    private C7339i f19542e;

    /* renamed from: f */
    private UserProto$User f19543f;

    /* renamed from: co.znly.models.notifications.h$a */
    public static final class C7820a extends Builder<C7819h, C7820a> implements NotificationProto$ContactJoinedNotificationOrBuilder {
        /* synthetic */ C7820a(C7790a aVar) {
            this();
        }

        public C7339i getContact() {
            return ((C7819h) this.instance).getContact();
        }

        public UserProto$User getUser() {
            return ((C7819h) this.instance).getUser();
        }

        public boolean hasContact() {
            return ((C7819h) this.instance).hasContact();
        }

        public boolean hasUser() {
            return ((C7819h) this.instance).hasUser();
        }

        private C7820a() {
            super(C7819h.f19540g);
        }
    }

    static {
        f19540g.makeImmutable();
    }

    private C7819h() {
    }

    public static C7819h getDefaultInstance() {
        return f19540g;
    }

    public static C7819h parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (C7819h) GeneratedMessageLite.parseFrom(f19540g, bArr);
    }

    public static Parser<C7819h> parser() {
        return f19540g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7819h();
            case 2:
                return f19540g;
            case 3:
                return null;
            case 4:
                return new C7820a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7819h hVar = (C7819h) obj2;
                this.f19542e = (C7339i) visitor.visitMessage(this.f19542e, hVar.f19542e);
                this.f19543f = (UserProto$User) visitor.visitMessage(this.f19543f, hVar.f19543f);
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
                                Builder builder = this.f19542e != null ? (C7340a) this.f19542e.toBuilder() : null;
                                this.f19542e = (C7339i) codedInputStream.readMessage(C7339i.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19542e);
                                    this.f19542e = (C7339i) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f19543f != null ? (C6925a) this.f19543f.toBuilder() : null;
                                this.f19543f = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19543f);
                                    this.f19543f = (UserProto$User) builder2.buildPartial();
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
                if (f19541h == null) {
                    synchronized (C7819h.class) {
                        if (f19541h == null) {
                            f19541h = new DefaultInstanceBasedParser(f19540g);
                        }
                    }
                }
                return f19541h;
            default:
                throw new UnsupportedOperationException();
        }
        return f19540g;
    }

    public C7339i getContact() {
        C7339i iVar = this.f19542e;
        return iVar == null ? C7339i.getDefaultInstance() : iVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19542e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getContact());
        }
        if (this.f19543f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getUser());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getUser() {
        UserProto$User userProto$User = this.f19543f;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasContact() {
        return this.f19542e != null;
    }

    public boolean hasUser() {
        return this.f19543f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19542e != null) {
            codedOutputStream.writeMessage(1, getContact());
        }
        if (this.f19543f != null) {
            codedOutputStream.writeMessage(2, getUser());
        }
    }
}
