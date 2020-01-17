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

/* renamed from: co.znly.models.services.i1 */
public final class C8105i1 extends GeneratedMessageLite<C8105i1, C8106a> implements ZenlyProto$ChatGroupConversationUpdateRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8105i1 f20546g = new C8105i1();

    /* renamed from: h */
    private static volatile Parser<C8105i1> f20547h;

    /* renamed from: e */
    private String f20548e;

    /* renamed from: f */
    private String f20549f;

    /* renamed from: co.znly.models.services.i1$a */
    public static final class C8106a extends Builder<C8105i1, C8106a> implements ZenlyProto$ChatGroupConversationUpdateRequestOrBuilder {
        private C8106a() {
            super(C8105i1.f20546g);
        }

        /* synthetic */ C8106a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8106a mo22148a(String str) {
            copyOnWrite();
            ((C8105i1) this.instance).m19187a(str);
            return this;
        }

        public String getConversationUuid() {
            return ((C8105i1) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C8105i1) this.instance).getConversationUuidBytes();
        }

        public String getName() {
            return ((C8105i1) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((C8105i1) this.instance).getNameBytes();
        }

        public C8106a setName(String str) {
            copyOnWrite();
            ((C8105i1) this.instance).setName(str);
            return this;
        }
    }

    static {
        f20546g.makeImmutable();
    }

    private C8105i1() {
        String str = "";
        this.f20548e = str;
        this.f20549f = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19187a(String str) {
        if (str != null) {
            this.f20548e = str;
            return;
        }
        throw new NullPointerException();
    }

    public static C8106a newBuilder() {
        return (C8106a) f20546g.toBuilder();
    }

    /* access modifiers changed from: private */
    public void setName(String str) {
        if (str != null) {
            this.f20549f = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8105i1();
            case 2:
                return f20546g;
            case 3:
                return null;
            case 4:
                return new C8106a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8105i1 i1Var = (C8105i1) obj2;
                this.f20548e = visitor.visitString(!this.f20548e.isEmpty(), this.f20548e, !i1Var.f20548e.isEmpty(), i1Var.f20548e);
                this.f20549f = visitor.visitString(!this.f20549f.isEmpty(), this.f20549f, true ^ i1Var.f20549f.isEmpty(), i1Var.f20549f);
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
                                this.f20548e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f20549f = codedInputStream.readStringRequireUtf8();
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
                if (f20547h == null) {
                    synchronized (C8105i1.class) {
                        if (f20547h == null) {
                            f20547h = new DefaultInstanceBasedParser(f20546g);
                        }
                    }
                }
                return f20547h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20546g;
    }

    public String getConversationUuid() {
        return this.f20548e;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f20548e);
    }

    public String getName() {
        return this.f20549f;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.f20549f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20548e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getConversationUuid());
        }
        if (!this.f20549f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getName());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20548e.isEmpty()) {
            codedOutputStream.writeString(1, getConversationUuid());
        }
        if (!this.f20549f.isEmpty()) {
            codedOutputStream.writeString(2, getName());
        }
    }
}
