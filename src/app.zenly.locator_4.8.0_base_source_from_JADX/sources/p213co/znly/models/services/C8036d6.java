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
import p213co.znly.models.C7272d0;
import p213co.znly.models.C7272d0.C7273a;

/* renamed from: co.znly.models.services.d6 */
public final class C8036d6 extends GeneratedMessageLite<C8036d6, C8037a> implements ZenlyProto$WeatherRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8036d6 f20392f = new C8036d6();

    /* renamed from: g */
    private static volatile Parser<C8036d6> f20393g;

    /* renamed from: e */
    private C7272d0 f20394e;

    /* renamed from: co.znly.models.services.d6$a */
    public static final class C8037a extends Builder<C8036d6, C8037a> implements ZenlyProto$WeatherRequestOrBuilder {
        private C8037a() {
            super(C8036d6.f20392f);
        }

        /* synthetic */ C8037a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8037a mo22062a(C7272d0 d0Var) {
            copyOnWrite();
            ((C8036d6) this.instance).m19098a(d0Var);
            return this;
        }

        public C7272d0 getBox() {
            return ((C8036d6) this.instance).getBox();
        }

        public boolean hasBox() {
            return ((C8036d6) this.instance).hasBox();
        }
    }

    static {
        f20392f.makeImmutable();
    }

    private C8036d6() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19098a(C7272d0 d0Var) {
        if (d0Var != null) {
            this.f20394e = d0Var;
            return;
        }
        throw new NullPointerException();
    }

    public static C8037a newBuilder() {
        return (C8037a) f20392f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8036d6();
            case 2:
                return f20392f;
            case 3:
                return null;
            case 4:
                return new C8037a(null);
            case 5:
                this.f20394e = (C7272d0) ((Visitor) obj).visitMessage(this.f20394e, ((C8036d6) obj2).f20394e);
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
                                Builder builder = this.f20394e != null ? (C7273a) this.f20394e.toBuilder() : null;
                                this.f20394e = (C7272d0) codedInputStream.readMessage(C7272d0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20394e);
                                    this.f20394e = (C7272d0) builder.buildPartial();
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
                if (f20393g == null) {
                    synchronized (C8036d6.class) {
                        if (f20393g == null) {
                            f20393g = new DefaultInstanceBasedParser(f20392f);
                        }
                    }
                }
                return f20393g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20392f;
    }

    public C7272d0 getBox() {
        C7272d0 d0Var = this.f20394e;
        return d0Var == null ? C7272d0.getDefaultInstance() : d0Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20394e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getBox());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasBox() {
        return this.f20394e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20394e != null) {
            codedOutputStream.writeMessage(1, getBox());
        }
    }
}
