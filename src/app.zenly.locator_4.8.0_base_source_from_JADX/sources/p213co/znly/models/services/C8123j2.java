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

/* renamed from: co.znly.models.services.j2 */
public final class C8123j2 extends GeneratedMessageLite<C8123j2, C8124a> implements ZenlyProto$FootstepsLocalityAtResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8123j2 f20585f = new C8123j2();

    /* renamed from: g */
    private static volatile Parser<C8123j2> f20586g;

    /* renamed from: e */
    private ProtobufList<ReverseGeoCoderProto$Shape> f20587e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.j2$a */
    public static final class C8124a extends Builder<C8123j2, C8124a> implements ZenlyProto$FootstepsLocalityAtResponseOrBuilder {
        private C8124a() {
            super(C8123j2.f20585f);
        }

        /* synthetic */ C8124a(C8104i0 i0Var) {
            this();
        }

        public ReverseGeoCoderProto$Shape getLocalities(int i) {
            return ((C8123j2) this.instance).getLocalities(i);
        }

        public int getLocalitiesCount() {
            return ((C8123j2) this.instance).getLocalitiesCount();
        }

        public List<ReverseGeoCoderProto$Shape> getLocalitiesList() {
            return Collections.unmodifiableList(((C8123j2) this.instance).getLocalitiesList());
        }
    }

    static {
        f20585f.makeImmutable();
    }

    private C8123j2() {
    }

    public static C8124a newBuilder() {
        return (C8124a) f20585f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8123j2();
            case 2:
                return f20585f;
            case 3:
                this.f20587e.makeImmutable();
                return null;
            case 4:
                return new C8124a(null);
            case 5:
                this.f20587e = ((Visitor) obj).visitList(this.f20587e, ((C8123j2) obj2).f20587e);
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
                                if (!this.f20587e.isModifiable()) {
                                    this.f20587e = GeneratedMessageLite.mutableCopy(this.f20587e);
                                }
                                this.f20587e.add(codedInputStream.readMessage(ReverseGeoCoderProto$Shape.parser(), extensionRegistryLite));
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
                if (f20586g == null) {
                    synchronized (C8123j2.class) {
                        if (f20586g == null) {
                            f20586g = new DefaultInstanceBasedParser(f20585f);
                        }
                    }
                }
                return f20586g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20585f;
    }

    public ReverseGeoCoderProto$Shape getLocalities(int i) {
        return (ReverseGeoCoderProto$Shape) this.f20587e.get(i);
    }

    public int getLocalitiesCount() {
        return this.f20587e.size();
    }

    public List<ReverseGeoCoderProto$Shape> getLocalitiesList() {
        return this.f20587e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20587e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20587e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20587e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20587e.get(i));
        }
    }
}
