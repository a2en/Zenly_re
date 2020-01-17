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

/* renamed from: co.znly.models.services.c5 */
public final class C8016c5 extends GeneratedMessageLite<C8016c5, C8017a> implements ZenlyProto$TrackingContextSubscribeStreamEvent$PackOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8016c5 f20343g = new C8016c5();

    /* renamed from: h */
    private static volatile Parser<C8016c5> f20344h;

    /* renamed from: e */
    private long f20345e;

    /* renamed from: f */
    private int f20346f;

    /* renamed from: co.znly.models.services.c5$a */
    public static final class C8017a extends Builder<C8016c5, C8017a> implements ZenlyProto$TrackingContextSubscribeStreamEvent$PackOrBuilder {
        /* synthetic */ C8017a(C8104i0 i0Var) {
            this();
        }

        public long getTcLatLngHPrec() {
            return ((C8016c5) this.instance).getTcLatLngHPrec();
        }

        public int getUserUuidCacheIdx() {
            return ((C8016c5) this.instance).getUserUuidCacheIdx();
        }

        private C8017a() {
            super(C8016c5.f20343g);
        }
    }

    static {
        f20343g.makeImmutable();
    }

    private C8016c5() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8016c5();
            case 2:
                return f20343g;
            case 3:
                return null;
            case 4:
                return new C8017a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8016c5 c5Var = (C8016c5) obj2;
                this.f20345e = visitor.visitLong(this.f20345e != 0, this.f20345e, c5Var.f20345e != 0, c5Var.f20345e);
                boolean z2 = this.f20346f != 0;
                int i = this.f20346f;
                if (c5Var.f20346f != 0) {
                    z = true;
                }
                this.f20346f = visitor.visitInt(z2, i, z, c5Var.f20346f);
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
                                this.f20345e = codedInputStream.readUInt64();
                            } else if (readTag == 16) {
                                this.f20346f = codedInputStream.readInt32();
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
                if (f20344h == null) {
                    synchronized (C8016c5.class) {
                        if (f20344h == null) {
                            f20344h = new DefaultInstanceBasedParser(f20343g);
                        }
                    }
                }
                return f20344h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20343g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f20345e;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeUInt64Size(1, j);
        }
        int i3 = this.f20346f;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(2, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public long getTcLatLngHPrec() {
        return this.f20345e;
    }

    public int getUserUuidCacheIdx() {
        return this.f20346f;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f20345e;
        if (j != 0) {
            codedOutputStream.writeUInt64(1, j);
        }
        int i = this.f20346f;
        if (i != 0) {
            codedOutputStream.writeInt32(2, i);
        }
    }
}
