package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.FieldMask;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.experimental.models.C7293c;
import p213co.znly.models.experimental.models.C7293c.C7294a;

/* renamed from: co.znly.models.core.g0 */
public final class C7101g0 extends GeneratedMessageLite<C7101g0, C7102a> implements CoreExperimentalProto$UserActionsUpdateRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7101g0 f17555g = new C7101g0();

    /* renamed from: h */
    private static volatile Parser<C7101g0> f17556h;

    /* renamed from: e */
    private C7293c f17557e;

    /* renamed from: f */
    private FieldMask f17558f;

    /* renamed from: co.znly.models.core.g0$a */
    public static final class C7102a extends Builder<C7101g0, C7102a> implements CoreExperimentalProto$UserActionsUpdateRequestOrBuilder {
        /* synthetic */ C7102a(C7067c0 c0Var) {
            this();
        }

        /* renamed from: a */
        public C7102a mo19121a(C7293c cVar) {
            copyOnWrite();
            ((C7101g0) this.instance).m17797a(cVar);
            return this;
        }

        public FieldMask getMask() {
            return ((C7101g0) this.instance).getMask();
        }

        public C7293c getUserActions() {
            return ((C7101g0) this.instance).getUserActions();
        }

        public boolean hasMask() {
            return ((C7101g0) this.instance).hasMask();
        }

        public boolean hasUserActions() {
            return ((C7101g0) this.instance).hasUserActions();
        }

        private C7102a() {
            super(C7101g0.f17555g);
        }

        /* renamed from: a */
        public C7102a mo19120a(FieldMask fieldMask) {
            copyOnWrite();
            ((C7101g0) this.instance).m17794a(fieldMask);
            return this;
        }
    }

    static {
        f17555g.makeImmutable();
    }

    private C7101g0() {
    }

    public static C7102a newBuilder() {
        return (C7102a) f17555g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7067c0.f17477a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7101g0();
            case 2:
                return f17555g;
            case 3:
                return null;
            case 4:
                return new C7102a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7101g0 g0Var = (C7101g0) obj2;
                this.f17557e = (C7293c) visitor.visitMessage(this.f17557e, g0Var.f17557e);
                this.f17558f = (FieldMask) visitor.visitMessage(this.f17558f, g0Var.f17558f);
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
                                Builder builder = this.f17557e != null ? (C7294a) this.f17557e.toBuilder() : null;
                                this.f17557e = (C7293c) codedInputStream.readMessage(C7293c.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17557e);
                                    this.f17557e = (C7293c) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f17558f != null ? (FieldMask.Builder) this.f17558f.toBuilder() : null;
                                this.f17558f = (FieldMask) codedInputStream.readMessage(FieldMask.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17558f);
                                    this.f17558f = (FieldMask) builder2.buildPartial();
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
                if (f17556h == null) {
                    synchronized (C7101g0.class) {
                        if (f17556h == null) {
                            f17556h = new DefaultInstanceBasedParser(f17555g);
                        }
                    }
                }
                return f17556h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17555g;
    }

    public FieldMask getMask() {
        FieldMask fieldMask = this.f17558f;
        return fieldMask == null ? FieldMask.getDefaultInstance() : fieldMask;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17557e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getUserActions());
        }
        if (this.f17558f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getMask());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7293c getUserActions() {
        C7293c cVar = this.f17557e;
        return cVar == null ? C7293c.getDefaultInstance() : cVar;
    }

    public boolean hasMask() {
        return this.f17558f != null;
    }

    public boolean hasUserActions() {
        return this.f17557e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17557e != null) {
            codedOutputStream.writeMessage(1, getUserActions());
        }
        if (this.f17558f != null) {
            codedOutputStream.writeMessage(2, getMask());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17797a(C7293c cVar) {
        if (cVar != null) {
            this.f17557e = cVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17794a(FieldMask fieldMask) {
        if (fieldMask != null) {
            this.f17558f = fieldMask;
            return;
        }
        throw new NullPointerException();
    }
}
