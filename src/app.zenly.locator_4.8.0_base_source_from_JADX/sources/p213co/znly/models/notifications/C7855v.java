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

/* renamed from: co.znly.models.notifications.v */
public final class C7855v extends GeneratedMessageLite<C7855v, C7856a> implements NotificationProto$NoFriendsNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7855v f19629f = new C7855v();

    /* renamed from: g */
    private static volatile Parser<C7855v> f19630g;

    /* renamed from: e */
    private int f19631e;

    /* renamed from: co.znly.models.notifications.v$a */
    public static final class C7856a extends Builder<C7855v, C7856a> implements NotificationProto$NoFriendsNotificationOrBuilder {
        /* synthetic */ C7856a(C7790a aVar) {
            this();
        }

        public int getKeep() {
            return ((C7855v) this.instance).getKeep();
        }

        private C7856a() {
            super(C7855v.f19629f);
        }
    }

    static {
        f19629f.makeImmutable();
    }

    private C7855v() {
    }

    public static C7855v getDefaultInstance() {
        return f19629f;
    }

    public static Parser<C7855v> parser() {
        return f19629f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7855v();
            case 2:
                return f19629f;
            case 3:
                return null;
            case 4:
                return new C7856a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7855v vVar = (C7855v) obj2;
                boolean z2 = this.f19631e != 0;
                int i = this.f19631e;
                if (vVar.f19631e != 0) {
                    z = true;
                }
                this.f19631e = visitor.visitInt(z2, i, z, vVar.f19631e);
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
                                this.f19631e = codedInputStream.readInt32();
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
                if (f19630g == null) {
                    synchronized (C7855v.class) {
                        if (f19630g == null) {
                            f19630g = new DefaultInstanceBasedParser(f19629f);
                        }
                    }
                }
                return f19630g;
            default:
                throw new UnsupportedOperationException();
        }
        return f19629f;
    }

    public int getKeep() {
        return this.f19631e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f19631e;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeInt32Size(999, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f19631e;
        if (i != 0) {
            codedOutputStream.writeInt32(999, i);
        }
    }
}
