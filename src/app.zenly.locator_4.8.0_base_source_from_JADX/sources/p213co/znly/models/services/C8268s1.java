package p213co.znly.models.services;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
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
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C7272d0;
import p213co.znly.models.reversegeocoder.C7917e;
import p213co.znly.models.reversegeocoder.C7923h;
import p213co.znly.models.reversegeocoder.C7923h.C7924a;

/* renamed from: co.znly.models.services.s1 */
public final class C8268s1 extends GeneratedMessageLite<C8268s1, C8270b> implements ZenlyProto$ContextualLabelingRequestOrBuilder {

    /* renamed from: j */
    private static final Converter<Integer, C7917e> f20903j = new C8269a();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C8268s1 f20904k = new C8268s1();

    /* renamed from: l */
    private static volatile Parser<C8268s1> f20905l;

    /* renamed from: e */
    private int f20906e;

    /* renamed from: f */
    private int f20907f;

    /* renamed from: g */
    private ProtobufList<C7272d0> f20908g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: h */
    private ProtobufList<C7923h> f20909h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: i */
    private IntList f20910i = GeneratedMessageLite.emptyIntList();

    /* renamed from: co.znly.models.services.s1$a */
    class C8269a implements Converter<Integer, C7917e> {
        C8269a() {
        }

        /* renamed from: a */
        public C7917e convert(Integer num) {
            C7917e a = C7917e.m18960a(num.intValue());
            return a == null ? C7917e.UNRECOGNIZED : a;
        }
    }

    /* renamed from: co.znly.models.services.s1$b */
    public static final class C8270b extends Builder<C8268s1, C8270b> implements ZenlyProto$ContextualLabelingRequestOrBuilder {
        private C8270b() {
            super(C8268s1.f20904k);
        }

        /* synthetic */ C8270b(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8270b mo22230a(C7924a aVar) {
            copyOnWrite();
            ((C8268s1) this.instance).m19340a(aVar);
            return this;
        }

        /* renamed from: a */
        public C8270b mo22231a(C8303u1 u1Var) {
            copyOnWrite();
            ((C8268s1) this.instance).m19343a(u1Var);
            return this;
        }

        public C7917e getParentZones(int i) {
            return ((C8268s1) this.instance).getParentZones(i);
        }

        public int getParentZonesCount() {
            return ((C8268s1) this.instance).getParentZonesCount();
        }

        public List<C7917e> getParentZonesList() {
            return ((C8268s1) this.instance).getParentZonesList();
        }

        public int getParentZonesValue(int i) {
            return ((C8268s1) this.instance).getParentZonesValue(i);
        }

        public List<Integer> getParentZonesValueList() {
            return Collections.unmodifiableList(((C8268s1) this.instance).getParentZonesValueList());
        }

        public C8303u1 getType() {
            return ((C8268s1) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C8268s1) this.instance).getTypeValue();
        }

        public C7923h getViewport(int i) {
            return ((C8268s1) this.instance).getViewport(i);
        }

        public int getViewportCount() {
            return ((C8268s1) this.instance).getViewportCount();
        }

        public List<C7923h> getViewportList() {
            return Collections.unmodifiableList(((C8268s1) this.instance).getViewportList());
        }

        public C7272d0 getViewportObsolete(int i) {
            return ((C8268s1) this.instance).getViewportObsolete(i);
        }

        public int getViewportObsoleteCount() {
            return ((C8268s1) this.instance).getViewportObsoleteCount();
        }

        public List<C7272d0> getViewportObsoleteList() {
            return Collections.unmodifiableList(((C8268s1) this.instance).getViewportObsoleteList());
        }
    }

    static {
        f20904k.makeImmutable();
    }

    private C8268s1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19340a(C7924a aVar) {
        m19344b();
        this.f20909h.add(aVar.build());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19343a(C8303u1 u1Var) {
        if (u1Var != null) {
            this.f20907f = u1Var.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    private void m19344b() {
        if (!this.f20909h.isModifiable()) {
            this.f20909h = GeneratedMessageLite.mutableCopy(this.f20909h);
        }
    }

    public static C8270b newBuilder() {
        return (C8270b) f20904k.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        List list;
        MessageLite readMessage;
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8268s1();
            case 2:
                return f20904k;
            case 3:
                this.f20908g.makeImmutable();
                this.f20909h.makeImmutable();
                this.f20910i.makeImmutable();
                return null;
            case 4:
                return new C8270b(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8268s1 s1Var = (C8268s1) obj2;
                boolean z2 = this.f20907f != 0;
                int i = this.f20907f;
                if (s1Var.f20907f != 0) {
                    z = true;
                }
                this.f20907f = visitor.visitInt(z2, i, z, s1Var.f20907f);
                this.f20908g = visitor.visitList(this.f20908g, s1Var.f20908g);
                this.f20909h = visitor.visitList(this.f20909h, s1Var.f20909h);
                this.f20910i = visitor.visitIntList(this.f20910i, s1Var.f20910i);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20906e |= s1Var.f20906e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag != 8) {
                                if (readTag == 18) {
                                    if (!this.f20908g.isModifiable()) {
                                        this.f20908g = GeneratedMessageLite.mutableCopy(this.f20908g);
                                    }
                                    list = this.f20908g;
                                    readMessage = codedInputStream.readMessage(C7272d0.parser(), extensionRegistryLite);
                                } else if (readTag == 26) {
                                    if (!this.f20909h.isModifiable()) {
                                        this.f20909h = GeneratedMessageLite.mutableCopy(this.f20909h);
                                    }
                                    list = this.f20909h;
                                    readMessage = codedInputStream.readMessage(C7923h.parser(), extensionRegistryLite);
                                } else if (readTag == 32) {
                                    if (!this.f20910i.isModifiable()) {
                                        this.f20910i = GeneratedMessageLite.mutableCopy(this.f20910i);
                                    }
                                    this.f20910i.addInt(codedInputStream.readEnum());
                                } else if (readTag == 34) {
                                    if (!this.f20910i.isModifiable()) {
                                        this.f20910i = GeneratedMessageLite.mutableCopy(this.f20910i);
                                    }
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f20910i.addInt(codedInputStream.readEnum());
                                    }
                                    codedInputStream.popLimit(pushLimit);
                                } else if (!codedInputStream.skipField(readTag)) {
                                }
                                list.add(readMessage);
                            } else {
                                this.f20907f = codedInputStream.readEnum();
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
                if (f20905l == null) {
                    synchronized (C8268s1.class) {
                        if (f20905l == null) {
                            f20905l = new DefaultInstanceBasedParser(f20904k);
                        }
                    }
                }
                return f20905l;
            default:
                throw new UnsupportedOperationException();
        }
        return f20904k;
    }

    public C7917e getParentZones(int i) {
        return (C7917e) f20903j.convert(Integer.valueOf(this.f20910i.getInt(i)));
    }

    public int getParentZonesCount() {
        return this.f20910i.size();
    }

    public List<C7917e> getParentZonesList() {
        return new ListAdapter(this.f20910i, f20903j);
    }

    public int getParentZonesValue(int i) {
        return this.f20910i.getInt(i);
    }

    public List<Integer> getParentZonesValueList() {
        return this.f20910i;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeEnumSize = this.f20907f != C8303u1.UNKNOWN.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f20907f) + 0 : 0;
        for (int i2 = 0; i2 < this.f20908g.size(); i2++) {
            computeEnumSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f20908g.get(i2));
        }
        for (int i3 = 0; i3 < this.f20909h.size(); i3++) {
            computeEnumSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f20909h.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f20910i.size(); i5++) {
            i4 += CodedOutputStream.computeEnumSizeNoTag(this.f20910i.getInt(i5));
        }
        int size = computeEnumSize + i4 + (this.f20910i.size() * 1);
        this.memoizedSerializedSize = size;
        return size;
    }

    public C8303u1 getType() {
        C8303u1 a = C8303u1.m19388a(this.f20907f);
        return a == null ? C8303u1.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f20907f;
    }

    public C7923h getViewport(int i) {
        return (C7923h) this.f20909h.get(i);
    }

    public int getViewportCount() {
        return this.f20909h.size();
    }

    public List<C7923h> getViewportList() {
        return this.f20909h;
    }

    public C7272d0 getViewportObsolete(int i) {
        return (C7272d0) this.f20908g.get(i);
    }

    public int getViewportObsoleteCount() {
        return this.f20908g.size();
    }

    public List<C7272d0> getViewportObsoleteList() {
        return this.f20908g;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if (this.f20907f != C8303u1.UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20907f);
        }
        for (int i = 0; i < this.f20908g.size(); i++) {
            codedOutputStream.writeMessage(2, (MessageLite) this.f20908g.get(i));
        }
        for (int i2 = 0; i2 < this.f20909h.size(); i2++) {
            codedOutputStream.writeMessage(3, (MessageLite) this.f20909h.get(i2));
        }
        for (int i3 = 0; i3 < this.f20910i.size(); i3++) {
            codedOutputStream.writeEnum(4, this.f20910i.getInt(i3));
        }
    }
}
