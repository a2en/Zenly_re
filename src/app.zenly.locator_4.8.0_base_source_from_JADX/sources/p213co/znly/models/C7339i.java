package p213co.znly.models;

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

/* renamed from: co.znly.models.i */
public final class C7339i extends GeneratedMessageLite<C7339i, C7340a> implements ContactProto$ContactOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final C7339i f18239q = new C7339i();

    /* renamed from: r */
    private static volatile Parser<C7339i> f18240r;

    /* renamed from: e */
    private int f18241e;

    /* renamed from: f */
    private String f18242f;

    /* renamed from: g */
    private Timestamp f18243g;

    /* renamed from: h */
    private String f18244h;

    /* renamed from: i */
    private String f18245i;

    /* renamed from: j */
    private String f18246j;

    /* renamed from: k */
    private String f18247k;

    /* renamed from: l */
    private String f18248l;

    /* renamed from: m */
    private String f18249m;

    /* renamed from: n */
    private String f18250n;

    /* renamed from: o */
    private ProtobufList<String> f18251o = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: p */
    private boolean f18252p;

    /* renamed from: co.znly.models.i$a */
    public static final class C7340a extends Builder<C7339i, C7340a> implements ContactProto$ContactOrBuilder {
        /* synthetic */ C7340a(C7331h hVar) {
            this();
        }

        /* renamed from: a */
        public C7340a mo19247a(String str) {
            copyOnWrite();
            ((C7339i) this.instance).m18016a(str);
            return this;
        }

        /* renamed from: b */
        public C7340a mo19248b(String str) {
            copyOnWrite();
            ((C7339i) this.instance).m18018b(str);
            return this;
        }

        /* renamed from: c */
        public C7340a mo19249c(String str) {
            copyOnWrite();
            ((C7339i) this.instance).m18020c(str);
            return this;
        }

        /* renamed from: d */
        public C7340a mo19250d(String str) {
            copyOnWrite();
            ((C7339i) this.instance).m18022d(str);
            return this;
        }

        /* renamed from: e */
        public C7340a mo19251e(String str) {
            copyOnWrite();
            ((C7339i) this.instance).m18024e(str);
            return this;
        }

        /* renamed from: f */
        public C7340a mo19252f(String str) {
            copyOnWrite();
            ((C7339i) this.instance).m18026f(str);
            return this;
        }

        public Timestamp getCreatedAt() {
            return ((C7339i) this.instance).getCreatedAt();
        }

        public String getDeviceContactId() {
            return ((C7339i) this.instance).getDeviceContactId();
        }

        public ByteString getDeviceContactIdBytes() {
            return ((C7339i) this.instance).getDeviceContactIdBytes();
        }

        public String getDeviceUuid() {
            return ((C7339i) this.instance).getDeviceUuid();
        }

        public ByteString getDeviceUuidBytes() {
            return ((C7339i) this.instance).getDeviceUuidBytes();
        }

        public String getFirst() {
            return ((C7339i) this.instance).getFirst();
        }

        public ByteString getFirstBytes() {
            return ((C7339i) this.instance).getFirstBytes();
        }

        public String getFull() {
            return ((C7339i) this.instance).getFull();
        }

        public ByteString getFullBytes() {
            return ((C7339i) this.instance).getFullBytes();
        }

        public boolean getHidden() {
            return ((C7339i) this.instance).getHidden();
        }

        public String getLast() {
            return ((C7339i) this.instance).getLast();
        }

        public ByteString getLastBytes() {
            return ((C7339i) this.instance).getLastBytes();
        }

        public String getMiddle() {
            return ((C7339i) this.instance).getMiddle();
        }

        public ByteString getMiddleBytes() {
            return ((C7339i) this.instance).getMiddleBytes();
        }

        public String getPhoneNumbers(int i) {
            return ((C7339i) this.instance).getPhoneNumbers(i);
        }

        public ByteString getPhoneNumbersBytes(int i) {
            return ((C7339i) this.instance).getPhoneNumbersBytes(i);
        }

        public int getPhoneNumbersCount() {
            return ((C7339i) this.instance).getPhoneNumbersCount();
        }

        public List<String> getPhoneNumbersList() {
            return Collections.unmodifiableList(((C7339i) this.instance).getPhoneNumbersList());
        }

        public String getUserUuid() {
            return ((C7339i) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7339i) this.instance).getUserUuidBytes();
        }

        public String getUuid() {
            return ((C7339i) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C7339i) this.instance).getUuidBytes();
        }

        public boolean hasCreatedAt() {
            return ((C7339i) this.instance).hasCreatedAt();
        }

        private C7340a() {
            super(C7339i.f18239q);
        }
    }

    static {
        f18239q.makeImmutable();
    }

    private C7339i() {
        String str = "";
        this.f18242f = str;
        this.f18244h = str;
        this.f18245i = str;
        this.f18246j = str;
        this.f18247k = str;
        this.f18248l = str;
        this.f18249m = str;
        this.f18250n = str;
    }

    public static C7339i getDefaultInstance() {
        return f18239q;
    }

    public static C7340a newBuilder() {
        return (C7340a) f18239q.toBuilder();
    }

    public static C7339i parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (C7339i) GeneratedMessageLite.parseFrom(f18239q, bArr);
    }

    public static Parser<C7339i> parser() {
        return f18239q.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7331h.f18216a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7339i();
            case 2:
                return f18239q;
            case 3:
                this.f18251o.makeImmutable();
                return null;
            case 4:
                return new C7340a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7339i iVar = (C7339i) obj2;
                this.f18242f = visitor.visitString(!this.f18242f.isEmpty(), this.f18242f, !iVar.f18242f.isEmpty(), iVar.f18242f);
                this.f18243g = (Timestamp) visitor.visitMessage(this.f18243g, iVar.f18243g);
                this.f18244h = visitor.visitString(!this.f18244h.isEmpty(), this.f18244h, !iVar.f18244h.isEmpty(), iVar.f18244h);
                this.f18245i = visitor.visitString(!this.f18245i.isEmpty(), this.f18245i, !iVar.f18245i.isEmpty(), iVar.f18245i);
                this.f18246j = visitor.visitString(!this.f18246j.isEmpty(), this.f18246j, !iVar.f18246j.isEmpty(), iVar.f18246j);
                this.f18247k = visitor.visitString(!this.f18247k.isEmpty(), this.f18247k, !iVar.f18247k.isEmpty(), iVar.f18247k);
                this.f18248l = visitor.visitString(!this.f18248l.isEmpty(), this.f18248l, !iVar.f18248l.isEmpty(), iVar.f18248l);
                this.f18249m = visitor.visitString(!this.f18249m.isEmpty(), this.f18249m, !iVar.f18249m.isEmpty(), iVar.f18249m);
                this.f18250n = visitor.visitString(!this.f18250n.isEmpty(), this.f18250n, true ^ iVar.f18250n.isEmpty(), iVar.f18250n);
                this.f18251o = visitor.visitList(this.f18251o, iVar.f18251o);
                boolean z = this.f18252p;
                boolean z2 = iVar.f18252p;
                this.f18252p = visitor.visitBoolean(z, z, z2, z2);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18241e |= iVar.f18241e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z3 = true;
                                break;
                            case 10:
                                this.f18242f = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                Builder builder = this.f18243g != null ? (Timestamp.Builder) this.f18243g.toBuilder() : null;
                                this.f18243g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f18243g);
                                    this.f18243g = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 26:
                                this.f18244h = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                this.f18245i = codedInputStream.readStringRequireUtf8();
                                break;
                            case 42:
                                this.f18246j = codedInputStream.readStringRequireUtf8();
                                break;
                            case 50:
                                this.f18247k = codedInputStream.readStringRequireUtf8();
                                break;
                            case 58:
                                this.f18248l = codedInputStream.readStringRequireUtf8();
                                break;
                            case 66:
                                this.f18249m = codedInputStream.readStringRequireUtf8();
                                break;
                            case 74:
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f18251o.isModifiable()) {
                                    this.f18251o = GeneratedMessageLite.mutableCopy(this.f18251o);
                                }
                                this.f18251o.add(readStringRequireUtf8);
                                break;
                            case 88:
                                this.f18252p = codedInputStream.readBool();
                                break;
                            case 98:
                                this.f18250n = codedInputStream.readStringRequireUtf8();
                                break;
                            default:
                                if (codedInputStream.skipField(readTag)) {
                                    break;
                                }
                                z3 = true;
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
                if (f18240r == null) {
                    synchronized (C7339i.class) {
                        if (f18240r == null) {
                            f18240r = new DefaultInstanceBasedParser(f18239q);
                        }
                    }
                }
                return f18240r;
            default:
                throw new UnsupportedOperationException();
        }
        return f18239q;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f18243g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getDeviceContactId() {
        return this.f18246j;
    }

    public ByteString getDeviceContactIdBytes() {
        return ByteString.copyFromUtf8(this.f18246j);
    }

    public String getDeviceUuid() {
        return this.f18245i;
    }

    public ByteString getDeviceUuidBytes() {
        return ByteString.copyFromUtf8(this.f18245i);
    }

    public String getFirst() {
        return this.f18247k;
    }

    public ByteString getFirstBytes() {
        return ByteString.copyFromUtf8(this.f18247k);
    }

    public String getFull() {
        return this.f18250n;
    }

    public ByteString getFullBytes() {
        return ByteString.copyFromUtf8(this.f18250n);
    }

    public boolean getHidden() {
        return this.f18252p;
    }

    public String getLast() {
        return this.f18249m;
    }

    public ByteString getLastBytes() {
        return ByteString.copyFromUtf8(this.f18249m);
    }

    public String getMiddle() {
        return this.f18248l;
    }

    public ByteString getMiddleBytes() {
        return ByteString.copyFromUtf8(this.f18248l);
    }

    public String getPhoneNumbers(int i) {
        return (String) this.f18251o.get(i);
    }

    public ByteString getPhoneNumbersBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f18251o.get(i));
    }

    public int getPhoneNumbersCount() {
        return this.f18251o.size();
    }

    public List<String> getPhoneNumbersList() {
        return this.f18251o;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f18242f.isEmpty() ? CodedOutputStream.computeStringSize(1, getUuid()) + 0 : 0;
        if (this.f18243g != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, getCreatedAt());
        }
        if (!this.f18244h.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(3, getUserUuid());
        }
        if (!this.f18245i.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(4, getDeviceUuid());
        }
        if (!this.f18246j.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(5, getDeviceContactId());
        }
        if (!this.f18247k.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(6, getFirst());
        }
        if (!this.f18248l.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(7, getMiddle());
        }
        if (!this.f18249m.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(8, getLast());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f18251o.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f18251o.get(i3));
        }
        int size = computeStringSize + i2 + (getPhoneNumbersList().size() * 1);
        boolean z = this.f18252p;
        if (z) {
            size += CodedOutputStream.computeBoolSize(11, z);
        }
        if (!this.f18250n.isEmpty()) {
            size += CodedOutputStream.computeStringSize(12, getFull());
        }
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getUserUuid() {
        return this.f18244h;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f18244h);
    }

    public String getUuid() {
        return this.f18242f;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f18242f);
    }

    public boolean hasCreatedAt() {
        return this.f18243g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18242f.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (this.f18243g != null) {
            codedOutputStream.writeMessage(2, getCreatedAt());
        }
        if (!this.f18244h.isEmpty()) {
            codedOutputStream.writeString(3, getUserUuid());
        }
        if (!this.f18245i.isEmpty()) {
            codedOutputStream.writeString(4, getDeviceUuid());
        }
        if (!this.f18246j.isEmpty()) {
            codedOutputStream.writeString(5, getDeviceContactId());
        }
        if (!this.f18247k.isEmpty()) {
            codedOutputStream.writeString(6, getFirst());
        }
        if (!this.f18248l.isEmpty()) {
            codedOutputStream.writeString(7, getMiddle());
        }
        if (!this.f18249m.isEmpty()) {
            codedOutputStream.writeString(8, getLast());
        }
        for (int i = 0; i < this.f18251o.size(); i++) {
            codedOutputStream.writeString(9, (String) this.f18251o.get(i));
        }
        boolean z = this.f18252p;
        if (z) {
            codedOutputStream.writeBool(11, z);
        }
        if (!this.f18250n.isEmpty()) {
            codedOutputStream.writeString(12, getFull());
        }
    }

    /* renamed from: a */
    private void m18014a() {
        if (!this.f18251o.isModifiable()) {
            this.f18251o = GeneratedMessageLite.mutableCopy(this.f18251o);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m18018b(String str) {
        if (str != null) {
            this.f18246j = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m18020c(String str) {
        if (str != null) {
            this.f18247k = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m18022d(String str) {
        if (str != null) {
            this.f18250n = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m18024e(String str) {
        if (str != null) {
            this.f18249m = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m18026f(String str) {
        if (str != null) {
            this.f18248l = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18016a(String str) {
        if (str != null) {
            m18014a();
            this.f18251o.add(str);
            return;
        }
        throw new NullPointerException();
    }
}
