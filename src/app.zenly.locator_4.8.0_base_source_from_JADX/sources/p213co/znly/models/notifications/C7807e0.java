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
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.PingProto$Ping2.C6823a;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.notifications.e0 */
public final class C7807e0 extends GeneratedMessageLite<C7807e0, C7808a> implements NotificationProto$RequestMediaNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7807e0 f19501j = new C7807e0();

    /* renamed from: k */
    private static volatile Parser<C7807e0> f19502k;

    /* renamed from: e */
    private String f19503e;

    /* renamed from: f */
    private String f19504f;

    /* renamed from: g */
    private UserProto$User f19505g;

    /* renamed from: h */
    private PingProto$Ping2 f19506h;

    /* renamed from: i */
    private String f19507i;

    /* renamed from: co.znly.models.notifications.e0$a */
    public static final class C7808a extends Builder<C7807e0, C7808a> implements NotificationProto$RequestMediaNotificationOrBuilder {
        /* synthetic */ C7808a(C7790a aVar) {
            this();
        }

        public UserProto$User getAuthor() {
            return ((C7807e0) this.instance).getAuthor();
        }

        public String getConversationName() {
            return ((C7807e0) this.instance).getConversationName();
        }

        public ByteString getConversationNameBytes() {
            return ((C7807e0) this.instance).getConversationNameBytes();
        }

        public String getConversationUuid() {
            return ((C7807e0) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C7807e0) this.instance).getConversationUuidBytes();
        }

        public String getCursor() {
            return ((C7807e0) this.instance).getCursor();
        }

        public ByteString getCursorBytes() {
            return ((C7807e0) this.instance).getCursorBytes();
        }

        public PingProto$Ping2 getMessage() {
            return ((C7807e0) this.instance).getMessage();
        }

        public boolean hasAuthor() {
            return ((C7807e0) this.instance).hasAuthor();
        }

        public boolean hasMessage() {
            return ((C7807e0) this.instance).hasMessage();
        }

        private C7808a() {
            super(C7807e0.f19501j);
        }
    }

    static {
        f19501j.makeImmutable();
    }

    private C7807e0() {
        String str = "";
        this.f19503e = str;
        this.f19504f = str;
        this.f19507i = str;
    }

    public static C7807e0 getDefaultInstance() {
        return f19501j;
    }

    public static Parser<C7807e0> parser() {
        return f19501j.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7807e0();
            case 2:
                return f19501j;
            case 3:
                return null;
            case 4:
                return new C7808a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7807e0 e0Var = (C7807e0) obj2;
                this.f19503e = visitor.visitString(!this.f19503e.isEmpty(), this.f19503e, !e0Var.f19503e.isEmpty(), e0Var.f19503e);
                this.f19504f = visitor.visitString(!this.f19504f.isEmpty(), this.f19504f, !e0Var.f19504f.isEmpty(), e0Var.f19504f);
                this.f19505g = (UserProto$User) visitor.visitMessage(this.f19505g, e0Var.f19505g);
                this.f19506h = (PingProto$Ping2) visitor.visitMessage(this.f19506h, e0Var.f19506h);
                this.f19507i = visitor.visitString(!this.f19507i.isEmpty(), this.f19507i, true ^ e0Var.f19507i.isEmpty(), e0Var.f19507i);
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
                                this.f19503e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f19504f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                Builder builder = this.f19505g != null ? (C6925a) this.f19505g.toBuilder() : null;
                                this.f19505g = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19505g);
                                    this.f19505g = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 34) {
                                Builder builder2 = this.f19506h != null ? (C6823a) this.f19506h.toBuilder() : null;
                                this.f19506h = (PingProto$Ping2) codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19506h);
                                    this.f19506h = (PingProto$Ping2) builder2.buildPartial();
                                }
                            } else if (readTag == 42) {
                                this.f19507i = codedInputStream.readStringRequireUtf8();
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
                if (f19502k == null) {
                    synchronized (C7807e0.class) {
                        if (f19502k == null) {
                            f19502k = new DefaultInstanceBasedParser(f19501j);
                        }
                    }
                }
                return f19502k;
            default:
                throw new UnsupportedOperationException();
        }
        return f19501j;
    }

    public UserProto$User getAuthor() {
        UserProto$User userProto$User = this.f19505g;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public String getConversationName() {
        return this.f19503e;
    }

    public ByteString getConversationNameBytes() {
        return ByteString.copyFromUtf8(this.f19503e);
    }

    public String getConversationUuid() {
        return this.f19504f;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f19504f);
    }

    public String getCursor() {
        return this.f19507i;
    }

    public ByteString getCursorBytes() {
        return ByteString.copyFromUtf8(this.f19507i);
    }

    public PingProto$Ping2 getMessage() {
        PingProto$Ping2 pingProto$Ping2 = this.f19506h;
        return pingProto$Ping2 == null ? PingProto$Ping2.getDefaultInstance() : pingProto$Ping2;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f19503e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getConversationName());
        }
        if (!this.f19504f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getConversationUuid());
        }
        if (this.f19505g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getAuthor());
        }
        if (this.f19506h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getMessage());
        }
        if (!this.f19507i.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(5, getCursor());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasAuthor() {
        return this.f19505g != null;
    }

    public boolean hasMessage() {
        return this.f19506h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f19503e.isEmpty()) {
            codedOutputStream.writeString(1, getConversationName());
        }
        if (!this.f19504f.isEmpty()) {
            codedOutputStream.writeString(2, getConversationUuid());
        }
        if (this.f19505g != null) {
            codedOutputStream.writeMessage(3, getAuthor());
        }
        if (this.f19506h != null) {
            codedOutputStream.writeMessage(4, getMessage());
        }
        if (!this.f19507i.isEmpty()) {
            codedOutputStream.writeString(5, getCursor());
        }
    }
}
