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
import p213co.znly.models.services.C8026d2.C8027a;

/* renamed from: co.znly.models.services.j4 */
public final class C8129j4 extends GeneratedMessageLite<C8129j4, C8130a> implements ZenlyProto$RequestMediaErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8129j4 f20599f = new C8129j4();

    /* renamed from: g */
    private static volatile Parser<C8129j4> f20600g;

    /* renamed from: e */
    private C8026d2 f20601e;

    /* renamed from: co.znly.models.services.j4$a */
    public static final class C8130a extends Builder<C8129j4, C8130a> implements ZenlyProto$RequestMediaErrorOrBuilder {
        /* synthetic */ C8130a(C8104i0 i0Var) {
            this();
        }

        public C8026d2 getError() {
            return ((C8129j4) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8129j4) this.instance).hasError();
        }

        private C8130a() {
            super(C8129j4.f20599f);
        }
    }

    static {
        f20599f.makeImmutable();
    }

    private C8129j4() {
    }

    public static C8129j4 getDefaultInstance() {
        return f20599f;
    }

    public static Parser<C8129j4> parser() {
        return f20599f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8129j4();
            case 2:
                return f20599f;
            case 3:
                return null;
            case 4:
                return new C8130a(null);
            case 5:
                this.f20601e = (C8026d2) ((Visitor) obj).visitMessage(this.f20601e, ((C8129j4) obj2).f20601e);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Builder builder = this.f20601e != null ? (C8027a) this.f20601e.toBuilder() : null;
                                this.f20601e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20601e);
                                    this.f20601e = (C8026d2) builder.buildPartial();
                                }
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
                if (f20600g == null) {
                    synchronized (C8129j4.class) {
                        if (f20600g == null) {
                            f20600g = new DefaultInstanceBasedParser(f20599f);
                        }
                    }
                }
                return f20600g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20599f;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f20601e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20601e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20601e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20601e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
    }
}
