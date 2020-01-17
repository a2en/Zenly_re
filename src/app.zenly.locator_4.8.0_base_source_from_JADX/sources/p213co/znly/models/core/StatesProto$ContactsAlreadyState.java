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
import p213co.znly.models.C7370k;
import p213co.znly.models.C7370k.C7371a;

/* renamed from: co.znly.models.core.StatesProto$ContactsAlreadyState */
public final class StatesProto$ContactsAlreadyState extends GeneratedMessageLite<StatesProto$ContactsAlreadyState, C7002a> implements StatesProto$ContactsAlreadyStateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final StatesProto$ContactsAlreadyState f17305g = new StatesProto$ContactsAlreadyState();

    /* renamed from: h */
    private static volatile Parser<StatesProto$ContactsAlreadyState> f17306h;

    /* renamed from: e */
    private C7005c f17307e;

    /* renamed from: f */
    private C7003b f17308f;

    /* renamed from: co.znly.models.core.StatesProto$ContactsAlreadyState$EventOrBuilder */
    public interface EventOrBuilder extends MessageLiteOrBuilder {
        C7370k getEntity();

        C7280e getOp();

        int getOpValue();

        boolean hasEntity();
    }

    /* renamed from: co.znly.models.core.StatesProto$ContactsAlreadyState$StateOrBuilder */
    public interface StateOrBuilder extends MessageLiteOrBuilder {
        C7370k getState(int i);

        int getStateCount();

        List<C7370k> getStateList();

        C7188p1 getStatus();

        int getStatusValue();
    }

    /* renamed from: co.znly.models.core.StatesProto$ContactsAlreadyState$a */
    public static final class C7002a extends Builder<StatesProto$ContactsAlreadyState, C7002a> implements StatesProto$ContactsAlreadyStateOrBuilder {
        /* synthetic */ C7002a(C7137k1 k1Var) {
            this();
        }

        public C7003b getEvent() {
            return ((StatesProto$ContactsAlreadyState) this.instance).getEvent();
        }

        public C7005c getState() {
            return ((StatesProto$ContactsAlreadyState) this.instance).getState();
        }

        public boolean hasEvent() {
            return ((StatesProto$ContactsAlreadyState) this.instance).hasEvent();
        }

        public boolean hasState() {
            return ((StatesProto$ContactsAlreadyState) this.instance).hasState();
        }

        private C7002a() {
            super(StatesProto$ContactsAlreadyState.f17305g);
        }
    }

    /* renamed from: co.znly.models.core.StatesProto$ContactsAlreadyState$b */
    public static final class C7003b extends GeneratedMessageLite<C7003b, C7004a> implements EventOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C7003b f17309g = new C7003b();

        /* renamed from: h */
        private static volatile Parser<C7003b> f17310h;

        /* renamed from: e */
        private int f17311e;

        /* renamed from: f */
        private C7370k f17312f;

        /* renamed from: co.znly.models.core.StatesProto$ContactsAlreadyState$b$a */
        public static final class C7004a extends Builder<C7003b, C7004a> implements EventOrBuilder {
            /* synthetic */ C7004a(C7137k1 k1Var) {
                this();
            }

            public C7370k getEntity() {
                return ((C7003b) this.instance).getEntity();
            }

            public C7280e getOp() {
                return ((C7003b) this.instance).getOp();
            }

            public int getOpValue() {
                return ((C7003b) this.instance).getOpValue();
            }

            public boolean hasEntity() {
                return ((C7003b) this.instance).hasEntity();
            }

            private C7004a() {
                super(C7003b.f17309g);
            }
        }

        static {
            f17309g.makeImmutable();
        }

        private C7003b() {
        }

        public static C7003b getDefaultInstance() {
            return f17309g;
        }

        public static Parser<C7003b> parser() {
            return f17309g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7003b();
                case 2:
                    return f17309g;
                case 3:
                    return null;
                case 4:
                    return new C7004a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7003b bVar = (C7003b) obj2;
                    boolean z2 = this.f17311e != 0;
                    int i = this.f17311e;
                    if (bVar.f17311e != 0) {
                        z = true;
                    }
                    this.f17311e = visitor.visitInt(z2, i, z, bVar.f17311e);
                    this.f17312f = (C7370k) visitor.visitMessage(this.f17312f, bVar.f17312f);
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
                                    this.f17311e = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    Builder builder = this.f17312f != null ? (C7371a) this.f17312f.toBuilder() : null;
                                    this.f17312f = (C7370k) codedInputStream.readMessage(C7370k.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f17312f);
                                        this.f17312f = (C7370k) builder.buildPartial();
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
                    if (f17310h == null) {
                        synchronized (C7003b.class) {
                            if (f17310h == null) {
                                f17310h = new DefaultInstanceBasedParser(f17309g);
                            }
                        }
                    }
                    return f17310h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17309g;
        }

        public C7370k getEntity() {
            C7370k kVar = this.f17312f;
            return kVar == null ? C7370k.getDefaultInstance() : kVar;
        }

        public C7280e getOp() {
            C7280e a = C7280e.m17990a(this.f17311e);
            return a == null ? C7280e.UNRECOGNIZED : a;
        }

        public int getOpValue() {
            return this.f17311e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f17311e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f17311e);
            }
            if (this.f17312f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getEntity());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasEntity() {
            return this.f17312f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f17311e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f17311e);
            }
            if (this.f17312f != null) {
                codedOutputStream.writeMessage(2, getEntity());
            }
        }
    }

    /* renamed from: co.znly.models.core.StatesProto$ContactsAlreadyState$c */
    public static final class C7005c extends GeneratedMessageLite<C7005c, C7006a> implements StateOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C7005c f17313h = new C7005c();

        /* renamed from: i */
        private static volatile Parser<C7005c> f17314i;

        /* renamed from: e */
        private int f17315e;

        /* renamed from: f */
        private ProtobufList<C7370k> f17316f = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: g */
        private int f17317g;

        /* renamed from: co.znly.models.core.StatesProto$ContactsAlreadyState$c$a */
        public static final class C7006a extends Builder<C7005c, C7006a> implements StateOrBuilder {
            /* synthetic */ C7006a(C7137k1 k1Var) {
                this();
            }

            public C7370k getState(int i) {
                return ((C7005c) this.instance).getState(i);
            }

            public int getStateCount() {
                return ((C7005c) this.instance).getStateCount();
            }

            public List<C7370k> getStateList() {
                return Collections.unmodifiableList(((C7005c) this.instance).getStateList());
            }

            public C7188p1 getStatus() {
                return ((C7005c) this.instance).getStatus();
            }

            public int getStatusValue() {
                return ((C7005c) this.instance).getStatusValue();
            }

            private C7006a() {
                super(C7005c.f17313h);
            }
        }

        static {
            f17313h.makeImmutable();
        }

        private C7005c() {
        }

        public static C7005c getDefaultInstance() {
            return f17313h;
        }

        public static Parser<C7005c> parser() {
            return f17313h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7005c();
                case 2:
                    return f17313h;
                case 3:
                    this.f17316f.makeImmutable();
                    return null;
                case 4:
                    return new C7006a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7005c cVar = (C7005c) obj2;
                    this.f17316f = visitor.visitList(this.f17316f, cVar.f17316f);
                    boolean z2 = this.f17317g != 0;
                    int i = this.f17317g;
                    if (cVar.f17317g != 0) {
                        z = true;
                    }
                    this.f17317g = visitor.visitInt(z2, i, z, cVar.f17317g);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f17315e |= cVar.f17315e;
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
                                    if (!this.f17316f.isModifiable()) {
                                        this.f17316f = GeneratedMessageLite.mutableCopy(this.f17316f);
                                    }
                                    this.f17316f.add(codedInputStream.readMessage(C7370k.parser(), extensionRegistryLite));
                                } else if (readTag == 16) {
                                    this.f17317g = codedInputStream.readEnum();
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
                    if (f17314i == null) {
                        synchronized (C7005c.class) {
                            if (f17314i == null) {
                                f17314i = new DefaultInstanceBasedParser(f17313h);
                            }
                        }
                    }
                    return f17314i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17313h;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f17316f.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17316f.get(i3));
            }
            if (this.f17317g != C7188p1.CACHE.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(2, this.f17317g);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C7370k getState(int i) {
            return (C7370k) this.f17316f.get(i);
        }

        public int getStateCount() {
            return this.f17316f.size();
        }

        public List<C7370k> getStateList() {
            return this.f17316f;
        }

        public C7188p1 getStatus() {
            C7188p1 a = C7188p1.m17903a(this.f17317g);
            return a == null ? C7188p1.UNRECOGNIZED : a;
        }

        public int getStatusValue() {
            return this.f17317g;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f17316f.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f17316f.get(i));
            }
            if (this.f17317g != C7188p1.CACHE.getNumber()) {
                codedOutputStream.writeEnum(2, this.f17317g);
            }
        }
    }

    static {
        f17305g.makeImmutable();
    }

    private StatesProto$ContactsAlreadyState() {
    }

    public static C7002a newBuilder() {
        return (C7002a) f17305g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
            case 1:
                return new StatesProto$ContactsAlreadyState();
            case 2:
                return f17305g;
            case 3:
                return null;
            case 4:
                return new C7002a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                StatesProto$ContactsAlreadyState statesProto$ContactsAlreadyState = (StatesProto$ContactsAlreadyState) obj2;
                this.f17307e = (C7005c) visitor.visitMessage(this.f17307e, statesProto$ContactsAlreadyState.f17307e);
                this.f17308f = (C7003b) visitor.visitMessage(this.f17308f, statesProto$ContactsAlreadyState.f17308f);
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
                                Builder builder = this.f17307e != null ? (C7006a) this.f17307e.toBuilder() : null;
                                this.f17307e = (C7005c) codedInputStream.readMessage(C7005c.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17307e);
                                    this.f17307e = (C7005c) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f17308f != null ? (C7004a) this.f17308f.toBuilder() : null;
                                this.f17308f = (C7003b) codedInputStream.readMessage(C7003b.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17308f);
                                    this.f17308f = (C7003b) builder2.buildPartial();
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
                if (f17306h == null) {
                    synchronized (StatesProto$ContactsAlreadyState.class) {
                        if (f17306h == null) {
                            f17306h = new DefaultInstanceBasedParser(f17305g);
                        }
                    }
                }
                return f17306h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17305g;
    }

    public C7003b getEvent() {
        C7003b bVar = this.f17308f;
        return bVar == null ? C7003b.getDefaultInstance() : bVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17307e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getState());
        }
        if (this.f17308f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getEvent());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7005c getState() {
        C7005c cVar = this.f17307e;
        return cVar == null ? C7005c.getDefaultInstance() : cVar;
    }

    public boolean hasEvent() {
        return this.f17308f != null;
    }

    public boolean hasState() {
        return this.f17307e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17307e != null) {
            codedOutputStream.writeMessage(1, getState());
        }
        if (this.f17308f != null) {
            codedOutputStream.writeMessage(2, getEvent());
        }
    }
}
