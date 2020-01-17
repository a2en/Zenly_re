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

/* renamed from: co.znly.models.services.p2 */
public final class C8224p2 extends GeneratedMessageLite<C8224p2, C8225a> implements ZenlyProto$FootstepsWebGetResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8224p2 f20813g = new C8224p2();

    /* renamed from: h */
    private static volatile Parser<C8224p2> f20814h;

    /* renamed from: e */
    private boolean f20815e;

    /* renamed from: f */
    private String f20816f = "";

    /* renamed from: co.znly.models.services.p2$a */
    public static final class C8225a extends Builder<C8224p2, C8225a> implements ZenlyProto$FootstepsWebGetResponseOrBuilder {
        /* synthetic */ C8225a(C8104i0 i0Var) {
            this();
        }

        public boolean getShareEnabled() {
            return ((C8224p2) this.instance).getShareEnabled();
        }

        public String getUrl() {
            return ((C8224p2) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((C8224p2) this.instance).getUrlBytes();
        }

        private C8225a() {
            super(C8224p2.f20813g);
        }
    }

    static {
        f20813g.makeImmutable();
    }

    private C8224p2() {
    }

    public static C8225a newBuilder() {
        return (C8225a) f20813g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8224p2();
            case 2:
                return f20813g;
            case 3:
                return null;
            case 4:
                return new C8225a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8224p2 p2Var = (C8224p2) obj2;
                boolean z = this.f20815e;
                boolean z2 = p2Var.f20815e;
                this.f20815e = visitor.visitBoolean(z, z, z2, z2);
                this.f20816f = visitor.visitString(!this.f20816f.isEmpty(), this.f20816f, true ^ p2Var.f20816f.isEmpty(), p2Var.f20816f);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f20815e = codedInputStream.readBool();
                            } else if (readTag == 18) {
                                this.f20816f = codedInputStream.readStringRequireUtf8();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z3 = true;
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
                if (f20814h == null) {
                    synchronized (C8224p2.class) {
                        if (f20814h == null) {
                            f20814h = new DefaultInstanceBasedParser(f20813g);
                        }
                    }
                }
                return f20814h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20813g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.f20815e;
        if (z) {
            i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
        }
        if (!this.f20816f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getUrl());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean getShareEnabled() {
        return this.f20815e;
    }

    public String getUrl() {
        return this.f20816f;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.f20816f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z = this.f20815e;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
        if (!this.f20816f.isEmpty()) {
            codedOutputStream.writeString(2, getUrl());
        }
    }
}
