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

/* renamed from: co.znly.models.services.p1 */
public final class C8222p1 extends GeneratedMessageLite<C8222p1, C8223a> implements ZenlyProto$ChatUpdateCursorRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8222p1 f20809g = new C8222p1();

    /* renamed from: h */
    private static volatile Parser<C8222p1> f20810h;

    /* renamed from: e */
    private String f20811e;

    /* renamed from: f */
    private String f20812f;

    /* renamed from: co.znly.models.services.p1$a */
    public static final class C8223a extends Builder<C8222p1, C8223a> implements ZenlyProto$ChatUpdateCursorRequestOrBuilder {
        /* synthetic */ C8223a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8223a mo22212a(String str) {
            copyOnWrite();
            ((C8222p1) this.instance).m19297a(str);
            return this;
        }

        /* renamed from: b */
        public C8223a mo22213b(String str) {
            copyOnWrite();
            ((C8222p1) this.instance).m19299b(str);
            return this;
        }

        public String getConversationUuid() {
            return ((C8222p1) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C8222p1) this.instance).getConversationUuidBytes();
        }

        public String getCursor() {
            return ((C8222p1) this.instance).getCursor();
        }

        public ByteString getCursorBytes() {
            return ((C8222p1) this.instance).getCursorBytes();
        }

        private C8223a() {
            super(C8222p1.f20809g);
        }
    }

    static {
        f20809g.makeImmutable();
    }

    private C8222p1() {
        String str = "";
        this.f20811e = str;
        this.f20812f = str;
    }

    public static C8223a newBuilder() {
        return (C8223a) f20809g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8222p1();
            case 2:
                return f20809g;
            case 3:
                return null;
            case 4:
                return new C8223a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8222p1 p1Var = (C8222p1) obj2;
                this.f20811e = visitor.visitString(!this.f20811e.isEmpty(), this.f20811e, !p1Var.f20811e.isEmpty(), p1Var.f20811e);
                this.f20812f = visitor.visitString(!this.f20812f.isEmpty(), this.f20812f, true ^ p1Var.f20812f.isEmpty(), p1Var.f20812f);
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
                                this.f20811e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f20812f = codedInputStream.readStringRequireUtf8();
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
                if (f20810h == null) {
                    synchronized (C8222p1.class) {
                        if (f20810h == null) {
                            f20810h = new DefaultInstanceBasedParser(f20809g);
                        }
                    }
                }
                return f20810h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20809g;
    }

    public String getConversationUuid() {
        return this.f20811e;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f20811e);
    }

    public String getCursor() {
        return this.f20812f;
    }

    public ByteString getCursorBytes() {
        return ByteString.copyFromUtf8(this.f20812f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20811e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getConversationUuid());
        }
        if (!this.f20812f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getCursor());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20811e.isEmpty()) {
            codedOutputStream.writeString(1, getConversationUuid());
        }
        if (!this.f20812f.isEmpty()) {
            codedOutputStream.writeString(2, getCursor());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m19299b(String str) {
        if (str != null) {
            this.f20812f = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19297a(String str) {
        if (str != null) {
            this.f20811e = str;
            return;
        }
        throw new NullPointerException();
    }
}
