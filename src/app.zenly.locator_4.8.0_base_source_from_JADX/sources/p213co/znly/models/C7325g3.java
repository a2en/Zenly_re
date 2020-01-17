package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.g3 */
public final class C7325g3 extends GeneratedMessageLite<C7325g3, C7326a> implements UserProto$TodayWatchers$WatcherOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7325g3 f18196h = new C7325g3();

    /* renamed from: i */
    private static volatile Parser<C7325g3> f18197i;

    /* renamed from: e */
    private String f18198e = "";

    /* renamed from: f */
    private int f18199f;

    /* renamed from: g */
    private int f18200g;

    /* renamed from: co.znly.models.g3$a */
    public static final class C7326a extends Builder<C7325g3, C7326a> implements UserProto$TodayWatchers$WatcherOrBuilder {
        /* synthetic */ C7326a(C7519z2 z2Var) {
            this();
        }

        public int getCount() {
            return ((C7325g3) this.instance).getCount();
        }

        public int getSplit() {
            return ((C7325g3) this.instance).getSplit();
        }

        public String getUserUuid() {
            return ((C7325g3) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7325g3) this.instance).getUserUuidBytes();
        }

        private C7326a() {
            super(C7325g3.f18196h);
        }
    }

    static {
        f18196h.makeImmutable();
    }

    private C7325g3() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7519z2.f18891a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7325g3();
            case 2:
                return f18196h;
            case 3:
                return null;
            case 4:
                return new C7326a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7325g3 g3Var = (C7325g3) obj2;
                this.f18198e = visitor.visitString(!this.f18198e.isEmpty(), this.f18198e, !g3Var.f18198e.isEmpty(), g3Var.f18198e);
                this.f18199f = visitor.visitInt(this.f18199f != 0, this.f18199f, g3Var.f18199f != 0, g3Var.f18199f);
                boolean z2 = this.f18200g != 0;
                int i = this.f18200g;
                if (g3Var.f18200g != 0) {
                    z = true;
                }
                this.f18200g = visitor.visitInt(z2, i, z, g3Var.f18200g);
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
                                this.f18198e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f18199f = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                this.f18200g = codedInputStream.readInt32();
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
                if (f18197i == null) {
                    synchronized (C7325g3.class) {
                        if (f18197i == null) {
                            f18197i = new DefaultInstanceBasedParser(f18196h);
                        }
                    }
                }
                return f18197i;
            default:
                throw new UnsupportedOperationException();
        }
        return f18196h;
    }

    public int getCount() {
        return this.f18199f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18198e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUserUuid());
        }
        int i3 = this.f18199f;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(2, i3);
        }
        int i4 = this.f18200g;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(3, i4);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int getSplit() {
        return this.f18200g;
    }

    public String getUserUuid() {
        return this.f18198e;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f18198e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18198e.isEmpty()) {
            codedOutputStream.writeString(1, getUserUuid());
        }
        int i = this.f18199f;
        if (i != 0) {
            codedOutputStream.writeInt32(2, i);
        }
        int i2 = this.f18200g;
        if (i2 != 0) {
            codedOutputStream.writeInt32(3, i2);
        }
    }
}
