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

/* renamed from: co.znly.models.services.k0 */
public final class C8135k0 extends GeneratedMessageLite<C8135k0, C8136a> implements ZenlyProto$BestFriendsHiddenResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8135k0 f20608f = new C8135k0();

    /* renamed from: g */
    private static volatile Parser<C8135k0> f20609g;

    /* renamed from: e */
    private ProtobufList<String> f20610e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.k0$a */
    public static final class C8136a extends Builder<C8135k0, C8136a> implements ZenlyProto$BestFriendsHiddenResponseOrBuilder {
        private C8136a() {
            super(C8135k0.f20608f);
        }

        /* synthetic */ C8136a(C8104i0 i0Var) {
            this();
        }

        public String getUsers(int i) {
            return ((C8135k0) this.instance).getUsers(i);
        }

        public ByteString getUsersBytes(int i) {
            return ((C8135k0) this.instance).getUsersBytes(i);
        }

        public int getUsersCount() {
            return ((C8135k0) this.instance).getUsersCount();
        }

        public List<String> getUsersList() {
            return Collections.unmodifiableList(((C8135k0) this.instance).getUsersList());
        }
    }

    static {
        f20608f.makeImmutable();
    }

    private C8135k0() {
    }

    public static C8136a newBuilder() {
        return (C8136a) f20608f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8135k0();
            case 2:
                return f20608f;
            case 3:
                this.f20610e.makeImmutable();
                return null;
            case 4:
                return new C8136a(null);
            case 5:
                this.f20610e = ((Visitor) obj).visitList(this.f20610e, ((C8135k0) obj2).f20610e);
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
                                if (!this.f20610e.isModifiable()) {
                                    this.f20610e = GeneratedMessageLite.mutableCopy(this.f20610e);
                                }
                                this.f20610e.add(readStringRequireUtf8);
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
                if (f20609g == null) {
                    synchronized (C8135k0.class) {
                        if (f20609g == null) {
                            f20609g = new DefaultInstanceBasedParser(f20608f);
                        }
                    }
                }
                return f20609g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20608f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20610e.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f20610e.get(i3));
        }
        int size = 0 + i2 + (getUsersList().size() * 1);
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getUsers(int i) {
        return (String) this.f20610e.get(i);
    }

    public ByteString getUsersBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f20610e.get(i));
    }

    public int getUsersCount() {
        return this.f20610e.size();
    }

    public List<String> getUsersList() {
        return this.f20610e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20610e.size(); i++) {
            codedOutputStream.writeString(1, (String) this.f20610e.get(i));
        }
    }
}
