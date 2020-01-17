package p213co.znly.models.nights;

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

/* renamed from: co.znly.models.nights.b */
public final class C7411b extends GeneratedMessageLite<C7411b, C7412a> implements NightsProto$DateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7411b f18523f = new C7411b();

    /* renamed from: g */
    private static volatile Parser<C7411b> f18524g;

    /* renamed from: e */
    private String f18525e = "";

    /* renamed from: co.znly.models.nights.b$a */
    public static final class C7412a extends Builder<C7411b, C7412a> implements NightsProto$DateOrBuilder {
        /* synthetic */ C7412a(C7410a aVar) {
            this();
        }

        public String getIso8601() {
            return ((C7411b) this.instance).getIso8601();
        }

        public ByteString getIso8601Bytes() {
            return ((C7411b) this.instance).getIso8601Bytes();
        }

        private C7412a() {
            super(C7411b.f18523f);
        }
    }

    static {
        f18523f.makeImmutable();
    }

    private C7411b() {
    }

    public static C7411b getDefaultInstance() {
        return f18523f;
    }

    public static Parser<C7411b> parser() {
        return f18523f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7410a.f18522a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7411b();
            case 2:
                return f18523f;
            case 3:
                return null;
            case 4:
                return new C7412a(null);
            case 5:
                C7411b bVar = (C7411b) obj2;
                this.f18525e = ((Visitor) obj).visitString(!this.f18525e.isEmpty(), this.f18525e, true ^ bVar.f18525e.isEmpty(), bVar.f18525e);
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
                                this.f18525e = codedInputStream.readStringRequireUtf8();
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
                if (f18524g == null) {
                    synchronized (C7411b.class) {
                        if (f18524g == null) {
                            f18524g = new DefaultInstanceBasedParser(f18523f);
                        }
                    }
                }
                return f18524g;
            default:
                throw new UnsupportedOperationException();
        }
        return f18523f;
    }

    public String getIso8601() {
        return this.f18525e;
    }

    public ByteString getIso8601Bytes() {
        return ByteString.copyFromUtf8(this.f18525e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18525e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getIso8601());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18525e.isEmpty()) {
            codedOutputStream.writeString(1, getIso8601());
        }
    }
}
