package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7339i.C7340a;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.core.k2 */
public final class C7138k2 extends GeneratedMessageLite<C7138k2, C7139a> implements TypesProto$RecentItemOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7138k2 f17676g = new C7138k2();

    /* renamed from: h */
    private static volatile Parser<C7138k2> f17677h;

    /* renamed from: e */
    private UserProto$User f17678e;

    /* renamed from: f */
    private C7339i f17679f;

    /* renamed from: co.znly.models.core.k2$a */
    public static final class C7139a extends Builder<C7138k2, C7139a> implements TypesProto$RecentItemOrBuilder {
        /* synthetic */ C7139a(C7253x1 x1Var) {
            this();
        }

        public C7339i getContact() {
            return ((C7138k2) this.instance).getContact();
        }

        public UserProto$User getUser() {
            return ((C7138k2) this.instance).getUser();
        }

        public boolean hasContact() {
            return ((C7138k2) this.instance).hasContact();
        }

        public boolean hasUser() {
            return ((C7138k2) this.instance).hasUser();
        }

        private C7139a() {
            super(C7138k2.f17676g);
        }
    }

    static {
        f17676g.makeImmutable();
    }

    private C7138k2() {
    }

    public static Parser<C7138k2> parser() {
        return f17676g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7138k2();
            case 2:
                return f17676g;
            case 3:
                return null;
            case 4:
                return new C7139a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7138k2 k2Var = (C7138k2) obj2;
                this.f17678e = (UserProto$User) visitor.visitMessage(this.f17678e, k2Var.f17678e);
                this.f17679f = (C7339i) visitor.visitMessage(this.f17679f, k2Var.f17679f);
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
                                Builder builder = this.f17678e != null ? (C6925a) this.f17678e.toBuilder() : null;
                                this.f17678e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17678e);
                                    this.f17678e = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f17679f != null ? (C7340a) this.f17679f.toBuilder() : null;
                                this.f17679f = (C7339i) codedInputStream.readMessage(C7339i.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17679f);
                                    this.f17679f = (C7339i) builder2.buildPartial();
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
                if (f17677h == null) {
                    synchronized (C7138k2.class) {
                        if (f17677h == null) {
                            f17677h = new DefaultInstanceBasedParser(f17676g);
                        }
                    }
                }
                return f17677h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17676g;
    }

    public C7339i getContact() {
        C7339i iVar = this.f17679f;
        return iVar == null ? C7339i.getDefaultInstance() : iVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17678e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getUser());
        }
        if (this.f17679f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getContact());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getUser() {
        UserProto$User userProto$User = this.f17678e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasContact() {
        return this.f17679f != null;
    }

    public boolean hasUser() {
        return this.f17678e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17678e != null) {
            codedOutputStream.writeMessage(1, getUser());
        }
        if (this.f17679f != null) {
            codedOutputStream.writeMessage(2, getContact());
        }
    }
}
