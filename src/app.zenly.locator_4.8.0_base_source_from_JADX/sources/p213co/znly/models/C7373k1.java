package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.k1 */
public final class C7373k1 extends GeneratedMessageLite<C7373k1, C7374a> implements PinContextProto$WeatherStrippedOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7373k1 f18377i = new C7373k1();

    /* renamed from: j */
    private static volatile Parser<C7373k1> f18378j;

    /* renamed from: e */
    private int f18379e;

    /* renamed from: f */
    private float f18380f;

    /* renamed from: g */
    private float f18381g;

    /* renamed from: h */
    private int f18382h;

    /* renamed from: co.znly.models.k1$a */
    public static final class C7374a extends Builder<C7373k1, C7374a> implements PinContextProto$WeatherStrippedOrBuilder {
        /* synthetic */ C7374a(C6977c1 c1Var) {
            this();
        }

        public int getHumidity() {
            return ((C7373k1) this.instance).getHumidity();
        }

        public float getPressure() {
            return ((C7373k1) this.instance).getPressure();
        }

        public float getTemperature() {
            return ((C7373k1) this.instance).getTemperature();
        }

        public C7408n3 getWeatherType() {
            return ((C7373k1) this.instance).getWeatherType();
        }

        public int getWeatherTypeValue() {
            return ((C7373k1) this.instance).getWeatherTypeValue();
        }

        private C7374a() {
            super(C7373k1.f18377i);
        }
    }

    static {
        f18377i.makeImmutable();
    }

    private C7373k1() {
    }

    public static C7373k1 getDefaultInstance() {
        return f18377i;
    }

    public static Parser<C7373k1> parser() {
        return f18377i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C6977c1.f17211a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7373k1();
            case 2:
                return f18377i;
            case 3:
                return null;
            case 4:
                return new C7374a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7373k1 k1Var = (C7373k1) obj2;
                this.f18379e = visitor.visitInt(this.f18379e != 0, this.f18379e, k1Var.f18379e != 0, k1Var.f18379e);
                this.f18380f = visitor.visitFloat(this.f18380f != 0.0f, this.f18380f, k1Var.f18380f != 0.0f, k1Var.f18380f);
                this.f18381g = visitor.visitFloat(this.f18381g != 0.0f, this.f18381g, k1Var.f18381g != 0.0f, k1Var.f18381g);
                boolean z2 = this.f18382h != 0;
                int i = this.f18382h;
                if (k1Var.f18382h != 0) {
                    z = true;
                }
                this.f18382h = visitor.visitInt(z2, i, z, k1Var.f18382h);
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
                                this.f18379e = codedInputStream.readEnum();
                            } else if (readTag == 21) {
                                this.f18380f = codedInputStream.readFloat();
                            } else if (readTag == 29) {
                                this.f18381g = codedInputStream.readFloat();
                            } else if (readTag == 32) {
                                this.f18382h = codedInputStream.readInt32();
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
                if (f18378j == null) {
                    synchronized (C7373k1.class) {
                        if (f18378j == null) {
                            f18378j = new DefaultInstanceBasedParser(f18377i);
                        }
                    }
                }
                return f18378j;
            default:
                throw new UnsupportedOperationException();
        }
        return f18377i;
    }

    public int getHumidity() {
        return this.f18382h;
    }

    public float getPressure() {
        return this.f18381g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f18379e != C7408n3.WEATHER_TYPE_UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f18379e);
        }
        float f = this.f18380f;
        if (f != 0.0f) {
            i2 += CodedOutputStream.computeFloatSize(2, f);
        }
        float f2 = this.f18381g;
        if (f2 != 0.0f) {
            i2 += CodedOutputStream.computeFloatSize(3, f2);
        }
        int i3 = this.f18382h;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(4, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public float getTemperature() {
        return this.f18380f;
    }

    public C7408n3 getWeatherType() {
        C7408n3 a = C7408n3.m18081a(this.f18379e);
        return a == null ? C7408n3.UNRECOGNIZED : a;
    }

    public int getWeatherTypeValue() {
        return this.f18379e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f18379e != C7408n3.WEATHER_TYPE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f18379e);
        }
        float f = this.f18380f;
        if (f != 0.0f) {
            codedOutputStream.writeFloat(2, f);
        }
        float f2 = this.f18381g;
        if (f2 != 0.0f) {
            codedOutputStream.writeFloat(3, f2);
        }
        int i = this.f18382h;
        if (i != 0) {
            codedOutputStream.writeInt32(4, i);
        }
    }
}
