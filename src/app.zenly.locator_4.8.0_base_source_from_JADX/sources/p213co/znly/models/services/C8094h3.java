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

/* renamed from: co.znly.models.services.h3 */
public final class C8094h3 extends GeneratedMessageLite<C8094h3, C8095a> implements ZenlyProto$MarkAnnouncementAsReadRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8094h3 f20508f = new C8094h3();

    /* renamed from: g */
    private static volatile Parser<C8094h3> f20509g;

    /* renamed from: e */
    private int f20510e;

    /* renamed from: co.znly.models.services.h3$a */
    public static final class C8095a extends Builder<C8094h3, C8095a> implements ZenlyProto$MarkAnnouncementAsReadRequestOrBuilder {
        private C8095a() {
            super(C8094h3.f20508f);
        }

        /* synthetic */ C8095a(C8104i0 i0Var) {
            this();
        }

        public int getAnnouncementId() {
            return ((C8094h3) this.instance).getAnnouncementId();
        }
    }

    static {
        f20508f.makeImmutable();
    }

    private C8094h3() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8094h3();
            case 2:
                return f20508f;
            case 3:
                return null;
            case 4:
                return new C8095a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8094h3 h3Var = (C8094h3) obj2;
                boolean z2 = this.f20510e != 0;
                int i = this.f20510e;
                if (h3Var.f20510e != 0) {
                    z = true;
                }
                this.f20510e = visitor.visitInt(z2, i, z, h3Var.f20510e);
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
                                this.f20510e = codedInputStream.readInt32();
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
                if (f20509g == null) {
                    synchronized (C8094h3.class) {
                        if (f20509g == null) {
                            f20509g = new DefaultInstanceBasedParser(f20508f);
                        }
                    }
                }
                return f20509g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20508f;
    }

    public int getAnnouncementId() {
        return this.f20510e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f20510e;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f20510e;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
    }
}
