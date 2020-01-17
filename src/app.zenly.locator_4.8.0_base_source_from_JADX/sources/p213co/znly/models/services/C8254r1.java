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
import p213co.znly.models.ConfigurationProto$Configuration;
import p213co.znly.models.ConfigurationProto$Configuration.C6765b;

/* renamed from: co.znly.models.services.r1 */
public final class C8254r1 extends GeneratedMessageLite<C8254r1, C8255a> implements ZenlyProto$ConfigurationResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C8254r1 f20868k = new C8254r1();

    /* renamed from: l */
    private static volatile Parser<C8254r1> f20869l;

    /* renamed from: e */
    private String f20870e;

    /* renamed from: f */
    private String f20871f;

    /* renamed from: g */
    private String f20872g;

    /* renamed from: h */
    private String f20873h;

    /* renamed from: i */
    private boolean f20874i;

    /* renamed from: j */
    private ConfigurationProto$Configuration f20875j;

    /* renamed from: co.znly.models.services.r1$a */
    public static final class C8255a extends Builder<C8254r1, C8255a> implements ZenlyProto$ConfigurationResponseOrBuilder {
        private C8255a() {
            super(C8254r1.f20868k);
        }

        /* synthetic */ C8255a(C8104i0 i0Var) {
            this();
        }

        public ConfigurationProto$Configuration getConfiguration() {
            return ((C8254r1) this.instance).getConfiguration();
        }

        public String getMinAndroidVersion() {
            return ((C8254r1) this.instance).getMinAndroidVersion();
        }

        public ByteString getMinAndroidVersionBytes() {
            return ((C8254r1) this.instance).getMinAndroidVersionBytes();
        }

        public String getMinCoreVersion() {
            return ((C8254r1) this.instance).getMinCoreVersion();
        }

        public ByteString getMinCoreVersionBytes() {
            return ((C8254r1) this.instance).getMinCoreVersionBytes();
        }

        public String getMinIosVersion() {
            return ((C8254r1) this.instance).getMinIosVersion();
        }

        public ByteString getMinIosVersionBytes() {
            return ((C8254r1) this.instance).getMinIosVersionBytes();
        }

        public boolean getUpgrade() {
            return ((C8254r1) this.instance).getUpgrade();
        }

        public String getUpgradeUrl() {
            return ((C8254r1) this.instance).getUpgradeUrl();
        }

        public ByteString getUpgradeUrlBytes() {
            return ((C8254r1) this.instance).getUpgradeUrlBytes();
        }

        public boolean hasConfiguration() {
            return ((C8254r1) this.instance).hasConfiguration();
        }
    }

    static {
        f20868k.makeImmutable();
    }

    private C8254r1() {
        String str = "";
        this.f20870e = str;
        this.f20871f = str;
        this.f20872g = str;
        this.f20873h = str;
    }

    public static C8254r1 getDefaultInstance() {
        return f20868k;
    }

    public static Parser<C8254r1> parser() {
        return f20868k.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8254r1();
            case 2:
                return f20868k;
            case 3:
                return null;
            case 4:
                return new C8255a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8254r1 r1Var = (C8254r1) obj2;
                this.f20870e = visitor.visitString(!this.f20870e.isEmpty(), this.f20870e, !r1Var.f20870e.isEmpty(), r1Var.f20870e);
                this.f20871f = visitor.visitString(!this.f20871f.isEmpty(), this.f20871f, !r1Var.f20871f.isEmpty(), r1Var.f20871f);
                this.f20872g = visitor.visitString(!this.f20872g.isEmpty(), this.f20872g, !r1Var.f20872g.isEmpty(), r1Var.f20872g);
                this.f20873h = visitor.visitString(!this.f20873h.isEmpty(), this.f20873h, true ^ r1Var.f20873h.isEmpty(), r1Var.f20873h);
                boolean z = this.f20874i;
                boolean z2 = r1Var.f20874i;
                this.f20874i = visitor.visitBoolean(z, z, z2, z2);
                this.f20875j = (ConfigurationProto$Configuration) visitor.visitMessage(this.f20875j, r1Var.f20875j);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
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
                                this.f20870e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f20871f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f20872g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.f20873h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 40) {
                                this.f20874i = codedInputStream.readBool();
                            } else if (readTag == 50) {
                                Builder builder = this.f20875j != null ? (C6765b) this.f20875j.toBuilder() : null;
                                this.f20875j = (ConfigurationProto$Configuration) codedInputStream.readMessage(ConfigurationProto$Configuration.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20875j);
                                    this.f20875j = (ConfigurationProto$Configuration) builder.buildPartial();
                                }
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
                if (f20869l == null) {
                    synchronized (C8254r1.class) {
                        if (f20869l == null) {
                            f20869l = new DefaultInstanceBasedParser(f20868k);
                        }
                    }
                }
                return f20869l;
            default:
                throw new UnsupportedOperationException();
        }
        return f20868k;
    }

    public ConfigurationProto$Configuration getConfiguration() {
        ConfigurationProto$Configuration configurationProto$Configuration = this.f20875j;
        return configurationProto$Configuration == null ? ConfigurationProto$Configuration.getDefaultInstance() : configurationProto$Configuration;
    }

    public String getMinAndroidVersion() {
        return this.f20872g;
    }

    public ByteString getMinAndroidVersionBytes() {
        return ByteString.copyFromUtf8(this.f20872g);
    }

    public String getMinCoreVersion() {
        return this.f20870e;
    }

    public ByteString getMinCoreVersionBytes() {
        return ByteString.copyFromUtf8(this.f20870e);
    }

    public String getMinIosVersion() {
        return this.f20871f;
    }

    public ByteString getMinIosVersionBytes() {
        return ByteString.copyFromUtf8(this.f20871f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20870e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getMinCoreVersion());
        }
        if (!this.f20871f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getMinIosVersion());
        }
        if (!this.f20872g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getMinAndroidVersion());
        }
        if (!this.f20873h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getUpgradeUrl());
        }
        boolean z = this.f20874i;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(5, z);
        }
        if (this.f20875j != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getConfiguration());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean getUpgrade() {
        return this.f20874i;
    }

    public String getUpgradeUrl() {
        return this.f20873h;
    }

    public ByteString getUpgradeUrlBytes() {
        return ByteString.copyFromUtf8(this.f20873h);
    }

    public boolean hasConfiguration() {
        return this.f20875j != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20870e.isEmpty()) {
            codedOutputStream.writeString(1, getMinCoreVersion());
        }
        if (!this.f20871f.isEmpty()) {
            codedOutputStream.writeString(2, getMinIosVersion());
        }
        if (!this.f20872g.isEmpty()) {
            codedOutputStream.writeString(3, getMinAndroidVersion());
        }
        if (!this.f20873h.isEmpty()) {
            codedOutputStream.writeString(4, getUpgradeUrl());
        }
        boolean z = this.f20874i;
        if (z) {
            codedOutputStream.writeBool(5, z);
        }
        if (this.f20875j != null) {
            codedOutputStream.writeMessage(6, getConfiguration());
        }
    }
}
