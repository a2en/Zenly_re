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

/* renamed from: co.znly.models.core.w0 */
public final class C7243w0 extends GeneratedMessageLite<C7243w0, C7244a> implements CoreUserProto$UserTraitsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7243w0 f17970f = new C7243w0();

    /* renamed from: g */
    private static volatile Parser<C7243w0> f17971g;

    /* renamed from: e */
    private int f17972e;

    /* renamed from: co.znly.models.core.w0$a */
    public static final class C7244a extends Builder<C7243w0, C7244a> implements CoreUserProto$UserTraitsOrBuilder {
        /* synthetic */ C7244a(C7203r0 r0Var) {
            this();
        }

        public int getSuggestedAlgoVersion() {
            return ((C7243w0) this.instance).getSuggestedAlgoVersion();
        }

        private C7244a() {
            super(C7243w0.f17970f);
        }
    }

    static {
        f17970f.makeImmutable();
    }

    private C7243w0() {
    }

    public static C7244a newBuilder() {
        return (C7244a) f17970f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7203r0.f17852a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7243w0();
            case 2:
                return f17970f;
            case 3:
                return null;
            case 4:
                return new C7244a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7243w0 w0Var = (C7243w0) obj2;
                boolean z2 = this.f17972e != 0;
                int i = this.f17972e;
                if (w0Var.f17972e != 0) {
                    z = true;
                }
                this.f17972e = visitor.visitInt(z2, i, z, w0Var.f17972e);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 24) {
                                this.f17972e = codedInputStream.readInt32();
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
                if (f17971g == null) {
                    synchronized (C7243w0.class) {
                        if (f17971g == null) {
                            f17971g = new DefaultInstanceBasedParser(f17970f);
                        }
                    }
                }
                return f17971g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17970f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f17972e;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeInt32Size(3, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int getSuggestedAlgoVersion() {
        return this.f17972e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f17972e;
        if (i != 0) {
            codedOutputStream.writeInt32(3, i);
        }
    }
}
