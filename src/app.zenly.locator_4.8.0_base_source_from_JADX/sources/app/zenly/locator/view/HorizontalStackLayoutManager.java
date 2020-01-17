package app.zenly.locator.view;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.C1131l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1079p;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.C1062a;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

public final class HorizontalStackLayoutManager extends LayoutManager implements ScrollVectorProvider {

    /* renamed from: A */
    private SavedState f15459A;

    /* renamed from: B */
    private final int f15460B;

    /* renamed from: C */
    private final int f15461C;

    /* renamed from: D */
    private final int f15462D;

    /* renamed from: E */
    private final float f15463E;

    /* renamed from: s */
    private int f15464s;

    /* renamed from: t */
    private int f15465t;

    /* renamed from: u */
    private int f15466u;

    /* renamed from: v */
    private int f15467v;

    /* renamed from: w */
    private int f15468w;

    /* renamed from: x */
    private int f15469x;

    /* renamed from: y */
    private int f15470y;

    /* renamed from: z */
    private int f15471z;

    public static final class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C6157a();

        /* renamed from: e */
        private float f15472e;

        /* renamed from: app.zenly.locator.view.HorizontalStackLayoutManager$SavedState$a */
        public static final class C6157a implements Creator<SavedState> {
            C6157a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                C12932j.m33818b(parcel, "inParcel");
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* renamed from: app.zenly.locator.view.HorizontalStackLayoutManager$SavedState$b */
        public static final class C6158b {
            private C6158b() {
            }

            public /* synthetic */ C6158b(C12928f fVar) {
                this();
            }
        }

        static {
            new C6158b(null);
        }

        public SavedState() {
            this(null, 1, null);
        }

        public SavedState(Parcel parcel) {
            this.f15472e = parcel != null ? parcel.readFloat() : 0.0f;
        }

        /* renamed from: a */
        public final float mo14012a() {
            return this.f15472e;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C12932j.m33818b(parcel, "out");
            parcel.writeFloat(this.f15472e);
        }

        /* renamed from: a */
        public final void mo14013a(float f) {
            this.f15472e = f;
        }

        public /* synthetic */ SavedState(Parcel parcel, int i, C12928f fVar) {
            if ((i & 1) != 0) {
                parcel = null;
            }
            this(parcel);
        }
    }

    /* renamed from: app.zenly.locator.view.HorizontalStackLayoutManager$a */
    public static final class C6159a {
        private C6159a() {
        }

        public /* synthetic */ C6159a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.view.HorizontalStackLayoutManager$b */
    private static final class C6160b extends C1131l {

        /* renamed from: a */
        private final RecyclerView f15473a;

        /* renamed from: b */
        private final HorizontalStackLayoutManager f15474b;

        /* renamed from: app.zenly.locator.view.HorizontalStackLayoutManager$b$a */
        public static final class C6161a {
            private C6161a() {
            }

            public /* synthetic */ C6161a(C12928f fVar) {
                this();
            }
        }

        static {
            new C6161a(null);
        }

        public C6160b(RecyclerView recyclerView, HorizontalStackLayoutManager horizontalStackLayoutManager) {
            C12932j.m33818b(recyclerView, "recyclerView");
            C12932j.m33818b(horizontalStackLayoutManager, "layoutManager");
            super(recyclerView.getContext());
            this.f15473a = recyclerView;
            this.f15474b = horizontalStackLayoutManager;
        }

        /* access modifiers changed from: protected */
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            C12932j.m33818b(displayMetrics, "displayMetrics");
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        public void onTargetFound(View view, C1082s sVar, C1062a aVar) {
            C12932j.m33818b(view, "targetView");
            C12932j.m33818b(sVar, "state");
            C12932j.m33818b(aVar, "action");
            int i = this.f15474b.mo14010i(this.f15473a.mo5085e(view));
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.abs(i));
            if (calculateTimeForDeceleration > 0) {
                aVar.mo5354a(i, 0, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    static {
        new C6159a(null);
    }

    public HorizontalStackLayoutManager(int i, int i2, int i3, float f) {
        this.f15460B = i;
        this.f15461C = i2;
        this.f15462D = i3;
        this.f15463E = f;
    }

    /* renamed from: d */
    private final void m17020d(C1079p pVar) {
        int i;
        int i2;
        C1079p pVar2 = pVar;
        if (mo5293j() != 0) {
            int i3 = this.f15464s;
            int i4 = this.f15468w;
            int i5 = i3 + i4;
            int i6 = this.f15471z;
            float f = (float) i5;
            float f2 = (((float) i6) % f) / f;
            int b = C12973l.m33890b(((int) ((float) Math.floor((double) (((float) i6) / ((float) (i3 + i4)))))) + 1, mo5293j() - 1);
            int b2 = C12973l.m33890b((this.f15467v + b) - 2, mo5293j() - 1);
            int b3 = C12973l.m33890b(this.f15462D + b2, mo5293j() - 1);
            int a = C12973l.m33885a(b - this.f15462D, 0);
            if (mo5278e() > 0 && (m17023l(0) > b3 || m17023l(mo5278e() - 1) < a)) {
                mo5261b(pVar);
            }
            if (mo5278e() != 0) {
                int e = mo5278e() - 1;
                while (e >= 0) {
                    View c = mo5265c(e);
                    if (c != null) {
                        C12932j.m33815a((Object) c, "getChildAt(index)!!");
                        int l = mo5298l(c);
                        LayoutParams layoutParams = c.getLayoutParams();
                        if (layoutParams != null) {
                            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                            if (layoutParams2.mo5323c() || layoutParams2.mo5322b() || layoutParams2.mo5324d() || l < a || l > b3) {
                                mo5259b(c, pVar2);
                            }
                            e--;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                        }
                    } else {
                        C12932j.m33814a();
                        throw null;
                    }
                }
                int i7 = b3 - a;
                if (i7 >= 0) {
                    int i8 = 0;
                    while (true) {
                        int i9 = a + i8;
                        if (i8 >= mo5278e()) {
                            m17019a(this, pVar, i9, 0, 4, null);
                        } else if (m17023l(i8) != i9) {
                            m17018a(pVar2, i9, i8);
                        }
                        if (i8 == i7) {
                            break;
                        }
                        i8++;
                    }
                }
            } else if (a <= b3) {
                int i10 = a;
                while (true) {
                    int i11 = i10;
                    m17019a(this, pVar, i10, 0, 4, null);
                    if (i11 == b3) {
                        break;
                    }
                    i10 = i11 + 1;
                }
            }
            int e2 = mo5278e();
            int i12 = 0;
            while (i12 < e2) {
                View c2 = mo5265c(i12);
                if (c2 != null) {
                    C12932j.m33815a((Object) c2, "getChildAt(i)!!");
                    int l2 = mo5298l(c2);
                    if (l2 < b) {
                        float f3 = ((((float) (b - l2)) - 1.0f) + f2) / ((float) this.f15462D);
                        float f4 = this.f15463E * f3;
                        float f5 = ((float) this.f15464s) * f4;
                        int i13 = this.f15461C;
                        i2 = (int) ((((float) i13) - (((float) i13) * f3)) - (f5 - (f3 * f5)));
                        float f6 = 1.0f - f4;
                        c2.setScaleX(f6);
                        c2.setScaleY(f6);
                        c2.setZ((float) i12);
                        i = e2;
                    } else if (l2 > b2) {
                        float f7 = (((float) (l2 - b2)) - f2) / ((float) this.f15462D);
                        float f8 = this.f15463E * f7;
                        float f9 = ((float) this.f15464s) * f8;
                        int t = mo5309t() - mo5306q();
                        int i14 = this.f15461C;
                        i = e2;
                        int i15 = (int) (((float) ((t - i14) - this.f15464s)) + (((float) i14) * f7) + (f9 - (f7 * f9)));
                        float f10 = 1.0f - f8;
                        c2.setScaleX(f10);
                        c2.setScaleY(f10);
                        c2.setZ(((float) this.f15462D) - ((float) ((l2 - 1) - b2)));
                        i2 = i15;
                    } else {
                        i = e2;
                        int i16 = this.f15461C + ((l2 - b) * i5);
                        if (b == a) {
                            i2 = i16;
                        } else {
                            i2 = (int) (((float) (i16 + i5)) - (f * f2));
                        }
                        c2.setScaleX(1.0f);
                        c2.setScaleY(1.0f);
                        c2.setZ(((float) this.f15462D) + 1.0f);
                    }
                    mo5257b(c2, mo5305p() + i2, mo5308s(), mo5305p() + i2 + this.f15464s, this.f15465t + mo5308s());
                    i12++;
                    e2 = i;
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            }
        }
    }

    /* renamed from: k */
    private final int m17022k(int i) {
        return C12973l.m33890b(C12973l.m33885a(i * (this.f15464s + this.f15468w), 0), this.f15470y);
    }

    /* renamed from: l */
    private final int m17023l(int i) {
        View c = mo5265c(i);
        if (c != null) {
            return mo5298l(c);
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: A */
    public Parcelable mo4971A() {
        SavedState savedState = new SavedState(null, 1, null);
        float f = (float) (this.f15464s + this.f15468w);
        savedState.mo14013a(f > ((float) 0) ? ((float) this.f15471z) / f : 0.0f);
        return savedState;
    }

    /* renamed from: G */
    public final View mo14008G() {
        int j = mo14011j(this.f15471z);
        if (j != -1) {
            int i = 0;
            int e = mo5278e();
            while (i < e) {
                View c = mo5265c(i);
                if (c != null) {
                    C12932j.m33815a((Object) c, "getChildAt(i)!!");
                    if (mo5298l(c) == j) {
                        return c;
                    }
                    i++;
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            }
        }
        return null;
    }

    /* renamed from: H */
    public final int mo14009H() {
        return this.f15471z;
    }

    /* renamed from: a */
    public void mo5234a(C1069g<?> gVar, C1069g<?> gVar2) {
        this.f15471z = 0;
        mo5217B();
    }

    /* renamed from: b */
    public int mo4945b(C1082s sVar) {
        C12932j.m33818b(sVar, "state");
        return this.f15471z;
    }

    /* renamed from: c */
    public RecyclerView.LayoutParams mo4948c() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public PointF computeScrollVectorForPosition(int i) {
        return new PointF((float) mo14010i(i), 0.0f);
    }

    /* renamed from: e */
    public void mo4952e(C1079p pVar, C1082s sVar) {
        int i;
        C12932j.m33818b(pVar, "recycler");
        C12932j.m33818b(sVar, "state");
        if (mo5293j() == 0) {
            mo5235a(pVar);
            this.f15471z = 0;
            return;
        }
        m17021e(pVar);
        this.f15466u = ((mo5309t() - mo5305p()) - mo5306q()) - (this.f15461C * 2);
        float f = (float) this.f15466u;
        int i2 = this.f15460B;
        this.f15467v = C12973l.m33890b((int) ((float) Math.floor((double) ((((float) i2) + f) / ((float) (this.f15464s + i2))))), mo5293j());
        int i3 = this.f15467v;
        if (i3 < 2) {
            i = 0;
        } else {
            i = (int) ((f - ((float) (this.f15464s * i3))) / ((float) (i3 - 1)));
        }
        this.f15468w = i;
        this.f15469x = ((this.f15464s + this.f15468w) * mo5293j()) - this.f15468w;
        this.f15470y = C12973l.m33885a((int) (((float) this.f15469x) - f), 0);
        SavedState savedState = this.f15459A;
        if (savedState != null) {
            this.f15471z = (int) (savedState.mo14012a() * ((float) (this.f15464s + this.f15468w)));
            this.f15459A = null;
        }
        int i4 = this.f15471z;
        int i5 = this.f15470y;
        if (i4 > i5) {
            this.f15471z = i5;
        }
        m17020d(pVar);
    }

    /* renamed from: h */
    public void mo5006h(int i) {
        this.f15471z = m17022k(i);
        mo5217B();
    }

    /* renamed from: i */
    public final int mo14010i(int i) {
        return C12973l.m33890b(m17022k(i) - this.f15471z, this.f15470y);
    }

    /* renamed from: j */
    public final int mo14011j(int i) {
        if (mo5293j() == 0) {
            return -1;
        }
        return (int) ((float) Math.rint((double) (((float) C12973l.m33890b(C12973l.m33885a(i, 0), this.f15470y)) / ((float) (this.f15464s + this.f15468w)))));
    }

    /* renamed from: x */
    public boolean mo5009x() {
        return true;
    }

    /* renamed from: c */
    public int mo4947c(C1082s sVar) {
        C12932j.m33818b(sVar, "state");
        return this.f15470y;
    }

    /* renamed from: a */
    public boolean mo4994a() {
        return this.f15470y > 0;
    }

    /* renamed from: a */
    public int mo4984a(C1082s sVar) {
        C12932j.m33818b(sVar, "state");
        return this.f15464s;
    }

    /* renamed from: a */
    public int mo4929a(int i, C1079p pVar, C1082s sVar) {
        C12932j.m33818b(pVar, "recycler");
        C12932j.m33818b(sVar, "state");
        int i2 = this.f15471z;
        int i3 = i2 + i;
        if (i3 < 0) {
            i = -i2;
        } else {
            int i4 = this.f15470y;
            if (i3 > i4) {
                i = i4 - i2;
            }
        }
        this.f15471z += i;
        m17020d(pVar);
        return i;
    }

    /* renamed from: a */
    public void mo4992a(RecyclerView recyclerView, C1082s sVar, int i) {
        C12932j.m33818b(recyclerView, "recyclerView");
        C12932j.m33818b(sVar, "state");
        C6160b bVar = new C6160b(recyclerView, this);
        bVar.setTargetPosition(i);
        mo5260b((SmoothScroller) bVar);
    }

    /* renamed from: a */
    public void mo4989a(Parcelable parcelable) {
        this.f15459A = (SavedState) parcelable;
    }

    /* renamed from: a */
    static /* synthetic */ void m17019a(HorizontalStackLayoutManager horizontalStackLayoutManager, C1079p pVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        horizontalStackLayoutManager.m17018a(pVar, i, i2);
    }

    /* renamed from: a */
    private final void m17018a(C1079p pVar, int i, int i2) {
        View d = pVar.mo5470d(i);
        C12932j.m33815a((Object) d, "recycler.getViewForPosition(pos)");
        mo5256b(d, i2);
        mo5225a(d, 0, 0);
    }

    /* renamed from: e */
    private final void m17021e(C1079p pVar) {
        View d = pVar.mo5470d(0);
        C12932j.m33815a((Object) d, "recycler.getViewForPosition(0)");
        mo5255b(d);
        mo5225a(d, 0, 0);
        this.f15464s = mo5290h(d);
        this.f15465t = mo5286g(d);
        mo5230a(d, pVar);
    }
}
