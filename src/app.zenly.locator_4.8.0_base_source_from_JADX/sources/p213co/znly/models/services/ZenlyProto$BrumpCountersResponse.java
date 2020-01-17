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
import p213co.znly.models.services.C8239q0.C8240a;

/* renamed from: co.znly.models.services.ZenlyProto$BrumpCountersResponse */
public final class ZenlyProto$BrumpCountersResponse extends GeneratedMessageLite<ZenlyProto$BrumpCountersResponse, C7940a> implements ZenlyProto$BrumpCountersResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final ZenlyProto$BrumpCountersResponse f20135h = new ZenlyProto$BrumpCountersResponse();

    /* renamed from: i */
    private static volatile Parser<ZenlyProto$BrumpCountersResponse> f20136i;

    /* renamed from: e */
    private int f20137e;

    /* renamed from: f */
    private ProtobufList<C7941b> f20138f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private C8239q0 f20139g;

    /* renamed from: co.znly.models.services.ZenlyProto$BrumpCountersResponse$CountersOrBuilder */
    public interface CountersOrBuilder extends MessageLiteOrBuilder {
        int getBrumpFriendMatchCount();

        int getBrumpUnknownMatchCount();

        int getSingleBumpCount();

        String getUserUuid();

        ByteString getUserUuidBytes();
    }

    /* renamed from: co.znly.models.services.ZenlyProto$BrumpCountersResponse$a */
    public static final class C7940a extends Builder<ZenlyProto$BrumpCountersResponse, C7940a> implements ZenlyProto$BrumpCountersResponseOrBuilder {
        private C7940a() {
            super(ZenlyProto$BrumpCountersResponse.f20135h);
        }

        /* synthetic */ C7940a(C8104i0 i0Var) {
            this();
        }

        public C7941b getCounters(int i) {
            return ((ZenlyProto$BrumpCountersResponse) this.instance).getCounters(i);
        }

        public int getCountersCount() {
            return ((ZenlyProto$BrumpCountersResponse) this.instance).getCountersCount();
        }

        public List<C7941b> getCountersList() {
            return Collections.unmodifiableList(((ZenlyProto$BrumpCountersResponse) this.instance).getCountersList());
        }

        public C8239q0 getError() {
            return ((ZenlyProto$BrumpCountersResponse) this.instance).getError();
        }

        public boolean hasError() {
            return ((ZenlyProto$BrumpCountersResponse) this.instance).hasError();
        }
    }

    /* renamed from: co.znly.models.services.ZenlyProto$BrumpCountersResponse$b */
    public static final class C7941b extends GeneratedMessageLite<C7941b, C7942a> implements CountersOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static final C7941b f20140i = new C7941b();

        /* renamed from: j */
        private static volatile Parser<C7941b> f20141j;

        /* renamed from: e */
        private String f20142e = "";

        /* renamed from: f */
        private int f20143f;

        /* renamed from: g */
        private int f20144g;

        /* renamed from: h */
        private int f20145h;

        /* renamed from: co.znly.models.services.ZenlyProto$BrumpCountersResponse$b$a */
        public static final class C7942a extends Builder<C7941b, C7942a> implements CountersOrBuilder {
            private C7942a() {
                super(C7941b.f20140i);
            }

            /* synthetic */ C7942a(C8104i0 i0Var) {
                this();
            }

            public int getBrumpFriendMatchCount() {
                return ((C7941b) this.instance).getBrumpFriendMatchCount();
            }

            public int getBrumpUnknownMatchCount() {
                return ((C7941b) this.instance).getBrumpUnknownMatchCount();
            }

            public int getSingleBumpCount() {
                return ((C7941b) this.instance).getSingleBumpCount();
            }

            public String getUserUuid() {
                return ((C7941b) this.instance).getUserUuid();
            }

            public ByteString getUserUuidBytes() {
                return ((C7941b) this.instance).getUserUuidBytes();
            }
        }

        static {
            f20140i.makeImmutable();
        }

        private C7941b() {
        }

        public static Parser<C7941b> parser() {
            return f20140i.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7941b();
                case 2:
                    return f20140i;
                case 3:
                    return null;
                case 4:
                    return new C7942a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7941b bVar = (C7941b) obj2;
                    this.f20142e = visitor.visitString(!this.f20142e.isEmpty(), this.f20142e, !bVar.f20142e.isEmpty(), bVar.f20142e);
                    this.f20143f = visitor.visitInt(this.f20143f != 0, this.f20143f, bVar.f20143f != 0, bVar.f20143f);
                    this.f20144g = visitor.visitInt(this.f20144g != 0, this.f20144g, bVar.f20144g != 0, bVar.f20144g);
                    boolean z2 = this.f20145h != 0;
                    int i = this.f20145h;
                    if (bVar.f20145h != 0) {
                        z = true;
                    }
                    this.f20145h = visitor.visitInt(z2, i, z, bVar.f20145h);
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
                                    this.f20142e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.f20143f = codedInputStream.readInt32();
                                } else if (readTag == 24) {
                                    this.f20144g = codedInputStream.readInt32();
                                } else if (readTag == 32) {
                                    this.f20145h = codedInputStream.readInt32();
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
                    if (f20141j == null) {
                        synchronized (C7941b.class) {
                            if (f20141j == null) {
                                f20141j = new DefaultInstanceBasedParser(f20140i);
                            }
                        }
                    }
                    return f20141j;
                default:
                    throw new UnsupportedOperationException();
            }
            return f20140i;
        }

        public int getBrumpFriendMatchCount() {
            return this.f20144g;
        }

        public int getBrumpUnknownMatchCount() {
            return this.f20145h;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f20142e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getUserUuid());
            }
            int i3 = this.f20143f;
            if (i3 != 0) {
                i2 += CodedOutputStream.computeInt32Size(2, i3);
            }
            int i4 = this.f20144g;
            if (i4 != 0) {
                i2 += CodedOutputStream.computeInt32Size(3, i4);
            }
            int i5 = this.f20145h;
            if (i5 != 0) {
                i2 += CodedOutputStream.computeInt32Size(4, i5);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public int getSingleBumpCount() {
            return this.f20143f;
        }

        public String getUserUuid() {
            return this.f20142e;
        }

        public ByteString getUserUuidBytes() {
            return ByteString.copyFromUtf8(this.f20142e);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f20142e.isEmpty()) {
                codedOutputStream.writeString(1, getUserUuid());
            }
            int i = this.f20143f;
            if (i != 0) {
                codedOutputStream.writeInt32(2, i);
            }
            int i2 = this.f20144g;
            if (i2 != 0) {
                codedOutputStream.writeInt32(3, i2);
            }
            int i3 = this.f20145h;
            if (i3 != 0) {
                codedOutputStream.writeInt32(4, i3);
            }
        }
    }

    static {
        f20135h.makeImmutable();
    }

    private ZenlyProto$BrumpCountersResponse() {
    }

    public static C7940a newBuilder() {
        return (C7940a) f20135h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new ZenlyProto$BrumpCountersResponse();
            case 2:
                return f20135h;
            case 3:
                this.f20138f.makeImmutable();
                return null;
            case 4:
                return new C7940a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                ZenlyProto$BrumpCountersResponse zenlyProto$BrumpCountersResponse = (ZenlyProto$BrumpCountersResponse) obj2;
                this.f20138f = visitor.visitList(this.f20138f, zenlyProto$BrumpCountersResponse.f20138f);
                this.f20139g = (C8239q0) visitor.visitMessage(this.f20139g, zenlyProto$BrumpCountersResponse.f20139g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20137e |= zenlyProto$BrumpCountersResponse.f20137e;
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
                                if (!this.f20138f.isModifiable()) {
                                    this.f20138f = GeneratedMessageLite.mutableCopy(this.f20138f);
                                }
                                this.f20138f.add(codedInputStream.readMessage(C7941b.parser(), extensionRegistryLite));
                            } else if (readTag == 1010) {
                                Builder builder = this.f20139g != null ? (C8240a) this.f20139g.toBuilder() : null;
                                this.f20139g = (C8239q0) codedInputStream.readMessage(C8239q0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20139g);
                                    this.f20139g = (C8239q0) builder.buildPartial();
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
                if (f20136i == null) {
                    synchronized (ZenlyProto$BrumpCountersResponse.class) {
                        if (f20136i == null) {
                            f20136i = new DefaultInstanceBasedParser(f20135h);
                        }
                    }
                }
                return f20136i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20135h;
    }

    public C7941b getCounters(int i) {
        return (C7941b) this.f20138f.get(i);
    }

    public int getCountersCount() {
        return this.f20138f.size();
    }

    public List<C7941b> getCountersList() {
        return this.f20138f;
    }

    public C8239q0 getError() {
        C8239q0 q0Var = this.f20139g;
        return q0Var == null ? C8239q0.getDefaultInstance() : q0Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20138f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20138f.get(i3));
        }
        if (this.f20139g != null) {
            i2 += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20139g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20138f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20138f.get(i));
        }
        if (this.f20139g != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
