package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C6952b1;
import p213co.znly.models.C6952b1.C6953a;
import p213co.znly.models.services.C8026d2.C8027a;

/* renamed from: co.znly.models.services.s4 */
public final class C8275s4 extends GeneratedMessageLite<C8275s4, C8276a> implements ZenlyProto$SessionVerifyErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C8275s4 f20918i = new C8275s4();

    /* renamed from: j */
    private static volatile Parser<C8275s4> f20919j;

    /* renamed from: e */
    private C8026d2 f20920e;

    /* renamed from: f */
    private int f20921f;

    /* renamed from: g */
    private C6952b1 f20922g;

    /* renamed from: h */
    private Timestamp f20923h;

    /* renamed from: co.znly.models.services.s4$a */
    public static final class C8276a extends Builder<C8275s4, C8276a> implements ZenlyProto$SessionVerifyErrorOrBuilder {
        /* synthetic */ C8276a(C8104i0 i0Var) {
            this();
        }

        public C8277b getCode() {
            return ((C8275s4) this.instance).getCode();
        }

        public int getCodeValue() {
            return ((C8275s4) this.instance).getCodeValue();
        }

        public Timestamp getDeletionDate() {
            return ((C8275s4) this.instance).getDeletionDate();
        }

        public C8026d2 getError() {
            return ((C8275s4) this.instance).getError();
        }

        public C6952b1 getPhoneNumberProbation() {
            return ((C8275s4) this.instance).getPhoneNumberProbation();
        }

        public boolean hasDeletionDate() {
            return ((C8275s4) this.instance).hasDeletionDate();
        }

        public boolean hasError() {
            return ((C8275s4) this.instance).hasError();
        }

        public boolean hasPhoneNumberProbation() {
            return ((C8275s4) this.instance).hasPhoneNumberProbation();
        }

        private C8276a() {
            super(C8275s4.f20918i);
        }
    }

    /* renamed from: co.znly.models.services.s4$b */
    public enum C8277b implements EnumLite {
        CODE_SUCCESS(0),
        CODE_IN_DELETION_PROCESS(1),
        CODE_IN_PROBATION(2),
        CODE_WRONG_CODE(3),
        CODE_TOO_MANY_TRIES(4),
        CODE_AGE_GATED(5),
        CODE_INVALID_USER_NAME(6),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f20933e;

        /* renamed from: co.znly.models.services.s4$b$a */
        class C8278a implements EnumLiteMap<C8277b> {
            C8278a() {
            }

            public C8277b findValueByNumber(int i) {
                return C8277b.m19352a(i);
            }
        }

        static {
            new C8278a();
        }

        private C8277b(int i) {
            this.f20933e = i;
        }

        /* renamed from: a */
        public static C8277b m19352a(int i) {
            switch (i) {
                case 0:
                    return CODE_SUCCESS;
                case 1:
                    return CODE_IN_DELETION_PROCESS;
                case 2:
                    return CODE_IN_PROBATION;
                case 3:
                    return CODE_WRONG_CODE;
                case 4:
                    return CODE_TOO_MANY_TRIES;
                case 5:
                    return CODE_AGE_GATED;
                case 6:
                    return CODE_INVALID_USER_NAME;
                default:
                    return null;
            }
        }

        public final int getNumber() {
            return this.f20933e;
        }
    }

    static {
        f20918i.makeImmutable();
    }

    private C8275s4() {
    }

    public static C8275s4 getDefaultInstance() {
        return f20918i;
    }

    public static C8275s4 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (C8275s4) GeneratedMessageLite.parseFrom(f20918i, bArr);
    }

    public static Parser<C8275s4> parser() {
        return f20918i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8275s4();
            case 2:
                return f20918i;
            case 3:
                return null;
            case 4:
                return new C8276a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8275s4 s4Var = (C8275s4) obj2;
                this.f20920e = (C8026d2) visitor.visitMessage(this.f20920e, s4Var.f20920e);
                boolean z2 = this.f20921f != 0;
                int i = this.f20921f;
                if (s4Var.f20921f != 0) {
                    z = true;
                }
                this.f20921f = visitor.visitInt(z2, i, z, s4Var.f20921f);
                this.f20922g = (C6952b1) visitor.visitMessage(this.f20922g, s4Var.f20922g);
                this.f20923h = (Timestamp) visitor.visitMessage(this.f20923h, s4Var.f20923h);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Builder builder = this.f20920e != null ? (C8027a) this.f20920e.toBuilder() : null;
                                this.f20920e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20920e);
                                    this.f20920e = (C8026d2) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f20921f = codedInputStream.readEnum();
                            } else if (readTag == 26) {
                                Builder builder2 = this.f20922g != null ? (C6953a) this.f20922g.toBuilder() : null;
                                this.f20922g = (C6952b1) codedInputStream.readMessage(C6952b1.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20922g);
                                    this.f20922g = (C6952b1) builder2.buildPartial();
                                }
                            } else if (readTag == 34) {
                                Builder builder3 = this.f20923h != null ? (Timestamp.Builder) this.f20923h.toBuilder() : null;
                                this.f20923h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f20923h);
                                    this.f20923h = (Timestamp) builder3.buildPartial();
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
                if (f20919j == null) {
                    synchronized (C8275s4.class) {
                        if (f20919j == null) {
                            f20919j = new DefaultInstanceBasedParser(f20918i);
                        }
                    }
                }
                return f20919j;
            default:
                throw new UnsupportedOperationException();
        }
        return f20918i;
    }

    public C8277b getCode() {
        C8277b a = C8277b.m19352a(this.f20921f);
        return a == null ? C8277b.UNRECOGNIZED : a;
    }

    public int getCodeValue() {
        return this.f20921f;
    }

    public Timestamp getDeletionDate() {
        Timestamp timestamp = this.f20923h;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f20920e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public C6952b1 getPhoneNumberProbation() {
        C6952b1 b1Var = this.f20922g;
        return b1Var == null ? C6952b1.getDefaultInstance() : b1Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20920e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        if (this.f20921f != C8277b.CODE_SUCCESS.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f20921f);
        }
        if (this.f20922g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getPhoneNumberProbation());
        }
        if (this.f20923h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getDeletionDate());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasDeletionDate() {
        return this.f20923h != null;
    }

    public boolean hasError() {
        return this.f20920e != null;
    }

    public boolean hasPhoneNumberProbation() {
        return this.f20922g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20920e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
        if (this.f20921f != C8277b.CODE_SUCCESS.getNumber()) {
            codedOutputStream.writeEnum(2, this.f20921f);
        }
        if (this.f20922g != null) {
            codedOutputStream.writeMessage(3, getPhoneNumberProbation());
        }
        if (this.f20923h != null) {
            codedOutputStream.writeMessage(4, getDeletionDate());
        }
    }
}
