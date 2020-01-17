package p213co.znly.core.scheduling;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p213co.znly.core.vendor.com.google.protobuf.AbstractMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MapEntryLite;
import p213co.znly.core.vendor.com.google.protobuf.MapFieldLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType;

/* renamed from: co.znly.core.scheduling.SyncJobExtras */
public final class SyncJobExtras {

    /* renamed from: co.znly.core.scheduling.SyncJobExtras$1 */
    static /* synthetic */ class C66301 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16214xa1df5c61 = new int[MethodToInvoke.values().length];

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
                f16214xa1df5c61 = r0
                int[] r0 = f16214xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f16214xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f16214xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002a }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f16214xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0035 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f16214xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0040 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.VISIT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f16214xa1df5c61     // Catch:{ NoSuchFieldError -> 0x004b }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f16214xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0056 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f16214xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0062 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p213co.znly.core.scheduling.SyncJobExtras.C66301.<clinit>():void");
        }
    }

    /* renamed from: co.znly.core.scheduling.SyncJobExtras$Job */
    public static final class Job extends GeneratedMessageLite<Job, Builder> implements JobOrBuilder {
        /* access modifiers changed from: private */
        public static final Job DEFAULT_INSTANCE = new Job();
        public static final int FINISHED_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile Parser<Job> PARSER = null;
        public static final int RESULT_FIELD_NUMBER = 5;
        public static final int SCHEDULED_FIELD_NUMBER = 3;
        public static final int UUID_FIELD_NUMBER = 2;
        private boolean finished_;
        private long id_;
        private int result_;
        private boolean scheduled_;
        private String uuid_ = "";

        /* renamed from: co.znly.core.scheduling.SyncJobExtras$Job$Builder */
        public static final class Builder extends p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder<Job, Builder> implements JobOrBuilder {
            /* synthetic */ Builder(C66301 r1) {
                this();
            }

            public Builder clearFinished() {
                copyOnWrite();
                ((Job) this.instance).clearFinished();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Job) this.instance).clearId();
                return this;
            }

            public Builder clearResult() {
                copyOnWrite();
                ((Job) this.instance).clearResult();
                return this;
            }

            public Builder clearScheduled() {
                copyOnWrite();
                ((Job) this.instance).clearScheduled();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((Job) this.instance).clearUuid();
                return this;
            }

            public boolean getFinished() {
                return ((Job) this.instance).getFinished();
            }

            public long getId() {
                return ((Job) this.instance).getId();
            }

            public Result getResult() {
                return ((Job) this.instance).getResult();
            }

            public int getResultValue() {
                return ((Job) this.instance).getResultValue();
            }

            public boolean getScheduled() {
                return ((Job) this.instance).getScheduled();
            }

            public String getUuid() {
                return ((Job) this.instance).getUuid();
            }

            public ByteString getUuidBytes() {
                return ((Job) this.instance).getUuidBytes();
            }

            public Builder setFinished(boolean z) {
                copyOnWrite();
                ((Job) this.instance).setFinished(z);
                return this;
            }

            public Builder setId(long j) {
                copyOnWrite();
                ((Job) this.instance).setId(j);
                return this;
            }

            public Builder setResult(Result result) {
                copyOnWrite();
                ((Job) this.instance).setResult(result);
                return this;
            }

            public Builder setResultValue(int i) {
                copyOnWrite();
                ((Job) this.instance).setResultValue(i);
                return this;
            }

            public Builder setScheduled(boolean z) {
                copyOnWrite();
                ((Job) this.instance).setScheduled(z);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((Job) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) {
                copyOnWrite();
                ((Job) this.instance).setUuidBytes(byteString);
                return this;
            }

            private Builder() {
                super(Job.DEFAULT_INSTANCE);
            }
        }

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private Job() {
        }

        /* access modifiers changed from: private */
        public void clearFinished() {
            this.finished_ = false;
        }

        /* access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearResult() {
            this.result_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearScheduled() {
            this.scheduled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static Job getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Job parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Job) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Job parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Job) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<Job> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFinished(boolean z) {
            this.finished_ = z;
        }

        /* access modifiers changed from: private */
        public void setId(long j) {
            this.id_ = j;
        }

        /* access modifiers changed from: private */
        public void setResult(Result result) {
            if (result != null) {
                this.result_ = result.getNumber();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setResultValue(int i) {
            this.result_ = i;
        }

        /* access modifiers changed from: private */
        public void setScheduled(boolean z) {
            this.scheduled_ = z;
        }

        /* access modifiers changed from: private */
        public void setUuid(String str) {
            if (str != null) {
                this.uuid_ = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) {
            if (byteString != null) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.uuid_ = byteString.toStringUtf8();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C66301.f16214xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Job();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    Job job = (Job) obj2;
                    this.id_ = visitor.visitLong(this.id_ != 0, this.id_, job.id_ != 0, job.id_);
                    this.uuid_ = visitor.visitString(!this.uuid_.isEmpty(), this.uuid_, !job.uuid_.isEmpty(), job.uuid_);
                    boolean z2 = this.scheduled_;
                    boolean z3 = job.scheduled_;
                    this.scheduled_ = visitor.visitBoolean(z2, z2, z3, z3);
                    boolean z4 = this.finished_;
                    boolean z5 = job.finished_;
                    this.finished_ = visitor.visitBoolean(z4, z4, z5, z5);
                    boolean z6 = this.result_ != 0;
                    int i = this.result_;
                    if (job.result_ != 0) {
                        z = true;
                    }
                    this.result_ = visitor.visitInt(z6, i, z, job.result_);
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
                                    this.id_ = codedInputStream.readInt64();
                                } else if (readTag == 18) {
                                    this.uuid_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 24) {
                                    this.scheduled_ = codedInputStream.readBool();
                                } else if (readTag == 32) {
                                    this.finished_ = codedInputStream.readBool();
                                } else if (readTag == 40) {
                                    this.result_ = codedInputStream.readEnum();
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
                        synchronized (Job.class) {
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

        public boolean getFinished() {
            return this.finished_;
        }

        public long getId() {
            return this.id_;
        }

        public Result getResult() {
            Result forNumber = Result.forNumber(this.result_);
            return forNumber == null ? Result.UNRECOGNIZED : forNumber;
        }

        public int getResultValue() {
            return this.result_;
        }

        public boolean getScheduled() {
            return this.scheduled_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            long j = this.id_;
            if (j != 0) {
                i2 = 0 + CodedOutputStream.computeInt64Size(1, j);
            }
            if (!this.uuid_.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(2, getUuid());
            }
            boolean z = this.scheduled_;
            if (z) {
                i2 += CodedOutputStream.computeBoolSize(3, z);
            }
            boolean z2 = this.finished_;
            if (z2) {
                i2 += CodedOutputStream.computeBoolSize(4, z2);
            }
            if (this.result_ != Result.RESULT_UNKNOWN.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(5, this.result_);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String getUuid() {
            return this.uuid_;
        }

        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.id_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            if (!this.uuid_.isEmpty()) {
                codedOutputStream.writeString(2, getUuid());
            }
            boolean z = this.scheduled_;
            if (z) {
                codedOutputStream.writeBool(3, z);
            }
            boolean z2 = this.finished_;
            if (z2) {
                codedOutputStream.writeBool(4, z2);
            }
            if (this.result_ != Result.RESULT_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(5, this.result_);
            }
        }

        public static Builder newBuilder(Job job) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(job);
        }

        public static Job parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Job) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Job parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Job) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Job parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Job) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Job parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Job) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Job parseFrom(InputStream inputStream) throws IOException {
            return (Job) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Job parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Job) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Job parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Job) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Job parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Job) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: co.znly.core.scheduling.SyncJobExtras$JobOrBuilder */
    public interface JobOrBuilder extends MessageLiteOrBuilder {
        boolean getFinished();

        long getId();

        Result getResult();

        int getResultValue();

        boolean getScheduled();

        String getUuid();

        ByteString getUuidBytes();
    }

    /* renamed from: co.znly.core.scheduling.SyncJobExtras$JobRequest */
    public static final class JobRequest extends GeneratedMessageLite<JobRequest, Builder> implements JobRequestOrBuilder {
        public static final int BACKOFF_POLICY_FIELD_NUMBER = 7;
        public static final int BACKOFF_VALUE_MS_FIELD_NUMBER = 8;
        /* access modifiers changed from: private */
        public static final JobRequest DEFAULT_INSTANCE = new JobRequest();
        public static final int EXEC_WINDOW_START_MS_FIELD_NUMBER = 4;
        public static final int EXEC_WINDOW_STOP_MS_FIELD_NUMBER = 5;
        public static final int EXTRAS_FIELD_NUMBER = 1;
        public static final int HANDLER_ID_FIELD_NUMBER = 2;
        public static final int NETWORK_TYPE_FIELD_NUMBER = 6;
        private static volatile Parser<JobRequest> PARSER = null;
        public static final int REQUIREMENTS_ENFORCED_FIELD_NUMBER = 12;
        public static final int REQUIRES_BATTERY_NOT_LOW_FIELD_NUMBER = 11;
        public static final int REQUIRES_CHARGING_FIELD_NUMBER = 9;
        public static final int REQUIRES_DEVICE_IDLE_FIELD_NUMBER = 10;
        public static final int START_NOW_FIELD_NUMBER = 14;
        public static final int UPDATE_CURRENT_FIELD_NUMBER = 13;
        public static final int UUID_FIELD_NUMBER = 3;
        private int backoffPolicy_;
        private long backoffValueMs_;
        private int bitField0_;
        private long execWindowStartMs_;
        private long execWindowStopMs_;
        private MapFieldLite<String, String> extras_ = MapFieldLite.emptyMapField();
        private String handlerId_;
        private int networkType_;
        private boolean requirementsEnforced_;
        private boolean requiresBatteryNotLow_;
        private boolean requiresCharging_;
        private boolean requiresDeviceIdle_;
        private boolean startNow_;
        private boolean updateCurrent_;
        private String uuid_;

        /* renamed from: co.znly.core.scheduling.SyncJobExtras$JobRequest$BackOffPolicy */
        public enum BackOffPolicy implements EnumLite {
            BACKOFF_POLICY_LINEAR(0),
            BACKOFF_POLICY_EXPONENTIAL(1),
            UNRECOGNIZED(-1);
            
            public static final int BACKOFF_POLICY_EXPONENTIAL_VALUE = 1;
            public static final int BACKOFF_POLICY_LINEAR_VALUE = 0;
            private static final EnumLiteMap<BackOffPolicy> internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new EnumLiteMap<BackOffPolicy>() {
                    public BackOffPolicy findValueByNumber(int i) {
                        return BackOffPolicy.forNumber(i);
                    }
                };
            }

            private BackOffPolicy(int i) {
                this.value = i;
            }

            public static BackOffPolicy forNumber(int i) {
                if (i == 0) {
                    return BACKOFF_POLICY_LINEAR;
                }
                if (i != 1) {
                    return null;
                }
                return BACKOFF_POLICY_EXPONENTIAL;
            }

            public static EnumLiteMap<BackOffPolicy> internalGetValueMap() {
                return internalValueMap;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static BackOffPolicy valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: co.znly.core.scheduling.SyncJobExtras$JobRequest$Builder */
        public static final class Builder extends p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder<JobRequest, Builder> implements JobRequestOrBuilder {
            /* synthetic */ Builder(C66301 r1) {
                this();
            }

            public Builder clearBackoffPolicy() {
                copyOnWrite();
                ((JobRequest) this.instance).clearBackoffPolicy();
                return this;
            }

            public Builder clearBackoffValueMs() {
                copyOnWrite();
                ((JobRequest) this.instance).clearBackoffValueMs();
                return this;
            }

            public Builder clearExecWindowStartMs() {
                copyOnWrite();
                ((JobRequest) this.instance).clearExecWindowStartMs();
                return this;
            }

            public Builder clearExecWindowStopMs() {
                copyOnWrite();
                ((JobRequest) this.instance).clearExecWindowStopMs();
                return this;
            }

            public Builder clearExtras() {
                copyOnWrite();
                ((JobRequest) this.instance).getMutableExtrasMap().clear();
                return this;
            }

            public Builder clearHandlerId() {
                copyOnWrite();
                ((JobRequest) this.instance).clearHandlerId();
                return this;
            }

            public Builder clearNetworkType() {
                copyOnWrite();
                ((JobRequest) this.instance).clearNetworkType();
                return this;
            }

            public Builder clearRequirementsEnforced() {
                copyOnWrite();
                ((JobRequest) this.instance).clearRequirementsEnforced();
                return this;
            }

            public Builder clearRequiresBatteryNotLow() {
                copyOnWrite();
                ((JobRequest) this.instance).clearRequiresBatteryNotLow();
                return this;
            }

            public Builder clearRequiresCharging() {
                copyOnWrite();
                ((JobRequest) this.instance).clearRequiresCharging();
                return this;
            }

            public Builder clearRequiresDeviceIdle() {
                copyOnWrite();
                ((JobRequest) this.instance).clearRequiresDeviceIdle();
                return this;
            }

            public Builder clearStartNow() {
                copyOnWrite();
                ((JobRequest) this.instance).clearStartNow();
                return this;
            }

            public Builder clearUpdateCurrent() {
                copyOnWrite();
                ((JobRequest) this.instance).clearUpdateCurrent();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((JobRequest) this.instance).clearUuid();
                return this;
            }

            public boolean containsExtras(String str) {
                if (str != null) {
                    return ((JobRequest) this.instance).getExtrasMap().containsKey(str);
                }
                throw new NullPointerException();
            }

            public BackOffPolicy getBackoffPolicy() {
                return ((JobRequest) this.instance).getBackoffPolicy();
            }

            public int getBackoffPolicyValue() {
                return ((JobRequest) this.instance).getBackoffPolicyValue();
            }

            public long getBackoffValueMs() {
                return ((JobRequest) this.instance).getBackoffValueMs();
            }

            public long getExecWindowStartMs() {
                return ((JobRequest) this.instance).getExecWindowStartMs();
            }

            public long getExecWindowStopMs() {
                return ((JobRequest) this.instance).getExecWindowStopMs();
            }

            @Deprecated
            public Map<String, String> getExtras() {
                return getExtrasMap();
            }

            public int getExtrasCount() {
                return ((JobRequest) this.instance).getExtrasMap().size();
            }

            public Map<String, String> getExtrasMap() {
                return Collections.unmodifiableMap(((JobRequest) this.instance).getExtrasMap());
            }

            public String getExtrasOrDefault(String str, String str2) {
                if (str != null) {
                    Map extrasMap = ((JobRequest) this.instance).getExtrasMap();
                    return extrasMap.containsKey(str) ? (String) extrasMap.get(str) : str2;
                }
                throw new NullPointerException();
            }

            public String getExtrasOrThrow(String str) {
                if (str != null) {
                    Map extrasMap = ((JobRequest) this.instance).getExtrasMap();
                    if (extrasMap.containsKey(str)) {
                        return (String) extrasMap.get(str);
                    }
                    throw new IllegalArgumentException();
                }
                throw new NullPointerException();
            }

            public String getHandlerId() {
                return ((JobRequest) this.instance).getHandlerId();
            }

            public ByteString getHandlerIdBytes() {
                return ((JobRequest) this.instance).getHandlerIdBytes();
            }

            public NetworkType getNetworkType() {
                return ((JobRequest) this.instance).getNetworkType();
            }

            public int getNetworkTypeValue() {
                return ((JobRequest) this.instance).getNetworkTypeValue();
            }

            public boolean getRequirementsEnforced() {
                return ((JobRequest) this.instance).getRequirementsEnforced();
            }

            public boolean getRequiresBatteryNotLow() {
                return ((JobRequest) this.instance).getRequiresBatteryNotLow();
            }

            public boolean getRequiresCharging() {
                return ((JobRequest) this.instance).getRequiresCharging();
            }

            public boolean getRequiresDeviceIdle() {
                return ((JobRequest) this.instance).getRequiresDeviceIdle();
            }

            public boolean getStartNow() {
                return ((JobRequest) this.instance).getStartNow();
            }

            public boolean getUpdateCurrent() {
                return ((JobRequest) this.instance).getUpdateCurrent();
            }

            public String getUuid() {
                return ((JobRequest) this.instance).getUuid();
            }

            public ByteString getUuidBytes() {
                return ((JobRequest) this.instance).getUuidBytes();
            }

            public Builder putAllExtras(Map<String, String> map) {
                copyOnWrite();
                ((JobRequest) this.instance).getMutableExtrasMap().putAll(map);
                return this;
            }

            public Builder putExtras(String str, String str2) {
                if (str == null) {
                    throw new NullPointerException();
                } else if (str2 != null) {
                    copyOnWrite();
                    ((JobRequest) this.instance).getMutableExtrasMap().put(str, str2);
                    return this;
                } else {
                    throw new NullPointerException();
                }
            }

            public Builder removeExtras(String str) {
                if (str != null) {
                    copyOnWrite();
                    ((JobRequest) this.instance).getMutableExtrasMap().remove(str);
                    return this;
                }
                throw new NullPointerException();
            }

            public Builder setBackoffPolicy(BackOffPolicy backOffPolicy) {
                copyOnWrite();
                ((JobRequest) this.instance).setBackoffPolicy(backOffPolicy);
                return this;
            }

            public Builder setBackoffPolicyValue(int i) {
                copyOnWrite();
                ((JobRequest) this.instance).setBackoffPolicyValue(i);
                return this;
            }

            public Builder setBackoffValueMs(long j) {
                copyOnWrite();
                ((JobRequest) this.instance).setBackoffValueMs(j);
                return this;
            }

            public Builder setExecWindowStartMs(long j) {
                copyOnWrite();
                ((JobRequest) this.instance).setExecWindowStartMs(j);
                return this;
            }

            public Builder setExecWindowStopMs(long j) {
                copyOnWrite();
                ((JobRequest) this.instance).setExecWindowStopMs(j);
                return this;
            }

            public Builder setHandlerId(String str) {
                copyOnWrite();
                ((JobRequest) this.instance).setHandlerId(str);
                return this;
            }

            public Builder setHandlerIdBytes(ByteString byteString) {
                copyOnWrite();
                ((JobRequest) this.instance).setHandlerIdBytes(byteString);
                return this;
            }

            public Builder setNetworkType(NetworkType networkType) {
                copyOnWrite();
                ((JobRequest) this.instance).setNetworkType(networkType);
                return this;
            }

            public Builder setNetworkTypeValue(int i) {
                copyOnWrite();
                ((JobRequest) this.instance).setNetworkTypeValue(i);
                return this;
            }

            public Builder setRequirementsEnforced(boolean z) {
                copyOnWrite();
                ((JobRequest) this.instance).setRequirementsEnforced(z);
                return this;
            }

            public Builder setRequiresBatteryNotLow(boolean z) {
                copyOnWrite();
                ((JobRequest) this.instance).setRequiresBatteryNotLow(z);
                return this;
            }

            public Builder setRequiresCharging(boolean z) {
                copyOnWrite();
                ((JobRequest) this.instance).setRequiresCharging(z);
                return this;
            }

            public Builder setRequiresDeviceIdle(boolean z) {
                copyOnWrite();
                ((JobRequest) this.instance).setRequiresDeviceIdle(z);
                return this;
            }

            public Builder setStartNow(boolean z) {
                copyOnWrite();
                ((JobRequest) this.instance).setStartNow(z);
                return this;
            }

            public Builder setUpdateCurrent(boolean z) {
                copyOnWrite();
                ((JobRequest) this.instance).setUpdateCurrent(z);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((JobRequest) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) {
                copyOnWrite();
                ((JobRequest) this.instance).setUuidBytes(byteString);
                return this;
            }

            private Builder() {
                super(JobRequest.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: co.znly.core.scheduling.SyncJobExtras$JobRequest$ExtrasDefaultEntryHolder */
        private static final class ExtrasDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry;

            static {
                FieldType fieldType = FieldType.STRING;
                String str = "";
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, str, fieldType, str);
            }

            private ExtrasDefaultEntryHolder() {
            }
        }

        /* renamed from: co.znly.core.scheduling.SyncJobExtras$JobRequest$NetworkType */
        public enum NetworkType implements EnumLite {
            NETWORK_TYPE_ANY(0),
            NETWORK_TYPE_CONNECTED(1),
            NETWORK_TYPE_UNMETERED(2),
            NETWORK_TYPE_NOT_ROAMING(3),
            NETWORK_TYPE_METERED(4),
            UNRECOGNIZED(-1);
            
            public static final int NETWORK_TYPE_ANY_VALUE = 0;
            public static final int NETWORK_TYPE_CONNECTED_VALUE = 1;
            public static final int NETWORK_TYPE_METERED_VALUE = 4;
            public static final int NETWORK_TYPE_NOT_ROAMING_VALUE = 3;
            public static final int NETWORK_TYPE_UNMETERED_VALUE = 2;
            private static final EnumLiteMap<NetworkType> internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new EnumLiteMap<NetworkType>() {
                    public NetworkType findValueByNumber(int i) {
                        return NetworkType.forNumber(i);
                    }
                };
            }

            private NetworkType(int i) {
                this.value = i;
            }

            public static NetworkType forNumber(int i) {
                if (i == 0) {
                    return NETWORK_TYPE_ANY;
                }
                if (i == 1) {
                    return NETWORK_TYPE_CONNECTED;
                }
                if (i == 2) {
                    return NETWORK_TYPE_UNMETERED;
                }
                if (i == 3) {
                    return NETWORK_TYPE_NOT_ROAMING;
                }
                if (i != 4) {
                    return null;
                }
                return NETWORK_TYPE_METERED;
            }

            public static EnumLiteMap<NetworkType> internalGetValueMap() {
                return internalValueMap;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static NetworkType valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private JobRequest() {
            String str = "";
            this.handlerId_ = str;
            this.uuid_ = str;
        }

        /* access modifiers changed from: private */
        public void clearBackoffPolicy() {
            this.backoffPolicy_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearBackoffValueMs() {
            this.backoffValueMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearExecWindowStartMs() {
            this.execWindowStartMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearExecWindowStopMs() {
            this.execWindowStopMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearHandlerId() {
            this.handlerId_ = getDefaultInstance().getHandlerId();
        }

        /* access modifiers changed from: private */
        public void clearNetworkType() {
            this.networkType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRequirementsEnforced() {
            this.requirementsEnforced_ = false;
        }

        /* access modifiers changed from: private */
        public void clearRequiresBatteryNotLow() {
            this.requiresBatteryNotLow_ = false;
        }

        /* access modifiers changed from: private */
        public void clearRequiresCharging() {
            this.requiresCharging_ = false;
        }

        /* access modifiers changed from: private */
        public void clearRequiresDeviceIdle() {
            this.requiresDeviceIdle_ = false;
        }

        /* access modifiers changed from: private */
        public void clearStartNow() {
            this.startNow_ = false;
        }

        /* access modifiers changed from: private */
        public void clearUpdateCurrent() {
            this.updateCurrent_ = false;
        }

        /* access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static JobRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public Map<String, String> getMutableExtrasMap() {
            return internalGetMutableExtras();
        }

        private MapFieldLite<String, String> internalGetExtras() {
            return this.extras_;
        }

        private MapFieldLite<String, String> internalGetMutableExtras() {
            if (!this.extras_.isMutable()) {
                this.extras_ = this.extras_.mutableCopy();
            }
            return this.extras_;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static JobRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (JobRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JobRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (JobRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<JobRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBackoffPolicy(BackOffPolicy backOffPolicy) {
            if (backOffPolicy != null) {
                this.backoffPolicy_ = backOffPolicy.getNumber();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setBackoffPolicyValue(int i) {
            this.backoffPolicy_ = i;
        }

        /* access modifiers changed from: private */
        public void setBackoffValueMs(long j) {
            this.backoffValueMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setExecWindowStartMs(long j) {
            this.execWindowStartMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setExecWindowStopMs(long j) {
            this.execWindowStopMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setHandlerId(String str) {
            if (str != null) {
                this.handlerId_ = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setHandlerIdBytes(ByteString byteString) {
            if (byteString != null) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.handlerId_ = byteString.toStringUtf8();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setNetworkType(NetworkType networkType) {
            if (networkType != null) {
                this.networkType_ = networkType.getNumber();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setNetworkTypeValue(int i) {
            this.networkType_ = i;
        }

        /* access modifiers changed from: private */
        public void setRequirementsEnforced(boolean z) {
            this.requirementsEnforced_ = z;
        }

        /* access modifiers changed from: private */
        public void setRequiresBatteryNotLow(boolean z) {
            this.requiresBatteryNotLow_ = z;
        }

        /* access modifiers changed from: private */
        public void setRequiresCharging(boolean z) {
            this.requiresCharging_ = z;
        }

        /* access modifiers changed from: private */
        public void setRequiresDeviceIdle(boolean z) {
            this.requiresDeviceIdle_ = z;
        }

        /* access modifiers changed from: private */
        public void setStartNow(boolean z) {
            this.startNow_ = z;
        }

        /* access modifiers changed from: private */
        public void setUpdateCurrent(boolean z) {
            this.updateCurrent_ = z;
        }

        /* access modifiers changed from: private */
        public void setUuid(String str) {
            if (str != null) {
                this.uuid_ = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) {
            if (byteString != null) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.uuid_ = byteString.toStringUtf8();
                return;
            }
            throw new NullPointerException();
        }

        public boolean containsExtras(String str) {
            if (str != null) {
                return internalGetExtras().containsKey(str);
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C66301.f16214xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new JobRequest();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.extras_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    JobRequest jobRequest = (JobRequest) obj2;
                    this.handlerId_ = visitor.visitString(!this.handlerId_.isEmpty(), this.handlerId_, !jobRequest.handlerId_.isEmpty(), jobRequest.handlerId_);
                    this.uuid_ = visitor.visitString(!this.uuid_.isEmpty(), this.uuid_, !jobRequest.uuid_.isEmpty(), jobRequest.uuid_);
                    this.extras_ = visitor.visitMap(this.extras_, jobRequest.internalGetExtras());
                    this.execWindowStartMs_ = visitor.visitLong(this.execWindowStartMs_ != 0, this.execWindowStartMs_, jobRequest.execWindowStartMs_ != 0, jobRequest.execWindowStartMs_);
                    this.execWindowStopMs_ = visitor.visitLong(this.execWindowStopMs_ != 0, this.execWindowStopMs_, jobRequest.execWindowStopMs_ != 0, jobRequest.execWindowStopMs_);
                    this.networkType_ = visitor.visitInt(this.networkType_ != 0, this.networkType_, jobRequest.networkType_ != 0, jobRequest.networkType_);
                    this.backoffPolicy_ = visitor.visitInt(this.backoffPolicy_ != 0, this.backoffPolicy_, jobRequest.backoffPolicy_ != 0, jobRequest.backoffPolicy_);
                    this.backoffValueMs_ = visitor.visitLong(this.backoffValueMs_ != 0, this.backoffValueMs_, jobRequest.backoffValueMs_ != 0, jobRequest.backoffValueMs_);
                    boolean z2 = this.requiresCharging_;
                    boolean z3 = jobRequest.requiresCharging_;
                    this.requiresCharging_ = visitor.visitBoolean(z2, z2, z3, z3);
                    boolean z4 = this.requiresDeviceIdle_;
                    boolean z5 = jobRequest.requiresDeviceIdle_;
                    this.requiresDeviceIdle_ = visitor.visitBoolean(z4, z4, z5, z5);
                    boolean z6 = this.requiresBatteryNotLow_;
                    boolean z7 = jobRequest.requiresBatteryNotLow_;
                    this.requiresBatteryNotLow_ = visitor.visitBoolean(z6, z6, z7, z7);
                    boolean z8 = this.requirementsEnforced_;
                    boolean z9 = jobRequest.requirementsEnforced_;
                    this.requirementsEnforced_ = visitor.visitBoolean(z8, z8, z9, z9);
                    boolean z10 = this.updateCurrent_;
                    boolean z11 = jobRequest.updateCurrent_;
                    this.updateCurrent_ = visitor.visitBoolean(z10, z10, z11, z11);
                    boolean z12 = this.startNow_;
                    boolean z13 = jobRequest.startNow_;
                    this.startNow_ = visitor.visitBoolean(z12, z12, z13, z13);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= jobRequest.bitField0_;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            switch (readTag) {
                                case 0:
                                    z = true;
                                    break;
                                case 10:
                                    if (!this.extras_.isMutable()) {
                                        this.extras_ = this.extras_.mutableCopy();
                                    }
                                    ExtrasDefaultEntryHolder.defaultEntry.parseInto(this.extras_, codedInputStream, extensionRegistryLite);
                                    break;
                                case 18:
                                    this.handlerId_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 26:
                                    this.uuid_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 32:
                                    this.execWindowStartMs_ = codedInputStream.readInt64();
                                    break;
                                case 40:
                                    this.execWindowStopMs_ = codedInputStream.readInt64();
                                    break;
                                case 48:
                                    this.networkType_ = codedInputStream.readEnum();
                                    break;
                                case 56:
                                    this.backoffPolicy_ = codedInputStream.readEnum();
                                    break;
                                case 64:
                                    this.backoffValueMs_ = codedInputStream.readInt64();
                                    break;
                                case 72:
                                    this.requiresCharging_ = codedInputStream.readBool();
                                    break;
                                case 80:
                                    this.requiresDeviceIdle_ = codedInputStream.readBool();
                                    break;
                                case 88:
                                    this.requiresBatteryNotLow_ = codedInputStream.readBool();
                                    break;
                                case 96:
                                    this.requirementsEnforced_ = codedInputStream.readBool();
                                    break;
                                case 104:
                                    this.updateCurrent_ = codedInputStream.readBool();
                                    break;
                                case 112:
                                    this.startNow_ = codedInputStream.readBool();
                                    break;
                                default:
                                    if (codedInputStream.skipField(readTag)) {
                                        break;
                                    }
                                    z = true;
                                    break;
                            }
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
                        synchronized (JobRequest.class) {
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

        public BackOffPolicy getBackoffPolicy() {
            BackOffPolicy forNumber = BackOffPolicy.forNumber(this.backoffPolicy_);
            return forNumber == null ? BackOffPolicy.UNRECOGNIZED : forNumber;
        }

        public int getBackoffPolicyValue() {
            return this.backoffPolicy_;
        }

        public long getBackoffValueMs() {
            return this.backoffValueMs_;
        }

        public long getExecWindowStartMs() {
            return this.execWindowStartMs_;
        }

        public long getExecWindowStopMs() {
            return this.execWindowStopMs_;
        }

        @Deprecated
        public Map<String, String> getExtras() {
            return getExtrasMap();
        }

        public int getExtrasCount() {
            return internalGetExtras().size();
        }

        public Map<String, String> getExtrasMap() {
            return Collections.unmodifiableMap(internalGetExtras());
        }

        public String getExtrasOrDefault(String str, String str2) {
            if (str != null) {
                MapFieldLite internalGetExtras = internalGetExtras();
                return internalGetExtras.containsKey(str) ? (String) internalGetExtras.get(str) : str2;
            }
            throw new NullPointerException();
        }

        public String getExtrasOrThrow(String str) {
            if (str != null) {
                MapFieldLite internalGetExtras = internalGetExtras();
                if (internalGetExtras.containsKey(str)) {
                    return (String) internalGetExtras.get(str);
                }
                throw new IllegalArgumentException();
            }
            throw new NullPointerException();
        }

        public String getHandlerId() {
            return this.handlerId_;
        }

        public ByteString getHandlerIdBytes() {
            return ByteString.copyFromUtf8(this.handlerId_);
        }

        public NetworkType getNetworkType() {
            NetworkType forNumber = NetworkType.forNumber(this.networkType_);
            return forNumber == null ? NetworkType.UNRECOGNIZED : forNumber;
        }

        public int getNetworkTypeValue() {
            return this.networkType_;
        }

        public boolean getRequirementsEnforced() {
            return this.requirementsEnforced_;
        }

        public boolean getRequiresBatteryNotLow() {
            return this.requiresBatteryNotLow_;
        }

        public boolean getRequiresCharging() {
            return this.requiresCharging_;
        }

        public boolean getRequiresDeviceIdle() {
            return this.requiresDeviceIdle_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (Entry entry : internalGetExtras().entrySet()) {
                i2 += ExtrasDefaultEntryHolder.defaultEntry.computeMessageSize(1, entry.getKey(), entry.getValue());
            }
            if (!this.handlerId_.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(2, getHandlerId());
            }
            if (!this.uuid_.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(3, getUuid());
            }
            long j = this.execWindowStartMs_;
            if (j != 0) {
                i2 += CodedOutputStream.computeInt64Size(4, j);
            }
            long j2 = this.execWindowStopMs_;
            if (j2 != 0) {
                i2 += CodedOutputStream.computeInt64Size(5, j2);
            }
            if (this.networkType_ != NetworkType.NETWORK_TYPE_ANY.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(6, this.networkType_);
            }
            if (this.backoffPolicy_ != BackOffPolicy.BACKOFF_POLICY_LINEAR.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(7, this.backoffPolicy_);
            }
            long j3 = this.backoffValueMs_;
            if (j3 != 0) {
                i2 += CodedOutputStream.computeInt64Size(8, j3);
            }
            boolean z = this.requiresCharging_;
            if (z) {
                i2 += CodedOutputStream.computeBoolSize(9, z);
            }
            boolean z2 = this.requiresDeviceIdle_;
            if (z2) {
                i2 += CodedOutputStream.computeBoolSize(10, z2);
            }
            boolean z3 = this.requiresBatteryNotLow_;
            if (z3) {
                i2 += CodedOutputStream.computeBoolSize(11, z3);
            }
            boolean z4 = this.requirementsEnforced_;
            if (z4) {
                i2 += CodedOutputStream.computeBoolSize(12, z4);
            }
            boolean z5 = this.updateCurrent_;
            if (z5) {
                i2 += CodedOutputStream.computeBoolSize(13, z5);
            }
            boolean z6 = this.startNow_;
            if (z6) {
                i2 += CodedOutputStream.computeBoolSize(14, z6);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean getStartNow() {
            return this.startNow_;
        }

        public boolean getUpdateCurrent() {
            return this.updateCurrent_;
        }

        public String getUuid() {
            return this.uuid_;
        }

        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (Entry entry : internalGetExtras().entrySet()) {
                ExtrasDefaultEntryHolder.defaultEntry.serializeTo(codedOutputStream, 1, entry.getKey(), entry.getValue());
            }
            if (!this.handlerId_.isEmpty()) {
                codedOutputStream.writeString(2, getHandlerId());
            }
            if (!this.uuid_.isEmpty()) {
                codedOutputStream.writeString(3, getUuid());
            }
            long j = this.execWindowStartMs_;
            if (j != 0) {
                codedOutputStream.writeInt64(4, j);
            }
            long j2 = this.execWindowStopMs_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(5, j2);
            }
            if (this.networkType_ != NetworkType.NETWORK_TYPE_ANY.getNumber()) {
                codedOutputStream.writeEnum(6, this.networkType_);
            }
            if (this.backoffPolicy_ != BackOffPolicy.BACKOFF_POLICY_LINEAR.getNumber()) {
                codedOutputStream.writeEnum(7, this.backoffPolicy_);
            }
            long j3 = this.backoffValueMs_;
            if (j3 != 0) {
                codedOutputStream.writeInt64(8, j3);
            }
            boolean z = this.requiresCharging_;
            if (z) {
                codedOutputStream.writeBool(9, z);
            }
            boolean z2 = this.requiresDeviceIdle_;
            if (z2) {
                codedOutputStream.writeBool(10, z2);
            }
            boolean z3 = this.requiresBatteryNotLow_;
            if (z3) {
                codedOutputStream.writeBool(11, z3);
            }
            boolean z4 = this.requirementsEnforced_;
            if (z4) {
                codedOutputStream.writeBool(12, z4);
            }
            boolean z5 = this.updateCurrent_;
            if (z5) {
                codedOutputStream.writeBool(13, z5);
            }
            boolean z6 = this.startNow_;
            if (z6) {
                codedOutputStream.writeBool(14, z6);
            }
        }

        public static Builder newBuilder(JobRequest jobRequest) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(jobRequest);
        }

        public static JobRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (JobRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static JobRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (JobRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static JobRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (JobRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static JobRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (JobRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static JobRequest parseFrom(InputStream inputStream) throws IOException {
            return (JobRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JobRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (JobRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static JobRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (JobRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static JobRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (JobRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: co.znly.core.scheduling.SyncJobExtras$JobRequestOrBuilder */
    public interface JobRequestOrBuilder extends MessageLiteOrBuilder {
        boolean containsExtras(String str);

        BackOffPolicy getBackoffPolicy();

        int getBackoffPolicyValue();

        long getBackoffValueMs();

        long getExecWindowStartMs();

        long getExecWindowStopMs();

        @Deprecated
        Map<String, String> getExtras();

        int getExtrasCount();

        Map<String, String> getExtrasMap();

        String getExtrasOrDefault(String str, String str2);

        String getExtrasOrThrow(String str);

        String getHandlerId();

        ByteString getHandlerIdBytes();

        NetworkType getNetworkType();

        int getNetworkTypeValue();

        boolean getRequirementsEnforced();

        boolean getRequiresBatteryNotLow();

        boolean getRequiresCharging();

        boolean getRequiresDeviceIdle();

        boolean getStartNow();

        boolean getUpdateCurrent();

        String getUuid();

        ByteString getUuidBytes();
    }

    /* renamed from: co.znly.core.scheduling.SyncJobExtras$Jobs */
    public static final class Jobs extends GeneratedMessageLite<Jobs, Builder> implements JobsOrBuilder {
        /* access modifiers changed from: private */
        public static final Jobs DEFAULT_INSTANCE = new Jobs();
        public static final int JOBS_FIELD_NUMBER = 1;
        private static volatile Parser<Jobs> PARSER;
        private ProtobufList<Job> jobs_ = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: co.znly.core.scheduling.SyncJobExtras$Jobs$Builder */
        public static final class Builder extends p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder<Jobs, Builder> implements JobsOrBuilder {
            /* synthetic */ Builder(C66301 r1) {
                this();
            }

            public Builder addAllJobs(Iterable<? extends Job> iterable) {
                copyOnWrite();
                ((Jobs) this.instance).addAllJobs(iterable);
                return this;
            }

            public Builder addJobs(Job job) {
                copyOnWrite();
                ((Jobs) this.instance).addJobs(job);
                return this;
            }

            public Builder clearJobs() {
                copyOnWrite();
                ((Jobs) this.instance).clearJobs();
                return this;
            }

            public Job getJobs(int i) {
                return ((Jobs) this.instance).getJobs(i);
            }

            public int getJobsCount() {
                return ((Jobs) this.instance).getJobsCount();
            }

            public List<Job> getJobsList() {
                return Collections.unmodifiableList(((Jobs) this.instance).getJobsList());
            }

            public Builder removeJobs(int i) {
                copyOnWrite();
                ((Jobs) this.instance).removeJobs(i);
                return this;
            }

            public Builder setJobs(int i, Job job) {
                copyOnWrite();
                ((Jobs) this.instance).setJobs(i, job);
                return this;
            }

            private Builder() {
                super(Jobs.DEFAULT_INSTANCE);
            }

            public Builder addJobs(int i, Job job) {
                copyOnWrite();
                ((Jobs) this.instance).addJobs(i, job);
                return this;
            }

            public Builder setJobs(int i, Builder builder) {
                copyOnWrite();
                ((Jobs) this.instance).setJobs(i, builder);
                return this;
            }

            public Builder addJobs(Builder builder) {
                copyOnWrite();
                ((Jobs) this.instance).addJobs(builder);
                return this;
            }

            public Builder addJobs(int i, Builder builder) {
                copyOnWrite();
                ((Jobs) this.instance).addJobs(i, builder);
                return this;
            }
        }

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private Jobs() {
        }

        /* access modifiers changed from: private */
        public void addAllJobs(Iterable<? extends Job> iterable) {
            ensureJobsIsMutable();
            AbstractMessageLite.addAll(iterable, this.jobs_);
        }

        /* access modifiers changed from: private */
        public void addJobs(Job job) {
            if (job != null) {
                ensureJobsIsMutable();
                this.jobs_.add(job);
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void clearJobs() {
            this.jobs_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureJobsIsMutable() {
            if (!this.jobs_.isModifiable()) {
                this.jobs_ = GeneratedMessageLite.mutableCopy(this.jobs_);
            }
        }

        public static Jobs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Jobs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Jobs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Jobs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Jobs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<Jobs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeJobs(int i) {
            ensureJobsIsMutable();
            this.jobs_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setJobs(int i, Job job) {
            if (job != null) {
                ensureJobsIsMutable();
                this.jobs_.set(i, job);
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C66301.f16214xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Jobs();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.jobs_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(null);
                case 5:
                    this.jobs_ = ((Visitor) obj).visitList(this.jobs_, ((Jobs) obj2).jobs_);
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
                                    if (!this.jobs_.isModifiable()) {
                                        this.jobs_ = GeneratedMessageLite.mutableCopy(this.jobs_);
                                    }
                                    this.jobs_.add(codedInputStream.readMessage(Job.parser(), extensionRegistryLite));
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
                        synchronized (Jobs.class) {
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

        public Job getJobs(int i) {
            return (Job) this.jobs_.get(i);
        }

        public int getJobsCount() {
            return this.jobs_.size();
        }

        public List<Job> getJobsList() {
            return this.jobs_;
        }

        public JobOrBuilder getJobsOrBuilder(int i) {
            return (JobOrBuilder) this.jobs_.get(i);
        }

        public List<? extends JobOrBuilder> getJobsOrBuilderList() {
            return this.jobs_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.jobs_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.jobs_.get(i3));
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.jobs_.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.jobs_.get(i));
            }
        }

        public static Builder newBuilder(Jobs jobs) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(jobs);
        }

        public static Jobs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Jobs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Jobs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Jobs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Jobs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Jobs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        /* access modifiers changed from: private */
        public void addJobs(int i, Job job) {
            if (job != null) {
                ensureJobsIsMutable();
                this.jobs_.add(i, job);
                return;
            }
            throw new NullPointerException();
        }

        public static Jobs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Jobs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        /* access modifiers changed from: private */
        public void setJobs(int i, Builder builder) {
            ensureJobsIsMutable();
            this.jobs_.set(i, builder.build());
        }

        public static Jobs parseFrom(InputStream inputStream) throws IOException {
            return (Jobs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Jobs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Jobs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* access modifiers changed from: private */
        public void addJobs(Builder builder) {
            ensureJobsIsMutable();
            this.jobs_.add(builder.build());
        }

        public static Jobs parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Jobs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Jobs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Jobs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* access modifiers changed from: private */
        public void addJobs(int i, Builder builder) {
            ensureJobsIsMutable();
            this.jobs_.add(i, builder.build());
        }
    }

    /* renamed from: co.znly.core.scheduling.SyncJobExtras$JobsOrBuilder */
    public interface JobsOrBuilder extends MessageLiteOrBuilder {
        Job getJobs(int i);

        int getJobsCount();

        List<Job> getJobsList();
    }

    /* renamed from: co.znly.core.scheduling.SyncJobExtras$Result */
    public enum Result implements EnumLite {
        RESULT_UNKNOWN(0),
        RESULT_SUCCESS(1),
        RESULT_FAILURE(2),
        RESULT_RESCHEDULE(3),
        UNRECOGNIZED(-1);
        
        public static final int RESULT_FAILURE_VALUE = 2;
        public static final int RESULT_RESCHEDULE_VALUE = 3;
        public static final int RESULT_SUCCESS_VALUE = 1;
        public static final int RESULT_UNKNOWN_VALUE = 0;
        private static final EnumLiteMap<Result> internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new EnumLiteMap<Result>() {
                public Result findValueByNumber(int i) {
                    return Result.forNumber(i);
                }
            };
        }

        private Result(int i) {
            this.value = i;
        }

        public static Result forNumber(int i) {
            if (i == 0) {
                return RESULT_UNKNOWN;
            }
            if (i == 1) {
                return RESULT_SUCCESS;
            }
            if (i == 2) {
                return RESULT_FAILURE;
            }
            if (i != 3) {
                return null;
            }
            return RESULT_RESCHEDULE;
        }

        public static EnumLiteMap<Result> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Result valueOf(int i) {
            return forNumber(i);
        }
    }

    private SyncJobExtras() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
