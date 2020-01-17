package p389io.fabric.sdk.android;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import java.io.File;

/* renamed from: io.fabric.sdk.android.d */
class C12158d extends ContextWrapper {

    /* renamed from: a */
    private final String f31602a;

    /* renamed from: b */
    private final String f31603b;

    public C12158d(Context context, String str, String str2) {
        super(context);
        this.f31603b = str;
        this.f31602a = str2;
    }

    public File getCacheDir() {
        return new File(super.getCacheDir(), this.f31602a);
    }

    public File getDatabasePath(String str) {
        File file = new File(super.getDatabasePath(str).getParentFile(), this.f31602a);
        file.mkdirs();
        return new File(file, str);
    }

    @TargetApi(8)
    public File getExternalCacheDir() {
        return new File(super.getExternalCacheDir(), this.f31602a);
    }

    @TargetApi(8)
    public File getExternalFilesDir(String str) {
        return new File(super.getExternalFilesDir(str), this.f31602a);
    }

    public File getFilesDir() {
        return new File(super.getFilesDir(), this.f31602a);
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31603b);
        sb.append(":");
        sb.append(str);
        return super.getSharedPreferences(sb.toString(), i);
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), cursorFactory);
    }

    @TargetApi(11)
    public SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str).getPath(), cursorFactory, databaseErrorHandler);
    }
}
