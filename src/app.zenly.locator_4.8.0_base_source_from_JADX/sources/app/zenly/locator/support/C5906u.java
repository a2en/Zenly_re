package app.zenly.locator.support;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.support.C5724n0.C5730c;
import app.zenly.locator.support.C5932z.C5937b;
import app.zenly.locator.support.p168di.C5665b;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import kotlin.text.C13013g;
import kotlin.text.MatchResult;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;
import zendesk.support.Article;
import zendesk.support.Section;

/* renamed from: app.zenly.locator.support.u */
public final class C5906u extends ZenlyController {

    /* renamed from: U */
    private static String f14906U;

    /* renamed from: V */
    private static final C13013g f14907V = new C13013g("^/hc/.*/categories/([^-]*)(-.*)?$");

    /* renamed from: W */
    private static final C13013g f14908W = new C13013g("^/hc/.*/sections/([^-]*)(-.*)?$");

    /* renamed from: X */
    private static final C13013g f14909X = new C13013g("^/hc/.*/articles/([^-]*)(-.*)?$");

    /* renamed from: Y */
    public static final C5907a f14910Y = new C5907a(null);
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final long f14911P;

    /* renamed from: Q */
    private final Article f14912Q;

    /* renamed from: R */
    private C5724n0 f14913R;

    /* renamed from: S */
    private WebView f14914S;

    /* renamed from: T */
    private final C12275b f14915T;

    /* renamed from: app.zenly.locator.support.u$a */
    public static final class C5907a {
        private C5907a() {
        }

        /* renamed from: a */
        public final C5906u mo13611a(Article article, long j) {
            C12932j.m33818b(article, "article");
            C3197d dVar = new C3197d(new Bundle());
            dVar.mo9609a("key:article", (Serializable) article);
            dVar.mo9609a("key:categoryId", (Serializable) Long.valueOf(j));
            Bundle a = dVar.mo9605a();
            C12932j.m33815a((Object) a, "BundleBuilder(Bundle())\n…                 .build()");
            return new C5906u(a);
        }

        public /* synthetic */ C5907a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.support.u$b */
    static final class C5908b implements Action {

        /* renamed from: a */
        public static final C5908b f14916a = new C5908b();

        C5908b() {
        }

        public final void run() {
        }
    }

    /* renamed from: app.zenly.locator.support.u$c */
    static final class C5909c<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C5906u f14917e;

        C5909c(C5906u uVar) {
            this.f14917e = uVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Toast.makeText(this.f14917e.mo23920b(), R.string.commons_content_oopserror, 0).show();
        }
    }

    /* renamed from: app.zenly.locator.support.u$d */
    public static final class C5910d extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ C5906u f14918a;

        C5910d(C5906u uVar) {
            this.f14918a = uVar;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            C12932j.m33818b(webView, "view");
            C12932j.m33818b(webResourceRequest, "request");
            C5906u uVar = this.f14918a;
            Uri url = webResourceRequest.getUrl();
            C12932j.m33815a((Object) url, "request.url");
            return uVar.m16419e(url.getPath());
        }
    }

    /* renamed from: app.zenly.locator.support.u$e */
    static final class C5911e<T> implements Consumer<Article> {

        /* renamed from: e */
        final /* synthetic */ C5906u f14919e;

        C5911e(C5906u uVar) {
            this.f14919e = uVar;
        }

        /* renamed from: a */
        public final void accept(Article article) {
            C5907a aVar = C5906u.f14910Y;
            C12932j.m33815a((Object) article, "article");
            C5906u a = aVar.mo13611a(article, this.f14919e.f14911P);
            a.mo23929b(this.f14919e.mo23947l());
            C8831g k = this.f14919e.mo23946k();
            C8836h a2 = C8836h.m21058a((C8819d) a);
            a2.mo24026b(new C8816c());
            a2.mo24023a((ControllerChangeHandler) new C8816c());
            k.mo23991a(a2);
        }
    }

    /* renamed from: app.zenly.locator.support.u$f */
    static final class C5912f<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C5906u f14920e;

        C5912f(C5906u uVar) {
            this.f14920e = uVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Toast.makeText(this.f14920e.mo23920b(), R.string.commons_content_oopserror, 0).show();
        }
    }

    /* renamed from: app.zenly.locator.support.u$g */
    static final class C5913g<T> implements Consumer<Section> {

        /* renamed from: e */
        final /* synthetic */ C5906u f14921e;

        C5913g(C5906u uVar) {
            this.f14921e = uVar;
        }

        /* renamed from: a */
        public final void accept(Section section) {
            C8831g k = this.f14921e.mo23946k();
            C5937b bVar = C5932z.f14946U;
            C12932j.m33815a((Object) section, "section");
            C5932z a = bVar.mo13634a(section);
            a.mo23929b(this.f14921e.mo23947l());
            C8836h a2 = C8836h.m21058a((C8819d) a);
            a2.mo24026b(new C8816c());
            a2.mo24023a((ControllerChangeHandler) new C8816c());
            k.mo23991a(a2);
        }
    }

    /* renamed from: app.zenly.locator.support.u$h */
    static final class C5914h<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C5906u f14922e;

        C5914h(C5906u uVar) {
            this.f14922e = uVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Toast.makeText(this.f14922e.mo23920b(), R.string.commons_content_oopserror, 0).show();
        }
    }

    /* renamed from: app.zenly.locator.support.u$i */
    static final class C5915i implements Action {

        /* renamed from: a */
        public static final C5915i f14923a = new C5915i();

        C5915i() {
        }

        public final void run() {
        }
    }

    /* renamed from: app.zenly.locator.support.u$j */
    static final class C5916j<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C5906u f14924e;

        C5916j(C5906u uVar) {
            this.f14924e = uVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Toast.makeText(this.f14924e.mo23920b(), R.string.commons_content_oopserror, 0).show();
        }
    }

    public C5906u(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        this.f14911P = bundle.getLong("key:categoryId");
        Serializable serializable = bundle.getSerializable("key:article");
        if (serializable != null) {
            this.f14912Q = (Article) serializable;
            this.f14915T = new C12275b();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type zendesk.support.Article");
    }

    /* renamed from: B */
    private final void m16409B() {
        C5724n0 n0Var = this.f14913R;
        if (n0Var != null) {
            Long id = this.f14912Q.getId();
            C12932j.m33815a((Object) id, "article.id");
            Disposable a = n0Var.mo13398b(id.longValue()).mo36342a(C12295a.m32802a()).mo36345a(C5908b.f14916a, new C5909c(this));
            C12932j.m33815a((Object) a, "zendeskSdk.helpCenterArt…T).show() }\n            )");
            C12773a.m33432a(a, this.f14915T);
            return;
        }
        C12932j.m33820c("zendeskSdk");
        throw null;
    }

    /* renamed from: C */
    private final void m16410C() {
        C5690k0 k0Var = new C5690k0();
        k0Var.mo23929b(mo23947l());
        C8831g k = mo23946k();
        C8836h a = C8836h.m21058a((C8819d) k0Var);
        a.mo24026b(new C8816c());
        a.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a);
    }

    /* renamed from: D */
    private final void m16411D() {
        C5724n0 n0Var = this.f14913R;
        if (n0Var != null) {
            Long id = this.f14912Q.getId();
            C12932j.m33815a((Object) id, "article.id");
            Disposable a = n0Var.mo13400c(id.longValue()).mo36342a(C12295a.m32802a()).mo36345a(C5915i.f14923a, new C5916j(this));
            C12932j.m33815a((Object) a, "zendeskSdk.helpCenterArt…T).show() }\n            )");
            C12773a.m33432a(a, this.f14915T);
            return;
        }
        C12932j.m33820c("zendeskSdk");
        throw null;
    }

    /* renamed from: c */
    private final void m16417c(long j) {
        C5724n0 n0Var = this.f14913R;
        if (n0Var != null) {
            Disposable a = n0Var.mo13402d(j).mo36535a(C12295a.m32802a()).mo36533a((Consumer<? super T>) new C5913g<Object>(this), (Consumer<? super Throwable>) new C5914h<Object>(this));
            C12932j.m33815a((Object) a, "zendeskSdk.helpCenterSec…T).show() }\n            )");
            C12773a.m33432a(a, this.f14915T);
            return;
        }
        C12932j.m33820c("zendeskSdk");
        throw null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m16419e(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            if (r10 != 0) goto L_0x0006
        L_0x0004:
            r1 = 0
            goto L_0x005f
        L_0x0006:
            java.lang.String r2 = "/hc/upvote"
            boolean r2 = kotlin.jvm.internal.C12932j.m33817a(r10, r2)
            if (r2 == 0) goto L_0x0012
            r9.m16411D()
            goto L_0x005f
        L_0x0012:
            java.lang.String r2 = "/hc/downvote"
            boolean r2 = kotlin.jvm.internal.C12932j.m33817a(r10, r2)
            if (r2 == 0) goto L_0x001e
            r9.m16409B()
            goto L_0x005f
        L_0x001e:
            java.lang.String r2 = "/hc/askquestion"
            boolean r2 = kotlin.jvm.internal.C12932j.m33817a(r10, r2)
            if (r2 == 0) goto L_0x002a
            r9.m16410C()
            goto L_0x005f
        L_0x002a:
            kotlin.text.g r2 = f14907V
            boolean r2 = r2.mo37411a(r10)
            if (r2 == 0) goto L_0x003c
            kotlin.text.g r0 = f14907V
            long r2 = r9.m16413a(r0, r10)
            r9.m16416b(r2)
            goto L_0x005f
        L_0x003c:
            kotlin.text.g r2 = f14908W
            boolean r2 = r2.mo37411a(r10)
            if (r2 == 0) goto L_0x004e
            kotlin.text.g r0 = f14908W
            long r2 = r9.m16413a(r0, r10)
            r9.m16417c(r2)
            goto L_0x005f
        L_0x004e:
            kotlin.text.g r2 = f14909X
            boolean r2 = r2.mo37411a(r10)
            if (r2 == 0) goto L_0x0004
            kotlin.text.g r0 = f14909X
            long r2 = r9.m16413a(r0, r10)
            r9.m16414a(r2)
        L_0x005f:
            if (r1 == 0) goto L_0x0086
            app.zenly.locator.s.r.a$a r10 = app.zenly.locator.p143s.p155r.C5498a.f14119e
            android.webkit.WebView r0 = r9.f14914S
            if (r0 == 0) goto L_0x007f
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "webView.context"
            kotlin.jvm.internal.C12932j.m33815a(r0, r2)
            app.zenly.locator.s.r.a r3 = r10.mo13125a(r0)
            app.zenly.locator.s.r.a$c r4 = app.zenly.locator.p143s.p155r.C5498a.C5501c.LIGHT
            app.zenly.locator.s.r.a$b r5 = app.zenly.locator.p143s.p155r.C5498a.C5500b.NAV
            r6 = 0
            r7 = 4
            r8 = 0
            app.zenly.locator.p143s.p155r.C5498a.m15602a(r3, r4, r5, r6, r7, r8)
            goto L_0x0086
        L_0x007f:
            java.lang.String r10 = "webView"
            kotlin.jvm.internal.C12932j.m33820c(r10)
            r10 = 0
            throw r10
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.support.C5906u.m16419e(java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        C8819d l = mo23947l();
        if (!(l instanceof C5659d0)) {
            l = null;
        }
        C5659d0 d0Var = (C5659d0) l;
        if (d0Var != null) {
            C5688j0 B = d0Var.mo7192B();
            if (B != null) {
                B.mo13352a(this.f14912Q);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        this.f14915T.mo36401a();
        super.mo7053d(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: b */
    private final void m16416b(long j) {
        C5730c a = C5730c.f14549m.mo13421a(j);
        C8831g k = mo23946k();
        C5919w a2 = C5919w.f14927W.mo13619a(a);
        a2.mo23929b(mo23947l());
        C8836h a3 = C8836h.m21058a((C8819d) a2);
        a3.mo24026b(new C8816c());
        a3.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a3);
    }

    /* renamed from: d */
    private final void m16418d(String str) {
        int i;
        Resources j = mo23945j();
        if (j != null) {
            String string = j.getString(R.string.support_survey_title);
            C12932j.m33815a((Object) string, "getString(R.string.support_survey_title)");
            String string2 = j.getString(R.string.support_survey_button_yes);
            C12932j.m33815a((Object) string2, "getString(R.string.support_survey_button_yes)");
            String string3 = j.getString(R.string.support_survey_button_no);
            C12932j.m33815a((Object) string3, "getString(R.string.support_survey_button_no)");
            String string4 = j.getString(R.string.support_survey_stats, new Object[]{Integer.valueOf(this.f14912Q.getUpvoteCount()), Integer.valueOf(this.f14912Q.getUpvoteCount() + this.f14912Q.getDownvoteCount())});
            C12932j.m33815a((Object) string4, "getString(R.string.suppo…+ article.downvoteCount))");
            int i2 = C5918v.f14926a[C5730c.f14549m.mo13421a(this.f14911P).ordinal()];
            if (i2 == 1) {
                i = R.string.support_survey_keepGoing;
            } else if (i2 == 2) {
                i = R.string.support_helpcenter_troubleshooting_create_ticket;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            String string5 = j.getString(i);
            C12932j.m33815a((Object) string5, "getString(when (ZendeskS…ate_ticket\n            })");
            String str2 = f14906U;
            if (str2 != null) {
                Object[] objArr = {str, string, string2, string3, string4, string5};
                String format = String.format(str2, Arrays.copyOf(objArr, objArr.length));
                C12932j.m33815a((Object) format, "java.lang.String.format(this, *args)");
                WebView webView = this.f14914S;
                if (webView != null) {
                    webView.loadDataWithBaseURL("https://community.zen.ly", format, "text/html", "utf-8", null);
                } else {
                    C12932j.m33820c("webView");
                    throw null;
                }
            } else {
                C12932j.m33814a();
                throw null;
            }
        } else {
            C12932j.m33814a();
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        C12932j.m33818b(context, "context");
        this.f14913R = C5665b.m15987a(context).mo13329a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        kotlin.p409io.C12901b.m33759a(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        throw r6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo7054a(android.view.LayoutInflater r5, android.view.ViewGroup r6) {
        /*
            r4 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.C12932j.m33818b(r5, r0)
            java.lang.String r0 = "container"
            kotlin.jvm.internal.C12932j.m33818b(r6, r0)
            java.lang.String r0 = f14906U
            r1 = 0
            if (r0 != 0) goto L_0x004c
            android.content.res.Resources r0 = r4.mo23945j()
            if (r0 == 0) goto L_0x0048
            r2 = 2131951784(0x7f1300a8, float:1.9539992E38)
            java.io.InputStream r0 = r0.openRawResource(r2)
            java.lang.String r2 = "resources!!.openRawResou…plate_helpcenter_article)"
            kotlin.jvm.internal.C12932j.m33815a(r0, r2)
            java.nio.charset.Charset r2 = kotlin.text.C13005c.f33594a
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r3.<init>(r0, r2)
            r0 = 8192(0x2000, float:1.14794E-41)
            boolean r2 = r3 instanceof java.io.BufferedReader
            if (r2 == 0) goto L_0x0032
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            r2 = r3
            goto L_0x0037
        L_0x0032:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r3, r0)
        L_0x0037:
            java.lang.String r0 = kotlin.p409io.C12917l.m33782a(r2)     // Catch:{ all -> 0x0041 }
            kotlin.p409io.C12901b.m33759a(r2, r1)
            f14906U = r0
            goto L_0x004c
        L_0x0041:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r6 = move-exception
            kotlin.p409io.C12901b.m33759a(r2, r5)
            throw r6
        L_0x0048:
            kotlin.jvm.internal.C12932j.m33814a()
            throw r1
        L_0x004c:
            r0 = 2131624083(0x7f0e0093, float:1.8875336E38)
            r2 = 0
            android.view.View r5 = r5.inflate(r0, r6, r2)
            r6 = 2131428808(0x7f0b05c8, float:1.847927E38)
            android.view.View r6 = r5.findViewById(r6)
            r0 = r6
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            app.zenly.locator.support.u$d r2 = new app.zenly.locator.support.u$d
            r2.<init>(r4)
            r0.setWebViewClient(r2)
            java.lang.String r2 = "findViewById<WebView>(R.…          }\n            }"
            kotlin.jvm.internal.C12932j.m33815a(r6, r2)
            r4.f14914S = r0
            r6 = 2131428483(0x7f0b0483, float:1.8478612E38)
            android.view.View r6 = r5.findViewById(r6)
            app.zenly.android.feature.polenta.widget.ScreenBar r6 = (app.zenly.android.feature.polenta.widget.ScreenBar) r6
            zendesk.support.Article r0 = r4.f14912Q
            java.lang.String r0 = r0.getTitle()
            android.text.Spanned r0 = app.zenly.locator.core.util.C3242w.m10277a(r0)
            r6.setTitle(r0)
            zendesk.support.Article r6 = r4.f14912Q
            java.lang.String r6 = r6.getBody()
            if (r6 == 0) goto L_0x0099
            java.lang.String r0 = "article.body!!"
            kotlin.jvm.internal.C12932j.m33815a(r6, r0)
            r4.m16418d(r6)
            java.lang.String r6 = "inflater.inflate(R.layou…article.body!!)\n        }"
            kotlin.jvm.internal.C12932j.m33815a(r5, r6)
            return r5
        L_0x0099:
            kotlin.jvm.internal.C12932j.m33814a()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.support.C5906u.mo7054a(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: a */
    private final long m16413a(C13013g gVar, String str) {
        MatchResult a = C13013g.m33960a(gVar, str, 0, 2, null);
        if (a != null) {
            return Long.parseLong((String) a.getGroupValues().get(1));
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: a */
    private final void m16414a(long j) {
        C12275b bVar = this.f14915T;
        C5724n0 n0Var = this.f14913R;
        if (n0Var != null) {
            bVar.add(n0Var.mo13395a(j).mo36535a(C12295a.m32802a()).mo36533a((Consumer<? super T>) new C5911e<Object>(this), (Consumer<? super Throwable>) new C5912f<Object>(this)));
        } else {
            C12932j.m33820c("zendeskSdk");
            throw null;
        }
    }
}
