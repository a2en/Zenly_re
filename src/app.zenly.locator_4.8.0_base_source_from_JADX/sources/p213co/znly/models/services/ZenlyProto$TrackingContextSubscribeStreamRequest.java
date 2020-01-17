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
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C7272d0;
import p213co.znly.models.C7272d0.C7273a;

/* renamed from: co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequest */
public final class ZenlyProto$TrackingContextSubscribeStreamRequest extends GeneratedMessageLite<ZenlyProto$TrackingContextSubscribeStreamRequest, C7961a> implements ZenlyProto$TrackingContextSubscribeStreamRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final ZenlyProto$TrackingContextSubscribeStreamRequest f20203i = new ZenlyProto$TrackingContextSubscribeStreamRequest();

    /* renamed from: j */
    private static volatile Parser<ZenlyProto$TrackingContextSubscribeStreamRequest> f20204j;

    /* renamed from: e */
    private C7272d0 f20205e;

    /* renamed from: f */
    private String f20206f = "";

    /* renamed from: g */
    private int f20207g;

    /* renamed from: h */
    private C7962b f20208h;

    /* renamed from: co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequest$GroupOrBuilder */
    public interface GroupOrBuilder extends MessageLiteOrBuilder {
        String getFriends(int i);

        ByteString getFriendsBytes(int i);

        int getFriendsCount();

        List<String> getFriendsList();
    }

    /* renamed from: co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequest$a */
    public static final class C7961a extends Builder<ZenlyProto$TrackingContextSubscribeStreamRequest, C7961a> implements ZenlyProto$TrackingContextSubscribeStreamRequestOrBuilder {
        /* synthetic */ C7961a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C7961a mo21821a(C7272d0 d0Var) {
            copyOnWrite();
            ((ZenlyProto$TrackingContextSubscribeStreamRequest) this.instance).m19013a(d0Var);
            return this;
        }

        public C7962b getGroup() {
            return ((ZenlyProto$TrackingContextSubscribeStreamRequest) this.instance).getGroup();
        }

        public C7964c getMode() {
            return ((ZenlyProto$TrackingContextSubscribeStreamRequest) this.instance).getMode();
        }

        public int getModeValue() {
            return ((ZenlyProto$TrackingContextSubscribeStreamRequest) this.instance).getModeValue();
        }

        public String getSelected() {
            return ((ZenlyProto$TrackingContextSubscribeStreamRequest) this.instance).getSelected();
        }

        public ByteString getSelectedBytes() {
            return ((ZenlyProto$TrackingContextSubscribeStreamRequest) this.instance).getSelectedBytes();
        }

        public C7272d0 getViewport() {
            return ((ZenlyProto$TrackingContextSubscribeStreamRequest) this.instance).getViewport();
        }

        public boolean hasGroup() {
            return ((ZenlyProto$TrackingContextSubscribeStreamRequest) this.instance).hasGroup();
        }

        public boolean hasViewport() {
            return ((ZenlyProto$TrackingContextSubscribeStreamRequest) this.instance).hasViewport();
        }

        private C7961a() {
            super(ZenlyProto$TrackingContextSubscribeStreamRequest.f20203i);
        }

        /* renamed from: a */
        public C7961a mo21824a(String str) {
            copyOnWrite();
            ((ZenlyProto$TrackingContextSubscribeStreamRequest) this.instance).m19020a(str);
            return this;
        }

        /* renamed from: a */
        public C7961a mo21823a(C7964c cVar) {
            copyOnWrite();
            ((ZenlyProto$TrackingContextSubscribeStreamRequest) this.instance).m19015a(cVar);
            return this;
        }

        /* renamed from: a */
        public C7961a mo21822a(C7963a aVar) {
            copyOnWrite();
            ((ZenlyProto$TrackingContextSubscribeStreamRequest) this.instance).m19014a(aVar);
            return this;
        }
    }

    /* renamed from: co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequest$b */
    public static final class C7962b extends GeneratedMessageLite<C7962b, C7963a> implements GroupOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C7962b f20209f = new C7962b();

        /* renamed from: g */
        private static volatile Parser<C7962b> f20210g;

        /* renamed from: e */
        private ProtobufList<String> f20211e = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequest$b$a */
        public static final class C7963a extends Builder<C7962b, C7963a> implements GroupOrBuilder {
            /* synthetic */ C7963a(C8104i0 i0Var) {
                this();
            }

            /* renamed from: a */
            public C7963a mo21825a(Iterable<String> iterable) {
                copyOnWrite();
                ((C7962b) this.instance).m19027a(iterable);
                return this;
            }

            public String getFriends(int i) {
                return ((C7962b) this.instance).getFriends(i);
            }

            public ByteString getFriendsBytes(int i) {
                return ((C7962b) this.instance).getFriendsBytes(i);
            }

            public int getFriendsCount() {
                return ((C7962b) this.instance).getFriendsCount();
            }

            public List<String> getFriendsList() {
                return Collections.unmodifiableList(((C7962b) this.instance).getFriendsList());
            }

            private C7963a() {
                super(C7962b.f20209f);
            }
        }

        static {
            f20209f.makeImmutable();
        }

        private C7962b() {
        }

        /* renamed from: b */
        private void m19028b() {
            if (!this.f20211e.isModifiable()) {
                this.f20211e = GeneratedMessageLite.mutableCopy(this.f20211e);
            }
        }

        public static C7962b getDefaultInstance() {
            return f20209f;
        }

        public static C7963a newBuilder() {
            return (C7963a) f20209f.toBuilder();
        }

        public static Parser<C7962b> parser() {
            return f20209f.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7962b();
                case 2:
                    return f20209f;
                case 3:
                    this.f20211e.makeImmutable();
                    return null;
                case 4:
                    return new C7963a(null);
                case 5:
                    this.f20211e = ((Visitor) obj).visitList(this.f20211e, ((C7962b) obj2).f20211e);
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
                                    String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if (!this.f20211e.isModifiable()) {
                                        this.f20211e = GeneratedMessageLite.mutableCopy(this.f20211e);
                                    }
                                    this.f20211e.add(readStringRequireUtf8);
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
                    if (f20210g == null) {
                        synchronized (C7962b.class) {
                            if (f20210g == null) {
                                f20210g = new DefaultInstanceBasedParser(f20209f);
                            }
                        }
                    }
                    return f20210g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f20209f;
        }

        public String getFriends(int i) {
            return (String) this.f20211e.get(i);
        }

        public ByteString getFriendsBytes(int i) {
            return ByteString.copyFromUtf8((String) this.f20211e.get(i));
        }

        public int getFriendsCount() {
            return this.f20211e.size();
        }

        public List<String> getFriendsList() {
            return this.f20211e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f20211e.size(); i3++) {
                i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f20211e.get(i3));
            }
            int size = 0 + i2 + (getFriendsList().size() * 1);
            this.memoizedSerializedSize = size;
            return size;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f20211e.size(); i++) {
                codedOutputStream.writeString(1, (String) this.f20211e.get(i));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m19027a(Iterable<String> iterable) {
            m19028b();
            AbstractMessageLite.addAll(iterable, this.f20211e);
        }
    }

    /* renamed from: co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequest$c */
    public enum C7964c implements EnumLite {
        UNKNOWN(0),
        STANDARD(1),
        DISCOVER(2),
        SONAR(3),
        GROUP(4),
        HIDDEN(5),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f20220e;

        /* renamed from: co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequest$c$a */
        class C7965a implements EnumLiteMap<C7964c> {
            C7965a() {
            }

            public C7964c findValueByNumber(int i) {
                return C7964c.m19030a(i);
            }
        }

        static {
            new C7965a();
        }

        private C7964c(int i) {
            this.f20220e = i;
        }

        /* renamed from: a */
        public static C7964c m19030a(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return STANDARD;
            }
            if (i == 2) {
                return DISCOVER;
            }
            if (i == 3) {
                return SONAR;
            }
            if (i == 4) {
                return GROUP;
            }
            if (i != 5) {
                return null;
            }
            return HIDDEN;
        }

        public final int getNumber() {
            return this.f20220e;
        }
    }

    static {
        f20203i.makeImmutable();
    }

    private ZenlyProto$TrackingContextSubscribeStreamRequest() {
    }

    public static C7961a newBuilder() {
        return (C7961a) f20203i.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new ZenlyProto$TrackingContextSubscribeStreamRequest();
            case 2:
                return f20203i;
            case 3:
                return null;
            case 4:
                return new C7961a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                ZenlyProto$TrackingContextSubscribeStreamRequest zenlyProto$TrackingContextSubscribeStreamRequest = (ZenlyProto$TrackingContextSubscribeStreamRequest) obj2;
                this.f20205e = (C7272d0) visitor.visitMessage(this.f20205e, zenlyProto$TrackingContextSubscribeStreamRequest.f20205e);
                this.f20206f = visitor.visitString(!this.f20206f.isEmpty(), this.f20206f, !zenlyProto$TrackingContextSubscribeStreamRequest.f20206f.isEmpty(), zenlyProto$TrackingContextSubscribeStreamRequest.f20206f);
                boolean z2 = this.f20207g != 0;
                int i = this.f20207g;
                if (zenlyProto$TrackingContextSubscribeStreamRequest.f20207g != 0) {
                    z = true;
                }
                this.f20207g = visitor.visitInt(z2, i, z, zenlyProto$TrackingContextSubscribeStreamRequest.f20207g);
                this.f20208h = (C7962b) visitor.visitMessage(this.f20208h, zenlyProto$TrackingContextSubscribeStreamRequest.f20208h);
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
                                Builder builder = this.f20205e != null ? (C7273a) this.f20205e.toBuilder() : null;
                                this.f20205e = (C7272d0) codedInputStream.readMessage(C7272d0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20205e);
                                    this.f20205e = (C7272d0) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                this.f20206f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 24) {
                                this.f20207g = codedInputStream.readEnum();
                            } else if (readTag == 34) {
                                Builder builder2 = this.f20208h != null ? (C7963a) this.f20208h.toBuilder() : null;
                                this.f20208h = (C7962b) codedInputStream.readMessage(C7962b.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20208h);
                                    this.f20208h = (C7962b) builder2.buildPartial();
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
                if (f20204j == null) {
                    synchronized (ZenlyProto$TrackingContextSubscribeStreamRequest.class) {
                        if (f20204j == null) {
                            f20204j = new DefaultInstanceBasedParser(f20203i);
                        }
                    }
                }
                return f20204j;
            default:
                throw new UnsupportedOperationException();
        }
        return f20203i;
    }

    public C7962b getGroup() {
        C7962b bVar = this.f20208h;
        return bVar == null ? C7962b.getDefaultInstance() : bVar;
    }

    public C7964c getMode() {
        C7964c a = C7964c.m19030a(this.f20207g);
        return a == null ? C7964c.UNRECOGNIZED : a;
    }

    public int getModeValue() {
        return this.f20207g;
    }

    public String getSelected() {
        return this.f20206f;
    }

    public ByteString getSelectedBytes() {
        return ByteString.copyFromUtf8(this.f20206f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20205e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getViewport());
        }
        if (!this.f20206f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getSelected());
        }
        if (this.f20207g != C7964c.UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(3, this.f20207g);
        }
        if (this.f20208h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getGroup());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7272d0 getViewport() {
        C7272d0 d0Var = this.f20205e;
        return d0Var == null ? C7272d0.getDefaultInstance() : d0Var;
    }

    public boolean hasGroup() {
        return this.f20208h != null;
    }

    public boolean hasViewport() {
        return this.f20205e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20205e != null) {
            codedOutputStream.writeMessage(1, getViewport());
        }
        if (!this.f20206f.isEmpty()) {
            codedOutputStream.writeString(2, getSelected());
        }
        if (this.f20207g != C7964c.UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(3, this.f20207g);
        }
        if (this.f20208h != null) {
            codedOutputStream.writeMessage(4, getGroup());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19013a(C7272d0 d0Var) {
        if (d0Var != null) {
            this.f20205e = d0Var;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19020a(String str) {
        if (str != null) {
            this.f20206f = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19015a(C7964c cVar) {
        if (cVar != null) {
            this.f20207g = cVar.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19014a(C7963a aVar) {
        this.f20208h = (C7962b) aVar.build();
    }
}
