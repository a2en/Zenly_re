package p213co.znly.models.services;

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

/* renamed from: co.znly.models.services.k4 */
public final class C8143k4 extends GeneratedMessageLite<C8143k4, C8144a> implements ZenlyProto$RequestMediaRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8143k4 f20630g = new C8143k4();

    /* renamed from: h */
    private static volatile Parser<C8143k4> f20631h;

    /* renamed from: e */
    private String f20632e = "";

    /* renamed from: f */
    private long f20633f;

    /* renamed from: co.znly.models.services.k4$a */
    public static final class C8144a extends Builder<C8143k4, C8144a> implements ZenlyProto$RequestMediaRequestOrBuilder {
        /* synthetic */ C8144a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8144a mo22160a(String str) {
            copyOnWrite();
            ((C8143k4) this.instance).m19239a(str);
            return this;
        }

        public long getDuration() {
            return ((C8143k4) this.instance).getDuration();
        }

        public String getTargetUuid() {
            return ((C8143k4) this.instance).getTargetUuid();
        }

        public ByteString getTargetUuidBytes() {
            return ((C8143k4) this.instance).getTargetUuidBytes();
        }

        private C8144a() {
            super(C8143k4.f20630g);
        }

        /* renamed from: a */
        public C8144a mo22159a(long j) {
            copyOnWrite();
            ((C8143k4) this.instance).m19236a(j);
            return this;
        }
    }

    static {
        f20630g.makeImmutable();
    }

    private C8143k4() {
    }

    public static C8144a newBuilder() {
        return (C8144a) f20630g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8143k4();
            case 2:
                return f20630g;
            case 3:
                return null;
            case 4:
                return new C8144a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8143k4 k4Var = (C8143k4) obj2;
                this.f20632e = visitor.visitString(!this.f20632e.isEmpty(), this.f20632e, !k4Var.f20632e.isEmpty(), k4Var.f20632e);
                this.f20633f = visitor.visitLong(this.f20633f != 0, this.f20633f, k4Var.f20633f != 0, k4Var.f20633f);
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
                                this.f20632e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f20633f = codedInputStream.readInt64();
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
                if (f20631h == null) {
                    synchronized (C8143k4.class) {
                        if (f20631h == null) {
                            f20631h = new DefaultInstanceBasedParser(f20630g);
                        }
                    }
                }
                return f20631h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20630g;
    }

    public long getDuration() {
        return this.f20633f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20632e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getTargetUuid());
        }
        long j = this.f20633f;
        if (j != 0) {
            i2 += CodedOutputStream.computeInt64Size(2, j);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getTargetUuid() {
        return this.f20632e;
    }

    public ByteString getTargetUuidBytes() {
        return ByteString.copyFromUtf8(this.f20632e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20632e.isEmpty()) {
            codedOutputStream.writeString(1, getTargetUuid());
        }
        long j = this.f20633f;
        if (j != 0) {
            codedOutputStream.writeInt64(2, j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19239a(String str) {
        if (str != null) {
            this.f20632e = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19236a(long j) {
        this.f20633f = j;
    }
}
