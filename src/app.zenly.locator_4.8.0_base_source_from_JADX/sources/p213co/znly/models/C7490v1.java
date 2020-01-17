package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.PingProto$EmojiTop.C6820a;

/* renamed from: co.znly.models.v1 */
public final class C7490v1 extends GeneratedMessageLite<C7490v1, C7491a> implements PingProto$PingStatsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7490v1 f18811g = new C7490v1();

    /* renamed from: h */
    private static volatile Parser<C7490v1> f18812h;

    /* renamed from: e */
    private PingProto$EmojiTop f18813e;

    /* renamed from: f */
    private long f18814f;

    /* renamed from: co.znly.models.v1$a */
    public static final class C7491a extends Builder<C7490v1, C7491a> implements PingProto$PingStatsOrBuilder {
        /* synthetic */ C7491a(C7383l1 l1Var) {
            this();
        }

        public PingProto$EmojiTop getTop() {
            return ((C7490v1) this.instance).getTop();
        }

        public long getTotal() {
            return ((C7490v1) this.instance).getTotal();
        }

        public boolean hasTop() {
            return ((C7490v1) this.instance).hasTop();
        }

        private C7491a() {
            super(C7490v1.f18811g);
        }
    }

    static {
        f18811g.makeImmutable();
    }

    private C7490v1() {
    }

    public static C7490v1 getDefaultInstance() {
        return f18811g;
    }

    public static Parser<C7490v1> parser() {
        return f18811g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7490v1();
            case 2:
                return f18811g;
            case 3:
                return null;
            case 4:
                return new C7491a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7490v1 v1Var = (C7490v1) obj2;
                this.f18813e = (PingProto$EmojiTop) visitor.visitMessage(this.f18813e, v1Var.f18813e);
                this.f18814f = visitor.visitLong(this.f18814f != 0, this.f18814f, v1Var.f18814f != 0, v1Var.f18814f);
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
                                Builder builder = this.f18813e != null ? (C6820a) this.f18813e.toBuilder() : null;
                                this.f18813e = (PingProto$EmojiTop) codedInputStream.readMessage(PingProto$EmojiTop.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18813e);
                                    this.f18813e = (PingProto$EmojiTop) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f18814f = codedInputStream.readInt64();
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
                if (f18812h == null) {
                    synchronized (C7490v1.class) {
                        if (f18812h == null) {
                            f18812h = new DefaultInstanceBasedParser(f18811g);
                        }
                    }
                }
                return f18812h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18811g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f18813e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getTop());
        }
        long j = this.f18814f;
        if (j != 0) {
            i2 += CodedOutputStream.computeInt64Size(2, j);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public PingProto$EmojiTop getTop() {
        PingProto$EmojiTop pingProto$EmojiTop = this.f18813e;
        return pingProto$EmojiTop == null ? PingProto$EmojiTop.getDefaultInstance() : pingProto$EmojiTop;
    }

    public long getTotal() {
        return this.f18814f;
    }

    public boolean hasTop() {
        return this.f18813e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f18813e != null) {
            codedOutputStream.writeMessage(1, getTop());
        }
        long j = this.f18814f;
        if (j != 0) {
            codedOutputStream.writeInt64(2, j);
        }
    }
}
