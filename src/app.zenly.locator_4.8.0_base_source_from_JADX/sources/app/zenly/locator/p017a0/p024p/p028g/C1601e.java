package app.zenly.locator.p017a0.p024p.p028g;

import android.view.View;
import android.view.View.OnClickListener;
import app.zenly.locator.p017a0.p024p.p029h.C1611f;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.a0.p.g.e */
public abstract class C1601e<T extends C1611f> extends C7717d<T> {

    /* renamed from: app.zenly.locator.a0.p.g.e$a */
    static final class C1602a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1601e f5572e;

        /* renamed from: f */
        final /* synthetic */ C1611f f5573f;

        C1602a(C1601e eVar, C1611f fVar) {
            this.f5572e = eVar;
            this.f5573f = fVar;
        }

        public final void onClick(View view) {
            this.f5572e.mo7165g();
            this.f5572e.mo34491a().dispatch(this.f5573f.mo7184f());
        }
    }

    /* renamed from: a */
    public abstract void mo7156a(T t, T t2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6952a(T t, T t2) {
        C12932j.m33818b(t, "model");
        if (t.mo7184f() != null) {
            mo34493b().setOnClickListener(new C1602a(this, t));
        } else {
            mo34493b().setOnClickListener(null);
        }
        mo7156a(t, t2);
    }

    /* renamed from: g */
    public void mo7165g() {
    }
}
