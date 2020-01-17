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

/* renamed from: co.znly.models.nights.g */
public final class C7423g extends GeneratedMessageLite<C7423g, C7424a> implements NightsProto$StayOptionsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7423g f18557g = new C7423g();

    /* renamed from: h */
    private static volatile Parser<C7423g> f18558h;

    /* renamed from: e */
    private String f18559e;

    /* renamed from: f */
    private String f18560f;

    /* renamed from: co.znly.models.nights.g$a */
    public static final class C7424a extends Builder<C7423g, C7424a> implements NightsProto$StayOptionsOrBuilder {
        /* synthetic */ C7424a(C7410a aVar) {
            this();
        }

        public String getLocationId() {
            return ((C7423g) this.instance).getLocationId();
        }

        public ByteString getLocationIdBytes() {
            return ((C7423g) this.instance).getLocationIdBytes();
        }

        public String getStayId() {
            return ((C7423g) this.instance).getStayId();
        }

        public ByteString getStayIdBytes() {
            return ((C7423g) this.instance).getStayIdBytes();
        }

        private C7424a() {
            super(C7423g.f18557g);
        }
    }

    static {
        f18557g.makeImmutable();
    }

    private C7423g() {
        String str = "";
        this.f18559e = str;
        this.f18560f = str;
    }

    public static Parser<C7423g> parser() {
        return f18557g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7410a.f18522a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7423g();
            case 2:
                return f18557g;
            case 3:
                return null;
            case 4:
                return new C7424a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7423g gVar = (C7423g) obj2;
                this.f18559e = visitor.visitString(!this.f18559e.isEmpty(), this.f18559e, !gVar.f18559e.isEmpty(), gVar.f18559e);
                this.f18560f = visitor.visitString(!this.f18560f.isEmpty(), this.f18560f, true ^ gVar.f18560f.isEmpty(), gVar.f18560f);
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
                                this.f18559e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f18560f = codedInputStream.readStringRequireUtf8();
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
                if (f18558h == null) {
                    synchronized (C7423g.class) {
                        if (f18558h == null) {
                            f18558h = new DefaultInstanceBasedParser(f18557g);
                        }
                    }
                }
                return f18558h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18557g;
    }

    public String getLocationId() {
        return this.f18559e;
    }

    public ByteString getLocationIdBytes() {
        return ByteString.copyFromUtf8(this.f18559e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18559e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getLocationId());
        }
        if (!this.f18560f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getStayId());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getStayId() {
        return this.f18560f;
    }

    public ByteString getStayIdBytes() {
        return ByteString.copyFromUtf8(this.f18560f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18559e.isEmpty()) {
            codedOutputStream.writeString(1, getLocationId());
        }
        if (!this.f18560f.isEmpty()) {
            codedOutputStream.writeString(2, getStayId());
        }
    }
}
