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

/* renamed from: co.znly.models.services.c3 */
public final class C8012c3 extends GeneratedMessageLite<C8012c3, C8013a> implements ZenlyProto$FriendSubscribeRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8012c3 f20333f = new C8012c3();

    /* renamed from: g */
    private static volatile Parser<C8012c3> f20334g;

    /* renamed from: e */
    private ProtobufList<String> f20335e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.c3$a */
    public static final class C8013a extends Builder<C8012c3, C8013a> implements ZenlyProto$FriendSubscribeRequestOrBuilder {
        /* synthetic */ C8013a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8013a mo22056a(String str) {
            copyOnWrite();
            ((C8012c3) this.instance).m19068a(str);
            return this;
        }

        public String getUuids(int i) {
            return ((C8012c3) this.instance).getUuids(i);
        }

        public ByteString getUuidsBytes(int i) {
            return ((C8012c3) this.instance).getUuidsBytes(i);
        }

        public int getUuidsCount() {
            return ((C8012c3) this.instance).getUuidsCount();
        }

        public List<String> getUuidsList() {
            return Collections.unmodifiableList(((C8012c3) this.instance).getUuidsList());
        }

        private C8013a() {
            super(C8012c3.f20333f);
        }
    }

    static {
        f20333f.makeImmutable();
    }

    private C8012c3() {
    }

    /* renamed from: b */
    private void m19069b() {
        if (!this.f20335e.isModifiable()) {
            this.f20335e = GeneratedMessageLite.mutableCopy(this.f20335e);
        }
    }

    public static C8013a newBuilder() {
        return (C8013a) f20333f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8012c3();
            case 2:
                return f20333f;
            case 3:
                this.f20335e.makeImmutable();
                return null;
            case 4:
                return new C8013a(null);
            case 5:
                this.f20335e = ((Visitor) obj).visitList(this.f20335e, ((C8012c3) obj2).f20335e);
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
                                if (!this.f20335e.isModifiable()) {
                                    this.f20335e = GeneratedMessageLite.mutableCopy(this.f20335e);
                                }
                                this.f20335e.add(readStringRequireUtf8);
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
                if (f20334g == null) {
                    synchronized (C8012c3.class) {
                        if (f20334g == null) {
                            f20334g = new DefaultInstanceBasedParser(f20333f);
                        }
                    }
                }
                return f20334g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20333f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20335e.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f20335e.get(i3));
        }
        int size = 0 + i2 + (getUuidsList().size() * 1);
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getUuids(int i) {
        return (String) this.f20335e.get(i);
    }

    public ByteString getUuidsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f20335e.get(i));
    }

    public int getUuidsCount() {
        return this.f20335e.size();
    }

    public List<String> getUuidsList() {
        return this.f20335e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20335e.size(); i++) {
            codedOutputStream.writeString(1, (String) this.f20335e.get(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19068a(String str) {
        if (str != null) {
            m19069b();
            this.f20335e.add(str);
            return;
        }
        throw new NullPointerException();
    }
}
