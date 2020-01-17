package p213co.znly.models.reversegeocoder;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.reversegeocoder.i */
public final class C7925i extends GeneratedMessageLite<C7925i, C7926a> implements ReverseGeoCoderProto$ZoneOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7925i f20100g = new C7925i();

    /* renamed from: h */
    private static volatile Parser<C7925i> f20101h;

    /* renamed from: e */
    private long f20102e;

    /* renamed from: f */
    private int f20103f;

    /* renamed from: co.znly.models.reversegeocoder.i$a */
    public static final class C7926a extends Builder<C7925i, C7926a> implements ReverseGeoCoderProto$ZoneOrBuilder {
        /* synthetic */ C7926a(C7910a aVar) {
            this();
        }

        public long getId() {
            return ((C7925i) this.instance).getId();
        }

        public C7917e getType() {
            return ((C7925i) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C7925i) this.instance).getTypeValue();
        }

        private C7926a() {
            super(C7925i.f20100g);
        }
    }

    static {
        f20100g.makeImmutable();
    }

    private C7925i() {
    }

    public static Parser<C7925i> parser() {
        return f20100g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7910a.f20031a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7925i();
            case 2:
                return f20100g;
            case 3:
                return null;
            case 4:
                return new C7926a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7925i iVar = (C7925i) obj2;
                this.f20102e = visitor.visitLong(this.f20102e != 0, this.f20102e, iVar.f20102e != 0, iVar.f20102e);
                boolean z2 = this.f20103f != 0;
                int i = this.f20103f;
                if (iVar.f20103f != 0) {
                    z = true;
                }
                this.f20103f = visitor.visitInt(z2, i, z, iVar.f20103f);
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
                                this.f20102e = codedInputStream.readUInt64();
                            } else if (readTag == 16) {
                                this.f20103f = codedInputStream.readEnum();
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
                if (f20101h == null) {
                    synchronized (C7925i.class) {
                        if (f20101h == null) {
                            f20101h = new DefaultInstanceBasedParser(f20100g);
                        }
                    }
                }
                return f20101h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20100g;
    }

    public long getId() {
        return this.f20102e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f20102e;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeUInt64Size(1, j);
        }
        if (this.f20103f != C7917e.UNUSED.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f20103f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7917e getType() {
        C7917e a = C7917e.m18960a(this.f20103f);
        return a == null ? C7917e.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f20103f;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f20102e;
        if (j != 0) {
            codedOutputStream.writeUInt64(1, j);
        }
        if (this.f20103f != C7917e.UNUSED.getNumber()) {
            codedOutputStream.writeEnum(2, this.f20103f);
        }
    }
}
