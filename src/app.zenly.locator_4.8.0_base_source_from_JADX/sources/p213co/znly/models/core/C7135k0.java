package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.core.k0 */
public final class C7135k0 extends GeneratedMessageLite<C7135k0, C7136a> implements CoreRecommendationsProto$RecoPotentialMatchesRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7135k0 f17672f = new C7135k0();

    /* renamed from: g */
    private static volatile Parser<C7135k0> f17673g;

    /* renamed from: e */
    private String f17674e = "";

    /* renamed from: co.znly.models.core.k0$a */
    public static final class C7136a extends Builder<C7135k0, C7136a> implements CoreRecommendationsProto$RecoPotentialMatchesRequestOrBuilder {
        /* synthetic */ C7136a(C7121i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C7136a mo19124a(String str) {
            copyOnWrite();
            ((C7135k0) this.instance).m17819a(str);
            return this;
        }

        public String getNewcomerUserUuid() {
            return ((C7135k0) this.instance).getNewcomerUserUuid();
        }

        public ByteString getNewcomerUserUuidBytes() {
            return ((C7135k0) this.instance).getNewcomerUserUuidBytes();
        }

        private C7136a() {
            super(C7135k0.f17672f);
        }
    }

    static {
        f17672f.makeImmutable();
    }

    private C7135k0() {
    }

    public static C7136a newBuilder() {
        return (C7136a) f17672f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7121i0.f17644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7135k0();
            case 2:
                return f17672f;
            case 3:
                return null;
            case 4:
                return new C7136a(null);
            case 5:
                C7135k0 k0Var = (C7135k0) obj2;
                this.f17674e = ((Visitor) obj).visitString(!this.f17674e.isEmpty(), this.f17674e, true ^ k0Var.f17674e.isEmpty(), k0Var.f17674e);
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
                                this.f17674e = codedInputStream.readStringRequireUtf8();
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
                if (f17673g == null) {
                    synchronized (C7135k0.class) {
                        if (f17673g == null) {
                            f17673g = new DefaultInstanceBasedParser(f17672f);
                        }
                    }
                }
                return f17673g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17672f;
    }

    public String getNewcomerUserUuid() {
        return this.f17674e;
    }

    public ByteString getNewcomerUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f17674e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17674e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getNewcomerUserUuid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17674e.isEmpty()) {
            codedOutputStream.writeString(1, getNewcomerUserUuid());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17819a(String str) {
        if (str != null) {
            this.f17674e = str;
            return;
        }
        throw new NullPointerException();
    }
}
