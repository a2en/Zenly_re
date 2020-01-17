package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C6950b0.C6951a;

/* renamed from: co.znly.models.d0 */
public final class C7272d0 extends GeneratedMessageLite<C7272d0, C7273a> implements GeometryProto$GeoRectangleOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7272d0 f18047g = new C7272d0();

    /* renamed from: h */
    private static volatile Parser<C7272d0> f18048h;

    /* renamed from: e */
    private C6950b0 f18049e;

    /* renamed from: f */
    private C6950b0 f18050f;

    /* renamed from: co.znly.models.d0$a */
    public static final class C7273a extends Builder<C7272d0, C7273a> implements GeometryProto$GeoRectangleOrBuilder {
        /* synthetic */ C7273a(C7514z zVar) {
            this();
        }

        /* renamed from: a */
        public C7273a mo19191a(C6951a aVar) {
            copyOnWrite();
            ((C7272d0) this.instance).m17981a(aVar);
            return this;
        }

        /* renamed from: b */
        public C7273a mo19192b(C6951a aVar) {
            copyOnWrite();
            ((C7272d0) this.instance).m17983b(aVar);
            return this;
        }

        public C6950b0 getBottomRight() {
            return ((C7272d0) this.instance).getBottomRight();
        }

        public C6950b0 getTopLeft() {
            return ((C7272d0) this.instance).getTopLeft();
        }

        public boolean hasBottomRight() {
            return ((C7272d0) this.instance).hasBottomRight();
        }

        public boolean hasTopLeft() {
            return ((C7272d0) this.instance).hasTopLeft();
        }

        private C7273a() {
            super(C7272d0.f18047g);
        }
    }

    static {
        f18047g.makeImmutable();
    }

    private C7272d0() {
    }

    public static C7272d0 getDefaultInstance() {
        return f18047g;
    }

    public static C7273a newBuilder() {
        return (C7273a) f18047g.toBuilder();
    }

    public static Parser<C7272d0> parser() {
        return f18047g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7514z.f18877a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7272d0();
            case 2:
                return f18047g;
            case 3:
                return null;
            case 4:
                return new C7273a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7272d0 d0Var = (C7272d0) obj2;
                this.f18049e = (C6950b0) visitor.visitMessage(this.f18049e, d0Var.f18049e);
                this.f18050f = (C6950b0) visitor.visitMessage(this.f18050f, d0Var.f18050f);
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
                                Builder builder = this.f18049e != null ? (C6951a) this.f18049e.toBuilder() : null;
                                this.f18049e = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18049e);
                                    this.f18049e = (C6950b0) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f18050f != null ? (C6951a) this.f18050f.toBuilder() : null;
                                this.f18050f = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f18050f);
                                    this.f18050f = (C6950b0) builder2.buildPartial();
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
                if (f18048h == null) {
                    synchronized (C7272d0.class) {
                        if (f18048h == null) {
                            f18048h = new DefaultInstanceBasedParser(f18047g);
                        }
                    }
                }
                return f18048h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18047g;
    }

    public C6950b0 getBottomRight() {
        C6950b0 b0Var = this.f18050f;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f18049e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getTopLeft());
        }
        if (this.f18050f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getBottomRight());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C6950b0 getTopLeft() {
        C6950b0 b0Var = this.f18049e;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public boolean hasBottomRight() {
        return this.f18050f != null;
    }

    public boolean hasTopLeft() {
        return this.f18049e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f18049e != null) {
            codedOutputStream.writeMessage(1, getTopLeft());
        }
        if (this.f18050f != null) {
            codedOutputStream.writeMessage(2, getBottomRight());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m17983b(C6951a aVar) {
        this.f18049e = (C6950b0) aVar.build();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17981a(C6951a aVar) {
        this.f18050f = (C6950b0) aVar.build();
    }
}
