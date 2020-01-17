package p389io.fabric.sdk.android.services.settings;

import android.content.res.Resources.NotFoundException;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collection;
import java.util.Locale;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.C12162h;
import p389io.fabric.sdk.android.Logger;
import p389io.fabric.sdk.android.services.common.C12169a;
import p389io.fabric.sdk.android.services.common.C12180h;
import p389io.fabric.sdk.android.services.common.C12199r;
import p389io.fabric.sdk.android.services.network.C12241c;
import p389io.fabric.sdk.android.services.network.HttpRequest;
import p389io.fabric.sdk.android.services.network.HttpRequestFactory;

/* renamed from: io.fabric.sdk.android.services.settings.a */
abstract class C12249a extends C12169a implements C12254f {
    public C12249a(C12161g gVar, String str, String str2, HttpRequestFactory httpRequestFactory, C12241c cVar) {
        super(gVar, str, str2, httpRequestFactory, cVar);
    }

    /* renamed from: b */
    private HttpRequest m32470b(HttpRequest httpRequest, C12252d dVar) {
        String str = "Failed to close app icon InputStream.";
        httpRequest.mo36210e("app[identifier]", dVar.f31861b);
        httpRequest.mo36210e("app[name]", dVar.f31865f);
        httpRequest.mo36210e("app[display_version]", dVar.f31862c);
        httpRequest.mo36210e("app[build_version]", dVar.f31863d);
        httpRequest.mo36188a("app[source]", (Number) Integer.valueOf(dVar.f31866g));
        httpRequest.mo36210e("app[minimum_sdk_version]", dVar.f31867h);
        httpRequest.mo36210e("app[built_sdk_version]", dVar.f31868i);
        if (!C12180h.m32264b(dVar.f31864e)) {
            httpRequest.mo36210e("app[instance_identifier]", dVar.f31864e);
        }
        if (dVar.f31869j != null) {
            InputStream inputStream = null;
            try {
                inputStream = this.f31648e.mo36008b().getResources().openRawResource(dVar.f31869j.f31895b);
                httpRequest.mo36210e("app[icon][hash]", dVar.f31869j.f31894a);
                httpRequest.mo36193a("app[icon][data]", "icon.png", "application/octet-stream", inputStream);
                httpRequest.mo36188a("app[icon][width]", (Number) Integer.valueOf(dVar.f31869j.f31896c));
                httpRequest.mo36188a("app[icon][height]", (Number) Integer.valueOf(dVar.f31869j.f31897d));
            } catch (NotFoundException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to find app icon with resource ID: ");
                sb.append(dVar.f31869j.f31895b);
                C12154c.m32113f().mo35957e("Fabric", sb.toString(), e);
            } catch (Throwable th) {
                C12180h.m32254a((Closeable) inputStream, str);
                throw th;
            }
            C12180h.m32254a((Closeable) inputStream, str);
        }
        Collection<C12162h> collection = dVar.f31870k;
        if (collection != null) {
            for (C12162h hVar : collection) {
                httpRequest.mo36210e(mo36267b(hVar), hVar.mo36020c());
                httpRequest.mo36210e(mo36265a(hVar), hVar.mo36018a());
            }
        }
        return httpRequest;
    }

    /* renamed from: a */
    public boolean mo36266a(C12252d dVar) {
        HttpRequest a = mo36044a();
        m32469a(a, dVar);
        m32470b(a, dVar);
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append("Sending app info to ");
        sb.append(mo36046b());
        String str = "Fabric";
        f.mo35954d(str, sb.toString());
        if (dVar.f31869j != null) {
            Logger f2 = C12154c.m32113f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("App icon hash is ");
            sb2.append(dVar.f31869j.f31894a);
            f2.mo35954d(str, sb2.toString());
            Logger f3 = C12154c.m32113f();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("App icon size is ");
            sb3.append(dVar.f31869j.f31896c);
            sb3.append("x");
            sb3.append(dVar.f31869j.f31897d);
            f3.mo35954d(str, sb3.toString());
        }
        int g = a.mo36213g();
        String str2 = "POST".equals(a.mo36217k()) ? "Create" : "Update";
        Logger f4 = C12154c.m32113f();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        sb4.append(" app request ID: ");
        sb4.append(a.mo36205c("X-REQUEST-ID"));
        f4.mo35954d(str, sb4.toString());
        Logger f5 = C12154c.m32113f();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Result was ");
        sb5.append(g);
        f5.mo35954d(str, sb5.toString());
        return C12199r.m32327a(g) == 0;
    }

    /* renamed from: a */
    private HttpRequest m32469a(HttpRequest httpRequest, C12252d dVar) {
        httpRequest.mo36203c("X-CRASHLYTICS-API-KEY", dVar.f31860a);
        httpRequest.mo36203c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        httpRequest.mo36203c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f31648e.mo24945h());
        return httpRequest;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo36265a(C12162h hVar) {
        return String.format(Locale.US, "app[build][libraries][%s][type]", new Object[]{hVar.mo36019b()});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo36267b(C12162h hVar) {
        return String.format(Locale.US, "app[build][libraries][%s][version]", new Object[]{hVar.mo36019b()});
    }
}
