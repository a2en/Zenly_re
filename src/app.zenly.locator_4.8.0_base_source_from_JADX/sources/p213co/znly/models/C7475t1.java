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
import p213co.znly.models.PingProto$Ping2.C6823a;

/* renamed from: co.znly.models.t1 */
public final class C7475t1 extends GeneratedMessageLite<C7475t1, C7476a> implements PingProto$MediaReceivedReplyToOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7475t1 f18752g = new C7475t1();

    /* renamed from: h */
    private static volatile Parser<C7475t1> f18753h;

    /* renamed from: e */
    private boolean f18754e;

    /* renamed from: f */
    private PingProto$Ping2 f18755f;

    /* renamed from: co.znly.models.t1$a */
    public static final class C7476a extends Builder<C7475t1, C7476a> implements PingProto$MediaReceivedReplyToOrBuilder {
        /* synthetic */ C7476a(C7383l1 l1Var) {
            this();
        }

        public PingProto$Ping2 getMedia() {
            return ((C7475t1) this.instance).getMedia();
        }

        public boolean getReplied() {
            return ((C7475t1) this.instance).getReplied();
        }

        public boolean hasMedia() {
            return ((C7475t1) this.instance).hasMedia();
        }

        private C7476a() {
            super(C7475t1.f18752g);
        }
    }

    static {
        f18752g.makeImmutable();
    }

    private C7475t1() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7475t1();
            case 2:
                return f18752g;
            case 3:
                return null;
            case 4:
                return new C7476a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7475t1 t1Var = (C7475t1) obj2;
                boolean z = this.f18754e;
                boolean z2 = t1Var.f18754e;
                this.f18754e = visitor.visitBoolean(z, z, z2, z2);
                this.f18755f = (PingProto$Ping2) visitor.visitMessage(this.f18755f, t1Var.f18755f);
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
                            if (readTag == 8) {
                                this.f18754e = codedInputStream.readBool();
                            } else if (readTag == 18) {
                                Builder builder = this.f18755f != null ? (C6823a) this.f18755f.toBuilder() : null;
                                this.f18755f = (PingProto$Ping2) codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18755f);
                                    this.f18755f = (PingProto$Ping2) builder.buildPartial();
                                }
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
                if (f18753h == null) {
                    synchronized (C7475t1.class) {
                        if (f18753h == null) {
                            f18753h = new DefaultInstanceBasedParser(f18752g);
                        }
                    }
                }
                return f18753h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18752g;
    }

    public PingProto$Ping2 getMedia() {
        PingProto$Ping2 pingProto$Ping2 = this.f18755f;
        return pingProto$Ping2 == null ? PingProto$Ping2.getDefaultInstance() : pingProto$Ping2;
    }

    public boolean getReplied() {
        return this.f18754e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.f18754e;
        if (z) {
            i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
        }
        if (this.f18755f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getMedia());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasMedia() {
        return this.f18755f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z = this.f18754e;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
        if (this.f18755f != null) {
            codedOutputStream.writeMessage(2, getMedia());
        }
    }
}
