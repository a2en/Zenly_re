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
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.services.ZenlyProto$PushNotificationCreateResponse */
public final class ZenlyProto$PushNotificationCreateResponse extends GeneratedMessageLite<ZenlyProto$PushNotificationCreateResponse, C7953a> implements ZenlyProto$PushNotificationCreateResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final ZenlyProto$PushNotificationCreateResponse f20173f = new ZenlyProto$PushNotificationCreateResponse();

    /* renamed from: g */
    private static volatile Parser<ZenlyProto$PushNotificationCreateResponse> f20174g;

    /* renamed from: e */
    private ProtobufList<C7954b> f20175e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.ZenlyProto$PushNotificationCreateResponse$InfoOrBuilder */
    public interface InfoOrBuilder extends MessageLiteOrBuilder {
        C7956b getStatus();

        int getStatusValue();

        String getTargetUserUuid();

        ByteString getTargetUserUuidBytes();
    }

    /* renamed from: co.znly.models.services.ZenlyProto$PushNotificationCreateResponse$a */
    public static final class C7953a extends Builder<ZenlyProto$PushNotificationCreateResponse, C7953a> implements ZenlyProto$PushNotificationCreateResponseOrBuilder {
        private C7953a() {
            super(ZenlyProto$PushNotificationCreateResponse.f20173f);
        }

        /* synthetic */ C7953a(C8104i0 i0Var) {
            this();
        }

        public C7954b getInfos(int i) {
            return ((ZenlyProto$PushNotificationCreateResponse) this.instance).getInfos(i);
        }

        public int getInfosCount() {
            return ((ZenlyProto$PushNotificationCreateResponse) this.instance).getInfosCount();
        }

        public List<C7954b> getInfosList() {
            return Collections.unmodifiableList(((ZenlyProto$PushNotificationCreateResponse) this.instance).getInfosList());
        }
    }

    /* renamed from: co.znly.models.services.ZenlyProto$PushNotificationCreateResponse$b */
    public static final class C7954b extends GeneratedMessageLite<C7954b, C7955a> implements InfoOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C7954b f20176g = new C7954b();

        /* renamed from: h */
        private static volatile Parser<C7954b> f20177h;

        /* renamed from: e */
        private String f20178e = "";

        /* renamed from: f */
        private int f20179f;

        /* renamed from: co.znly.models.services.ZenlyProto$PushNotificationCreateResponse$b$a */
        public static final class C7955a extends Builder<C7954b, C7955a> implements InfoOrBuilder {
            private C7955a() {
                super(C7954b.f20176g);
            }

            /* synthetic */ C7955a(C8104i0 i0Var) {
                this();
            }

            public C7956b getStatus() {
                return ((C7954b) this.instance).getStatus();
            }

            public int getStatusValue() {
                return ((C7954b) this.instance).getStatusValue();
            }

            public String getTargetUserUuid() {
                return ((C7954b) this.instance).getTargetUserUuid();
            }

            public ByteString getTargetUserUuidBytes() {
                return ((C7954b) this.instance).getTargetUserUuidBytes();
            }
        }

        /* renamed from: co.znly.models.services.ZenlyProto$PushNotificationCreateResponse$b$b */
        public enum C7956b implements EnumLite {
            STATUS_UNKNOWN(0),
            STATUS_SUCCESS(1),
            STATUS_TARGET_NOT_COMPATIBLE(2),
            STATUS_INTERNAL_ERROR(3),
            UNRECOGNIZED(-1);
            

            /* renamed from: e */
            private final int f20186e;

            /* renamed from: co.znly.models.services.ZenlyProto$PushNotificationCreateResponse$b$b$a */
            class C7957a implements EnumLiteMap<C7956b> {
                C7957a() {
                }

                public C7956b findValueByNumber(int i) {
                    return C7956b.m19006a(i);
                }
            }

            static {
                new C7957a();
            }

            private C7956b(int i) {
                this.f20186e = i;
            }

            /* renamed from: a */
            public static C7956b m19006a(int i) {
                if (i == 0) {
                    return STATUS_UNKNOWN;
                }
                if (i == 1) {
                    return STATUS_SUCCESS;
                }
                if (i == 2) {
                    return STATUS_TARGET_NOT_COMPATIBLE;
                }
                if (i != 3) {
                    return null;
                }
                return STATUS_INTERNAL_ERROR;
            }

            public final int getNumber() {
                return this.f20186e;
            }
        }

        static {
            f20176g.makeImmutable();
        }

        private C7954b() {
        }

        public static Parser<C7954b> parser() {
            return f20176g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7954b();
                case 2:
                    return f20176g;
                case 3:
                    return null;
                case 4:
                    return new C7955a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7954b bVar = (C7954b) obj2;
                    this.f20178e = visitor.visitString(!this.f20178e.isEmpty(), this.f20178e, !bVar.f20178e.isEmpty(), bVar.f20178e);
                    boolean z2 = this.f20179f != 0;
                    int i = this.f20179f;
                    if (bVar.f20179f != 0) {
                        z = true;
                    }
                    this.f20179f = visitor.visitInt(z2, i, z, bVar.f20179f);
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
                                    this.f20178e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.f20179f = codedInputStream.readEnum();
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
                    if (f20177h == null) {
                        synchronized (C7954b.class) {
                            if (f20177h == null) {
                                f20177h = new DefaultInstanceBasedParser(f20176g);
                            }
                        }
                    }
                    return f20177h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f20176g;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f20178e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getTargetUserUuid());
            }
            if (this.f20179f != C7956b.STATUS_UNKNOWN.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(2, this.f20179f);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C7956b getStatus() {
            C7956b a = C7956b.m19006a(this.f20179f);
            return a == null ? C7956b.UNRECOGNIZED : a;
        }

        public int getStatusValue() {
            return this.f20179f;
        }

        public String getTargetUserUuid() {
            return this.f20178e;
        }

        public ByteString getTargetUserUuidBytes() {
            return ByteString.copyFromUtf8(this.f20178e);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f20178e.isEmpty()) {
                codedOutputStream.writeString(1, getTargetUserUuid());
            }
            if (this.f20179f != C7956b.STATUS_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(2, this.f20179f);
            }
        }
    }

    static {
        f20173f.makeImmutable();
    }

    private ZenlyProto$PushNotificationCreateResponse() {
    }

    public static C7953a newBuilder() {
        return (C7953a) f20173f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new ZenlyProto$PushNotificationCreateResponse();
            case 2:
                return f20173f;
            case 3:
                this.f20175e.makeImmutable();
                return null;
            case 4:
                return new C7953a(null);
            case 5:
                this.f20175e = ((Visitor) obj).visitList(this.f20175e, ((ZenlyProto$PushNotificationCreateResponse) obj2).f20175e);
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
                                if (!this.f20175e.isModifiable()) {
                                    this.f20175e = GeneratedMessageLite.mutableCopy(this.f20175e);
                                }
                                this.f20175e.add(codedInputStream.readMessage(C7954b.parser(), extensionRegistryLite));
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
                if (f20174g == null) {
                    synchronized (ZenlyProto$PushNotificationCreateResponse.class) {
                        if (f20174g == null) {
                            f20174g = new DefaultInstanceBasedParser(f20173f);
                        }
                    }
                }
                return f20174g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20173f;
    }

    public C7954b getInfos(int i) {
        return (C7954b) this.f20175e.get(i);
    }

    public int getInfosCount() {
        return this.f20175e.size();
    }

    public List<C7954b> getInfosList() {
        return this.f20175e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20175e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20175e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20175e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20175e.get(i));
        }
    }
}
