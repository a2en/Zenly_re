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
import p213co.znly.models.C7351j;
import p213co.znly.models.C7351j.C7352a;

/* renamed from: co.znly.models.core.StatesProto$ContactsSoonState */
public final class StatesProto$ContactsSoonState extends GeneratedMessageLite<StatesProto$ContactsSoonState, C7007a> implements StatesProto$ContactsSoonStateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final StatesProto$ContactsSoonState f17318g = new StatesProto$ContactsSoonState();

    /* renamed from: h */
    private static volatile Parser<StatesProto$ContactsSoonState> f17319h;

    /* renamed from: e */
    private C7010c f17320e;

    /* renamed from: f */
    private C7008b f17321f;

    /* renamed from: co.znly.models.core.StatesProto$ContactsSoonState$EventOrBuilder */
    public interface EventOrBuilder extends MessageLiteOrBuilder {
        C7351j getEntity();

        C7280e getOp();

        int getOpValue();

        boolean hasEntity();
    }

    /* renamed from: co.znly.models.core.StatesProto$ContactsSoonState$StateOrBuilder */
    public interface StateOrBuilder extends MessageLiteOrBuilder {
        C7351j getState(int i);

        int getStateCount();

        List<C7351j> getStateList();

        C7188p1 getStatus();

        int getStatusValue();
    }

    /* renamed from: co.znly.models.core.StatesProto$ContactsSoonState$a */
    public static final class C7007a extends Builder<StatesProto$ContactsSoonState, C7007a> implements StatesProto$ContactsSoonStateOrBuilder {
        /* synthetic */ C7007a(C7137k1 k1Var) {
            this();
        }

        public C7008b getEvent() {
            return ((StatesProto$ContactsSoonState) this.instance).getEvent();
        }

        public C7010c getState() {
            return ((StatesProto$ContactsSoonState) this.instance).getState();
        }

        public boolean hasEvent() {
            return ((StatesProto$ContactsSoonState) this.instance).hasEvent();
        }

        public boolean hasState() {
            return ((StatesProto$ContactsSoonState) this.instance).hasState();
        }

        private C7007a() {
            super(StatesProto$ContactsSoonState.f17318g);
        }
    }

    /* renamed from: co.znly.models.core.StatesProto$ContactsSoonState$b */
    public static final class C7008b extends GeneratedMessageLite<C7008b, C7009a> implements EventOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C7008b f17322g = new C7008b();

        /* renamed from: h */
        private static volatile Parser<C7008b> f17323h;

        /* renamed from: e */
        private int f17324e;

        /* renamed from: f */
        private C7351j f17325f;

        /* renamed from: co.znly.models.core.StatesProto$ContactsSoonState$b$a */
        public static final class C7009a extends Builder<C7008b, C7009a> implements EventOrBuilder {
            /* synthetic */ C7009a(C7137k1 k1Var) {
                this();
            }

            public C7351j getEntity() {
                return ((C7008b) this.instance).getEntity();
            }

            public C7280e getOp() {
                return ((C7008b) this.instance).getOp();
            }

            public int getOpValue() {
                return ((C7008b) this.instance).getOpValue();
            }

            public boolean hasEntity() {
                return ((C7008b) this.instance).hasEntity();
            }

            private C7009a() {
                super(C7008b.f17322g);
            }
        }

        static {
            f17322g.makeImmutable();
        }

        private C7008b() {
        }

        public static C7008b getDefaultInstance() {
            return f17322g;
        }

        public static Parser<C7008b> parser() {
            return f17322g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7008b();
                case 2:
                    return f17322g;
                case 3:
                    return null;
                case 4:
                    return new C7009a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7008b bVar = (C7008b) obj2;
                    boolean z2 = this.f17324e != 0;
                    int i = this.f17324e;
                    if (bVar.f17324e != 0) {
                        z = true;
                    }
                    this.f17324e = visitor.visitInt(z2, i, z, bVar.f17324e);
                    this.f17325f = (C7351j) visitor.visitMessage(this.f17325f, bVar.f17325f);
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
                                    this.f17324e = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    Builder builder = this.f17325f != null ? (C7352a) this.f17325f.toBuilder() : null;
                                    this.f17325f = (C7351j) codedInputStream.readMessage(C7351j.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f17325f);
                                        this.f17325f = (C7351j) builder.buildPartial();
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
                    if (f17323h == null) {
                        synchronized (C7008b.class) {
                            if (f17323h == null) {
                                f17323h = new DefaultInstanceBasedParser(f17322g);
                            }
                        }
                    }
                    return f17323h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17322g;
        }

        public C7351j getEntity() {
            C7351j jVar = this.f17325f;
            return jVar == null ? C7351j.getDefaultInstance() : jVar;
        }

        public C7280e getOp() {
            C7280e a = C7280e.m17990a(this.f17324e);
            return a == null ? C7280e.UNRECOGNIZED : a;
        }

        public int getOpValue() {
            return this.f17324e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f17324e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f17324e);
            }
            if (this.f17325f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getEntity());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasEntity() {
            return this.f17325f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f17324e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f17324e);
            }
            if (this.f17325f != null) {
                codedOutputStream.writeMessage(2, getEntity());
            }
        }
    }

    /* renamed from: co.znly.models.core.StatesProto$ContactsSoonState$c */
    public static final class C7010c extends GeneratedMessageLite<C7010c, C7011a> implements StateOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C7010c f17326h = new C7010c();

        /* renamed from: i */
        private static volatile Parser<C7010c> f17327i;

        /* renamed from: e */
        private int f17328e;

        /* renamed from: f */
        private ProtobufList<C7351j> f17329f = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: g */
        private int f17330g;

        /* renamed from: co.znly.models.core.StatesProto$ContactsSoonState$c$a */
        public static final class C7011a extends Builder<C7010c, C7011a> implements StateOrBuilder {
            /* synthetic */ C7011a(C7137k1 k1Var) {
                this();
            }

            public C7351j getState(int i) {
                return ((C7010c) this.instance).getState(i);
            }

            public int getStateCount() {
                return ((C7010c) this.instance).getStateCount();
            }

            public List<C7351j> getStateList() {
                return Collections.unmodifiableList(((C7010c) this.instance).getStateList());
            }

            public C7188p1 getStatus() {
                return ((C7010c) this.instance).getStatus();
            }

            public int getStatusValue() {
                return ((C7010c) this.instance).getStatusValue();
            }

            private C7011a() {
                super(C7010c.f17326h);
            }
        }

        static {
            f17326h.makeImmutable();
        }

        private C7010c() {
        }

        public static C7010c getDefaultInstance() {
            return f17326h;
        }

        public static Parser<C7010c> parser() {
            return f17326h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7010c();
                case 2:
                    return f17326h;
                case 3:
                    this.f17329f.makeImmutable();
                    return null;
                case 4:
                    return new C7011a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7010c cVar = (C7010c) obj2;
                    this.f17329f = visitor.visitList(this.f17329f, cVar.f17329f);
                    boolean z2 = this.f17330g != 0;
                    int i = this.f17330g;
                    if (cVar.f17330g != 0) {
                        z = true;
                    }
                    this.f17330g = visitor.visitInt(z2, i, z, cVar.f17330g);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f17328e |= cVar.f17328e;
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
                                    if (!this.f17329f.isModifiable()) {
                                        this.f17329f = GeneratedMessageLite.mutableCopy(this.f17329f);
                                    }
                                    this.f17329f.add(codedInputStream.readMessage(C7351j.parser(), extensionRegistryLite));
                                } else if (readTag == 16) {
                                    this.f17330g = codedInputStream.readEnum();
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
                    if (f17327i == null) {
                        synchronized (C7010c.class) {
                            if (f17327i == null) {
                                f17327i = new DefaultInstanceBasedParser(f17326h);
                            }
                        }
                    }
                    return f17327i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17326h;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f17329f.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17329f.get(i3));
            }
            if (this.f17330g != C7188p1.CACHE.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(2, this.f17330g);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C7351j getState(int i) {
            return (C7351j) this.f17329f.get(i);
        }

        public int getStateCount() {
            return this.f17329f.size();
        }

        public List<C7351j> getStateList() {
            return this.f17329f;
        }

        public C7188p1 getStatus() {
            C7188p1 a = C7188p1.m17903a(this.f17330g);
            return a == null ? C7188p1.UNRECOGNIZED : a;
        }

        public int getStatusValue() {
            return this.f17330g;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f17329f.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f17329f.get(i));
            }
            if (this.f17330g != C7188p1.CACHE.getNumber()) {
                codedOutputStream.writeEnum(2, this.f17330g);
            }
        }
    }

    static {
        f17318g.makeImmutable();
    }

    private StatesProto$ContactsSoonState() {
    }

    public static C7007a newBuilder() {
        return (C7007a) f17318g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
            case 1:
                return new StatesProto$ContactsSoonState();
            case 2:
                return f17318g;
            case 3:
                return null;
            case 4:
                return new C7007a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                StatesProto$ContactsSoonState statesProto$ContactsSoonState = (StatesProto$ContactsSoonState) obj2;
                this.f17320e = (C7010c) visitor.visitMessage(this.f17320e, statesProto$ContactsSoonState.f17320e);
                this.f17321f = (C7008b) visitor.visitMessage(this.f17321f, statesProto$ContactsSoonState.f17321f);
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
                                Builder builder = this.f17320e != null ? (C7011a) this.f17320e.toBuilder() : null;
                                this.f17320e = (C7010c) codedInputStream.readMessage(C7010c.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17320e);
                                    this.f17320e = (C7010c) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f17321f != null ? (C7009a) this.f17321f.toBuilder() : null;
                                this.f17321f = (C7008b) codedInputStream.readMessage(C7008b.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17321f);
                                    this.f17321f = (C7008b) builder2.buildPartial();
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
                if (f17319h == null) {
                    synchronized (StatesProto$ContactsSoonState.class) {
                        if (f17319h == null) {
                            f17319h = new DefaultInstanceBasedParser(f17318g);
                        }
                    }
                }
                return f17319h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17318g;
    }

    public C7008b getEvent() {
        C7008b bVar = this.f17321f;
        return bVar == null ? C7008b.getDefaultInstance() : bVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17320e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getState());
        }
        if (this.f17321f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getEvent());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7010c getState() {
        C7010c cVar = this.f17320e;
        return cVar == null ? C7010c.getDefaultInstance() : cVar;
    }

    public boolean hasEvent() {
        return this.f17321f != null;
    }

    public boolean hasState() {
        return this.f17320e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17320e != null) {
            codedOutputStream.writeMessage(1, getState());
        }
        if (this.f17321f != null) {
            codedOutputStream.writeMessage(2, getEvent());
        }
    }
}
