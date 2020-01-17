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
import p213co.znly.models.C7280e;

/* renamed from: co.znly.models.services.c1 */
public final class C8008c1 extends GeneratedMessageLite<C8008c1, C8009a> implements ZenlyProto$ChatCursorStreamEventOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C8008c1 f20322j = new C8008c1();

    /* renamed from: k */
    private static volatile Parser<C8008c1> f20323k;

    /* renamed from: e */
    private int f20324e;

    /* renamed from: f */
    private String f20325f;

    /* renamed from: g */
    private String f20326g;

    /* renamed from: h */
    private String f20327h;

    /* renamed from: i */
    private String f20328i;

    /* renamed from: co.znly.models.services.c1$a */
    public static final class C8009a extends Builder<C8008c1, C8009a> implements ZenlyProto$ChatCursorStreamEventOrBuilder {
        /* synthetic */ C8009a(C8104i0 i0Var) {
            this();
        }

        public String getConversationUuid() {
            return ((C8008c1) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C8008c1) this.instance).getConversationUuidBytes();
        }

        public String getCursor() {
            return ((C8008c1) this.instance).getCursor();
        }

        public ByteString getCursorBytes() {
            return ((C8008c1) this.instance).getCursorBytes();
        }

        public C7280e getOp() {
            return ((C8008c1) this.instance).getOp();
        }

        public int getOpValue() {
            return ((C8008c1) this.instance).getOpValue();
        }

        public String getTargetUuid() {
            return ((C8008c1) this.instance).getTargetUuid();
        }

        public ByteString getTargetUuidBytes() {
            return ((C8008c1) this.instance).getTargetUuidBytes();
        }

        public String getUserUuid() {
            return ((C8008c1) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C8008c1) this.instance).getUserUuidBytes();
        }

        private C8009a() {
            super(C8008c1.f20322j);
        }
    }

    static {
        f20322j.makeImmutable();
    }

    private C8008c1() {
        String str = "";
        this.f20325f = str;
        this.f20326g = str;
        this.f20327h = str;
        this.f20328i = str;
    }

    public static C8009a newBuilder() {
        return (C8009a) f20322j.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8008c1();
            case 2:
                return f20322j;
            case 3:
                return null;
            case 4:
                return new C8009a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8008c1 c1Var = (C8008c1) obj2;
                boolean z2 = this.f20324e != 0;
                int i = this.f20324e;
                if (c1Var.f20324e != 0) {
                    z = true;
                }
                this.f20324e = visitor.visitInt(z2, i, z, c1Var.f20324e);
                this.f20325f = visitor.visitString(!this.f20325f.isEmpty(), this.f20325f, !c1Var.f20325f.isEmpty(), c1Var.f20325f);
                this.f20326g = visitor.visitString(!this.f20326g.isEmpty(), this.f20326g, !c1Var.f20326g.isEmpty(), c1Var.f20326g);
                this.f20327h = visitor.visitString(!this.f20327h.isEmpty(), this.f20327h, !c1Var.f20327h.isEmpty(), c1Var.f20327h);
                this.f20328i = visitor.visitString(!this.f20328i.isEmpty(), this.f20328i, !c1Var.f20328i.isEmpty(), c1Var.f20328i);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f20324e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                this.f20325f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f20326g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.f20327h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 50) {
                                this.f20328i = codedInputStream.readStringRequireUtf8();
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
                if (f20323k == null) {
                    synchronized (C8008c1.class) {
                        if (f20323k == null) {
                            f20323k = new DefaultInstanceBasedParser(f20322j);
                        }
                    }
                }
                return f20323k;
            default:
                throw new UnsupportedOperationException();
        }
        return f20322j;
    }

    public String getConversationUuid() {
        return this.f20325f;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f20325f);
    }

    public String getCursor() {
        return this.f20326g;
    }

    public ByteString getCursorBytes() {
        return ByteString.copyFromUtf8(this.f20326g);
    }

    public C7280e getOp() {
        C7280e a = C7280e.m17990a(this.f20324e);
        return a == null ? C7280e.UNRECOGNIZED : a;
    }

    public int getOpValue() {
        return this.f20324e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20324e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20324e);
        }
        if (!this.f20325f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getConversationUuid());
        }
        if (!this.f20326g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getCursor());
        }
        if (!this.f20327h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getUserUuid());
        }
        if (!this.f20328i.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(6, getTargetUuid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getTargetUuid() {
        return this.f20328i;
    }

    public ByteString getTargetUuidBytes() {
        return ByteString.copyFromUtf8(this.f20328i);
    }

    public String getUserUuid() {
        return this.f20327h;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f20327h);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20324e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20324e);
        }
        if (!this.f20325f.isEmpty()) {
            codedOutputStream.writeString(2, getConversationUuid());
        }
        if (!this.f20326g.isEmpty()) {
            codedOutputStream.writeString(3, getCursor());
        }
        if (!this.f20327h.isEmpty()) {
            codedOutputStream.writeString(4, getUserUuid());
        }
        if (!this.f20328i.isEmpty()) {
            codedOutputStream.writeString(6, getTargetUuid());
        }
    }
}
