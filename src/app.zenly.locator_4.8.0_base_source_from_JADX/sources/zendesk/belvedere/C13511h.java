package zendesk.belvedere;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Files;
import android.provider.MediaStore.Images.Media;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: zendesk.belvedere.h */
class C13511h {

    /* renamed from: b */
    private static final String[] f35034b = {"_id", "_display_name", "_size", "width", "height"};

    /* renamed from: a */
    private final Context f35035a;

    C13511h(Context context) {
        this.f35035a = context.getApplicationContext();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<MediaResult> mo38886a(int i) {
        ArrayList arrayList = new ArrayList();
        Cursor query = this.f35035a.getContentResolver().query(Media.EXTERNAL_CONTENT_URI, f35034b, null, null, String.format(Locale.US, "%s DESC LIMIT %s", new Object[]{"datetaken", Integer.valueOf(i)}));
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    Uri contentUri = Files.getContentUri("external", query.getLong(query.getColumnIndex("_id")));
                    long j = query.getLong(query.getColumnIndex("_size"));
                    long j2 = query.getLong(query.getColumnIndex("width"));
                    long j3 = query.getLong(query.getColumnIndex("height"));
                    String string = query.getString(query.getColumnIndex("_display_name"));
                    String str = "image/jpeg";
                    if (!TextUtils.isEmpty(string)) {
                        int lastIndexOf = string.lastIndexOf(".");
                        if (lastIndexOf != -1) {
                            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(string.substring(lastIndexOf + 1));
                        }
                    }
                    MediaResult mediaResult = new MediaResult(null, contentUri, contentUri, string, str, j, j2, j3);
                    arrayList.add(mediaResult);
                } catch (Throwable th) {
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo38887a(String str) {
        return C13531r.m35855a(str, this.f35035a);
    }
}
