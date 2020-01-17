package p213co.znly.core.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanFilter.Builder;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.ParcelUuid;
import android.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p213co.znly.core.bluetooth.AndroidBluetooth.DeviceScanFromBindings;
import p213co.znly.core.bluetooth.AndroidBluetooth.StartAdMsg;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;

/* renamed from: co.znly.core.bluetooth.BluetoothManager */
public final class BluetoothManager {
    public static final String TAG = "BluetoothManager";
    private static final int bluetoothStateUnknown = -1;
    private static boolean bluetoothSupported;
    AdvertiseCallback advertisingCallback = new AdvertiseCallback() {
        public void onStartFailure(int i) {
            super.onStartFailure(i);
            BluetoothManager.this._onStartFailure();
        }

        public void onStartSuccess(AdvertiseSettings advertiseSettings) {
            super.onStartSuccess(advertiseSettings);
            BluetoothManager.this._onStartSuccess();
        }
    };
    private final BroadcastReceiver bluetoothReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                BluetoothManager.this.onBluetoothStateChange(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE));
            }
        }
    };
    private BluetoothAdapter btAdapter;
    private BluetoothLeAdvertiser btAdvertiser;
    private BluetoothLeScanner btScanner;
    private final Context context;
    private boolean filterScanByServiceUuid;
    private ScanCallback scanCallback = new ScanCallback() {
        public void onBatchScanResults(List<ScanResult> list) {
            for (ScanResult receivedScanResult : list) {
                BluetoothManager.this.receivedScanResult(receivedScanResult);
            }
        }

        public void onScanFailed(int i) {
        }

        public void onScanResult(int i, ScanResult scanResult) {
            BluetoothManager.this.receivedScanResult(scanResult);
        }
    };
    private ParcelUuid serviceUuidToFilterBy;

    public BluetoothManager(Context context2) {
        this.context = context2;
        this.btAdapter = BluetoothAdapter.getDefaultAdapter();
        this.filterScanByServiceUuid = false;
        bluetoothSupported = isBluetoothSupported();
        if (bluetoothSupported) {
            this.btScanner = this.btAdapter.getBluetoothLeScanner();
            this.btAdvertiser = this.btAdapter.getBluetoothLeAdvertiser();
        }
    }

    private List<ScanFilter> getDefaultScanFilters() {
        return Collections.singletonList(new Builder().build());
    }

    private List<ScanFilter> getScanFilters(ParcelUuid parcelUuid) {
        return Collections.singletonList(new Builder().setServiceUuid(parcelUuid).build());
    }

    private ScanSettings getScanSettings() {
        return new ScanSettings.Builder().setScanMode(1).build();
    }

    private static boolean isBluetoothSupported() {
        return VERSION.SDK_INT >= 23 && BluetoothAdapter.getDefaultAdapter() != null;
    }

    /* access modifiers changed from: private */
    public void onBluetoothStateChange(int i) {
        _onBluetoothStateChange(i);
    }

    public native void _onBluetoothDeviceScanned(byte[] bArr);

    public native void _onBluetoothStateChange(int i);

    public native void _onStartFailure();

    public native void _onStartSuccess();

    public String getAddress() {
        if (!bluetoothSupported) {
            return "";
        }
        return this.btAdapter.getAddress();
    }

    public int getState() {
        if (!bluetoothSupported) {
            return -1;
        }
        return this.btAdapter.getState();
    }

    /* access modifiers changed from: protected */
    public void onBluetoothDeviceScanned(String str, String str2, int i, byte[] bArr, byte[] bArr2) {
        _onBluetoothDeviceScanned(((DeviceScanFromBindings) DeviceScanFromBindings.newBuilder().setMacAddress(str).setDeviceName(str2).setRssi((long) i).setScanRecordData(ByteString.copyFrom(bArr)).setServiceData(ByteString.copyFrom(bArr2)).build()).toByteArray());
    }

    public void receivedScanResult(ScanResult scanResult) {
        byte[] bArr;
        if (scanResult != null) {
            BluetoothDevice device = scanResult.getDevice();
            if (!(device == null || device.getAddress() == null)) {
                ScanRecord scanRecord = scanResult.getScanRecord();
                byte[] bArr2 = null;
                if (scanRecord != null) {
                    bArr = scanRecord.getBytes();
                    if (this.filterScanByServiceUuid) {
                        Map serviceData = scanRecord.getServiceData();
                        if (serviceData != null) {
                            bArr2 = (byte[]) serviceData.get(this.serviceUuidToFilterBy);
                        }
                    }
                } else {
                    bArr = null;
                }
                String name = device.getName();
                if (bArr == null) {
                    bArr = new byte[0];
                }
                byte[] bArr3 = bArr;
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = bArr2;
                if (name == null) {
                    name = "";
                }
                onBluetoothDeviceScanned(scanResult.getDevice().getAddress(), name, scanResult.getRssi(), bArr3, bArr4);
            }
        }
    }

    public void registerForStateUpdates() {
        if (bluetoothSupported) {
            this.context.registerReceiver(this.bluetoothReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    public void startAdvertising(byte[] bArr) {
        if (bluetoothSupported) {
            try {
                StartAdMsg startAdMsg = (StartAdMsg) ((StartAdMsg.Builder) StartAdMsg.newBuilder().mergeFrom(bArr)).build();
                this.btAdvertiser.startAdvertising(new AdvertiseSettings.Builder().setAdvertiseMode(startAdMsg.getAdvertiseMode()).setTxPowerLevel(startAdMsg.getTxPowerLevel()).setConnectable(false).build(), new AdvertiseData.Builder().addServiceData(ParcelUuid.fromString(startAdMsg.getServiceUuid()), startAdMsg.getServiceData().toByteArray()).build(), this.advertisingCallback);
            } catch (InvalidProtocolBufferException e) {
                Log.e(TAG, "Can't unmarshal bluetooth StartAdMsg to buffer", e);
            }
        }
    }

    public void startScan() {
        if (bluetoothSupported) {
            this.filterScanByServiceUuid = false;
            this.serviceUuidToFilterBy = null;
            this.btScanner.startScan(getDefaultScanFilters(), getScanSettings(), this.scanCallback);
        }
    }

    public void startScanWithFilter(String str) {
        if (bluetoothSupported) {
            this.filterScanByServiceUuid = true;
            this.serviceUuidToFilterBy = ParcelUuid.fromString(str);
            this.btScanner.startScan(getScanFilters(this.serviceUuidToFilterBy), getScanSettings(), this.scanCallback);
        }
    }

    public void stopAdvertising() {
        if (bluetoothSupported) {
            this.btAdvertiser.stopAdvertising(this.advertisingCallback);
        }
    }

    public void stopScan() {
        if (bluetoothSupported) {
            this.btScanner.stopScan(this.scanCallback);
        }
    }

    public void unregisterForStateUpdates() {
        if (bluetoothSupported) {
            this.context.unregisterReceiver(this.bluetoothReceiver);
        }
    }
}
