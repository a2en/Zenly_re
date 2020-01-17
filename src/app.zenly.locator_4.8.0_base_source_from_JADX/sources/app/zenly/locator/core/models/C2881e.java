package app.zenly.locator.core.models;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.AbstractMessageLite;
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
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: app.zenly.locator.core.models.e */
public final class C2881e extends GeneratedMessageLite<C2881e, C2882a> implements AppData$UserHistoryOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final C2881e f8151o = new C2881e();

    /* renamed from: p */
    private static volatile Parser<C2881e> f8152p;

    /* renamed from: e */
    private int f8153e;

    /* renamed from: f */
    private String f8154f = "";

    /* renamed from: g */
    private double f8155g;

    /* renamed from: h */
    private double f8156h;

    /* renamed from: i */
    private double f8157i;

    /* renamed from: j */
    private double f8158j;

    /* renamed from: k */
    private double f8159k;

    /* renamed from: l */
    private Timestamp f8160l;

    /* renamed from: m */
    private Timestamp f8161m;

    /* renamed from: n */
    private ProtobufList<String> f8162n = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: app.zenly.locator.core.models.e$a */
    public static final class C2882a extends Builder<C2881e, C2882a> implements AppData$UserHistoryOrBuilder {
        /* synthetic */ C2882a(C2873c cVar) {
            this();
        }

        /* renamed from: a */
        public C2882a mo8951a(String str) {
            copyOnWrite();
            ((C2881e) this.instance).m9347a(str);
            return this;
        }

        public double getAltitude() {
            return ((C2881e) this.instance).getAltitude();
        }

        public Timestamp getCreatedAt() {
            return ((C2881e) this.instance).getCreatedAt();
        }

        public String getFriendUuid() {
            return ((C2881e) this.instance).getFriendUuid();
        }

        public ByteString getFriendUuidBytes() {
            return ((C2881e) this.instance).getFriendUuidBytes();
        }

        public String getGatheringMembers(int i) {
            return ((C2881e) this.instance).getGatheringMembers(i);
        }

        public ByteString getGatheringMembersBytes(int i) {
            return ((C2881e) this.instance).getGatheringMembersBytes(i);
        }

        public int getGatheringMembersCount() {
            return ((C2881e) this.instance).getGatheringMembersCount();
        }

        public List<String> getGatheringMembersList() {
            return Collections.unmodifiableList(((C2881e) this.instance).getGatheringMembersList());
        }

        public double getHorizontalAccuracy() {
            return ((C2881e) this.instance).getHorizontalAccuracy();
        }

        public double getLatitude() {
            return ((C2881e) this.instance).getLatitude();
        }

        public double getLongitude() {
            return ((C2881e) this.instance).getLongitude();
        }

        public Timestamp getTimestamp() {
            return ((C2881e) this.instance).getTimestamp();
        }

        public double getVerticalAccuracy() {
            return ((C2881e) this.instance).getVerticalAccuracy();
        }

        public boolean hasCreatedAt() {
            return ((C2881e) this.instance).hasCreatedAt();
        }

        public boolean hasTimestamp() {
            return ((C2881e) this.instance).hasTimestamp();
        }

        public C2882a setLatitude(double d) {
            copyOnWrite();
            ((C2881e) this.instance).setLatitude(d);
            return this;
        }

        public C2882a setLongitude(double d) {
            copyOnWrite();
            ((C2881e) this.instance).setLongitude(d);
            return this;
        }

        private C2882a() {
            super(C2881e.f8151o);
        }

        /* renamed from: a */
        public C2882a mo8949a(double d) {
            copyOnWrite();
            ((C2881e) this.instance).m9342a(d);
            return this;
        }

        /* renamed from: a */
        public C2882a mo8950a(Iterable<String> iterable) {
            copyOnWrite();
            ((C2881e) this.instance).m9346a(iterable);
            return this;
        }
    }

    static {
        f8151o.makeImmutable();
    }

    private C2881e() {
    }

    public static C2881e getDefaultInstance() {
        return f8151o;
    }

    public static C2882a newBuilder() {
        return (C2882a) f8151o.toBuilder();
    }

    /* access modifiers changed from: private */
    public void setLatitude(double d) {
        this.f8155g = d;
    }

    /* access modifiers changed from: private */
    public void setLongitude(double d) {
        this.f8156h = d;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C2873c.f8122a[methodToInvoke.ordinal()]) {
            case 1:
                return new C2881e();
            case 2:
                return f8151o;
            case 3:
                this.f8162n.makeImmutable();
                return null;
            case 4:
                return new C2882a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C2881e eVar = (C2881e) obj2;
                this.f8154f = visitor.visitString(!this.f8154f.isEmpty(), this.f8154f, !eVar.f8154f.isEmpty(), eVar.f8154f);
                this.f8155g = visitor.visitDouble(this.f8155g != 0.0d, this.f8155g, eVar.f8155g != 0.0d, eVar.f8155g);
                this.f8156h = visitor.visitDouble(this.f8156h != 0.0d, this.f8156h, eVar.f8156h != 0.0d, eVar.f8156h);
                this.f8157i = visitor.visitDouble(this.f8157i != 0.0d, this.f8157i, eVar.f8157i != 0.0d, eVar.f8157i);
                this.f8158j = visitor.visitDouble(this.f8158j != 0.0d, this.f8158j, eVar.f8158j != 0.0d, eVar.f8158j);
                this.f8159k = visitor.visitDouble(this.f8159k != 0.0d, this.f8159k, eVar.f8159k != 0.0d, eVar.f8159k);
                this.f8160l = (Timestamp) visitor.visitMessage(this.f8160l, eVar.f8160l);
                this.f8161m = (Timestamp) visitor.visitMessage(this.f8161m, eVar.f8161m);
                this.f8162n = visitor.visitList(this.f8162n, eVar.f8162n);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f8153e |= eVar.f8153e;
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
                                this.f8154f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 17) {
                                this.f8155g = codedInputStream.readDouble();
                            } else if (readTag == 25) {
                                this.f8156h = codedInputStream.readDouble();
                            } else if (readTag == 33) {
                                this.f8157i = codedInputStream.readDouble();
                            } else if (readTag == 41) {
                                this.f8158j = codedInputStream.readDouble();
                            } else if (readTag == 49) {
                                this.f8159k = codedInputStream.readDouble();
                            } else if (readTag == 58) {
                                Builder builder = this.f8160l != null ? (Timestamp.Builder) this.f8160l.toBuilder() : null;
                                this.f8160l = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f8160l);
                                    this.f8160l = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 66) {
                                Builder builder2 = this.f8161m != null ? (Timestamp.Builder) this.f8161m.toBuilder() : null;
                                this.f8161m = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f8161m);
                                    this.f8161m = (Timestamp) builder2.buildPartial();
                                }
                            } else if (readTag == 74) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f8162n.isModifiable()) {
                                    this.f8162n = GeneratedMessageLite.mutableCopy(this.f8162n);
                                }
                                this.f8162n.add(readStringRequireUtf8);
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
                if (f8152p == null) {
                    synchronized (C2881e.class) {
                        if (f8152p == null) {
                            f8152p = new DefaultInstanceBasedParser(f8151o);
                        }
                    }
                }
                return f8152p;
            default:
                throw new UnsupportedOperationException();
        }
        return f8151o;
    }

    public double getAltitude() {
        return this.f8157i;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f8161m;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getFriendUuid() {
        return this.f8154f;
    }

    public ByteString getFriendUuidBytes() {
        return ByteString.copyFromUtf8(this.f8154f);
    }

    public String getGatheringMembers(int i) {
        return (String) this.f8162n.get(i);
    }

    public ByteString getGatheringMembersBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f8162n.get(i));
    }

    public int getGatheringMembersCount() {
        return this.f8162n.size();
    }

    public List<String> getGatheringMembersList() {
        return this.f8162n;
    }

    public double getHorizontalAccuracy() {
        return this.f8158j;
    }

    public double getLatitude() {
        return this.f8155g;
    }

    public double getLongitude() {
        return this.f8156h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f8154f.isEmpty() ? CodedOutputStream.computeStringSize(1, getFriendUuid()) + 0 : 0;
        double d = this.f8155g;
        if (d != 0.0d) {
            computeStringSize += CodedOutputStream.computeDoubleSize(2, d);
        }
        double d2 = this.f8156h;
        if (d2 != 0.0d) {
            computeStringSize += CodedOutputStream.computeDoubleSize(3, d2);
        }
        double d3 = this.f8157i;
        if (d3 != 0.0d) {
            computeStringSize += CodedOutputStream.computeDoubleSize(4, d3);
        }
        double d4 = this.f8158j;
        if (d4 != 0.0d) {
            computeStringSize += CodedOutputStream.computeDoubleSize(5, d4);
        }
        double d5 = this.f8159k;
        if (d5 != 0.0d) {
            computeStringSize += CodedOutputStream.computeDoubleSize(6, d5);
        }
        if (this.f8160l != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(7, getTimestamp());
        }
        if (this.f8161m != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(8, getCreatedAt());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f8162n.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f8162n.get(i3));
        }
        int size = computeStringSize + i2 + getGatheringMembersList().size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public Timestamp getTimestamp() {
        Timestamp timestamp = this.f8160l;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public double getVerticalAccuracy() {
        return this.f8159k;
    }

    public boolean hasCreatedAt() {
        return this.f8161m != null;
    }

    public boolean hasTimestamp() {
        return this.f8160l != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f8154f.isEmpty()) {
            codedOutputStream.writeString(1, getFriendUuid());
        }
        double d = this.f8155g;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(2, d);
        }
        double d2 = this.f8156h;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(3, d2);
        }
        double d3 = this.f8157i;
        if (d3 != 0.0d) {
            codedOutputStream.writeDouble(4, d3);
        }
        double d4 = this.f8158j;
        if (d4 != 0.0d) {
            codedOutputStream.writeDouble(5, d4);
        }
        double d5 = this.f8159k;
        if (d5 != 0.0d) {
            codedOutputStream.writeDouble(6, d5);
        }
        if (this.f8160l != null) {
            codedOutputStream.writeMessage(7, getTimestamp());
        }
        if (this.f8161m != null) {
            codedOutputStream.writeMessage(8, getCreatedAt());
        }
        for (int i = 0; i < this.f8162n.size(); i++) {
            codedOutputStream.writeString(9, (String) this.f8162n.get(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9347a(String str) {
        if (str != null) {
            this.f8154f = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9342a(double d) {
        this.f8158j = d;
    }

    /* renamed from: a */
    private void m9341a() {
        if (!this.f8162n.isModifiable()) {
            this.f8162n = GeneratedMessageLite.mutableCopy(this.f8162n);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9346a(Iterable<String> iterable) {
        m9341a();
        AbstractMessageLite.addAll(iterable, this.f8162n);
    }
}
