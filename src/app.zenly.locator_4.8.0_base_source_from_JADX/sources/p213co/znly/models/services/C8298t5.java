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

/* renamed from: co.znly.models.services.t5 */
public final class C8298t5 extends GeneratedMessageLite<C8298t5, C8299a> implements ZenlyProto$UserShouldValidateToSResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8298t5 f20977g = new C8298t5();

    /* renamed from: h */
    private static volatile Parser<C8298t5> f20978h;

    /* renamed from: e */
    private boolean f20979e;

    /* renamed from: f */
    private String f20980f = "";

    /* renamed from: co.znly.models.services.t5$a */
    public static final class C8299a extends Builder<C8298t5, C8299a> implements ZenlyProto$UserShouldValidateToSResponseOrBuilder {
        /* synthetic */ C8299a(C8104i0 i0Var) {
            this();
        }

        public boolean getShouldValidate() {
            return ((C8298t5) this.instance).getShouldValidate();
        }

        public String getTosUrl() {
            return ((C8298t5) this.instance).getTosUrl();
        }

        public ByteString getTosUrlBytes() {
            return ((C8298t5) this.instance).getTosUrlBytes();
        }

        private C8299a() {
            super(C8298t5.f20977g);
        }
    }

    static {
        f20977g.makeImmutable();
    }

    private C8298t5() {
    }

    public static C8299a newBuilder() {
        return (C8299a) f20977g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8298t5();
            case 2:
                return f20977g;
            case 3:
                return null;
            case 4:
                return new C8299a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8298t5 t5Var = (C8298t5) obj2;
                boolean z = this.f20979e;
                boolean z2 = t5Var.f20979e;
                this.f20979e = visitor.visitBoolean(z, z, z2, z2);
                this.f20980f = visitor.visitString(!this.f20980f.isEmpty(), this.f20980f, true ^ t5Var.f20980f.isEmpty(), t5Var.f20980f);
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
                            if (readTag == 8) {
                                this.f20979e = codedInputStream.readBool();
                            } else if (readTag == 18) {
                                this.f20980f = codedInputStream.readStringRequireUtf8();
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
                if (f20978h == null) {
                    synchronized (C8298t5.class) {
                        if (f20978h == null) {
                            f20978h = new DefaultInstanceBasedParser(f20977g);
                        }
                    }
                }
                return f20978h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20977g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.f20979e;
        if (z) {
            i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
        }
        if (!this.f20980f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getTosUrl());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean getShouldValidate() {
        return this.f20979e;
    }

    public String getTosUrl() {
        return this.f20980f;
    }

    public ByteString getTosUrlBytes() {
        return ByteString.copyFromUtf8(this.f20980f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z = this.f20979e;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
        if (!this.f20980f.isEmpty()) {
            codedOutputStream.writeString(2, getTosUrl());
        }
    }
}
