package app.zenly.locator.support;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.widget.C3275i;
import app.zenly.locator.core.widget.C3277j;
import app.zenly.locator.core.widget.TextViewLinkAction;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.C5407g.C5408a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p162w.C5566b;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.services.C8342v5;
import p387h.p388a.C12143a;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.support.t */
public final class C5806t extends ZenlyController {

    /* renamed from: P */
    private final C12275b f14699P = new C12275b();

    /* renamed from: Q */
    private TextView f14700Q;

    /* renamed from: R */
    private TextView f14701R;

    /* renamed from: S */
    private ProgressBar f14702S;

    /* renamed from: app.zenly.locator.support.t$a */
    static final class C5807a<T> implements Consumer<C8342v5> {

        /* renamed from: e */
        public static final C5807a f14703e = new C5807a();

        C5807a() {
        }

        /* renamed from: a */
        public final void accept(C8342v5 v5Var) {
            C12143a.m32035d("got a response from userStartDeletionProcess(): this should *not* happen as this call should return a 401 error", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.support.t$b */
    static final class C5808b<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C5806t f14704e;

        C5808b(C5806t tVar) {
            this.f14704e = tVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12932j.m33815a((Object) th, "e");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null || !C13029r.m34022a((CharSequence) localizedMessage, (CharSequence) "Unauthenticated", false, 2, (Object) null)) {
                this.f14704e.m16236D();
                Toast.makeText(this.f14704e.mo23920b(), R.string.commons_content_oopserror, 0).show();
                return;
            }
            C5408a aVar = C5407g.f13966d;
            Activity A = this.f14704e.mo9304A();
            C12932j.m33815a((Object) A, "requireActivity()");
            aVar.mo12991a(A).mo12973a(true);
            Activity b = this.f14704e.mo23920b();
            if (b != null) {
                b.finish();
            }
        }
    }

    /* renamed from: app.zenly.locator.support.t$c */
    static final class C5809c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C5806t f14705e;

        C5809c(C5806t tVar) {
            this.f14705e = tVar;
        }

        public final void onClick(View view) {
            C5343a.m15160U().mo12876e();
            C5499a aVar = C5498a.f14119e;
            C12932j.m33815a((Object) view, "it");
            Context context = view.getContext();
            C12932j.m33815a((Object) context, "it.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f14705e.m16234B();
            this.f14705e.m16235C();
        }
    }

    /* renamed from: app.zenly.locator.support.t$d */
    static final class C5810d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C5806t f14706e;

        C5810d(C5806t tVar) {
            this.f14706e = tVar;
        }

        public final void onClick(View view) {
            C5343a.m15160U().mo12867c();
            C5499a aVar = C5498a.f14119e;
            C12932j.m33815a((Object) view, "it");
            Context context = view.getContext();
            C12932j.m33815a((Object) context, "it.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f14706e.mo23946k().mo23997a((C8819d) this.f14706e);
        }
    }

    /* renamed from: app.zenly.locator.support.t$e */
    public static final class C5811e implements TextViewLinkAction {

        /* renamed from: a */
        final /* synthetic */ C5806t f14707a;

        /* renamed from: b */
        final /* synthetic */ View f14708b;

        C5811e(C5806t tVar, View view) {
            this.f14707a = tVar;
            this.f14708b = view;
        }

        public void execute(C3277j jVar) {
            C12932j.m33818b(jVar, "link");
            C5499a aVar = C5498a.f14119e;
            View view = this.f14708b;
            C12932j.m33815a((Object) view, "view");
            Context context = view.getContext();
            C12932j.m33815a((Object) context, "view.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            C5806t tVar = this.f14707a;
            String c = jVar.mo9729c();
            if (c != null) {
                tVar.m16241d(c);
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m16234B() {
        TextView textView = this.f14700Q;
        String str = "okButton";
        if (textView != null) {
            textView.setText("");
            TextView textView2 = this.f14700Q;
            if (textView2 != null) {
                textView2.setEnabled(false);
                TextView textView3 = this.f14701R;
                if (textView3 != null) {
                    textView3.setEnabled(false);
                    ProgressBar progressBar = this.f14702S;
                    if (progressBar != null) {
                        progressBar.setVisibility(0);
                    } else {
                        C12932j.m33820c("progress");
                        throw null;
                    }
                } else {
                    C12932j.m33820c("cancelButton");
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m16235C() {
        C5448c.m15478a().userStartDeletionProcess().mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) C5807a.f14703e, (Consumer<? super Throwable>) new C5808b<Object>(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m16236D() {
        TextView textView = this.f14700Q;
        String str = "okButton";
        if (textView != null) {
            textView.setText(R.string.support_deletion_confirmation_title_ok);
            TextView textView2 = this.f14700Q;
            if (textView2 != null) {
                textView2.setEnabled(true);
                TextView textView3 = this.f14701R;
                if (textView3 != null) {
                    textView3.setEnabled(true);
                    ProgressBar progressBar = this.f14702S;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                    } else {
                        C12932j.m33820c("progress");
                        throw null;
                    }
                } else {
                    C12932j.m33820c("cancelButton");
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        this.f14699P.mo36401a();
        super.mo7053d(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        TextView textView = this.f14700Q;
        if (textView != null) {
            textView.setEnabled(true);
            TextView textView2 = this.f14701R;
            if (textView2 != null) {
                textView2.setEnabled(true);
            } else {
                C12932j.m33820c("cancelButton");
                throw null;
            }
        } else {
            C12932j.m33820c("okButton");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m16241d(String str) {
        C8831g k = mo23946k();
        C8836h a = C8836h.m21058a((C8819d) C5566b.f14227Q.mo13178a(str));
        a.mo24026b(new C8816c());
        a.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_delete_account_confirm, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.button_ok);
        TextView textView = (TextView) findViewById;
        textView.setOnClickListener(new C5809c(this));
        String str = "view.findViewById<TextVi…)\n            }\n        }";
        C12932j.m33815a((Object) findViewById, str);
        this.f14700Q = textView;
        View findViewById2 = inflate.findViewById(R.id.button_cancel);
        TextView textView2 = (TextView) findViewById2;
        textView2.setOnClickListener(new C5810d(this));
        C12932j.m33815a((Object) findViewById2, str);
        this.f14701R = textView2;
        View findViewById3 = inflate.findViewById(R.id.delete_progress);
        C12932j.m33815a((Object) findViewById3, "view.findViewById(R.id.delete_progress)");
        this.f14702S = (ProgressBar) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.description);
        C12932j.m33815a((Object) findViewById4, "view.findViewById<TextView>(R.id.description)");
        TextView textView3 = (TextView) findViewById4;
        C3277j jVar = new C3277j(R.string.support_deletion_confirmation_title_pp, R.string.app_settings_privacyurl, null, 4, null);
        C3275i.m10385a(textView3, R.string.support_deletion_confirmation_title_message, C12846n.m33635a(jVar), new C5811e(this, inflate));
        C12932j.m33815a((Object) inflate, "view");
        return inflate;
    }
}
