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
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.u1 */
public final class C7482u1 extends GeneratedMessageLite<C7482u1, C7483a> implements PingProto$MessagesAndSenderOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7482u1 f18779j = new C7482u1();

    /* renamed from: k */
    private static volatile Parser<C7482u1> f18780k;

    /* renamed from: e */
    private int f18781e;

    /* renamed from: f */
    private String f18782f;

    /* renamed from: g */
    private String f18783g;

    /* renamed from: h */
    private String f18784h;

    /* renamed from: i */
    private ProtobufList<PingProto$Ping2> f18785i = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.u1$a */
    public static final class C7483a extends Builder<C7482u1, C7483a> implements PingProto$MessagesAndSenderOrBuilder {
        /* synthetic */ C7483a(C7383l1 l1Var) {
            this();
        }

        public String getCursor() {
            return ((C7482u1) this.instance).getCursor();
        }

        public ByteString getCursorBytes() {
            return ((C7482u1) this.instance).getCursorBytes();
        }

        public PingProto$Ping2 getMessages(int i) {
            return ((C7482u1) this.instance).getMessages(i);
        }

        public int getMessagesCount() {
            return ((C7482u1) this.instance).getMessagesCount();
        }

        public List<PingProto$Ping2> getMessagesList() {
            return Collections.unmodifiableList(((C7482u1) this.instance).getMessagesList());
        }

        public String getSenderUuid() {
            return ((C7482u1) this.instance).getSenderUuid();
        }

        public ByteString getSenderUuidBytes() {
            return ((C7482u1) this.instance).getSenderUuidBytes();
        }

        public String getTip() {
            return ((C7482u1) this.instance).getTip();
        }

        public ByteString getTipBytes() {
            return ((C7482u1) this.instance).getTipBytes();
        }

        private C7483a() {
            super(C7482u1.f18779j);
        }
    }

    static {
        f18779j.makeImmutable();
    }

    private C7482u1() {
        String str = "";
        this.f18782f = str;
        this.f18783g = str;
        this.f18784h = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7482u1();
            case 2:
                return f18779j;
            case 3:
                this.f18785i.makeImmutable();
                return null;
            case 4:
                return new C7483a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7482u1 u1Var = (C7482u1) obj2;
                this.f18782f = visitor.visitString(!this.f18782f.isEmpty(), this.f18782f, !u1Var.f18782f.isEmpty(), u1Var.f18782f);
                this.f18783g = visitor.visitString(!this.f18783g.isEmpty(), this.f18783g, !u1Var.f18783g.isEmpty(), u1Var.f18783g);
                this.f18784h = visitor.visitString(!this.f18784h.isEmpty(), this.f18784h, true ^ u1Var.f18784h.isEmpty(), u1Var.f18784h);
                this.f18785i = visitor.visitList(this.f18785i, u1Var.f18785i);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18781e |= u1Var.f18781e;
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
                                this.f18782f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                if (!this.f18785i.isModifiable()) {
                                    this.f18785i = GeneratedMessageLite.mutableCopy(this.f18785i);
                                }
                                this.f18785i.add(codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite));
                            } else if (readTag == 26) {
                                this.f18783g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.f18784h = codedInputStream.readStringRequireUtf8();
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
                if (f18780k == null) {
                    synchronized (C7482u1.class) {
                        if (f18780k == null) {
                            f18780k = new DefaultInstanceBasedParser(f18779j);
                        }
                    }
                }
                return f18780k;
            default:
                throw new UnsupportedOperationException();
        }
        return f18779j;
    }

    public String getCursor() {
        return this.f18783g;
    }

    public ByteString getCursorBytes() {
        return ByteString.copyFromUtf8(this.f18783g);
    }

    public PingProto$Ping2 getMessages(int i) {
        return (PingProto$Ping2) this.f18785i.get(i);
    }

    public int getMessagesCount() {
        return this.f18785i.size();
    }

    public List<PingProto$Ping2> getMessagesList() {
        return this.f18785i;
    }

    public String getSenderUuid() {
        return this.f18782f;
    }

    public ByteString getSenderUuidBytes() {
        return ByteString.copyFromUtf8(this.f18782f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f18782f.isEmpty() ? CodedOutputStream.computeStringSize(1, getSenderUuid()) + 0 : 0;
        for (int i2 = 0; i2 < this.f18785i.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f18785i.get(i2));
        }
        if (!this.f18783g.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(3, getCursor());
        }
        if (!this.f18784h.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(4, getTip());
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public String getTip() {
        return this.f18784h;
    }

    public ByteString getTipBytes() {
        return ByteString.copyFromUtf8(this.f18784h);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18782f.isEmpty()) {
            codedOutputStream.writeString(1, getSenderUuid());
        }
        for (int i = 0; i < this.f18785i.size(); i++) {
            codedOutputStream.writeMessage(2, (MessageLite) this.f18785i.get(i));
        }
        if (!this.f18783g.isEmpty()) {
            codedOutputStream.writeString(3, getCursor());
        }
        if (!this.f18784h.isEmpty()) {
            codedOutputStream.writeString(4, getTip());
        }
    }
}
