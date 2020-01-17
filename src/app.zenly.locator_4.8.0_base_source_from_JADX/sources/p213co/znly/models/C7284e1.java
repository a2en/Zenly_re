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

/* renamed from: co.znly.models.e1 */
public final class C7284e1 extends GeneratedMessageLite<C7284e1, C7285a> implements PinContextProto$BatteryStrippedOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7284e1 f18083g = new C7284e1();

    /* renamed from: h */
    private static volatile Parser<C7284e1> f18084h;

    /* renamed from: e */
    private int f18085e;

    /* renamed from: f */
    private boolean f18086f;

    /* renamed from: co.znly.models.e1$a */
    public static final class C7285a extends Builder<C7284e1, C7285a> implements PinContextProto$BatteryStrippedOrBuilder {
        /* synthetic */ C7285a(C6977c1 c1Var) {
            this();
        }

        public boolean getIsCharging() {
            return ((C7284e1) this.instance).getIsCharging();
        }

        public int getLevel() {
            return ((C7284e1) this.instance).getLevel();
        }

        private C7285a() {
            super(C7284e1.f18083g);
        }
    }

    static {
        f18083g.makeImmutable();
    }

    private C7284e1() {
    }

    public static C7284e1 getDefaultInstance() {
        return f18083g;
    }

    public static Parser<C7284e1> parser() {
        return f18083g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C6977c1.f17211a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7284e1();
            case 2:
                return f18083g;
            case 3:
                return null;
            case 4:
                return new C7285a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7284e1 e1Var = (C7284e1) obj2;
                boolean z2 = this.f18085e != 0;
                int i = this.f18085e;
                if (e1Var.f18085e != 0) {
                    z = true;
                }
                this.f18085e = visitor.visitInt(z2, i, z, e1Var.f18085e);
                boolean z3 = this.f18086f;
                boolean z4 = e1Var.f18086f;
                this.f18086f = visitor.visitBoolean(z3, z3, z4, z4);
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
                                this.f18085e = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.f18086f = codedInputStream.readBool();
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
                if (f18084h == null) {
                    synchronized (C7284e1.class) {
                        if (f18084h == null) {
                            f18084h = new DefaultInstanceBasedParser(f18083g);
                        }
                    }
                }
                return f18084h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18083g;
    }

    public boolean getIsCharging() {
        return this.f18086f;
    }

    public int getLevel() {
        return this.f18085e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f18085e;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
        }
        boolean z = this.f18086f;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(2, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f18085e;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        boolean z = this.f18086f;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
    }
}
