package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.FieldMask;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.services.k3 */
public final class C8141k3 extends GeneratedMessageLite<C8141k3, C8142a> implements ZenlyProto$MeUpdateRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8141k3 f20626g = new C8141k3();

    /* renamed from: h */
    private static volatile Parser<C8141k3> f20627h;

    /* renamed from: e */
    private UserProto$User f20628e;

    /* renamed from: f */
    private FieldMask f20629f;

    /* renamed from: co.znly.models.services.k3$a */
    public static final class C8142a extends Builder<C8141k3, C8142a> implements ZenlyProto$MeUpdateRequestOrBuilder {
        /* synthetic */ C8142a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8142a mo22158a(UserProto$User userProto$User) {
            copyOnWrite();
            ((C8141k3) this.instance).m19228a(userProto$User);
            return this;
        }

        public FieldMask getMask() {
            return ((C8141k3) this.instance).getMask();
        }

        public UserProto$User getUser() {
            return ((C8141k3) this.instance).getUser();
        }

        public boolean hasMask() {
            return ((C8141k3) this.instance).hasMask();
        }

        public boolean hasUser() {
            return ((C8141k3) this.instance).hasUser();
        }

        private C8142a() {
            super(C8141k3.f20626g);
        }

        /* renamed from: a */
        public C8142a mo22157a(FieldMask fieldMask) {
            copyOnWrite();
            ((C8141k3) this.instance).m19227a(fieldMask);
            return this;
        }

        /* renamed from: a */
        public C8142a mo22156a(FieldMask.Builder builder) {
            copyOnWrite();
            ((C8141k3) this.instance).m19226a(builder);
            return this;
        }
    }

    static {
        f20626g.makeImmutable();
    }

    private C8141k3() {
    }

    public static C8142a newBuilder() {
        return (C8142a) f20626g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8141k3();
            case 2:
                return f20626g;
            case 3:
                return null;
            case 4:
                return new C8142a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8141k3 k3Var = (C8141k3) obj2;
                this.f20628e = (UserProto$User) visitor.visitMessage(this.f20628e, k3Var.f20628e);
                this.f20629f = (FieldMask) visitor.visitMessage(this.f20629f, k3Var.f20629f);
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
                                Builder builder = this.f20628e != null ? (C6925a) this.f20628e.toBuilder() : null;
                                this.f20628e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20628e);
                                    this.f20628e = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f20629f != null ? (FieldMask.Builder) this.f20629f.toBuilder() : null;
                                this.f20629f = (FieldMask) codedInputStream.readMessage(FieldMask.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20629f);
                                    this.f20629f = (FieldMask) builder2.buildPartial();
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
                if (f20627h == null) {
                    synchronized (C8141k3.class) {
                        if (f20627h == null) {
                            f20627h = new DefaultInstanceBasedParser(f20626g);
                        }
                    }
                }
                return f20627h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20626g;
    }

    public FieldMask getMask() {
        FieldMask fieldMask = this.f20629f;
        return fieldMask == null ? FieldMask.getDefaultInstance() : fieldMask;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20628e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getUser());
        }
        if (this.f20629f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getMask());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getUser() {
        UserProto$User userProto$User = this.f20628e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasMask() {
        return this.f20629f != null;
    }

    public boolean hasUser() {
        return this.f20628e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20628e != null) {
            codedOutputStream.writeMessage(1, getUser());
        }
        if (this.f20629f != null) {
            codedOutputStream.writeMessage(2, getMask());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19228a(UserProto$User userProto$User) {
        if (userProto$User != null) {
            this.f20628e = userProto$User;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19227a(FieldMask fieldMask) {
        if (fieldMask != null) {
            this.f20629f = fieldMask;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19226a(FieldMask.Builder builder) {
        this.f20629f = (FieldMask) builder.build();
    }
}
