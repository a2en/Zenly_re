package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C7280e;
import p213co.znly.models.C7458s;
import p213co.znly.models.C7458s.C7459a;

/* renamed from: co.znly.models.services.c2 */
public final class C8010c2 extends GeneratedMessageLite<C8010c2, C8011a> implements ZenlyProto$DeviceStreamEventOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8010c2 f20329g = new C8010c2();

    /* renamed from: h */
    private static volatile Parser<C8010c2> f20330h;

    /* renamed from: e */
    private int f20331e;

    /* renamed from: f */
    private C7458s f20332f;

    /* renamed from: co.znly.models.services.c2$a */
    public static final class C8011a extends Builder<C8010c2, C8011a> implements ZenlyProto$DeviceStreamEventOrBuilder {
        /* synthetic */ C8011a(C8104i0 i0Var) {
            this();
        }

        public C7458s getDevice() {
            return ((C8010c2) this.instance).getDevice();
        }

        public C7280e getOp() {
            return ((C8010c2) this.instance).getOp();
        }

        public int getOpValue() {
            return ((C8010c2) this.instance).getOpValue();
        }

        public boolean hasDevice() {
            return ((C8010c2) this.instance).hasDevice();
        }

        private C8011a() {
            super(C8010c2.f20329g);
        }
    }

    static {
        f20329g.makeImmutable();
    }

    private C8010c2() {
    }

    public static C8011a newBuilder() {
        return (C8011a) f20329g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8010c2();
            case 2:
                return f20329g;
            case 3:
                return null;
            case 4:
                return new C8011a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8010c2 c2Var = (C8010c2) obj2;
                boolean z2 = this.f20331e != 0;
                int i = this.f20331e;
                if (c2Var.f20331e != 0) {
                    z = true;
                }
                this.f20331e = visitor.visitInt(z2, i, z, c2Var.f20331e);
                this.f20332f = (C7458s) visitor.visitMessage(this.f20332f, c2Var.f20332f);
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
                                this.f20331e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                Builder builder = this.f20332f != null ? (C7459a) this.f20332f.toBuilder() : null;
                                this.f20332f = (C7458s) codedInputStream.readMessage(C7458s.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20332f);
                                    this.f20332f = (C7458s) builder.buildPartial();
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
                if (f20330h == null) {
                    synchronized (C8010c2.class) {
                        if (f20330h == null) {
                            f20330h = new DefaultInstanceBasedParser(f20329g);
                        }
                    }
                }
                return f20330h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20329g;
    }

    public C7458s getDevice() {
        C7458s sVar = this.f20332f;
        return sVar == null ? C7458s.getDefaultInstance() : sVar;
    }

    public C7280e getOp() {
        C7280e a = C7280e.m17990a(this.f20331e);
        return a == null ? C7280e.UNRECOGNIZED : a;
    }

    public int getOpValue() {
        return this.f20331e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20331e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20331e);
        }
        if (this.f20332f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getDevice());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasDevice() {
        return this.f20332f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20331e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20331e);
        }
        if (this.f20332f != null) {
            codedOutputStream.writeMessage(2, getDevice());
        }
    }
}
