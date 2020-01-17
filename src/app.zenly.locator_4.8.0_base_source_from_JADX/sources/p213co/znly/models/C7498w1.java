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
import p213co.znly.models.PingProto$Ping2.C6823a;

/* renamed from: co.znly.models.w1 */
public final class C7498w1 extends GeneratedMessageLite<C7498w1, C7499a> implements PingProto$RequestMediaInsertOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7498w1 f18834i = new C7498w1();

    /* renamed from: j */
    private static volatile Parser<C7498w1> f18835j;

    /* renamed from: e */
    private int f18836e;

    /* renamed from: f */
    private String f18837f = "";

    /* renamed from: g */
    private ProtobufList<String> f18838g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: h */
    private PingProto$Ping2 f18839h;

    /* renamed from: co.znly.models.w1$a */
    public static final class C7499a extends Builder<C7498w1, C7499a> implements PingProto$RequestMediaInsertOrBuilder {
        /* synthetic */ C7499a(C7383l1 l1Var) {
            this();
        }

        public String getConversationUuid() {
            return ((C7498w1) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C7498w1) this.instance).getConversationUuidBytes();
        }

        public PingProto$Ping2 getMessage() {
            return ((C7498w1) this.instance).getMessage();
        }

        public String getTargetUuid(int i) {
            return ((C7498w1) this.instance).getTargetUuid(i);
        }

        public ByteString getTargetUuidBytes(int i) {
            return ((C7498w1) this.instance).getTargetUuidBytes(i);
        }

        public int getTargetUuidCount() {
            return ((C7498w1) this.instance).getTargetUuidCount();
        }

        public List<String> getTargetUuidList() {
            return Collections.unmodifiableList(((C7498w1) this.instance).getTargetUuidList());
        }

        public boolean hasMessage() {
            return ((C7498w1) this.instance).hasMessage();
        }

        private C7499a() {
            super(C7498w1.f18834i);
        }
    }

    static {
        f18834i.makeImmutable();
    }

    private C7498w1() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7498w1();
            case 2:
                return f18834i;
            case 3:
                this.f18838g.makeImmutable();
                return null;
            case 4:
                return new C7499a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7498w1 w1Var = (C7498w1) obj2;
                this.f18837f = visitor.visitString(!this.f18837f.isEmpty(), this.f18837f, true ^ w1Var.f18837f.isEmpty(), w1Var.f18837f);
                this.f18838g = visitor.visitList(this.f18838g, w1Var.f18838g);
                this.f18839h = (PingProto$Ping2) visitor.visitMessage(this.f18839h, w1Var.f18839h);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18836e |= w1Var.f18836e;
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
                                this.f18837f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f18838g.isModifiable()) {
                                    this.f18838g = GeneratedMessageLite.mutableCopy(this.f18838g);
                                }
                                this.f18838g.add(readStringRequireUtf8);
                            } else if (readTag == 26) {
                                Builder builder = this.f18839h != null ? (C6823a) this.f18839h.toBuilder() : null;
                                this.f18839h = (PingProto$Ping2) codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18839h);
                                    this.f18839h = (PingProto$Ping2) builder.buildPartial();
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
                if (f18835j == null) {
                    synchronized (C7498w1.class) {
                        if (f18835j == null) {
                            f18835j = new DefaultInstanceBasedParser(f18834i);
                        }
                    }
                }
                return f18835j;
            default:
                throw new UnsupportedOperationException();
        }
        return f18834i;
    }

    public String getConversationUuid() {
        return this.f18837f;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f18837f);
    }

    public PingProto$Ping2 getMessage() {
        PingProto$Ping2 pingProto$Ping2 = this.f18839h;
        return pingProto$Ping2 == null ? PingProto$Ping2.getDefaultInstance() : pingProto$Ping2;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f18837f.isEmpty() ? CodedOutputStream.computeStringSize(1, getConversationUuid()) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f18838g.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f18838g.get(i3));
        }
        int size = computeStringSize + i2 + (getTargetUuidList().size() * 1);
        if (this.f18839h != null) {
            size += CodedOutputStream.computeMessageSize(3, getMessage());
        }
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getTargetUuid(int i) {
        return (String) this.f18838g.get(i);
    }

    public ByteString getTargetUuidBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f18838g.get(i));
    }

    public int getTargetUuidCount() {
        return this.f18838g.size();
    }

    public List<String> getTargetUuidList() {
        return this.f18838g;
    }

    public boolean hasMessage() {
        return this.f18839h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18837f.isEmpty()) {
            codedOutputStream.writeString(1, getConversationUuid());
        }
        for (int i = 0; i < this.f18838g.size(); i++) {
            codedOutputStream.writeString(2, (String) this.f18838g.get(i));
        }
        if (this.f18839h != null) {
            codedOutputStream.writeMessage(3, getMessage());
        }
    }
}
