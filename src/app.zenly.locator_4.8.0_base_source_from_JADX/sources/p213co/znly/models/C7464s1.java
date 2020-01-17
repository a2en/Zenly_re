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
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PingProto$Conversation.C6818b;

/* renamed from: co.znly.models.s1 */
public final class C7464s1 extends GeneratedMessageLite<C7464s1, C7465a> implements PingProto$ConversationUpdateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C7464s1 f18704l = new C7464s1();

    /* renamed from: m */
    private static volatile Parser<C7464s1> f18705m;

    /* renamed from: e */
    private int f18706e;

    /* renamed from: f */
    private int f18707f;

    /* renamed from: g */
    private String f18708g;

    /* renamed from: h */
    private ProtobufList<C6818b> f18709h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: i */
    private Timestamp f18710i;

    /* renamed from: j */
    private String f18711j;

    /* renamed from: k */
    private int f18712k;

    /* renamed from: co.znly.models.s1$a */
    public static final class C7465a extends Builder<C7464s1, C7465a> implements PingProto$ConversationUpdateOrBuilder {
        /* synthetic */ C7465a(C7383l1 l1Var) {
            this();
        }

        public int getBolt() {
            return ((C7464s1) this.instance).getBolt();
        }

        public String getConversationUuid() {
            return ((C7464s1) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C7464s1) this.instance).getConversationUuidBytes();
        }

        public String getGroupName() {
            return ((C7464s1) this.instance).getGroupName();
        }

        public ByteString getGroupNameBytes() {
            return ((C7464s1) this.instance).getGroupNameBytes();
        }

        public C6818b getMembers(int i) {
            return ((C7464s1) this.instance).getMembers(i);
        }

        public int getMembersCount() {
            return ((C7464s1) this.instance).getMembersCount();
        }

        public List<C6818b> getMembersList() {
            return Collections.unmodifiableList(((C7464s1) this.instance).getMembersList());
        }

        public Timestamp getUntil() {
            return ((C7464s1) this.instance).getUntil();
        }

        public C7466b getWhat() {
            return ((C7464s1) this.instance).getWhat();
        }

        public int getWhatValue() {
            return ((C7464s1) this.instance).getWhatValue();
        }

        public boolean hasUntil() {
            return ((C7464s1) this.instance).hasUntil();
        }

        private C7465a() {
            super(C7464s1.f18704l);
        }
    }

    /* renamed from: co.znly.models.s1$b */
    public enum C7466b implements EnumLite {
        UNKNOWN(0),
        ADD_MEMBERS(1),
        DEL_MEMBERS(2),
        MUTE(3),
        UNMUTE(4),
        RENAME(5),
        NEWBOLT(6),
        VALIDUNTIL(7),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f18723e;

        /* renamed from: co.znly.models.s1$b$a */
        class C7467a implements EnumLiteMap<C7466b> {
            C7467a() {
            }

            public C7466b findValueByNumber(int i) {
                return C7466b.m18106a(i);
            }
        }

        static {
            new C7467a();
        }

        private C7466b(int i) {
            this.f18723e = i;
        }

        /* renamed from: a */
        public static C7466b m18106a(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return ADD_MEMBERS;
                case 2:
                    return DEL_MEMBERS;
                case 3:
                    return MUTE;
                case 4:
                    return UNMUTE;
                case 5:
                    return RENAME;
                case 6:
                    return NEWBOLT;
                case 7:
                    return VALIDUNTIL;
                default:
                    return null;
            }
        }

        public final int getNumber() {
            return this.f18723e;
        }
    }

    static {
        f18704l.makeImmutable();
    }

    private C7464s1() {
        String str = "";
        this.f18708g = str;
        this.f18711j = str;
    }

    public static C7464s1 getDefaultInstance() {
        return f18704l;
    }

    public static Parser<C7464s1> parser() {
        return f18704l.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7464s1();
            case 2:
                return f18704l;
            case 3:
                this.f18709h.makeImmutable();
                return null;
            case 4:
                return new C7465a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7464s1 s1Var = (C7464s1) obj2;
                this.f18707f = visitor.visitInt(this.f18707f != 0, this.f18707f, s1Var.f18707f != 0, s1Var.f18707f);
                this.f18708g = visitor.visitString(!this.f18708g.isEmpty(), this.f18708g, !s1Var.f18708g.isEmpty(), s1Var.f18708g);
                this.f18709h = visitor.visitList(this.f18709h, s1Var.f18709h);
                this.f18710i = (Timestamp) visitor.visitMessage(this.f18710i, s1Var.f18710i);
                this.f18711j = visitor.visitString(!this.f18711j.isEmpty(), this.f18711j, !s1Var.f18711j.isEmpty(), s1Var.f18711j);
                boolean z2 = this.f18712k != 0;
                int i = this.f18712k;
                if (s1Var.f18712k != 0) {
                    z = true;
                }
                this.f18712k = visitor.visitInt(z2, i, z, s1Var.f18712k);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18706e |= s1Var.f18706e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f18707f = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                this.f18708g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                if (!this.f18709h.isModifiable()) {
                                    this.f18709h = GeneratedMessageLite.mutableCopy(this.f18709h);
                                }
                                this.f18709h.add(codedInputStream.readMessage(C6818b.parser(), extensionRegistryLite));
                            } else if (readTag == 34) {
                                Builder builder = this.f18710i != null ? (Timestamp.Builder) this.f18710i.toBuilder() : null;
                                this.f18710i = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18710i);
                                    this.f18710i = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 42) {
                                this.f18711j = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 48) {
                                this.f18712k = codedInputStream.readUInt32();
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
                if (f18705m == null) {
                    synchronized (C7464s1.class) {
                        if (f18705m == null) {
                            f18705m = new DefaultInstanceBasedParser(f18704l);
                        }
                    }
                }
                return f18705m;
            default:
                throw new UnsupportedOperationException();
        }
        return f18704l;
    }

    public int getBolt() {
        return this.f18712k;
    }

    public String getConversationUuid() {
        return this.f18708g;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f18708g);
    }

    public String getGroupName() {
        return this.f18711j;
    }

    public ByteString getGroupNameBytes() {
        return ByteString.copyFromUtf8(this.f18711j);
    }

    public C6818b getMembers(int i) {
        return (C6818b) this.f18709h.get(i);
    }

    public int getMembersCount() {
        return this.f18709h.size();
    }

    public List<C6818b> getMembersList() {
        return this.f18709h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeEnumSize = this.f18707f != C7466b.UNKNOWN.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f18707f) + 0 : 0;
        if (!this.f18708g.isEmpty()) {
            computeEnumSize += CodedOutputStream.computeStringSize(2, getConversationUuid());
        }
        for (int i2 = 0; i2 < this.f18709h.size(); i2++) {
            computeEnumSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f18709h.get(i2));
        }
        if (this.f18710i != null) {
            computeEnumSize += CodedOutputStream.computeMessageSize(4, getUntil());
        }
        if (!this.f18711j.isEmpty()) {
            computeEnumSize += CodedOutputStream.computeStringSize(5, getGroupName());
        }
        int i3 = this.f18712k;
        if (i3 != 0) {
            computeEnumSize += CodedOutputStream.computeUInt32Size(6, i3);
        }
        this.memoizedSerializedSize = computeEnumSize;
        return computeEnumSize;
    }

    public Timestamp getUntil() {
        Timestamp timestamp = this.f18710i;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C7466b getWhat() {
        C7466b a = C7466b.m18106a(this.f18707f);
        return a == null ? C7466b.UNRECOGNIZED : a;
    }

    public int getWhatValue() {
        return this.f18707f;
    }

    public boolean hasUntil() {
        return this.f18710i != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f18707f != C7466b.UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f18707f);
        }
        if (!this.f18708g.isEmpty()) {
            codedOutputStream.writeString(2, getConversationUuid());
        }
        for (int i = 0; i < this.f18709h.size(); i++) {
            codedOutputStream.writeMessage(3, (MessageLite) this.f18709h.get(i));
        }
        if (this.f18710i != null) {
            codedOutputStream.writeMessage(4, getUntil());
        }
        if (!this.f18711j.isEmpty()) {
            codedOutputStream.writeString(5, getGroupName());
        }
        int i2 = this.f18712k;
        if (i2 != 0) {
            codedOutputStream.writeUInt32(6, i2);
        }
    }
}
