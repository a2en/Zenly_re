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

/* renamed from: co.znly.models.f1 */
public final class C7299f1 extends GeneratedMessageLite<C7299f1, C7300a> implements PinContextProto$ElevationStrippedOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7299f1 f18118g = new C7299f1();

    /* renamed from: h */
    private static volatile Parser<C7299f1> f18119h;

    /* renamed from: e */
    private float f18120e;

    /* renamed from: f */
    private boolean f18121f;

    /* renamed from: co.znly.models.f1$a */
    public static final class C7300a extends Builder<C7299f1, C7300a> implements PinContextProto$ElevationStrippedOrBuilder {
        /* synthetic */ C7300a(C6977c1 c1Var) {
            this();
        }

        public float getHeight() {
            return ((C7299f1) this.instance).getHeight();
        }

        public boolean getIsInSubway() {
            return ((C7299f1) this.instance).getIsInSubway();
        }

        private C7300a() {
            super(C7299f1.f18118g);
        }
    }

    static {
        f18118g.makeImmutable();
    }

    private C7299f1() {
    }

    public static C7299f1 getDefaultInstance() {
        return f18118g;
    }

    public static Parser<C7299f1> parser() {
        return f18118g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C6977c1.f17211a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7299f1();
            case 2:
                return f18118g;
            case 3:
                return null;
            case 4:
                return new C7300a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7299f1 f1Var = (C7299f1) obj2;
                boolean z2 = this.f18120e != 0.0f;
                float f = this.f18120e;
                if (f1Var.f18120e != 0.0f) {
                    z = true;
                }
                this.f18120e = visitor.visitFloat(z2, f, z, f1Var.f18120e);
                boolean z3 = this.f18121f;
                boolean z4 = f1Var.f18121f;
                this.f18121f = visitor.visitBoolean(z3, z3, z4, z4);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 13) {
                                this.f18120e = codedInputStream.readFloat();
                            } else if (readTag == 16) {
                                this.f18121f = codedInputStream.readBool();
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
                if (f18119h == null) {
                    synchronized (C7299f1.class) {
                        if (f18119h == null) {
                            f18119h = new DefaultInstanceBasedParser(f18118g);
                        }
                    }
                }
                return f18119h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18118g;
    }

    public float getHeight() {
        return this.f18120e;
    }

    public boolean getIsInSubway() {
        return this.f18121f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        float f = this.f18120e;
        if (f != 0.0f) {
            i2 = 0 + CodedOutputStream.computeFloatSize(1, f);
        }
        boolean z = this.f18121f;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(2, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        float f = this.f18120e;
        if (f != 0.0f) {
            codedOutputStream.writeFloat(1, f);
        }
        boolean z = this.f18121f;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
    }
}
