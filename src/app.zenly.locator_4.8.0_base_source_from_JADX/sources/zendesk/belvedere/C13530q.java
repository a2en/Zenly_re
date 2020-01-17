package zendesk.belvedere;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: zendesk.belvedere.q */
class C13530q {
    C13530q() {
    }

    /* renamed from: c */
    private String m35844c(Context context) {
        return context.getCacheDir().getAbsolutePath();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38912a(Context context, Intent intent, Uri uri, int i) {
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            context.grantUriPermission(resolveInfo.activityInfo.packageName, uri, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo38914b(Context context) {
        String string = context.getString(C13528o.belvedere_sdk_fpa_suffix_v2);
        return String.format(Locale.US, "%s%s", new Object[]{context.getPackageName(), string});
    }

    /* renamed from: b */
    static MediaResult m35843b(Context context, Uri uri) {
        long j;
        String str;
        String str2;
        String str3 = "";
        long j2 = -1;
        if ("content".equals(uri.getScheme())) {
            String str4 = "_display_name";
            String str5 = "_size";
            String[] strArr = {str5, str4};
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri2 = uri;
            Cursor query = contentResolver.query(uri2, strArr, null, null, null);
            String type = contentResolver.getType(uri2);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        j2 = query.getLong(query.getColumnIndex(str5));
                        str3 = query.getString(query.getColumnIndex(str4));
                    }
                } finally {
                    query.close();
                }
            }
            str2 = str3;
            j = j2;
            str = type;
        } else {
            Uri uri3 = uri;
            str2 = str3;
            str = str2;
            j = -1;
        }
        MediaResult mediaResult = new MediaResult(null, uri, uri, str2, str, j, -1, -1);
        return mediaResult;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38913a(Context context, Uri uri, int i) {
        context.revokeUriPermission(uri, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Uri mo38908a(Context context, File file) {
        String str = "Belvedere";
        String b = mo38914b(context);
        try {
            return FileProvider.m2525a(context, b, file);
        } catch (IllegalArgumentException unused) {
            C13480L.m35695b(str, String.format(Locale.US, "The selected file can't be shared %s", new Object[]{file.toString()}));
            return null;
        } catch (NullPointerException e) {
            String format = String.format(Locale.US, "=====================\nFileProvider failed to retrieve file uri. There might be an issue with the FileProvider \nPlease make sure that manifest-merger is working, and that you have defined the applicationId (package name) in the build.gradle\nManifest merger: http://tools.android.com/tech-docs/new-build-system/user-guide/manifest-merger\nIf your are not able to use gradle or the manifest merger, please add the following to your AndroidManifest.xml:\n        <provider\n            android:name=\"com.zendesk.belvedere.BelvedereFileProvider\"\n            android:authorities=\"${applicationId}%s\"\n            android:exported=\"false\"\n            android:grantUriPermissions=\"true\">\n            <meta-data\n                android:name=\"android.support.FILE_PROVIDER_PATHS\"\n                android:resource=\"@xml/belvedere_attachment_storage_v2\" />\n        </provider>\n=====================", new Object[]{b});
            Log.e(str, format, e);
            C13480L.m35693a(str, format, e);
            throw new RuntimeException("Please specify your application id");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public File mo38909a(Context context) {
        File a = m35839a(context, "media");
        if (a == null) {
            C13480L.m35696c("Belvedere", "Error creating cache directory");
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.US);
        return m35840a(a, String.format(Locale.US, "camera_image_%s", new Object[]{simpleDateFormat.format(new Date(System.currentTimeMillis()))}), ".jpg");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public File mo38910a(Context context, Uri uri, String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("user");
            sb.append(File.separator);
            sb.append(str);
            str2 = sb.toString();
        } else {
            str2 = "media";
        }
        File a = m35839a(context, str2);
        String str3 = null;
        if (a == null) {
            C13480L.m35696c("Belvedere", "Error creating cache directory");
            return null;
        }
        String a2 = m35841a(context, uri);
        if (TextUtils.isEmpty(a2)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.US);
            a2 = String.format(Locale.US, "attachment_%s", new Object[]{simpleDateFormat.format(new Date(System.currentTimeMillis()))});
            str3 = m35842a(context, uri, true);
        }
        return m35840a(a, a2, str3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public File mo38911a(Context context, String str, String str2) {
        String str3 = "user";
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(File.separator);
            sb.append(str);
            str3 = sb.toString();
        }
        File a = m35839a(context, str3);
        if (a != null) {
            return m35840a(a, str2, (String) null);
        }
        C13480L.m35696c("Belvedere", "Error creating cache directory");
        return null;
    }

    /* renamed from: a */
    private File m35840a(File file, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb.append(str2);
        return new File(file, sb.toString());
    }

    /* renamed from: a */
    private File m35839a(Context context, String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m35844c(context));
        sb2.append(File.separator);
        sb2.append("belvedere-data-v2");
        sb2.append(File.separator);
        sb2.append(str2);
        File file = new File(sb2.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return file;
        }
        return null;
    }

    /* renamed from: a */
    private static String m35842a(Context context, Uri uri, boolean z) {
        String str;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String scheme = uri.getScheme();
        if ("content".equals(scheme)) {
            str = singleton.getExtensionFromMimeType(context.getContentResolver().getType(uri));
        } else {
            if ("file".equals(scheme)) {
                String lastPathSegment = uri.getLastPathSegment();
                int lastIndexOf = lastPathSegment.lastIndexOf(".");
                if (lastIndexOf != -1) {
                    str = lastPathSegment.substring(lastIndexOf + 1, lastPathSegment.length());
                }
            }
            str = "tmp";
        }
        if (!z) {
            return str;
        }
        return String.format(Locale.US, ".%s", new Object[]{str});
    }

    /* renamed from: a */
    private static String m35841a(Context context, Uri uri) {
        String scheme = uri.getScheme();
        String str = "";
        if (!"content".equals(scheme)) {
            return "file".equals(scheme) ? uri.getLastPathSegment() : str;
        }
        Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (query == null) {
            return str;
        }
        try {
            if (query.moveToFirst()) {
                str = query.getString(0);
            }
            return str;
        } finally {
            query.close();
        }
    }
}
