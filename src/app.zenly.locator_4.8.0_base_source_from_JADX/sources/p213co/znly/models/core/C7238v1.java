package p213co.znly.models.core;

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

/* renamed from: co.znly.models.core.v1 */
public final class C7238v1 extends GeneratedMessageLite<C7238v1, C7239a> implements TileProto$TileUpdateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7238v1 f17959h = new C7238v1();

    /* renamed from: i */
    private static volatile Parser<C7238v1> f17960i;

    /* renamed from: e */
    private int f17961e;

    /* renamed from: f */
    private int f17962f;

    /* renamed from: g */
    private ProtobufList<C7228u1> f17963g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.v1$a */
    public static final class C7239a extends Builder<C7238v1, C7239a> implements TileProto$TileUpdateOrBuilder {
        /* synthetic */ C7239a(C7221t1 t1Var) {
            this();
        }

        public C7228u1 getTiles(int i) {
            return ((C7238v1) this.instance).getTiles(i);
        }

        public int getTilesCount() {
            return ((C7238v1) this.instance).getTilesCount();
        }

        public List<C7228u1> getTilesList() {
            return Collections.unmodifiableList(((C7238v1) this.instance).getTilesList());
        }

        public C7245w1 getType() {
            return ((C7238v1) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C7238v1) this.instance).getTypeValue();
        }

        private C7239a() {
            super(C7238v1.f17959h);
        }
    }

    static {
        f17959h.makeImmutable();
    }

    private C7238v1() {
    }

    public static C7239a newBuilder() {
        return (C7239a) f17959h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7221t1.f17910a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7238v1();
            case 2:
                return f17959h;
            case 3:
                this.f17963g.makeImmutable();
                return null;
            case 4:
                return new C7239a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7238v1 v1Var = (C7238v1) obj2;
                boolean z2 = this.f17962f != 0;
                int i = this.f17962f;
                if (v1Var.f17962f != 0) {
                    z = true;
                }
                this.f17962f = visitor.visitInt(z2, i, z, v1Var.f17962f);
                this.f17963g = visitor.visitList(this.f17963g, v1Var.f17963g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17961e |= v1Var.f17961e;
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
                                this.f17962f = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                if (!this.f17963g.isModifiable()) {
                                    this.f17963g = GeneratedMessageLite.mutableCopy(this.f17963g);
                                }
                                this.f17963g.add(codedInputStream.readMessage(C7228u1.parser(), extensionRegistryLite));
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
                if (f17960i == null) {
                    synchronized (C7238v1.class) {
                        if (f17960i == null) {
                            f17960i = new DefaultInstanceBasedParser(f17959h);
                        }
                    }
                }
                return f17960i;
            default:
                throw new UnsupportedOperationException();
        }
        return f17959h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeEnumSize = this.f17962f != C7245w1.ALL.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f17962f) + 0 : 0;
        for (int i2 = 0; i2 < this.f17963g.size(); i2++) {
            computeEnumSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f17963g.get(i2));
        }
        this.memoizedSerializedSize = computeEnumSize;
        return computeEnumSize;
    }

    public C7228u1 getTiles(int i) {
        return (C7228u1) this.f17963g.get(i);
    }

    public int getTilesCount() {
        return this.f17963g.size();
    }

    public List<C7228u1> getTilesList() {
        return this.f17963g;
    }

    public C7245w1 getType() {
        C7245w1 a = C7245w1.m17968a(this.f17962f);
        return a == null ? C7245w1.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f17962f;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17962f != C7245w1.ALL.getNumber()) {
            codedOutputStream.writeEnum(1, this.f17962f);
        }
        for (int i = 0; i < this.f17963g.size(); i++) {
            codedOutputStream.writeMessage(2, (MessageLite) this.f17963g.get(i));
        }
    }
}
