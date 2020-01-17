package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C6975c0;
import p213co.znly.models.C6975c0.C6976a;

/* renamed from: co.znly.models.core.e1 */
public final class C7088e1 extends GeneratedMessageLite<C7088e1, C7089a> implements GeoProto$RoutingResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7088e1 f17532g = new C7088e1();

    /* renamed from: h */
    private static volatile Parser<C7088e1> f17533h;

    /* renamed from: e */
    private C6975c0 f17534e;

    /* renamed from: f */
    private C6975c0 f17535f;

    /* renamed from: co.znly.models.core.e1$a */
    public static final class C7089a extends Builder<C7088e1, C7089a> implements GeoProto$RoutingResponseOrBuilder {
        /* synthetic */ C7089a(C7051a1 a1Var) {
            this();
        }

        public C6975c0 getHigh() {
            return ((C7088e1) this.instance).getHigh();
        }

        public C6975c0 getLow() {
            return ((C7088e1) this.instance).getLow();
        }

        public boolean hasHigh() {
            return ((C7088e1) this.instance).hasHigh();
        }

        public boolean hasLow() {
            return ((C7088e1) this.instance).hasLow();
        }

        private C7089a() {
            super(C7088e1.f17532g);
        }
    }

    static {
        f17532g.makeImmutable();
    }

    private C7088e1() {
    }

    public static C7089a newBuilder() {
        return (C7089a) f17532g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7051a1.f17440a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7088e1();
            case 2:
                return f17532g;
            case 3:
                return null;
            case 4:
                return new C7089a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7088e1 e1Var = (C7088e1) obj2;
                this.f17534e = (C6975c0) visitor.visitMessage(this.f17534e, e1Var.f17534e);
                this.f17535f = (C6975c0) visitor.visitMessage(this.f17535f, e1Var.f17535f);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Builder builder = this.f17534e != null ? (C6976a) this.f17534e.toBuilder() : null;
                                this.f17534e = (C6975c0) codedInputStream.readMessage(C6975c0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17534e);
                                    this.f17534e = (C6975c0) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f17535f != null ? (C6976a) this.f17535f.toBuilder() : null;
                                this.f17535f = (C6975c0) codedInputStream.readMessage(C6975c0.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17535f);
                                    this.f17535f = (C6975c0) builder2.buildPartial();
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
                if (f17533h == null) {
                    synchronized (C7088e1.class) {
                        if (f17533h == null) {
                            f17533h = new DefaultInstanceBasedParser(f17532g);
                        }
                    }
                }
                return f17533h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17532g;
    }

    public C6975c0 getHigh() {
        C6975c0 c0Var = this.f17535f;
        return c0Var == null ? C6975c0.getDefaultInstance() : c0Var;
    }

    public C6975c0 getLow() {
        C6975c0 c0Var = this.f17534e;
        return c0Var == null ? C6975c0.getDefaultInstance() : c0Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17534e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getLow());
        }
        if (this.f17535f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getHigh());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasHigh() {
        return this.f17535f != null;
    }

    public boolean hasLow() {
        return this.f17534e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17534e != null) {
            codedOutputStream.writeMessage(1, getLow());
        }
        if (this.f17535f != null) {
            codedOutputStream.writeMessage(2, getHigh());
        }
    }
}
