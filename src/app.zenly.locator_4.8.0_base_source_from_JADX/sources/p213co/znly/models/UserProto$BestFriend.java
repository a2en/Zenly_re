package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
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

/* renamed from: co.znly.models.UserProto$BestFriend */
public final class UserProto$BestFriend extends GeneratedMessageLite<UserProto$BestFriend, C6917a> implements UserProto$BestFriendOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final UserProto$BestFriend f16980i = new UserProto$BestFriend();

    /* renamed from: j */
    private static volatile Parser<UserProto$BestFriend> f16981j;

    /* renamed from: e */
    private String f16982e = "";

    /* renamed from: f */
    private int f16983f;

    /* renamed from: g */
    private Timestamp f16984g;

    /* renamed from: h */
    private C6918b f16985h;

    /* renamed from: co.znly.models.UserProto$BestFriend$FactsOrBuilder */
    public interface FactsOrBuilder extends MessageLiteOrBuilder {
        Timestamp getBeginsAt();

        int getCurrentWeekStreak();

        int getLongestWeekStreak();

        boolean hasBeginsAt();
    }

    /* renamed from: co.znly.models.UserProto$BestFriend$a */
    public static final class C6917a extends Builder<UserProto$BestFriend, C6917a> implements UserProto$BestFriendOrBuilder {
        /* synthetic */ C6917a(C7519z2 z2Var) {
            this();
        }

        public C6918b getFacts() {
            return ((UserProto$BestFriend) this.instance).getFacts();
        }

        public String getFriendUserUuid() {
            return ((UserProto$BestFriend) this.instance).getFriendUserUuid();
        }

        public ByteString getFriendUserUuidBytes() {
            return ((UserProto$BestFriend) this.instance).getFriendUserUuidBytes();
        }

        public C6920c getLevel() {
            return ((UserProto$BestFriend) this.instance).getLevel();
        }

        public int getLevelValue() {
            return ((UserProto$BestFriend) this.instance).getLevelValue();
        }

        public Timestamp getValidUntil() {
            return ((UserProto$BestFriend) this.instance).getValidUntil();
        }

        public boolean hasFacts() {
            return ((UserProto$BestFriend) this.instance).hasFacts();
        }

        public boolean hasValidUntil() {
            return ((UserProto$BestFriend) this.instance).hasValidUntil();
        }

        private C6917a() {
            super(UserProto$BestFriend.f16980i);
        }
    }

    /* renamed from: co.znly.models.UserProto$BestFriend$b */
    public static final class C6918b extends GeneratedMessageLite<C6918b, C6919a> implements FactsOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C6918b f16986h = new C6918b();

        /* renamed from: i */
        private static volatile Parser<C6918b> f16987i;

        /* renamed from: e */
        private int f16988e;

        /* renamed from: f */
        private int f16989f;

        /* renamed from: g */
        private Timestamp f16990g;

        /* renamed from: co.znly.models.UserProto$BestFriend$b$a */
        public static final class C6919a extends Builder<C6918b, C6919a> implements FactsOrBuilder {
            /* synthetic */ C6919a(C7519z2 z2Var) {
                this();
            }

            public Timestamp getBeginsAt() {
                return ((C6918b) this.instance).getBeginsAt();
            }

            public int getCurrentWeekStreak() {
                return ((C6918b) this.instance).getCurrentWeekStreak();
            }

            public int getLongestWeekStreak() {
                return ((C6918b) this.instance).getLongestWeekStreak();
            }

            public boolean hasBeginsAt() {
                return ((C6918b) this.instance).hasBeginsAt();
            }

            private C6919a() {
                super(C6918b.f16986h);
            }
        }

        static {
            f16986h.makeImmutable();
        }

        private C6918b() {
        }

        public static C6918b getDefaultInstance() {
            return f16986h;
        }

        public static Parser<C6918b> parser() {
            return f16986h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7519z2.f18891a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6918b();
                case 2:
                    return f16986h;
                case 3:
                    return null;
                case 4:
                    return new C6919a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6918b bVar = (C6918b) obj2;
                    this.f16988e = visitor.visitInt(this.f16988e != 0, this.f16988e, bVar.f16988e != 0, bVar.f16988e);
                    boolean z2 = this.f16989f != 0;
                    int i = this.f16989f;
                    if (bVar.f16989f != 0) {
                        z = true;
                    }
                    this.f16989f = visitor.visitInt(z2, i, z, bVar.f16989f);
                    this.f16990g = (Timestamp) visitor.visitMessage(this.f16990g, bVar.f16990g);
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
                                    this.f16988e = codedInputStream.readInt32();
                                } else if (readTag == 16) {
                                    this.f16989f = codedInputStream.readInt32();
                                } else if (readTag == 26) {
                                    Builder builder = this.f16990g != null ? (Timestamp.Builder) this.f16990g.toBuilder() : null;
                                    this.f16990g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16990g);
                                        this.f16990g = (Timestamp) builder.buildPartial();
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
                    if (f16987i == null) {
                        synchronized (C6918b.class) {
                            if (f16987i == null) {
                                f16987i = new DefaultInstanceBasedParser(f16986h);
                            }
                        }
                    }
                    return f16987i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16986h;
        }

        public Timestamp getBeginsAt() {
            Timestamp timestamp = this.f16990g;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public int getCurrentWeekStreak() {
            return this.f16988e;
        }

        public int getLongestWeekStreak() {
            return this.f16989f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int i3 = this.f16988e;
            if (i3 != 0) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
            }
            int i4 = this.f16989f;
            if (i4 != 0) {
                i2 += CodedOutputStream.computeInt32Size(2, i4);
            }
            if (this.f16990g != null) {
                i2 += CodedOutputStream.computeMessageSize(3, getBeginsAt());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasBeginsAt() {
            return this.f16990g != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.f16988e;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            int i2 = this.f16989f;
            if (i2 != 0) {
                codedOutputStream.writeInt32(2, i2);
            }
            if (this.f16990g != null) {
                codedOutputStream.writeMessage(3, getBeginsAt());
            }
        }
    }

    /* renamed from: co.znly.models.UserProto$BestFriend$c */
    public enum C6920c implements EnumLite {
        NONE(0),
        CANDIDATE(10),
        STANDARD(20),
        SUPER(30),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f16997e;

        /* renamed from: co.znly.models.UserProto$BestFriend$c$a */
        class C6921a implements EnumLiteMap<C6920c> {
            C6921a() {
            }

            public C6920c findValueByNumber(int i) {
                return C6920c.m17643a(i);
            }
        }

        static {
            new C6921a();
        }

        private C6920c(int i) {
            this.f16997e = i;
        }

        /* renamed from: a */
        public static C6920c m17643a(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i == 10) {
                return CANDIDATE;
            }
            if (i == 20) {
                return STANDARD;
            }
            if (i != 30) {
                return null;
            }
            return SUPER;
        }

        public final int getNumber() {
            return this.f16997e;
        }
    }

    static {
        f16980i.makeImmutable();
    }

    private UserProto$BestFriend() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7519z2.f18891a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserProto$BestFriend();
            case 2:
                return f16980i;
            case 3:
                return null;
            case 4:
                return new C6917a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                UserProto$BestFriend userProto$BestFriend = (UserProto$BestFriend) obj2;
                this.f16982e = visitor.visitString(!this.f16982e.isEmpty(), this.f16982e, !userProto$BestFriend.f16982e.isEmpty(), userProto$BestFriend.f16982e);
                boolean z2 = this.f16983f != 0;
                int i = this.f16983f;
                if (userProto$BestFriend.f16983f != 0) {
                    z = true;
                }
                this.f16983f = visitor.visitInt(z2, i, z, userProto$BestFriend.f16983f);
                this.f16984g = (Timestamp) visitor.visitMessage(this.f16984g, userProto$BestFriend.f16984g);
                this.f16985h = (C6918b) visitor.visitMessage(this.f16985h, userProto$BestFriend.f16985h);
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
                                this.f16982e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f16983f = codedInputStream.readEnum();
                            } else if (readTag == 26) {
                                Builder builder = this.f16984g != null ? (Timestamp.Builder) this.f16984g.toBuilder() : null;
                                this.f16984g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f16984g);
                                    this.f16984g = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 34) {
                                Builder builder2 = this.f16985h != null ? (C6919a) this.f16985h.toBuilder() : null;
                                this.f16985h = (C6918b) codedInputStream.readMessage(C6918b.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f16985h);
                                    this.f16985h = (C6918b) builder2.buildPartial();
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
                if (f16981j == null) {
                    synchronized (UserProto$BestFriend.class) {
                        if (f16981j == null) {
                            f16981j = new DefaultInstanceBasedParser(f16980i);
                        }
                    }
                }
                return f16981j;
            default:
                throw new UnsupportedOperationException();
        }
        return f16980i;
    }

    public C6918b getFacts() {
        C6918b bVar = this.f16985h;
        return bVar == null ? C6918b.getDefaultInstance() : bVar;
    }

    public String getFriendUserUuid() {
        return this.f16982e;
    }

    public ByteString getFriendUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f16982e);
    }

    public C6920c getLevel() {
        C6920c a = C6920c.m17643a(this.f16983f);
        return a == null ? C6920c.UNRECOGNIZED : a;
    }

    public int getLevelValue() {
        return this.f16983f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f16982e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getFriendUserUuid());
        }
        if (this.f16983f != C6920c.NONE.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f16983f);
        }
        if (this.f16984g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getValidUntil());
        }
        if (this.f16985h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getFacts());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Timestamp getValidUntil() {
        Timestamp timestamp = this.f16984g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasFacts() {
        return this.f16985h != null;
    }

    public boolean hasValidUntil() {
        return this.f16984g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f16982e.isEmpty()) {
            codedOutputStream.writeString(1, getFriendUserUuid());
        }
        if (this.f16983f != C6920c.NONE.getNumber()) {
            codedOutputStream.writeEnum(2, this.f16983f);
        }
        if (this.f16984g != null) {
            codedOutputStream.writeMessage(3, getValidUntil());
        }
        if (this.f16985h != null) {
            codedOutputStream.writeMessage(4, getFacts());
        }
    }
}
