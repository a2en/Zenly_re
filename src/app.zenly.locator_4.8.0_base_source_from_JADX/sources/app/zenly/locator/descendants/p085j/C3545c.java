package app.zenly.locator.descendants.p085j;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import android.text.TextUtils;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p267f.C7703a;

/* renamed from: app.zenly.locator.descendants.j.c */
public final class C3545c {

    /* renamed from: a */
    public static final C3545c f9535a = new C3545c();

    private C3545c() {
    }

    /* renamed from: a */
    public final Uri mo10002a(String str) {
        C12932j.m33818b(str, "contactId");
        try {
            return Uri.withAppendedPath(ContentUris.withAppendedId(Contacts.CONTENT_URI, Long.parseLong(str)), "photo");
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final Uri mo10003a(String str, int i, int i2) {
        C12932j.m33818b(str, "avatarUrlPrefix");
        C7703a a = C7703a.f19332i.mo19919a(i2);
        if (TextUtils.isEmpty(str) || i == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(a.mo19918a());
        sb.append('?');
        sb.append(i);
        return Uri.parse(sb.toString());
    }
}
