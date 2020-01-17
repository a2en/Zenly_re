package app.zenly.locator.recommendation.swipeable;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView.C1079p;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import app.zenly.locator.R;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;

public final class SwipeableLayoutManager extends LayoutManager {

    /* renamed from: s */
    private int f13644s;

    /* renamed from: t */
    private float f13645t;

    /* renamed from: u */
    private int f13646u;

    /* renamed from: v */
    private int f13647v;

    /* renamed from: w */
    private long f13648w;

    /* renamed from: x */
    private boolean f13649x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f13650y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final Function0<C12956q> f13651z;

    /* renamed from: app.zenly.locator.recommendation.swipeable.SwipeableLayoutManager$a */
    static final class C5308a extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        public static final C5308a f13652f = new C5308a();

        C5308a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: app.zenly.locator.recommendation.swipeable.SwipeableLayoutManager$b */
    static final class C5309b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ SwipeableLayoutManager f13653e;

        C5309b(SwipeableLayoutManager swipeableLayoutManager) {
            this.f13653e = swipeableLayoutManager;
        }

        public final void run() {
            SwipeableLayoutManager swipeableLayoutManager = this.f13653e;
            swipeableLayoutManager.f13650y = swipeableLayoutManager.f13650y - 1;
            if (swipeableLayoutManager.f13650y == 0) {
                this.f13653e.f13651z.invoke();
            }
        }
    }

    public SwipeableLayoutManager() {
        this(null, 1, null);
    }

    public SwipeableLayoutManager(Function0<C12956q> function0) {
        C12932j.m33818b(function0, "endAnimation");
        this.f13651z = function0;
        this.f13644s = 3;
        this.f13645t = 0.1f;
        this.f13647v = 10;
        this.f13648w = 250;
        this.f13649x = true;
    }

    /* renamed from: G */
    public final int mo12681G() {
        return this.f13647v;
    }

    /* renamed from: H */
    public final long mo12682H() {
        return this.f13648w;
    }

    /* renamed from: I */
    public final int mo12683I() {
        return this.f13644s;
    }

    /* renamed from: J */
    public final float mo12684J() {
        return this.f13645t;
    }

    /* renamed from: K */
    public final int mo12685K() {
        return this.f13646u;
    }

    /* renamed from: c */
    public LayoutParams mo4948c() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: e */
    public void mo4952e(C1079p pVar, C1082s sVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        C12932j.m33818b(pVar, "recycler");
        mo5235a(pVar);
        if (mo5293j() >= 1) {
            int min = Math.min(this.f13644s, mo5293j()) - 1;
            if (min <= 0) {
                min = 0;
            }
            for (int i = min; i >= 0; i--) {
                View d = pVar.mo5470d(i);
                C12932j.m33815a((Object) d, "recycler.getViewForPosition(position)");
                mo5255b(d);
                mo5225a(d, 0, 0);
                int t = (mo5309t() - mo5290h(d)) / 2;
                int h = (mo5289h() - mo5286g(d)) / 2;
                mo5226a(d, t, h, t + mo5290h(d), h + mo5286g(d));
                ViewCompat.m2835b(d, ((float) ((min - i) + 1)) * ((float) d.getResources().getDimensionPixelSize(R.dimen.elevation_200)));
                if (i > 0) {
                    float f7 = (float) 1;
                    float f8 = (float) i;
                    f3 = m15007b(f7 - (this.f13645t * f8));
                    if (i < this.f13644s - 1) {
                        f = m15009c(((float) this.f13646u) * f8);
                        f2 = m15007b(f7 - (this.f13645t * f8));
                        f4 = 1.0f;
                    } else {
                        float f9 = (float) (i - 1);
                        f = m15009c(((float) this.f13646u) * f9);
                        f2 = m15007b(f7 - (this.f13645t * f9));
                        f4 = 0.0f;
                    }
                } else {
                    f4 = 1.0f;
                    f3 = 1.0f;
                    f2 = 1.0f;
                    f = 1.0f;
                }
                if (this.f13649x) {
                    int i2 = i % 2 == 0 ? -1 : 1;
                    if (i < this.f13644s - 1) {
                        d.setAlpha(0.0f);
                        d.setScaleX(5.0f);
                        d.setScaleY(5.0f);
                        d.setRotation(((float) i2) * 60.0f);
                        if (i2 == -1) {
                            f6 = (float) (i2 * d.getMeasuredWidth());
                            f5 = 2.0f;
                        } else {
                            f6 = (float) d.getMeasuredWidth();
                            f5 = 3.5f;
                        }
                        d.setTranslationX(f6 * f5);
                        d.animate().alpha(1.0f).scaleX(f3).scaleY(f2).rotation(0.0f).translationX(0.0f).translationY(f).setStartDelay(((long) (this.f13644s - i)) * 100).withEndAction(new C5309b(this)).start();
                        this.f13650y++;
                    } else {
                        d.setAlpha(f4);
                        d.setScaleX(f3);
                        d.setScaleY(f2);
                        d.setTranslationY(f);
                    }
                } else if (this.f13650y == 0) {
                    d.setAlpha(f4);
                    d.setScaleX(f3);
                    d.setScaleY(f2);
                    d.setTranslationY(f);
                }
            }
            this.f13649x = false;
        }
    }

    /* renamed from: i */
    public final void mo12687i(int i) {
        this.f13644s = Math.max(i, 1);
    }

    /* renamed from: j */
    public final void mo12688j(int i) {
        this.f13646u = i;
    }

    /* renamed from: b */
    private final float m15007b(float f) {
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    /* renamed from: c */
    private final float m15009c(float f) {
        return Math.max(0.0f, f);
    }

    /* renamed from: a */
    public final void mo12686a(float f) {
        this.f13645t = Math.min(Math.max(0.0f, f), 1.0f);
    }

    public /* synthetic */ SwipeableLayoutManager(Function0 function0, int i, C12928f fVar) {
        if ((i & 1) != 0) {
            function0 = C5308a.f13652f;
        }
        this(function0);
    }
}
