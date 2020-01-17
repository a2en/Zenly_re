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
import p213co.znly.models.C6950b0;
import p213co.znly.models.C6950b0.C6951a;

/* renamed from: co.znly.models.core.t2 */
public final class C7222t2 extends GeneratedMessageLite<C7222t2, C7223a> implements TypesProto$ViewportOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7222t2 f17911g = new C7222t2();

    /* renamed from: h */
    private static volatile Parser<C7222t2> f17912h;

    /* renamed from: e */
    private C6950b0 f17913e;

    /* renamed from: f */
    private float f17914f;

    /* renamed from: co.znly.models.core.t2$a */
    public static final class C7223a extends Builder<C7222t2, C7223a> implements TypesProto$ViewportOrBuilder {
        /* synthetic */ C7223a(C7253x1 x1Var) {
            this();
        }

        public C6950b0 getCenter() {
            return ((C7222t2) this.instance).getCenter();
        }

        public float getRadius() {
            return ((C7222t2) this.instance).getRadius();
        }

        public boolean hasCenter() {
            return ((C7222t2) this.instance).hasCenter();
        }

        private C7223a() {
            super(C7222t2.f17911g);
        }
    }

    static {
        f17911g.makeImmutable();
    }

    private C7222t2() {
    }

    public static C7223a newBuilder() {
        return (C7223a) f17911g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7222t2();
            case 2:
                return f17911g;
            case 3:
                return null;
            case 4:
                return new C7223a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7222t2 t2Var = (C7222t2) obj2;
                this.f17913e = (C6950b0) visitor.visitMessage(this.f17913e, t2Var.f17913e);
                boolean z2 = this.f17914f != 0.0f;
                float f = this.f17914f;
                if (t2Var.f17914f != 0.0f) {
                    z = true;
                }
                this.f17914f = visitor.visitFloat(z2, f, z, t2Var.f17914f);
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
                                Builder builder = this.f17913e != null ? (C6951a) this.f17913e.toBuilder() : null;
                                this.f17913e = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17913e);
                                    this.f17913e = (C6950b0) builder.buildPartial();
                                }
                            } else if (readTag == 21) {
                                this.f17914f = codedInputStream.readFloat();
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
                if (f17912h == null) {
                    synchronized (C7222t2.class) {
                        if (f17912h == null) {
                            f17912h = new DefaultInstanceBasedParser(f17911g);
                        }
                    }
                }
                return f17912h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17911g;
    }

    public C6950b0 getCenter() {
        C6950b0 b0Var = this.f17913e;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public float getRadius() {
        return this.f17914f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17913e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getCenter());
        }
        float f = this.f17914f;
        if (f != 0.0f) {
            i2 += CodedOutputStream.computeFloatSize(2, f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasCenter() {
        return this.f17913e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17913e != null) {
            codedOutputStream.writeMessage(1, getCenter());
        }
        float f = this.f17914f;
        if (f != 0.0f) {
            codedOutputStream.writeFloat(2, f);
        }
    }
}
