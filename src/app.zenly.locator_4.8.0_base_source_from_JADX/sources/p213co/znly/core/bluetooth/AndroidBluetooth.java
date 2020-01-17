package p213co.znly.core.bluetooth;

import java.io.IOException;
import java.io.InputStream;
import p213co.znly.core.vendor.com.google.protobuf.AbstractMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.core.bluetooth.AndroidBluetooth */
public final class AndroidBluetooth {

    /* renamed from: co.znly.core.bluetooth.AndroidBluetooth$1 */
    static /* synthetic */ class C63901 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15968xa1df5c61 = new int[MethodToInvoke.values().length];

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
                f15968xa1df5c61 = r0
                int[] r0 = f15968xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f15968xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f15968xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002a }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f15968xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0035 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f15968xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0040 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.VISIT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f15968xa1df5c61     // Catch:{ NoSuchFieldError -> 0x004b }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f15968xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0056 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f15968xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0062 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p213co.znly.core.bluetooth.AndroidBluetooth.C63901.<clinit>():void");
        }
    }

    /* renamed from: co.znly.core.bluetooth.AndroidBluetooth$DeviceScanFromBindings */
    public static final class DeviceScanFromBindings extends GeneratedMessageLite<DeviceScanFromBindings, Builder> implements DeviceScanFromBindingsOrBuilder {
        /* access modifiers changed from: private */
        public static final DeviceScanFromBindings DEFAULT_INSTANCE = new DeviceScanFromBindings();
        public static final int DEVICE_NAME_FIELD_NUMBER = 2;
        public static final int MAC_ADDRESS_FIELD_NUMBER = 1;
        private static volatile Parser<DeviceScanFromBindings> PARSER = null;
        public static final int RSSI_FIELD_NUMBER = 3;
        public static final int SCAN_RECORD_DATA_FIELD_NUMBER = 4;
        public static final int SERVICE_DATA_FIELD_NUMBER = 5;
        private String deviceName_;
        private String macAddress_;
        private long rssi_;
        private ByteString scanRecordData_;
        private ByteString serviceData_;

        /* renamed from: co.znly.core.bluetooth.AndroidBluetooth$DeviceScanFromBindings$Builder */
        public static final class Builder extends p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder<DeviceScanFromBindings, Builder> implements DeviceScanFromBindingsOrBuilder {
            /* synthetic */ Builder(C63901 r1) {
                this();
            }

            public Builder clearDeviceName() {
                copyOnWrite();
                ((DeviceScanFromBindings) this.instance).clearDeviceName();
                return this;
            }

            public Builder clearMacAddress() {
                copyOnWrite();
                ((DeviceScanFromBindings) this.instance).clearMacAddress();
                return this;
            }

            public Builder clearRssi() {
                copyOnWrite();
                ((DeviceScanFromBindings) this.instance).clearRssi();
                return this;
            }

            public Builder clearScanRecordData() {
                copyOnWrite();
                ((DeviceScanFromBindings) this.instance).clearScanRecordData();
                return this;
            }

            public Builder clearServiceData() {
                copyOnWrite();
                ((DeviceScanFromBindings) this.instance).clearServiceData();
                return this;
            }

            public String getDeviceName() {
                return ((DeviceScanFromBindings) this.instance).getDeviceName();
            }

            public ByteString getDeviceNameBytes() {
                return ((DeviceScanFromBindings) this.instance).getDeviceNameBytes();
            }

            public String getMacAddress() {
                return ((DeviceScanFromBindings) this.instance).getMacAddress();
            }

            public ByteString getMacAddressBytes() {
                return ((DeviceScanFromBindings) this.instance).getMacAddressBytes();
            }

            public long getRssi() {
                return ((DeviceScanFromBindings) this.instance).getRssi();
            }

            public ByteString getScanRecordData() {
                return ((DeviceScanFromBindings) this.instance).getScanRecordData();
            }

            public ByteString getServiceData() {
                return ((DeviceScanFromBindings) this.instance).getServiceData();
            }

            public Builder setDeviceName(String str) {
                copyOnWrite();
                ((DeviceScanFromBindings) this.instance).setDeviceName(str);
                return this;
            }

            public Builder setDeviceNameBytes(ByteString byteString) {
                copyOnWrite();
                ((DeviceScanFromBindings) this.instance).setDeviceNameBytes(byteString);
                return this;
            }

            public Builder setMacAddress(String str) {
                copyOnWrite();
                ((DeviceScanFromBindings) this.instance).setMacAddress(str);
                return this;
            }

            public Builder setMacAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((DeviceScanFromBindings) this.instance).setMacAddressBytes(byteString);
                return this;
            }

            public Builder setRssi(long j) {
                copyOnWrite();
                ((DeviceScanFromBindings) this.instance).setRssi(j);
                return this;
            }

            public Builder setScanRecordData(ByteString byteString) {
                copyOnWrite();
                ((DeviceScanFromBindings) this.instance).setScanRecordData(byteString);
                return this;
            }

            public Builder setServiceData(ByteString byteString) {
                copyOnWrite();
                ((DeviceScanFromBindings) this.instance).setServiceData(byteString);
                return this;
            }

            private Builder() {
                super(DeviceScanFromBindings.DEFAULT_INSTANCE);
            }
        }

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private DeviceScanFromBindings() {
            String str = "";
            this.macAddress_ = str;
            this.deviceName_ = str;
            ByteString byteString = ByteString.EMPTY;
            this.scanRecordData_ = byteString;
            this.serviceData_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearDeviceName() {
            this.deviceName_ = getDefaultInstance().getDeviceName();
        }

        /* access modifiers changed from: private */
        public void clearMacAddress() {
            this.macAddress_ = getDefaultInstance().getMacAddress();
        }

        /* access modifiers changed from: private */
        public void clearRssi() {
            this.rssi_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearScanRecordData() {
            this.scanRecordData_ = getDefaultInstance().getScanRecordData();
        }

        /* access modifiers changed from: private */
        public void clearServiceData() {
            this.serviceData_ = getDefaultInstance().getServiceData();
        }

        public static DeviceScanFromBindings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceScanFromBindings parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeviceScanFromBindings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceScanFromBindings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeviceScanFromBindings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<DeviceScanFromBindings> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDeviceName(String str) {
            if (str != null) {
                this.deviceName_ = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setDeviceNameBytes(ByteString byteString) {
            if (byteString != null) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.deviceName_ = byteString.toStringUtf8();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setMacAddress(String str) {
            if (str != null) {
                this.macAddress_ = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setMacAddressBytes(ByteString byteString) {
            if (byteString != null) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.macAddress_ = byteString.toStringUtf8();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setRssi(long j) {
            this.rssi_ = j;
        }

        /* access modifiers changed from: private */
        public void setScanRecordData(ByteString byteString) {
            if (byteString != null) {
                this.scanRecordData_ = byteString;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setServiceData(ByteString byteString) {
            if (byteString != null) {
                this.serviceData_ = byteString;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C63901.f15968xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DeviceScanFromBindings();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    DeviceScanFromBindings deviceScanFromBindings = (DeviceScanFromBindings) obj2;
                    this.macAddress_ = visitor.visitString(!this.macAddress_.isEmpty(), this.macAddress_, !deviceScanFromBindings.macAddress_.isEmpty(), deviceScanFromBindings.macAddress_);
                    this.deviceName_ = visitor.visitString(!this.deviceName_.isEmpty(), this.deviceName_, !deviceScanFromBindings.deviceName_.isEmpty(), deviceScanFromBindings.deviceName_);
                    this.rssi_ = visitor.visitLong(this.rssi_ != 0, this.rssi_, deviceScanFromBindings.rssi_ != 0, deviceScanFromBindings.rssi_);
                    this.scanRecordData_ = visitor.visitByteString(this.scanRecordData_ != ByteString.EMPTY, this.scanRecordData_, deviceScanFromBindings.scanRecordData_ != ByteString.EMPTY, deviceScanFromBindings.scanRecordData_);
                    boolean z2 = this.serviceData_ != ByteString.EMPTY;
                    ByteString byteString = this.serviceData_;
                    if (deviceScanFromBindings.serviceData_ != ByteString.EMPTY) {
                        z = true;
                    }
                    this.serviceData_ = visitor.visitByteString(z2, byteString, z, deviceScanFromBindings.serviceData_);
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.macAddress_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.deviceName_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 24) {
                                    this.rssi_ = codedInputStream.readInt64();
                                } else if (readTag == 34) {
                                    this.scanRecordData_ = codedInputStream.readBytes();
                                } else if (readTag == 42) {
                                    this.serviceData_ = codedInputStream.readBytes();
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
                        synchronized (DeviceScanFromBindings.class) {
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

        public String getDeviceName() {
            return this.deviceName_;
        }

        public ByteString getDeviceNameBytes() {
            return ByteString.copyFromUtf8(this.deviceName_);
        }

        public String getMacAddress() {
            return this.macAddress_;
        }

        public ByteString getMacAddressBytes() {
            return ByteString.copyFromUtf8(this.macAddress_);
        }

        public long getRssi() {
            return this.rssi_;
        }

        public ByteString getScanRecordData() {
            return this.scanRecordData_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.macAddress_.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getMacAddress());
            }
            if (!this.deviceName_.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(2, getDeviceName());
            }
            long j = this.rssi_;
            if (j != 0) {
                i2 += CodedOutputStream.computeInt64Size(3, j);
            }
            if (!this.scanRecordData_.isEmpty()) {
                i2 += CodedOutputStream.computeBytesSize(4, this.scanRecordData_);
            }
            if (!this.serviceData_.isEmpty()) {
                i2 += CodedOutputStream.computeBytesSize(5, this.serviceData_);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public ByteString getServiceData() {
            return this.serviceData_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.macAddress_.isEmpty()) {
                codedOutputStream.writeString(1, getMacAddress());
            }
            if (!this.deviceName_.isEmpty()) {
                codedOutputStream.writeString(2, getDeviceName());
            }
            long j = this.rssi_;
            if (j != 0) {
                codedOutputStream.writeInt64(3, j);
            }
            if (!this.scanRecordData_.isEmpty()) {
                codedOutputStream.writeBytes(4, this.scanRecordData_);
            }
            if (!this.serviceData_.isEmpty()) {
                codedOutputStream.writeBytes(5, this.serviceData_);
            }
        }

        public static Builder newBuilder(DeviceScanFromBindings deviceScanFromBindings) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(deviceScanFromBindings);
        }

        public static DeviceScanFromBindings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceScanFromBindings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeviceScanFromBindings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceScanFromBindings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DeviceScanFromBindings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeviceScanFromBindings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeviceScanFromBindings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceScanFromBindings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DeviceScanFromBindings parseFrom(InputStream inputStream) throws IOException {
            return (DeviceScanFromBindings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceScanFromBindings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceScanFromBindings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeviceScanFromBindings parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DeviceScanFromBindings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DeviceScanFromBindings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceScanFromBindings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: co.znly.core.bluetooth.AndroidBluetooth$DeviceScanFromBindingsOrBuilder */
    public interface DeviceScanFromBindingsOrBuilder extends MessageLiteOrBuilder {
        String getDeviceName();

        ByteString getDeviceNameBytes();

        String getMacAddress();

        ByteString getMacAddressBytes();

        long getRssi();

        ByteString getScanRecordData();

        ByteString getServiceData();
    }

    /* renamed from: co.znly.core.bluetooth.AndroidBluetooth$StartAdMsg */
    public static final class StartAdMsg extends GeneratedMessageLite<StartAdMsg, Builder> implements StartAdMsgOrBuilder {
        public static final int ADVERTISE_MODE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final StartAdMsg DEFAULT_INSTANCE = new StartAdMsg();
        private static volatile Parser<StartAdMsg> PARSER = null;
        public static final int SERVICE_DATA_FIELD_NUMBER = 4;
        public static final int SERVICE_UUID_FIELD_NUMBER = 3;
        public static final int TX_POWER_LEVEL_FIELD_NUMBER = 2;
        private int advertiseMode_;
        private ByteString serviceData_ = ByteString.EMPTY;
        private String serviceUuid_ = "";
        private int txPowerLevel_;

        /* renamed from: co.znly.core.bluetooth.AndroidBluetooth$StartAdMsg$Builder */
        public static final class Builder extends p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder<StartAdMsg, Builder> implements StartAdMsgOrBuilder {
            /* synthetic */ Builder(C63901 r1) {
                this();
            }

            public Builder clearAdvertiseMode() {
                copyOnWrite();
                ((StartAdMsg) this.instance).clearAdvertiseMode();
                return this;
            }

            public Builder clearServiceData() {
                copyOnWrite();
                ((StartAdMsg) this.instance).clearServiceData();
                return this;
            }

            public Builder clearServiceUuid() {
                copyOnWrite();
                ((StartAdMsg) this.instance).clearServiceUuid();
                return this;
            }

            public Builder clearTxPowerLevel() {
                copyOnWrite();
                ((StartAdMsg) this.instance).clearTxPowerLevel();
                return this;
            }

            public int getAdvertiseMode() {
                return ((StartAdMsg) this.instance).getAdvertiseMode();
            }

            public ByteString getServiceData() {
                return ((StartAdMsg) this.instance).getServiceData();
            }

            public String getServiceUuid() {
                return ((StartAdMsg) this.instance).getServiceUuid();
            }

            public ByteString getServiceUuidBytes() {
                return ((StartAdMsg) this.instance).getServiceUuidBytes();
            }

            public int getTxPowerLevel() {
                return ((StartAdMsg) this.instance).getTxPowerLevel();
            }

            public Builder setAdvertiseMode(int i) {
                copyOnWrite();
                ((StartAdMsg) this.instance).setAdvertiseMode(i);
                return this;
            }

            public Builder setServiceData(ByteString byteString) {
                copyOnWrite();
                ((StartAdMsg) this.instance).setServiceData(byteString);
                return this;
            }

            public Builder setServiceUuid(String str) {
                copyOnWrite();
                ((StartAdMsg) this.instance).setServiceUuid(str);
                return this;
            }

            public Builder setServiceUuidBytes(ByteString byteString) {
                copyOnWrite();
                ((StartAdMsg) this.instance).setServiceUuidBytes(byteString);
                return this;
            }

            public Builder setTxPowerLevel(int i) {
                copyOnWrite();
                ((StartAdMsg) this.instance).setTxPowerLevel(i);
                return this;
            }

            private Builder() {
                super(StartAdMsg.DEFAULT_INSTANCE);
            }
        }

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private StartAdMsg() {
        }

        /* access modifiers changed from: private */
        public void clearAdvertiseMode() {
            this.advertiseMode_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearServiceData() {
            this.serviceData_ = getDefaultInstance().getServiceData();
        }

        /* access modifiers changed from: private */
        public void clearServiceUuid() {
            this.serviceUuid_ = getDefaultInstance().getServiceUuid();
        }

        /* access modifiers changed from: private */
        public void clearTxPowerLevel() {
            this.txPowerLevel_ = 0;
        }

        public static StartAdMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static StartAdMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StartAdMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartAdMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StartAdMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<StartAdMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAdvertiseMode(int i) {
            this.advertiseMode_ = i;
        }

        /* access modifiers changed from: private */
        public void setServiceData(ByteString byteString) {
            if (byteString != null) {
                this.serviceData_ = byteString;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setServiceUuid(String str) {
            if (str != null) {
                this.serviceUuid_ = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setServiceUuidBytes(ByteString byteString) {
            if (byteString != null) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.serviceUuid_ = byteString.toStringUtf8();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setTxPowerLevel(int i) {
            this.txPowerLevel_ = i;
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C63901.f15968xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new StartAdMsg();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    StartAdMsg startAdMsg = (StartAdMsg) obj2;
                    this.advertiseMode_ = visitor.visitInt(this.advertiseMode_ != 0, this.advertiseMode_, startAdMsg.advertiseMode_ != 0, startAdMsg.advertiseMode_);
                    this.txPowerLevel_ = visitor.visitInt(this.txPowerLevel_ != 0, this.txPowerLevel_, startAdMsg.txPowerLevel_ != 0, startAdMsg.txPowerLevel_);
                    this.serviceUuid_ = visitor.visitString(!this.serviceUuid_.isEmpty(), this.serviceUuid_, !startAdMsg.serviceUuid_.isEmpty(), startAdMsg.serviceUuid_);
                    boolean z2 = this.serviceData_ != ByteString.EMPTY;
                    ByteString byteString = this.serviceData_;
                    if (startAdMsg.serviceData_ != ByteString.EMPTY) {
                        z = true;
                    }
                    this.serviceData_ = visitor.visitByteString(z2, byteString, z, startAdMsg.serviceData_);
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
                                    this.advertiseMode_ = codedInputStream.readInt32();
                                } else if (readTag == 16) {
                                    this.txPowerLevel_ = codedInputStream.readInt32();
                                } else if (readTag == 26) {
                                    this.serviceUuid_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    this.serviceData_ = codedInputStream.readBytes();
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
                        synchronized (StartAdMsg.class) {
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

        public int getAdvertiseMode() {
            return this.advertiseMode_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int i3 = this.advertiseMode_;
            if (i3 != 0) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
            }
            int i4 = this.txPowerLevel_;
            if (i4 != 0) {
                i2 += CodedOutputStream.computeInt32Size(2, i4);
            }
            if (!this.serviceUuid_.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(3, getServiceUuid());
            }
            if (!this.serviceData_.isEmpty()) {
                i2 += CodedOutputStream.computeBytesSize(4, this.serviceData_);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public ByteString getServiceData() {
            return this.serviceData_;
        }

        public String getServiceUuid() {
            return this.serviceUuid_;
        }

        public ByteString getServiceUuidBytes() {
            return ByteString.copyFromUtf8(this.serviceUuid_);
        }

        public int getTxPowerLevel() {
            return this.txPowerLevel_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.advertiseMode_;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            int i2 = this.txPowerLevel_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(2, i2);
            }
            if (!this.serviceUuid_.isEmpty()) {
                codedOutputStream.writeString(3, getServiceUuid());
            }
            if (!this.serviceData_.isEmpty()) {
                codedOutputStream.writeBytes(4, this.serviceData_);
            }
        }

        public static Builder newBuilder(StartAdMsg startAdMsg) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(startAdMsg);
        }

        public static StartAdMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartAdMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartAdMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartAdMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StartAdMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StartAdMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StartAdMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartAdMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StartAdMsg parseFrom(InputStream inputStream) throws IOException {
            return (StartAdMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartAdMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartAdMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartAdMsg parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StartAdMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StartAdMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartAdMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: co.znly.core.bluetooth.AndroidBluetooth$StartAdMsgOrBuilder */
    public interface StartAdMsgOrBuilder extends MessageLiteOrBuilder {
        int getAdvertiseMode();

        ByteString getServiceData();

        String getServiceUuid();

        ByteString getServiceUuidBytes();

        int getTxPowerLevel();
    }

    private AndroidBluetooth() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
