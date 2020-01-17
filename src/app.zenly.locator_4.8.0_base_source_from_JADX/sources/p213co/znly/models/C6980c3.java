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

/* renamed from: co.znly.models.c3 */
public final class C6980c3 extends GeneratedMessageLite<C6980c3, C6981a> implements UserProto$FriendshipOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final C6980c3 f17221p = new C6980c3();

    /* renamed from: q */
    private static volatile Parser<C6980c3> f17222q;

    /* renamed from: e */
    private int f17223e;

    /* renamed from: f */
    private String f17224f;

    /* renamed from: g */
    private Timestamp f17225g;

    /* renamed from: h */
    private Timestamp f17226h;

    /* renamed from: i */
    private Timestamp f17227i;

    /* renamed from: j */
    private int f17228j;

    /* renamed from: k */
    private int f17229k;

    /* renamed from: l */
    private Timestamp f17230l;

    /* renamed from: m */
    private Timestamp f17231m;

    /* renamed from: n */
    private String f17232n;

    /* renamed from: o */
    private ProtobufList<TrackingContextProto$TrackingContext> f17233o = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.c3$a */
    public static final class C6981a extends Builder<C6980c3, C6981a> implements UserProto$FriendshipOrBuilder {
        /* synthetic */ C6981a(C7519z2 z2Var) {
            this();
        }

        /* renamed from: a */
        public C6981a mo18189a(C7492v2 v2Var) {
            copyOnWrite();
            ((C6980c3) this.instance).m17716a(v2Var);
            return this;
        }

        public Timestamp getCreatedAt() {
            return ((C6980c3) this.instance).getCreatedAt();
        }

        public Timestamp getDeletedAt() {
            return ((C6980c3) this.instance).getDeletedAt();
        }

        public String getFriendRequestUuid() {
            return ((C6980c3) this.instance).getFriendRequestUuid();
        }

        public ByteString getFriendRequestUuidBytes() {
            return ((C6980c3) this.instance).getFriendRequestUuidBytes();
        }

        public C7492v2 getGhostedType() {
            return ((C6980c3) this.instance).getGhostedType();
        }

        public int getGhostedTypeValue() {
            return ((C6980c3) this.instance).getGhostedTypeValue();
        }

        public Timestamp getGhostedUntil() {
            return ((C6980c3) this.instance).getGhostedUntil();
        }

        public TrackingContextProto$TrackingContext getLastTrackingContexts(int i) {
            return ((C6980c3) this.instance).getLastTrackingContexts(i);
        }

        public int getLastTrackingContextsCount() {
            return ((C6980c3) this.instance).getLastTrackingContextsCount();
        }

        public List<TrackingContextProto$TrackingContext> getLastTrackingContextsList() {
            return Collections.unmodifiableList(((C6980c3) this.instance).getLastTrackingContextsList());
        }

        public C7492v2 getRemoteGhostType() {
            return ((C6980c3) this.instance).getRemoteGhostType();
        }

        public int getRemoteGhostTypeValue() {
            return ((C6980c3) this.instance).getRemoteGhostTypeValue();
        }

        public Timestamp getRemoteGhostUntil() {
            return ((C6980c3) this.instance).getRemoteGhostUntil();
        }

        public Timestamp getUpdatedAt() {
            return ((C6980c3) this.instance).getUpdatedAt();
        }

        public String getUuid() {
            return ((C6980c3) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C6980c3) this.instance).getUuidBytes();
        }

        public boolean hasCreatedAt() {
            return ((C6980c3) this.instance).hasCreatedAt();
        }

        public boolean hasDeletedAt() {
            return ((C6980c3) this.instance).hasDeletedAt();
        }

        public boolean hasGhostedUntil() {
            return ((C6980c3) this.instance).hasGhostedUntil();
        }

        public boolean hasRemoteGhostUntil() {
            return ((C6980c3) this.instance).hasRemoteGhostUntil();
        }

        public boolean hasUpdatedAt() {
            return ((C6980c3) this.instance).hasUpdatedAt();
        }

        private C6981a() {
            super(C6980c3.f17221p);
        }

        /* renamed from: a */
        public C6981a mo18188a(Timestamp timestamp) {
            copyOnWrite();
            ((C6980c3) this.instance).m17711a(timestamp);
            return this;
        }

        /* renamed from: a */
        public C6981a mo18187a(Timestamp.Builder builder) {
            copyOnWrite();
            ((C6980c3) this.instance).m17710a(builder);
            return this;
        }

        /* renamed from: a */
        public C6981a mo18186a() {
            copyOnWrite();
            ((C6980c3) this.instance).m17717b();
            return this;
        }
    }

    static {
        f17221p.makeImmutable();
    }

    private C6980c3() {
        String str = "";
        this.f17224f = str;
        this.f17232n = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m17717b() {
        this.f17230l = null;
    }

    public static C6980c3 getDefaultInstance() {
        return f17221p;
    }

    public static Parser<C6980c3> parser() {
        return f17221p.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7519z2.f18891a[methodToInvoke.ordinal()]) {
            case 1:
                return new C6980c3();
            case 2:
                return f17221p;
            case 3:
                this.f17233o.makeImmutable();
                return null;
            case 4:
                return new C6981a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C6980c3 c3Var = (C6980c3) obj2;
                this.f17224f = visitor.visitString(!this.f17224f.isEmpty(), this.f17224f, !c3Var.f17224f.isEmpty(), c3Var.f17224f);
                this.f17225g = (Timestamp) visitor.visitMessage(this.f17225g, c3Var.f17225g);
                this.f17226h = (Timestamp) visitor.visitMessage(this.f17226h, c3Var.f17226h);
                this.f17227i = (Timestamp) visitor.visitMessage(this.f17227i, c3Var.f17227i);
                this.f17228j = visitor.visitInt(this.f17228j != 0, this.f17228j, c3Var.f17228j != 0, c3Var.f17228j);
                boolean z2 = this.f17229k != 0;
                int i = this.f17229k;
                if (c3Var.f17229k != 0) {
                    z = true;
                }
                this.f17229k = visitor.visitInt(z2, i, z, c3Var.f17229k);
                this.f17230l = (Timestamp) visitor.visitMessage(this.f17230l, c3Var.f17230l);
                this.f17231m = (Timestamp) visitor.visitMessage(this.f17231m, c3Var.f17231m);
                this.f17232n = visitor.visitString(!this.f17232n.isEmpty(), this.f17232n, !c3Var.f17232n.isEmpty(), c3Var.f17232n);
                this.f17233o = visitor.visitList(this.f17233o, c3Var.f17233o);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17223e |= c3Var.f17223e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.f17224f = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                Builder builder = this.f17225g != null ? (Timestamp.Builder) this.f17225g.toBuilder() : null;
                                this.f17225g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f17225g);
                                    this.f17225g = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 24:
                                this.f17228j = codedInputStream.readEnum();
                                break;
                            case 32:
                                this.f17229k = codedInputStream.readEnum();
                                break;
                            case 42:
                                Builder builder2 = this.f17230l != null ? (Timestamp.Builder) this.f17230l.toBuilder() : null;
                                this.f17230l = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f17230l);
                                    this.f17230l = (Timestamp) builder2.buildPartial();
                                    break;
                                }
                            case 50:
                                Builder builder3 = this.f17231m != null ? (Timestamp.Builder) this.f17231m.toBuilder() : null;
                                this.f17231m = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f17231m);
                                    this.f17231m = (Timestamp) builder3.buildPartial();
                                    break;
                                }
                            case 58:
                                this.f17232n = codedInputStream.readStringRequireUtf8();
                                break;
                            case 74:
                                if (!this.f17233o.isModifiable()) {
                                    this.f17233o = GeneratedMessageLite.mutableCopy(this.f17233o);
                                }
                                this.f17233o.add(codedInputStream.readMessage(TrackingContextProto$TrackingContext.parser(), extensionRegistryLite));
                                break;
                            case 90:
                                Builder builder4 = this.f17226h != null ? (Timestamp.Builder) this.f17226h.toBuilder() : null;
                                this.f17226h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder4 == null) {
                                    break;
                                } else {
                                    builder4.mergeFrom(this.f17226h);
                                    this.f17226h = (Timestamp) builder4.buildPartial();
                                    break;
                                }
                            case 98:
                                Builder builder5 = this.f17227i != null ? (Timestamp.Builder) this.f17227i.toBuilder() : null;
                                this.f17227i = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder5 == null) {
                                    break;
                                } else {
                                    builder5.mergeFrom(this.f17227i);
                                    this.f17227i = (Timestamp) builder5.buildPartial();
                                    break;
                                }
                            default:
                                if (codedInputStream.skipField(readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
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
                if (f17222q == null) {
                    synchronized (C6980c3.class) {
                        if (f17222q == null) {
                            f17222q = new DefaultInstanceBasedParser(f17221p);
                        }
                    }
                }
                return f17222q;
            default:
                throw new UnsupportedOperationException();
        }
        return f17221p;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f17225g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getDeletedAt() {
        Timestamp timestamp = this.f17227i;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getFriendRequestUuid() {
        return this.f17232n;
    }

    public ByteString getFriendRequestUuidBytes() {
        return ByteString.copyFromUtf8(this.f17232n);
    }

    public C7492v2 getGhostedType() {
        C7492v2 a = C7492v2.m18118a(this.f17228j);
        return a == null ? C7492v2.UNRECOGNIZED : a;
    }

    public int getGhostedTypeValue() {
        return this.f17228j;
    }

    public Timestamp getGhostedUntil() {
        Timestamp timestamp = this.f17230l;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public TrackingContextProto$TrackingContext getLastTrackingContexts(int i) {
        return (TrackingContextProto$TrackingContext) this.f17233o.get(i);
    }

    public int getLastTrackingContextsCount() {
        return this.f17233o.size();
    }

    public List<TrackingContextProto$TrackingContext> getLastTrackingContextsList() {
        return this.f17233o;
    }

    public C7492v2 getRemoteGhostType() {
        C7492v2 a = C7492v2.m18118a(this.f17229k);
        return a == null ? C7492v2.UNRECOGNIZED : a;
    }

    public int getRemoteGhostTypeValue() {
        return this.f17229k;
    }

    public Timestamp getRemoteGhostUntil() {
        Timestamp timestamp = this.f17231m;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f17224f.isEmpty() ? CodedOutputStream.computeStringSize(1, getUuid()) + 0 : 0;
        if (this.f17225g != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, getCreatedAt());
        }
        if (this.f17228j != C7492v2.noghost.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(3, this.f17228j);
        }
        if (this.f17229k != C7492v2.noghost.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(4, this.f17229k);
        }
        if (this.f17230l != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(5, getGhostedUntil());
        }
        if (this.f17231m != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(6, getRemoteGhostUntil());
        }
        if (!this.f17232n.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(7, getFriendRequestUuid());
        }
        for (int i2 = 0; i2 < this.f17233o.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(9, (MessageLite) this.f17233o.get(i2));
        }
        if (this.f17226h != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(11, getUpdatedAt());
        }
        if (this.f17227i != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(12, getDeletedAt());
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public Timestamp getUpdatedAt() {
        Timestamp timestamp = this.f17226h;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getUuid() {
        return this.f17224f;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f17224f);
    }

    public boolean hasCreatedAt() {
        return this.f17225g != null;
    }

    public boolean hasDeletedAt() {
        return this.f17227i != null;
    }

    public boolean hasGhostedUntil() {
        return this.f17230l != null;
    }

    public boolean hasRemoteGhostUntil() {
        return this.f17231m != null;
    }

    public boolean hasUpdatedAt() {
        return this.f17226h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17224f.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (this.f17225g != null) {
            codedOutputStream.writeMessage(2, getCreatedAt());
        }
        if (this.f17228j != C7492v2.noghost.getNumber()) {
            codedOutputStream.writeEnum(3, this.f17228j);
        }
        if (this.f17229k != C7492v2.noghost.getNumber()) {
            codedOutputStream.writeEnum(4, this.f17229k);
        }
        if (this.f17230l != null) {
            codedOutputStream.writeMessage(5, getGhostedUntil());
        }
        if (this.f17231m != null) {
            codedOutputStream.writeMessage(6, getRemoteGhostUntil());
        }
        if (!this.f17232n.isEmpty()) {
            codedOutputStream.writeString(7, getFriendRequestUuid());
        }
        for (int i = 0; i < this.f17233o.size(); i++) {
            codedOutputStream.writeMessage(9, (MessageLite) this.f17233o.get(i));
        }
        if (this.f17226h != null) {
            codedOutputStream.writeMessage(11, getUpdatedAt());
        }
        if (this.f17227i != null) {
            codedOutputStream.writeMessage(12, getDeletedAt());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17716a(C7492v2 v2Var) {
        if (v2Var != null) {
            this.f17228j = v2Var.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17711a(Timestamp timestamp) {
        if (timestamp != null) {
            this.f17230l = timestamp;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17710a(Timestamp.Builder builder) {
        this.f17230l = (Timestamp) builder.build();
    }
}
