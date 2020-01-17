package app.zenly.locator.p086e0.p087a.p090k;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.zenly.locator.C3891l;
import app.zenly.locator.p086e0.p087a.p088i.C3622c;
import app.zenly.locator.p086e0.p087a.p088i.C3623d;
import app.zenly.locator.p086e0.p087a.p091l.C3661f;
import app.zenly.locator.p143s.p160v.p161b.C5516a;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.e0.a.k.g */
public final class C3653g extends C7717d<C3661f> {

    /* renamed from: e */
    private HashMap f9788e;

    /* renamed from: app.zenly.locator.e0.a.k.g$a */
    static final class C3654a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3653g f9789e;

        /* renamed from: f */
        final /* synthetic */ C3661f f9790f;

        /* renamed from: g */
        final /* synthetic */ int f9791g;

        C3654a(C3653g gVar, C3661f fVar, int i) {
            this.f9789e = gVar;
            this.f9790f = fVar;
            this.f9791g = i;
        }

        public final void onClick(View view) {
            this.f9789e.mo34491a().dispatch(new C3622c(this.f9790f.mo10172j(), this.f9791g));
        }
    }

    /* renamed from: app.zenly.locator.e0.a.k.g$b */
    static final class C3655b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3653g f9792e;

        /* renamed from: f */
        final /* synthetic */ C3661f f9793f;

        C3655b(C3653g gVar, C3661f fVar) {
            this.f9792e = gVar;
            this.f9793f = fVar;
        }

        public final void onClick(View view) {
            this.f9792e.mo34491a().dispatch(new C3623d(this.f9793f));
        }
    }

    /* renamed from: b */
    private final void m10985b(C3661f fVar) {
        String str = "profile_watchers";
        if (fVar.mo10170h()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo10142a(C3891l.profile_watchers);
            C12932j.m33815a((Object) constraintLayout, str);
            constraintLayout.setVisibility(0);
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo10142a(C3891l.profile_watchers_subtitle);
            C12932j.m33815a((Object) appCompatTextView, "profile_watchers_subtitle");
            m10983a((TextView) appCompatTextView, fVar.mo10171i());
            ((ConstraintLayout) mo10142a(C3891l.profile_watchers)).setOnClickListener(new C3655b(this, fVar));
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo10142a(C3891l.profile_watchers);
        C12932j.m33815a((Object) constraintLayout2, str);
        constraintLayout2.setVisibility(4);
        ((ConstraintLayout) mo10142a(C3891l.profile_watchers)).setOnClickListener(null);
    }

    /* renamed from: a */
    public View mo10142a(int i) {
        if (this.f9788e == null) {
            this.f9788e = new HashMap();
        }
        View view = (View) this.f9788e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9788e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3661f fVar, C3661f fVar2) {
        C12932j.m33818b(fVar, "model");
        m10984a(fVar);
        m10985b(fVar);
    }

    /* renamed from: a */
    private final void m10984a(C3661f fVar) {
        int f = fVar.mo10168f();
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo10142a(C3891l.profile_descendants_subtitle);
        C12932j.m33815a((Object) appCompatTextView, "profile_descendants_subtitle");
        m10983a((TextView) appCompatTextView, f);
        ((ConstraintLayout) mo10142a(C3891l.profile_descendants)).setOnClickListener(new C3654a(this, fVar, f));
    }

    /* renamed from: a */
    private final void m10983a(TextView textView, int i) {
        Context context = textView.getContext();
        C12932j.m33815a((Object) context, "context");
        textView.setText(C5516a.m15639a(context, (long) i));
    }
}
