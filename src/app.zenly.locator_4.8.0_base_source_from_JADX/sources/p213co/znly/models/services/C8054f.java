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

/* renamed from: co.znly.models.services.f */
public final class C8054f extends GeneratedMessageLite<C8054f, C8055a> implements ReverseGeoCoderProto$ExternalReverseGeoCodeErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8054f f20424f = new C8054f();

    /* renamed from: g */
    private static volatile Parser<C8054f> f20425g;

    /* renamed from: e */
    private C8237q f20426e;

    /* renamed from: co.znly.models.services.f$a */
    public static final class C8055a extends Builder<C8054f, C8055a> implements ReverseGeoCoderProto$ExternalReverseGeoCodeErrorOrBuilder {
        /* synthetic */ C8055a(C8005c cVar) {
            this();
        }

        public C8237q getError() {
            return ((C8054f) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8054f) this.instance).hasError();
        }

        private C8055a() {
            super(C8054f.f20424f);
        }
    }

    static {
        f20424f.makeImmutable();
    }

    private C8054f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8005c.f20316a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8054f();
            case 2:
                return f20424f;
            case 3:
                return null;
            case 4:
                return new C8055a(null);
            case 5:
                this.f20426e = (C8237q) ((Visitor) obj).visitMessage(this.f20426e, ((C8054f) obj2).f20426e);
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
                                Builder builder = this.f20426e != null ? (C8238a) this.f20426e.toBuilder() : null;
                                this.f20426e = (C8237q) codedInputStream.readMessage(C8237q.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20426e);
                                    this.f20426e = (C8237q) builder.buildPartial();
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
                if (f20425g == null) {
                    synchronized (C8054f.class) {
                        if (f20425g == null) {
                            f20425g = new DefaultInstanceBasedParser(f20424f);
                        }
                    }
                }
                return f20425g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20424f;
    }

    public C8237q getError() {
        C8237q qVar = this.f20426e;
        return qVar == null ? C8237q.getDefaultInstance() : qVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20426e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20426e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20426e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
    }
}
