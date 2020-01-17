package com.crashlytics.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.services.common.C12194o;

public class CrashlyticsInitProvider extends ContentProvider {

    /* renamed from: com.crashlytics.android.CrashlyticsInitProvider$a */
    interface C9251a {
        /* renamed from: a */
        boolean mo24941a(Context context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo24934a(Context context, C12194o oVar, C9251a aVar) {
        if (oVar.mo36082e(context)) {
            return aVar.mo24941a(context);
        }
        return oVar.mo36081d(context);
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
        Context context = getContext();
        String str = "CrashlyticsInitProvider";
        if (mo24934a(context, new C12194o(), new C9299b())) {
            try {
                C12154c.m32103a(context, new C9252a());
                C12154c.m32113f().mo35959i(str, "CrashlyticsInitProvider initialization successful");
            } catch (IllegalStateException unused) {
                C12154c.m32113f().mo35959i(str, "CrashlyticsInitProvider initialization unsuccessful");
                return false;
            }
        } else {
            C12154c.m32113f().mo35959i(str, "CrashlyticsInitProvider skipping initialization");
        }
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
