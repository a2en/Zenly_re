package com.squareup.picasso;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import com.squareup.picasso.C11893u.C11894a;
import com.squareup.picasso.Picasso.C11847d;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.d */
class C11866d extends C11893u {

    /* renamed from: b */
    private static final UriMatcher f30740b = new UriMatcher(-1);

    /* renamed from: a */
    private final Context f30741a;

    @TargetApi(14)
    /* renamed from: com.squareup.picasso.d$a */
    private static class C11867a {
        /* renamed from: a */
        static InputStream m31157a(ContentResolver contentResolver, Uri uri) {
            return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
    }

    static {
        String str = "com.android.contacts";
        f30740b.addURI(str, "contacts/lookup/*/#", 1);
        f30740b.addURI(str, "contacts/lookup/*", 1);
        f30740b.addURI(str, "contacts/#/photo", 2);
        f30740b.addURI(str, "contacts/#", 3);
        f30740b.addURI(str, "display_photo/#", 4);
    }

    C11866d(Context context) {
        this.f30741a = context;
    }

    /* renamed from: c */
    private InputStream m31154c(C11889s sVar) throws IOException {
        ContentResolver contentResolver = this.f30741a.getContentResolver();
        Uri uri = sVar.f30811d;
        int match = f30740b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid uri: ");
                        sb.append(uri);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        if (VERSION.SDK_INT < 14) {
            return Contacts.openContactPhotoInputStream(contentResolver, uri);
        }
        return C11867a.m31157a(contentResolver, uri);
    }

    /* renamed from: a */
    public boolean mo35069a(C11889s sVar) {
        Uri uri = sVar.f30811d;
        return "content".equals(uri.getScheme()) && Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f30740b.match(sVar.f30811d) != -1;
    }

    /* renamed from: a */
    public C11894a mo35068a(C11889s sVar, int i) throws IOException {
        InputStream c = m31154c(sVar);
        if (c != null) {
            return new C11894a(c, C11847d.DISK);
        }
        return null;
    }
}
