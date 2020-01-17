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
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.core.j0 */
public final class C7127j0 extends GeneratedMessageLite<C7127j0, C7128a> implements CoreRecommendationsProto$PotentialMatchOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7127j0 f17654f = new C7127j0();

    /* renamed from: g */
    private static volatile Parser<C7127j0> f17655g;

    /* renamed from: e */
    private UserProto$User f17656e;

    /* renamed from: co.znly.models.core.j0$a */
    public static final class C7128a extends Builder<C7127j0, C7128a> implements CoreRecommendationsProto$PotentialMatchOrBuilder {
        /* synthetic */ C7128a(C7121i0 i0Var) {
            this();
        }

        public UserProto$User getFriend() {
            return ((C7127j0) this.instance).getFriend();
        }

        public boolean hasFriend() {
            return ((C7127j0) this.instance).hasFriend();
        }

        private C7128a() {
            super(C7127j0.f17654f);
        }
    }

    static {
        f17654f.makeImmutable();
    }

    private C7127j0() {
    }

    public static Parser<C7127j0> parser() {
        return f17654f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7121i0.f17644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7127j0();
            case 2:
                return f17654f;
            case 3:
                return null;
            case 4:
                return new C7128a(null);
            case 5:
                this.f17656e = (UserProto$User) ((Visitor) obj).visitMessage(this.f17656e, ((C7127j0) obj2).f17656e);
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
                                Builder builder = this.f17656e != null ? (C6925a) this.f17656e.toBuilder() : null;
                                this.f17656e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17656e);
                                    this.f17656e = (UserProto$User) builder.buildPartial();
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
                if (f17655g == null) {
                    synchronized (C7127j0.class) {
                        if (f17655g == null) {
                            f17655g = new DefaultInstanceBasedParser(f17654f);
                        }
                    }
                }
                return f17655g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17654f;
    }

    public UserProto$User getFriend() {
        UserProto$User userProto$User = this.f17656e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17656e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getFriend());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasFriend() {
        return this.f17656e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17656e != null) {
            codedOutputStream.writeMessage(1, getFriend());
        }
    }
}
