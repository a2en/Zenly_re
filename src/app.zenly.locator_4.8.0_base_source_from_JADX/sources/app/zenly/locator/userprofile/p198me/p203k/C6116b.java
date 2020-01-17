package app.zenly.locator.userprofile.p198me.p203k;

import android.view.View;
import android.view.View.OnClickListener;
import app.zenly.locator.userprofile.p198me.p200h.C6091e;
import app.zenly.locator.userprofile.p198me.p204l.C6136c;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.userprofile.me.k.b */
public final class C6116b extends C7717d<C6136c> {

    /* renamed from: app.zenly.locator.userprofile.me.k.b$a */
    static final class C6117a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6116b f15379e;

        C6117a(C6116b bVar) {
            this.f15379e = bVar;
        }

        public final void onClick(View view) {
            this.f15379e.mo34491a().dispatch(C6091e.f15329a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C6136c cVar, C6136c cVar2) {
        C12932j.m33818b(cVar, "model");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        view.setOnClickListener(new C6117a(this));
    }
}
