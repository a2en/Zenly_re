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

/* renamed from: co.znly.models.services.h1 */
public final class C8090h1 extends GeneratedMessageLite<C8090h1, C8091a> implements ZenlyProto$ChatGroupConversationKickRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8090h1 f20500h = new C8090h1();

    /* renamed from: i */
    private static volatile Parser<C8090h1> f20501i;

    /* renamed from: e */
    private int f20502e;

    /* renamed from: f */
    private String f20503f = "";

    /* renamed from: g */
    private ProtobufList<String> f20504g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.h1$a */
    public static final class C8091a extends Builder<C8090h1, C8091a> implements ZenlyProto$ChatGroupConversationKickRequestOrBuilder {
        /* synthetic */ C8091a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8091a mo22142a(String str) {
            copyOnWrite();
            ((C8090h1) this.instance).m19160a(str);
            return this;
        }

        public String getGroupChatUuid() {
            return ((C8090h1) this.instance).getGroupChatUuid();
        }

        public ByteString getGroupChatUuidBytes() {
            return ((C8090h1) this.instance).getGroupChatUuidBytes();
        }

        public String getMemberUuids(int i) {
            return ((C8090h1) this.instance).getMemberUuids(i);
        }

        public ByteString getMemberUuidsBytes(int i) {
            return ((C8090h1) this.instance).getMemberUuidsBytes(i);
        }

        public int getMemberUuidsCount() {
            return ((C8090h1) this.instance).getMemberUuidsCount();
        }

        public List<String> getMemberUuidsList() {
            return Collections.unmodifiableList(((C8090h1) this.instance).getMemberUuidsList());
        }

        private C8091a() {
            super(C8090h1.f20500h);
        }

        /* renamed from: a */
        public C8091a mo22141a(Iterable<String> iterable) {
            copyOnWrite();
            ((C8090h1) this.instance).m19159a(iterable);
            return this;
        }
    }

    static {
        f20500h.makeImmutable();
    }

    private C8090h1() {
    }

    /* renamed from: b */
    private void m19161b() {
        if (!this.f20504g.isModifiable()) {
            this.f20504g = GeneratedMessageLite.mutableCopy(this.f20504g);
        }
    }

    public static C8091a newBuilder() {
        return (C8091a) f20500h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8090h1();
            case 2:
                return f20500h;
            case 3:
                this.f20504g.makeImmutable();
                return null;
            case 4:
                return new C8091a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8090h1 h1Var = (C8090h1) obj2;
                this.f20503f = visitor.visitString(!this.f20503f.isEmpty(), this.f20503f, true ^ h1Var.f20503f.isEmpty(), h1Var.f20503f);
                this.f20504g = visitor.visitList(this.f20504g, h1Var.f20504g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20502e |= h1Var.f20502e;
                }
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
                                this.f20503f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f20504g.isModifiable()) {
                                    this.f20504g = GeneratedMessageLite.mutableCopy(this.f20504g);
                                }
                                this.f20504g.add(readStringRequireUtf8);
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
                if (f20501i == null) {
                    synchronized (C8090h1.class) {
                        if (f20501i == null) {
                            f20501i = new DefaultInstanceBasedParser(f20500h);
                        }
                    }
                }
                return f20501i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20500h;
    }

    public String getGroupChatUuid() {
        return this.f20503f;
    }

    public ByteString getGroupChatUuidBytes() {
        return ByteString.copyFromUtf8(this.f20503f);
    }

    public String getMemberUuids(int i) {
        return (String) this.f20504g.get(i);
    }

    public ByteString getMemberUuidsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f20504g.get(i));
    }

    public int getMemberUuidsCount() {
        return this.f20504g.size();
    }

    public List<String> getMemberUuidsList() {
        return this.f20504g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f20503f.isEmpty() ? CodedOutputStream.computeStringSize(1, getGroupChatUuid()) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20504g.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f20504g.get(i3));
        }
        int size = computeStringSize + i2 + (getMemberUuidsList().size() * 1);
        this.memoizedSerializedSize = size;
        return size;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20503f.isEmpty()) {
            codedOutputStream.writeString(1, getGroupChatUuid());
        }
        for (int i = 0; i < this.f20504g.size(); i++) {
            codedOutputStream.writeString(2, (String) this.f20504g.get(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19160a(String str) {
        if (str != null) {
            this.f20503f = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19159a(Iterable<String> iterable) {
        m19161b();
        AbstractMessageLite.addAll(iterable, this.f20504g);
    }
}
