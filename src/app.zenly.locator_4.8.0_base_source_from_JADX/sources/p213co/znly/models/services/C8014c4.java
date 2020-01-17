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

/* renamed from: co.znly.models.services.c4 */
public final class C8014c4 extends GeneratedMessageLite<C8014c4, C8015a> implements ZenlyProto$PushNotificationCreateRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C8014c4 f20336j = new C8014c4();

    /* renamed from: k */
    private static volatile Parser<C8014c4> f20337k;

    /* renamed from: e */
    private int f20338e;

    /* renamed from: f */
    private String f20339f;

    /* renamed from: g */
    private String f20340g;

    /* renamed from: h */
    private String f20341h;

    /* renamed from: i */
    private ProtobufList<String> f20342i = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.c4$a */
    public static final class C8015a extends Builder<C8014c4, C8015a> implements ZenlyProto$PushNotificationCreateRequestOrBuilder {
        private C8015a() {
            super(C8014c4.f20336j);
        }

        /* synthetic */ C8015a(C8104i0 i0Var) {
            this();
        }

        public String getBody() {
            return ((C8014c4) this.instance).getBody();
        }

        public ByteString getBodyBytes() {
            return ((C8014c4) this.instance).getBodyBytes();
        }

        public String getDeprecatedTargetUserUuid() {
            return ((C8014c4) this.instance).getDeprecatedTargetUserUuid();
        }

        public ByteString getDeprecatedTargetUserUuidBytes() {
            return ((C8014c4) this.instance).getDeprecatedTargetUserUuidBytes();
        }

        public String getTargetsUserUuid(int i) {
            return ((C8014c4) this.instance).getTargetsUserUuid(i);
        }

        public ByteString getTargetsUserUuidBytes(int i) {
            return ((C8014c4) this.instance).getTargetsUserUuidBytes(i);
        }

        public int getTargetsUserUuidCount() {
            return ((C8014c4) this.instance).getTargetsUserUuidCount();
        }

        public List<String> getTargetsUserUuidList() {
            return Collections.unmodifiableList(((C8014c4) this.instance).getTargetsUserUuidList());
        }

        public String getTitle() {
            return ((C8014c4) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((C8014c4) this.instance).getTitleBytes();
        }
    }

    static {
        f20336j.makeImmutable();
    }

    private C8014c4() {
        String str = "";
        this.f20339f = str;
        this.f20340g = str;
        this.f20341h = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8014c4();
            case 2:
                return f20336j;
            case 3:
                this.f20342i.makeImmutable();
                return null;
            case 4:
                return new C8015a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8014c4 c4Var = (C8014c4) obj2;
                this.f20339f = visitor.visitString(!this.f20339f.isEmpty(), this.f20339f, !c4Var.f20339f.isEmpty(), c4Var.f20339f);
                this.f20340g = visitor.visitString(!this.f20340g.isEmpty(), this.f20340g, !c4Var.f20340g.isEmpty(), c4Var.f20340g);
                this.f20341h = visitor.visitString(!this.f20341h.isEmpty(), this.f20341h, true ^ c4Var.f20341h.isEmpty(), c4Var.f20341h);
                this.f20342i = visitor.visitList(this.f20342i, c4Var.f20342i);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20338e |= c4Var.f20338e;
                }
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
                                this.f20339f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f20340g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f20341h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f20342i.isModifiable()) {
                                    this.f20342i = GeneratedMessageLite.mutableCopy(this.f20342i);
                                }
                                this.f20342i.add(readStringRequireUtf8);
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
                if (f20337k == null) {
                    synchronized (C8014c4.class) {
                        if (f20337k == null) {
                            f20337k = new DefaultInstanceBasedParser(f20336j);
                        }
                    }
                }
                return f20337k;
            default:
                throw new UnsupportedOperationException();
        }
        return f20336j;
    }

    public String getBody() {
        return this.f20341h;
    }

    public ByteString getBodyBytes() {
        return ByteString.copyFromUtf8(this.f20341h);
    }

    public String getDeprecatedTargetUserUuid() {
        return this.f20339f;
    }

    public ByteString getDeprecatedTargetUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f20339f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f20339f.isEmpty() ? CodedOutputStream.computeStringSize(1, getDeprecatedTargetUserUuid()) + 0 : 0;
        if (!this.f20340g.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(2, getTitle());
        }
        if (!this.f20341h.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(3, getBody());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20342i.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f20342i.get(i3));
        }
        int size = computeStringSize + i2 + (getTargetsUserUuidList().size() * 1);
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getTargetsUserUuid(int i) {
        return (String) this.f20342i.get(i);
    }

    public ByteString getTargetsUserUuidBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f20342i.get(i));
    }

    public int getTargetsUserUuidCount() {
        return this.f20342i.size();
    }

    public List<String> getTargetsUserUuidList() {
        return this.f20342i;
    }

    public String getTitle() {
        return this.f20340g;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.f20340g);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20339f.isEmpty()) {
            codedOutputStream.writeString(1, getDeprecatedTargetUserUuid());
        }
        if (!this.f20340g.isEmpty()) {
            codedOutputStream.writeString(2, getTitle());
        }
        if (!this.f20341h.isEmpty()) {
            codedOutputStream.writeString(3, getBody());
        }
        for (int i = 0; i < this.f20342i.size(); i++) {
            codedOutputStream.writeString(4, (String) this.f20342i.get(i));
        }
    }
}
