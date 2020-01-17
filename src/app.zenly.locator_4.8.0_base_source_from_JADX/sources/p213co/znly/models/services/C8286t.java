package p213co.znly.models.services;

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
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.services.t */
public final class C8286t extends GeneratedMessageLite<C8286t, C8287a> implements TimeTogetherProto$GatheringResponse$GatheringOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8286t f20947f = new C8286t();

    /* renamed from: g */
    private static volatile Parser<C8286t> f20948g;

    /* renamed from: e */
    private ProtobufList<String> f20949e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.t$a */
    public static final class C8287a extends Builder<C8286t, C8287a> implements TimeTogetherProto$GatheringResponse$GatheringOrBuilder {
        /* synthetic */ C8287a(C8251r rVar) {
            this();
        }

        public String getFriends(int i) {
            return ((C8286t) this.instance).getFriends(i);
        }

        public ByteString getFriendsBytes(int i) {
            return ((C8286t) this.instance).getFriendsBytes(i);
        }

        public int getFriendsCount() {
            return ((C8286t) this.instance).getFriendsCount();
        }

        public List<String> getFriendsList() {
            return Collections.unmodifiableList(((C8286t) this.instance).getFriendsList());
        }

        private C8287a() {
            super(C8286t.f20947f);
        }
    }

    static {
        f20947f.makeImmutable();
    }

    private C8286t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8251r.f20865a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8286t();
            case 2:
                return f20947f;
            case 3:
                this.f20949e.makeImmutable();
                return null;
            case 4:
                return new C8287a(null);
            case 5:
                this.f20949e = ((Visitor) obj).visitList(this.f20949e, ((C8286t) obj2).f20949e);
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
                                if (!this.f20949e.isModifiable()) {
                                    this.f20949e = GeneratedMessageLite.mutableCopy(this.f20949e);
                                }
                                this.f20949e.add(readStringRequireUtf8);
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
                if (f20948g == null) {
                    synchronized (C8286t.class) {
                        if (f20948g == null) {
                            f20948g = new DefaultInstanceBasedParser(f20947f);
                        }
                    }
                }
                return f20948g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20947f;
    }

    public String getFriends(int i) {
        return (String) this.f20949e.get(i);
    }

    public ByteString getFriendsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f20949e.get(i));
    }

    public int getFriendsCount() {
        return this.f20949e.size();
    }

    public List<String> getFriendsList() {
        return this.f20949e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20949e.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f20949e.get(i3));
        }
        int size = 0 + i2 + (getFriendsList().size() * 1);
        this.memoizedSerializedSize = size;
        return size;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20949e.size(); i++) {
            codedOutputStream.writeString(1, (String) this.f20949e.get(i));
        }
    }
}
