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
import p213co.znly.models.services.nights.C8194b;
import p213co.znly.models.services.nights.C8194b.C8195a;

/* renamed from: co.znly.models.services.n3 */
public final class C8185n3 extends GeneratedMessageLite<C8185n3, C8186a> implements ZenlyProto$NightsHideLocationResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8185n3 f20718g = new C8185n3();

    /* renamed from: h */
    private static volatile Parser<C8185n3> f20719h;

    /* renamed from: e */
    private int f20720e;

    /* renamed from: f */
    private C8194b f20721f;

    /* renamed from: co.znly.models.services.n3$a */
    public static final class C8186a extends Builder<C8185n3, C8186a> implements ZenlyProto$NightsHideLocationResponseOrBuilder {
        private C8186a() {
            super(C8185n3.f20718g);
        }

        /* synthetic */ C8186a(C8104i0 i0Var) {
            this();
        }

        public C8194b getError() {
            return ((C8185n3) this.instance).getError();
        }

        public int getNightsVersion() {
            return ((C8185n3) this.instance).getNightsVersion();
        }

        public boolean hasError() {
            return ((C8185n3) this.instance).hasError();
        }
    }

    static {
        f20718g.makeImmutable();
    }

    private C8185n3() {
    }

    public static C8186a newBuilder() {
        return (C8186a) f20718g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8185n3();
            case 2:
                return f20718g;
            case 3:
                return null;
            case 4:
                return new C8186a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8185n3 n3Var = (C8185n3) obj2;
                boolean z2 = this.f20720e != 0;
                int i = this.f20720e;
                if (n3Var.f20720e != 0) {
                    z = true;
                }
                this.f20720e = visitor.visitInt(z2, i, z, n3Var.f20720e);
                this.f20721f = (C8194b) visitor.visitMessage(this.f20721f, n3Var.f20721f);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 16) {
                                this.f20720e = codedInputStream.readUInt32();
                            } else if (readTag == 1010) {
                                Builder builder = this.f20721f != null ? (C8195a) this.f20721f.toBuilder() : null;
                                this.f20721f = (C8194b) codedInputStream.readMessage(C8194b.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20721f);
                                    this.f20721f = (C8194b) builder.buildPartial();
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
                if (f20719h == null) {
                    synchronized (C8185n3.class) {
                        if (f20719h == null) {
                            f20719h = new DefaultInstanceBasedParser(f20718g);
                        }
                    }
                }
                return f20719h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20718g;
    }

    public C8194b getError() {
        C8194b bVar = this.f20721f;
        return bVar == null ? C8194b.getDefaultInstance() : bVar;
    }

    public int getNightsVersion() {
        return this.f20720e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f20720e;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeUInt32Size(2, i3);
        }
        if (this.f20721f != null) {
            i2 += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20721f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f20720e;
        if (i != 0) {
            codedOutputStream.writeUInt32(2, i);
        }
        if (this.f20721f != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
