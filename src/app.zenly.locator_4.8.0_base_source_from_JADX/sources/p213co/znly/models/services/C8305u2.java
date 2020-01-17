package p213co.znly.models.services;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.AbstractMessageLite;
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
import p213co.znly.models.C7492v2;

/* renamed from: co.znly.models.services.u2 */
public final class C8305u2 extends GeneratedMessageLite<C8305u2, C8306a> implements ZenlyProto$FriendGhostRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C8305u2 f20997i = new C8305u2();

    /* renamed from: j */
    private static volatile Parser<C8305u2> f20998j;

    /* renamed from: e */
    private int f20999e;

    /* renamed from: f */
    private ProtobufList<String> f21000f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private int f21001g;

    /* renamed from: h */
    private Timestamp f21002h;

    /* renamed from: co.znly.models.services.u2$a */
    public static final class C8306a extends Builder<C8305u2, C8306a> implements ZenlyProto$FriendGhostRequestOrBuilder {
        /* synthetic */ C8306a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8306a mo22268a(String str) {
            copyOnWrite();
            ((C8305u2) this.instance).m19397a(str);
            return this;
        }

        public C7492v2 getType() {
            return ((C8305u2) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C8305u2) this.instance).getTypeValue();
        }

        public Timestamp getUntil() {
            return ((C8305u2) this.instance).getUntil();
        }

        public String getUuids(int i) {
            return ((C8305u2) this.instance).getUuids(i);
        }

        public ByteString getUuidsBytes(int i) {
            return ((C8305u2) this.instance).getUuidsBytes(i);
        }

        public int getUuidsCount() {
            return ((C8305u2) this.instance).getUuidsCount();
        }

        public List<String> getUuidsList() {
            return Collections.unmodifiableList(((C8305u2) this.instance).getUuidsList());
        }

        public boolean hasUntil() {
            return ((C8305u2) this.instance).hasUntil();
        }

        private C8306a() {
            super(C8305u2.f20997i);
        }

        /* renamed from: a */
        public C8306a mo22267a(Iterable<String> iterable) {
            copyOnWrite();
            ((C8305u2) this.instance).m19396a(iterable);
            return this;
        }

        /* renamed from: a */
        public C8306a mo22266a(C7492v2 v2Var) {
            copyOnWrite();
            ((C8305u2) this.instance).m19395a(v2Var);
            return this;
        }

        /* renamed from: a */
        public C8306a mo22265a(Timestamp.Builder builder) {
            copyOnWrite();
            ((C8305u2) this.instance).m19390a(builder);
            return this;
        }
    }

    static {
        f20997i.makeImmutable();
    }

    private C8305u2() {
    }

    /* renamed from: b */
    private void m19398b() {
        if (!this.f21000f.isModifiable()) {
            this.f21000f = GeneratedMessageLite.mutableCopy(this.f21000f);
        }
    }

    public static C8306a newBuilder() {
        return (C8306a) f20997i.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8305u2();
            case 2:
                return f20997i;
            case 3:
                this.f21000f.makeImmutable();
                return null;
            case 4:
                return new C8306a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8305u2 u2Var = (C8305u2) obj2;
                this.f21000f = visitor.visitList(this.f21000f, u2Var.f21000f);
                boolean z2 = this.f21001g != 0;
                int i = this.f21001g;
                if (u2Var.f21001g != 0) {
                    z = true;
                }
                this.f21001g = visitor.visitInt(z2, i, z, u2Var.f21001g);
                this.f21002h = (Timestamp) visitor.visitMessage(this.f21002h, u2Var.f21002h);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20999e |= u2Var.f20999e;
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
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f21000f.isModifiable()) {
                                    this.f21000f = GeneratedMessageLite.mutableCopy(this.f21000f);
                                }
                                this.f21000f.add(readStringRequireUtf8);
                            } else if (readTag == 16) {
                                this.f21001g = codedInputStream.readEnum();
                            } else if (readTag == 26) {
                                Builder builder = this.f21002h != null ? (Timestamp.Builder) this.f21002h.toBuilder() : null;
                                this.f21002h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21002h);
                                    this.f21002h = (Timestamp) builder.buildPartial();
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
                if (f20998j == null) {
                    synchronized (C8305u2.class) {
                        if (f20998j == null) {
                            f20998j = new DefaultInstanceBasedParser(f20997i);
                        }
                    }
                }
                return f20998j;
            default:
                throw new UnsupportedOperationException();
        }
        return f20997i;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f21000f.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f21000f.get(i3));
        }
        int size = 0 + i2 + (getUuidsList().size() * 1);
        if (this.f21001g != C7492v2.noghost.getNumber()) {
            size += CodedOutputStream.computeEnumSize(2, this.f21001g);
        }
        if (this.f21002h != null) {
            size += CodedOutputStream.computeMessageSize(3, getUntil());
        }
        this.memoizedSerializedSize = size;
        return size;
    }

    public C7492v2 getType() {
        C7492v2 a = C7492v2.m18118a(this.f21001g);
        return a == null ? C7492v2.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f21001g;
    }

    public Timestamp getUntil() {
        Timestamp timestamp = this.f21002h;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getUuids(int i) {
        return (String) this.f21000f.get(i);
    }

    public ByteString getUuidsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f21000f.get(i));
    }

    public int getUuidsCount() {
        return this.f21000f.size();
    }

    public List<String> getUuidsList() {
        return this.f21000f;
    }

    public boolean hasUntil() {
        return this.f21002h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f21000f.size(); i++) {
            codedOutputStream.writeString(1, (String) this.f21000f.get(i));
        }
        if (this.f21001g != C7492v2.noghost.getNumber()) {
            codedOutputStream.writeEnum(2, this.f21001g);
        }
        if (this.f21002h != null) {
            codedOutputStream.writeMessage(3, getUntil());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19397a(String str) {
        if (str != null) {
            m19398b();
            this.f21000f.add(str);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19396a(Iterable<String> iterable) {
        m19398b();
        AbstractMessageLite.addAll(iterable, this.f21000f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19395a(C7492v2 v2Var) {
        if (v2Var != null) {
            this.f21001g = v2Var.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19390a(Timestamp.Builder builder) {
        this.f21002h = (Timestamp) builder.build();
    }
}
