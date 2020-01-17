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
import p213co.znly.models.C6943a0;
import p213co.znly.models.C6943a0.C6944a;

/* renamed from: co.znly.models.services.k */
public final class C8133k extends GeneratedMessageLite<C8133k, C8134a> implements ReverseGeoCoderProto$NearestCheckinRequest$RequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8133k f20605f = new C8133k();

    /* renamed from: g */
    private static volatile Parser<C8133k> f20606g;

    /* renamed from: e */
    private C6943a0 f20607e;

    /* renamed from: co.znly.models.services.k$a */
    public static final class C8134a extends Builder<C8133k, C8134a> implements ReverseGeoCoderProto$NearestCheckinRequest$RequestOrBuilder {
        /* synthetic */ C8134a(C8005c cVar) {
            this();
        }

        public C6943a0 getCircle() {
            return ((C8133k) this.instance).getCircle();
        }

        public boolean hasCircle() {
            return ((C8133k) this.instance).hasCircle();
        }

        private C8134a() {
            super(C8133k.f20605f);
        }
    }

    static {
        f20605f.makeImmutable();
    }

    private C8133k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8005c.f20316a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8133k();
            case 2:
                return f20605f;
            case 3:
                return null;
            case 4:
                return new C8134a(null);
            case 5:
                this.f20607e = (C6943a0) ((Visitor) obj).visitMessage(this.f20607e, ((C8133k) obj2).f20607e);
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
                                Builder builder = this.f20607e != null ? (C6944a) this.f20607e.toBuilder() : null;
                                this.f20607e = (C6943a0) codedInputStream.readMessage(C6943a0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20607e);
                                    this.f20607e = (C6943a0) builder.buildPartial();
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
                if (f20606g == null) {
                    synchronized (C8133k.class) {
                        if (f20606g == null) {
                            f20606g = new DefaultInstanceBasedParser(f20605f);
                        }
                    }
                }
                return f20606g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20605f;
    }

    public C6943a0 getCircle() {
        C6943a0 a0Var = this.f20607e;
        return a0Var == null ? C6943a0.getDefaultInstance() : a0Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20607e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getCircle());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasCircle() {
        return this.f20607e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20607e != null) {
            codedOutputStream.writeMessage(1, getCircle());
        }
    }
}
