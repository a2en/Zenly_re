package p213co.znly.models;

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

/* renamed from: co.znly.models.e2 */
public final class C7286e2 extends GeneratedMessageLite<C7286e2, C7287a> implements PlaceProto$PlacesOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7286e2 f18087h = new C7286e2();

    /* renamed from: i */
    private static volatile Parser<C7286e2> f18088i;

    /* renamed from: e */
    private int f18089e;

    /* renamed from: f */
    private String f18090f = "";

    /* renamed from: g */
    private ProtobufList<PlaceProto$Place> f18091g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.e2$a */
    public static final class C7287a extends Builder<C7286e2, C7287a> implements PlaceProto$PlacesOrBuilder {
        /* synthetic */ C7287a(C6946a2 a2Var) {
            this();
        }

        public PlaceProto$Place getPlace(int i) {
            return ((C7286e2) this.instance).getPlace(i);
        }

        public int getPlaceCount() {
            return ((C7286e2) this.instance).getPlaceCount();
        }

        public List<PlaceProto$Place> getPlaceList() {
            return Collections.unmodifiableList(((C7286e2) this.instance).getPlaceList());
        }

        public String getUserUuid() {
            return ((C7286e2) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7286e2) this.instance).getUserUuidBytes();
        }

        private C7287a() {
            super(C7286e2.f18087h);
        }
    }

    static {
        f18087h.makeImmutable();
    }

    private C7286e2() {
    }

    public static C7287a newBuilder() {
        return (C7287a) f18087h.toBuilder();
    }

    public static Parser<C7286e2> parser() {
        return f18087h.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C6946a2.f17113a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7286e2();
            case 2:
                return f18087h;
            case 3:
                this.f18091g.makeImmutable();
                return null;
            case 4:
                return new C7287a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7286e2 e2Var = (C7286e2) obj2;
                this.f18090f = visitor.visitString(!this.f18090f.isEmpty(), this.f18090f, true ^ e2Var.f18090f.isEmpty(), e2Var.f18090f);
                this.f18091g = visitor.visitList(this.f18091g, e2Var.f18091g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18089e |= e2Var.f18089e;
                }
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
                                this.f18090f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                if (!this.f18091g.isModifiable()) {
                                    this.f18091g = GeneratedMessageLite.mutableCopy(this.f18091g);
                                }
                                this.f18091g.add(codedInputStream.readMessage(PlaceProto$Place.parser(), extensionRegistryLite));
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
                if (f18088i == null) {
                    synchronized (C7286e2.class) {
                        if (f18088i == null) {
                            f18088i = new DefaultInstanceBasedParser(f18087h);
                        }
                    }
                }
                return f18088i;
            default:
                throw new UnsupportedOperationException();
        }
        return f18087h;
    }

    public PlaceProto$Place getPlace(int i) {
        return (PlaceProto$Place) this.f18091g.get(i);
    }

    public int getPlaceCount() {
        return this.f18091g.size();
    }

    public List<PlaceProto$Place> getPlaceList() {
        return this.f18091g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f18090f.isEmpty() ? CodedOutputStream.computeStringSize(1, getUserUuid()) + 0 : 0;
        for (int i2 = 0; i2 < this.f18091g.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f18091g.get(i2));
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public String getUserUuid() {
        return this.f18090f;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f18090f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18090f.isEmpty()) {
            codedOutputStream.writeString(1, getUserUuid());
        }
        for (int i = 0; i < this.f18091g.size(); i++) {
            codedOutputStream.writeMessage(2, (MessageLite) this.f18091g.get(i));
        }
    }
}
