package com.mapbox.android.telemetry;

import com.google.gson.C11125d;
import com.google.gson.C11132e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import okhttp3.C13167a0;
import okhttp3.C13319s;
import okhttp3.C13319s.C13320a;
import okhttp3.C13321t;
import okhttp3.C13322u;
import okhttp3.C13322u.C13323a;
import okhttp3.C13331y.C13332a;
import okhttp3.C13333z;
import okhttp3.Call;
import okhttp3.Callback;

/* renamed from: com.mapbox.android.telemetry.w0 */
class C11402w0 {

    /* renamed from: f */
    private static final C13321t f29498f = C13321t.m35172b("application/json; charset=utf-8");

    /* renamed from: a */
    private String f29499a;

    /* renamed from: b */
    private String f29500b;

    /* renamed from: c */
    private C11413z0 f29501c;

    /* renamed from: d */
    private final C11338e0 f29502d;

    /* renamed from: e */
    private C11341g f29503e;

    /* renamed from: com.mapbox.android.telemetry.w0$a */
    class C11403a implements Callback {

        /* renamed from: a */
        final /* synthetic */ CopyOnWriteArraySet f29504a;

        /* renamed from: b */
        final /* synthetic */ List f29505b;

        C11403a(C11402w0 w0Var, CopyOnWriteArraySet copyOnWriteArraySet, List list) {
            this.f29504a = copyOnWriteArraySet;
            this.f29505b = list;
        }

        public void onFailure(Call call, IOException iOException) {
            Iterator it = this.f29504a.iterator();
            while (it.hasNext()) {
                ((AttachmentListener) it.next()).onAttachmentFailure(iOException.getMessage(), this.f29505b);
            }
        }

        public void onResponse(Call call, C13167a0 a0Var) {
            Iterator it = this.f29504a.iterator();
            while (it.hasNext()) {
                ((AttachmentListener) it.next()).onAttachmentResponse(a0Var.mo37797h(), a0Var.mo37793d(), this.f29505b);
            }
        }
    }

    C11402w0(String str, String str2, C11413z0 z0Var, C11338e0 e0Var, C11341g gVar) {
        this.f29499a = str;
        this.f29500b = str2;
        this.f29501c = z0Var;
        this.f29502d = e0Var;
        this.f29503e = gVar;
    }

    /* renamed from: b */
    private void m29350b(List<Event> list, Callback callback) {
        String a = m29348a().mo32476a().mo32460a((Object) list);
        C13333z a2 = C13333z.m35281a(f29498f, a);
        C13320a a3 = this.f29501c.mo33061a().mo38279a("/events/v2");
        a3.mo38307b("access_token", this.f29499a);
        C13319s a4 = a3.mo38304a();
        if (m29351b()) {
            Object[] objArr = {a4, Integer.valueOf(list.size()), this.f29500b, a};
            String str = "TelemetryClient";
            this.f29502d.mo32980a(str, String.format(Locale.US, "Sending POST to %s with %d event(s) (user agent: %s) with payload: %s", objArr));
        }
        C13332a aVar = new C13332a();
        aVar.mo38398a(a4);
        aVar.mo38403b("User-Agent", this.f29500b);
        aVar.mo38399a(a2);
        this.f29501c.mo33064b(this.f29503e).newCall(aVar.mo38400a()).enqueue(callback);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33054a(List<Event> list, Callback callback) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        m29350b(arrayList, callback);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33053a(Attachment attachment, CopyOnWriteArraySet<AttachmentListener> copyOnWriteArraySet) {
        List b = attachment.mo32833b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C13323a aVar = new C13323a("--01ead4a5-7a67-4703-ad02-589886e00923");
        aVar.mo38325a(C13322u.f34487f);
        Iterator it = b.iterator();
        if (!it.hasNext()) {
            aVar.mo38323a("attachments", new C11125d().mo32460a((Object) arrayList));
            C13333z a = m29349a(aVar);
            C13320a a2 = this.f29501c.mo33061a().mo38279a("/attachments/v1");
            a2.mo38307b("access_token", this.f29499a);
            C13319s a3 = a2.mo38304a();
            if (m29351b()) {
                Object[] objArr = {a3, Integer.valueOf(b.size()), this.f29500b, arrayList};
                String str = "TelemetryClient";
                this.f29502d.mo32980a(str, String.format(Locale.US, "Sending POST to %s with %d event(s) (user agent: %s) with payload: %s", objArr));
            }
            C13332a aVar2 = new C13332a();
            aVar2.mo38398a(a3);
            aVar2.mo38403b("User-Agent", this.f29500b);
            aVar2.mo38399a(a);
            this.f29501c.mo33062a(this.f29503e).newCall(aVar2.mo38400a()).enqueue(new C11403a(this, copyOnWriteArraySet, arrayList2));
            return;
        }
        C11412z zVar = (C11412z) it.next();
        zVar.mo33060b();
        C11335d a4 = zVar.mo33059a();
        arrayList.add(a4);
        a4.mo32979a();
        throw null;
    }

    /* renamed from: b */
    private boolean m29351b() {
        return this.f29501c.mo33065c() || this.f29501c.mo33063b().equals(C11388r.STAGING);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33055a(boolean z) {
        C11415b d = this.f29501c.mo33066d();
        d.mo33073a(z);
        this.f29501c = d.mo33074a();
    }

    /* renamed from: a */
    private C11132e m29348a() {
        C11132e eVar = new C11132e();
        eVar.mo32479a(NavigationArriveEvent.class, new C11332c());
        eVar.mo32479a(NavigationDepartEvent.class, new C11386q());
        eVar.mo32479a(NavigationCancelEvent.class, new C11339f());
        eVar.mo32479a(NavigationFeedbackEvent.class, new C11406y());
        eVar.mo32479a(NavigationRerouteEvent.class, new C11380n0());
        eVar.mo32479a(NavigationFasterRouteEvent.class, new C11399v());
        return eVar;
    }

    /* renamed from: a */
    private C13333z m29349a(C13323a aVar) {
        C13322u a = aVar.mo38327a();
        C13323a aVar2 = new C13323a("--01ead4a5-7a67-4703-ad02-589886e00923");
        aVar2.mo38325a(C13322u.f34487f);
        int e = a.mo38322e();
        while (true) {
            e--;
            if (e <= -1) {
                return aVar2.mo38327a();
            }
            aVar2.mo38326a(a.mo38321a(e));
        }
    }
}
