package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.services.usermonitor.C8316b;

/* renamed from: co.znly.models.core.o0 */
public final class C7178o0 extends GeneratedMessageLite<C7178o0, C7179a> implements CoreUserMonitorProto$UserMonitoringRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7178o0 f17784g = new C7178o0();

    /* renamed from: h */
    private static volatile Parser<C7178o0> f17785h;

    /* renamed from: e */
    private String f17786e = "";

    /* renamed from: f */
    private int f17787f;

    /* renamed from: co.znly.models.core.o0$a */
    public static final class C7179a extends Builder<C7178o0, C7179a> implements CoreUserMonitorProto$UserMonitoringRequestOrBuilder {
        /* synthetic */ C7179a(C7158m0 m0Var) {
            this();
        }

        /* renamed from: a */
        public C7179a mo19173a(String str) {
            copyOnWrite();
            ((C7178o0) this.instance).m17896a(str);
            return this;
        }

        public C8316b getEventType() {
            return ((C7178o0) this.instance).getEventType();
        }

        public int getEventTypeValue() {
            return ((C7178o0) this.instance).getEventTypeValue();
        }

        public String getWatchedUserUuid() {
            return ((C7178o0) this.instance).getWatchedUserUuid();
        }

        public ByteString getWatchedUserUuidBytes() {
            return ((C7178o0) this.instance).getWatchedUserUuidBytes();
        }

        private C7179a() {
            super(C7178o0.f17784g);
        }

        /* renamed from: a */
        public C7179a mo19172a(C8316b bVar) {
            copyOnWrite();
            ((C7178o0) this.instance).m17895a(bVar);
            return this;
        }
    }

    static {
        f17784g.makeImmutable();
    }

    private C7178o0() {
    }

    public static C7179a newBuilder() {
        return (C7179a) f17784g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7158m0.f17731a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7178o0();
            case 2:
                return f17784g;
            case 3:
                return null;
            case 4:
                return new C7179a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7178o0 o0Var = (C7178o0) obj2;
                this.f17786e = visitor.visitString(!this.f17786e.isEmpty(), this.f17786e, !o0Var.f17786e.isEmpty(), o0Var.f17786e);
                boolean z2 = this.f17787f != 0;
                int i = this.f17787f;
                if (o0Var.f17787f != 0) {
                    z = true;
                }
                this.f17787f = visitor.visitInt(z2, i, z, o0Var.f17787f);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f17786e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f17787f = codedInputStream.readEnum();
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
                if (f17785h == null) {
                    synchronized (C7178o0.class) {
                        if (f17785h == null) {
                            f17785h = new DefaultInstanceBasedParser(f17784g);
                        }
                    }
                }
                return f17785h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17784g;
    }

    public C8316b getEventType() {
        C8316b a = C8316b.m19407a(this.f17787f);
        return a == null ? C8316b.UNRECOGNIZED : a;
    }

    public int getEventTypeValue() {
        return this.f17787f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17786e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getWatchedUserUuid());
        }
        if (this.f17787f != C8316b.Unknown.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f17787f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getWatchedUserUuid() {
        return this.f17786e;
    }

    public ByteString getWatchedUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f17786e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17786e.isEmpty()) {
            codedOutputStream.writeString(1, getWatchedUserUuid());
        }
        if (this.f17787f != C8316b.Unknown.getNumber()) {
            codedOutputStream.writeEnum(2, this.f17787f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17896a(String str) {
        if (str != null) {
            this.f17786e = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17895a(C8316b bVar) {
        if (bVar != null) {
            this.f17787f = bVar.getNumber();
            return;
        }
        throw new NullPointerException();
    }
}
