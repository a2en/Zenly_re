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
import p213co.znly.models.core.C7140l.C7141a;

/* renamed from: co.znly.models.core.y */
public final class C7255y extends GeneratedMessageLite<C7255y, C7256a> implements ChatProto$UnreadCounterOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7255y f17992h = new C7255y();

    /* renamed from: i */
    private static volatile Parser<C7255y> f17993i;

    /* renamed from: e */
    private long f17994e;

    /* renamed from: f */
    private long f17995f;

    /* renamed from: g */
    private C7140l f17996g;

    /* renamed from: co.znly.models.core.y$a */
    public static final class C7256a extends Builder<C7255y, C7256a> implements ChatProto$UnreadCounterOrBuilder {
        /* synthetic */ C7256a(C7066c cVar) {
            this();
        }

        public C7140l getTriggeredBy() {
            return ((C7255y) this.instance).getTriggeredBy();
        }

        public long getUnreadConversations() {
            return ((C7255y) this.instance).getUnreadConversations();
        }

        public long getUnreadTotal() {
            return ((C7255y) this.instance).getUnreadTotal();
        }

        public boolean hasTriggeredBy() {
            return ((C7255y) this.instance).hasTriggeredBy();
        }

        private C7256a() {
            super(C7255y.f17992h);
        }
    }

    static {
        f17992h.makeImmutable();
    }

    private C7255y() {
    }

    public static C7256a newBuilder() {
        return (C7256a) f17992h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7255y();
            case 2:
                return f17992h;
            case 3:
                return null;
            case 4:
                return new C7256a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7255y yVar = (C7255y) obj2;
                this.f17994e = visitor.visitLong(this.f17994e != 0, this.f17994e, yVar.f17994e != 0, yVar.f17994e);
                this.f17995f = visitor.visitLong(this.f17995f != 0, this.f17995f, yVar.f17995f != 0, yVar.f17995f);
                this.f17996g = (C7140l) visitor.visitMessage(this.f17996g, yVar.f17996g);
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
                                this.f17994e = codedInputStream.readInt64();
                            } else if (readTag == 16) {
                                this.f17995f = codedInputStream.readInt64();
                            } else if (readTag == 26) {
                                Builder builder = this.f17996g != null ? (C7141a) this.f17996g.toBuilder() : null;
                                this.f17996g = (C7140l) codedInputStream.readMessage(C7140l.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17996g);
                                    this.f17996g = (C7140l) builder.buildPartial();
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
                if (f17993i == null) {
                    synchronized (C7255y.class) {
                        if (f17993i == null) {
                            f17993i = new DefaultInstanceBasedParser(f17992h);
                        }
                    }
                }
                return f17993i;
            default:
                throw new UnsupportedOperationException();
        }
        return f17992h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f17994e;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeInt64Size(1, j);
        }
        long j2 = this.f17995f;
        if (j2 != 0) {
            i2 += CodedOutputStream.computeInt64Size(2, j2);
        }
        if (this.f17996g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getTriggeredBy());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7140l getTriggeredBy() {
        C7140l lVar = this.f17996g;
        return lVar == null ? C7140l.getDefaultInstance() : lVar;
    }

    public long getUnreadConversations() {
        return this.f17995f;
    }

    public long getUnreadTotal() {
        return this.f17994e;
    }

    public boolean hasTriggeredBy() {
        return this.f17996g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f17994e;
        if (j != 0) {
            codedOutputStream.writeInt64(1, j);
        }
        long j2 = this.f17995f;
        if (j2 != 0) {
            codedOutputStream.writeInt64(2, j2);
        }
        if (this.f17996g != null) {
            codedOutputStream.writeMessage(3, getTriggeredBy());
        }
    }
}
