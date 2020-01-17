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

/* renamed from: co.znly.models.services.r2 */
public final class C8256r2 extends GeneratedMessageLite<C8256r2, C8257a> implements ZenlyProto$FootstepsWebSetResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8256r2 f20876f = new C8256r2();

    /* renamed from: g */
    private static volatile Parser<C8256r2> f20877g;

    /* renamed from: e */
    private String f20878e = "";

    /* renamed from: co.znly.models.services.r2$a */
    public static final class C8257a extends Builder<C8256r2, C8257a> implements ZenlyProto$FootstepsWebSetResponseOrBuilder {
        /* synthetic */ C8257a(C8104i0 i0Var) {
            this();
        }

        public String getUrl() {
            return ((C8256r2) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((C8256r2) this.instance).getUrlBytes();
        }

        private C8257a() {
            super(C8256r2.f20876f);
        }
    }

    static {
        f20876f.makeImmutable();
    }

    private C8256r2() {
    }

    public static C8257a newBuilder() {
        return (C8257a) f20876f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8256r2();
            case 2:
                return f20876f;
            case 3:
                return null;
            case 4:
                return new C8257a(null);
            case 5:
                C8256r2 r2Var = (C8256r2) obj2;
                this.f20878e = ((Visitor) obj).visitString(!this.f20878e.isEmpty(), this.f20878e, true ^ r2Var.f20878e.isEmpty(), r2Var.f20878e);
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
                            if (readTag == 10) {
                                this.f20878e = codedInputStream.readStringRequireUtf8();
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
                if (f20877g == null) {
                    synchronized (C8256r2.class) {
                        if (f20877g == null) {
                            f20877g = new DefaultInstanceBasedParser(f20876f);
                        }
                    }
                }
                return f20877g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20876f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20878e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUrl());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUrl() {
        return this.f20878e;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.f20878e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20878e.isEmpty()) {
            codedOutputStream.writeString(1, getUrl());
        }
    }
}
