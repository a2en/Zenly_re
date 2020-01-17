package p213co.znly.models.places;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.places.h */
public final class C7883h extends GeneratedMessageLite<C7883h, C7884a> implements PlaceProto$ScoreOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7883h f19940f = new C7883h();

    /* renamed from: g */
    private static volatile Parser<C7883h> f19941g;

    /* renamed from: e */
    private double f19942e;

    /* renamed from: co.znly.models.places.h$a */
    public static final class C7884a extends Builder<C7883h, C7884a> implements PlaceProto$ScoreOrBuilder {
        /* synthetic */ C7884a(C7870a aVar) {
            this();
        }

        public double getConfidence() {
            return ((C7883h) this.instance).getConfidence();
        }

        private C7884a() {
            super(C7883h.f19940f);
        }
    }

    static {
        f19940f.makeImmutable();
    }

    private C7883h() {
    }

    public static C7883h getDefaultInstance() {
        return f19940f;
    }

    public static Parser<C7883h> parser() {
        return f19940f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7870a.f19710a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7883h();
            case 2:
                return f19940f;
            case 3:
                return null;
            case 4:
                return new C7884a(null);
            case 5:
                C7883h hVar = (C7883h) obj2;
                this.f19942e = ((Visitor) obj).visitDouble(this.f19942e != 0.0d, this.f19942e, hVar.f19942e != 0.0d, hVar.f19942e);
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
                                this.f19942e = codedInputStream.readDouble();
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
                if (f19941g == null) {
                    synchronized (C7883h.class) {
                        if (f19941g == null) {
                            f19941g = new DefaultInstanceBasedParser(f19940f);
                        }
                    }
                }
                return f19941g;
            default:
                throw new UnsupportedOperationException();
        }
        return f19940f;
    }

    public double getConfidence() {
        return this.f19942e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        double d = this.f19942e;
        if (d != 0.0d) {
            i2 = 0 + CodedOutputStream.computeDoubleSize(1, d);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        double d = this.f19942e;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(1, d);
        }
    }
}
