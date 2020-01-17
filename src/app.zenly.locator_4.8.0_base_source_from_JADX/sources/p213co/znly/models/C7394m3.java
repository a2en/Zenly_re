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
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.m3 */
public final class C7394m3 extends GeneratedMessageLite<C7394m3, C7395a> implements WeatherProto$WeatherRegionOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7394m3 f18441f = new C7394m3();

    /* renamed from: g */
    private static volatile Parser<C7394m3> f18442g;

    /* renamed from: e */
    private ProtobufList<WeatherProto$Weather> f18443e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.m3$a */
    public static final class C7395a extends Builder<C7394m3, C7395a> implements WeatherProto$WeatherRegionOrBuilder {
        /* synthetic */ C7395a(C7386l3 l3Var) {
            this();
        }

        public WeatherProto$Weather getWeathers(int i) {
            return ((C7394m3) this.instance).getWeathers(i);
        }

        public int getWeathersCount() {
            return ((C7394m3) this.instance).getWeathersCount();
        }

        public List<WeatherProto$Weather> getWeathersList() {
            return Collections.unmodifiableList(((C7394m3) this.instance).getWeathersList());
        }

        private C7395a() {
            super(C7394m3.f18441f);
        }
    }

    static {
        f18441f.makeImmutable();
    }

    private C7394m3() {
    }

    public static C7394m3 getDefaultInstance() {
        return f18441f;
    }

    public static Parser<C7394m3> parser() {
        return f18441f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7386l3.f18417a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7394m3();
            case 2:
                return f18441f;
            case 3:
                this.f18443e.makeImmutable();
                return null;
            case 4:
                return new C7395a(null);
            case 5:
                this.f18443e = ((Visitor) obj).visitList(this.f18443e, ((C7394m3) obj2).f18443e);
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
                                if (!this.f18443e.isModifiable()) {
                                    this.f18443e = GeneratedMessageLite.mutableCopy(this.f18443e);
                                }
                                this.f18443e.add(codedInputStream.readMessage(WeatherProto$Weather.parser(), extensionRegistryLite));
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
                if (f18442g == null) {
                    synchronized (C7394m3.class) {
                        if (f18442g == null) {
                            f18442g = new DefaultInstanceBasedParser(f18441f);
                        }
                    }
                }
                return f18442g;
            default:
                throw new UnsupportedOperationException();
        }
        return f18441f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f18443e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f18443e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public WeatherProto$Weather getWeathers(int i) {
        return (WeatherProto$Weather) this.f18443e.get(i);
    }

    public int getWeathersCount() {
        return this.f18443e.size();
    }

    public List<WeatherProto$Weather> getWeathersList() {
        return this.f18443e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f18443e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f18443e.get(i));
        }
    }
}
