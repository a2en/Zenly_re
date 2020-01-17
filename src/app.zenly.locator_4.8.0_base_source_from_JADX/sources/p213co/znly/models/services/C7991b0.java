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

/* renamed from: co.znly.models.services.b0 */
public final class C7991b0 extends GeneratedMessageLite<C7991b0, C7992a> implements ZendeskProto$ZendeskCustomFieldOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7991b0 f20283g = new C7991b0();

    /* renamed from: h */
    private static volatile Parser<C7991b0> f20284h;

    /* renamed from: e */
    private String f20285e = "";

    /* renamed from: f */
    private long f20286f;

    /* renamed from: co.znly.models.services.b0$a */
    public static final class C7992a extends Builder<C7991b0, C7992a> implements ZendeskProto$ZendeskCustomFieldOrBuilder {
        /* synthetic */ C7992a(C8344w wVar) {
            this();
        }

        /* renamed from: a */
        public C7992a mo22054a(String str) {
            copyOnWrite();
            ((C7991b0) this.instance).m19055a(str);
            return this;
        }

        public long getId() {
            return ((C7991b0) this.instance).getId();
        }

        public String getValue() {
            return ((C7991b0) this.instance).getValue();
        }

        public ByteString getValueBytes() {
            return ((C7991b0) this.instance).getValueBytes();
        }

        public C7992a setId(long j) {
            copyOnWrite();
            ((C7991b0) this.instance).setId(j);
            return this;
        }

        private C7992a() {
            super(C7991b0.f20283g);
        }
    }

    static {
        f20283g.makeImmutable();
    }

    private C7991b0() {
    }

    public static C7992a newBuilder() {
        return (C7992a) f20283g.toBuilder();
    }

    public static Parser<C7991b0> parser() {
        return f20283g.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setId(long j) {
        this.f20286f = j;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8344w.f21131a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7991b0();
            case 2:
                return f20283g;
            case 3:
                return null;
            case 4:
                return new C7992a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7991b0 b0Var = (C7991b0) obj2;
                this.f20285e = visitor.visitString(!this.f20285e.isEmpty(), this.f20285e, !b0Var.f20285e.isEmpty(), b0Var.f20285e);
                this.f20286f = visitor.visitLong(this.f20286f != 0, this.f20286f, b0Var.f20286f != 0, b0Var.f20286f);
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
                                this.f20285e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f20286f = codedInputStream.readInt64();
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
                if (f20284h == null) {
                    synchronized (C7991b0.class) {
                        if (f20284h == null) {
                            f20284h = new DefaultInstanceBasedParser(f20283g);
                        }
                    }
                }
                return f20284h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20283g;
    }

    public long getId() {
        return this.f20286f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20285e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getValue());
        }
        long j = this.f20286f;
        if (j != 0) {
            i2 += CodedOutputStream.computeInt64Size(2, j);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getValue() {
        return this.f20285e;
    }

    public ByteString getValueBytes() {
        return ByteString.copyFromUtf8(this.f20285e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20285e.isEmpty()) {
            codedOutputStream.writeString(1, getValue());
        }
        long j = this.f20286f;
        if (j != 0) {
            codedOutputStream.writeInt64(2, j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19055a(String str) {
        if (str != null) {
            this.f20285e = str;
            return;
        }
        throw new NullPointerException();
    }
}
