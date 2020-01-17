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

/* renamed from: co.znly.models.services.m3 */
public final class C8169m3 extends GeneratedMessageLite<C8169m3, C8170a> implements ZenlyProto$NightsHideLocationRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8169m3 f20681f = new C8169m3();

    /* renamed from: g */
    private static volatile Parser<C8169m3> f20682g;

    /* renamed from: e */
    private String f20683e = "";

    /* renamed from: co.znly.models.services.m3$a */
    public static final class C8170a extends Builder<C8169m3, C8170a> implements ZenlyProto$NightsHideLocationRequestOrBuilder {
        private C8170a() {
            super(C8169m3.f20681f);
        }

        /* synthetic */ C8170a(C8104i0 i0Var) {
            this();
        }

        public String getLocationId() {
            return ((C8169m3) this.instance).getLocationId();
        }

        public ByteString getLocationIdBytes() {
            return ((C8169m3) this.instance).getLocationIdBytes();
        }
    }

    static {
        f20681f.makeImmutable();
    }

    private C8169m3() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8169m3();
            case 2:
                return f20681f;
            case 3:
                return null;
            case 4:
                return new C8170a(null);
            case 5:
                C8169m3 m3Var = (C8169m3) obj2;
                this.f20683e = ((Visitor) obj).visitString(!this.f20683e.isEmpty(), this.f20683e, true ^ m3Var.f20683e.isEmpty(), m3Var.f20683e);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 18) {
                                this.f20683e = codedInputStream.readStringRequireUtf8();
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
                if (f20682g == null) {
                    synchronized (C8169m3.class) {
                        if (f20682g == null) {
                            f20682g = new DefaultInstanceBasedParser(f20681f);
                        }
                    }
                }
                return f20682g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20681f;
    }

    public String getLocationId() {
        return this.f20683e;
    }

    public ByteString getLocationIdBytes() {
        return ByteString.copyFromUtf8(this.f20683e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20683e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(2, getLocationId());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20683e.isEmpty()) {
            codedOutputStream.writeString(2, getLocationId());
        }
    }
}
