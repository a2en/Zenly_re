package p213co.znly.models;

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
import p213co.znly.models.C6958b2.C6959a;

/* renamed from: co.znly.models.PlaceProto$PlaceAttendance */
public final class PlaceProto$PlaceAttendance extends GeneratedMessageLite<PlaceProto$PlaceAttendance, C6852a> implements PlaceProto$PlaceAttendanceOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final PlaceProto$PlaceAttendance f16700m = new PlaceProto$PlaceAttendance();

    /* renamed from: n */
    private static volatile Parser<PlaceProto$PlaceAttendance> f16701n;

    /* renamed from: e */
    private int f16702e;

    /* renamed from: f */
    private ContinuousHistogram f16703f;

    /* renamed from: g */
    private ContinuousHistogram f16704g;

    /* renamed from: h */
    private ContinuousHistogram f16705h;

    /* renamed from: i */
    private ContinuousHistogram f16706i;

    /* renamed from: j */
    private ContinuousHistogram f16707j;

    /* renamed from: k */
    private ContinuousHistogram f16708k;

    /* renamed from: l */
    private ContinuousHistogram f16709l;

    /* renamed from: co.znly.models.PlaceProto$PlaceAttendance$ContinuousHistogram */
    public static final class ContinuousHistogram extends GeneratedMessageLite<ContinuousHistogram, C6849a> implements ContinuousHistogramOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: j */
        public static final ContinuousHistogram f16710j = new ContinuousHistogram();

        /* renamed from: k */
        private static volatile Parser<ContinuousHistogram> f16711k;

        /* renamed from: e */
        private int f16712e;

        /* renamed from: f */
        private int f16713f;

        /* renamed from: g */
        private int f16714g;

        /* renamed from: h */
        private int f16715h;

        /* renamed from: i */
        private ProtobufList<C6850b> f16716i = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: co.znly.models.PlaceProto$PlaceAttendance$ContinuousHistogram$PairDurationsProbaOrBuilder */
        public interface PairDurationsProbaOrBuilder extends MessageLiteOrBuilder {
            C6958b2 getDurations();

            int getProba();

            boolean hasDurations();
        }

        /* renamed from: co.znly.models.PlaceProto$PlaceAttendance$ContinuousHistogram$a */
        public static final class C6849a extends Builder<ContinuousHistogram, C6849a> implements ContinuousHistogramOrBuilder {
            /* synthetic */ C6849a(C6946a2 a2Var) {
                this();
            }

            public C6850b getBoundsValuesSeq(int i) {
                return ((ContinuousHistogram) this.instance).getBoundsValuesSeq(i);
            }

            public int getBoundsValuesSeqCount() {
                return ((ContinuousHistogram) this.instance).getBoundsValuesSeqCount();
            }

            public List<C6850b> getBoundsValuesSeqList() {
                return Collections.unmodifiableList(((ContinuousHistogram) this.instance).getBoundsValuesSeqList());
            }

            public int getNbDays() {
                return ((ContinuousHistogram) this.instance).getNbDays();
            }

            public int getNbHisto() {
                return ((ContinuousHistogram) this.instance).getNbHisto();
            }

            public int getNormalizationValue() {
                return ((ContinuousHistogram) this.instance).getNormalizationValue();
            }

            private C6849a() {
                super(ContinuousHistogram.f16710j);
            }
        }

        /* renamed from: co.znly.models.PlaceProto$PlaceAttendance$ContinuousHistogram$b */
        public static final class C6850b extends GeneratedMessageLite<C6850b, C6851a> implements PairDurationsProbaOrBuilder {
            /* access modifiers changed from: private */

            /* renamed from: g */
            public static final C6850b f16717g = new C6850b();

            /* renamed from: h */
            private static volatile Parser<C6850b> f16718h;

            /* renamed from: e */
            private C6958b2 f16719e;

            /* renamed from: f */
            private int f16720f;

            /* renamed from: co.znly.models.PlaceProto$PlaceAttendance$ContinuousHistogram$b$a */
            public static final class C6851a extends Builder<C6850b, C6851a> implements PairDurationsProbaOrBuilder {
                /* synthetic */ C6851a(C6946a2 a2Var) {
                    this();
                }

                public C6958b2 getDurations() {
                    return ((C6850b) this.instance).getDurations();
                }

                public int getProba() {
                    return ((C6850b) this.instance).getProba();
                }

                public boolean hasDurations() {
                    return ((C6850b) this.instance).hasDurations();
                }

                private C6851a() {
                    super(C6850b.f16717g);
                }
            }

            static {
                f16717g.makeImmutable();
            }

            private C6850b() {
            }

            public static Parser<C6850b> parser() {
                return f16717g.getParserForType();
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (C6946a2.f17113a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new C6850b();
                    case 2:
                        return f16717g;
                    case 3:
                        return null;
                    case 4:
                        return new C6851a(null);
                    case 5:
                        Visitor visitor = (Visitor) obj;
                        C6850b bVar = (C6850b) obj2;
                        this.f16719e = (C6958b2) visitor.visitMessage(this.f16719e, bVar.f16719e);
                        boolean z2 = this.f16720f != 0;
                        int i = this.f16720f;
                        if (bVar.f16720f != 0) {
                            z = true;
                        }
                        this.f16720f = visitor.visitInt(z2, i, z, bVar.f16720f);
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
                                        Builder builder = this.f16719e != null ? (C6959a) this.f16719e.toBuilder() : null;
                                        this.f16719e = (C6958b2) codedInputStream.readMessage(C6958b2.parser(), extensionRegistryLite);
                                        if (builder != null) {
                                            builder.mergeFrom(this.f16719e);
                                            this.f16719e = (C6958b2) builder.buildPartial();
                                        }
                                    } else if (readTag == 16) {
                                        this.f16720f = codedInputStream.readInt32();
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
                        if (f16718h == null) {
                            synchronized (C6850b.class) {
                                if (f16718h == null) {
                                    f16718h = new DefaultInstanceBasedParser(f16717g);
                                }
                            }
                        }
                        return f16718h;
                    default:
                        throw new UnsupportedOperationException();
                }
                return f16717g;
            }

            public C6958b2 getDurations() {
                C6958b2 b2Var = this.f16719e;
                return b2Var == null ? C6958b2.getDefaultInstance() : b2Var;
            }

            public int getProba() {
                return this.f16720f;
            }

            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if (this.f16719e != null) {
                    i2 = 0 + CodedOutputStream.computeMessageSize(1, getDurations());
                }
                int i3 = this.f16720f;
                if (i3 != 0) {
                    i2 += CodedOutputStream.computeInt32Size(2, i3);
                }
                this.memoizedSerializedSize = i2;
                return i2;
            }

            public boolean hasDurations() {
                return this.f16719e != null;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (this.f16719e != null) {
                    codedOutputStream.writeMessage(1, getDurations());
                }
                int i = this.f16720f;
                if (i != 0) {
                    codedOutputStream.writeInt32(2, i);
                }
            }
        }

        static {
            f16710j.makeImmutable();
        }

        private ContinuousHistogram() {
        }

        public static ContinuousHistogram getDefaultInstance() {
            return f16710j;
        }

        public static Parser<ContinuousHistogram> parser() {
            return f16710j.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C6946a2.f17113a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ContinuousHistogram();
                case 2:
                    return f16710j;
                case 3:
                    this.f16716i.makeImmutable();
                    return null;
                case 4:
                    return new C6849a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    ContinuousHistogram continuousHistogram = (ContinuousHistogram) obj2;
                    this.f16713f = visitor.visitInt(this.f16713f != 0, this.f16713f, continuousHistogram.f16713f != 0, continuousHistogram.f16713f);
                    this.f16714g = visitor.visitInt(this.f16714g != 0, this.f16714g, continuousHistogram.f16714g != 0, continuousHistogram.f16714g);
                    boolean z2 = this.f16715h != 0;
                    int i = this.f16715h;
                    if (continuousHistogram.f16715h != 0) {
                        z = true;
                    }
                    this.f16715h = visitor.visitInt(z2, i, z, continuousHistogram.f16715h);
                    this.f16716i = visitor.visitList(this.f16716i, continuousHistogram.f16716i);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f16712e |= continuousHistogram.f16712e;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.f16713f = codedInputStream.readInt32();
                                } else if (readTag == 16) {
                                    this.f16714g = codedInputStream.readInt32();
                                } else if (readTag == 50) {
                                    if (!this.f16716i.isModifiable()) {
                                        this.f16716i = GeneratedMessageLite.mutableCopy(this.f16716i);
                                    }
                                    this.f16716i.add(codedInputStream.readMessage(C6850b.parser(), extensionRegistryLite));
                                } else if (readTag == 56) {
                                    this.f16715h = codedInputStream.readInt32();
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
                    if (f16711k == null) {
                        synchronized (ContinuousHistogram.class) {
                            if (f16711k == null) {
                                f16711k = new DefaultInstanceBasedParser(f16710j);
                            }
                        }
                    }
                    return f16711k;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16710j;
        }

        public C6850b getBoundsValuesSeq(int i) {
            return (C6850b) this.f16716i.get(i);
        }

        public int getBoundsValuesSeqCount() {
            return this.f16716i.size();
        }

        public List<C6850b> getBoundsValuesSeqList() {
            return this.f16716i;
        }

        public int getNbDays() {
            return this.f16714g;
        }

        public int getNbHisto() {
            return this.f16713f;
        }

        public int getNormalizationValue() {
            return this.f16715h;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.f16713f;
            int computeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) + 0 : 0;
            int i3 = this.f16714g;
            if (i3 != 0) {
                computeInt32Size += CodedOutputStream.computeInt32Size(2, i3);
            }
            for (int i4 = 0; i4 < this.f16716i.size(); i4++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f16716i.get(i4));
            }
            int i5 = this.f16715h;
            if (i5 != 0) {
                computeInt32Size += CodedOutputStream.computeInt32Size(7, i5);
            }
            this.memoizedSerializedSize = computeInt32Size;
            return computeInt32Size;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.f16713f;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            int i2 = this.f16714g;
            if (i2 != 0) {
                codedOutputStream.writeInt32(2, i2);
            }
            for (int i3 = 0; i3 < this.f16716i.size(); i3++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.f16716i.get(i3));
            }
            int i4 = this.f16715h;
            if (i4 != 0) {
                codedOutputStream.writeInt32(7, i4);
            }
        }
    }

    /* renamed from: co.znly.models.PlaceProto$PlaceAttendance$ContinuousHistogramOrBuilder */
    public interface ContinuousHistogramOrBuilder extends MessageLiteOrBuilder {
        C6850b getBoundsValuesSeq(int i);

        int getBoundsValuesSeqCount();

        List<C6850b> getBoundsValuesSeqList();

        int getNbDays();

        int getNbHisto();

        int getNormalizationValue();
    }

    /* renamed from: co.znly.models.PlaceProto$PlaceAttendance$a */
    public static final class C6852a extends Builder<PlaceProto$PlaceAttendance, C6852a> implements PlaceProto$PlaceAttendanceOrBuilder {
        /* synthetic */ C6852a(C6946a2 a2Var) {
            this();
        }

        public ContinuousHistogram getHistogramFriday() {
            return ((PlaceProto$PlaceAttendance) this.instance).getHistogramFriday();
        }

        public ContinuousHistogram getHistogramMonday() {
            return ((PlaceProto$PlaceAttendance) this.instance).getHistogramMonday();
        }

        public ContinuousHistogram getHistogramSaturday() {
            return ((PlaceProto$PlaceAttendance) this.instance).getHistogramSaturday();
        }

        public ContinuousHistogram getHistogramSunday() {
            return ((PlaceProto$PlaceAttendance) this.instance).getHistogramSunday();
        }

        public ContinuousHistogram getHistogramThursday() {
            return ((PlaceProto$PlaceAttendance) this.instance).getHistogramThursday();
        }

        public ContinuousHistogram getHistogramTuesday() {
            return ((PlaceProto$PlaceAttendance) this.instance).getHistogramTuesday();
        }

        public ContinuousHistogram getHistogramWednesday() {
            return ((PlaceProto$PlaceAttendance) this.instance).getHistogramWednesday();
        }

        public int getPlaceId() {
            return ((PlaceProto$PlaceAttendance) this.instance).getPlaceId();
        }

        public boolean hasHistogramFriday() {
            return ((PlaceProto$PlaceAttendance) this.instance).hasHistogramFriday();
        }

        public boolean hasHistogramMonday() {
            return ((PlaceProto$PlaceAttendance) this.instance).hasHistogramMonday();
        }

        public boolean hasHistogramSaturday() {
            return ((PlaceProto$PlaceAttendance) this.instance).hasHistogramSaturday();
        }

        public boolean hasHistogramSunday() {
            return ((PlaceProto$PlaceAttendance) this.instance).hasHistogramSunday();
        }

        public boolean hasHistogramThursday() {
            return ((PlaceProto$PlaceAttendance) this.instance).hasHistogramThursday();
        }

        public boolean hasHistogramTuesday() {
            return ((PlaceProto$PlaceAttendance) this.instance).hasHistogramTuesday();
        }

        public boolean hasHistogramWednesday() {
            return ((PlaceProto$PlaceAttendance) this.instance).hasHistogramWednesday();
        }

        private C6852a() {
            super(PlaceProto$PlaceAttendance.f16700m);
        }
    }

    static {
        f16700m.makeImmutable();
    }

    private PlaceProto$PlaceAttendance() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C6946a2.f17113a[methodToInvoke.ordinal()]) {
            case 1:
                return new PlaceProto$PlaceAttendance();
            case 2:
                return f16700m;
            case 3:
                return null;
            case 4:
                return new C6852a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                PlaceProto$PlaceAttendance placeProto$PlaceAttendance = (PlaceProto$PlaceAttendance) obj2;
                boolean z2 = this.f16702e != 0;
                int i = this.f16702e;
                if (placeProto$PlaceAttendance.f16702e != 0) {
                    z = true;
                }
                this.f16702e = visitor.visitInt(z2, i, z, placeProto$PlaceAttendance.f16702e);
                this.f16703f = (ContinuousHistogram) visitor.visitMessage(this.f16703f, placeProto$PlaceAttendance.f16703f);
                this.f16704g = (ContinuousHistogram) visitor.visitMessage(this.f16704g, placeProto$PlaceAttendance.f16704g);
                this.f16705h = (ContinuousHistogram) visitor.visitMessage(this.f16705h, placeProto$PlaceAttendance.f16705h);
                this.f16706i = (ContinuousHistogram) visitor.visitMessage(this.f16706i, placeProto$PlaceAttendance.f16706i);
                this.f16707j = (ContinuousHistogram) visitor.visitMessage(this.f16707j, placeProto$PlaceAttendance.f16707j);
                this.f16708k = (ContinuousHistogram) visitor.visitMessage(this.f16708k, placeProto$PlaceAttendance.f16708k);
                this.f16709l = (ContinuousHistogram) visitor.visitMessage(this.f16709l, placeProto$PlaceAttendance.f16709l);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 64) {
                                this.f16702e = codedInputStream.readUInt32();
                            } else if (readTag == 170) {
                                Builder builder = this.f16703f != null ? (C6849a) this.f16703f.toBuilder() : null;
                                this.f16703f = (ContinuousHistogram) codedInputStream.readMessage(ContinuousHistogram.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f16703f);
                                    this.f16703f = (ContinuousHistogram) builder.buildPartial();
                                }
                            } else if (readTag == 178) {
                                Builder builder2 = this.f16704g != null ? (C6849a) this.f16704g.toBuilder() : null;
                                this.f16704g = (ContinuousHistogram) codedInputStream.readMessage(ContinuousHistogram.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f16704g);
                                    this.f16704g = (ContinuousHistogram) builder2.buildPartial();
                                }
                            } else if (readTag == 186) {
                                Builder builder3 = this.f16705h != null ? (C6849a) this.f16705h.toBuilder() : null;
                                this.f16705h = (ContinuousHistogram) codedInputStream.readMessage(ContinuousHistogram.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f16705h);
                                    this.f16705h = (ContinuousHistogram) builder3.buildPartial();
                                }
                            } else if (readTag == 194) {
                                Builder builder4 = this.f16706i != null ? (C6849a) this.f16706i.toBuilder() : null;
                                this.f16706i = (ContinuousHistogram) codedInputStream.readMessage(ContinuousHistogram.parser(), extensionRegistryLite);
                                if (builder4 != null) {
                                    builder4.mergeFrom(this.f16706i);
                                    this.f16706i = (ContinuousHistogram) builder4.buildPartial();
                                }
                            } else if (readTag == 202) {
                                Builder builder5 = this.f16707j != null ? (C6849a) this.f16707j.toBuilder() : null;
                                this.f16707j = (ContinuousHistogram) codedInputStream.readMessage(ContinuousHistogram.parser(), extensionRegistryLite);
                                if (builder5 != null) {
                                    builder5.mergeFrom(this.f16707j);
                                    this.f16707j = (ContinuousHistogram) builder5.buildPartial();
                                }
                            } else if (readTag == 210) {
                                Builder builder6 = this.f16708k != null ? (C6849a) this.f16708k.toBuilder() : null;
                                this.f16708k = (ContinuousHistogram) codedInputStream.readMessage(ContinuousHistogram.parser(), extensionRegistryLite);
                                if (builder6 != null) {
                                    builder6.mergeFrom(this.f16708k);
                                    this.f16708k = (ContinuousHistogram) builder6.buildPartial();
                                }
                            } else if (readTag == 218) {
                                Builder builder7 = this.f16709l != null ? (C6849a) this.f16709l.toBuilder() : null;
                                this.f16709l = (ContinuousHistogram) codedInputStream.readMessage(ContinuousHistogram.parser(), extensionRegistryLite);
                                if (builder7 != null) {
                                    builder7.mergeFrom(this.f16709l);
                                    this.f16709l = (ContinuousHistogram) builder7.buildPartial();
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
                if (f16701n == null) {
                    synchronized (PlaceProto$PlaceAttendance.class) {
                        if (f16701n == null) {
                            f16701n = new DefaultInstanceBasedParser(f16700m);
                        }
                    }
                }
                return f16701n;
            default:
                throw new UnsupportedOperationException();
        }
        return f16700m;
    }

    public ContinuousHistogram getHistogramFriday() {
        ContinuousHistogram continuousHistogram = this.f16707j;
        return continuousHistogram == null ? ContinuousHistogram.getDefaultInstance() : continuousHistogram;
    }

    public ContinuousHistogram getHistogramMonday() {
        ContinuousHistogram continuousHistogram = this.f16703f;
        return continuousHistogram == null ? ContinuousHistogram.getDefaultInstance() : continuousHistogram;
    }

    public ContinuousHistogram getHistogramSaturday() {
        ContinuousHistogram continuousHistogram = this.f16708k;
        return continuousHistogram == null ? ContinuousHistogram.getDefaultInstance() : continuousHistogram;
    }

    public ContinuousHistogram getHistogramSunday() {
        ContinuousHistogram continuousHistogram = this.f16709l;
        return continuousHistogram == null ? ContinuousHistogram.getDefaultInstance() : continuousHistogram;
    }

    public ContinuousHistogram getHistogramThursday() {
        ContinuousHistogram continuousHistogram = this.f16706i;
        return continuousHistogram == null ? ContinuousHistogram.getDefaultInstance() : continuousHistogram;
    }

    public ContinuousHistogram getHistogramTuesday() {
        ContinuousHistogram continuousHistogram = this.f16704g;
        return continuousHistogram == null ? ContinuousHistogram.getDefaultInstance() : continuousHistogram;
    }

    public ContinuousHistogram getHistogramWednesday() {
        ContinuousHistogram continuousHistogram = this.f16705h;
        return continuousHistogram == null ? ContinuousHistogram.getDefaultInstance() : continuousHistogram;
    }

    public int getPlaceId() {
        return this.f16702e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f16702e;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeUInt32Size(8, i3);
        }
        if (this.f16703f != null) {
            i2 += CodedOutputStream.computeMessageSize(21, getHistogramMonday());
        }
        if (this.f16704g != null) {
            i2 += CodedOutputStream.computeMessageSize(22, getHistogramTuesday());
        }
        if (this.f16705h != null) {
            i2 += CodedOutputStream.computeMessageSize(23, getHistogramWednesday());
        }
        if (this.f16706i != null) {
            i2 += CodedOutputStream.computeMessageSize(24, getHistogramThursday());
        }
        if (this.f16707j != null) {
            i2 += CodedOutputStream.computeMessageSize(25, getHistogramFriday());
        }
        if (this.f16708k != null) {
            i2 += CodedOutputStream.computeMessageSize(26, getHistogramSaturday());
        }
        if (this.f16709l != null) {
            i2 += CodedOutputStream.computeMessageSize(27, getHistogramSunday());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasHistogramFriday() {
        return this.f16707j != null;
    }

    public boolean hasHistogramMonday() {
        return this.f16703f != null;
    }

    public boolean hasHistogramSaturday() {
        return this.f16708k != null;
    }

    public boolean hasHistogramSunday() {
        return this.f16709l != null;
    }

    public boolean hasHistogramThursday() {
        return this.f16706i != null;
    }

    public boolean hasHistogramTuesday() {
        return this.f16704g != null;
    }

    public boolean hasHistogramWednesday() {
        return this.f16705h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f16702e;
        if (i != 0) {
            codedOutputStream.writeUInt32(8, i);
        }
        if (this.f16703f != null) {
            codedOutputStream.writeMessage(21, getHistogramMonday());
        }
        if (this.f16704g != null) {
            codedOutputStream.writeMessage(22, getHistogramTuesday());
        }
        if (this.f16705h != null) {
            codedOutputStream.writeMessage(23, getHistogramWednesday());
        }
        if (this.f16706i != null) {
            codedOutputStream.writeMessage(24, getHistogramThursday());
        }
        if (this.f16707j != null) {
            codedOutputStream.writeMessage(25, getHistogramFriday());
        }
        if (this.f16708k != null) {
            codedOutputStream.writeMessage(26, getHistogramSaturday());
        }
        if (this.f16709l != null) {
            codedOutputStream.writeMessage(27, getHistogramSunday());
        }
    }
}
