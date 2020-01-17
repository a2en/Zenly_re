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

/* renamed from: co.znly.models.nights.c */
public final class C7413c extends GeneratedMessageLite<C7413c, C7414a> implements NightsProto$LocalDateTimeOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7413c f18526f = new C7413c();

    /* renamed from: g */
    private static volatile Parser<C7413c> f18527g;

    /* renamed from: e */
    private String f18528e = "";

    /* renamed from: co.znly.models.nights.c$a */
    public static final class C7414a extends Builder<C7413c, C7414a> implements NightsProto$LocalDateTimeOrBuilder {
        /* synthetic */ C7414a(C7410a aVar) {
            this();
        }

        public String getIso8601() {
            return ((C7413c) this.instance).getIso8601();
        }

        public ByteString getIso8601Bytes() {
            return ((C7413c) this.instance).getIso8601Bytes();
        }

        private C7414a() {
            super(C7413c.f18526f);
        }
    }

    static {
        f18526f.makeImmutable();
    }

    private C7413c() {
    }

    public static C7413c getDefaultInstance() {
        return f18526f;
    }

    public static Parser<C7413c> parser() {
        return f18526f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7410a.f18522a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7413c();
            case 2:
                return f18526f;
            case 3:
                return null;
            case 4:
                return new C7414a(null);
            case 5:
                C7413c cVar = (C7413c) obj2;
                this.f18528e = ((Visitor) obj).visitString(!this.f18528e.isEmpty(), this.f18528e, true ^ cVar.f18528e.isEmpty(), cVar.f18528e);
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
                                this.f18528e = codedInputStream.readStringRequireUtf8();
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
                if (f18527g == null) {
                    synchronized (C7413c.class) {
                        if (f18527g == null) {
                            f18527g = new DefaultInstanceBasedParser(f18526f);
                        }
                    }
                }
                return f18527g;
            default:
                throw new UnsupportedOperationException();
        }
        return f18526f;
    }

    public String getIso8601() {
        return this.f18528e;
    }

    public ByteString getIso8601Bytes() {
        return ByteString.copyFromUtf8(this.f18528e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18528e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getIso8601());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18528e.isEmpty()) {
            codedOutputStream.writeString(1, getIso8601());
        }
    }
}
