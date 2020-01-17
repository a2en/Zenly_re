package com.mapbox.android.telemetry.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.mapbox.android.telemetry.location.C11371a;
import java.util.concurrent.TimeUnit;

public class MapboxTelemetryInitProvider extends ContentProvider {
    /* renamed from: a */
    private static void m29322a(ProviderInfo providerInfo) {
        if (providerInfo != null) {
            if ("com.mapbox.android.telemetry.provider.mapboxtelemetryinitprovider".equals(providerInfo.authority)) {
                throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
            }
            return;
        }
        throw new IllegalStateException("MapboxTelemetryInitProvider: ProviderInfo cannot be null.");
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        m29322a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        C11371a.m29277a(getContext(), TimeUnit.HOURS.toMillis(24));
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
