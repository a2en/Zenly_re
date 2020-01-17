package app.zenly.locator.map;

import android.content.Context;
import android.graphics.RectF;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.MapControllerContract.C2458b;
import app.zenly.locator.map.base.Map;
import app.zenly.locator.map.marker.C4178e0;
import app.zenly.locator.map.marker.C4187h0;
import app.zenly.locator.map.marker.MarkerManager;
import app.zenly.locator.map.p112k1.C4109f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C12932j;

public final class MapGestureListener extends SimpleOnGestureListener {

    /* renamed from: e */
    private boolean f10306e = true;

    /* renamed from: f */
    private final int f10307f;

    /* renamed from: g */
    private final RectF f10308g;

    /* renamed from: h */
    private final Map f10309h;

    /* renamed from: i */
    private final MarkerManager f10310i;

    /* renamed from: j */
    private final C4109f f10311j;

    /* renamed from: k */
    private final OnMarkerClickListener f10312k;

    public interface OnMarkerClickListener {
        void onMarkerClick(C4178e0<?> e0Var);
    }

    /* renamed from: app.zenly.locator.map.MapGestureListener$a */
    static final class C3893a<T> implements Comparator<C4178e0<?>> {

        /* renamed from: e */
        public static final C3893a f10313e = new C3893a();

        C3893a() {
        }

        /* renamed from: a */
        public final int compare(C4178e0<?> e0Var, C4178e0<?> e0Var2) {
            C12932j.m33815a((Object) e0Var2, "marker1");
            int q = e0Var2.mo11046q();
            C12932j.m33815a((Object) e0Var, "marker0");
            return q - e0Var.mo11046q();
        }
    }

    public MapGestureListener(Context context, Map map, MarkerManager markerManager, C4109f fVar, OnMarkerClickListener onMarkerClickListener) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(map, "map");
        C12932j.m33818b(markerManager, "markerManager");
        C12932j.m33818b(fVar, "headingPresenter");
        C12932j.m33818b(onMarkerClickListener, "onMarkerClickListener");
        this.f10309h = map;
        this.f10310i = markerManager;
        this.f10311j = fVar;
        this.f10312k = onMarkerClickListener;
        this.f10307f = context.getResources().getDimensionPixelSize(R.dimen.spacing_150);
        this.f10308g = new RectF();
    }

    /* renamed from: a */
    public final void mo10490a(boolean z) {
        this.f10306e = z;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f10310i.mo10938b(false);
        if (this.f10310i.mo10919a() == C2458b.NORMAL || this.f10310i.mo10919a() == C2458b.GATHERING) {
            this.f10310i.mo10935a(true, true, true);
        }
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        C12932j.m33818b(motionEvent, "e");
        this.f10310i.mo10938b(false);
        m11462a(motionEvent, this.f10308g);
        List a = m11461a(this.f10308g);
        C4178e0 d = this.f10310i.mo10943d();
        if (d != null && d.mo11020B() && m11464a(this.f10308g, d)) {
            m11463a(d);
            return true;
        } else if (a.size() > 1) {
            List b = this.f10310i.mo10936b();
            if (d == null) {
                C12932j.m33815a((Object) b, "followedMarkers");
                if (!(!b.isEmpty()) && this.f10309h.getCurrentZoomRatio() < 0.8f) {
                    this.f10310i.mo10941c(a, true);
                    return true;
                }
            }
            m11463a(m11460a(a, d));
            return true;
        } else if (a.size() == 1) {
            m11463a((C4178e0) a.get(0));
            return true;
        } else if (this.f10311j.mo10782a(motionEvent)) {
            return true;
        } else {
            if (!this.f10306e || (this.f10310i.mo10919a() != C2458b.NORMAL && this.f10310i.mo10919a() != C2458b.GATHERING)) {
                return false;
            }
            return this.f10310i.mo10935a(true, true, true);
        }
    }

    /* renamed from: a */
    private final void m11463a(C4178e0<?> e0Var) {
        this.f10312k.onMarkerClick(e0Var);
        this.f10310i.mo10939b(e0Var, true, true);
    }

    /* renamed from: a */
    private final void m11462a(MotionEvent motionEvent, RectF rectF) {
        rectF.set(motionEvent.getX() - ((float) this.f10307f), motionEvent.getY() - ((float) this.f10307f), motionEvent.getX() + ((float) this.f10307f), motionEvent.getY() + ((float) this.f10307f));
    }

    /* renamed from: a */
    private final List<C4178e0<?>> m11461a(RectF rectF) {
        ArrayList arrayList = new ArrayList();
        for (C4187h0 h0Var : this.f10310i.mo10940c()) {
            C12932j.m33815a((Object) h0Var, "markerOverlay");
            for (C4178e0 e0Var : h0Var.getAttachedMarkers()) {
                C12932j.m33815a((Object) e0Var, "marker");
                if (e0Var.mo11020B() && m11464a(rectF, e0Var)) {
                    arrayList.add(e0Var);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final C4178e0<?> m11460a(List<C4178e0<?>> list, C4178e0<?> e0Var) {
        C12853s.m33649a(list, C3893a.f10313e);
        int indexOf = e0Var != null ? list.indexOf(e0Var) : -1;
        if (indexOf < 0 || indexOf >= list.size() - 1) {
            return (C4178e0) list.get(0);
        }
        return (C4178e0) list.get(indexOf + 1);
    }

    /* renamed from: a */
    private final boolean m11464a(RectF rectF, C4178e0<?> e0Var) {
        return e0Var.mo11120u() && !e0Var.mo11124y() && e0Var.mo11112g() != null && RectF.intersects(rectF, e0Var.mo11115n());
    }
}
