package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6809a;
import p213co.znly.models.PlaceProto$Place;
import p213co.znly.models.PlaceProto$Place.C6844b;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.services.ZenlyProto$FriendRequestWithUser */
public final class ZenlyProto$FriendRequestWithUser extends GeneratedMessageLite<ZenlyProto$FriendRequestWithUser, C7949b> implements ZenlyProto$FriendRequestWithUserOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final ZenlyProto$FriendRequestWithUser f20155h = new ZenlyProto$FriendRequestWithUser();

    /* renamed from: i */
    private static volatile Parser<ZenlyProto$FriendRequestWithUser> f20156i;

    /* renamed from: e */
    private FriendRequestProto$FriendRequest f20157e;

    /* renamed from: f */
    private UserProto$User f20158f;

    /* renamed from: g */
    private C7947a f20159g;

    /* renamed from: co.znly.models.services.ZenlyProto$FriendRequestWithUser$AuthorInformationsOrBuilder */
    public interface AuthorInformationsOrBuilder extends MessageLiteOrBuilder {
        PlaceProto$Place getHometown();

        PlaceProto$Place getSharedSchool();

        PlaceProto$Place getSharedWork();

        boolean hasHometown();

        boolean hasSharedSchool();

        boolean hasSharedWork();
    }

    /* renamed from: co.znly.models.services.ZenlyProto$FriendRequestWithUser$a */
    public static final class C7947a extends GeneratedMessageLite<C7947a, C7948a> implements AuthorInformationsOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C7947a f20160h = new C7947a();

        /* renamed from: i */
        private static volatile Parser<C7947a> f20161i;

        /* renamed from: e */
        private PlaceProto$Place f20162e;

        /* renamed from: f */
        private PlaceProto$Place f20163f;

        /* renamed from: g */
        private PlaceProto$Place f20164g;

        /* renamed from: co.znly.models.services.ZenlyProto$FriendRequestWithUser$a$a */
        public static final class C7948a extends Builder<C7947a, C7948a> implements AuthorInformationsOrBuilder {
            /* synthetic */ C7948a(C8104i0 i0Var) {
                this();
            }

            public PlaceProto$Place getHometown() {
                return ((C7947a) this.instance).getHometown();
            }

            public PlaceProto$Place getSharedSchool() {
                return ((C7947a) this.instance).getSharedSchool();
            }

            public PlaceProto$Place getSharedWork() {
                return ((C7947a) this.instance).getSharedWork();
            }

            public boolean hasHometown() {
                return ((C7947a) this.instance).hasHometown();
            }

            public boolean hasSharedSchool() {
                return ((C7947a) this.instance).hasSharedSchool();
            }

            public boolean hasSharedWork() {
                return ((C7947a) this.instance).hasSharedWork();
            }

            private C7948a() {
                super(C7947a.f20160h);
            }
        }

        static {
            f20160h.makeImmutable();
        }

        private C7947a() {
        }

        public static C7947a getDefaultInstance() {
            return f20160h;
        }

        public static Parser<C7947a> parser() {
            return f20160h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7947a();
                case 2:
                    return f20160h;
                case 3:
                    return null;
                case 4:
                    return new C7948a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7947a aVar = (C7947a) obj2;
                    this.f20162e = (PlaceProto$Place) visitor.visitMessage(this.f20162e, aVar.f20162e);
                    this.f20163f = (PlaceProto$Place) visitor.visitMessage(this.f20163f, aVar.f20163f);
                    this.f20164g = (PlaceProto$Place) visitor.visitMessage(this.f20164g, aVar.f20164g);
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
                                    Builder builder = this.f20162e != null ? (C6844b) this.f20162e.toBuilder() : null;
                                    this.f20162e = (PlaceProto$Place) codedInputStream.readMessage(PlaceProto$Place.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f20162e);
                                        this.f20162e = (PlaceProto$Place) builder.buildPartial();
                                    }
                                } else if (readTag == 26) {
                                    Builder builder2 = this.f20163f != null ? (C6844b) this.f20163f.toBuilder() : null;
                                    this.f20163f = (PlaceProto$Place) codedInputStream.readMessage(PlaceProto$Place.parser(), extensionRegistryLite);
                                    if (builder2 != null) {
                                        builder2.mergeFrom(this.f20163f);
                                        this.f20163f = (PlaceProto$Place) builder2.buildPartial();
                                    }
                                } else if (readTag == 34) {
                                    Builder builder3 = this.f20164g != null ? (C6844b) this.f20164g.toBuilder() : null;
                                    this.f20164g = (PlaceProto$Place) codedInputStream.readMessage(PlaceProto$Place.parser(), extensionRegistryLite);
                                    if (builder3 != null) {
                                        builder3.mergeFrom(this.f20164g);
                                        this.f20164g = (PlaceProto$Place) builder3.buildPartial();
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
                    if (f20161i == null) {
                        synchronized (C7947a.class) {
                            if (f20161i == null) {
                                f20161i = new DefaultInstanceBasedParser(f20160h);
                            }
                        }
                    }
                    return f20161i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f20160h;
        }

        public PlaceProto$Place getHometown() {
            PlaceProto$Place placeProto$Place = this.f20162e;
            return placeProto$Place == null ? PlaceProto$Place.getDefaultInstance() : placeProto$Place;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f20162e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getHometown());
            }
            if (this.f20163f != null) {
                i2 += CodedOutputStream.computeMessageSize(3, getSharedSchool());
            }
            if (this.f20164g != null) {
                i2 += CodedOutputStream.computeMessageSize(4, getSharedWork());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public PlaceProto$Place getSharedSchool() {
            PlaceProto$Place placeProto$Place = this.f20163f;
            return placeProto$Place == null ? PlaceProto$Place.getDefaultInstance() : placeProto$Place;
        }

        public PlaceProto$Place getSharedWork() {
            PlaceProto$Place placeProto$Place = this.f20164g;
            return placeProto$Place == null ? PlaceProto$Place.getDefaultInstance() : placeProto$Place;
        }

        public boolean hasHometown() {
            return this.f20162e != null;
        }

        public boolean hasSharedSchool() {
            return this.f20163f != null;
        }

        public boolean hasSharedWork() {
            return this.f20164g != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f20162e != null) {
                codedOutputStream.writeMessage(1, getHometown());
            }
            if (this.f20163f != null) {
                codedOutputStream.writeMessage(3, getSharedSchool());
            }
            if (this.f20164g != null) {
                codedOutputStream.writeMessage(4, getSharedWork());
            }
        }
    }

    /* renamed from: co.znly.models.services.ZenlyProto$FriendRequestWithUser$b */
    public static final class C7949b extends Builder<ZenlyProto$FriendRequestWithUser, C7949b> implements ZenlyProto$FriendRequestWithUserOrBuilder {
        /* synthetic */ C7949b(C8104i0 i0Var) {
            this();
        }

        public C7947a getAuthorInformations() {
            return ((ZenlyProto$FriendRequestWithUser) this.instance).getAuthorInformations();
        }

        public FriendRequestProto$FriendRequest getFriendRequest() {
            return ((ZenlyProto$FriendRequestWithUser) this.instance).getFriendRequest();
        }

        public UserProto$User getUser() {
            return ((ZenlyProto$FriendRequestWithUser) this.instance).getUser();
        }

        public boolean hasAuthorInformations() {
            return ((ZenlyProto$FriendRequestWithUser) this.instance).hasAuthorInformations();
        }

        public boolean hasFriendRequest() {
            return ((ZenlyProto$FriendRequestWithUser) this.instance).hasFriendRequest();
        }

        public boolean hasUser() {
            return ((ZenlyProto$FriendRequestWithUser) this.instance).hasUser();
        }

        private C7949b() {
            super(ZenlyProto$FriendRequestWithUser.f20155h);
        }
    }

    static {
        f20155h.makeImmutable();
    }

    private ZenlyProto$FriendRequestWithUser() {
    }

    public static ZenlyProto$FriendRequestWithUser getDefaultInstance() {
        return f20155h;
    }

    public static C7949b newBuilder() {
        return (C7949b) f20155h.toBuilder();
    }

    public static Parser<ZenlyProto$FriendRequestWithUser> parser() {
        return f20155h.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new ZenlyProto$FriendRequestWithUser();
            case 2:
                return f20155h;
            case 3:
                return null;
            case 4:
                return new C7949b(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                ZenlyProto$FriendRequestWithUser zenlyProto$FriendRequestWithUser = (ZenlyProto$FriendRequestWithUser) obj2;
                this.f20157e = (FriendRequestProto$FriendRequest) visitor.visitMessage(this.f20157e, zenlyProto$FriendRequestWithUser.f20157e);
                this.f20158f = (UserProto$User) visitor.visitMessage(this.f20158f, zenlyProto$FriendRequestWithUser.f20158f);
                this.f20159g = (C7947a) visitor.visitMessage(this.f20159g, zenlyProto$FriendRequestWithUser.f20159g);
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
                                Builder builder = this.f20157e != null ? (C6809a) this.f20157e.toBuilder() : null;
                                this.f20157e = (FriendRequestProto$FriendRequest) codedInputStream.readMessage(FriendRequestProto$FriendRequest.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20157e);
                                    this.f20157e = (FriendRequestProto$FriendRequest) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f20158f != null ? (C6925a) this.f20158f.toBuilder() : null;
                                this.f20158f = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20158f);
                                    this.f20158f = (UserProto$User) builder2.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder3 = this.f20159g != null ? (C7948a) this.f20159g.toBuilder() : null;
                                this.f20159g = (C7947a) codedInputStream.readMessage(C7947a.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f20159g);
                                    this.f20159g = (C7947a) builder3.buildPartial();
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
                if (f20156i == null) {
                    synchronized (ZenlyProto$FriendRequestWithUser.class) {
                        if (f20156i == null) {
                            f20156i = new DefaultInstanceBasedParser(f20155h);
                        }
                    }
                }
                return f20156i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20155h;
    }

    public C7947a getAuthorInformations() {
        C7947a aVar = this.f20159g;
        return aVar == null ? C7947a.getDefaultInstance() : aVar;
    }

    public FriendRequestProto$FriendRequest getFriendRequest() {
        FriendRequestProto$FriendRequest friendRequestProto$FriendRequest = this.f20157e;
        return friendRequestProto$FriendRequest == null ? FriendRequestProto$FriendRequest.getDefaultInstance() : friendRequestProto$FriendRequest;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20157e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getFriendRequest());
        }
        if (this.f20158f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getUser());
        }
        if (this.f20159g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getAuthorInformations());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getUser() {
        UserProto$User userProto$User = this.f20158f;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasAuthorInformations() {
        return this.f20159g != null;
    }

    public boolean hasFriendRequest() {
        return this.f20157e != null;
    }

    public boolean hasUser() {
        return this.f20158f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20157e != null) {
            codedOutputStream.writeMessage(1, getFriendRequest());
        }
        if (this.f20158f != null) {
            codedOutputStream.writeMessage(2, getUser());
        }
        if (this.f20159g != null) {
            codedOutputStream.writeMessage(3, getAuthorInformations());
        }
    }
}
