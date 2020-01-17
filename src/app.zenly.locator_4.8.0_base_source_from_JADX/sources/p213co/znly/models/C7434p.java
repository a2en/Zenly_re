package p213co.znly.models;

import java.io.IOException;
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
import p213co.znly.models.C7339i.C7340a;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.p */
public final class C7434p extends GeneratedMessageLite<C7434p, C7435a> implements ContactProto$SuggestedUserOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7434p f18591h = new C7434p();

    /* renamed from: i */
    private static volatile Parser<C7434p> f18592i;

    /* renamed from: e */
    private int f18593e;

    /* renamed from: f */
    private C7339i f18594f;

    /* renamed from: g */
    private UserProto$User f18595g;

    /* renamed from: co.znly.models.p$a */
    public static final class C7435a extends Builder<C7434p, C7435a> implements ContactProto$SuggestedUserOrBuilder {
        /* synthetic */ C7435a(C7331h hVar) {
            this();
        }

        public C7339i getContact() {
            return ((C7434p) this.instance).getContact();
        }

        public C7436b getType() {
            return ((C7434p) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C7434p) this.instance).getTypeValue();
        }

        public UserProto$User getUser() {
            return ((C7434p) this.instance).getUser();
        }

        public boolean hasContact() {
            return ((C7434p) this.instance).hasContact();
        }

        public boolean hasUser() {
            return ((C7434p) this.instance).hasUser();
        }

        private C7435a() {
            super(C7434p.f18591h);
        }
    }

    /* renamed from: co.znly.models.p$b */
    public enum C7436b implements EnumLite {
        SUGGESTTYPE_UNKNOWN(0),
        SUGGESTTYPE_USER(1),
        SUGGESTTYPE_CONTACT(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f18601e;

        /* renamed from: co.znly.models.p$b$a */
        class C7437a implements EnumLiteMap<C7436b> {
            C7437a() {
            }

            public C7436b findValueByNumber(int i) {
                return C7436b.m18093a(i);
            }
        }

        static {
            new C7437a();
        }

        private C7436b(int i) {
            this.f18601e = i;
        }

        /* renamed from: a */
        public static C7436b m18093a(int i) {
            if (i == 0) {
                return SUGGESTTYPE_UNKNOWN;
            }
            if (i == 1) {
                return SUGGESTTYPE_USER;
            }
            if (i != 2) {
                return null;
            }
            return SUGGESTTYPE_CONTACT;
        }

        public final int getNumber() {
            return this.f18601e;
        }
    }

    static {
        f18591h.makeImmutable();
    }

    private C7434p() {
    }

    public static C7434p getDefaultInstance() {
        return f18591h;
    }

    public static Parser<C7434p> parser() {
        return f18591h.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7331h.f18216a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7434p();
            case 2:
                return f18591h;
            case 3:
                return null;
            case 4:
                return new C7435a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7434p pVar = (C7434p) obj2;
                boolean z2 = this.f18593e != 0;
                int i = this.f18593e;
                if (pVar.f18593e != 0) {
                    z = true;
                }
                this.f18593e = visitor.visitInt(z2, i, z, pVar.f18593e);
                this.f18594f = (C7339i) visitor.visitMessage(this.f18594f, pVar.f18594f);
                this.f18595g = (UserProto$User) visitor.visitMessage(this.f18595g, pVar.f18595g);
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
                                this.f18593e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                Builder builder = this.f18594f != null ? (C7340a) this.f18594f.toBuilder() : null;
                                this.f18594f = (C7339i) codedInputStream.readMessage(C7339i.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18594f);
                                    this.f18594f = (C7339i) builder.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder2 = this.f18595g != null ? (C6925a) this.f18595g.toBuilder() : null;
                                this.f18595g = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f18595g);
                                    this.f18595g = (UserProto$User) builder2.buildPartial();
                                }
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
                if (f18592i == null) {
                    synchronized (C7434p.class) {
                        if (f18592i == null) {
                            f18592i = new DefaultInstanceBasedParser(f18591h);
                        }
                    }
                }
                return f18592i;
            default:
                throw new UnsupportedOperationException();
        }
        return f18591h;
    }

    public C7339i getContact() {
        C7339i iVar = this.f18594f;
        return iVar == null ? C7339i.getDefaultInstance() : iVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f18593e != C7436b.SUGGESTTYPE_UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f18593e);
        }
        if (this.f18594f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getContact());
        }
        if (this.f18595g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getUser());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7436b getType() {
        C7436b a = C7436b.m18093a(this.f18593e);
        return a == null ? C7436b.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f18593e;
    }

    public UserProto$User getUser() {
        UserProto$User userProto$User = this.f18595g;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasContact() {
        return this.f18594f != null;
    }

    public boolean hasUser() {
        return this.f18595g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f18593e != C7436b.SUGGESTTYPE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f18593e);
        }
        if (this.f18594f != null) {
            codedOutputStream.writeMessage(2, getContact());
        }
        if (this.f18595g != null) {
            codedOutputStream.writeMessage(3, getUser());
        }
    }
}
