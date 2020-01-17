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

/* renamed from: co.znly.models.services.f6 */
public final class C8068f6 extends GeneratedMessageLite<C8068f6, C8069a> implements ZenlyProto$ZenlyReverseGeoCodeErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8068f6 f20460f = new C8068f6();

    /* renamed from: g */
    private static volatile Parser<C8068f6> f20461g;

    /* renamed from: e */
    private C8026d2 f20462e;

    /* renamed from: co.znly.models.services.f6$a */
    public static final class C8069a extends Builder<C8068f6, C8069a> implements ZenlyProto$ZenlyReverseGeoCodeErrorOrBuilder {
        private C8069a() {
            super(C8068f6.f20460f);
        }

        /* synthetic */ C8069a(C8104i0 i0Var) {
            this();
        }

        public C8026d2 getError() {
            return ((C8068f6) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8068f6) this.instance).hasError();
        }
    }

    static {
        f20460f.makeImmutable();
    }

    private C8068f6() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8068f6();
            case 2:
                return f20460f;
            case 3:
                return null;
            case 4:
                return new C8069a(null);
            case 5:
                this.f20462e = (C8026d2) ((Visitor) obj).visitMessage(this.f20462e, ((C8068f6) obj2).f20462e);
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
                                Builder builder = this.f20462e != null ? (C8027a) this.f20462e.toBuilder() : null;
                                this.f20462e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20462e);
                                    this.f20462e = (C8026d2) builder.buildPartial();
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
                if (f20461g == null) {
                    synchronized (C8068f6.class) {
                        if (f20461g == null) {
                            f20461g = new DefaultInstanceBasedParser(f20460f);
                        }
                    }
                }
                return f20461g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20460f;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f20462e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20462e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20462e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20462e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
    }
}
