package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.UserProto$UserEngagementStats */
public final class UserProto$UserEngagementStats extends GeneratedMessageLite<UserProto$UserEngagementStats, C6928a> implements UserProto$UserEngagementStatsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final UserProto$UserEngagementStats f17045i = new UserProto$UserEngagementStats();

    /* renamed from: j */
    private static volatile Parser<UserProto$UserEngagementStats> f17046j;

    /* renamed from: e */
    private int f17047e;

    /* renamed from: f */
    private boolean f17048f;

    /* renamed from: g */
    private int f17049g;

    /* renamed from: h */
    private C6931c f17050h;

    /* renamed from: co.znly.models.UserProto$UserEngagementStats$StreakOrBuilder */
    public interface StreakOrBuilder extends MessageLiteOrBuilder {
        Timestamp getEnd();

        Timestamp getStart();

        boolean hasEnd();

        boolean hasStart();
    }

    /* renamed from: co.znly.models.UserProto$UserEngagementStats$a */
    public static final class C6928a extends Builder<UserProto$UserEngagementStats, C6928a> implements UserProto$UserEngagementStatsOrBuilder {
        /* synthetic */ C6928a(C7519z2 z2Var) {
            this();
        }

        public int getCurrentFriendsCount() {
            return ((UserProto$UserEngagementStats) this.instance).getCurrentFriendsCount();
        }

        public C6931c getCurrentStreak() {
            return ((UserProto$UserEngagementStats) this.instance).getCurrentStreak();
        }

        public boolean getHasProfilePicture() {
            return ((UserProto$UserEngagementStats) this.instance).getHasProfilePicture();
        }

        public C6929b getLevel() {
            return ((UserProto$UserEngagementStats) this.instance).getLevel();
        }

        public int getLevelValue() {
            return ((UserProto$UserEngagementStats) this.instance).getLevelValue();
        }

        public boolean hasCurrentStreak() {
            return ((UserProto$UserEngagementStats) this.instance).hasCurrentStreak();
        }

        private C6928a() {
            super(UserProto$UserEngagementStats.f17045i);
        }
    }

    /* renamed from: co.znly.models.UserProto$UserEngagementStats$b */
    public enum C6929b implements EnumLite {
        BABY(0),
        LEADER(10),
        VIP(20),
        STAR(30),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f17057e;

        /* renamed from: co.znly.models.UserProto$UserEngagementStats$b$a */
        class C6930a implements EnumLiteMap<C6929b> {
            C6930a() {
            }

            public C6929b findValueByNumber(int i) {
                return C6929b.m17686a(i);
            }
        }

        static {
            new C6930a();
        }

        private C6929b(int i) {
            this.f17057e = i;
        }

        /* renamed from: a */
        public static C6929b m17686a(int i) {
            if (i == 0) {
                return BABY;
            }
            if (i == 10) {
                return LEADER;
            }
            if (i == 20) {
                return VIP;
            }
            if (i != 30) {
                return null;
            }
            return STAR;
        }

        public final int getNumber() {
            return this.f17057e;
        }
    }

    /* renamed from: co.znly.models.UserProto$UserEngagementStats$c */
    public static final class C6931c extends GeneratedMessageLite<C6931c, C6932a> implements StreakOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C6931c f17058g = new C6931c();

        /* renamed from: h */
        private static volatile Parser<C6931c> f17059h;

        /* renamed from: e */
        private Timestamp f17060e;

        /* renamed from: f */
        private Timestamp f17061f;

        /* renamed from: co.znly.models.UserProto$UserEngagementStats$c$a */
        public static final class C6932a extends Builder<C6931c, C6932a> implements StreakOrBuilder {
            /* synthetic */ C6932a(C7519z2 z2Var) {
                this();
            }

            public Timestamp getEnd() {
                return ((C6931c) this.instance).getEnd();
            }

            public Timestamp getStart() {
                return ((C6931c) this.instance).getStart();
            }

            public boolean hasEnd() {
                return ((C6931c) this.instance).hasEnd();
            }

            public boolean hasStart() {
                return ((C6931c) this.instance).hasStart();
            }

            private C6932a() {
                super(C6931c.f17058g);
            }
        }

        static {
            f17058g.makeImmutable();
        }

        private C6931c() {
        }

        public static C6931c getDefaultInstance() {
            return f17058g;
        }

        public static Parser<C6931c> parser() {
            return f17058g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C7519z2.f18891a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6931c();
                case 2:
                    return f17058g;
                case 3:
                    return null;
                case 4:
                    return new C6932a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6931c cVar = (C6931c) obj2;
                    this.f17060e = (Timestamp) visitor.visitMessage(this.f17060e, cVar.f17060e);
                    this.f17061f = (Timestamp) visitor.visitMessage(this.f17061f, cVar.f17061f);
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
                                    Builder builder = this.f17060e != null ? (Timestamp.Builder) this.f17060e.toBuilder() : null;
                                    this.f17060e = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f17060e);
                                        this.f17060e = (Timestamp) builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    Builder builder2 = this.f17061f != null ? (Timestamp.Builder) this.f17061f.toBuilder() : null;
                                    this.f17061f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder2 != null) {
                                        builder2.mergeFrom(this.f17061f);
                                        this.f17061f = (Timestamp) builder2.buildPartial();
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
                    if (f17059h == null) {
                        synchronized (C6931c.class) {
                            if (f17059h == null) {
                                f17059h = new DefaultInstanceBasedParser(f17058g);
                            }
                        }
                    }
                    return f17059h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17058g;
        }

        public Timestamp getEnd() {
            Timestamp timestamp = this.f17061f;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f17060e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getStart());
            }
            if (this.f17061f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getEnd());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public Timestamp getStart() {
            Timestamp timestamp = this.f17060e;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public boolean hasEnd() {
            return this.f17061f != null;
        }

        public boolean hasStart() {
            return this.f17060e != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f17060e != null) {
                codedOutputStream.writeMessage(1, getStart());
            }
            if (this.f17061f != null) {
                codedOutputStream.writeMessage(2, getEnd());
            }
        }
    }

    static {
        f17045i.makeImmutable();
    }

    private UserProto$UserEngagementStats() {
    }

    public static UserProto$UserEngagementStats getDefaultInstance() {
        return f17045i;
    }

    public static Parser<UserProto$UserEngagementStats> parser() {
        return f17045i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7519z2.f18891a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserProto$UserEngagementStats();
            case 2:
                return f17045i;
            case 3:
                return null;
            case 4:
                return new C6928a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                UserProto$UserEngagementStats userProto$UserEngagementStats = (UserProto$UserEngagementStats) obj2;
                this.f17047e = visitor.visitInt(this.f17047e != 0, this.f17047e, userProto$UserEngagementStats.f17047e != 0, userProto$UserEngagementStats.f17047e);
                boolean z2 = this.f17048f;
                boolean z3 = userProto$UserEngagementStats.f17048f;
                this.f17048f = visitor.visitBoolean(z2, z2, z3, z3);
                boolean z4 = this.f17049g != 0;
                int i = this.f17049g;
                if (userProto$UserEngagementStats.f17049g != 0) {
                    z = true;
                }
                this.f17049g = visitor.visitInt(z4, i, z, userProto$UserEngagementStats.f17049g);
                this.f17050h = (C6931c) visitor.visitMessage(this.f17050h, userProto$UserEngagementStats.f17050h);
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
                                this.f17047e = codedInputStream.readEnum();
                            } else if (readTag == 16) {
                                this.f17048f = codedInputStream.readBool();
                            } else if (readTag == 24) {
                                this.f17049g = codedInputStream.readInt32();
                            } else if (readTag == 34) {
                                Builder builder = this.f17050h != null ? (C6932a) this.f17050h.toBuilder() : null;
                                this.f17050h = (C6931c) codedInputStream.readMessage(C6931c.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17050h);
                                    this.f17050h = (C6931c) builder.buildPartial();
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
                if (f17046j == null) {
                    synchronized (UserProto$UserEngagementStats.class) {
                        if (f17046j == null) {
                            f17046j = new DefaultInstanceBasedParser(f17045i);
                        }
                    }
                }
                return f17046j;
            default:
                throw new UnsupportedOperationException();
        }
        return f17045i;
    }

    public int getCurrentFriendsCount() {
        return this.f17049g;
    }

    public C6931c getCurrentStreak() {
        C6931c cVar = this.f17050h;
        return cVar == null ? C6931c.getDefaultInstance() : cVar;
    }

    public boolean getHasProfilePicture() {
        return this.f17048f;
    }

    public C6929b getLevel() {
        C6929b a = C6929b.m17686a(this.f17047e);
        return a == null ? C6929b.UNRECOGNIZED : a;
    }

    public int getLevelValue() {
        return this.f17047e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17047e != C6929b.BABY.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f17047e);
        }
        boolean z = this.f17048f;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(2, z);
        }
        int i3 = this.f17049g;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(3, i3);
        }
        if (this.f17050h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getCurrentStreak());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasCurrentStreak() {
        return this.f17050h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17047e != C6929b.BABY.getNumber()) {
            codedOutputStream.writeEnum(1, this.f17047e);
        }
        boolean z = this.f17048f;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
        int i = this.f17049g;
        if (i != 0) {
            codedOutputStream.writeInt32(3, i);
        }
        if (this.f17050h != null) {
            codedOutputStream.writeMessage(4, getCurrentStreak());
        }
    }
}
