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
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.core.u0 */
public final class C7226u0 extends GeneratedMessageLite<C7226u0, C7227a> implements CoreUserProto$DescendantOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C7226u0 f17922k = new C7226u0();

    /* renamed from: l */
    private static volatile Parser<C7226u0> f17923l;

    /* renamed from: e */
    private String f17924e;

    /* renamed from: f */
    private Timestamp f17925f;

    /* renamed from: g */
    private String f17926g;

    /* renamed from: h */
    private String f17927h;

    /* renamed from: i */
    private int f17928i;

    /* renamed from: j */
    private Timestamp f17929j;

    /* renamed from: co.znly.models.core.u0$a */
    public static final class C7227a extends Builder<C7226u0, C7227a> implements CoreUserProto$DescendantOrBuilder {
        /* synthetic */ C7227a(C7203r0 r0Var) {
            this();
        }

        public String getAvatarUrlPrefix() {
            return ((C7226u0) this.instance).getAvatarUrlPrefix();
        }

        public ByteString getAvatarUrlPrefixBytes() {
            return ((C7226u0) this.instance).getAvatarUrlPrefixBytes();
        }

        public int getAvatarVersion() {
            return ((C7226u0) this.instance).getAvatarVersion();
        }

        public Timestamp getCreatedAt() {
            return ((C7226u0) this.instance).getCreatedAt();
        }

        public Timestamp getDescendantSince() {
            return ((C7226u0) this.instance).getDescendantSince();
        }

        public String getName() {
            return ((C7226u0) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((C7226u0) this.instance).getNameBytes();
        }

        public String getUuid() {
            return ((C7226u0) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C7226u0) this.instance).getUuidBytes();
        }

        public boolean hasCreatedAt() {
            return ((C7226u0) this.instance).hasCreatedAt();
        }

        public boolean hasDescendantSince() {
            return ((C7226u0) this.instance).hasDescendantSince();
        }

        private C7227a() {
            super(C7226u0.f17922k);
        }
    }

    static {
        f17922k.makeImmutable();
    }

    private C7226u0() {
        String str = "";
        this.f17924e = str;
        this.f17926g = str;
        this.f17927h = str;
    }

    public static Parser<C7226u0> parser() {
        return f17922k.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7203r0.f17852a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7226u0();
            case 2:
                return f17922k;
            case 3:
                return null;
            case 4:
                return new C7227a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7226u0 u0Var = (C7226u0) obj2;
                this.f17924e = visitor.visitString(!this.f17924e.isEmpty(), this.f17924e, !u0Var.f17924e.isEmpty(), u0Var.f17924e);
                this.f17925f = (Timestamp) visitor.visitMessage(this.f17925f, u0Var.f17925f);
                this.f17926g = visitor.visitString(!this.f17926g.isEmpty(), this.f17926g, !u0Var.f17926g.isEmpty(), u0Var.f17926g);
                this.f17927h = visitor.visitString(!this.f17927h.isEmpty(), this.f17927h, !u0Var.f17927h.isEmpty(), u0Var.f17927h);
                boolean z2 = this.f17928i != 0;
                int i = this.f17928i;
                if (u0Var.f17928i != 0) {
                    z = true;
                }
                this.f17928i = visitor.visitInt(z2, i, z, u0Var.f17928i);
                this.f17929j = (Timestamp) visitor.visitMessage(this.f17929j, u0Var.f17929j);
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
                                this.f17924e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                Builder builder = this.f17925f != null ? (Timestamp.Builder) this.f17925f.toBuilder() : null;
                                this.f17925f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17925f);
                                    this.f17925f = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 26) {
                                this.f17926g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.f17927h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 40) {
                                this.f17928i = codedInputStream.readInt32();
                            } else if (readTag == 50) {
                                Builder builder2 = this.f17929j != null ? (Timestamp.Builder) this.f17929j.toBuilder() : null;
                                this.f17929j = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17929j);
                                    this.f17929j = (Timestamp) builder2.buildPartial();
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
                if (f17923l == null) {
                    synchronized (C7226u0.class) {
                        if (f17923l == null) {
                            f17923l = new DefaultInstanceBasedParser(f17922k);
                        }
                    }
                }
                return f17923l;
            default:
                throw new UnsupportedOperationException();
        }
        return f17922k;
    }

    public String getAvatarUrlPrefix() {
        return this.f17927h;
    }

    public ByteString getAvatarUrlPrefixBytes() {
        return ByteString.copyFromUtf8(this.f17927h);
    }

    public int getAvatarVersion() {
        return this.f17928i;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f17925f;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getDescendantSince() {
        Timestamp timestamp = this.f17929j;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getName() {
        return this.f17926g;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.f17926g);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17924e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUuid());
        }
        if (this.f17925f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getCreatedAt());
        }
        if (!this.f17926g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getName());
        }
        if (!this.f17927h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getAvatarUrlPrefix());
        }
        int i3 = this.f17928i;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(5, i3);
        }
        if (this.f17929j != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getDescendantSince());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUuid() {
        return this.f17924e;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f17924e);
    }

    public boolean hasCreatedAt() {
        return this.f17925f != null;
    }

    public boolean hasDescendantSince() {
        return this.f17929j != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17924e.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (this.f17925f != null) {
            codedOutputStream.writeMessage(2, getCreatedAt());
        }
        if (!this.f17926g.isEmpty()) {
            codedOutputStream.writeString(3, getName());
        }
        if (!this.f17927h.isEmpty()) {
            codedOutputStream.writeString(4, getAvatarUrlPrefix());
        }
        int i = this.f17928i;
        if (i != 0) {
            codedOutputStream.writeInt32(5, i);
        }
        if (this.f17929j != null) {
            codedOutputStream.writeMessage(6, getDescendantSince());
        }
    }
}
