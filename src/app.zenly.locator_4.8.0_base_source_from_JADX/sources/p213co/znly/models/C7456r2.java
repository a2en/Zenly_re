package p213co.znly.models;

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

/* renamed from: co.znly.models.r2 */
public final class C7456r2 extends GeneratedMessageLite<C7456r2, C7457a> implements SystemProto$ContextOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7456r2 f18658g = new C7456r2();

    /* renamed from: h */
    private static volatile Parser<C7456r2> f18659h;

    /* renamed from: e */
    private Timestamp f18660e;

    /* renamed from: f */
    private Timestamp f18661f;

    /* renamed from: co.znly.models.r2$a */
    public static final class C7457a extends Builder<C7456r2, C7457a> implements SystemProto$ContextOrBuilder {
        /* synthetic */ C7457a(C7449q2 q2Var) {
            this();
        }

        public Timestamp getCreated() {
            return ((C7456r2) this.instance).getCreated();
        }

        public Timestamp getDeadline() {
            return ((C7456r2) this.instance).getDeadline();
        }

        public boolean hasCreated() {
            return ((C7456r2) this.instance).hasCreated();
        }

        public boolean hasDeadline() {
            return ((C7456r2) this.instance).hasDeadline();
        }

        private C7457a() {
            super(C7456r2.f18658g);
        }
    }

    static {
        f18658g.makeImmutable();
    }

    private C7456r2() {
    }

    public static C7456r2 getDefaultInstance() {
        return f18658g;
    }

    public static Parser<C7456r2> parser() {
        return f18658g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7449q2.f18637a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7456r2();
            case 2:
                return f18658g;
            case 3:
                return null;
            case 4:
                return new C7457a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7456r2 r2Var = (C7456r2) obj2;
                this.f18660e = (Timestamp) visitor.visitMessage(this.f18660e, r2Var.f18660e);
                this.f18661f = (Timestamp) visitor.visitMessage(this.f18661f, r2Var.f18661f);
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
                                Builder builder = this.f18660e != null ? (Timestamp.Builder) this.f18660e.toBuilder() : null;
                                this.f18660e = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18660e);
                                    this.f18660e = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f18661f != null ? (Timestamp.Builder) this.f18661f.toBuilder() : null;
                                this.f18661f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f18661f);
                                    this.f18661f = (Timestamp) builder2.buildPartial();
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
                if (f18659h == null) {
                    synchronized (C7456r2.class) {
                        if (f18659h == null) {
                            f18659h = new DefaultInstanceBasedParser(f18658g);
                        }
                    }
                }
                return f18659h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18658g;
    }

    public Timestamp getCreated() {
        Timestamp timestamp = this.f18660e;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getDeadline() {
        Timestamp timestamp = this.f18661f;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f18660e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getCreated());
        }
        if (this.f18661f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getDeadline());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasCreated() {
        return this.f18660e != null;
    }

    public boolean hasDeadline() {
        return this.f18661f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f18660e != null) {
            codedOutputStream.writeMessage(1, getCreated());
        }
        if (this.f18661f != null) {
            codedOutputStream.writeMessage(2, getDeadline());
        }
    }
}
