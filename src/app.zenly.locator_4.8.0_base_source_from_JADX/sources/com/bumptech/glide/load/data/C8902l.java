package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.l */
public class C8902l extends C8900j<InputStream> {

    /* renamed from: h */
    private static final UriMatcher f23210h = new UriMatcher(-1);

    static {
        String str = "com.android.contacts";
        f23210h.addURI(str, "contacts/lookup/*/#", 1);
        f23210h.addURI(str, "contacts/lookup/*", 1);
        f23210h.addURI(str, "contacts/#/photo", 2);
        f23210h.addURI(str, "contacts/#", 3);
        f23210h.addURI(str, "contacts/#/display_photo", 4);
        f23210h.addURI(str, "phone_lookup/*", 5);
    }

    public C8902l(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: b */
    private InputStream m21362b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f23210h.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m21361a(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m21361a(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream m21364a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream b = m21362b(uri, contentResolver);
        if (b != null) {
            return b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("InputStream is null for ");
        sb.append(uri);
        throw new FileNotFoundException(sb.toString());
    }

    /* renamed from: a */
    private InputStream m21361a(ContentResolver contentResolver, Uri uri) {
        return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24246a(InputStream inputStream) throws IOException {
        inputStream.close();
    }
}
