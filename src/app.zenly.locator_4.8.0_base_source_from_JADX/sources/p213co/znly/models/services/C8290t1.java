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
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.reversegeocoder.C7911b;
import p213co.znly.models.reversegeocoder.C7915d;
import p213co.znly.models.reversegeocoder.C7919f;
import p213co.znly.models.reversegeocoder.ReverseGeoCoderProto$ReverseGeoCodeInformationOrBuilder;

/* renamed from: co.znly.models.services.t1 */
public final class C8290t1 extends GeneratedMessageLite<C8290t1, C8291a> implements ZenlyProto$ContextualLabelingResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C8290t1 f20954j = new C8290t1();

    /* renamed from: k */
    private static volatile Parser<C8290t1> f20955k;

    /* renamed from: e */
    private int f20956e;

    /* renamed from: f */
    private int f20957f;

    /* renamed from: g */
    private ProtobufList<C7915d> f20958g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: h */
    private ProtobufList<C7911b> f20959h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: i */
    private int f20960i;

    /* renamed from: co.znly.models.services.t1$a */
    public static final class C8291a extends Builder<C8290t1, C8291a> implements ZenlyProto$ContextualLabelingResponseOrBuilder {
        private C8291a() {
            super(C8290t1.f20954j);
        }

        /* synthetic */ C8291a(C8104i0 i0Var) {
            this();
        }

        public C7919f getProvider() {
            return ((C8290t1) this.instance).getProvider();
        }

        public int getProviderValue() {
            return ((C8290t1) this.instance).getProviderValue();
        }

        public C8303u1 getType() {
            return ((C8290t1) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C8290t1) this.instance).getTypeValue();
        }

        public C7911b getViewportAddresses(int i) {
            return ((C8290t1) this.instance).getViewportAddresses(i);
        }

        public int getViewportAddressesCount() {
            return ((C8290t1) this.instance).getViewportAddressesCount();
        }

        public List<C7911b> getViewportAddressesList() {
            return Collections.unmodifiableList(((C8290t1) this.instance).getViewportAddressesList());
        }

        public C7915d getViewportsInformation(int i) {
            return ((C8290t1) this.instance).getViewportsInformation(i);
        }

        public int getViewportsInformationCount() {
            return ((C8290t1) this.instance).getViewportsInformationCount();
        }

        public List<C7915d> getViewportsInformationList() {
            return Collections.unmodifiableList(((C8290t1) this.instance).getViewportsInformationList());
        }
    }

    static {
        f20954j.makeImmutable();
    }

    private C8290t1() {
    }

    public static C8290t1 getDefaultInstance() {
        return f20954j;
    }

    public static C8291a newBuilder() {
        return (C8291a) f20954j.toBuilder();
    }

    /* renamed from: a */
    public List<? extends ReverseGeoCoderProto$ReverseGeoCodeInformationOrBuilder> mo22256a() {
        return this.f20958g;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        List list;
        MessageLite readMessage;
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8290t1();
            case 2:
                return f20954j;
            case 3:
                this.f20958g.makeImmutable();
                this.f20959h.makeImmutable();
                return null;
            case 4:
                return new C8291a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8290t1 t1Var = (C8290t1) obj2;
                this.f20957f = visitor.visitInt(this.f20957f != 0, this.f20957f, t1Var.f20957f != 0, t1Var.f20957f);
                this.f20958g = visitor.visitList(this.f20958g, t1Var.f20958g);
                this.f20959h = visitor.visitList(this.f20959h, t1Var.f20959h);
                boolean z2 = this.f20960i != 0;
                int i = this.f20960i;
                if (t1Var.f20960i != 0) {
                    z = true;
                }
                this.f20960i = visitor.visitInt(z2, i, z, t1Var.f20960i);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20956e |= t1Var.f20956e;
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
                                    if (!this.f20958g.isModifiable()) {
                                        this.f20958g = GeneratedMessageLite.mutableCopy(this.f20958g);
                                    }
                                    list = this.f20958g;
                                    readMessage = codedInputStream.readMessage(C7915d.parser(), extensionRegistryLite);
                                } else if (readTag == 26) {
                                    if (!this.f20959h.isModifiable()) {
                                        this.f20959h = GeneratedMessageLite.mutableCopy(this.f20959h);
                                    }
                                    list = this.f20959h;
                                    readMessage = codedInputStream.readMessage(C7911b.parser(), extensionRegistryLite);
                                } else if (readTag == 32) {
                                    this.f20960i = codedInputStream.readEnum();
                                } else if (!codedInputStream.skipField(readTag)) {
                                }
                                list.add(readMessage);
                            } else {
                                this.f20957f = codedInputStream.readEnum();
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
                if (f20955k == null) {
                    synchronized (C8290t1.class) {
                        if (f20955k == null) {
                            f20955k = new DefaultInstanceBasedParser(f20954j);
                        }
                    }
                }
                return f20955k;
            default:
                throw new UnsupportedOperationException();
        }
        return f20954j;
    }

    public C7919f getProvider() {
        C7919f a = C7919f.m18961a(this.f20960i);
        return a == null ? C7919f.UNRECOGNIZED : a;
    }

    public int getProviderValue() {
        return this.f20960i;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeEnumSize = this.f20957f != C8303u1.UNKNOWN.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f20957f) + 0 : 0;
        for (int i2 = 0; i2 < this.f20958g.size(); i2++) {
            computeEnumSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f20958g.get(i2));
        }
        for (int i3 = 0; i3 < this.f20959h.size(); i3++) {
            computeEnumSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f20959h.get(i3));
        }
        if (this.f20960i != C7919f.Default.getNumber()) {
            computeEnumSize += CodedOutputStream.computeEnumSize(4, this.f20960i);
        }
        this.memoizedSerializedSize = computeEnumSize;
        return computeEnumSize;
    }

    public C8303u1 getType() {
        C8303u1 a = C8303u1.m19388a(this.f20957f);
        return a == null ? C8303u1.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f20957f;
    }

    public C7911b getViewportAddresses(int i) {
        return (C7911b) this.f20959h.get(i);
    }

    public int getViewportAddressesCount() {
        return this.f20959h.size();
    }

    public List<C7911b> getViewportAddressesList() {
        return this.f20959h;
    }

    public C7915d getViewportsInformation(int i) {
        return (C7915d) this.f20958g.get(i);
    }

    public int getViewportsInformationCount() {
        return this.f20958g.size();
    }

    public List<C7915d> getViewportsInformationList() {
        return this.f20958g;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20957f != C8303u1.UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20957f);
        }
        for (int i = 0; i < this.f20958g.size(); i++) {
            codedOutputStream.writeMessage(2, (MessageLite) this.f20958g.get(i));
        }
        for (int i2 = 0; i2 < this.f20959h.size(); i2++) {
            codedOutputStream.writeMessage(3, (MessageLite) this.f20959h.get(i2));
        }
        if (this.f20960i != C7919f.Default.getNumber()) {
            codedOutputStream.writeEnum(4, this.f20960i);
        }
    }
}
