package p213co.znly.models.services;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7295f;

/* renamed from: co.znly.models.services.h5 */
public final class C8098h5 extends GeneratedMessageLite<C8098h5, C8099a> implements ZenlyProto$UniversitiesCampaignsSubscriptionResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final C8098h5 f20516v = new C8098h5();

    /* renamed from: w */
    private static volatile Parser<C8098h5> f20517w;

    /* renamed from: e */
    private int f20518e;

    /* renamed from: f */
    private boolean f20519f;

    /* renamed from: g */
    private String f20520g;

    /* renamed from: h */
    private int f20521h;

    /* renamed from: i */
    private String f20522i;

    /* renamed from: j */
    private int f20523j;

    /* renamed from: k */
    private int f20524k;

    /* renamed from: l */
    private Timestamp f20525l;

    /* renamed from: m */
    private Timestamp f20526m;

    /* renamed from: n */
    private Timestamp f20527n;

    /* renamed from: o */
    private String f20528o;

    /* renamed from: p */
    private String f20529p;

    /* renamed from: q */
    private ProtobufList<String> f20530q = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: r */
    private ProtobufList<String> f20531r = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: s */
    private double f20532s;

    /* renamed from: t */
    private double f20533t;

    /* renamed from: u */
    private Timestamp f20534u;

    /* renamed from: co.znly.models.services.h5$a */
    public static final class C8099a extends Builder<C8098h5, C8099a> implements ZenlyProto$UniversitiesCampaignsSubscriptionResponseOrBuilder {
        private C8099a() {
            super(C8098h5.f20516v);
        }

        /* synthetic */ C8099a(C8104i0 i0Var) {
            this();
        }

        public String getBestFraternity() {
            return ((C8098h5) this.instance).getBestFraternity();
        }

        public ByteString getBestFraternityBytes() {
            return ((C8098h5) this.instance).getBestFraternityBytes();
        }

        public String getBestSorority() {
            return ((C8098h5) this.instance).getBestSorority();
        }

        public ByteString getBestSororityBytes() {
            return ((C8098h5) this.instance).getBestSororityBytes();
        }

        public Timestamp getChallengeEnd() {
            return ((C8098h5) this.instance).getChallengeEnd();
        }

        public Timestamp getChallengeFinish() {
            return ((C8098h5) this.instance).getChallengeFinish();
        }

        public Timestamp getChallengeLaunch() {
            return ((C8098h5) this.instance).getChallengeLaunch();
        }

        public Timestamp getChallengeStart() {
            return ((C8098h5) this.instance).getChallengeStart();
        }

        public String getFraternities(int i) {
            return ((C8098h5) this.instance).getFraternities(i);
        }

        public ByteString getFraternitiesBytes(int i) {
            return ((C8098h5) this.instance).getFraternitiesBytes(i);
        }

        public int getFraternitiesCount() {
            return ((C8098h5) this.instance).getFraternitiesCount();
        }

        public List<String> getFraternitiesList() {
            return Collections.unmodifiableList(((C8098h5) this.instance).getFraternitiesList());
        }

        public boolean getIsSubscribed() {
            return ((C8098h5) this.instance).getIsSubscribed();
        }

        public int getNbMembers() {
            return ((C8098h5) this.instance).getNbMembers();
        }

        public int getNbRequiredMembers() {
            return ((C8098h5) this.instance).getNbRequiredMembers();
        }

        public String getOrganization() {
            return ((C8098h5) this.instance).getOrganization();
        }

        public ByteString getOrganizationBytes() {
            return ((C8098h5) this.instance).getOrganizationBytes();
        }

        public C7295f getOrganizationType() {
            return ((C8098h5) this.instance).getOrganizationType();
        }

        public int getOrganizationTypeValue() {
            return ((C8098h5) this.instance).getOrganizationTypeValue();
        }

        public String getSororities(int i) {
            return ((C8098h5) this.instance).getSororities(i);
        }

        public ByteString getSororitiesBytes(int i) {
            return ((C8098h5) this.instance).getSororitiesBytes(i);
        }

        public int getSororitiesCount() {
            return ((C8098h5) this.instance).getSororitiesCount();
        }

        public List<String> getSororitiesList() {
            return Collections.unmodifiableList(((C8098h5) this.instance).getSororitiesList());
        }

        public double getUniversityLatitude() {
            return ((C8098h5) this.instance).getUniversityLatitude();
        }

        public double getUniversityLongitude() {
            return ((C8098h5) this.instance).getUniversityLongitude();
        }

        public String getUniversityUuid() {
            return ((C8098h5) this.instance).getUniversityUuid();
        }

        public ByteString getUniversityUuidBytes() {
            return ((C8098h5) this.instance).getUniversityUuidBytes();
        }

        public boolean hasChallengeEnd() {
            return ((C8098h5) this.instance).hasChallengeEnd();
        }

        public boolean hasChallengeFinish() {
            return ((C8098h5) this.instance).hasChallengeFinish();
        }

        public boolean hasChallengeLaunch() {
            return ((C8098h5) this.instance).hasChallengeLaunch();
        }

        public boolean hasChallengeStart() {
            return ((C8098h5) this.instance).hasChallengeStart();
        }
    }

    static {
        f20516v.makeImmutable();
    }

    private C8098h5() {
        String str = "";
        this.f20520g = str;
        this.f20522i = str;
        this.f20528o = str;
        this.f20529p = str;
    }

    public static C8099a newBuilder() {
        return (C8099a) f20516v.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        String readStringRequireUtf8;
        ProtobufList<String> protobufList;
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8098h5();
            case 2:
                return f20516v;
            case 3:
                this.f20530q.makeImmutable();
                this.f20531r.makeImmutable();
                return null;
            case 4:
                return new C8099a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8098h5 h5Var = (C8098h5) obj2;
                boolean z2 = this.f20519f;
                boolean z3 = h5Var.f20519f;
                this.f20519f = visitor.visitBoolean(z2, z2, z3, z3);
                this.f20520g = visitor.visitString(!this.f20520g.isEmpty(), this.f20520g, !h5Var.f20520g.isEmpty(), h5Var.f20520g);
                this.f20521h = visitor.visitInt(this.f20521h != 0, this.f20521h, h5Var.f20521h != 0, h5Var.f20521h);
                this.f20522i = visitor.visitString(!this.f20522i.isEmpty(), this.f20522i, !h5Var.f20522i.isEmpty(), h5Var.f20522i);
                this.f20523j = visitor.visitInt(this.f20523j != 0, this.f20523j, h5Var.f20523j != 0, h5Var.f20523j);
                this.f20524k = visitor.visitInt(this.f20524k != 0, this.f20524k, h5Var.f20524k != 0, h5Var.f20524k);
                this.f20525l = (Timestamp) visitor.visitMessage(this.f20525l, h5Var.f20525l);
                this.f20526m = (Timestamp) visitor.visitMessage(this.f20526m, h5Var.f20526m);
                this.f20527n = (Timestamp) visitor.visitMessage(this.f20527n, h5Var.f20527n);
                this.f20528o = visitor.visitString(!this.f20528o.isEmpty(), this.f20528o, !h5Var.f20528o.isEmpty(), h5Var.f20528o);
                this.f20529p = visitor.visitString(!this.f20529p.isEmpty(), this.f20529p, !h5Var.f20529p.isEmpty(), h5Var.f20529p);
                this.f20530q = visitor.visitList(this.f20530q, h5Var.f20530q);
                this.f20531r = visitor.visitList(this.f20531r, h5Var.f20531r);
                this.f20532s = visitor.visitDouble(this.f20532s != 0.0d, this.f20532s, h5Var.f20532s != 0.0d, h5Var.f20532s);
                this.f20533t = visitor.visitDouble(this.f20533t != 0.0d, this.f20533t, h5Var.f20533t != 0.0d, h5Var.f20533t);
                this.f20534u = (Timestamp) visitor.visitMessage(this.f20534u, h5Var.f20534u);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20518e |= h5Var.f20518e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                continue;
                            case 8:
                                this.f20519f = codedInputStream.readBool();
                                continue;
                            case 18:
                                this.f20520g = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 24:
                                this.f20521h = codedInputStream.readEnum();
                                continue;
                            case 34:
                                this.f20522i = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 40:
                                this.f20523j = codedInputStream.readInt32();
                                continue;
                            case 48:
                                this.f20524k = codedInputStream.readInt32();
                                continue;
                            case 58:
                                Builder builder = this.f20525l != null ? (Timestamp.Builder) this.f20525l.toBuilder() : null;
                                this.f20525l = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20525l);
                                    this.f20525l = (Timestamp) builder.buildPartial();
                                    break;
                                } else {
                                    continue;
                                }
                            case 66:
                                Builder builder2 = this.f20526m != null ? (Timestamp.Builder) this.f20526m.toBuilder() : null;
                                this.f20526m = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20526m);
                                    this.f20526m = (Timestamp) builder2.buildPartial();
                                    break;
                                } else {
                                    continue;
                                }
                            case 74:
                                Builder builder3 = this.f20527n != null ? (Timestamp.Builder) this.f20527n.toBuilder() : null;
                                this.f20527n = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f20527n);
                                    this.f20527n = (Timestamp) builder3.buildPartial();
                                    break;
                                } else {
                                    continue;
                                }
                            case 82:
                                this.f20528o = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 90:
                                this.f20529p = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 98:
                                readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f20530q.isModifiable()) {
                                    this.f20530q = GeneratedMessageLite.mutableCopy(this.f20530q);
                                }
                                protobufList = this.f20530q;
                                break;
                            case 106:
                                readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f20531r.isModifiable()) {
                                    this.f20531r = GeneratedMessageLite.mutableCopy(this.f20531r);
                                }
                                protobufList = this.f20531r;
                                break;
                            case 113:
                                this.f20532s = codedInputStream.readDouble();
                                continue;
                            case 121:
                                this.f20533t = codedInputStream.readDouble();
                                continue;
                            case 130:
                                Builder builder4 = this.f20534u != null ? (Timestamp.Builder) this.f20534u.toBuilder() : null;
                                this.f20534u = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder4 != null) {
                                    builder4.mergeFrom(this.f20534u);
                                    this.f20534u = (Timestamp) builder4.buildPartial();
                                    break;
                                } else {
                                    continue;
                                }
                            default:
                                if (codedInputStream.skipField(readTag)) {
                                    continue;
                                }
                                z = true;
                                continue;
                        }
                        protobufList.add(readStringRequireUtf8);
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
                if (f20517w == null) {
                    synchronized (C8098h5.class) {
                        if (f20517w == null) {
                            f20517w = new DefaultInstanceBasedParser(f20516v);
                        }
                    }
                }
                return f20517w;
            default:
                throw new UnsupportedOperationException();
        }
        return f20516v;
    }

    public String getBestFraternity() {
        return this.f20528o;
    }

    public ByteString getBestFraternityBytes() {
        return ByteString.copyFromUtf8(this.f20528o);
    }

    public String getBestSorority() {
        return this.f20529p;
    }

    public ByteString getBestSororityBytes() {
        return ByteString.copyFromUtf8(this.f20529p);
    }

    public Timestamp getChallengeEnd() {
        Timestamp timestamp = this.f20527n;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getChallengeFinish() {
        Timestamp timestamp = this.f20534u;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getChallengeLaunch() {
        Timestamp timestamp = this.f20525l;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getChallengeStart() {
        Timestamp timestamp = this.f20526m;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getFraternities(int i) {
        return (String) this.f20530q.get(i);
    }

    public ByteString getFraternitiesBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f20530q.get(i));
    }

    public int getFraternitiesCount() {
        return this.f20530q.size();
    }

    public List<String> getFraternitiesList() {
        return this.f20530q;
    }

    public boolean getIsSubscribed() {
        return this.f20519f;
    }

    public int getNbMembers() {
        return this.f20523j;
    }

    public int getNbRequiredMembers() {
        return this.f20524k;
    }

    public String getOrganization() {
        return this.f20522i;
    }

    public ByteString getOrganizationBytes() {
        return ByteString.copyFromUtf8(this.f20522i);
    }

    public C7295f getOrganizationType() {
        C7295f a = C7295f.m17998a(this.f20521h);
        return a == null ? C7295f.UNRECOGNIZED : a;
    }

    public int getOrganizationTypeValue() {
        return this.f20521h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        boolean z = this.f20519f;
        int computeBoolSize = z ? CodedOutputStream.computeBoolSize(1, z) + 0 : 0;
        if (!this.f20520g.isEmpty()) {
            computeBoolSize += CodedOutputStream.computeStringSize(2, getUniversityUuid());
        }
        if (this.f20521h != C7295f.CAMPAIGN_ORGANIZATION_TYPE_UNKNOWN.getNumber()) {
            computeBoolSize += CodedOutputStream.computeEnumSize(3, this.f20521h);
        }
        if (!this.f20522i.isEmpty()) {
            computeBoolSize += CodedOutputStream.computeStringSize(4, getOrganization());
        }
        int i2 = this.f20523j;
        if (i2 != 0) {
            computeBoolSize += CodedOutputStream.computeInt32Size(5, i2);
        }
        int i3 = this.f20524k;
        if (i3 != 0) {
            computeBoolSize += CodedOutputStream.computeInt32Size(6, i3);
        }
        if (this.f20525l != null) {
            computeBoolSize += CodedOutputStream.computeMessageSize(7, getChallengeLaunch());
        }
        if (this.f20526m != null) {
            computeBoolSize += CodedOutputStream.computeMessageSize(8, getChallengeStart());
        }
        if (this.f20527n != null) {
            computeBoolSize += CodedOutputStream.computeMessageSize(9, getChallengeEnd());
        }
        if (!this.f20528o.isEmpty()) {
            computeBoolSize += CodedOutputStream.computeStringSize(10, getBestFraternity());
        }
        if (!this.f20529p.isEmpty()) {
            computeBoolSize += CodedOutputStream.computeStringSize(11, getBestSorority());
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f20530q.size(); i5++) {
            i4 += CodedOutputStream.computeStringSizeNoTag((String) this.f20530q.get(i5));
        }
        int size = computeBoolSize + i4 + (getFraternitiesList().size() * 1);
        int i6 = 0;
        for (int i7 = 0; i7 < this.f20531r.size(); i7++) {
            i6 += CodedOutputStream.computeStringSizeNoTag((String) this.f20531r.get(i7));
        }
        int size2 = size + i6 + (getSororitiesList().size() * 1);
        double d = this.f20532s;
        if (d != 0.0d) {
            size2 += CodedOutputStream.computeDoubleSize(14, d);
        }
        double d2 = this.f20533t;
        if (d2 != 0.0d) {
            size2 += CodedOutputStream.computeDoubleSize(15, d2);
        }
        if (this.f20534u != null) {
            size2 += CodedOutputStream.computeMessageSize(16, getChallengeFinish());
        }
        this.memoizedSerializedSize = size2;
        return size2;
    }

    public String getSororities(int i) {
        return (String) this.f20531r.get(i);
    }

    public ByteString getSororitiesBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f20531r.get(i));
    }

    public int getSororitiesCount() {
        return this.f20531r.size();
    }

    public List<String> getSororitiesList() {
        return this.f20531r;
    }

    public double getUniversityLatitude() {
        return this.f20532s;
    }

    public double getUniversityLongitude() {
        return this.f20533t;
    }

    public String getUniversityUuid() {
        return this.f20520g;
    }

    public ByteString getUniversityUuidBytes() {
        return ByteString.copyFromUtf8(this.f20520g);
    }

    public boolean hasChallengeEnd() {
        return this.f20527n != null;
    }

    public boolean hasChallengeFinish() {
        return this.f20534u != null;
    }

    public boolean hasChallengeLaunch() {
        return this.f20525l != null;
    }

    public boolean hasChallengeStart() {
        return this.f20526m != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z = this.f20519f;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
        if (!this.f20520g.isEmpty()) {
            codedOutputStream.writeString(2, getUniversityUuid());
        }
        if (this.f20521h != C7295f.CAMPAIGN_ORGANIZATION_TYPE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(3, this.f20521h);
        }
        if (!this.f20522i.isEmpty()) {
            codedOutputStream.writeString(4, getOrganization());
        }
        int i = this.f20523j;
        if (i != 0) {
            codedOutputStream.writeInt32(5, i);
        }
        int i2 = this.f20524k;
        if (i2 != 0) {
            codedOutputStream.writeInt32(6, i2);
        }
        if (this.f20525l != null) {
            codedOutputStream.writeMessage(7, getChallengeLaunch());
        }
        if (this.f20526m != null) {
            codedOutputStream.writeMessage(8, getChallengeStart());
        }
        if (this.f20527n != null) {
            codedOutputStream.writeMessage(9, getChallengeEnd());
        }
        if (!this.f20528o.isEmpty()) {
            codedOutputStream.writeString(10, getBestFraternity());
        }
        if (!this.f20529p.isEmpty()) {
            codedOutputStream.writeString(11, getBestSorority());
        }
        for (int i3 = 0; i3 < this.f20530q.size(); i3++) {
            codedOutputStream.writeString(12, (String) this.f20530q.get(i3));
        }
        for (int i4 = 0; i4 < this.f20531r.size(); i4++) {
            codedOutputStream.writeString(13, (String) this.f20531r.get(i4));
        }
        double d = this.f20532s;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(14, d);
        }
        double d2 = this.f20533t;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(15, d2);
        }
        if (this.f20534u != null) {
            codedOutputStream.writeMessage(16, getChallengeFinish());
        }
    }
}
