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
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;
import p213co.znly.models.services.C8125j3.C8126a;

/* renamed from: co.znly.models.services.l3 */
public final class C8155l3 extends GeneratedMessageLite<C8155l3, C8156a> implements ZenlyProto$MeUpdateResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8155l3 f20653g = new C8155l3();

    /* renamed from: h */
    private static volatile Parser<C8155l3> f20654h;

    /* renamed from: e */
    private UserProto$User f20655e;

    /* renamed from: f */
    private C8125j3 f20656f;

    /* renamed from: co.znly.models.services.l3$a */
    public static final class C8156a extends Builder<C8155l3, C8156a> implements ZenlyProto$MeUpdateResponseOrBuilder {
        /* synthetic */ C8156a(C8104i0 i0Var) {
            this();
        }

        public C8125j3 getError() {
            return ((C8155l3) this.instance).getError();
        }

        public UserProto$User getUser() {
            return ((C8155l3) this.instance).getUser();
        }

        public boolean hasError() {
            return ((C8155l3) this.instance).hasError();
        }

        public boolean hasUser() {
            return ((C8155l3) this.instance).hasUser();
        }

        private C8156a() {
            super(C8155l3.f20653g);
        }
    }

    static {
        f20653g.makeImmutable();
    }

    private C8155l3() {
    }

    public static C8156a newBuilder() {
        return (C8156a) f20653g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8155l3();
            case 2:
                return f20653g;
            case 3:
                return null;
            case 4:
                return new C8156a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8155l3 l3Var = (C8155l3) obj2;
                this.f20655e = (UserProto$User) visitor.visitMessage(this.f20655e, l3Var.f20655e);
                this.f20656f = (C8125j3) visitor.visitMessage(this.f20656f, l3Var.f20656f);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Builder builder = this.f20655e != null ? (C6925a) this.f20655e.toBuilder() : null;
                                this.f20655e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20655e);
                                    this.f20655e = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 1010) {
                                Builder builder2 = this.f20656f != null ? (C8126a) this.f20656f.toBuilder() : null;
                                this.f20656f = (C8125j3) codedInputStream.readMessage(C8125j3.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20656f);
                                    this.f20656f = (C8125j3) builder2.buildPartial();
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
                if (f20654h == null) {
                    synchronized (C8155l3.class) {
                        if (f20654h == null) {
                            f20654h = new DefaultInstanceBasedParser(f20653g);
                        }
                    }
                }
                return f20654h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20653g;
    }

    public C8125j3 getError() {
        C8125j3 j3Var = this.f20656f;
        return j3Var == null ? C8125j3.getDefaultInstance() : j3Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20655e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getUser());
        }
        if (this.f20656f != null) {
            i2 += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getUser() {
        UserProto$User userProto$User = this.f20655e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasError() {
        return this.f20656f != null;
    }

    public boolean hasUser() {
        return this.f20655e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20655e != null) {
            codedOutputStream.writeMessage(1, getUser());
        }
        if (this.f20656f != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
