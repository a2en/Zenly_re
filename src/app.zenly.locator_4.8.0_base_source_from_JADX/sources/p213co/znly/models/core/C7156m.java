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
import p213co.znly.models.core.C7117i.C7118a;
import p213co.znly.models.services.C8334v1;
import p213co.znly.models.services.C8334v1.C8335a;

/* renamed from: co.znly.models.core.m */
public final class C7156m extends GeneratedMessageLite<C7156m, C7157a> implements ChatProto$ConversationWithErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7156m f17727g = new C7156m();

    /* renamed from: h */
    private static volatile Parser<C7156m> f17728h;

    /* renamed from: e */
    private C7117i f17729e;

    /* renamed from: f */
    private C8334v1 f17730f;

    /* renamed from: co.znly.models.core.m$a */
    public static final class C7157a extends Builder<C7156m, C7157a> implements ChatProto$ConversationWithErrorOrBuilder {
        /* synthetic */ C7157a(C7066c cVar) {
            this();
        }

        public C7117i getConversation() {
            return ((C7156m) this.instance).getConversation();
        }

        public C8334v1 getError() {
            return ((C7156m) this.instance).getError();
        }

        public boolean hasConversation() {
            return ((C7156m) this.instance).hasConversation();
        }

        public boolean hasError() {
            return ((C7156m) this.instance).hasError();
        }

        private C7157a() {
            super(C7156m.f17727g);
        }
    }

    static {
        f17727g.makeImmutable();
    }

    private C7156m() {
    }

    public static C7157a newBuilder() {
        return (C7157a) f17727g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7156m();
            case 2:
                return f17727g;
            case 3:
                return null;
            case 4:
                return new C7157a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7156m mVar = (C7156m) obj2;
                this.f17729e = (C7117i) visitor.visitMessage(this.f17729e, mVar.f17729e);
                this.f17730f = (C8334v1) visitor.visitMessage(this.f17730f, mVar.f17730f);
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
                                Builder builder = this.f17729e != null ? (C7118a) this.f17729e.toBuilder() : null;
                                this.f17729e = (C7117i) codedInputStream.readMessage(C7117i.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17729e);
                                    this.f17729e = (C7117i) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f17730f != null ? (C8335a) this.f17730f.toBuilder() : null;
                                this.f17730f = (C8334v1) codedInputStream.readMessage(C8334v1.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17730f);
                                    this.f17730f = (C8334v1) builder2.buildPartial();
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
                if (f17728h == null) {
                    synchronized (C7156m.class) {
                        if (f17728h == null) {
                            f17728h = new DefaultInstanceBasedParser(f17727g);
                        }
                    }
                }
                return f17728h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17727g;
    }

    public C7117i getConversation() {
        C7117i iVar = this.f17729e;
        return iVar == null ? C7117i.getDefaultInstance() : iVar;
    }

    public C8334v1 getError() {
        C8334v1 v1Var = this.f17730f;
        return v1Var == null ? C8334v1.getDefaultInstance() : v1Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17729e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getConversation());
        }
        if (this.f17730f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasConversation() {
        return this.f17729e != null;
    }

    public boolean hasError() {
        return this.f17730f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17729e != null) {
            codedOutputStream.writeMessage(1, getConversation());
        }
        if (this.f17730f != null) {
            codedOutputStream.writeMessage(2, getError());
        }
    }
}
