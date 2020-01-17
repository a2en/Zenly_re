package p213co.znly.models;

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

/* renamed from: co.znly.models.c0 */
public final class C6975c0 extends GeneratedMessageLite<C6975c0, C6976a> implements GeometryProto$GeoPolylineOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C6975c0 f17206h = new C6975c0();

    /* renamed from: i */
    private static volatile Parser<C6975c0> f17207i;

    /* renamed from: e */
    private int f17208e;

    /* renamed from: f */
    private ProtobufList<C6950b0> f17209f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private boolean f17210g;

    /* renamed from: co.znly.models.c0$a */
    public static final class C6976a extends Builder<C6975c0, C6976a> implements GeometryProto$GeoPolylineOrBuilder {
        /* synthetic */ C6976a(C7514z zVar) {
            this();
        }

        public boolean getIsClosed() {
            return ((C6975c0) this.instance).getIsClosed();
        }

        public C6950b0 getPoints(int i) {
            return ((C6975c0) this.instance).getPoints(i);
        }

        public int getPointsCount() {
            return ((C6975c0) this.instance).getPointsCount();
        }

        public List<C6950b0> getPointsList() {
            return Collections.unmodifiableList(((C6975c0) this.instance).getPointsList());
        }

        private C6976a() {
            super(C6975c0.f17206h);
        }
    }

    static {
        f17206h.makeImmutable();
    }

    private C6975c0() {
    }

    public static C6975c0 getDefaultInstance() {
        return f17206h;
    }

    public static Parser<C6975c0> parser() {
        return f17206h.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7514z.f18877a[methodToInvoke.ordinal()]) {
            case 1:
                return new C6975c0();
            case 2:
                return f17206h;
            case 3:
                this.f17209f.makeImmutable();
                return null;
            case 4:
                return new C6976a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C6975c0 c0Var = (C6975c0) obj2;
                this.f17209f = visitor.visitList(this.f17209f, c0Var.f17209f);
                boolean z = this.f17210g;
                boolean z2 = c0Var.f17210g;
                this.f17210g = visitor.visitBoolean(z, z, z2, z2);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17208e |= c0Var.f17208e;
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
                            if (readTag == 10) {
                                if (!this.f17209f.isModifiable()) {
                                    this.f17209f = GeneratedMessageLite.mutableCopy(this.f17209f);
                                }
                                this.f17209f.add(codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite));
                            } else if (readTag == 16) {
                                this.f17210g = codedInputStream.readBool();
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
                if (f17207i == null) {
                    synchronized (C6975c0.class) {
                        if (f17207i == null) {
                            f17207i = new DefaultInstanceBasedParser(f17206h);
                        }
                    }
                }
                return f17207i;
            default:
                throw new UnsupportedOperationException();
        }
        return f17206h;
    }

    public boolean getIsClosed() {
        return this.f17210g;
    }

    public C6950b0 getPoints(int i) {
        return (C6950b0) this.f17209f.get(i);
    }

    public int getPointsCount() {
        return this.f17209f.size();
    }

    public List<C6950b0> getPointsList() {
        return this.f17209f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17209f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17209f.get(i3));
        }
        boolean z = this.f17210g;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(2, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17209f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17209f.get(i));
        }
        boolean z = this.f17210g;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
    }
}
