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
import p213co.znly.models.C6980c3;
import p213co.znly.models.C6980c3.C6981a;
import p213co.znly.models.C7280e;

/* renamed from: co.znly.models.core.StatesProto$FriendshipsState */
public final class StatesProto$FriendshipsState extends GeneratedMessageLite<StatesProto$FriendshipsState, C7027a> implements StatesProto$FriendshipsStateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final StatesProto$FriendshipsState f17370g = new StatesProto$FriendshipsState();

    /* renamed from: h */
    private static volatile Parser<StatesProto$FriendshipsState> f17371h;

    /* renamed from: e */
    private C7030c f17372e;

    /* renamed from: f */
    private C7028b f17373f;

    /* renamed from: co.znly.models.core.StatesProto$FriendshipsState$EventOrBuilder */
    public interface EventOrBuilder extends MessageLiteOrBuilder {
        C6980c3 getEntity();

        C7280e getOp();

        int getOpValue();

        boolean hasEntity();
    }

    /* renamed from: co.znly.models.core.StatesProto$FriendshipsState$StateOrBuilder */
    public interface StateOrBuilder extends MessageLiteOrBuilder {
        C6980c3 getState(int i);

        int getStateCount();

        List<C6980c3> getStateList();

        C7188p1 getStatus();

        int getStatusValue();
    }

    /* renamed from: co.znly.models.core.StatesProto$FriendshipsState$a */
    public static final class C7027a extends Builder<StatesProto$FriendshipsState, C7027a> implements StatesProto$FriendshipsStateOrBuilder {
        /* synthetic */ C7027a(C7137k1 k1Var) {
            this();
        }

        public C7028b getEvent() {
            return ((StatesProto$FriendshipsState) this.instance).getEvent();
        }

        public C7030c getState() {
            return ((StatesProto$FriendshipsState) this.instance).getState();
        }

        public boolean hasEvent() {
            return ((StatesProto$FriendshipsState) this.instance).hasEvent();
        }

        public boolean hasState() {
            return ((StatesProto$FriendshipsState) this.instance).hasState();
        }

        private C7027a() {
            super(StatesProto$FriendshipsState.f17370g);
        }
    }

    /* renamed from: co.znly.models.core.StatesProto$FriendshipsState$b */
    public static final class C7028b extends GeneratedMessageLite<C7028b, C7029a> implements EventOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C7028b f17374g = new C7028b();

        /* renamed from: h */
        private static volatile Parser<C7028b> f17375h;

        /* renamed from: e */
        private int f17376e;

        /* renamed from: f */
        private C6980c3 f17377f;

        /* renamed from: co.znly.models.core.StatesProto$FriendshipsState$b$a */
        public static final class C7029a extends Builder<C7028b, C7029a> implements EventOrBuilder {
            /* synthetic */ C7029a(C7137k1 k1Var) {
                this();
            }

            public C6980c3 getEntity() {
                return ((C7028b) this.instance).getEntity();
            }

            public C7280e getOp() {
                return ((C7028b) this.instance).getOp();
            }

            public int getOpValue() {
                return ((C7028b) this.instance).getOpValue();
            }

            public boolean hasEntity() {
                return ((C7028b) this.instance).hasEntity();
            }

            private C7029a() {
                super(C7028b.f17374g);
            }
        }

        static {
            f17374g.makeImmutable();
        }

        private C7028b() {
        }

        public static C7028b getDefaultInstance() {
            return f17374g;
        }

        public static Parser<C7028b> parser() {
            return f17374g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7028b();
                case 2:
                    return f17374g;
                case 3:
                    return null;
                case 4:
                    return new C7029a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7028b bVar = (C7028b) obj2;
                    boolean z2 = this.f17376e != 0;
                    int i = this.f17376e;
                    if (bVar.f17376e != 0) {
                        z = true;
                    }
                    this.f17376e = visitor.visitInt(z2, i, z, bVar.f17376e);
                    this.f17377f = (C6980c3) visitor.visitMessage(this.f17377f, bVar.f17377f);
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
                                    this.f17376e = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    Builder builder = this.f17377f != null ? (C6981a) this.f17377f.toBuilder() : null;
                                    this.f17377f = (C6980c3) codedInputStream.readMessage(C6980c3.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f17377f);
                                        this.f17377f = (C6980c3) builder.buildPartial();
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
                    if (f17375h == null) {
                        synchronized (C7028b.class) {
                            if (f17375h == null) {
                                f17375h = new DefaultInstanceBasedParser(f17374g);
                            }
                        }
                    }
                    return f17375h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17374g;
        }

        public C6980c3 getEntity() {
            C6980c3 c3Var = this.f17377f;
            return c3Var == null ? C6980c3.getDefaultInstance() : c3Var;
        }

        public C7280e getOp() {
            C7280e a = C7280e.m17990a(this.f17376e);
            return a == null ? C7280e.UNRECOGNIZED : a;
        }

        public int getOpValue() {
            return this.f17376e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f17376e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f17376e);
            }
            if (this.f17377f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getEntity());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasEntity() {
            return this.f17377f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f17376e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f17376e);
            }
            if (this.f17377f != null) {
                codedOutputStream.writeMessage(2, getEntity());
            }
        }
    }

    /* renamed from: co.znly.models.core.StatesProto$FriendshipsState$c */
    public static final class C7030c extends GeneratedMessageLite<C7030c, C7031a> implements StateOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C7030c f17378h = new C7030c();

        /* renamed from: i */
        private static volatile Parser<C7030c> f17379i;

        /* renamed from: e */
        private int f17380e;

        /* renamed from: f */
        private ProtobufList<C6980c3> f17381f = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: g */
        private int f17382g;

        /* renamed from: co.znly.models.core.StatesProto$FriendshipsState$c$a */
        public static final class C7031a extends Builder<C7030c, C7031a> implements StateOrBuilder {
            /* synthetic */ C7031a(C7137k1 k1Var) {
                this();
            }

            public C6980c3 getState(int i) {
                return ((C7030c) this.instance).getState(i);
            }

            public int getStateCount() {
                return ((C7030c) this.instance).getStateCount();
            }

            public List<C6980c3> getStateList() {
                return Collections.unmodifiableList(((C7030c) this.instance).getStateList());
            }

            public C7188p1 getStatus() {
                return ((C7030c) this.instance).getStatus();
            }

            public int getStatusValue() {
                return ((C7030c) this.instance).getStatusValue();
            }

            private C7031a() {
                super(C7030c.f17378h);
            }
        }

        static {
            f17378h.makeImmutable();
        }

        private C7030c() {
        }

        public static C7030c getDefaultInstance() {
            return f17378h;
        }

        public static Parser<C7030c> parser() {
            return f17378h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7030c();
                case 2:
                    return f17378h;
                case 3:
                    this.f17381f.makeImmutable();
                    return null;
                case 4:
                    return new C7031a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7030c cVar = (C7030c) obj2;
                    this.f17381f = visitor.visitList(this.f17381f, cVar.f17381f);
                    boolean z2 = this.f17382g != 0;
                    int i = this.f17382g;
                    if (cVar.f17382g != 0) {
                        z = true;
                    }
                    this.f17382g = visitor.visitInt(z2, i, z, cVar.f17382g);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f17380e |= cVar.f17380e;
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
                                    if (!this.f17381f.isModifiable()) {
                                        this.f17381f = GeneratedMessageLite.mutableCopy(this.f17381f);
                                    }
                                    this.f17381f.add(codedInputStream.readMessage(C6980c3.parser(), extensionRegistryLite));
                                } else if (readTag == 16) {
                                    this.f17382g = codedInputStream.readEnum();
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
                    if (f17379i == null) {
                        synchronized (C7030c.class) {
                            if (f17379i == null) {
                                f17379i = new DefaultInstanceBasedParser(f17378h);
                            }
                        }
                    }
                    return f17379i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17378h;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f17381f.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17381f.get(i3));
            }
            if (this.f17382g != C7188p1.CACHE.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(2, this.f17382g);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C6980c3 getState(int i) {
            return (C6980c3) this.f17381f.get(i);
        }

        public int getStateCount() {
            return this.f17381f.size();
        }

        public List<C6980c3> getStateList() {
            return this.f17381f;
        }

        public C7188p1 getStatus() {
            C7188p1 a = C7188p1.m17903a(this.f17382g);
            return a == null ? C7188p1.UNRECOGNIZED : a;
        }

        public int getStatusValue() {
            return this.f17382g;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f17381f.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f17381f.get(i));
            }
            if (this.f17382g != C7188p1.CACHE.getNumber()) {
                codedOutputStream.writeEnum(2, this.f17382g);
            }
        }
    }

    static {
        f17370g.makeImmutable();
    }

    private StatesProto$FriendshipsState() {
    }

    public static C7027a newBuilder() {
        return (C7027a) f17370g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
            case 1:
                return new StatesProto$FriendshipsState();
            case 2:
                return f17370g;
            case 3:
                return null;
            case 4:
                return new C7027a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                StatesProto$FriendshipsState statesProto$FriendshipsState = (StatesProto$FriendshipsState) obj2;
                this.f17372e = (C7030c) visitor.visitMessage(this.f17372e, statesProto$FriendshipsState.f17372e);
                this.f17373f = (C7028b) visitor.visitMessage(this.f17373f, statesProto$FriendshipsState.f17373f);
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
                                Builder builder = this.f17372e != null ? (C7031a) this.f17372e.toBuilder() : null;
                                this.f17372e = (C7030c) codedInputStream.readMessage(C7030c.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17372e);
                                    this.f17372e = (C7030c) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f17373f != null ? (C7029a) this.f17373f.toBuilder() : null;
                                this.f17373f = (C7028b) codedInputStream.readMessage(C7028b.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17373f);
                                    this.f17373f = (C7028b) builder2.buildPartial();
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
                if (f17371h == null) {
                    synchronized (StatesProto$FriendshipsState.class) {
                        if (f17371h == null) {
                            f17371h = new DefaultInstanceBasedParser(f17370g);
                        }
                    }
                }
                return f17371h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17370g;
    }

    public C7028b getEvent() {
        C7028b bVar = this.f17373f;
        return bVar == null ? C7028b.getDefaultInstance() : bVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17372e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getState());
        }
        if (this.f17373f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getEvent());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7030c getState() {
        C7030c cVar = this.f17372e;
        return cVar == null ? C7030c.getDefaultInstance() : cVar;
    }

    public boolean hasEvent() {
        return this.f17373f != null;
    }

    public boolean hasState() {
        return this.f17372e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17372e != null) {
            codedOutputStream.writeMessage(1, getState());
        }
        if (this.f17373f != null) {
            codedOutputStream.writeMessage(2, getEvent());
        }
    }
}
