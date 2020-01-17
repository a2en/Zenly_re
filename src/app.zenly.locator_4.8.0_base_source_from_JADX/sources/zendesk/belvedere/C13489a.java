package zendesk.belvedere;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import zendesk.belvedere.C13480L.Logger;
import zendesk.belvedere.MediaIntent.C13483b;
import zendesk.belvedere.MediaIntent.C13484c;

/* renamed from: zendesk.belvedere.a */
public class C13489a {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e */
    private static C13489a f34990e;

    /* renamed from: a */
    private final Context f34991a;

    /* renamed from: b */
    private C13530q f34992b = new C13530q();

    /* renamed from: c */
    private C13519j f34993c = new C13519j();

    /* renamed from: d */
    private C13520k f34994d = new C13520k(this.f34991a, this.f34992b, this.f34993c);

    /* renamed from: zendesk.belvedere.a$a */
    public static class C13490a {

        /* renamed from: a */
        Context f34995a;

        /* renamed from: b */
        Logger f34996b = new C13481a();

        /* renamed from: c */
        boolean f34997c = false;

        public C13490a(Context context) {
            this.f34995a = context;
        }

        /* renamed from: a */
        public C13489a mo38869a() {
            return new C13489a(this);
        }
    }

    C13489a(C13490a aVar) {
        this.f34991a = aVar.f34995a;
        aVar.f34996b.setLoggable(aVar.f34997c);
        C13480L.m35694a(aVar.f34996b);
        C13480L.m35692a("Belvedere", "Belvedere initialized");
    }

    /* renamed from: a */
    public static C13489a m35734a(Context context) {
        synchronized (C13489a.class) {
            if (f34990e == null) {
                if (context == null || context.getApplicationContext() == null) {
                    throw new IllegalArgumentException("Invalid context provided");
                }
                f34990e = new C13490a(context.getApplicationContext()).mo38869a();
            }
        }
        return f34990e;
    }

    /* renamed from: b */
    public C13484c mo38868b() {
        return new C13484c(this.f34993c.mo38892a(), this.f34994d);
    }

    /* renamed from: a */
    public C13483b mo38863a() {
        return new C13483b(this.f34993c.mo38892a(), this.f34994d, this.f34993c);
    }

    /* renamed from: a */
    public Intent mo38862a(Uri uri, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(str)) {
            intent.setDataAndType(uri, str);
        }
        mo38866a(intent, uri);
        return intent;
    }

    /* renamed from: a */
    public void mo38865a(int i, int i2, Intent intent, C13492c<List<MediaResult>> cVar, boolean z) {
        this.f34994d.mo38898a(this.f34991a, i, i2, intent, cVar, z);
    }

    /* renamed from: a */
    public MediaResult mo38864a(String str, String str2) {
        long j;
        long j2;
        File a = this.f34992b.mo38911a(this.f34991a, str, str2);
        C13480L.m35692a("Belvedere", String.format(Locale.US, "Get internal File: %s", new Object[]{a}));
        if (a != null) {
            Uri a2 = this.f34992b.mo38908a(this.f34991a, a);
            if (a2 != null) {
                MediaResult b = C13530q.m35843b(this.f34991a, a2);
                if (b.mo38842c().contains("image")) {
                    Pair a3 = C13491b.m35743a(a);
                    j = (long) ((Integer) a3.second).intValue();
                    j2 = (long) ((Integer) a3.first).intValue();
                } else {
                    j2 = -1;
                    j = -1;
                }
                MediaResult mediaResult = new MediaResult(a, a2, a2, str2, b.mo38842c(), b.mo38848f(), j2, j);
                return mediaResult;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo38867a(List<Uri> list, String str, C13492c<List<MediaResult>> cVar) {
        if (list == null || list.size() <= 0) {
            cVar.internalSuccess(new ArrayList(0));
        } else {
            C13529p.m35836a(this.f34991a, this.f34992b, cVar, list, str);
        }
    }

    /* renamed from: a */
    public void mo38866a(Intent intent, Uri uri) {
        C13480L.m35692a("Belvedere", String.format(Locale.US, "Grant Permission - Intent: %s - Uri: %s", new Object[]{intent, uri}));
        this.f34992b.mo38912a(this.f34991a, intent, uri, 3);
    }
}
