package app.zenly.locator.map;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.manager.p070t5.C2832b;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.models.C2898q.C2900b;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p148l.C5448c;
import com.bluelinelabs.conductor.C8819d;
import p213co.znly.models.core.C7117i;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.map.t0 */
public class C4292t0 extends ZenlyController implements OnClickListener {

    /* renamed from: U */
    private static final C2832b<C2900b> f11488U = new C2832b<>();

    /* renamed from: P */
    private final C12275b f11489P = new C12275b();

    /* renamed from: Q */
    private final int f11490Q;

    /* renamed from: R */
    private C2718k5 f11491R;

    /* renamed from: S */
    private NavigationContract f11492S;

    /* renamed from: T */
    private View f11493T;

    public C4292t0(Bundle bundle) {
        super(bundle);
        this.f11490Q = bundle.getInt("key:gatheringId");
    }

    /* renamed from: D */
    private void m12727D() {
        this.f11493T.setEnabled(false);
        C2900b a = this.f11491R.mo8780a(this.f11490Q);
        if (a != null) {
            C5343a.m15160U().mo12881f(a.f8240l.size());
            String[] strArr = new String[a.f8240l.size()];
            for (int i = 0; i < a.f8240l.size(); i++) {
                strArr[i] = ((C2896p) a.f8240l.get(i)).f8197a;
            }
            this.f11489P.add(C5448c.m15478a().chatResolveGroupConversation(strArr).mo36466c((ObservableSource<? extends T>) C12279e.m32626e(C5448c.m15478a().chatCreateLazyGroup(strArr))).mo36428a(C12295a.m32802a()).mo36413a((Consumer<? super T>) new C3910d<Object>(this), (Consumer<? super Throwable>) new C3931e<Object>(this), (Action) new C3904c(this)));
            return;
        }
        mo23946k().mo23997a((C8819d) this);
    }

    /* renamed from: b */
    public static C4292t0 m12728b(int i) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9607a("key:gatheringId", i);
        return new C4292t0(dVar.mo9605a());
    }

    /* renamed from: B */
    public int mo7192B() {
        return this.f11490Q;
    }

    /* renamed from: C */
    public /* synthetic */ void mo11322C() throws Exception {
        C12143a.m32027a("chatResolveGroupConversation: onComplete ", new Object[0]);
        this.f11493T.setEnabled(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        this.f11491R = C2666b.m9049a(context).mo8763a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        super.mo7053d(view);
        this.f11489P.mo36401a();
        this.f11492S = null;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btn_create_chat) {
            m12727D();
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: w */
    public boolean mo7339w() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.controller_gathering, viewGroup, false);
        this.f11493T = frameLayout.findViewById(R.id.btn_create_chat);
        this.f11493T.setOnClickListener(this);
        return frameLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (mo23947l() instanceof NavigationContract) {
            this.f11492S = (NavigationContract) mo23947l();
        } else if (mo23920b() instanceof NavigationContract) {
            this.f11492S = (NavigationContract) mo23920b();
        }
        this.f11489P.add(this.f11491R.mo8788b(this.f11490Q).mo36460b(f11488U).mo36428a(C12295a.m32802a()).mo36476d((Consumer<? super T>) new C3898b<Object>(this)));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11323a(C2832b bVar) throws Exception {
        C2900b bVar2 = (C2900b) bVar.mo8866c();
        boolean z = true;
        int i = 0;
        if (bVar2 == null || !bVar2.f8226c || bVar2.f8240l.size() <= 1) {
            z = false;
        }
        View view = this.f11493T;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11324a(C7117i iVar) throws Exception {
        this.f11492S.onConversationCreated(iVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11325a(Throwable th) throws Exception {
        C12143a.m32032b(th, "chatResolveGroupConversation: onError ", new Object[0]);
        if (mo23920b() != null && !mo23920b().isFinishing()) {
            Toast.makeText(mo23920b(), R.string.commons_content_oopserror, 0).show();
        }
        this.f11493T.setEnabled(true);
    }
}
