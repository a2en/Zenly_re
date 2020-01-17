package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.d1 */
public final class C7274d1 extends GeneratedMessageLite<C7274d1, C7275a> implements PinContextProto$ActivityStrippedOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7274d1 f18051g = new C7274d1();

    /* renamed from: h */
    private static volatile Parser<C7274d1> f18052h;

    /* renamed from: e */
    private boolean f18053e;

    /* renamed from: f */
    private boolean f18054f;

    /* renamed from: co.znly.models.d1$a */
    public static final class C7275a extends Builder<C7274d1, C7275a> implements PinContextProto$ActivityStrippedOrBuilder {
        /* synthetic */ C7275a(C6977c1 c1Var) {
            this();
        }

        public boolean getIsForeground() {
            return ((C7274d1) this.instance).getIsForeground();
        }

        public boolean getIsWifiConnected() {
            return ((C7274d1) this.instance).getIsWifiConnected();
        }

        private C7275a() {
            super(C7274d1.f18051g);
        }
    }

    static {
        f18051g.makeImmutable();
    }

    private C7274d1() {
    }

    public static C7274d1 getDefaultInstance() {
        return f18051g;
    }

    public static Parser<C7274d1> parser() {
        return f18051g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C6977c1.f17211a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7274d1();
            case 2:
                return f18051g;
            case 3:
                return null;
            case 4:
                return new C7275a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7274d1 d1Var = (C7274d1) obj2;
                boolean z = this.f18053e;
                boolean z2 = d1Var.f18053e;
                this.f18053e = visitor.visitBoolean(z, z, z2, z2);
                boolean z3 = this.f18054f;
                boolean z4 = d1Var.f18054f;
                this.f18054f = visitor.visitBoolean(z3, z3, z4, z4);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z5 = false;
                while (!z5) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f18053e = codedInputStream.readBool();
                            } else if (readTag == 16) {
                                this.f18054f = codedInputStream.readBool();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z5 = true;
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
                if (f18052h == null) {
                    synchronized (C7274d1.class) {
                        if (f18052h == null) {
                            f18052h = new DefaultInstanceBasedParser(f18051g);
                        }
                    }
                }
                return f18052h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18051g;
    }

    public boolean getIsForeground() {
        return this.f18053e;
    }

    public boolean getIsWifiConnected() {
        return this.f18054f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.f18053e;
        if (z) {
            i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
        }
        boolean z2 = this.f18054f;
        if (z2) {
            i2 += CodedOutputStream.computeBoolSize(2, z2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z = this.f18053e;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
        boolean z2 = this.f18054f;
        if (z2) {
            codedOutputStream.writeBool(2, z2);
        }
    }
}
