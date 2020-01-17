package p213co.znly.models;

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

/* renamed from: co.znly.models.z1 */
public final class C7517z1 extends GeneratedMessageLite<C7517z1, C7518a> implements PingProto$UnreadConversationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7517z1 f18884j = new C7517z1();

    /* renamed from: k */
    private static volatile Parser<C7517z1> f18885k;

    /* renamed from: e */
    private String f18886e;

    /* renamed from: f */
    private String f18887f;

    /* renamed from: g */
    private String f18888g;

    /* renamed from: h */
    private String f18889h;

    /* renamed from: i */
    private String f18890i;

    /* renamed from: co.znly.models.z1$a */
    public static final class C7518a extends Builder<C7517z1, C7518a> implements PingProto$UnreadConversationOrBuilder {
        /* synthetic */ C7518a(C7383l1 l1Var) {
            this();
        }

        public String getChatCursor() {
            return ((C7517z1) this.instance).getChatCursor();
        }

        public ByteString getChatCursorBytes() {
            return ((C7517z1) this.instance).getChatCursorBytes();
        }

        public String getChatTip() {
            return ((C7517z1) this.instance).getChatTip();
        }

        public ByteString getChatTipBytes() {
            return ((C7517z1) this.instance).getChatTipBytes();
        }

        public String getPingCursor() {
            return ((C7517z1) this.instance).getPingCursor();
        }

        public ByteString getPingCursorBytes() {
            return ((C7517z1) this.instance).getPingCursorBytes();
        }

        public String getPingTip() {
            return ((C7517z1) this.instance).getPingTip();
        }

        public ByteString getPingTipBytes() {
            return ((C7517z1) this.instance).getPingTipBytes();
        }

        public String getTargetUuid() {
            return ((C7517z1) this.instance).getTargetUuid();
        }

        public ByteString getTargetUuidBytes() {
            return ((C7517z1) this.instance).getTargetUuidBytes();
        }

        private C7518a() {
            super(C7517z1.f18884j);
        }
    }

    static {
        f18884j.makeImmutable();
    }

    private C7517z1() {
        String str = "";
        this.f18886e = str;
        this.f18887f = str;
        this.f18888g = str;
        this.f18889h = str;
        this.f18890i = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7517z1();
            case 2:
                return f18884j;
            case 3:
                return null;
            case 4:
                return new C7518a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7517z1 z1Var = (C7517z1) obj2;
                this.f18886e = visitor.visitString(!this.f18886e.isEmpty(), this.f18886e, !z1Var.f18886e.isEmpty(), z1Var.f18886e);
                this.f18887f = visitor.visitString(!this.f18887f.isEmpty(), this.f18887f, !z1Var.f18887f.isEmpty(), z1Var.f18887f);
                this.f18888g = visitor.visitString(!this.f18888g.isEmpty(), this.f18888g, !z1Var.f18888g.isEmpty(), z1Var.f18888g);
                this.f18889h = visitor.visitString(!this.f18889h.isEmpty(), this.f18889h, !z1Var.f18889h.isEmpty(), z1Var.f18889h);
                this.f18890i = visitor.visitString(!this.f18890i.isEmpty(), this.f18890i, true ^ z1Var.f18890i.isEmpty(), z1Var.f18890i);
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
                                this.f18886e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f18887f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f18888g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.f18889h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                this.f18890i = codedInputStream.readStringRequireUtf8();
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
                if (f18885k == null) {
                    synchronized (C7517z1.class) {
                        if (f18885k == null) {
                            f18885k = new DefaultInstanceBasedParser(f18884j);
                        }
                    }
                }
                return f18885k;
            default:
                throw new UnsupportedOperationException();
        }
        return f18884j;
    }

    public String getChatCursor() {
        return this.f18889h;
    }

    public ByteString getChatCursorBytes() {
        return ByteString.copyFromUtf8(this.f18889h);
    }

    public String getChatTip() {
        return this.f18890i;
    }

    public ByteString getChatTipBytes() {
        return ByteString.copyFromUtf8(this.f18890i);
    }

    public String getPingCursor() {
        return this.f18887f;
    }

    public ByteString getPingCursorBytes() {
        return ByteString.copyFromUtf8(this.f18887f);
    }

    public String getPingTip() {
        return this.f18888g;
    }

    public ByteString getPingTipBytes() {
        return ByteString.copyFromUtf8(this.f18888g);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18886e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getTargetUuid());
        }
        if (!this.f18887f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getPingCursor());
        }
        if (!this.f18888g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getPingTip());
        }
        if (!this.f18889h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getChatCursor());
        }
        if (!this.f18890i.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(5, getChatTip());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getTargetUuid() {
        return this.f18886e;
    }

    public ByteString getTargetUuidBytes() {
        return ByteString.copyFromUtf8(this.f18886e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18886e.isEmpty()) {
            codedOutputStream.writeString(1, getTargetUuid());
        }
        if (!this.f18887f.isEmpty()) {
            codedOutputStream.writeString(2, getPingCursor());
        }
        if (!this.f18888g.isEmpty()) {
            codedOutputStream.writeString(3, getPingTip());
        }
        if (!this.f18889h.isEmpty()) {
            codedOutputStream.writeString(4, getChatCursor());
        }
        if (!this.f18890i.isEmpty()) {
            codedOutputStream.writeString(5, getChatTip());
        }
    }
}
