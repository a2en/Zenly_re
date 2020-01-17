package p213co.znly.models.places;

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
import p213co.znly.models.PlaceProto$Place.C6845c.C6847b;

/* renamed from: co.znly.models.places.b */
public final class C7871b extends GeneratedMessageLite<C7871b, C7872a> implements PlaceProto$PersonalPlaceOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7871b f19711g = new C7871b();

    /* renamed from: h */
    private static volatile Parser<C7871b> f19712h;

    /* renamed from: e */
    private String f19713e = "";

    /* renamed from: f */
    private int f19714f;

    /* renamed from: co.znly.models.places.b$a */
    public static final class C7872a extends Builder<C7871b, C7872a> implements PlaceProto$PersonalPlaceOrBuilder {
        /* synthetic */ C7872a(C7870a aVar) {
            this();
        }

        public C6847b getTag() {
            return ((C7871b) this.instance).getTag();
        }

        public int getTagValue() {
            return ((C7871b) this.instance).getTagValue();
        }

        public String getUserUuid() {
            return ((C7871b) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7871b) this.instance).getUserUuidBytes();
        }

        private C7872a() {
            super(C7871b.f19711g);
        }
    }

    static {
        f19711g.makeImmutable();
    }

    private C7871b() {
    }

    public static C7871b getDefaultInstance() {
        return f19711g;
    }

    public static Parser<C7871b> parser() {
        return f19711g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7870a.f19710a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7871b();
            case 2:
                return f19711g;
            case 3:
                return null;
            case 4:
                return new C7872a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7871b bVar = (C7871b) obj2;
                this.f19713e = visitor.visitString(!this.f19713e.isEmpty(), this.f19713e, !bVar.f19713e.isEmpty(), bVar.f19713e);
                boolean z2 = this.f19714f != 0;
                int i = this.f19714f;
                if (bVar.f19714f != 0) {
                    z = true;
                }
                this.f19714f = visitor.visitInt(z2, i, z, bVar.f19714f);
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
                                this.f19713e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f19714f = codedInputStream.readEnum();
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
                if (f19712h == null) {
                    synchronized (C7871b.class) {
                        if (f19712h == null) {
                            f19712h = new DefaultInstanceBasedParser(f19711g);
                        }
                    }
                }
                return f19712h;
            default:
                throw new UnsupportedOperationException();
        }
        return f19711g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f19713e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUserUuid());
        }
        if (this.f19714f != C6847b.NOLABEL.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f19714f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C6847b getTag() {
        C6847b a = C6847b.m17595a(this.f19714f);
        return a == null ? C6847b.UNRECOGNIZED : a;
    }

    public int getTagValue() {
        return this.f19714f;
    }

    public String getUserUuid() {
        return this.f19713e;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f19713e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f19713e.isEmpty()) {
            codedOutputStream.writeString(1, getUserUuid());
        }
        if (this.f19714f != C6847b.NOLABEL.getNumber()) {
            codedOutputStream.writeEnum(2, this.f19714f);
        }
    }
}
