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

/* renamed from: co.znly.models.services.y5 */
public final class C8391y5 extends GeneratedMessageLite<C8391y5, C8392a> implements ZenlyProto$UserVisitPointRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8391y5 f21249f = new C8391y5();

    /* renamed from: g */
    private static volatile Parser<C8391y5> f21250g;

    /* renamed from: e */
    private ProtobufList<String> f21251e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.y5$a */
    public static final class C8392a extends Builder<C8391y5, C8392a> implements ZenlyProto$UserVisitPointRequestOrBuilder {
        private C8392a() {
            super(C8391y5.f21249f);
        }

        /* synthetic */ C8392a(C8104i0 i0Var) {
            this();
        }

        public String getUserUuids(int i) {
            return ((C8391y5) this.instance).getUserUuids(i);
        }

        public ByteString getUserUuidsBytes(int i) {
            return ((C8391y5) this.instance).getUserUuidsBytes(i);
        }

        public int getUserUuidsCount() {
            return ((C8391y5) this.instance).getUserUuidsCount();
        }

        public List<String> getUserUuidsList() {
            return Collections.unmodifiableList(((C8391y5) this.instance).getUserUuidsList());
        }
    }

    static {
        f21249f.makeImmutable();
    }

    private C8391y5() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8391y5();
            case 2:
                return f21249f;
            case 3:
                this.f21251e.makeImmutable();
                return null;
            case 4:
                return new C8392a(null);
            case 5:
                this.f21251e = ((Visitor) obj).visitList(this.f21251e, ((C8391y5) obj2).f21251e);
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
                                if (!this.f21251e.isModifiable()) {
                                    this.f21251e = GeneratedMessageLite.mutableCopy(this.f21251e);
                                }
                                this.f21251e.add(readStringRequireUtf8);
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
                if (f21250g == null) {
                    synchronized (C8391y5.class) {
                        if (f21250g == null) {
                            f21250g = new DefaultInstanceBasedParser(f21249f);
                        }
                    }
                }
                return f21250g;
            default:
                throw new UnsupportedOperationException();
        }
        return f21249f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f21251e.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f21251e.get(i3));
        }
        int size = 0 + i2 + (getUserUuidsList().size() * 1);
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getUserUuids(int i) {
        return (String) this.f21251e.get(i);
    }

    public ByteString getUserUuidsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f21251e.get(i));
    }

    public int getUserUuidsCount() {
        return this.f21251e.size();
    }

    public List<String> getUserUuidsList() {
        return this.f21251e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f21251e.size(); i++) {
            codedOutputStream.writeString(1, (String) this.f21251e.get(i));
        }
    }
}
