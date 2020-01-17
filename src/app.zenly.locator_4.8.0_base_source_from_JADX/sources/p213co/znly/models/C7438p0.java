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

/* renamed from: co.znly.models.p0 */
public final class C7438p0 extends GeneratedMessageLite<C7438p0, C7439a> implements MetricProto$LabelPairOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7438p0 f18602g = new C7438p0();

    /* renamed from: h */
    private static volatile Parser<C7438p0> f18603h;

    /* renamed from: e */
    private String f18604e;

    /* renamed from: f */
    private String f18605f;

    /* renamed from: co.znly.models.p0$a */
    public static final class C7439a extends Builder<C7438p0, C7439a> implements MetricProto$LabelPairOrBuilder {
        /* synthetic */ C7439a(C7372k0 k0Var) {
            this();
        }

        public String getName() {
            return ((C7438p0) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((C7438p0) this.instance).getNameBytes();
        }

        public String getValue() {
            return ((C7438p0) this.instance).getValue();
        }

        public ByteString getValueBytes() {
            return ((C7438p0) this.instance).getValueBytes();
        }

        private C7439a() {
            super(C7438p0.f18602g);
        }
    }

    static {
        f18602g.makeImmutable();
    }

    private C7438p0() {
        String str = "";
        this.f18604e = str;
        this.f18605f = str;
    }

    public static Parser<C7438p0> parser() {
        return f18602g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7372k0.f18376a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7438p0();
            case 2:
                return f18602g;
            case 3:
                return null;
            case 4:
                return new C7439a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7438p0 p0Var = (C7438p0) obj2;
                this.f18604e = visitor.visitString(!this.f18604e.isEmpty(), this.f18604e, !p0Var.f18604e.isEmpty(), p0Var.f18604e);
                this.f18605f = visitor.visitString(!this.f18605f.isEmpty(), this.f18605f, true ^ p0Var.f18605f.isEmpty(), p0Var.f18605f);
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
                                this.f18604e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f18605f = codedInputStream.readStringRequireUtf8();
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
                if (f18603h == null) {
                    synchronized (C7438p0.class) {
                        if (f18603h == null) {
                            f18603h = new DefaultInstanceBasedParser(f18602g);
                        }
                    }
                }
                return f18603h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18602g;
    }

    public String getName() {
        return this.f18604e;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.f18604e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18604e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getName());
        }
        if (!this.f18605f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getValue());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getValue() {
        return this.f18605f;
    }

    public ByteString getValueBytes() {
        return ByteString.copyFromUtf8(this.f18605f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18604e.isEmpty()) {
            codedOutputStream.writeString(1, getName());
        }
        if (!this.f18605f.isEmpty()) {
            codedOutputStream.writeString(2, getValue());
        }
    }
}
