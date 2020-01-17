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
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.services.v3 */
public final class C8338v3 extends GeneratedMessageLite<C8338v3, C8339a> implements ZenlyProto$PingManifestResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C8338v3 f21115j = new C8338v3();

    /* renamed from: k */
    private static volatile Parser<C8338v3> f21116k;

    /* renamed from: e */
    private int f21117e;

    /* renamed from: f */
    private String f21118f;

    /* renamed from: g */
    private String f21119g;

    /* renamed from: h */
    private ProtobufList<C8355w3> f21120h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: i */
    private ProtobufList<C8307u3> f21121i = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.v3$a */
    public static final class C8339a extends Builder<C8338v3, C8339a> implements ZenlyProto$PingManifestResponseOrBuilder {
        private C8339a() {
            super(C8338v3.f21115j);
        }

        /* synthetic */ C8339a(C8104i0 i0Var) {
            this();
        }

        public String getChecksum() {
            return ((C8338v3) this.instance).getChecksum();
        }

        public ByteString getChecksumBytes() {
            return ((C8338v3) this.instance).getChecksumBytes();
        }

        public C8307u3 getDeprecated(int i) {
            return ((C8338v3) this.instance).getDeprecated(i);
        }

        public int getDeprecatedCount() {
            return ((C8338v3) this.instance).getDeprecatedCount();
        }

        public List<C8307u3> getDeprecatedList() {
            return Collections.unmodifiableList(((C8338v3) this.instance).getDeprecatedList());
        }

        public C8355w3 getPacks(int i) {
            return ((C8338v3) this.instance).getPacks(i);
        }

        public int getPacksCount() {
            return ((C8338v3) this.instance).getPacksCount();
        }

        public List<C8355w3> getPacksList() {
            return Collections.unmodifiableList(((C8338v3) this.instance).getPacksList());
        }

        public String getRootUrl() {
            return ((C8338v3) this.instance).getRootUrl();
        }

        public ByteString getRootUrlBytes() {
            return ((C8338v3) this.instance).getRootUrlBytes();
        }
    }

    static {
        f21115j.makeImmutable();
    }

    private C8338v3() {
        String str = "";
        this.f21118f = str;
        this.f21119g = str;
    }

    public static C8339a newBuilder() {
        return (C8339a) f21115j.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        List list;
        MessageLite readMessage;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8338v3();
            case 2:
                return f21115j;
            case 3:
                this.f21120h.makeImmutable();
                this.f21121i.makeImmutable();
                return null;
            case 4:
                return new C8339a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8338v3 v3Var = (C8338v3) obj2;
                this.f21118f = visitor.visitString(!this.f21118f.isEmpty(), this.f21118f, !v3Var.f21118f.isEmpty(), v3Var.f21118f);
                this.f21119g = visitor.visitString(!this.f21119g.isEmpty(), this.f21119g, true ^ v3Var.f21119g.isEmpty(), v3Var.f21119g);
                this.f21120h = visitor.visitList(this.f21120h, v3Var.f21120h);
                this.f21121i = visitor.visitList(this.f21121i, v3Var.f21121i);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f21117e |= v3Var.f21117e;
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
                                this.f21118f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag != 18) {
                                if (readTag == 26) {
                                    if (!this.f21120h.isModifiable()) {
                                        this.f21120h = GeneratedMessageLite.mutableCopy(this.f21120h);
                                    }
                                    list = this.f21120h;
                                    readMessage = codedInputStream.readMessage(C8355w3.parser(), extensionRegistryLite);
                                } else if (readTag == 34) {
                                    if (!this.f21121i.isModifiable()) {
                                        this.f21121i = GeneratedMessageLite.mutableCopy(this.f21121i);
                                    }
                                    list = this.f21121i;
                                    readMessage = codedInputStream.readMessage(C8307u3.parser(), extensionRegistryLite);
                                } else if (!codedInputStream.skipField(readTag)) {
                                }
                                list.add(readMessage);
                            } else {
                                this.f21119g = codedInputStream.readStringRequireUtf8();
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
                if (f21116k == null) {
                    synchronized (C8338v3.class) {
                        if (f21116k == null) {
                            f21116k = new DefaultInstanceBasedParser(f21115j);
                        }
                    }
                }
                return f21116k;
            default:
                throw new UnsupportedOperationException();
        }
        return f21115j;
    }

    public String getChecksum() {
        return this.f21119g;
    }

    public ByteString getChecksumBytes() {
        return ByteString.copyFromUtf8(this.f21119g);
    }

    public C8307u3 getDeprecated(int i) {
        return (C8307u3) this.f21121i.get(i);
    }

    public int getDeprecatedCount() {
        return this.f21121i.size();
    }

    public List<C8307u3> getDeprecatedList() {
        return this.f21121i;
    }

    public C8355w3 getPacks(int i) {
        return (C8355w3) this.f21120h.get(i);
    }

    public int getPacksCount() {
        return this.f21120h.size();
    }

    public List<C8355w3> getPacksList() {
        return this.f21120h;
    }

    public String getRootUrl() {
        return this.f21118f;
    }

    public ByteString getRootUrlBytes() {
        return ByteString.copyFromUtf8(this.f21118f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f21118f.isEmpty() ? CodedOutputStream.computeStringSize(1, getRootUrl()) + 0 : 0;
        if (!this.f21119g.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(2, getChecksum());
        }
        int i2 = computeStringSize;
        for (int i3 = 0; i3 < this.f21120h.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f21120h.get(i3));
        }
        for (int i4 = 0; i4 < this.f21121i.size(); i4++) {
            i2 += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f21121i.get(i4));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f21118f.isEmpty()) {
            codedOutputStream.writeString(1, getRootUrl());
        }
        if (!this.f21119g.isEmpty()) {
            codedOutputStream.writeString(2, getChecksum());
        }
        for (int i = 0; i < this.f21120h.size(); i++) {
            codedOutputStream.writeMessage(3, (MessageLite) this.f21120h.get(i));
        }
        for (int i2 = 0; i2 < this.f21121i.size(); i2++) {
            codedOutputStream.writeMessage(4, (MessageLite) this.f21121i.get(i2));
        }
    }
}
