package com.facebook.common.util;

import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.ContactsContract;
import android.provider.MediaStore.Images.Media;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.facebook.common.util.e */
public class C9559e {

    /* renamed from: a */
    private static final Uri f24759a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    /* renamed from: a */
    public static String m23385a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    /* renamed from: b */
    public static boolean m23386b(Uri uri) {
        return "data".equals(m23385a(uri));
    }

    /* renamed from: c */
    public static boolean m23387c(Uri uri) {
        return "asset".equals(m23385a(uri));
    }

    /* renamed from: d */
    public static boolean m23388d(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(Media.INTERNAL_CONTENT_URI.toString());
    }

    /* renamed from: e */
    public static boolean m23389e(Uri uri) {
        if (m23390f(uri)) {
            if ("com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith(f24759a.getPath())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m23390f(Uri uri) {
        return "content".equals(m23385a(uri));
    }

    /* renamed from: g */
    public static boolean m23391g(Uri uri) {
        return "file".equals(m23385a(uri));
    }

    /* renamed from: h */
    public static boolean m23392h(Uri uri) {
        return "res".equals(m23385a(uri));
    }

    /* renamed from: i */
    public static boolean m23393i(Uri uri) {
        String a = m23385a(uri);
        return "https".equals(a) || "http".equals(a);
    }

    /* renamed from: j */
    public static boolean m23394j(Uri uri) {
        return "android.resource".equals(m23385a(uri));
    }

    /* renamed from: k */
    public static URL m23395k(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m23384a(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            boolean r0 = m23390f(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0038
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0030 }
            if (r8 == 0) goto L_0x002a
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x0028 }
            if (r9 == 0) goto L_0x002a
            java.lang.String r9 = "_data"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ all -> 0x0028 }
            r0 = -1
            if (r9 == r0) goto L_0x002a
            java.lang.String r9 = r8.getString(r9)     // Catch:{ all -> 0x0028 }
            r1 = r9
            goto L_0x002a
        L_0x0028:
            r9 = move-exception
            goto L_0x0032
        L_0x002a:
            if (r8 == 0) goto L_0x0042
            r8.close()
            goto L_0x0042
        L_0x0030:
            r9 = move-exception
            r8 = r1
        L_0x0032:
            if (r8 == 0) goto L_0x0037
            r8.close()
        L_0x0037:
            throw r9
        L_0x0038:
            boolean r8 = m23391g(r9)
            if (r8 == 0) goto L_0x0042
            java.lang.String r1 = r9.getPath()
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.util.C9559e.m23384a(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }

    /* renamed from: a */
    public static Uri m23383a(int i) {
        return new Builder().scheme("res").path(String.valueOf(i)).build();
    }
}
