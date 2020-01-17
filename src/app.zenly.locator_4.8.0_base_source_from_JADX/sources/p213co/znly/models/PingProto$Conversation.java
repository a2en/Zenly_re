package p213co.znly.models;

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
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PingProto$Ping2.C6823a;

/* renamed from: co.znly.models.PingProto$Conversation */
public final class PingProto$Conversation extends GeneratedMessageLite<PingProto$Conversation, C6817a> implements PingProto$ConversationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final PingProto$Conversation f16585p = new PingProto$Conversation();

    /* renamed from: q */
    private static volatile Parser<PingProto$Conversation> f16586q;

    /* renamed from: e */
    private int f16587e;

    /* renamed from: f */
    private String f16588f;

    /* renamed from: g */
    private String f16589g;

    /* renamed from: h */
    private PingProto$Ping2 f16590h;

    /* renamed from: i */
    private ProtobufList<C6818b> f16591i = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: j */
    private boolean f16592j;

    /* renamed from: k */
    private boolean f16593k;

    /* renamed from: l */
    private Timestamp f16594l;

    /* renamed from: m */
    private ProtobufList<PingProto$Ping2> f16595m = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: n */
    private Timestamp f16596n;

    /* renamed from: o */
    private String f16597o;

    /* renamed from: co.znly.models.PingProto$Conversation$MemberOrBuilder */
    public interface MemberOrBuilder extends MessageLiteOrBuilder {
        long getBolt();

        String getChatCursor();

        ByteString getChatCursorBytes();

        String getEmojiCursor();

        ByteString getEmojiCursorBytes();

        Timestamp getJoinedAt();

        Timestamp getLastBolt();

        Timestamp getLeftAt();

        String getNickname();

        ByteString getNicknameBytes();

        Timestamp getRequestValidUntil();

        long getSeq();

        String getUserUuid();

        ByteString getUserUuidBytes();

        boolean hasJoinedAt();

        boolean hasLastBolt();

        boolean hasLeftAt();

        boolean hasRequestValidUntil();
    }

    /* renamed from: co.znly.models.PingProto$Conversation$a */
    public static final class C6817a extends Builder<PingProto$Conversation, C6817a> implements PingProto$ConversationOrBuilder {
        /* synthetic */ C6817a(C7383l1 l1Var) {
            this();
        }

        public String getClientId() {
            return ((PingProto$Conversation) this.instance).getClientId();
        }

        public ByteString getClientIdBytes() {
            return ((PingProto$Conversation) this.instance).getClientIdBytes();
        }

        public boolean getIsGroup() {
            return ((PingProto$Conversation) this.instance).getIsGroup();
        }

        public Timestamp getLastEventAt() {
            return ((PingProto$Conversation) this.instance).getLastEventAt();
        }

        public PingProto$Ping2 getLastMessage() {
            return ((PingProto$Conversation) this.instance).getLastMessage();
        }

        public PingProto$Ping2 getLastPage(int i) {
            return ((PingProto$Conversation) this.instance).getLastPage(i);
        }

        public int getLastPageCount() {
            return ((PingProto$Conversation) this.instance).getLastPageCount();
        }

        public List<PingProto$Ping2> getLastPageList() {
            return Collections.unmodifiableList(((PingProto$Conversation) this.instance).getLastPageList());
        }

        public boolean getLeft() {
            return ((PingProto$Conversation) this.instance).getLeft();
        }

        public C6818b getMembers(int i) {
            return ((PingProto$Conversation) this.instance).getMembers(i);
        }

        public int getMembersCount() {
            return ((PingProto$Conversation) this.instance).getMembersCount();
        }

        public List<C6818b> getMembersList() {
            return Collections.unmodifiableList(((PingProto$Conversation) this.instance).getMembersList());
        }

        public Timestamp getMuteUntil() {
            return ((PingProto$Conversation) this.instance).getMuteUntil();
        }

        public String getName() {
            return ((PingProto$Conversation) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((PingProto$Conversation) this.instance).getNameBytes();
        }

        public String getUuid() {
            return ((PingProto$Conversation) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((PingProto$Conversation) this.instance).getUuidBytes();
        }

        public boolean hasLastEventAt() {
            return ((PingProto$Conversation) this.instance).hasLastEventAt();
        }

        public boolean hasLastMessage() {
            return ((PingProto$Conversation) this.instance).hasLastMessage();
        }

        public boolean hasMuteUntil() {
            return ((PingProto$Conversation) this.instance).hasMuteUntil();
        }

        private C6817a() {
            super(PingProto$Conversation.f16585p);
        }
    }

    /* renamed from: co.znly.models.PingProto$Conversation$b */
    public static final class C6818b extends GeneratedMessageLite<C6818b, C6819a> implements MemberOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: o */
        public static final C6818b f16598o = new C6818b();

        /* renamed from: p */
        private static volatile Parser<C6818b> f16599p;

        /* renamed from: e */
        private String f16600e;

        /* renamed from: f */
        private Timestamp f16601f;

        /* renamed from: g */
        private Timestamp f16602g;

        /* renamed from: h */
        private String f16603h;

        /* renamed from: i */
        private String f16604i;

        /* renamed from: j */
        private long f16605j;

        /* renamed from: k */
        private String f16606k;

        /* renamed from: l */
        private long f16607l;

        /* renamed from: m */
        private Timestamp f16608m;

        /* renamed from: n */
        private Timestamp f16609n;

        /* renamed from: co.znly.models.PingProto$Conversation$b$a */
        public static final class C6819a extends Builder<C6818b, C6819a> implements MemberOrBuilder {
            /* synthetic */ C6819a(C7383l1 l1Var) {
                this();
            }

            public long getBolt() {
                return ((C6818b) this.instance).getBolt();
            }

            public String getChatCursor() {
                return ((C6818b) this.instance).getChatCursor();
            }

            public ByteString getChatCursorBytes() {
                return ((C6818b) this.instance).getChatCursorBytes();
            }

            public String getEmojiCursor() {
                return ((C6818b) this.instance).getEmojiCursor();
            }

            public ByteString getEmojiCursorBytes() {
                return ((C6818b) this.instance).getEmojiCursorBytes();
            }

            public Timestamp getJoinedAt() {
                return ((C6818b) this.instance).getJoinedAt();
            }

            public Timestamp getLastBolt() {
                return ((C6818b) this.instance).getLastBolt();
            }

            public Timestamp getLeftAt() {
                return ((C6818b) this.instance).getLeftAt();
            }

            public String getNickname() {
                return ((C6818b) this.instance).getNickname();
            }

            public ByteString getNicknameBytes() {
                return ((C6818b) this.instance).getNicknameBytes();
            }

            public Timestamp getRequestValidUntil() {
                return ((C6818b) this.instance).getRequestValidUntil();
            }

            public long getSeq() {
                return ((C6818b) this.instance).getSeq();
            }

            public String getUserUuid() {
                return ((C6818b) this.instance).getUserUuid();
            }

            public ByteString getUserUuidBytes() {
                return ((C6818b) this.instance).getUserUuidBytes();
            }

            public boolean hasJoinedAt() {
                return ((C6818b) this.instance).hasJoinedAt();
            }

            public boolean hasLastBolt() {
                return ((C6818b) this.instance).hasLastBolt();
            }

            public boolean hasLeftAt() {
                return ((C6818b) this.instance).hasLeftAt();
            }

            public boolean hasRequestValidUntil() {
                return ((C6818b) this.instance).hasRequestValidUntil();
            }

            private C6819a() {
                super(C6818b.f16598o);
            }
        }

        static {
            f16598o.makeImmutable();
        }

        private C6818b() {
            String str = "";
            this.f16600e = str;
            this.f16603h = str;
            this.f16604i = str;
            this.f16606k = str;
        }

        public static C6818b getDefaultInstance() {
            return f16598o;
        }

        public static Parser<C6818b> parser() {
            return f16598o.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6818b();
                case 2:
                    return f16598o;
                case 3:
                    return null;
                case 4:
                    return new C6819a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6818b bVar = (C6818b) obj2;
                    this.f16600e = visitor.visitString(!this.f16600e.isEmpty(), this.f16600e, !bVar.f16600e.isEmpty(), bVar.f16600e);
                    this.f16601f = (Timestamp) visitor.visitMessage(this.f16601f, bVar.f16601f);
                    this.f16602g = (Timestamp) visitor.visitMessage(this.f16602g, bVar.f16602g);
                    this.f16603h = visitor.visitString(!this.f16603h.isEmpty(), this.f16603h, !bVar.f16603h.isEmpty(), bVar.f16603h);
                    this.f16604i = visitor.visitString(!this.f16604i.isEmpty(), this.f16604i, !bVar.f16604i.isEmpty(), bVar.f16604i);
                    this.f16605j = visitor.visitLong(this.f16605j != 0, this.f16605j, bVar.f16605j != 0, bVar.f16605j);
                    this.f16606k = visitor.visitString(!this.f16606k.isEmpty(), this.f16606k, !bVar.f16606k.isEmpty(), bVar.f16606k);
                    this.f16607l = visitor.visitLong(this.f16607l != 0, this.f16607l, bVar.f16607l != 0, bVar.f16607l);
                    this.f16608m = (Timestamp) visitor.visitMessage(this.f16608m, bVar.f16608m);
                    this.f16609n = (Timestamp) visitor.visitMessage(this.f16609n, bVar.f16609n);
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
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
                                    this.f16600e = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 26:
                                    Builder builder = this.f16601f != null ? (Timestamp.Builder) this.f16601f.toBuilder() : null;
                                    this.f16601f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder == null) {
                                        break;
                                    } else {
                                        builder.mergeFrom(this.f16601f);
                                        this.f16601f = (Timestamp) builder.buildPartial();
                                        break;
                                    }
                                case 34:
                                    Builder builder2 = this.f16602g != null ? (Timestamp.Builder) this.f16602g.toBuilder() : null;
                                    this.f16602g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder2 == null) {
                                        break;
                                    } else {
                                        builder2.mergeFrom(this.f16602g);
                                        this.f16602g = (Timestamp) builder2.buildPartial();
                                        break;
                                    }
                                case 42:
                                    this.f16603h = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 48:
                                    this.f16605j = codedInputStream.readInt64();
                                    break;
                                case 66:
                                    this.f16606k = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 80:
                                    this.f16607l = codedInputStream.readInt64();
                                    break;
                                case 90:
                                    Builder builder3 = this.f16608m != null ? (Timestamp.Builder) this.f16608m.toBuilder() : null;
                                    this.f16608m = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder3 == null) {
                                        break;
                                    } else {
                                        builder3.mergeFrom(this.f16608m);
                                        this.f16608m = (Timestamp) builder3.buildPartial();
                                        break;
                                    }
                                case 98:
                                    Builder builder4 = this.f16609n != null ? (Timestamp.Builder) this.f16609n.toBuilder() : null;
                                    this.f16609n = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder4 == null) {
                                        break;
                                    } else {
                                        builder4.mergeFrom(this.f16609n);
                                        this.f16609n = (Timestamp) builder4.buildPartial();
                                        break;
                                    }
                                case 106:
                                    this.f16604i = codedInputStream.readStringRequireUtf8();
                                    break;
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
                    if (f16599p == null) {
                        synchronized (C6818b.class) {
                            if (f16599p == null) {
                                f16599p = new DefaultInstanceBasedParser(f16598o);
                            }
                        }
                    }
                    return f16599p;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16598o;
        }

        public long getBolt() {
            return this.f16607l;
        }

        public String getChatCursor() {
            return this.f16603h;
        }

        public ByteString getChatCursorBytes() {
            return ByteString.copyFromUtf8(this.f16603h);
        }

        public String getEmojiCursor() {
            return this.f16604i;
        }

        public ByteString getEmojiCursorBytes() {
            return ByteString.copyFromUtf8(this.f16604i);
        }

        public Timestamp getJoinedAt() {
            Timestamp timestamp = this.f16601f;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp getLastBolt() {
            Timestamp timestamp = this.f16608m;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp getLeftAt() {
            Timestamp timestamp = this.f16602g;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public String getNickname() {
            return this.f16606k;
        }

        public ByteString getNicknameBytes() {
            return ByteString.copyFromUtf8(this.f16606k);
        }

        public Timestamp getRequestValidUntil() {
            Timestamp timestamp = this.f16609n;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public long getSeq() {
            return this.f16605j;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f16600e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getUserUuid());
            }
            if (this.f16601f != null) {
                i2 += CodedOutputStream.computeMessageSize(3, getJoinedAt());
            }
            if (this.f16602g != null) {
                i2 += CodedOutputStream.computeMessageSize(4, getLeftAt());
            }
            if (!this.f16603h.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(5, getChatCursor());
            }
            long j = this.f16605j;
            if (j != 0) {
                i2 += CodedOutputStream.computeInt64Size(6, j);
            }
            if (!this.f16606k.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(8, getNickname());
            }
            long j2 = this.f16607l;
            if (j2 != 0) {
                i2 += CodedOutputStream.computeInt64Size(10, j2);
            }
            if (this.f16608m != null) {
                i2 += CodedOutputStream.computeMessageSize(11, getLastBolt());
            }
            if (this.f16609n != null) {
                i2 += CodedOutputStream.computeMessageSize(12, getRequestValidUntil());
            }
            if (!this.f16604i.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(13, getEmojiCursor());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String getUserUuid() {
            return this.f16600e;
        }

        public ByteString getUserUuidBytes() {
            return ByteString.copyFromUtf8(this.f16600e);
        }

        public boolean hasJoinedAt() {
            return this.f16601f != null;
        }

        public boolean hasLastBolt() {
            return this.f16608m != null;
        }

        public boolean hasLeftAt() {
            return this.f16602g != null;
        }

        public boolean hasRequestValidUntil() {
            return this.f16609n != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f16600e.isEmpty()) {
                codedOutputStream.writeString(1, getUserUuid());
            }
            if (this.f16601f != null) {
                codedOutputStream.writeMessage(3, getJoinedAt());
            }
            if (this.f16602g != null) {
                codedOutputStream.writeMessage(4, getLeftAt());
            }
            if (!this.f16603h.isEmpty()) {
                codedOutputStream.writeString(5, getChatCursor());
            }
            long j = this.f16605j;
            if (j != 0) {
                codedOutputStream.writeInt64(6, j);
            }
            if (!this.f16606k.isEmpty()) {
                codedOutputStream.writeString(8, getNickname());
            }
            long j2 = this.f16607l;
            if (j2 != 0) {
                codedOutputStream.writeInt64(10, j2);
            }
            if (this.f16608m != null) {
                codedOutputStream.writeMessage(11, getLastBolt());
            }
            if (this.f16609n != null) {
                codedOutputStream.writeMessage(12, getRequestValidUntil());
            }
            if (!this.f16604i.isEmpty()) {
                codedOutputStream.writeString(13, getEmojiCursor());
            }
        }
    }

    static {
        f16585p.makeImmutable();
    }

    private PingProto$Conversation() {
        String str = "";
        this.f16588f = str;
        this.f16589g = str;
        this.f16597o = str;
    }

    public static PingProto$Conversation getDefaultInstance() {
        return f16585p;
    }

    public static Parser<PingProto$Conversation> parser() {
        return f16585p.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
            case 1:
                return new PingProto$Conversation();
            case 2:
                return f16585p;
            case 3:
                this.f16591i.makeImmutable();
                this.f16595m.makeImmutable();
                return null;
            case 4:
                return new C6817a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                PingProto$Conversation pingProto$Conversation = (PingProto$Conversation) obj2;
                this.f16588f = visitor.visitString(!this.f16588f.isEmpty(), this.f16588f, !pingProto$Conversation.f16588f.isEmpty(), pingProto$Conversation.f16588f);
                this.f16589g = visitor.visitString(!this.f16589g.isEmpty(), this.f16589g, !pingProto$Conversation.f16589g.isEmpty(), pingProto$Conversation.f16589g);
                this.f16590h = (PingProto$Ping2) visitor.visitMessage(this.f16590h, pingProto$Conversation.f16590h);
                this.f16591i = visitor.visitList(this.f16591i, pingProto$Conversation.f16591i);
                boolean z = this.f16592j;
                boolean z2 = pingProto$Conversation.f16592j;
                this.f16592j = visitor.visitBoolean(z, z, z2, z2);
                boolean z3 = this.f16593k;
                boolean z4 = pingProto$Conversation.f16593k;
                this.f16593k = visitor.visitBoolean(z3, z3, z4, z4);
                this.f16594l = (Timestamp) visitor.visitMessage(this.f16594l, pingProto$Conversation.f16594l);
                this.f16595m = visitor.visitList(this.f16595m, pingProto$Conversation.f16595m);
                this.f16596n = (Timestamp) visitor.visitMessage(this.f16596n, pingProto$Conversation.f16596n);
                this.f16597o = visitor.visitString(!this.f16597o.isEmpty(), this.f16597o, true ^ pingProto$Conversation.f16597o.isEmpty(), pingProto$Conversation.f16597o);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f16587e |= pingProto$Conversation.f16587e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z5 = false;
                while (!z5) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z5 = true;
                                break;
                            case 10:
                                this.f16588f = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                this.f16589g = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                Builder builder = this.f16590h != null ? (C6823a) this.f16590h.toBuilder() : null;
                                this.f16590h = (PingProto$Ping2) codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f16590h);
                                    this.f16590h = (PingProto$Ping2) builder.buildPartial();
                                    break;
                                }
                            case 42:
                                if (!this.f16591i.isModifiable()) {
                                    this.f16591i = GeneratedMessageLite.mutableCopy(this.f16591i);
                                }
                                this.f16591i.add(codedInputStream.readMessage(C6818b.parser(), extensionRegistryLite));
                                break;
                            case 56:
                                this.f16592j = codedInputStream.readBool();
                                break;
                            case 64:
                                this.f16593k = codedInputStream.readBool();
                                break;
                            case 74:
                                Builder builder2 = this.f16594l != null ? (Timestamp.Builder) this.f16594l.toBuilder() : null;
                                this.f16594l = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f16594l);
                                    this.f16594l = (Timestamp) builder2.buildPartial();
                                    break;
                                }
                            case 82:
                                if (!this.f16595m.isModifiable()) {
                                    this.f16595m = GeneratedMessageLite.mutableCopy(this.f16595m);
                                }
                                this.f16595m.add(codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite));
                                break;
                            case 90:
                                Builder builder3 = this.f16596n != null ? (Timestamp.Builder) this.f16596n.toBuilder() : null;
                                this.f16596n = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f16596n);
                                    this.f16596n = (Timestamp) builder3.buildPartial();
                                    break;
                                }
                            case 98:
                                this.f16597o = codedInputStream.readStringRequireUtf8();
                                break;
                            default:
                                if (codedInputStream.skipField(readTag)) {
                                    break;
                                }
                                z5 = true;
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
                if (f16586q == null) {
                    synchronized (PingProto$Conversation.class) {
                        if (f16586q == null) {
                            f16586q = new DefaultInstanceBasedParser(f16585p);
                        }
                    }
                }
                return f16586q;
            default:
                throw new UnsupportedOperationException();
        }
        return f16585p;
    }

    public String getClientId() {
        return this.f16597o;
    }

    public ByteString getClientIdBytes() {
        return ByteString.copyFromUtf8(this.f16597o);
    }

    public boolean getIsGroup() {
        return this.f16592j;
    }

    public Timestamp getLastEventAt() {
        Timestamp timestamp = this.f16596n;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public PingProto$Ping2 getLastMessage() {
        PingProto$Ping2 pingProto$Ping2 = this.f16590h;
        return pingProto$Ping2 == null ? PingProto$Ping2.getDefaultInstance() : pingProto$Ping2;
    }

    public PingProto$Ping2 getLastPage(int i) {
        return (PingProto$Ping2) this.f16595m.get(i);
    }

    public int getLastPageCount() {
        return this.f16595m.size();
    }

    public List<PingProto$Ping2> getLastPageList() {
        return this.f16595m;
    }

    public boolean getLeft() {
        return this.f16593k;
    }

    public C6818b getMembers(int i) {
        return (C6818b) this.f16591i.get(i);
    }

    public int getMembersCount() {
        return this.f16591i.size();
    }

    public List<C6818b> getMembersList() {
        return this.f16591i;
    }

    public Timestamp getMuteUntil() {
        Timestamp timestamp = this.f16594l;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getName() {
        return this.f16589g;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.f16589g);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f16588f.isEmpty() ? CodedOutputStream.computeStringSize(1, getUuid()) + 0 : 0;
        if (!this.f16589g.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(2, getName());
        }
        if (this.f16590h != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(4, getLastMessage());
        }
        int i2 = computeStringSize;
        for (int i3 = 0; i3 < this.f16591i.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f16591i.get(i3));
        }
        boolean z = this.f16592j;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(7, z);
        }
        boolean z2 = this.f16593k;
        if (z2) {
            i2 += CodedOutputStream.computeBoolSize(8, z2);
        }
        if (this.f16594l != null) {
            i2 += CodedOutputStream.computeMessageSize(9, getMuteUntil());
        }
        for (int i4 = 0; i4 < this.f16595m.size(); i4++) {
            i2 += CodedOutputStream.computeMessageSize(10, (MessageLite) this.f16595m.get(i4));
        }
        if (this.f16596n != null) {
            i2 += CodedOutputStream.computeMessageSize(11, getLastEventAt());
        }
        if (!this.f16597o.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(12, getClientId());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUuid() {
        return this.f16588f;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f16588f);
    }

    public boolean hasLastEventAt() {
        return this.f16596n != null;
    }

    public boolean hasLastMessage() {
        return this.f16590h != null;
    }

    public boolean hasMuteUntil() {
        return this.f16594l != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f16588f.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (!this.f16589g.isEmpty()) {
            codedOutputStream.writeString(2, getName());
        }
        if (this.f16590h != null) {
            codedOutputStream.writeMessage(4, getLastMessage());
        }
        for (int i = 0; i < this.f16591i.size(); i++) {
            codedOutputStream.writeMessage(5, (MessageLite) this.f16591i.get(i));
        }
        boolean z = this.f16592j;
        if (z) {
            codedOutputStream.writeBool(7, z);
        }
        boolean z2 = this.f16593k;
        if (z2) {
            codedOutputStream.writeBool(8, z2);
        }
        if (this.f16594l != null) {
            codedOutputStream.writeMessage(9, getMuteUntil());
        }
        for (int i2 = 0; i2 < this.f16595m.size(); i2++) {
            codedOutputStream.writeMessage(10, (MessageLite) this.f16595m.get(i2));
        }
        if (this.f16596n != null) {
            codedOutputStream.writeMessage(11, getLastEventAt());
        }
        if (!this.f16597o.isEmpty()) {
            codedOutputStream.writeString(12, getClientId());
        }
    }
}
