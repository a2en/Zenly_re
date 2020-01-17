package p213co.znly.models.core;

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

/* renamed from: co.znly.models.core.i2 */
public final class C7123i2 extends GeneratedMessageLite<C7123i2, C7124a> implements TypesProto$PhoneRegionOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7123i2 f17646g = new C7123i2();

    /* renamed from: h */
    private static volatile Parser<C7123i2> f17647h;

    /* renamed from: e */
    private String f17648e = "";

    /* renamed from: f */
    private int f17649f;

    /* renamed from: co.znly.models.core.i2$a */
    public static final class C7124a extends Builder<C7123i2, C7124a> implements TypesProto$PhoneRegionOrBuilder {
        /* synthetic */ C7124a(C7253x1 x1Var) {
            this();
        }

        /* renamed from: a */
        public C7124a mo19123a(String str) {
            copyOnWrite();
            ((C7123i2) this.instance).m17810a(str);
            return this;
        }

        public int getCountryDialingCode() {
            return ((C7123i2) this.instance).getCountryDialingCode();
        }

        public String getIsoCountryCode() {
            return ((C7123i2) this.instance).getIsoCountryCode();
        }

        public ByteString getIsoCountryCodeBytes() {
            return ((C7123i2) this.instance).getIsoCountryCodeBytes();
        }

        private C7124a() {
            super(C7123i2.f17646g);
        }

        /* renamed from: a */
        public C7124a mo19122a(int i) {
            copyOnWrite();
            ((C7123i2) this.instance).m17807a(i);
            return this;
        }
    }

    static {
        f17646g.makeImmutable();
    }

    private C7123i2() {
    }

    public static C7123i2 getDefaultInstance() {
        return f17646g;
    }

    public static C7124a newBuilder() {
        return (C7124a) f17646g.toBuilder();
    }

    public static Parser<C7123i2> parser() {
        return f17646g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7123i2();
            case 2:
                return f17646g;
            case 3:
                return null;
            case 4:
                return new C7124a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7123i2 i2Var = (C7123i2) obj2;
                this.f17648e = visitor.visitString(!this.f17648e.isEmpty(), this.f17648e, !i2Var.f17648e.isEmpty(), i2Var.f17648e);
                boolean z2 = this.f17649f != 0;
                int i = this.f17649f;
                if (i2Var.f17649f != 0) {
                    z = true;
                }
                this.f17649f = visitor.visitInt(z2, i, z, i2Var.f17649f);
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
                                this.f17648e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f17649f = codedInputStream.readInt32();
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
                if (f17647h == null) {
                    synchronized (C7123i2.class) {
                        if (f17647h == null) {
                            f17647h = new DefaultInstanceBasedParser(f17646g);
                        }
                    }
                }
                return f17647h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17646g;
    }

    public int getCountryDialingCode() {
        return this.f17649f;
    }

    public String getIsoCountryCode() {
        return this.f17648e;
    }

    public ByteString getIsoCountryCodeBytes() {
        return ByteString.copyFromUtf8(this.f17648e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17648e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getIsoCountryCode());
        }
        int i3 = this.f17649f;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(2, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17648e.isEmpty()) {
            codedOutputStream.writeString(1, getIsoCountryCode());
        }
        int i = this.f17649f;
        if (i != 0) {
            codedOutputStream.writeInt32(2, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17810a(String str) {
        if (str != null) {
            this.f17648e = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17807a(int i) {
        this.f17649f = i;
    }
}
