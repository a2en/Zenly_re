package p213co.znly.models.nights;

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
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.nights.C7411b.C7412a;
import p213co.znly.models.nights.C7413c.C7414a;

/* renamed from: co.znly.models.nights.h */
public final class C7425h extends GeneratedMessageLite<C7425h, C7426a> implements NightsProto$StaySummaryOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final C7425h f18561n = new C7425h();

    /* renamed from: o */
    private static volatile Parser<C7425h> f18562o;

    /* renamed from: e */
    private int f18563e;

    /* renamed from: f */
    private String f18564f;

    /* renamed from: g */
    private String f18565g;

    /* renamed from: h */
    private C7411b f18566h;

    /* renamed from: i */
    private C7411b f18567i;

    /* renamed from: j */
    private int f18568j;

    /* renamed from: k */
    private ProtobufList<String> f18569k = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: l */
    private C7413c f18570l;

    /* renamed from: m */
    private C7413c f18571m;

    /* renamed from: co.znly.models.nights.h$a */
    public static final class C7426a extends Builder<C7425h, C7426a> implements NightsProto$StaySummaryOrBuilder {
        /* synthetic */ C7426a(C7410a aVar) {
            this();
        }

        public C7413c getFirstBedTime() {
            return ((C7425h) this.instance).getFirstBedTime();
        }

        public String getFriends(int i) {
            return ((C7425h) this.instance).getFriends(i);
        }

        public ByteString getFriendsBytes(int i) {
            return ((C7425h) this.instance).getFriendsBytes(i);
        }

        public int getFriendsCount() {
            return ((C7425h) this.instance).getFriendsCount();
        }

        public List<String> getFriendsList() {
            return Collections.unmodifiableList(((C7425h) this.instance).getFriendsList());
        }

        public C7411b getFromDate() {
            return ((C7425h) this.instance).getFromDate();
        }

        public C7413c getLastWakeupTime() {
            return ((C7425h) this.instance).getLastWakeupTime();
        }

        public String getLocationId() {
            return ((C7425h) this.instance).getLocationId();
        }

        public ByteString getLocationIdBytes() {
            return ((C7425h) this.instance).getLocationIdBytes();
        }

        public int getNightsCount() {
            return ((C7425h) this.instance).getNightsCount();
        }

        public String getStayId() {
            return ((C7425h) this.instance).getStayId();
        }

        public ByteString getStayIdBytes() {
            return ((C7425h) this.instance).getStayIdBytes();
        }

        public C7411b getToDate() {
            return ((C7425h) this.instance).getToDate();
        }

        public boolean hasFirstBedTime() {
            return ((C7425h) this.instance).hasFirstBedTime();
        }

        public boolean hasFromDate() {
            return ((C7425h) this.instance).hasFromDate();
        }

        public boolean hasLastWakeupTime() {
            return ((C7425h) this.instance).hasLastWakeupTime();
        }

        public boolean hasToDate() {
            return ((C7425h) this.instance).hasToDate();
        }

        private C7426a() {
            super(C7425h.f18561n);
        }
    }

    static {
        f18561n.makeImmutable();
    }

    private C7425h() {
        String str = "";
        this.f18564f = str;
        this.f18565g = str;
    }

    public static Parser<C7425h> parser() {
        return f18561n.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7410a.f18522a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7425h();
            case 2:
                return f18561n;
            case 3:
                this.f18569k.makeImmutable();
                return null;
            case 4:
                return new C7426a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7425h hVar = (C7425h) obj2;
                this.f18564f = visitor.visitString(!this.f18564f.isEmpty(), this.f18564f, !hVar.f18564f.isEmpty(), hVar.f18564f);
                this.f18565g = visitor.visitString(!this.f18565g.isEmpty(), this.f18565g, !hVar.f18565g.isEmpty(), hVar.f18565g);
                this.f18566h = (C7411b) visitor.visitMessage(this.f18566h, hVar.f18566h);
                this.f18567i = (C7411b) visitor.visitMessage(this.f18567i, hVar.f18567i);
                boolean z2 = this.f18568j != 0;
                int i = this.f18568j;
                if (hVar.f18568j != 0) {
                    z = true;
                }
                this.f18568j = visitor.visitInt(z2, i, z, hVar.f18568j);
                this.f18569k = visitor.visitList(this.f18569k, hVar.f18569k);
                this.f18570l = (C7413c) visitor.visitMessage(this.f18570l, hVar.f18570l);
                this.f18571m = (C7413c) visitor.visitMessage(this.f18571m, hVar.f18571m);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18563e |= hVar.f18563e;
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
                                this.f18564f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f18565g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                Builder builder = this.f18566h != null ? (C7412a) this.f18566h.toBuilder() : null;
                                this.f18566h = (C7411b) codedInputStream.readMessage(C7411b.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18566h);
                                    this.f18566h = (C7411b) builder.buildPartial();
                                }
                            } else if (readTag == 34) {
                                Builder builder2 = this.f18567i != null ? (C7412a) this.f18567i.toBuilder() : null;
                                this.f18567i = (C7411b) codedInputStream.readMessage(C7411b.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f18567i);
                                    this.f18567i = (C7411b) builder2.buildPartial();
                                }
                            } else if (readTag == 40) {
                                this.f18568j = codedInputStream.readInt32();
                            } else if (readTag == 50) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f18569k.isModifiable()) {
                                    this.f18569k = GeneratedMessageLite.mutableCopy(this.f18569k);
                                }
                                this.f18569k.add(readStringRequireUtf8);
                            } else if (readTag == 58) {
                                Builder builder3 = this.f18570l != null ? (C7414a) this.f18570l.toBuilder() : null;
                                this.f18570l = (C7413c) codedInputStream.readMessage(C7413c.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f18570l);
                                    this.f18570l = (C7413c) builder3.buildPartial();
                                }
                            } else if (readTag == 66) {
                                Builder builder4 = this.f18571m != null ? (C7414a) this.f18571m.toBuilder() : null;
                                this.f18571m = (C7413c) codedInputStream.readMessage(C7413c.parser(), extensionRegistryLite);
                                if (builder4 != null) {
                                    builder4.mergeFrom(this.f18571m);
                                    this.f18571m = (C7413c) builder4.buildPartial();
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
                if (f18562o == null) {
                    synchronized (C7425h.class) {
                        if (f18562o == null) {
                            f18562o = new DefaultInstanceBasedParser(f18561n);
                        }
                    }
                }
                return f18562o;
            default:
                throw new UnsupportedOperationException();
        }
        return f18561n;
    }

    public C7413c getFirstBedTime() {
        C7413c cVar = this.f18570l;
        return cVar == null ? C7413c.getDefaultInstance() : cVar;
    }

    public String getFriends(int i) {
        return (String) this.f18569k.get(i);
    }

    public ByteString getFriendsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f18569k.get(i));
    }

    public int getFriendsCount() {
        return this.f18569k.size();
    }

    public List<String> getFriendsList() {
        return this.f18569k;
    }

    public C7411b getFromDate() {
        C7411b bVar = this.f18566h;
        return bVar == null ? C7411b.getDefaultInstance() : bVar;
    }

    public C7413c getLastWakeupTime() {
        C7413c cVar = this.f18571m;
        return cVar == null ? C7413c.getDefaultInstance() : cVar;
    }

    public String getLocationId() {
        return this.f18564f;
    }

    public ByteString getLocationIdBytes() {
        return ByteString.copyFromUtf8(this.f18564f);
    }

    public int getNightsCount() {
        return this.f18568j;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f18564f.isEmpty() ? CodedOutputStream.computeStringSize(1, getLocationId()) + 0 : 0;
        if (!this.f18565g.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(2, getStayId());
        }
        if (this.f18566h != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(3, getFromDate());
        }
        if (this.f18567i != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(4, getToDate());
        }
        int i2 = this.f18568j;
        if (i2 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(5, i2);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f18569k.size(); i4++) {
            i3 += CodedOutputStream.computeStringSizeNoTag((String) this.f18569k.get(i4));
        }
        int size = computeStringSize + i3 + (getFriendsList().size() * 1);
        if (this.f18570l != null) {
            size += CodedOutputStream.computeMessageSize(7, getFirstBedTime());
        }
        if (this.f18571m != null) {
            size += CodedOutputStream.computeMessageSize(8, getLastWakeupTime());
        }
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getStayId() {
        return this.f18565g;
    }

    public ByteString getStayIdBytes() {
        return ByteString.copyFromUtf8(this.f18565g);
    }

    public C7411b getToDate() {
        C7411b bVar = this.f18567i;
        return bVar == null ? C7411b.getDefaultInstance() : bVar;
    }

    public boolean hasFirstBedTime() {
        return this.f18570l != null;
    }

    public boolean hasFromDate() {
        return this.f18566h != null;
    }

    public boolean hasLastWakeupTime() {
        return this.f18571m != null;
    }

    public boolean hasToDate() {
        return this.f18567i != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18564f.isEmpty()) {
            codedOutputStream.writeString(1, getLocationId());
        }
        if (!this.f18565g.isEmpty()) {
            codedOutputStream.writeString(2, getStayId());
        }
        if (this.f18566h != null) {
            codedOutputStream.writeMessage(3, getFromDate());
        }
        if (this.f18567i != null) {
            codedOutputStream.writeMessage(4, getToDate());
        }
        int i = this.f18568j;
        if (i != 0) {
            codedOutputStream.writeInt32(5, i);
        }
        for (int i2 = 0; i2 < this.f18569k.size(); i2++) {
            codedOutputStream.writeString(6, (String) this.f18569k.get(i2));
        }
        if (this.f18570l != null) {
            codedOutputStream.writeMessage(7, getFirstBedTime());
        }
        if (this.f18571m != null) {
            codedOutputStream.writeMessage(8, getLastWakeupTime());
        }
    }
}
