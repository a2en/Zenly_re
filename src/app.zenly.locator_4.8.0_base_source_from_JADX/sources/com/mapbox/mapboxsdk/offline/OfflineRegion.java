package com.mapbox.mapboxsdk.offline;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.C11419a;
import com.mapbox.mapboxsdk.storage.FileSource;

public class OfflineRegion {
    @Keep
    private long nativePtr;

    @Keep
    public interface OfflineRegionDeleteCallback {
        void onDelete();

        void onError(String str);
    }

    @Keep
    public interface OfflineRegionObserver {
        void mapboxTileCountLimitExceeded(long j);

        void onError(OfflineRegionError offlineRegionError);

        void onStatusChanged(OfflineRegionStatus offlineRegionStatus);
    }

    @Keep
    public interface OfflineRegionStatusCallback {
        void onError(String str);

        void onStatus(OfflineRegionStatus offlineRegionStatus);
    }

    @Keep
    public interface OfflineRegionUpdateMetadataCallback {
        void onError(String str);

        void onUpdate(byte[] bArr);
    }

    static {
        C11419a.m29393a();
    }

    @Keep
    private OfflineRegion(long j, FileSource fileSource, long j2, OfflineRegionDefinition offlineRegionDefinition, byte[] bArr) {
        new Handler(Looper.getMainLooper());
        initialize(j, fileSource);
    }

    @Keep
    private native void deleteOfflineRegion(OfflineRegionDeleteCallback offlineRegionDeleteCallback);

    @Keep
    private native void getOfflineRegionStatus(OfflineRegionStatusCallback offlineRegionStatusCallback);

    @Keep
    private native void initialize(long j, FileSource fileSource);

    @Keep
    private native void setOfflineRegionDownloadState(int i);

    @Keep
    private native void setOfflineRegionObserver(OfflineRegionObserver offlineRegionObserver);

    @Keep
    private native void updateOfflineRegionMetadata(byte[] bArr, OfflineRegionUpdateMetadataCallback offlineRegionUpdateMetadataCallback);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize();
}
