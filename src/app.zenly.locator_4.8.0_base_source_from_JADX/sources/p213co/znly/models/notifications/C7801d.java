package p213co.znly.models.notifications;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.notifications.d */
public final class C7801d extends GeneratedMessageLite<C7801d, C7802a> implements NotificationProto$CMDHTTPServerNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7801d f19491f = new C7801d();

    /* renamed from: g */
    private static volatile Parser<C7801d> f19492g;

    /* renamed from: e */
    private int f19493e;

    /* renamed from: co.znly.models.notifications.d$a */
    public static final class C7802a extends Builder<C7801d, C7802a> implements NotificationProto$CMDHTTPServerNotificationOrBuilder {
        /* synthetic */ C7802a(C7790a aVar) {
            this();
        }

        public int getKeep() {
            return ((C7801d) this.instance).getKeep();
        }

        private C7802a() {
            super(C7801d.f19491f);
        }
    }

    static {
        f19491f.makeImmutable();
    }

    private C7801d() {
    }

    public static C7801d getDefaultInstance() {
        return f19491f;
    }

    public static Parser<C7801d> parser() {
        return f19491f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7801d();
            case 2:
                return f19491f;
            case 3:
                return null;
            case 4:
                return new C7802a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7801d dVar = (C7801d) obj2;
                boolean z2 = this.f19493e != 0;
                int i = this.f19493e;
                if (dVar.f19493e != 0) {
                    z = true;
                }
                this.f19493e = visitor.visitInt(z2, i, z, dVar.f19493e);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 7992) {
                                this.f19493e = codedInputStream.readInt32();
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
                if (f19492g == null) {
                    synchronized (C7801d.class) {
                        if (f19492g == null) {
                            f19492g = new DefaultInstanceBasedParser(f19491f);
                        }
                    }
                }
                return f19492g;
            default:
                throw new UnsupportedOperationException();
        }
        return f19491f;
    }

    public int getKeep() {
        return this.f19493e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f19493e;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeInt32Size(999, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f19493e;
        if (i != 0) {
            codedOutputStream.writeInt32(999, i);
        }
    }
}
