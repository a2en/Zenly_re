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
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C6950b0.C6951a;

/* renamed from: co.znly.models.FriendRequestProto$FriendRequest */
public final class FriendRequestProto$FriendRequest extends GeneratedMessageLite<FriendRequestProto$FriendRequest, C6809a> implements FriendRequestProto$FriendRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final FriendRequestProto$FriendRequest f16501y = new FriendRequestProto$FriendRequest();

    /* renamed from: z */
    private static volatile Parser<FriendRequestProto$FriendRequest> f16502z;

    /* renamed from: e */
    private int f16503e;

    /* renamed from: f */
    private String f16504f;

    /* renamed from: g */
    private Timestamp f16505g;

    /* renamed from: h */
    private Timestamp f16506h;

    /* renamed from: i */
    private String f16507i;

    /* renamed from: j */
    private String f16508j;

    /* renamed from: k */
    private String f16509k;

    /* renamed from: l */
    private String f16510l;

    /* renamed from: m */
    private String f16511m;

    /* renamed from: n */
    private String f16512n;

    /* renamed from: o */
    private String f16513o;

    /* renamed from: p */
    private ProtobufList<Timestamp> f16514p = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: q */
    private int f16515q;

    /* renamed from: r */
    private boolean f16516r;

    /* renamed from: s */
    private int f16517s;

    /* renamed from: t */
    private boolean f16518t;

    /* renamed from: u */
    private boolean f16519u;

    /* renamed from: v */
    private Origin f16520v;

    /* renamed from: w */
    private int f16521w;

    /* renamed from: x */
    private C6950b0 f16522x;

    /* renamed from: co.znly.models.FriendRequestProto$FriendRequest$Origin */
    public static final class Origin extends GeneratedMessageLite<Origin, C6806b> implements OriginOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final Origin f16523g = new Origin();

        /* renamed from: h */
        private static volatile Parser<Origin> f16524h;

        /* renamed from: e */
        private int f16525e;

        /* renamed from: f */
        private C6804a f16526f;

        /* renamed from: co.znly.models.FriendRequestProto$FriendRequest$Origin$BrumpOriginOrBuilder */
        public interface BrumpOriginOrBuilder extends MessageLiteOrBuilder {
            String getBrumpMatchId();

            ByteString getBrumpMatchIdBytes();
        }

        /* renamed from: co.znly.models.FriendRequestProto$FriendRequest$Origin$a */
        public static final class C6804a extends GeneratedMessageLite<C6804a, C6805a> implements BrumpOriginOrBuilder {
            /* access modifiers changed from: private */

            /* renamed from: f */
            public static final C6804a f16527f = new C6804a();

            /* renamed from: g */
            private static volatile Parser<C6804a> f16528g;

            /* renamed from: e */
            private String f16529e = "";

            /* renamed from: co.znly.models.FriendRequestProto$FriendRequest$Origin$a$a */
            public static final class C6805a extends Builder<C6804a, C6805a> implements BrumpOriginOrBuilder {
                /* synthetic */ C6805a(C7509y yVar) {
                    this();
                }

                /* renamed from: a */
                public C6805a mo16891a(String str) {
                    copyOnWrite();
                    ((C6804a) this.instance).m17536a(str);
                    return this;
                }

                public String getBrumpMatchId() {
                    return ((C6804a) this.instance).getBrumpMatchId();
                }

                public ByteString getBrumpMatchIdBytes() {
                    return ((C6804a) this.instance).getBrumpMatchIdBytes();
                }

                private C6805a() {
                    super(C6804a.f16527f);
                }
            }

            static {
                f16527f.makeImmutable();
            }

            private C6804a() {
            }

            public static C6804a getDefaultInstance() {
                return f16527f;
            }

            public static C6805a newBuilder() {
                return (C6805a) f16527f.toBuilder();
            }

            public static Parser<C6804a> parser() {
                return f16527f.getParserForType();
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C7509y.f18868a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new C6804a();
                    case 2:
                        return f16527f;
                    case 3:
                        return null;
                    case 4:
                        return new C6805a(null);
                    case 5:
                        C6804a aVar = (C6804a) obj2;
                        this.f16529e = ((Visitor) obj).visitString(!this.f16529e.isEmpty(), this.f16529e, true ^ aVar.f16529e.isEmpty(), aVar.f16529e);
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
                                        this.f16529e = codedInputStream.readStringRequireUtf8();
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
                        if (f16528g == null) {
                            synchronized (C6804a.class) {
                                if (f16528g == null) {
                                    f16528g = new DefaultInstanceBasedParser(f16527f);
                                }
                            }
                        }
                        return f16528g;
                    default:
                        throw new UnsupportedOperationException();
                }
                return f16527f;
            }

            public String getBrumpMatchId() {
                return this.f16529e;
            }

            public ByteString getBrumpMatchIdBytes() {
                return ByteString.copyFromUtf8(this.f16529e);
            }

            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if (!this.f16529e.isEmpty()) {
                    i2 = 0 + CodedOutputStream.computeStringSize(1, getBrumpMatchId());
                }
                this.memoizedSerializedSize = i2;
                return i2;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!this.f16529e.isEmpty()) {
                    codedOutputStream.writeString(1, getBrumpMatchId());
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void m17536a(String str) {
                if (str != null) {
                    this.f16529e = str;
                    return;
                }
                throw new NullPointerException();
            }
        }

        /* renamed from: co.znly.models.FriendRequestProto$FriendRequest$Origin$b */
        public static final class C6806b extends Builder<Origin, C6806b> implements OriginOrBuilder {
            /* synthetic */ C6806b(C7509y yVar) {
                this();
            }

            /* renamed from: a */
            public C6806b mo16893a(C6807c cVar) {
                copyOnWrite();
                ((Origin) this.instance).m17532a(cVar);
                return this;
            }

            public C6804a getBrump() {
                return ((Origin) this.instance).getBrump();
            }

            public C6807c getType() {
                return ((Origin) this.instance).getType();
            }

            public int getTypeValue() {
                return ((Origin) this.instance).getTypeValue();
            }

            public boolean hasBrump() {
                return ((Origin) this.instance).hasBrump();
            }

            private C6806b() {
                super(Origin.f16523g);
            }

            /* renamed from: a */
            public C6806b mo16892a(C6805a aVar) {
                copyOnWrite();
                ((Origin) this.instance).m17531a(aVar);
                return this;
            }
        }

        /* renamed from: co.znly.models.FriendRequestProto$FriendRequest$Origin$c */
        public enum C6807c implements EnumLite {
            ORIGIN_NONE(0),
            ORIGIN_BRUMP(1),
            UNRECOGNIZED(-1);
            

            /* renamed from: e */
            private final int f16534e;

            /* renamed from: co.znly.models.FriendRequestProto$FriendRequest$Origin$c$a */
            class C6808a implements EnumLiteMap<C6807c> {
                C6808a() {
                }

                public C6807c findValueByNumber(int i) {
                    return C6807c.m17540a(i);
                }
            }

            static {
                new C6808a();
            }

            private C6807c(int i) {
                this.f16534e = i;
            }

            /* renamed from: a */
            public static C6807c m17540a(int i) {
                if (i == 0) {
                    return ORIGIN_NONE;
                }
                if (i != 1) {
                    return null;
                }
                return ORIGIN_BRUMP;
            }

            public final int getNumber() {
                return this.f16534e;
            }
        }

        static {
            f16523g.makeImmutable();
        }

        private Origin() {
        }

        public static Origin getDefaultInstance() {
            return f16523g;
        }

        public static C6806b newBuilder() {
            return (C6806b) f16523g.toBuilder();
        }

        public static Parser<Origin> parser() {
            return f16523g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7509y.f18868a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Origin();
                case 2:
                    return f16523g;
                case 3:
                    return null;
                case 4:
                    return new C6806b(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    Origin origin = (Origin) obj2;
                    boolean z2 = this.f16525e != 0;
                    int i = this.f16525e;
                    if (origin.f16525e != 0) {
                        z = true;
                    }
                    this.f16525e = visitor.visitInt(z2, i, z, origin.f16525e);
                    this.f16526f = (C6804a) visitor.visitMessage(this.f16526f, origin.f16526f);
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.f16525e = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    Builder builder = this.f16526f != null ? (C6805a) this.f16526f.toBuilder() : null;
                                    this.f16526f = (C6804a) codedInputStream.readMessage(C6804a.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16526f);
                                        this.f16526f = (C6804a) builder.buildPartial();
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
                    if (f16524h == null) {
                        synchronized (Origin.class) {
                            if (f16524h == null) {
                                f16524h = new DefaultInstanceBasedParser(f16523g);
                            }
                        }
                    }
                    return f16524h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16523g;
        }

        public C6804a getBrump() {
            C6804a aVar = this.f16526f;
            return aVar == null ? C6804a.getDefaultInstance() : aVar;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16525e != C6807c.ORIGIN_NONE.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f16525e);
            }
            if (this.f16526f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getBrump());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C6807c getType() {
            C6807c a = C6807c.m17540a(this.f16525e);
            return a == null ? C6807c.UNRECOGNIZED : a;
        }

        public int getTypeValue() {
            return this.f16525e;
        }

        public boolean hasBrump() {
            return this.f16526f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16525e != C6807c.ORIGIN_NONE.getNumber()) {
                codedOutputStream.writeEnum(1, this.f16525e);
            }
            if (this.f16526f != null) {
                codedOutputStream.writeMessage(2, getBrump());
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17532a(C6807c cVar) {
            if (cVar != null) {
                this.f16525e = cVar.getNumber();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17531a(C6805a aVar) {
            this.f16526f = (C6804a) aVar.build();
        }
    }

    /* renamed from: co.znly.models.FriendRequestProto$FriendRequest$OriginOrBuilder */
    public interface OriginOrBuilder extends MessageLiteOrBuilder {
        C6804a getBrump();

        C6807c getType();

        int getTypeValue();

        boolean hasBrump();
    }

    /* renamed from: co.znly.models.FriendRequestProto$FriendRequest$a */
    public static final class C6809a extends Builder<FriendRequestProto$FriendRequest, C6809a> implements FriendRequestProto$FriendRequestOrBuilder {
        /* synthetic */ C6809a(C7509y yVar) {
            this();
        }

        public String getAuthorName() {
            return ((FriendRequestProto$FriendRequest) this.instance).getAuthorName();
        }

        public ByteString getAuthorNameBytes() {
            return ((FriendRequestProto$FriendRequest) this.instance).getAuthorNameBytes();
        }

        public String getAuthorPhoneNumber() {
            return ((FriendRequestProto$FriendRequest) this.instance).getAuthorPhoneNumber();
        }

        public ByteString getAuthorPhoneNumberBytes() {
            return ((FriendRequestProto$FriendRequest) this.instance).getAuthorPhoneNumberBytes();
        }

        public String getAuthorUuid() {
            return ((FriendRequestProto$FriendRequest) this.instance).getAuthorUuid();
        }

        public ByteString getAuthorUuidBytes() {
            return ((FriendRequestProto$FriendRequest) this.instance).getAuthorUuidBytes();
        }

        public Timestamp getCreatedAt() {
            return ((FriendRequestProto$FriendRequest) this.instance).getCreatedAt();
        }

        public boolean getIsAuthorFirstInvite() {
            return ((FriendRequestProto$FriendRequest) this.instance).getIsAuthorFirstInvite();
        }

        public boolean getIsDeleted() {
            return ((FriendRequestProto$FriendRequest) this.instance).getIsDeleted();
        }

        public Origin getOrigin() {
            return ((FriendRequestProto$FriendRequest) this.instance).getOrigin();
        }

        public C6950b0 getOriginatedFrom() {
            return ((FriendRequestProto$FriendRequest) this.instance).getOriginatedFrom();
        }

        public Timestamp getSentAt9(int i) {
            return ((FriendRequestProto$FriendRequest) this.instance).getSentAt9(i);
        }

        public int getSentAt9Count() {
            return ((FriendRequestProto$FriendRequest) this.instance).getSentAt9Count();
        }

        public List<Timestamp> getSentAt9List() {
            return Collections.unmodifiableList(((FriendRequestProto$FriendRequest) this.instance).getSentAt9List());
        }

        public int getSentAtCount10() {
            return ((FriendRequestProto$FriendRequest) this.instance).getSentAtCount10();
        }

        public C6810b getSource() {
            return ((FriendRequestProto$FriendRequest) this.instance).getSource();
        }

        public int getSourceValue() {
            return ((FriendRequestProto$FriendRequest) this.instance).getSourceValue();
        }

        public C6812c getStatus() {
            return ((FriendRequestProto$FriendRequest) this.instance).getStatus();
        }

        public int getStatusValue() {
            return ((FriendRequestProto$FriendRequest) this.instance).getStatusValue();
        }

        public boolean getTargetExists() {
            return ((FriendRequestProto$FriendRequest) this.instance).getTargetExists();
        }

        public String getTargetHashedPhoneNumber() {
            return ((FriendRequestProto$FriendRequest) this.instance).getTargetHashedPhoneNumber();
        }

        public ByteString getTargetHashedPhoneNumberBytes() {
            return ((FriendRequestProto$FriendRequest) this.instance).getTargetHashedPhoneNumberBytes();
        }

        public String getTargetName() {
            return ((FriendRequestProto$FriendRequest) this.instance).getTargetName();
        }

        public ByteString getTargetNameBytes() {
            return ((FriendRequestProto$FriendRequest) this.instance).getTargetNameBytes();
        }

        public String getTargetPhoneNumber() {
            return ((FriendRequestProto$FriendRequest) this.instance).getTargetPhoneNumber();
        }

        public ByteString getTargetPhoneNumberBytes() {
            return ((FriendRequestProto$FriendRequest) this.instance).getTargetPhoneNumberBytes();
        }

        public String getTargetUuid() {
            return ((FriendRequestProto$FriendRequest) this.instance).getTargetUuid();
        }

        public ByteString getTargetUuidBytes() {
            return ((FriendRequestProto$FriendRequest) this.instance).getTargetUuidBytes();
        }

        public Timestamp getUpdatedAt() {
            return ((FriendRequestProto$FriendRequest) this.instance).getUpdatedAt();
        }

        public String getUuid() {
            return ((FriendRequestProto$FriendRequest) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((FriendRequestProto$FriendRequest) this.instance).getUuidBytes();
        }

        public boolean hasCreatedAt() {
            return ((FriendRequestProto$FriendRequest) this.instance).hasCreatedAt();
        }

        public boolean hasOrigin() {
            return ((FriendRequestProto$FriendRequest) this.instance).hasOrigin();
        }

        public boolean hasOriginatedFrom() {
            return ((FriendRequestProto$FriendRequest) this.instance).hasOriginatedFrom();
        }

        public boolean hasUpdatedAt() {
            return ((FriendRequestProto$FriendRequest) this.instance).hasUpdatedAt();
        }

        private C6809a() {
            super(FriendRequestProto$FriendRequest.f16501y);
        }
    }

    /* renamed from: co.znly.models.FriendRequestProto$FriendRequest$b */
    public enum C6810b implements EnumLite {
        SOURCE_UNKNOWN(0),
        SOURCE_UUID(1),
        SOURCE_PHONE_NUMBER(2),
        SOURCE_USERNAME(3),
        SOURCE_ONBOARDING_AOZ(4),
        SOURCE_ONBOARDING_CONTACT(5),
        SOURCE_ONBOARDING_SUGGESTED(6),
        SOURCE_DASHBOARD_AOZ(7),
        SOURCE_DASHBOARD_CONTACT(8),
        SOURCE_DASHBOARD_SUGGESTED(9),
        SOURCE_ADDFRIEND_AOZ(10),
        SOURCE_ADDFRIEND_CONTACT(11),
        SOURCE_ADDFRIEND_SUGGESTED(12),
        SOURCE_PROFILE_OTHER_HEADER(13),
        SOURCE_PROFILE_OTHER_FRIEND_LIST(14),
        SOURCE_GROUP_INFO_USER_LIST(15),
        SOURCE_CONTACT_JOINED(16),
        SOURCE_FOG(17),
        SOURCE_BUMP(18),
        SOURCE_MY_FRIEND_LIST(19),
        SOURCE_RECOMMENDATION(20),
        SOURCE_LINK_INVITE(21),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f16559e;

        /* renamed from: co.znly.models.FriendRequestProto$FriendRequest$b$a */
        class C6811a implements EnumLiteMap<C6810b> {
            C6811a() {
            }

            public C6810b findValueByNumber(int i) {
                return C6810b.m17541a(i);
            }
        }

        static {
            new C6811a();
        }

        private C6810b(int i) {
            this.f16559e = i;
        }

        /* renamed from: a */
        public static C6810b m17541a(int i) {
            switch (i) {
                case 0:
                    return SOURCE_UNKNOWN;
                case 1:
                    return SOURCE_UUID;
                case 2:
                    return SOURCE_PHONE_NUMBER;
                case 3:
                    return SOURCE_USERNAME;
                case 4:
                    return SOURCE_ONBOARDING_AOZ;
                case 5:
                    return SOURCE_ONBOARDING_CONTACT;
                case 6:
                    return SOURCE_ONBOARDING_SUGGESTED;
                case 7:
                    return SOURCE_DASHBOARD_AOZ;
                case 8:
                    return SOURCE_DASHBOARD_CONTACT;
                case 9:
                    return SOURCE_DASHBOARD_SUGGESTED;
                case 10:
                    return SOURCE_ADDFRIEND_AOZ;
                case 11:
                    return SOURCE_ADDFRIEND_CONTACT;
                case 12:
                    return SOURCE_ADDFRIEND_SUGGESTED;
                case 13:
                    return SOURCE_PROFILE_OTHER_HEADER;
                case 14:
                    return SOURCE_PROFILE_OTHER_FRIEND_LIST;
                case 15:
                    return SOURCE_GROUP_INFO_USER_LIST;
                case 16:
                    return SOURCE_CONTACT_JOINED;
                case 17:
                    return SOURCE_FOG;
                case 18:
                    return SOURCE_BUMP;
                case 19:
                    return SOURCE_MY_FRIEND_LIST;
                case 20:
                    return SOURCE_RECOMMENDATION;
                case 21:
                    return SOURCE_LINK_INVITE;
                default:
                    return null;
            }
        }

        public final int getNumber() {
            return this.f16559e;
        }
    }

    /* renamed from: co.znly.models.FriendRequestProto$FriendRequest$c */
    public enum C6812c implements EnumLite {
        unknown(0),
        pending(1),
        accepted(2),
        rejected(3),
        ignored(4),
        deleted(5),
        canceled(6),
        hidden(7),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f16570e;

        /* renamed from: co.znly.models.FriendRequestProto$FriendRequest$c$a */
        class C6813a implements EnumLiteMap<C6812c> {
            C6813a() {
            }

            public C6812c findValueByNumber(int i) {
                return C6812c.m17542a(i);
            }
        }

        static {
            new C6813a();
        }

        private C6812c(int i) {
            this.f16570e = i;
        }

        /* renamed from: a */
        public static C6812c m17542a(int i) {
            switch (i) {
                case 0:
                    return unknown;
                case 1:
                    return pending;
                case 2:
                    return accepted;
                case 3:
                    return rejected;
                case 4:
                    return ignored;
                case 5:
                    return deleted;
                case 6:
                    return canceled;
                case 7:
                    return hidden;
                default:
                    return null;
            }
        }

        public final int getNumber() {
            return this.f16570e;
        }
    }

    static {
        f16501y.makeImmutable();
    }

    private FriendRequestProto$FriendRequest() {
        String str = "";
        this.f16504f = str;
        this.f16507i = str;
        this.f16508j = str;
        this.f16509k = str;
        this.f16510l = str;
        this.f16511m = str;
        this.f16512n = str;
        this.f16513o = str;
    }

    public static FriendRequestProto$FriendRequest getDefaultInstance() {
        return f16501y;
    }

    public static Parser<FriendRequestProto$FriendRequest> parser() {
        return f16501y.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7509y.f18868a[methodToInvoke.ordinal()]) {
            case 1:
                return new FriendRequestProto$FriendRequest();
            case 2:
                return f16501y;
            case 3:
                this.f16514p.makeImmutable();
                return null;
            case 4:
                return new C6809a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                FriendRequestProto$FriendRequest friendRequestProto$FriendRequest = (FriendRequestProto$FriendRequest) obj2;
                this.f16504f = visitor.visitString(!this.f16504f.isEmpty(), this.f16504f, !friendRequestProto$FriendRequest.f16504f.isEmpty(), friendRequestProto$FriendRequest.f16504f);
                this.f16505g = (Timestamp) visitor.visitMessage(this.f16505g, friendRequestProto$FriendRequest.f16505g);
                this.f16506h = (Timestamp) visitor.visitMessage(this.f16506h, friendRequestProto$FriendRequest.f16506h);
                this.f16507i = visitor.visitString(!this.f16507i.isEmpty(), this.f16507i, !friendRequestProto$FriendRequest.f16507i.isEmpty(), friendRequestProto$FriendRequest.f16507i);
                this.f16508j = visitor.visitString(!this.f16508j.isEmpty(), this.f16508j, !friendRequestProto$FriendRequest.f16508j.isEmpty(), friendRequestProto$FriendRequest.f16508j);
                this.f16509k = visitor.visitString(!this.f16509k.isEmpty(), this.f16509k, !friendRequestProto$FriendRequest.f16509k.isEmpty(), friendRequestProto$FriendRequest.f16509k);
                this.f16510l = visitor.visitString(!this.f16510l.isEmpty(), this.f16510l, !friendRequestProto$FriendRequest.f16510l.isEmpty(), friendRequestProto$FriendRequest.f16510l);
                this.f16511m = visitor.visitString(!this.f16511m.isEmpty(), this.f16511m, !friendRequestProto$FriendRequest.f16511m.isEmpty(), friendRequestProto$FriendRequest.f16511m);
                this.f16512n = visitor.visitString(!this.f16512n.isEmpty(), this.f16512n, !friendRequestProto$FriendRequest.f16512n.isEmpty(), friendRequestProto$FriendRequest.f16512n);
                this.f16513o = visitor.visitString(!this.f16513o.isEmpty(), this.f16513o, !friendRequestProto$FriendRequest.f16513o.isEmpty(), friendRequestProto$FriendRequest.f16513o);
                this.f16514p = visitor.visitList(this.f16514p, friendRequestProto$FriendRequest.f16514p);
                this.f16515q = visitor.visitInt(this.f16515q != 0, this.f16515q, friendRequestProto$FriendRequest.f16515q != 0, friendRequestProto$FriendRequest.f16515q);
                boolean z2 = this.f16516r;
                boolean z3 = friendRequestProto$FriendRequest.f16516r;
                this.f16516r = visitor.visitBoolean(z2, z2, z3, z3);
                this.f16517s = visitor.visitInt(this.f16517s != 0, this.f16517s, friendRequestProto$FriendRequest.f16517s != 0, friendRequestProto$FriendRequest.f16517s);
                boolean z4 = this.f16518t;
                boolean z5 = friendRequestProto$FriendRequest.f16518t;
                this.f16518t = visitor.visitBoolean(z4, z4, z5, z5);
                boolean z6 = this.f16519u;
                boolean z7 = friendRequestProto$FriendRequest.f16519u;
                this.f16519u = visitor.visitBoolean(z6, z6, z7, z7);
                this.f16520v = (Origin) visitor.visitMessage(this.f16520v, friendRequestProto$FriendRequest.f16520v);
                boolean z8 = this.f16521w != 0;
                int i = this.f16521w;
                if (friendRequestProto$FriendRequest.f16521w != 0) {
                    z = true;
                }
                this.f16521w = visitor.visitInt(z8, i, z, friendRequestProto$FriendRequest.f16521w);
                this.f16522x = (C6950b0) visitor.visitMessage(this.f16522x, friendRequestProto$FriendRequest.f16522x);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f16503e |= friendRequestProto$FriendRequest.f16503e;
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
                                this.f16504f = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                Builder builder = this.f16505g != null ? (Timestamp.Builder) this.f16505g.toBuilder() : null;
                                this.f16505g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f16505g);
                                    this.f16505g = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 26:
                                this.f16507i = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                this.f16508j = codedInputStream.readStringRequireUtf8();
                                break;
                            case 42:
                                this.f16509k = codedInputStream.readStringRequireUtf8();
                                break;
                            case 50:
                                this.f16510l = codedInputStream.readStringRequireUtf8();
                                break;
                            case 58:
                                this.f16511m = codedInputStream.readStringRequireUtf8();
                                break;
                            case 66:
                                this.f16512n = codedInputStream.readStringRequireUtf8();
                                break;
                            case 74:
                                if (!this.f16514p.isModifiable()) {
                                    this.f16514p = GeneratedMessageLite.mutableCopy(this.f16514p);
                                }
                                this.f16514p.add(codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite));
                                break;
                            case 80:
                                this.f16515q = codedInputStream.readInt32();
                                break;
                            case 88:
                                this.f16516r = codedInputStream.readBool();
                                break;
                            case 96:
                                this.f16517s = codedInputStream.readEnum();
                                break;
                            case 104:
                                this.f16518t = codedInputStream.readBool();
                                break;
                            case 114:
                                Builder builder2 = this.f16506h != null ? (Timestamp.Builder) this.f16506h.toBuilder() : null;
                                this.f16506h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f16506h);
                                    this.f16506h = (Timestamp) builder2.buildPartial();
                                    break;
                                }
                            case 120:
                                this.f16519u = codedInputStream.readBool();
                                break;
                            case 130:
                                Builder builder3 = this.f16520v != null ? (C6806b) this.f16520v.toBuilder() : null;
                                this.f16520v = (Origin) codedInputStream.readMessage(Origin.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f16520v);
                                    this.f16520v = (Origin) builder3.buildPartial();
                                    break;
                                }
                            case 138:
                                this.f16513o = codedInputStream.readStringRequireUtf8();
                                break;
                            case 144:
                                this.f16521w = codedInputStream.readEnum();
                                break;
                            case 154:
                                Builder builder4 = this.f16522x != null ? (C6951a) this.f16522x.toBuilder() : null;
                                this.f16522x = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder4 == null) {
                                    break;
                                } else {
                                    builder4.mergeFrom(this.f16522x);
                                    this.f16522x = (C6950b0) builder4.buildPartial();
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
                if (f16502z == null) {
                    synchronized (FriendRequestProto$FriendRequest.class) {
                        if (f16502z == null) {
                            f16502z = new DefaultInstanceBasedParser(f16501y);
                        }
                    }
                }
                return f16502z;
            default:
                throw new UnsupportedOperationException();
        }
        return f16501y;
    }

    public String getAuthorName() {
        return this.f16509k;
    }

    public ByteString getAuthorNameBytes() {
        return ByteString.copyFromUtf8(this.f16509k);
    }

    public String getAuthorPhoneNumber() {
        return this.f16510l;
    }

    public ByteString getAuthorPhoneNumberBytes() {
        return ByteString.copyFromUtf8(this.f16510l);
    }

    public String getAuthorUuid() {
        return this.f16507i;
    }

    public ByteString getAuthorUuidBytes() {
        return ByteString.copyFromUtf8(this.f16507i);
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f16505g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean getIsAuthorFirstInvite() {
        return this.f16516r;
    }

    public boolean getIsDeleted() {
        return this.f16519u;
    }

    public Origin getOrigin() {
        Origin origin = this.f16520v;
        return origin == null ? Origin.getDefaultInstance() : origin;
    }

    public C6950b0 getOriginatedFrom() {
        C6950b0 b0Var = this.f16522x;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public Timestamp getSentAt9(int i) {
        return (Timestamp) this.f16514p.get(i);
    }

    public int getSentAt9Count() {
        return this.f16514p.size();
    }

    public List<Timestamp> getSentAt9List() {
        return this.f16514p;
    }

    public int getSentAtCount10() {
        return this.f16515q;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f16504f.isEmpty() ? CodedOutputStream.computeStringSize(1, getUuid()) + 0 : 0;
        if (this.f16505g != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, getCreatedAt());
        }
        if (!this.f16507i.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(3, getAuthorUuid());
        }
        if (!this.f16508j.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(4, getTargetUuid());
        }
        if (!this.f16509k.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(5, getAuthorName());
        }
        if (!this.f16510l.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(6, getAuthorPhoneNumber());
        }
        if (!this.f16511m.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(7, getTargetName());
        }
        if (!this.f16512n.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(8, getTargetPhoneNumber());
        }
        for (int i2 = 0; i2 < this.f16514p.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(9, (MessageLite) this.f16514p.get(i2));
        }
        int i3 = this.f16515q;
        if (i3 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(10, i3);
        }
        boolean z = this.f16516r;
        if (z) {
            computeStringSize += CodedOutputStream.computeBoolSize(11, z);
        }
        if (this.f16517s != C6812c.unknown.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(12, this.f16517s);
        }
        boolean z2 = this.f16518t;
        if (z2) {
            computeStringSize += CodedOutputStream.computeBoolSize(13, z2);
        }
        if (this.f16506h != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(14, getUpdatedAt());
        }
        boolean z3 = this.f16519u;
        if (z3) {
            computeStringSize += CodedOutputStream.computeBoolSize(15, z3);
        }
        if (this.f16520v != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(16, getOrigin());
        }
        if (!this.f16513o.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(17, getTargetHashedPhoneNumber());
        }
        if (this.f16521w != C6810b.SOURCE_UNKNOWN.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(18, this.f16521w);
        }
        if (this.f16522x != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(19, getOriginatedFrom());
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public C6810b getSource() {
        C6810b a = C6810b.m17541a(this.f16521w);
        return a == null ? C6810b.UNRECOGNIZED : a;
    }

    public int getSourceValue() {
        return this.f16521w;
    }

    public C6812c getStatus() {
        C6812c a = C6812c.m17542a(this.f16517s);
        return a == null ? C6812c.UNRECOGNIZED : a;
    }

    public int getStatusValue() {
        return this.f16517s;
    }

    public boolean getTargetExists() {
        return this.f16518t;
    }

    public String getTargetHashedPhoneNumber() {
        return this.f16513o;
    }

    public ByteString getTargetHashedPhoneNumberBytes() {
        return ByteString.copyFromUtf8(this.f16513o);
    }

    public String getTargetName() {
        return this.f16511m;
    }

    public ByteString getTargetNameBytes() {
        return ByteString.copyFromUtf8(this.f16511m);
    }

    public String getTargetPhoneNumber() {
        return this.f16512n;
    }

    public ByteString getTargetPhoneNumberBytes() {
        return ByteString.copyFromUtf8(this.f16512n);
    }

    public String getTargetUuid() {
        return this.f16508j;
    }

    public ByteString getTargetUuidBytes() {
        return ByteString.copyFromUtf8(this.f16508j);
    }

    public Timestamp getUpdatedAt() {
        Timestamp timestamp = this.f16506h;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getUuid() {
        return this.f16504f;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f16504f);
    }

    public boolean hasCreatedAt() {
        return this.f16505g != null;
    }

    public boolean hasOrigin() {
        return this.f16520v != null;
    }

    public boolean hasOriginatedFrom() {
        return this.f16522x != null;
    }

    public boolean hasUpdatedAt() {
        return this.f16506h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f16504f.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (this.f16505g != null) {
            codedOutputStream.writeMessage(2, getCreatedAt());
        }
        if (!this.f16507i.isEmpty()) {
            codedOutputStream.writeString(3, getAuthorUuid());
        }
        if (!this.f16508j.isEmpty()) {
            codedOutputStream.writeString(4, getTargetUuid());
        }
        if (!this.f16509k.isEmpty()) {
            codedOutputStream.writeString(5, getAuthorName());
        }
        if (!this.f16510l.isEmpty()) {
            codedOutputStream.writeString(6, getAuthorPhoneNumber());
        }
        if (!this.f16511m.isEmpty()) {
            codedOutputStream.writeString(7, getTargetName());
        }
        if (!this.f16512n.isEmpty()) {
            codedOutputStream.writeString(8, getTargetPhoneNumber());
        }
        for (int i = 0; i < this.f16514p.size(); i++) {
            codedOutputStream.writeMessage(9, (MessageLite) this.f16514p.get(i));
        }
        int i2 = this.f16515q;
        if (i2 != 0) {
            codedOutputStream.writeInt32(10, i2);
        }
        boolean z = this.f16516r;
        if (z) {
            codedOutputStream.writeBool(11, z);
        }
        if (this.f16517s != C6812c.unknown.getNumber()) {
            codedOutputStream.writeEnum(12, this.f16517s);
        }
        boolean z2 = this.f16518t;
        if (z2) {
            codedOutputStream.writeBool(13, z2);
        }
        if (this.f16506h != null) {
            codedOutputStream.writeMessage(14, getUpdatedAt());
        }
        boolean z3 = this.f16519u;
        if (z3) {
            codedOutputStream.writeBool(15, z3);
        }
        if (this.f16520v != null) {
            codedOutputStream.writeMessage(16, getOrigin());
        }
        if (!this.f16513o.isEmpty()) {
            codedOutputStream.writeString(17, getTargetHashedPhoneNumber());
        }
        if (this.f16521w != C6810b.SOURCE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(18, this.f16521w);
        }
        if (this.f16522x != null) {
            codedOutputStream.writeMessage(19, getOriginatedFrom());
        }
    }
}
