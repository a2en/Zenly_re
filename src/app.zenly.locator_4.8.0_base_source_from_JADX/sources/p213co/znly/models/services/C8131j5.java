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

/* renamed from: co.znly.models.services.j5 */
public final class C8131j5 extends GeneratedMessageLite<C8131j5, C8132a> implements ZenlyProto$UserAnnotationErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8131j5 f20602f = new C8131j5();

    /* renamed from: g */
    private static volatile Parser<C8131j5> f20603g;

    /* renamed from: e */
    private C8026d2 f20604e;

    /* renamed from: co.znly.models.services.j5$a */
    public static final class C8132a extends Builder<C8131j5, C8132a> implements ZenlyProto$UserAnnotationErrorOrBuilder {
        private C8132a() {
            super(C8131j5.f20602f);
        }

        /* synthetic */ C8132a(C8104i0 i0Var) {
            this();
        }

        public C8026d2 getError() {
            return ((C8131j5) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8131j5) this.instance).hasError();
        }
    }

    static {
        f20602f.makeImmutable();
    }

    private C8131j5() {
    }

    public static C8131j5 getDefaultInstance() {
        return f20602f;
    }

    public static Parser<C8131j5> parser() {
        return f20602f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8131j5();
            case 2:
                return f20602f;
            case 3:
                return null;
            case 4:
                return new C8132a(null);
            case 5:
                this.f20604e = (C8026d2) ((Visitor) obj).visitMessage(this.f20604e, ((C8131j5) obj2).f20604e);
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
                                Builder builder = this.f20604e != null ? (C8027a) this.f20604e.toBuilder() : null;
                                this.f20604e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20604e);
                                    this.f20604e = (C8026d2) builder.buildPartial();
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
                if (f20603g == null) {
                    synchronized (C8131j5.class) {
                        if (f20603g == null) {
                            f20603g = new DefaultInstanceBasedParser(f20602f);
                        }
                    }
                }
                return f20603g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20602f;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f20604e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20604e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20604e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20604e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
    }
}
