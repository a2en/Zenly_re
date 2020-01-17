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

/* renamed from: co.znly.models.core.e2 */
public final class C7090e2 extends GeneratedMessageLite<C7090e2, C7091a> implements TypesProto$FacebookCredentialsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7090e2 f17536g = new C7090e2();

    /* renamed from: h */
    private static volatile Parser<C7090e2> f17537h;

    /* renamed from: e */
    private String f17538e;

    /* renamed from: f */
    private String f17539f;

    /* renamed from: co.znly.models.core.e2$a */
    public static final class C7091a extends Builder<C7090e2, C7091a> implements TypesProto$FacebookCredentialsOrBuilder {
        /* synthetic */ C7091a(C7253x1 x1Var) {
            this();
        }

        public String getAppId() {
            return ((C7090e2) this.instance).getAppId();
        }

        public ByteString getAppIdBytes() {
            return ((C7090e2) this.instance).getAppIdBytes();
        }

        public String getToken() {
            return ((C7090e2) this.instance).getToken();
        }

        public ByteString getTokenBytes() {
            return ((C7090e2) this.instance).getTokenBytes();
        }

        private C7091a() {
            super(C7090e2.f17536g);
        }
    }

    static {
        f17536g.makeImmutable();
    }

    private C7090e2() {
        String str = "";
        this.f17538e = str;
        this.f17539f = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7090e2();
            case 2:
                return f17536g;
            case 3:
                return null;
            case 4:
                return new C7091a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7090e2 e2Var = (C7090e2) obj2;
                this.f17538e = visitor.visitString(!this.f17538e.isEmpty(), this.f17538e, !e2Var.f17538e.isEmpty(), e2Var.f17538e);
                this.f17539f = visitor.visitString(!this.f17539f.isEmpty(), this.f17539f, true ^ e2Var.f17539f.isEmpty(), e2Var.f17539f);
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
                                this.f17538e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f17539f = codedInputStream.readStringRequireUtf8();
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
                if (f17537h == null) {
                    synchronized (C7090e2.class) {
                        if (f17537h == null) {
                            f17537h = new DefaultInstanceBasedParser(f17536g);
                        }
                    }
                }
                return f17537h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17536g;
    }

    public String getAppId() {
        return this.f17539f;
    }

    public ByteString getAppIdBytes() {
        return ByteString.copyFromUtf8(this.f17539f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17538e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getToken());
        }
        if (!this.f17539f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getAppId());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getToken() {
        return this.f17538e;
    }

    public ByteString getTokenBytes() {
        return ByteString.copyFromUtf8(this.f17538e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17538e.isEmpty()) {
            codedOutputStream.writeString(1, getToken());
        }
        if (!this.f17539f.isEmpty()) {
            codedOutputStream.writeString(2, getAppId());
        }
    }
}
