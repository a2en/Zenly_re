package app.zenly.locator.support.p171t0.p173g.p175i.p178e.p182g;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.core.widget.C3275i;
import app.zenly.locator.support.p171t0.p173g.p175i.p178e.p179d.C5867b;
import app.zenly.locator.support.p171t0.p173g.p175i.p178e.p183h.C5878c;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.support.t0.g.i.e.g.c */
public final class C5874c extends C7717d<C5878c> {

    /* renamed from: e */
    private HashMap f14855e;

    /* renamed from: app.zenly.locator.support.t0.g.i.e.g.c$a */
    static final class C5875a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C5874c f14856e;

        C5875a(C5874c cVar) {
            this.f14856e = cVar;
        }

        public final void onClick(View view) {
            this.f14856e.mo34491a().dispatch(new C5867b(C5874c.m16348a(this.f14856e).mo13566f()));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C5878c m16348a(C5874c cVar) {
        return (C5878c) cVar.mo34494c();
    }

    /* renamed from: a */
    public View mo13558a(int i) {
        if (this.f14855e == null) {
            this.f14855e = new HashMap();
        }
        View view = (View) this.f14855e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f14855e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        view.setOnClickListener(new C5875a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C5878c cVar, C5878c cVar2) {
        C12932j.m33818b(cVar, "model");
        TextView textView = (TextView) mo13558a(C3891l.title_text_view);
        C12932j.m33815a((Object) textView, "title_text_view");
        textView.setText(cVar.mo13566f().mo13548b());
        TextView textView2 = (TextView) mo13558a(C3891l.description_text_view);
        C12932j.m33815a((Object) textView2, "description_text_view");
        C3275i.m10386a(textView2, (CharSequence) cVar.mo13566f().mo13547a());
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo13558a(C3891l.accessory_text_view);
        C12932j.m33815a((Object) appCompatTextView, "accessory_text_view");
        appCompatTextView.setVisibility(8);
    }
}
