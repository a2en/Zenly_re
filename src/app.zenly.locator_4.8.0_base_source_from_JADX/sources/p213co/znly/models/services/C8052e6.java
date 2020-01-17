package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C7394m3;
import p213co.znly.models.C7394m3.C7395a;

/* renamed from: co.znly.models.services.e6 */
public final class C8052e6 extends GeneratedMessageLite<C8052e6, C8053a> implements ZenlyProto$WeatherResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8052e6 f20421f = new C8052e6();

    /* renamed from: g */
    private static volatile Parser<C8052e6> f20422g;

    /* renamed from: e */
    private C7394m3 f20423e;

    /* renamed from: co.znly.models.services.e6$a */
    public static final class C8053a extends Builder<C8052e6, C8053a> implements ZenlyProto$WeatherResponseOrBuilder {
        private C8053a() {
            super(C8052e6.f20421f);
        }

        /* synthetic */ C8053a(C8104i0 i0Var) {
            this();
        }

        public C7394m3 getRegion() {
            return ((C8052e6) this.instance).getRegion();
        }

        public boolean hasRegion() {
            return ((C8052e6) this.instance).hasRegion();
        }
    }

    static {
        f20421f.makeImmutable();
    }

    private C8052e6() {
    }

    public static C8053a newBuilder() {
        return (C8053a) f20421f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8052e6();
            case 2:
                return f20421f;
            case 3:
                return null;
            case 4:
                return new C8053a(null);
            case 5:
                this.f20423e = (C7394m3) ((Visitor) obj).visitMessage(this.f20423e, ((C8052e6) obj2).f20423e);
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
                                Builder builder = this.f20423e != null ? (C7395a) this.f20423e.toBuilder() : null;
                                this.f20423e = (C7394m3) codedInputStream.readMessage(C7394m3.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20423e);
                                    this.f20423e = (C7394m3) builder.buildPartial();
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
                if (f20422g == null) {
                    synchronized (C8052e6.class) {
                        if (f20422g == null) {
                            f20422g = new DefaultInstanceBasedParser(f20421f);
                        }
                    }
                }
                return f20422g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20421f;
    }

    public C7394m3 getRegion() {
        C7394m3 m3Var = this.f20423e;
        return m3Var == null ? C7394m3.getDefaultInstance() : m3Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20423e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getRegion());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasRegion() {
        return this.f20423e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20423e != null) {
            codedOutputStream.writeMessage(1, getRegion());
        }
    }
}
