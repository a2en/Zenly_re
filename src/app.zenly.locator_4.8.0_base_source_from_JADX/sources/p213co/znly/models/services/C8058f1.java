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

/* renamed from: co.znly.models.services.f1 */
public final class C8058f1 extends GeneratedMessageLite<C8058f1, C8059a> implements ZenlyProto$ChatGroupConversationAddRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8058f1 f20431h = new C8058f1();

    /* renamed from: i */
    private static volatile Parser<C8058f1> f20432i;

    /* renamed from: e */
    private int f20433e;

    /* renamed from: f */
    private String f20434f = "";

    /* renamed from: g */
    private ProtobufList<String> f20435g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.f1$a */
    public static final class C8059a extends Builder<C8058f1, C8059a> implements ZenlyProto$ChatGroupConversationAddRequestOrBuilder {
        /* synthetic */ C8059a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8059a mo22064a(String str) {
            copyOnWrite();
            ((C8058f1) this.instance).m19115a(str);
            return this;
        }

        public String getGroupChatUuid() {
            return ((C8058f1) this.instance).getGroupChatUuid();
        }

        public ByteString getGroupChatUuidBytes() {
            return ((C8058f1) this.instance).getGroupChatUuidBytes();
        }

        public String getMemberUuids(int i) {
            return ((C8058f1) this.instance).getMemberUuids(i);
        }

        public ByteString getMemberUuidsBytes(int i) {
            return ((C8058f1) this.instance).getMemberUuidsBytes(i);
        }

        public int getMemberUuidsCount() {
            return ((C8058f1) this.instance).getMemberUuidsCount();
        }

        public List<String> getMemberUuidsList() {
            return Collections.unmodifiableList(((C8058f1) this.instance).getMemberUuidsList());
        }

        private C8059a() {
            super(C8058f1.f20431h);
        }

        /* renamed from: a */
        public C8059a mo22063a(Iterable<String> iterable) {
            copyOnWrite();
            ((C8058f1) this.instance).m19114a(iterable);
            return this;
        }
    }

    static {
        f20431h.makeImmutable();
    }

    private C8058f1() {
    }

    /* renamed from: b */
    private void m19116b() {
        if (!this.f20435g.isModifiable()) {
            this.f20435g = GeneratedMessageLite.mutableCopy(this.f20435g);
        }
    }

    public static C8059a newBuilder() {
        return (C8059a) f20431h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8058f1();
            case 2:
                return f20431h;
            case 3:
                this.f20435g.makeImmutable();
                return null;
            case 4:
                return new C8059a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8058f1 f1Var = (C8058f1) obj2;
                this.f20434f = visitor.visitString(!this.f20434f.isEmpty(), this.f20434f, true ^ f1Var.f20434f.isEmpty(), f1Var.f20434f);
                this.f20435g = visitor.visitList(this.f20435g, f1Var.f20435g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20433e |= f1Var.f20433e;
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
                                this.f20434f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f20435g.isModifiable()) {
                                    this.f20435g = GeneratedMessageLite.mutableCopy(this.f20435g);
                                }
                                this.f20435g.add(readStringRequireUtf8);
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
                if (f20432i == null) {
                    synchronized (C8058f1.class) {
                        if (f20432i == null) {
                            f20432i = new DefaultInstanceBasedParser(f20431h);
                        }
                    }
                }
                return f20432i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20431h;
    }

    public String getGroupChatUuid() {
        return this.f20434f;
    }

    public ByteString getGroupChatUuidBytes() {
        return ByteString.copyFromUtf8(this.f20434f);
    }

    public String getMemberUuids(int i) {
        return (String) this.f20435g.get(i);
    }

    public ByteString getMemberUuidsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f20435g.get(i));
    }

    public int getMemberUuidsCount() {
        return this.f20435g.size();
    }

    public List<String> getMemberUuidsList() {
        return this.f20435g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f20434f.isEmpty() ? CodedOutputStream.computeStringSize(1, getGroupChatUuid()) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20435g.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f20435g.get(i3));
        }
        int size = computeStringSize + i2 + (getMemberUuidsList().size() * 1);
        this.memoizedSerializedSize = size;
        return size;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20434f.isEmpty()) {
            codedOutputStream.writeString(1, getGroupChatUuid());
        }
        for (int i = 0; i < this.f20435g.size(); i++) {
            codedOutputStream.writeString(2, (String) this.f20435g.get(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19115a(String str) {
        if (str != null) {
            this.f20434f = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19114a(Iterable<String> iterable) {
        m19116b();
        AbstractMessageLite.addAll(iterable, this.f20435g);
    }
}
