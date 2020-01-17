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

/* renamed from: co.znly.models.notifications.g */
public final class C7813g extends GeneratedMessageLite<C7813g, C7814a> implements NotificationProto$ChatMessageNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7813g f19519i = new C7813g();

    /* renamed from: j */
    private static volatile Parser<C7813g> f19520j;

    /* renamed from: e */
    private UserProto$User f19521e;

    /* renamed from: f */
    private PingProto$Ping2 f19522f;

    /* renamed from: g */
    private String f19523g;

    /* renamed from: h */
    private String f19524h;

    /* renamed from: co.znly.models.notifications.g$a */
    public static final class C7814a extends Builder<C7813g, C7814a> implements NotificationProto$ChatMessageNotificationOrBuilder {
        /* synthetic */ C7814a(C7790a aVar) {
            this();
        }

        public UserProto$User getAuthor() {
            return ((C7813g) this.instance).getAuthor();
        }

        public String getConversationUuid() {
            return ((C7813g) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C7813g) this.instance).getConversationUuidBytes();
        }

        public String getCursor() {
            return ((C7813g) this.instance).getCursor();
        }

        public ByteString getCursorBytes() {
            return ((C7813g) this.instance).getCursorBytes();
        }

        public PingProto$Ping2 getMessage() {
            return ((C7813g) this.instance).getMessage();
        }

        public boolean hasAuthor() {
            return ((C7813g) this.instance).hasAuthor();
        }

        public boolean hasMessage() {
            return ((C7813g) this.instance).hasMessage();
        }

        private C7814a() {
            super(C7813g.f19519i);
        }
    }

    static {
        f19519i.makeImmutable();
    }

    private C7813g() {
        String str = "";
        this.f19523g = str;
        this.f19524h = str;
    }

    public static C7813g getDefaultInstance() {
        return f19519i;
    }

    public static Parser<C7813g> parser() {
        return f19519i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7813g();
            case 2:
                return f19519i;
            case 3:
                return null;
            case 4:
                return new C7814a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7813g gVar = (C7813g) obj2;
                this.f19521e = (UserProto$User) visitor.visitMessage(this.f19521e, gVar.f19521e);
                this.f19522f = (PingProto$Ping2) visitor.visitMessage(this.f19522f, gVar.f19522f);
                this.f19523g = visitor.visitString(!this.f19523g.isEmpty(), this.f19523g, !gVar.f19523g.isEmpty(), gVar.f19523g);
                this.f19524h = visitor.visitString(!this.f19524h.isEmpty(), this.f19524h, true ^ gVar.f19524h.isEmpty(), gVar.f19524h);
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
                                Builder builder = this.f19521e != null ? (C6925a) this.f19521e.toBuilder() : null;
                                this.f19521e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19521e);
                                    this.f19521e = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f19522f != null ? (C6823a) this.f19522f.toBuilder() : null;
                                this.f19522f = (PingProto$Ping2) codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19522f);
                                    this.f19522f = (PingProto$Ping2) builder2.buildPartial();
                                }
                            } else if (readTag == 26) {
                                this.f19523g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.f19524h = codedInputStream.readStringRequireUtf8();
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
                if (f19520j == null) {
                    synchronized (C7813g.class) {
                        if (f19520j == null) {
                            f19520j = new DefaultInstanceBasedParser(f19519i);
                        }
                    }
                }
                return f19520j;
            default:
                throw new UnsupportedOperationException();
        }
        return f19519i;
    }

    public UserProto$User getAuthor() {
        UserProto$User userProto$User = this.f19521e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public String getConversationUuid() {
        return this.f19523g;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f19523g);
    }

    public String getCursor() {
        return this.f19524h;
    }

    public ByteString getCursorBytes() {
        return ByteString.copyFromUtf8(this.f19524h);
    }

    public PingProto$Ping2 getMessage() {
        PingProto$Ping2 pingProto$Ping2 = this.f19522f;
        return pingProto$Ping2 == null ? PingProto$Ping2.getDefaultInstance() : pingProto$Ping2;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19521e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getAuthor());
        }
        if (this.f19522f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getMessage());
        }
        if (!this.f19523g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getConversationUuid());
        }
        if (!this.f19524h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getCursor());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasAuthor() {
        return this.f19521e != null;
    }

    public boolean hasMessage() {
        return this.f19522f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19521e != null) {
            codedOutputStream.writeMessage(1, getAuthor());
        }
        if (this.f19522f != null) {
            codedOutputStream.writeMessage(2, getMessage());
        }
        if (!this.f19523g.isEmpty()) {
            codedOutputStream.writeString(3, getConversationUuid());
        }
        if (!this.f19524h.isEmpty()) {
            codedOutputStream.writeString(4, getCursor());
        }
    }
}
