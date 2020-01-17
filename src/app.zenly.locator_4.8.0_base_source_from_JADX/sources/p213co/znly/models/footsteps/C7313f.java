package p213co.znly.models.footsteps;

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
import p213co.znly.models.reversegeocoder.C7917e;

/* renamed from: co.znly.models.footsteps.f */
public final class C7313f extends GeneratedMessageLite<C7313f, C7314a> implements FootstepsProto$RecordOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7313f f18164i = new C7313f();

    /* renamed from: j */
    private static volatile Parser<C7313f> f18165j;

    /* renamed from: e */
    private String f18166e = "";

    /* renamed from: f */
    private long f18167f;

    /* renamed from: g */
    private double f18168g;

    /* renamed from: h */
    private int f18169h;

    /* renamed from: co.znly.models.footsteps.f$a */
    public static final class C7314a extends Builder<C7313f, C7314a> implements FootstepsProto$RecordOrBuilder {
        /* synthetic */ C7314a(C7304a aVar) {
            this();
        }

        public double getAreaUncovered() {
            return ((C7313f) this.instance).getAreaUncovered();
        }

        public long getPlaceId() {
            return ((C7313f) this.instance).getPlaceId();
        }

        public C7917e getType() {
            return ((C7313f) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C7313f) this.instance).getTypeValue();
        }

        public String getUserId() {
            return ((C7313f) this.instance).getUserId();
        }

        public ByteString getUserIdBytes() {
            return ((C7313f) this.instance).getUserIdBytes();
        }

        private C7314a() {
            super(C7313f.f18164i);
        }
    }

    static {
        f18164i.makeImmutable();
    }

    private C7313f() {
    }

    public static Parser<C7313f> parser() {
        return f18164i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7304a.f18131a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7313f();
            case 2:
                return f18164i;
            case 3:
                return null;
            case 4:
                return new C7314a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7313f fVar = (C7313f) obj2;
                this.f18166e = visitor.visitString(!this.f18166e.isEmpty(), this.f18166e, !fVar.f18166e.isEmpty(), fVar.f18166e);
                this.f18167f = visitor.visitLong(this.f18167f != 0, this.f18167f, fVar.f18167f != 0, fVar.f18167f);
                this.f18168g = visitor.visitDouble(this.f18168g != 0.0d, this.f18168g, fVar.f18168g != 0.0d, fVar.f18168g);
                boolean z2 = this.f18169h != 0;
                int i = this.f18169h;
                if (fVar.f18169h != 0) {
                    z = true;
                }
                this.f18169h = visitor.visitInt(z2, i, z, fVar.f18169h);
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
                                this.f18166e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f18167f = codedInputStream.readUInt64();
                            } else if (readTag == 25) {
                                this.f18168g = codedInputStream.readDouble();
                            } else if (readTag == 32) {
                                this.f18169h = codedInputStream.readEnum();
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
                if (f18165j == null) {
                    synchronized (C7313f.class) {
                        if (f18165j == null) {
                            f18165j = new DefaultInstanceBasedParser(f18164i);
                        }
                    }
                }
                return f18165j;
            default:
                throw new UnsupportedOperationException();
        }
        return f18164i;
    }

    public double getAreaUncovered() {
        return this.f18168g;
    }

    public long getPlaceId() {
        return this.f18167f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18166e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUserId());
        }
        long j = this.f18167f;
        if (j != 0) {
            i2 += CodedOutputStream.computeUInt64Size(2, j);
        }
        double d = this.f18168g;
        if (d != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(3, d);
        }
        if (this.f18169h != C7917e.UNUSED.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(4, this.f18169h);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7917e getType() {
        C7917e a = C7917e.m18960a(this.f18169h);
        return a == null ? C7917e.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f18169h;
    }

    public String getUserId() {
        return this.f18166e;
    }

    public ByteString getUserIdBytes() {
        return ByteString.copyFromUtf8(this.f18166e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18166e.isEmpty()) {
            codedOutputStream.writeString(1, getUserId());
        }
        long j = this.f18167f;
        if (j != 0) {
            codedOutputStream.writeUInt64(2, j);
        }
        double d = this.f18168g;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(3, d);
        }
        if (this.f18169h != C7917e.UNUSED.getNumber()) {
            codedOutputStream.writeEnum(4, this.f18169h);
        }
    }
}
