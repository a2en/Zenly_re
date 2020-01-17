package app.zenly.locator.support.p171t0.p173g;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.view.C0143b;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.controller.DraggableDialogController.ExitListener;
import app.zenly.locator.support.C5724n0.C5738f;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

/* renamed from: app.zenly.locator.support.t0.g.c */
public final class C5829c {

    /* renamed from: a */
    public static final C5829c f14738a = new C5829c();

    /* renamed from: app.zenly.locator.support.t0.g.c$a */
    static final class C5830a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ Function3 f14739e;

        C5830a(String str, Function3 function3) {
            this.f14739e = function3;
        }

        public final void onClick(View view) {
            Function3 function3 = this.f14739e;
            C12932j.m33815a((Object) view, "it");
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(C3891l.report_button_primary_title);
            C12932j.m33815a((Object) appCompatTextView, "it.report_button_primary_title");
            ProgressBar progressBar = (ProgressBar) view.findViewById(C3891l.report_button_primary_progress);
            C12932j.m33815a((Object) progressBar, "it.report_button_primary_progress");
            function3.invoke(view, appCompatTextView, progressBar);
        }
    }

    /* renamed from: app.zenly.locator.support.t0.g.c$b */
    static final class C5831b implements ExitListener {

        /* renamed from: a */
        final /* synthetic */ Function0 f14740a;

        C5831b(Function0 function0) {
            this.f14740a = function0;
        }

        public final void onExit() {
            this.f14740a.invoke();
        }
    }

    private C5829c() {
    }

    /* renamed from: a */
    public final void mo13509a(Activity activity, C2918b bVar, String str, C5738f fVar, Function3<? super View, ? super View, ? super View, C12956q> function3) {
        int i;
        C12932j.m33818b(activity, "activity");
        C12932j.m33818b(bVar, "placeTag");
        C12932j.m33818b(str, "placeAddress");
        C12932j.m33818b(fVar, "reason");
        C12932j.m33818b(function3, "onSubmit");
        int i2 = C5828b.f14736a[bVar.ordinal()];
        int i3 = i2 != 1 ? i2 != 2 ? i2 != 3 ? C7674a.f19294a : 2131230935 : 2131230932 : 2131230928;
        switch (C5828b.f14737b[fVar.ordinal()]) {
            case 1:
                i = R.string.support_places_modal_title_addHome;
                break;
            case 2:
                i = R.string.support_places_modal_title_addSchool;
                break;
            case 3:
                i = R.string.support_places_modal_title_addWork;
                break;
            case 4:
                i = R.string.support_places_modal_title_removeHome;
                break;
            case 5:
                i = R.string.support_places_modal_title_hideHome;
                break;
            case 6:
            case 7:
            case 8:
                i = R.string.support_places_modal_title_updateHome;
                break;
            case 9:
                i = R.string.support_places_modal_title_removeSchool;
                break;
            case 10:
                i = R.string.support_places_modal_title_hideSchool;
                break;
            case 11:
            case 12:
            case 13:
                i = R.string.support_places_modal_title_updateSchool;
                break;
            case 14:
                i = R.string.support_places_modal_title_removeWork;
                break;
            case 15:
                i = R.string.support_places_modal_title_hideWork;
                break;
            case 16:
            case 17:
            case 18:
                i = R.string.support_places_modal_title_updateWork;
                break;
            default:
                i = C7674a.f19294a;
                break;
        }
        View inflate = LayoutInflater.from(new C0143b((Context) activity, 2132083208)).inflate(R.layout.dialog_content_report_place, null);
        C12932j.m33815a((Object) inflate, "it");
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(C3891l.report_address);
        C12932j.m33815a((Object) appCompatTextView, "it.report_address");
        appCompatTextView.setText(str);
        ((AppCompatTextView) inflate.findViewById(C3891l.report_button_primary_title)).setText(R.string.support_places_modal_button_confirm);
        ((FrameLayout) inflate.findViewById(C3891l.report_button_primary)).setOnClickListener(new C5830a(str, function3));
        C3106c cVar = new C3106c(activity);
        cVar.mo9339b(i3);
        cVar.mo9349f(i);
        cVar.mo9350g(17);
        cVar.mo9336a(activity.getString(R.string.commons_button_cancel), (OnClickListener) null);
        cVar.mo9333a(inflate);
        cVar.mo9301a(true).mo9344b().mo9296j(activity);
    }

    /* renamed from: a */
    public final void mo13510a(Activity activity, Function0<C12956q> function0) {
        C12932j.m33818b(activity, "activity");
        C12932j.m33818b(function0, "onExit");
        C3106c cVar = new C3106c(activity);
        cVar.mo9331a(2131231400);
        cVar.mo9349f((int) R.string.support_places_report_success_title);
        cVar.mo9348e((int) R.string.support_places_report_success_message);
        cVar.mo9345c((int) R.string.support_places_report_success_button);
        cVar.mo9301a(true).mo9300a((ExitListener) new C5831b(function0)).mo9344b().mo9296j(activity);
    }

    /* renamed from: a */
    public final void mo13508a(Activity activity) {
        C12932j.m33818b(activity, "activity");
        C3106c cVar = new C3106c(activity);
        cVar.mo9331a(2131231414);
        cVar.mo9349f((int) R.string.commons_title_oopserror);
        cVar.mo9349f((int) R.string.commons_content_oopserror);
        cVar.mo9345c((int) R.string.report_complete_close);
        cVar.mo9301a(true).mo9344b().mo9296j(activity);
    }
}
