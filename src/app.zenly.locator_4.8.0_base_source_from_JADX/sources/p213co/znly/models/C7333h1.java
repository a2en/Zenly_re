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

/* renamed from: co.znly.models.h1 */
public final class C7333h1 extends GeneratedMessageLite<C7333h1, C7334a> implements PinContextProto$PersonalPlaceStrippedOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7333h1 f18218f = new C7333h1();

    /* renamed from: g */
    private static volatile Parser<C7333h1> f18219g;

    /* renamed from: e */
    private int f18220e;

    /* renamed from: co.znly.models.h1$a */
    public static final class C7334a extends Builder<C7333h1, C7334a> implements PinContextProto$PersonalPlaceStrippedOrBuilder {
        /* synthetic */ C7334a(C6977c1 c1Var) {
            this();
        }

        public C7276d2 getLabel() {
            return ((C7333h1) this.instance).getLabel();
        }

        public int getLabelValue() {
            return ((C7333h1) this.instance).getLabelValue();
        }

        private C7334a() {
            super(C7333h1.f18218f);
        }
    }

    static {
        f18218f.makeImmutable();
    }

    private C7333h1() {
    }

    public static C7333h1 getDefaultInstance() {
        return f18218f;
    }

    public static Parser<C7333h1> parser() {
        return f18218f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C6977c1.f17211a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7333h1();
            case 2:
                return f18218f;
            case 3:
                return null;
            case 4:
                return new C7334a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7333h1 h1Var = (C7333h1) obj2;
                boolean z2 = this.f18220e != 0;
                int i = this.f18220e;
                if (h1Var.f18220e != 0) {
                    z = true;
                }
                this.f18220e = visitor.visitInt(z2, i, z, h1Var.f18220e);
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
                                this.f18220e = codedInputStream.readEnum();
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
                if (f18219g == null) {
                    synchronized (C7333h1.class) {
                        if (f18219g == null) {
                            f18219g = new DefaultInstanceBasedParser(f18218f);
                        }
                    }
                }
                return f18219g;
            default:
                throw new UnsupportedOperationException();
        }
        return f18218f;
    }

    public C7276d2 getLabel() {
        C7276d2 a = C7276d2.m17988a(this.f18220e);
        return a == null ? C7276d2.UNRECOGNIZED : a;
    }

    public int getLabelValue() {
        return this.f18220e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f18220e != C7276d2.NOLABEL.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f18220e);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f18220e != C7276d2.NOLABEL.getNumber()) {
            codedOutputStream.writeEnum(1, this.f18220e);
        }
    }
}
