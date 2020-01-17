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
import p213co.znly.models.C7402n2;
import p213co.znly.models.C7402n2.C7403a;
import p213co.znly.models.services.C8210o4.C8211a;
import p213co.znly.models.verify.C8454e;
import p213co.znly.models.verify.VerifyInfoProto$VerifyInfo;
import p213co.znly.models.verify.VerifyInfoProto$VerifyInfo.C8444c;

/* renamed from: co.znly.models.services.p4 */
public final class C8228p4 extends GeneratedMessageLite<C8228p4, C8229a> implements ZenlyProto$SessionCreateResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C8228p4 f20820j = new C8228p4();

    /* renamed from: k */
    private static volatile Parser<C8228p4> f20821k;

    /* renamed from: e */
    private C7402n2 f20822e;

    /* renamed from: f */
    private int f20823f;

    /* renamed from: g */
    private int f20824g;

    /* renamed from: h */
    private VerifyInfoProto$VerifyInfo f20825h;

    /* renamed from: i */
    private C8210o4 f20826i;

    /* renamed from: co.znly.models.services.p4$a */
    public static final class C8229a extends Builder<C8228p4, C8229a> implements ZenlyProto$SessionCreateResponseOrBuilder {
        /* synthetic */ C8229a(C8104i0 i0Var) {
            this();
        }

        public int getDeprecatedChallengeSize() {
            return ((C8228p4) this.instance).getDeprecatedChallengeSize();
        }

        public C8454e getDeprecatedChallengeType() {
            return ((C8228p4) this.instance).getDeprecatedChallengeType();
        }

        public int getDeprecatedChallengeTypeValue() {
            return ((C8228p4) this.instance).getDeprecatedChallengeTypeValue();
        }

        public C8210o4 getError() {
            return ((C8228p4) this.instance).getError();
        }

        public C7402n2 getSession() {
            return ((C8228p4) this.instance).getSession();
        }

        public VerifyInfoProto$VerifyInfo getVerifyInfo() {
            return ((C8228p4) this.instance).getVerifyInfo();
        }

        public boolean hasError() {
            return ((C8228p4) this.instance).hasError();
        }

        public boolean hasSession() {
            return ((C8228p4) this.instance).hasSession();
        }

        public boolean hasVerifyInfo() {
            return ((C8228p4) this.instance).hasVerifyInfo();
        }

        private C8229a() {
            super(C8228p4.f20820j);
        }
    }

    static {
        f20820j.makeImmutable();
    }

    private C8228p4() {
    }

    public static C8229a newBuilder() {
        return (C8229a) f20820j.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8228p4();
            case 2:
                return f20820j;
            case 3:
                return null;
            case 4:
                return new C8229a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8228p4 p4Var = (C8228p4) obj2;
                this.f20822e = (C7402n2) visitor.visitMessage(this.f20822e, p4Var.f20822e);
                this.f20823f = visitor.visitInt(this.f20823f != 0, this.f20823f, p4Var.f20823f != 0, p4Var.f20823f);
                boolean z2 = this.f20824g != 0;
                int i = this.f20824g;
                if (p4Var.f20824g != 0) {
                    z = true;
                }
                this.f20824g = visitor.visitInt(z2, i, z, p4Var.f20824g);
                this.f20825h = (VerifyInfoProto$VerifyInfo) visitor.visitMessage(this.f20825h, p4Var.f20825h);
                this.f20826i = (C8210o4) visitor.visitMessage(this.f20826i, p4Var.f20826i);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Builder builder = this.f20822e != null ? (C7403a) this.f20822e.toBuilder() : null;
                                this.f20822e = (C7402n2) codedInputStream.readMessage(C7402n2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20822e);
                                    this.f20822e = (C7402n2) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f20823f = codedInputStream.readEnum();
                            } else if (readTag == 24) {
                                this.f20824g = codedInputStream.readInt32();
                            } else if (readTag == 34) {
                                Builder builder2 = this.f20825h != null ? (C8444c) this.f20825h.toBuilder() : null;
                                this.f20825h = (VerifyInfoProto$VerifyInfo) codedInputStream.readMessage(VerifyInfoProto$VerifyInfo.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20825h);
                                    this.f20825h = (VerifyInfoProto$VerifyInfo) builder2.buildPartial();
                                }
                            } else if (readTag == 1010) {
                                Builder builder3 = this.f20826i != null ? (C8211a) this.f20826i.toBuilder() : null;
                                this.f20826i = (C8210o4) codedInputStream.readMessage(C8210o4.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f20826i);
                                    this.f20826i = (C8210o4) builder3.buildPartial();
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
                if (f20821k == null) {
                    synchronized (C8228p4.class) {
                        if (f20821k == null) {
                            f20821k = new DefaultInstanceBasedParser(f20820j);
                        }
                    }
                }
                return f20821k;
            default:
                throw new UnsupportedOperationException();
        }
        return f20820j;
    }

    public int getDeprecatedChallengeSize() {
        return this.f20824g;
    }

    public C8454e getDeprecatedChallengeType() {
        C8454e a = C8454e.m19515a(this.f20823f);
        return a == null ? C8454e.UNRECOGNIZED : a;
    }

    public int getDeprecatedChallengeTypeValue() {
        return this.f20823f;
    }

    public C8210o4 getError() {
        C8210o4 o4Var = this.f20826i;
        return o4Var == null ? C8210o4.getDefaultInstance() : o4Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20822e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getSession());
        }
        if (this.f20823f != C8454e.ALPHA.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f20823f);
        }
        int i3 = this.f20824g;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(3, i3);
        }
        if (this.f20825h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getVerifyInfo());
        }
        if (this.f20826i != null) {
            i2 += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7402n2 getSession() {
        C7402n2 n2Var = this.f20822e;
        return n2Var == null ? C7402n2.getDefaultInstance() : n2Var;
    }

    public VerifyInfoProto$VerifyInfo getVerifyInfo() {
        VerifyInfoProto$VerifyInfo verifyInfoProto$VerifyInfo = this.f20825h;
        return verifyInfoProto$VerifyInfo == null ? VerifyInfoProto$VerifyInfo.getDefaultInstance() : verifyInfoProto$VerifyInfo;
    }

    public boolean hasError() {
        return this.f20826i != null;
    }

    public boolean hasSession() {
        return this.f20822e != null;
    }

    public boolean hasVerifyInfo() {
        return this.f20825h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20822e != null) {
            codedOutputStream.writeMessage(1, getSession());
        }
        if (this.f20823f != C8454e.ALPHA.getNumber()) {
            codedOutputStream.writeEnum(2, this.f20823f);
        }
        int i = this.f20824g;
        if (i != 0) {
            codedOutputStream.writeInt32(3, i);
        }
        if (this.f20825h != null) {
            codedOutputStream.writeMessage(4, getVerifyInfo());
        }
        if (this.f20826i != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
