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
import p213co.znly.models.C7391m1;

/* renamed from: co.znly.models.services.u0 */
public final class C8301u0 extends GeneratedMessageLite<C8301u0, C8302a> implements ZenlyProto$ChatConversationActivityEventOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C8301u0 f20982j = new C8301u0();

    /* renamed from: k */
    private static volatile Parser<C8301u0> f20983k;

    /* renamed from: e */
    private int f20984e;

    /* renamed from: f */
    private String f20985f;

    /* renamed from: g */
    private String f20986g;

    /* renamed from: h */
    private ProtobufList<String> f20987h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: i */
    private int f20988i;

    /* renamed from: co.znly.models.services.u0$a */
    public static final class C8302a extends Builder<C8301u0, C8302a> implements ZenlyProto$ChatConversationActivityEventOrBuilder {
        /* synthetic */ C8302a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8302a mo22264a(String str) {
            copyOnWrite();
            ((C8301u0) this.instance).m19385a(str);
            return this;
        }

        public C7391m1 getActivity() {
            return ((C8301u0) this.instance).getActivity();
        }

        public int getActivityValue() {
            return ((C8301u0) this.instance).getActivityValue();
        }

        public String getConversationUuidDeprecated() {
            return ((C8301u0) this.instance).getConversationUuidDeprecated();
        }

        public ByteString getConversationUuidDeprecatedBytes() {
            return ((C8301u0) this.instance).getConversationUuidDeprecatedBytes();
        }

        public String getTargetUuid() {
            return ((C8301u0) this.instance).getTargetUuid();
        }

        public ByteString getTargetUuidBytes() {
            return ((C8301u0) this.instance).getTargetUuidBytes();
        }

        public String getUserUuids(int i) {
            return ((C8301u0) this.instance).getUserUuids(i);
        }

        public ByteString getUserUuidsBytes(int i) {
            return ((C8301u0) this.instance).getUserUuidsBytes(i);
        }

        public int getUserUuidsCount() {
            return ((C8301u0) this.instance).getUserUuidsCount();
        }

        public List<String> getUserUuidsList() {
            return Collections.unmodifiableList(((C8301u0) this.instance).getUserUuidsList());
        }

        private C8302a() {
            super(C8301u0.f20982j);
        }

        /* renamed from: a */
        public C8302a mo22263a(C7391m1 m1Var) {
            copyOnWrite();
            ((C8301u0) this.instance).m19382a(m1Var);
            return this;
        }
    }

    static {
        f20982j.makeImmutable();
    }

    private C8301u0() {
        String str = "";
        this.f20985f = str;
        this.f20986g = str;
    }

    public static C8302a newBuilder() {
        return (C8302a) f20982j.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8301u0();
            case 2:
                return f20982j;
            case 3:
                this.f20987h.makeImmutable();
                return null;
            case 4:
                return new C8302a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8301u0 u0Var = (C8301u0) obj2;
                this.f20985f = visitor.visitString(!this.f20985f.isEmpty(), this.f20985f, !u0Var.f20985f.isEmpty(), u0Var.f20985f);
                this.f20986g = visitor.visitString(!this.f20986g.isEmpty(), this.f20986g, !u0Var.f20986g.isEmpty(), u0Var.f20986g);
                this.f20987h = visitor.visitList(this.f20987h, u0Var.f20987h);
                boolean z2 = this.f20988i != 0;
                int i = this.f20988i;
                if (u0Var.f20988i != 0) {
                    z = true;
                }
                this.f20988i = visitor.visitInt(z2, i, z, u0Var.f20988i);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20984e |= u0Var.f20984e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f20985f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f20987h.isModifiable()) {
                                    this.f20987h = GeneratedMessageLite.mutableCopy(this.f20987h);
                                }
                                this.f20987h.add(readStringRequireUtf8);
                            } else if (readTag == 24) {
                                this.f20988i = codedInputStream.readEnum();
                            } else if (readTag == 34) {
                                this.f20986g = codedInputStream.readStringRequireUtf8();
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
                if (f20983k == null) {
                    synchronized (C8301u0.class) {
                        if (f20983k == null) {
                            f20983k = new DefaultInstanceBasedParser(f20982j);
                        }
                    }
                }
                return f20983k;
            default:
                throw new UnsupportedOperationException();
        }
        return f20982j;
    }

    public C7391m1 getActivity() {
        C7391m1 a = C7391m1.m18074a(this.f20988i);
        return a == null ? C7391m1.UNRECOGNIZED : a;
    }

    public int getActivityValue() {
        return this.f20988i;
    }

    public String getConversationUuidDeprecated() {
        return this.f20985f;
    }

    public ByteString getConversationUuidDeprecatedBytes() {
        return ByteString.copyFromUtf8(this.f20985f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f20985f.isEmpty() ? CodedOutputStream.computeStringSize(1, getConversationUuidDeprecated()) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20987h.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f20987h.get(i3));
        }
        int size = computeStringSize + i2 + (getUserUuidsList().size() * 1);
        if (this.f20988i != C7391m1.UNKNOWN.getNumber()) {
            size += CodedOutputStream.computeEnumSize(3, this.f20988i);
        }
        if (!this.f20986g.isEmpty()) {
            size += CodedOutputStream.computeStringSize(4, getTargetUuid());
        }
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getTargetUuid() {
        return this.f20986g;
    }

    public ByteString getTargetUuidBytes() {
        return ByteString.copyFromUtf8(this.f20986g);
    }

    public String getUserUuids(int i) {
        return (String) this.f20987h.get(i);
    }

    public ByteString getUserUuidsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f20987h.get(i));
    }

    public int getUserUuidsCount() {
        return this.f20987h.size();
    }

    public List<String> getUserUuidsList() {
        return this.f20987h;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20985f.isEmpty()) {
            codedOutputStream.writeString(1, getConversationUuidDeprecated());
        }
        for (int i = 0; i < this.f20987h.size(); i++) {
            codedOutputStream.writeString(2, (String) this.f20987h.get(i));
        }
        if (this.f20988i != C7391m1.UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(3, this.f20988i);
        }
        if (!this.f20986g.isEmpty()) {
            codedOutputStream.writeString(4, getTargetUuid());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19385a(String str) {
        if (str != null) {
            this.f20986g = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19382a(C7391m1 m1Var) {
        if (m1Var != null) {
            this.f20988i = m1Var.getNumber();
            return;
        }
        throw new NullPointerException();
    }
}
