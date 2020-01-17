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
import p213co.znly.models.C7295f;

/* renamed from: co.znly.models.services.e5 */
public final class C8050e5 extends GeneratedMessageLite<C8050e5, C8051a> implements ZenlyProto$UniversitiesCampaignsSignupRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8050e5 f20416h = new C8050e5();

    /* renamed from: i */
    private static volatile Parser<C8050e5> f20417i;

    /* renamed from: e */
    private String f20418e;

    /* renamed from: f */
    private int f20419f;

    /* renamed from: g */
    private String f20420g;

    /* renamed from: co.znly.models.services.e5$a */
    public static final class C8051a extends Builder<C8050e5, C8051a> implements ZenlyProto$UniversitiesCampaignsSignupRequestOrBuilder {
        private C8051a() {
            super(C8050e5.f20416h);
        }

        /* synthetic */ C8051a(C8104i0 i0Var) {
            this();
        }

        public String getOrganization() {
            return ((C8050e5) this.instance).getOrganization();
        }

        public ByteString getOrganizationBytes() {
            return ((C8050e5) this.instance).getOrganizationBytes();
        }

        public C7295f getOrganizationType() {
            return ((C8050e5) this.instance).getOrganizationType();
        }

        public int getOrganizationTypeValue() {
            return ((C8050e5) this.instance).getOrganizationTypeValue();
        }

        public String getUniversityUuid() {
            return ((C8050e5) this.instance).getUniversityUuid();
        }

        public ByteString getUniversityUuidBytes() {
            return ((C8050e5) this.instance).getUniversityUuidBytes();
        }
    }

    static {
        f20416h.makeImmutable();
    }

    private C8050e5() {
        String str = "";
        this.f20418e = str;
        this.f20420g = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8050e5();
            case 2:
                return f20416h;
            case 3:
                return null;
            case 4:
                return new C8051a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8050e5 e5Var = (C8050e5) obj2;
                this.f20418e = visitor.visitString(!this.f20418e.isEmpty(), this.f20418e, !e5Var.f20418e.isEmpty(), e5Var.f20418e);
                boolean z2 = this.f20419f != 0;
                int i = this.f20419f;
                if (e5Var.f20419f != 0) {
                    z = true;
                }
                this.f20419f = visitor.visitInt(z2, i, z, e5Var.f20419f);
                this.f20420g = visitor.visitString(!this.f20420g.isEmpty(), this.f20420g, !e5Var.f20420g.isEmpty(), e5Var.f20420g);
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
                                this.f20418e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f20419f = codedInputStream.readEnum();
                            } else if (readTag == 26) {
                                this.f20420g = codedInputStream.readStringRequireUtf8();
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
                if (f20417i == null) {
                    synchronized (C8050e5.class) {
                        if (f20417i == null) {
                            f20417i = new DefaultInstanceBasedParser(f20416h);
                        }
                    }
                }
                return f20417i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20416h;
    }

    public String getOrganization() {
        return this.f20420g;
    }

    public ByteString getOrganizationBytes() {
        return ByteString.copyFromUtf8(this.f20420g);
    }

    public C7295f getOrganizationType() {
        C7295f a = C7295f.m17998a(this.f20419f);
        return a == null ? C7295f.UNRECOGNIZED : a;
    }

    public int getOrganizationTypeValue() {
        return this.f20419f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20418e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUniversityUuid());
        }
        if (this.f20419f != C7295f.CAMPAIGN_ORGANIZATION_TYPE_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f20419f);
        }
        if (!this.f20420g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getOrganization());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUniversityUuid() {
        return this.f20418e;
    }

    public ByteString getUniversityUuidBytes() {
        return ByteString.copyFromUtf8(this.f20418e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20418e.isEmpty()) {
            codedOutputStream.writeString(1, getUniversityUuid());
        }
        if (this.f20419f != C7295f.CAMPAIGN_ORGANIZATION_TYPE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(2, this.f20419f);
        }
        if (!this.f20420g.isEmpty()) {
            codedOutputStream.writeString(3, getOrganization());
        }
    }
}
