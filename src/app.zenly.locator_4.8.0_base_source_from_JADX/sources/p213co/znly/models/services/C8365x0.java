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

/* renamed from: co.znly.models.services.x0 */
public final class C8365x0 extends GeneratedMessageLite<C8365x0, C8366a> implements ZenlyProto$ChatConversationRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C8365x0 f21192i = new C8365x0();

    /* renamed from: j */
    private static volatile Parser<C8365x0> f21193j;

    /* renamed from: e */
    private String f21194e;

    /* renamed from: f */
    private String f21195f;

    /* renamed from: g */
    private String f21196g;

    /* renamed from: h */
    private int f21197h;

    /* renamed from: co.znly.models.services.x0$a */
    public static final class C8366a extends Builder<C8365x0, C8366a> implements ZenlyProto$ChatConversationRequestOrBuilder {
        /* synthetic */ C8366a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8366a mo22331a(String str) {
            copyOnWrite();
            ((C8365x0) this.instance).m19437a(str);
            return this;
        }

        /* renamed from: b */
        public C8366a mo22332b(String str) {
            copyOnWrite();
            ((C8365x0) this.instance).m19439b(str);
            return this;
        }

        public String getConversationUuid() {
            return ((C8365x0) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C8365x0) this.instance).getConversationUuidBytes();
        }

        public String getFromCursor() {
            return ((C8365x0) this.instance).getFromCursor();
        }

        public ByteString getFromCursorBytes() {
            return ((C8365x0) this.instance).getFromCursorBytes();
        }

        public int getLimit() {
            return ((C8365x0) this.instance).getLimit();
        }

        public String getToCursor() {
            return ((C8365x0) this.instance).getToCursor();
        }

        public ByteString getToCursorBytes() {
            return ((C8365x0) this.instance).getToCursorBytes();
        }

        private C8366a() {
            super(C8365x0.f21192i);
        }
    }

    static {
        f21192i.makeImmutable();
    }

    private C8365x0() {
        String str = "";
        this.f21194e = str;
        this.f21195f = str;
        this.f21196g = str;
    }

    public static C8366a newBuilder() {
        return (C8366a) f21192i.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8365x0();
            case 2:
                return f21192i;
            case 3:
                return null;
            case 4:
                return new C8366a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8365x0 x0Var = (C8365x0) obj2;
                this.f21194e = visitor.visitString(!this.f21194e.isEmpty(), this.f21194e, !x0Var.f21194e.isEmpty(), x0Var.f21194e);
                this.f21195f = visitor.visitString(!this.f21195f.isEmpty(), this.f21195f, !x0Var.f21195f.isEmpty(), x0Var.f21195f);
                this.f21196g = visitor.visitString(!this.f21196g.isEmpty(), this.f21196g, !x0Var.f21196g.isEmpty(), x0Var.f21196g);
                boolean z2 = this.f21197h != 0;
                int i = this.f21197h;
                if (x0Var.f21197h != 0) {
                    z = true;
                }
                this.f21197h = visitor.visitInt(z2, i, z, x0Var.f21197h);
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
                                this.f21194e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f21195f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f21196g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 32) {
                                this.f21197h = codedInputStream.readInt32();
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
                if (f21193j == null) {
                    synchronized (C8365x0.class) {
                        if (f21193j == null) {
                            f21193j = new DefaultInstanceBasedParser(f21192i);
                        }
                    }
                }
                return f21193j;
            default:
                throw new UnsupportedOperationException();
        }
        return f21192i;
    }

    public String getConversationUuid() {
        return this.f21194e;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f21194e);
    }

    public String getFromCursor() {
        return this.f21195f;
    }

    public ByteString getFromCursorBytes() {
        return ByteString.copyFromUtf8(this.f21195f);
    }

    public int getLimit() {
        return this.f21197h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f21194e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getConversationUuid());
        }
        if (!this.f21195f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getFromCursor());
        }
        if (!this.f21196g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getToCursor());
        }
        int i3 = this.f21197h;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(4, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getToCursor() {
        return this.f21196g;
    }

    public ByteString getToCursorBytes() {
        return ByteString.copyFromUtf8(this.f21196g);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f21194e.isEmpty()) {
            codedOutputStream.writeString(1, getConversationUuid());
        }
        if (!this.f21195f.isEmpty()) {
            codedOutputStream.writeString(2, getFromCursor());
        }
        if (!this.f21196g.isEmpty()) {
            codedOutputStream.writeString(3, getToCursor());
        }
        int i = this.f21197h;
        if (i != 0) {
            codedOutputStream.writeInt32(4, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m19439b(String str) {
        if (str != null) {
            this.f21196g = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19437a(String str) {
        if (str != null) {
            this.f21194e = str;
            return;
        }
        throw new NullPointerException();
    }
}
