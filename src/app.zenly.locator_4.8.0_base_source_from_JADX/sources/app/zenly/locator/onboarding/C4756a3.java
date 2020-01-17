package app.zenly.locator.onboarding;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.fragment.app.FragmentActivity;
import app.zenly.android.feature.base.model.C1334a.C1335a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.p067j.C2490c;
import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.invitations.C2545e0.C2549b0;
import app.zenly.locator.core.invitations.C2545e0.C2554e;
import app.zenly.locator.core.invitations.C2620u;
import app.zenly.locator.core.invitations.MessageShareContent;
import app.zenly.locator.core.invitations.p068g0.C2590a;
import app.zenly.locator.core.invitations.p068g0.C2590a.C2591a;
import app.zenly.locator.core.invitations.p068g0.C2594d;
import app.zenly.locator.core.invitations.p068g0.C2596e;
import app.zenly.locator.core.invitations.p068g0.C2597f;
import app.zenly.locator.decision.p082b.p083u.C3498n;
import app.zenly.locator.experimental.referrer.ReferrerDetails.C3744d;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.C5407g.C5408a;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.C8978i;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.onboarding.a3 */
public final class C4756a3 extends BaseSignupController {

    /* renamed from: T */
    private final C12275b f12553T = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: U */
    public boolean f12554U;

    /* renamed from: app.zenly.locator.onboarding.a3$a */
    static final class C4757a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C4756a3 f12555e;

        /* renamed from: f */
        final /* synthetic */ View f12556f;

        /* renamed from: g */
        final /* synthetic */ C2545e0 f12557g;

        C4757a(C4756a3 a3Var, View view, C2545e0 e0Var) {
            this.f12555e = a3Var;
            this.f12556f = view;
            this.f12557g = e0Var;
        }

        public final void onClick(View view) {
            View view2 = this.f12556f;
            String str = "view";
            C12932j.m33815a((Object) view2, str);
            TextView textView = (TextView) view2.findViewById(C3891l.tap_to_open_button);
            C12932j.m33815a((Object) textView, "view.tap_to_open_button");
            textView.setVisibility(4);
            View view3 = this.f12556f;
            C12932j.m33815a((Object) view3, str);
            ProgressBar progressBar = (ProgressBar) view3.findViewById(C3891l.tap_to_open_progress_bar);
            C12932j.m33815a((Object) progressBar, "view.tap_to_open_progress_bar");
            progressBar.setVisibility(0);
            this.f12555e.f12554U = true;
            this.f12555e.m13865a(this.f12557g);
        }
    }

    /* renamed from: app.zenly.locator.onboarding.a3$b */
    static final class C4758b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C4756a3 f12558e;

        /* renamed from: f */
        final /* synthetic */ View f12559f;

        /* renamed from: g */
        final /* synthetic */ C2545e0 f12560g;

        C4758b(C4756a3 a3Var, View view, C2545e0 e0Var) {
            this.f12558e = a3Var;
            this.f12559f = view;
            this.f12560g = e0Var;
        }

        public final void onClick(View view) {
            View view2 = this.f12559f;
            String str = "view";
            C12932j.m33815a((Object) view2, str);
            TextView textView = (TextView) view2.findViewById(C3891l.tap_to_reopen_button);
            C12932j.m33815a((Object) textView, "view.tap_to_reopen_button");
            textView.setVisibility(4);
            View view3 = this.f12559f;
            C12932j.m33815a((Object) view3, str);
            ProgressBar progressBar = (ProgressBar) view3.findViewById(C3891l.tap_to_reopen_progress_bar);
            C12932j.m33815a((Object) progressBar, "view.tap_to_reopen_progress_bar");
            progressBar.setVisibility(0);
            this.f12558e.f12554U = true;
            this.f12558e.m13865a(this.f12560g);
        }
    }

    /* renamed from: app.zenly.locator.onboarding.a3$c */
    static final class C4759c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C4756a3 f12561e;

        C4759c(C4756a3 a3Var) {
            this.f12561e = a3Var;
        }

        public final void onClick(View view) {
            C8831g k = this.f12561e.mo23946k();
            C8836h a = C8836h.m21058a((C8819d) new BroadcastInviteOtherAppsController());
            a.mo24026b(new C8816c());
            a.mo24023a((ControllerChangeHandler) new C8816c());
            k.mo23991a(a);
        }
    }

    /* renamed from: app.zenly.locator.onboarding.a3$d */
    static final class C4760d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C4756a3 f12562e;

        C4760d(C4756a3 a3Var) {
            this.f12562e = a3Var;
        }

        public final void onClick(View view) {
            this.f12562e.m13864E();
            this.f12562e.mo11926D();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.a3$e */
    static final class C4761e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C4756a3 f12563e;

        C4761e(C4756a3 a3Var) {
            this.f12563e = a3Var;
        }

        public final void onClick(View view) {
            this.f12563e.m13864E();
            this.f12563e.mo11926D();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m13864E() {
        C5408a aVar = C5407g.f13966d;
        Activity A = mo9304A();
        C12932j.m33815a((Object) A, "requireActivity()");
        new C2594d(aVar.mo12991a(A).mo12986h()).mo8698a(true);
    }

    /* renamed from: e */
    private final void m13869e(View view) {
        String str = "view.tap_to_reopen_layout";
        String str2 = "view.tap_to_open_layout";
        if (this.f12554U) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(C3891l.tap_to_open_layout);
            C12932j.m33815a((Object) frameLayout, str2);
            frameLayout.setVisibility(4);
            FrameLayout frameLayout2 = (FrameLayout) view.findViewById(C3891l.tap_to_reopen_layout);
            C12932j.m33815a((Object) frameLayout2, str);
            frameLayout2.setVisibility(0);
            TextView textView = (TextView) view.findViewById(C3891l.tap_to_reopen_button);
            C12932j.m33815a((Object) textView, "view.tap_to_reopen_button");
            textView.setVisibility(0);
            ProgressBar progressBar = (ProgressBar) view.findViewById(C3891l.tap_to_reopen_progress_bar);
            C12932j.m33815a((Object) progressBar, "view.tap_to_reopen_progress_bar");
            progressBar.setVisibility(4);
        } else {
            FrameLayout frameLayout3 = (FrameLayout) view.findViewById(C3891l.tap_to_open_layout);
            C12932j.m33815a((Object) frameLayout3, str2);
            frameLayout3.setVisibility(0);
            TextView textView2 = (TextView) view.findViewById(C3891l.tap_to_open_button);
            C12932j.m33815a((Object) textView2, "view.tap_to_open_button");
            textView2.setVisibility(0);
            ProgressBar progressBar2 = (ProgressBar) view.findViewById(C3891l.tap_to_open_progress_bar);
            C12932j.m33815a((Object) progressBar2, "view.tap_to_open_progress_bar");
            progressBar2.setVisibility(4);
            FrameLayout frameLayout4 = (FrameLayout) view.findViewById(C3891l.tap_to_reopen_layout);
            C12932j.m33815a((Object) frameLayout4, str);
            frameLayout4.setVisibility(4);
        }
        C5408a aVar = C5407g.f13966d;
        Activity A = mo9304A();
        C12932j.m33815a((Object) A, "requireActivity()");
        C2594d dVar = new C2594d(aVar.mo12991a(A).mo12986h());
        if (dVar.mo8709f() || dVar.mo8711g()) {
            TextView textView3 = (TextView) view.findViewById(C3891l.not_now);
            C12932j.m33815a((Object) textView3, "view.not_now");
            textView3.setVisibility(4);
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) view.findViewById(C3891l.button_next);
            appCompatImageButton.setVisibility(0);
            appCompatImageButton.setOnClickListener(new C4760d(this));
            return;
        }
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) view.findViewById(C3891l.button_next);
        C12932j.m33815a((Object) appCompatImageButton2, "view.button_next");
        appCompatImageButton2.setVisibility(4);
        TextView textView4 = (TextView) view.findViewById(C3891l.not_now);
        textView4.setVisibility(0);
        textView4.setOnClickListener(new C4761e(this));
        textView4.setText(textView4.getContext().getString(R.string.onboarding_broadcastedInvite_button_later));
    }

    /* renamed from: B */
    public int mo7192B() {
        return 54;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        m13869e(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        this.f12553T.mo36401a();
        super.mo7053d(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_broadcast_invite, viewGroup, false);
        C12932j.m33815a((Object) inflate, "view");
        Context context = inflate.getContext();
        C2554e eVar = C2545e0.f7606d;
        C12932j.m33815a((Object) context, "context");
        Locale locale = Locale.getDefault();
        C12932j.m33815a((Object) locale, "Locale.getDefault()");
        C2545e0 e0Var = (C2545e0) C12857w.m33683g(eVar.mo8689a(context, locale, true));
        C5408a aVar = C5407g.f13966d;
        Activity A = mo9304A();
        String str = "requireActivity()";
        C12932j.m33815a((Object) A, str);
        C2594d dVar = new C2594d(aVar.mo12991a(A).mo12986h());
        Activity A2 = mo9304A();
        C12932j.m33815a((Object) A2, str);
        if (e0Var == null || dVar.mo8707e()) {
            m13864E();
            mo11926D();
        } else {
            float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.corner_radius_300);
            C2476d.m8583a(inflate).m8714a().m8682a(Integer.valueOf(e0Var.mo8683a())).m8690a((Transformation<Bitmap>) new C2490c<Bitmap>(new C1335a(dimensionPixelSize))).m8691a(C8978i.f23426d).mo24173a((ImageView) inflate.findViewById(C3891l.sharing_app_icon));
            C2476d.m8583a(inflate).m8714a().m8682a(Integer.valueOf(2131231316)).m8690a((Transformation<Bitmap>) new C2490c<Bitmap>(new C1335a(dimensionPixelSize))).m8691a(C8978i.f23426d).mo24173a((ImageView) inflate.findViewById(C3891l.zenly_icon));
            TextView textView = (TextView) inflate.findViewById(C3891l.notification_title);
            String a = C2596e.m8923a(e0Var, A2);
            C12932j.m33815a((Object) textView, "sharingTitle");
            textView.setText(A2.getString(R.string.onboarding_broadcastedInvite_title, new Object[]{a}));
            String string = A2.getString(R.string.onboarding_broadcastedInvite_button_open, new Object[]{a});
            C12932j.m33815a((Object) string, "activity.getString(R.str…utton_open, shortAppName)");
            ((TextView) inflate.findViewById(C3891l.tap_to_open_button)).setOnClickListener(new C4757a(this, inflate, e0Var));
            ((TextView) inflate.findViewById(C3891l.tap_to_reopen_button)).setOnClickListener(new C4758b(this, inflate, e0Var));
            TextView textView2 = (TextView) inflate.findViewById(C3891l.tap_to_open_button);
            C12932j.m33815a((Object) textView2, "view.tap_to_open_button");
            textView2.setText(string);
            TextView textView3 = (TextView) inflate.findViewById(C3891l.tap_to_reopen_button);
            C12932j.m33815a((Object) textView3, "view.tap_to_reopen_button");
            textView3.setText(string);
            m13869e(inflate);
            ((TextView) inflate.findViewById(C3891l.other_apps)).setOnClickListener(new C4759c(this));
        }
        return inflate;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m13865a(C2545e0 e0Var) {
        Activity A = mo9304A();
        C12932j.m33815a((Object) A, "requireActivity()");
        new C2594d(C5407g.f13966d.mo12991a(A).mo12986h()).mo8710g(true);
        C5343a U = C5343a.m15160U();
        C12932j.m33815a((Object) U, "Analytics.get()");
        AnalyticsTracker a = U.mo12806a();
        C12932j.m33815a((Object) a, "Analytics.get().tracker");
        C2590a.m8901a(new C2590a(a), C2591a.ONBOARDING, e0Var.mo8688c(), 0, false, 12, null);
        int b = C3744d.BroadcastInviteOnboarding.mo10293b();
        if (C12932j.m33817a((Object) e0Var, (Object) C2549b0.f7613e) && C3498n.f9481a.isOpen()) {
            C12773a.m33432a(new C2597f(A, b).mo8714a(), this.f12553T);
        } else if (A != null) {
            C2620u uVar = new C2620u((FragmentActivity) A);
            String string = A.getString(R.string.sharesheet_broadcastedInvite_title);
            C12932j.m33815a((Object) string, "activity.getString(R.str…_broadcastedInvite_title)");
            C2620u.m8944a(uVar, null, string, new MessageShareContent(null, b), C2591a.ONBOARDING, e0Var, null, 33, null);
        } else {
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        }
    }
}
