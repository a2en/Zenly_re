package p213co.znly.models.services;

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
import p213co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue;
import p213co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue.C7909a;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$NearestVenueResponse$Response */
public final class ReverseGeoCoderProto$NearestVenueResponse$Response extends GeneratedMessageLite<ReverseGeoCoderProto$NearestVenueResponse$Response, C7930a> implements ReverseGeoCoderProto$NearestVenueResponse$ResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final ReverseGeoCoderProto$NearestVenueResponse$Response f20115f = new ReverseGeoCoderProto$NearestVenueResponse$Response();

    /* renamed from: g */
    private static volatile Parser<ReverseGeoCoderProto$NearestVenueResponse$Response> f20116g;

    /* renamed from: e */
    private ProtobufList<C7931b> f20117e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.ReverseGeoCoderProto$NearestVenueResponse$Response$VenueOrBuilder */
    public interface VenueOrBuilder extends MessageLiteOrBuilder {
        double getCenterToCenterDistance();

        double getCenterToPolygonDistance();

        ReverseGeoCoderProto$Venue getVenue();

        boolean hasVenue();
    }

    /* renamed from: co.znly.models.services.ReverseGeoCoderProto$NearestVenueResponse$Response$a */
    public static final class C7930a extends Builder<ReverseGeoCoderProto$NearestVenueResponse$Response, C7930a> implements ReverseGeoCoderProto$NearestVenueResponse$ResponseOrBuilder {
        /* synthetic */ C7930a(C8005c cVar) {
            this();
        }

        public C7931b getVenue(int i) {
            return ((ReverseGeoCoderProto$NearestVenueResponse$Response) this.instance).getVenue(i);
        }

        public int getVenueCount() {
            return ((ReverseGeoCoderProto$NearestVenueResponse$Response) this.instance).getVenueCount();
        }

        public List<C7931b> getVenueList() {
            return Collections.unmodifiableList(((ReverseGeoCoderProto$NearestVenueResponse$Response) this.instance).getVenueList());
        }

        private C7930a() {
            super(ReverseGeoCoderProto$NearestVenueResponse$Response.f20115f);
        }
    }

    /* renamed from: co.znly.models.services.ReverseGeoCoderProto$NearestVenueResponse$Response$b */
    public static final class C7931b extends GeneratedMessageLite<C7931b, C7932a> implements VenueOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C7931b f20118h = new C7931b();

        /* renamed from: i */
        private static volatile Parser<C7931b> f20119i;

        /* renamed from: e */
        private ReverseGeoCoderProto$Venue f20120e;

        /* renamed from: f */
        private double f20121f;

        /* renamed from: g */
        private double f20122g;

        /* renamed from: co.znly.models.services.ReverseGeoCoderProto$NearestVenueResponse$Response$b$a */
        public static final class C7932a extends Builder<C7931b, C7932a> implements VenueOrBuilder {
            /* synthetic */ C7932a(C8005c cVar) {
                this();
            }

            public double getCenterToCenterDistance() {
                return ((C7931b) this.instance).getCenterToCenterDistance();
            }

            public double getCenterToPolygonDistance() {
                return ((C7931b) this.instance).getCenterToPolygonDistance();
            }

            public ReverseGeoCoderProto$Venue getVenue() {
                return ((C7931b) this.instance).getVenue();
            }

            public boolean hasVenue() {
                return ((C7931b) this.instance).hasVenue();
            }

            private C7932a() {
                super(C7931b.f20118h);
            }
        }

        static {
            f20118h.makeImmutable();
        }

        private C7931b() {
        }

        public static Parser<C7931b> parser() {
            return f20118h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C8005c.f20316a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7931b();
                case 2:
                    return f20118h;
                case 3:
                    return null;
                case 4:
                    return new C7932a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7931b bVar = (C7931b) obj2;
                    this.f20120e = (ReverseGeoCoderProto$Venue) visitor.visitMessage(this.f20120e, bVar.f20120e);
                    this.f20121f = visitor.visitDouble(this.f20121f != 0.0d, this.f20121f, bVar.f20121f != 0.0d, bVar.f20121f);
                    this.f20122g = visitor.visitDouble(this.f20122g != 0.0d, this.f20122g, bVar.f20122g != 0.0d, bVar.f20122g);
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
                                    Builder builder = this.f20120e != null ? (C7909a) this.f20120e.toBuilder() : null;
                                    this.f20120e = (ReverseGeoCoderProto$Venue) codedInputStream.readMessage(ReverseGeoCoderProto$Venue.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f20120e);
                                        this.f20120e = (ReverseGeoCoderProto$Venue) builder.buildPartial();
                                    }
                                } else if (readTag == 17) {
                                    this.f20121f = codedInputStream.readDouble();
                                } else if (readTag == 25) {
                                    this.f20122g = codedInputStream.readDouble();
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
                    if (f20119i == null) {
                        synchronized (C7931b.class) {
                            if (f20119i == null) {
                                f20119i = new DefaultInstanceBasedParser(f20118h);
                            }
                        }
                    }
                    return f20119i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f20118h;
        }

        public double getCenterToCenterDistance() {
            return this.f20121f;
        }

        public double getCenterToPolygonDistance() {
            return this.f20122g;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f20120e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getVenue());
            }
            double d = this.f20121f;
            if (d != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(2, d);
            }
            double d2 = this.f20122g;
            if (d2 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(3, d2);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public ReverseGeoCoderProto$Venue getVenue() {
            ReverseGeoCoderProto$Venue reverseGeoCoderProto$Venue = this.f20120e;
            return reverseGeoCoderProto$Venue == null ? ReverseGeoCoderProto$Venue.getDefaultInstance() : reverseGeoCoderProto$Venue;
        }

        public boolean hasVenue() {
            return this.f20120e != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f20120e != null) {
                codedOutputStream.writeMessage(1, getVenue());
            }
            double d = this.f20121f;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(2, d);
            }
            double d2 = this.f20122g;
            if (d2 != 0.0d) {
                codedOutputStream.writeDouble(3, d2);
            }
        }
    }

    static {
        f20115f.makeImmutable();
    }

    private ReverseGeoCoderProto$NearestVenueResponse$Response() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8005c.f20316a[methodToInvoke.ordinal()]) {
            case 1:
                return new ReverseGeoCoderProto$NearestVenueResponse$Response();
            case 2:
                return f20115f;
            case 3:
                this.f20117e.makeImmutable();
                return null;
            case 4:
                return new C7930a(null);
            case 5:
                this.f20117e = ((Visitor) obj).visitList(this.f20117e, ((ReverseGeoCoderProto$NearestVenueResponse$Response) obj2).f20117e);
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
                                if (!this.f20117e.isModifiable()) {
                                    this.f20117e = GeneratedMessageLite.mutableCopy(this.f20117e);
                                }
                                this.f20117e.add(codedInputStream.readMessage(C7931b.parser(), extensionRegistryLite));
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
                if (f20116g == null) {
                    synchronized (ReverseGeoCoderProto$NearestVenueResponse$Response.class) {
                        if (f20116g == null) {
                            f20116g = new DefaultInstanceBasedParser(f20115f);
                        }
                    }
                }
                return f20116g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20115f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20117e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20117e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7931b getVenue(int i) {
        return (C7931b) this.f20117e.get(i);
    }

    public int getVenueCount() {
        return this.f20117e.size();
    }

    public List<C7931b> getVenueList() {
        return this.f20117e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20117e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20117e.get(i));
        }
    }
}
