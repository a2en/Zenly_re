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

/* renamed from: co.znly.models.g0 */
public final class C7318g0 extends GeneratedMessageLite<C7318g0, C7319a> implements GeometryProto$SizeOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7318g0 f18177g = new C7318g0();

    /* renamed from: h */
    private static volatile Parser<C7318g0> f18178h;

    /* renamed from: e */
    private int f18179e;

    /* renamed from: f */
    private int f18180f;

    /* renamed from: co.znly.models.g0$a */
    public static final class C7319a extends Builder<C7318g0, C7319a> implements GeometryProto$SizeOrBuilder {
        /* synthetic */ C7319a(C7514z zVar) {
            this();
        }

        public int getHeight() {
            return ((C7318g0) this.instance).getHeight();
        }

        public int getWidth() {
            return ((C7318g0) this.instance).getWidth();
        }

        private C7319a() {
            super(C7318g0.f18177g);
        }
    }

    static {
        f18177g.makeImmutable();
    }

    private C7318g0() {
    }

    public static C7318g0 getDefaultInstance() {
        return f18177g;
    }

    public static Parser<C7318g0> parser() {
        return f18177g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7514z.f18877a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7318g0();
            case 2:
                return f18177g;
            case 3:
                return null;
            case 4:
                return new C7319a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7318g0 g0Var = (C7318g0) obj2;
                this.f18179e = visitor.visitInt(this.f18179e != 0, this.f18179e, g0Var.f18179e != 0, g0Var.f18179e);
                boolean z2 = this.f18180f != 0;
                int i = this.f18180f;
                if (g0Var.f18180f != 0) {
                    z = true;
                }
                this.f18180f = visitor.visitInt(z2, i, z, g0Var.f18180f);
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
                                this.f18179e = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.f18180f = codedInputStream.readInt32();
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
                if (f18178h == null) {
                    synchronized (C7318g0.class) {
                        if (f18178h == null) {
                            f18178h = new DefaultInstanceBasedParser(f18177g);
                        }
                    }
                }
                return f18178h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18177g;
    }

    public int getHeight() {
        return this.f18180f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f18179e;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
        }
        int i4 = this.f18180f;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(2, i4);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int getWidth() {
        return this.f18179e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f18179e;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        int i2 = this.f18180f;
        if (i2 != 0) {
            codedOutputStream.writeInt32(2, i2);
        }
    }
}
