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
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.services.v0 */
public final class C8332v0 extends GeneratedMessageLite<C8332v0, C8333a> implements ZenlyProto$ChatConversationMuteRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8332v0 f21104g = new C8332v0();

    /* renamed from: h */
    private static volatile Parser<C8332v0> f21105h;

    /* renamed from: e */
    private String f21106e = "";

    /* renamed from: f */
    private Timestamp f21107f;

    /* renamed from: co.znly.models.services.v0$a */
    public static final class C8333a extends Builder<C8332v0, C8333a> implements ZenlyProto$ChatConversationMuteRequestOrBuilder {
        private C8333a() {
            super(C8332v0.f21104g);
        }

        /* synthetic */ C8333a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8333a mo22329a(Timestamp.Builder builder) {
            copyOnWrite();
            ((C8332v0) this.instance).m19414a(builder);
            return this;
        }

        /* renamed from: a */
        public C8333a mo22330a(String str) {
            copyOnWrite();
            ((C8332v0) this.instance).m19417a(str);
            return this;
        }

        public String getConversationUuid() {
            return ((C8332v0) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C8332v0) this.instance).getConversationUuidBytes();
        }

        public Timestamp getDuration() {
            return ((C8332v0) this.instance).getDuration();
        }

        public boolean hasDuration() {
            return ((C8332v0) this.instance).hasDuration();
        }
    }

    static {
        f21104g.makeImmutable();
    }

    private C8332v0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19414a(Timestamp.Builder builder) {
        this.f21107f = (Timestamp) builder.build();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19417a(String str) {
        if (str != null) {
            this.f21106e = str;
            return;
        }
        throw new NullPointerException();
    }

    public static C8333a newBuilder() {
        return (C8333a) f21104g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8332v0();
            case 2:
                return f21104g;
            case 3:
                return null;
            case 4:
                return new C8333a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8332v0 v0Var = (C8332v0) obj2;
                this.f21106e = visitor.visitString(!this.f21106e.isEmpty(), this.f21106e, true ^ v0Var.f21106e.isEmpty(), v0Var.f21106e);
                this.f21107f = (Timestamp) visitor.visitMessage(this.f21107f, v0Var.f21107f);
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
                                this.f21106e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                Builder builder = this.f21107f != null ? (Timestamp.Builder) this.f21107f.toBuilder() : null;
                                this.f21107f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21107f);
                                    this.f21107f = (Timestamp) builder.buildPartial();
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
                if (f21105h == null) {
                    synchronized (C8332v0.class) {
                        if (f21105h == null) {
                            f21105h = new DefaultInstanceBasedParser(f21104g);
                        }
                    }
                }
                return f21105h;
            default:
                throw new UnsupportedOperationException();
        }
        return f21104g;
    }

    public String getConversationUuid() {
        return this.f21106e;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f21106e);
    }

    public Timestamp getDuration() {
        Timestamp timestamp = this.f21107f;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f21106e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getConversationUuid());
        }
        if (this.f21107f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getDuration());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasDuration() {
        return this.f21107f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f21106e.isEmpty()) {
            codedOutputStream.writeString(1, getConversationUuid());
        }
        if (this.f21107f != null) {
            codedOutputStream.writeMessage(2, getDuration());
        }
    }
}
