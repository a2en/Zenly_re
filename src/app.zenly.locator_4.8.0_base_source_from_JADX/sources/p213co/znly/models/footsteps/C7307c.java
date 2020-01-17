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

/* renamed from: co.znly.models.footsteps.c */
public final class C7307c extends GeneratedMessageLite<C7307c, C7308a> implements FootstepsProto$LocalityRecordOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7307c f18143g = new C7307c();

    /* renamed from: h */
    private static volatile Parser<C7307c> f18144h;

    /* renamed from: e */
    private String f18145e = "";

    /* renamed from: f */
    private double f18146f;

    /* renamed from: co.znly.models.footsteps.c$a */
    public static final class C7308a extends Builder<C7307c, C7308a> implements FootstepsProto$LocalityRecordOrBuilder {
        /* synthetic */ C7308a(C7304a aVar) {
            this();
        }

        public double getAreaUncovered() {
            return ((C7307c) this.instance).getAreaUncovered();
        }

        public String getUserId() {
            return ((C7307c) this.instance).getUserId();
        }

        public ByteString getUserIdBytes() {
            return ((C7307c) this.instance).getUserIdBytes();
        }

        private C7308a() {
            super(C7307c.f18143g);
        }
    }

    static {
        f18143g.makeImmutable();
    }

    private C7307c() {
    }

    public static Parser<C7307c> parser() {
        return f18143g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7304a.f18131a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7307c();
            case 2:
                return f18143g;
            case 3:
                return null;
            case 4:
                return new C7308a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7307c cVar = (C7307c) obj2;
                this.f18145e = visitor.visitString(!this.f18145e.isEmpty(), this.f18145e, !cVar.f18145e.isEmpty(), cVar.f18145e);
                this.f18146f = visitor.visitDouble(this.f18146f != 0.0d, this.f18146f, cVar.f18146f != 0.0d, cVar.f18146f);
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
                                this.f18145e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 25) {
                                this.f18146f = codedInputStream.readDouble();
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
                if (f18144h == null) {
                    synchronized (C7307c.class) {
                        if (f18144h == null) {
                            f18144h = new DefaultInstanceBasedParser(f18143g);
                        }
                    }
                }
                return f18144h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18143g;
    }

    public double getAreaUncovered() {
        return this.f18146f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18145e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUserId());
        }
        double d = this.f18146f;
        if (d != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(3, d);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUserId() {
        return this.f18145e;
    }

    public ByteString getUserIdBytes() {
        return ByteString.copyFromUtf8(this.f18145e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18145e.isEmpty()) {
            codedOutputStream.writeString(1, getUserId());
        }
        double d = this.f18146f;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(3, d);
        }
    }
}
