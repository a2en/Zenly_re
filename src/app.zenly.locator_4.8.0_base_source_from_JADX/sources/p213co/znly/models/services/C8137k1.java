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

/* renamed from: co.znly.models.services.k1 */
public final class C8137k1 extends GeneratedMessageLite<C8137k1, C8138a> implements ZenlyProto$ChatReportMessageRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C8137k1 f20611l = new C8137k1();

    /* renamed from: m */
    private static volatile Parser<C8137k1> f20612m;

    /* renamed from: e */
    private String f20613e;

    /* renamed from: f */
    private String f20614f;

    /* renamed from: g */
    private String f20615g;

    /* renamed from: h */
    private String f20616h;

    /* renamed from: i */
    private String f20617i;

    /* renamed from: j */
    private String f20618j;

    /* renamed from: k */
    private boolean f20619k;

    /* renamed from: co.znly.models.services.k1$a */
    public static final class C8138a extends Builder<C8137k1, C8138a> implements ZenlyProto$ChatReportMessageRequestOrBuilder {
        /* synthetic */ C8138a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8138a mo22150a(String str) {
            copyOnWrite();
            ((C8137k1) this.instance).m19208a(str);
            return this;
        }

        /* renamed from: b */
        public C8138a mo22152b(String str) {
            copyOnWrite();
            ((C8137k1) this.instance).m19211b(str);
            return this;
        }

        /* renamed from: c */
        public C8138a mo22153c(String str) {
            copyOnWrite();
            ((C8137k1) this.instance).m19213c(str);
            return this;
        }

        /* renamed from: d */
        public C8138a mo22154d(String str) {
            copyOnWrite();
            ((C8137k1) this.instance).m19215d(str);
            return this;
        }

        /* renamed from: e */
        public C8138a mo22155e(String str) {
            copyOnWrite();
            ((C8137k1) this.instance).m19217e(str);
            return this;
        }

        public String getConversationUuidDeprecated() {
            return ((C8137k1) this.instance).getConversationUuidDeprecated();
        }

        public ByteString getConversationUuidDeprecatedBytes() {
            return ((C8137k1) this.instance).getConversationUuidDeprecatedBytes();
        }

        public boolean getIsTargetBlocked() {
            return ((C8137k1) this.instance).getIsTargetBlocked();
        }

        public String getMessageData() {
            return ((C8137k1) this.instance).getMessageData();
        }

        public ByteString getMessageDataBytes() {
            return ((C8137k1) this.instance).getMessageDataBytes();
        }

        public String getMessageUuid() {
            return ((C8137k1) this.instance).getMessageUuid();
        }

        public ByteString getMessageUuidBytes() {
            return ((C8137k1) this.instance).getMessageUuidBytes();
        }

        public String getReason() {
            return ((C8137k1) this.instance).getReason();
        }

        public ByteString getReasonBytes() {
            return ((C8137k1) this.instance).getReasonBytes();
        }

        public String getTargetUuid() {
            return ((C8137k1) this.instance).getTargetUuid();
        }

        public ByteString getTargetUuidBytes() {
            return ((C8137k1) this.instance).getTargetUuidBytes();
        }

        public String getUserReason() {
            return ((C8137k1) this.instance).getUserReason();
        }

        public ByteString getUserReasonBytes() {
            return ((C8137k1) this.instance).getUserReasonBytes();
        }

        private C8138a() {
            super(C8137k1.f20611l);
        }

        /* renamed from: a */
        public C8138a mo22151a(boolean z) {
            copyOnWrite();
            ((C8137k1) this.instance).m19209a(z);
            return this;
        }
    }

    static {
        f20611l.makeImmutable();
    }

    private C8137k1() {
        String str = "";
        this.f20613e = str;
        this.f20614f = str;
        this.f20615g = str;
        this.f20616h = str;
        this.f20617i = str;
        this.f20618j = str;
    }

    public static C8138a newBuilder() {
        return (C8138a) f20611l.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8137k1();
            case 2:
                return f20611l;
            case 3:
                return null;
            case 4:
                return new C8138a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8137k1 k1Var = (C8137k1) obj2;
                this.f20613e = visitor.visitString(!this.f20613e.isEmpty(), this.f20613e, !k1Var.f20613e.isEmpty(), k1Var.f20613e);
                this.f20614f = visitor.visitString(!this.f20614f.isEmpty(), this.f20614f, !k1Var.f20614f.isEmpty(), k1Var.f20614f);
                this.f20615g = visitor.visitString(!this.f20615g.isEmpty(), this.f20615g, !k1Var.f20615g.isEmpty(), k1Var.f20615g);
                this.f20616h = visitor.visitString(!this.f20616h.isEmpty(), this.f20616h, !k1Var.f20616h.isEmpty(), k1Var.f20616h);
                this.f20617i = visitor.visitString(!this.f20617i.isEmpty(), this.f20617i, !k1Var.f20617i.isEmpty(), k1Var.f20617i);
                this.f20618j = visitor.visitString(!this.f20618j.isEmpty(), this.f20618j, true ^ k1Var.f20618j.isEmpty(), k1Var.f20618j);
                boolean z = this.f20619k;
                boolean z2 = k1Var.f20619k;
                this.f20619k = visitor.visitBoolean(z, z, z2, z2);
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
                                this.f20613e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f20614f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f20615g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.f20616h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                this.f20617i = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 50) {
                                this.f20618j = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 56) {
                                this.f20619k = codedInputStream.readBool();
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
                if (f20612m == null) {
                    synchronized (C8137k1.class) {
                        if (f20612m == null) {
                            f20612m = new DefaultInstanceBasedParser(f20611l);
                        }
                    }
                }
                return f20612m;
            default:
                throw new UnsupportedOperationException();
        }
        return f20611l;
    }

    public String getConversationUuidDeprecated() {
        return this.f20613e;
    }

    public ByteString getConversationUuidDeprecatedBytes() {
        return ByteString.copyFromUtf8(this.f20613e);
    }

    public boolean getIsTargetBlocked() {
        return this.f20619k;
    }

    public String getMessageData() {
        return this.f20617i;
    }

    public ByteString getMessageDataBytes() {
        return ByteString.copyFromUtf8(this.f20617i);
    }

    public String getMessageUuid() {
        return this.f20614f;
    }

    public ByteString getMessageUuidBytes() {
        return ByteString.copyFromUtf8(this.f20614f);
    }

    public String getReason() {
        return this.f20615g;
    }

    public ByteString getReasonBytes() {
        return ByteString.copyFromUtf8(this.f20615g);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20613e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getConversationUuidDeprecated());
        }
        if (!this.f20614f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getMessageUuid());
        }
        if (!this.f20615g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getReason());
        }
        if (!this.f20616h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getUserReason());
        }
        if (!this.f20617i.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(5, getMessageData());
        }
        if (!this.f20618j.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(6, getTargetUuid());
        }
        boolean z = this.f20619k;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(7, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getTargetUuid() {
        return this.f20618j;
    }

    public ByteString getTargetUuidBytes() {
        return ByteString.copyFromUtf8(this.f20618j);
    }

    public String getUserReason() {
        return this.f20616h;
    }

    public ByteString getUserReasonBytes() {
        return ByteString.copyFromUtf8(this.f20616h);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20613e.isEmpty()) {
            codedOutputStream.writeString(1, getConversationUuidDeprecated());
        }
        if (!this.f20614f.isEmpty()) {
            codedOutputStream.writeString(2, getMessageUuid());
        }
        if (!this.f20615g.isEmpty()) {
            codedOutputStream.writeString(3, getReason());
        }
        if (!this.f20616h.isEmpty()) {
            codedOutputStream.writeString(4, getUserReason());
        }
        if (!this.f20617i.isEmpty()) {
            codedOutputStream.writeString(5, getMessageData());
        }
        if (!this.f20618j.isEmpty()) {
            codedOutputStream.writeString(6, getTargetUuid());
        }
        boolean z = this.f20619k;
        if (z) {
            codedOutputStream.writeBool(7, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m19211b(String str) {
        if (str != null) {
            this.f20614f = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m19213c(String str) {
        if (str != null) {
            this.f20615g = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m19215d(String str) {
        if (str != null) {
            this.f20618j = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m19217e(String str) {
        if (str != null) {
            this.f20616h = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19208a(String str) {
        if (str != null) {
            this.f20617i = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19209a(boolean z) {
        this.f20619k = z;
    }
}
