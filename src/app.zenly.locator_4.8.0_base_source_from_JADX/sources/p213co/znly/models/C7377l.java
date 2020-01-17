package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.l */
public final class C7377l extends GeneratedMessageLite<C7377l, C7378a> implements C6803xd567056c {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7377l f18385g = new C7377l();

    /* renamed from: h */
    private static volatile Parser<C7377l> f18386h;

    /* renamed from: e */
    private String f18387e = "";

    /* renamed from: f */
    private int f18388f;

    /* renamed from: co.znly.models.l$a */
    public static final class C7378a extends Builder<C7377l, C7378a> implements C6803xd567056c {
        /* synthetic */ C7378a(C7331h hVar) {
            this();
        }

        public String getPhoneNumber() {
            return ((C7377l) this.instance).getPhoneNumber();
        }

        public ByteString getPhoneNumberBytes() {
            return ((C7377l) this.instance).getPhoneNumberBytes();
        }

        public C7379b getType() {
            return ((C7377l) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C7377l) this.instance).getTypeValue();
        }

        private C7378a() {
            super(C7377l.f18385g);
        }
    }

    /* renamed from: co.znly.models.l$b */
    public enum C7379b implements EnumLite {
        TYPE_UNKNOWN(0),
        TYPE_FIXED_LINE(1),
        TYPE_MOBILE(2),
        TYPE_FIXED_LINE_OR_MOBILE(3),
        TYPE_TOLL_FREE(4),
        TYPE_PREMIUM_RATE(5),
        TYPE_SHARED_COST(6),
        TYPE_VOIP(7),
        TYPE_PERSONAL_NUMBER(8),
        TYPE_PAGER(9),
        TYPE_UAN(10),
        TYPE_VOICEMAIL(11),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f18403e;

        /* renamed from: co.znly.models.l$b$a */
        class C7380a implements EnumLiteMap<C7379b> {
            C7380a() {
            }

            public C7379b findValueByNumber(int i) {
                return C7379b.m18070a(i);
            }
        }

        static {
            new C7380a();
        }

        private C7379b(int i) {
            this.f18403e = i;
        }

        /* renamed from: a */
        public static C7379b m18070a(int i) {
            switch (i) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_FIXED_LINE;
                case 2:
                    return TYPE_MOBILE;
                case 3:
                    return TYPE_FIXED_LINE_OR_MOBILE;
                case 4:
                    return TYPE_TOLL_FREE;
                case 5:
                    return TYPE_PREMIUM_RATE;
                case 6:
                    return TYPE_SHARED_COST;
                case 7:
                    return TYPE_VOIP;
                case 8:
                    return TYPE_PERSONAL_NUMBER;
                case 9:
                    return TYPE_PAGER;
                case 10:
                    return TYPE_UAN;
                case 11:
                    return TYPE_VOICEMAIL;
                default:
                    return null;
            }
        }

        public final int getNumber() {
            return this.f18403e;
        }
    }

    static {
        f18385g.makeImmutable();
    }

    private C7377l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7331h.f18216a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7377l();
            case 2:
                return f18385g;
            case 3:
                return null;
            case 4:
                return new C7378a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7377l lVar = (C7377l) obj2;
                this.f18387e = visitor.visitString(!this.f18387e.isEmpty(), this.f18387e, !lVar.f18387e.isEmpty(), lVar.f18387e);
                boolean z2 = this.f18388f != 0;
                int i = this.f18388f;
                if (lVar.f18388f != 0) {
                    z = true;
                }
                this.f18388f = visitor.visitInt(z2, i, z, lVar.f18388f);
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
                                this.f18387e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f18388f = codedInputStream.readEnum();
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
                if (f18386h == null) {
                    synchronized (C7377l.class) {
                        if (f18386h == null) {
                            f18386h = new DefaultInstanceBasedParser(f18385g);
                        }
                    }
                }
                return f18386h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18385g;
    }

    public String getPhoneNumber() {
        return this.f18387e;
    }

    public ByteString getPhoneNumberBytes() {
        return ByteString.copyFromUtf8(this.f18387e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18387e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getPhoneNumber());
        }
        if (this.f18388f != C7379b.TYPE_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f18388f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7379b getType() {
        C7379b a = C7379b.m18070a(this.f18388f);
        return a == null ? C7379b.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f18388f;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18387e.isEmpty()) {
            codedOutputStream.writeString(1, getPhoneNumber());
        }
        if (this.f18388f != C7379b.TYPE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(2, this.f18388f);
        }
    }
}
