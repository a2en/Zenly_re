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

/* renamed from: co.znly.models.core.z2 */
public final class C7268z2 extends GeneratedMessageLite<C7268z2, C7269a> implements UploadProto$ProgressOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7268z2 f18033h = new C7268z2();

    /* renamed from: i */
    private static volatile Parser<C7268z2> f18034i;

    /* renamed from: e */
    private long f18035e;

    /* renamed from: f */
    private long f18036f;

    /* renamed from: g */
    private long f18037g;

    /* renamed from: co.znly.models.core.z2$a */
    public static final class C7269a extends Builder<C7268z2, C7269a> implements UploadProto$ProgressOrBuilder {
        /* synthetic */ C7269a(C7254x2 x2Var) {
            this();
        }

        public long getProgress() {
            return ((C7268z2) this.instance).getProgress();
        }

        public long getSent() {
            return ((C7268z2) this.instance).getSent();
        }

        public long getTotal() {
            return ((C7268z2) this.instance).getTotal();
        }

        private C7269a() {
            super(C7268z2.f18033h);
        }
    }

    static {
        f18033h.makeImmutable();
    }

    private C7268z2() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7254x2.f17991a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7268z2();
            case 2:
                return f18033h;
            case 3:
                return null;
            case 4:
                return new C7269a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7268z2 z2Var = (C7268z2) obj2;
                this.f18035e = visitor.visitLong(this.f18035e != 0, this.f18035e, z2Var.f18035e != 0, z2Var.f18035e);
                this.f18036f = visitor.visitLong(this.f18036f != 0, this.f18036f, z2Var.f18036f != 0, z2Var.f18036f);
                this.f18037g = visitor.visitLong(this.f18037g != 0, this.f18037g, z2Var.f18037g != 0, z2Var.f18037g);
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
                                this.f18035e = codedInputStream.readInt64();
                            } else if (readTag == 16) {
                                this.f18036f = codedInputStream.readInt64();
                            } else if (readTag == 24) {
                                this.f18037g = codedInputStream.readInt64();
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
                if (f18034i == null) {
                    synchronized (C7268z2.class) {
                        if (f18034i == null) {
                            f18034i = new DefaultInstanceBasedParser(f18033h);
                        }
                    }
                }
                return f18034i;
            default:
                throw new UnsupportedOperationException();
        }
        return f18033h;
    }

    public long getProgress() {
        return this.f18037g;
    }

    public long getSent() {
        return this.f18036f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f18035e;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeInt64Size(1, j);
        }
        long j2 = this.f18036f;
        if (j2 != 0) {
            i2 += CodedOutputStream.computeInt64Size(2, j2);
        }
        long j3 = this.f18037g;
        if (j3 != 0) {
            i2 += CodedOutputStream.computeInt64Size(3, j3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public long getTotal() {
        return this.f18035e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f18035e;
        if (j != 0) {
            codedOutputStream.writeInt64(1, j);
        }
        long j2 = this.f18036f;
        if (j2 != 0) {
            codedOutputStream.writeInt64(2, j2);
        }
        long j3 = this.f18037g;
        if (j3 != 0) {
            codedOutputStream.writeInt64(3, j3);
        }
    }
}
