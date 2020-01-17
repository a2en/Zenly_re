package zendesk.core;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;

public abstract class SDKStartUpProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return "";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        onStartUp(getContext());
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void onStartUp(Context context);

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return new MatrixCursor(new String[0], 0);
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
