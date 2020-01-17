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
import p213co.znly.models.services.C8266s0;
import p213co.znly.models.services.C8266s0.C8267a;

/* renamed from: co.znly.models.core.b */
public final class C7056b extends GeneratedMessageLite<C7056b, C7057a> implements BrumpExtendedProto$BrumpExtendedEventOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7056b f17452g = new C7056b();

    /* renamed from: h */
    private static volatile Parser<C7056b> f17453h;

    /* renamed from: e */
    private C8266s0 f17454e;

    /* renamed from: f */
    private boolean f17455f;

    /* renamed from: co.znly.models.core.b$a */
    public static final class C7057a extends Builder<C7056b, C7057a> implements BrumpExtendedProto$BrumpExtendedEventOrBuilder {
        /* synthetic */ C7057a(C7049a aVar) {
            this();
        }

        public C8266s0 getBrumpEvent() {
            return ((C7056b) this.instance).getBrumpEvent();
        }

        public boolean getIsSingleBump() {
            return ((C7056b) this.instance).getIsSingleBump();
        }

        public boolean hasBrumpEvent() {
            return ((C7056b) this.instance).hasBrumpEvent();
        }

        private C7057a() {
            super(C7056b.f17452g);
        }
    }

    static {
        f17452g.makeImmutable();
    }

    private C7056b() {
    }

    public static C7057a newBuilder() {
        return (C7057a) f17452g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7049a.f17438a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7056b();
            case 2:
                return f17452g;
            case 3:
                return null;
            case 4:
                return new C7057a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7056b bVar = (C7056b) obj2;
                this.f17454e = (C8266s0) visitor.visitMessage(this.f17454e, bVar.f17454e);
                boolean z = this.f17455f;
                boolean z2 = bVar.f17455f;
                this.f17455f = visitor.visitBoolean(z, z, z2, z2);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Builder builder = this.f17454e != null ? (C8267a) this.f17454e.toBuilder() : null;
                                this.f17454e = (C8266s0) codedInputStream.readMessage(C8266s0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17454e);
                                    this.f17454e = (C8266s0) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f17455f = codedInputStream.readBool();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z3 = true;
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
                if (f17453h == null) {
                    synchronized (C7056b.class) {
                        if (f17453h == null) {
                            f17453h = new DefaultInstanceBasedParser(f17452g);
                        }
                    }
                }
                return f17453h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17452g;
    }

    public C8266s0 getBrumpEvent() {
        C8266s0 s0Var = this.f17454e;
        return s0Var == null ? C8266s0.getDefaultInstance() : s0Var;
    }

    public boolean getIsSingleBump() {
        return this.f17455f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17454e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getBrumpEvent());
        }
        boolean z = this.f17455f;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(2, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasBrumpEvent() {
        return this.f17454e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17454e != null) {
            codedOutputStream.writeMessage(1, getBrumpEvent());
        }
        boolean z = this.f17455f;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
    }
}
