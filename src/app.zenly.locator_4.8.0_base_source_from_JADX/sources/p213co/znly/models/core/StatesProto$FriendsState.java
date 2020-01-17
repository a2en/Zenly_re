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
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.core.StatesProto$FriendsState */
public final class StatesProto$FriendsState extends GeneratedMessageLite<StatesProto$FriendsState, C7022a> implements StatesProto$FriendsStateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final StatesProto$FriendsState f17357g = new StatesProto$FriendsState();

    /* renamed from: h */
    private static volatile Parser<StatesProto$FriendsState> f17358h;

    /* renamed from: e */
    private C7025c f17359e;

    /* renamed from: f */
    private C7023b f17360f;

    /* renamed from: co.znly.models.core.StatesProto$FriendsState$EventOrBuilder */
    public interface EventOrBuilder extends MessageLiteOrBuilder {
        UserProto$User getEntity();

        C7280e getOp();

        int getOpValue();

        boolean hasEntity();
    }

    /* renamed from: co.znly.models.core.StatesProto$FriendsState$StateOrBuilder */
    public interface StateOrBuilder extends MessageLiteOrBuilder {
        UserProto$User getState(int i);

        int getStateCount();

        List<UserProto$User> getStateList();

        C7188p1 getStatus();

        int getStatusValue();
    }

    /* renamed from: co.znly.models.core.StatesProto$FriendsState$a */
    public static final class C7022a extends Builder<StatesProto$FriendsState, C7022a> implements StatesProto$FriendsStateOrBuilder {
        /* synthetic */ C7022a(C7137k1 k1Var) {
            this();
        }

        public C7023b getEvent() {
            return ((StatesProto$FriendsState) this.instance).getEvent();
        }

        public C7025c getState() {
            return ((StatesProto$FriendsState) this.instance).getState();
        }

        public boolean hasEvent() {
            return ((StatesProto$FriendsState) this.instance).hasEvent();
        }

        public boolean hasState() {
            return ((StatesProto$FriendsState) this.instance).hasState();
        }

        private C7022a() {
            super(StatesProto$FriendsState.f17357g);
        }
    }

    /* renamed from: co.znly.models.core.StatesProto$FriendsState$b */
    public static final class C7023b extends GeneratedMessageLite<C7023b, C7024a> implements EventOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C7023b f17361g = new C7023b();

        /* renamed from: h */
        private static volatile Parser<C7023b> f17362h;

        /* renamed from: e */
        private int f17363e;

        /* renamed from: f */
        private UserProto$User f17364f;

        /* renamed from: co.znly.models.core.StatesProto$FriendsState$b$a */
        public static final class C7024a extends Builder<C7023b, C7024a> implements EventOrBuilder {
            /* synthetic */ C7024a(C7137k1 k1Var) {
                this();
            }

            public UserProto$User getEntity() {
                return ((C7023b) this.instance).getEntity();
            }

            public C7280e getOp() {
                return ((C7023b) this.instance).getOp();
            }

            public int getOpValue() {
                return ((C7023b) this.instance).getOpValue();
            }

            public boolean hasEntity() {
                return ((C7023b) this.instance).hasEntity();
            }

            private C7024a() {
                super(C7023b.f17361g);
            }
        }

        static {
            f17361g.makeImmutable();
        }

        private C7023b() {
        }

        public static C7023b getDefaultInstance() {
            return f17361g;
        }

        public static Parser<C7023b> parser() {
            return f17361g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7023b();
                case 2:
                    return f17361g;
                case 3:
                    return null;
                case 4:
                    return new C7024a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7023b bVar = (C7023b) obj2;
                    boolean z2 = this.f17363e != 0;
                    int i = this.f17363e;
                    if (bVar.f17363e != 0) {
                        z = true;
                    }
                    this.f17363e = visitor.visitInt(z2, i, z, bVar.f17363e);
                    this.f17364f = (UserProto$User) visitor.visitMessage(this.f17364f, bVar.f17364f);
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
                                    this.f17363e = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    Builder builder = this.f17364f != null ? (C6925a) this.f17364f.toBuilder() : null;
                                    this.f17364f = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f17364f);
                                        this.f17364f = (UserProto$User) builder.buildPartial();
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
                    if (f17362h == null) {
                        synchronized (C7023b.class) {
                            if (f17362h == null) {
                                f17362h = new DefaultInstanceBasedParser(f17361g);
                            }
                        }
                    }
                    return f17362h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17361g;
        }

        public UserProto$User getEntity() {
            UserProto$User userProto$User = this.f17364f;
            return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
        }

        public C7280e getOp() {
            C7280e a = C7280e.m17990a(this.f17363e);
            return a == null ? C7280e.UNRECOGNIZED : a;
        }

        public int getOpValue() {
            return this.f17363e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f17363e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f17363e);
            }
            if (this.f17364f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getEntity());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasEntity() {
            return this.f17364f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f17363e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f17363e);
            }
            if (this.f17364f != null) {
                codedOutputStream.writeMessage(2, getEntity());
            }
        }
    }

    /* renamed from: co.znly.models.core.StatesProto$FriendsState$c */
    public static final class C7025c extends GeneratedMessageLite<C7025c, C7026a> implements StateOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C7025c f17365h = new C7025c();

        /* renamed from: i */
        private static volatile Parser<C7025c> f17366i;

        /* renamed from: e */
        private int f17367e;

        /* renamed from: f */
        private ProtobufList<UserProto$User> f17368f = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: g */
        private int f17369g;

        /* renamed from: co.znly.models.core.StatesProto$FriendsState$c$a */
        public static final class C7026a extends Builder<C7025c, C7026a> implements StateOrBuilder {
            /* synthetic */ C7026a(C7137k1 k1Var) {
                this();
            }

            public UserProto$User getState(int i) {
                return ((C7025c) this.instance).getState(i);
            }

            public int getStateCount() {
                return ((C7025c) this.instance).getStateCount();
            }

            public List<UserProto$User> getStateList() {
                return Collections.unmodifiableList(((C7025c) this.instance).getStateList());
            }

            public C7188p1 getStatus() {
                return ((C7025c) this.instance).getStatus();
            }

            public int getStatusValue() {
                return ((C7025c) this.instance).getStatusValue();
            }

            private C7026a() {
                super(C7025c.f17365h);
            }
        }

        static {
            f17365h.makeImmutable();
        }

        private C7025c() {
        }

        public static C7025c getDefaultInstance() {
            return f17365h;
        }

        public static Parser<C7025c> parser() {
            return f17365h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7025c();
                case 2:
                    return f17365h;
                case 3:
                    this.f17368f.makeImmutable();
                    return null;
                case 4:
                    return new C7026a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7025c cVar = (C7025c) obj2;
                    this.f17368f = visitor.visitList(this.f17368f, cVar.f17368f);
                    boolean z2 = this.f17369g != 0;
                    int i = this.f17369g;
                    if (cVar.f17369g != 0) {
                        z = true;
                    }
                    this.f17369g = visitor.visitInt(z2, i, z, cVar.f17369g);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f17367e |= cVar.f17367e;
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
                                    if (!this.f17368f.isModifiable()) {
                                        this.f17368f = GeneratedMessageLite.mutableCopy(this.f17368f);
                                    }
                                    this.f17368f.add(codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite));
                                } else if (readTag == 16) {
                                    this.f17369g = codedInputStream.readEnum();
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
                    if (f17366i == null) {
                        synchronized (C7025c.class) {
                            if (f17366i == null) {
                                f17366i = new DefaultInstanceBasedParser(f17365h);
                            }
                        }
                    }
                    return f17366i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17365h;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f17368f.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17368f.get(i3));
            }
            if (this.f17369g != C7188p1.CACHE.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(2, this.f17369g);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public UserProto$User getState(int i) {
            return (UserProto$User) this.f17368f.get(i);
        }

        public int getStateCount() {
            return this.f17368f.size();
        }

        public List<UserProto$User> getStateList() {
            return this.f17368f;
        }

        public C7188p1 getStatus() {
            C7188p1 a = C7188p1.m17903a(this.f17369g);
            return a == null ? C7188p1.UNRECOGNIZED : a;
        }

        public int getStatusValue() {
            return this.f17369g;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f17368f.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f17368f.get(i));
            }
            if (this.f17369g != C7188p1.CACHE.getNumber()) {
                codedOutputStream.writeEnum(2, this.f17369g);
            }
        }
    }

    static {
        f17357g.makeImmutable();
    }

    private StatesProto$FriendsState() {
    }

    public static C7022a newBuilder() {
        return (C7022a) f17357g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
            case 1:
                return new StatesProto$FriendsState();
            case 2:
                return f17357g;
            case 3:
                return null;
            case 4:
                return new C7022a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                StatesProto$FriendsState statesProto$FriendsState = (StatesProto$FriendsState) obj2;
                this.f17359e = (C7025c) visitor.visitMessage(this.f17359e, statesProto$FriendsState.f17359e);
                this.f17360f = (C7023b) visitor.visitMessage(this.f17360f, statesProto$FriendsState.f17360f);
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
                                Builder builder = this.f17359e != null ? (C7026a) this.f17359e.toBuilder() : null;
                                this.f17359e = (C7025c) codedInputStream.readMessage(C7025c.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17359e);
                                    this.f17359e = (C7025c) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f17360f != null ? (C7024a) this.f17360f.toBuilder() : null;
                                this.f17360f = (C7023b) codedInputStream.readMessage(C7023b.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17360f);
                                    this.f17360f = (C7023b) builder2.buildPartial();
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
                if (f17358h == null) {
                    synchronized (StatesProto$FriendsState.class) {
                        if (f17358h == null) {
                            f17358h = new DefaultInstanceBasedParser(f17357g);
                        }
                    }
                }
                return f17358h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17357g;
    }

    public C7023b getEvent() {
        C7023b bVar = this.f17360f;
        return bVar == null ? C7023b.getDefaultInstance() : bVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17359e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getState());
        }
        if (this.f17360f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getEvent());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7025c getState() {
        C7025c cVar = this.f17359e;
        return cVar == null ? C7025c.getDefaultInstance() : cVar;
    }

    public boolean hasEvent() {
        return this.f17360f != null;
    }

    public boolean hasState() {
        return this.f17359e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17359e != null) {
            codedOutputStream.writeMessage(1, getState());
        }
        if (this.f17360f != null) {
            codedOutputStream.writeMessage(2, getEvent());
        }
    }
}
