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
import p213co.znly.models.PingProto$Conversation;
import p213co.znly.models.PingProto$Conversation.C6817a;
import p213co.znly.models.services.C8367x1.C8368a;

/* renamed from: co.znly.models.services.g1 */
public final class C8074g1 extends GeneratedMessageLite<C8074g1, C8075a> implements ZenlyProto$ChatGroupConversationAddResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8074g1 f20471g = new C8074g1();

    /* renamed from: h */
    private static volatile Parser<C8074g1> f20472h;

    /* renamed from: e */
    private PingProto$Conversation f20473e;

    /* renamed from: f */
    private C8367x1 f20474f;

    /* renamed from: co.znly.models.services.g1$a */
    public static final class C8075a extends Builder<C8074g1, C8075a> implements ZenlyProto$ChatGroupConversationAddResponseOrBuilder {
        /* synthetic */ C8075a(C8104i0 i0Var) {
            this();
        }

        public PingProto$Conversation getConversation() {
            return ((C8074g1) this.instance).getConversation();
        }

        public C8367x1 getError() {
            return ((C8074g1) this.instance).getError();
        }

        public boolean hasConversation() {
            return ((C8074g1) this.instance).hasConversation();
        }

        public boolean hasError() {
            return ((C8074g1) this.instance).hasError();
        }

        private C8075a() {
            super(C8074g1.f20471g);
        }
    }

    static {
        f20471g.makeImmutable();
    }

    private C8074g1() {
    }

    public static C8075a newBuilder() {
        return (C8075a) f20471g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8074g1();
            case 2:
                return f20471g;
            case 3:
                return null;
            case 4:
                return new C8075a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8074g1 g1Var = (C8074g1) obj2;
                this.f20473e = (PingProto$Conversation) visitor.visitMessage(this.f20473e, g1Var.f20473e);
                this.f20474f = (C8367x1) visitor.visitMessage(this.f20474f, g1Var.f20474f);
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
                                Builder builder = this.f20473e != null ? (C6817a) this.f20473e.toBuilder() : null;
                                this.f20473e = (PingProto$Conversation) codedInputStream.readMessage(PingProto$Conversation.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20473e);
                                    this.f20473e = (PingProto$Conversation) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f20474f != null ? (C8368a) this.f20474f.toBuilder() : null;
                                this.f20474f = (C8367x1) codedInputStream.readMessage(C8367x1.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20474f);
                                    this.f20474f = (C8367x1) builder2.buildPartial();
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
                if (f20472h == null) {
                    synchronized (C8074g1.class) {
                        if (f20472h == null) {
                            f20472h = new DefaultInstanceBasedParser(f20471g);
                        }
                    }
                }
                return f20472h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20471g;
    }

    public PingProto$Conversation getConversation() {
        PingProto$Conversation pingProto$Conversation = this.f20473e;
        return pingProto$Conversation == null ? PingProto$Conversation.getDefaultInstance() : pingProto$Conversation;
    }

    public C8367x1 getError() {
        C8367x1 x1Var = this.f20474f;
        return x1Var == null ? C8367x1.getDefaultInstance() : x1Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20473e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getConversation());
        }
        if (this.f20474f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasConversation() {
        return this.f20473e != null;
    }

    public boolean hasError() {
        return this.f20474f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20473e != null) {
            codedOutputStream.writeMessage(1, getConversation());
        }
        if (this.f20474f != null) {
            codedOutputStream.writeMessage(2, getError());
        }
    }
}
