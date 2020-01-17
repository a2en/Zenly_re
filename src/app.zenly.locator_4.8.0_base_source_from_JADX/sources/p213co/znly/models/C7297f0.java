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

/* renamed from: co.znly.models.f0 */
public final class C7297f0 extends GeneratedMessageLite<C7297f0, C7298a> implements GeometryProto$ShapeOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7297f0 f18115f = new C7297f0();

    /* renamed from: g */
    private static volatile Parser<C7297f0> f18116g;

    /* renamed from: e */
    private ProtobufList<C6975c0> f18117e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.f0$a */
    public static final class C7298a extends Builder<C7297f0, C7298a> implements GeometryProto$ShapeOrBuilder {
        /* synthetic */ C7298a(C7514z zVar) {
            this();
        }

        public C6975c0 getShape(int i) {
            return ((C7297f0) this.instance).getShape(i);
        }

        public int getShapeCount() {
            return ((C7297f0) this.instance).getShapeCount();
        }

        public List<C6975c0> getShapeList() {
            return Collections.unmodifiableList(((C7297f0) this.instance).getShapeList());
        }

        private C7298a() {
            super(C7297f0.f18115f);
        }
    }

    static {
        f18115f.makeImmutable();
    }

    private C7297f0() {
    }

    public static C7297f0 getDefaultInstance() {
        return f18115f;
    }

    public static Parser<C7297f0> parser() {
        return f18115f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7514z.f18877a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7297f0();
            case 2:
                return f18115f;
            case 3:
                this.f18117e.makeImmutable();
                return null;
            case 4:
                return new C7298a(null);
            case 5:
                this.f18117e = ((Visitor) obj).visitList(this.f18117e, ((C7297f0) obj2).f18117e);
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
                                if (!this.f18117e.isModifiable()) {
                                    this.f18117e = GeneratedMessageLite.mutableCopy(this.f18117e);
                                }
                                this.f18117e.add(codedInputStream.readMessage(C6975c0.parser(), extensionRegistryLite));
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
                if (f18116g == null) {
                    synchronized (C7297f0.class) {
                        if (f18116g == null) {
                            f18116g = new DefaultInstanceBasedParser(f18115f);
                        }
                    }
                }
                return f18116g;
            default:
                throw new UnsupportedOperationException();
        }
        return f18115f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f18117e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f18117e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C6975c0 getShape(int i) {
        return (C6975c0) this.f18117e.get(i);
    }

    public int getShapeCount() {
        return this.f18117e.size();
    }

    public List<C6975c0> getShapeList() {
        return this.f18117e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f18117e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f18117e.get(i));
        }
    }
}
