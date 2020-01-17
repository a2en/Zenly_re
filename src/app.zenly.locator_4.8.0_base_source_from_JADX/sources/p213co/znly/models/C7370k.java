package p213co.znly.models;

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
import p213co.znly.models.C7339i.C7340a;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.k */
public final class C7370k extends GeneratedMessageLite<C7370k, C7371a> implements ContactProto$ContactWithUserOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7370k f18370i = new C7370k();

    /* renamed from: j */
    private static volatile Parser<C7370k> f18371j;

    /* renamed from: e */
    private int f18372e;

    /* renamed from: f */
    private C7339i f18373f;

    /* renamed from: g */
    private UserProto$User f18374g;

    /* renamed from: h */
    private ProtobufList<UserProto$User> f18375h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.k$a */
    public static final class C7371a extends Builder<C7370k, C7371a> implements ContactProto$ContactWithUserOrBuilder {
        /* synthetic */ C7371a(C7331h hVar) {
            this();
        }

        /* renamed from: a */
        public C7371a mo19261a(C7339i iVar) {
            copyOnWrite();
            ((C7370k) this.instance).m18063a(iVar);
            return this;
        }

        public C7339i getContact() {
            return ((C7370k) this.instance).getContact();
        }

        public UserProto$User getUser() {
            return ((C7370k) this.instance).getUser();
        }

        public UserProto$User getUsers(int i) {
            return ((C7370k) this.instance).getUsers(i);
        }

        public int getUsersCount() {
            return ((C7370k) this.instance).getUsersCount();
        }

        public List<UserProto$User> getUsersList() {
            return Collections.unmodifiableList(((C7370k) this.instance).getUsersList());
        }

        public boolean hasContact() {
            return ((C7370k) this.instance).hasContact();
        }

        public boolean hasUser() {
            return ((C7370k) this.instance).hasUser();
        }

        private C7371a() {
            super(C7370k.f18370i);
        }

        /* renamed from: a */
        public C7371a mo19260a(UserProto$User userProto$User) {
            copyOnWrite();
            ((C7370k) this.instance).m18062a(userProto$User);
            return this;
        }
    }

    static {
        f18370i.makeImmutable();
    }

    private C7370k() {
    }

    public static C7370k getDefaultInstance() {
        return f18370i;
    }

    public static C7371a newBuilder() {
        return (C7371a) f18370i.toBuilder();
    }

    public static Parser<C7370k> parser() {
        return f18370i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7331h.f18216a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7370k();
            case 2:
                return f18370i;
            case 3:
                this.f18375h.makeImmutable();
                return null;
            case 4:
                return new C7371a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7370k kVar = (C7370k) obj2;
                this.f18373f = (C7339i) visitor.visitMessage(this.f18373f, kVar.f18373f);
                this.f18374g = (UserProto$User) visitor.visitMessage(this.f18374g, kVar.f18374g);
                this.f18375h = visitor.visitList(this.f18375h, kVar.f18375h);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18372e |= kVar.f18372e;
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
                                Builder builder = this.f18373f != null ? (C7340a) this.f18373f.toBuilder() : null;
                                this.f18373f = (C7339i) codedInputStream.readMessage(C7339i.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18373f);
                                    this.f18373f = (C7339i) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f18374g != null ? (C6925a) this.f18374g.toBuilder() : null;
                                this.f18374g = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f18374g);
                                    this.f18374g = (UserProto$User) builder2.buildPartial();
                                }
                            } else if (readTag == 26) {
                                if (!this.f18375h.isModifiable()) {
                                    this.f18375h = GeneratedMessageLite.mutableCopy(this.f18375h);
                                }
                                this.f18375h.add(codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite));
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
                if (f18371j == null) {
                    synchronized (C7370k.class) {
                        if (f18371j == null) {
                            f18371j = new DefaultInstanceBasedParser(f18370i);
                        }
                    }
                }
                return f18371j;
            default:
                throw new UnsupportedOperationException();
        }
        return f18370i;
    }

    public C7339i getContact() {
        C7339i iVar = this.f18373f;
        return iVar == null ? C7339i.getDefaultInstance() : iVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.f18373f != null ? CodedOutputStream.computeMessageSize(1, getContact()) + 0 : 0;
        if (this.f18374g != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, getUser());
        }
        for (int i2 = 0; i2 < this.f18375h.size(); i2++) {
            computeMessageSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f18375h.get(i2));
        }
        this.memoizedSerializedSize = computeMessageSize;
        return computeMessageSize;
    }

    public UserProto$User getUser() {
        UserProto$User userProto$User = this.f18374g;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public UserProto$User getUsers(int i) {
        return (UserProto$User) this.f18375h.get(i);
    }

    public int getUsersCount() {
        return this.f18375h.size();
    }

    public List<UserProto$User> getUsersList() {
        return this.f18375h;
    }

    public boolean hasContact() {
        return this.f18373f != null;
    }

    public boolean hasUser() {
        return this.f18374g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f18373f != null) {
            codedOutputStream.writeMessage(1, getContact());
        }
        if (this.f18374g != null) {
            codedOutputStream.writeMessage(2, getUser());
        }
        for (int i = 0; i < this.f18375h.size(); i++) {
            codedOutputStream.writeMessage(3, (MessageLite) this.f18375h.get(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18063a(C7339i iVar) {
        if (iVar != null) {
            this.f18373f = iVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18062a(UserProto$User userProto$User) {
        if (userProto$User != null) {
            this.f18374g = userProto$User;
            return;
        }
        throw new NullPointerException();
    }
}
