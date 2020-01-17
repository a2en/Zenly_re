package p213co.znly.models.core;

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
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C7280e;
import p213co.znly.models.core.C7161m2.C7162a;

/* renamed from: co.znly.models.core.l2 */
public final class C7146l2 extends GeneratedMessageLite<C7146l2, C7147a> implements TypesProto$RecentItemInteractRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7146l2 f17698h = new C7146l2();

    /* renamed from: i */
    private static volatile Parser<C7146l2> f17699i;

    /* renamed from: e */
    private int f17700e;

    /* renamed from: f */
    private int f17701f;

    /* renamed from: g */
    private C7161m2 f17702g;

    /* renamed from: co.znly.models.core.l2$a */
    public static final class C7147a extends Builder<C7146l2, C7147a> implements TypesProto$RecentItemInteractRequestOrBuilder {
        /* synthetic */ C7147a(C7253x1 x1Var) {
            this();
        }

        /* renamed from: a */
        public C7147a mo19126a(C7148b bVar) {
            copyOnWrite();
            ((C7146l2) this.instance).m17826a(bVar);
            return this;
        }

        public C7161m2 getItem() {
            return ((C7146l2) this.instance).getItem();
        }

        public C7280e getOp() {
            return ((C7146l2) this.instance).getOp();
        }

        public int getOpValue() {
            return ((C7146l2) this.instance).getOpValue();
        }

        public C7148b getTarget() {
            return ((C7146l2) this.instance).getTarget();
        }

        public int getTargetValue() {
            return ((C7146l2) this.instance).getTargetValue();
        }

        public boolean hasItem() {
            return ((C7146l2) this.instance).hasItem();
        }

        private C7147a() {
            super(C7146l2.f17698h);
        }

        /* renamed from: a */
        public C7147a mo19128a(C7280e eVar) {
            copyOnWrite();
            ((C7146l2) this.instance).m17831a(eVar);
            return this;
        }

        /* renamed from: a */
        public C7147a mo19127a(C7162a aVar) {
            copyOnWrite();
            ((C7146l2) this.instance).m17830a(aVar);
            return this;
        }
    }

    /* renamed from: co.znly.models.core.l2$b */
    public enum C7148b implements EnumLite {
        RECENTLY_UNKNOWN(0),
        RECENTLY_VIEWED(1),
        RECENTLY_SEARCHED(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f17708e;

        /* renamed from: co.znly.models.core.l2$b$a */
        class C7149a implements EnumLiteMap<C7148b> {
            C7149a() {
            }

            public C7148b findValueByNumber(int i) {
                return C7148b.m17835a(i);
            }
        }

        static {
            new C7149a();
        }

        private C7148b(int i) {
            this.f17708e = i;
        }

        /* renamed from: a */
        public static C7148b m17835a(int i) {
            if (i == 0) {
                return RECENTLY_UNKNOWN;
            }
            if (i == 1) {
                return RECENTLY_VIEWED;
            }
            if (i != 2) {
                return null;
            }
            return RECENTLY_SEARCHED;
        }

        public final int getNumber() {
            return this.f17708e;
        }
    }

    static {
        f17698h.makeImmutable();
    }

    private C7146l2() {
    }

    public static C7147a newBuilder() {
        return (C7147a) f17698h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7146l2();
            case 2:
                return f17698h;
            case 3:
                return null;
            case 4:
                return new C7147a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7146l2 l2Var = (C7146l2) obj2;
                this.f17700e = visitor.visitInt(this.f17700e != 0, this.f17700e, l2Var.f17700e != 0, l2Var.f17700e);
                boolean z2 = this.f17701f != 0;
                int i = this.f17701f;
                if (l2Var.f17701f != 0) {
                    z = true;
                }
                this.f17701f = visitor.visitInt(z2, i, z, l2Var.f17701f);
                this.f17702g = (C7161m2) visitor.visitMessage(this.f17702g, l2Var.f17702g);
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
                                this.f17700e = codedInputStream.readEnum();
                            } else if (readTag == 16) {
                                this.f17701f = codedInputStream.readEnum();
                            } else if (readTag == 26) {
                                Builder builder = this.f17702g != null ? (C7162a) this.f17702g.toBuilder() : null;
                                this.f17702g = (C7161m2) codedInputStream.readMessage(C7161m2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17702g);
                                    this.f17702g = (C7161m2) builder.buildPartial();
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
                if (f17699i == null) {
                    synchronized (C7146l2.class) {
                        if (f17699i == null) {
                            f17699i = new DefaultInstanceBasedParser(f17698h);
                        }
                    }
                }
                return f17699i;
            default:
                throw new UnsupportedOperationException();
        }
        return f17698h;
    }

    public C7161m2 getItem() {
        C7161m2 m2Var = this.f17702g;
        return m2Var == null ? C7161m2.getDefaultInstance() : m2Var;
    }

    public C7280e getOp() {
        C7280e a = C7280e.m17990a(this.f17701f);
        return a == null ? C7280e.UNRECOGNIZED : a;
    }

    public int getOpValue() {
        return this.f17701f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17700e != C7148b.RECENTLY_UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f17700e);
        }
        if (this.f17701f != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f17701f);
        }
        if (this.f17702g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getItem());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7148b getTarget() {
        C7148b a = C7148b.m17835a(this.f17700e);
        return a == null ? C7148b.UNRECOGNIZED : a;
    }

    public int getTargetValue() {
        return this.f17700e;
    }

    public boolean hasItem() {
        return this.f17702g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17700e != C7148b.RECENTLY_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f17700e);
        }
        if (this.f17701f != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(2, this.f17701f);
        }
        if (this.f17702g != null) {
            codedOutputStream.writeMessage(3, getItem());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17826a(C7148b bVar) {
        if (bVar != null) {
            this.f17700e = bVar.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17831a(C7280e eVar) {
        if (eVar != null) {
            this.f17701f = eVar.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17830a(C7162a aVar) {
        this.f17702g = (C7161m2) aVar.build();
    }
}
