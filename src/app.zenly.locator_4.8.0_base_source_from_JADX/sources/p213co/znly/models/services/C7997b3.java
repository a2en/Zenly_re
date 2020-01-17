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
import p213co.znly.models.C7280e;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.services.b3 */
public final class C7997b3 extends GeneratedMessageLite<C7997b3, C7998a> implements ZenlyProto$FriendStreamEventOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7997b3 f20295g = new C7997b3();

    /* renamed from: h */
    private static volatile Parser<C7997b3> f20296h;

    /* renamed from: e */
    private int f20297e;

    /* renamed from: f */
    private UserProto$User f20298f;

    /* renamed from: co.znly.models.services.b3$a */
    public static final class C7998a extends Builder<C7997b3, C7998a> implements ZenlyProto$FriendStreamEventOrBuilder {
        /* synthetic */ C7998a(C8104i0 i0Var) {
            this();
        }

        public UserProto$User getFriend() {
            return ((C7997b3) this.instance).getFriend();
        }

        public C7280e getOp() {
            return ((C7997b3) this.instance).getOp();
        }

        public int getOpValue() {
            return ((C7997b3) this.instance).getOpValue();
        }

        public boolean hasFriend() {
            return ((C7997b3) this.instance).hasFriend();
        }

        private C7998a() {
            super(C7997b3.f20295g);
        }
    }

    static {
        f20295g.makeImmutable();
    }

    private C7997b3() {
    }

    public static C7998a newBuilder() {
        return (C7998a) f20295g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7997b3();
            case 2:
                return f20295g;
            case 3:
                return null;
            case 4:
                return new C7998a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7997b3 b3Var = (C7997b3) obj2;
                boolean z2 = this.f20297e != 0;
                int i = this.f20297e;
                if (b3Var.f20297e != 0) {
                    z = true;
                }
                this.f20297e = visitor.visitInt(z2, i, z, b3Var.f20297e);
                this.f20298f = (UserProto$User) visitor.visitMessage(this.f20298f, b3Var.f20298f);
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
                                this.f20297e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                Builder builder = this.f20298f != null ? (C6925a) this.f20298f.toBuilder() : null;
                                this.f20298f = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20298f);
                                    this.f20298f = (UserProto$User) builder.buildPartial();
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
                if (f20296h == null) {
                    synchronized (C7997b3.class) {
                        if (f20296h == null) {
                            f20296h = new DefaultInstanceBasedParser(f20295g);
                        }
                    }
                }
                return f20296h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20295g;
    }

    public UserProto$User getFriend() {
        UserProto$User userProto$User = this.f20298f;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public C7280e getOp() {
        C7280e a = C7280e.m17990a(this.f20297e);
        return a == null ? C7280e.UNRECOGNIZED : a;
    }

    public int getOpValue() {
        return this.f20297e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20297e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20297e);
        }
        if (this.f20298f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getFriend());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasFriend() {
        return this.f20298f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20297e != C7280e.CRUD_OP_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20297e);
        }
        if (this.f20298f != null) {
            codedOutputStream.writeMessage(2, getFriend());
        }
    }
}
