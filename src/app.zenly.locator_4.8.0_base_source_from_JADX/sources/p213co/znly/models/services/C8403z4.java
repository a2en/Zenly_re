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

/* renamed from: co.znly.models.services.z4 */
public final class C8403z4 extends GeneratedMessageLite<C8403z4, C8404a> implements ZenlyProto$TimeTogetherMutualLoveHideRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8403z4 f21268g = new C8403z4();

    /* renamed from: h */
    private static volatile Parser<C8403z4> f21269h;

    /* renamed from: e */
    private String f21270e = "";

    /* renamed from: f */
    private boolean f21271f;

    /* renamed from: co.znly.models.services.z4$a */
    public static final class C8404a extends Builder<C8403z4, C8404a> implements ZenlyProto$TimeTogetherMutualLoveHideRequestOrBuilder {
        private C8404a() {
            super(C8403z4.f21268g);
        }

        /* synthetic */ C8404a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8404a mo22344a(String str) {
            copyOnWrite();
            ((C8403z4) this.instance).m19492a(str);
            return this;
        }

        /* renamed from: a */
        public C8404a mo22345a(boolean z) {
            copyOnWrite();
            ((C8403z4) this.instance).m19493a(z);
            return this;
        }

        public String getFriendUuid() {
            return ((C8403z4) this.instance).getFriendUuid();
        }

        public ByteString getFriendUuidBytes() {
            return ((C8403z4) this.instance).getFriendUuidBytes();
        }

        public boolean getHide() {
            return ((C8403z4) this.instance).getHide();
        }
    }

    static {
        f21268g.makeImmutable();
    }

    private C8403z4() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19492a(String str) {
        if (str != null) {
            this.f21270e = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19493a(boolean z) {
        this.f21271f = z;
    }

    public static C8404a newBuilder() {
        return (C8404a) f21268g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8403z4();
            case 2:
                return f21268g;
            case 3:
                return null;
            case 4:
                return new C8404a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8403z4 z4Var = (C8403z4) obj2;
                this.f21270e = visitor.visitString(!this.f21270e.isEmpty(), this.f21270e, true ^ z4Var.f21270e.isEmpty(), z4Var.f21270e);
                boolean z = this.f21271f;
                boolean z2 = z4Var.f21271f;
                this.f21271f = visitor.visitBoolean(z, z, z2, z2);
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
                                this.f21270e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f21271f = codedInputStream.readBool();
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
                if (f21269h == null) {
                    synchronized (C8403z4.class) {
                        if (f21269h == null) {
                            f21269h = new DefaultInstanceBasedParser(f21268g);
                        }
                    }
                }
                return f21269h;
            default:
                throw new UnsupportedOperationException();
        }
        return f21268g;
    }

    public String getFriendUuid() {
        return this.f21270e;
    }

    public ByteString getFriendUuidBytes() {
        return ByteString.copyFromUtf8(this.f21270e);
    }

    public boolean getHide() {
        return this.f21271f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f21270e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getFriendUuid());
        }
        boolean z = this.f21271f;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(2, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f21270e.isEmpty()) {
            codedOutputStream.writeString(1, getFriendUuid());
        }
        boolean z = this.f21271f;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
    }
}
