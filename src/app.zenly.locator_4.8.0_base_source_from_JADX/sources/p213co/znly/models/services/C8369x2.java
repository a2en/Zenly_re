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
import p213co.znly.models.FriendRequestProto$FriendRequest.C6810b;
import p213co.znly.models.FriendRequestProto$FriendRequest.Origin;
import p213co.znly.models.FriendRequestProto$FriendRequest.Origin.C6806b;

/* renamed from: co.znly.models.services.x2 */
public final class C8369x2 extends GeneratedMessageLite<C8369x2, C8370a> implements ZenlyProto$FriendRequestCreateRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C8369x2 f21202k = new C8369x2();

    /* renamed from: l */
    private static volatile Parser<C8369x2> f21203l;

    /* renamed from: e */
    private String f21204e;

    /* renamed from: f */
    private String f21205f;

    /* renamed from: g */
    private String f21206g;

    /* renamed from: h */
    private Origin f21207h;

    /* renamed from: i */
    private String f21208i;

    /* renamed from: j */
    private int f21209j;

    /* renamed from: co.znly.models.services.x2$a */
    public static final class C8370a extends Builder<C8369x2, C8370a> implements ZenlyProto$FriendRequestCreateRequestOrBuilder {
        /* synthetic */ C8370a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8370a mo22335a(String str) {
            copyOnWrite();
            ((C8369x2) this.instance).m19449a(str);
            return this;
        }

        /* renamed from: b */
        public C8370a mo22336b(String str) {
            copyOnWrite();
            ((C8369x2) this.instance).m19451b(str);
            return this;
        }

        /* renamed from: c */
        public C8370a mo22337c(String str) {
            copyOnWrite();
            ((C8369x2) this.instance).m19453c(str);
            return this;
        }

        public String getName() {
            return ((C8369x2) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((C8369x2) this.instance).getNameBytes();
        }

        public Origin getOrigin() {
            return ((C8369x2) this.instance).getOrigin();
        }

        public String getPhoneNumber() {
            return ((C8369x2) this.instance).getPhoneNumber();
        }

        public ByteString getPhoneNumberBytes() {
            return ((C8369x2) this.instance).getPhoneNumberBytes();
        }

        public C6810b getSource() {
            return ((C8369x2) this.instance).getSource();
        }

        public int getSourceValue() {
            return ((C8369x2) this.instance).getSourceValue();
        }

        public String getTargetUuid() {
            return ((C8369x2) this.instance).getTargetUuid();
        }

        public ByteString getTargetUuidBytes() {
            return ((C8369x2) this.instance).getTargetUuidBytes();
        }

        public String getUsername() {
            return ((C8369x2) this.instance).getUsername();
        }

        public ByteString getUsernameBytes() {
            return ((C8369x2) this.instance).getUsernameBytes();
        }

        public boolean hasOrigin() {
            return ((C8369x2) this.instance).hasOrigin();
        }

        public C8370a setName(String str) {
            copyOnWrite();
            ((C8369x2) this.instance).setName(str);
            return this;
        }

        private C8370a() {
            super(C8369x2.f21202k);
        }

        /* renamed from: a */
        public C8370a mo22333a(C6806b bVar) {
            copyOnWrite();
            ((C8369x2) this.instance).m19444a(bVar);
            return this;
        }

        /* renamed from: a */
        public C8370a mo22334a(C6810b bVar) {
            copyOnWrite();
            ((C8369x2) this.instance).m19445a(bVar);
            return this;
        }
    }

    static {
        f21202k.makeImmutable();
    }

    private C8369x2() {
        String str = "";
        this.f21204e = str;
        this.f21205f = str;
        this.f21206g = str;
        this.f21208i = str;
    }

    public static C8370a newBuilder() {
        return (C8370a) f21202k.toBuilder();
    }

    /* access modifiers changed from: private */
    public void setName(String str) {
        if (str != null) {
            this.f21206g = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8369x2();
            case 2:
                return f21202k;
            case 3:
                return null;
            case 4:
                return new C8370a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8369x2 x2Var = (C8369x2) obj2;
                this.f21204e = visitor.visitString(!this.f21204e.isEmpty(), this.f21204e, !x2Var.f21204e.isEmpty(), x2Var.f21204e);
                this.f21205f = visitor.visitString(!this.f21205f.isEmpty(), this.f21205f, !x2Var.f21205f.isEmpty(), x2Var.f21205f);
                this.f21206g = visitor.visitString(!this.f21206g.isEmpty(), this.f21206g, !x2Var.f21206g.isEmpty(), x2Var.f21206g);
                this.f21207h = (Origin) visitor.visitMessage(this.f21207h, x2Var.f21207h);
                this.f21208i = visitor.visitString(!this.f21208i.isEmpty(), this.f21208i, !x2Var.f21208i.isEmpty(), x2Var.f21208i);
                boolean z2 = this.f21209j != 0;
                int i = this.f21209j;
                if (x2Var.f21209j != 0) {
                    z = true;
                }
                this.f21209j = visitor.visitInt(z2, i, z, x2Var.f21209j);
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
                                this.f21204e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f21205f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f21206g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                Builder builder = this.f21207h != null ? (C6806b) this.f21207h.toBuilder() : null;
                                this.f21207h = (Origin) codedInputStream.readMessage(Origin.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21207h);
                                    this.f21207h = (Origin) builder.buildPartial();
                                }
                            } else if (readTag == 42) {
                                this.f21208i = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 48) {
                                this.f21209j = codedInputStream.readEnum();
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
                if (f21203l == null) {
                    synchronized (C8369x2.class) {
                        if (f21203l == null) {
                            f21203l = new DefaultInstanceBasedParser(f21202k);
                        }
                    }
                }
                return f21203l;
            default:
                throw new UnsupportedOperationException();
        }
        return f21202k;
    }

    public String getName() {
        return this.f21206g;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.f21206g);
    }

    public Origin getOrigin() {
        Origin origin = this.f21207h;
        return origin == null ? Origin.getDefaultInstance() : origin;
    }

    public String getPhoneNumber() {
        return this.f21204e;
    }

    public ByteString getPhoneNumberBytes() {
        return ByteString.copyFromUtf8(this.f21204e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f21204e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getPhoneNumber());
        }
        if (!this.f21205f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getTargetUuid());
        }
        if (!this.f21206g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getName());
        }
        if (this.f21207h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getOrigin());
        }
        if (!this.f21208i.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(5, getUsername());
        }
        if (this.f21209j != C6810b.SOURCE_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(6, this.f21209j);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C6810b getSource() {
        C6810b a = C6810b.m17541a(this.f21209j);
        return a == null ? C6810b.UNRECOGNIZED : a;
    }

    public int getSourceValue() {
        return this.f21209j;
    }

    public String getTargetUuid() {
        return this.f21205f;
    }

    public ByteString getTargetUuidBytes() {
        return ByteString.copyFromUtf8(this.f21205f);
    }

    public String getUsername() {
        return this.f21208i;
    }

    public ByteString getUsernameBytes() {
        return ByteString.copyFromUtf8(this.f21208i);
    }

    public boolean hasOrigin() {
        return this.f21207h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f21204e.isEmpty()) {
            codedOutputStream.writeString(1, getPhoneNumber());
        }
        if (!this.f21205f.isEmpty()) {
            codedOutputStream.writeString(2, getTargetUuid());
        }
        if (!this.f21206g.isEmpty()) {
            codedOutputStream.writeString(3, getName());
        }
        if (this.f21207h != null) {
            codedOutputStream.writeMessage(4, getOrigin());
        }
        if (!this.f21208i.isEmpty()) {
            codedOutputStream.writeString(5, getUsername());
        }
        if (this.f21209j != C6810b.SOURCE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(6, this.f21209j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m19451b(String str) {
        if (str != null) {
            this.f21205f = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m19453c(String str) {
        if (str != null) {
            this.f21208i = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19449a(String str) {
        if (str != null) {
            this.f21204e = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19444a(C6806b bVar) {
        this.f21207h = (Origin) bVar.build();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19445a(C6810b bVar) {
        if (bVar != null) {
            this.f21209j = bVar.getNumber();
            return;
        }
        throw new NullPointerException();
    }
}
