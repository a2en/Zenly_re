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
import p213co.znly.core.vendor.com.google.protobuf.Internal.LongList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.services.d */
public final class C8020d extends GeneratedMessageLite<C8020d, C8021a> implements ReverseGeoCoderProto$CovererResponse$CoveringOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C8020d f20355i = new C8020d();

    /* renamed from: j */
    private static volatile Parser<C8020d> f20356j;

    /* renamed from: e */
    private int f20357e;

    /* renamed from: f */
    private long f20358f;

    /* renamed from: g */
    private int f20359g;

    /* renamed from: h */
    private LongList f20360h = GeneratedMessageLite.emptyLongList();

    /* renamed from: co.znly.models.services.d$a */
    public static final class C8021a extends Builder<C8020d, C8021a> implements ReverseGeoCoderProto$CovererResponse$CoveringOrBuilder {
        /* synthetic */ C8021a(C8005c cVar) {
            this();
        }

        public long getId() {
            return ((C8020d) this.instance).getId();
        }

        public long getTiles(int i) {
            return ((C8020d) this.instance).getTiles(i);
        }

        public int getTilesCount() {
            return ((C8020d) this.instance).getTilesCount();
        }

        public List<Long> getTilesList() {
            return Collections.unmodifiableList(((C8020d) this.instance).getTilesList());
        }

        public C8038e getType() {
            return ((C8020d) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C8020d) this.instance).getTypeValue();
        }

        private C8021a() {
            super(C8020d.f20355i);
        }
    }

    static {
        f20355i.makeImmutable();
    }

    private C8020d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8005c.f20316a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8020d();
            case 2:
                return f20355i;
            case 3:
                this.f20360h.makeImmutable();
                return null;
            case 4:
                return new C8021a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8020d dVar = (C8020d) obj2;
                this.f20358f = visitor.visitLong(this.f20358f != 0, this.f20358f, dVar.f20358f != 0, dVar.f20358f);
                boolean z2 = this.f20359g != 0;
                int i = this.f20359g;
                if (dVar.f20359g != 0) {
                    z = true;
                }
                this.f20359g = visitor.visitInt(z2, i, z, dVar.f20359g);
                this.f20360h = visitor.visitLongList(this.f20360h, dVar.f20360h);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20357e |= dVar.f20357e;
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
                                this.f20358f = codedInputStream.readUInt64();
                            } else if (readTag == 16) {
                                this.f20359g = codedInputStream.readEnum();
                            } else if (readTag == 24) {
                                if (!this.f20360h.isModifiable()) {
                                    this.f20360h = GeneratedMessageLite.mutableCopy(this.f20360h);
                                }
                                this.f20360h.addLong(codedInputStream.readUInt64());
                            } else if (readTag == 26) {
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if (!this.f20360h.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f20360h = GeneratedMessageLite.mutableCopy(this.f20360h);
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f20360h.addLong(codedInputStream.readUInt64());
                                }
                                codedInputStream.popLimit(pushLimit);
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
                if (f20356j == null) {
                    synchronized (C8020d.class) {
                        if (f20356j == null) {
                            f20356j = new DefaultInstanceBasedParser(f20355i);
                        }
                    }
                }
                return f20356j;
            default:
                throw new UnsupportedOperationException();
        }
        return f20355i;
    }

    public long getId() {
        return this.f20358f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        long j = this.f20358f;
        int computeUInt64Size = j != 0 ? CodedOutputStream.computeUInt64Size(1, j) + 0 : 0;
        if (this.f20359g != C8038e.TILE_COVERING.getNumber()) {
            computeUInt64Size += CodedOutputStream.computeEnumSize(2, this.f20359g);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20360h.size(); i3++) {
            i2 += CodedOutputStream.computeUInt64SizeNoTag(this.f20360h.getLong(i3));
        }
        int size = computeUInt64Size + i2 + (getTilesList().size() * 1);
        this.memoizedSerializedSize = size;
        return size;
    }

    public long getTiles(int i) {
        return this.f20360h.getLong(i);
    }

    public int getTilesCount() {
        return this.f20360h.size();
    }

    public List<Long> getTilesList() {
        return this.f20360h;
    }

    public C8038e getType() {
        C8038e a = C8038e.m19101a(this.f20359g);
        return a == null ? C8038e.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f20359g;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        long j = this.f20358f;
        if (j != 0) {
            codedOutputStream.writeUInt64(1, j);
        }
        if (this.f20359g != C8038e.TILE_COVERING.getNumber()) {
            codedOutputStream.writeEnum(2, this.f20359g);
        }
        for (int i = 0; i < this.f20360h.size(); i++) {
            codedOutputStream.writeUInt64(3, this.f20360h.getLong(i));
        }
    }
}
