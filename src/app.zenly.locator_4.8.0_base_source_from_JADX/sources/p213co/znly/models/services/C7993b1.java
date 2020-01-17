package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C7280e;
import p213co.znly.models.C7464s1;
import p213co.znly.models.C7464s1.C7465a;
import p213co.znly.models.PingProto$Conversation;
import p213co.znly.models.PingProto$Conversation.C6817a;

/* renamed from: co.znly.models.services.b1 */
public final class C7993b1 extends GeneratedMessageLite<C7993b1, C7994a> implements ZenlyProto$ChatConversationsStreamEventOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7993b1 f20287h = new C7993b1();

    /* renamed from: i */
    private static volatile Parser<C7993b1> f20288i;

    /* renamed from: e */
    private int f20289e;

    /* renamed from: f */
    private PingProto$Conversation f20290f;

    /* renamed from: g */
    private C7464s1 f20291g;

    /* renamed from: co.znly.models.services.b1$a */
    public static final class C7994a extends Builder<C7993b1, C7994a> implements ZenlyProto$ChatConversationsStreamEventOrBuilder {
        private C7994a() {
            super(C7993b1.f20287h);
        }

        /* synthetic */ C7994a(C8104i0 i0Var) {
            this();
        }

        public PingProto$Conversation getConversation() {
            return ((C7993b1) this.instance).getConversation();
        }

        public C7464s1 getConversationUpdate() {
            return ((C7993b1) this.instance).getConversationUpdate();
        }

        public C7280e getOp() {
            return ((C7993b1) this.instance).getOp();
        }

        public int getOpValue() {
            return ((C7993b1) this.instance).getOpValue();
        }

        public boolean hasConversation() {
            return ((C7993b1) this.instance).hasConversation();
        }

        public boolean hasConversationUpdate() {
            return ((C7993b1) this.instance).hasConversationUpdate();
        }
    }

    static {
        f20287h.makeImmutable();
    }

    private C7993b1() {
    }

    public static C7994a newBuilder() {
        return (C7994a) f20287h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7993b1();
            case 2:
                return f20287h;
            case 3:
                return null;
            case 4:
                return new C7994a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7993b1 b1Var = (C7993b1) obj2;
                boolean z2 = this.f20289e != 0;
                int i = this.f20289e;
                if (b1Var.f20289e != 0) {
                    z = true;
                }
                this.f20289e = visitor.visitInt(z2, i, z, b1Var.f20289e);
                this.f20290f = (PingProto$Conversation) visitor.visitMessage(this.f20290f, b1Var.f20290f);
                this.f20291g = (C7464s1) visitor.visitMessage(this.f20291g, b1Var.f20291g);
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
                                this.f20289e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                Builder builder = this.f20290f != null ? (C6817a) this.f20290f.toBuilder() : null;
                                this.f20290f = (PingProto$Conversation) codedInputStream.readMessage(PingProto$Conversation.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20290f);
                                    this.f20290f = (PingProto$Conversation) builder.buildPartial();
                                }
                            } else if (readTag == 34) {
                                Builder builder2 = this.f20291g != null ? (C7465a) this.f20291g.toBuilder() : null;
                                this.f20291g = (C7464s1) codedInputStream.readMessage(C7464s1.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20291g);
                                    this.f20291g = (C7464s1) builder2.buildPartial();
                                }
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
                if (f20288i == null) {
                    synchronized (C7993b1.class) {
                        if (f20288i == null) {
                            f20288i = new DefaultInstanceBasedParser(f20287h);
                        }
                    }
                }
                return f20288i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20287h;
    }

    public PingProto$Conversation getConversation() {
        PingProto$Conversation pingProto$Conversation = this.f20290f;
        return pingProto$Conversation == null ? PingProto$Conversation.getDefaultInstance() : pingProto$Conversation;
    }

    public C7464s1 getConversationUpdate() {
        C7464s1 s1Var = this.f20291g;
        return s1Var == null ? C7464s1.getDefaultInstance() : s1Var;
    }

    public C7280e getOp() {
        C7280e a = C7280e.m17990a(this.f20289e);
        return a == null ? C7280e.UNRECOGNIZED : a;
    }

    public int getOpValue() {
        return this.f20289e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20289e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20289e);
        }
        if (this.f20290f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getConversation());
        }
        if (this.f20291g != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getConversationUpdate());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasConversation() {
        return this.f20290f != null;
    }

    public boolean hasConversationUpdate() {
        return this.f20291g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20289e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20289e);
        }
        if (this.f20290f != null) {
            codedOutputStream.writeMessage(2, getConversation());
        }
        if (this.f20291g != null) {
            codedOutputStream.writeMessage(4, getConversationUpdate());
        }
    }
}
