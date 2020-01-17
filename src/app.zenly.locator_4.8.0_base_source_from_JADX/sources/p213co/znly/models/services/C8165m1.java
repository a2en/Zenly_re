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
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.PingProto$Ping2.C6823a;

/* renamed from: co.znly.models.services.m1 */
public final class C8165m1 extends GeneratedMessageLite<C8165m1, C8166a> implements C7946x30078918 {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8165m1 f20672g = new C8165m1();

    /* renamed from: h */
    private static volatile Parser<C8165m1> f20673h;

    /* renamed from: e */
    private PingProto$Ping2 f20674e;

    /* renamed from: f */
    private int f20675f;

    /* renamed from: co.znly.models.services.m1$a */
    public static final class C8166a extends Builder<C8165m1, C8166a> implements C7946x30078918 {
        /* synthetic */ C8166a(C8104i0 i0Var) {
            this();
        }

        public C8181n1 getError() {
            return ((C8165m1) this.instance).getError();
        }

        public int getErrorValue() {
            return ((C8165m1) this.instance).getErrorValue();
        }

        public PingProto$Ping2 getMsg() {
            return ((C8165m1) this.instance).getMsg();
        }

        public boolean hasMsg() {
            return ((C8165m1) this.instance).hasMsg();
        }

        private C8166a() {
            super(C8165m1.f20672g);
        }
    }

    static {
        f20672g.makeImmutable();
    }

    private C8165m1() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8165m1();
            case 2:
                return f20672g;
            case 3:
                return null;
            case 4:
                return new C8166a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8165m1 m1Var = (C8165m1) obj2;
                this.f20674e = (PingProto$Ping2) visitor.visitMessage(this.f20674e, m1Var.f20674e);
                boolean z2 = this.f20675f != 0;
                int i = this.f20675f;
                if (m1Var.f20675f != 0) {
                    z = true;
                }
                this.f20675f = visitor.visitInt(z2, i, z, m1Var.f20675f);
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
                                Builder builder = this.f20674e != null ? (C6823a) this.f20674e.toBuilder() : null;
                                this.f20674e = (PingProto$Ping2) codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20674e);
                                    this.f20674e = (PingProto$Ping2) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f20675f = codedInputStream.readEnum();
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
                if (f20673h == null) {
                    synchronized (C8165m1.class) {
                        if (f20673h == null) {
                            f20673h = new DefaultInstanceBasedParser(f20672g);
                        }
                    }
                }
                return f20673h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20672g;
    }

    public C8181n1 getError() {
        C8181n1 a = C8181n1.m19272a(this.f20675f);
        return a == null ? C8181n1.UNRECOGNIZED : a;
    }

    public int getErrorValue() {
        return this.f20675f;
    }

    public PingProto$Ping2 getMsg() {
        PingProto$Ping2 pingProto$Ping2 = this.f20674e;
        return pingProto$Ping2 == null ? PingProto$Ping2.getDefaultInstance() : pingProto$Ping2;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20674e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getMsg());
        }
        if (this.f20675f != C8181n1.REASON_OK.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f20675f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasMsg() {
        return this.f20674e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20674e != null) {
            codedOutputStream.writeMessage(1, getMsg());
        }
        if (this.f20675f != C8181n1.REASON_OK.getNumber()) {
            codedOutputStream.writeEnum(2, this.f20675f);
        }
    }
}
