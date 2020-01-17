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

/* renamed from: co.znly.models.notifications.j0 */
public final class C7829j0 extends GeneratedMessageLite<C7829j0, C7830a> implements NotificationProto$ZendeskNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7829j0 f19577f = new C7829j0();

    /* renamed from: g */
    private static volatile Parser<C7829j0> f19578g;

    /* renamed from: e */
    private long f19579e;

    /* renamed from: co.znly.models.notifications.j0$a */
    public static final class C7830a extends Builder<C7829j0, C7830a> implements NotificationProto$ZendeskNotificationOrBuilder {
        /* synthetic */ C7830a(C7790a aVar) {
            this();
        }

        public long getTicketId() {
            return ((C7829j0) this.instance).getTicketId();
        }

        private C7830a() {
            super(C7829j0.f19577f);
        }
    }

    static {
        f19577f.makeImmutable();
    }

    private C7829j0() {
    }

    public static C7829j0 getDefaultInstance() {
        return f19577f;
    }

    public static Parser<C7829j0> parser() {
        return f19577f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7829j0();
            case 2:
                return f19577f;
            case 3:
                return null;
            case 4:
                return new C7830a(null);
            case 5:
                C7829j0 j0Var = (C7829j0) obj2;
                this.f19579e = ((Visitor) obj).visitLong(this.f19579e != 0, this.f19579e, j0Var.f19579e != 0, j0Var.f19579e);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f19579e = codedInputStream.readInt64();
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
                if (f19578g == null) {
                    synchronized (C7829j0.class) {
                        if (f19578g == null) {
                            f19578g = new DefaultInstanceBasedParser(f19577f);
                        }
                    }
                }
                return f19578g;
            default:
                throw new UnsupportedOperationException();
        }
        return f19577f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f19579e;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeInt64Size(1, j);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public long getTicketId() {
        return this.f19579e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f19579e;
        if (j != 0) {
            codedOutputStream.writeInt64(1, j);
        }
    }
}
