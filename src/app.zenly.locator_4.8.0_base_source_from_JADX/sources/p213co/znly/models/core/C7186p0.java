package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.services.usermonitor.C8324f;
import p213co.znly.models.services.usermonitor.C8324f.C8325a;

/* renamed from: co.znly.models.core.p0 */
public final class C7186p0 extends GeneratedMessageLite<C7186p0, C7187a> implements CoreUserMonitorProto$UserMonitoringResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7186p0 f17803f = new C7186p0();

    /* renamed from: g */
    private static volatile Parser<C7186p0> f17804g;

    /* renamed from: e */
    private C8324f f17805e;

    /* renamed from: co.znly.models.core.p0$a */
    public static final class C7187a extends Builder<C7186p0, C7187a> implements CoreUserMonitorProto$UserMonitoringResponseOrBuilder {
        /* synthetic */ C7187a(C7158m0 m0Var) {
            this();
        }

        public C8324f getError() {
            return ((C7186p0) this.instance).getError();
        }

        public boolean hasError() {
            return ((C7186p0) this.instance).hasError();
        }

        private C7187a() {
            super(C7186p0.f17803f);
        }
    }

    static {
        f17803f.makeImmutable();
    }

    private C7186p0() {
    }

    public static C7187a newBuilder() {
        return (C7187a) f17803f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7158m0.f17731a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7186p0();
            case 2:
                return f17803f;
            case 3:
                return null;
            case 4:
                return new C7187a(null);
            case 5:
                this.f17805e = (C8324f) ((Visitor) obj).visitMessage(this.f17805e, ((C7186p0) obj2).f17805e);
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
                                Builder builder = this.f17805e != null ? (C8325a) this.f17805e.toBuilder() : null;
                                this.f17805e = (C8324f) codedInputStream.readMessage(C8324f.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17805e);
                                    this.f17805e = (C8324f) builder.buildPartial();
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
                if (f17804g == null) {
                    synchronized (C7186p0.class) {
                        if (f17804g == null) {
                            f17804g = new DefaultInstanceBasedParser(f17803f);
                        }
                    }
                }
                return f17804g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17803f;
    }

    public C8324f getError() {
        C8324f fVar = this.f17805e;
        return fVar == null ? C8324f.getDefaultInstance() : fVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17805e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f17805e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17805e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
    }
}
