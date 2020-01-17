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
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C7471t;
import p213co.znly.models.C7471t.C7472a;

/* renamed from: co.znly.models.services.ZenlyProto$SessionCreateRequest */
public final class ZenlyProto$SessionCreateRequest extends GeneratedMessageLite<ZenlyProto$SessionCreateRequest, C7958a> implements ZenlyProto$SessionCreateRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final ZenlyProto$SessionCreateRequest f20187k = new ZenlyProto$SessionCreateRequest();

    /* renamed from: l */
    private static volatile Parser<ZenlyProto$SessionCreateRequest> f20188l;

    /* renamed from: e */
    private String f20189e;

    /* renamed from: f */
    private String f20190f;

    /* renamed from: g */
    private C7471t f20191g;

    /* renamed from: h */
    private String f20192h;

    /* renamed from: i */
    private C7959b f20193i;

    /* renamed from: j */
    private boolean f20194j;

    /* renamed from: co.znly.models.services.ZenlyProto$SessionCreateRequest$CarrierInformationsOrBuilder */
    public interface CarrierInformationsOrBuilder extends MessageLiteOrBuilder {
        String getNetworkCountryIso();

        ByteString getNetworkCountryIsoBytes();

        String getNetworkOperatorCode();

        ByteString getNetworkOperatorCodeBytes();

        String getNetworkOperatorName();

        ByteString getNetworkOperatorNameBytes();

        String getSimCountryIso();

        ByteString getSimCountryIsoBytes();

        String getSimOperatorCode();

        ByteString getSimOperatorCodeBytes();

        String getSimOperatorName();

        ByteString getSimOperatorNameBytes();
    }

    /* renamed from: co.znly.models.services.ZenlyProto$SessionCreateRequest$a */
    public static final class C7958a extends Builder<ZenlyProto$SessionCreateRequest, C7958a> implements ZenlyProto$SessionCreateRequestOrBuilder {
        /* synthetic */ C7958a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C7958a mo21657a(String str) {
            copyOnWrite();
            ((ZenlyProto$SessionCreateRequest) this.instance).m19009a(str);
            return this;
        }

        public C7959b getCarrierInformations() {
            return ((ZenlyProto$SessionCreateRequest) this.instance).getCarrierInformations();
        }

        public C7471t getDevice() {
            return ((ZenlyProto$SessionCreateRequest) this.instance).getDevice();
        }

        public String getDeviceOsUuid() {
            return ((ZenlyProto$SessionCreateRequest) this.instance).getDeviceOsUuid();
        }

        public ByteString getDeviceOsUuidBytes() {
            return ((ZenlyProto$SessionCreateRequest) this.instance).getDeviceOsUuidBytes();
        }

        public boolean getDomainErrorInResponse() {
            return ((ZenlyProto$SessionCreateRequest) this.instance).getDomainErrorInResponse();
        }

        public String getPassword() {
            return ((ZenlyProto$SessionCreateRequest) this.instance).getPassword();
        }

        public ByteString getPasswordBytes() {
            return ((ZenlyProto$SessionCreateRequest) this.instance).getPasswordBytes();
        }

        public String getPhoneNumber() {
            return ((ZenlyProto$SessionCreateRequest) this.instance).getPhoneNumber();
        }

        public ByteString getPhoneNumberBytes() {
            return ((ZenlyProto$SessionCreateRequest) this.instance).getPhoneNumberBytes();
        }

        public boolean hasCarrierInformations() {
            return ((ZenlyProto$SessionCreateRequest) this.instance).hasCarrierInformations();
        }

        public boolean hasDevice() {
            return ((ZenlyProto$SessionCreateRequest) this.instance).hasDevice();
        }

        private C7958a() {
            super(ZenlyProto$SessionCreateRequest.f20187k);
        }
    }

    /* renamed from: co.znly.models.services.ZenlyProto$SessionCreateRequest$b */
    public static final class C7959b extends GeneratedMessageLite<C7959b, C7960a> implements CarrierInformationsOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public static final C7959b f20195k = new C7959b();

        /* renamed from: l */
        private static volatile Parser<C7959b> f20196l;

        /* renamed from: e */
        private String f20197e;

        /* renamed from: f */
        private String f20198f;

        /* renamed from: g */
        private String f20199g;

        /* renamed from: h */
        private String f20200h;

        /* renamed from: i */
        private String f20201i;

        /* renamed from: j */
        private String f20202j;

        /* renamed from: co.znly.models.services.ZenlyProto$SessionCreateRequest$b$a */
        public static final class C7960a extends Builder<C7959b, C7960a> implements CarrierInformationsOrBuilder {
            /* synthetic */ C7960a(C8104i0 i0Var) {
                this();
            }

            public String getNetworkCountryIso() {
                return ((C7959b) this.instance).getNetworkCountryIso();
            }

            public ByteString getNetworkCountryIsoBytes() {
                return ((C7959b) this.instance).getNetworkCountryIsoBytes();
            }

            public String getNetworkOperatorCode() {
                return ((C7959b) this.instance).getNetworkOperatorCode();
            }

            public ByteString getNetworkOperatorCodeBytes() {
                return ((C7959b) this.instance).getNetworkOperatorCodeBytes();
            }

            public String getNetworkOperatorName() {
                return ((C7959b) this.instance).getNetworkOperatorName();
            }

            public ByteString getNetworkOperatorNameBytes() {
                return ((C7959b) this.instance).getNetworkOperatorNameBytes();
            }

            public String getSimCountryIso() {
                return ((C7959b) this.instance).getSimCountryIso();
            }

            public ByteString getSimCountryIsoBytes() {
                return ((C7959b) this.instance).getSimCountryIsoBytes();
            }

            public String getSimOperatorCode() {
                return ((C7959b) this.instance).getSimOperatorCode();
            }

            public ByteString getSimOperatorCodeBytes() {
                return ((C7959b) this.instance).getSimOperatorCodeBytes();
            }

            public String getSimOperatorName() {
                return ((C7959b) this.instance).getSimOperatorName();
            }

            public ByteString getSimOperatorNameBytes() {
                return ((C7959b) this.instance).getSimOperatorNameBytes();
            }

            private C7960a() {
                super(C7959b.f20195k);
            }
        }

        static {
            f20195k.makeImmutable();
        }

        private C7959b() {
            String str = "";
            this.f20197e = str;
            this.f20198f = str;
            this.f20199g = str;
            this.f20200h = str;
            this.f20201i = str;
            this.f20202j = str;
        }

        public static C7959b getDefaultInstance() {
            return f20195k;
        }

        public static Parser<C7959b> parser() {
            return f20195k.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7959b();
                case 2:
                    return f20195k;
                case 3:
                    return null;
                case 4:
                    return new C7960a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7959b bVar = (C7959b) obj2;
                    this.f20197e = visitor.visitString(!this.f20197e.isEmpty(), this.f20197e, !bVar.f20197e.isEmpty(), bVar.f20197e);
                    this.f20198f = visitor.visitString(!this.f20198f.isEmpty(), this.f20198f, !bVar.f20198f.isEmpty(), bVar.f20198f);
                    this.f20199g = visitor.visitString(!this.f20199g.isEmpty(), this.f20199g, !bVar.f20199g.isEmpty(), bVar.f20199g);
                    this.f20200h = visitor.visitString(!this.f20200h.isEmpty(), this.f20200h, !bVar.f20200h.isEmpty(), bVar.f20200h);
                    this.f20201i = visitor.visitString(!this.f20201i.isEmpty(), this.f20201i, !bVar.f20201i.isEmpty(), bVar.f20201i);
                    this.f20202j = visitor.visitString(!this.f20202j.isEmpty(), this.f20202j, true ^ bVar.f20202j.isEmpty(), bVar.f20202j);
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
                                    this.f20197e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.f20198f = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.f20199g = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    this.f20200h = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 42) {
                                    this.f20201i = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 50) {
                                    this.f20202j = codedInputStream.readStringRequireUtf8();
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
                    if (f20196l == null) {
                        synchronized (C7959b.class) {
                            if (f20196l == null) {
                                f20196l = new DefaultInstanceBasedParser(f20195k);
                            }
                        }
                    }
                    return f20196l;
                default:
                    throw new UnsupportedOperationException();
            }
            return f20195k;
        }

        public String getNetworkCountryIso() {
            return this.f20199g;
        }

        public ByteString getNetworkCountryIsoBytes() {
            return ByteString.copyFromUtf8(this.f20199g);
        }

        public String getNetworkOperatorCode() {
            return this.f20197e;
        }

        public ByteString getNetworkOperatorCodeBytes() {
            return ByteString.copyFromUtf8(this.f20197e);
        }

        public String getNetworkOperatorName() {
            return this.f20198f;
        }

        public ByteString getNetworkOperatorNameBytes() {
            return ByteString.copyFromUtf8(this.f20198f);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f20197e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getNetworkOperatorCode());
            }
            if (!this.f20198f.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(2, getNetworkOperatorName());
            }
            if (!this.f20199g.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(3, getNetworkCountryIso());
            }
            if (!this.f20200h.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(4, getSimOperatorCode());
            }
            if (!this.f20201i.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(5, getSimOperatorName());
            }
            if (!this.f20202j.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(6, getSimCountryIso());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String getSimCountryIso() {
            return this.f20202j;
        }

        public ByteString getSimCountryIsoBytes() {
            return ByteString.copyFromUtf8(this.f20202j);
        }

        public String getSimOperatorCode() {
            return this.f20200h;
        }

        public ByteString getSimOperatorCodeBytes() {
            return ByteString.copyFromUtf8(this.f20200h);
        }

        public String getSimOperatorName() {
            return this.f20201i;
        }

        public ByteString getSimOperatorNameBytes() {
            return ByteString.copyFromUtf8(this.f20201i);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f20197e.isEmpty()) {
                codedOutputStream.writeString(1, getNetworkOperatorCode());
            }
            if (!this.f20198f.isEmpty()) {
                codedOutputStream.writeString(2, getNetworkOperatorName());
            }
            if (!this.f20199g.isEmpty()) {
                codedOutputStream.writeString(3, getNetworkCountryIso());
            }
            if (!this.f20200h.isEmpty()) {
                codedOutputStream.writeString(4, getSimOperatorCode());
            }
            if (!this.f20201i.isEmpty()) {
                codedOutputStream.writeString(5, getSimOperatorName());
            }
            if (!this.f20202j.isEmpty()) {
                codedOutputStream.writeString(6, getSimCountryIso());
            }
        }
    }

    static {
        f20187k.makeImmutable();
    }

    private ZenlyProto$SessionCreateRequest() {
        String str = "";
        this.f20189e = str;
        this.f20190f = str;
        this.f20192h = str;
    }

    public static C7958a newBuilder() {
        return (C7958a) f20187k.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new ZenlyProto$SessionCreateRequest();
            case 2:
                return f20187k;
            case 3:
                return null;
            case 4:
                return new C7958a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                ZenlyProto$SessionCreateRequest zenlyProto$SessionCreateRequest = (ZenlyProto$SessionCreateRequest) obj2;
                this.f20189e = visitor.visitString(!this.f20189e.isEmpty(), this.f20189e, !zenlyProto$SessionCreateRequest.f20189e.isEmpty(), zenlyProto$SessionCreateRequest.f20189e);
                this.f20190f = visitor.visitString(!this.f20190f.isEmpty(), this.f20190f, !zenlyProto$SessionCreateRequest.f20190f.isEmpty(), zenlyProto$SessionCreateRequest.f20190f);
                this.f20191g = (C7471t) visitor.visitMessage(this.f20191g, zenlyProto$SessionCreateRequest.f20191g);
                this.f20192h = visitor.visitString(!this.f20192h.isEmpty(), this.f20192h, true ^ zenlyProto$SessionCreateRequest.f20192h.isEmpty(), zenlyProto$SessionCreateRequest.f20192h);
                this.f20193i = (C7959b) visitor.visitMessage(this.f20193i, zenlyProto$SessionCreateRequest.f20193i);
                boolean z = this.f20194j;
                boolean z2 = zenlyProto$SessionCreateRequest.f20194j;
                this.f20194j = visitor.visitBoolean(z, z, z2, z2);
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
                            if (readTag == 10) {
                                this.f20189e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f20190f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                Builder builder = this.f20191g != null ? (C7472a) this.f20191g.toBuilder() : null;
                                this.f20191g = (C7471t) codedInputStream.readMessage(C7471t.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20191g);
                                    this.f20191g = (C7471t) builder.buildPartial();
                                }
                            } else if (readTag == 34) {
                                this.f20192h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 50) {
                                Builder builder2 = this.f20193i != null ? (C7960a) this.f20193i.toBuilder() : null;
                                this.f20193i = (C7959b) codedInputStream.readMessage(C7959b.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20193i);
                                    this.f20193i = (C7959b) builder2.buildPartial();
                                }
                            } else if (readTag == 56) {
                                this.f20194j = codedInputStream.readBool();
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
                if (f20188l == null) {
                    synchronized (ZenlyProto$SessionCreateRequest.class) {
                        if (f20188l == null) {
                            f20188l = new DefaultInstanceBasedParser(f20187k);
                        }
                    }
                }
                return f20188l;
            default:
                throw new UnsupportedOperationException();
        }
        return f20187k;
    }

    public C7959b getCarrierInformations() {
        C7959b bVar = this.f20193i;
        return bVar == null ? C7959b.getDefaultInstance() : bVar;
    }

    public C7471t getDevice() {
        C7471t tVar = this.f20191g;
        return tVar == null ? C7471t.getDefaultInstance() : tVar;
    }

    public String getDeviceOsUuid() {
        return this.f20192h;
    }

    public ByteString getDeviceOsUuidBytes() {
        return ByteString.copyFromUtf8(this.f20192h);
    }

    public boolean getDomainErrorInResponse() {
        return this.f20194j;
    }

    public String getPassword() {
        return this.f20190f;
    }

    public ByteString getPasswordBytes() {
        return ByteString.copyFromUtf8(this.f20190f);
    }

    public String getPhoneNumber() {
        return this.f20189e;
    }

    public ByteString getPhoneNumberBytes() {
        return ByteString.copyFromUtf8(this.f20189e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20189e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getPhoneNumber());
        }
        if (!this.f20190f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getPassword());
        }
        if (this.f20191g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getDevice());
        }
        if (!this.f20192h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getDeviceOsUuid());
        }
        if (this.f20193i != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getCarrierInformations());
        }
        boolean z = this.f20194j;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(7, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasCarrierInformations() {
        return this.f20193i != null;
    }

    public boolean hasDevice() {
        return this.f20191g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20189e.isEmpty()) {
            codedOutputStream.writeString(1, getPhoneNumber());
        }
        if (!this.f20190f.isEmpty()) {
            codedOutputStream.writeString(2, getPassword());
        }
        if (this.f20191g != null) {
            codedOutputStream.writeMessage(3, getDevice());
        }
        if (!this.f20192h.isEmpty()) {
            codedOutputStream.writeString(4, getDeviceOsUuid());
        }
        if (this.f20193i != null) {
            codedOutputStream.writeMessage(6, getCarrierInformations());
        }
        boolean z = this.f20194j;
        if (z) {
            codedOutputStream.writeBool(7, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19009a(String str) {
        if (str != null) {
            this.f20189e = str;
            return;
        }
        throw new NullPointerException();
    }
}
