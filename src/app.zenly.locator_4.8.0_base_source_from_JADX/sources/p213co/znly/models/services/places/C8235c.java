package p213co.znly.models.services.places;

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
import p213co.znly.models.places.C7879f;

/* renamed from: co.znly.models.services.places.c */
public final class C8235c extends GeneratedMessageLite<C8235c, C8236a> implements PlaceProto$PlaceUserIsProbablyInResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8235c f20836f = new C8235c();

    /* renamed from: g */
    private static volatile Parser<C8235c> f20837g;

    /* renamed from: e */
    private ProtobufList<C7879f> f20838e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.places.c$a */
    public static final class C8236a extends Builder<C8235c, C8236a> implements PlaceProto$PlaceUserIsProbablyInResponseOrBuilder {
        /* synthetic */ C8236a(C8232a aVar) {
            this();
        }

        public C7879f getPlaces(int i) {
            return ((C8235c) this.instance).getPlaces(i);
        }

        public int getPlacesCount() {
            return ((C8235c) this.instance).getPlacesCount();
        }

        public List<C7879f> getPlacesList() {
            return Collections.unmodifiableList(((C8235c) this.instance).getPlacesList());
        }

        private C8236a() {
            super(C8235c.f20836f);
        }
    }

    static {
        f20836f.makeImmutable();
    }

    private C8235c() {
    }

    public static C8236a newBuilder() {
        return (C8236a) f20836f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8232a.f20830a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8235c();
            case 2:
                return f20836f;
            case 3:
                this.f20838e.makeImmutable();
                return null;
            case 4:
                return new C8236a(null);
            case 5:
                this.f20838e = ((Visitor) obj).visitList(this.f20838e, ((C8235c) obj2).f20838e);
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
                                if (!this.f20838e.isModifiable()) {
                                    this.f20838e = GeneratedMessageLite.mutableCopy(this.f20838e);
                                }
                                this.f20838e.add(codedInputStream.readMessage(C7879f.parser(), extensionRegistryLite));
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
                if (f20837g == null) {
                    synchronized (C8235c.class) {
                        if (f20837g == null) {
                            f20837g = new DefaultInstanceBasedParser(f20836f);
                        }
                    }
                }
                return f20837g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20836f;
    }

    public C7879f getPlaces(int i) {
        return (C7879f) this.f20838e.get(i);
    }

    public int getPlacesCount() {
        return this.f20838e.size();
    }

    public List<C7879f> getPlacesList() {
        return this.f20838e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20838e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20838e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20838e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20838e.get(i));
        }
    }
}
