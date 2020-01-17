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

/* renamed from: co.znly.models.services.r5 */
public final class C8262r5 extends GeneratedMessageLite<C8262r5, C8263a> implements ZenlyProto$UserReportRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C8262r5 f20888i = new C8262r5();

    /* renamed from: j */
    private static volatile Parser<C8262r5> f20889j;

    /* renamed from: e */
    private String f20890e;

    /* renamed from: f */
    private String f20891f;

    /* renamed from: g */
    private String f20892g;

    /* renamed from: h */
    private boolean f20893h;

    /* renamed from: co.znly.models.services.r5$a */
    public static final class C8263a extends Builder<C8262r5, C8263a> implements ZenlyProto$UserReportRequestOrBuilder {
        /* synthetic */ C8263a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8263a mo22225a(String str) {
            copyOnWrite();
            ((C8262r5) this.instance).m19328a(str);
            return this;
        }

        /* renamed from: b */
        public C8263a mo22227b(String str) {
            copyOnWrite();
            ((C8262r5) this.instance).m19331b(str);
            return this;
        }

        /* renamed from: c */
        public C8263a mo22228c(String str) {
            copyOnWrite();
            ((C8262r5) this.instance).m19333c(str);
            return this;
        }

        public boolean getIsTargetBlocked() {
            return ((C8262r5) this.instance).getIsTargetBlocked();
        }

        public String getReason() {
            return ((C8262r5) this.instance).getReason();
        }

        public ByteString getReasonBytes() {
            return ((C8262r5) this.instance).getReasonBytes();
        }

        public String getTargetUuid() {
            return ((C8262r5) this.instance).getTargetUuid();
        }

        public ByteString getTargetUuidBytes() {
            return ((C8262r5) this.instance).getTargetUuidBytes();
        }

        public String getUserReason() {
            return ((C8262r5) this.instance).getUserReason();
        }

        public ByteString getUserReasonBytes() {
            return ((C8262r5) this.instance).getUserReasonBytes();
        }

        private C8263a() {
            super(C8262r5.f20888i);
        }

        /* renamed from: a */
        public C8263a mo22226a(boolean z) {
            copyOnWrite();
            ((C8262r5) this.instance).m19329a(z);
            return this;
        }
    }

    static {
        f20888i.makeImmutable();
    }

    private C8262r5() {
        String str = "";
        this.f20890e = str;
        this.f20891f = str;
        this.f20892g = str;
    }

    public static C8263a newBuilder() {
        return (C8263a) f20888i.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8262r5();
            case 2:
                return f20888i;
            case 3:
                return null;
            case 4:
                return new C8263a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8262r5 r5Var = (C8262r5) obj2;
                this.f20890e = visitor.visitString(!this.f20890e.isEmpty(), this.f20890e, !r5Var.f20890e.isEmpty(), r5Var.f20890e);
                this.f20891f = visitor.visitString(!this.f20891f.isEmpty(), this.f20891f, !r5Var.f20891f.isEmpty(), r5Var.f20891f);
                this.f20892g = visitor.visitString(!this.f20892g.isEmpty(), this.f20892g, true ^ r5Var.f20892g.isEmpty(), r5Var.f20892g);
                boolean z = this.f20893h;
                boolean z2 = r5Var.f20893h;
                this.f20893h = visitor.visitBoolean(z, z, z2, z2);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f20890e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f20891f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f20892g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 32) {
                                this.f20893h = codedInputStream.readBool();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z3 = true;
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
                if (f20889j == null) {
                    synchronized (C8262r5.class) {
                        if (f20889j == null) {
                            f20889j = new DefaultInstanceBasedParser(f20888i);
                        }
                    }
                }
                return f20889j;
            default:
                throw new UnsupportedOperationException();
        }
        return f20888i;
    }

    public boolean getIsTargetBlocked() {
        return this.f20893h;
    }

    public String getReason() {
        return this.f20891f;
    }

    public ByteString getReasonBytes() {
        return ByteString.copyFromUtf8(this.f20891f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20890e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getTargetUuid());
        }
        if (!this.f20891f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getReason());
        }
        if (!this.f20892g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getUserReason());
        }
        boolean z = this.f20893h;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(4, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getTargetUuid() {
        return this.f20890e;
    }

    public ByteString getTargetUuidBytes() {
        return ByteString.copyFromUtf8(this.f20890e);
    }

    public String getUserReason() {
        return this.f20892g;
    }

    public ByteString getUserReasonBytes() {
        return ByteString.copyFromUtf8(this.f20892g);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20890e.isEmpty()) {
            codedOutputStream.writeString(1, getTargetUuid());
        }
        if (!this.f20891f.isEmpty()) {
            codedOutputStream.writeString(2, getReason());
        }
        if (!this.f20892g.isEmpty()) {
            codedOutputStream.writeString(3, getUserReason());
        }
        boolean z = this.f20893h;
        if (z) {
            codedOutputStream.writeBool(4, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m19331b(String str) {
        if (str != null) {
            this.f20890e = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m19333c(String str) {
        if (str != null) {
            this.f20892g = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19328a(String str) {
        if (str != null) {
            this.f20891f = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19329a(boolean z) {
        this.f20893h = z;
    }
}
