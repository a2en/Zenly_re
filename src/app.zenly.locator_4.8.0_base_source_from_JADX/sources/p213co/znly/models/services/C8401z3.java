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
import p213co.znly.models.C6947a3;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.PingProto$Ping2.C6823a;
import p213co.znly.models.services.C8371x3.C8372a;

/* renamed from: co.znly.models.services.z3 */
public final class C8401z3 extends GeneratedMessageLite<C8401z3, C8402a> implements ZenlyProto$PingSendResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8401z3 f21263h = new C8401z3();

    /* renamed from: i */
    private static volatile Parser<C8401z3> f21264i;

    /* renamed from: e */
    private PingProto$Ping2 f21265e;

    /* renamed from: f */
    private int f21266f;

    /* renamed from: g */
    private C8371x3 f21267g;

    /* renamed from: co.znly.models.services.z3$a */
    public static final class C8402a extends Builder<C8401z3, C8402a> implements ZenlyProto$PingSendResponseOrBuilder {
        private C8402a() {
            super(C8401z3.f21263h);
        }

        /* synthetic */ C8402a(C8104i0 i0Var) {
            this();
        }

        public C6947a3 getBlockRelationship() {
            return ((C8401z3) this.instance).getBlockRelationship();
        }

        public int getBlockRelationshipValue() {
            return ((C8401z3) this.instance).getBlockRelationshipValue();
        }

        public C8371x3 getError() {
            return ((C8401z3) this.instance).getError();
        }

        public PingProto$Ping2 getPing() {
            return ((C8401z3) this.instance).getPing();
        }

        public boolean hasError() {
            return ((C8401z3) this.instance).hasError();
        }

        public boolean hasPing() {
            return ((C8401z3) this.instance).hasPing();
        }
    }

    static {
        f21263h.makeImmutable();
    }

    private C8401z3() {
    }

    public static C8402a newBuilder() {
        return (C8402a) f21263h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8401z3();
            case 2:
                return f21263h;
            case 3:
                return null;
            case 4:
                return new C8402a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8401z3 z3Var = (C8401z3) obj2;
                this.f21265e = (PingProto$Ping2) visitor.visitMessage(this.f21265e, z3Var.f21265e);
                boolean z2 = this.f21266f != 0;
                int i = this.f21266f;
                if (z3Var.f21266f != 0) {
                    z = true;
                }
                this.f21266f = visitor.visitInt(z2, i, z, z3Var.f21266f);
                this.f21267g = (C8371x3) visitor.visitMessage(this.f21267g, z3Var.f21267g);
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
                                Builder builder = this.f21265e != null ? (C6823a) this.f21265e.toBuilder() : null;
                                this.f21265e = (PingProto$Ping2) codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21265e);
                                    this.f21265e = (PingProto$Ping2) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f21266f = codedInputStream.readEnum();
                            } else if (readTag == 1010) {
                                Builder builder2 = this.f21267g != null ? (C8372a) this.f21267g.toBuilder() : null;
                                this.f21267g = (C8371x3) codedInputStream.readMessage(C8371x3.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f21267g);
                                    this.f21267g = (C8371x3) builder2.buildPartial();
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
                if (f21264i == null) {
                    synchronized (C8401z3.class) {
                        if (f21264i == null) {
                            f21264i = new DefaultInstanceBasedParser(f21263h);
                        }
                    }
                }
                return f21264i;
            default:
                throw new UnsupportedOperationException();
        }
        return f21263h;
    }

    public C6947a3 getBlockRelationship() {
        C6947a3 a = C6947a3.m17694a(this.f21266f);
        return a == null ? C6947a3.UNRECOGNIZED : a;
    }

    public int getBlockRelationshipValue() {
        return this.f21266f;
    }

    public C8371x3 getError() {
        C8371x3 x3Var = this.f21267g;
        return x3Var == null ? C8371x3.getDefaultInstance() : x3Var;
    }

    public PingProto$Ping2 getPing() {
        PingProto$Ping2 pingProto$Ping2 = this.f21265e;
        return pingProto$Ping2 == null ? PingProto$Ping2.getDefaultInstance() : pingProto$Ping2;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f21265e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getPing());
        }
        if (this.f21266f != C6947a3.UNKNOW.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f21266f);
        }
        if (this.f21267g != null) {
            i2 += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f21267g != null;
    }

    public boolean hasPing() {
        return this.f21265e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21265e != null) {
            codedOutputStream.writeMessage(1, getPing());
        }
        if (this.f21266f != C6947a3.UNKNOW.getNumber()) {
            codedOutputStream.writeEnum(2, this.f21266f);
        }
        if (this.f21267g != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
