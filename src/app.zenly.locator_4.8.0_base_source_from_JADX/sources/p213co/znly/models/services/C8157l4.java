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
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.services.C8129j4.C8130a;

/* renamed from: co.znly.models.services.l4 */
public final class C8157l4 extends GeneratedMessageLite<C8157l4, C8158a> implements ZenlyProto$RequestMediaResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8157l4 f20657g = new C8157l4();

    /* renamed from: h */
    private static volatile Parser<C8157l4> f20658h;

    /* renamed from: e */
    private Timestamp f20659e;

    /* renamed from: f */
    private C8129j4 f20660f;

    /* renamed from: co.znly.models.services.l4$a */
    public static final class C8158a extends Builder<C8157l4, C8158a> implements ZenlyProto$RequestMediaResponseOrBuilder {
        /* synthetic */ C8158a(C8104i0 i0Var) {
            this();
        }

        public C8129j4 getError() {
            return ((C8157l4) this.instance).getError();
        }

        public Timestamp getValidUntil() {
            return ((C8157l4) this.instance).getValidUntil();
        }

        public boolean hasError() {
            return ((C8157l4) this.instance).hasError();
        }

        public boolean hasValidUntil() {
            return ((C8157l4) this.instance).hasValidUntil();
        }

        private C8158a() {
            super(C8157l4.f20657g);
        }
    }

    static {
        f20657g.makeImmutable();
    }

    private C8157l4() {
    }

    public static C8158a newBuilder() {
        return (C8158a) f20657g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8157l4();
            case 2:
                return f20657g;
            case 3:
                return null;
            case 4:
                return new C8158a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8157l4 l4Var = (C8157l4) obj2;
                this.f20659e = (Timestamp) visitor.visitMessage(this.f20659e, l4Var.f20659e);
                this.f20660f = (C8129j4) visitor.visitMessage(this.f20660f, l4Var.f20660f);
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
                                Builder builder = this.f20659e != null ? (Timestamp.Builder) this.f20659e.toBuilder() : null;
                                this.f20659e = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20659e);
                                    this.f20659e = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 1010) {
                                Builder builder2 = this.f20660f != null ? (C8130a) this.f20660f.toBuilder() : null;
                                this.f20660f = (C8129j4) codedInputStream.readMessage(C8129j4.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20660f);
                                    this.f20660f = (C8129j4) builder2.buildPartial();
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
                if (f20658h == null) {
                    synchronized (C8157l4.class) {
                        if (f20658h == null) {
                            f20658h = new DefaultInstanceBasedParser(f20657g);
                        }
                    }
                }
                return f20658h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20657g;
    }

    public C8129j4 getError() {
        C8129j4 j4Var = this.f20660f;
        return j4Var == null ? C8129j4.getDefaultInstance() : j4Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20659e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getValidUntil());
        }
        if (this.f20660f != null) {
            i2 += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Timestamp getValidUntil() {
        Timestamp timestamp = this.f20659e;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasError() {
        return this.f20660f != null;
    }

    public boolean hasValidUntil() {
        return this.f20659e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20659e != null) {
            codedOutputStream.writeMessage(1, getValidUntil());
        }
        if (this.f20660f != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
