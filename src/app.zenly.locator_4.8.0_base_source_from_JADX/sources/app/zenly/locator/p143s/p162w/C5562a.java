package app.zenly.locator.p143s.p162w;

import android.graphics.RectF;
import android.os.Handler;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import app.zenly.android.base.view.C1311b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.s.w.a */
public final class C5562a {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final RectF f14219f = new RectF();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final HashMap<View, RectF> f14220a = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f14221b = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5565c f14222c = new C5565c(this);

    /* renamed from: d */
    private final OnLayoutChangeListener f14223d = new C5564b(this);

    /* renamed from: e */
    private final C12785a<List<RectF>> f14224e;

    /* renamed from: app.zenly.locator.s.w.a$a */
    public static final class C5563a {
        private C5563a() {
        }

        public /* synthetic */ C5563a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.s.w.a$b */
    static final class C5564b implements OnLayoutChangeListener {

        /* renamed from: e */
        final /* synthetic */ C5562a f14225e;

        C5564b(C5562a aVar) {
            this.f14225e = aVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C5565c c = this.f14225e.f14222c;
            C12932j.m33815a((Object) view, "v");
            c.mo13176b(view);
        }
    }

    /* renamed from: app.zenly.locator.s.w.a$c */
    public static final class C5565c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C5562a f14226e;

        C5565c(C5562a aVar) {
            this.f14226e = aVar;
        }

        /* renamed from: a */
        public final RectF mo13174a(View view) {
            C12932j.m33818b(view, "view");
            if (!view.isAttachedToWindow()) {
                return C5562a.f14219f;
            }
            RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            C1311b.m6284b(view, rectF);
            return rectF;
        }

        /* renamed from: b */
        public final void mo13176b(View view) {
            C12932j.m33818b(view, "view");
            RectF a = mo13174a(view);
            if (!C12932j.m33817a((Object) a, (Object) (RectF) this.f14226e.f14220a.get(view))) {
                this.f14226e.f14220a.put(view, a);
                C12785a a2 = this.f14226e.mo13170a();
                Collection values = this.f14226e.f14220a.values();
                C12932j.m33815a((Object) values, "positions.values");
                ArrayList arrayList = new ArrayList();
                for (Object next : values) {
                    if (!C12932j.m33817a((Object) (RectF) next, (Object) C5562a.f14219f)) {
                        arrayList.add(next);
                    }
                }
                a2.onNext(arrayList);
            }
        }

        public void run() {
            this.f14226e.f14221b.removeCallbacks(this);
            mo13175a();
            if (!this.f14226e.f14220a.isEmpty()) {
                this.f14226e.f14221b.postDelayed(this, 500);
            }
        }

        /* renamed from: a */
        public final void mo13175a() {
            Set<View> keySet = this.f14226e.f14220a.keySet();
            C12932j.m33815a((Object) keySet, "positions.keys");
            boolean z = false;
            for (View view : keySet) {
                C12932j.m33815a((Object) view, "it");
                RectF a = mo13174a(view);
                if (!C12932j.m33817a((Object) a, (Object) (RectF) this.f14226e.f14220a.get(view))) {
                    this.f14226e.f14220a.put(view, a);
                    z = true;
                }
            }
            if (z) {
                C12785a a2 = this.f14226e.mo13170a();
                Collection values = this.f14226e.f14220a.values();
                C12932j.m33815a((Object) values, "positions.values");
                ArrayList arrayList = new ArrayList();
                for (Object next : values) {
                    if (!C12932j.m33817a((Object) (RectF) next, (Object) C5562a.f14219f)) {
                        arrayList.add(next);
                    }
                }
                a2.onNext(arrayList);
            } else if (this.f14226e.f14220a.isEmpty()) {
                Object s = this.f14226e.mo13170a().mo36963s();
                if (s == null) {
                    C12932j.m33814a();
                    throw null;
                } else if (!((List) s).isEmpty()) {
                    this.f14226e.mo13170a().onNext(C12848o.m33640a());
                }
            }
        }
    }

    static {
        new C5563a(null);
    }

    public C5562a() {
        C12785a<List<RectF>> h = C12785a.m33446h(C12848o.m33640a());
        C12932j.m33815a((Object) h, "BehaviorSubject.createDefault(emptyList<RectF>())");
        this.f14224e = h;
    }

    /* renamed from: a */
    public final C12785a<List<RectF>> mo13170a() {
        return this.f14224e;
    }

    /* renamed from: a */
    public final void mo13171a(View view) {
        C12932j.m33818b(view, "view");
        view.removeOnLayoutChangeListener(this.f14223d);
        this.f14220a.remove(view);
        this.f14222c.run();
    }

    /* renamed from: b */
    public final void mo13172b(View view) {
        C12932j.m33818b(view, "view");
        if (!this.f14220a.containsKey(view)) {
            this.f14220a.put(view, f14219f);
            view.addOnLayoutChangeListener(this.f14223d);
        }
        if (this.f14220a.size() == 1) {
            this.f14222c.run();
        } else {
            this.f14222c.mo13176b(view);
        }
    }
}
