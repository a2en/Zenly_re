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

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$NearestCheckinResponse$Response */
public final class ReverseGeoCoderProto$NearestCheckinResponse$Response extends GeneratedMessageLite<ReverseGeoCoderProto$NearestCheckinResponse$Response, C7927a> implements ReverseGeoCoderProto$NearestCheckinResponse$ResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final ReverseGeoCoderProto$NearestCheckinResponse$Response f20104f = new ReverseGeoCoderProto$NearestCheckinResponse$Response();

    /* renamed from: g */
    private static volatile Parser<ReverseGeoCoderProto$NearestCheckinResponse$Response> f20105g;

    /* renamed from: e */
    private ProtobufList<C7928b> f20106e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.ReverseGeoCoderProto$NearestCheckinResponse$Response$CheckinStatisticsOrBuilder */
    public interface CheckinStatisticsOrBuilder extends MessageLiteOrBuilder {
        long getCheckinCount();

        double getCheckinMaxDistance();

        double getCheckinMeanDistance();

        double getCheckinMinDistance();

        double getCheckinVarDistance();

        long getPoiId();
    }

    /* renamed from: co.znly.models.services.ReverseGeoCoderProto$NearestCheckinResponse$Response$a */
    public static final class C7927a extends Builder<ReverseGeoCoderProto$NearestCheckinResponse$Response, C7927a> implements ReverseGeoCoderProto$NearestCheckinResponse$ResponseOrBuilder {
        /* synthetic */ C7927a(C8005c cVar) {
            this();
        }

        public C7928b getCheckinStats(int i) {
            return ((ReverseGeoCoderProto$NearestCheckinResponse$Response) this.instance).getCheckinStats(i);
        }

        public int getCheckinStatsCount() {
            return ((ReverseGeoCoderProto$NearestCheckinResponse$Response) this.instance).getCheckinStatsCount();
        }

        public List<C7928b> getCheckinStatsList() {
            return Collections.unmodifiableList(((ReverseGeoCoderProto$NearestCheckinResponse$Response) this.instance).getCheckinStatsList());
        }

        private C7927a() {
            super(ReverseGeoCoderProto$NearestCheckinResponse$Response.f20104f);
        }
    }

    /* renamed from: co.znly.models.services.ReverseGeoCoderProto$NearestCheckinResponse$Response$b */
    public static final class C7928b extends GeneratedMessageLite<C7928b, C7929a> implements CheckinStatisticsOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public static final C7928b f20107k = new C7928b();

        /* renamed from: l */
        private static volatile Parser<C7928b> f20108l;

        /* renamed from: e */
        private long f20109e;

        /* renamed from: f */
        private long f20110f;

        /* renamed from: g */
        private double f20111g;

        /* renamed from: h */
        private double f20112h;

        /* renamed from: i */
        private double f20113i;

        /* renamed from: j */
        private double f20114j;

        /* renamed from: co.znly.models.services.ReverseGeoCoderProto$NearestCheckinResponse$Response$b$a */
        public static final class C7929a extends Builder<C7928b, C7929a> implements CheckinStatisticsOrBuilder {
            /* synthetic */ C7929a(C8005c cVar) {
                this();
            }

            public long getCheckinCount() {
                return ((C7928b) this.instance).getCheckinCount();
            }

            public double getCheckinMaxDistance() {
                return ((C7928b) this.instance).getCheckinMaxDistance();
            }

            public double getCheckinMeanDistance() {
                return ((C7928b) this.instance).getCheckinMeanDistance();
            }

            public double getCheckinMinDistance() {
                return ((C7928b) this.instance).getCheckinMinDistance();
            }

            public double getCheckinVarDistance() {
                return ((C7928b) this.instance).getCheckinVarDistance();
            }

            public long getPoiId() {
                return ((C7928b) this.instance).getPoiId();
            }

            private C7929a() {
                super(C7928b.f20107k);
            }
        }

        static {
            f20107k.makeImmutable();
        }

        private C7928b() {
        }

        public static Parser<C7928b> parser() {
            return f20107k.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C8005c.f20316a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7928b();
                case 2:
                    return f20107k;
                case 3:
                    return null;
                case 4:
                    return new C7929a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7928b bVar = (C7928b) obj2;
                    this.f20109e = visitor.visitLong(this.f20109e != 0, this.f20109e, bVar.f20109e != 0, bVar.f20109e);
                    this.f20110f = visitor.visitLong(this.f20110f != 0, this.f20110f, bVar.f20110f != 0, bVar.f20110f);
                    this.f20111g = visitor.visitDouble(this.f20111g != 0.0d, this.f20111g, bVar.f20111g != 0.0d, bVar.f20111g);
                    this.f20112h = visitor.visitDouble(this.f20112h != 0.0d, this.f20112h, bVar.f20112h != 0.0d, bVar.f20112h);
                    this.f20113i = visitor.visitDouble(this.f20113i != 0.0d, this.f20113i, bVar.f20113i != 0.0d, bVar.f20113i);
                    this.f20114j = visitor.visitDouble(this.f20114j != 0.0d, this.f20114j, bVar.f20114j != 0.0d, bVar.f20114j);
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
                                    this.f20109e = codedInputStream.readUInt64();
                                } else if (readTag == 16) {
                                    this.f20110f = codedInputStream.readUInt64();
                                } else if (readTag == 25) {
                                    this.f20111g = codedInputStream.readDouble();
                                } else if (readTag == 33) {
                                    this.f20112h = codedInputStream.readDouble();
                                } else if (readTag == 41) {
                                    this.f20113i = codedInputStream.readDouble();
                                } else if (readTag == 49) {
                                    this.f20114j = codedInputStream.readDouble();
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
                    if (f20108l == null) {
                        synchronized (C7928b.class) {
                            if (f20108l == null) {
                                f20108l = new DefaultInstanceBasedParser(f20107k);
                            }
                        }
                    }
                    return f20108l;
                default:
                    throw new UnsupportedOperationException();
            }
            return f20107k;
        }

        public long getCheckinCount() {
            return this.f20110f;
        }

        public double getCheckinMaxDistance() {
            return this.f20112h;
        }

        public double getCheckinMeanDistance() {
            return this.f20113i;
        }

        public double getCheckinMinDistance() {
            return this.f20111g;
        }

        public double getCheckinVarDistance() {
            return this.f20114j;
        }

        public long getPoiId() {
            return this.f20109e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            long j = this.f20109e;
            if (j != 0) {
                i2 = 0 + CodedOutputStream.computeUInt64Size(1, j);
            }
            long j2 = this.f20110f;
            if (j2 != 0) {
                i2 += CodedOutputStream.computeUInt64Size(2, j2);
            }
            double d = this.f20111g;
            if (d != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(3, d);
            }
            double d2 = this.f20112h;
            if (d2 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(4, d2);
            }
            double d3 = this.f20113i;
            if (d3 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(5, d3);
            }
            double d4 = this.f20114j;
            if (d4 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(6, d4);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.f20109e;
            if (j != 0) {
                codedOutputStream.writeUInt64(1, j);
            }
            long j2 = this.f20110f;
            if (j2 != 0) {
                codedOutputStream.writeUInt64(2, j2);
            }
            double d = this.f20111g;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(3, d);
            }
            double d2 = this.f20112h;
            if (d2 != 0.0d) {
                codedOutputStream.writeDouble(4, d2);
            }
            double d3 = this.f20113i;
            if (d3 != 0.0d) {
                codedOutputStream.writeDouble(5, d3);
            }
            double d4 = this.f20114j;
            if (d4 != 0.0d) {
                codedOutputStream.writeDouble(6, d4);
            }
        }
    }

    static {
        f20104f.makeImmutable();
    }

    private ReverseGeoCoderProto$NearestCheckinResponse$Response() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8005c.f20316a[methodToInvoke.ordinal()]) {
            case 1:
                return new ReverseGeoCoderProto$NearestCheckinResponse$Response();
            case 2:
                return f20104f;
            case 3:
                this.f20106e.makeImmutable();
                return null;
            case 4:
                return new C7927a(null);
            case 5:
                this.f20106e = ((Visitor) obj).visitList(this.f20106e, ((ReverseGeoCoderProto$NearestCheckinResponse$Response) obj2).f20106e);
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
                                if (!this.f20106e.isModifiable()) {
                                    this.f20106e = GeneratedMessageLite.mutableCopy(this.f20106e);
                                }
                                this.f20106e.add(codedInputStream.readMessage(C7928b.parser(), extensionRegistryLite));
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
                if (f20105g == null) {
                    synchronized (ReverseGeoCoderProto$NearestCheckinResponse$Response.class) {
                        if (f20105g == null) {
                            f20105g = new DefaultInstanceBasedParser(f20104f);
                        }
                    }
                }
                return f20105g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20104f;
    }

    public C7928b getCheckinStats(int i) {
        return (C7928b) this.f20106e.get(i);
    }

    public int getCheckinStatsCount() {
        return this.f20106e.size();
    }

    public List<C7928b> getCheckinStatsList() {
        return this.f20106e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20106e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20106e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20106e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20106e.get(i));
        }
    }
}
