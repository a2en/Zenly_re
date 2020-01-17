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
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C6943a0;
import p213co.znly.models.C6943a0.C6944a;
import p213co.znly.models.PlaceProto$Place;
import p213co.znly.models.PlaceProto$Place.C6844b;
import p213co.znly.models.PlaceProto$Place.C6845c.C6847b;

/* renamed from: co.znly.models.services.ZenlyProto$UserVisitPointResponse */
public final class ZenlyProto$UserVisitPointResponse extends GeneratedMessageLite<ZenlyProto$UserVisitPointResponse, C7971a> implements ZenlyProto$UserVisitPointResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final ZenlyProto$UserVisitPointResponse f20221f = new ZenlyProto$UserVisitPointResponse();

    /* renamed from: g */
    private static volatile Parser<ZenlyProto$UserVisitPointResponse> f20222g;

    /* renamed from: e */
    private ProtobufList<UserVisitPoint> f20223e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.ZenlyProto$UserVisitPointResponse$UserVisitPoint */
    public static final class UserVisitPoint extends GeneratedMessageLite<UserVisitPoint, C7966a> implements UserVisitPointOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: l */
        public static final UserVisitPoint f20224l = new UserVisitPoint();

        /* renamed from: m */
        private static volatile Parser<UserVisitPoint> f20225m;

        /* renamed from: e */
        private String f20226e = "";

        /* renamed from: f */
        private int f20227f;

        /* renamed from: g */
        private C6943a0 f20228g;

        /* renamed from: h */
        private Timestamp f20229h;

        /* renamed from: i */
        private Timestamp f20230i;

        /* renamed from: j */
        private int f20231j;

        /* renamed from: k */
        private C7967b f20232k;

        /* renamed from: co.znly.models.services.ZenlyProto$UserVisitPointResponse$UserVisitPoint$HeadingOrBuilder */
        public interface HeadingOrBuilder extends MessageLiteOrBuilder {
            Timestamp getDepartureTime();

            PlaceProto$Place getDestination();

            Timestamp getEta();

            PlaceProto$Place getOrigin();

            boolean hasDepartureTime();

            boolean hasDestination();

            boolean hasEta();

            boolean hasOrigin();
        }

        /* renamed from: co.znly.models.services.ZenlyProto$UserVisitPointResponse$UserVisitPoint$a */
        public static final class C7966a extends Builder<UserVisitPoint, C7966a> implements UserVisitPointOrBuilder {
            private C7966a() {
                super(UserVisitPoint.f20224l);
            }

            /* synthetic */ C7966a(C8104i0 i0Var) {
                this();
            }

            public C7967b getHeading() {
                return ((UserVisitPoint) this.instance).getHeading();
            }

            public C6847b getPlaceTag() {
                return ((UserVisitPoint) this.instance).getPlaceTag();
            }

            public int getPlaceTagValue() {
                return ((UserVisitPoint) this.instance).getPlaceTagValue();
            }

            public C6943a0 getPoint() {
                return ((UserVisitPoint) this.instance).getPoint();
            }

            public C7969c getStatus() {
                return ((UserVisitPoint) this.instance).getStatus();
            }

            public int getStatusValue() {
                return ((UserVisitPoint) this.instance).getStatusValue();
            }

            public Timestamp getTimeIn() {
                return ((UserVisitPoint) this.instance).getTimeIn();
            }

            public Timestamp getTimeOut() {
                return ((UserVisitPoint) this.instance).getTimeOut();
            }

            public String getUserUuid() {
                return ((UserVisitPoint) this.instance).getUserUuid();
            }

            public ByteString getUserUuidBytes() {
                return ((UserVisitPoint) this.instance).getUserUuidBytes();
            }

            public boolean hasHeading() {
                return ((UserVisitPoint) this.instance).hasHeading();
            }

            public boolean hasPoint() {
                return ((UserVisitPoint) this.instance).hasPoint();
            }

            public boolean hasTimeIn() {
                return ((UserVisitPoint) this.instance).hasTimeIn();
            }

            public boolean hasTimeOut() {
                return ((UserVisitPoint) this.instance).hasTimeOut();
            }
        }

        /* renamed from: co.znly.models.services.ZenlyProto$UserVisitPointResponse$UserVisitPoint$b */
        public static final class C7967b extends GeneratedMessageLite<C7967b, C7968a> implements HeadingOrBuilder {
            /* access modifiers changed from: private */

            /* renamed from: i */
            public static final C7967b f20233i = new C7967b();

            /* renamed from: j */
            private static volatile Parser<C7967b> f20234j;

            /* renamed from: e */
            private PlaceProto$Place f20235e;

            /* renamed from: f */
            private PlaceProto$Place f20236f;

            /* renamed from: g */
            private Timestamp f20237g;

            /* renamed from: h */
            private Timestamp f20238h;

            /* renamed from: co.znly.models.services.ZenlyProto$UserVisitPointResponse$UserVisitPoint$b$a */
            public static final class C7968a extends Builder<C7967b, C7968a> implements HeadingOrBuilder {
                private C7968a() {
                    super(C7967b.f20233i);
                }

                /* synthetic */ C7968a(C8104i0 i0Var) {
                    this();
                }

                public Timestamp getDepartureTime() {
                    return ((C7967b) this.instance).getDepartureTime();
                }

                public PlaceProto$Place getDestination() {
                    return ((C7967b) this.instance).getDestination();
                }

                public Timestamp getEta() {
                    return ((C7967b) this.instance).getEta();
                }

                public PlaceProto$Place getOrigin() {
                    return ((C7967b) this.instance).getOrigin();
                }

                public boolean hasDepartureTime() {
                    return ((C7967b) this.instance).hasDepartureTime();
                }

                public boolean hasDestination() {
                    return ((C7967b) this.instance).hasDestination();
                }

                public boolean hasEta() {
                    return ((C7967b) this.instance).hasEta();
                }

                public boolean hasOrigin() {
                    return ((C7967b) this.instance).hasOrigin();
                }
            }

            static {
                f20233i.makeImmutable();
            }

            private C7967b() {
            }

            public static C7967b getDefaultInstance() {
                return f20233i;
            }

            public static C7968a newBuilder() {
                return (C7968a) f20233i.toBuilder();
            }

            public static Parser<C7967b> parser() {
                return f20233i.getParserForType();
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new C7967b();
                    case 2:
                        return f20233i;
                    case 3:
                        return null;
                    case 4:
                        return new C7968a(null);
                    case 5:
                        Visitor visitor = (Visitor) obj;
                        C7967b bVar = (C7967b) obj2;
                        this.f20235e = (PlaceProto$Place) visitor.visitMessage(this.f20235e, bVar.f20235e);
                        this.f20236f = (PlaceProto$Place) visitor.visitMessage(this.f20236f, bVar.f20236f);
                        this.f20237g = (Timestamp) visitor.visitMessage(this.f20237g, bVar.f20237g);
                        this.f20238h = (Timestamp) visitor.visitMessage(this.f20238h, bVar.f20238h);
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
                                        Builder builder = this.f20235e != null ? (C6844b) this.f20235e.toBuilder() : null;
                                        this.f20235e = (PlaceProto$Place) codedInputStream.readMessage(PlaceProto$Place.parser(), extensionRegistryLite);
                                        if (builder != null) {
                                            builder.mergeFrom(this.f20235e);
                                            this.f20235e = (PlaceProto$Place) builder.buildPartial();
                                        }
                                    } else if (readTag == 18) {
                                        Builder builder2 = this.f20236f != null ? (C6844b) this.f20236f.toBuilder() : null;
                                        this.f20236f = (PlaceProto$Place) codedInputStream.readMessage(PlaceProto$Place.parser(), extensionRegistryLite);
                                        if (builder2 != null) {
                                            builder2.mergeFrom(this.f20236f);
                                            this.f20236f = (PlaceProto$Place) builder2.buildPartial();
                                        }
                                    } else if (readTag == 26) {
                                        Builder builder3 = this.f20237g != null ? (Timestamp.Builder) this.f20237g.toBuilder() : null;
                                        this.f20237g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                        if (builder3 != null) {
                                            builder3.mergeFrom(this.f20237g);
                                            this.f20237g = (Timestamp) builder3.buildPartial();
                                        }
                                    } else if (readTag == 34) {
                                        Builder builder4 = this.f20238h != null ? (Timestamp.Builder) this.f20238h.toBuilder() : null;
                                        this.f20238h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                        if (builder4 != null) {
                                            builder4.mergeFrom(this.f20238h);
                                            this.f20238h = (Timestamp) builder4.buildPartial();
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
                        if (f20234j == null) {
                            synchronized (C7967b.class) {
                                if (f20234j == null) {
                                    f20234j = new DefaultInstanceBasedParser(f20233i);
                                }
                            }
                        }
                        return f20234j;
                    default:
                        throw new UnsupportedOperationException();
                }
                return f20233i;
            }

            public Timestamp getDepartureTime() {
                Timestamp timestamp = this.f20238h;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            public PlaceProto$Place getDestination() {
                PlaceProto$Place placeProto$Place = this.f20235e;
                return placeProto$Place == null ? PlaceProto$Place.getDefaultInstance() : placeProto$Place;
            }

            public Timestamp getEta() {
                Timestamp timestamp = this.f20237g;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            public PlaceProto$Place getOrigin() {
                PlaceProto$Place placeProto$Place = this.f20236f;
                return placeProto$Place == null ? PlaceProto$Place.getDefaultInstance() : placeProto$Place;
            }

            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if (this.f20235e != null) {
                    i2 = 0 + CodedOutputStream.computeMessageSize(1, getDestination());
                }
                if (this.f20236f != null) {
                    i2 += CodedOutputStream.computeMessageSize(2, getOrigin());
                }
                if (this.f20237g != null) {
                    i2 += CodedOutputStream.computeMessageSize(3, getEta());
                }
                if (this.f20238h != null) {
                    i2 += CodedOutputStream.computeMessageSize(4, getDepartureTime());
                }
                this.memoizedSerializedSize = i2;
                return i2;
            }

            public boolean hasDepartureTime() {
                return this.f20238h != null;
            }

            public boolean hasDestination() {
                return this.f20235e != null;
            }

            public boolean hasEta() {
                return this.f20237g != null;
            }

            public boolean hasOrigin() {
                return this.f20236f != null;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (this.f20235e != null) {
                    codedOutputStream.writeMessage(1, getDestination());
                }
                if (this.f20236f != null) {
                    codedOutputStream.writeMessage(2, getOrigin());
                }
                if (this.f20237g != null) {
                    codedOutputStream.writeMessage(3, getEta());
                }
                if (this.f20238h != null) {
                    codedOutputStream.writeMessage(4, getDepartureTime());
                }
            }
        }

        /* renamed from: co.znly.models.services.ZenlyProto$UserVisitPointResponse$UserVisitPoint$c */
        public enum C7969c implements EnumLite {
            STATUS_UNKNOWN(0),
            STATUS_STATIC(1),
            STATUS_MOVING(2),
            UNRECOGNIZED(-1);
            

            /* renamed from: e */
            private final int f20244e;

            /* renamed from: co.znly.models.services.ZenlyProto$UserVisitPointResponse$UserVisitPoint$c$a */
            class C7970a implements EnumLiteMap<C7969c> {
                C7970a() {
                }

                public C7969c findValueByNumber(int i) {
                    return C7969c.m19034a(i);
                }
            }

            static {
                new C7970a();
            }

            private C7969c(int i) {
                this.f20244e = i;
            }

            /* renamed from: a */
            public static C7969c m19034a(int i) {
                if (i == 0) {
                    return STATUS_UNKNOWN;
                }
                if (i == 1) {
                    return STATUS_STATIC;
                }
                if (i != 2) {
                    return null;
                }
                return STATUS_MOVING;
            }

            public final int getNumber() {
                return this.f20244e;
            }
        }

        static {
            f20224l.makeImmutable();
        }

        private UserVisitPoint() {
        }

        public static Parser<UserVisitPoint> parser() {
            return f20224l.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserVisitPoint();
                case 2:
                    return f20224l;
                case 3:
                    return null;
                case 4:
                    return new C7966a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    UserVisitPoint userVisitPoint = (UserVisitPoint) obj2;
                    this.f20226e = visitor.visitString(!this.f20226e.isEmpty(), this.f20226e, !userVisitPoint.f20226e.isEmpty(), userVisitPoint.f20226e);
                    this.f20227f = visitor.visitInt(this.f20227f != 0, this.f20227f, userVisitPoint.f20227f != 0, userVisitPoint.f20227f);
                    this.f20228g = (C6943a0) visitor.visitMessage(this.f20228g, userVisitPoint.f20228g);
                    this.f20229h = (Timestamp) visitor.visitMessage(this.f20229h, userVisitPoint.f20229h);
                    this.f20230i = (Timestamp) visitor.visitMessage(this.f20230i, userVisitPoint.f20230i);
                    boolean z2 = this.f20231j != 0;
                    int i = this.f20231j;
                    if (userVisitPoint.f20231j != 0) {
                        z = true;
                    }
                    this.f20231j = visitor.visitInt(z2, i, z, userVisitPoint.f20231j);
                    this.f20232k = (C7967b) visitor.visitMessage(this.f20232k, userVisitPoint.f20232k);
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
                                    this.f20226e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    Builder builder = this.f20228g != null ? (C6944a) this.f20228g.toBuilder() : null;
                                    this.f20228g = (C6943a0) codedInputStream.readMessage(C6943a0.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f20228g);
                                        this.f20228g = (C6943a0) builder.buildPartial();
                                    }
                                } else if (readTag == 26) {
                                    Builder builder2 = this.f20229h != null ? (Timestamp.Builder) this.f20229h.toBuilder() : null;
                                    this.f20229h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder2 != null) {
                                        builder2.mergeFrom(this.f20229h);
                                        this.f20229h = (Timestamp) builder2.buildPartial();
                                    }
                                } else if (readTag == 32) {
                                    this.f20227f = codedInputStream.readEnum();
                                } else if (readTag == 40) {
                                    this.f20231j = codedInputStream.readEnum();
                                } else if (readTag == 50) {
                                    Builder builder3 = this.f20232k != null ? (C7968a) this.f20232k.toBuilder() : null;
                                    this.f20232k = (C7967b) codedInputStream.readMessage(C7967b.parser(), extensionRegistryLite);
                                    if (builder3 != null) {
                                        builder3.mergeFrom(this.f20232k);
                                        this.f20232k = (C7967b) builder3.buildPartial();
                                    }
                                } else if (readTag == 58) {
                                    Builder builder4 = this.f20230i != null ? (Timestamp.Builder) this.f20230i.toBuilder() : null;
                                    this.f20230i = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder4 != null) {
                                        builder4.mergeFrom(this.f20230i);
                                        this.f20230i = (Timestamp) builder4.buildPartial();
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
                    if (f20225m == null) {
                        synchronized (UserVisitPoint.class) {
                            if (f20225m == null) {
                                f20225m = new DefaultInstanceBasedParser(f20224l);
                            }
                        }
                    }
                    return f20225m;
                default:
                    throw new UnsupportedOperationException();
            }
            return f20224l;
        }

        public C7967b getHeading() {
            C7967b bVar = this.f20232k;
            return bVar == null ? C7967b.getDefaultInstance() : bVar;
        }

        public C6847b getPlaceTag() {
            C6847b a = C6847b.m17595a(this.f20231j);
            return a == null ? C6847b.UNRECOGNIZED : a;
        }

        public int getPlaceTagValue() {
            return this.f20231j;
        }

        public C6943a0 getPoint() {
            C6943a0 a0Var = this.f20228g;
            return a0Var == null ? C6943a0.getDefaultInstance() : a0Var;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f20226e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getUserUuid());
            }
            if (this.f20228g != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getPoint());
            }
            if (this.f20229h != null) {
                i2 += CodedOutputStream.computeMessageSize(3, getTimeIn());
            }
            if (this.f20227f != C7969c.STATUS_UNKNOWN.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(4, this.f20227f);
            }
            if (this.f20231j != C6847b.NOLABEL.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(5, this.f20231j);
            }
            if (this.f20232k != null) {
                i2 += CodedOutputStream.computeMessageSize(6, getHeading());
            }
            if (this.f20230i != null) {
                i2 += CodedOutputStream.computeMessageSize(7, getTimeOut());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C7969c getStatus() {
            C7969c a = C7969c.m19034a(this.f20227f);
            return a == null ? C7969c.UNRECOGNIZED : a;
        }

        public int getStatusValue() {
            return this.f20227f;
        }

        public Timestamp getTimeIn() {
            Timestamp timestamp = this.f20229h;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp getTimeOut() {
            Timestamp timestamp = this.f20230i;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public String getUserUuid() {
            return this.f20226e;
        }

        public ByteString getUserUuidBytes() {
            return ByteString.copyFromUtf8(this.f20226e);
        }

        public boolean hasHeading() {
            return this.f20232k != null;
        }

        public boolean hasPoint() {
            return this.f20228g != null;
        }

        public boolean hasTimeIn() {
            return this.f20229h != null;
        }

        public boolean hasTimeOut() {
            return this.f20230i != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f20226e.isEmpty()) {
                codedOutputStream.writeString(1, getUserUuid());
            }
            if (this.f20228g != null) {
                codedOutputStream.writeMessage(2, getPoint());
            }
            if (this.f20229h != null) {
                codedOutputStream.writeMessage(3, getTimeIn());
            }
            if (this.f20227f != C7969c.STATUS_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(4, this.f20227f);
            }
            if (this.f20231j != C6847b.NOLABEL.getNumber()) {
                codedOutputStream.writeEnum(5, this.f20231j);
            }
            if (this.f20232k != null) {
                codedOutputStream.writeMessage(6, getHeading());
            }
            if (this.f20230i != null) {
                codedOutputStream.writeMessage(7, getTimeOut());
            }
        }
    }

    /* renamed from: co.znly.models.services.ZenlyProto$UserVisitPointResponse$UserVisitPointOrBuilder */
    public interface UserVisitPointOrBuilder extends MessageLiteOrBuilder {
        C7967b getHeading();

        C6847b getPlaceTag();

        int getPlaceTagValue();

        C6943a0 getPoint();

        C7969c getStatus();

        int getStatusValue();

        Timestamp getTimeIn();

        Timestamp getTimeOut();

        String getUserUuid();

        ByteString getUserUuidBytes();

        boolean hasHeading();

        boolean hasPoint();

        boolean hasTimeIn();

        boolean hasTimeOut();
    }

    /* renamed from: co.znly.models.services.ZenlyProto$UserVisitPointResponse$a */
    public static final class C7971a extends Builder<ZenlyProto$UserVisitPointResponse, C7971a> implements ZenlyProto$UserVisitPointResponseOrBuilder {
        private C7971a() {
            super(ZenlyProto$UserVisitPointResponse.f20221f);
        }

        /* synthetic */ C7971a(C8104i0 i0Var) {
            this();
        }

        public UserVisitPoint getUserVisitPoints(int i) {
            return ((ZenlyProto$UserVisitPointResponse) this.instance).getUserVisitPoints(i);
        }

        public int getUserVisitPointsCount() {
            return ((ZenlyProto$UserVisitPointResponse) this.instance).getUserVisitPointsCount();
        }

        public List<UserVisitPoint> getUserVisitPointsList() {
            return Collections.unmodifiableList(((ZenlyProto$UserVisitPointResponse) this.instance).getUserVisitPointsList());
        }
    }

    static {
        f20221f.makeImmutable();
    }

    private ZenlyProto$UserVisitPointResponse() {
    }

    public static C7971a newBuilder() {
        return (C7971a) f20221f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new ZenlyProto$UserVisitPointResponse();
            case 2:
                return f20221f;
            case 3:
                this.f20223e.makeImmutable();
                return null;
            case 4:
                return new C7971a(null);
            case 5:
                this.f20223e = ((Visitor) obj).visitList(this.f20223e, ((ZenlyProto$UserVisitPointResponse) obj2).f20223e);
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
                                if (!this.f20223e.isModifiable()) {
                                    this.f20223e = GeneratedMessageLite.mutableCopy(this.f20223e);
                                }
                                this.f20223e.add(codedInputStream.readMessage(UserVisitPoint.parser(), extensionRegistryLite));
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
                if (f20222g == null) {
                    synchronized (ZenlyProto$UserVisitPointResponse.class) {
                        if (f20222g == null) {
                            f20222g = new DefaultInstanceBasedParser(f20221f);
                        }
                    }
                }
                return f20222g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20221f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20223e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20223e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserVisitPoint getUserVisitPoints(int i) {
        return (UserVisitPoint) this.f20223e.get(i);
    }

    public int getUserVisitPointsCount() {
        return this.f20223e.size();
    }

    public List<UserVisitPoint> getUserVisitPointsList() {
        return this.f20223e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20223e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20223e.get(i));
        }
    }
}
