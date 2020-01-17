package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: com.appsflyer.internal.v */
public final class C8799v {

    /* renamed from: ˊ */
    public final Context f22787;

    public C8799v(Context context) {
        this.f22787 = context;
    }

    /* renamed from: ˎ */
    public final String mo23820() {
        String str = "aid";
        Cursor query = this.f22787.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{str}, null, null, null);
        String string = (query == null || !query.moveToFirst()) ? null : query.getString(query.getColumnIndex(str));
        if (query != null) {
            query.close();
        }
        return string;
    }
}
