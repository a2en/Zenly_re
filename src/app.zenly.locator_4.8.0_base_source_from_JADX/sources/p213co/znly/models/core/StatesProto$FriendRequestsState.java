package p213co.znly.models.core;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
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
import p213co.znly.models.C7280e;
import p213co.znly.models.services.ZenlyProto$FriendRequestWithUser;
import p213co.znly.models.services.ZenlyProto$FriendRequestWithUser.C7949b;

/* renamed from: co.znly.models.core.StatesProto$FriendRequestsState */
public final class StatesProto$FriendRequestsState extends GeneratedMessageLite<StatesProto$FriendRequestsState, C7017a> implements StatesProto$FriendRequestsStateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final StatesProto$FriendRequestsState f17344g = new StatesProto$FriendRequestsState();

    /* renamed from: h */
    private static volatile Parser<StatesProto$FriendRequestsState> f17345h;

    /* renamed from: e */
    private C7020c f17346e;

    /* renamed from: f */
    private C7018b f17347f;

    /* renamed from: co.znly.models.core.StatesProto$FriendRequestsState$EventOrBuilder */
    public interface EventOrBuilder extends MessageLiteOrBuilder {
        ZenlyProto$FriendRequestWithUser getEntity();

        C7280e getOp();

        int getOpValue();

        boolean hasEntity();
    }

    /* renamed from: co.znly.models.core.StatesProto$FriendRequestsState$StateOrBuilder */
    public interface StateOrBuilder extends MessageLiteOrBuilder {
        ZenlyProto$FriendRequestWithUser getState(int i);

        int getStateCount();

        List<ZenlyProto$FriendRequestWithUser> getStateList();

        C7188p1 getStatus();

        int getStatusValue();
    }

    /* renamed from: co.znly.models.core.StatesProto$FriendRequestsState$a */
    public static final class C7017a extends Builder<StatesProto$FriendRequestsState, C7017a> implements StatesProto$FriendRequestsStateOrBuilder {
        /* synthetic */ C7017a(C7137k1 k1Var) {
            this();
        }

        public C7018b getEvent() {
            return ((StatesProto$FriendRequestsState) this.instance).getEvent();
        }

        public C7020c getState() {
            return ((StatesProto$FriendRequestsState) this.instance).getState();
        }

        public boolean hasEvent() {
            return ((StatesProto$FriendRequestsState) this.instance).hasEvent();
        }

        public boolean hasState() {
            return ((StatesProto$FriendRequestsState) this.instance).hasState();
        }

        private C7017a() {
            super(StatesProto$FriendRequestsState.f17344g);
        }
    }

    /* renamed from: co.znly.models.core.StatesProto$FriendRequestsState$b */
    public static final class C7018b extends GeneratedMessageLite<C7018b, C7019a> implements EventOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C7018b f17348g = new C7018b();

        /* renamed from: h */
        private static volatile Parser<C7018b> f17349h;

        /* renamed from: e */
        private int f17350e;

        /* renamed from: f */
        private ZenlyProto$FriendRequestWithUser f17351f;

        /* renamed from: co.znly.models.core.StatesProto$FriendRequestsState$b$a */
        public static final class C7019a extends Builder<C7018b, C7019a> implements EventOrBuilder {
            /* synthetic */ C7019a(C7137k1 k1Var) {
                this();
            }

            public ZenlyProto$FriendRequestWithUser getEntity() {
                return ((C7018b) this.instance).getEntity();
            }

            public C7280e getOp() {
                return ((C7018b) this.instance).getOp();
            }

            public int getOpValue() {
                return ((C7018b) this.instance).getOpValue();
            }

            public boolean hasEntity() {
                return ((C7018b) this.instance).hasEntity();
            }

            private C7019a() {
                super(C7018b.f17348g);
            }
        }

        static {
            f17348g.makeImmutable();
        }

        private C7018b() {
        }

        public static C7018b getDefaultInstance() {
            return f17348g;
        }

        public static Parser<C7018b> parser() {
            return f17348g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7018b();
                case 2:
                    return f17348g;
                case 3:
                    return null;
                case 4:
                    return new C7019a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7018b bVar = (C7018b) obj2;
                    boolean z2 = this.f17350e != 0;
                    int i = this.f17350e;
                    if (bVar.f17350e != 0) {
                        z = true;
                    }
                    this.f17350e = visitor.visitInt(z2, i, z, bVar.f17350e);
                    this.f17351f = (ZenlyProto$FriendRequestWithUser) visitor.visitMessage(this.f17351f, bVar.f17351f);
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.f17350e = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    Builder builder = this.f17351f != null ? (C7949b) this.f17351f.toBuilder() : null;
                                    this.f17351f = (ZenlyProto$FriendRequestWithUser) codedInputStream.readMessage(ZenlyProto$FriendRequestWithUser.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f17351f);
                                        this.f17351f = (ZenlyProto$FriendRequestWithUser) builder.buildPartial();
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
                    if (f17349h == null) {
                        synchronized (C7018b.class) {
                            if (f17349h == null) {
                                f17349h = new DefaultInstanceBasedParser(f17348g);
                            }
                        }
                    }
                    return f17349h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17348g;
        }

        public ZenlyProto$FriendRequestWithUser getEntity() {
            ZenlyProto$FriendRequestWithUser zenlyProto$FriendRequestWithUser = this.f17351f;
            return zenlyProto$FriendRequestWithUser == null ? ZenlyProto$FriendRequestWithUser.getDefaultInstance() : zenlyProto$FriendRequestWithUser;
        }

        public C7280e getOp() {
            C7280e a = C7280e.m17990a(this.f17350e);
            return a == null ? C7280e.UNRECOGNIZED : a;
        }

        public int getOpValue() {
            return this.f17350e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f17350e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f17350e);
            }
            if (this.f17351f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getEntity());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasEntity() {
            return this.f17351f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f17350e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f17350e);
            }
            if (this.f17351f != null) {
                codedOutputStream.writeMessage(2, getEntity());
            }
        }
    }

    /* renamed from: co.znly.models.core.StatesProto$FriendRequestsState$c */
    public static final class C7020c extends GeneratedMessageLite<C7020c, C7021a> implements StateOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C7020c f17352h = new C7020c();

        /* renamed from: i */
        private static volatile Parser<C7020c> f17353i;

        /* renamed from: e */
        private int f17354e;

        /* renamed from: f */
        private ProtobufList<ZenlyProto$FriendRequestWithUser> f17355f = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: g */
        private int f17356g;

        /* renamed from: co.znly.models.core.StatesProto$FriendRequestsState$c$a */
        public static final class C7021a extends Builder<C7020c, C7021a> implements StateOrBuilder {
            /* synthetic */ C7021a(C7137k1 k1Var) {
                this();
            }

            public ZenlyProto$FriendRequestWithUser getState(int i) {
                return ((C7020c) this.instance).getState(i);
            }

            public int getStateCount() {
                return ((C7020c) this.instance).getStateCount();
            }

            public List<ZenlyProto$FriendRequestWithUser> getStateList() {
                return Collections.unmodifiableList(((C7020c) this.instance).getStateList());
            }

            public C7188p1 getStatus() {
                return ((C7020c) this.instance).getStatus();
            }

            public int getStatusValue() {
                return ((C7020c) this.instance).getStatusValue();
            }

            private C7021a() {
                super(C7020c.f17352h);
            }
        }

        static {
            f17352h.makeImmutable();
        }

        private C7020c() {
        }

        public static C7020c getDefaultInstance() {
            return f17352h;
        }

        public static Parser<C7020c> parser() {
            return f17352h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7020c();
                case 2:
                    return f17352h;
                case 3:
                    this.f17355f.makeImmutable();
                    return null;
                case 4:
                    return new C7021a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7020c cVar = (C7020c) obj2;
                    this.f17355f = visitor.visitList(this.f17355f, cVar.f17355f);
                    boolean z2 = this.f17356g != 0;
                    int i = this.f17356g;
                    if (cVar.f17356g != 0) {
                        z = true;
                    }
                    this.f17356g = visitor.visitInt(z2, i, z, cVar.f17356g);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f17354e |= cVar.f17354e;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    if (!this.f17355f.isModifiable()) {
                                        this.f17355f = GeneratedMessageLite.mutableCopy(this.f17355f);
                                    }
                                    this.f17355f.add(codedInputStream.readMessage(ZenlyProto$FriendRequestWithUser.parser(), extensionRegistryLite));
                                } else if (readTag == 16) {
                                    this.f17356g = codedInputStream.readEnum();
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
                    if (f17353i == null) {
                        synchronized (C7020c.class) {
                            if (f17353i == null) {
                                f17353i = new DefaultInstanceBasedParser(f17352h);
                            }
                        }
                    }
                    return f17353i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17352h;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f17355f.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17355f.get(i3));
            }
            if (this.f17356g != C7188p1.CACHE.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(2, this.f17356g);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public ZenlyProto$FriendRequestWithUser getState(int i) {
            return (ZenlyProto$FriendRequestWithUser) this.f17355f.get(i);
        }

        public int getStateCount() {
            return this.f17355f.size();
        }

        public List<ZenlyProto$FriendRequestWithUser> getStateList() {
            return this.f17355f;
        }

        public C7188p1 getStatus() {
            C7188p1 a = C7188p1.m17903a(this.f17356g);
            return a == null ? C7188p1.UNRECOGNIZED : a;
        }

        public int getStatusValue() {
            return this.f17356g;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f17355f.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f17355f.get(i));
            }
            if (this.f17356g != C7188p1.CACHE.getNumber()) {
                codedOutputStream.writeEnum(2, this.f17356g);
            }
        }
    }

    static {
        f17344g.makeImmutable();
    }

    private StatesProto$FriendRequestsState() {
    }

    public static C7017a newBuilder() {
        return (C7017a) f17344g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
            case 1:
                return new StatesProto$FriendRequestsState();
            case 2:
                return f17344g;
            case 3:
                return null;
            case 4:
                return new C7017a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                StatesProto$FriendRequestsState statesProto$FriendRequestsState = (StatesProto$FriendRequestsState) obj2;
                this.f17346e = (C7020c) visitor.visitMessage(this.f17346e, statesProto$FriendRequestsState.f17346e);
                this.f17347f = (C7018b) visitor.visitMessage(this.f17347f, statesProto$FriendRequestsState.f17347f);
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
                                Builder builder = this.f17346e != null ? (C7021a) this.f17346e.toBuilder() : null;
                                this.f17346e = (C7020c) codedInputStream.readMessage(C7020c.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17346e);
                                    this.f17346e = (C7020c) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f17347f != null ? (C7019a) this.f17347f.toBuilder() : null;
                                this.f17347f = (C7018b) codedInputStream.readMessage(C7018b.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17347f);
                                    this.f17347f = (C7018b) builder2.buildPartial();
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
                if (f17345h == null) {
                    synchronized (StatesProto$FriendRequestsState.class) {
                        if (f17345h == null) {
                            f17345h = new DefaultInstanceBasedParser(f17344g);
                        }
                    }
                }
                return f17345h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17344g;
    }

    public C7018b getEvent() {
        C7018b bVar = this.f17347f;
        return bVar == null ? C7018b.getDefaultInstance() : bVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17346e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getState());
        }
        if (this.f17347f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getEvent());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7020c getState() {
        C7020c cVar = this.f17346e;
        return cVar == null ? C7020c.getDefaultInstance() : cVar;
    }

    public boolean hasEvent() {
        return this.f17347f != null;
    }

    public boolean hasState() {
        return this.f17346e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17346e != null) {
            codedOutputStream.writeMessage(1, getState());
        }
        if (this.f17347f != null) {
            codedOutputStream.writeMessage(2, getEvent());
        }
    }
}
