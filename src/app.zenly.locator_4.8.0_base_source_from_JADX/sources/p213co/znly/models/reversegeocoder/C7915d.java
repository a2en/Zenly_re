package p213co.znly.models.reversegeocoder;

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
import p213co.znly.models.C6950b0;
import p213co.znly.models.C6950b0.C6951a;

/* renamed from: co.znly.models.reversegeocoder.d */
public final class C7915d extends GeneratedMessageLite<C7915d, C7916a> implements ReverseGeoCoderProto$ReverseGeoCodeInformationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C7915d f20049k = new C7915d();

    /* renamed from: l */
    private static volatile Parser<C7915d> f20050l;

    /* renamed from: e */
    private int f20051e;

    /* renamed from: f */
    private String f20052f = "";

    /* renamed from: g */
    private int f20053g;

    /* renamed from: h */
    private C6950b0 f20054h;

    /* renamed from: i */
    private long f20055i;

    /* renamed from: j */
    private ProtobufList<C7925i> f20056j = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.reversegeocoder.d$a */
    public static final class C7916a extends Builder<C7915d, C7916a> implements ReverseGeoCoderProto$ReverseGeoCodeInformationOrBuilder {
        /* synthetic */ C7916a(C7910a aVar) {
            this();
        }

        public C6950b0 getCentroid() {
            return ((C7915d) this.instance).getCentroid();
        }

        public long getId() {
            return ((C7915d) this.instance).getId();
        }

        public String getLabel() {
            return ((C7915d) this.instance).getLabel();
        }

        public ByteString getLabelBytes() {
            return ((C7915d) this.instance).getLabelBytes();
        }

        public C7925i getParentZones(int i) {
            return ((C7915d) this.instance).getParentZones(i);
        }

        public int getParentZonesCount() {
            return ((C7915d) this.instance).getParentZonesCount();
        }

        public List<C7925i> getParentZonesList() {
            return Collections.unmodifiableList(((C7915d) this.instance).getParentZonesList());
        }

        public C7917e getType() {
            return ((C7915d) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C7915d) this.instance).getTypeValue();
        }

        public boolean hasCentroid() {
            return ((C7915d) this.instance).hasCentroid();
        }

        private C7916a() {
            super(C7915d.f20049k);
        }
    }

    static {
        f20049k.makeImmutable();
    }

    private C7915d() {
    }

    public static Parser<C7915d> parser() {
        return f20049k.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7910a.f20031a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7915d();
            case 2:
                return f20049k;
            case 3:
                this.f20056j.makeImmutable();
                return null;
            case 4:
                return new C7916a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7915d dVar = (C7915d) obj2;
                this.f20052f = visitor.visitString(!this.f20052f.isEmpty(), this.f20052f, !dVar.f20052f.isEmpty(), dVar.f20052f);
                this.f20053g = visitor.visitInt(this.f20053g != 0, this.f20053g, dVar.f20053g != 0, dVar.f20053g);
                this.f20054h = (C6950b0) visitor.visitMessage(this.f20054h, dVar.f20054h);
                this.f20055i = visitor.visitLong(this.f20055i != 0, this.f20055i, dVar.f20055i != 0, dVar.f20055i);
                this.f20056j = visitor.visitList(this.f20056j, dVar.f20056j);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20051e |= dVar.f20051e;
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
                                this.f20052f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f20053g = codedInputStream.readEnum();
                            } else if (readTag == 26) {
                                Builder builder = this.f20054h != null ? (C6951a) this.f20054h.toBuilder() : null;
                                this.f20054h = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20054h);
                                    this.f20054h = (C6950b0) builder.buildPartial();
                                }
                            } else if (readTag == 32) {
                                this.f20055i = codedInputStream.readUInt64();
                            } else if (readTag == 42) {
                                if (!this.f20056j.isModifiable()) {
                                    this.f20056j = GeneratedMessageLite.mutableCopy(this.f20056j);
                                }
                                this.f20056j.add(codedInputStream.readMessage(C7925i.parser(), extensionRegistryLite));
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
                if (f20050l == null) {
                    synchronized (C7915d.class) {
                        if (f20050l == null) {
                            f20050l = new DefaultInstanceBasedParser(f20049k);
                        }
                    }
                }
                return f20050l;
            default:
                throw new UnsupportedOperationException();
        }
        return f20049k;
    }

    public C6950b0 getCentroid() {
        C6950b0 b0Var = this.f20054h;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public long getId() {
        return this.f20055i;
    }

    public String getLabel() {
        return this.f20052f;
    }

    public ByteString getLabelBytes() {
        return ByteString.copyFromUtf8(this.f20052f);
    }

    public C7925i getParentZones(int i) {
        return (C7925i) this.f20056j.get(i);
    }

    public int getParentZonesCount() {
        return this.f20056j.size();
    }

    public List<C7925i> getParentZonesList() {
        return this.f20056j;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f20052f.isEmpty() ? CodedOutputStream.computeStringSize(1, getLabel()) + 0 : 0;
        if (this.f20053g != C7917e.UNUSED.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(2, this.f20053g);
        }
        if (this.f20054h != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(3, getCentroid());
        }
        long j = this.f20055i;
        if (j != 0) {
            computeStringSize += CodedOutputStream.computeUInt64Size(4, j);
        }
        for (int i2 = 0; i2 < this.f20056j.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f20056j.get(i2));
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public C7917e getType() {
        C7917e a = C7917e.m18960a(this.f20053g);
        return a == null ? C7917e.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f20053g;
    }

    public boolean hasCentroid() {
        return this.f20054h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20052f.isEmpty()) {
            codedOutputStream.writeString(1, getLabel());
        }
        if (this.f20053g != C7917e.UNUSED.getNumber()) {
            codedOutputStream.writeEnum(2, this.f20053g);
        }
        if (this.f20054h != null) {
            codedOutputStream.writeMessage(3, getCentroid());
        }
        long j = this.f20055i;
        if (j != 0) {
            codedOutputStream.writeUInt64(4, j);
        }
        for (int i = 0; i < this.f20056j.size(); i++) {
            codedOutputStream.writeMessage(5, (MessageLite) this.f20056j.get(i));
        }
    }
}
