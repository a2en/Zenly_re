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
import p213co.znly.models.C7434p.C7436b;

/* renamed from: co.znly.models.o */
public final class C7427o extends GeneratedMessageLite<C7427o, C7428a> implements ContactProto$SuggestedKeyOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7427o f18572g = new C7427o();

    /* renamed from: h */
    private static volatile Parser<C7427o> f18573h;

    /* renamed from: e */
    private int f18574e;

    /* renamed from: f */
    private String f18575f = "";

    /* renamed from: co.znly.models.o$a */
    public static final class C7428a extends Builder<C7427o, C7428a> implements ContactProto$SuggestedKeyOrBuilder {
        /* synthetic */ C7428a(C7331h hVar) {
            this();
        }

        public String getKey() {
            return ((C7427o) this.instance).getKey();
        }

        public ByteString getKeyBytes() {
            return ((C7427o) this.instance).getKeyBytes();
        }

        public C7436b getType() {
            return ((C7427o) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C7427o) this.instance).getTypeValue();
        }

        private C7428a() {
            super(C7427o.f18572g);
        }
    }

    static {
        f18572g.makeImmutable();
    }

    private C7427o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7331h.f18216a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7427o();
            case 2:
                return f18572g;
            case 3:
                return null;
            case 4:
                return new C7428a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7427o oVar = (C7427o) obj2;
                boolean z2 = this.f18574e != 0;
                int i = this.f18574e;
                if (oVar.f18574e != 0) {
                    z = true;
                }
                this.f18574e = visitor.visitInt(z2, i, z, oVar.f18574e);
                this.f18575f = visitor.visitString(!this.f18575f.isEmpty(), this.f18575f, !oVar.f18575f.isEmpty(), oVar.f18575f);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f18574e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                this.f18575f = codedInputStream.readStringRequireUtf8();
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
                if (f18573h == null) {
                    synchronized (C7427o.class) {
                        if (f18573h == null) {
                            f18573h = new DefaultInstanceBasedParser(f18572g);
                        }
                    }
                }
                return f18573h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18572g;
    }

    public String getKey() {
        return this.f18575f;
    }

    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8(this.f18575f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f18574e != C7436b.SUGGESTTYPE_UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f18574e);
        }
        if (!this.f18575f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getKey());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7436b getType() {
        C7436b a = C7436b.m18093a(this.f18574e);
        return a == null ? C7436b.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f18574e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f18574e != C7436b.SUGGESTTYPE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f18574e);
        }
        if (!this.f18575f.isEmpty()) {
            codedOutputStream.writeString(2, getKey());
        }
    }
}
