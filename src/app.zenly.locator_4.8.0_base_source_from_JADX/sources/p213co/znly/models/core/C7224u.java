package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.PingProto$Ping2.C6823a;
import p213co.znly.models.services.C8181n1;
import p213co.znly.models.services.C8334v1;
import p213co.znly.models.services.C8334v1.C8335a;

/* renamed from: co.znly.models.core.u */
public final class C7224u extends GeneratedMessageLite<C7224u, C7225a> implements ChatProto$MessageSentWithErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7224u f17915j = new C7224u();

    /* renamed from: k */
    private static volatile Parser<C7224u> f17916k;

    /* renamed from: e */
    private PingProto$Ping2 f17917e;

    /* renamed from: f */
    private C8334v1 f17918f;

    /* renamed from: g */
    private boolean f17919g;

    /* renamed from: h */
    private int f17920h;

    /* renamed from: i */
    private int f17921i;

    /* renamed from: co.znly.models.core.u$a */
    public static final class C7225a extends Builder<C7224u, C7225a> implements ChatProto$MessageSentWithErrorOrBuilder {
        /* synthetic */ C7225a(C7066c cVar) {
            this();
        }

        public int getBolt() {
            return ((C7224u) this.instance).getBolt();
        }

        public C8334v1 getConversationCreateError() {
            return ((C7224u) this.instance).getConversationCreateError();
        }

        public boolean getConversationCreated() {
            return ((C7224u) this.instance).getConversationCreated();
        }

        public C8181n1 getMessageSentError() {
            return ((C7224u) this.instance).getMessageSentError();
        }

        public int getMessageSentErrorValue() {
            return ((C7224u) this.instance).getMessageSentErrorValue();
        }

        public PingProto$Ping2 getMsg() {
            return ((C7224u) this.instance).getMsg();
        }

        public boolean hasConversationCreateError() {
            return ((C7224u) this.instance).hasConversationCreateError();
        }

        public boolean hasMsg() {
            return ((C7224u) this.instance).hasMsg();
        }

        private C7225a() {
            super(C7224u.f17915j);
        }
    }

    static {
        f17915j.makeImmutable();
    }

    private C7224u() {
    }

    public static C7225a newBuilder() {
        return (C7225a) f17915j.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7224u();
            case 2:
                return f17915j;
            case 3:
                return null;
            case 4:
                return new C7225a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7224u uVar = (C7224u) obj2;
                this.f17917e = (PingProto$Ping2) visitor.visitMessage(this.f17917e, uVar.f17917e);
                this.f17918f = (C8334v1) visitor.visitMessage(this.f17918f, uVar.f17918f);
                boolean z2 = this.f17919g;
                boolean z3 = uVar.f17919g;
                this.f17919g = visitor.visitBoolean(z2, z2, z3, z3);
                this.f17920h = visitor.visitInt(this.f17920h != 0, this.f17920h, uVar.f17920h != 0, uVar.f17920h);
                boolean z4 = this.f17921i != 0;
                int i = this.f17921i;
                if (uVar.f17921i != 0) {
                    z = true;
                }
                this.f17921i = visitor.visitInt(z4, i, z, uVar.f17921i);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 18) {
                                Builder builder = this.f17917e != null ? (C6823a) this.f17917e.toBuilder() : null;
                                this.f17917e = (PingProto$Ping2) codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17917e);
                                    this.f17917e = (PingProto$Ping2) builder.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder2 = this.f17918f != null ? (C8335a) this.f17918f.toBuilder() : null;
                                this.f17918f = (C8334v1) codedInputStream.readMessage(C8334v1.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17918f);
                                    this.f17918f = (C8334v1) builder2.buildPartial();
                                }
                            } else if (readTag == 32) {
                                this.f17919g = codedInputStream.readBool();
                            } else if (readTag == 40) {
                                this.f17920h = codedInputStream.readUInt32();
                            } else if (readTag == 48) {
                                this.f17921i = codedInputStream.readEnum();
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
                if (f17916k == null) {
                    synchronized (C7224u.class) {
                        if (f17916k == null) {
                            f17916k = new DefaultInstanceBasedParser(f17915j);
                        }
                    }
                }
                return f17916k;
            default:
                throw new UnsupportedOperationException();
        }
        return f17915j;
    }

    public int getBolt() {
        return this.f17920h;
    }

    public C8334v1 getConversationCreateError() {
        C8334v1 v1Var = this.f17918f;
        return v1Var == null ? C8334v1.getDefaultInstance() : v1Var;
    }

    public boolean getConversationCreated() {
        return this.f17919g;
    }

    public C8181n1 getMessageSentError() {
        C8181n1 a = C8181n1.m19272a(this.f17921i);
        return a == null ? C8181n1.UNRECOGNIZED : a;
    }

    public int getMessageSentErrorValue() {
        return this.f17921i;
    }

    public PingProto$Ping2 getMsg() {
        PingProto$Ping2 pingProto$Ping2 = this.f17917e;
        return pingProto$Ping2 == null ? PingProto$Ping2.getDefaultInstance() : pingProto$Ping2;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17917e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(2, getMsg());
        }
        if (this.f17918f != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getConversationCreateError());
        }
        boolean z = this.f17919g;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(4, z);
        }
        int i3 = this.f17920h;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeUInt32Size(5, i3);
        }
        if (this.f17921i != C8181n1.REASON_OK.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(6, this.f17921i);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasConversationCreateError() {
        return this.f17918f != null;
    }

    public boolean hasMsg() {
        return this.f17917e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17917e != null) {
            codedOutputStream.writeMessage(2, getMsg());
        }
        if (this.f17918f != null) {
            codedOutputStream.writeMessage(3, getConversationCreateError());
        }
        boolean z = this.f17919g;
        if (z) {
            codedOutputStream.writeBool(4, z);
        }
        int i = this.f17920h;
        if (i != 0) {
            codedOutputStream.writeUInt32(5, i);
        }
        if (this.f17921i != C8181n1.REASON_OK.getNumber()) {
            codedOutputStream.writeEnum(6, this.f17921i);
        }
    }
}
