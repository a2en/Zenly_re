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
import p213co.znly.models.services.C8237q.C8238a;

/* renamed from: co.znly.models.services.g */
public final class C8070g extends GeneratedMessageLite<C8070g, C8071a> implements ReverseGeoCoderProto$ExternalRoutingErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8070g f20463f = new C8070g();

    /* renamed from: g */
    private static volatile Parser<C8070g> f20464g;

    /* renamed from: e */
    private C8237q f20465e;

    /* renamed from: co.znly.models.services.g$a */
    public static final class C8071a extends Builder<C8070g, C8071a> implements ReverseGeoCoderProto$ExternalRoutingErrorOrBuilder {
        /* synthetic */ C8071a(C8005c cVar) {
            this();
        }

        public C8237q getError() {
            return ((C8070g) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8070g) this.instance).hasError();
        }

        private C8071a() {
            super(C8070g.f20463f);
        }
    }

    static {
        f20463f.makeImmutable();
    }

    private C8070g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8005c.f20316a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8070g();
            case 2:
                return f20463f;
            case 3:
                return null;
            case 4:
                return new C8071a(null);
            case 5:
                this.f20465e = (C8237q) ((Visitor) obj).visitMessage(this.f20465e, ((C8070g) obj2).f20465e);
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
                                Builder builder = this.f20465e != null ? (C8238a) this.f20465e.toBuilder() : null;
                                this.f20465e = (C8237q) codedInputStream.readMessage(C8237q.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20465e);
                                    this.f20465e = (C8237q) builder.buildPartial();
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
                if (f20464g == null) {
                    synchronized (C8070g.class) {
                        if (f20464g == null) {
                            f20464g = new DefaultInstanceBasedParser(f20463f);
                        }
                    }
                }
                return f20464g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20463f;
    }

    public C8237q getError() {
        C8237q qVar = this.f20465e;
        return qVar == null ? C8237q.getDefaultInstance() : qVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20465e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20465e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20465e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
    }
}
