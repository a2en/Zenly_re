package p213co.znly.models.services;

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
import p213co.znly.models.UserProto$BestFriend.C6918b;
import p213co.znly.models.UserProto$BestFriend.C6918b.C6919a;
import p213co.znly.models.UserProto$BestFriend.C6920c;
import p213co.znly.models.timetogether.C8433b;

/* renamed from: co.znly.models.services.ZenlyProto$BestFriend */
public final class ZenlyProto$BestFriend extends GeneratedMessageLite<ZenlyProto$BestFriend, C7937a> implements ZenlyProto$BestFriendOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final ZenlyProto$BestFriend f20123k = new ZenlyProto$BestFriend();

    /* renamed from: l */
    private static volatile Parser<ZenlyProto$BestFriend> f20124l;

    /* renamed from: e */
    private int f20125e;

    /* renamed from: f */
    private String f20126f = "";

    /* renamed from: g */
    private int f20127g;

    /* renamed from: h */
    private C6918b f20128h;

    /* renamed from: i */
    private ProtobufList<C7938b> f20129i = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: j */
    private Timestamp f20130j;

    /* renamed from: co.znly.models.services.ZenlyProto$BestFriend$CategoryOrBuilder */
    public interface CategoryOrBuilder extends MessageLiteOrBuilder {
        Timestamp getBestSince();

        C8433b getCategory();

        int getCategoryValue();

        boolean hasBestSince();
    }

    /* renamed from: co.znly.models.services.ZenlyProto$BestFriend$a */
    public static final class C7937a extends Builder<ZenlyProto$BestFriend, C7937a> implements ZenlyProto$BestFriendOrBuilder {
        private C7937a() {
            super(ZenlyProto$BestFriend.f20123k);
        }

        /* synthetic */ C7937a(C8104i0 i0Var) {
            this();
        }

        public C7938b getCategories(int i) {
            return ((ZenlyProto$BestFriend) this.instance).getCategories(i);
        }

        public int getCategoriesCount() {
            return ((ZenlyProto$BestFriend) this.instance).getCategoriesCount();
        }

        public List<C7938b> getCategoriesList() {
            return Collections.unmodifiableList(((ZenlyProto$BestFriend) this.instance).getCategoriesList());
        }

        public C6918b getFacts() {
            return ((ZenlyProto$BestFriend) this.instance).getFacts();
        }

        public C6920c getLevel() {
            return ((ZenlyProto$BestFriend) this.instance).getLevel();
        }

        public int getLevelValue() {
            return ((ZenlyProto$BestFriend) this.instance).getLevelValue();
        }

        public String getUserUuid() {
            return ((ZenlyProto$BestFriend) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((ZenlyProto$BestFriend) this.instance).getUserUuidBytes();
        }

        public Timestamp getValidUntil() {
            return ((ZenlyProto$BestFriend) this.instance).getValidUntil();
        }

        public boolean hasFacts() {
            return ((ZenlyProto$BestFriend) this.instance).hasFacts();
        }

        public boolean hasValidUntil() {
            return ((ZenlyProto$BestFriend) this.instance).hasValidUntil();
        }
    }

    /* renamed from: co.znly.models.services.ZenlyProto$BestFriend$b */
    public static final class C7938b extends GeneratedMessageLite<C7938b, C7939a> implements CategoryOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C7938b f20131g = new C7938b();

        /* renamed from: h */
        private static volatile Parser<C7938b> f20132h;

        /* renamed from: e */
        private int f20133e;

        /* renamed from: f */
        private Timestamp f20134f;

        /* renamed from: co.znly.models.services.ZenlyProto$BestFriend$b$a */
        public static final class C7939a extends Builder<C7938b, C7939a> implements CategoryOrBuilder {
            private C7939a() {
                super(C7938b.f20131g);
            }

            /* synthetic */ C7939a(C8104i0 i0Var) {
                this();
            }

            public Timestamp getBestSince() {
                return ((C7938b) this.instance).getBestSince();
            }

            public C8433b getCategory() {
                return ((C7938b) this.instance).getCategory();
            }

            public int getCategoryValue() {
                return ((C7938b) this.instance).getCategoryValue();
            }

            public boolean hasBestSince() {
                return ((C7938b) this.instance).hasBestSince();
            }
        }

        static {
            f20131g.makeImmutable();
        }

        private C7938b() {
        }

        public static Parser<C7938b> parser() {
            return f20131g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7938b();
                case 2:
                    return f20131g;
                case 3:
                    return null;
                case 4:
                    return new C7939a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7938b bVar = (C7938b) obj2;
                    boolean z2 = this.f20133e != 0;
                    int i = this.f20133e;
                    if (bVar.f20133e != 0) {
                        z = true;
                    }
                    this.f20133e = visitor.visitInt(z2, i, z, bVar.f20133e);
                    this.f20134f = (Timestamp) visitor.visitMessage(this.f20134f, bVar.f20134f);
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
                                    this.f20133e = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    Builder builder = this.f20134f != null ? (Timestamp.Builder) this.f20134f.toBuilder() : null;
                                    this.f20134f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f20134f);
                                        this.f20134f = (Timestamp) builder.buildPartial();
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
                    if (f20132h == null) {
                        synchronized (C7938b.class) {
                            if (f20132h == null) {
                                f20132h = new DefaultInstanceBasedParser(f20131g);
                            }
                        }
                    }
                    return f20132h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f20131g;
        }

        public Timestamp getBestSince() {
            Timestamp timestamp = this.f20134f;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public C8433b getCategory() {
            C8433b a = C8433b.m19506a(this.f20133e);
            return a == null ? C8433b.UNRECOGNIZED : a;
        }

        public int getCategoryValue() {
            return this.f20133e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f20133e != C8433b.UNKNOWN_CATEGORY.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20133e);
            }
            if (this.f20134f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getBestSince());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasBestSince() {
            return this.f20134f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f20133e != C8433b.UNKNOWN_CATEGORY.getNumber()) {
                codedOutputStream.writeEnum(1, this.f20133e);
            }
            if (this.f20134f != null) {
                codedOutputStream.writeMessage(2, getBestSince());
            }
        }
    }

    static {
        f20123k.makeImmutable();
    }

    private ZenlyProto$BestFriend() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new ZenlyProto$BestFriend();
            case 2:
                return f20123k;
            case 3:
                this.f20129i.makeImmutable();
                return null;
            case 4:
                return new C7937a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                ZenlyProto$BestFriend zenlyProto$BestFriend = (ZenlyProto$BestFriend) obj2;
                this.f20126f = visitor.visitString(!this.f20126f.isEmpty(), this.f20126f, !zenlyProto$BestFriend.f20126f.isEmpty(), zenlyProto$BestFriend.f20126f);
                boolean z2 = this.f20127g != 0;
                int i = this.f20127g;
                if (zenlyProto$BestFriend.f20127g != 0) {
                    z = true;
                }
                this.f20127g = visitor.visitInt(z2, i, z, zenlyProto$BestFriend.f20127g);
                this.f20128h = (C6918b) visitor.visitMessage(this.f20128h, zenlyProto$BestFriend.f20128h);
                this.f20129i = visitor.visitList(this.f20129i, zenlyProto$BestFriend.f20129i);
                this.f20130j = (Timestamp) visitor.visitMessage(this.f20130j, zenlyProto$BestFriend.f20130j);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20125e |= zenlyProto$BestFriend.f20125e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f20126f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f20127g = codedInputStream.readEnum();
                            } else if (readTag == 26) {
                                Builder builder = this.f20128h != null ? (C6919a) this.f20128h.toBuilder() : null;
                                this.f20128h = (C6918b) codedInputStream.readMessage(C6918b.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20128h);
                                    this.f20128h = (C6918b) builder.buildPartial();
                                }
                            } else if (readTag == 42) {
                                if (!this.f20129i.isModifiable()) {
                                    this.f20129i = GeneratedMessageLite.mutableCopy(this.f20129i);
                                }
                                this.f20129i.add(codedInputStream.readMessage(C7938b.parser(), extensionRegistryLite));
                            } else if (readTag == 50) {
                                Builder builder2 = this.f20130j != null ? (Timestamp.Builder) this.f20130j.toBuilder() : null;
                                this.f20130j = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20130j);
                                    this.f20130j = (Timestamp) builder2.buildPartial();
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
                if (f20124l == null) {
                    synchronized (ZenlyProto$BestFriend.class) {
                        if (f20124l == null) {
                            f20124l = new DefaultInstanceBasedParser(f20123k);
                        }
                    }
                }
                return f20124l;
            default:
                throw new UnsupportedOperationException();
        }
        return f20123k;
    }

    public C7938b getCategories(int i) {
        return (C7938b) this.f20129i.get(i);
    }

    public int getCategoriesCount() {
        return this.f20129i.size();
    }

    public List<C7938b> getCategoriesList() {
        return this.f20129i;
    }

    public C6918b getFacts() {
        C6918b bVar = this.f20128h;
        return bVar == null ? C6918b.getDefaultInstance() : bVar;
    }

    public C6920c getLevel() {
        C6920c a = C6920c.m17643a(this.f20127g);
        return a == null ? C6920c.UNRECOGNIZED : a;
    }

    public int getLevelValue() {
        return this.f20127g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f20126f.isEmpty() ? CodedOutputStream.computeStringSize(1, getUserUuid()) + 0 : 0;
        if (this.f20127g != C6920c.NONE.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(2, this.f20127g);
        }
        if (this.f20128h != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(3, getFacts());
        }
        for (int i2 = 0; i2 < this.f20129i.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f20129i.get(i2));
        }
        if (this.f20130j != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(6, getValidUntil());
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public String getUserUuid() {
        return this.f20126f;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f20126f);
    }

    public Timestamp getValidUntil() {
        Timestamp timestamp = this.f20130j;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasFacts() {
        return this.f20128h != null;
    }

    public boolean hasValidUntil() {
        return this.f20130j != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20126f.isEmpty()) {
            codedOutputStream.writeString(1, getUserUuid());
        }
        if (this.f20127g != C6920c.NONE.getNumber()) {
            codedOutputStream.writeEnum(2, this.f20127g);
        }
        if (this.f20128h != null) {
            codedOutputStream.writeMessage(3, getFacts());
        }
        for (int i = 0; i < this.f20129i.size(); i++) {
            codedOutputStream.writeMessage(5, (MessageLite) this.f20129i.get(i));
        }
        if (this.f20130j != null) {
            codedOutputStream.writeMessage(6, getValidUntil());
        }
    }
}
