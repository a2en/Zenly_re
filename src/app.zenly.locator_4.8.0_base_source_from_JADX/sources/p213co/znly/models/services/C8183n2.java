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
import p213co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape;

/* renamed from: co.znly.models.services.n2 */
public final class C8183n2 extends GeneratedMessageLite<C8183n2, C8184a> implements ZenlyProto$FootstepsShapeResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8183n2 f20715f = new C8183n2();

    /* renamed from: g */
    private static volatile Parser<C8183n2> f20716g;

    /* renamed from: e */
    private ProtobufList<ReverseGeoCoderProto$Shape> f20717e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.n2$a */
    public static final class C8184a extends Builder<C8183n2, C8184a> implements ZenlyProto$FootstepsShapeResponseOrBuilder {
        private C8184a() {
            super(C8183n2.f20715f);
        }

        /* synthetic */ C8184a(C8104i0 i0Var) {
            this();
        }

        public ReverseGeoCoderProto$Shape getShapes(int i) {
            return ((C8183n2) this.instance).getShapes(i);
        }

        public int getShapesCount() {
            return ((C8183n2) this.instance).getShapesCount();
        }

        public List<ReverseGeoCoderProto$Shape> getShapesList() {
            return Collections.unmodifiableList(((C8183n2) this.instance).getShapesList());
        }
    }

    static {
        f20715f.makeImmutable();
    }

    private C8183n2() {
    }

    public static C8184a newBuilder() {
        return (C8184a) f20715f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8183n2();
            case 2:
                return f20715f;
            case 3:
                this.f20717e.makeImmutable();
                return null;
            case 4:
                return new C8184a(null);
            case 5:
                this.f20717e = ((Visitor) obj).visitList(this.f20717e, ((C8183n2) obj2).f20717e);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                if (!this.f20717e.isModifiable()) {
                                    this.f20717e = GeneratedMessageLite.mutableCopy(this.f20717e);
                                }
                                this.f20717e.add(codedInputStream.readMessage(ReverseGeoCoderProto$Shape.parser(), extensionRegistryLite));
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
                if (f20716g == null) {
                    synchronized (C8183n2.class) {
                        if (f20716g == null) {
                            f20716g = new DefaultInstanceBasedParser(f20715f);
                        }
                    }
                }
                return f20716g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20715f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20717e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20717e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public ReverseGeoCoderProto$Shape getShapes(int i) {
        return (ReverseGeoCoderProto$Shape) this.f20717e.get(i);
    }

    public int getShapesCount() {
        return this.f20717e.size();
    }

    public List<ReverseGeoCoderProto$Shape> getShapesList() {
        return this.f20717e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20717e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20717e.get(i));
        }
    }
}
