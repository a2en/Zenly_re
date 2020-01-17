package p213co.znly.models.core;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PingProto$Conversation.C6818b;
import p213co.znly.models.PingProto$Conversation.C6818b.C6819a;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.PingProto$Ping2.C6823a;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.core.i */
public final class C7117i extends GeneratedMessageLite<C7117i, C7118a> implements ChatProto$ConversationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static final C7117i f17611B = new C7117i();

    /* renamed from: C */
    private static volatile Parser<C7117i> f17612C;

    /* renamed from: A */
    private String f17613A;

    /* renamed from: e */
    private int f17614e;

    /* renamed from: f */
    private String f17615f;

    /* renamed from: g */
    private C6818b f17616g;

    /* renamed from: h */
    private ProtobufList<C6818b> f17617h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: i */
    private PingProto$Ping2 f17618i;

    /* renamed from: j */
    private Timestamp f17619j;

    /* renamed from: k */
    private String f17620k;

    /* renamed from: l */
    private boolean f17621l;

    /* renamed from: m */
    private ProtobufList<UserProto$User> f17622m;

    /* renamed from: n */
    private boolean f17623n;

    /* renamed from: o */
    private boolean f17624o;

    /* renamed from: p */
    private boolean f17625p;

    /* renamed from: q */
    private int f17626q;

    /* renamed from: r */
    private int f17627r;

    /* renamed from: s */
    private int f17628s;

    /* renamed from: t */
    private boolean f17629t;

    /* renamed from: u */
    private ProtobufList<C7234v> f17630u;

    /* renamed from: v */
    private int f17631v;

    /* renamed from: w */
    private Timestamp f17632w;

    /* renamed from: x */
    private String f17633x;

    /* renamed from: y */
    private String f17634y;

    /* renamed from: z */
    private String f17635z;

    /* renamed from: co.znly.models.core.i$a */
    public static final class C7118a extends Builder<C7117i, C7118a> implements ChatProto$ConversationOrBuilder {
        /* synthetic */ C7118a(C7066c cVar) {
            this();
        }

        public boolean getAsynCall() {
            return ((C7117i) this.instance).getAsynCall();
        }

        public UserProto$User getAvatars(int i) {
            return ((C7117i) this.instance).getAvatars(i);
        }

        public int getAvatarsCount() {
            return ((C7117i) this.instance).getAvatarsCount();
        }

        public List<UserProto$User> getAvatarsList() {
            return Collections.unmodifiableList(((C7117i) this.instance).getAvatarsList());
        }

        public String getChatTip() {
            return ((C7117i) this.instance).getChatTip();
        }

        public ByteString getChatTipBytes() {
            return ((C7117i) this.instance).getChatTipBytes();
        }

        public boolean getHasLeft() {
            return ((C7117i) this.instance).getHasLeft();
        }

        public boolean getHidden() {
            return ((C7117i) this.instance).getHidden();
        }

        public String getInboxUuid() {
            return ((C7117i) this.instance).getInboxUuid();
        }

        public ByteString getInboxUuidBytes() {
            return ((C7117i) this.instance).getInboxUuidBytes();
        }

        public boolean getIsGroup() {
            return ((C7117i) this.instance).getIsGroup();
        }

        public PingProto$Ping2 getLastMessage() {
            return ((C7117i) this.instance).getLastMessage();
        }

        public C7119b getLastMsgState() {
            return ((C7117i) this.instance).getLastMsgState();
        }

        public int getLastMsgStateValue() {
            return ((C7117i) this.instance).getLastMsgStateValue();
        }

        public Timestamp getLazyCreatedAt() {
            return ((C7117i) this.instance).getLazyCreatedAt();
        }

        public C6818b getMe() {
            return ((C7117i) this.instance).getMe();
        }

        public Timestamp getModifiedAt() {
            return ((C7117i) this.instance).getModifiedAt();
        }

        public boolean getMuted() {
            return ((C7117i) this.instance).getMuted();
        }

        public String getName() {
            return ((C7117i) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((C7117i) this.instance).getNameBytes();
        }

        public int getNbChat() {
            return ((C7117i) this.instance).getNbChat();
        }

        public int getNbMediaFromReplyUnread() {
            return ((C7117i) this.instance).getNbMediaFromReplyUnread();
        }

        public int getNbPing() {
            return ((C7117i) this.instance).getNbPing();
        }

        public C6818b getOthers(int i) {
            return ((C7117i) this.instance).getOthers(i);
        }

        public int getOthersCount() {
            return ((C7117i) this.instance).getOthersCount();
        }

        public List<C6818b> getOthersList() {
            return Collections.unmodifiableList(((C7117i) this.instance).getOthersList());
        }

        public String getPingCursor() {
            return ((C7117i) this.instance).getPingCursor();
        }

        public ByteString getPingCursorBytes() {
            return ((C7117i) this.instance).getPingCursorBytes();
        }

        public String getPingTip() {
            return ((C7117i) this.instance).getPingTip();
        }

        public ByteString getPingTipBytes() {
            return ((C7117i) this.instance).getPingTipBytes();
        }

        public String getRequestMediaCursor() {
            return ((C7117i) this.instance).getRequestMediaCursor();
        }

        public ByteString getRequestMediaCursorBytes() {
            return ((C7117i) this.instance).getRequestMediaCursorBytes();
        }

        public C7234v getRequestMediaReceived(int i) {
            return ((C7117i) this.instance).getRequestMediaReceived(i);
        }

        public int getRequestMediaReceivedCount() {
            return ((C7117i) this.instance).getRequestMediaReceivedCount();
        }

        public List<C7234v> getRequestMediaReceivedList() {
            return Collections.unmodifiableList(((C7117i) this.instance).getRequestMediaReceivedList());
        }

        public boolean hasLastMessage() {
            return ((C7117i) this.instance).hasLastMessage();
        }

        public boolean hasLazyCreatedAt() {
            return ((C7117i) this.instance).hasLazyCreatedAt();
        }

        public boolean hasMe() {
            return ((C7117i) this.instance).hasMe();
        }

        public boolean hasModifiedAt() {
            return ((C7117i) this.instance).hasModifiedAt();
        }

        private C7118a() {
            super(C7117i.f17611B);
        }
    }

    /* renamed from: co.znly.models.core.i$b */
    public enum C7119b implements EnumLite {
        LAST_MSG_STATE_UNKNOWN(0),
        LAST_MSG_STATE_READ(1),
        LAST_MSG_STATE_UNREAD(2),
        LAST_MSG_STATE_PENDING(3),
        LAST_MSG_STATE_FAILED(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f17643e;

        /* renamed from: co.znly.models.core.i$b$a */
        class C7120a implements EnumLiteMap<C7119b> {
            C7120a() {
            }

            public C7119b findValueByNumber(int i) {
                return C7119b.m17805a(i);
            }
        }

        static {
            new C7120a();
        }

        private C7119b(int i) {
            this.f17643e = i;
        }

        /* renamed from: a */
        public static C7119b m17805a(int i) {
            if (i == 0) {
                return LAST_MSG_STATE_UNKNOWN;
            }
            if (i == 1) {
                return LAST_MSG_STATE_READ;
            }
            if (i == 2) {
                return LAST_MSG_STATE_UNREAD;
            }
            if (i == 3) {
                return LAST_MSG_STATE_PENDING;
            }
            if (i != 4) {
                return null;
            }
            return LAST_MSG_STATE_FAILED;
        }

        public final int getNumber() {
            return this.f17643e;
        }
    }

    static {
        f17611B.makeImmutable();
    }

    private C7117i() {
        String str = "";
        this.f17615f = str;
        this.f17620k = str;
        this.f17622m = GeneratedMessageLite.emptyProtobufList();
        this.f17630u = GeneratedMessageLite.emptyProtobufList();
        this.f17633x = str;
        this.f17634y = str;
        this.f17635z = str;
        this.f17613A = str;
    }

    public static C7117i getDefaultInstance() {
        return f17611B;
    }

    public static C7118a newBuilder() {
        return (C7118a) f17611B.toBuilder();
    }

    public static C7117i parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (C7117i) GeneratedMessageLite.parseFrom(f17611B, bArr);
    }

    public static Parser<C7117i> parser() {
        return f17611B.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7117i();
            case 2:
                return f17611B;
            case 3:
                this.f17617h.makeImmutable();
                this.f17622m.makeImmutable();
                this.f17630u.makeImmutable();
                return null;
            case 4:
                return new C7118a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7117i iVar = (C7117i) obj2;
                this.f17615f = visitor.visitString(!this.f17615f.isEmpty(), this.f17615f, !iVar.f17615f.isEmpty(), iVar.f17615f);
                this.f17616g = (C6818b) visitor.visitMessage(this.f17616g, iVar.f17616g);
                this.f17617h = visitor.visitList(this.f17617h, iVar.f17617h);
                this.f17618i = (PingProto$Ping2) visitor.visitMessage(this.f17618i, iVar.f17618i);
                this.f17619j = (Timestamp) visitor.visitMessage(this.f17619j, iVar.f17619j);
                this.f17620k = visitor.visitString(!this.f17620k.isEmpty(), this.f17620k, !iVar.f17620k.isEmpty(), iVar.f17620k);
                boolean z2 = this.f17621l;
                boolean z3 = iVar.f17621l;
                this.f17621l = visitor.visitBoolean(z2, z2, z3, z3);
                this.f17622m = visitor.visitList(this.f17622m, iVar.f17622m);
                boolean z4 = this.f17623n;
                boolean z5 = iVar.f17623n;
                this.f17623n = visitor.visitBoolean(z4, z4, z5, z5);
                boolean z6 = this.f17624o;
                boolean z7 = iVar.f17624o;
                this.f17624o = visitor.visitBoolean(z6, z6, z7, z7);
                boolean z8 = this.f17625p;
                boolean z9 = iVar.f17625p;
                this.f17625p = visitor.visitBoolean(z8, z8, z9, z9);
                this.f17626q = visitor.visitInt(this.f17626q != 0, this.f17626q, iVar.f17626q != 0, iVar.f17626q);
                this.f17627r = visitor.visitInt(this.f17627r != 0, this.f17627r, iVar.f17627r != 0, iVar.f17627r);
                this.f17628s = visitor.visitInt(this.f17628s != 0, this.f17628s, iVar.f17628s != 0, iVar.f17628s);
                boolean z10 = this.f17629t;
                boolean z11 = iVar.f17629t;
                this.f17629t = visitor.visitBoolean(z10, z10, z11, z11);
                this.f17630u = visitor.visitList(this.f17630u, iVar.f17630u);
                boolean z12 = this.f17631v != 0;
                int i = this.f17631v;
                if (iVar.f17631v != 0) {
                    z = true;
                }
                this.f17631v = visitor.visitInt(z12, i, z, iVar.f17631v);
                this.f17632w = (Timestamp) visitor.visitMessage(this.f17632w, iVar.f17632w);
                this.f17633x = visitor.visitString(!this.f17633x.isEmpty(), this.f17633x, !iVar.f17633x.isEmpty(), iVar.f17633x);
                this.f17634y = visitor.visitString(!this.f17634y.isEmpty(), this.f17634y, !iVar.f17634y.isEmpty(), iVar.f17634y);
                this.f17635z = visitor.visitString(!this.f17635z.isEmpty(), this.f17635z, !iVar.f17635z.isEmpty(), iVar.f17635z);
                this.f17613A = visitor.visitString(!this.f17613A.isEmpty(), this.f17613A, !iVar.f17613A.isEmpty(), iVar.f17613A);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17614e |= iVar.f17614e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.f17615f = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                Builder builder = this.f17616g != null ? (C6819a) this.f17616g.toBuilder() : null;
                                this.f17616g = (C6818b) codedInputStream.readMessage(C6818b.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f17616g);
                                    this.f17616g = (C6818b) builder.buildPartial();
                                    break;
                                }
                            case 26:
                                if (!this.f17617h.isModifiable()) {
                                    this.f17617h = GeneratedMessageLite.mutableCopy(this.f17617h);
                                }
                                this.f17617h.add(codedInputStream.readMessage(C6818b.parser(), extensionRegistryLite));
                                break;
                            case 34:
                                Builder builder2 = this.f17618i != null ? (C6823a) this.f17618i.toBuilder() : null;
                                this.f17618i = (PingProto$Ping2) codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f17618i);
                                    this.f17618i = (PingProto$Ping2) builder2.buildPartial();
                                    break;
                                }
                            case 42:
                                Builder builder3 = this.f17619j != null ? (Timestamp.Builder) this.f17619j.toBuilder() : null;
                                this.f17619j = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f17619j);
                                    this.f17619j = (Timestamp) builder3.buildPartial();
                                    break;
                                }
                            case 50:
                                this.f17620k = codedInputStream.readStringRequireUtf8();
                                break;
                            case 56:
                                this.f17621l = codedInputStream.readBool();
                                break;
                            case 66:
                                if (!this.f17622m.isModifiable()) {
                                    this.f17622m = GeneratedMessageLite.mutableCopy(this.f17622m);
                                }
                                this.f17622m.add(codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite));
                                break;
                            case 72:
                                this.f17623n = codedInputStream.readBool();
                                break;
                            case 80:
                                this.f17624o = codedInputStream.readBool();
                                break;
                            case 88:
                                this.f17626q = codedInputStream.readInt32();
                                break;
                            case 96:
                                this.f17627r = codedInputStream.readInt32();
                                break;
                            case 104:
                                this.f17628s = codedInputStream.readEnum();
                                break;
                            case 114:
                                this.f17633x = codedInputStream.readStringRequireUtf8();
                                break;
                            case 122:
                                this.f17634y = codedInputStream.readStringRequireUtf8();
                                break;
                            case 130:
                                this.f17635z = codedInputStream.readStringRequireUtf8();
                                break;
                            case 136:
                                this.f17629t = codedInputStream.readBool();
                                break;
                            case 146:
                                if (!this.f17630u.isModifiable()) {
                                    this.f17630u = GeneratedMessageLite.mutableCopy(this.f17630u);
                                }
                                this.f17630u.add(codedInputStream.readMessage(C7234v.parser(), extensionRegistryLite));
                                break;
                            case 154:
                                this.f17613A = codedInputStream.readStringRequireUtf8();
                                break;
                            case 160:
                                this.f17625p = codedInputStream.readBool();
                                break;
                            case 168:
                                this.f17631v = codedInputStream.readInt32();
                                break;
                            case 178:
                                Builder builder4 = this.f17632w != null ? (Timestamp.Builder) this.f17632w.toBuilder() : null;
                                this.f17632w = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder4 == null) {
                                    break;
                                } else {
                                    builder4.mergeFrom(this.f17632w);
                                    this.f17632w = (Timestamp) builder4.buildPartial();
                                    break;
                                }
                            default:
                                if (codedInputStream.skipField(readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
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
                if (f17612C == null) {
                    synchronized (C7117i.class) {
                        if (f17612C == null) {
                            f17612C = new DefaultInstanceBasedParser(f17611B);
                        }
                    }
                }
                return f17612C;
            default:
                throw new UnsupportedOperationException();
        }
        return f17611B;
    }

    public boolean getAsynCall() {
        return this.f17629t;
    }

    public UserProto$User getAvatars(int i) {
        return (UserProto$User) this.f17622m.get(i);
    }

    public int getAvatarsCount() {
        return this.f17622m.size();
    }

    public List<UserProto$User> getAvatarsList() {
        return this.f17622m;
    }

    public String getChatTip() {
        return this.f17635z;
    }

    public ByteString getChatTipBytes() {
        return ByteString.copyFromUtf8(this.f17635z);
    }

    public boolean getHasLeft() {
        return this.f17623n;
    }

    public boolean getHidden() {
        return this.f17625p;
    }

    public String getInboxUuid() {
        return this.f17620k;
    }

    public ByteString getInboxUuidBytes() {
        return ByteString.copyFromUtf8(this.f17620k);
    }

    public boolean getIsGroup() {
        return this.f17621l;
    }

    public PingProto$Ping2 getLastMessage() {
        PingProto$Ping2 pingProto$Ping2 = this.f17618i;
        return pingProto$Ping2 == null ? PingProto$Ping2.getDefaultInstance() : pingProto$Ping2;
    }

    public C7119b getLastMsgState() {
        C7119b a = C7119b.m17805a(this.f17628s);
        return a == null ? C7119b.UNRECOGNIZED : a;
    }

    public int getLastMsgStateValue() {
        return this.f17628s;
    }

    public Timestamp getLazyCreatedAt() {
        Timestamp timestamp = this.f17632w;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C6818b getMe() {
        C6818b bVar = this.f17616g;
        return bVar == null ? C6818b.getDefaultInstance() : bVar;
    }

    public Timestamp getModifiedAt() {
        Timestamp timestamp = this.f17619j;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean getMuted() {
        return this.f17624o;
    }

    public String getName() {
        return this.f17615f;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.f17615f);
    }

    public int getNbChat() {
        return this.f17627r;
    }

    public int getNbMediaFromReplyUnread() {
        return this.f17631v;
    }

    public int getNbPing() {
        return this.f17626q;
    }

    public C6818b getOthers(int i) {
        return (C6818b) this.f17617h.get(i);
    }

    public int getOthersCount() {
        return this.f17617h.size();
    }

    public List<C6818b> getOthersList() {
        return this.f17617h;
    }

    public String getPingCursor() {
        return this.f17633x;
    }

    public ByteString getPingCursorBytes() {
        return ByteString.copyFromUtf8(this.f17633x);
    }

    public String getPingTip() {
        return this.f17634y;
    }

    public ByteString getPingTipBytes() {
        return ByteString.copyFromUtf8(this.f17634y);
    }

    public String getRequestMediaCursor() {
        return this.f17613A;
    }

    public ByteString getRequestMediaCursorBytes() {
        return ByteString.copyFromUtf8(this.f17613A);
    }

    public C7234v getRequestMediaReceived(int i) {
        return (C7234v) this.f17630u.get(i);
    }

    public int getRequestMediaReceivedCount() {
        return this.f17630u.size();
    }

    public List<C7234v> getRequestMediaReceivedList() {
        return this.f17630u;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f17615f.isEmpty() ? CodedOutputStream.computeStringSize(1, getName()) + 0 : 0;
        if (this.f17616g != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, getMe());
        }
        int i2 = computeStringSize;
        for (int i3 = 0; i3 < this.f17617h.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f17617h.get(i3));
        }
        if (this.f17618i != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getLastMessage());
        }
        if (this.f17619j != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getModifiedAt());
        }
        if (!this.f17620k.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(6, getInboxUuid());
        }
        boolean z = this.f17621l;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(7, z);
        }
        for (int i4 = 0; i4 < this.f17622m.size(); i4++) {
            i2 += CodedOutputStream.computeMessageSize(8, (MessageLite) this.f17622m.get(i4));
        }
        boolean z2 = this.f17623n;
        if (z2) {
            i2 += CodedOutputStream.computeBoolSize(9, z2);
        }
        boolean z3 = this.f17624o;
        if (z3) {
            i2 += CodedOutputStream.computeBoolSize(10, z3);
        }
        int i5 = this.f17626q;
        if (i5 != 0) {
            i2 += CodedOutputStream.computeInt32Size(11, i5);
        }
        int i6 = this.f17627r;
        if (i6 != 0) {
            i2 += CodedOutputStream.computeInt32Size(12, i6);
        }
        if (this.f17628s != C7119b.LAST_MSG_STATE_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(13, this.f17628s);
        }
        if (!this.f17633x.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(14, getPingCursor());
        }
        if (!this.f17634y.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(15, getPingTip());
        }
        if (!this.f17635z.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(16, getChatTip());
        }
        boolean z4 = this.f17629t;
        if (z4) {
            i2 += CodedOutputStream.computeBoolSize(17, z4);
        }
        for (int i7 = 0; i7 < this.f17630u.size(); i7++) {
            i2 += CodedOutputStream.computeMessageSize(18, (MessageLite) this.f17630u.get(i7));
        }
        if (!this.f17613A.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(19, getRequestMediaCursor());
        }
        boolean z5 = this.f17625p;
        if (z5) {
            i2 += CodedOutputStream.computeBoolSize(20, z5);
        }
        int i8 = this.f17631v;
        if (i8 != 0) {
            i2 += CodedOutputStream.computeInt32Size(21, i8);
        }
        if (this.f17632w != null) {
            i2 += CodedOutputStream.computeMessageSize(22, getLazyCreatedAt());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasLastMessage() {
        return this.f17618i != null;
    }

    public boolean hasLazyCreatedAt() {
        return this.f17632w != null;
    }

    public boolean hasMe() {
        return this.f17616g != null;
    }

    public boolean hasModifiedAt() {
        return this.f17619j != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17615f.isEmpty()) {
            codedOutputStream.writeString(1, getName());
        }
        if (this.f17616g != null) {
            codedOutputStream.writeMessage(2, getMe());
        }
        for (int i = 0; i < this.f17617h.size(); i++) {
            codedOutputStream.writeMessage(3, (MessageLite) this.f17617h.get(i));
        }
        if (this.f17618i != null) {
            codedOutputStream.writeMessage(4, getLastMessage());
        }
        if (this.f17619j != null) {
            codedOutputStream.writeMessage(5, getModifiedAt());
        }
        if (!this.f17620k.isEmpty()) {
            codedOutputStream.writeString(6, getInboxUuid());
        }
        boolean z = this.f17621l;
        if (z) {
            codedOutputStream.writeBool(7, z);
        }
        for (int i2 = 0; i2 < this.f17622m.size(); i2++) {
            codedOutputStream.writeMessage(8, (MessageLite) this.f17622m.get(i2));
        }
        boolean z2 = this.f17623n;
        if (z2) {
            codedOutputStream.writeBool(9, z2);
        }
        boolean z3 = this.f17624o;
        if (z3) {
            codedOutputStream.writeBool(10, z3);
        }
        int i3 = this.f17626q;
        if (i3 != 0) {
            codedOutputStream.writeInt32(11, i3);
        }
        int i4 = this.f17627r;
        if (i4 != 0) {
            codedOutputStream.writeInt32(12, i4);
        }
        if (this.f17628s != C7119b.LAST_MSG_STATE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(13, this.f17628s);
        }
        if (!this.f17633x.isEmpty()) {
            codedOutputStream.writeString(14, getPingCursor());
        }
        if (!this.f17634y.isEmpty()) {
            codedOutputStream.writeString(15, getPingTip());
        }
        if (!this.f17635z.isEmpty()) {
            codedOutputStream.writeString(16, getChatTip());
        }
        boolean z4 = this.f17629t;
        if (z4) {
            codedOutputStream.writeBool(17, z4);
        }
        for (int i5 = 0; i5 < this.f17630u.size(); i5++) {
            codedOutputStream.writeMessage(18, (MessageLite) this.f17630u.get(i5));
        }
        if (!this.f17613A.isEmpty()) {
            codedOutputStream.writeString(19, getRequestMediaCursor());
        }
        boolean z5 = this.f17625p;
        if (z5) {
            codedOutputStream.writeBool(20, z5);
        }
        int i6 = this.f17631v;
        if (i6 != 0) {
            codedOutputStream.writeInt32(21, i6);
        }
        if (this.f17632w != null) {
            codedOutputStream.writeMessage(22, getLazyCreatedAt());
        }
    }
}
