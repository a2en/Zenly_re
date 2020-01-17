package p213co.znly.models.footsteps;

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
import p213co.znly.models.reversegeocoder.C7917e;

/* renamed from: co.znly.models.footsteps.d */
public final class C7309d extends GeneratedMessageLite<C7309d, C7310a> implements FootstepsProto$LocalityRecordsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C7309d f18147k = new C7309d();

    /* renamed from: l */
    private static volatile Parser<C7309d> f18148l;

    /* renamed from: e */
    private int f18149e;

    /* renamed from: f */
    private long f18150f;

    /* renamed from: g */
    private int f18151g;

    /* renamed from: h */
    private double f18152h;

    /* renamed from: i */
    private int f18153i;

    /* renamed from: j */
    private ProtobufList<C7307c> f18154j = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.footsteps.d$a */
    public static final class C7310a extends Builder<C7309d, C7310a> implements FootstepsProto$LocalityRecordsOrBuilder {
        /* synthetic */ C7310a(C7304a aVar) {
            this();
        }

        public C7307c getFriendRecords(int i) {
            return ((C7309d) this.instance).getFriendRecords(i);
        }

        public int getFriendRecordsCount() {
            return ((C7309d) this.instance).getFriendRecordsCount();
        }

        public List<C7307c> getFriendRecordsList() {
            return Collections.unmodifiableList(((C7309d) this.instance).getFriendRecordsList());
        }

        public double getMyAreaUncovered() {
            return ((C7309d) this.instance).getMyAreaUncovered();
        }

        public int getMyRank() {
            return ((C7309d) this.instance).getMyRank();
        }

        public long getPlaceId() {
            return ((C7309d) this.instance).getPlaceId();
        }

        public C7917e getType() {
            return ((C7309d) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C7309d) this.instance).getTypeValue();
        }

        private C7310a() {
            super(C7309d.f18147k);
        }
    }

    static {
        f18147k.makeImmutable();
    }

    private C7309d() {
    }

    public static Parser<C7309d> parser() {
        return f18147k.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7304a.f18131a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7309d();
            case 2:
                return f18147k;
            case 3:
                this.f18154j.makeImmutable();
                return null;
            case 4:
                return new C7310a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7309d dVar = (C7309d) obj2;
                this.f18150f = visitor.visitLong(this.f18150f != 0, this.f18150f, dVar.f18150f != 0, dVar.f18150f);
                this.f18151g = visitor.visitInt(this.f18151g != 0, this.f18151g, dVar.f18151g != 0, dVar.f18151g);
                this.f18152h = visitor.visitDouble(this.f18152h != 0.0d, this.f18152h, dVar.f18152h != 0.0d, dVar.f18152h);
                boolean z2 = this.f18153i != 0;
                int i = this.f18153i;
                if (dVar.f18153i != 0) {
                    z = true;
                }
                this.f18153i = visitor.visitInt(z2, i, z, dVar.f18153i);
                this.f18154j = visitor.visitList(this.f18154j, dVar.f18154j);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18149e |= dVar.f18149e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f18150f = codedInputStream.readUInt64();
                            } else if (readTag == 16) {
                                this.f18151g = codedInputStream.readEnum();
                            } else if (readTag == 25) {
                                this.f18152h = codedInputStream.readDouble();
                            } else if (readTag == 32) {
                                this.f18153i = codedInputStream.readUInt32();
                            } else if (readTag == 42) {
                                if (!this.f18154j.isModifiable()) {
                                    this.f18154j = GeneratedMessageLite.mutableCopy(this.f18154j);
                                }
                                this.f18154j.add(codedInputStream.readMessage(C7307c.parser(), extensionRegistryLite));
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
                if (f18148l == null) {
                    synchronized (C7309d.class) {
                        if (f18148l == null) {
                            f18148l = new DefaultInstanceBasedParser(f18147k);
                        }
                    }
                }
                return f18148l;
            default:
                throw new UnsupportedOperationException();
        }
        return f18147k;
    }

    public C7307c getFriendRecords(int i) {
        return (C7307c) this.f18154j.get(i);
    }

    public int getFriendRecordsCount() {
        return this.f18154j.size();
    }

    public List<C7307c> getFriendRecordsList() {
        return this.f18154j;
    }

    public double getMyAreaUncovered() {
        return this.f18152h;
    }

    public int getMyRank() {
        return this.f18153i;
    }

    public long getPlaceId() {
        return this.f18150f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        long j = this.f18150f;
        int computeUInt64Size = j != 0 ? CodedOutputStream.computeUInt64Size(1, j) + 0 : 0;
        if (this.f18151g != C7917e.UNUSED.getNumber()) {
            computeUInt64Size += CodedOutputStream.computeEnumSize(2, this.f18151g);
        }
        double d = this.f18152h;
        if (d != 0.0d) {
            computeUInt64Size += CodedOutputStream.computeDoubleSize(3, d);
        }
        int i2 = this.f18153i;
        if (i2 != 0) {
            computeUInt64Size += CodedOutputStream.computeUInt32Size(4, i2);
        }
        for (int i3 = 0; i3 < this.f18154j.size(); i3++) {
            computeUInt64Size += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f18154j.get(i3));
        }
        this.memoizedSerializedSize = computeUInt64Size;
        return computeUInt64Size;
    }

    public C7917e getType() {
        C7917e a = C7917e.m18960a(this.f18151g);
        return a == null ? C7917e.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f18151g;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f18150f;
        if (j != 0) {
            codedOutputStream.writeUInt64(1, j);
        }
        if (this.f18151g != C7917e.UNUSED.getNumber()) {
            codedOutputStream.writeEnum(2, this.f18151g);
        }
        double d = this.f18152h;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(3, d);
        }
        int i = this.f18153i;
        if (i != 0) {
            codedOutputStream.writeUInt32(4, i);
        }
        for (int i2 = 0; i2 < this.f18154j.size(); i2++) {
            codedOutputStream.writeMessage(5, (MessageLite) this.f18154j.get(i2));
        }
    }
}
