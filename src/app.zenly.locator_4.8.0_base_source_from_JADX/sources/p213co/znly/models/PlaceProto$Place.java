package p213co.znly.models;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C6943a0.C6944a;

/* renamed from: co.znly.models.PlaceProto$Place */
public final class PlaceProto$Place extends GeneratedMessageLite<PlaceProto$Place, C6844b> implements PlaceProto$PlaceOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final PlaceProto$Place f16672k = new PlaceProto$Place();

    /* renamed from: l */
    private static volatile Parser<PlaceProto$Place> f16673l;

    /* renamed from: e */
    private int f16674e;

    /* renamed from: f */
    private long f16675f;

    /* renamed from: g */
    private C6943a0 f16676g;

    /* renamed from: h */
    private C6845c f16677h;

    /* renamed from: i */
    private ProtobufList<C6845c> f16678i = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: j */
    private ProtobufList<C6842a> f16679j = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.PlaceProto$Place$BoundsValueOrBuilder */
    public interface BoundsValueOrBuilder extends MessageLiteOrBuilder {
        int getEnd();

        int getStart();

        float getValue();
    }

    /* renamed from: co.znly.models.PlaceProto$Place$LabelOrBuilder */
    public interface LabelOrBuilder extends MessageLiteOrBuilder {
        long getHistoricalId();

        boolean getIsMain();

        boolean getIsRedundant();

        String getOfUser();

        ByteString getOfUserBytes();

        double getProbability();

        C6847b getTag();

        int getTagValue();
    }

    /* renamed from: co.znly.models.PlaceProto$Place$a */
    public static final class C6842a extends GeneratedMessageLite<C6842a, C6843a> implements BoundsValueOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C6842a f16680h = new C6842a();

        /* renamed from: i */
        private static volatile Parser<C6842a> f16681i;

        /* renamed from: e */
        private int f16682e;

        /* renamed from: f */
        private int f16683f;

        /* renamed from: g */
        private float f16684g;

        /* renamed from: co.znly.models.PlaceProto$Place$a$a */
        public static final class C6843a extends Builder<C6842a, C6843a> implements BoundsValueOrBuilder {
            /* synthetic */ C6843a(C6946a2 a2Var) {
                this();
            }

            public int getEnd() {
                return ((C6842a) this.instance).getEnd();
            }

            public int getStart() {
                return ((C6842a) this.instance).getStart();
            }

            public float getValue() {
                return ((C6842a) this.instance).getValue();
            }

            private C6843a() {
                super(C6842a.f16680h);
            }
        }

        static {
            f16680h.makeImmutable();
        }

        private C6842a() {
        }

        public static Parser<C6842a> parser() {
            return f16680h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C6946a2.f17113a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6842a();
                case 2:
                    return f16680h;
                case 3:
                    return null;
                case 4:
                    return new C6843a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6842a aVar = (C6842a) obj2;
                    this.f16682e = visitor.visitInt(this.f16682e != 0, this.f16682e, aVar.f16682e != 0, aVar.f16682e);
                    this.f16683f = visitor.visitInt(this.f16683f != 0, this.f16683f, aVar.f16683f != 0, aVar.f16683f);
                    boolean z2 = this.f16684g != 0.0f;
                    float f = this.f16684g;
                    if (aVar.f16684g != 0.0f) {
                        z = true;
                    }
                    this.f16684g = visitor.visitFloat(z2, f, z, aVar.f16684g);
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
                                    this.f16682e = codedInputStream.readInt32();
                                } else if (readTag == 16) {
                                    this.f16683f = codedInputStream.readInt32();
                                } else if (readTag == 29) {
                                    this.f16684g = codedInputStream.readFloat();
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
                    if (f16681i == null) {
                        synchronized (C6842a.class) {
                            if (f16681i == null) {
                                f16681i = new DefaultInstanceBasedParser(f16680h);
                            }
                        }
                    }
                    return f16681i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16680h;
        }

        public int getEnd() {
            return this.f16683f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int i3 = this.f16682e;
            if (i3 != 0) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
            }
            int i4 = this.f16683f;
            if (i4 != 0) {
                i2 += CodedOutputStream.computeInt32Size(2, i4);
            }
            float f = this.f16684g;
            if (f != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(3, f);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public int getStart() {
            return this.f16682e;
        }

        public float getValue() {
            return this.f16684g;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.f16682e;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            int i2 = this.f16683f;
            if (i2 != 0) {
                codedOutputStream.writeInt32(2, i2);
            }
            float f = this.f16684g;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(3, f);
            }
        }
    }

    /* renamed from: co.znly.models.PlaceProto$Place$b */
    public static final class C6844b extends Builder<PlaceProto$Place, C6844b> implements PlaceProto$PlaceOrBuilder {
        /* synthetic */ C6844b(C6946a2 a2Var) {
            this();
        }

        public C6842a getAttendance(int i) {
            return ((PlaceProto$Place) this.instance).getAttendance(i);
        }

        public int getAttendanceCount() {
            return ((PlaceProto$Place) this.instance).getAttendanceCount();
        }

        public List<C6842a> getAttendanceList() {
            return Collections.unmodifiableList(((PlaceProto$Place) this.instance).getAttendanceList());
        }

        public C6943a0 getCircle() {
            return ((PlaceProto$Place) this.instance).getCircle();
        }

        public long getId() {
            return ((PlaceProto$Place) this.instance).getId();
        }

        public C6845c getLabel() {
            return ((PlaceProto$Place) this.instance).getLabel();
        }

        public C6845c getSharedLabels(int i) {
            return ((PlaceProto$Place) this.instance).getSharedLabels(i);
        }

        public int getSharedLabelsCount() {
            return ((PlaceProto$Place) this.instance).getSharedLabelsCount();
        }

        public List<C6845c> getSharedLabelsList() {
            return Collections.unmodifiableList(((PlaceProto$Place) this.instance).getSharedLabelsList());
        }

        public boolean hasCircle() {
            return ((PlaceProto$Place) this.instance).hasCircle();
        }

        public boolean hasLabel() {
            return ((PlaceProto$Place) this.instance).hasLabel();
        }

        private C6844b() {
            super(PlaceProto$Place.f16672k);
        }
    }

    /* renamed from: co.znly.models.PlaceProto$Place$c */
    public static final class C6845c extends GeneratedMessageLite<C6845c, C6846a> implements LabelOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public static final C6845c f16685k = new C6845c();

        /* renamed from: l */
        private static volatile Parser<C6845c> f16686l;

        /* renamed from: e */
        private int f16687e;

        /* renamed from: f */
        private double f16688f;

        /* renamed from: g */
        private String f16689g = "";

        /* renamed from: h */
        private boolean f16690h;

        /* renamed from: i */
        private boolean f16691i;

        /* renamed from: j */
        private long f16692j;

        /* renamed from: co.znly.models.PlaceProto$Place$c$a */
        public static final class C6846a extends Builder<C6845c, C6846a> implements LabelOrBuilder {
            /* synthetic */ C6846a(C6946a2 a2Var) {
                this();
            }

            public long getHistoricalId() {
                return ((C6845c) this.instance).getHistoricalId();
            }

            public boolean getIsMain() {
                return ((C6845c) this.instance).getIsMain();
            }

            public boolean getIsRedundant() {
                return ((C6845c) this.instance).getIsRedundant();
            }

            public String getOfUser() {
                return ((C6845c) this.instance).getOfUser();
            }

            public ByteString getOfUserBytes() {
                return ((C6845c) this.instance).getOfUserBytes();
            }

            public double getProbability() {
                return ((C6845c) this.instance).getProbability();
            }

            public C6847b getTag() {
                return ((C6845c) this.instance).getTag();
            }

            public int getTagValue() {
                return ((C6845c) this.instance).getTagValue();
            }

            private C6846a() {
                super(C6845c.f16685k);
            }
        }

        /* renamed from: co.znly.models.PlaceProto$Place$c$b */
        public enum C6847b implements EnumLite {
            NOLABEL(0),
            HOME(1),
            WORK(2),
            SCHOOL(3),
            UNRECOGNIZED(-1);
            

            /* renamed from: e */
            private final int f16699e;

            /* renamed from: co.znly.models.PlaceProto$Place$c$b$a */
            class C6848a implements EnumLiteMap<C6847b> {
                C6848a() {
                }

                public C6847b findValueByNumber(int i) {
                    return C6847b.m17595a(i);
                }
            }

            static {
                new C6848a();
            }

            private C6847b(int i) {
                this.f16699e = i;
            }

            /* renamed from: a */
            public static C6847b m17595a(int i) {
                if (i == 0) {
                    return NOLABEL;
                }
                if (i == 1) {
                    return HOME;
                }
                if (i == 2) {
                    return WORK;
                }
                if (i != 3) {
                    return null;
                }
                return SCHOOL;
            }

            public final int getNumber() {
                return this.f16699e;
            }
        }

        static {
            f16685k.makeImmutable();
        }

        private C6845c() {
        }

        public static C6845c getDefaultInstance() {
            return f16685k;
        }

        public static Parser<C6845c> parser() {
            return f16685k.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C6946a2.f17113a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6845c();
                case 2:
                    return f16685k;
                case 3:
                    return null;
                case 4:
                    return new C6846a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6845c cVar = (C6845c) obj2;
                    this.f16687e = visitor.visitInt(this.f16687e != 0, this.f16687e, cVar.f16687e != 0, cVar.f16687e);
                    this.f16688f = visitor.visitDouble(this.f16688f != 0.0d, this.f16688f, cVar.f16688f != 0.0d, cVar.f16688f);
                    this.f16689g = visitor.visitString(!this.f16689g.isEmpty(), this.f16689g, !cVar.f16689g.isEmpty(), cVar.f16689g);
                    boolean z2 = this.f16690h;
                    boolean z3 = cVar.f16690h;
                    this.f16690h = visitor.visitBoolean(z2, z2, z3, z3);
                    boolean z4 = this.f16691i;
                    boolean z5 = cVar.f16691i;
                    this.f16691i = visitor.visitBoolean(z4, z4, z5, z5);
                    this.f16692j = visitor.visitLong(this.f16692j != 0, this.f16692j, cVar.f16692j != 0, cVar.f16692j);
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
                                    this.f16687e = codedInputStream.readEnum();
                                } else if (readTag == 17) {
                                    this.f16688f = codedInputStream.readDouble();
                                } else if (readTag == 26) {
                                    this.f16689g = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 64) {
                                    this.f16690h = codedInputStream.readBool();
                                } else if (readTag == 72) {
                                    this.f16691i = codedInputStream.readBool();
                                } else if (readTag == 80) {
                                    this.f16692j = codedInputStream.readInt64();
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
                    if (f16686l == null) {
                        synchronized (C6845c.class) {
                            if (f16686l == null) {
                                f16686l = new DefaultInstanceBasedParser(f16685k);
                            }
                        }
                    }
                    return f16686l;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16685k;
        }

        public long getHistoricalId() {
            return this.f16692j;
        }

        public boolean getIsMain() {
            return this.f16690h;
        }

        public boolean getIsRedundant() {
            return this.f16691i;
        }

        public String getOfUser() {
            return this.f16689g;
        }

        public ByteString getOfUserBytes() {
            return ByteString.copyFromUtf8(this.f16689g);
        }

        public double getProbability() {
            return this.f16688f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16687e != C6847b.NOLABEL.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f16687e);
            }
            double d = this.f16688f;
            if (d != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(2, d);
            }
            if (!this.f16689g.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(3, getOfUser());
            }
            boolean z = this.f16690h;
            if (z) {
                i2 += CodedOutputStream.computeBoolSize(8, z);
            }
            boolean z2 = this.f16691i;
            if (z2) {
                i2 += CodedOutputStream.computeBoolSize(9, z2);
            }
            long j = this.f16692j;
            if (j != 0) {
                i2 += CodedOutputStream.computeInt64Size(10, j);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C6847b getTag() {
            C6847b a = C6847b.m17595a(this.f16687e);
            return a == null ? C6847b.UNRECOGNIZED : a;
        }

        public int getTagValue() {
            return this.f16687e;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16687e != C6847b.NOLABEL.getNumber()) {
                codedOutputStream.writeEnum(1, this.f16687e);
            }
            double d = this.f16688f;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(2, d);
            }
            if (!this.f16689g.isEmpty()) {
                codedOutputStream.writeString(3, getOfUser());
            }
            boolean z = this.f16690h;
            if (z) {
                codedOutputStream.writeBool(8, z);
            }
            boolean z2 = this.f16691i;
            if (z2) {
                codedOutputStream.writeBool(9, z2);
            }
            long j = this.f16692j;
            if (j != 0) {
                codedOutputStream.writeInt64(10, j);
            }
        }
    }

    static {
        f16672k.makeImmutable();
    }

    private PlaceProto$Place() {
    }

    public static PlaceProto$Place getDefaultInstance() {
        return f16672k;
    }

    public static Parser<PlaceProto$Place> parser() {
        return f16672k.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C6946a2.f17113a[methodToInvoke.ordinal()]) {
            case 1:
                return new PlaceProto$Place();
            case 2:
                return f16672k;
            case 3:
                this.f16678i.makeImmutable();
                this.f16679j.makeImmutable();
                return null;
            case 4:
                return new C6844b(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                PlaceProto$Place placeProto$Place = (PlaceProto$Place) obj2;
                this.f16675f = visitor.visitLong(this.f16675f != 0, this.f16675f, placeProto$Place.f16675f != 0, placeProto$Place.f16675f);
                this.f16676g = (C6943a0) visitor.visitMessage(this.f16676g, placeProto$Place.f16676g);
                this.f16677h = (C6845c) visitor.visitMessage(this.f16677h, placeProto$Place.f16677h);
                this.f16678i = visitor.visitList(this.f16678i, placeProto$Place.f16678i);
                this.f16679j = visitor.visitList(this.f16679j, placeProto$Place.f16679j);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f16674e |= placeProto$Place.f16674e;
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
                                this.f16675f = codedInputStream.readInt64();
                            } else if (readTag == 18) {
                                Builder builder = this.f16676g != null ? (C6944a) this.f16676g.toBuilder() : null;
                                this.f16676g = (C6943a0) codedInputStream.readMessage(C6943a0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f16676g);
                                    this.f16676g = (C6943a0) builder.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder2 = this.f16677h != null ? (C6846a) this.f16677h.toBuilder() : null;
                                this.f16677h = (C6845c) codedInputStream.readMessage(C6845c.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f16677h);
                                    this.f16677h = (C6845c) builder2.buildPartial();
                                }
                            } else if (readTag == 34) {
                                if (!this.f16678i.isModifiable()) {
                                    this.f16678i = GeneratedMessageLite.mutableCopy(this.f16678i);
                                }
                                this.f16678i.add(codedInputStream.readMessage(C6845c.parser(), extensionRegistryLite));
                            } else if (readTag == 58) {
                                if (!this.f16679j.isModifiable()) {
                                    this.f16679j = GeneratedMessageLite.mutableCopy(this.f16679j);
                                }
                                this.f16679j.add(codedInputStream.readMessage(C6842a.parser(), extensionRegistryLite));
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
                if (f16673l == null) {
                    synchronized (PlaceProto$Place.class) {
                        if (f16673l == null) {
                            f16673l = new DefaultInstanceBasedParser(f16672k);
                        }
                    }
                }
                return f16673l;
            default:
                throw new UnsupportedOperationException();
        }
        return f16672k;
    }

    public C6842a getAttendance(int i) {
        return (C6842a) this.f16679j.get(i);
    }

    public int getAttendanceCount() {
        return this.f16679j.size();
    }

    public List<C6842a> getAttendanceList() {
        return this.f16679j;
    }

    public C6943a0 getCircle() {
        C6943a0 a0Var = this.f16676g;
        return a0Var == null ? C6943a0.getDefaultInstance() : a0Var;
    }

    public long getId() {
        return this.f16675f;
    }

    public C6845c getLabel() {
        C6845c cVar = this.f16677h;
        return cVar == null ? C6845c.getDefaultInstance() : cVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        long j = this.f16675f;
        int computeInt64Size = j != 0 ? CodedOutputStream.computeInt64Size(1, j) + 0 : 0;
        if (this.f16676g != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(2, getCircle());
        }
        if (this.f16677h != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(3, getLabel());
        }
        int i2 = computeInt64Size;
        for (int i3 = 0; i3 < this.f16678i.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f16678i.get(i3));
        }
        for (int i4 = 0; i4 < this.f16679j.size(); i4++) {
            i2 += CodedOutputStream.computeMessageSize(7, (MessageLite) this.f16679j.get(i4));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C6845c getSharedLabels(int i) {
        return (C6845c) this.f16678i.get(i);
    }

    public int getSharedLabelsCount() {
        return this.f16678i.size();
    }

    public List<C6845c> getSharedLabelsList() {
        return this.f16678i;
    }

    public boolean hasCircle() {
        return this.f16676g != null;
    }

    public boolean hasLabel() {
        return this.f16677h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f16675f;
        if (j != 0) {
            codedOutputStream.writeInt64(1, j);
        }
        if (this.f16676g != null) {
            codedOutputStream.writeMessage(2, getCircle());
        }
        if (this.f16677h != null) {
            codedOutputStream.writeMessage(3, getLabel());
        }
        for (int i = 0; i < this.f16678i.size(); i++) {
            codedOutputStream.writeMessage(4, (MessageLite) this.f16678i.get(i));
        }
        for (int i2 = 0; i2 < this.f16679j.size(); i2++) {
            codedOutputStream.writeMessage(7, (MessageLite) this.f16679j.get(i2));
        }
    }
}
