package p213co.znly.models.core;

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

/* renamed from: co.znly.models.core.l */
public final class C7140l extends GeneratedMessageLite<C7140l, C7141a> implements ChatProto$ConversationUnreadCounterOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C7140l f17680m = new C7140l();

    /* renamed from: n */
    private static volatile Parser<C7140l> f17681n;

    /* renamed from: e */
    private String f17682e;

    /* renamed from: f */
    private int f17683f;

    /* renamed from: g */
    private String f17684g;

    /* renamed from: h */
    private long f17685h;

    /* renamed from: i */
    private long f17686i;

    /* renamed from: j */
    private long f17687j;

    /* renamed from: k */
    private String f17688k;

    /* renamed from: l */
    private String f17689l;

    /* renamed from: co.znly.models.core.l$a */
    public static final class C7141a extends Builder<C7140l, C7141a> implements ChatProto$ConversationUnreadCounterOrBuilder {
        /* synthetic */ C7141a(C7066c cVar) {
            this();
        }

        public String getChatCursor() {
            return ((C7140l) this.instance).getChatCursor();
        }

        public ByteString getChatCursorBytes() {
            return ((C7140l) this.instance).getChatCursorBytes();
        }

        public String getEmojiCursor() {
            return ((C7140l) this.instance).getEmojiCursor();
        }

        public ByteString getEmojiCursorBytes() {
            return ((C7140l) this.instance).getEmojiCursorBytes();
        }

        public String getInboxUuid() {
            return ((C7140l) this.instance).getInboxUuid();
        }

        public ByteString getInboxUuidBytes() {
            return ((C7140l) this.instance).getInboxUuidBytes();
        }

        public long getRequestUnread() {
            return ((C7140l) this.instance).getRequestUnread();
        }

        public C7133k getType() {
            return ((C7140l) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C7140l) this.instance).getTypeValue();
        }

        public long getUnreadEmojis() {
            return ((C7140l) this.instance).getUnreadEmojis();
        }

        public long getUnreadMessages() {
            return ((C7140l) this.instance).getUnreadMessages();
        }

        public String getUserUuid() {
            return ((C7140l) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7140l) this.instance).getUserUuidBytes();
        }

        private C7141a() {
            super(C7140l.f17680m);
        }
    }

    static {
        f17680m.makeImmutable();
    }

    private C7140l() {
        String str = "";
        this.f17682e = str;
        this.f17684g = str;
        this.f17688k = str;
        this.f17689l = str;
    }

    public static C7140l getDefaultInstance() {
        return f17680m;
    }

    public static Parser<C7140l> parser() {
        return f17680m.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7140l();
            case 2:
                return f17680m;
            case 3:
                return null;
            case 4:
                return new C7141a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7140l lVar = (C7140l) obj2;
                this.f17682e = visitor.visitString(!this.f17682e.isEmpty(), this.f17682e, !lVar.f17682e.isEmpty(), lVar.f17682e);
                this.f17683f = visitor.visitInt(this.f17683f != 0, this.f17683f, lVar.f17683f != 0, lVar.f17683f);
                this.f17684g = visitor.visitString(!this.f17684g.isEmpty(), this.f17684g, !lVar.f17684g.isEmpty(), lVar.f17684g);
                this.f17685h = visitor.visitLong(this.f17685h != 0, this.f17685h, lVar.f17685h != 0, lVar.f17685h);
                this.f17686i = visitor.visitLong(this.f17686i != 0, this.f17686i, lVar.f17686i != 0, lVar.f17686i);
                this.f17687j = visitor.visitLong(this.f17687j != 0, this.f17687j, lVar.f17687j != 0, lVar.f17687j);
                this.f17688k = visitor.visitString(!this.f17688k.isEmpty(), this.f17688k, !lVar.f17688k.isEmpty(), lVar.f17688k);
                this.f17689l = visitor.visitString(!this.f17689l.isEmpty(), this.f17689l, !lVar.f17689l.isEmpty(), lVar.f17689l);
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
                                this.f17682e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f17683f = codedInputStream.readEnum();
                            } else if (readTag == 26) {
                                this.f17684g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 32) {
                                this.f17685h = codedInputStream.readInt64();
                            } else if (readTag == 40) {
                                this.f17686i = codedInputStream.readInt64();
                            } else if (readTag == 48) {
                                this.f17687j = codedInputStream.readInt64();
                            } else if (readTag == 58) {
                                this.f17688k = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 66) {
                                this.f17689l = codedInputStream.readStringRequireUtf8();
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
                if (f17681n == null) {
                    synchronized (C7140l.class) {
                        if (f17681n == null) {
                            f17681n = new DefaultInstanceBasedParser(f17680m);
                        }
                    }
                }
                return f17681n;
            default:
                throw new UnsupportedOperationException();
        }
        return f17680m;
    }

    public String getChatCursor() {
        return this.f17688k;
    }

    public ByteString getChatCursorBytes() {
        return ByteString.copyFromUtf8(this.f17688k);
    }

    public String getEmojiCursor() {
        return this.f17689l;
    }

    public ByteString getEmojiCursorBytes() {
        return ByteString.copyFromUtf8(this.f17689l);
    }

    public String getInboxUuid() {
        return this.f17682e;
    }

    public ByteString getInboxUuidBytes() {
        return ByteString.copyFromUtf8(this.f17682e);
    }

    public long getRequestUnread() {
        return this.f17687j;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17682e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getInboxUuid());
        }
        if (this.f17683f != C7133k.PRIVATE.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f17683f);
        }
        if (!this.f17684g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getUserUuid());
        }
        long j = this.f17685h;
        if (j != 0) {
            i2 += CodedOutputStream.computeInt64Size(4, j);
        }
        long j2 = this.f17686i;
        if (j2 != 0) {
            i2 += CodedOutputStream.computeInt64Size(5, j2);
        }
        long j3 = this.f17687j;
        if (j3 != 0) {
            i2 += CodedOutputStream.computeInt64Size(6, j3);
        }
        if (!this.f17688k.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(7, getChatCursor());
        }
        if (!this.f17689l.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(8, getEmojiCursor());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7133k getType() {
        C7133k a = C7133k.m17816a(this.f17683f);
        return a == null ? C7133k.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f17683f;
    }

    public long getUnreadEmojis() {
        return this.f17686i;
    }

    public long getUnreadMessages() {
        return this.f17685h;
    }

    public String getUserUuid() {
        return this.f17684g;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f17684g);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17682e.isEmpty()) {
            codedOutputStream.writeString(1, getInboxUuid());
        }
        if (this.f17683f != C7133k.PRIVATE.getNumber()) {
            codedOutputStream.writeEnum(2, this.f17683f);
        }
        if (!this.f17684g.isEmpty()) {
            codedOutputStream.writeString(3, getUserUuid());
        }
        long j = this.f17685h;
        if (j != 0) {
            codedOutputStream.writeInt64(4, j);
        }
        long j2 = this.f17686i;
        if (j2 != 0) {
            codedOutputStream.writeInt64(5, j2);
        }
        long j3 = this.f17687j;
        if (j3 != 0) {
            codedOutputStream.writeInt64(6, j3);
        }
        if (!this.f17688k.isEmpty()) {
            codedOutputStream.writeString(7, getChatCursor());
        }
        if (!this.f17689l.isEmpty()) {
            codedOutputStream.writeString(8, getEmojiCursor());
        }
    }
}
