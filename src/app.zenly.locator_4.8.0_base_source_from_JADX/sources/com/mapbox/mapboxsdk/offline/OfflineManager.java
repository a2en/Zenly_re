package com.mapbox.mapboxsdk.offline;

import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.C11419a;
import com.mapbox.mapboxsdk.storage.FileSource;

public class OfflineManager {
    @Keep
    private long nativePtr;

    @Keep
    public interface CreateOfflineRegionCallback {
        void onCreate(OfflineRegion offlineRegion);

        void onError(String str);
    }

    @Keep
    public interface ListOfflineRegionsCallback {
        void onError(String str);

        void onList(OfflineRegion[] offlineRegionArr);
    }

    @Keep
    public interface MergeOfflineRegionsCallback {
        void onError(String str);

        void onMerge(OfflineRegion[] offlineRegionArr);
    }

    static {
        C11419a.m29393a();
    }

    @Keep
    private native void createOfflineRegion(FileSource fileSource, OfflineRegionDefinition offlineRegionDefinition, byte[] bArr, CreateOfflineRegionCallback createOfflineRegionCallback);

    @Keep
    private native void initialize(FileSource fileSource);

    @Keep
    private native void listOfflineRegions(FileSource fileSource, ListOfflineRegionsCallback listOfflineRegionsCallback);

    @Keep
    private native void mergeOfflineRegions(FileSource fileSource, String str, MergeOfflineRegionsCallback mergeOfflineRegionsCallback);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    @Keep
    public native void putResourceWithUrl(String str, byte[] bArr, long j, long j2, String str2, boolean z);

    @Keep
    public native void setOfflineMapboxTileCountLimit(long j);
}
