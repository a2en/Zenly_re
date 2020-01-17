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
import p213co.znly.models.core.C7168n.C7169a;

/* renamed from: co.znly.models.core.j */
public final class C7125j extends GeneratedMessageLite<C7125j, C7126a> implements ChatProto$ConversationNextPageOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7125j f17650g = new C7125j();

    /* renamed from: h */
    private static volatile Parser<C7125j> f17651h;

    /* renamed from: e */
    private C7168n f17652e;

    /* renamed from: f */
    private boolean f17653f;

    /* renamed from: co.znly.models.core.j$a */
    public static final class C7126a extends Builder<C7125j, C7126a> implements ChatProto$ConversationNextPageOrBuilder {
        /* synthetic */ C7126a(C7066c cVar) {
            this();
        }

        public C7168n getConversations() {
            return ((C7125j) this.instance).getConversations();
        }

        public boolean getNoMore() {
            return ((C7125j) this.instance).getNoMore();
        }

        public boolean hasConversations() {
            return ((C7125j) this.instance).hasConversations();
        }

        private C7126a() {
            super(C7125j.f17650g);
        }
    }

    static {
        f17650g.makeImmutable();
    }

    private C7125j() {
    }

    public static C7126a newBuilder() {
        return (C7126a) f17650g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7125j();
            case 2:
                return f17650g;
            case 3:
                return null;
            case 4:
                return new C7126a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7125j jVar = (C7125j) obj2;
                this.f17652e = (C7168n) visitor.visitMessage(this.f17652e, jVar.f17652e);
                boolean z = this.f17653f;
                boolean z2 = jVar.f17653f;
                this.f17653f = visitor.visitBoolean(z, z, z2, z2);
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
                                Builder builder = this.f17652e != null ? (C7169a) this.f17652e.toBuilder() : null;
                                this.f17652e = (C7168n) codedInputStream.readMessage(C7168n.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17652e);
                                    this.f17652e = (C7168n) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f17653f = codedInputStream.readBool();
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
                if (f17651h == null) {
                    synchronized (C7125j.class) {
                        if (f17651h == null) {
                            f17651h = new DefaultInstanceBasedParser(f17650g);
                        }
                    }
                }
                return f17651h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17650g;
    }

    public C7168n getConversations() {
        C7168n nVar = this.f17652e;
        return nVar == null ? C7168n.getDefaultInstance() : nVar;
    }

    public boolean getNoMore() {
        return this.f17653f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17652e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getConversations());
        }
        boolean z = this.f17653f;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(2, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasConversations() {
        return this.f17652e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17652e != null) {
            codedOutputStream.writeMessage(1, getConversations());
        }
        boolean z = this.f17653f;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
    }
}
