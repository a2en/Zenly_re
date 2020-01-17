package androidx.core.view.inputmethod;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;

/* renamed from: androidx.core.view.inputmethod.a */
public final class C0650a {

    /* renamed from: a */
    private static final String[] f2823a = new String[0];

    /* renamed from: a */
    public static void m3037a(EditorInfo editorInfo, String[] strArr) {
        if (VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* renamed from: a */
    public static String[] m3038a(EditorInfo editorInfo) {
        if (VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            if (strArr == null) {
                strArr = f2823a;
            }
            return strArr;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f2823a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        if (stringArray == null) {
            stringArray = f2823a;
        }
        return stringArray;
    }
}
