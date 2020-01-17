package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C7490v1;
import p213co.znly.models.C7490v1.C7491a;
import p213co.znly.models.services.C7981a4.C7982a;

/* renamed from: co.znly.models.services.b4 */
public final class C7999b4 extends GeneratedMessageLite<C7999b4, C8000a> implements ZenlyProto$PingStatsResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7999b4 f20299h = new C7999b4();

    /* renamed from: i */
    private static volatile Parser<C7999b4> f20300i;

    /* renamed from: e */
    private C7490v1 f20301e;

    /* renamed from: f */
    private C7490v1 f20302f;

    /* renamed from: g */
    private C7981a4 f20303g;

    /* renamed from: co.znly.models.services.b4$a */
    public static final class C8000a extends Builder<C7999b4, C8000a> implements ZenlyProto$PingStatsResponseOrBuilder {
        private C8000a() {
            super(C7999b4.f20299h);
        }

        /* synthetic */ C8000a(C8104i0 i0Var) {
            this();
        }

        public C7981a4 getError() {
            return ((C7999b4) this.instance).getError();
        }

        public C7490v1 getReceived() {
            return ((C7999b4) this.instance).getReceived();
        }

        public C7490v1 getSent() {
            return ((C7999b4) this.instance).getSent();
        }

        public boolean hasError() {
            return ((C7999b4) this.instance).hasError();
        }

        public boolean hasReceived() {
            return ((C7999b4) this.instance).hasReceived();
        }

        public boolean hasSent() {
            return ((C7999b4) this.instance).hasSent();
        }
    }

    static {
        f20299h.makeImmutable();
    }

    private C7999b4() {
    }

    public static C8000a newBuilder() {
        return (C8000a) f20299h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7999b4();
            case 2:
                return f20299h;
            case 3:
                return null;
            case 4:
                return new C8000a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7999b4 b4Var = (C7999b4) obj2;
                this.f20301e = (C7490v1) visitor.visitMessage(this.f20301e, b4Var.f20301e);
                this.f20302f = (C7490v1) visitor.visitMessage(this.f20302f, b4Var.f20302f);
                this.f20303g = (C7981a4) visitor.visitMessage(this.f20303g, b4Var.f20303g);
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
                                Builder builder = this.f20301e != null ? (C7491a) this.f20301e.toBuilder() : null;
                                this.f20301e = (C7490v1) codedInputStream.readMessage(C7490v1.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20301e);
                                    this.f20301e = (C7490v1) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f20302f != null ? (C7491a) this.f20302f.toBuilder() : null;
                                this.f20302f = (C7490v1) codedInputStream.readMessage(C7490v1.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20302f);
                                    this.f20302f = (C7490v1) builder2.buildPartial();
                                }
                            } else if (readTag == 1010) {
                                Builder builder3 = this.f20303g != null ? (C7982a) this.f20303g.toBuilder() : null;
                                this.f20303g = (C7981a4) codedInputStream.readMessage(C7981a4.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f20303g);
                                    this.f20303g = (C7981a4) builder3.buildPartial();
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
                if (f20300i == null) {
                    synchronized (C7999b4.class) {
                        if (f20300i == null) {
                            f20300i = new DefaultInstanceBasedParser(f20299h);
                        }
                    }
                }
                return f20300i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20299h;
    }

    public C7981a4 getError() {
        C7981a4 a4Var = this.f20303g;
        return a4Var == null ? C7981a4.getDefaultInstance() : a4Var;
    }

    public C7490v1 getReceived() {
        C7490v1 v1Var = this.f20301e;
        return v1Var == null ? C7490v1.getDefaultInstance() : v1Var;
    }

    public C7490v1 getSent() {
        C7490v1 v1Var = this.f20302f;
        return v1Var == null ? C7490v1.getDefaultInstance() : v1Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20301e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getReceived());
        }
        if (this.f20302f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getSent());
        }
        if (this.f20303g != null) {
            i2 += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20303g != null;
    }

    public boolean hasReceived() {
        return this.f20301e != null;
    }

    public boolean hasSent() {
        return this.f20302f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20301e != null) {
            codedOutputStream.writeMessage(1, getReceived());
        }
        if (this.f20302f != null) {
            codedOutputStream.writeMessage(2, getSent());
        }
        if (this.f20303g != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
