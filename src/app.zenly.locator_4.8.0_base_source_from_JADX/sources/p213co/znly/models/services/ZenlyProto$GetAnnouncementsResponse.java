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

/* renamed from: co.znly.models.services.ZenlyProto$GetAnnouncementsResponse */
public final class ZenlyProto$GetAnnouncementsResponse extends GeneratedMessageLite<ZenlyProto$GetAnnouncementsResponse, C7952b> implements ZenlyProto$GetAnnouncementsResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final ZenlyProto$GetAnnouncementsResponse f20165f = new ZenlyProto$GetAnnouncementsResponse();

    /* renamed from: g */
    private static volatile Parser<ZenlyProto$GetAnnouncementsResponse> f20166g;

    /* renamed from: e */
    private ProtobufList<C7950a> f20167e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.ZenlyProto$GetAnnouncementsResponse$AnnouncementOrBuilder */
    public interface AnnouncementOrBuilder extends MessageLiteOrBuilder {
        int getAnnouncementId();

        boolean getIsBlocking();

        String getUrl();

        ByteString getUrlBytes();
    }

    /* renamed from: co.znly.models.services.ZenlyProto$GetAnnouncementsResponse$a */
    public static final class C7950a extends GeneratedMessageLite<C7950a, C7951a> implements AnnouncementOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C7950a f20168h = new C7950a();

        /* renamed from: i */
        private static volatile Parser<C7950a> f20169i;

        /* renamed from: e */
        private String f20170e = "";

        /* renamed from: f */
        private int f20171f;

        /* renamed from: g */
        private boolean f20172g;

        /* renamed from: co.znly.models.services.ZenlyProto$GetAnnouncementsResponse$a$a */
        public static final class C7951a extends Builder<C7950a, C7951a> implements AnnouncementOrBuilder {
            private C7951a() {
                super(C7950a.f20168h);
            }

            /* synthetic */ C7951a(C8104i0 i0Var) {
                this();
            }

            public int getAnnouncementId() {
                return ((C7950a) this.instance).getAnnouncementId();
            }

            public boolean getIsBlocking() {
                return ((C7950a) this.instance).getIsBlocking();
            }

            public String getUrl() {
                return ((C7950a) this.instance).getUrl();
            }

            public ByteString getUrlBytes() {
                return ((C7950a) this.instance).getUrlBytes();
            }
        }

        static {
            f20168h.makeImmutable();
        }

        private C7950a() {
        }

        public static Parser<C7950a> parser() {
            return f20168h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7950a();
                case 2:
                    return f20168h;
                case 3:
                    return null;
                case 4:
                    return new C7951a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7950a aVar = (C7950a) obj2;
                    this.f20170e = visitor.visitString(!this.f20170e.isEmpty(), this.f20170e, !aVar.f20170e.isEmpty(), aVar.f20170e);
                    boolean z2 = this.f20171f != 0;
                    int i = this.f20171f;
                    if (aVar.f20171f != 0) {
                        z = true;
                    }
                    this.f20171f = visitor.visitInt(z2, i, z, aVar.f20171f);
                    boolean z3 = this.f20172g;
                    boolean z4 = aVar.f20172g;
                    this.f20172g = visitor.visitBoolean(z3, z3, z4, z4);
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
                                    this.f20170e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.f20171f = codedInputStream.readInt32();
                                } else if (readTag == 24) {
                                    this.f20172g = codedInputStream.readBool();
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
                    if (f20169i == null) {
                        synchronized (C7950a.class) {
                            if (f20169i == null) {
                                f20169i = new DefaultInstanceBasedParser(f20168h);
                            }
                        }
                    }
                    return f20169i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f20168h;
        }

        public int getAnnouncementId() {
            return this.f20171f;
        }

        public boolean getIsBlocking() {
            return this.f20172g;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f20170e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getUrl());
            }
            int i3 = this.f20171f;
            if (i3 != 0) {
                i2 += CodedOutputStream.computeInt32Size(2, i3);
            }
            boolean z = this.f20172g;
            if (z) {
                i2 += CodedOutputStream.computeBoolSize(3, z);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String getUrl() {
            return this.f20170e;
        }

        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.f20170e);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f20170e.isEmpty()) {
                codedOutputStream.writeString(1, getUrl());
            }
            int i = this.f20171f;
            if (i != 0) {
                codedOutputStream.writeInt32(2, i);
            }
            boolean z = this.f20172g;
            if (z) {
                codedOutputStream.writeBool(3, z);
            }
        }
    }

    /* renamed from: co.znly.models.services.ZenlyProto$GetAnnouncementsResponse$b */
    public static final class C7952b extends Builder<ZenlyProto$GetAnnouncementsResponse, C7952b> implements ZenlyProto$GetAnnouncementsResponseOrBuilder {
        private C7952b() {
            super(ZenlyProto$GetAnnouncementsResponse.f20165f);
        }

        /* synthetic */ C7952b(C8104i0 i0Var) {
            this();
        }

        public C7950a getAnnouncements(int i) {
            return ((ZenlyProto$GetAnnouncementsResponse) this.instance).getAnnouncements(i);
        }

        public int getAnnouncementsCount() {
            return ((ZenlyProto$GetAnnouncementsResponse) this.instance).getAnnouncementsCount();
        }

        public List<C7950a> getAnnouncementsList() {
            return Collections.unmodifiableList(((ZenlyProto$GetAnnouncementsResponse) this.instance).getAnnouncementsList());
        }
    }

    static {
        f20165f.makeImmutable();
    }

    private ZenlyProto$GetAnnouncementsResponse() {
    }

    public static C7952b newBuilder() {
        return (C7952b) f20165f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new ZenlyProto$GetAnnouncementsResponse();
            case 2:
                return f20165f;
            case 3:
                this.f20167e.makeImmutable();
                return null;
            case 4:
                return new C7952b(null);
            case 5:
                this.f20167e = ((Visitor) obj).visitList(this.f20167e, ((ZenlyProto$GetAnnouncementsResponse) obj2).f20167e);
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
                                if (!this.f20167e.isModifiable()) {
                                    this.f20167e = GeneratedMessageLite.mutableCopy(this.f20167e);
                                }
                                this.f20167e.add(codedInputStream.readMessage(C7950a.parser(), extensionRegistryLite));
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
                if (f20166g == null) {
                    synchronized (ZenlyProto$GetAnnouncementsResponse.class) {
                        if (f20166g == null) {
                            f20166g = new DefaultInstanceBasedParser(f20165f);
                        }
                    }
                }
                return f20166g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20165f;
    }

    public C7950a getAnnouncements(int i) {
        return (C7950a) this.f20167e.get(i);
    }

    public int getAnnouncementsCount() {
        return this.f20167e.size();
    }

    public List<C7950a> getAnnouncementsList() {
        return this.f20167e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20167e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20167e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20167e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20167e.get(i));
        }
    }
}
