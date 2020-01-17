package app.zenly.locator.friendshipfacts.p096i;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.friendshipfacts.p097j.C3798b;
import app.zenly.locator.friendshipfacts.p100m.C3813c;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.friendshipfacts.i.f */
public final class C3793f extends C7717d<C3813c> {

    /* renamed from: e */
    private HashMap f10122e;

    /* renamed from: app.zenly.locator.friendshipfacts.i.f$a */
    static final class C3794a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3793f f10123e;

        C3794a(C3793f fVar) {
            this.f10123e = fVar;
        }

        public final void onClick(View view) {
            this.f10123e.mo34491a().dispatch(C3798b.f10129a);
        }
    }

    /* renamed from: a */
    public View mo10357a(int i) {
        if (this.f10122e == null) {
            this.f10122e = new HashMap();
        }
        View view = (View) this.f10122e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f10122e.put(Integer.valueOf(i), view);
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
    public void mo6952a(C3813c cVar, C3813c cVar2) {
        C12932j.m33818b(cVar, "model");
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo10357a(C3891l.title);
        C12932j.m33815a((Object) appCompatTextView, "title");
        appCompatTextView.setText(cVar.mo10397g());
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo10357a(C3891l.subtitle);
        C12932j.m33815a((Object) appCompatTextView2, "subtitle");
        appCompatTextView2.setText(cVar.mo10396f());
        mo34493b().setOnClickListener(new C3794a(this));
    }
}
