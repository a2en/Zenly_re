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

/* renamed from: co.znly.models.notifications.q */
public final class C7843q extends GeneratedMessageLite<C7843q, C7844a> implements NotificationProto$FootstepsWebViewsNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7843q f19602f = new C7843q();

    /* renamed from: g */
    private static volatile Parser<C7843q> f19603g;

    /* renamed from: e */
    private long f19604e;

    /* renamed from: co.znly.models.notifications.q$a */
    public static final class C7844a extends Builder<C7843q, C7844a> implements NotificationProto$FootstepsWebViewsNotificationOrBuilder {
        /* synthetic */ C7844a(C7790a aVar) {
            this();
        }

        public long getViews() {
            return ((C7843q) this.instance).getViews();
        }

        private C7844a() {
            super(C7843q.f19602f);
        }
    }

    static {
        f19602f.makeImmutable();
    }

    private C7843q() {
    }

    public static C7843q getDefaultInstance() {
        return f19602f;
    }

    public static Parser<C7843q> parser() {
        return f19602f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7843q();
            case 2:
                return f19602f;
            case 3:
                return null;
            case 4:
                return new C7844a(null);
            case 5:
                C7843q qVar = (C7843q) obj2;
                this.f19604e = ((Visitor) obj).visitLong(this.f19604e != 0, this.f19604e, qVar.f19604e != 0, qVar.f19604e);
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
                                this.f19604e = codedInputStream.readInt64();
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
                if (f19603g == null) {
                    synchronized (C7843q.class) {
                        if (f19603g == null) {
                            f19603g = new DefaultInstanceBasedParser(f19602f);
                        }
                    }
                }
                return f19603g;
            default:
                throw new UnsupportedOperationException();
        }
        return f19602f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f19604e;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeInt64Size(1, j);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public long getViews() {
        return this.f19604e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f19604e;
        if (j != 0) {
            codedOutputStream.writeInt64(1, j);
        }
    }
}
