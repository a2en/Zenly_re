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

/* renamed from: co.znly.models.notifications.e */
public final class C7805e extends GeneratedMessageLite<C7805e, C7806a> implements NotificationProto$CMDHarakiriNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7805e f19498f = new C7805e();

    /* renamed from: g */
    private static volatile Parser<C7805e> f19499g;

    /* renamed from: e */
    private int f19500e;

    /* renamed from: co.znly.models.notifications.e$a */
    public static final class C7806a extends Builder<C7805e, C7806a> implements NotificationProto$CMDHarakiriNotificationOrBuilder {
        /* synthetic */ C7806a(C7790a aVar) {
            this();
        }

        public int getKeep() {
            return ((C7805e) this.instance).getKeep();
        }

        private C7806a() {
            super(C7805e.f19498f);
        }
    }

    static {
        f19498f.makeImmutable();
    }

    private C7805e() {
    }

    public static C7805e getDefaultInstance() {
        return f19498f;
    }

    public static Parser<C7805e> parser() {
        return f19498f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7805e();
            case 2:
                return f19498f;
            case 3:
                return null;
            case 4:
                return new C7806a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7805e eVar = (C7805e) obj2;
                boolean z2 = this.f19500e != 0;
                int i = this.f19500e;
                if (eVar.f19500e != 0) {
                    z = true;
                }
                this.f19500e = visitor.visitInt(z2, i, z, eVar.f19500e);
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
                                this.f19500e = codedInputStream.readInt32();
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
                if (f19499g == null) {
                    synchronized (C7805e.class) {
                        if (f19499g == null) {
                            f19499g = new DefaultInstanceBasedParser(f19498f);
                        }
                    }
                }
                return f19499g;
            default:
                throw new UnsupportedOperationException();
        }
        return f19498f;
    }

    public int getKeep() {
        return this.f19500e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f19500e;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeInt32Size(999, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f19500e;
        if (i != 0) {
            codedOutputStream.writeInt32(999, i);
        }
    }
}
