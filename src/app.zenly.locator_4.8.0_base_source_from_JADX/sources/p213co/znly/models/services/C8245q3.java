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
import p213co.znly.models.nights.C7421f;
import p213co.znly.models.services.nights.C8194b;
import p213co.znly.models.services.nights.C8194b.C8195a;

/* renamed from: co.znly.models.services.q3 */
public final class C8245q3 extends GeneratedMessageLite<C8245q3, C8246a> implements ZenlyProto$NightsStayResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C8245q3 f20851i = new C8245q3();

    /* renamed from: j */
    private static volatile Parser<C8245q3> f20852j;

    /* renamed from: e */
    private int f20853e;

    /* renamed from: f */
    private ProtobufList<C7421f> f20854f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private int f20855g;

    /* renamed from: h */
    private C8194b f20856h;

    /* renamed from: co.znly.models.services.q3$a */
    public static final class C8246a extends Builder<C8245q3, C8246a> implements ZenlyProto$NightsStayResponseOrBuilder {
        private C8246a() {
            super(C8245q3.f20851i);
        }

        /* synthetic */ C8246a(C8104i0 i0Var) {
            this();
        }

        public C8194b getError() {
            return ((C8245q3) this.instance).getError();
        }

        public C7421f getNights(int i) {
            return ((C8245q3) this.instance).getNights(i);
        }

        public int getNightsCount() {
            return ((C8245q3) this.instance).getNightsCount();
        }

        public List<C7421f> getNightsList() {
            return Collections.unmodifiableList(((C8245q3) this.instance).getNightsList());
        }

        public int getNightsVersion() {
            return ((C8245q3) this.instance).getNightsVersion();
        }

        public boolean hasError() {
            return ((C8245q3) this.instance).hasError();
        }
    }

    static {
        f20851i.makeImmutable();
    }

    private C8245q3() {
    }

    public static C8246a newBuilder() {
        return (C8246a) f20851i.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8245q3();
            case 2:
                return f20851i;
            case 3:
                this.f20854f.makeImmutable();
                return null;
            case 4:
                return new C8246a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8245q3 q3Var = (C8245q3) obj2;
                this.f20854f = visitor.visitList(this.f20854f, q3Var.f20854f);
                boolean z2 = this.f20855g != 0;
                int i = this.f20855g;
                if (q3Var.f20855g != 0) {
                    z = true;
                }
                this.f20855g = visitor.visitInt(z2, i, z, q3Var.f20855g);
                this.f20856h = (C8194b) visitor.visitMessage(this.f20856h, q3Var.f20856h);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20853e |= q3Var.f20853e;
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
                                if (!this.f20854f.isModifiable()) {
                                    this.f20854f = GeneratedMessageLite.mutableCopy(this.f20854f);
                                }
                                this.f20854f.add(codedInputStream.readMessage(C7421f.parser(), extensionRegistryLite));
                            } else if (readTag == 16) {
                                this.f20855g = codedInputStream.readUInt32();
                            } else if (readTag == 1010) {
                                Builder builder = this.f20856h != null ? (C8195a) this.f20856h.toBuilder() : null;
                                this.f20856h = (C8194b) codedInputStream.readMessage(C8194b.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20856h);
                                    this.f20856h = (C8194b) builder.buildPartial();
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
                if (f20852j == null) {
                    synchronized (C8245q3.class) {
                        if (f20852j == null) {
                            f20852j = new DefaultInstanceBasedParser(f20851i);
                        }
                    }
                }
                return f20852j;
            default:
                throw new UnsupportedOperationException();
        }
        return f20851i;
    }

    public C8194b getError() {
        C8194b bVar = this.f20856h;
        return bVar == null ? C8194b.getDefaultInstance() : bVar;
    }

    public C7421f getNights(int i) {
        return (C7421f) this.f20854f.get(i);
    }

    public int getNightsCount() {
        return this.f20854f.size();
    }

    public List<C7421f> getNightsList() {
        return this.f20854f;
    }

    public int getNightsVersion() {
        return this.f20855g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20854f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20854f.get(i3));
        }
        int i4 = this.f20855g;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeUInt32Size(2, i4);
        }
        if (this.f20856h != null) {
            i2 += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20856h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20854f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20854f.get(i));
        }
        int i2 = this.f20855g;
        if (i2 != 0) {
            codedOutputStream.writeUInt32(2, i2);
        }
        if (this.f20856h != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
