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
import p213co.znly.models.services.C8026d2.C8027a;

/* renamed from: co.znly.models.services.a4 */
public final class C7981a4 extends GeneratedMessageLite<C7981a4, C7982a> implements ZenlyProto$PingStatsErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7981a4 f20262f = new C7981a4();

    /* renamed from: g */
    private static volatile Parser<C7981a4> f20263g;

    /* renamed from: e */
    private C8026d2 f20264e;

    /* renamed from: co.znly.models.services.a4$a */
    public static final class C7982a extends Builder<C7981a4, C7982a> implements ZenlyProto$PingStatsErrorOrBuilder {
        private C7982a() {
            super(C7981a4.f20262f);
        }

        /* synthetic */ C7982a(C8104i0 i0Var) {
            this();
        }

        public C8026d2 getError() {
            return ((C7981a4) this.instance).getError();
        }

        public boolean hasError() {
            return ((C7981a4) this.instance).hasError();
        }
    }

    static {
        f20262f.makeImmutable();
    }

    private C7981a4() {
    }

    public static C7981a4 getDefaultInstance() {
        return f20262f;
    }

    public static Parser<C7981a4> parser() {
        return f20262f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7981a4();
            case 2:
                return f20262f;
            case 3:
                return null;
            case 4:
                return new C7982a(null);
            case 5:
                this.f20264e = (C8026d2) ((Visitor) obj).visitMessage(this.f20264e, ((C7981a4) obj2).f20264e);
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
                                Builder builder = this.f20264e != null ? (C8027a) this.f20264e.toBuilder() : null;
                                this.f20264e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20264e);
                                    this.f20264e = (C8026d2) builder.buildPartial();
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
                if (f20263g == null) {
                    synchronized (C7981a4.class) {
                        if (f20263g == null) {
                            f20263g = new DefaultInstanceBasedParser(f20262f);
                        }
                    }
                }
                return f20263g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20262f;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f20264e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20264e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20264e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20264e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
    }
}
