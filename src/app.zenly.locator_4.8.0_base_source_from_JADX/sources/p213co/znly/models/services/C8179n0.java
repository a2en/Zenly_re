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
import p213co.znly.models.services.C8026d2.C8027a;

/* renamed from: co.znly.models.services.n0 */
public final class C8179n0 extends GeneratedMessageLite<C8179n0, C8180a> implements ZenlyProto$BlockedUsersErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8179n0 f20702f = new C8179n0();

    /* renamed from: g */
    private static volatile Parser<C8179n0> f20703g;

    /* renamed from: e */
    private C8026d2 f20704e;

    /* renamed from: co.znly.models.services.n0$a */
    public static final class C8180a extends Builder<C8179n0, C8180a> implements ZenlyProto$BlockedUsersErrorOrBuilder {
        /* synthetic */ C8180a(C8104i0 i0Var) {
            this();
        }

        public C8026d2 getError() {
            return ((C8179n0) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8179n0) this.instance).hasError();
        }

        private C8180a() {
            super(C8179n0.f20702f);
        }
    }

    static {
        f20702f.makeImmutable();
    }

    private C8179n0() {
    }

    public static C8179n0 getDefaultInstance() {
        return f20702f;
    }

    public static Parser<C8179n0> parser() {
        return f20702f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8179n0();
            case 2:
                return f20702f;
            case 3:
                return null;
            case 4:
                return new C8180a(null);
            case 5:
                this.f20704e = (C8026d2) ((Visitor) obj).visitMessage(this.f20704e, ((C8179n0) obj2).f20704e);
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
                                Builder builder = this.f20704e != null ? (C8027a) this.f20704e.toBuilder() : null;
                                this.f20704e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20704e);
                                    this.f20704e = (C8026d2) builder.buildPartial();
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
                if (f20703g == null) {
                    synchronized (C8179n0.class) {
                        if (f20703g == null) {
                            f20703g = new DefaultInstanceBasedParser(f20702f);
                        }
                    }
                }
                return f20703g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20702f;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f20704e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20704e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20704e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20704e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
    }
}
