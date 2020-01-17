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

/* renamed from: co.znly.models.services.y4 */
public final class C8389y4 extends GeneratedMessageLite<C8389y4, C8390a> implements ZenlyProto$TimeTogetherMutualLoveHiddenResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8389y4 f21246f = new C8389y4();

    /* renamed from: g */
    private static volatile Parser<C8389y4> f21247g;

    /* renamed from: e */
    private ProtobufList<String> f21248e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.y4$a */
    public static final class C8390a extends Builder<C8389y4, C8390a> implements ZenlyProto$TimeTogetherMutualLoveHiddenResponseOrBuilder {
        private C8390a() {
            super(C8389y4.f21246f);
        }

        /* synthetic */ C8390a(C8104i0 i0Var) {
            this();
        }

        public String getUsers(int i) {
            return ((C8389y4) this.instance).getUsers(i);
        }

        public ByteString getUsersBytes(int i) {
            return ((C8389y4) this.instance).getUsersBytes(i);
        }

        public int getUsersCount() {
            return ((C8389y4) this.instance).getUsersCount();
        }

        public List<String> getUsersList() {
            return Collections.unmodifiableList(((C8389y4) this.instance).getUsersList());
        }
    }

    static {
        f21246f.makeImmutable();
    }

    private C8389y4() {
    }

    public static C8390a newBuilder() {
        return (C8390a) f21246f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8389y4();
            case 2:
                return f21246f;
            case 3:
                this.f21248e.makeImmutable();
                return null;
            case 4:
                return new C8390a(null);
            case 5:
                this.f21248e = ((Visitor) obj).visitList(this.f21248e, ((C8389y4) obj2).f21248e);
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
                                if (!this.f21248e.isModifiable()) {
                                    this.f21248e = GeneratedMessageLite.mutableCopy(this.f21248e);
                                }
                                this.f21248e.add(readStringRequireUtf8);
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
                if (f21247g == null) {
                    synchronized (C8389y4.class) {
                        if (f21247g == null) {
                            f21247g = new DefaultInstanceBasedParser(f21246f);
                        }
                    }
                }
                return f21247g;
            default:
                throw new UnsupportedOperationException();
        }
        return f21246f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f21248e.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f21248e.get(i3));
        }
        int size = 0 + i2 + (getUsersList().size() * 1);
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getUsers(int i) {
        return (String) this.f21248e.get(i);
    }

    public ByteString getUsersBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f21248e.get(i));
    }

    public int getUsersCount() {
        return this.f21248e.size();
    }

    public List<String> getUsersList() {
        return this.f21248e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f21248e.size(); i++) {
            codedOutputStream.writeString(1, (String) this.f21248e.get(i));
        }
    }
}
