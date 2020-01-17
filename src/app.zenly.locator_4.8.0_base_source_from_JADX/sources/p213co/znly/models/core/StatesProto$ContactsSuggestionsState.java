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
import p213co.znly.models.C7434p;
import p213co.znly.models.C7434p.C7435a;

/* renamed from: co.znly.models.core.StatesProto$ContactsSuggestionsState */
public final class StatesProto$ContactsSuggestionsState extends GeneratedMessageLite<StatesProto$ContactsSuggestionsState, C7012a> implements StatesProto$ContactsSuggestionsStateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final StatesProto$ContactsSuggestionsState f17331g = new StatesProto$ContactsSuggestionsState();

    /* renamed from: h */
    private static volatile Parser<StatesProto$ContactsSuggestionsState> f17332h;

    /* renamed from: e */
    private C7015c f17333e;

    /* renamed from: f */
    private C7013b f17334f;

    /* renamed from: co.znly.models.core.StatesProto$ContactsSuggestionsState$EventOrBuilder */
    public interface EventOrBuilder extends MessageLiteOrBuilder {
        C7434p getEntity();

        C7280e getOp();

        int getOpValue();

        boolean hasEntity();
    }

    /* renamed from: co.znly.models.core.StatesProto$ContactsSuggestionsState$StateOrBuilder */
    public interface StateOrBuilder extends MessageLiteOrBuilder {
        C7434p getState(int i);

        int getStateCount();

        List<C7434p> getStateList();

        C7188p1 getStatus();

        int getStatusValue();
    }

    /* renamed from: co.znly.models.core.StatesProto$ContactsSuggestionsState$a */
    public static final class C7012a extends Builder<StatesProto$ContactsSuggestionsState, C7012a> implements StatesProto$ContactsSuggestionsStateOrBuilder {
        /* synthetic */ C7012a(C7137k1 k1Var) {
            this();
        }

        public C7013b getEvent() {
            return ((StatesProto$ContactsSuggestionsState) this.instance).getEvent();
        }

        public C7015c getState() {
            return ((StatesProto$ContactsSuggestionsState) this.instance).getState();
        }

        public boolean hasEvent() {
            return ((StatesProto$ContactsSuggestionsState) this.instance).hasEvent();
        }

        public boolean hasState() {
            return ((StatesProto$ContactsSuggestionsState) this.instance).hasState();
        }

        private C7012a() {
            super(StatesProto$ContactsSuggestionsState.f17331g);
        }
    }

    /* renamed from: co.znly.models.core.StatesProto$ContactsSuggestionsState$b */
    public static final class C7013b extends GeneratedMessageLite<C7013b, C7014a> implements EventOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C7013b f17335g = new C7013b();

        /* renamed from: h */
        private static volatile Parser<C7013b> f17336h;

        /* renamed from: e */
        private int f17337e;

        /* renamed from: f */
        private C7434p f17338f;

        /* renamed from: co.znly.models.core.StatesProto$ContactsSuggestionsState$b$a */
        public static final class C7014a extends Builder<C7013b, C7014a> implements EventOrBuilder {
            /* synthetic */ C7014a(C7137k1 k1Var) {
                this();
            }

            public C7434p getEntity() {
                return ((C7013b) this.instance).getEntity();
            }

            public C7280e getOp() {
                return ((C7013b) this.instance).getOp();
            }

            public int getOpValue() {
                return ((C7013b) this.instance).getOpValue();
            }

            public boolean hasEntity() {
                return ((C7013b) this.instance).hasEntity();
            }

            private C7014a() {
                super(C7013b.f17335g);
            }
        }

        static {
            f17335g.makeImmutable();
        }

        private C7013b() {
        }

        public static C7013b getDefaultInstance() {
            return f17335g;
        }

        public static Parser<C7013b> parser() {
            return f17335g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7013b();
                case 2:
                    return f17335g;
                case 3:
                    return null;
                case 4:
                    return new C7014a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7013b bVar = (C7013b) obj2;
                    boolean z2 = this.f17337e != 0;
                    int i = this.f17337e;
                    if (bVar.f17337e != 0) {
                        z = true;
                    }
                    this.f17337e = visitor.visitInt(z2, i, z, bVar.f17337e);
                    this.f17338f = (C7434p) visitor.visitMessage(this.f17338f, bVar.f17338f);
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
                                    this.f17337e = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    Builder builder = this.f17338f != null ? (C7435a) this.f17338f.toBuilder() : null;
                                    this.f17338f = (C7434p) codedInputStream.readMessage(C7434p.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f17338f);
                                        this.f17338f = (C7434p) builder.buildPartial();
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
                    if (f17336h == null) {
                        synchronized (C7013b.class) {
                            if (f17336h == null) {
                                f17336h = new DefaultInstanceBasedParser(f17335g);
                            }
                        }
                    }
                    return f17336h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17335g;
        }

        public C7434p getEntity() {
            C7434p pVar = this.f17338f;
            return pVar == null ? C7434p.getDefaultInstance() : pVar;
        }

        public C7280e getOp() {
            C7280e a = C7280e.m17990a(this.f17337e);
            return a == null ? C7280e.UNRECOGNIZED : a;
        }

        public int getOpValue() {
            return this.f17337e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f17337e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f17337e);
            }
            if (this.f17338f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getEntity());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasEntity() {
            return this.f17338f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f17337e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f17337e);
            }
            if (this.f17338f != null) {
                codedOutputStream.writeMessage(2, getEntity());
            }
        }
    }

    /* renamed from: co.znly.models.core.StatesProto$ContactsSuggestionsState$c */
    public static final class C7015c extends GeneratedMessageLite<C7015c, C7016a> implements StateOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C7015c f17339h = new C7015c();

        /* renamed from: i */
        private static volatile Parser<C7015c> f17340i;

        /* renamed from: e */
        private int f17341e;

        /* renamed from: f */
        private ProtobufList<C7434p> f17342f = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: g */
        private int f17343g;

        /* renamed from: co.znly.models.core.StatesProto$ContactsSuggestionsState$c$a */
        public static final class C7016a extends Builder<C7015c, C7016a> implements StateOrBuilder {
            /* synthetic */ C7016a(C7137k1 k1Var) {
                this();
            }

            public C7434p getState(int i) {
                return ((C7015c) this.instance).getState(i);
            }

            public int getStateCount() {
                return ((C7015c) this.instance).getStateCount();
            }

            public List<C7434p> getStateList() {
                return Collections.unmodifiableList(((C7015c) this.instance).getStateList());
            }

            public C7188p1 getStatus() {
                return ((C7015c) this.instance).getStatus();
            }

            public int getStatusValue() {
                return ((C7015c) this.instance).getStatusValue();
            }

            private C7016a() {
                super(C7015c.f17339h);
            }
        }

        static {
            f17339h.makeImmutable();
        }

        private C7015c() {
        }

        public static C7015c getDefaultInstance() {
            return f17339h;
        }

        public static Parser<C7015c> parser() {
            return f17339h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7015c();
                case 2:
                    return f17339h;
                case 3:
                    this.f17342f.makeImmutable();
                    return null;
                case 4:
                    return new C7016a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7015c cVar = (C7015c) obj2;
                    this.f17342f = visitor.visitList(this.f17342f, cVar.f17342f);
                    boolean z2 = this.f17343g != 0;
                    int i = this.f17343g;
                    if (cVar.f17343g != 0) {
                        z = true;
                    }
                    this.f17343g = visitor.visitInt(z2, i, z, cVar.f17343g);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f17341e |= cVar.f17341e;
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
                                    if (!this.f17342f.isModifiable()) {
                                        this.f17342f = GeneratedMessageLite.mutableCopy(this.f17342f);
                                    }
                                    this.f17342f.add(codedInputStream.readMessage(C7434p.parser(), extensionRegistryLite));
                                } else if (readTag == 16) {
                                    this.f17343g = codedInputStream.readEnum();
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
                    if (f17340i == null) {
                        synchronized (C7015c.class) {
                            if (f17340i == null) {
                                f17340i = new DefaultInstanceBasedParser(f17339h);
                            }
                        }
                    }
                    return f17340i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17339h;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f17342f.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17342f.get(i3));
            }
            if (this.f17343g != C7188p1.CACHE.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(2, this.f17343g);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C7434p getState(int i) {
            return (C7434p) this.f17342f.get(i);
        }

        public int getStateCount() {
            return this.f17342f.size();
        }

        public List<C7434p> getStateList() {
            return this.f17342f;
        }

        public C7188p1 getStatus() {
            C7188p1 a = C7188p1.m17903a(this.f17343g);
            return a == null ? C7188p1.UNRECOGNIZED : a;
        }

        public int getStatusValue() {
            return this.f17343g;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f17342f.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f17342f.get(i));
            }
            if (this.f17343g != C7188p1.CACHE.getNumber()) {
                codedOutputStream.writeEnum(2, this.f17343g);
            }
        }
    }

    static {
        f17331g.makeImmutable();
    }

    private StatesProto$ContactsSuggestionsState() {
    }

    public static C7012a newBuilder() {
        return (C7012a) f17331g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
            case 1:
                return new StatesProto$ContactsSuggestionsState();
            case 2:
                return f17331g;
            case 3:
                return null;
            case 4:
                return new C7012a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                StatesProto$ContactsSuggestionsState statesProto$ContactsSuggestionsState = (StatesProto$ContactsSuggestionsState) obj2;
                this.f17333e = (C7015c) visitor.visitMessage(this.f17333e, statesProto$ContactsSuggestionsState.f17333e);
                this.f17334f = (C7013b) visitor.visitMessage(this.f17334f, statesProto$ContactsSuggestionsState.f17334f);
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
                                Builder builder = this.f17333e != null ? (C7016a) this.f17333e.toBuilder() : null;
                                this.f17333e = (C7015c) codedInputStream.readMessage(C7015c.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17333e);
                                    this.f17333e = (C7015c) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f17334f != null ? (C7014a) this.f17334f.toBuilder() : null;
                                this.f17334f = (C7013b) codedInputStream.readMessage(C7013b.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17334f);
                                    this.f17334f = (C7013b) builder2.buildPartial();
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
                if (f17332h == null) {
                    synchronized (StatesProto$ContactsSuggestionsState.class) {
                        if (f17332h == null) {
                            f17332h = new DefaultInstanceBasedParser(f17331g);
                        }
                    }
                }
                return f17332h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17331g;
    }

    public C7013b getEvent() {
        C7013b bVar = this.f17334f;
        return bVar == null ? C7013b.getDefaultInstance() : bVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17333e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getState());
        }
        if (this.f17334f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getEvent());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7015c getState() {
        C7015c cVar = this.f17333e;
        return cVar == null ? C7015c.getDefaultInstance() : cVar;
    }

    public boolean hasEvent() {
        return this.f17334f != null;
    }

    public boolean hasState() {
        return this.f17333e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17333e != null) {
            codedOutputStream.writeMessage(1, getState());
        }
        if (this.f17334f != null) {
            codedOutputStream.writeMessage(2, getEvent());
        }
    }
}
