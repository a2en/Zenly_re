package p213co.znly.models.core;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.reversegeocoder.C7921g;

/* renamed from: co.znly.models.core.GeoProto$RouteUserETAResponse */
public final class GeoProto$RouteUserETAResponse extends GeneratedMessageLite<GeoProto$RouteUserETAResponse, C6986a> implements GeoProto$RouteUserETAResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final GeoProto$RouteUserETAResponse f17241f = new GeoProto$RouteUserETAResponse();

    /* renamed from: g */
    private static volatile Parser<GeoProto$RouteUserETAResponse> f17242g;

    /* renamed from: e */
    private ProtobufList<C6987b> f17243e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.GeoProto$RouteUserETAResponse$RouteUserETAOrBuilder */
    public interface RouteUserETAOrBuilder extends MessageLiteOrBuilder {
        long getDistanceInMeters();

        Duration getDuration();

        C7921g getMode();

        int getModeValue();

        String getUserUuid();

        ByteString getUserUuidBytes();

        boolean hasDuration();
    }

    /* renamed from: co.znly.models.core.GeoProto$RouteUserETAResponse$a */
    public static final class C6986a extends Builder<GeoProto$RouteUserETAResponse, C6986a> implements GeoProto$RouteUserETAResponseOrBuilder {
        /* synthetic */ C6986a(C7051a1 a1Var) {
            this();
        }

        public C6987b getEtas(int i) {
            return ((GeoProto$RouteUserETAResponse) this.instance).getEtas(i);
        }

        public int getEtasCount() {
            return ((GeoProto$RouteUserETAResponse) this.instance).getEtasCount();
        }

        public List<C6987b> getEtasList() {
            return Collections.unmodifiableList(((GeoProto$RouteUserETAResponse) this.instance).getEtasList());
        }

        private C6986a() {
            super(GeoProto$RouteUserETAResponse.f17241f);
        }
    }

    /* renamed from: co.znly.models.core.GeoProto$RouteUserETAResponse$b */
    public static final class C6987b extends GeneratedMessageLite<C6987b, C6988a> implements RouteUserETAOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static final C6987b f17244i = new C6987b();

        /* renamed from: j */
        private static volatile Parser<C6987b> f17245j;

        /* renamed from: e */
        private String f17246e = "";

        /* renamed from: f */
        private int f17247f;

        /* renamed from: g */
        private long f17248g;

        /* renamed from: h */
        private Duration f17249h;

        /* renamed from: co.znly.models.core.GeoProto$RouteUserETAResponse$b$a */
        public static final class C6988a extends Builder<C6987b, C6988a> implements RouteUserETAOrBuilder {
            /* synthetic */ C6988a(C7051a1 a1Var) {
                this();
            }

            public long getDistanceInMeters() {
                return ((C6987b) this.instance).getDistanceInMeters();
            }

            public Duration getDuration() {
                return ((C6987b) this.instance).getDuration();
            }

            public C7921g getMode() {
                return ((C6987b) this.instance).getMode();
            }

            public int getModeValue() {
                return ((C6987b) this.instance).getModeValue();
            }

            public String getUserUuid() {
                return ((C6987b) this.instance).getUserUuid();
            }

            public ByteString getUserUuidBytes() {
                return ((C6987b) this.instance).getUserUuidBytes();
            }

            public boolean hasDuration() {
                return ((C6987b) this.instance).hasDuration();
            }

            private C6988a() {
                super(C6987b.f17244i);
            }
        }

        static {
            f17244i.makeImmutable();
        }

        private C6987b() {
        }

        public static Parser<C6987b> parser() {
            return f17244i.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7051a1.f17440a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6987b();
                case 2:
                    return f17244i;
                case 3:
                    return null;
                case 4:
                    return new C6988a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6987b bVar = (C6987b) obj2;
                    this.f17246e = visitor.visitString(!this.f17246e.isEmpty(), this.f17246e, !bVar.f17246e.isEmpty(), bVar.f17246e);
                    this.f17247f = visitor.visitInt(this.f17247f != 0, this.f17247f, bVar.f17247f != 0, bVar.f17247f);
                    this.f17248g = visitor.visitLong(this.f17248g != 0, this.f17248g, bVar.f17248g != 0, bVar.f17248g);
                    this.f17249h = (Duration) visitor.visitMessage(this.f17249h, bVar.f17249h);
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
                                    this.f17246e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.f17247f = codedInputStream.readEnum();
                                } else if (readTag == 24) {
                                    this.f17248g = codedInputStream.readInt64();
                                } else if (readTag == 34) {
                                    Builder builder = this.f17249h != null ? (Duration.Builder) this.f17249h.toBuilder() : null;
                                    this.f17249h = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f17249h);
                                        this.f17249h = (Duration) builder.buildPartial();
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
                    if (f17245j == null) {
                        synchronized (C6987b.class) {
                            if (f17245j == null) {
                                f17245j = new DefaultInstanceBasedParser(f17244i);
                            }
                        }
                    }
                    return f17245j;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17244i;
        }

        public long getDistanceInMeters() {
            return this.f17248g;
        }

        public Duration getDuration() {
            Duration duration = this.f17249h;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public C7921g getMode() {
            C7921g a = C7921g.m18962a(this.f17247f);
            return a == null ? C7921g.UNRECOGNIZED : a;
        }

        public int getModeValue() {
            return this.f17247f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f17246e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getUserUuid());
            }
            if (this.f17247f != C7921g.TRAVEL_MODE_WALKING.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(2, this.f17247f);
            }
            long j = this.f17248g;
            if (j != 0) {
                i2 += CodedOutputStream.computeInt64Size(3, j);
            }
            if (this.f17249h != null) {
                i2 += CodedOutputStream.computeMessageSize(4, getDuration());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String getUserUuid() {
            return this.f17246e;
        }

        public ByteString getUserUuidBytes() {
            return ByteString.copyFromUtf8(this.f17246e);
        }

        public boolean hasDuration() {
            return this.f17249h != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f17246e.isEmpty()) {
                codedOutputStream.writeString(1, getUserUuid());
            }
            if (this.f17247f != C7921g.TRAVEL_MODE_WALKING.getNumber()) {
                codedOutputStream.writeEnum(2, this.f17247f);
            }
            long j = this.f17248g;
            if (j != 0) {
                codedOutputStream.writeInt64(3, j);
            }
            if (this.f17249h != null) {
                codedOutputStream.writeMessage(4, getDuration());
            }
        }
    }

    static {
        f17241f.makeImmutable();
    }

    private GeoProto$RouteUserETAResponse() {
    }

    public static C6986a newBuilder() {
        return (C6986a) f17241f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7051a1.f17440a[methodToInvoke.ordinal()]) {
            case 1:
                return new GeoProto$RouteUserETAResponse();
            case 2:
                return f17241f;
            case 3:
                this.f17243e.makeImmutable();
                return null;
            case 4:
                return new C6986a(null);
            case 5:
                this.f17243e = ((Visitor) obj).visitList(this.f17243e, ((GeoProto$RouteUserETAResponse) obj2).f17243e);
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
                                if (!this.f17243e.isModifiable()) {
                                    this.f17243e = GeneratedMessageLite.mutableCopy(this.f17243e);
                                }
                                this.f17243e.add(codedInputStream.readMessage(C6987b.parser(), extensionRegistryLite));
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
                if (f17242g == null) {
                    synchronized (GeoProto$RouteUserETAResponse.class) {
                        if (f17242g == null) {
                            f17242g = new DefaultInstanceBasedParser(f17241f);
                        }
                    }
                }
                return f17242g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17241f;
    }

    public C6987b getEtas(int i) {
        return (C6987b) this.f17243e.get(i);
    }

    public int getEtasCount() {
        return this.f17243e.size();
    }

    public List<C6987b> getEtasList() {
        return this.f17243e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17243e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17243e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17243e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17243e.get(i));
        }
    }
}
