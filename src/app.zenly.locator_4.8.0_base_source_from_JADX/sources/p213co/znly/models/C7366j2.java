package p213co.znly.models;

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

/* renamed from: co.znly.models.j2 */
public final class C7366j2 extends GeneratedMessageLite<C7366j2, C7367a> implements PurgatoryProto$purgatory_save$UserV1OrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7366j2 f18357g = new C7366j2();

    /* renamed from: h */
    private static volatile Parser<C7366j2> f18358h;

    /* renamed from: e */
    private String f18359e;

    /* renamed from: f */
    private String f18360f;

    /* renamed from: co.znly.models.j2$a */
    public static final class C7367a extends Builder<C7366j2, C7367a> implements PurgatoryProto$purgatory_save$UserV1OrBuilder {
        /* synthetic */ C7367a(C7324g2 g2Var) {
            this();
        }

        public String getName() {
            return ((C7366j2) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((C7366j2) this.instance).getNameBytes();
        }

        public String getPhoneNumber() {
            return ((C7366j2) this.instance).getPhoneNumber();
        }

        public ByteString getPhoneNumberBytes() {
            return ((C7366j2) this.instance).getPhoneNumberBytes();
        }

        private C7367a() {
            super(C7366j2.f18357g);
        }
    }

    static {
        f18357g.makeImmutable();
    }

    private C7366j2() {
        String str = "";
        this.f18359e = str;
        this.f18360f = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7324g2.f18195a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7366j2();
            case 2:
                return f18357g;
            case 3:
                return null;
            case 4:
                return new C7367a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7366j2 j2Var = (C7366j2) obj2;
                this.f18359e = visitor.visitString(!this.f18359e.isEmpty(), this.f18359e, !j2Var.f18359e.isEmpty(), j2Var.f18359e);
                this.f18360f = visitor.visitString(!this.f18360f.isEmpty(), this.f18360f, true ^ j2Var.f18360f.isEmpty(), j2Var.f18360f);
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
                                this.f18359e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f18360f = codedInputStream.readStringRequireUtf8();
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
                if (f18358h == null) {
                    synchronized (C7366j2.class) {
                        if (f18358h == null) {
                            f18358h = new DefaultInstanceBasedParser(f18357g);
                        }
                    }
                }
                return f18358h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18357g;
    }

    public String getName() {
        return this.f18359e;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.f18359e);
    }

    public String getPhoneNumber() {
        return this.f18360f;
    }

    public ByteString getPhoneNumberBytes() {
        return ByteString.copyFromUtf8(this.f18360f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18359e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getName());
        }
        if (!this.f18360f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getPhoneNumber());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18359e.isEmpty()) {
            codedOutputStream.writeString(1, getName());
        }
        if (!this.f18360f.isEmpty()) {
            codedOutputStream.writeString(2, getPhoneNumber());
        }
    }
}
