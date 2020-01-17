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

/* renamed from: co.znly.models.core.b2 */
public final class C7062b2 extends GeneratedMessageLite<C7062b2, C7063a> implements TypesProto$CoreUIString$UserMessageOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7062b2 f17464g = new C7062b2();

    /* renamed from: h */
    private static volatile Parser<C7062b2> f17465h;

    /* renamed from: e */
    private String f17466e;

    /* renamed from: f */
    private String f17467f;

    /* renamed from: co.znly.models.core.b2$a */
    public static final class C7063a extends Builder<C7062b2, C7063a> implements TypesProto$CoreUIString$UserMessageOrBuilder {
        /* synthetic */ C7063a(C7253x1 x1Var) {
            this();
        }

        public String getMessage() {
            return ((C7062b2) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((C7062b2) this.instance).getMessageBytes();
        }

        public String getUserUuid() {
            return ((C7062b2) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7062b2) this.instance).getUserUuidBytes();
        }

        private C7063a() {
            super(C7062b2.f17464g);
        }
    }

    static {
        f17464g.makeImmutable();
    }

    private C7062b2() {
        String str = "";
        this.f17466e = str;
        this.f17467f = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7062b2();
            case 2:
                return f17464g;
            case 3:
                return null;
            case 4:
                return new C7063a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7062b2 b2Var = (C7062b2) obj2;
                this.f17466e = visitor.visitString(!this.f17466e.isEmpty(), this.f17466e, !b2Var.f17466e.isEmpty(), b2Var.f17466e);
                this.f17467f = visitor.visitString(!this.f17467f.isEmpty(), this.f17467f, true ^ b2Var.f17467f.isEmpty(), b2Var.f17467f);
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
                                this.f17466e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f17467f = codedInputStream.readStringRequireUtf8();
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
                if (f17465h == null) {
                    synchronized (C7062b2.class) {
                        if (f17465h == null) {
                            f17465h = new DefaultInstanceBasedParser(f17464g);
                        }
                    }
                }
                return f17465h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17464g;
    }

    public String getMessage() {
        return this.f17467f;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f17467f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17466e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUserUuid());
        }
        if (!this.f17467f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getMessage());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUserUuid() {
        return this.f17466e;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f17466e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17466e.isEmpty()) {
            codedOutputStream.writeString(1, getUserUuid());
        }
        if (!this.f17467f.isEmpty()) {
            codedOutputStream.writeString(2, getMessage());
        }
    }
}
