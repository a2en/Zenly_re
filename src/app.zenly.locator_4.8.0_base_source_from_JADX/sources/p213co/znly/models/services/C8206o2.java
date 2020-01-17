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
import p213co.znly.models.footsteps.C7305b;

/* renamed from: co.znly.models.services.o2 */
public final class C8206o2 extends GeneratedMessageLite<C8206o2, C8207a> implements ZenlyProto$FootstepsVisitedLocalitiesResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8206o2 f20769h = new C8206o2();

    /* renamed from: i */
    private static volatile Parser<C8206o2> f20770i;

    /* renamed from: e */
    private int f20771e;

    /* renamed from: f */
    private ProtobufList<C7305b> f20772f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private int f20773g;

    /* renamed from: co.znly.models.services.o2$a */
    public static final class C8207a extends Builder<C8206o2, C8207a> implements ZenlyProto$FootstepsVisitedLocalitiesResponseOrBuilder {
        private C8207a() {
            super(C8206o2.f20769h);
        }

        /* synthetic */ C8207a(C8104i0 i0Var) {
            this();
        }

        public int getGeodataVersion() {
            return ((C8206o2) this.instance).getGeodataVersion();
        }

        public C7305b getLocalities(int i) {
            return ((C8206o2) this.instance).getLocalities(i);
        }

        public int getLocalitiesCount() {
            return ((C8206o2) this.instance).getLocalitiesCount();
        }

        public List<C7305b> getLocalitiesList() {
            return Collections.unmodifiableList(((C8206o2) this.instance).getLocalitiesList());
        }
    }

    static {
        f20769h.makeImmutable();
    }

    private C8206o2() {
    }

    public static C8207a newBuilder() {
        return (C8207a) f20769h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8206o2();
            case 2:
                return f20769h;
            case 3:
                this.f20772f.makeImmutable();
                return null;
            case 4:
                return new C8207a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8206o2 o2Var = (C8206o2) obj2;
                this.f20772f = visitor.visitList(this.f20772f, o2Var.f20772f);
                boolean z2 = this.f20773g != 0;
                int i = this.f20773g;
                if (o2Var.f20773g != 0) {
                    z = true;
                }
                this.f20773g = visitor.visitInt(z2, i, z, o2Var.f20773g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20771e |= o2Var.f20771e;
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
                                if (!this.f20772f.isModifiable()) {
                                    this.f20772f = GeneratedMessageLite.mutableCopy(this.f20772f);
                                }
                                this.f20772f.add(codedInputStream.readMessage(C7305b.parser(), extensionRegistryLite));
                            } else if (readTag == 16) {
                                this.f20773g = codedInputStream.readUInt32();
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
                if (f20770i == null) {
                    synchronized (C8206o2.class) {
                        if (f20770i == null) {
                            f20770i = new DefaultInstanceBasedParser(f20769h);
                        }
                    }
                }
                return f20770i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20769h;
    }

    public int getGeodataVersion() {
        return this.f20773g;
    }

    public C7305b getLocalities(int i) {
        return (C7305b) this.f20772f.get(i);
    }

    public int getLocalitiesCount() {
        return this.f20772f.size();
    }

    public List<C7305b> getLocalitiesList() {
        return this.f20772f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20772f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20772f.get(i3));
        }
        int i4 = this.f20773g;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeUInt32Size(2, i4);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20772f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20772f.get(i));
        }
        int i2 = this.f20773g;
        if (i2 != 0) {
            codedOutputStream.writeUInt32(2, i2);
        }
    }
}
