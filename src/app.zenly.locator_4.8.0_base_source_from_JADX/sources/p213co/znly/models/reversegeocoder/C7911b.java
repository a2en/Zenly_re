package p213co.znly.models.reversegeocoder;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.reversegeocoder.b */
public final class C7911b extends GeneratedMessageLite<C7911b, C7912a> implements ReverseGeoCoderProto$AddressOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final C7911b f20032p = new C7911b();

    /* renamed from: q */
    private static volatile Parser<C7911b> f20033q;

    /* renamed from: e */
    private String f20034e;

    /* renamed from: f */
    private String f20035f;

    /* renamed from: g */
    private String f20036g;

    /* renamed from: h */
    private String f20037h;

    /* renamed from: i */
    private String f20038i;

    /* renamed from: j */
    private String f20039j;

    /* renamed from: k */
    private String f20040k;

    /* renamed from: l */
    private String f20041l;

    /* renamed from: m */
    private String f20042m;

    /* renamed from: n */
    private String f20043n;

    /* renamed from: o */
    private String f20044o;

    /* renamed from: co.znly.models.reversegeocoder.b$a */
    public static final class C7912a extends Builder<C7911b, C7912a> implements ReverseGeoCoderProto$AddressOrBuilder {
        /* synthetic */ C7912a(C7910a aVar) {
            this();
        }

        public String getAdministrativeArea() {
            return ((C7911b) this.instance).getAdministrativeArea();
        }

        public ByteString getAdministrativeAreaBytes() {
            return ((C7911b) this.instance).getAdministrativeAreaBytes();
        }

        public String getCountry() {
            return ((C7911b) this.instance).getCountry();
        }

        public ByteString getCountryBytes() {
            return ((C7911b) this.instance).getCountryBytes();
        }

        public String getFormattedAddress() {
            return ((C7911b) this.instance).getFormattedAddress();
        }

        public ByteString getFormattedAddressBytes() {
            return ((C7911b) this.instance).getFormattedAddressBytes();
        }

        public String getIsoCountryCode() {
            return ((C7911b) this.instance).getIsoCountryCode();
        }

        public ByteString getIsoCountryCodeBytes() {
            return ((C7911b) this.instance).getIsoCountryCodeBytes();
        }

        public String getLocality() {
            return ((C7911b) this.instance).getLocality();
        }

        public ByteString getLocalityBytes() {
            return ((C7911b) this.instance).getLocalityBytes();
        }

        public String getName() {
            return ((C7911b) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((C7911b) this.instance).getNameBytes();
        }

        public String getNeighbourhood() {
            return ((C7911b) this.instance).getNeighbourhood();
        }

        public ByteString getNeighbourhoodBytes() {
            return ((C7911b) this.instance).getNeighbourhoodBytes();
        }

        public String getPostalCode() {
            return ((C7911b) this.instance).getPostalCode();
        }

        public ByteString getPostalCodeBytes() {
            return ((C7911b) this.instance).getPostalCodeBytes();
        }

        public String getStreet() {
            return ((C7911b) this.instance).getStreet();
        }

        public ByteString getStreetBytes() {
            return ((C7911b) this.instance).getStreetBytes();
        }

        public String getStreetNumber() {
            return ((C7911b) this.instance).getStreetNumber();
        }

        public ByteString getStreetNumberBytes() {
            return ((C7911b) this.instance).getStreetNumberBytes();
        }

        public String getSubAdministrativeArea() {
            return ((C7911b) this.instance).getSubAdministrativeArea();
        }

        public ByteString getSubAdministrativeAreaBytes() {
            return ((C7911b) this.instance).getSubAdministrativeAreaBytes();
        }

        private C7912a() {
            super(C7911b.f20032p);
        }
    }

    static {
        f20032p.makeImmutable();
    }

    private C7911b() {
        String str = "";
        this.f20034e = str;
        this.f20035f = str;
        this.f20036g = str;
        this.f20037h = str;
        this.f20038i = str;
        this.f20039j = str;
        this.f20040k = str;
        this.f20041l = str;
        this.f20042m = str;
        this.f20043n = str;
        this.f20044o = str;
    }

    public static C7912a newBuilder() {
        return (C7912a) f20032p.toBuilder();
    }

    public static Parser<C7911b> parser() {
        return f20032p.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7910a.f20031a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7911b();
            case 2:
                return f20032p;
            case 3:
                return null;
            case 4:
                return new C7912a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7911b bVar = (C7911b) obj2;
                this.f20034e = visitor.visitString(!this.f20034e.isEmpty(), this.f20034e, !bVar.f20034e.isEmpty(), bVar.f20034e);
                this.f20035f = visitor.visitString(!this.f20035f.isEmpty(), this.f20035f, !bVar.f20035f.isEmpty(), bVar.f20035f);
                this.f20036g = visitor.visitString(!this.f20036g.isEmpty(), this.f20036g, !bVar.f20036g.isEmpty(), bVar.f20036g);
                this.f20037h = visitor.visitString(!this.f20037h.isEmpty(), this.f20037h, !bVar.f20037h.isEmpty(), bVar.f20037h);
                this.f20038i = visitor.visitString(!this.f20038i.isEmpty(), this.f20038i, !bVar.f20038i.isEmpty(), bVar.f20038i);
                this.f20039j = visitor.visitString(!this.f20039j.isEmpty(), this.f20039j, !bVar.f20039j.isEmpty(), bVar.f20039j);
                this.f20040k = visitor.visitString(!this.f20040k.isEmpty(), this.f20040k, !bVar.f20040k.isEmpty(), bVar.f20040k);
                this.f20041l = visitor.visitString(!this.f20041l.isEmpty(), this.f20041l, !bVar.f20041l.isEmpty(), bVar.f20041l);
                this.f20042m = visitor.visitString(!this.f20042m.isEmpty(), this.f20042m, !bVar.f20042m.isEmpty(), bVar.f20042m);
                this.f20043n = visitor.visitString(!this.f20043n.isEmpty(), this.f20043n, !bVar.f20043n.isEmpty(), bVar.f20043n);
                this.f20044o = visitor.visitString(!this.f20044o.isEmpty(), this.f20044o, true ^ bVar.f20044o.isEmpty(), bVar.f20044o);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.f20034e = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                this.f20035f = codedInputStream.readStringRequireUtf8();
                                break;
                            case 26:
                                this.f20036g = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                this.f20037h = codedInputStream.readStringRequireUtf8();
                                break;
                            case 42:
                                this.f20038i = codedInputStream.readStringRequireUtf8();
                                break;
                            case 50:
                                this.f20039j = codedInputStream.readStringRequireUtf8();
                                break;
                            case 58:
                                this.f20040k = codedInputStream.readStringRequireUtf8();
                                break;
                            case 66:
                                this.f20041l = codedInputStream.readStringRequireUtf8();
                                break;
                            case 74:
                                this.f20042m = codedInputStream.readStringRequireUtf8();
                                break;
                            case 82:
                                this.f20043n = codedInputStream.readStringRequireUtf8();
                                break;
                            case 90:
                                this.f20044o = codedInputStream.readStringRequireUtf8();
                                break;
                            default:
                                if (codedInputStream.skipField(readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
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
                if (f20033q == null) {
                    synchronized (C7911b.class) {
                        if (f20033q == null) {
                            f20033q = new DefaultInstanceBasedParser(f20032p);
                        }
                    }
                }
                return f20033q;
            default:
                throw new UnsupportedOperationException();
        }
        return f20032p;
    }

    public String getAdministrativeArea() {
        return this.f20038i;
    }

    public ByteString getAdministrativeAreaBytes() {
        return ByteString.copyFromUtf8(this.f20038i);
    }

    public String getCountry() {
        return this.f20036g;
    }

    public ByteString getCountryBytes() {
        return ByteString.copyFromUtf8(this.f20036g);
    }

    public String getFormattedAddress() {
        return this.f20044o;
    }

    public ByteString getFormattedAddressBytes() {
        return ByteString.copyFromUtf8(this.f20044o);
    }

    public String getIsoCountryCode() {
        return this.f20035f;
    }

    public ByteString getIsoCountryCodeBytes() {
        return ByteString.copyFromUtf8(this.f20035f);
    }

    public String getLocality() {
        return this.f20040k;
    }

    public ByteString getLocalityBytes() {
        return ByteString.copyFromUtf8(this.f20040k);
    }

    public String getName() {
        return this.f20034e;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.f20034e);
    }

    public String getNeighbourhood() {
        return this.f20041l;
    }

    public ByteString getNeighbourhoodBytes() {
        return ByteString.copyFromUtf8(this.f20041l);
    }

    public String getPostalCode() {
        return this.f20037h;
    }

    public ByteString getPostalCodeBytes() {
        return ByteString.copyFromUtf8(this.f20037h);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20034e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getName());
        }
        if (!this.f20035f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getIsoCountryCode());
        }
        if (!this.f20036g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getCountry());
        }
        if (!this.f20037h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getPostalCode());
        }
        if (!this.f20038i.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(5, getAdministrativeArea());
        }
        if (!this.f20039j.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(6, getSubAdministrativeArea());
        }
        if (!this.f20040k.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(7, getLocality());
        }
        if (!this.f20041l.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(8, getNeighbourhood());
        }
        if (!this.f20042m.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(9, getStreet());
        }
        if (!this.f20043n.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(10, getStreetNumber());
        }
        if (!this.f20044o.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(11, getFormattedAddress());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getStreet() {
        return this.f20042m;
    }

    public ByteString getStreetBytes() {
        return ByteString.copyFromUtf8(this.f20042m);
    }

    public String getStreetNumber() {
        return this.f20043n;
    }

    public ByteString getStreetNumberBytes() {
        return ByteString.copyFromUtf8(this.f20043n);
    }

    public String getSubAdministrativeArea() {
        return this.f20039j;
    }

    public ByteString getSubAdministrativeAreaBytes() {
        return ByteString.copyFromUtf8(this.f20039j);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20034e.isEmpty()) {
            codedOutputStream.writeString(1, getName());
        }
        if (!this.f20035f.isEmpty()) {
            codedOutputStream.writeString(2, getIsoCountryCode());
        }
        if (!this.f20036g.isEmpty()) {
            codedOutputStream.writeString(3, getCountry());
        }
        if (!this.f20037h.isEmpty()) {
            codedOutputStream.writeString(4, getPostalCode());
        }
        if (!this.f20038i.isEmpty()) {
            codedOutputStream.writeString(5, getAdministrativeArea());
        }
        if (!this.f20039j.isEmpty()) {
            codedOutputStream.writeString(6, getSubAdministrativeArea());
        }
        if (!this.f20040k.isEmpty()) {
            codedOutputStream.writeString(7, getLocality());
        }
        if (!this.f20041l.isEmpty()) {
            codedOutputStream.writeString(8, getNeighbourhood());
        }
        if (!this.f20042m.isEmpty()) {
            codedOutputStream.writeString(9, getStreet());
        }
        if (!this.f20043n.isEmpty()) {
            codedOutputStream.writeString(10, getStreetNumber());
        }
        if (!this.f20044o.isEmpty()) {
            codedOutputStream.writeString(11, getFormattedAddress());
        }
    }
}
