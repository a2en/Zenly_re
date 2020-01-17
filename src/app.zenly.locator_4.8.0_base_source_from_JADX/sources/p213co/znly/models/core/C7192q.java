package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.core.C7168n.C7169a;
import p213co.znly.models.core.C7217t.C7218a;
import p213co.znly.models.core.C7249x.C7250a;

/* renamed from: co.znly.models.core.q */
public final class C7192q extends GeneratedMessageLite<C7192q, C7193a> implements ChatProto$InboxEventOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7192q f17815j = new C7192q();

    /* renamed from: k */
    private static volatile Parser<C7192q> f17816k;

    /* renamed from: e */
    private int f17817e;

    /* renamed from: f */
    private C7168n f17818f;

    /* renamed from: g */
    private boolean f17819g;

    /* renamed from: h */
    private C7249x f17820h;

    /* renamed from: i */
    private C7217t f17821i;

    /* renamed from: co.znly.models.core.q$a */
    public static final class C7193a extends Builder<C7192q, C7193a> implements ChatProto$InboxEventOrBuilder {
        /* synthetic */ C7193a(C7066c cVar) {
            this();
        }

        public C7168n getConversations() {
            return ((C7192q) this.instance).getConversations();
        }

        public boolean getInitState() {
            return ((C7192q) this.instance).getInitState();
        }

        public C7217t getMediaReceived() {
            return ((C7192q) this.instance).getMediaReceived();
        }

        public C7249x getRequestsReceived() {
            return ((C7192q) this.instance).getRequestsReceived();
        }

        public C7194b getType() {
            return ((C7192q) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C7192q) this.instance).getTypeValue();
        }

        public boolean hasConversations() {
            return ((C7192q) this.instance).hasConversations();
        }

        public boolean hasMediaReceived() {
            return ((C7192q) this.instance).hasMediaReceived();
        }

        public boolean hasRequestsReceived() {
            return ((C7192q) this.instance).hasRequestsReceived();
        }

        private C7193a() {
            super(C7192q.f17815j);
        }
    }

    /* renamed from: co.znly.models.core.q$b */
    public enum C7194b implements EnumLite {
        INBOX_EVENT_UNKNOWN(0),
        INBOX_EVENT_CONVERSATIONS(1),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f17826e;

        /* renamed from: co.znly.models.core.q$b$a */
        class C7195a implements EnumLiteMap<C7194b> {
            C7195a() {
            }

            public C7194b findValueByNumber(int i) {
                return C7194b.m17906a(i);
            }
        }

        static {
            new C7195a();
        }

        private C7194b(int i) {
            this.f17826e = i;
        }

        /* renamed from: a */
        public static C7194b m17906a(int i) {
            if (i == 0) {
                return INBOX_EVENT_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return INBOX_EVENT_CONVERSATIONS;
        }

        public final int getNumber() {
            return this.f17826e;
        }
    }

    static {
        f17815j.makeImmutable();
    }

    private C7192q() {
    }

    public static C7193a newBuilder() {
        return (C7193a) f17815j.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7192q();
            case 2:
                return f17815j;
            case 3:
                return null;
            case 4:
                return new C7193a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7192q qVar = (C7192q) obj2;
                boolean z2 = this.f17817e != 0;
                int i = this.f17817e;
                if (qVar.f17817e != 0) {
                    z = true;
                }
                this.f17817e = visitor.visitInt(z2, i, z, qVar.f17817e);
                this.f17818f = (C7168n) visitor.visitMessage(this.f17818f, qVar.f17818f);
                boolean z3 = this.f17819g;
                boolean z4 = qVar.f17819g;
                this.f17819g = visitor.visitBoolean(z3, z3, z4, z4);
                this.f17820h = (C7249x) visitor.visitMessage(this.f17820h, qVar.f17820h);
                this.f17821i = (C7217t) visitor.visitMessage(this.f17821i, qVar.f17821i);
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
                                this.f17817e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                Builder builder = this.f17818f != null ? (C7169a) this.f17818f.toBuilder() : null;
                                this.f17818f = (C7168n) codedInputStream.readMessage(C7168n.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17818f);
                                    this.f17818f = (C7168n) builder.buildPartial();
                                }
                            } else if (readTag == 24) {
                                this.f17819g = codedInputStream.readBool();
                            } else if (readTag == 34) {
                                Builder builder2 = this.f17820h != null ? (C7250a) this.f17820h.toBuilder() : null;
                                this.f17820h = (C7249x) codedInputStream.readMessage(C7249x.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17820h);
                                    this.f17820h = (C7249x) builder2.buildPartial();
                                }
                            } else if (readTag == 42) {
                                Builder builder3 = this.f17821i != null ? (C7218a) this.f17821i.toBuilder() : null;
                                this.f17821i = (C7217t) codedInputStream.readMessage(C7217t.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f17821i);
                                    this.f17821i = (C7217t) builder3.buildPartial();
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
                if (f17816k == null) {
                    synchronized (C7192q.class) {
                        if (f17816k == null) {
                            f17816k = new DefaultInstanceBasedParser(f17815j);
                        }
                    }
                }
                return f17816k;
            default:
                throw new UnsupportedOperationException();
        }
        return f17815j;
    }

    public C7168n getConversations() {
        C7168n nVar = this.f17818f;
        return nVar == null ? C7168n.getDefaultInstance() : nVar;
    }

    public boolean getInitState() {
        return this.f17819g;
    }

    public C7217t getMediaReceived() {
        C7217t tVar = this.f17821i;
        return tVar == null ? C7217t.getDefaultInstance() : tVar;
    }

    public C7249x getRequestsReceived() {
        C7249x xVar = this.f17820h;
        return xVar == null ? C7249x.getDefaultInstance() : xVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17817e != C7194b.INBOX_EVENT_UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f17817e);
        }
        if (this.f17818f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getConversations());
        }
        boolean z = this.f17819g;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(3, z);
        }
        if (this.f17820h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getRequestsReceived());
        }
        if (this.f17821i != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getMediaReceived());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7194b getType() {
        C7194b a = C7194b.m17906a(this.f17817e);
        return a == null ? C7194b.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f17817e;
    }

    public boolean hasConversations() {
        return this.f17818f != null;
    }

    public boolean hasMediaReceived() {
        return this.f17821i != null;
    }

    public boolean hasRequestsReceived() {
        return this.f17820h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17817e != C7194b.INBOX_EVENT_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f17817e);
        }
        if (this.f17818f != null) {
            codedOutputStream.writeMessage(2, getConversations());
        }
        boolean z = this.f17819g;
        if (z) {
            codedOutputStream.writeBool(3, z);
        }
        if (this.f17820h != null) {
            codedOutputStream.writeMessage(4, getRequestsReceived());
        }
        if (this.f17821i != null) {
            codedOutputStream.writeMessage(5, getMediaReceived());
        }
    }
}
