package p213co.znly.models.core;

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

/* renamed from: co.znly.models.core.b0 */
public final class C7058b0 extends GeneratedMessageLite<C7058b0, C7059a> implements CoreContactProto$SuggestedDismissRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7058b0 f17456g = new C7058b0();

    /* renamed from: h */
    private static volatile Parser<C7058b0> f17457h;

    /* renamed from: e */
    private ProtobufList<String> f17458e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: f */
    private ProtobufList<String> f17459f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.b0$a */
    public static final class C7059a extends Builder<C7058b0, C7059a> implements CoreContactProto$SuggestedDismissRequestOrBuilder {
        /* synthetic */ C7059a(C7050a0 a0Var) {
            this();
        }

        /* renamed from: a */
        public C7059a mo19114a(String str) {
            copyOnWrite();
            ((C7058b0) this.instance).m17763a(str);
            return this;
        }

        /* renamed from: b */
        public C7059a mo19115b(String str) {
            copyOnWrite();
            ((C7058b0) this.instance).m17766b(str);
            return this;
        }

        public String getContactUuids(int i) {
            return ((C7058b0) this.instance).getContactUuids(i);
        }

        public ByteString getContactUuidsBytes(int i) {
            return ((C7058b0) this.instance).getContactUuidsBytes(i);
        }

        public int getContactUuidsCount() {
            return ((C7058b0) this.instance).getContactUuidsCount();
        }

        public List<String> getContactUuidsList() {
            return Collections.unmodifiableList(((C7058b0) this.instance).getContactUuidsList());
        }

        public String getUserUuids(int i) {
            return ((C7058b0) this.instance).getUserUuids(i);
        }

        public ByteString getUserUuidsBytes(int i) {
            return ((C7058b0) this.instance).getUserUuidsBytes(i);
        }

        public int getUserUuidsCount() {
            return ((C7058b0) this.instance).getUserUuidsCount();
        }

        public List<String> getUserUuidsList() {
            return Collections.unmodifiableList(((C7058b0) this.instance).getUserUuidsList());
        }

        private C7059a() {
            super(C7058b0.f17456g);
        }
    }

    static {
        f17456g.makeImmutable();
    }

    private C7058b0() {
    }

    public static C7059a newBuilder() {
        return (C7059a) f17456g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7050a0.f17439a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7058b0();
            case 2:
                return f17456g;
            case 3:
                this.f17458e.makeImmutable();
                this.f17459f.makeImmutable();
                return null;
            case 4:
                return new C7059a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7058b0 b0Var = (C7058b0) obj2;
                this.f17458e = visitor.visitList(this.f17458e, b0Var.f17458e);
                this.f17459f = visitor.visitList(this.f17459f, b0Var.f17459f);
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
                                if (!this.f17458e.isModifiable()) {
                                    this.f17458e = GeneratedMessageLite.mutableCopy(this.f17458e);
                                }
                                this.f17458e.add(readStringRequireUtf8);
                            } else if (readTag == 18) {
                                String readStringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                                if (!this.f17459f.isModifiable()) {
                                    this.f17459f = GeneratedMessageLite.mutableCopy(this.f17459f);
                                }
                                this.f17459f.add(readStringRequireUtf82);
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
                if (f17457h == null) {
                    synchronized (C7058b0.class) {
                        if (f17457h == null) {
                            f17457h = new DefaultInstanceBasedParser(f17456g);
                        }
                    }
                }
                return f17457h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17456g;
    }

    public String getContactUuids(int i) {
        return (String) this.f17459f.get(i);
    }

    public ByteString getContactUuidsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f17459f.get(i));
    }

    public int getContactUuidsCount() {
        return this.f17459f.size();
    }

    public List<String> getContactUuidsList() {
        return this.f17459f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17458e.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f17458e.get(i3));
        }
        int size = i2 + 0 + (getUserUuidsList().size() * 1);
        int i4 = 0;
        for (int i5 = 0; i5 < this.f17459f.size(); i5++) {
            i4 += CodedOutputStream.computeStringSizeNoTag((String) this.f17459f.get(i5));
        }
        int size2 = size + i4 + (getContactUuidsList().size() * 1);
        this.memoizedSerializedSize = size2;
        return size2;
    }

    public String getUserUuids(int i) {
        return (String) this.f17458e.get(i);
    }

    public ByteString getUserUuidsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f17458e.get(i));
    }

    public int getUserUuidsCount() {
        return this.f17458e.size();
    }

    public List<String> getUserUuidsList() {
        return this.f17458e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17458e.size(); i++) {
            codedOutputStream.writeString(1, (String) this.f17458e.get(i));
        }
        for (int i2 = 0; i2 < this.f17459f.size(); i2++) {
            codedOutputStream.writeString(2, (String) this.f17459f.get(i2));
        }
    }

    /* renamed from: a */
    private void m17761a() {
        if (!this.f17459f.isModifiable()) {
            this.f17459f = GeneratedMessageLite.mutableCopy(this.f17459f);
        }
    }

    /* renamed from: b */
    private void m17764b() {
        if (!this.f17458e.isModifiable()) {
            this.f17458e = GeneratedMessageLite.mutableCopy(this.f17458e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17763a(String str) {
        if (str != null) {
            m17761a();
            this.f17459f.add(str);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m17766b(String str) {
        if (str != null) {
            m17764b();
            this.f17458e.add(str);
            return;
        }
        throw new NullPointerException();
    }
}
