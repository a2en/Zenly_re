package p213co.znly.models.services;

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

/* renamed from: co.znly.models.services.h */
public final class C8086h extends GeneratedMessageLite<C8086h, C8087a> implements ReverseGeoCoderProto$GraphQLResponse$ResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8086h f20488h = new C8086h();

    /* renamed from: i */
    private static volatile Parser<C8086h> f20489i;

    /* renamed from: e */
    private int f20490e;

    /* renamed from: f */
    private ByteString f20491f = ByteString.EMPTY;

    /* renamed from: g */
    private String f20492g = "";

    /* renamed from: co.znly.models.services.h$a */
    public static final class C8087a extends Builder<C8086h, C8087a> implements ReverseGeoCoderProto$GraphQLResponse$ResponseOrBuilder {
        /* synthetic */ C8087a(C8005c cVar) {
            this();
        }

        public String getError() {
            return ((C8086h) this.instance).getError();
        }

        public ByteString getErrorBytes() {
            return ((C8086h) this.instance).getErrorBytes();
        }

        public ByteString getResponse() {
            return ((C8086h) this.instance).getResponse();
        }

        public C8102i getStatus() {
            return ((C8086h) this.instance).getStatus();
        }

        public int getStatusValue() {
            return ((C8086h) this.instance).getStatusValue();
        }

        private C8087a() {
            super(C8086h.f20488h);
        }
    }

    static {
        f20488h.makeImmutable();
    }

    private C8086h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8005c.f20316a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8086h();
            case 2:
                return f20488h;
            case 3:
                return null;
            case 4:
                return new C8087a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8086h hVar = (C8086h) obj2;
                this.f20490e = visitor.visitInt(this.f20490e != 0, this.f20490e, hVar.f20490e != 0, hVar.f20490e);
                boolean z2 = this.f20491f != ByteString.EMPTY;
                ByteString byteString = this.f20491f;
                if (hVar.f20491f != ByteString.EMPTY) {
                    z = true;
                }
                this.f20491f = visitor.visitByteString(z2, byteString, z, hVar.f20491f);
                this.f20492g = visitor.visitString(!this.f20492g.isEmpty(), this.f20492g, !hVar.f20492g.isEmpty(), hVar.f20492g);
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
                                this.f20490e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                this.f20491f = codedInputStream.readBytes();
                            } else if (readTag == 26) {
                                this.f20492g = codedInputStream.readStringRequireUtf8();
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
                if (f20489i == null) {
                    synchronized (C8086h.class) {
                        if (f20489i == null) {
                            f20489i = new DefaultInstanceBasedParser(f20488h);
                        }
                    }
                }
                return f20489i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20488h;
    }

    public String getError() {
        return this.f20492g;
    }

    public ByteString getErrorBytes() {
        return ByteString.copyFromUtf8(this.f20492g);
    }

    public ByteString getResponse() {
        return this.f20491f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20490e != C8102i.OK.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20490e);
        }
        if (!this.f20491f.isEmpty()) {
            i2 += CodedOutputStream.computeBytesSize(2, this.f20491f);
        }
        if (!this.f20492g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C8102i getStatus() {
        C8102i a = C8102i.m19184a(this.f20490e);
        return a == null ? C8102i.UNRECOGNIZED : a;
    }

    public int getStatusValue() {
        return this.f20490e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20490e != C8102i.OK.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20490e);
        }
        if (!this.f20491f.isEmpty()) {
            codedOutputStream.writeBytes(2, this.f20491f);
        }
        if (!this.f20492g.isEmpty()) {
            codedOutputStream.writeString(3, getError());
        }
    }
}
