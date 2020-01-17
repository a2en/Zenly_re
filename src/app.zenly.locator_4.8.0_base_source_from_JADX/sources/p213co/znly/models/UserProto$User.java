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
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$DisabledNotifications.C6922a;

/* renamed from: co.znly.models.UserProto$User */
public final class UserProto$User extends GeneratedMessageLite<UserProto$User, C6925a> implements UserProto$UserOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: L */
    public static final UserProto$User f17007L = new UserProto$User();

    /* renamed from: M */
    private static volatile Parser<UserProto$User> f17008M;

    /* renamed from: A */
    private boolean f17009A;

    /* renamed from: B */
    private boolean f17010B;

    /* renamed from: C */
    private int f17011C;

    /* renamed from: D */
    private int f17012D;

    /* renamed from: E */
    private int f17013E;

    /* renamed from: F */
    private int f17014F;

    /* renamed from: G */
    private Timestamp f17015G;

    /* renamed from: H */
    private String f17016H;

    /* renamed from: I */
    private int f17017I;

    /* renamed from: J */
    private boolean f17018J;

    /* renamed from: K */
    private C6926b f17019K;

    /* renamed from: e */
    private int f17020e;

    /* renamed from: f */
    private String f17021f;

    /* renamed from: g */
    private String f17022g;

    /* renamed from: h */
    private String f17023h;

    /* renamed from: i */
    private String f17024i;

    /* renamed from: j */
    private String f17025j;

    /* renamed from: k */
    private String f17026k;

    /* renamed from: l */
    private String f17027l;

    /* renamed from: m */
    private Timestamp f17028m;

    /* renamed from: n */
    private Timestamp f17029n;

    /* renamed from: o */
    private Timestamp f17030o;

    /* renamed from: p */
    private Timestamp f17031p;

    /* renamed from: q */
    private UserProto$DisabledNotifications f17032q;

    /* renamed from: r */
    private ProtobufList<String> f17033r = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: s */
    private int f17034s;

    /* renamed from: t */
    private int f17035t;

    /* renamed from: u */
    private int f17036u;

    /* renamed from: v */
    private int f17037v;

    /* renamed from: w */
    private int f17038w;

    /* renamed from: x */
    private int f17039x;

    /* renamed from: y */
    private boolean f17040y;

    /* renamed from: z */
    private boolean f17041z;

    /* renamed from: co.znly.models.UserProto$User$EventsOrBuilder */
    public interface EventsOrBuilder extends MessageLiteOrBuilder {
        int getInviterCount();
    }

    /* renamed from: co.znly.models.UserProto$User$a */
    public static final class C6925a extends Builder<UserProto$User, C6925a> implements UserProto$UserOrBuilder {
        /* synthetic */ C6925a(C7519z2 z2Var) {
            this();
        }

        /* renamed from: a */
        public C6925a mo18017a(UserProto$DisabledNotifications userProto$DisabledNotifications) {
            copyOnWrite();
            ((UserProto$User) this.instance).m17664a(userProto$DisabledNotifications);
            return this;
        }

        /* renamed from: b */
        public C6925a mo18020b(boolean z) {
            copyOnWrite();
            ((UserProto$User) this.instance).m17674b(z);
            return this;
        }

        /* renamed from: c */
        public C6925a mo18021c(boolean z) {
            copyOnWrite();
            ((UserProto$User) this.instance).m17676c(z);
            return this;
        }

        public String getAvatarUrlPrefix() {
            return ((UserProto$User) this.instance).getAvatarUrlPrefix();
        }

        public ByteString getAvatarUrlPrefixBytes() {
            return ((UserProto$User) this.instance).getAvatarUrlPrefixBytes();
        }

        public int getAvatarVersion() {
            return ((UserProto$User) this.instance).getAvatarVersion();
        }

        public Timestamp getBirthdate() {
            return ((UserProto$User) this.instance).getBirthdate();
        }

        public C6947a3 getBlockRelationship() {
            return ((UserProto$User) this.instance).getBlockRelationship();
        }

        public int getBlockRelationshipValue() {
            return ((UserProto$User) this.instance).getBlockRelationshipValue();
        }

        public Timestamp getCreatedAt() {
            return ((UserProto$User) this.instance).getCreatedAt();
        }

        public UserProto$DisabledNotifications getDisabledNotifications() {
            return ((UserProto$User) this.instance).getDisabledNotifications();
        }

        public C6960b3 getDistanceUnits() {
            return ((UserProto$User) this.instance).getDistanceUnits();
        }

        public int getDistanceUnitsValue() {
            return ((UserProto$User) this.instance).getDistanceUnitsValue();
        }

        public String getEmail() {
            return ((UserProto$User) this.instance).getEmail();
        }

        public ByteString getEmailBytes() {
            return ((UserProto$User) this.instance).getEmailBytes();
        }

        public C6926b getEvents() {
            return ((UserProto$User) this.instance).getEvents();
        }

        public Timestamp getFirstFriendAt() {
            return ((UserProto$User) this.instance).getFirstFriendAt();
        }

        public int getFriendsCount() {
            return ((UserProto$User) this.instance).getFriendsCount();
        }

        public C7278d3 getIdCardStyle() {
            return ((UserProto$User) this.instance).getIdCardStyle();
        }

        public int getIdCardStyleValue() {
            return ((UserProto$User) this.instance).getIdCardStyleValue();
        }

        public C7288e3 getMapDisplayOptions() {
            return ((UserProto$User) this.instance).getMapDisplayOptions();
        }

        public int getMapDisplayOptionsValue() {
            return ((UserProto$User) this.instance).getMapDisplayOptionsValue();
        }

        public String getName() {
            return ((UserProto$User) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((UserProto$User) this.instance).getNameBytes();
        }

        public int getNetworkMcc() {
            return ((UserProto$User) this.instance).getNetworkMcc();
        }

        public int getNetworkMnc() {
            return ((UserProto$User) this.instance).getNetworkMnc();
        }

        public boolean getOptOutSuggest() {
            return ((UserProto$User) this.instance).getOptOutSuggest();
        }

        public String getPassword() {
            return ((UserProto$User) this.instance).getPassword();
        }

        public ByteString getPasswordBytes() {
            return ((UserProto$User) this.instance).getPasswordBytes();
        }

        public int getPhoneCountryCode() {
            return ((UserProto$User) this.instance).getPhoneCountryCode();
        }

        public String getPhoneNumber() {
            return ((UserProto$User) this.instance).getPhoneNumber();
        }

        public ByteString getPhoneNumberBytes() {
            return ((UserProto$User) this.instance).getPhoneNumberBytes();
        }

        public boolean getPointsOfInterestDisabled() {
            return ((UserProto$User) this.instance).getPointsOfInterestDisabled();
        }

        public boolean getPrivateMode() {
            return ((UserProto$User) this.instance).getPrivateMode();
        }

        public String getRoles(int i) {
            return ((UserProto$User) this.instance).getRoles(i);
        }

        public ByteString getRolesBytes(int i) {
            return ((UserProto$User) this.instance).getRolesBytes(i);
        }

        public int getRolesCount() {
            return ((UserProto$User) this.instance).getRolesCount();
        }

        public List<String> getRolesList() {
            return Collections.unmodifiableList(((UserProto$User) this.instance).getRolesList());
        }

        public boolean getShowSkiMaps() {
            return ((UserProto$User) this.instance).getShowSkiMaps();
        }

        public int getSimMcc() {
            return ((UserProto$User) this.instance).getSimMcc();
        }

        public int getSimMnc() {
            return ((UserProto$User) this.instance).getSimMnc();
        }

        public Timestamp getSuspendedAt() {
            return ((UserProto$User) this.instance).getSuspendedAt();
        }

        public String getTimezone() {
            return ((UserProto$User) this.instance).getTimezone();
        }

        public ByteString getTimezoneBytes() {
            return ((UserProto$User) this.instance).getTimezoneBytes();
        }

        public Timestamp getUpdatedAt() {
            return ((UserProto$User) this.instance).getUpdatedAt();
        }

        public String getUsername() {
            return ((UserProto$User) this.instance).getUsername();
        }

        public ByteString getUsernameBytes() {
            return ((UserProto$User) this.instance).getUsernameBytes();
        }

        public String getUuid() {
            return ((UserProto$User) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((UserProto$User) this.instance).getUuidBytes();
        }

        public boolean getVoip() {
            return ((UserProto$User) this.instance).getVoip();
        }

        public boolean hasBirthdate() {
            return ((UserProto$User) this.instance).hasBirthdate();
        }

        public boolean hasCreatedAt() {
            return ((UserProto$User) this.instance).hasCreatedAt();
        }

        public boolean hasDisabledNotifications() {
            return ((UserProto$User) this.instance).hasDisabledNotifications();
        }

        public boolean hasEvents() {
            return ((UserProto$User) this.instance).hasEvents();
        }

        public boolean hasFirstFriendAt() {
            return ((UserProto$User) this.instance).hasFirstFriendAt();
        }

        public boolean hasSuspendedAt() {
            return ((UserProto$User) this.instance).hasSuspendedAt();
        }

        public boolean hasUpdatedAt() {
            return ((UserProto$User) this.instance).hasUpdatedAt();
        }

        public C6925a setName(String str) {
            copyOnWrite();
            ((UserProto$User) this.instance).setName(str);
            return this;
        }

        private C6925a() {
            super(UserProto$User.f17007L);
        }

        /* renamed from: a */
        public C6925a mo18016a(Timestamp timestamp) {
            copyOnWrite();
            ((UserProto$User) this.instance).m17663a(timestamp);
            return this;
        }

        /* renamed from: a */
        public C6925a mo18018a(String str) {
            copyOnWrite();
            ((UserProto$User) this.instance).m17670a(str);
            return this;
        }

        /* renamed from: a */
        public C6925a mo18015a(int i) {
            copyOnWrite();
            ((UserProto$User) this.instance).m17662a(i);
            return this;
        }

        /* renamed from: a */
        public C6925a mo18019a(boolean z) {
            copyOnWrite();
            ((UserProto$User) this.instance).m17671a(z);
            return this;
        }
    }

    /* renamed from: co.znly.models.UserProto$User$b */
    public static final class C6926b extends GeneratedMessageLite<C6926b, C6927a> implements EventsOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C6926b f17042f = new C6926b();

        /* renamed from: g */
        private static volatile Parser<C6926b> f17043g;

        /* renamed from: e */
        private int f17044e;

        /* renamed from: co.znly.models.UserProto$User$b$a */
        public static final class C6927a extends Builder<C6926b, C6927a> implements EventsOrBuilder {
            /* synthetic */ C6927a(C7519z2 z2Var) {
                this();
            }

            public int getInviterCount() {
                return ((C6926b) this.instance).getInviterCount();
            }

            private C6927a() {
                super(C6926b.f17042f);
            }
        }

        static {
            f17042f.makeImmutable();
        }

        private C6926b() {
        }

        public static C6926b getDefaultInstance() {
            return f17042f;
        }

        public static Parser<C6926b> parser() {
            return f17042f.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7519z2.f18891a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6926b();
                case 2:
                    return f17042f;
                case 3:
                    return null;
                case 4:
                    return new C6927a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6926b bVar = (C6926b) obj2;
                    boolean z2 = this.f17044e != 0;
                    int i = this.f17044e;
                    if (bVar.f17044e != 0) {
                        z = true;
                    }
                    this.f17044e = visitor.visitInt(z2, i, z, bVar.f17044e);
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
                                    this.f17044e = codedInputStream.readInt32();
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
                    if (f17043g == null) {
                        synchronized (C6926b.class) {
                            if (f17043g == null) {
                                f17043g = new DefaultInstanceBasedParser(f17042f);
                            }
                        }
                    }
                    return f17043g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17042f;
        }

        public int getInviterCount() {
            return this.f17044e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int i3 = this.f17044e;
            if (i3 != 0) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.f17044e;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
        }
    }

    static {
        f17007L.makeImmutable();
    }

    private UserProto$User() {
        String str = "";
        this.f17021f = str;
        this.f17022g = str;
        this.f17023h = str;
        this.f17024i = str;
        this.f17025j = str;
        this.f17026k = str;
        this.f17027l = str;
        this.f17016H = str;
    }

    public static UserProto$User getDefaultInstance() {
        return f17007L;
    }

    public static C6925a newBuilder() {
        return (C6925a) f17007L.toBuilder();
    }

    public static UserProto$User parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserProto$User) GeneratedMessageLite.parseFrom(f17007L, bArr);
    }

    public static Parser<UserProto$User> parser() {
        return f17007L.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setName(String str) {
        if (str != null) {
            this.f17022g = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7519z2.f18891a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserProto$User();
            case 2:
                return f17007L;
            case 3:
                this.f17033r.makeImmutable();
                return null;
            case 4:
                return new C6925a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                UserProto$User userProto$User = (UserProto$User) obj2;
                this.f17021f = visitor.visitString(!this.f17021f.isEmpty(), this.f17021f, !userProto$User.f17021f.isEmpty(), userProto$User.f17021f);
                this.f17022g = visitor.visitString(!this.f17022g.isEmpty(), this.f17022g, !userProto$User.f17022g.isEmpty(), userProto$User.f17022g);
                this.f17023h = visitor.visitString(!this.f17023h.isEmpty(), this.f17023h, !userProto$User.f17023h.isEmpty(), userProto$User.f17023h);
                this.f17024i = visitor.visitString(!this.f17024i.isEmpty(), this.f17024i, !userProto$User.f17024i.isEmpty(), userProto$User.f17024i);
                this.f17025j = visitor.visitString(!this.f17025j.isEmpty(), this.f17025j, !userProto$User.f17025j.isEmpty(), userProto$User.f17025j);
                this.f17026k = visitor.visitString(!this.f17026k.isEmpty(), this.f17026k, !userProto$User.f17026k.isEmpty(), userProto$User.f17026k);
                this.f17027l = visitor.visitString(!this.f17027l.isEmpty(), this.f17027l, !userProto$User.f17027l.isEmpty(), userProto$User.f17027l);
                this.f17028m = (Timestamp) visitor.visitMessage(this.f17028m, userProto$User.f17028m);
                this.f17029n = (Timestamp) visitor.visitMessage(this.f17029n, userProto$User.f17029n);
                this.f17030o = (Timestamp) visitor.visitMessage(this.f17030o, userProto$User.f17030o);
                this.f17031p = (Timestamp) visitor.visitMessage(this.f17031p, userProto$User.f17031p);
                this.f17032q = (UserProto$DisabledNotifications) visitor.visitMessage(this.f17032q, userProto$User.f17032q);
                this.f17033r = visitor.visitList(this.f17033r, userProto$User.f17033r);
                this.f17034s = visitor.visitInt(this.f17034s != 0, this.f17034s, userProto$User.f17034s != 0, userProto$User.f17034s);
                this.f17035t = visitor.visitInt(this.f17035t != 0, this.f17035t, userProto$User.f17035t != 0, userProto$User.f17035t);
                this.f17036u = visitor.visitInt(this.f17036u != 0, this.f17036u, userProto$User.f17036u != 0, userProto$User.f17036u);
                this.f17037v = visitor.visitInt(this.f17037v != 0, this.f17037v, userProto$User.f17037v != 0, userProto$User.f17037v);
                this.f17038w = visitor.visitInt(this.f17038w != 0, this.f17038w, userProto$User.f17038w != 0, userProto$User.f17038w);
                this.f17039x = visitor.visitInt(this.f17039x != 0, this.f17039x, userProto$User.f17039x != 0, userProto$User.f17039x);
                boolean z2 = this.f17040y;
                boolean z3 = userProto$User.f17040y;
                this.f17040y = visitor.visitBoolean(z2, z2, z3, z3);
                boolean z4 = this.f17041z;
                boolean z5 = userProto$User.f17041z;
                this.f17041z = visitor.visitBoolean(z4, z4, z5, z5);
                boolean z6 = this.f17009A;
                boolean z7 = userProto$User.f17009A;
                this.f17009A = visitor.visitBoolean(z6, z6, z7, z7);
                boolean z8 = this.f17010B;
                boolean z9 = userProto$User.f17010B;
                this.f17010B = visitor.visitBoolean(z8, z8, z9, z9);
                this.f17011C = visitor.visitInt(this.f17011C != 0, this.f17011C, userProto$User.f17011C != 0, userProto$User.f17011C);
                this.f17012D = visitor.visitInt(this.f17012D != 0, this.f17012D, userProto$User.f17012D != 0, userProto$User.f17012D);
                this.f17013E = visitor.visitInt(this.f17013E != 0, this.f17013E, userProto$User.f17013E != 0, userProto$User.f17013E);
                this.f17014F = visitor.visitInt(this.f17014F != 0, this.f17014F, userProto$User.f17014F != 0, userProto$User.f17014F);
                this.f17015G = (Timestamp) visitor.visitMessage(this.f17015G, userProto$User.f17015G);
                this.f17016H = visitor.visitString(!this.f17016H.isEmpty(), this.f17016H, !userProto$User.f17016H.isEmpty(), userProto$User.f17016H);
                boolean z10 = this.f17017I != 0;
                int i = this.f17017I;
                if (userProto$User.f17017I != 0) {
                    z = true;
                }
                this.f17017I = visitor.visitInt(z10, i, z, userProto$User.f17017I);
                boolean z11 = this.f17018J;
                boolean z12 = userProto$User.f17018J;
                this.f17018J = visitor.visitBoolean(z11, z11, z12, z12);
                this.f17019K = (C6926b) visitor.visitMessage(this.f17019K, userProto$User.f17019K);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17020e |= userProto$User.f17020e;
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
                                this.f17021f = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                Builder builder = this.f17029n != null ? (Timestamp.Builder) this.f17029n.toBuilder() : null;
                                this.f17029n = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f17029n);
                                    this.f17029n = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 26:
                                this.f17022g = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                this.f17023h = codedInputStream.readStringRequireUtf8();
                                break;
                            case 42:
                                this.f17024i = codedInputStream.readStringRequireUtf8();
                                break;
                            case 50:
                                this.f17025j = codedInputStream.readStringRequireUtf8();
                                break;
                            case 56:
                                this.f17035t = codedInputStream.readInt32();
                                break;
                            case 66:
                                this.f17026k = codedInputStream.readStringRequireUtf8();
                                break;
                            case 72:
                                this.f17036u = codedInputStream.readInt32();
                                break;
                            case 90:
                                this.f17027l = codedInputStream.readStringRequireUtf8();
                                break;
                            case 98:
                                Builder builder2 = this.f17028m != null ? (Timestamp.Builder) this.f17028m.toBuilder() : null;
                                this.f17028m = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f17028m);
                                    this.f17028m = (Timestamp) builder2.buildPartial();
                                    break;
                                }
                            case 120:
                                this.f17040y = codedInputStream.readBool();
                                break;
                            case 130:
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f17033r.isModifiable()) {
                                    this.f17033r = GeneratedMessageLite.mutableCopy(this.f17033r);
                                }
                                this.f17033r.add(readStringRequireUtf8);
                                break;
                            case 136:
                                this.f17041z = codedInputStream.readBool();
                                break;
                            case 144:
                                this.f17034s = codedInputStream.readEnum();
                                break;
                            case 168:
                                this.f17037v = codedInputStream.readInt32();
                                break;
                            case 186:
                                Builder builder3 = this.f17031p != null ? (Timestamp.Builder) this.f17031p.toBuilder() : null;
                                this.f17031p = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f17031p);
                                    this.f17031p = (Timestamp) builder3.buildPartial();
                                    break;
                                }
                            case 192:
                                this.f17038w = codedInputStream.readEnum();
                                break;
                            case 202:
                                Builder builder4 = this.f17032q != null ? (C6922a) this.f17032q.toBuilder() : null;
                                this.f17032q = (UserProto$DisabledNotifications) codedInputStream.readMessage(UserProto$DisabledNotifications.parser(), extensionRegistryLite);
                                if (builder4 == null) {
                                    break;
                                } else {
                                    builder4.mergeFrom(this.f17032q);
                                    this.f17032q = (UserProto$DisabledNotifications) builder4.buildPartial();
                                    break;
                                }
                            case 208:
                                this.f17009A = codedInputStream.readBool();
                                break;
                            case 216:
                                this.f17039x = codedInputStream.readEnum();
                                break;
                            case 224:
                                this.f17010B = codedInputStream.readBool();
                                break;
                            case 234:
                                Builder builder5 = this.f17030o != null ? (Timestamp.Builder) this.f17030o.toBuilder() : null;
                                this.f17030o = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder5 == null) {
                                    break;
                                } else {
                                    builder5.mergeFrom(this.f17030o);
                                    this.f17030o = (Timestamp) builder5.buildPartial();
                                    break;
                                }
                            case 240:
                                this.f17011C = codedInputStream.readInt32();
                                break;
                            case 248:
                                this.f17012D = codedInputStream.readInt32();
                                break;
                            case 256:
                                this.f17013E = codedInputStream.readInt32();
                                break;
                            case 264:
                                this.f17014F = codedInputStream.readInt32();
                                break;
                            case 274:
                                Builder builder6 = this.f17015G != null ? (Timestamp.Builder) this.f17015G.toBuilder() : null;
                                this.f17015G = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder6 == null) {
                                    break;
                                } else {
                                    builder6.mergeFrom(this.f17015G);
                                    this.f17015G = (Timestamp) builder6.buildPartial();
                                    break;
                                }
                            case 282:
                                this.f17016H = codedInputStream.readStringRequireUtf8();
                                break;
                            case 288:
                                this.f17017I = codedInputStream.readEnum();
                                break;
                            case 304:
                                this.f17018J = codedInputStream.readBool();
                                break;
                            case 314:
                                Builder builder7 = this.f17019K != null ? (C6927a) this.f17019K.toBuilder() : null;
                                this.f17019K = (C6926b) codedInputStream.readMessage(C6926b.parser(), extensionRegistryLite);
                                if (builder7 == null) {
                                    break;
                                } else {
                                    builder7.mergeFrom(this.f17019K);
                                    this.f17019K = (C6926b) builder7.buildPartial();
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
                if (f17008M == null) {
                    synchronized (UserProto$User.class) {
                        if (f17008M == null) {
                            f17008M = new DefaultInstanceBasedParser(f17007L);
                        }
                    }
                }
                return f17008M;
            default:
                throw new UnsupportedOperationException();
        }
        return f17007L;
    }

    public String getAvatarUrlPrefix() {
        return this.f17025j;
    }

    public ByteString getAvatarUrlPrefixBytes() {
        return ByteString.copyFromUtf8(this.f17025j);
    }

    public int getAvatarVersion() {
        return this.f17035t;
    }

    public Timestamp getBirthdate() {
        Timestamp timestamp = this.f17015G;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C6947a3 getBlockRelationship() {
        C6947a3 a = C6947a3.m17694a(this.f17039x);
        return a == null ? C6947a3.UNRECOGNIZED : a;
    }

    public int getBlockRelationshipValue() {
        return this.f17039x;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f17029n;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public UserProto$DisabledNotifications getDisabledNotifications() {
        UserProto$DisabledNotifications userProto$DisabledNotifications = this.f17032q;
        return userProto$DisabledNotifications == null ? UserProto$DisabledNotifications.getDefaultInstance() : userProto$DisabledNotifications;
    }

    public C6960b3 getDistanceUnits() {
        C6960b3 a = C6960b3.m17701a(this.f17038w);
        return a == null ? C6960b3.UNRECOGNIZED : a;
    }

    public int getDistanceUnitsValue() {
        return this.f17038w;
    }

    public String getEmail() {
        return this.f17023h;
    }

    public ByteString getEmailBytes() {
        return ByteString.copyFromUtf8(this.f17023h);
    }

    public C6926b getEvents() {
        C6926b bVar = this.f17019K;
        return bVar == null ? C6926b.getDefaultInstance() : bVar;
    }

    public Timestamp getFirstFriendAt() {
        Timestamp timestamp = this.f17031p;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public int getFriendsCount() {
        return this.f17037v;
    }

    public C7278d3 getIdCardStyle() {
        C7278d3 a = C7278d3.m17989a(this.f17017I);
        return a == null ? C7278d3.UNRECOGNIZED : a;
    }

    public int getIdCardStyleValue() {
        return this.f17017I;
    }

    public C7288e3 getMapDisplayOptions() {
        C7288e3 a = C7288e3.m17993a(this.f17034s);
        return a == null ? C7288e3.UNRECOGNIZED : a;
    }

    public int getMapDisplayOptionsValue() {
        return this.f17034s;
    }

    public String getName() {
        return this.f17022g;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.f17022g);
    }

    public int getNetworkMcc() {
        return this.f17013E;
    }

    public int getNetworkMnc() {
        return this.f17014F;
    }

    public boolean getOptOutSuggest() {
        return this.f17018J;
    }

    public String getPassword() {
        return this.f17024i;
    }

    public ByteString getPasswordBytes() {
        return ByteString.copyFromUtf8(this.f17024i);
    }

    public int getPhoneCountryCode() {
        return this.f17036u;
    }

    public String getPhoneNumber() {
        return this.f17026k;
    }

    public ByteString getPhoneNumberBytes() {
        return ByteString.copyFromUtf8(this.f17026k);
    }

    public boolean getPointsOfInterestDisabled() {
        return this.f17009A;
    }

    public boolean getPrivateMode() {
        return this.f17010B;
    }

    public String getRoles(int i) {
        return (String) this.f17033r.get(i);
    }

    public ByteString getRolesBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f17033r.get(i));
    }

    public int getRolesCount() {
        return this.f17033r.size();
    }

    public List<String> getRolesList() {
        return this.f17033r;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f17021f.isEmpty() ? CodedOutputStream.computeStringSize(1, getUuid()) + 0 : 0;
        if (this.f17029n != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, getCreatedAt());
        }
        if (!this.f17022g.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(3, getName());
        }
        if (!this.f17023h.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(4, getEmail());
        }
        if (!this.f17024i.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(5, getPassword());
        }
        if (!this.f17025j.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(6, getAvatarUrlPrefix());
        }
        int i2 = this.f17035t;
        if (i2 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(7, i2);
        }
        if (!this.f17026k.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(8, getPhoneNumber());
        }
        int i3 = this.f17036u;
        if (i3 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(9, i3);
        }
        if (!this.f17027l.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(11, getTimezone());
        }
        if (this.f17028m != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(12, getSuspendedAt());
        }
        boolean z = this.f17040y;
        if (z) {
            computeStringSize += CodedOutputStream.computeBoolSize(15, z);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f17033r.size(); i5++) {
            i4 += CodedOutputStream.computeStringSizeNoTag((String) this.f17033r.get(i5));
        }
        int size = computeStringSize + i4 + (getRolesList().size() * 2);
        boolean z2 = this.f17041z;
        if (z2) {
            size += CodedOutputStream.computeBoolSize(17, z2);
        }
        if (this.f17034s != C7288e3.standard.getNumber()) {
            size += CodedOutputStream.computeEnumSize(18, this.f17034s);
        }
        int i6 = this.f17037v;
        if (i6 != 0) {
            size += CodedOutputStream.computeInt32Size(21, i6);
        }
        if (this.f17031p != null) {
            size += CodedOutputStream.computeMessageSize(23, getFirstFriendAt());
        }
        if (this.f17038w != C6960b3.metric.getNumber()) {
            size += CodedOutputStream.computeEnumSize(24, this.f17038w);
        }
        if (this.f17032q != null) {
            size += CodedOutputStream.computeMessageSize(25, getDisabledNotifications());
        }
        boolean z3 = this.f17009A;
        if (z3) {
            size += CodedOutputStream.computeBoolSize(26, z3);
        }
        if (this.f17039x != C6947a3.UNKNOW.getNumber()) {
            size += CodedOutputStream.computeEnumSize(27, this.f17039x);
        }
        boolean z4 = this.f17010B;
        if (z4) {
            size += CodedOutputStream.computeBoolSize(28, z4);
        }
        if (this.f17030o != null) {
            size += CodedOutputStream.computeMessageSize(29, getUpdatedAt());
        }
        int i7 = this.f17011C;
        if (i7 != 0) {
            size += CodedOutputStream.computeInt32Size(30, i7);
        }
        int i8 = this.f17012D;
        if (i8 != 0) {
            size += CodedOutputStream.computeInt32Size(31, i8);
        }
        int i9 = this.f17013E;
        if (i9 != 0) {
            size += CodedOutputStream.computeInt32Size(32, i9);
        }
        int i10 = this.f17014F;
        if (i10 != 0) {
            size += CodedOutputStream.computeInt32Size(33, i10);
        }
        if (this.f17015G != null) {
            size += CodedOutputStream.computeMessageSize(34, getBirthdate());
        }
        if (!this.f17016H.isEmpty()) {
            size += CodedOutputStream.computeStringSize(35, getUsername());
        }
        if (this.f17017I != C7278d3.CLASSIC.getNumber()) {
            size += CodedOutputStream.computeEnumSize(36, this.f17017I);
        }
        boolean z5 = this.f17018J;
        if (z5) {
            size += CodedOutputStream.computeBoolSize(38, z5);
        }
        if (this.f17019K != null) {
            size += CodedOutputStream.computeMessageSize(39, getEvents());
        }
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean getShowSkiMaps() {
        return this.f17041z;
    }

    public int getSimMcc() {
        return this.f17011C;
    }

    public int getSimMnc() {
        return this.f17012D;
    }

    public Timestamp getSuspendedAt() {
        Timestamp timestamp = this.f17028m;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getTimezone() {
        return this.f17027l;
    }

    public ByteString getTimezoneBytes() {
        return ByteString.copyFromUtf8(this.f17027l);
    }

    public Timestamp getUpdatedAt() {
        Timestamp timestamp = this.f17030o;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getUsername() {
        return this.f17016H;
    }

    public ByteString getUsernameBytes() {
        return ByteString.copyFromUtf8(this.f17016H);
    }

    public String getUuid() {
        return this.f17021f;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f17021f);
    }

    public boolean getVoip() {
        return this.f17040y;
    }

    public boolean hasBirthdate() {
        return this.f17015G != null;
    }

    public boolean hasCreatedAt() {
        return this.f17029n != null;
    }

    public boolean hasDisabledNotifications() {
        return this.f17032q != null;
    }

    public boolean hasEvents() {
        return this.f17019K != null;
    }

    public boolean hasFirstFriendAt() {
        return this.f17031p != null;
    }

    public boolean hasSuspendedAt() {
        return this.f17028m != null;
    }

    public boolean hasUpdatedAt() {
        return this.f17030o != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17021f.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (this.f17029n != null) {
            codedOutputStream.writeMessage(2, getCreatedAt());
        }
        if (!this.f17022g.isEmpty()) {
            codedOutputStream.writeString(3, getName());
        }
        if (!this.f17023h.isEmpty()) {
            codedOutputStream.writeString(4, getEmail());
        }
        if (!this.f17024i.isEmpty()) {
            codedOutputStream.writeString(5, getPassword());
        }
        if (!this.f17025j.isEmpty()) {
            codedOutputStream.writeString(6, getAvatarUrlPrefix());
        }
        int i = this.f17035t;
        if (i != 0) {
            codedOutputStream.writeInt32(7, i);
        }
        if (!this.f17026k.isEmpty()) {
            codedOutputStream.writeString(8, getPhoneNumber());
        }
        int i2 = this.f17036u;
        if (i2 != 0) {
            codedOutputStream.writeInt32(9, i2);
        }
        if (!this.f17027l.isEmpty()) {
            codedOutputStream.writeString(11, getTimezone());
        }
        if (this.f17028m != null) {
            codedOutputStream.writeMessage(12, getSuspendedAt());
        }
        boolean z = this.f17040y;
        if (z) {
            codedOutputStream.writeBool(15, z);
        }
        for (int i3 = 0; i3 < this.f17033r.size(); i3++) {
            codedOutputStream.writeString(16, (String) this.f17033r.get(i3));
        }
        boolean z2 = this.f17041z;
        if (z2) {
            codedOutputStream.writeBool(17, z2);
        }
        if (this.f17034s != C7288e3.standard.getNumber()) {
            codedOutputStream.writeEnum(18, this.f17034s);
        }
        int i4 = this.f17037v;
        if (i4 != 0) {
            codedOutputStream.writeInt32(21, i4);
        }
        if (this.f17031p != null) {
            codedOutputStream.writeMessage(23, getFirstFriendAt());
        }
        if (this.f17038w != C6960b3.metric.getNumber()) {
            codedOutputStream.writeEnum(24, this.f17038w);
        }
        if (this.f17032q != null) {
            codedOutputStream.writeMessage(25, getDisabledNotifications());
        }
        boolean z3 = this.f17009A;
        if (z3) {
            codedOutputStream.writeBool(26, z3);
        }
        if (this.f17039x != C6947a3.UNKNOW.getNumber()) {
            codedOutputStream.writeEnum(27, this.f17039x);
        }
        boolean z4 = this.f17010B;
        if (z4) {
            codedOutputStream.writeBool(28, z4);
        }
        if (this.f17030o != null) {
            codedOutputStream.writeMessage(29, getUpdatedAt());
        }
        int i5 = this.f17011C;
        if (i5 != 0) {
            codedOutputStream.writeInt32(30, i5);
        }
        int i6 = this.f17012D;
        if (i6 != 0) {
            codedOutputStream.writeInt32(31, i6);
        }
        int i7 = this.f17013E;
        if (i7 != 0) {
            codedOutputStream.writeInt32(32, i7);
        }
        int i8 = this.f17014F;
        if (i8 != 0) {
            codedOutputStream.writeInt32(33, i8);
        }
        if (this.f17015G != null) {
            codedOutputStream.writeMessage(34, getBirthdate());
        }
        if (!this.f17016H.isEmpty()) {
            codedOutputStream.writeString(35, getUsername());
        }
        if (this.f17017I != C7278d3.CLASSIC.getNumber()) {
            codedOutputStream.writeEnum(36, this.f17017I);
        }
        boolean z5 = this.f17018J;
        if (z5) {
            codedOutputStream.writeBool(38, z5);
        }
        if (this.f17019K != null) {
            codedOutputStream.writeMessage(39, getEvents());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m17676c(boolean z) {
        this.f17041z = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m17674b(boolean z) {
        this.f17010B = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17664a(UserProto$DisabledNotifications userProto$DisabledNotifications) {
        if (userProto$DisabledNotifications != null) {
            this.f17032q = userProto$DisabledNotifications;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17663a(Timestamp timestamp) {
        if (timestamp != null) {
            this.f17015G = timestamp;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17670a(String str) {
        if (str != null) {
            this.f17016H = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17662a(int i) {
        this.f17017I = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17671a(boolean z) {
        this.f17018J = z;
    }
}
