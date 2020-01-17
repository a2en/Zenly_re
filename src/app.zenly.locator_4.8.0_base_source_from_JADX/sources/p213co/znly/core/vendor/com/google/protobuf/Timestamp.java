package p213co.znly.core.vendor.com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;

/* renamed from: co.znly.core.vendor.com.google.protobuf.Timestamp */
public final class Timestamp extends GeneratedMessageLite<Timestamp, Builder> implements TimestampOrBuilder {
    /* access modifiers changed from: private */
    public static final Timestamp DEFAULT_INSTANCE = new Timestamp();
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser<Timestamp> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* renamed from: co.znly.core.vendor.com.google.protobuf.Timestamp$1 */
    static /* synthetic */ class C66961 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16255xa1df5c61 = new int[MethodToInvoke.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16255xa1df5c61 = r0
                int[] r0 = f16255xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f16255xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f16255xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002a }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f16255xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0035 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f16255xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0040 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.VISIT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f16255xa1df5c61     // Catch:{ NoSuchFieldError -> 0x004b }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f16255xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0056 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f16255xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0062 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p213co.znly.core.vendor.com.google.protobuf.Timestamp.C66961.<clinit>():void");
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.Timestamp$Builder */
    public static final class Builder extends p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder<Timestamp, Builder> implements TimestampOrBuilder {
        /* synthetic */ Builder(C66961 r1) {
            this();
        }

        public Builder clearNanos() {
            copyOnWrite();
            ((Timestamp) this.instance).clearNanos();
            return this;
        }

        public Builder clearSeconds() {
            copyOnWrite();
            ((Timestamp) this.instance).clearSeconds();
            return this;
        }

        public int getNanos() {
            return ((Timestamp) this.instance).getNanos();
        }

        public long getSeconds() {
            return ((Timestamp) this.instance).getSeconds();
        }

        public Builder setNanos(int i) {
            copyOnWrite();
            ((Timestamp) this.instance).setNanos(i);
            return this;
        }

        public Builder setSeconds(long j) {
            copyOnWrite();
            ((Timestamp) this.instance).setSeconds(j);
            return this;
        }

        private Builder() {
            super(Timestamp.DEFAULT_INSTANCE);
        }
    }

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Timestamp() {
    }

    /* access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0;
    }

    public static Timestamp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.toBuilder();
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Timestamp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Timestamp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Timestamp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setNanos(int i) {
        this.nanos_ = i;
    }

    /* access modifiers changed from: private */
    public void setSeconds(long j) {
        this.seconds_ = j;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C66961.f16255xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Timestamp();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new Builder(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                Timestamp timestamp = (Timestamp) obj2;
                this.seconds_ = visitor.visitLong(this.seconds_ != 0, this.seconds_, timestamp.seconds_ != 0, timestamp.seconds_);
                boolean z2 = this.nanos_ != 0;
                int i = this.nanos_;
                if (timestamp.nanos_ != 0) {
                    z = true;
                }
                this.nanos_ = visitor.visitInt(z2, i, z, timestamp.nanos_);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.seconds_ = codedInputStream.readInt64();
                            } else if (readTag == 16) {
                                this.nanos_ = codedInputStream.readInt32();
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
                if (PARSER == null) {
                    synchronized (Timestamp.class) {
                        if (PARSER == null) {
                            PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        }
                    }
                }
                return PARSER;
            default:
                throw new UnsupportedOperationException();
        }
        return DEFAULT_INSTANCE;
    }

    public int getNanos() {
        return this.nanos_;
    }

    public long getSeconds() {
        return this.seconds_;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.seconds_;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeInt64Size(1, j);
        }
        int i3 = this.nanos_;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(2, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.seconds_;
        if (j != 0) {
            codedOutputStream.writeInt64(1, j);
        }
        int i = this.nanos_;
        if (i != 0) {
            codedOutputStream.writeInt32(2, i);
        }
    }

    public static Builder newBuilder(Timestamp timestamp) {
        return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(timestamp);
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Timestamp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Timestamp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Timestamp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Timestamp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Timestamp parseFrom(InputStream inputStream) throws IOException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Timestamp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Timestamp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Timestamp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
