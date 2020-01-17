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

/* renamed from: co.znly.models.services.h2 */
public final class C8092h2 extends GeneratedMessageLite<C8092h2, C8093a> implements ZenlyProto$FootstepsLinkViewsResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8092h2 f20505f = new C8092h2();

    /* renamed from: g */
    private static volatile Parser<C8092h2> f20506g;

    /* renamed from: e */
    private long f20507e;

    /* renamed from: co.znly.models.services.h2$a */
    public static final class C8093a extends Builder<C8092h2, C8093a> implements ZenlyProto$FootstepsLinkViewsResponseOrBuilder {
        private C8093a() {
            super(C8092h2.f20505f);
        }

        /* synthetic */ C8093a(C8104i0 i0Var) {
            this();
        }

        public long getViews() {
            return ((C8092h2) this.instance).getViews();
        }
    }

    static {
        f20505f.makeImmutable();
    }

    private C8092h2() {
    }

    public static C8093a newBuilder() {
        return (C8093a) f20505f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8092h2();
            case 2:
                return f20505f;
            case 3:
                return null;
            case 4:
                return new C8093a(null);
            case 5:
                C8092h2 h2Var = (C8092h2) obj2;
                this.f20507e = ((Visitor) obj).visitLong(this.f20507e != 0, this.f20507e, h2Var.f20507e != 0, h2Var.f20507e);
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
                                this.f20507e = codedInputStream.readInt64();
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
                if (f20506g == null) {
                    synchronized (C8092h2.class) {
                        if (f20506g == null) {
                            f20506g = new DefaultInstanceBasedParser(f20505f);
                        }
                    }
                }
                return f20506g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20505f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f20507e;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeInt64Size(1, j);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public long getViews() {
        return this.f20507e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f20507e;
        if (j != 0) {
            codedOutputStream.writeInt64(1, j);
        }
    }
}
