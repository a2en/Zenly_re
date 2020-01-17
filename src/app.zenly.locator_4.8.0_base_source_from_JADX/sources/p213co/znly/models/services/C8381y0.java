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

/* renamed from: co.znly.models.services.y0 */
public final class C8381y0 extends GeneratedMessageLite<C8381y0, C8382a> implements ZenlyProto$ChatConversationUnMuteRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8381y0 f21230f = new C8381y0();

    /* renamed from: g */
    private static volatile Parser<C8381y0> f21231g;

    /* renamed from: e */
    private String f21232e = "";

    /* renamed from: co.znly.models.services.y0$a */
    public static final class C8382a extends Builder<C8381y0, C8382a> implements ZenlyProto$ChatConversationUnMuteRequestOrBuilder {
        private C8382a() {
            super(C8381y0.f21230f);
        }

        /* synthetic */ C8382a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8382a mo22339a(String str) {
            copyOnWrite();
            ((C8381y0) this.instance).m19467a(str);
            return this;
        }

        public String getConversationUuid() {
            return ((C8381y0) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C8381y0) this.instance).getConversationUuidBytes();
        }
    }

    static {
        f21230f.makeImmutable();
    }

    private C8381y0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19467a(String str) {
        if (str != null) {
            this.f21232e = str;
            return;
        }
        throw new NullPointerException();
    }

    public static C8382a newBuilder() {
        return (C8382a) f21230f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8381y0();
            case 2:
                return f21230f;
            case 3:
                return null;
            case 4:
                return new C8382a(null);
            case 5:
                C8381y0 y0Var = (C8381y0) obj2;
                this.f21232e = ((Visitor) obj).visitString(!this.f21232e.isEmpty(), this.f21232e, true ^ y0Var.f21232e.isEmpty(), y0Var.f21232e);
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
                                this.f21232e = codedInputStream.readStringRequireUtf8();
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
                if (f21231g == null) {
                    synchronized (C8381y0.class) {
                        if (f21231g == null) {
                            f21231g = new DefaultInstanceBasedParser(f21230f);
                        }
                    }
                }
                return f21231g;
            default:
                throw new UnsupportedOperationException();
        }
        return f21230f;
    }

    public String getConversationUuid() {
        return this.f21232e;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f21232e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f21232e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getConversationUuid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f21232e.isEmpty()) {
            codedOutputStream.writeString(1, getConversationUuid());
        }
    }
}
