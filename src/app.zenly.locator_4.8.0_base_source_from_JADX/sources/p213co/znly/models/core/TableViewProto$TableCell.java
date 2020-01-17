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
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C6980c3;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7434p;
import p213co.znly.models.C7464s1;
import p213co.znly.models.C7464s1.C7465a;
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.PingProto$Conversation;
import p213co.znly.models.PingProto$Conversation.C6817a;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.core.TableViewProto$TableCell */
public final class TableViewProto$TableCell extends GeneratedMessageLite<TableViewProto$TableCell, C7040a> implements TableViewProto$TableCellOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final TableViewProto$TableCell f17404t = new TableViewProto$TableCell();

    /* renamed from: u */
    private static volatile Parser<TableViewProto$TableCell> f17405u;

    /* renamed from: e */
    private int f17406e;

    /* renamed from: f */
    private String f17407f = "";

    /* renamed from: g */
    private ProtobufList<UserProto$User> f17408g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: h */
    private PingProto$Conversation f17409h;

    /* renamed from: i */
    private C7464s1 f17410i;

    /* renamed from: j */
    private ProtobufList<C7339i> f17411j = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: k */
    private ProtobufList<C6980c3> f17412k = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: l */
    private ProtobufList<FriendRequestProto$FriendRequest> f17413l = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: m */
    private int f17414m;

    /* renamed from: n */
    private int f17415n;

    /* renamed from: o */
    private int f17416o;

    /* renamed from: p */
    private ProtobufList<C7041b> f17417p = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: q */
    private int f17418q;

    /* renamed from: r */
    private int f17419r;

    /* renamed from: s */
    private ProtobufList<C7434p> f17420s = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.TableViewProto$TableCell$TopScoreOrBuilder */
    public interface TopScoreOrBuilder extends MessageLiteOrBuilder {
        double getScore();

        String getUuid();

        ByteString getUuidBytes();
    }

    /* renamed from: co.znly.models.core.TableViewProto$TableCell$a */
    public static final class C7040a extends Builder<TableViewProto$TableCell, C7040a> implements TableViewProto$TableCellOrBuilder {
        /* synthetic */ C7040a(C7198q1 q1Var) {
            this();
        }

        public int getChatUnreadCount() {
            return ((TableViewProto$TableCell) this.instance).getChatUnreadCount();
        }

        public C7339i getContacts(int i) {
            return ((TableViewProto$TableCell) this.instance).getContacts(i);
        }

        public int getContactsCount() {
            return ((TableViewProto$TableCell) this.instance).getContactsCount();
        }

        public List<C7339i> getContactsList() {
            return Collections.unmodifiableList(((TableViewProto$TableCell) this.instance).getContactsList());
        }

        public PingProto$Conversation getConversation() {
            return ((TableViewProto$TableCell) this.instance).getConversation();
        }

        public C7464s1 getConversationUpdate() {
            return ((TableViewProto$TableCell) this.instance).getConversationUpdate();
        }

        public FriendRequestProto$FriendRequest getFriendRequests(int i) {
            return ((TableViewProto$TableCell) this.instance).getFriendRequests(i);
        }

        public int getFriendRequestsCount() {
            return ((TableViewProto$TableCell) this.instance).getFriendRequestsCount();
        }

        public List<FriendRequestProto$FriendRequest> getFriendRequestsList() {
            return Collections.unmodifiableList(((TableViewProto$TableCell) this.instance).getFriendRequestsList());
        }

        public C6980c3 getFriendships(int i) {
            return ((TableViewProto$TableCell) this.instance).getFriendships(i);
        }

        public int getFriendshipsCount() {
            return ((TableViewProto$TableCell) this.instance).getFriendshipsCount();
        }

        public List<C6980c3> getFriendshipsList() {
            return Collections.unmodifiableList(((TableViewProto$TableCell) this.instance).getFriendshipsList());
        }

        public int getPageRank() {
            return ((TableViewProto$TableCell) this.instance).getPageRank();
        }

        public int getPingUnreadCount() {
            return ((TableViewProto$TableCell) this.instance).getPingUnreadCount();
        }

        public int getPotentialFriendsCount() {
            return ((TableViewProto$TableCell) this.instance).getPotentialFriendsCount();
        }

        public C7213s1 getState() {
            return ((TableViewProto$TableCell) this.instance).getState();
        }

        public int getStateValue() {
            return ((TableViewProto$TableCell) this.instance).getStateValue();
        }

        public C7434p getSuggestedUsers(int i) {
            return ((TableViewProto$TableCell) this.instance).getSuggestedUsers(i);
        }

        public int getSuggestedUsersCount() {
            return ((TableViewProto$TableCell) this.instance).getSuggestedUsersCount();
        }

        public List<C7434p> getSuggestedUsersList() {
            return Collections.unmodifiableList(((TableViewProto$TableCell) this.instance).getSuggestedUsersList());
        }

        public C7041b getTopScoring(int i) {
            return ((TableViewProto$TableCell) this.instance).getTopScoring(i);
        }

        public int getTopScoringCount() {
            return ((TableViewProto$TableCell) this.instance).getTopScoringCount();
        }

        public List<C7041b> getTopScoringList() {
            return Collections.unmodifiableList(((TableViewProto$TableCell) this.instance).getTopScoringList());
        }

        public UserProto$User getUsers(int i) {
            return ((TableViewProto$TableCell) this.instance).getUsers(i);
        }

        public int getUsersCount() {
            return ((TableViewProto$TableCell) this.instance).getUsersCount();
        }

        public List<UserProto$User> getUsersList() {
            return Collections.unmodifiableList(((TableViewProto$TableCell) this.instance).getUsersList());
        }

        public String getUuid() {
            return ((TableViewProto$TableCell) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((TableViewProto$TableCell) this.instance).getUuidBytes();
        }

        public boolean hasConversation() {
            return ((TableViewProto$TableCell) this.instance).hasConversation();
        }

        public boolean hasConversationUpdate() {
            return ((TableViewProto$TableCell) this.instance).hasConversationUpdate();
        }

        private C7040a() {
            super(TableViewProto$TableCell.f17404t);
        }
    }

    /* renamed from: co.znly.models.core.TableViewProto$TableCell$b */
    public static final class C7041b extends GeneratedMessageLite<C7041b, C7042a> implements TopScoreOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C7041b f17421g = new C7041b();

        /* renamed from: h */
        private static volatile Parser<C7041b> f17422h;

        /* renamed from: e */
        private String f17423e = "";

        /* renamed from: f */
        private double f17424f;

        /* renamed from: co.znly.models.core.TableViewProto$TableCell$b$a */
        public static final class C7042a extends Builder<C7041b, C7042a> implements TopScoreOrBuilder {
            /* synthetic */ C7042a(C7198q1 q1Var) {
                this();
            }

            public double getScore() {
                return ((C7041b) this.instance).getScore();
            }

            public String getUuid() {
                return ((C7041b) this.instance).getUuid();
            }

            public ByteString getUuidBytes() {
                return ((C7041b) this.instance).getUuidBytes();
            }

            private C7042a() {
                super(C7041b.f17421g);
            }
        }

        static {
            f17421g.makeImmutable();
        }

        private C7041b() {
        }

        public static Parser<C7041b> parser() {
            return f17421g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7198q1.f17838a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7041b();
                case 2:
                    return f17421g;
                case 3:
                    return null;
                case 4:
                    return new C7042a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7041b bVar = (C7041b) obj2;
                    this.f17423e = visitor.visitString(!this.f17423e.isEmpty(), this.f17423e, !bVar.f17423e.isEmpty(), bVar.f17423e);
                    this.f17424f = visitor.visitDouble(this.f17424f != 0.0d, this.f17424f, bVar.f17424f != 0.0d, bVar.f17424f);
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.f17423e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 17) {
                                    this.f17424f = codedInputStream.readDouble();
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
                    if (f17422h == null) {
                        synchronized (C7041b.class) {
                            if (f17422h == null) {
                                f17422h = new DefaultInstanceBasedParser(f17421g);
                            }
                        }
                    }
                    return f17422h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17421g;
        }

        public double getScore() {
            return this.f17424f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f17423e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getUuid());
            }
            double d = this.f17424f;
            if (d != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(2, d);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String getUuid() {
            return this.f17423e;
        }

        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.f17423e);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f17423e.isEmpty()) {
                codedOutputStream.writeString(1, getUuid());
            }
            double d = this.f17424f;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(2, d);
            }
        }
    }

    static {
        f17404t.makeImmutable();
    }

    private TableViewProto$TableCell() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7198q1.f17838a[methodToInvoke.ordinal()]) {
            case 1:
                return new TableViewProto$TableCell();
            case 2:
                return f17404t;
            case 3:
                this.f17408g.makeImmutable();
                this.f17411j.makeImmutable();
                this.f17412k.makeImmutable();
                this.f17413l.makeImmutable();
                this.f17417p.makeImmutable();
                this.f17420s.makeImmutable();
                return null;
            case 4:
                return new C7040a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                TableViewProto$TableCell tableViewProto$TableCell = (TableViewProto$TableCell) obj2;
                this.f17407f = visitor.visitString(!this.f17407f.isEmpty(), this.f17407f, !tableViewProto$TableCell.f17407f.isEmpty(), tableViewProto$TableCell.f17407f);
                this.f17408g = visitor.visitList(this.f17408g, tableViewProto$TableCell.f17408g);
                this.f17409h = (PingProto$Conversation) visitor.visitMessage(this.f17409h, tableViewProto$TableCell.f17409h);
                this.f17410i = (C7464s1) visitor.visitMessage(this.f17410i, tableViewProto$TableCell.f17410i);
                this.f17411j = visitor.visitList(this.f17411j, tableViewProto$TableCell.f17411j);
                this.f17412k = visitor.visitList(this.f17412k, tableViewProto$TableCell.f17412k);
                this.f17413l = visitor.visitList(this.f17413l, tableViewProto$TableCell.f17413l);
                this.f17414m = visitor.visitInt(this.f17414m != 0, this.f17414m, tableViewProto$TableCell.f17414m != 0, tableViewProto$TableCell.f17414m);
                this.f17415n = visitor.visitInt(this.f17415n != 0, this.f17415n, tableViewProto$TableCell.f17415n != 0, tableViewProto$TableCell.f17415n);
                this.f17416o = visitor.visitInt(this.f17416o != 0, this.f17416o, tableViewProto$TableCell.f17416o != 0, tableViewProto$TableCell.f17416o);
                this.f17417p = visitor.visitList(this.f17417p, tableViewProto$TableCell.f17417p);
                this.f17418q = visitor.visitInt(this.f17418q != 0, this.f17418q, tableViewProto$TableCell.f17418q != 0, tableViewProto$TableCell.f17418q);
                boolean z2 = this.f17419r != 0;
                int i = this.f17419r;
                if (tableViewProto$TableCell.f17419r != 0) {
                    z = true;
                }
                this.f17419r = visitor.visitInt(z2, i, z, tableViewProto$TableCell.f17419r);
                this.f17420s = visitor.visitList(this.f17420s, tableViewProto$TableCell.f17420s);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17406e |= tableViewProto$TableCell.f17406e;
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
                                this.f17407f = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                if (!this.f17408g.isModifiable()) {
                                    this.f17408g = GeneratedMessageLite.mutableCopy(this.f17408g);
                                }
                                this.f17408g.add(codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite));
                                break;
                            case 26:
                                Builder builder = this.f17409h != null ? (C6817a) this.f17409h.toBuilder() : null;
                                this.f17409h = (PingProto$Conversation) codedInputStream.readMessage(PingProto$Conversation.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f17409h);
                                    this.f17409h = (PingProto$Conversation) builder.buildPartial();
                                    break;
                                }
                            case 34:
                                if (!this.f17411j.isModifiable()) {
                                    this.f17411j = GeneratedMessageLite.mutableCopy(this.f17411j);
                                }
                                this.f17411j.add(codedInputStream.readMessage(C7339i.parser(), extensionRegistryLite));
                                break;
                            case 42:
                                if (!this.f17412k.isModifiable()) {
                                    this.f17412k = GeneratedMessageLite.mutableCopy(this.f17412k);
                                }
                                this.f17412k.add(codedInputStream.readMessage(C6980c3.parser(), extensionRegistryLite));
                                break;
                            case 50:
                                if (!this.f17413l.isModifiable()) {
                                    this.f17413l = GeneratedMessageLite.mutableCopy(this.f17413l);
                                }
                                this.f17413l.add(codedInputStream.readMessage(FriendRequestProto$FriendRequest.parser(), extensionRegistryLite));
                                break;
                            case 56:
                                this.f17414m = codedInputStream.readInt32();
                                break;
                            case 64:
                                this.f17415n = codedInputStream.readInt32();
                                break;
                            case 72:
                                this.f17416o = codedInputStream.readInt32();
                                break;
                            case 82:
                                if (!this.f17417p.isModifiable()) {
                                    this.f17417p = GeneratedMessageLite.mutableCopy(this.f17417p);
                                }
                                this.f17417p.add(codedInputStream.readMessage(C7041b.parser(), extensionRegistryLite));
                                break;
                            case 88:
                                this.f17418q = codedInputStream.readEnum();
                                break;
                            case 98:
                                Builder builder2 = this.f17410i != null ? (C7465a) this.f17410i.toBuilder() : null;
                                this.f17410i = (C7464s1) codedInputStream.readMessage(C7464s1.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f17410i);
                                    this.f17410i = (C7464s1) builder2.buildPartial();
                                    break;
                                }
                            case 104:
                                this.f17419r = codedInputStream.readInt32();
                                break;
                            case 114:
                                if (!this.f17420s.isModifiable()) {
                                    this.f17420s = GeneratedMessageLite.mutableCopy(this.f17420s);
                                }
                                this.f17420s.add(codedInputStream.readMessage(C7434p.parser(), extensionRegistryLite));
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
                if (f17405u == null) {
                    synchronized (TableViewProto$TableCell.class) {
                        if (f17405u == null) {
                            f17405u = new DefaultInstanceBasedParser(f17404t);
                        }
                    }
                }
                return f17405u;
            default:
                throw new UnsupportedOperationException();
        }
        return f17404t;
    }

    public int getChatUnreadCount() {
        return this.f17416o;
    }

    public C7339i getContacts(int i) {
        return (C7339i) this.f17411j.get(i);
    }

    public int getContactsCount() {
        return this.f17411j.size();
    }

    public List<C7339i> getContactsList() {
        return this.f17411j;
    }

    public PingProto$Conversation getConversation() {
        PingProto$Conversation pingProto$Conversation = this.f17409h;
        return pingProto$Conversation == null ? PingProto$Conversation.getDefaultInstance() : pingProto$Conversation;
    }

    public C7464s1 getConversationUpdate() {
        C7464s1 s1Var = this.f17410i;
        return s1Var == null ? C7464s1.getDefaultInstance() : s1Var;
    }

    public FriendRequestProto$FriendRequest getFriendRequests(int i) {
        return (FriendRequestProto$FriendRequest) this.f17413l.get(i);
    }

    public int getFriendRequestsCount() {
        return this.f17413l.size();
    }

    public List<FriendRequestProto$FriendRequest> getFriendRequestsList() {
        return this.f17413l;
    }

    public C6980c3 getFriendships(int i) {
        return (C6980c3) this.f17412k.get(i);
    }

    public int getFriendshipsCount() {
        return this.f17412k.size();
    }

    public List<C6980c3> getFriendshipsList() {
        return this.f17412k;
    }

    public int getPageRank() {
        return this.f17419r;
    }

    public int getPingUnreadCount() {
        return this.f17415n;
    }

    public int getPotentialFriendsCount() {
        return this.f17414m;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f17407f.isEmpty() ? CodedOutputStream.computeStringSize(1, getUuid()) + 0 : 0;
        for (int i2 = 0; i2 < this.f17408g.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f17408g.get(i2));
        }
        if (this.f17409h != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(3, getConversation());
        }
        for (int i3 = 0; i3 < this.f17411j.size(); i3++) {
            computeStringSize += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f17411j.get(i3));
        }
        for (int i4 = 0; i4 < this.f17412k.size(); i4++) {
            computeStringSize += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f17412k.get(i4));
        }
        for (int i5 = 0; i5 < this.f17413l.size(); i5++) {
            computeStringSize += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f17413l.get(i5));
        }
        int i6 = this.f17414m;
        if (i6 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(7, i6);
        }
        int i7 = this.f17415n;
        if (i7 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(8, i7);
        }
        int i8 = this.f17416o;
        if (i8 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(9, i8);
        }
        for (int i9 = 0; i9 < this.f17417p.size(); i9++) {
            computeStringSize += CodedOutputStream.computeMessageSize(10, (MessageLite) this.f17417p.get(i9));
        }
        if (this.f17418q != C7213s1.NONE.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(11, this.f17418q);
        }
        if (this.f17410i != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(12, getConversationUpdate());
        }
        int i10 = this.f17419r;
        if (i10 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(13, i10);
        }
        for (int i11 = 0; i11 < this.f17420s.size(); i11++) {
            computeStringSize += CodedOutputStream.computeMessageSize(14, (MessageLite) this.f17420s.get(i11));
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public C7213s1 getState() {
        C7213s1 a = C7213s1.m17952a(this.f17418q);
        return a == null ? C7213s1.UNRECOGNIZED : a;
    }

    public int getStateValue() {
        return this.f17418q;
    }

    public C7434p getSuggestedUsers(int i) {
        return (C7434p) this.f17420s.get(i);
    }

    public int getSuggestedUsersCount() {
        return this.f17420s.size();
    }

    public List<C7434p> getSuggestedUsersList() {
        return this.f17420s;
    }

    public C7041b getTopScoring(int i) {
        return (C7041b) this.f17417p.get(i);
    }

    public int getTopScoringCount() {
        return this.f17417p.size();
    }

    public List<C7041b> getTopScoringList() {
        return this.f17417p;
    }

    public UserProto$User getUsers(int i) {
        return (UserProto$User) this.f17408g.get(i);
    }

    public int getUsersCount() {
        return this.f17408g.size();
    }

    public List<UserProto$User> getUsersList() {
        return this.f17408g;
    }

    public String getUuid() {
        return this.f17407f;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f17407f);
    }

    public boolean hasConversation() {
        return this.f17409h != null;
    }

    public boolean hasConversationUpdate() {
        return this.f17410i != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17407f.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        for (int i = 0; i < this.f17408g.size(); i++) {
            codedOutputStream.writeMessage(2, (MessageLite) this.f17408g.get(i));
        }
        if (this.f17409h != null) {
            codedOutputStream.writeMessage(3, getConversation());
        }
        for (int i2 = 0; i2 < this.f17411j.size(); i2++) {
            codedOutputStream.writeMessage(4, (MessageLite) this.f17411j.get(i2));
        }
        for (int i3 = 0; i3 < this.f17412k.size(); i3++) {
            codedOutputStream.writeMessage(5, (MessageLite) this.f17412k.get(i3));
        }
        for (int i4 = 0; i4 < this.f17413l.size(); i4++) {
            codedOutputStream.writeMessage(6, (MessageLite) this.f17413l.get(i4));
        }
        int i5 = this.f17414m;
        if (i5 != 0) {
            codedOutputStream.writeInt32(7, i5);
        }
        int i6 = this.f17415n;
        if (i6 != 0) {
            codedOutputStream.writeInt32(8, i6);
        }
        int i7 = this.f17416o;
        if (i7 != 0) {
            codedOutputStream.writeInt32(9, i7);
        }
        for (int i8 = 0; i8 < this.f17417p.size(); i8++) {
            codedOutputStream.writeMessage(10, (MessageLite) this.f17417p.get(i8));
        }
        if (this.f17418q != C7213s1.NONE.getNumber()) {
            codedOutputStream.writeEnum(11, this.f17418q);
        }
        if (this.f17410i != null) {
            codedOutputStream.writeMessage(12, getConversationUpdate());
        }
        int i9 = this.f17419r;
        if (i9 != 0) {
            codedOutputStream.writeInt32(13, i9);
        }
        for (int i10 = 0; i10 < this.f17420s.size(); i10++) {
            codedOutputStream.writeMessage(14, (MessageLite) this.f17420s.get(i10));
        }
    }
}
