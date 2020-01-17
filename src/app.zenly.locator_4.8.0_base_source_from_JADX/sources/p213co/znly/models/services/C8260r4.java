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
import p213co.znly.models.verify.VerifyInfoProto$VerifyInfo;
import p213co.znly.models.verify.VerifyInfoProto$VerifyInfo.C8444c;

/* renamed from: co.znly.models.services.r4 */
public final class C8260r4 extends GeneratedMessageLite<C8260r4, C8261a> implements ZenlyProto$SessionRequestCallResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8260r4 f20885f = new C8260r4();

    /* renamed from: g */
    private static volatile Parser<C8260r4> f20886g;

    /* renamed from: e */
    private VerifyInfoProto$VerifyInfo f20887e;

    /* renamed from: co.znly.models.services.r4$a */
    public static final class C8261a extends Builder<C8260r4, C8261a> implements ZenlyProto$SessionRequestCallResponseOrBuilder {
        /* synthetic */ C8261a(C8104i0 i0Var) {
            this();
        }

        public VerifyInfoProto$VerifyInfo getVerifyInfo() {
            return ((C8260r4) this.instance).getVerifyInfo();
        }

        public boolean hasVerifyInfo() {
            return ((C8260r4) this.instance).hasVerifyInfo();
        }

        private C8261a() {
            super(C8260r4.f20885f);
        }
    }

    static {
        f20885f.makeImmutable();
    }

    private C8260r4() {
    }

    public static C8261a newBuilder() {
        return (C8261a) f20885f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8260r4();
            case 2:
                return f20885f;
            case 3:
                return null;
            case 4:
                return new C8261a(null);
            case 5:
                this.f20887e = (VerifyInfoProto$VerifyInfo) ((Visitor) obj).visitMessage(this.f20887e, ((C8260r4) obj2).f20887e);
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
                                Builder builder = this.f20887e != null ? (C8444c) this.f20887e.toBuilder() : null;
                                this.f20887e = (VerifyInfoProto$VerifyInfo) codedInputStream.readMessage(VerifyInfoProto$VerifyInfo.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20887e);
                                    this.f20887e = (VerifyInfoProto$VerifyInfo) builder.buildPartial();
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
                if (f20886g == null) {
                    synchronized (C8260r4.class) {
                        if (f20886g == null) {
                            f20886g = new DefaultInstanceBasedParser(f20885f);
                        }
                    }
                }
                return f20886g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20885f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20887e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getVerifyInfo());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public VerifyInfoProto$VerifyInfo getVerifyInfo() {
        VerifyInfoProto$VerifyInfo verifyInfoProto$VerifyInfo = this.f20887e;
        return verifyInfoProto$VerifyInfo == null ? VerifyInfoProto$VerifyInfo.getDefaultInstance() : verifyInfoProto$VerifyInfo;
    }

    public boolean hasVerifyInfo() {
        return this.f20887e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20887e != null) {
            codedOutputStream.writeMessage(1, getVerifyInfo());
        }
    }
}
