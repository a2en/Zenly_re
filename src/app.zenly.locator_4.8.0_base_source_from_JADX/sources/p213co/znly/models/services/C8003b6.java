package p213co.znly.models.services;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.C7985a6.C7986a;

/* renamed from: co.znly.models.services.b6 */
public final class C8003b6 extends GeneratedMessageLite<C8003b6, C8004a> implements ZenlyProto$UsersGetPublicResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8003b6 f20311h = new C8003b6();

    /* renamed from: i */
    private static volatile Parser<C8003b6> f20312i;

    /* renamed from: e */
    private int f20313e;

    /* renamed from: f */
    private ProtobufList<UserProto$User> f20314f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private C7985a6 f20315g;

    /* renamed from: co.znly.models.services.b6$a */
    public static final class C8004a extends Builder<C8003b6, C8004a> implements ZenlyProto$UsersGetPublicResponseOrBuilder {
        /* synthetic */ C8004a(C8104i0 i0Var) {
            this();
        }

        public C7985a6 getError() {
            return ((C8003b6) this.instance).getError();
        }

        public UserProto$User getUsers(int i) {
            return ((C8003b6) this.instance).getUsers(i);
        }

        public int getUsersCount() {
            return ((C8003b6) this.instance).getUsersCount();
        }

        public List<UserProto$User> getUsersList() {
            return Collections.unmodifiableList(((C8003b6) this.instance).getUsersList());
        }

        public boolean hasError() {
            return ((C8003b6) this.instance).hasError();
        }

        private C8004a() {
            super(C8003b6.f20311h);
        }
    }

    static {
        f20311h.makeImmutable();
    }

    private C8003b6() {
    }

    public static C8004a newBuilder() {
        return (C8004a) f20311h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8003b6();
            case 2:
                return f20311h;
            case 3:
                this.f20314f.makeImmutable();
                return null;
            case 4:
                return new C8004a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8003b6 b6Var = (C8003b6) obj2;
                this.f20314f = visitor.visitList(this.f20314f, b6Var.f20314f);
                this.f20315g = (C7985a6) visitor.visitMessage(this.f20315g, b6Var.f20315g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20313e |= b6Var.f20313e;
                }
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
                                if (!this.f20314f.isModifiable()) {
                                    this.f20314f = GeneratedMessageLite.mutableCopy(this.f20314f);
                                }
                                this.f20314f.add(codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite));
                            } else if (readTag == 1010) {
                                Builder builder = this.f20315g != null ? (C7986a) this.f20315g.toBuilder() : null;
                                this.f20315g = (C7985a6) codedInputStream.readMessage(C7985a6.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20315g);
                                    this.f20315g = (C7985a6) builder.buildPartial();
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
                if (f20312i == null) {
                    synchronized (C8003b6.class) {
                        if (f20312i == null) {
                            f20312i = new DefaultInstanceBasedParser(f20311h);
                        }
                    }
                }
                return f20312i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20311h;
    }

    public C7985a6 getError() {
        C7985a6 a6Var = this.f20315g;
        return a6Var == null ? C7985a6.getDefaultInstance() : a6Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20314f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20314f.get(i3));
        }
        if (this.f20315g != null) {
            i2 += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getUsers(int i) {
        return (UserProto$User) this.f20314f.get(i);
    }

    public int getUsersCount() {
        return this.f20314f.size();
    }

    public List<UserProto$User> getUsersList() {
        return this.f20314f;
    }

    public boolean hasError() {
        return this.f20315g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20314f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20314f.get(i));
        }
        if (this.f20315g != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
