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
import p213co.znly.models.C7272d0;
import p213co.znly.models.C7272d0.C7273a;

/* renamed from: co.znly.models.services.e2 */
public final class C8044e2 extends GeneratedMessageLite<C8044e2, C8045a> implements ZenlyProto$FootstepsContextualLabelingRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8044e2 f20408g = new C8044e2();

    /* renamed from: h */
    private static volatile Parser<C8044e2> f20409h;

    /* renamed from: e */
    private int f20410e;

    /* renamed from: f */
    private C7272d0 f20411f;

    /* renamed from: co.znly.models.services.e2$a */
    public static final class C8045a extends Builder<C8044e2, C8045a> implements ZenlyProto$FootstepsContextualLabelingRequestOrBuilder {
        private C8045a() {
            super(C8044e2.f20408g);
        }

        /* synthetic */ C8045a(C8104i0 i0Var) {
            this();
        }

        public C7272d0 getRectangle() {
            return ((C8044e2) this.instance).getRectangle();
        }

        public int getZoomLevel() {
            return ((C8044e2) this.instance).getZoomLevel();
        }

        public boolean hasRectangle() {
            return ((C8044e2) this.instance).hasRectangle();
        }
    }

    static {
        f20408g.makeImmutable();
    }

    private C8044e2() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8044e2();
            case 2:
                return f20408g;
            case 3:
                return null;
            case 4:
                return new C8045a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8044e2 e2Var = (C8044e2) obj2;
                boolean z2 = this.f20410e != 0;
                int i = this.f20410e;
                if (e2Var.f20410e != 0) {
                    z = true;
                }
                this.f20410e = visitor.visitInt(z2, i, z, e2Var.f20410e);
                this.f20411f = (C7272d0) visitor.visitMessage(this.f20411f, e2Var.f20411f);
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
                                this.f20410e = codedInputStream.readInt32();
                            } else if (readTag == 18) {
                                Builder builder = this.f20411f != null ? (C7273a) this.f20411f.toBuilder() : null;
                                this.f20411f = (C7272d0) codedInputStream.readMessage(C7272d0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20411f);
                                    this.f20411f = (C7272d0) builder.buildPartial();
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
                if (f20409h == null) {
                    synchronized (C8044e2.class) {
                        if (f20409h == null) {
                            f20409h = new DefaultInstanceBasedParser(f20408g);
                        }
                    }
                }
                return f20409h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20408g;
    }

    public C7272d0 getRectangle() {
        C7272d0 d0Var = this.f20411f;
        return d0Var == null ? C7272d0.getDefaultInstance() : d0Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f20410e;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
        }
        if (this.f20411f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getRectangle());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int getZoomLevel() {
        return this.f20410e;
    }

    public boolean hasRectangle() {
        return this.f20411f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f20410e;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        if (this.f20411f != null) {
            codedOutputStream.writeMessage(2, getRectangle());
        }
    }
}
