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
import p213co.znly.models.nights.C7415d;
import p213co.znly.models.services.nights.C8194b;
import p213co.znly.models.services.nights.C8194b.C8195a;

/* renamed from: co.znly.models.services.o3 */
public final class C8208o3 extends GeneratedMessageLite<C8208o3, C8209a> implements ZenlyProto$NightsLocationsResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C8208o3 f20774i = new C8208o3();

    /* renamed from: j */
    private static volatile Parser<C8208o3> f20775j;

    /* renamed from: e */
    private int f20776e;

    /* renamed from: f */
    private ProtobufList<C7415d> f20777f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private int f20778g;

    /* renamed from: h */
    private C8194b f20779h;

    /* renamed from: co.znly.models.services.o3$a */
    public static final class C8209a extends Builder<C8208o3, C8209a> implements ZenlyProto$NightsLocationsResponseOrBuilder {
        private C8209a() {
            super(C8208o3.f20774i);
        }

        /* synthetic */ C8209a(C8104i0 i0Var) {
            this();
        }

        public C8194b getError() {
            return ((C8208o3) this.instance).getError();
        }

        public C7415d getLocations(int i) {
            return ((C8208o3) this.instance).getLocations(i);
        }

        public int getLocationsCount() {
            return ((C8208o3) this.instance).getLocationsCount();
        }

        public List<C7415d> getLocationsList() {
            return Collections.unmodifiableList(((C8208o3) this.instance).getLocationsList());
        }

        public int getNightsVersion() {
            return ((C8208o3) this.instance).getNightsVersion();
        }

        public boolean hasError() {
            return ((C8208o3) this.instance).hasError();
        }
    }

    static {
        f20774i.makeImmutable();
    }

    private C8208o3() {
    }

    public static C8209a newBuilder() {
        return (C8209a) f20774i.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8208o3();
            case 2:
                return f20774i;
            case 3:
                this.f20777f.makeImmutable();
                return null;
            case 4:
                return new C8209a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8208o3 o3Var = (C8208o3) obj2;
                this.f20777f = visitor.visitList(this.f20777f, o3Var.f20777f);
                boolean z2 = this.f20778g != 0;
                int i = this.f20778g;
                if (o3Var.f20778g != 0) {
                    z = true;
                }
                this.f20778g = visitor.visitInt(z2, i, z, o3Var.f20778g);
                this.f20779h = (C8194b) visitor.visitMessage(this.f20779h, o3Var.f20779h);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20776e |= o3Var.f20776e;
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
                                if (!this.f20777f.isModifiable()) {
                                    this.f20777f = GeneratedMessageLite.mutableCopy(this.f20777f);
                                }
                                this.f20777f.add(codedInputStream.readMessage(C7415d.parser(), extensionRegistryLite));
                            } else if (readTag == 16) {
                                this.f20778g = codedInputStream.readUInt32();
                            } else if (readTag == 1010) {
                                Builder builder = this.f20779h != null ? (C8195a) this.f20779h.toBuilder() : null;
                                this.f20779h = (C8194b) codedInputStream.readMessage(C8194b.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20779h);
                                    this.f20779h = (C8194b) builder.buildPartial();
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
                if (f20775j == null) {
                    synchronized (C8208o3.class) {
                        if (f20775j == null) {
                            f20775j = new DefaultInstanceBasedParser(f20774i);
                        }
                    }
                }
                return f20775j;
            default:
                throw new UnsupportedOperationException();
        }
        return f20774i;
    }

    public C8194b getError() {
        C8194b bVar = this.f20779h;
        return bVar == null ? C8194b.getDefaultInstance() : bVar;
    }

    public C7415d getLocations(int i) {
        return (C7415d) this.f20777f.get(i);
    }

    public int getLocationsCount() {
        return this.f20777f.size();
    }

    public List<C7415d> getLocationsList() {
        return this.f20777f;
    }

    public int getNightsVersion() {
        return this.f20778g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20777f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20777f.get(i3));
        }
        int i4 = this.f20778g;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeUInt32Size(2, i4);
        }
        if (this.f20779h != null) {
            i2 += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20779h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20777f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20777f.get(i));
        }
        int i2 = this.f20778g;
        if (i2 != 0) {
            codedOutputStream.writeUInt32(2, i2);
        }
        if (this.f20779h != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
