package p213co.znly.models.nights;

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
import p213co.znly.models.C6950b0;
import p213co.znly.models.C6950b0.C6951a;

/* renamed from: co.znly.models.nights.d */
public final class C7415d extends GeneratedMessageLite<C7415d, C7416a> implements NightsProto$LocationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7415d f18529i = new C7415d();

    /* renamed from: j */
    private static volatile Parser<C7415d> f18530j;

    /* renamed from: e */
    private String f18531e;

    /* renamed from: f */
    private C6950b0 f18532f;

    /* renamed from: g */
    private int f18533g;

    /* renamed from: h */
    private String f18534h;

    /* renamed from: co.znly.models.nights.d$a */
    public static final class C7416a extends Builder<C7415d, C7416a> implements NightsProto$LocationOrBuilder {
        /* synthetic */ C7416a(C7410a aVar) {
            this();
        }

        public String getId() {
            return ((C7415d) this.instance).getId();
        }

        public ByteString getIdBytes() {
            return ((C7415d) this.instance).getIdBytes();
        }

        public String getLabel() {
            return ((C7415d) this.instance).getLabel();
        }

        public ByteString getLabelBytes() {
            return ((C7415d) this.instance).getLabelBytes();
        }

        public C6950b0 getPoint() {
            return ((C7415d) this.instance).getPoint();
        }

        public C7417b getType() {
            return ((C7415d) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C7415d) this.instance).getTypeValue();
        }

        public boolean hasPoint() {
            return ((C7415d) this.instance).hasPoint();
        }

        private C7416a() {
            super(C7415d.f18529i);
        }
    }

    /* renamed from: co.znly.models.nights.d$b */
    public enum C7417b implements EnumLite {
        UNKNOWN(0),
        MAIN_HOME(1),
        SECONDARY_HOME(12),
        LABELLED(2),
        WORK(3),
        SCHOOL(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f18543e;

        /* renamed from: co.znly.models.nights.d$b$a */
        class C7418a implements EnumLiteMap<C7417b> {
            C7418a() {
            }

            public C7417b findValueByNumber(int i) {
                return C7417b.m18084a(i);
            }
        }

        static {
            new C7418a();
        }

        private C7417b(int i) {
            this.f18543e = i;
        }

        /* renamed from: a */
        public static C7417b m18084a(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return MAIN_HOME;
            }
            if (i == 2) {
                return LABELLED;
            }
            if (i == 3) {
                return WORK;
            }
            if (i == 4) {
                return SCHOOL;
            }
            if (i != 12) {
                return null;
            }
            return SECONDARY_HOME;
        }

        public final int getNumber() {
            return this.f18543e;
        }
    }

    static {
        f18529i.makeImmutable();
    }

    private C7415d() {
        String str = "";
        this.f18531e = str;
        this.f18534h = str;
    }

    public static Parser<C7415d> parser() {
        return f18529i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7410a.f18522a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7415d();
            case 2:
                return f18529i;
            case 3:
                return null;
            case 4:
                return new C7416a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7415d dVar = (C7415d) obj2;
                this.f18531e = visitor.visitString(!this.f18531e.isEmpty(), this.f18531e, !dVar.f18531e.isEmpty(), dVar.f18531e);
                this.f18532f = (C6950b0) visitor.visitMessage(this.f18532f, dVar.f18532f);
                boolean z2 = this.f18533g != 0;
                int i = this.f18533g;
                if (dVar.f18533g != 0) {
                    z = true;
                }
                this.f18533g = visitor.visitInt(z2, i, z, dVar.f18533g);
                this.f18534h = visitor.visitString(!this.f18534h.isEmpty(), this.f18534h, !dVar.f18534h.isEmpty(), dVar.f18534h);
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
                                this.f18531e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                Builder builder = this.f18532f != null ? (C6951a) this.f18532f.toBuilder() : null;
                                this.f18532f = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18532f);
                                    this.f18532f = (C6950b0) builder.buildPartial();
                                }
                            } else if (readTag == 24) {
                                this.f18533g = codedInputStream.readEnum();
                            } else if (readTag == 90) {
                                this.f18534h = codedInputStream.readStringRequireUtf8();
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
                if (f18530j == null) {
                    synchronized (C7415d.class) {
                        if (f18530j == null) {
                            f18530j = new DefaultInstanceBasedParser(f18529i);
                        }
                    }
                }
                return f18530j;
            default:
                throw new UnsupportedOperationException();
        }
        return f18529i;
    }

    public String getId() {
        return this.f18531e;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.f18531e);
    }

    public String getLabel() {
        return this.f18534h;
    }

    public ByteString getLabelBytes() {
        return ByteString.copyFromUtf8(this.f18534h);
    }

    public C6950b0 getPoint() {
        C6950b0 b0Var = this.f18532f;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18531e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getId());
        }
        if (this.f18532f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getPoint());
        }
        if (this.f18533g != C7417b.UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(3, this.f18533g);
        }
        if (!this.f18534h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(11, getLabel());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7417b getType() {
        C7417b a = C7417b.m18084a(this.f18533g);
        return a == null ? C7417b.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f18533g;
    }

    public boolean hasPoint() {
        return this.f18532f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18531e.isEmpty()) {
            codedOutputStream.writeString(1, getId());
        }
        if (this.f18532f != null) {
            codedOutputStream.writeMessage(2, getPoint());
        }
        if (this.f18533g != C7417b.UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(3, this.f18533g);
        }
        if (!this.f18534h.isEmpty()) {
            codedOutputStream.writeString(11, getLabel());
        }
    }
}
