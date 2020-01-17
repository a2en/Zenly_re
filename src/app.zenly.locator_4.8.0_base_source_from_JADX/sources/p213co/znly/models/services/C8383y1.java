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

/* renamed from: co.znly.models.services.y1 */
public final class C8383y1 extends GeneratedMessageLite<C8383y1, C8384a> implements ZenlyProto$DebugUserRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8383y1 f21233f = new C8383y1();

    /* renamed from: g */
    private static volatile Parser<C8383y1> f21234g;

    /* renamed from: e */
    private String f21235e = "";

    /* renamed from: co.znly.models.services.y1$a */
    public static final class C8384a extends Builder<C8383y1, C8384a> implements ZenlyProto$DebugUserRequestOrBuilder {
        private C8384a() {
            super(C8383y1.f21233f);
        }

        /* synthetic */ C8384a(C8104i0 i0Var) {
            this();
        }

        public String getUser() {
            return ((C8383y1) this.instance).getUser();
        }

        public ByteString getUserBytes() {
            return ((C8383y1) this.instance).getUserBytes();
        }
    }

    static {
        f21233f.makeImmutable();
    }

    private C8383y1() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8383y1();
            case 2:
                return f21233f;
            case 3:
                return null;
            case 4:
                return new C8384a(null);
            case 5:
                C8383y1 y1Var = (C8383y1) obj2;
                this.f21235e = ((Visitor) obj).visitString(!this.f21235e.isEmpty(), this.f21235e, true ^ y1Var.f21235e.isEmpty(), y1Var.f21235e);
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
                                this.f21235e = codedInputStream.readStringRequireUtf8();
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
                if (f21234g == null) {
                    synchronized (C8383y1.class) {
                        if (f21234g == null) {
                            f21234g = new DefaultInstanceBasedParser(f21233f);
                        }
                    }
                }
                return f21234g;
            default:
                throw new UnsupportedOperationException();
        }
        return f21233f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f21235e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUser());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUser() {
        return this.f21235e;
    }

    public ByteString getUserBytes() {
        return ByteString.copyFromUtf8(this.f21235e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f21235e.isEmpty()) {
            codedOutputStream.writeString(1, getUser());
        }
    }
}
