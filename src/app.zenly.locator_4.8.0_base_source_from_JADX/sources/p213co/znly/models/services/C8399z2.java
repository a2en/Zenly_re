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
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;

/* renamed from: co.znly.models.services.z2 */
public final class C8399z2 extends GeneratedMessageLite<C8399z2, C8400a> implements ZenlyProto$FriendRequestRespondRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8399z2 f21259g = new C8399z2();

    /* renamed from: h */
    private static volatile Parser<C8399z2> f21260h;

    /* renamed from: e */
    private String f21261e = "";

    /* renamed from: f */
    private int f21262f;

    /* renamed from: co.znly.models.services.z2$a */
    public static final class C8400a extends Builder<C8399z2, C8400a> implements ZenlyProto$FriendRequestRespondRequestOrBuilder {
        /* synthetic */ C8400a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8400a mo22342a(C6812c cVar) {
            copyOnWrite();
            ((C8399z2) this.instance).m19484a(cVar);
            return this;
        }

        public C6812c getStatus() {
            return ((C8399z2) this.instance).getStatus();
        }

        public int getStatusValue() {
            return ((C8399z2) this.instance).getStatusValue();
        }

        public String getUuid() {
            return ((C8399z2) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C8399z2) this.instance).getUuidBytes();
        }

        public C8400a setUuid(String str) {
            copyOnWrite();
            ((C8399z2) this.instance).setUuid(str);
            return this;
        }

        private C8400a() {
            super(C8399z2.f21259g);
        }
    }

    static {
        f21259g.makeImmutable();
    }

    private C8399z2() {
    }

    public static C8400a newBuilder() {
        return (C8400a) f21259g.toBuilder();
    }

    /* access modifiers changed from: private */
    public void setUuid(String str) {
        if (str != null) {
            this.f21261e = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8399z2();
            case 2:
                return f21259g;
            case 3:
                return null;
            case 4:
                return new C8400a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8399z2 z2Var = (C8399z2) obj2;
                this.f21261e = visitor.visitString(!this.f21261e.isEmpty(), this.f21261e, !z2Var.f21261e.isEmpty(), z2Var.f21261e);
                boolean z2 = this.f21262f != 0;
                int i = this.f21262f;
                if (z2Var.f21262f != 0) {
                    z = true;
                }
                this.f21262f = visitor.visitInt(z2, i, z, z2Var.f21262f);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f21261e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f21262f = codedInputStream.readEnum();
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
                if (f21260h == null) {
                    synchronized (C8399z2.class) {
                        if (f21260h == null) {
                            f21260h = new DefaultInstanceBasedParser(f21259g);
                        }
                    }
                }
                return f21260h;
            default:
                throw new UnsupportedOperationException();
        }
        return f21259g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f21261e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUuid());
        }
        if (this.f21262f != C6812c.unknown.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f21262f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C6812c getStatus() {
        C6812c a = C6812c.m17542a(this.f21262f);
        return a == null ? C6812c.UNRECOGNIZED : a;
    }

    public int getStatusValue() {
        return this.f21262f;
    }

    public String getUuid() {
        return this.f21261e;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f21261e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f21261e.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (this.f21262f != C6812c.unknown.getNumber()) {
            codedOutputStream.writeEnum(2, this.f21262f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19484a(C6812c cVar) {
        if (cVar != null) {
            this.f21262f = cVar.getNumber();
            return;
        }
        throw new NullPointerException();
    }
}
