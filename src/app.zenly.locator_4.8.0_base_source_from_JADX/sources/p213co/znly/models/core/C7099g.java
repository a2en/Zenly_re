package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.PingProto$Ping2.C6823a;

/* renamed from: co.znly.models.core.g */
public final class C7099g extends GeneratedMessageLite<C7099g, C7100a> implements ChatProto$ChatStoreConversation$LastMessageOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7099g f17552f = new C7099g();

    /* renamed from: g */
    private static volatile Parser<C7099g> f17553g;

    /* renamed from: e */
    private PingProto$Ping2 f17554e;

    /* renamed from: co.znly.models.core.g$a */
    public static final class C7100a extends Builder<C7099g, C7100a> implements ChatProto$ChatStoreConversation$LastMessageOrBuilder {
        /* synthetic */ C7100a(C7066c cVar) {
            this();
        }

        public PingProto$Ping2 getMsg() {
            return ((C7099g) this.instance).getMsg();
        }

        public boolean hasMsg() {
            return ((C7099g) this.instance).hasMsg();
        }

        private C7100a() {
            super(C7099g.f17552f);
        }
    }

    static {
        f17552f.makeImmutable();
    }

    private C7099g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7099g();
            case 2:
                return f17552f;
            case 3:
                return null;
            case 4:
                return new C7100a(null);
            case 5:
                this.f17554e = (PingProto$Ping2) ((Visitor) obj).visitMessage(this.f17554e, ((C7099g) obj2).f17554e);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
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
                                Builder builder = this.f17554e != null ? (C6823a) this.f17554e.toBuilder() : null;
                                this.f17554e = (PingProto$Ping2) codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17554e);
                                    this.f17554e = (PingProto$Ping2) builder.buildPartial();
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
                if (f17553g == null) {
                    synchronized (C7099g.class) {
                        if (f17553g == null) {
                            f17553g = new DefaultInstanceBasedParser(f17552f);
                        }
                    }
                }
                return f17553g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17552f;
    }

    public PingProto$Ping2 getMsg() {
        PingProto$Ping2 pingProto$Ping2 = this.f17554e;
        return pingProto$Ping2 == null ? PingProto$Ping2.getDefaultInstance() : pingProto$Ping2;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17554e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getMsg());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasMsg() {
        return this.f17554e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17554e != null) {
            codedOutputStream.writeMessage(1, getMsg());
        }
    }
}
