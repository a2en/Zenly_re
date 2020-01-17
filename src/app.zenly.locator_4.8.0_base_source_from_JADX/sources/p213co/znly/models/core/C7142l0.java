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

/* renamed from: co.znly.models.core.l0 */
public final class C7142l0 extends GeneratedMessageLite<C7142l0, C7143a> implements CoreRecommendationsProto$RecoPotentialMatchesResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7142l0 f17690h = new C7142l0();

    /* renamed from: i */
    private static volatile Parser<C7142l0> f17691i;

    /* renamed from: e */
    private int f17692e;

    /* renamed from: f */
    private boolean f17693f;

    /* renamed from: g */
    private ProtobufList<C7127j0> f17694g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.l0$a */
    public static final class C7143a extends Builder<C7142l0, C7143a> implements CoreRecommendationsProto$RecoPotentialMatchesResponseOrBuilder {
        /* synthetic */ C7143a(C7121i0 i0Var) {
            this();
        }

        public C7127j0 getPotentialMatches(int i) {
            return ((C7142l0) this.instance).getPotentialMatches(i);
        }

        public int getPotentialMatchesCount() {
            return ((C7142l0) this.instance).getPotentialMatchesCount();
        }

        public List<C7127j0> getPotentialMatchesList() {
            return Collections.unmodifiableList(((C7142l0) this.instance).getPotentialMatchesList());
        }

        public boolean getShouldMakeRecommendations() {
            return ((C7142l0) this.instance).getShouldMakeRecommendations();
        }

        private C7143a() {
            super(C7142l0.f17690h);
        }
    }

    static {
        f17690h.makeImmutable();
    }

    private C7142l0() {
    }

    public static C7143a newBuilder() {
        return (C7143a) f17690h.toBuilder();
    }

    /* renamed from: a */
    public List<? extends CoreRecommendationsProto$PotentialMatchOrBuilder> mo19125a() {
        return this.f17694g;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7121i0.f17644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7142l0();
            case 2:
                return f17690h;
            case 3:
                this.f17694g.makeImmutable();
                return null;
            case 4:
                return new C7143a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7142l0 l0Var = (C7142l0) obj2;
                boolean z = this.f17693f;
                boolean z2 = l0Var.f17693f;
                this.f17693f = visitor.visitBoolean(z, z, z2, z2);
                this.f17694g = visitor.visitList(this.f17694g, l0Var.f17694g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17692e |= l0Var.f17692e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f17693f = codedInputStream.readBool();
                            } else if (readTag == 18) {
                                if (!this.f17694g.isModifiable()) {
                                    this.f17694g = GeneratedMessageLite.mutableCopy(this.f17694g);
                                }
                                this.f17694g.add(codedInputStream.readMessage(C7127j0.parser(), extensionRegistryLite));
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z3 = true;
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
                if (f17691i == null) {
                    synchronized (C7142l0.class) {
                        if (f17691i == null) {
                            f17691i = new DefaultInstanceBasedParser(f17690h);
                        }
                    }
                }
                return f17691i;
            default:
                throw new UnsupportedOperationException();
        }
        return f17690h;
    }

    public C7127j0 getPotentialMatches(int i) {
        return (C7127j0) this.f17694g.get(i);
    }

    public int getPotentialMatchesCount() {
        return this.f17694g.size();
    }

    public List<C7127j0> getPotentialMatchesList() {
        return this.f17694g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        boolean z = this.f17693f;
        int computeBoolSize = z ? CodedOutputStream.computeBoolSize(1, z) + 0 : 0;
        for (int i2 = 0; i2 < this.f17694g.size(); i2++) {
            computeBoolSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f17694g.get(i2));
        }
        this.memoizedSerializedSize = computeBoolSize;
        return computeBoolSize;
    }

    public boolean getShouldMakeRecommendations() {
        return this.f17693f;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z = this.f17693f;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
        for (int i = 0; i < this.f17694g.size(); i++) {
            codedOutputStream.writeMessage(2, (MessageLite) this.f17694g.get(i));
        }
    }
}
