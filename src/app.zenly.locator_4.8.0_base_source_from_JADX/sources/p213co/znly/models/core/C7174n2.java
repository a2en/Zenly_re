package p213co.znly.models.core;

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
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7402n2;
import p213co.znly.models.C7402n2.C7403a;
import p213co.znly.models.core.C7123i2.C7124a;
import p213co.znly.models.verify.C8454e;
import p213co.znly.models.verify.VerifyInfoProto$VerifyInfo;
import p213co.znly.models.verify.VerifyInfoProto$VerifyInfo.C8444c;

/* renamed from: co.znly.models.core.n2 */
public final class C7174n2 extends GeneratedMessageLite<C7174n2, C7175a> implements TypesProto$SessionCacheOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final C7174n2 f17763r = new C7174n2();

    /* renamed from: s */
    private static volatile Parser<C7174n2> f17764s;

    /* renamed from: e */
    private boolean f17765e;

    /* renamed from: f */
    private String f17766f;

    /* renamed from: g */
    private String f17767g;

    /* renamed from: h */
    private C7123i2 f17768h;

    /* renamed from: i */
    private VerifyInfoProto$VerifyInfo f17769i;

    /* renamed from: j */
    private int f17770j;

    /* renamed from: k */
    private int f17771k;

    /* renamed from: l */
    private C7402n2 f17772l;

    /* renamed from: m */
    private int f17773m;

    /* renamed from: n */
    private Timestamp f17774n;

    /* renamed from: o */
    private boolean f17775o;

    /* renamed from: p */
    private Timestamp f17776p;

    /* renamed from: q */
    private boolean f17777q;

    /* renamed from: co.znly.models.core.n2$a */
    public static final class C7175a extends Builder<C7174n2, C7175a> implements TypesProto$SessionCacheOrBuilder {
        /* synthetic */ C7175a(C7253x1 x1Var) {
            this();
        }

        /* renamed from: a */
        public C7175a mo19169a(boolean z) {
            copyOnWrite();
            ((C7174n2) this.instance).m17878a(z);
            return this;
        }

        /* renamed from: b */
        public C7175a mo19170b(int i) {
            copyOnWrite();
            ((C7174n2) this.instance).m17879b(i);
            return this;
        }

        public Timestamp getBirthdate() {
            return ((C7174n2) this.instance).getBirthdate();
        }

        public int getChallengeSize() {
            return ((C7174n2) this.instance).getChallengeSize();
        }

        public C8454e getChallengeType() {
            return ((C7174n2) this.instance).getChallengeType();
        }

        public int getChallengeTypeValue() {
            return ((C7174n2) this.instance).getChallengeTypeValue();
        }

        public int getContactPickerDone() {
            return ((C7174n2) this.instance).getContactPickerDone();
        }

        public VerifyInfoProto$VerifyInfo getEventInfo() {
            return ((C7174n2) this.instance).getEventInfo();
        }

        public boolean getForcedOnboardingEnabled() {
            return ((C7174n2) this.instance).getForcedOnboardingEnabled();
        }

        public boolean getIntroSeen() {
            return ((C7174n2) this.instance).getIntroSeen();
        }

        public Timestamp getLastPushAuthAskedTime() {
            return ((C7174n2) this.instance).getLastPushAuthAskedTime();
        }

        public String getName() {
            return ((C7174n2) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((C7174n2) this.instance).getNameBytes();
        }

        public boolean getOnboardingNotCompleted() {
            return ((C7174n2) this.instance).getOnboardingNotCompleted();
        }

        public String getPhoneNumber() {
            return ((C7174n2) this.instance).getPhoneNumber();
        }

        public ByteString getPhoneNumberBytes() {
            return ((C7174n2) this.instance).getPhoneNumberBytes();
        }

        public C7123i2 getPhoneRegion() {
            return ((C7174n2) this.instance).getPhoneRegion();
        }

        public C7402n2 getSession() {
            return ((C7174n2) this.instance).getSession();
        }

        public boolean hasBirthdate() {
            return ((C7174n2) this.instance).hasBirthdate();
        }

        public boolean hasEventInfo() {
            return ((C7174n2) this.instance).hasEventInfo();
        }

        public boolean hasLastPushAuthAskedTime() {
            return ((C7174n2) this.instance).hasLastPushAuthAskedTime();
        }

        public boolean hasPhoneRegion() {
            return ((C7174n2) this.instance).hasPhoneRegion();
        }

        public boolean hasSession() {
            return ((C7174n2) this.instance).hasSession();
        }

        public C7175a setName(String str) {
            copyOnWrite();
            ((C7174n2) this.instance).setName(str);
            return this;
        }

        private C7175a() {
            super(C7174n2.f17763r);
        }

        /* renamed from: a */
        public C7175a mo19168a(String str) {
            copyOnWrite();
            ((C7174n2) this.instance).m17877a(str);
            return this;
        }

        /* renamed from: a */
        public C7175a mo19164a(C7123i2 i2Var) {
            copyOnWrite();
            ((C7174n2) this.instance).m17865a(i2Var);
            return this;
        }

        /* renamed from: a */
        public C7175a mo19166a(VerifyInfoProto$VerifyInfo verifyInfoProto$VerifyInfo) {
            copyOnWrite();
            ((C7174n2) this.instance).m17875a(verifyInfoProto$VerifyInfo);
            return this;
        }

        /* renamed from: a */
        public C7175a mo19162a(int i) {
            copyOnWrite();
            ((C7174n2) this.instance).m17863a(i);
            return this;
        }

        /* renamed from: a */
        public C7175a mo19167a(C8454e eVar) {
            copyOnWrite();
            ((C7174n2) this.instance).m17876a(eVar);
            return this;
        }

        /* renamed from: a */
        public C7175a mo19165a(C7402n2 n2Var) {
            copyOnWrite();
            ((C7174n2) this.instance).m17874a(n2Var);
            return this;
        }

        /* renamed from: a */
        public C7175a mo19163a(Timestamp timestamp) {
            copyOnWrite();
            ((C7174n2) this.instance).m17864a(timestamp);
            return this;
        }
    }

    static {
        f17763r.makeImmutable();
    }

    private C7174n2() {
        String str = "";
        this.f17766f = str;
        this.f17767g = str;
    }

    public static C7174n2 getDefaultInstance() {
        return f17763r;
    }

    public static C7175a newBuilder() {
        return (C7175a) f17763r.toBuilder();
    }

    /* access modifiers changed from: private */
    public void setName(String str) {
        if (str != null) {
            this.f17766f = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7174n2();
            case 2:
                return f17763r;
            case 3:
                return null;
            case 4:
                return new C7175a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7174n2 n2Var = (C7174n2) obj2;
                boolean z2 = this.f17765e;
                boolean z3 = n2Var.f17765e;
                this.f17765e = visitor.visitBoolean(z2, z2, z3, z3);
                this.f17766f = visitor.visitString(!this.f17766f.isEmpty(), this.f17766f, !n2Var.f17766f.isEmpty(), n2Var.f17766f);
                this.f17767g = visitor.visitString(!this.f17767g.isEmpty(), this.f17767g, !n2Var.f17767g.isEmpty(), n2Var.f17767g);
                this.f17768h = (C7123i2) visitor.visitMessage(this.f17768h, n2Var.f17768h);
                this.f17769i = (VerifyInfoProto$VerifyInfo) visitor.visitMessage(this.f17769i, n2Var.f17769i);
                this.f17770j = visitor.visitInt(this.f17770j != 0, this.f17770j, n2Var.f17770j != 0, n2Var.f17770j);
                this.f17771k = visitor.visitInt(this.f17771k != 0, this.f17771k, n2Var.f17771k != 0, n2Var.f17771k);
                this.f17772l = (C7402n2) visitor.visitMessage(this.f17772l, n2Var.f17772l);
                boolean z4 = this.f17773m != 0;
                int i = this.f17773m;
                if (n2Var.f17773m != 0) {
                    z = true;
                }
                this.f17773m = visitor.visitInt(z4, i, z, n2Var.f17773m);
                this.f17774n = (Timestamp) visitor.visitMessage(this.f17774n, n2Var.f17774n);
                boolean z5 = this.f17775o;
                boolean z6 = n2Var.f17775o;
                this.f17775o = visitor.visitBoolean(z5, z5, z6, z6);
                this.f17776p = (Timestamp) visitor.visitMessage(this.f17776p, n2Var.f17776p);
                boolean z7 = this.f17777q;
                boolean z8 = n2Var.f17777q;
                this.f17777q = visitor.visitBoolean(z7, z7, z8, z8);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
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
                                break;
                            case 8:
                                this.f17765e = codedInputStream.readBool();
                                break;
                            case 18:
                                this.f17766f = codedInputStream.readStringRequireUtf8();
                                break;
                            case 26:
                                this.f17767g = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                Builder builder = this.f17768h != null ? (C7124a) this.f17768h.toBuilder() : null;
                                this.f17768h = (C7123i2) codedInputStream.readMessage(C7123i2.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f17768h);
                                    this.f17768h = (C7123i2) builder.buildPartial();
                                    break;
                                }
                            case 42:
                                Builder builder2 = this.f17769i != null ? (C8444c) this.f17769i.toBuilder() : null;
                                this.f17769i = (VerifyInfoProto$VerifyInfo) codedInputStream.readMessage(VerifyInfoProto$VerifyInfo.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f17769i);
                                    this.f17769i = (VerifyInfoProto$VerifyInfo) builder2.buildPartial();
                                    break;
                                }
                            case 48:
                                this.f17770j = codedInputStream.readInt32();
                                break;
                            case 56:
                                this.f17771k = codedInputStream.readEnum();
                                break;
                            case 66:
                                Builder builder3 = this.f17772l != null ? (C7403a) this.f17772l.toBuilder() : null;
                                this.f17772l = (C7402n2) codedInputStream.readMessage(C7402n2.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f17772l);
                                    this.f17772l = (C7402n2) builder3.buildPartial();
                                    break;
                                }
                            case 72:
                                this.f17773m = codedInputStream.readInt32();
                                break;
                            case 90:
                                Builder builder4 = this.f17774n != null ? (Timestamp.Builder) this.f17774n.toBuilder() : null;
                                this.f17774n = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder4 == null) {
                                    break;
                                } else {
                                    builder4.mergeFrom(this.f17774n);
                                    this.f17774n = (Timestamp) builder4.buildPartial();
                                    break;
                                }
                            case 96:
                                this.f17775o = codedInputStream.readBool();
                                break;
                            case 106:
                                Builder builder5 = this.f17776p != null ? (Timestamp.Builder) this.f17776p.toBuilder() : null;
                                this.f17776p = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder5 == null) {
                                    break;
                                } else {
                                    builder5.mergeFrom(this.f17776p);
                                    this.f17776p = (Timestamp) builder5.buildPartial();
                                    break;
                                }
                            case 112:
                                this.f17777q = codedInputStream.readBool();
                                break;
                            default:
                                if (codedInputStream.skipField(readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
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
                if (f17764s == null) {
                    synchronized (C7174n2.class) {
                        if (f17764s == null) {
                            f17764s = new DefaultInstanceBasedParser(f17763r);
                        }
                    }
                }
                return f17764s;
            default:
                throw new UnsupportedOperationException();
        }
        return f17763r;
    }

    public Timestamp getBirthdate() {
        Timestamp timestamp = this.f17776p;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public int getChallengeSize() {
        return this.f17770j;
    }

    public C8454e getChallengeType() {
        C8454e a = C8454e.m19515a(this.f17771k);
        return a == null ? C8454e.UNRECOGNIZED : a;
    }

    public int getChallengeTypeValue() {
        return this.f17771k;
    }

    public int getContactPickerDone() {
        return this.f17773m;
    }

    public VerifyInfoProto$VerifyInfo getEventInfo() {
        VerifyInfoProto$VerifyInfo verifyInfoProto$VerifyInfo = this.f17769i;
        return verifyInfoProto$VerifyInfo == null ? VerifyInfoProto$VerifyInfo.getDefaultInstance() : verifyInfoProto$VerifyInfo;
    }

    public boolean getForcedOnboardingEnabled() {
        return this.f17777q;
    }

    public boolean getIntroSeen() {
        return this.f17765e;
    }

    public Timestamp getLastPushAuthAskedTime() {
        Timestamp timestamp = this.f17774n;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getName() {
        return this.f17766f;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.f17766f);
    }

    public boolean getOnboardingNotCompleted() {
        return this.f17775o;
    }

    public String getPhoneNumber() {
        return this.f17767g;
    }

    public ByteString getPhoneNumberBytes() {
        return ByteString.copyFromUtf8(this.f17767g);
    }

    public C7123i2 getPhoneRegion() {
        C7123i2 i2Var = this.f17768h;
        return i2Var == null ? C7123i2.getDefaultInstance() : i2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.f17765e;
        if (z) {
            i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
        }
        if (!this.f17766f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getName());
        }
        if (!this.f17767g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getPhoneNumber());
        }
        if (this.f17768h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getPhoneRegion());
        }
        if (this.f17769i != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getEventInfo());
        }
        int i3 = this.f17770j;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(6, i3);
        }
        if (this.f17771k != C8454e.ALPHA.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(7, this.f17771k);
        }
        if (this.f17772l != null) {
            i2 += CodedOutputStream.computeMessageSize(8, getSession());
        }
        int i4 = this.f17773m;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(9, i4);
        }
        if (this.f17774n != null) {
            i2 += CodedOutputStream.computeMessageSize(11, getLastPushAuthAskedTime());
        }
        boolean z2 = this.f17775o;
        if (z2) {
            i2 += CodedOutputStream.computeBoolSize(12, z2);
        }
        if (this.f17776p != null) {
            i2 += CodedOutputStream.computeMessageSize(13, getBirthdate());
        }
        boolean z3 = this.f17777q;
        if (z3) {
            i2 += CodedOutputStream.computeBoolSize(14, z3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7402n2 getSession() {
        C7402n2 n2Var = this.f17772l;
        return n2Var == null ? C7402n2.getDefaultInstance() : n2Var;
    }

    public boolean hasBirthdate() {
        return this.f17776p != null;
    }

    public boolean hasEventInfo() {
        return this.f17769i != null;
    }

    public boolean hasLastPushAuthAskedTime() {
        return this.f17774n != null;
    }

    public boolean hasPhoneRegion() {
        return this.f17768h != null;
    }

    public boolean hasSession() {
        return this.f17772l != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z = this.f17765e;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
        if (!this.f17766f.isEmpty()) {
            codedOutputStream.writeString(2, getName());
        }
        if (!this.f17767g.isEmpty()) {
            codedOutputStream.writeString(3, getPhoneNumber());
        }
        if (this.f17768h != null) {
            codedOutputStream.writeMessage(4, getPhoneRegion());
        }
        if (this.f17769i != null) {
            codedOutputStream.writeMessage(5, getEventInfo());
        }
        int i = this.f17770j;
        if (i != 0) {
            codedOutputStream.writeInt32(6, i);
        }
        if (this.f17771k != C8454e.ALPHA.getNumber()) {
            codedOutputStream.writeEnum(7, this.f17771k);
        }
        if (this.f17772l != null) {
            codedOutputStream.writeMessage(8, getSession());
        }
        int i2 = this.f17773m;
        if (i2 != 0) {
            codedOutputStream.writeInt32(9, i2);
        }
        if (this.f17774n != null) {
            codedOutputStream.writeMessage(11, getLastPushAuthAskedTime());
        }
        boolean z2 = this.f17775o;
        if (z2) {
            codedOutputStream.writeBool(12, z2);
        }
        if (this.f17776p != null) {
            codedOutputStream.writeMessage(13, getBirthdate());
        }
        boolean z3 = this.f17777q;
        if (z3) {
            codedOutputStream.writeBool(14, z3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m17879b(int i) {
        this.f17773m = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17878a(boolean z) {
        this.f17765e = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17877a(String str) {
        if (str != null) {
            this.f17767g = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17865a(C7123i2 i2Var) {
        if (i2Var != null) {
            this.f17768h = i2Var;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17875a(VerifyInfoProto$VerifyInfo verifyInfoProto$VerifyInfo) {
        if (verifyInfoProto$VerifyInfo != null) {
            this.f17769i = verifyInfoProto$VerifyInfo;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17863a(int i) {
        this.f17770j = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17876a(C8454e eVar) {
        if (eVar != null) {
            this.f17771k = eVar.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17874a(C7402n2 n2Var) {
        if (n2Var != null) {
            this.f17772l = n2Var;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17864a(Timestamp timestamp) {
        if (timestamp != null) {
            this.f17776p = timestamp;
            return;
        }
        throw new NullPointerException();
    }
}
