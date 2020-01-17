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

/* renamed from: co.znly.models.core.u1 */
public final class C7228u1 extends GeneratedMessageLite<C7228u1, C7229a> implements TileProto$TileCoordinatesOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7228u1 f17930h = new C7228u1();

    /* renamed from: i */
    private static volatile Parser<C7228u1> f17931i;

    /* renamed from: e */
    private long f17932e;

    /* renamed from: f */
    private long f17933f;

    /* renamed from: g */
    private long f17934g;

    /* renamed from: co.znly.models.core.u1$a */
    public static final class C7229a extends Builder<C7228u1, C7229a> implements TileProto$TileCoordinatesOrBuilder {
        /* synthetic */ C7229a(C7221t1 t1Var) {
            this();
        }

        public long getX() {
            return ((C7228u1) this.instance).getX();
        }

        public long getY() {
            return ((C7228u1) this.instance).getY();
        }

        public long getZoom() {
            return ((C7228u1) this.instance).getZoom();
        }

        private C7229a() {
            super(C7228u1.f17930h);
        }
    }

    static {
        f17930h.makeImmutable();
    }

    private C7228u1() {
    }

    public static Parser<C7228u1> parser() {
        return f17930h.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7221t1.f17910a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7228u1();
            case 2:
                return f17930h;
            case 3:
                return null;
            case 4:
                return new C7229a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7228u1 u1Var = (C7228u1) obj2;
                this.f17932e = visitor.visitLong(this.f17932e != 0, this.f17932e, u1Var.f17932e != 0, u1Var.f17932e);
                this.f17933f = visitor.visitLong(this.f17933f != 0, this.f17933f, u1Var.f17933f != 0, u1Var.f17933f);
                this.f17934g = visitor.visitLong(this.f17934g != 0, this.f17934g, u1Var.f17934g != 0, u1Var.f17934g);
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
                                this.f17932e = codedInputStream.readInt64();
                            } else if (readTag == 16) {
                                this.f17933f = codedInputStream.readInt64();
                            } else if (readTag == 24) {
                                this.f17934g = codedInputStream.readInt64();
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
                if (f17931i == null) {
                    synchronized (C7228u1.class) {
                        if (f17931i == null) {
                            f17931i = new DefaultInstanceBasedParser(f17930h);
                        }
                    }
                }
                return f17931i;
            default:
                throw new UnsupportedOperationException();
        }
        return f17930h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f17932e;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeInt64Size(1, j);
        }
        long j2 = this.f17933f;
        if (j2 != 0) {
            i2 += CodedOutputStream.computeInt64Size(2, j2);
        }
        long j3 = this.f17934g;
        if (j3 != 0) {
            i2 += CodedOutputStream.computeInt64Size(3, j3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public long getX() {
        return this.f17932e;
    }

    public long getY() {
        return this.f17933f;
    }

    public long getZoom() {
        return this.f17934g;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f17932e;
        if (j != 0) {
            codedOutputStream.writeInt64(1, j);
        }
        long j2 = this.f17933f;
        if (j2 != 0) {
            codedOutputStream.writeInt64(2, j2);
        }
        long j3 = this.f17934g;
        if (j3 != 0) {
            codedOutputStream.writeInt64(3, j3);
        }
    }
}
