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

/* renamed from: co.znly.models.services.f5 */
public final class C8066f5 extends GeneratedMessageLite<C8066f5, C8067a> implements ZenlyProto$UniversitiesCampaignsSignupResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C8066f5 f20452k = new C8066f5();

    /* renamed from: l */
    private static volatile Parser<C8066f5> f20453l;

    /* renamed from: e */
    private boolean f20454e;

    /* renamed from: f */
    private String f20455f;

    /* renamed from: g */
    private int f20456g;

    /* renamed from: h */
    private String f20457h;

    /* renamed from: i */
    private int f20458i;

    /* renamed from: j */
    private int f20459j;

    /* renamed from: co.znly.models.services.f5$a */
    public static final class C8067a extends Builder<C8066f5, C8067a> implements ZenlyProto$UniversitiesCampaignsSignupResponseOrBuilder {
        private C8067a() {
            super(C8066f5.f20452k);
        }

        /* synthetic */ C8067a(C8104i0 i0Var) {
            this();
        }

        public boolean getIsSubscribed() {
            return ((C8066f5) this.instance).getIsSubscribed();
        }

        public int getNbMembers() {
            return ((C8066f5) this.instance).getNbMembers();
        }

        public int getNbRequiredMembers() {
            return ((C8066f5) this.instance).getNbRequiredMembers();
        }

        public String getOrganization() {
            return ((C8066f5) this.instance).getOrganization();
        }

        public ByteString getOrganizationBytes() {
            return ((C8066f5) this.instance).getOrganizationBytes();
        }

        public C7295f getOrganizationType() {
            return ((C8066f5) this.instance).getOrganizationType();
        }

        public int getOrganizationTypeValue() {
            return ((C8066f5) this.instance).getOrganizationTypeValue();
        }

        public String getUniversityUuid() {
            return ((C8066f5) this.instance).getUniversityUuid();
        }

        public ByteString getUniversityUuidBytes() {
            return ((C8066f5) this.instance).getUniversityUuidBytes();
        }
    }

    static {
        f20452k.makeImmutable();
    }

    private C8066f5() {
        String str = "";
        this.f20455f = str;
        this.f20457h = str;
    }

    public static C8067a newBuilder() {
        return (C8067a) f20452k.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8066f5();
            case 2:
                return f20452k;
            case 3:
                return null;
            case 4:
                return new C8067a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8066f5 f5Var = (C8066f5) obj2;
                boolean z2 = this.f20454e;
                boolean z3 = f5Var.f20454e;
                this.f20454e = visitor.visitBoolean(z2, z2, z3, z3);
                this.f20455f = visitor.visitString(!this.f20455f.isEmpty(), this.f20455f, !f5Var.f20455f.isEmpty(), f5Var.f20455f);
                this.f20456g = visitor.visitInt(this.f20456g != 0, this.f20456g, f5Var.f20456g != 0, f5Var.f20456g);
                this.f20457h = visitor.visitString(!this.f20457h.isEmpty(), this.f20457h, !f5Var.f20457h.isEmpty(), f5Var.f20457h);
                this.f20458i = visitor.visitInt(this.f20458i != 0, this.f20458i, f5Var.f20458i != 0, f5Var.f20458i);
                boolean z4 = this.f20459j != 0;
                int i = this.f20459j;
                if (f5Var.f20459j != 0) {
                    z = true;
                }
                this.f20459j = visitor.visitInt(z4, i, z, f5Var.f20459j);
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
                                this.f20454e = codedInputStream.readBool();
                            } else if (readTag == 18) {
                                this.f20455f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 24) {
                                this.f20456g = codedInputStream.readEnum();
                            } else if (readTag == 34) {
                                this.f20457h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 40) {
                                this.f20458i = codedInputStream.readInt32();
                            } else if (readTag == 48) {
                                this.f20459j = codedInputStream.readInt32();
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
                if (f20453l == null) {
                    synchronized (C8066f5.class) {
                        if (f20453l == null) {
                            f20453l = new DefaultInstanceBasedParser(f20452k);
                        }
                    }
                }
                return f20453l;
            default:
                throw new UnsupportedOperationException();
        }
        return f20452k;
    }

    public boolean getIsSubscribed() {
        return this.f20454e;
    }

    public int getNbMembers() {
        return this.f20458i;
    }

    public int getNbRequiredMembers() {
        return this.f20459j;
    }

    public String getOrganization() {
        return this.f20457h;
    }

    public ByteString getOrganizationBytes() {
        return ByteString.copyFromUtf8(this.f20457h);
    }

    public C7295f getOrganizationType() {
        C7295f a = C7295f.m17998a(this.f20456g);
        return a == null ? C7295f.UNRECOGNIZED : a;
    }

    public int getOrganizationTypeValue() {
        return this.f20456g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.f20454e;
        if (z) {
            i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
        }
        if (!this.f20455f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getUniversityUuid());
        }
        if (this.f20456g != C7295f.CAMPAIGN_ORGANIZATION_TYPE_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(3, this.f20456g);
        }
        if (!this.f20457h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getOrganization());
        }
        int i3 = this.f20458i;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(5, i3);
        }
        int i4 = this.f20459j;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(6, i4);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUniversityUuid() {
        return this.f20455f;
    }

    public ByteString getUniversityUuidBytes() {
        return ByteString.copyFromUtf8(this.f20455f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z = this.f20454e;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
        if (!this.f20455f.isEmpty()) {
            codedOutputStream.writeString(2, getUniversityUuid());
        }
        if (this.f20456g != C7295f.CAMPAIGN_ORGANIZATION_TYPE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(3, this.f20456g);
        }
        if (!this.f20457h.isEmpty()) {
            codedOutputStream.writeString(4, getOrganization());
        }
        int i = this.f20458i;
        if (i != 0) {
            codedOutputStream.writeInt32(5, i);
        }
        int i2 = this.f20459j;
        if (i2 != 0) {
            codedOutputStream.writeInt32(6, i2);
        }
    }
}
