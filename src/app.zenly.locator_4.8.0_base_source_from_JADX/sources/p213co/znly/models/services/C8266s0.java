package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C7270d;
import p213co.znly.models.C7270d.C7271a;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.services.s0 */
public final class C8266s0 extends GeneratedMessageLite<C8266s0, C8267a> implements ZenlyProto$BrumpStreamDownEventOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8266s0 f20898h = new C8266s0();

    /* renamed from: i */
    private static volatile Parser<C8266s0> f20899i;

    /* renamed from: e */
    private UserProto$User f20900e;

    /* renamed from: f */
    private boolean f20901f;

    /* renamed from: g */
    private C7270d f20902g;

    /* renamed from: co.znly.models.services.s0$a */
    public static final class C8267a extends Builder<C8266s0, C8267a> implements ZenlyProto$BrumpStreamDownEventOrBuilder {
        private C8267a() {
            super(C8266s0.f20898h);
        }

        /* synthetic */ C8267a(C8104i0 i0Var) {
            this();
        }

        public C7270d getBrumpInfo() {
            return ((C8266s0) this.instance).getBrumpInfo();
        }

        public boolean getIsFriend() {
            return ((C8266s0) this.instance).getIsFriend();
        }

        public UserProto$User getUser() {
            return ((C8266s0) this.instance).getUser();
        }

        public boolean hasBrumpInfo() {
            return ((C8266s0) this.instance).hasBrumpInfo();
        }

        public boolean hasUser() {
            return ((C8266s0) this.instance).hasUser();
        }
    }

    static {
        f20898h.makeImmutable();
    }

    private C8266s0() {
    }

    public static C8266s0 getDefaultInstance() {
        return f20898h;
    }

    public static Parser<C8266s0> parser() {
        return f20898h.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8266s0();
            case 2:
                return f20898h;
            case 3:
                return null;
            case 4:
                return new C8267a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8266s0 s0Var = (C8266s0) obj2;
                this.f20900e = (UserProto$User) visitor.visitMessage(this.f20900e, s0Var.f20900e);
                boolean z = this.f20901f;
                boolean z2 = s0Var.f20901f;
                this.f20901f = visitor.visitBoolean(z, z, z2, z2);
                this.f20902g = (C7270d) visitor.visitMessage(this.f20902g, s0Var.f20902g);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Builder builder = this.f20900e != null ? (C6925a) this.f20900e.toBuilder() : null;
                                this.f20900e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20900e);
                                    this.f20900e = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 24) {
                                this.f20901f = codedInputStream.readBool();
                            } else if (readTag == 34) {
                                Builder builder2 = this.f20902g != null ? (C7271a) this.f20902g.toBuilder() : null;
                                this.f20902g = (C7270d) codedInputStream.readMessage(C7270d.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20902g);
                                    this.f20902g = (C7270d) builder2.buildPartial();
                                }
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z3 = true;
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
                if (f20899i == null) {
                    synchronized (C8266s0.class) {
                        if (f20899i == null) {
                            f20899i = new DefaultInstanceBasedParser(f20898h);
                        }
                    }
                }
                return f20899i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20898h;
    }

    public C7270d getBrumpInfo() {
        C7270d dVar = this.f20902g;
        return dVar == null ? C7270d.getDefaultInstance() : dVar;
    }

    public boolean getIsFriend() {
        return this.f20901f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20900e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getUser());
        }
        boolean z = this.f20901f;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(3, z);
        }
        if (this.f20902g != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getBrumpInfo());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getUser() {
        UserProto$User userProto$User = this.f20900e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasBrumpInfo() {
        return this.f20902g != null;
    }

    public boolean hasUser() {
        return this.f20900e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20900e != null) {
            codedOutputStream.writeMessage(1, getUser());
        }
        boolean z = this.f20901f;
        if (z) {
            codedOutputStream.writeBool(3, z);
        }
        if (this.f20902g != null) {
            codedOutputStream.writeMessage(4, getBrumpInfo());
        }
    }
}
