package p213co.znly.models.services;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
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
import p213co.znly.models.footsteps.C7309d;
import p213co.znly.models.footsteps.C7313f;

/* renamed from: co.znly.models.services.l2 */
public final class C8153l2 extends GeneratedMessageLite<C8153l2, C8154a> implements ZenlyProto$FootstepsRecordResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C8153l2 f20645k = new C8153l2();

    /* renamed from: l */
    private static volatile Parser<C8153l2> f20646l;

    /* renamed from: e */
    private int f20647e;

    /* renamed from: f */
    private ProtobufList<C7313f> f20648f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private ProtobufList<C7313f> f20649g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: h */
    private boolean f20650h;

    /* renamed from: i */
    private ProtobufList<C7309d> f20651i = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: j */
    private int f20652j;

    /* renamed from: co.znly.models.services.l2$a */
    public static final class C8154a extends Builder<C8153l2, C8154a> implements ZenlyProto$FootstepsRecordResponseOrBuilder {
        private C8154a() {
            super(C8153l2.f20645k);
        }

        /* synthetic */ C8154a(C8104i0 i0Var) {
            this();
        }

        public int getGeodataVersion() {
            return ((C8153l2) this.instance).getGeodataVersion();
        }

        public boolean getIsCompact() {
            return ((C8153l2) this.instance).getIsCompact();
        }

        public C7313f getMyRecords(int i) {
            return ((C8153l2) this.instance).getMyRecords(i);
        }

        public int getMyRecordsCount() {
            return ((C8153l2) this.instance).getMyRecordsCount();
        }

        public List<C7313f> getMyRecordsList() {
            return Collections.unmodifiableList(((C8153l2) this.instance).getMyRecordsList());
        }

        public C7313f getRecords(int i) {
            return ((C8153l2) this.instance).getRecords(i);
        }

        public int getRecordsCount() {
            return ((C8153l2) this.instance).getRecordsCount();
        }

        public List<C7313f> getRecordsList() {
            return Collections.unmodifiableList(((C8153l2) this.instance).getRecordsList());
        }

        public C7309d getRecordsPerLocality(int i) {
            return ((C8153l2) this.instance).getRecordsPerLocality(i);
        }

        public int getRecordsPerLocalityCount() {
            return ((C8153l2) this.instance).getRecordsPerLocalityCount();
        }

        public List<C7309d> getRecordsPerLocalityList() {
            return Collections.unmodifiableList(((C8153l2) this.instance).getRecordsPerLocalityList());
        }
    }

    static {
        f20645k.makeImmutable();
    }

    private C8153l2() {
    }

    public static C8154a newBuilder() {
        return (C8154a) f20645k.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        List list;
        MessageLite readMessage;
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8153l2();
            case 2:
                return f20645k;
            case 3:
                this.f20648f.makeImmutable();
                this.f20649g.makeImmutable();
                this.f20651i.makeImmutable();
                return null;
            case 4:
                return new C8154a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8153l2 l2Var = (C8153l2) obj2;
                this.f20648f = visitor.visitList(this.f20648f, l2Var.f20648f);
                this.f20649g = visitor.visitList(this.f20649g, l2Var.f20649g);
                boolean z2 = this.f20650h;
                boolean z3 = l2Var.f20650h;
                this.f20650h = visitor.visitBoolean(z2, z2, z3, z3);
                this.f20651i = visitor.visitList(this.f20651i, l2Var.f20651i);
                boolean z4 = this.f20652j != 0;
                int i = this.f20652j;
                if (l2Var.f20652j != 0) {
                    z = true;
                }
                this.f20652j = visitor.visitInt(z4, i, z, l2Var.f20652j);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20647e |= l2Var.f20647e;
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
                                if (!this.f20648f.isModifiable()) {
                                    this.f20648f = GeneratedMessageLite.mutableCopy(this.f20648f);
                                }
                                list = this.f20648f;
                                readMessage = codedInputStream.readMessage(C7313f.parser(), extensionRegistryLite);
                            } else if (readTag == 18) {
                                if (!this.f20649g.isModifiable()) {
                                    this.f20649g = GeneratedMessageLite.mutableCopy(this.f20649g);
                                }
                                list = this.f20649g;
                                readMessage = codedInputStream.readMessage(C7313f.parser(), extensionRegistryLite);
                            } else if (readTag == 24) {
                                this.f20652j = codedInputStream.readUInt32();
                            } else if (readTag == 32) {
                                this.f20650h = codedInputStream.readBool();
                            } else if (readTag == 42) {
                                if (!this.f20651i.isModifiable()) {
                                    this.f20651i = GeneratedMessageLite.mutableCopy(this.f20651i);
                                }
                                list = this.f20651i;
                                readMessage = codedInputStream.readMessage(C7309d.parser(), extensionRegistryLite);
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                            list.add(readMessage);
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
                if (f20646l == null) {
                    synchronized (C8153l2.class) {
                        if (f20646l == null) {
                            f20646l = new DefaultInstanceBasedParser(f20645k);
                        }
                    }
                }
                return f20646l;
            default:
                throw new UnsupportedOperationException();
        }
        return f20645k;
    }

    public int getGeodataVersion() {
        return this.f20652j;
    }

    public boolean getIsCompact() {
        return this.f20650h;
    }

    public C7313f getMyRecords(int i) {
        return (C7313f) this.f20649g.get(i);
    }

    public int getMyRecordsCount() {
        return this.f20649g.size();
    }

    public List<C7313f> getMyRecordsList() {
        return this.f20649g;
    }

    public C7313f getRecords(int i) {
        return (C7313f) this.f20648f.get(i);
    }

    public int getRecordsCount() {
        return this.f20648f.size();
    }

    public List<C7313f> getRecordsList() {
        return this.f20648f;
    }

    public C7309d getRecordsPerLocality(int i) {
        return (C7309d) this.f20651i.get(i);
    }

    public int getRecordsPerLocalityCount() {
        return this.f20651i.size();
    }

    public List<C7309d> getRecordsPerLocalityList() {
        return this.f20651i;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20648f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20648f.get(i3));
        }
        for (int i4 = 0; i4 < this.f20649g.size(); i4++) {
            i2 += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f20649g.get(i4));
        }
        int i5 = this.f20652j;
        if (i5 != 0) {
            i2 += CodedOutputStream.computeUInt32Size(3, i5);
        }
        boolean z = this.f20650h;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(4, z);
        }
        for (int i6 = 0; i6 < this.f20651i.size(); i6++) {
            i2 += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f20651i.get(i6));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20648f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20648f.get(i));
        }
        for (int i2 = 0; i2 < this.f20649g.size(); i2++) {
            codedOutputStream.writeMessage(2, (MessageLite) this.f20649g.get(i2));
        }
        int i3 = this.f20652j;
        if (i3 != 0) {
            codedOutputStream.writeUInt32(3, i3);
        }
        boolean z = this.f20650h;
        if (z) {
            codedOutputStream.writeBool(4, z);
        }
        for (int i4 = 0; i4 < this.f20651i.size(); i4++) {
            codedOutputStream.writeMessage(5, (MessageLite) this.f20651i.get(i4));
        }
    }
}
