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
import p213co.znly.models.C7337h3;
import p213co.znly.models.C7337h3.C7338a;

/* renamed from: co.znly.models.core.StatesProto$TopFriendsState */
public final class StatesProto$TopFriendsState extends GeneratedMessageLite<StatesProto$TopFriendsState, C7035a> implements StatesProto$TopFriendsStateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final StatesProto$TopFriendsState f17391g = new StatesProto$TopFriendsState();

    /* renamed from: h */
    private static volatile Parser<StatesProto$TopFriendsState> f17392h;

    /* renamed from: e */
    private C7038c f17393e;

    /* renamed from: f */
    private C7036b f17394f;

    /* renamed from: co.znly.models.core.StatesProto$TopFriendsState$EventOrBuilder */
    public interface EventOrBuilder extends MessageLiteOrBuilder {
        C7337h3 getEntity();

        C7280e getOp();

        int getOpValue();

        boolean hasEntity();
    }

    /* renamed from: co.znly.models.core.StatesProto$TopFriendsState$StateOrBuilder */
    public interface StateOrBuilder extends MessageLiteOrBuilder {
        C7337h3 getState(int i);

        int getStateCount();

        List<C7337h3> getStateList();

        C7188p1 getStatus();

        int getStatusValue();
    }

    /* renamed from: co.znly.models.core.StatesProto$TopFriendsState$a */
    public static final class C7035a extends Builder<StatesProto$TopFriendsState, C7035a> implements StatesProto$TopFriendsStateOrBuilder {
        /* synthetic */ C7035a(C7137k1 k1Var) {
            this();
        }

        public C7036b getEvent() {
            return ((StatesProto$TopFriendsState) this.instance).getEvent();
        }

        public C7038c getState() {
            return ((StatesProto$TopFriendsState) this.instance).getState();
        }

        public boolean hasEvent() {
            return ((StatesProto$TopFriendsState) this.instance).hasEvent();
        }

        public boolean hasState() {
            return ((StatesProto$TopFriendsState) this.instance).hasState();
        }

        private C7035a() {
            super(StatesProto$TopFriendsState.f17391g);
        }
    }

    /* renamed from: co.znly.models.core.StatesProto$TopFriendsState$b */
    public static final class C7036b extends GeneratedMessageLite<C7036b, C7037a> implements EventOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C7036b f17395g = new C7036b();

        /* renamed from: h */
        private static volatile Parser<C7036b> f17396h;

        /* renamed from: e */
        private int f17397e;

        /* renamed from: f */
        private C7337h3 f17398f;

        /* renamed from: co.znly.models.core.StatesProto$TopFriendsState$b$a */
        public static final class C7037a extends Builder<C7036b, C7037a> implements EventOrBuilder {
            /* synthetic */ C7037a(C7137k1 k1Var) {
                this();
            }

            public C7337h3 getEntity() {
                return ((C7036b) this.instance).getEntity();
            }

            public C7280e getOp() {
                return ((C7036b) this.instance).getOp();
            }

            public int getOpValue() {
                return ((C7036b) this.instance).getOpValue();
            }

            public boolean hasEntity() {
                return ((C7036b) this.instance).hasEntity();
            }

            private C7037a() {
                super(C7036b.f17395g);
            }
        }

        static {
            f17395g.makeImmutable();
        }

        private C7036b() {
        }

        public static C7036b getDefaultInstance() {
            return f17395g;
        }

        public static Parser<C7036b> parser() {
            return f17395g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7036b();
                case 2:
                    return f17395g;
                case 3:
                    return null;
                case 4:
                    return new C7037a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7036b bVar = (C7036b) obj2;
                    boolean z2 = this.f17397e != 0;
                    int i = this.f17397e;
                    if (bVar.f17397e != 0) {
                        z = true;
                    }
                    this.f17397e = visitor.visitInt(z2, i, z, bVar.f17397e);
                    this.f17398f = (C7337h3) visitor.visitMessage(this.f17398f, bVar.f17398f);
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
                                    this.f17397e = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    Builder builder = this.f17398f != null ? (C7338a) this.f17398f.toBuilder() : null;
                                    this.f17398f = (C7337h3) codedInputStream.readMessage(C7337h3.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f17398f);
                                        this.f17398f = (C7337h3) builder.buildPartial();
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
                    if (f17396h == null) {
                        synchronized (C7036b.class) {
                            if (f17396h == null) {
                                f17396h = new DefaultInstanceBasedParser(f17395g);
                            }
                        }
                    }
                    return f17396h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17395g;
        }

        public C7337h3 getEntity() {
            C7337h3 h3Var = this.f17398f;
            return h3Var == null ? C7337h3.getDefaultInstance() : h3Var;
        }

        public C7280e getOp() {
            C7280e a = C7280e.m17990a(this.f17397e);
            return a == null ? C7280e.UNRECOGNIZED : a;
        }

        public int getOpValue() {
            return this.f17397e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f17397e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f17397e);
            }
            if (this.f17398f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getEntity());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasEntity() {
            return this.f17398f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f17397e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f17397e);
            }
            if (this.f17398f != null) {
                codedOutputStream.writeMessage(2, getEntity());
            }
        }
    }

    /* renamed from: co.znly.models.core.StatesProto$TopFriendsState$c */
    public static final class C7038c extends GeneratedMessageLite<C7038c, C7039a> implements StateOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C7038c f17399h = new C7038c();

        /* renamed from: i */
        private static volatile Parser<C7038c> f17400i;

        /* renamed from: e */
        private int f17401e;

        /* renamed from: f */
        private ProtobufList<C7337h3> f17402f = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: g */
        private int f17403g;

        /* renamed from: co.znly.models.core.StatesProto$TopFriendsState$c$a */
        public static final class C7039a extends Builder<C7038c, C7039a> implements StateOrBuilder {
            /* synthetic */ C7039a(C7137k1 k1Var) {
                this();
            }

            public C7337h3 getState(int i) {
                return ((C7038c) this.instance).getState(i);
            }

            public int getStateCount() {
                return ((C7038c) this.instance).getStateCount();
            }

            public List<C7337h3> getStateList() {
                return Collections.unmodifiableList(((C7038c) this.instance).getStateList());
            }

            public C7188p1 getStatus() {
                return ((C7038c) this.instance).getStatus();
            }

            public int getStatusValue() {
                return ((C7038c) this.instance).getStatusValue();
            }

            private C7039a() {
                super(C7038c.f17399h);
            }
        }

        static {
            f17399h.makeImmutable();
        }

        private C7038c() {
        }

        public static C7038c getDefaultInstance() {
            return f17399h;
        }

        public static Parser<C7038c> parser() {
            return f17399h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7038c();
                case 2:
                    return f17399h;
                case 3:
                    this.f17402f.makeImmutable();
                    return null;
                case 4:
                    return new C7039a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7038c cVar = (C7038c) obj2;
                    this.f17402f = visitor.visitList(this.f17402f, cVar.f17402f);
                    boolean z2 = this.f17403g != 0;
                    int i = this.f17403g;
                    if (cVar.f17403g != 0) {
                        z = true;
                    }
                    this.f17403g = visitor.visitInt(z2, i, z, cVar.f17403g);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f17401e |= cVar.f17401e;
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
                                    if (!this.f17402f.isModifiable()) {
                                        this.f17402f = GeneratedMessageLite.mutableCopy(this.f17402f);
                                    }
                                    this.f17402f.add(codedInputStream.readMessage(C7337h3.parser(), extensionRegistryLite));
                                } else if (readTag == 16) {
                                    this.f17403g = codedInputStream.readEnum();
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
                    if (f17400i == null) {
                        synchronized (C7038c.class) {
                            if (f17400i == null) {
                                f17400i = new DefaultInstanceBasedParser(f17399h);
                            }
                        }
                    }
                    return f17400i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17399h;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f17402f.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17402f.get(i3));
            }
            if (this.f17403g != C7188p1.CACHE.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(2, this.f17403g);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C7337h3 getState(int i) {
            return (C7337h3) this.f17402f.get(i);
        }

        public int getStateCount() {
            return this.f17402f.size();
        }

        public List<C7337h3> getStateList() {
            return this.f17402f;
        }

        public C7188p1 getStatus() {
            C7188p1 a = C7188p1.m17903a(this.f17403g);
            return a == null ? C7188p1.UNRECOGNIZED : a;
        }

        public int getStatusValue() {
            return this.f17403g;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f17402f.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f17402f.get(i));
            }
            if (this.f17403g != C7188p1.CACHE.getNumber()) {
                codedOutputStream.writeEnum(2, this.f17403g);
            }
        }
    }

    static {
        f17391g.makeImmutable();
    }

    private StatesProto$TopFriendsState() {
    }

    public static C7035a newBuilder() {
        return (C7035a) f17391g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
            case 1:
                return new StatesProto$TopFriendsState();
            case 2:
                return f17391g;
            case 3:
                return null;
            case 4:
                return new C7035a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                StatesProto$TopFriendsState statesProto$TopFriendsState = (StatesProto$TopFriendsState) obj2;
                this.f17393e = (C7038c) visitor.visitMessage(this.f17393e, statesProto$TopFriendsState.f17393e);
                this.f17394f = (C7036b) visitor.visitMessage(this.f17394f, statesProto$TopFriendsState.f17394f);
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
                                Builder builder = this.f17393e != null ? (C7039a) this.f17393e.toBuilder() : null;
                                this.f17393e = (C7038c) codedInputStream.readMessage(C7038c.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17393e);
                                    this.f17393e = (C7038c) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f17394f != null ? (C7037a) this.f17394f.toBuilder() : null;
                                this.f17394f = (C7036b) codedInputStream.readMessage(C7036b.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17394f);
                                    this.f17394f = (C7036b) builder2.buildPartial();
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
                if (f17392h == null) {
                    synchronized (StatesProto$TopFriendsState.class) {
                        if (f17392h == null) {
                            f17392h = new DefaultInstanceBasedParser(f17391g);
                        }
                    }
                }
                return f17392h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17391g;
    }

    public C7036b getEvent() {
        C7036b bVar = this.f17394f;
        return bVar == null ? C7036b.getDefaultInstance() : bVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17393e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getState());
        }
        if (this.f17394f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getEvent());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7038c getState() {
        C7038c cVar = this.f17393e;
        return cVar == null ? C7038c.getDefaultInstance() : cVar;
    }

    public boolean hasEvent() {
        return this.f17394f != null;
    }

    public boolean hasState() {
        return this.f17393e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17393e != null) {
            codedOutputStream.writeMessage(1, getState());
        }
        if (this.f17394f != null) {
            codedOutputStream.writeMessage(2, getEvent());
        }
    }
}
