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

/* renamed from: co.znly.models.core.j1 */
public final class C7129j1 extends GeneratedMessageLite<C7129j1, C7130a> implements PinContextUIProto$PinContextUIOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7129j1 f17657f = new C7129j1();

    /* renamed from: g */
    private static volatile Parser<C7129j1> f17658g;

    /* renamed from: e */
    private ProtobufList<PinContextUIProto$PinContext> f17659e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.j1$a */
    public static final class C7130a extends Builder<C7129j1, C7130a> implements PinContextUIProto$PinContextUIOrBuilder {
        /* synthetic */ C7130a(C7122i1 i1Var) {
            this();
        }

        public PinContextUIProto$PinContext getPinContexts(int i) {
            return ((C7129j1) this.instance).getPinContexts(i);
        }

        public int getPinContextsCount() {
            return ((C7129j1) this.instance).getPinContextsCount();
        }

        public List<PinContextUIProto$PinContext> getPinContextsList() {
            return Collections.unmodifiableList(((C7129j1) this.instance).getPinContextsList());
        }

        private C7130a() {
            super(C7129j1.f17657f);
        }
    }

    static {
        f17657f.makeImmutable();
    }

    private C7129j1() {
    }

    public static C7130a newBuilder() {
        return (C7130a) f17657f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7122i1.f17645a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7129j1();
            case 2:
                return f17657f;
            case 3:
                this.f17659e.makeImmutable();
                return null;
            case 4:
                return new C7130a(null);
            case 5:
                this.f17659e = ((Visitor) obj).visitList(this.f17659e, ((C7129j1) obj2).f17659e);
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
                                if (!this.f17659e.isModifiable()) {
                                    this.f17659e = GeneratedMessageLite.mutableCopy(this.f17659e);
                                }
                                this.f17659e.add(codedInputStream.readMessage(PinContextUIProto$PinContext.parser(), extensionRegistryLite));
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
                if (f17658g == null) {
                    synchronized (C7129j1.class) {
                        if (f17658g == null) {
                            f17658g = new DefaultInstanceBasedParser(f17657f);
                        }
                    }
                }
                return f17658g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17657f;
    }

    public PinContextUIProto$PinContext getPinContexts(int i) {
        return (PinContextUIProto$PinContext) this.f17659e.get(i);
    }

    public int getPinContextsCount() {
        return this.f17659e.size();
    }

    public List<PinContextUIProto$PinContext> getPinContextsList() {
        return this.f17659e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17659e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17659e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17659e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17659e.get(i));
        }
    }
}
