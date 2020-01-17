package p213co.znly.models.core;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.IntList;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ListAdapter;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ListAdapter.Converter;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$BestFriend.C6918b;
import p213co.znly.models.UserProto$BestFriend.C6918b.C6919a;
import p213co.znly.models.UserProto$BestFriend.C6920c;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;
import p213co.znly.models.services.ZenlyProto$BestFriend.C7938b;
import p213co.znly.models.timetogether.C8433b;

/* renamed from: co.znly.models.core.s0 */
public final class C7210s0 extends GeneratedMessageLite<C7210s0, C7212b> implements CoreUserProto$BestFriendOrBuilder {

    /* renamed from: l */
    private static final Converter<Integer, C8433b> f17882l = new C7211a();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C7210s0 f17883m = new C7210s0();

    /* renamed from: n */
    private static volatile Parser<C7210s0> f17884n;

    /* renamed from: e */
    private int f17885e;

    /* renamed from: f */
    private UserProto$User f17886f;

    /* renamed from: g */
    private int f17887g;

    /* renamed from: h */
    private C6918b f17888h;

    /* renamed from: i */
    private IntList f17889i = GeneratedMessageLite.emptyIntList();

    /* renamed from: j */
    private ProtobufList<C7938b> f17890j = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: k */
    private Timestamp f17891k;

    /* renamed from: co.znly.models.core.s0$a */
    class C7211a implements Converter<Integer, C8433b> {
        C7211a() {
        }

        /* renamed from: a */
        public C8433b convert(Integer num) {
            C8433b a = C8433b.m19506a(num.intValue());
            return a == null ? C8433b.UNRECOGNIZED : a;
        }
    }

    /* renamed from: co.znly.models.core.s0$b */
    public static final class C7212b extends Builder<C7210s0, C7212b> implements CoreUserProto$BestFriendOrBuilder {
        /* synthetic */ C7212b(C7203r0 r0Var) {
            this();
        }

        public C7938b getBestCategories(int i) {
            return ((C7210s0) this.instance).getBestCategories(i);
        }

        public int getBestCategoriesCount() {
            return ((C7210s0) this.instance).getBestCategoriesCount();
        }

        public List<C7938b> getBestCategoriesList() {
            return Collections.unmodifiableList(((C7210s0) this.instance).getBestCategoriesList());
        }

        public C8433b getCategories(int i) {
            return ((C7210s0) this.instance).getCategories(i);
        }

        public int getCategoriesCount() {
            return ((C7210s0) this.instance).getCategoriesCount();
        }

        public List<C8433b> getCategoriesList() {
            return ((C7210s0) this.instance).getCategoriesList();
        }

        public int getCategoriesValue(int i) {
            return ((C7210s0) this.instance).getCategoriesValue(i);
        }

        public List<Integer> getCategoriesValueList() {
            return Collections.unmodifiableList(((C7210s0) this.instance).getCategoriesValueList());
        }

        public C6918b getFacts() {
            return ((C7210s0) this.instance).getFacts();
        }

        public UserProto$User getFriend() {
            return ((C7210s0) this.instance).getFriend();
        }

        public C6920c getLevel() {
            return ((C7210s0) this.instance).getLevel();
        }

        public int getLevelValue() {
            return ((C7210s0) this.instance).getLevelValue();
        }

        public Timestamp getValidUntil() {
            return ((C7210s0) this.instance).getValidUntil();
        }

        public boolean hasFacts() {
            return ((C7210s0) this.instance).hasFacts();
        }

        public boolean hasFriend() {
            return ((C7210s0) this.instance).hasFriend();
        }

        public boolean hasValidUntil() {
            return ((C7210s0) this.instance).hasValidUntil();
        }

        private C7212b() {
            super(C7210s0.f17883m);
        }
    }

    static {
        f17883m.makeImmutable();
    }

    private C7210s0() {
    }

    public static Parser<C7210s0> parser() {
        return f17883m.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7203r0.f17852a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7210s0();
            case 2:
                return f17883m;
            case 3:
                this.f17889i.makeImmutable();
                this.f17890j.makeImmutable();
                return null;
            case 4:
                return new C7212b(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7210s0 s0Var = (C7210s0) obj2;
                this.f17886f = (UserProto$User) visitor.visitMessage(this.f17886f, s0Var.f17886f);
                boolean z2 = this.f17887g != 0;
                int i = this.f17887g;
                if (s0Var.f17887g != 0) {
                    z = true;
                }
                this.f17887g = visitor.visitInt(z2, i, z, s0Var.f17887g);
                this.f17888h = (C6918b) visitor.visitMessage(this.f17888h, s0Var.f17888h);
                this.f17889i = visitor.visitIntList(this.f17889i, s0Var.f17889i);
                this.f17890j = visitor.visitList(this.f17890j, s0Var.f17890j);
                this.f17891k = (Timestamp) visitor.visitMessage(this.f17891k, s0Var.f17891k);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17885e |= s0Var.f17885e;
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
                                Builder builder = this.f17886f != null ? (C6925a) this.f17886f.toBuilder() : null;
                                this.f17886f = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17886f);
                                    this.f17886f = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f17887g = codedInputStream.readEnum();
                            } else if (readTag == 26) {
                                Builder builder2 = this.f17888h != null ? (C6919a) this.f17888h.toBuilder() : null;
                                this.f17888h = (C6918b) codedInputStream.readMessage(C6918b.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17888h);
                                    this.f17888h = (C6918b) builder2.buildPartial();
                                }
                            } else if (readTag == 32) {
                                if (!this.f17889i.isModifiable()) {
                                    this.f17889i = GeneratedMessageLite.mutableCopy(this.f17889i);
                                }
                                this.f17889i.addInt(codedInputStream.readEnum());
                            } else if (readTag == 34) {
                                if (!this.f17889i.isModifiable()) {
                                    this.f17889i = GeneratedMessageLite.mutableCopy(this.f17889i);
                                }
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f17889i.addInt(codedInputStream.readEnum());
                                }
                                codedInputStream.popLimit(pushLimit);
                            } else if (readTag == 42) {
                                if (!this.f17890j.isModifiable()) {
                                    this.f17890j = GeneratedMessageLite.mutableCopy(this.f17890j);
                                }
                                this.f17890j.add(codedInputStream.readMessage(C7938b.parser(), extensionRegistryLite));
                            } else if (readTag == 50) {
                                Builder builder3 = this.f17891k != null ? (Timestamp.Builder) this.f17891k.toBuilder() : null;
                                this.f17891k = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f17891k);
                                    this.f17891k = (Timestamp) builder3.buildPartial();
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
                if (f17884n == null) {
                    synchronized (C7210s0.class) {
                        if (f17884n == null) {
                            f17884n = new DefaultInstanceBasedParser(f17883m);
                        }
                    }
                }
                return f17884n;
            default:
                throw new UnsupportedOperationException();
        }
        return f17883m;
    }

    public C7938b getBestCategories(int i) {
        return (C7938b) this.f17890j.get(i);
    }

    public int getBestCategoriesCount() {
        return this.f17890j.size();
    }

    public List<C7938b> getBestCategoriesList() {
        return this.f17890j;
    }

    public C8433b getCategories(int i) {
        return (C8433b) f17882l.convert(Integer.valueOf(this.f17889i.getInt(i)));
    }

    public int getCategoriesCount() {
        return this.f17889i.size();
    }

    public List<C8433b> getCategoriesList() {
        return new ListAdapter(this.f17889i, f17882l);
    }

    public int getCategoriesValue(int i) {
        return this.f17889i.getInt(i);
    }

    public List<Integer> getCategoriesValueList() {
        return this.f17889i;
    }

    public C6918b getFacts() {
        C6918b bVar = this.f17888h;
        return bVar == null ? C6918b.getDefaultInstance() : bVar;
    }

    public UserProto$User getFriend() {
        UserProto$User userProto$User = this.f17886f;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public C6920c getLevel() {
        C6920c a = C6920c.m17643a(this.f17887g);
        return a == null ? C6920c.UNRECOGNIZED : a;
    }

    public int getLevelValue() {
        return this.f17887g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.f17886f != null ? CodedOutputStream.computeMessageSize(1, getFriend()) + 0 : 0;
        if (this.f17887g != C6920c.NONE.getNumber()) {
            computeMessageSize += CodedOutputStream.computeEnumSize(2, this.f17887g);
        }
        if (this.f17888h != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(3, getFacts());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17889i.size(); i3++) {
            i2 += CodedOutputStream.computeEnumSizeNoTag(this.f17889i.getInt(i3));
        }
        int size = computeMessageSize + i2 + (this.f17889i.size() * 1);
        for (int i4 = 0; i4 < this.f17890j.size(); i4++) {
            size += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f17890j.get(i4));
        }
        if (this.f17891k != null) {
            size += CodedOutputStream.computeMessageSize(6, getValidUntil());
        }
        this.memoizedSerializedSize = size;
        return size;
    }

    public Timestamp getValidUntil() {
        Timestamp timestamp = this.f17891k;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasFacts() {
        return this.f17888h != null;
    }

    public boolean hasFriend() {
        return this.f17886f != null;
    }

    public boolean hasValidUntil() {
        return this.f17891k != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if (this.f17886f != null) {
            codedOutputStream.writeMessage(1, getFriend());
        }
        if (this.f17887g != C6920c.NONE.getNumber()) {
            codedOutputStream.writeEnum(2, this.f17887g);
        }
        if (this.f17888h != null) {
            codedOutputStream.writeMessage(3, getFacts());
        }
        for (int i = 0; i < this.f17889i.size(); i++) {
            codedOutputStream.writeEnum(4, this.f17889i.getInt(i));
        }
        for (int i2 = 0; i2 < this.f17890j.size(); i2++) {
            codedOutputStream.writeMessage(5, (MessageLite) this.f17890j.get(i2));
        }
        if (this.f17891k != null) {
            codedOutputStream.writeMessage(6, getValidUntil());
        }
    }
}
