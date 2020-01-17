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
import p213co.znly.models.C7286e2;

/* renamed from: co.znly.models.core.n1 */
public final class C7172n1 extends GeneratedMessageLite<C7172n1, C7173a> implements StatesProto$PlacesStateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7172n1 f17760f = new C7172n1();

    /* renamed from: g */
    private static volatile Parser<C7172n1> f17761g;

    /* renamed from: e */
    private ProtobufList<C7286e2> f17762e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.n1$a */
    public static final class C7173a extends Builder<C7172n1, C7173a> implements StatesProto$PlacesStateOrBuilder {
        /* synthetic */ C7173a(C7137k1 k1Var) {
            this();
        }

        public C7286e2 getPlaces(int i) {
            return ((C7172n1) this.instance).getPlaces(i);
        }

        public int getPlacesCount() {
            return ((C7172n1) this.instance).getPlacesCount();
        }

        public List<C7286e2> getPlacesList() {
            return Collections.unmodifiableList(((C7172n1) this.instance).getPlacesList());
        }

        private C7173a() {
            super(C7172n1.f17760f);
        }
    }

    static {
        f17760f.makeImmutable();
    }

    private C7172n1() {
    }

    public static C7173a newBuilder() {
        return (C7173a) f17760f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7172n1();
            case 2:
                return f17760f;
            case 3:
                this.f17762e.makeImmutable();
                return null;
            case 4:
                return new C7173a(null);
            case 5:
                this.f17762e = ((Visitor) obj).visitList(this.f17762e, ((C7172n1) obj2).f17762e);
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
                                if (!this.f17762e.isModifiable()) {
                                    this.f17762e = GeneratedMessageLite.mutableCopy(this.f17762e);
                                }
                                this.f17762e.add(codedInputStream.readMessage(C7286e2.parser(), extensionRegistryLite));
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
                if (f17761g == null) {
                    synchronized (C7172n1.class) {
                        if (f17761g == null) {
                            f17761g = new DefaultInstanceBasedParser(f17760f);
                        }
                    }
                }
                return f17761g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17760f;
    }

    public C7286e2 getPlaces(int i) {
        return (C7286e2) this.f17762e.get(i);
    }

    public int getPlacesCount() {
        return this.f17762e.size();
    }

    public List<C7286e2> getPlacesList() {
        return this.f17762e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17762e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17762e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17762e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17762e.get(i));
        }
    }
}
