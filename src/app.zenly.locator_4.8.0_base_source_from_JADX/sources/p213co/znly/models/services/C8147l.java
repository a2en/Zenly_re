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

/* renamed from: co.znly.models.services.l */
public final class C8147l extends GeneratedMessageLite<C8147l, C8148a> implements ReverseGeoCoderProto$NearestVenueRequest$RequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8147l f20636f = new C8147l();

    /* renamed from: g */
    private static volatile Parser<C8147l> f20637g;

    /* renamed from: e */
    private C6943a0 f20638e;

    /* renamed from: co.znly.models.services.l$a */
    public static final class C8148a extends Builder<C8147l, C8148a> implements ReverseGeoCoderProto$NearestVenueRequest$RequestOrBuilder {
        /* synthetic */ C8148a(C8005c cVar) {
            this();
        }

        public C6943a0 getCircle() {
            return ((C8147l) this.instance).getCircle();
        }

        public boolean hasCircle() {
            return ((C8147l) this.instance).hasCircle();
        }

        private C8148a() {
            super(C8147l.f20636f);
        }
    }

    static {
        f20636f.makeImmutable();
    }

    private C8147l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8005c.f20316a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8147l();
            case 2:
                return f20636f;
            case 3:
                return null;
            case 4:
                return new C8148a(null);
            case 5:
                this.f20638e = (C6943a0) ((Visitor) obj).visitMessage(this.f20638e, ((C8147l) obj2).f20638e);
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
                                Builder builder = this.f20638e != null ? (C6944a) this.f20638e.toBuilder() : null;
                                this.f20638e = (C6943a0) codedInputStream.readMessage(C6943a0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20638e);
                                    this.f20638e = (C6943a0) builder.buildPartial();
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
                if (f20637g == null) {
                    synchronized (C8147l.class) {
                        if (f20637g == null) {
                            f20637g = new DefaultInstanceBasedParser(f20636f);
                        }
                    }
                }
                return f20637g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20636f;
    }

    public C6943a0 getCircle() {
        C6943a0 a0Var = this.f20638e;
        return a0Var == null ? C6943a0.getDefaultInstance() : a0Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20638e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getCircle());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasCircle() {
        return this.f20638e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20638e != null) {
            codedOutputStream.writeMessage(1, getCircle());
        }
    }
}
