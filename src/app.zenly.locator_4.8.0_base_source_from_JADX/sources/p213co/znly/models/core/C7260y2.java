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

/* renamed from: co.znly.models.core.y2 */
public final class C7260y2 extends GeneratedMessageLite<C7260y2, C7261a> implements UploadProto$HeaderOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7260y2 f18005g = new C7260y2();

    /* renamed from: h */
    private static volatile Parser<C7260y2> f18006h;

    /* renamed from: e */
    private String f18007e;

    /* renamed from: f */
    private String f18008f;

    /* renamed from: co.znly.models.core.y2$a */
    public static final class C7261a extends Builder<C7260y2, C7261a> implements UploadProto$HeaderOrBuilder {
        /* synthetic */ C7261a(C7254x2 x2Var) {
            this();
        }

        public String getKey() {
            return ((C7260y2) this.instance).getKey();
        }

        public ByteString getKeyBytes() {
            return ((C7260y2) this.instance).getKeyBytes();
        }

        public String getValue() {
            return ((C7260y2) this.instance).getValue();
        }

        public ByteString getValueBytes() {
            return ((C7260y2) this.instance).getValueBytes();
        }

        private C7261a() {
            super(C7260y2.f18005g);
        }
    }

    static {
        f18005g.makeImmutable();
    }

    private C7260y2() {
        String str = "";
        this.f18007e = str;
        this.f18008f = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7254x2.f17991a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7260y2();
            case 2:
                return f18005g;
            case 3:
                return null;
            case 4:
                return new C7261a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7260y2 y2Var = (C7260y2) obj2;
                this.f18007e = visitor.visitString(!this.f18007e.isEmpty(), this.f18007e, !y2Var.f18007e.isEmpty(), y2Var.f18007e);
                this.f18008f = visitor.visitString(!this.f18008f.isEmpty(), this.f18008f, true ^ y2Var.f18008f.isEmpty(), y2Var.f18008f);
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
                                this.f18007e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f18008f = codedInputStream.readStringRequireUtf8();
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
                if (f18006h == null) {
                    synchronized (C7260y2.class) {
                        if (f18006h == null) {
                            f18006h = new DefaultInstanceBasedParser(f18005g);
                        }
                    }
                }
                return f18006h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18005g;
    }

    public String getKey() {
        return this.f18007e;
    }

    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8(this.f18007e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18007e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getKey());
        }
        if (!this.f18008f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getValue());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getValue() {
        return this.f18008f;
    }

    public ByteString getValueBytes() {
        return ByteString.copyFromUtf8(this.f18008f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18007e.isEmpty()) {
            codedOutputStream.writeString(1, getKey());
        }
        if (!this.f18008f.isEmpty()) {
            codedOutputStream.writeString(2, getValue());
        }
    }
}
