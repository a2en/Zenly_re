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

/* renamed from: co.znly.models.services.s2 */
public final class C8271s2 extends GeneratedMessageLite<C8271s2, C8272a> implements ZenlyProto$FriendDeleteRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8271s2 f20911f = new C8271s2();

    /* renamed from: g */
    private static volatile Parser<C8271s2> f20912g;

    /* renamed from: e */
    private String f20913e = "";

    /* renamed from: co.znly.models.services.s2$a */
    public static final class C8272a extends Builder<C8271s2, C8272a> implements ZenlyProto$FriendDeleteRequestOrBuilder {
        /* synthetic */ C8272a(C8104i0 i0Var) {
            this();
        }

        public String getUuid() {
            return ((C8271s2) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C8271s2) this.instance).getUuidBytes();
        }

        public C8272a setUuid(String str) {
            copyOnWrite();
            ((C8271s2) this.instance).setUuid(str);
            return this;
        }

        private C8272a() {
            super(C8271s2.f20911f);
        }
    }

    static {
        f20911f.makeImmutable();
    }

    private C8271s2() {
    }

    public static C8272a newBuilder() {
        return (C8272a) f20911f.toBuilder();
    }

    /* access modifiers changed from: private */
    public void setUuid(String str) {
        if (str != null) {
            this.f20913e = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8271s2();
            case 2:
                return f20911f;
            case 3:
                return null;
            case 4:
                return new C8272a(null);
            case 5:
                C8271s2 s2Var = (C8271s2) obj2;
                this.f20913e = ((Visitor) obj).visitString(!this.f20913e.isEmpty(), this.f20913e, true ^ s2Var.f20913e.isEmpty(), s2Var.f20913e);
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
                                this.f20913e = codedInputStream.readStringRequireUtf8();
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
                if (f20912g == null) {
                    synchronized (C8271s2.class) {
                        if (f20912g == null) {
                            f20912g = new DefaultInstanceBasedParser(f20911f);
                        }
                    }
                }
                return f20912g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20911f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20913e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUuid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUuid() {
        return this.f20913e;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f20913e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20913e.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
    }
}
