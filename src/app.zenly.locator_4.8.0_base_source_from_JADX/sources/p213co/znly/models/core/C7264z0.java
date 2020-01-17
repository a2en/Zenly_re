package p213co.znly.models.core;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.AbstractMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.core.z0 */
public final class C7264z0 extends GeneratedMessageLite<C7264z0, C7265a> implements DiscoverProto$DiscoverV1InterestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7264z0 f18014f = new C7264z0();

    /* renamed from: g */
    private static volatile Parser<C7264z0> f18015g;

    /* renamed from: e */
    private ProtobufList<String> f18016e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.z0$a */
    public static final class C7265a extends Builder<C7264z0, C7265a> implements DiscoverProto$DiscoverV1InterestOrBuilder {
        /* synthetic */ C7265a(C7257y0 y0Var) {
            this();
        }

        /* renamed from: a */
        public C7265a mo19190a(Iterable<String> iterable) {
            copyOnWrite();
            ((C7264z0) this.instance).m17977a(iterable);
            return this;
        }

        public String getFriends(int i) {
            return ((C7264z0) this.instance).getFriends(i);
        }

        public ByteString getFriendsBytes(int i) {
            return ((C7264z0) this.instance).getFriendsBytes(i);
        }

        public int getFriendsCount() {
            return ((C7264z0) this.instance).getFriendsCount();
        }

        public List<String> getFriendsList() {
            return Collections.unmodifiableList(((C7264z0) this.instance).getFriendsList());
        }

        private C7265a() {
            super(C7264z0.f18014f);
        }
    }

    static {
        f18014f.makeImmutable();
    }

    private C7264z0() {
    }

    public static C7265a newBuilder() {
        return (C7265a) f18014f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7257y0.f17997a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7264z0();
            case 2:
                return f18014f;
            case 3:
                this.f18016e.makeImmutable();
                return null;
            case 4:
                return new C7265a(null);
            case 5:
                this.f18016e = ((Visitor) obj).visitList(this.f18016e, ((C7264z0) obj2).f18016e);
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
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f18016e.isModifiable()) {
                                    this.f18016e = GeneratedMessageLite.mutableCopy(this.f18016e);
                                }
                                this.f18016e.add(readStringRequireUtf8);
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
                if (f18015g == null) {
                    synchronized (C7264z0.class) {
                        if (f18015g == null) {
                            f18015g = new DefaultInstanceBasedParser(f18014f);
                        }
                    }
                }
                return f18015g;
            default:
                throw new UnsupportedOperationException();
        }
        return f18014f;
    }

    public String getFriends(int i) {
        return (String) this.f18016e.get(i);
    }

    public ByteString getFriendsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f18016e.get(i));
    }

    public int getFriendsCount() {
        return this.f18016e.size();
    }

    public List<String> getFriendsList() {
        return this.f18016e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f18016e.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f18016e.get(i3));
        }
        int size = 0 + i2 + (getFriendsList().size() * 1);
        this.memoizedSerializedSize = size;
        return size;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f18016e.size(); i++) {
            codedOutputStream.writeString(1, (String) this.f18016e.get(i));
        }
    }

    /* renamed from: a */
    private void m17975a() {
        if (!this.f18016e.isModifiable()) {
            this.f18016e = GeneratedMessageLite.mutableCopy(this.f18016e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17977a(Iterable<String> iterable) {
        m17975a();
        AbstractMessageLite.addAll(iterable, this.f18016e);
    }
}
