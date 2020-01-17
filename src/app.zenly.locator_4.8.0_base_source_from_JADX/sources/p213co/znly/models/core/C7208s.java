package p213co.znly.models.core;

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

/* renamed from: co.znly.models.core.s */
public final class C7208s extends GeneratedMessageLite<C7208s, C7209a> implements ChatProto$MediaReceivedEventOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7208s f17876i = new C7208s();

    /* renamed from: j */
    private static volatile Parser<C7208s> f17877j;

    /* renamed from: e */
    private int f17878e;

    /* renamed from: f */
    private String f17879f = "";

    /* renamed from: g */
    private boolean f17880g;

    /* renamed from: h */
    private ProtobufList<C7201r> f17881h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.s$a */
    public static final class C7209a extends Builder<C7208s, C7209a> implements ChatProto$MediaReceivedEventOrBuilder {
        /* synthetic */ C7209a(C7066c cVar) {
            this();
        }

        public boolean getNeedToOpenChat() {
            return ((C7208s) this.instance).getNeedToOpenChat();
        }

        public C7201r getReceived(int i) {
            return ((C7208s) this.instance).getReceived(i);
        }

        public int getReceivedCount() {
            return ((C7208s) this.instance).getReceivedCount();
        }

        public List<C7201r> getReceivedList() {
            return Collections.unmodifiableList(((C7208s) this.instance).getReceivedList());
        }

        public String getTargetUuid() {
            return ((C7208s) this.instance).getTargetUuid();
        }

        public ByteString getTargetUuidBytes() {
            return ((C7208s) this.instance).getTargetUuidBytes();
        }

        private C7209a() {
            super(C7208s.f17876i);
        }
    }

    static {
        f17876i.makeImmutable();
    }

    private C7208s() {
    }

    public static Parser<C7208s> parser() {
        return f17876i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7208s();
            case 2:
                return f17876i;
            case 3:
                this.f17881h.makeImmutable();
                return null;
            case 4:
                return new C7209a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7208s sVar = (C7208s) obj2;
                this.f17879f = visitor.visitString(!this.f17879f.isEmpty(), this.f17879f, true ^ sVar.f17879f.isEmpty(), sVar.f17879f);
                boolean z = this.f17880g;
                boolean z2 = sVar.f17880g;
                this.f17880g = visitor.visitBoolean(z, z, z2, z2);
                this.f17881h = visitor.visitList(this.f17881h, sVar.f17881h);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17878e |= sVar.f17878e;
                }
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
                                this.f17879f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f17880g = codedInputStream.readBool();
                            } else if (readTag == 26) {
                                if (!this.f17881h.isModifiable()) {
                                    this.f17881h = GeneratedMessageLite.mutableCopy(this.f17881h);
                                }
                                this.f17881h.add(codedInputStream.readMessage(C7201r.parser(), extensionRegistryLite));
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
                if (f17877j == null) {
                    synchronized (C7208s.class) {
                        if (f17877j == null) {
                            f17877j = new DefaultInstanceBasedParser(f17876i);
                        }
                    }
                }
                return f17877j;
            default:
                throw new UnsupportedOperationException();
        }
        return f17876i;
    }

    public boolean getNeedToOpenChat() {
        return this.f17880g;
    }

    public C7201r getReceived(int i) {
        return (C7201r) this.f17881h.get(i);
    }

    public int getReceivedCount() {
        return this.f17881h.size();
    }

    public List<C7201r> getReceivedList() {
        return this.f17881h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f17879f.isEmpty() ? CodedOutputStream.computeStringSize(1, getTargetUuid()) + 0 : 0;
        boolean z = this.f17880g;
        if (z) {
            computeStringSize += CodedOutputStream.computeBoolSize(2, z);
        }
        for (int i2 = 0; i2 < this.f17881h.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f17881h.get(i2));
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public String getTargetUuid() {
        return this.f17879f;
    }

    public ByteString getTargetUuidBytes() {
        return ByteString.copyFromUtf8(this.f17879f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17879f.isEmpty()) {
            codedOutputStream.writeString(1, getTargetUuid());
        }
        boolean z = this.f17880g;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
        for (int i = 0; i < this.f17881h.size(); i++) {
            codedOutputStream.writeMessage(3, (MessageLite) this.f17881h.get(i));
        }
    }
}
