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

/* renamed from: co.znly.models.services.l0 */
public final class C8149l0 extends GeneratedMessageLite<C8149l0, C8150a> implements ZenlyProto$BestFriendsHideRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8149l0 f20639g = new C8149l0();

    /* renamed from: h */
    private static volatile Parser<C8149l0> f20640h;

    /* renamed from: e */
    private String f20641e = "";

    /* renamed from: f */
    private boolean f20642f;

    /* renamed from: co.znly.models.services.l0$a */
    public static final class C8150a extends Builder<C8149l0, C8150a> implements ZenlyProto$BestFriendsHideRequestOrBuilder {
        private C8150a() {
            super(C8149l0.f20639g);
        }

        /* synthetic */ C8150a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8150a mo22161a(String str) {
            copyOnWrite();
            ((C8149l0) this.instance).m19247a(str);
            return this;
        }

        /* renamed from: a */
        public C8150a mo22162a(boolean z) {
            copyOnWrite();
            ((C8149l0) this.instance).m19248a(z);
            return this;
        }

        public String getFriendUuid() {
            return ((C8149l0) this.instance).getFriendUuid();
        }

        public ByteString getFriendUuidBytes() {
            return ((C8149l0) this.instance).getFriendUuidBytes();
        }

        public boolean getHide() {
            return ((C8149l0) this.instance).getHide();
        }
    }

    static {
        f20639g.makeImmutable();
    }

    private C8149l0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19247a(String str) {
        if (str != null) {
            this.f20641e = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19248a(boolean z) {
        this.f20642f = z;
    }

    public static C8150a newBuilder() {
        return (C8150a) f20639g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8149l0();
            case 2:
                return f20639g;
            case 3:
                return null;
            case 4:
                return new C8150a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8149l0 l0Var = (C8149l0) obj2;
                this.f20641e = visitor.visitString(!this.f20641e.isEmpty(), this.f20641e, true ^ l0Var.f20641e.isEmpty(), l0Var.f20641e);
                boolean z = this.f20642f;
                boolean z2 = l0Var.f20642f;
                this.f20642f = visitor.visitBoolean(z, z, z2, z2);
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
                                this.f20641e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f20642f = codedInputStream.readBool();
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
                if (f20640h == null) {
                    synchronized (C8149l0.class) {
                        if (f20640h == null) {
                            f20640h = new DefaultInstanceBasedParser(f20639g);
                        }
                    }
                }
                return f20640h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20639g;
    }

    public String getFriendUuid() {
        return this.f20641e;
    }

    public ByteString getFriendUuidBytes() {
        return ByteString.copyFromUtf8(this.f20641e);
    }

    public boolean getHide() {
        return this.f20642f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20641e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getFriendUuid());
        }
        boolean z = this.f20642f;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(2, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20641e.isEmpty()) {
            codedOutputStream.writeString(1, getFriendUuid());
        }
        boolean z = this.f20642f;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
    }
}
