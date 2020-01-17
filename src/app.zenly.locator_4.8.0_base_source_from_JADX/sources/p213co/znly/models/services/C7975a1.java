package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.services.a1 */
public final class C7975a1 extends GeneratedMessageLite<C7975a1, C7976a> implements ZenlyProto$ChatConversationsSearchStreamRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7975a1 f20249h = new C7975a1();

    /* renamed from: i */
    private static volatile Parser<C7975a1> f20250i;

    /* renamed from: e */
    private String f20251e = "";

    /* renamed from: f */
    private int f20252f;

    /* renamed from: g */
    private int f20253g;

    /* renamed from: co.znly.models.services.a1$a */
    public static final class C7976a extends Builder<C7975a1, C7976a> implements ZenlyProto$ChatConversationsSearchStreamRequestOrBuilder {
        private C7976a() {
            super(C7975a1.f20249h);
        }

        /* synthetic */ C7976a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C7976a mo22051a(int i) {
            copyOnWrite();
            ((C7975a1) this.instance).m19037a(i);
            return this;
        }

        /* renamed from: a */
        public C7976a mo22052a(String str) {
            copyOnWrite();
            ((C7975a1) this.instance).m19040a(str);
            return this;
        }

        public int getLimit() {
            return ((C7975a1) this.instance).getLimit();
        }

        public int getOffset() {
            return ((C7975a1) this.instance).getOffset();
        }

        public String getSearch() {
            return ((C7975a1) this.instance).getSearch();
        }

        public ByteString getSearchBytes() {
            return ((C7975a1) this.instance).getSearchBytes();
        }
    }

    static {
        f20249h.makeImmutable();
    }

    private C7975a1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19037a(int i) {
        this.f20252f = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19040a(String str) {
        if (str != null) {
            this.f20251e = str;
            return;
        }
        throw new NullPointerException();
    }

    public static C7976a newBuilder() {
        return (C7976a) f20249h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7975a1();
            case 2:
                return f20249h;
            case 3:
                return null;
            case 4:
                return new C7976a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7975a1 a1Var = (C7975a1) obj2;
                this.f20251e = visitor.visitString(!this.f20251e.isEmpty(), this.f20251e, !a1Var.f20251e.isEmpty(), a1Var.f20251e);
                this.f20252f = visitor.visitInt(this.f20252f != 0, this.f20252f, a1Var.f20252f != 0, a1Var.f20252f);
                boolean z2 = this.f20253g != 0;
                int i = this.f20253g;
                if (a1Var.f20253g != 0) {
                    z = true;
                }
                this.f20253g = visitor.visitInt(z2, i, z, a1Var.f20253g);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f20251e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f20252f = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                this.f20253g = codedInputStream.readInt32();
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
                if (f20250i == null) {
                    synchronized (C7975a1.class) {
                        if (f20250i == null) {
                            f20250i = new DefaultInstanceBasedParser(f20249h);
                        }
                    }
                }
                return f20250i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20249h;
    }

    public int getLimit() {
        return this.f20252f;
    }

    public int getOffset() {
        return this.f20253g;
    }

    public String getSearch() {
        return this.f20251e;
    }

    public ByteString getSearchBytes() {
        return ByteString.copyFromUtf8(this.f20251e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20251e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getSearch());
        }
        int i3 = this.f20252f;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(2, i3);
        }
        int i4 = this.f20253g;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(3, i4);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20251e.isEmpty()) {
            codedOutputStream.writeString(1, getSearch());
        }
        int i = this.f20252f;
        if (i != 0) {
            codedOutputStream.writeInt32(2, i);
        }
        int i2 = this.f20253g;
        if (i2 != 0) {
            codedOutputStream.writeInt32(3, i2);
        }
    }
}
