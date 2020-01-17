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

/* renamed from: co.znly.models.notifications.f */
public final class C7809f extends GeneratedMessageLite<C7809f, C7810a> implements NotificationProto$ChatGroupMessageNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7809f f19508j = new C7809f();

    /* renamed from: k */
    private static volatile Parser<C7809f> f19509k;

    /* renamed from: e */
    private String f19510e;

    /* renamed from: f */
    private PingProto$Ping2 f19511f;

    /* renamed from: g */
    private String f19512g;

    /* renamed from: h */
    private UserProto$User f19513h;

    /* renamed from: i */
    private String f19514i;

    /* renamed from: co.znly.models.notifications.f$a */
    public static final class C7810a extends Builder<C7809f, C7810a> implements NotificationProto$ChatGroupMessageNotificationOrBuilder {
        /* synthetic */ C7810a(C7790a aVar) {
            this();
        }

        public UserProto$User getAuthor() {
            return ((C7809f) this.instance).getAuthor();
        }

        public String getConversationName() {
            return ((C7809f) this.instance).getConversationName();
        }

        public ByteString getConversationNameBytes() {
            return ((C7809f) this.instance).getConversationNameBytes();
        }

        public String getConversationUuid() {
            return ((C7809f) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C7809f) this.instance).getConversationUuidBytes();
        }

        public String getCursor() {
            return ((C7809f) this.instance).getCursor();
        }

        public ByteString getCursorBytes() {
            return ((C7809f) this.instance).getCursorBytes();
        }

        public PingProto$Ping2 getMessage() {
            return ((C7809f) this.instance).getMessage();
        }

        public boolean hasAuthor() {
            return ((C7809f) this.instance).hasAuthor();
        }

        public boolean hasMessage() {
            return ((C7809f) this.instance).hasMessage();
        }

        private C7810a() {
            super(C7809f.f19508j);
        }
    }

    static {
        f19508j.makeImmutable();
    }

    private C7809f() {
        String str = "";
        this.f19510e = str;
        this.f19512g = str;
        this.f19514i = str;
    }

    public static C7809f getDefaultInstance() {
        return f19508j;
    }

    public static Parser<C7809f> parser() {
        return f19508j.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7809f();
            case 2:
                return f19508j;
            case 3:
                return null;
            case 4:
                return new C7810a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7809f fVar = (C7809f) obj2;
                this.f19510e = visitor.visitString(!this.f19510e.isEmpty(), this.f19510e, !fVar.f19510e.isEmpty(), fVar.f19510e);
                this.f19511f = (PingProto$Ping2) visitor.visitMessage(this.f19511f, fVar.f19511f);
                this.f19512g = visitor.visitString(!this.f19512g.isEmpty(), this.f19512g, !fVar.f19512g.isEmpty(), fVar.f19512g);
                this.f19513h = (UserProto$User) visitor.visitMessage(this.f19513h, fVar.f19513h);
                this.f19514i = visitor.visitString(!this.f19514i.isEmpty(), this.f19514i, true ^ fVar.f19514i.isEmpty(), fVar.f19514i);
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
                                this.f19510e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                Builder builder = this.f19511f != null ? (C6823a) this.f19511f.toBuilder() : null;
                                this.f19511f = (PingProto$Ping2) codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19511f);
                                    this.f19511f = (PingProto$Ping2) builder.buildPartial();
                                }
                            } else if (readTag == 26) {
                                this.f19512g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                Builder builder2 = this.f19513h != null ? (C6925a) this.f19513h.toBuilder() : null;
                                this.f19513h = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19513h);
                                    this.f19513h = (UserProto$User) builder2.buildPartial();
                                }
                            } else if (readTag == 42) {
                                this.f19514i = codedInputStream.readStringRequireUtf8();
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
                if (f19509k == null) {
                    synchronized (C7809f.class) {
                        if (f19509k == null) {
                            f19509k = new DefaultInstanceBasedParser(f19508j);
                        }
                    }
                }
                return f19509k;
            default:
                throw new UnsupportedOperationException();
        }
        return f19508j;
    }

    public UserProto$User getAuthor() {
        UserProto$User userProto$User = this.f19513h;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public String getConversationName() {
        return this.f19510e;
    }

    public ByteString getConversationNameBytes() {
        return ByteString.copyFromUtf8(this.f19510e);
    }

    public String getConversationUuid() {
        return this.f19512g;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f19512g);
    }

    public String getCursor() {
        return this.f19514i;
    }

    public ByteString getCursorBytes() {
        return ByteString.copyFromUtf8(this.f19514i);
    }

    public PingProto$Ping2 getMessage() {
        PingProto$Ping2 pingProto$Ping2 = this.f19511f;
        return pingProto$Ping2 == null ? PingProto$Ping2.getDefaultInstance() : pingProto$Ping2;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f19510e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getConversationName());
        }
        if (this.f19511f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getMessage());
        }
        if (!this.f19512g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getConversationUuid());
        }
        if (this.f19513h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getAuthor());
        }
        if (!this.f19514i.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(5, getCursor());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasAuthor() {
        return this.f19513h != null;
    }

    public boolean hasMessage() {
        return this.f19511f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f19510e.isEmpty()) {
            codedOutputStream.writeString(1, getConversationName());
        }
        if (this.f19511f != null) {
            codedOutputStream.writeMessage(2, getMessage());
        }
        if (!this.f19512g.isEmpty()) {
            codedOutputStream.writeString(3, getConversationUuid());
        }
        if (this.f19513h != null) {
            codedOutputStream.writeMessage(4, getAuthor());
        }
        if (!this.f19514i.isEmpty()) {
            codedOutputStream.writeString(5, getCursor());
        }
    }
}
