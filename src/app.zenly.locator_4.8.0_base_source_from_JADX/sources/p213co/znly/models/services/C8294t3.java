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
import p213co.znly.models.C6978c2;

/* renamed from: co.znly.models.services.t3 */
public final class C8294t3 extends GeneratedMessageLite<C8294t3, C8295a> implements ZenlyProto$PersonalPlacesResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8294t3 f20963f = new C8294t3();

    /* renamed from: g */
    private static volatile Parser<C8294t3> f20964g;

    /* renamed from: e */
    private ProtobufList<C6978c2> f20965e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.t3$a */
    public static final class C8295a extends Builder<C8294t3, C8295a> implements ZenlyProto$PersonalPlacesResponseOrBuilder {
        /* synthetic */ C8295a(C8104i0 i0Var) {
            this();
        }

        public C6978c2 getPlaces(int i) {
            return ((C8294t3) this.instance).getPlaces(i);
        }

        public int getPlacesCount() {
            return ((C8294t3) this.instance).getPlacesCount();
        }

        public List<C6978c2> getPlacesList() {
            return Collections.unmodifiableList(((C8294t3) this.instance).getPlacesList());
        }

        private C8295a() {
            super(C8294t3.f20963f);
        }
    }

    static {
        f20963f.makeImmutable();
    }

    private C8294t3() {
    }

    public static C8295a newBuilder() {
        return (C8295a) f20963f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8294t3();
            case 2:
                return f20963f;
            case 3:
                this.f20965e.makeImmutable();
                return null;
            case 4:
                return new C8295a(null);
            case 5:
                this.f20965e = ((Visitor) obj).visitList(this.f20965e, ((C8294t3) obj2).f20965e);
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
                                if (!this.f20965e.isModifiable()) {
                                    this.f20965e = GeneratedMessageLite.mutableCopy(this.f20965e);
                                }
                                this.f20965e.add(codedInputStream.readMessage(C6978c2.parser(), extensionRegistryLite));
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
                if (f20964g == null) {
                    synchronized (C8294t3.class) {
                        if (f20964g == null) {
                            f20964g = new DefaultInstanceBasedParser(f20963f);
                        }
                    }
                }
                return f20964g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20963f;
    }

    public C6978c2 getPlaces(int i) {
        return (C6978c2) this.f20965e.get(i);
    }

    public int getPlacesCount() {
        return this.f20965e.size();
    }

    public List<C6978c2> getPlacesList() {
        return this.f20965e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20965e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20965e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20965e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20965e.get(i));
        }
    }
}
