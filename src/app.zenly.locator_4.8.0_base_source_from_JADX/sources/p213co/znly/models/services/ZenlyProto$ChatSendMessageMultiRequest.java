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
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.PingProto$Ping2.C6823a;

/* renamed from: co.znly.models.services.ZenlyProto$ChatSendMessageMultiRequest */
public final class ZenlyProto$ChatSendMessageMultiRequest extends GeneratedMessageLite<ZenlyProto$ChatSendMessageMultiRequest, C7943a> implements ZenlyProto$ChatSendMessageMultiRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final ZenlyProto$ChatSendMessageMultiRequest f20146h = new ZenlyProto$ChatSendMessageMultiRequest();

    /* renamed from: i */
    private static volatile Parser<ZenlyProto$ChatSendMessageMultiRequest> f20147i;

    /* renamed from: e */
    private int f20148e;

    /* renamed from: f */
    private ProtobufList<C7944b> f20149f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private PingProto$Ping2 f20150g;

    /* renamed from: co.znly.models.services.ZenlyProto$ChatSendMessageMultiRequest$TargetWithClientUUIDOrBuilder */
    public interface TargetWithClientUUIDOrBuilder extends MessageLiteOrBuilder {
        String getClientUuid();

        ByteString getClientUuidBytes();

        String getTargetUuid();

        ByteString getTargetUuidBytes();
    }

    /* renamed from: co.znly.models.services.ZenlyProto$ChatSendMessageMultiRequest$a */
    public static final class C7943a extends Builder<ZenlyProto$ChatSendMessageMultiRequest, C7943a> implements ZenlyProto$ChatSendMessageMultiRequestOrBuilder {
        /* synthetic */ C7943a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C7943a mo21044a(C7945a aVar) {
            copyOnWrite();
            ((ZenlyProto$ChatSendMessageMultiRequest) this.instance).m18990a(aVar);
            return this;
        }

        public PingProto$Ping2 getMessage() {
            return ((ZenlyProto$ChatSendMessageMultiRequest) this.instance).getMessage();
        }

        public C7944b getTargetWithClientUuid(int i) {
            return ((ZenlyProto$ChatSendMessageMultiRequest) this.instance).getTargetWithClientUuid(i);
        }

        public int getTargetWithClientUuidCount() {
            return ((ZenlyProto$ChatSendMessageMultiRequest) this.instance).getTargetWithClientUuidCount();
        }

        public List<C7944b> getTargetWithClientUuidList() {
            return Collections.unmodifiableList(((ZenlyProto$ChatSendMessageMultiRequest) this.instance).getTargetWithClientUuidList());
        }

        public boolean hasMessage() {
            return ((ZenlyProto$ChatSendMessageMultiRequest) this.instance).hasMessage();
        }

        private C7943a() {
            super(ZenlyProto$ChatSendMessageMultiRequest.f20146h);
        }

        /* renamed from: a */
        public C7943a mo21043a(C6823a aVar) {
            copyOnWrite();
            ((ZenlyProto$ChatSendMessageMultiRequest) this.instance).m18989a(aVar);
            return this;
        }
    }

    /* renamed from: co.znly.models.services.ZenlyProto$ChatSendMessageMultiRequest$b */
    public static final class C7944b extends GeneratedMessageLite<C7944b, C7945a> implements TargetWithClientUUIDOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C7944b f20151g = new C7944b();

        /* renamed from: h */
        private static volatile Parser<C7944b> f20152h;

        /* renamed from: e */
        private String f20153e;

        /* renamed from: f */
        private String f20154f;

        /* renamed from: co.znly.models.services.ZenlyProto$ChatSendMessageMultiRequest$b$a */
        public static final class C7945a extends Builder<C7944b, C7945a> implements TargetWithClientUUIDOrBuilder {
            /* synthetic */ C7945a(C8104i0 i0Var) {
                this();
            }

            /* renamed from: a */
            public C7945a mo21045a(String str) {
                copyOnWrite();
                ((C7944b) this.instance).m18998a(str);
                return this;
            }

            public String getClientUuid() {
                return ((C7944b) this.instance).getClientUuid();
            }

            public ByteString getClientUuidBytes() {
                return ((C7944b) this.instance).getClientUuidBytes();
            }

            public String getTargetUuid() {
                return ((C7944b) this.instance).getTargetUuid();
            }

            public ByteString getTargetUuidBytes() {
                return ((C7944b) this.instance).getTargetUuidBytes();
            }

            private C7945a() {
                super(C7944b.f20151g);
            }
        }

        static {
            f20151g.makeImmutable();
        }

        private C7944b() {
            String str = "";
            this.f20153e = str;
            this.f20154f = str;
        }

        public static C7945a newBuilder() {
            return (C7945a) f20151g.toBuilder();
        }

        public static Parser<C7944b> parser() {
            return f20151g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7944b();
                case 2:
                    return f20151g;
                case 3:
                    return null;
                case 4:
                    return new C7945a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7944b bVar = (C7944b) obj2;
                    this.f20153e = visitor.visitString(!this.f20153e.isEmpty(), this.f20153e, !bVar.f20153e.isEmpty(), bVar.f20153e);
                    this.f20154f = visitor.visitString(!this.f20154f.isEmpty(), this.f20154f, true ^ bVar.f20154f.isEmpty(), bVar.f20154f);
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
                                    this.f20153e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.f20154f = codedInputStream.readStringRequireUtf8();
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
                    if (f20152h == null) {
                        synchronized (C7944b.class) {
                            if (f20152h == null) {
                                f20152h = new DefaultInstanceBasedParser(f20151g);
                            }
                        }
                    }
                    return f20152h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f20151g;
        }

        public String getClientUuid() {
            return this.f20154f;
        }

        public ByteString getClientUuidBytes() {
            return ByteString.copyFromUtf8(this.f20154f);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f20153e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getTargetUuid());
            }
            if (!this.f20154f.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(2, getClientUuid());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String getTargetUuid() {
            return this.f20153e;
        }

        public ByteString getTargetUuidBytes() {
            return ByteString.copyFromUtf8(this.f20153e);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f20153e.isEmpty()) {
                codedOutputStream.writeString(1, getTargetUuid());
            }
            if (!this.f20154f.isEmpty()) {
                codedOutputStream.writeString(2, getClientUuid());
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m18998a(String str) {
            if (str != null) {
                this.f20153e = str;
                return;
            }
            throw new NullPointerException();
        }
    }

    static {
        f20146h.makeImmutable();
    }

    private ZenlyProto$ChatSendMessageMultiRequest() {
    }

    /* renamed from: b */
    private void m18993b() {
        if (!this.f20149f.isModifiable()) {
            this.f20149f = GeneratedMessageLite.mutableCopy(this.f20149f);
        }
    }

    public static C7943a newBuilder() {
        return (C7943a) f20146h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new ZenlyProto$ChatSendMessageMultiRequest();
            case 2:
                return f20146h;
            case 3:
                this.f20149f.makeImmutable();
                return null;
            case 4:
                return new C7943a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                ZenlyProto$ChatSendMessageMultiRequest zenlyProto$ChatSendMessageMultiRequest = (ZenlyProto$ChatSendMessageMultiRequest) obj2;
                this.f20149f = visitor.visitList(this.f20149f, zenlyProto$ChatSendMessageMultiRequest.f20149f);
                this.f20150g = (PingProto$Ping2) visitor.visitMessage(this.f20150g, zenlyProto$ChatSendMessageMultiRequest.f20150g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20148e |= zenlyProto$ChatSendMessageMultiRequest.f20148e;
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
                                if (!this.f20149f.isModifiable()) {
                                    this.f20149f = GeneratedMessageLite.mutableCopy(this.f20149f);
                                }
                                this.f20149f.add(codedInputStream.readMessage(C7944b.parser(), extensionRegistryLite));
                            } else if (readTag == 26) {
                                Builder builder = this.f20150g != null ? (C6823a) this.f20150g.toBuilder() : null;
                                this.f20150g = (PingProto$Ping2) codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20150g);
                                    this.f20150g = (PingProto$Ping2) builder.buildPartial();
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
                if (f20147i == null) {
                    synchronized (ZenlyProto$ChatSendMessageMultiRequest.class) {
                        if (f20147i == null) {
                            f20147i = new DefaultInstanceBasedParser(f20146h);
                        }
                    }
                }
                return f20147i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20146h;
    }

    public PingProto$Ping2 getMessage() {
        PingProto$Ping2 pingProto$Ping2 = this.f20150g;
        return pingProto$Ping2 == null ? PingProto$Ping2.getDefaultInstance() : pingProto$Ping2;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20149f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20149f.get(i3));
        }
        if (this.f20150g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getMessage());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7944b getTargetWithClientUuid(int i) {
        return (C7944b) this.f20149f.get(i);
    }

    public int getTargetWithClientUuidCount() {
        return this.f20149f.size();
    }

    public List<C7944b> getTargetWithClientUuidList() {
        return this.f20149f;
    }

    public boolean hasMessage() {
        return this.f20150g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20149f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20149f.get(i));
        }
        if (this.f20150g != null) {
            codedOutputStream.writeMessage(3, getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18990a(C7945a aVar) {
        m18993b();
        this.f20149f.add(aVar.build());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18989a(C6823a aVar) {
        this.f20150g = (PingProto$Ping2) aVar.build();
    }
}
