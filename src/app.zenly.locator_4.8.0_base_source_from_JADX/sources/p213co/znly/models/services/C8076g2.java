package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.footsteps.C7311e;

/* renamed from: co.znly.models.services.g2 */
public final class C8076g2 extends GeneratedMessageLite<C8076g2, C8077a> implements ZenlyProto$FootstepsHistoricalResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8076g2 f20475g = new C8076g2();

    /* renamed from: h */
    private static volatile Parser<C8076g2> f20476h;

    /* renamed from: e */
    private ByteString f20477e = ByteString.EMPTY;

    /* renamed from: f */
    private int f20478f;

    /* renamed from: co.znly.models.services.g2$a */
    public static final class C8077a extends Builder<C8076g2, C8077a> implements ZenlyProto$FootstepsHistoricalResponseOrBuilder {
        private C8077a() {
            super(C8076g2.f20475g);
        }

        /* synthetic */ C8077a(C8104i0 i0Var) {
            this();
        }

        public C7311e getFormat() {
            return ((C8076g2) this.instance).getFormat();
        }

        public int getFormatValue() {
            return ((C8076g2) this.instance).getFormatValue();
        }

        public ByteString getQuadtree() {
            return ((C8076g2) this.instance).getQuadtree();
        }
    }

    static {
        f20475g.makeImmutable();
    }

    private C8076g2() {
    }

    public static C8077a newBuilder() {
        return (C8077a) f20475g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8076g2();
            case 2:
                return f20475g;
            case 3:
                return null;
            case 4:
                return new C8077a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8076g2 g2Var = (C8076g2) obj2;
                this.f20477e = visitor.visitByteString(this.f20477e != ByteString.EMPTY, this.f20477e, g2Var.f20477e != ByteString.EMPTY, g2Var.f20477e);
                boolean z2 = this.f20478f != 0;
                int i = this.f20478f;
                if (g2Var.f20478f != 0) {
                    z = true;
                }
                this.f20478f = visitor.visitInt(z2, i, z, g2Var.f20478f);
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
                                this.f20477e = codedInputStream.readBytes();
                            } else if (readTag == 16) {
                                this.f20478f = codedInputStream.readEnum();
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
                if (f20476h == null) {
                    synchronized (C8076g2.class) {
                        if (f20476h == null) {
                            f20476h = new DefaultInstanceBasedParser(f20475g);
                        }
                    }
                }
                return f20476h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20475g;
    }

    public C7311e getFormat() {
        C7311e a = C7311e.m18004a(this.f20478f);
        return a == null ? C7311e.UNRECOGNIZED : a;
    }

    public int getFormatValue() {
        return this.f20478f;
    }

    public ByteString getQuadtree() {
        return this.f20477e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20477e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeBytesSize(1, this.f20477e);
        }
        if (this.f20478f != C7311e.TEXTUAL.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f20478f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20477e.isEmpty()) {
            codedOutputStream.writeBytes(1, this.f20477e);
        }
        if (this.f20478f != C7311e.TEXTUAL.getNumber()) {
            codedOutputStream.writeEnum(2, this.f20478f);
        }
    }
}
