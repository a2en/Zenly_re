package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.PinContextProto$HeadingStripped */
public final class PinContextProto$HeadingStripped extends GeneratedMessageLite<PinContextProto$HeadingStripped, C6814a> implements PinContextProto$HeadingStrippedOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final PinContextProto$HeadingStripped f16571i = new PinContextProto$HeadingStripped();

    /* renamed from: j */
    private static volatile Parser<PinContextProto$HeadingStripped> f16572j;

    /* renamed from: e */
    private C6815b f16573e;

    /* renamed from: f */
    private C6815b f16574f;

    /* renamed from: g */
    private Timestamp f16575g;

    /* renamed from: h */
    private Timestamp f16576h;

    /* renamed from: co.znly.models.PinContextProto$HeadingStripped$PlaceOrBuilder */
    public interface PlaceOrBuilder extends MessageLiteOrBuilder {
        int getId();

        boolean getIsMain();

        C7276d2 getLabel();

        int getLabelValue();

        double getLatitude();

        double getLongitude();

        int getRadius();
    }

    /* renamed from: co.znly.models.PinContextProto$HeadingStripped$a */
    public static final class C6814a extends Builder<PinContextProto$HeadingStripped, C6814a> implements PinContextProto$HeadingStrippedOrBuilder {
        /* synthetic */ C6814a(C6977c1 c1Var) {
            this();
        }

        public Timestamp getDepartureTime() {
            return ((PinContextProto$HeadingStripped) this.instance).getDepartureTime();
        }

        public C6815b getDestination() {
            return ((PinContextProto$HeadingStripped) this.instance).getDestination();
        }

        public Timestamp getEta() {
            return ((PinContextProto$HeadingStripped) this.instance).getEta();
        }

        public C6815b getOrigin() {
            return ((PinContextProto$HeadingStripped) this.instance).getOrigin();
        }

        public boolean hasDepartureTime() {
            return ((PinContextProto$HeadingStripped) this.instance).hasDepartureTime();
        }

        public boolean hasDestination() {
            return ((PinContextProto$HeadingStripped) this.instance).hasDestination();
        }

        public boolean hasEta() {
            return ((PinContextProto$HeadingStripped) this.instance).hasEta();
        }

        public boolean hasOrigin() {
            return ((PinContextProto$HeadingStripped) this.instance).hasOrigin();
        }

        private C6814a() {
            super(PinContextProto$HeadingStripped.f16571i);
        }
    }

    /* renamed from: co.znly.models.PinContextProto$HeadingStripped$b */
    public static final class C6815b extends GeneratedMessageLite<C6815b, C6816a> implements PlaceOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public static final C6815b f16577k = new C6815b();

        /* renamed from: l */
        private static volatile Parser<C6815b> f16578l;

        /* renamed from: e */
        private double f16579e;

        /* renamed from: f */
        private double f16580f;

        /* renamed from: g */
        private int f16581g;

        /* renamed from: h */
        private boolean f16582h;

        /* renamed from: i */
        private int f16583i;

        /* renamed from: j */
        private int f16584j;

        /* renamed from: co.znly.models.PinContextProto$HeadingStripped$b$a */
        public static final class C6816a extends Builder<C6815b, C6816a> implements PlaceOrBuilder {
            /* synthetic */ C6816a(C6977c1 c1Var) {
                this();
            }

            public int getId() {
                return ((C6815b) this.instance).getId();
            }

            public boolean getIsMain() {
                return ((C6815b) this.instance).getIsMain();
            }

            public C7276d2 getLabel() {
                return ((C6815b) this.instance).getLabel();
            }

            public int getLabelValue() {
                return ((C6815b) this.instance).getLabelValue();
            }

            public double getLatitude() {
                return ((C6815b) this.instance).getLatitude();
            }

            public double getLongitude() {
                return ((C6815b) this.instance).getLongitude();
            }

            public int getRadius() {
                return ((C6815b) this.instance).getRadius();
            }

            private C6816a() {
                super(C6815b.f16577k);
            }
        }

        static {
            f16577k.makeImmutable();
        }

        private C6815b() {
        }

        public static C6815b getDefaultInstance() {
            return f16577k;
        }

        public static Parser<C6815b> parser() {
            return f16577k.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C6977c1.f17211a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6815b();
                case 2:
                    return f16577k;
                case 3:
                    return null;
                case 4:
                    return new C6816a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6815b bVar = (C6815b) obj2;
                    this.f16579e = visitor.visitDouble(this.f16579e != 0.0d, this.f16579e, bVar.f16579e != 0.0d, bVar.f16579e);
                    this.f16580f = visitor.visitDouble(this.f16580f != 0.0d, this.f16580f, bVar.f16580f != 0.0d, bVar.f16580f);
                    this.f16581g = visitor.visitInt(this.f16581g != 0, this.f16581g, bVar.f16581g != 0, bVar.f16581g);
                    boolean z2 = this.f16582h;
                    boolean z3 = bVar.f16582h;
                    this.f16582h = visitor.visitBoolean(z2, z2, z3, z3);
                    this.f16583i = visitor.visitInt(this.f16583i != 0, this.f16583i, bVar.f16583i != 0, bVar.f16583i);
                    boolean z4 = this.f16584j != 0;
                    int i = this.f16584j;
                    if (bVar.f16584j != 0) {
                        z = true;
                    }
                    this.f16584j = visitor.visitInt(z4, i, z, bVar.f16584j);
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 9) {
                                    this.f16579e = codedInputStream.readDouble();
                                } else if (readTag == 17) {
                                    this.f16580f = codedInputStream.readDouble();
                                } else if (readTag == 24) {
                                    this.f16581g = codedInputStream.readEnum();
                                } else if (readTag == 32) {
                                    this.f16582h = codedInputStream.readBool();
                                } else if (readTag == 40) {
                                    this.f16583i = codedInputStream.readInt32();
                                } else if (readTag == 48) {
                                    this.f16584j = codedInputStream.readInt32();
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
                    if (f16578l == null) {
                        synchronized (C6815b.class) {
                            if (f16578l == null) {
                                f16578l = new DefaultInstanceBasedParser(f16577k);
                            }
                        }
                    }
                    return f16578l;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16577k;
        }

        public int getId() {
            return this.f16584j;
        }

        public boolean getIsMain() {
            return this.f16582h;
        }

        public C7276d2 getLabel() {
            C7276d2 a = C7276d2.m17988a(this.f16581g);
            return a == null ? C7276d2.UNRECOGNIZED : a;
        }

        public int getLabelValue() {
            return this.f16581g;
        }

        public double getLatitude() {
            return this.f16579e;
        }

        public double getLongitude() {
            return this.f16580f;
        }

        public int getRadius() {
            return this.f16583i;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            double d = this.f16579e;
            if (d != 0.0d) {
                i2 = 0 + CodedOutputStream.computeDoubleSize(1, d);
            }
            double d2 = this.f16580f;
            if (d2 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(2, d2);
            }
            if (this.f16581g != C7276d2.NOLABEL.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(3, this.f16581g);
            }
            boolean z = this.f16582h;
            if (z) {
                i2 += CodedOutputStream.computeBoolSize(4, z);
            }
            int i3 = this.f16583i;
            if (i3 != 0) {
                i2 += CodedOutputStream.computeInt32Size(5, i3);
            }
            int i4 = this.f16584j;
            if (i4 != 0) {
                i2 += CodedOutputStream.computeInt32Size(6, i4);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            double d = this.f16579e;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(1, d);
            }
            double d2 = this.f16580f;
            if (d2 != 0.0d) {
                codedOutputStream.writeDouble(2, d2);
            }
            if (this.f16581g != C7276d2.NOLABEL.getNumber()) {
                codedOutputStream.writeEnum(3, this.f16581g);
            }
            boolean z = this.f16582h;
            if (z) {
                codedOutputStream.writeBool(4, z);
            }
            int i = this.f16583i;
            if (i != 0) {
                codedOutputStream.writeInt32(5, i);
            }
            int i2 = this.f16584j;
            if (i2 != 0) {
                codedOutputStream.writeInt32(6, i2);
            }
        }
    }

    static {
        f16571i.makeImmutable();
    }

    private PinContextProto$HeadingStripped() {
    }

    public static PinContextProto$HeadingStripped getDefaultInstance() {
        return f16571i;
    }

    public static Parser<PinContextProto$HeadingStripped> parser() {
        return f16571i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C6977c1.f17211a[methodToInvoke.ordinal()]) {
            case 1:
                return new PinContextProto$HeadingStripped();
            case 2:
                return f16571i;
            case 3:
                return null;
            case 4:
                return new C6814a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                PinContextProto$HeadingStripped pinContextProto$HeadingStripped = (PinContextProto$HeadingStripped) obj2;
                this.f16573e = (C6815b) visitor.visitMessage(this.f16573e, pinContextProto$HeadingStripped.f16573e);
                this.f16574f = (C6815b) visitor.visitMessage(this.f16574f, pinContextProto$HeadingStripped.f16574f);
                this.f16575g = (Timestamp) visitor.visitMessage(this.f16575g, pinContextProto$HeadingStripped.f16575g);
                this.f16576h = (Timestamp) visitor.visitMessage(this.f16576h, pinContextProto$HeadingStripped.f16576h);
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
                                Builder builder = this.f16573e != null ? (C6816a) this.f16573e.toBuilder() : null;
                                this.f16573e = (C6815b) codedInputStream.readMessage(C6815b.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f16573e);
                                    this.f16573e = (C6815b) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f16574f != null ? (C6816a) this.f16574f.toBuilder() : null;
                                this.f16574f = (C6815b) codedInputStream.readMessage(C6815b.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f16574f);
                                    this.f16574f = (C6815b) builder2.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder3 = this.f16575g != null ? (Timestamp.Builder) this.f16575g.toBuilder() : null;
                                this.f16575g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f16575g);
                                    this.f16575g = (Timestamp) builder3.buildPartial();
                                }
                            } else if (readTag == 34) {
                                Builder builder4 = this.f16576h != null ? (Timestamp.Builder) this.f16576h.toBuilder() : null;
                                this.f16576h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder4 != null) {
                                    builder4.mergeFrom(this.f16576h);
                                    this.f16576h = (Timestamp) builder4.buildPartial();
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
                if (f16572j == null) {
                    synchronized (PinContextProto$HeadingStripped.class) {
                        if (f16572j == null) {
                            f16572j = new DefaultInstanceBasedParser(f16571i);
                        }
                    }
                }
                return f16572j;
            default:
                throw new UnsupportedOperationException();
        }
        return f16571i;
    }

    public Timestamp getDepartureTime() {
        Timestamp timestamp = this.f16576h;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C6815b getDestination() {
        C6815b bVar = this.f16574f;
        return bVar == null ? C6815b.getDefaultInstance() : bVar;
    }

    public Timestamp getEta() {
        Timestamp timestamp = this.f16575g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C6815b getOrigin() {
        C6815b bVar = this.f16573e;
        return bVar == null ? C6815b.getDefaultInstance() : bVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f16573e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getOrigin());
        }
        if (this.f16574f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getDestination());
        }
        if (this.f16575g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getEta());
        }
        if (this.f16576h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getDepartureTime());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasDepartureTime() {
        return this.f16576h != null;
    }

    public boolean hasDestination() {
        return this.f16574f != null;
    }

    public boolean hasEta() {
        return this.f16575g != null;
    }

    public boolean hasOrigin() {
        return this.f16573e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f16573e != null) {
            codedOutputStream.writeMessage(1, getOrigin());
        }
        if (this.f16574f != null) {
            codedOutputStream.writeMessage(2, getDestination());
        }
        if (this.f16575g != null) {
            codedOutputStream.writeMessage(3, getEta());
        }
        if (this.f16576h != null) {
            codedOutputStream.writeMessage(4, getDepartureTime());
        }
    }
}
