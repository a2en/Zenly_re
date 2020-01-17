package app.zenly.locator.core.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.transition.C1234i;
import androidx.transition.C1239l;
import androidx.transition.C1241n;
import androidx.transition.Slide;
import app.zenly.locator.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.transition.a */
public final class C3059a extends Slide {
    /* access modifiers changed from: private */

    /* renamed from: W */
    public static final TimeInterpolator f8464W = C7657c.m18646c(0.5f);

    /* renamed from: X */
    public static final C3060a f8465X = new C3060a(null);

    /* renamed from: app.zenly.locator.core.transition.a$a */
    public static final class C3060a {
        private C3060a() {
        }

        /* renamed from: a */
        public final TimeInterpolator mo9250a() {
            return C3059a.f8464W;
        }

        public /* synthetic */ C3060a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: a */
    private final float m9591a(boolean z, Context context) {
        float dimension = context.getResources().getDimension(R.dimen.grid_size_250);
        int q = mo6004q();
        if (q != 8388611) {
            if (q != 8388613) {
                return 0.0f;
            }
            if (!z) {
                return dimension;
            }
        } else if (z) {
            return dimension;
        }
        return -dimension;
    }

    /* renamed from: b */
    public void mo6003b(int i) {
        super.mo6003b(i);
        C1234i iVar = new C1234i();
        iVar.mo6092a(1.0f);
        iVar.mo6093a(i);
        mo6018a((C1239l) iVar);
    }

    /* renamed from: a */
    private final float m9590a(Context context) {
        float dimension = context.getResources().getDimension(R.dimen.grid_size_250);
        int q = mo6004q();
        if (q == 48) {
            return -dimension;
        }
        if (q != 80) {
            return 0.0f;
        }
        return dimension;
    }

    /* renamed from: a */
    public Animator mo5998a(ViewGroup viewGroup, View view, C1241n nVar, C1241n nVar2) {
        C12932j.m33818b(viewGroup, "sceneRoot");
        C12932j.m33818b(view, "view");
        if (nVar2 == null) {
            return null;
        }
        Object obj = nVar2.f4645a.get("android:slide:screenPosition");
        if (obj != null) {
            int[] iArr = (int[]) obj;
            float translationX = view.getTranslationX();
            float translationY = view.getTranslationY();
            boolean z = ViewCompat.m2862o(viewGroup) == 1;
            Context context = view.getContext();
            String str = "view.context";
            C12932j.m33815a((Object) context, str);
            float a = m9591a(z, context);
            Context context2 = view.getContext();
            C12932j.m33815a((Object) context2, str);
            return C3067e.m9603a(view, nVar2, iArr[0], iArr[1], a, m9590a(context2), translationX, translationY, f8464W);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.IntArray");
    }

    /* renamed from: b */
    public Animator mo5999b(ViewGroup viewGroup, View view, C1241n nVar, C1241n nVar2) {
        C12932j.m33818b(viewGroup, "sceneRoot");
        C12932j.m33818b(view, "view");
        if (nVar == null) {
            return null;
        }
        Object obj = nVar.f4645a.get("android:slide:screenPosition");
        if (obj != null) {
            int[] iArr = (int[]) obj;
            float translationX = view.getTranslationX();
            float translationY = view.getTranslationY();
            boolean z = ViewCompat.m2862o(viewGroup) == 1;
            Context context = view.getContext();
            String str = "view.context";
            C12932j.m33815a((Object) context, str);
            float a = m9591a(z, context);
            Context context2 = view.getContext();
            C12932j.m33815a((Object) context2, str);
            return C3067e.m9603a(view, nVar, iArr[0], iArr[1], translationX, translationY, a, m9590a(context2), C7657c.m18641a());
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.IntArray");
    }
}
