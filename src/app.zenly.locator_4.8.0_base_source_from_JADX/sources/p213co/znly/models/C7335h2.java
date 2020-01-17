package p213co.znly.models;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
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
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.h2 */
public final class C7335h2 extends GeneratedMessageLite<C7335h2, C7336a> implements PurgatoryProto$purgatory_save$FriendShipV1OrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final C7335h2 f18221o = new C7335h2();

    /* renamed from: p */
    private static volatile Parser<C7335h2> f18222p;

    /* renamed from: e */
    private int f18223e;

    /* renamed from: f */
    private String f18224f;

    /* renamed from: g */
    private Timestamp f18225g;

    /* renamed from: h */
    private Timestamp f18226h;

    /* renamed from: i */
    private int f18227i;

    /* renamed from: j */
    private int f18228j;

    /* renamed from: k */
    private Timestamp f18229k;

    /* renamed from: l */
    private Timestamp f18230l;

    /* renamed from: m */
    private String f18231m;

    /* renamed from: n */
    private ProtobufList<TrackingContextProto$TrackingContext> f18232n = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.h2$a */
    public static final class C7336a extends Builder<C7335h2, C7336a> implements PurgatoryProto$purgatory_save$FriendShipV1OrBuilder {
        /* synthetic */ C7336a(C7324g2 g2Var) {
            this();
        }

        public Timestamp getCreatedAt() {
            return ((C7335h2) this.instance).getCreatedAt();
        }

        public String getFriendRequestUuid() {
            return ((C7335h2) this.instance).getFriendRequestUuid();
        }

        public ByteString getFriendRequestUuidBytes() {
            return ((C7335h2) this.instance).getFriendRequestUuidBytes();
        }

        public C7492v2 getGhostedType() {
            return ((C7335h2) this.instance).getGhostedType();
        }

        public int getGhostedTypeValue() {
            return ((C7335h2) this.instance).getGhostedTypeValue();
        }

        public Timestamp getGhostedUntil() {
            return ((C7335h2) this.instance).getGhostedUntil();
        }

        public TrackingContextProto$TrackingContext getLastTrackingContexts(int i) {
            return ((C7335h2) this.instance).getLastTrackingContexts(i);
        }

        public int getLastTrackingContextsCount() {
            return ((C7335h2) this.instance).getLastTrackingContextsCount();
        }

        public List<TrackingContextProto$TrackingContext> getLastTrackingContextsList() {
            return Collections.unmodifiableList(((C7335h2) this.instance).getLastTrackingContextsList());
        }

        public C7492v2 getRemoteGhostType() {
            return ((C7335h2) this.instance).getRemoteGhostType();
        }

        public int getRemoteGhostTypeValue() {
            return ((C7335h2) this.instance).getRemoteGhostTypeValue();
        }

        public Timestamp getRemoteGhostUntil() {
            return ((C7335h2) this.instance).getRemoteGhostUntil();
        }

        public Timestamp getUpdatedAt() {
            return ((C7335h2) this.instance).getUpdatedAt();
        }

        public String getUuid() {
            return ((C7335h2) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C7335h2) this.instance).getUuidBytes();
        }

        public boolean hasCreatedAt() {
            return ((C7335h2) this.instance).hasCreatedAt();
        }

        public boolean hasGhostedUntil() {
            return ((C7335h2) this.instance).hasGhostedUntil();
        }

        public boolean hasRemoteGhostUntil() {
            return ((C7335h2) this.instance).hasRemoteGhostUntil();
        }

        public boolean hasUpdatedAt() {
            return ((C7335h2) this.instance).hasUpdatedAt();
        }

        private C7336a() {
            super(C7335h2.f18221o);
        }
    }

    static {
        f18221o.makeImmutable();
    }

    private C7335h2() {
        String str = "";
        this.f18224f = str;
        this.f18231m = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7324g2.f18195a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7335h2();
            case 2:
                return f18221o;
            case 3:
                this.f18232n.makeImmutable();
                return null;
            case 4:
                return new C7336a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7335h2 h2Var = (C7335h2) obj2;
                this.f18224f = visitor.visitString(!this.f18224f.isEmpty(), this.f18224f, !h2Var.f18224f.isEmpty(), h2Var.f18224f);
                this.f18225g = (Timestamp) visitor.visitMessage(this.f18225g, h2Var.f18225g);
                this.f18226h = (Timestamp) visitor.visitMessage(this.f18226h, h2Var.f18226h);
                this.f18227i = visitor.visitInt(this.f18227i != 0, this.f18227i, h2Var.f18227i != 0, h2Var.f18227i);
                boolean z2 = this.f18228j != 0;
                int i = this.f18228j;
                if (h2Var.f18228j != 0) {
                    z = true;
                }
                this.f18228j = visitor.visitInt(z2, i, z, h2Var.f18228j);
                this.f18229k = (Timestamp) visitor.visitMessage(this.f18229k, h2Var.f18229k);
                this.f18230l = (Timestamp) visitor.visitMessage(this.f18230l, h2Var.f18230l);
                this.f18231m = visitor.visitString(!this.f18231m.isEmpty(), this.f18231m, !h2Var.f18231m.isEmpty(), h2Var.f18231m);
                this.f18232n = visitor.visitList(this.f18232n, h2Var.f18232n);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18223e |= h2Var.f18223e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f18224f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                Builder builder = this.f18225g != null ? (Timestamp.Builder) this.f18225g.toBuilder() : null;
                                this.f18225g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18225g);
                                    this.f18225g = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 24) {
                                this.f18227i = codedInputStream.readEnum();
                            } else if (readTag == 32) {
                                this.f18228j = codedInputStream.readEnum();
                            } else if (readTag == 42) {
                                Builder builder2 = this.f18229k != null ? (Timestamp.Builder) this.f18229k.toBuilder() : null;
                                this.f18229k = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f18229k);
                                    this.f18229k = (Timestamp) builder2.buildPartial();
                                }
                            } else if (readTag == 50) {
                                Builder builder3 = this.f18230l != null ? (Timestamp.Builder) this.f18230l.toBuilder() : null;
                                this.f18230l = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f18230l);
                                    this.f18230l = (Timestamp) builder3.buildPartial();
                                }
                            } else if (readTag == 58) {
                                this.f18231m = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 74) {
                                if (!this.f18232n.isModifiable()) {
                                    this.f18232n = GeneratedMessageLite.mutableCopy(this.f18232n);
                                }
                                this.f18232n.add(codedInputStream.readMessage(TrackingContextProto$TrackingContext.parser(), extensionRegistryLite));
                            } else if (readTag == 90) {
                                Builder builder4 = this.f18226h != null ? (Timestamp.Builder) this.f18226h.toBuilder() : null;
                                this.f18226h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder4 != null) {
                                    builder4.mergeFrom(this.f18226h);
                                    this.f18226h = (Timestamp) builder4.buildPartial();
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
                if (f18222p == null) {
                    synchronized (C7335h2.class) {
                        if (f18222p == null) {
                            f18222p = new DefaultInstanceBasedParser(f18221o);
                        }
                    }
                }
                return f18222p;
            default:
                throw new UnsupportedOperationException();
        }
        return f18221o;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f18225g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getFriendRequestUuid() {
        return this.f18231m;
    }

    public ByteString getFriendRequestUuidBytes() {
        return ByteString.copyFromUtf8(this.f18231m);
    }

    public C7492v2 getGhostedType() {
        C7492v2 a = C7492v2.m18118a(this.f18227i);
        return a == null ? C7492v2.UNRECOGNIZED : a;
    }

    public int getGhostedTypeValue() {
        return this.f18227i;
    }

    public Timestamp getGhostedUntil() {
        Timestamp timestamp = this.f18229k;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public TrackingContextProto$TrackingContext getLastTrackingContexts(int i) {
        return (TrackingContextProto$TrackingContext) this.f18232n.get(i);
    }

    public int getLastTrackingContextsCount() {
        return this.f18232n.size();
    }

    public List<TrackingContextProto$TrackingContext> getLastTrackingContextsList() {
        return this.f18232n;
    }

    public C7492v2 getRemoteGhostType() {
        C7492v2 a = C7492v2.m18118a(this.f18228j);
        return a == null ? C7492v2.UNRECOGNIZED : a;
    }

    public int getRemoteGhostTypeValue() {
        return this.f18228j;
    }

    public Timestamp getRemoteGhostUntil() {
        Timestamp timestamp = this.f18230l;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f18224f.isEmpty() ? CodedOutputStream.computeStringSize(1, getUuid()) + 0 : 0;
        if (this.f18225g != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, getCreatedAt());
        }
        if (this.f18227i != C7492v2.noghost.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(3, this.f18227i);
        }
        if (this.f18228j != C7492v2.noghost.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(4, this.f18228j);
        }
        if (this.f18229k != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(5, getGhostedUntil());
        }
        if (this.f18230l != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(6, getRemoteGhostUntil());
        }
        if (!this.f18231m.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(7, getFriendRequestUuid());
        }
        for (int i2 = 0; i2 < this.f18232n.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(9, (MessageLite) this.f18232n.get(i2));
        }
        if (this.f18226h != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(11, getUpdatedAt());
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public Timestamp getUpdatedAt() {
        Timestamp timestamp = this.f18226h;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getUuid() {
        return this.f18224f;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f18224f);
    }

    public boolean hasCreatedAt() {
        return this.f18225g != null;
    }

    public boolean hasGhostedUntil() {
        return this.f18229k != null;
    }

    public boolean hasRemoteGhostUntil() {
        return this.f18230l != null;
    }

    public boolean hasUpdatedAt() {
        return this.f18226h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18224f.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (this.f18225g != null) {
            codedOutputStream.writeMessage(2, getCreatedAt());
        }
        if (this.f18227i != C7492v2.noghost.getNumber()) {
            codedOutputStream.writeEnum(3, this.f18227i);
        }
        if (this.f18228j != C7492v2.noghost.getNumber()) {
            codedOutputStream.writeEnum(4, this.f18228j);
        }
        if (this.f18229k != null) {
            codedOutputStream.writeMessage(5, getGhostedUntil());
        }
        if (this.f18230l != null) {
            codedOutputStream.writeMessage(6, getRemoteGhostUntil());
        }
        if (!this.f18231m.isEmpty()) {
            codedOutputStream.writeString(7, getFriendRequestUuid());
        }
        for (int i = 0; i < this.f18232n.size(); i++) {
            codedOutputStream.writeMessage(9, (MessageLite) this.f18232n.get(i));
        }
        if (this.f18226h != null) {
            codedOutputStream.writeMessage(11, getUpdatedAt());
        }
    }
}
