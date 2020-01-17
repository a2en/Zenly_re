package app.zenly.locator.dashboard.p080y;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.dashboard.C3319p;
import app.zenly.locator.dashboard.p081z.C3429h;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.dashboard.y.h */
public final class C3403h extends C7717d<C3429h> {

    /* renamed from: e */
    private HashMap f9391e;

    /* renamed from: app.zenly.locator.dashboard.y.h$a */
    static final class C3404a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3403h f9392e;

        C3404a(C3403h hVar) {
            this.f9392e = hVar;
        }

        public final void onClick(View view) {
            this.f9392e.mo34491a().dispatch(C3319p.f9230a);
        }
    }

    /* renamed from: a */
    public View mo9903a(int i) {
        if (this.f9391e == null) {
            this.f9391e = new HashMap();
        }
        View view = (View) this.f9391e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9391e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3429h hVar, C3429h hVar2) {
        C12932j.m33818b(hVar, "model");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        TextView textView = (TextView) mo9903a(C3891l.explanation_text);
        C12932j.m33815a((Object) textView, "explanation_text");
        C12932j.m33815a((Object) context, "context");
        textView.setText(C7709b.m18762a(context, R.string.contactpicker_suggested_empty_message));
        ((Button) mo9903a(C3891l.btn_primary_action)).setOnClickListener(new C3404a(this));
    }
}
