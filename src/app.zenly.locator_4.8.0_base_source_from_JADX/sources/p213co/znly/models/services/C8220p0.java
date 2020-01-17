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
import p213co.znly.models.services.C8179n0.C8180a;

/* renamed from: co.znly.models.services.p0 */
public final class C8220p0 extends GeneratedMessageLite<C8220p0, C8221a> implements ZenlyProto$BlockedUsersResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8220p0 f20804h = new C8220p0();

    /* renamed from: i */
    private static volatile Parser<C8220p0> f20805i;

    /* renamed from: e */
    private int f20806e;

    /* renamed from: f */
    private ProtobufList<UserProto$User> f20807f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private C8179n0 f20808g;

    /* renamed from: co.znly.models.services.p0$a */
    public static final class C8221a extends Builder<C8220p0, C8221a> implements ZenlyProto$BlockedUsersResponseOrBuilder {
        /* synthetic */ C8221a(C8104i0 i0Var) {
            this();
        }

        public UserProto$User getBlockedUsers(int i) {
            return ((C8220p0) this.instance).getBlockedUsers(i);
        }

        public int getBlockedUsersCount() {
            return ((C8220p0) this.instance).getBlockedUsersCount();
        }

        public List<UserProto$User> getBlockedUsersList() {
            return Collections.unmodifiableList(((C8220p0) this.instance).getBlockedUsersList());
        }

        public C8179n0 getError() {
            return ((C8220p0) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8220p0) this.instance).hasError();
        }

        private C8221a() {
            super(C8220p0.f20804h);
        }
    }

    static {
        f20804h.makeImmutable();
    }

    private C8220p0() {
    }

    public static C8221a newBuilder() {
        return (C8221a) f20804h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8220p0();
            case 2:
                return f20804h;
            case 3:
                this.f20807f.makeImmutable();
                return null;
            case 4:
                return new C8221a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8220p0 p0Var = (C8220p0) obj2;
                this.f20807f = visitor.visitList(this.f20807f, p0Var.f20807f);
                this.f20808g = (C8179n0) visitor.visitMessage(this.f20808g, p0Var.f20808g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20806e |= p0Var.f20806e;
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
                                if (!this.f20807f.isModifiable()) {
                                    this.f20807f = GeneratedMessageLite.mutableCopy(this.f20807f);
                                }
                                this.f20807f.add(codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite));
                            } else if (readTag == 1010) {
                                Builder builder = this.f20808g != null ? (C8180a) this.f20808g.toBuilder() : null;
                                this.f20808g = (C8179n0) codedInputStream.readMessage(C8179n0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20808g);
                                    this.f20808g = (C8179n0) builder.buildPartial();
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
                if (f20805i == null) {
                    synchronized (C8220p0.class) {
                        if (f20805i == null) {
                            f20805i = new DefaultInstanceBasedParser(f20804h);
                        }
                    }
                }
                return f20805i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20804h;
    }

    public UserProto$User getBlockedUsers(int i) {
        return (UserProto$User) this.f20807f.get(i);
    }

    public int getBlockedUsersCount() {
        return this.f20807f.size();
    }

    public List<UserProto$User> getBlockedUsersList() {
        return this.f20807f;
    }

    public C8179n0 getError() {
        C8179n0 n0Var = this.f20808g;
        return n0Var == null ? C8179n0.getDefaultInstance() : n0Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20807f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20807f.get(i3));
        }
        if (this.f20808g != null) {
            i2 += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20808g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20807f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20807f.get(i));
        }
        if (this.f20808g != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
