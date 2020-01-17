package p213co.znly.models;

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

/* renamed from: co.znly.models.d */
public final class C7270d extends GeneratedMessageLite<C7270d, C7271a> implements BrumpProto$BrumpInfoOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C7270d f18038l = new C7270d();

    /* renamed from: m */
    private static volatile Parser<C7270d> f18039m;

    /* renamed from: e */
    private double f18040e;

    /* renamed from: f */
    private double f18041f;

    /* renamed from: g */
    private float f18042g;

    /* renamed from: h */
    private float f18043h;

    /* renamed from: i */
    private float f18044i;

    /* renamed from: j */
    private String f18045j = "";

    /* renamed from: k */
    private int f18046k;

    /* renamed from: co.znly.models.d$a */
    public static final class C7271a extends Builder<C7270d, C7271a> implements BrumpProto$BrumpInfoOrBuilder {
        /* synthetic */ C7271a(C6949b bVar) {
            this();
        }

        public double getLatitude() {
            return ((C7270d) this.instance).getLatitude();
        }

        public double getLongitude() {
            return ((C7270d) this.instance).getLongitude();
        }

        public String getMatchId() {
            return ((C7270d) this.instance).getMatchId();
        }

        public ByteString getMatchIdBytes() {
            return ((C7270d) this.instance).getMatchIdBytes();
        }

        public float getPowerMatch() {
            return ((C7270d) this.instance).getPowerMatch();
        }

        public float getPowerUser1() {
            return ((C7270d) this.instance).getPowerUser1();
        }

        public float getPowerUser2() {
            return ((C7270d) this.instance).getPowerUser2();
        }

        public int getStreak() {
            return ((C7270d) this.instance).getStreak();
        }

        private C7271a() {
            super(C7270d.f18038l);
        }
    }

    static {
        f18038l.makeImmutable();
    }

    private C7270d() {
    }

    public static C7270d getDefaultInstance() {
        return f18038l;
    }

    public static Parser<C7270d> parser() {
        return f18038l.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C6949b.f17121a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7270d();
            case 2:
                return f18038l;
            case 3:
                return null;
            case 4:
                return new C7271a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7270d dVar = (C7270d) obj2;
                this.f18040e = visitor.visitDouble(this.f18040e != 0.0d, this.f18040e, dVar.f18040e != 0.0d, dVar.f18040e);
                this.f18041f = visitor.visitDouble(this.f18041f != 0.0d, this.f18041f, dVar.f18041f != 0.0d, dVar.f18041f);
                this.f18042g = visitor.visitFloat(this.f18042g != 0.0f, this.f18042g, dVar.f18042g != 0.0f, dVar.f18042g);
                this.f18043h = visitor.visitFloat(this.f18043h != 0.0f, this.f18043h, dVar.f18043h != 0.0f, dVar.f18043h);
                this.f18044i = visitor.visitFloat(this.f18044i != 0.0f, this.f18044i, dVar.f18044i != 0.0f, dVar.f18044i);
                this.f18045j = visitor.visitString(!this.f18045j.isEmpty(), this.f18045j, !dVar.f18045j.isEmpty(), dVar.f18045j);
                boolean z2 = this.f18046k != 0;
                int i = this.f18046k;
                if (dVar.f18046k != 0) {
                    z = true;
                }
                this.f18046k = visitor.visitInt(z2, i, z, dVar.f18046k);
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
                                this.f18040e = codedInputStream.readDouble();
                            } else if (readTag == 17) {
                                this.f18041f = codedInputStream.readDouble();
                            } else if (readTag == 29) {
                                this.f18042g = codedInputStream.readFloat();
                            } else if (readTag == 37) {
                                this.f18043h = codedInputStream.readFloat();
                            } else if (readTag == 45) {
                                this.f18044i = codedInputStream.readFloat();
                            } else if (readTag == 50) {
                                this.f18045j = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 56) {
                                this.f18046k = codedInputStream.readInt32();
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
                if (f18039m == null) {
                    synchronized (C7270d.class) {
                        if (f18039m == null) {
                            f18039m = new DefaultInstanceBasedParser(f18038l);
                        }
                    }
                }
                return f18039m;
            default:
                throw new UnsupportedOperationException();
        }
        return f18038l;
    }

    public double getLatitude() {
        return this.f18040e;
    }

    public double getLongitude() {
        return this.f18041f;
    }

    public String getMatchId() {
        return this.f18045j;
    }

    public ByteString getMatchIdBytes() {
        return ByteString.copyFromUtf8(this.f18045j);
    }

    public float getPowerMatch() {
        return this.f18044i;
    }

    public float getPowerUser1() {
        return this.f18042g;
    }

    public float getPowerUser2() {
        return this.f18043h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        double d = this.f18040e;
        if (d != 0.0d) {
            i2 = 0 + CodedOutputStream.computeDoubleSize(1, d);
        }
        double d2 = this.f18041f;
        if (d2 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(2, d2);
        }
        float f = this.f18042g;
        if (f != 0.0f) {
            i2 += CodedOutputStream.computeFloatSize(3, f);
        }
        float f2 = this.f18043h;
        if (f2 != 0.0f) {
            i2 += CodedOutputStream.computeFloatSize(4, f2);
        }
        float f3 = this.f18044i;
        if (f3 != 0.0f) {
            i2 += CodedOutputStream.computeFloatSize(5, f3);
        }
        if (!this.f18045j.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(6, getMatchId());
        }
        int i3 = this.f18046k;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(7, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int getStreak() {
        return this.f18046k;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        double d = this.f18040e;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(1, d);
        }
        double d2 = this.f18041f;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(2, d2);
        }
        float f = this.f18042g;
        if (f != 0.0f) {
            codedOutputStream.writeFloat(3, f);
        }
        float f2 = this.f18043h;
        if (f2 != 0.0f) {
            codedOutputStream.writeFloat(4, f2);
        }
        float f3 = this.f18044i;
        if (f3 != 0.0f) {
            codedOutputStream.writeFloat(5, f3);
        }
        if (!this.f18045j.isEmpty()) {
            codedOutputStream.writeString(6, getMatchId());
        }
        int i = this.f18046k;
        if (i != 0) {
            codedOutputStream.writeInt32(7, i);
        }
    }
}
