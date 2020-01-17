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

/* renamed from: co.znly.models.core.p2 */
public final class C7190p2 extends GeneratedMessageLite<C7190p2, C7191a> implements TypesProto$UserSpinnerOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7190p2 f17811g = new C7190p2();

    /* renamed from: h */
    private static volatile Parser<C7190p2> f17812h;

    /* renamed from: e */
    private String f17813e = "";

    /* renamed from: f */
    private boolean f17814f;

    /* renamed from: co.znly.models.core.p2$a */
    public static final class C7191a extends Builder<C7190p2, C7191a> implements TypesProto$UserSpinnerOrBuilder {
        /* synthetic */ C7191a(C7253x1 x1Var) {
            this();
        }

        public boolean getSpinner() {
            return ((C7190p2) this.instance).getSpinner();
        }

        public String getUuid() {
            return ((C7190p2) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C7190p2) this.instance).getUuidBytes();
        }

        private C7191a() {
            super(C7190p2.f17811g);
        }
    }

    static {
        f17811g.makeImmutable();
    }

    private C7190p2() {
    }

    public static C7191a newBuilder() {
        return (C7191a) f17811g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7190p2();
            case 2:
                return f17811g;
            case 3:
                return null;
            case 4:
                return new C7191a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7190p2 p2Var = (C7190p2) obj2;
                this.f17813e = visitor.visitString(!this.f17813e.isEmpty(), this.f17813e, true ^ p2Var.f17813e.isEmpty(), p2Var.f17813e);
                boolean z = this.f17814f;
                boolean z2 = p2Var.f17814f;
                this.f17814f = visitor.visitBoolean(z, z, z2, z2);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f17813e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f17814f = codedInputStream.readBool();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z3 = true;
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
                if (f17812h == null) {
                    synchronized (C7190p2.class) {
                        if (f17812h == null) {
                            f17812h = new DefaultInstanceBasedParser(f17811g);
                        }
                    }
                }
                return f17812h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17811g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17813e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUuid());
        }
        boolean z = this.f17814f;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(2, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean getSpinner() {
        return this.f17814f;
    }

    public String getUuid() {
        return this.f17813e;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f17813e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17813e.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        boolean z = this.f17814f;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
    }
}
