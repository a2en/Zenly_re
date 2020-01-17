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
import p213co.znly.models.C7454r1.C7455a;
import p213co.znly.models.PingProto$Ping2.C6824b.C6826b;

/* renamed from: co.znly.models.n1 */
public final class C7400n1 extends GeneratedMessageLite<C7400n1, C7401a> implements PingProto$ChatCursorUpdateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7400n1 f18459j = new C7400n1();

    /* renamed from: k */
    private static volatile Parser<C7400n1> f18460k;

    /* renamed from: e */
    private String f18461e;

    /* renamed from: f */
    private C7454r1 f18462f;

    /* renamed from: g */
    private String f18463g;

    /* renamed from: h */
    private String f18464h;

    /* renamed from: i */
    private int f18465i;

    /* renamed from: co.znly.models.n1$a */
    public static final class C7401a extends Builder<C7400n1, C7401a> implements PingProto$ChatCursorUpdateOrBuilder {
        /* synthetic */ C7401a(C7383l1 l1Var) {
            this();
        }

        public C6826b getContentTypeDeprecated() {
            return ((C7400n1) this.instance).getContentTypeDeprecated();
        }

        public int getContentTypeDeprecatedValue() {
            return ((C7400n1) this.instance).getContentTypeDeprecatedValue();
        }

        public String getConversationUuidDeprecated() {
            return ((C7400n1) this.instance).getConversationUuidDeprecated();
        }

        public ByteString getConversationUuidDeprecatedBytes() {
            return ((C7400n1) this.instance).getConversationUuidDeprecatedBytes();
        }

        public String getCursorUuid() {
            return ((C7400n1) this.instance).getCursorUuid();
        }

        public ByteString getCursorUuidBytes() {
            return ((C7400n1) this.instance).getCursorUuidBytes();
        }

        public C7454r1 getCvtm() {
            return ((C7400n1) this.instance).getCvtm();
        }

        public String getUserUuid() {
            return ((C7400n1) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7400n1) this.instance).getUserUuidBytes();
        }

        public boolean hasCvtm() {
            return ((C7400n1) this.instance).hasCvtm();
        }

        private C7401a() {
            super(C7400n1.f18459j);
        }
    }

    static {
        f18459j.makeImmutable();
    }

    private C7400n1() {
        String str = "";
        this.f18461e = str;
        this.f18463g = str;
        this.f18464h = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7400n1();
            case 2:
                return f18459j;
            case 3:
                return null;
            case 4:
                return new C7401a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7400n1 n1Var = (C7400n1) obj2;
                this.f18461e = visitor.visitString(!this.f18461e.isEmpty(), this.f18461e, !n1Var.f18461e.isEmpty(), n1Var.f18461e);
                this.f18462f = (C7454r1) visitor.visitMessage(this.f18462f, n1Var.f18462f);
                this.f18463g = visitor.visitString(!this.f18463g.isEmpty(), this.f18463g, !n1Var.f18463g.isEmpty(), n1Var.f18463g);
                this.f18464h = visitor.visitString(!this.f18464h.isEmpty(), this.f18464h, !n1Var.f18464h.isEmpty(), n1Var.f18464h);
                boolean z2 = this.f18465i != 0;
                int i = this.f18465i;
                if (n1Var.f18465i != 0) {
                    z = true;
                }
                this.f18465i = visitor.visitInt(z2, i, z, n1Var.f18465i);
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
                                this.f18461e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f18463g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f18464h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 32) {
                                this.f18465i = codedInputStream.readEnum();
                            } else if (readTag == 42) {
                                Builder builder = this.f18462f != null ? (C7455a) this.f18462f.toBuilder() : null;
                                this.f18462f = (C7454r1) codedInputStream.readMessage(C7454r1.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18462f);
                                    this.f18462f = (C7454r1) builder.buildPartial();
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
                if (f18460k == null) {
                    synchronized (C7400n1.class) {
                        if (f18460k == null) {
                            f18460k = new DefaultInstanceBasedParser(f18459j);
                        }
                    }
                }
                return f18460k;
            default:
                throw new UnsupportedOperationException();
        }
        return f18459j;
    }

    public C6826b getContentTypeDeprecated() {
        C6826b a = C6826b.m17582a(this.f18465i);
        return a == null ? C6826b.UNRECOGNIZED : a;
    }

    public int getContentTypeDeprecatedValue() {
        return this.f18465i;
    }

    public String getConversationUuidDeprecated() {
        return this.f18461e;
    }

    public ByteString getConversationUuidDeprecatedBytes() {
        return ByteString.copyFromUtf8(this.f18461e);
    }

    public String getCursorUuid() {
        return this.f18464h;
    }

    public ByteString getCursorUuidBytes() {
        return ByteString.copyFromUtf8(this.f18464h);
    }

    public C7454r1 getCvtm() {
        C7454r1 r1Var = this.f18462f;
        return r1Var == null ? C7454r1.getDefaultInstance() : r1Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18461e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getConversationUuidDeprecated());
        }
        if (!this.f18463g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getUserUuid());
        }
        if (!this.f18464h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getCursorUuid());
        }
        if (this.f18465i != C6826b.UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(4, this.f18465i);
        }
        if (this.f18462f != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getCvtm());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUserUuid() {
        return this.f18463g;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f18463g);
    }

    public boolean hasCvtm() {
        return this.f18462f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18461e.isEmpty()) {
            codedOutputStream.writeString(1, getConversationUuidDeprecated());
        }
        if (!this.f18463g.isEmpty()) {
            codedOutputStream.writeString(2, getUserUuid());
        }
        if (!this.f18464h.isEmpty()) {
            codedOutputStream.writeString(3, getCursorUuid());
        }
        if (this.f18465i != C6826b.UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(4, this.f18465i);
        }
        if (this.f18462f != null) {
            codedOutputStream.writeMessage(5, getCvtm());
        }
    }
}
