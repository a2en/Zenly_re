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

/* renamed from: co.znly.models.h3 */
public final class C7337h3 extends GeneratedMessageLite<C7337h3, C7338a> implements UserProto$TopEntryOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7337h3 f18233i = new C7337h3();

    /* renamed from: j */
    private static volatile Parser<C7337h3> f18234j;

    /* renamed from: e */
    private String f18235e = "";

    /* renamed from: f */
    private double f18236f;

    /* renamed from: g */
    private int f18237g;

    /* renamed from: h */
    private double f18238h;

    /* renamed from: co.znly.models.h3$a */
    public static final class C7338a extends Builder<C7337h3, C7338a> implements UserProto$TopEntryOrBuilder {
        /* synthetic */ C7338a(C7519z2 z2Var) {
            this();
        }

        public String getFriendUserUuid() {
            return ((C7337h3) this.instance).getFriendUserUuid();
        }

        public ByteString getFriendUserUuidBytes() {
            return ((C7337h3) this.instance).getFriendUserUuidBytes();
        }

        public int getRank() {
            return ((C7337h3) this.instance).getRank();
        }

        public double getScore() {
            return ((C7337h3) this.instance).getScore();
        }

        public double getStableScore() {
            return ((C7337h3) this.instance).getStableScore();
        }

        private C7338a() {
            super(C7337h3.f18233i);
        }
    }

    static {
        f18233i.makeImmutable();
    }

    private C7337h3() {
    }

    public static C7337h3 getDefaultInstance() {
        return f18233i;
    }

    public static Parser<C7337h3> parser() {
        return f18233i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7519z2.f18891a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7337h3();
            case 2:
                return f18233i;
            case 3:
                return null;
            case 4:
                return new C7338a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7337h3 h3Var = (C7337h3) obj2;
                this.f18235e = visitor.visitString(!this.f18235e.isEmpty(), this.f18235e, !h3Var.f18235e.isEmpty(), h3Var.f18235e);
                this.f18236f = visitor.visitDouble(this.f18236f != 0.0d, this.f18236f, h3Var.f18236f != 0.0d, h3Var.f18236f);
                this.f18237g = visitor.visitInt(this.f18237g != 0, this.f18237g, h3Var.f18237g != 0, h3Var.f18237g);
                this.f18238h = visitor.visitDouble(this.f18238h != 0.0d, this.f18238h, h3Var.f18238h != 0.0d, h3Var.f18238h);
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
                                this.f18235e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 17) {
                                this.f18236f = codedInputStream.readDouble();
                            } else if (readTag == 24) {
                                this.f18237g = codedInputStream.readInt32();
                            } else if (readTag == 41) {
                                this.f18238h = codedInputStream.readDouble();
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
                if (f18234j == null) {
                    synchronized (C7337h3.class) {
                        if (f18234j == null) {
                            f18234j = new DefaultInstanceBasedParser(f18233i);
                        }
                    }
                }
                return f18234j;
            default:
                throw new UnsupportedOperationException();
        }
        return f18233i;
    }

    public String getFriendUserUuid() {
        return this.f18235e;
    }

    public ByteString getFriendUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f18235e);
    }

    public int getRank() {
        return this.f18237g;
    }

    public double getScore() {
        return this.f18236f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18235e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getFriendUserUuid());
        }
        double d = this.f18236f;
        if (d != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(2, d);
        }
        int i3 = this.f18237g;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(3, i3);
        }
        double d2 = this.f18238h;
        if (d2 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(5, d2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public double getStableScore() {
        return this.f18238h;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18235e.isEmpty()) {
            codedOutputStream.writeString(1, getFriendUserUuid());
        }
        double d = this.f18236f;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(2, d);
        }
        int i = this.f18237g;
        if (i != 0) {
            codedOutputStream.writeInt32(3, i);
        }
        double d2 = this.f18238h;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(5, d2);
        }
    }
}
