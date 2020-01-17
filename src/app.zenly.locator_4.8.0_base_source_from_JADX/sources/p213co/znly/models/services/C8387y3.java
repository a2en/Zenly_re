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

/* renamed from: co.znly.models.services.y3 */
public final class C8387y3 extends GeneratedMessageLite<C8387y3, C8388a> implements ZenlyProto$PingSendRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8387y3 f21243f = new C8387y3();

    /* renamed from: g */
    private static volatile Parser<C8387y3> f21244g;

    /* renamed from: e */
    private PingProto$Ping2 f21245e;

    /* renamed from: co.znly.models.services.y3$a */
    public static final class C8388a extends Builder<C8387y3, C8388a> implements ZenlyProto$PingSendRequestOrBuilder {
        private C8388a() {
            super(C8387y3.f21243f);
        }

        /* synthetic */ C8388a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8388a mo22340a(C6823a aVar) {
            copyOnWrite();
            ((C8387y3) this.instance).m19472a(aVar);
            return this;
        }

        public PingProto$Ping2 getPing() {
            return ((C8387y3) this.instance).getPing();
        }

        public boolean hasPing() {
            return ((C8387y3) this.instance).hasPing();
        }
    }

    static {
        f21243f.makeImmutable();
    }

    private C8387y3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19472a(C6823a aVar) {
        this.f21245e = (PingProto$Ping2) aVar.build();
    }

    public static C8388a newBuilder() {
        return (C8388a) f21243f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8387y3();
            case 2:
                return f21243f;
            case 3:
                return null;
            case 4:
                return new C8388a(null);
            case 5:
                this.f21245e = (PingProto$Ping2) ((Visitor) obj).visitMessage(this.f21245e, ((C8387y3) obj2).f21245e);
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
                                Builder builder = this.f21245e != null ? (C6823a) this.f21245e.toBuilder() : null;
                                this.f21245e = (PingProto$Ping2) codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21245e);
                                    this.f21245e = (PingProto$Ping2) builder.buildPartial();
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
                if (f21244g == null) {
                    synchronized (C8387y3.class) {
                        if (f21244g == null) {
                            f21244g = new DefaultInstanceBasedParser(f21243f);
                        }
                    }
                }
                return f21244g;
            default:
                throw new UnsupportedOperationException();
        }
        return f21243f;
    }

    public PingProto$Ping2 getPing() {
        PingProto$Ping2 pingProto$Ping2 = this.f21245e;
        return pingProto$Ping2 == null ? PingProto$Ping2.getDefaultInstance() : pingProto$Ping2;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f21245e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getPing());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasPing() {
        return this.f21245e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21245e != null) {
            codedOutputStream.writeMessage(1, getPing());
        }
    }
}
