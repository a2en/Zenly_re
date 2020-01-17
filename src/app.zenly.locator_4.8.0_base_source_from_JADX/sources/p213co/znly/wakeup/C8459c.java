package p213co.znly.wakeup;

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

/* renamed from: co.znly.wakeup.c */
public final class C8459c extends GeneratedMessageLite<C8459c, C8460a> implements WakeupProto$MetadataOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C8459c f21490m = new C8459c();

    /* renamed from: n */
    private static volatile Parser<C8459c> f21491n;

    /* renamed from: e */
    private int f21492e;

    /* renamed from: f */
    private String f21493f;

    /* renamed from: g */
    private String f21494g;

    /* renamed from: h */
    private ProtobufList<String> f21495h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: i */
    private String f21496i;

    /* renamed from: j */
    private int f21497j;

    /* renamed from: k */
    private int f21498k;

    /* renamed from: l */
    private int f21499l;

    /* renamed from: co.znly.wakeup.c$a */
    public static final class C8460a extends Builder<C8459c, C8460a> implements WakeupProto$MetadataOrBuilder {
        /* synthetic */ C8460a(C8456a aVar) {
            this();
        }

        public C8457b getAction() {
            return ((C8459c) this.instance).getAction();
        }

        public int getActionValue() {
            return ((C8459c) this.instance).getActionValue();
        }

        public String getOriginCycleUuid() {
            return ((C8459c) this.instance).getOriginCycleUuid();
        }

        public ByteString getOriginCycleUuidBytes() {
            return ((C8459c) this.instance).getOriginCycleUuidBytes();
        }

        public String getOriginUserUuid() {
            return ((C8459c) this.instance).getOriginUserUuid();
        }

        public ByteString getOriginUserUuidBytes() {
            return ((C8459c) this.instance).getOriginUserUuidBytes();
        }

        public C8461d getReason() {
            return ((C8459c) this.instance).getReason();
        }

        public int getReasonValue() {
            return ((C8459c) this.instance).getReasonValue();
        }

        public String getSequenceId() {
            return ((C8459c) this.instance).getSequenceId();
        }

        public ByteString getSequenceIdBytes() {
            return ((C8459c) this.instance).getSequenceIdBytes();
        }

        public int getSequenceNumber() {
            return ((C8459c) this.instance).getSequenceNumber();
        }

        public String getWatcherUuids(int i) {
            return ((C8459c) this.instance).getWatcherUuids(i);
        }

        public ByteString getWatcherUuidsBytes(int i) {
            return ((C8459c) this.instance).getWatcherUuidsBytes(i);
        }

        public int getWatcherUuidsCount() {
            return ((C8459c) this.instance).getWatcherUuidsCount();
        }

        public List<String> getWatcherUuidsList() {
            return Collections.unmodifiableList(((C8459c) this.instance).getWatcherUuidsList());
        }

        private C8460a() {
            super(C8459c.f21490m);
        }
    }

    static {
        f21490m.makeImmutable();
    }

    private C8459c() {
        String str = "";
        this.f21493f = str;
        this.f21494g = str;
        this.f21496i = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8456a.f21479a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8459c();
            case 2:
                return f21490m;
            case 3:
                this.f21495h.makeImmutable();
                return null;
            case 4:
                return new C8460a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8459c cVar = (C8459c) obj2;
                this.f21493f = visitor.visitString(!this.f21493f.isEmpty(), this.f21493f, !cVar.f21493f.isEmpty(), cVar.f21493f);
                this.f21494g = visitor.visitString(!this.f21494g.isEmpty(), this.f21494g, !cVar.f21494g.isEmpty(), cVar.f21494g);
                this.f21495h = visitor.visitList(this.f21495h, cVar.f21495h);
                this.f21496i = visitor.visitString(!this.f21496i.isEmpty(), this.f21496i, !cVar.f21496i.isEmpty(), cVar.f21496i);
                this.f21497j = visitor.visitInt(this.f21497j != 0, this.f21497j, cVar.f21497j != 0, cVar.f21497j);
                this.f21498k = visitor.visitInt(this.f21498k != 0, this.f21498k, cVar.f21498k != 0, cVar.f21498k);
                boolean z2 = this.f21499l != 0;
                int i = this.f21499l;
                if (cVar.f21499l != 0) {
                    z = true;
                }
                this.f21499l = visitor.visitInt(z2, i, z, cVar.f21499l);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f21492e |= cVar.f21492e;
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
                                this.f21493f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f21494g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f21495h.isModifiable()) {
                                    this.f21495h = GeneratedMessageLite.mutableCopy(this.f21495h);
                                }
                                this.f21495h.add(readStringRequireUtf8);
                            } else if (readTag == 34) {
                                this.f21496i = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 40) {
                                this.f21497j = codedInputStream.readInt32();
                            } else if (readTag == 48) {
                                this.f21498k = codedInputStream.readEnum();
                            } else if (readTag == 56) {
                                this.f21499l = codedInputStream.readEnum();
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
                if (f21491n == null) {
                    synchronized (C8459c.class) {
                        if (f21491n == null) {
                            f21491n = new DefaultInstanceBasedParser(f21490m);
                        }
                    }
                }
                return f21491n;
            default:
                throw new UnsupportedOperationException();
        }
        return f21490m;
    }

    public C8457b getAction() {
        C8457b a = C8457b.m19516a(this.f21498k);
        return a == null ? C8457b.UNRECOGNIZED : a;
    }

    public int getActionValue() {
        return this.f21498k;
    }

    public String getOriginCycleUuid() {
        return this.f21494g;
    }

    public ByteString getOriginCycleUuidBytes() {
        return ByteString.copyFromUtf8(this.f21494g);
    }

    public String getOriginUserUuid() {
        return this.f21493f;
    }

    public ByteString getOriginUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f21493f);
    }

    public C8461d getReason() {
        C8461d a = C8461d.m19517a(this.f21499l);
        return a == null ? C8461d.UNRECOGNIZED : a;
    }

    public int getReasonValue() {
        return this.f21499l;
    }

    public String getSequenceId() {
        return this.f21496i;
    }

    public ByteString getSequenceIdBytes() {
        return ByteString.copyFromUtf8(this.f21496i);
    }

    public int getSequenceNumber() {
        return this.f21497j;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f21493f.isEmpty() ? CodedOutputStream.computeStringSize(1, getOriginUserUuid()) + 0 : 0;
        if (!this.f21494g.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(2, getOriginCycleUuid());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f21495h.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f21495h.get(i3));
        }
        int size = computeStringSize + i2 + (getWatcherUuidsList().size() * 1);
        if (!this.f21496i.isEmpty()) {
            size += CodedOutputStream.computeStringSize(4, getSequenceId());
        }
        int i4 = this.f21497j;
        if (i4 != 0) {
            size += CodedOutputStream.computeInt32Size(5, i4);
        }
        if (this.f21498k != C8457b.ACTION_UNKNOWN.getNumber()) {
            size += CodedOutputStream.computeEnumSize(6, this.f21498k);
        }
        if (this.f21499l != C8461d.REASON_UNKNOWN.getNumber()) {
            size += CodedOutputStream.computeEnumSize(7, this.f21499l);
        }
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getWatcherUuids(int i) {
        return (String) this.f21495h.get(i);
    }

    public ByteString getWatcherUuidsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f21495h.get(i));
    }

    public int getWatcherUuidsCount() {
        return this.f21495h.size();
    }

    public List<String> getWatcherUuidsList() {
        return this.f21495h;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f21493f.isEmpty()) {
            codedOutputStream.writeString(1, getOriginUserUuid());
        }
        if (!this.f21494g.isEmpty()) {
            codedOutputStream.writeString(2, getOriginCycleUuid());
        }
        for (int i = 0; i < this.f21495h.size(); i++) {
            codedOutputStream.writeString(3, (String) this.f21495h.get(i));
        }
        if (!this.f21496i.isEmpty()) {
            codedOutputStream.writeString(4, getSequenceId());
        }
        int i2 = this.f21497j;
        if (i2 != 0) {
            codedOutputStream.writeInt32(5, i2);
        }
        if (this.f21498k != C8457b.ACTION_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(6, this.f21498k);
        }
        if (this.f21499l != C8461d.REASON_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(7, this.f21499l);
        }
    }
}
