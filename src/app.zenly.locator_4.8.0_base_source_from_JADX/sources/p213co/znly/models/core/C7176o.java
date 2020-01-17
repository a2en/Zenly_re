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

/* renamed from: co.znly.models.core.o */
public final class C7176o extends GeneratedMessageLite<C7176o, C7177a> implements ChatProto$ConversationsSearchEventOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7176o f17778i = new C7176o();

    /* renamed from: j */
    private static volatile Parser<C7176o> f17779j;

    /* renamed from: e */
    private C7168n f17780e;

    /* renamed from: f */
    private int f17781f;

    /* renamed from: g */
    private int f17782g;

    /* renamed from: h */
    private int f17783h;

    /* renamed from: co.znly.models.core.o$a */
    public static final class C7177a extends Builder<C7176o, C7177a> implements ChatProto$ConversationsSearchEventOrBuilder {
        /* synthetic */ C7177a(C7066c cVar) {
            this();
        }

        public C7168n getConversations() {
            return ((C7176o) this.instance).getConversations();
        }

        public int getLimit() {
            return ((C7176o) this.instance).getLimit();
        }

        public int getOffset() {
            return ((C7176o) this.instance).getOffset();
        }

        public int getTotal() {
            return ((C7176o) this.instance).getTotal();
        }

        public boolean hasConversations() {
            return ((C7176o) this.instance).hasConversations();
        }

        private C7177a() {
            super(C7176o.f17778i);
        }
    }

    static {
        f17778i.makeImmutable();
    }

    private C7176o() {
    }

    public static C7177a newBuilder() {
        return (C7177a) f17778i.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7176o();
            case 2:
                return f17778i;
            case 3:
                return null;
            case 4:
                return new C7177a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7176o oVar = (C7176o) obj2;
                this.f17780e = (C7168n) visitor.visitMessage(this.f17780e, oVar.f17780e);
                this.f17781f = visitor.visitInt(this.f17781f != 0, this.f17781f, oVar.f17781f != 0, oVar.f17781f);
                this.f17782g = visitor.visitInt(this.f17782g != 0, this.f17782g, oVar.f17782g != 0, oVar.f17782g);
                boolean z2 = this.f17783h != 0;
                int i = this.f17783h;
                if (oVar.f17783h != 0) {
                    z = true;
                }
                this.f17783h = visitor.visitInt(z2, i, z, oVar.f17783h);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Builder builder = this.f17780e != null ? (C7169a) this.f17780e.toBuilder() : null;
                                this.f17780e = (C7168n) codedInputStream.readMessage(C7168n.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17780e);
                                    this.f17780e = (C7168n) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f17781f = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                this.f17782g = codedInputStream.readInt32();
                            } else if (readTag == 32) {
                                this.f17783h = codedInputStream.readInt32();
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
                if (f17779j == null) {
                    synchronized (C7176o.class) {
                        if (f17779j == null) {
                            f17779j = new DefaultInstanceBasedParser(f17778i);
                        }
                    }
                }
                return f17779j;
            default:
                throw new UnsupportedOperationException();
        }
        return f17778i;
    }

    public C7168n getConversations() {
        C7168n nVar = this.f17780e;
        return nVar == null ? C7168n.getDefaultInstance() : nVar;
    }

    public int getLimit() {
        return this.f17782g;
    }

    public int getOffset() {
        return this.f17783h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17780e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getConversations());
        }
        int i3 = this.f17781f;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(2, i3);
        }
        int i4 = this.f17782g;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(3, i4);
        }
        int i5 = this.f17783h;
        if (i5 != 0) {
            i2 += CodedOutputStream.computeInt32Size(4, i5);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int getTotal() {
        return this.f17781f;
    }

    public boolean hasConversations() {
        return this.f17780e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17780e != null) {
            codedOutputStream.writeMessage(1, getConversations());
        }
        int i = this.f17781f;
        if (i != 0) {
            codedOutputStream.writeInt32(2, i);
        }
        int i2 = this.f17782g;
        if (i2 != 0) {
            codedOutputStream.writeInt32(3, i2);
        }
        int i3 = this.f17783h;
        if (i3 != 0) {
            codedOutputStream.writeInt32(4, i3);
        }
    }
}
