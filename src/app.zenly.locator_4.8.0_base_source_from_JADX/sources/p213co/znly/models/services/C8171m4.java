package p213co.znly.models.services;

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
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.services.m4 */
public final class C8171m4 extends GeneratedMessageLite<C8171m4, C8172a> implements ZenlyProto$RequestRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8171m4 f20684g = new C8171m4();

    /* renamed from: h */
    private static volatile Parser<C8171m4> f20685h;

    /* renamed from: e */
    private int f20686e;

    /* renamed from: f */
    private String f20687f = "";

    /* renamed from: co.znly.models.services.m4$a */
    public static final class C8172a extends Builder<C8171m4, C8172a> implements ZenlyProto$RequestRequestOrBuilder {
        private C8172a() {
            super(C8171m4.f20684g);
        }

        /* synthetic */ C8172a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8172a mo22163a(C8173b bVar) {
            copyOnWrite();
            ((C8171m4) this.instance).m19262a(bVar);
            return this;
        }

        /* renamed from: a */
        public C8172a mo22164a(String str) {
            copyOnWrite();
            ((C8171m4) this.instance).m19265a(str);
            return this;
        }

        public C8173b getType() {
            return ((C8171m4) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C8171m4) this.instance).getTypeValue();
        }

        public String getUserUuid() {
            return ((C8171m4) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C8171m4) this.instance).getUserUuidBytes();
        }
    }

    /* renamed from: co.znly.models.services.m4$b */
    public enum C8173b implements EnumLite {
        DISABLE_CITY(0),
        ENABLE_WIFI(1),
        ENABLE_ALWAYS_ON_LOCATION(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f20693e;

        /* renamed from: co.znly.models.services.m4$b$a */
        class C8174a implements EnumLiteMap<C8173b> {
            C8174a() {
            }

            public C8173b findValueByNumber(int i) {
                return C8173b.m19268a(i);
            }
        }

        static {
            new C8174a();
        }

        private C8173b(int i) {
            this.f20693e = i;
        }

        /* renamed from: a */
        public static C8173b m19268a(int i) {
            if (i == 0) {
                return DISABLE_CITY;
            }
            if (i == 1) {
                return ENABLE_WIFI;
            }
            if (i != 2) {
                return null;
            }
            return ENABLE_ALWAYS_ON_LOCATION;
        }

        public final int getNumber() {
            return this.f20693e;
        }
    }

    static {
        f20684g.makeImmutable();
    }

    private C8171m4() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19262a(C8173b bVar) {
        if (bVar != null) {
            this.f20686e = bVar.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19265a(String str) {
        if (str != null) {
            this.f20687f = str;
            return;
        }
        throw new NullPointerException();
    }

    public static C8172a newBuilder() {
        return (C8172a) f20684g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8171m4();
            case 2:
                return f20684g;
            case 3:
                return null;
            case 4:
                return new C8172a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8171m4 m4Var = (C8171m4) obj2;
                boolean z2 = this.f20686e != 0;
                int i = this.f20686e;
                if (m4Var.f20686e != 0) {
                    z = true;
                }
                this.f20686e = visitor.visitInt(z2, i, z, m4Var.f20686e);
                this.f20687f = visitor.visitString(!this.f20687f.isEmpty(), this.f20687f, !m4Var.f20687f.isEmpty(), m4Var.f20687f);
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
                                this.f20686e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                this.f20687f = codedInputStream.readStringRequireUtf8();
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
                if (f20685h == null) {
                    synchronized (C8171m4.class) {
                        if (f20685h == null) {
                            f20685h = new DefaultInstanceBasedParser(f20684g);
                        }
                    }
                }
                return f20685h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20684g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20686e != C8173b.DISABLE_CITY.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20686e);
        }
        if (!this.f20687f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getUserUuid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C8173b getType() {
        C8173b a = C8173b.m19268a(this.f20686e);
        return a == null ? C8173b.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f20686e;
    }

    public String getUserUuid() {
        return this.f20687f;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f20687f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20686e != C8173b.DISABLE_CITY.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20686e);
        }
        if (!this.f20687f.isEmpty()) {
            codedOutputStream.writeString(2, getUserUuid());
        }
    }
}
