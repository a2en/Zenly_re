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

/* renamed from: co.znly.models.services.w5 */
public final class C8361w5 extends GeneratedMessageLite<C8361w5, C8362a> implements ZenlyProto$UserTodayWatchersResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8361w5 f21179g = new C8361w5();

    /* renamed from: h */
    private static volatile Parser<C8361w5> f21180h;

    /* renamed from: e */
    private int f21181e;

    /* renamed from: f */
    private int f21182f;

    /* renamed from: co.znly.models.services.w5$a */
    public static final class C8362a extends Builder<C8361w5, C8362a> implements ZenlyProto$UserTodayWatchersResponseOrBuilder {
        /* synthetic */ C8362a(C8104i0 i0Var) {
            this();
        }

        public int getBy() {
            return ((C8361w5) this.instance).getBy();
        }

        public int getTimes() {
            return ((C8361w5) this.instance).getTimes();
        }

        private C8362a() {
            super(C8361w5.f21179g);
        }
    }

    static {
        f21179g.makeImmutable();
    }

    private C8361w5() {
    }

    public static C8362a newBuilder() {
        return (C8362a) f21179g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8361w5();
            case 2:
                return f21179g;
            case 3:
                return null;
            case 4:
                return new C8362a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8361w5 w5Var = (C8361w5) obj2;
                this.f21181e = visitor.visitInt(this.f21181e != 0, this.f21181e, w5Var.f21181e != 0, w5Var.f21181e);
                boolean z2 = this.f21182f != 0;
                int i = this.f21182f;
                if (w5Var.f21182f != 0) {
                    z = true;
                }
                this.f21182f = visitor.visitInt(z2, i, z, w5Var.f21182f);
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
                                this.f21181e = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.f21182f = codedInputStream.readInt32();
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
                if (f21180h == null) {
                    synchronized (C8361w5.class) {
                        if (f21180h == null) {
                            f21180h = new DefaultInstanceBasedParser(f21179g);
                        }
                    }
                }
                return f21180h;
            default:
                throw new UnsupportedOperationException();
        }
        return f21179g;
    }

    public int getBy() {
        return this.f21182f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f21181e;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
        }
        int i4 = this.f21182f;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(2, i4);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int getTimes() {
        return this.f21181e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f21181e;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        int i2 = this.f21182f;
        if (i2 != 0) {
            codedOutputStream.writeInt32(2, i2);
        }
    }
}
