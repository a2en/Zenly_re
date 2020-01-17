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

/* renamed from: co.znly.models.core.StatesProto$RecentsState */
public final class StatesProto$RecentsState extends GeneratedMessageLite<StatesProto$RecentsState, C7032a> implements StatesProto$RecentsStateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final StatesProto$RecentsState f17383f = new StatesProto$RecentsState();

    /* renamed from: g */
    private static volatile Parser<StatesProto$RecentsState> f17384g;

    /* renamed from: e */
    private C7033b f17385e;

    /* renamed from: co.znly.models.core.StatesProto$RecentsState$StateOrBuilder */
    public interface StateOrBuilder extends MessageLiteOrBuilder {
        C7138k2 getState(int i);

        int getStateCount();

        List<C7138k2> getStateList();

        C7188p1 getStatus();

        int getStatusValue();
    }

    /* renamed from: co.znly.models.core.StatesProto$RecentsState$a */
    public static final class C7032a extends Builder<StatesProto$RecentsState, C7032a> implements StatesProto$RecentsStateOrBuilder {
        /* synthetic */ C7032a(C7137k1 k1Var) {
            this();
        }

        public C7033b getState() {
            return ((StatesProto$RecentsState) this.instance).getState();
        }

        public boolean hasState() {
            return ((StatesProto$RecentsState) this.instance).hasState();
        }

        private C7032a() {
            super(StatesProto$RecentsState.f17383f);
        }
    }

    /* renamed from: co.znly.models.core.StatesProto$RecentsState$b */
    public static final class C7033b extends GeneratedMessageLite<C7033b, C7034a> implements StateOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C7033b f17386h = new C7033b();

        /* renamed from: i */
        private static volatile Parser<C7033b> f17387i;

        /* renamed from: e */
        private int f17388e;

        /* renamed from: f */
        private ProtobufList<C7138k2> f17389f = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: g */
        private int f17390g;

        /* renamed from: co.znly.models.core.StatesProto$RecentsState$b$a */
        public static final class C7034a extends Builder<C7033b, C7034a> implements StateOrBuilder {
            /* synthetic */ C7034a(C7137k1 k1Var) {
                this();
            }

            public C7138k2 getState(int i) {
                return ((C7033b) this.instance).getState(i);
            }

            public int getStateCount() {
                return ((C7033b) this.instance).getStateCount();
            }

            public List<C7138k2> getStateList() {
                return Collections.unmodifiableList(((C7033b) this.instance).getStateList());
            }

            public C7188p1 getStatus() {
                return ((C7033b) this.instance).getStatus();
            }

            public int getStatusValue() {
                return ((C7033b) this.instance).getStatusValue();
            }

            private C7034a() {
                super(C7033b.f17386h);
            }
        }

        static {
            f17386h.makeImmutable();
        }

        private C7033b() {
        }

        public static C7033b getDefaultInstance() {
            return f17386h;
        }

        public static Parser<C7033b> parser() {
            return f17386h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7033b();
                case 2:
                    return f17386h;
                case 3:
                    this.f17389f.makeImmutable();
                    return null;
                case 4:
                    return new C7034a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7033b bVar = (C7033b) obj2;
                    this.f17389f = visitor.visitList(this.f17389f, bVar.f17389f);
                    boolean z2 = this.f17390g != 0;
                    int i = this.f17390g;
                    if (bVar.f17390g != 0) {
                        z = true;
                    }
                    this.f17390g = visitor.visitInt(z2, i, z, bVar.f17390g);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f17388e |= bVar.f17388e;
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
                                    if (!this.f17389f.isModifiable()) {
                                        this.f17389f = GeneratedMessageLite.mutableCopy(this.f17389f);
                                    }
                                    this.f17389f.add(codedInputStream.readMessage(C7138k2.parser(), extensionRegistryLite));
                                } else if (readTag == 16) {
                                    this.f17390g = codedInputStream.readEnum();
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
                    if (f17387i == null) {
                        synchronized (C7033b.class) {
                            if (f17387i == null) {
                                f17387i = new DefaultInstanceBasedParser(f17386h);
                            }
                        }
                    }
                    return f17387i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17386h;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f17389f.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17389f.get(i3));
            }
            if (this.f17390g != C7188p1.CACHE.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(2, this.f17390g);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C7138k2 getState(int i) {
            return (C7138k2) this.f17389f.get(i);
        }

        public int getStateCount() {
            return this.f17389f.size();
        }

        public List<C7138k2> getStateList() {
            return this.f17389f;
        }

        public C7188p1 getStatus() {
            C7188p1 a = C7188p1.m17903a(this.f17390g);
            return a == null ? C7188p1.UNRECOGNIZED : a;
        }

        public int getStatusValue() {
            return this.f17390g;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f17389f.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f17389f.get(i));
            }
            if (this.f17390g != C7188p1.CACHE.getNumber()) {
                codedOutputStream.writeEnum(2, this.f17390g);
            }
        }
    }

    static {
        f17383f.makeImmutable();
    }

    private StatesProto$RecentsState() {
    }

    public static C7032a newBuilder() {
        return (C7032a) f17383f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
            case 1:
                return new StatesProto$RecentsState();
            case 2:
                return f17383f;
            case 3:
                return null;
            case 4:
                return new C7032a(null);
            case 5:
                this.f17385e = (C7033b) ((Visitor) obj).visitMessage(this.f17385e, ((StatesProto$RecentsState) obj2).f17385e);
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
                                Builder builder = this.f17385e != null ? (C7034a) this.f17385e.toBuilder() : null;
                                this.f17385e = (C7033b) codedInputStream.readMessage(C7033b.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17385e);
                                    this.f17385e = (C7033b) builder.buildPartial();
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
                if (f17384g == null) {
                    synchronized (StatesProto$RecentsState.class) {
                        if (f17384g == null) {
                            f17384g = new DefaultInstanceBasedParser(f17383f);
                        }
                    }
                }
                return f17384g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17383f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17385e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getState());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7033b getState() {
        C7033b bVar = this.f17385e;
        return bVar == null ? C7033b.getDefaultInstance() : bVar;
    }

    public boolean hasState() {
        return this.f17385e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17385e != null) {
            codedOutputStream.writeMessage(1, getState());
        }
    }
}
