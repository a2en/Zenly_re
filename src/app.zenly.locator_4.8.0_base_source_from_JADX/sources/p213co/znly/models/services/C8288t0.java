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
import p213co.znly.models.bubble.C6971b;
import p213co.znly.models.bubble.C6971b.C6972a;

/* renamed from: co.znly.models.services.t0 */
public final class C8288t0 extends GeneratedMessageLite<C8288t0, C8289a> implements ZenlyProto$BubbleStreamEventOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8288t0 f20950g = new C8288t0();

    /* renamed from: h */
    private static volatile Parser<C8288t0> f20951h;

    /* renamed from: e */
    private int f20952e;

    /* renamed from: f */
    private C6971b f20953f;

    /* renamed from: co.znly.models.services.t0$a */
    public static final class C8289a extends Builder<C8288t0, C8289a> implements ZenlyProto$BubbleStreamEventOrBuilder {
        private C8289a() {
            super(C8288t0.f20950g);
        }

        /* synthetic */ C8289a(C8104i0 i0Var) {
            this();
        }

        public C6971b getBubble() {
            return ((C8288t0) this.instance).getBubble();
        }

        public C7280e getOp() {
            return ((C8288t0) this.instance).getOp();
        }

        public int getOpValue() {
            return ((C8288t0) this.instance).getOpValue();
        }

        public boolean hasBubble() {
            return ((C8288t0) this.instance).hasBubble();
        }
    }

    static {
        f20950g.makeImmutable();
    }

    private C8288t0() {
    }

    public static C8289a newBuilder() {
        return (C8289a) f20950g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8288t0();
            case 2:
                return f20950g;
            case 3:
                return null;
            case 4:
                return new C8289a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8288t0 t0Var = (C8288t0) obj2;
                boolean z2 = this.f20952e != 0;
                int i = this.f20952e;
                if (t0Var.f20952e != 0) {
                    z = true;
                }
                this.f20952e = visitor.visitInt(z2, i, z, t0Var.f20952e);
                this.f20953f = (C6971b) visitor.visitMessage(this.f20953f, t0Var.f20953f);
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
                                this.f20952e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                Builder builder = this.f20953f != null ? (C6972a) this.f20953f.toBuilder() : null;
                                this.f20953f = (C6971b) codedInputStream.readMessage(C6971b.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20953f);
                                    this.f20953f = (C6971b) builder.buildPartial();
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
                if (f20951h == null) {
                    synchronized (C8288t0.class) {
                        if (f20951h == null) {
                            f20951h = new DefaultInstanceBasedParser(f20950g);
                        }
                    }
                }
                return f20951h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20950g;
    }

    public C6971b getBubble() {
        C6971b bVar = this.f20953f;
        return bVar == null ? C6971b.getDefaultInstance() : bVar;
    }

    public C7280e getOp() {
        C7280e a = C7280e.m17990a(this.f20952e);
        return a == null ? C7280e.UNRECOGNIZED : a;
    }

    public int getOpValue() {
        return this.f20952e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20952e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20952e);
        }
        if (this.f20953f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getBubble());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasBubble() {
        return this.f20953f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20952e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20952e);
        }
        if (this.f20953f != null) {
            codedOutputStream.writeMessage(2, getBubble());
        }
    }
}
