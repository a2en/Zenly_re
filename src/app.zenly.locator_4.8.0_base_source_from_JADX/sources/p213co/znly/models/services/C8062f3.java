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

/* renamed from: co.znly.models.services.f3 */
public final class C8062f3 extends GeneratedMessageLite<C8062f3, C8063a> implements ZenlyProto$InboxHideRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8062f3 f20443g = new C8062f3();

    /* renamed from: h */
    private static volatile Parser<C8062f3> f20444h;

    /* renamed from: e */
    private String f20445e;

    /* renamed from: f */
    private String f20446f;

    /* renamed from: co.znly.models.services.f3$a */
    public static final class C8063a extends Builder<C8062f3, C8063a> implements ZenlyProto$InboxHideRequestOrBuilder {
        private C8063a() {
            super(C8062f3.f20443g);
        }

        /* synthetic */ C8063a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8063a mo22065a(String str) {
            copyOnWrite();
            ((C8062f3) this.instance).m19122a(str);
            return this;
        }

        public String getTargetUuid() {
            return ((C8062f3) this.instance).getTargetUuid();
        }

        public ByteString getTargetUuidBytes() {
            return ((C8062f3) this.instance).getTargetUuidBytes();
        }

        public String getTip() {
            return ((C8062f3) this.instance).getTip();
        }

        public ByteString getTipBytes() {
            return ((C8062f3) this.instance).getTipBytes();
        }
    }

    static {
        f20443g.makeImmutable();
    }

    private C8062f3() {
        String str = "";
        this.f20445e = str;
        this.f20446f = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19122a(String str) {
        if (str != null) {
            this.f20445e = str;
            return;
        }
        throw new NullPointerException();
    }

    public static C8063a newBuilder() {
        return (C8063a) f20443g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8062f3();
            case 2:
                return f20443g;
            case 3:
                return null;
            case 4:
                return new C8063a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8062f3 f3Var = (C8062f3) obj2;
                this.f20445e = visitor.visitString(!this.f20445e.isEmpty(), this.f20445e, !f3Var.f20445e.isEmpty(), f3Var.f20445e);
                this.f20446f = visitor.visitString(!this.f20446f.isEmpty(), this.f20446f, true ^ f3Var.f20446f.isEmpty(), f3Var.f20446f);
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
                                this.f20445e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f20446f = codedInputStream.readStringRequireUtf8();
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
                if (f20444h == null) {
                    synchronized (C8062f3.class) {
                        if (f20444h == null) {
                            f20444h = new DefaultInstanceBasedParser(f20443g);
                        }
                    }
                }
                return f20444h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20443g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20445e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getTargetUuid());
        }
        if (!this.f20446f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getTip());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getTargetUuid() {
        return this.f20445e;
    }

    public ByteString getTargetUuidBytes() {
        return ByteString.copyFromUtf8(this.f20445e);
    }

    public String getTip() {
        return this.f20446f;
    }

    public ByteString getTipBytes() {
        return ByteString.copyFromUtf8(this.f20446f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20445e.isEmpty()) {
            codedOutputStream.writeString(1, getTargetUuid());
        }
        if (!this.f20446f.isEmpty()) {
            codedOutputStream.writeString(2, getTip());
        }
    }
}
