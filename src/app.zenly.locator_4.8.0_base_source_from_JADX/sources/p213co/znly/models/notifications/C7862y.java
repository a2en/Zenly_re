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

/* renamed from: co.znly.models.notifications.y */
public final class C7862y extends GeneratedMessageLite<C7862y, C7863a> implements NotificationProto$PingNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C7862y f19685k = new C7862y();

    /* renamed from: l */
    private static volatile Parser<C7862y> f19686l;

    /* renamed from: e */
    private UserProto$User f19687e;

    /* renamed from: f */
    private PingProto$Ping2 f19688f;

    /* renamed from: g */
    private String f19689g;

    /* renamed from: h */
    private String f19690h;

    /* renamed from: i */
    private String f19691i;

    /* renamed from: j */
    private boolean f19692j;

    /* renamed from: co.znly.models.notifications.y$a */
    public static final class C7863a extends Builder<C7862y, C7863a> implements NotificationProto$PingNotificationOrBuilder {
        /* synthetic */ C7863a(C7790a aVar) {
            this();
        }

        public UserProto$User getAuthor() {
            return ((C7862y) this.instance).getAuthor();
        }

        public String getConversationName() {
            return ((C7862y) this.instance).getConversationName();
        }

        public ByteString getConversationNameBytes() {
            return ((C7862y) this.instance).getConversationNameBytes();
        }

        public String getConversationUuid() {
            return ((C7862y) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C7862y) this.instance).getConversationUuidBytes();
        }

        public String getCursor() {
            return ((C7862y) this.instance).getCursor();
        }

        public ByteString getCursorBytes() {
            return ((C7862y) this.instance).getCursorBytes();
        }

        public boolean getIsGroup() {
            return ((C7862y) this.instance).getIsGroup();
        }

        public PingProto$Ping2 getPing() {
            return ((C7862y) this.instance).getPing();
        }

        public boolean hasAuthor() {
            return ((C7862y) this.instance).hasAuthor();
        }

        public boolean hasPing() {
            return ((C7862y) this.instance).hasPing();
        }

        private C7863a() {
            super(C7862y.f19685k);
        }
    }

    static {
        f19685k.makeImmutable();
    }

    private C7862y() {
        String str = "";
        this.f19689g = str;
        this.f19690h = str;
        this.f19691i = str;
    }

    public static C7862y getDefaultInstance() {
        return f19685k;
    }

    public static Parser<C7862y> parser() {
        return f19685k.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7862y();
            case 2:
                return f19685k;
            case 3:
                return null;
            case 4:
                return new C7863a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7862y yVar = (C7862y) obj2;
                this.f19687e = (UserProto$User) visitor.visitMessage(this.f19687e, yVar.f19687e);
                this.f19688f = (PingProto$Ping2) visitor.visitMessage(this.f19688f, yVar.f19688f);
                this.f19689g = visitor.visitString(!this.f19689g.isEmpty(), this.f19689g, !yVar.f19689g.isEmpty(), yVar.f19689g);
                this.f19690h = visitor.visitString(!this.f19690h.isEmpty(), this.f19690h, !yVar.f19690h.isEmpty(), yVar.f19690h);
                this.f19691i = visitor.visitString(!this.f19691i.isEmpty(), this.f19691i, true ^ yVar.f19691i.isEmpty(), yVar.f19691i);
                boolean z = this.f19692j;
                boolean z2 = yVar.f19692j;
                this.f19692j = visitor.visitBoolean(z, z, z2, z2);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Builder builder = this.f19687e != null ? (C6925a) this.f19687e.toBuilder() : null;
                                this.f19687e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19687e);
                                    this.f19687e = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f19688f != null ? (C6823a) this.f19688f.toBuilder() : null;
                                this.f19688f = (PingProto$Ping2) codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19688f);
                                    this.f19688f = (PingProto$Ping2) builder2.buildPartial();
                                }
                            } else if (readTag == 26) {
                                this.f19689g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.f19690h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                this.f19691i = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 48) {
                                this.f19692j = codedInputStream.readBool();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z3 = true;
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
                if (f19686l == null) {
                    synchronized (C7862y.class) {
                        if (f19686l == null) {
                            f19686l = new DefaultInstanceBasedParser(f19685k);
                        }
                    }
                }
                return f19686l;
            default:
                throw new UnsupportedOperationException();
        }
        return f19685k;
    }

    public UserProto$User getAuthor() {
        UserProto$User userProto$User = this.f19687e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public String getConversationName() {
        return this.f19691i;
    }

    public ByteString getConversationNameBytes() {
        return ByteString.copyFromUtf8(this.f19691i);
    }

    public String getConversationUuid() {
        return this.f19690h;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f19690h);
    }

    public String getCursor() {
        return this.f19689g;
    }

    public ByteString getCursorBytes() {
        return ByteString.copyFromUtf8(this.f19689g);
    }

    public boolean getIsGroup() {
        return this.f19692j;
    }

    public PingProto$Ping2 getPing() {
        PingProto$Ping2 pingProto$Ping2 = this.f19688f;
        return pingProto$Ping2 == null ? PingProto$Ping2.getDefaultInstance() : pingProto$Ping2;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19687e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getAuthor());
        }
        if (this.f19688f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getPing());
        }
        if (!this.f19689g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getCursor());
        }
        if (!this.f19690h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getConversationUuid());
        }
        if (!this.f19691i.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(5, getConversationName());
        }
        boolean z = this.f19692j;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(6, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasAuthor() {
        return this.f19687e != null;
    }

    public boolean hasPing() {
        return this.f19688f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19687e != null) {
            codedOutputStream.writeMessage(1, getAuthor());
        }
        if (this.f19688f != null) {
            codedOutputStream.writeMessage(2, getPing());
        }
        if (!this.f19689g.isEmpty()) {
            codedOutputStream.writeString(3, getCursor());
        }
        if (!this.f19690h.isEmpty()) {
            codedOutputStream.writeString(4, getConversationUuid());
        }
        if (!this.f19691i.isEmpty()) {
            codedOutputStream.writeString(5, getConversationName());
        }
        boolean z = this.f19692j;
        if (z) {
            codedOutputStream.writeBool(6, z);
        }
    }
}
