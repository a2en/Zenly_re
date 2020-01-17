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
import p213co.znly.core.vendor.com.google.protobuf.Internal.IntList;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ListAdapter;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ListAdapter.Converter;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.reversegeocoder.C7921g;

/* renamed from: co.znly.models.core.d1 */
public final class C7077d1 extends GeneratedMessageLite<C7077d1, C7079b> implements GeoProto$RouteUserETARequestOrBuilder {

    /* renamed from: i */
    private static final Converter<Integer, C7921g> f17505i = new C7078a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7077d1 f17506j = new C7077d1();

    /* renamed from: k */
    private static volatile Parser<C7077d1> f17507k;

    /* renamed from: e */
    private int f17508e;

    /* renamed from: f */
    private ProtobufList<String> f17509f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private IntList f17510g = GeneratedMessageLite.emptyIntList();

    /* renamed from: h */
    private boolean f17511h;

    /* renamed from: co.znly.models.core.d1$a */
    class C7078a implements Converter<Integer, C7921g> {
        C7078a() {
        }

        /* renamed from: a */
        public C7921g convert(Integer num) {
            C7921g a = C7921g.m18962a(num.intValue());
            return a == null ? C7921g.UNRECOGNIZED : a;
        }
    }

    /* renamed from: co.znly.models.core.d1$b */
    public static final class C7079b extends Builder<C7077d1, C7079b> implements GeoProto$RouteUserETARequestOrBuilder {
        /* synthetic */ C7079b(C7051a1 a1Var) {
            this();
        }

        /* renamed from: a */
        public C7079b mo19118a(Iterable<String> iterable) {
            copyOnWrite();
            ((C7077d1) this.instance).m17779a(iterable);
            return this;
        }

        public C7921g getModes(int i) {
            return ((C7077d1) this.instance).getModes(i);
        }

        public int getModesCount() {
            return ((C7077d1) this.instance).getModesCount();
        }

        public List<C7921g> getModesList() {
            return ((C7077d1) this.instance).getModesList();
        }

        public int getModesValue(int i) {
            return ((C7077d1) this.instance).getModesValue(i);
        }

        public List<Integer> getModesValueList() {
            return Collections.unmodifiableList(((C7077d1) this.instance).getModesValueList());
        }

        public boolean getReversed() {
            return ((C7077d1) this.instance).getReversed();
        }

        public String getUserUuids(int i) {
            return ((C7077d1) this.instance).getUserUuids(i);
        }

        public ByteString getUserUuidsBytes(int i) {
            return ((C7077d1) this.instance).getUserUuidsBytes(i);
        }

        public int getUserUuidsCount() {
            return ((C7077d1) this.instance).getUserUuidsCount();
        }

        public List<String> getUserUuidsList() {
            return Collections.unmodifiableList(((C7077d1) this.instance).getUserUuidsList());
        }

        private C7079b() {
            super(C7077d1.f17506j);
        }

        /* renamed from: a */
        public C7079b mo19117a(C7921g gVar) {
            copyOnWrite();
            ((C7077d1) this.instance).m17778a(gVar);
            return this;
        }

        /* renamed from: a */
        public C7079b mo19119a(boolean z) {
            copyOnWrite();
            ((C7077d1) this.instance).m17780a(z);
            return this;
        }
    }

    static {
        f17506j.makeImmutable();
    }

    private C7077d1() {
    }

    /* renamed from: b */
    private void m17781b() {
        if (!this.f17509f.isModifiable()) {
            this.f17509f = GeneratedMessageLite.mutableCopy(this.f17509f);
        }
    }

    public static C7079b newBuilder() {
        return (C7079b) f17506j.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7051a1.f17440a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7077d1();
            case 2:
                return f17506j;
            case 3:
                this.f17509f.makeImmutable();
                this.f17510g.makeImmutable();
                return null;
            case 4:
                return new C7079b(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7077d1 d1Var = (C7077d1) obj2;
                this.f17509f = visitor.visitList(this.f17509f, d1Var.f17509f);
                this.f17510g = visitor.visitIntList(this.f17510g, d1Var.f17510g);
                boolean z = this.f17511h;
                boolean z2 = d1Var.f17511h;
                this.f17511h = visitor.visitBoolean(z, z, z2, z2);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17508e |= d1Var.f17508e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f17509f.isModifiable()) {
                                    this.f17509f = GeneratedMessageLite.mutableCopy(this.f17509f);
                                }
                                this.f17509f.add(readStringRequireUtf8);
                            } else if (readTag == 16) {
                                if (!this.f17510g.isModifiable()) {
                                    this.f17510g = GeneratedMessageLite.mutableCopy(this.f17510g);
                                }
                                this.f17510g.addInt(codedInputStream.readEnum());
                            } else if (readTag == 18) {
                                if (!this.f17510g.isModifiable()) {
                                    this.f17510g = GeneratedMessageLite.mutableCopy(this.f17510g);
                                }
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f17510g.addInt(codedInputStream.readEnum());
                                }
                                codedInputStream.popLimit(pushLimit);
                            } else if (readTag == 24) {
                                this.f17511h = codedInputStream.readBool();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z3 = true;
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
                if (f17507k == null) {
                    synchronized (C7077d1.class) {
                        if (f17507k == null) {
                            f17507k = new DefaultInstanceBasedParser(f17506j);
                        }
                    }
                }
                return f17507k;
            default:
                throw new UnsupportedOperationException();
        }
        return f17506j;
    }

    public C7921g getModes(int i) {
        return (C7921g) f17505i.convert(Integer.valueOf(this.f17510g.getInt(i)));
    }

    public int getModesCount() {
        return this.f17510g.size();
    }

    public List<C7921g> getModesList() {
        return new ListAdapter(this.f17510g, f17505i);
    }

    public int getModesValue(int i) {
        return this.f17510g.getInt(i);
    }

    public List<Integer> getModesValueList() {
        return this.f17510g;
    }

    public boolean getReversed() {
        return this.f17511h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17509f.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f17509f.get(i3));
        }
        int size = i2 + 0 + (getUserUuidsList().size() * 1);
        int i4 = 0;
        for (int i5 = 0; i5 < this.f17510g.size(); i5++) {
            i4 += CodedOutputStream.computeEnumSizeNoTag(this.f17510g.getInt(i5));
        }
        int size2 = size + i4 + (this.f17510g.size() * 1);
        boolean z = this.f17511h;
        if (z) {
            size2 += CodedOutputStream.computeBoolSize(3, z);
        }
        this.memoizedSerializedSize = size2;
        return size2;
    }

    public String getUserUuids(int i) {
        return (String) this.f17509f.get(i);
    }

    public ByteString getUserUuidsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f17509f.get(i));
    }

    public int getUserUuidsCount() {
        return this.f17509f.size();
    }

    public List<String> getUserUuidsList() {
        return this.f17509f;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.f17509f.size(); i++) {
            codedOutputStream.writeString(1, (String) this.f17509f.get(i));
        }
        for (int i2 = 0; i2 < this.f17510g.size(); i2++) {
            codedOutputStream.writeEnum(2, this.f17510g.getInt(i2));
        }
        boolean z = this.f17511h;
        if (z) {
            codedOutputStream.writeBool(3, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17779a(Iterable<String> iterable) {
        m17781b();
        AbstractMessageLite.addAll(iterable, this.f17509f);
    }

    /* renamed from: a */
    private void m17774a() {
        if (!this.f17510g.isModifiable()) {
            this.f17510g = GeneratedMessageLite.mutableCopy(this.f17510g);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17778a(C7921g gVar) {
        if (gVar != null) {
            m17774a();
            this.f17510g.addInt(gVar.getNumber());
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17780a(boolean z) {
        this.f17511h = z;
    }
}
