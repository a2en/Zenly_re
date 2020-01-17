package p213co.znly.models.bubble;

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
import p213co.znly.models.C7272d0;
import p213co.znly.models.C7272d0.C7273a;

/* renamed from: co.znly.models.bubble.b */
public final class C6971b extends GeneratedMessageLite<C6971b, C6972a> implements BubbleProto$BubbleOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final C6971b f17186n = new C6971b();

    /* renamed from: o */
    private static volatile Parser<C6971b> f17187o;

    /* renamed from: e */
    private int f17188e;

    /* renamed from: f */
    private Timestamp f17189f;

    /* renamed from: g */
    private String f17190g;

    /* renamed from: h */
    private String f17191h;

    /* renamed from: i */
    private String f17192i;

    /* renamed from: j */
    private String f17193j;

    /* renamed from: k */
    private String f17194k;

    /* renamed from: l */
    private ProtobufList<BubbleProto$BubbleIcon> f17195l = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: m */
    private C7272d0 f17196m;

    /* renamed from: co.znly.models.bubble.b$a */
    public static final class C6972a extends Builder<C6971b, C6972a> implements BubbleProto$BubbleOrBuilder {
        /* synthetic */ C6972a(C6970a aVar) {
            this();
        }

        public String getBadgeUrl() {
            return ((C6971b) this.instance).getBadgeUrl();
        }

        public ByteString getBadgeUrlBytes() {
            return ((C6971b) this.instance).getBadgeUrlBytes();
        }

        public C7272d0 getBoundingBox() {
            return ((C6971b) this.instance).getBoundingBox();
        }

        public String getBubbleId() {
            return ((C6971b) this.instance).getBubbleId();
        }

        public ByteString getBubbleIdBytes() {
            return ((C6971b) this.instance).getBubbleIdBytes();
        }

        public String getBubbleName() {
            return ((C6971b) this.instance).getBubbleName();
        }

        public ByteString getBubbleNameBytes() {
            return ((C6971b) this.instance).getBubbleNameBytes();
        }

        public Timestamp getCreatedAt() {
            return ((C6971b) this.instance).getCreatedAt();
        }

        public BubbleProto$BubbleIcon getIcons(int i) {
            return ((C6971b) this.instance).getIcons(i);
        }

        public int getIconsCount() {
            return ((C6971b) this.instance).getIconsCount();
        }

        public List<BubbleProto$BubbleIcon> getIconsList() {
            return Collections.unmodifiableList(((C6971b) this.instance).getIconsList());
        }

        public String getTcUuid() {
            return ((C6971b) this.instance).getTcUuid();
        }

        public ByteString getTcUuidBytes() {
            return ((C6971b) this.instance).getTcUuidBytes();
        }

        public String getUserUuid() {
            return ((C6971b) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C6971b) this.instance).getUserUuidBytes();
        }

        public boolean hasBoundingBox() {
            return ((C6971b) this.instance).hasBoundingBox();
        }

        public boolean hasCreatedAt() {
            return ((C6971b) this.instance).hasCreatedAt();
        }

        private C6972a() {
            super(C6971b.f17186n);
        }
    }

    static {
        f17186n.makeImmutable();
    }

    private C6971b() {
        String str = "";
        this.f17190g = str;
        this.f17191h = str;
        this.f17192i = str;
        this.f17193j = str;
        this.f17194k = str;
    }

    public static C6971b getDefaultInstance() {
        return f17186n;
    }

    public static Parser<C6971b> parser() {
        return f17186n.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C6970a.f17184a[methodToInvoke.ordinal()]) {
            case 1:
                return new C6971b();
            case 2:
                return f17186n;
            case 3:
                this.f17195l.makeImmutable();
                return null;
            case 4:
                return new C6972a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C6971b bVar = (C6971b) obj2;
                this.f17189f = (Timestamp) visitor.visitMessage(this.f17189f, bVar.f17189f);
                this.f17190g = visitor.visitString(!this.f17190g.isEmpty(), this.f17190g, !bVar.f17190g.isEmpty(), bVar.f17190g);
                this.f17191h = visitor.visitString(!this.f17191h.isEmpty(), this.f17191h, !bVar.f17191h.isEmpty(), bVar.f17191h);
                this.f17192i = visitor.visitString(!this.f17192i.isEmpty(), this.f17192i, !bVar.f17192i.isEmpty(), bVar.f17192i);
                this.f17193j = visitor.visitString(!this.f17193j.isEmpty(), this.f17193j, !bVar.f17193j.isEmpty(), bVar.f17193j);
                this.f17194k = visitor.visitString(!this.f17194k.isEmpty(), this.f17194k, true ^ bVar.f17194k.isEmpty(), bVar.f17194k);
                this.f17195l = visitor.visitList(this.f17195l, bVar.f17195l);
                this.f17196m = (C7272d0) visitor.visitMessage(this.f17196m, bVar.f17196m);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17188e |= bVar.f17188e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 18) {
                                Builder builder = this.f17189f != null ? (Timestamp.Builder) this.f17189f.toBuilder() : null;
                                this.f17189f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17189f);
                                    this.f17189f = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 26) {
                                this.f17190g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.f17191h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                this.f17192i = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 50) {
                                this.f17193j = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 58) {
                                this.f17194k = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 66) {
                                Builder builder2 = this.f17196m != null ? (C7273a) this.f17196m.toBuilder() : null;
                                this.f17196m = (C7272d0) codedInputStream.readMessage(C7272d0.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17196m);
                                    this.f17196m = (C7272d0) builder2.buildPartial();
                                }
                            } else if (readTag == 82) {
                                if (!this.f17195l.isModifiable()) {
                                    this.f17195l = GeneratedMessageLite.mutableCopy(this.f17195l);
                                }
                                this.f17195l.add(codedInputStream.readMessage(BubbleProto$BubbleIcon.parser(), extensionRegistryLite));
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
                if (f17187o == null) {
                    synchronized (C6971b.class) {
                        if (f17187o == null) {
                            f17187o = new DefaultInstanceBasedParser(f17186n);
                        }
                    }
                }
                return f17187o;
            default:
                throw new UnsupportedOperationException();
        }
        return f17186n;
    }

    public String getBadgeUrl() {
        return this.f17194k;
    }

    public ByteString getBadgeUrlBytes() {
        return ByteString.copyFromUtf8(this.f17194k);
    }

    public C7272d0 getBoundingBox() {
        C7272d0 d0Var = this.f17196m;
        return d0Var == null ? C7272d0.getDefaultInstance() : d0Var;
    }

    public String getBubbleId() {
        return this.f17192i;
    }

    public ByteString getBubbleIdBytes() {
        return ByteString.copyFromUtf8(this.f17192i);
    }

    public String getBubbleName() {
        return this.f17193j;
    }

    public ByteString getBubbleNameBytes() {
        return ByteString.copyFromUtf8(this.f17193j);
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f17189f;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public BubbleProto$BubbleIcon getIcons(int i) {
        return (BubbleProto$BubbleIcon) this.f17195l.get(i);
    }

    public int getIconsCount() {
        return this.f17195l.size();
    }

    public List<BubbleProto$BubbleIcon> getIconsList() {
        return this.f17195l;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.f17189f != null ? CodedOutputStream.computeMessageSize(2, getCreatedAt()) + 0 : 0;
        if (!this.f17190g.isEmpty()) {
            computeMessageSize += CodedOutputStream.computeStringSize(3, getUserUuid());
        }
        if (!this.f17191h.isEmpty()) {
            computeMessageSize += CodedOutputStream.computeStringSize(4, getTcUuid());
        }
        if (!this.f17192i.isEmpty()) {
            computeMessageSize += CodedOutputStream.computeStringSize(5, getBubbleId());
        }
        if (!this.f17193j.isEmpty()) {
            computeMessageSize += CodedOutputStream.computeStringSize(6, getBubbleName());
        }
        if (!this.f17194k.isEmpty()) {
            computeMessageSize += CodedOutputStream.computeStringSize(7, getBadgeUrl());
        }
        if (this.f17196m != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(8, getBoundingBox());
        }
        for (int i2 = 0; i2 < this.f17195l.size(); i2++) {
            computeMessageSize += CodedOutputStream.computeMessageSize(10, (MessageLite) this.f17195l.get(i2));
        }
        this.memoizedSerializedSize = computeMessageSize;
        return computeMessageSize;
    }

    public String getTcUuid() {
        return this.f17191h;
    }

    public ByteString getTcUuidBytes() {
        return ByteString.copyFromUtf8(this.f17191h);
    }

    public String getUserUuid() {
        return this.f17190g;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f17190g);
    }

    public boolean hasBoundingBox() {
        return this.f17196m != null;
    }

    public boolean hasCreatedAt() {
        return this.f17189f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17189f != null) {
            codedOutputStream.writeMessage(2, getCreatedAt());
        }
        if (!this.f17190g.isEmpty()) {
            codedOutputStream.writeString(3, getUserUuid());
        }
        if (!this.f17191h.isEmpty()) {
            codedOutputStream.writeString(4, getTcUuid());
        }
        if (!this.f17192i.isEmpty()) {
            codedOutputStream.writeString(5, getBubbleId());
        }
        if (!this.f17193j.isEmpty()) {
            codedOutputStream.writeString(6, getBubbleName());
        }
        if (!this.f17194k.isEmpty()) {
            codedOutputStream.writeString(7, getBadgeUrl());
        }
        if (this.f17196m != null) {
            codedOutputStream.writeMessage(8, getBoundingBox());
        }
        for (int i = 0; i < this.f17195l.size(); i++) {
            codedOutputStream.writeMessage(10, (MessageLite) this.f17195l.get(i));
        }
    }
}
