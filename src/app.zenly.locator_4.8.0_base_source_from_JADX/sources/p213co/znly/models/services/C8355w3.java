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
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.services.w3 */
public final class C8355w3 extends GeneratedMessageLite<C8355w3, C8356a> implements ZenlyProto$PingPackOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C8355w3 f21160l = new C8355w3();

    /* renamed from: m */
    private static volatile Parser<C8355w3> f21161m;

    /* renamed from: e */
    private int f21162e;

    /* renamed from: f */
    private int f21163f;

    /* renamed from: g */
    private int f21164g;

    /* renamed from: h */
    private int f21165h;

    /* renamed from: i */
    private String f21166i;

    /* renamed from: j */
    private String f21167j;

    /* renamed from: k */
    private ProtobufList<C8307u3> f21168k = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.w3$a */
    public static final class C8356a extends Builder<C8355w3, C8356a> implements ZenlyProto$PingPackOrBuilder {
        private C8356a() {
            super(C8355w3.f21160l);
        }

        /* synthetic */ C8356a(C8104i0 i0Var) {
            this();
        }

        public C8307u3 getEmojis(int i) {
            return ((C8355w3) this.instance).getEmojis(i);
        }

        public int getEmojisCount() {
            return ((C8355w3) this.instance).getEmojisCount();
        }

        public List<C8307u3> getEmojisList() {
            return Collections.unmodifiableList(((C8355w3) this.instance).getEmojisList());
        }

        public int getMinFriendsCount() {
            return ((C8355w3) this.instance).getMinFriendsCount();
        }

        public String getName() {
            return ((C8355w3) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((C8355w3) this.instance).getNameBytes();
        }

        public C8357b getUnlockType() {
            return ((C8355w3) this.instance).getUnlockType();
        }

        public int getUnlockTypeValue() {
            return ((C8355w3) this.instance).getUnlockTypeValue();
        }

        public int getUnlockValue() {
            return ((C8355w3) this.instance).getUnlockValue();
        }

        public String getUuid() {
            return ((C8355w3) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C8355w3) this.instance).getUuidBytes();
        }
    }

    /* renamed from: co.znly.models.services.w3$b */
    public enum C8357b implements EnumLite {
        UNLOCK_UNKNOWN(0),
        UNLOCK_NOT_LOCKED(1),
        UNLOCK_FRIENDS_COUNT(2),
        UNLOCK_EVENT_INVITER(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f21175e;

        /* renamed from: co.znly.models.services.w3$b$a */
        class C8358a implements EnumLiteMap<C8357b> {
            C8358a() {
            }

            public C8357b findValueByNumber(int i) {
                return C8357b.m19431a(i);
            }
        }

        static {
            new C8358a();
        }

        private C8357b(int i) {
            this.f21175e = i;
        }

        /* renamed from: a */
        public static C8357b m19431a(int i) {
            if (i == 0) {
                return UNLOCK_UNKNOWN;
            }
            if (i == 1) {
                return UNLOCK_NOT_LOCKED;
            }
            if (i == 2) {
                return UNLOCK_FRIENDS_COUNT;
            }
            if (i != 3) {
                return null;
            }
            return UNLOCK_EVENT_INVITER;
        }

        public final int getNumber() {
            return this.f21175e;
        }
    }

    static {
        f21160l.makeImmutable();
    }

    private C8355w3() {
        String str = "";
        this.f21166i = str;
        this.f21167j = str;
    }

    public static Parser<C8355w3> parser() {
        return f21160l.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8355w3();
            case 2:
                return f21160l;
            case 3:
                this.f21168k.makeImmutable();
                return null;
            case 4:
                return new C8356a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8355w3 w3Var = (C8355w3) obj2;
                this.f21163f = visitor.visitInt(this.f21163f != 0, this.f21163f, w3Var.f21163f != 0, w3Var.f21163f);
                this.f21164g = visitor.visitInt(this.f21164g != 0, this.f21164g, w3Var.f21164g != 0, w3Var.f21164g);
                boolean z2 = this.f21165h != 0;
                int i = this.f21165h;
                if (w3Var.f21165h != 0) {
                    z = true;
                }
                this.f21165h = visitor.visitInt(z2, i, z, w3Var.f21165h);
                this.f21166i = visitor.visitString(!this.f21166i.isEmpty(), this.f21166i, !w3Var.f21166i.isEmpty(), w3Var.f21166i);
                this.f21167j = visitor.visitString(!this.f21167j.isEmpty(), this.f21167j, !w3Var.f21167j.isEmpty(), w3Var.f21167j);
                this.f21168k = visitor.visitList(this.f21168k, w3Var.f21168k);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f21162e |= w3Var.f21162e;
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
                                this.f21163f = codedInputStream.readInt32();
                            } else if (readTag == 18) {
                                this.f21166i = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f21167j = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                if (!this.f21168k.isModifiable()) {
                                    this.f21168k = GeneratedMessageLite.mutableCopy(this.f21168k);
                                }
                                this.f21168k.add(codedInputStream.readMessage(C8307u3.parser(), extensionRegistryLite));
                            } else if (readTag == 40) {
                                this.f21164g = codedInputStream.readEnum();
                            } else if (readTag == 48) {
                                this.f21165h = codedInputStream.readInt32();
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
                if (f21161m == null) {
                    synchronized (C8355w3.class) {
                        if (f21161m == null) {
                            f21161m = new DefaultInstanceBasedParser(f21160l);
                        }
                    }
                }
                return f21161m;
            default:
                throw new UnsupportedOperationException();
        }
        return f21160l;
    }

    public C8307u3 getEmojis(int i) {
        return (C8307u3) this.f21168k.get(i);
    }

    public int getEmojisCount() {
        return this.f21168k.size();
    }

    public List<C8307u3> getEmojisList() {
        return this.f21168k;
    }

    public int getMinFriendsCount() {
        return this.f21163f;
    }

    public String getName() {
        return this.f21167j;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.f21167j);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.f21163f;
        int computeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) + 0 : 0;
        if (!this.f21166i.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(2, getUuid());
        }
        if (!this.f21167j.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(3, getName());
        }
        for (int i3 = 0; i3 < this.f21168k.size(); i3++) {
            computeInt32Size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f21168k.get(i3));
        }
        if (this.f21164g != C8357b.UNLOCK_UNKNOWN.getNumber()) {
            computeInt32Size += CodedOutputStream.computeEnumSize(5, this.f21164g);
        }
        int i4 = this.f21165h;
        if (i4 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(6, i4);
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    public C8357b getUnlockType() {
        C8357b a = C8357b.m19431a(this.f21164g);
        return a == null ? C8357b.UNRECOGNIZED : a;
    }

    public int getUnlockTypeValue() {
        return this.f21164g;
    }

    public int getUnlockValue() {
        return this.f21165h;
    }

    public String getUuid() {
        return this.f21166i;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f21166i);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f21163f;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        if (!this.f21166i.isEmpty()) {
            codedOutputStream.writeString(2, getUuid());
        }
        if (!this.f21167j.isEmpty()) {
            codedOutputStream.writeString(3, getName());
        }
        for (int i2 = 0; i2 < this.f21168k.size(); i2++) {
            codedOutputStream.writeMessage(4, (MessageLite) this.f21168k.get(i2));
        }
        if (this.f21164g != C8357b.UNLOCK_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(5, this.f21164g);
        }
        int i3 = this.f21165h;
        if (i3 != 0) {
            codedOutputStream.writeInt32(6, i3);
        }
    }
}
