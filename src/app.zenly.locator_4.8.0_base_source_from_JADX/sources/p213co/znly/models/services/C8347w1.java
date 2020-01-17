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
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.services.w1 */
public final class C8347w1 extends GeneratedMessageLite<C8347w1, C8348a> implements ZenlyProto$ConversationErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8347w1 f21134h = new C8347w1();

    /* renamed from: i */
    private static volatile Parser<C8347w1> f21135i;

    /* renamed from: e */
    private int f21136e;

    /* renamed from: f */
    private int f21137f;

    /* renamed from: g */
    private ProtobufList<String> f21138g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.w1$a */
    public static final class C8348a extends Builder<C8347w1, C8348a> implements ZenlyProto$ConversationErrorOrBuilder {
        /* synthetic */ C8348a(C8104i0 i0Var) {
            this();
        }

        public C8349b getCode() {
            return ((C8347w1) this.instance).getCode();
        }

        public int getCodeValue() {
            return ((C8347w1) this.instance).getCodeValue();
        }

        public String getUserUUIDs(int i) {
            return ((C8347w1) this.instance).getUserUUIDs(i);
        }

        public ByteString getUserUUIDsBytes(int i) {
            return ((C8347w1) this.instance).getUserUUIDsBytes(i);
        }

        public int getUserUUIDsCount() {
            return ((C8347w1) this.instance).getUserUUIDsCount();
        }

        public List<String> getUserUUIDsList() {
            return Collections.unmodifiableList(((C8347w1) this.instance).getUserUUIDsList());
        }

        private C8348a() {
            super(C8347w1.f21134h);
        }
    }

    /* renamed from: co.znly.models.services.w1$b */
    public enum C8349b implements EnumLite {
        UNKNOWN(0),
        QUOTA_EXCEEDED(1),
        USERS_HAS_INCOMPATIBLE_VERSION(2),
        TALK_TO_STRANGER_QUARANTINE(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f21145e;

        /* renamed from: co.znly.models.services.w1$b$a */
        class C8350a implements EnumLiteMap<C8349b> {
            C8350a() {
            }

            public C8349b findValueByNumber(int i) {
                return C8349b.m19427a(i);
            }
        }

        static {
            new C8350a();
        }

        private C8349b(int i) {
            this.f21145e = i;
        }

        /* renamed from: a */
        public static C8349b m19427a(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return QUOTA_EXCEEDED;
            }
            if (i == 2) {
                return USERS_HAS_INCOMPATIBLE_VERSION;
            }
            if (i != 3) {
                return null;
            }
            return TALK_TO_STRANGER_QUARANTINE;
        }

        public final int getNumber() {
            return this.f21145e;
        }
    }

    static {
        f21134h.makeImmutable();
    }

    private C8347w1() {
    }

    public static C8347w1 getDefaultInstance() {
        return f21134h;
    }

    public static Parser<C8347w1> parser() {
        return f21134h.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8347w1();
            case 2:
                return f21134h;
            case 3:
                this.f21138g.makeImmutable();
                return null;
            case 4:
                return new C8348a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8347w1 w1Var = (C8347w1) obj2;
                boolean z2 = this.f21137f != 0;
                int i = this.f21137f;
                if (w1Var.f21137f != 0) {
                    z = true;
                }
                this.f21137f = visitor.visitInt(z2, i, z, w1Var.f21137f);
                this.f21138g = visitor.visitList(this.f21138g, w1Var.f21138g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f21136e |= w1Var.f21136e;
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
                                this.f21137f = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f21138g.isModifiable()) {
                                    this.f21138g = GeneratedMessageLite.mutableCopy(this.f21138g);
                                }
                                this.f21138g.add(readStringRequireUtf8);
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
                if (f21135i == null) {
                    synchronized (C8347w1.class) {
                        if (f21135i == null) {
                            f21135i = new DefaultInstanceBasedParser(f21134h);
                        }
                    }
                }
                return f21135i;
            default:
                throw new UnsupportedOperationException();
        }
        return f21134h;
    }

    public C8349b getCode() {
        C8349b a = C8349b.m19427a(this.f21137f);
        return a == null ? C8349b.UNRECOGNIZED : a;
    }

    public int getCodeValue() {
        return this.f21137f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeEnumSize = this.f21137f != C8349b.UNKNOWN.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f21137f) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f21138g.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f21138g.get(i3));
        }
        int size = computeEnumSize + i2 + (getUserUUIDsList().size() * 1);
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getUserUUIDs(int i) {
        return (String) this.f21138g.get(i);
    }

    public ByteString getUserUUIDsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f21138g.get(i));
    }

    public int getUserUUIDsCount() {
        return this.f21138g.size();
    }

    public List<String> getUserUUIDsList() {
        return this.f21138g;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21137f != C8349b.UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f21137f);
        }
        for (int i = 0; i < this.f21138g.size(); i++) {
            codedOutputStream.writeString(2, (String) this.f21138g.get(i));
        }
    }
}
