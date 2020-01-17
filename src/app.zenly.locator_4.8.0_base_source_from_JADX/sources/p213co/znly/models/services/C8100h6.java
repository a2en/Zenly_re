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
import p213co.znly.models.C6950b0;
import p213co.znly.models.C6950b0.C6951a;
import p213co.znly.models.reversegeocoder.C7921g;

/* renamed from: co.znly.models.services.h6 */
public final class C8100h6 extends GeneratedMessageLite<C8100h6, C8101a> implements ZenlyProto$ZenlyRoutingRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8100h6 f20535h = new C8100h6();

    /* renamed from: i */
    private static volatile Parser<C8100h6> f20536i;

    /* renamed from: e */
    private C6950b0 f20537e;

    /* renamed from: f */
    private C6950b0 f20538f;

    /* renamed from: g */
    private int f20539g;

    /* renamed from: co.znly.models.services.h6$a */
    public static final class C8101a extends Builder<C8100h6, C8101a> implements ZenlyProto$ZenlyRoutingRequestOrBuilder {
        private C8101a() {
            super(C8100h6.f20535h);
        }

        /* synthetic */ C8101a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8101a mo22145a(C6950b0 b0Var) {
            copyOnWrite();
            ((C8100h6) this.instance).m19175a(b0Var);
            return this;
        }

        /* renamed from: a */
        public C8101a mo22146a(C7921g gVar) {
            copyOnWrite();
            ((C8100h6) this.instance).m19176a(gVar);
            return this;
        }

        /* renamed from: b */
        public C8101a mo22147b(C6950b0 b0Var) {
            copyOnWrite();
            ((C8100h6) this.instance).m19179b(b0Var);
            return this;
        }

        public C6950b0 getDestination() {
            return ((C8100h6) this.instance).getDestination();
        }

        public C7921g getMode() {
            return ((C8100h6) this.instance).getMode();
        }

        public int getModeValue() {
            return ((C8100h6) this.instance).getModeValue();
        }

        public C6950b0 getOrigin() {
            return ((C8100h6) this.instance).getOrigin();
        }

        public boolean hasDestination() {
            return ((C8100h6) this.instance).hasDestination();
        }

        public boolean hasOrigin() {
            return ((C8100h6) this.instance).hasOrigin();
        }
    }

    static {
        f20535h.makeImmutable();
    }

    private C8100h6() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19175a(C6950b0 b0Var) {
        if (b0Var != null) {
            this.f20538f = b0Var;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19176a(C7921g gVar) {
        if (gVar != null) {
            this.f20539g = gVar.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m19179b(C6950b0 b0Var) {
        if (b0Var != null) {
            this.f20537e = b0Var;
            return;
        }
        throw new NullPointerException();
    }

    public static C8101a newBuilder() {
        return (C8101a) f20535h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8100h6();
            case 2:
                return f20535h;
            case 3:
                return null;
            case 4:
                return new C8101a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8100h6 h6Var = (C8100h6) obj2;
                this.f20537e = (C6950b0) visitor.visitMessage(this.f20537e, h6Var.f20537e);
                this.f20538f = (C6950b0) visitor.visitMessage(this.f20538f, h6Var.f20538f);
                boolean z2 = this.f20539g != 0;
                int i = this.f20539g;
                if (h6Var.f20539g != 0) {
                    z = true;
                }
                this.f20539g = visitor.visitInt(z2, i, z, h6Var.f20539g);
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
                                Builder builder = this.f20537e != null ? (C6951a) this.f20537e.toBuilder() : null;
                                this.f20537e = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20537e);
                                    this.f20537e = (C6950b0) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f20538f != null ? (C6951a) this.f20538f.toBuilder() : null;
                                this.f20538f = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20538f);
                                    this.f20538f = (C6950b0) builder2.buildPartial();
                                }
                            } else if (readTag == 24) {
                                this.f20539g = codedInputStream.readEnum();
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
                if (f20536i == null) {
                    synchronized (C8100h6.class) {
                        if (f20536i == null) {
                            f20536i = new DefaultInstanceBasedParser(f20535h);
                        }
                    }
                }
                return f20536i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20535h;
    }

    public C6950b0 getDestination() {
        C6950b0 b0Var = this.f20538f;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public C7921g getMode() {
        C7921g a = C7921g.m18962a(this.f20539g);
        return a == null ? C7921g.UNRECOGNIZED : a;
    }

    public int getModeValue() {
        return this.f20539g;
    }

    public C6950b0 getOrigin() {
        C6950b0 b0Var = this.f20537e;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20537e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getOrigin());
        }
        if (this.f20538f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getDestination());
        }
        if (this.f20539g != C7921g.TRAVEL_MODE_WALKING.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(3, this.f20539g);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasDestination() {
        return this.f20538f != null;
    }

    public boolean hasOrigin() {
        return this.f20537e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20537e != null) {
            codedOutputStream.writeMessage(1, getOrigin());
        }
        if (this.f20538f != null) {
            codedOutputStream.writeMessage(2, getDestination());
        }
        if (this.f20539g != C7921g.TRAVEL_MODE_WALKING.getNumber()) {
            codedOutputStream.writeEnum(3, this.f20539g);
        }
    }
}
