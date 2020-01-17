package p213co.znly.core.wifi;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.AbstractMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.core.wifi.Scan */
public final class Scan {

    /* renamed from: co.znly.core.wifi.Scan$1 */
    static /* synthetic */ class C67261 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16268xa1df5c61 = new int[MethodToInvoke.values().length];

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
                f16268xa1df5c61 = r0
                int[] r0 = f16268xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f16268xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f16268xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002a }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f16268xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0035 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f16268xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0040 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.VISIT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f16268xa1df5c61     // Catch:{ NoSuchFieldError -> 0x004b }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f16268xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0056 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f16268xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0062 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p213co.znly.core.wifi.Scan.C67261.<clinit>():void");
        }
    }

    /* renamed from: co.znly.core.wifi.Scan$Result */
    public static final class Result extends GeneratedMessageLite<Result, Builder> implements ResultOrBuilder {
        public static final int BSSID_FIELD_NUMBER = 5;
        public static final int CAPABILITIES_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final Result DEFAULT_INSTANCE = new Result();
        public static final int FREQUENCY_FIELD_NUMBER = 1;
        public static final int LEVEL_FIELD_NUMBER = 2;
        private static volatile Parser<Result> PARSER = null;
        public static final int SSID_FIELD_NUMBER = 4;
        public static final int TIMESTAMP_FIELD_NUMBER = 3;
        private String bssid_;
        private String capabilities_;
        private int frequency_;
        private int level_;
        private String ssid_;
        private long timestamp_;

        /* renamed from: co.znly.core.wifi.Scan$Result$Builder */
        public static final class Builder extends p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder<Result, Builder> implements ResultOrBuilder {
            /* synthetic */ Builder(C67261 r1) {
                this();
            }

            public Builder clearBssid() {
                copyOnWrite();
                ((Result) this.instance).clearBssid();
                return this;
            }

            public Builder clearCapabilities() {
                copyOnWrite();
                ((Result) this.instance).clearCapabilities();
                return this;
            }

            public Builder clearFrequency() {
                copyOnWrite();
                ((Result) this.instance).clearFrequency();
                return this;
            }

            public Builder clearLevel() {
                copyOnWrite();
                ((Result) this.instance).clearLevel();
                return this;
            }

            public Builder clearSsid() {
                copyOnWrite();
                ((Result) this.instance).clearSsid();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((Result) this.instance).clearTimestamp();
                return this;
            }

            public String getBssid() {
                return ((Result) this.instance).getBssid();
            }

            public ByteString getBssidBytes() {
                return ((Result) this.instance).getBssidBytes();
            }

            public String getCapabilities() {
                return ((Result) this.instance).getCapabilities();
            }

            public ByteString getCapabilitiesBytes() {
                return ((Result) this.instance).getCapabilitiesBytes();
            }

            public int getFrequency() {
                return ((Result) this.instance).getFrequency();
            }

            public int getLevel() {
                return ((Result) this.instance).getLevel();
            }

            public String getSsid() {
                return ((Result) this.instance).getSsid();
            }

            public ByteString getSsidBytes() {
                return ((Result) this.instance).getSsidBytes();
            }

            public long getTimestamp() {
                return ((Result) this.instance).getTimestamp();
            }

            public Builder setBssid(String str) {
                copyOnWrite();
                ((Result) this.instance).setBssid(str);
                return this;
            }

            public Builder setBssidBytes(ByteString byteString) {
                copyOnWrite();
                ((Result) this.instance).setBssidBytes(byteString);
                return this;
            }

            public Builder setCapabilities(String str) {
                copyOnWrite();
                ((Result) this.instance).setCapabilities(str);
                return this;
            }

            public Builder setCapabilitiesBytes(ByteString byteString) {
                copyOnWrite();
                ((Result) this.instance).setCapabilitiesBytes(byteString);
                return this;
            }

            public Builder setFrequency(int i) {
                copyOnWrite();
                ((Result) this.instance).setFrequency(i);
                return this;
            }

            public Builder setLevel(int i) {
                copyOnWrite();
                ((Result) this.instance).setLevel(i);
                return this;
            }

            public Builder setSsid(String str) {
                copyOnWrite();
                ((Result) this.instance).setSsid(str);
                return this;
            }

            public Builder setSsidBytes(ByteString byteString) {
                copyOnWrite();
                ((Result) this.instance).setSsidBytes(byteString);
                return this;
            }

            public Builder setTimestamp(long j) {
                copyOnWrite();
                ((Result) this.instance).setTimestamp(j);
                return this;
            }

            private Builder() {
                super(Result.DEFAULT_INSTANCE);
            }
        }

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private Result() {
            String str = "";
            this.ssid_ = str;
            this.bssid_ = str;
            this.capabilities_ = str;
        }

        /* access modifiers changed from: private */
        public void clearBssid() {
            this.bssid_ = getDefaultInstance().getBssid();
        }

        /* access modifiers changed from: private */
        public void clearCapabilities() {
            this.capabilities_ = getDefaultInstance().getCapabilities();
        }

        /* access modifiers changed from: private */
        public void clearFrequency() {
            this.frequency_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLevel() {
            this.level_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSsid() {
            this.ssid_ = getDefaultInstance().getSsid();
        }

        /* access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = 0;
        }

        public static Result getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Result parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Result) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Result parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<Result> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBssid(String str) {
            if (str != null) {
                this.bssid_ = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setBssidBytes(ByteString byteString) {
            if (byteString != null) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.bssid_ = byteString.toStringUtf8();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setCapabilities(String str) {
            if (str != null) {
                this.capabilities_ = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setCapabilitiesBytes(ByteString byteString) {
            if (byteString != null) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.capabilities_ = byteString.toStringUtf8();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setFrequency(int i) {
            this.frequency_ = i;
        }

        /* access modifiers changed from: private */
        public void setLevel(int i) {
            this.level_ = i;
        }

        /* access modifiers changed from: private */
        public void setSsid(String str) {
            if (str != null) {
                this.ssid_ = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setSsidBytes(ByteString byteString) {
            if (byteString != null) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.ssid_ = byteString.toStringUtf8();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.timestamp_ = j;
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C67261.f16268xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Result();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    Result result = (Result) obj2;
                    this.frequency_ = visitor.visitInt(this.frequency_ != 0, this.frequency_, result.frequency_ != 0, result.frequency_);
                    this.level_ = visitor.visitInt(this.level_ != 0, this.level_, result.level_ != 0, result.level_);
                    boolean z2 = this.timestamp_ != 0;
                    long j = this.timestamp_;
                    if (result.timestamp_ != 0) {
                        z = true;
                    }
                    this.timestamp_ = visitor.visitLong(z2, j, z, result.timestamp_);
                    this.ssid_ = visitor.visitString(!this.ssid_.isEmpty(), this.ssid_, !result.ssid_.isEmpty(), result.ssid_);
                    this.bssid_ = visitor.visitString(!this.bssid_.isEmpty(), this.bssid_, !result.bssid_.isEmpty(), result.bssid_);
                    this.capabilities_ = visitor.visitString(!this.capabilities_.isEmpty(), this.capabilities_, !result.capabilities_.isEmpty(), result.capabilities_);
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
                                    this.frequency_ = codedInputStream.readInt32();
                                } else if (readTag == 16) {
                                    this.level_ = codedInputStream.readInt32();
                                } else if (readTag == 24) {
                                    this.timestamp_ = codedInputStream.readInt64();
                                } else if (readTag == 34) {
                                    this.ssid_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 42) {
                                    this.bssid_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 50) {
                                    this.capabilities_ = codedInputStream.readStringRequireUtf8();
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
                        synchronized (Result.class) {
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

        public String getBssid() {
            return this.bssid_;
        }

        public ByteString getBssidBytes() {
            return ByteString.copyFromUtf8(this.bssid_);
        }

        public String getCapabilities() {
            return this.capabilities_;
        }

        public ByteString getCapabilitiesBytes() {
            return ByteString.copyFromUtf8(this.capabilities_);
        }

        public int getFrequency() {
            return this.frequency_;
        }

        public int getLevel() {
            return this.level_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int i3 = this.frequency_;
            if (i3 != 0) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
            }
            int i4 = this.level_;
            if (i4 != 0) {
                i2 += CodedOutputStream.computeInt32Size(2, i4);
            }
            long j = this.timestamp_;
            if (j != 0) {
                i2 += CodedOutputStream.computeInt64Size(3, j);
            }
            if (!this.ssid_.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(4, getSsid());
            }
            if (!this.bssid_.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(5, getBssid());
            }
            if (!this.capabilities_.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(6, getCapabilities());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String getSsid() {
            return this.ssid_;
        }

        public ByteString getSsidBytes() {
            return ByteString.copyFromUtf8(this.ssid_);
        }

        public long getTimestamp() {
            return this.timestamp_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.frequency_;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            int i2 = this.level_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(2, i2);
            }
            long j = this.timestamp_;
            if (j != 0) {
                codedOutputStream.writeInt64(3, j);
            }
            if (!this.ssid_.isEmpty()) {
                codedOutputStream.writeString(4, getSsid());
            }
            if (!this.bssid_.isEmpty()) {
                codedOutputStream.writeString(5, getBssid());
            }
            if (!this.capabilities_.isEmpty()) {
                codedOutputStream.writeString(6, getCapabilities());
            }
        }

        public static Builder newBuilder(Result result) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(result);
        }

        public static Result parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Result) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Result parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Result parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Result parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Result parseFrom(InputStream inputStream) throws IOException {
            return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Result parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Result parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Result parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Result) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: co.znly.core.wifi.Scan$ResultOrBuilder */
    public interface ResultOrBuilder extends MessageLiteOrBuilder {
        String getBssid();

        ByteString getBssidBytes();

        String getCapabilities();

        ByteString getCapabilitiesBytes();

        int getFrequency();

        int getLevel();

        String getSsid();

        ByteString getSsidBytes();

        long getTimestamp();
    }

    /* renamed from: co.znly.core.wifi.Scan$Results */
    public static final class Results extends GeneratedMessageLite<Results, Builder> implements ResultsOrBuilder {
        /* access modifiers changed from: private */
        public static final Results DEFAULT_INSTANCE = new Results();
        private static volatile Parser<Results> PARSER = null;
        public static final int RESULTS_FIELD_NUMBER = 1;
        private ProtobufList<Result> results_ = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: co.znly.core.wifi.Scan$Results$Builder */
        public static final class Builder extends p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder<Results, Builder> implements ResultsOrBuilder {
            /* synthetic */ Builder(C67261 r1) {
                this();
            }

            public Builder addAllResults(Iterable<? extends Result> iterable) {
                copyOnWrite();
                ((Results) this.instance).addAllResults(iterable);
                return this;
            }

            public Builder addResults(Result result) {
                copyOnWrite();
                ((Results) this.instance).addResults(result);
                return this;
            }

            public Builder clearResults() {
                copyOnWrite();
                ((Results) this.instance).clearResults();
                return this;
            }

            public Result getResults(int i) {
                return ((Results) this.instance).getResults(i);
            }

            public int getResultsCount() {
                return ((Results) this.instance).getResultsCount();
            }

            public List<Result> getResultsList() {
                return Collections.unmodifiableList(((Results) this.instance).getResultsList());
            }

            public Builder removeResults(int i) {
                copyOnWrite();
                ((Results) this.instance).removeResults(i);
                return this;
            }

            public Builder setResults(int i, Result result) {
                copyOnWrite();
                ((Results) this.instance).setResults(i, result);
                return this;
            }

            private Builder() {
                super(Results.DEFAULT_INSTANCE);
            }

            public Builder addResults(int i, Result result) {
                copyOnWrite();
                ((Results) this.instance).addResults(i, result);
                return this;
            }

            public Builder setResults(int i, Builder builder) {
                copyOnWrite();
                ((Results) this.instance).setResults(i, builder);
                return this;
            }

            public Builder addResults(Builder builder) {
                copyOnWrite();
                ((Results) this.instance).addResults(builder);
                return this;
            }

            public Builder addResults(int i, Builder builder) {
                copyOnWrite();
                ((Results) this.instance).addResults(i, builder);
                return this;
            }
        }

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private Results() {
        }

        /* access modifiers changed from: private */
        public void addAllResults(Iterable<? extends Result> iterable) {
            ensureResultsIsMutable();
            AbstractMessageLite.addAll(iterable, this.results_);
        }

        /* access modifiers changed from: private */
        public void addResults(Result result) {
            if (result != null) {
                ensureResultsIsMutable();
                this.results_.add(result);
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void clearResults() {
            this.results_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureResultsIsMutable() {
            if (!this.results_.isModifiable()) {
                this.results_ = GeneratedMessageLite.mutableCopy(this.results_);
            }
        }

        public static Results getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Results parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Results) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Results parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Results) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<Results> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeResults(int i) {
            ensureResultsIsMutable();
            this.results_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setResults(int i, Result result) {
            if (result != null) {
                ensureResultsIsMutable();
                this.results_.set(i, result);
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C67261.f16268xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Results();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.results_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(null);
                case 5:
                    this.results_ = ((Visitor) obj).visitList(this.results_, ((Results) obj2).results_);
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
                                    if (!this.results_.isModifiable()) {
                                        this.results_ = GeneratedMessageLite.mutableCopy(this.results_);
                                    }
                                    this.results_.add(codedInputStream.readMessage(Result.parser(), extensionRegistryLite));
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
                        synchronized (Results.class) {
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

        public Result getResults(int i) {
            return (Result) this.results_.get(i);
        }

        public int getResultsCount() {
            return this.results_.size();
        }

        public List<Result> getResultsList() {
            return this.results_;
        }

        public ResultOrBuilder getResultsOrBuilder(int i) {
            return (ResultOrBuilder) this.results_.get(i);
        }

        public List<? extends ResultOrBuilder> getResultsOrBuilderList() {
            return this.results_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.results_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.results_.get(i3));
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.results_.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.results_.get(i));
            }
        }

        public static Builder newBuilder(Results results) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(results);
        }

        public static Results parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Results) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Results parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Results) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Results parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Results) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        /* access modifiers changed from: private */
        public void addResults(int i, Result result) {
            if (result != null) {
                ensureResultsIsMutable();
                this.results_.add(i, result);
                return;
            }
            throw new NullPointerException();
        }

        public static Results parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Results) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        /* access modifiers changed from: private */
        public void setResults(int i, Builder builder) {
            ensureResultsIsMutable();
            this.results_.set(i, builder.build());
        }

        public static Results parseFrom(InputStream inputStream) throws IOException {
            return (Results) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Results parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Results) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* access modifiers changed from: private */
        public void addResults(Builder builder) {
            ensureResultsIsMutable();
            this.results_.add(builder.build());
        }

        public static Results parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Results) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Results parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Results) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* access modifiers changed from: private */
        public void addResults(int i, Builder builder) {
            ensureResultsIsMutable();
            this.results_.add(i, builder.build());
        }
    }

    /* renamed from: co.znly.core.wifi.Scan$ResultsOrBuilder */
    public interface ResultsOrBuilder extends MessageLiteOrBuilder {
        Result getResults(int i);

        int getResultsCount();

        List<Result> getResultsList();
    }

    private Scan() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
