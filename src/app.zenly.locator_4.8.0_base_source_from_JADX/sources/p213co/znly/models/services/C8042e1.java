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

/* renamed from: co.znly.models.services.e1 */
public final class C8042e1 extends GeneratedMessageLite<C8042e1, C8043a> implements ZenlyProto$ChatDeleteMessageResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8042e1 f20404g = new C8042e1();

    /* renamed from: h */
    private static volatile Parser<C8042e1> f20405h;

    /* renamed from: e */
    private String f20406e;

    /* renamed from: f */
    private String f20407f;

    /* renamed from: co.znly.models.services.e1$a */
    public static final class C8043a extends Builder<C8042e1, C8043a> implements ZenlyProto$ChatDeleteMessageResponseOrBuilder {
        /* synthetic */ C8043a(C8104i0 i0Var) {
            this();
        }

        public String getConversationUuid() {
            return ((C8042e1) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C8042e1) this.instance).getConversationUuidBytes();
        }

        public String getMessageUuid() {
            return ((C8042e1) this.instance).getMessageUuid();
        }

        public ByteString getMessageUuidBytes() {
            return ((C8042e1) this.instance).getMessageUuidBytes();
        }

        private C8043a() {
            super(C8042e1.f20404g);
        }
    }

    static {
        f20404g.makeImmutable();
    }

    private C8042e1() {
        String str = "";
        this.f20406e = str;
        this.f20407f = str;
    }

    public static C8043a newBuilder() {
        return (C8043a) f20404g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8042e1();
            case 2:
                return f20404g;
            case 3:
                return null;
            case 4:
                return new C8043a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8042e1 e1Var = (C8042e1) obj2;
                this.f20406e = visitor.visitString(!this.f20406e.isEmpty(), this.f20406e, !e1Var.f20406e.isEmpty(), e1Var.f20406e);
                this.f20407f = visitor.visitString(!this.f20407f.isEmpty(), this.f20407f, true ^ e1Var.f20407f.isEmpty(), e1Var.f20407f);
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
                                this.f20406e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f20407f = codedInputStream.readStringRequireUtf8();
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
                if (f20405h == null) {
                    synchronized (C8042e1.class) {
                        if (f20405h == null) {
                            f20405h = new DefaultInstanceBasedParser(f20404g);
                        }
                    }
                }
                return f20405h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20404g;
    }

    public String getConversationUuid() {
        return this.f20406e;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f20406e);
    }

    public String getMessageUuid() {
        return this.f20407f;
    }

    public ByteString getMessageUuidBytes() {
        return ByteString.copyFromUtf8(this.f20407f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20406e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getConversationUuid());
        }
        if (!this.f20407f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getMessageUuid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20406e.isEmpty()) {
            codedOutputStream.writeString(1, getConversationUuid());
        }
        if (!this.f20407f.isEmpty()) {
            codedOutputStream.writeString(2, getMessageUuid());
        }
    }
}
