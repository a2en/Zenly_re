package app.zenly.locator.p143s.p146j;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import app.zenly.locator.core.util.C3238u;
import java.util.ArrayList;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.s.j.a */
public final class C5430a {

    /* renamed from: a */
    public static final C5430a f13983a = new C5430a();

    /* renamed from: app.zenly.locator.s.j.a$a */
    public static final class C5431a implements OnLayoutChangeListener {

        /* renamed from: e */
        final /* synthetic */ float f13984e;

        /* renamed from: f */
        final /* synthetic */ float f13985f;

        C5431a(float f, float f2) {
            this.f13984e = f;
            this.f13985f = f2;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C12932j.m33818b(view, "v");
            view.removeOnLayoutChangeListener(this);
            view.setPivotX(this.f13984e * ((float) view.getWidth()));
            view.setPivotY(this.f13985f * ((float) view.getHeight()));
        }
    }

    private C5430a() {
    }

    /* renamed from: a */
    public final AnimatorSet mo13003a(View... viewArr) {
        View[] viewArr2 = viewArr;
        C12932j.m33818b(viewArr2, "views");
        float a = C3238u.m10269a(10.0f, 15.0f);
        float a2 = C3238u.m10269a(0.75f, 0.85f);
        long a3 = C3238u.m10272a(500, 700);
        long a4 = C3238u.m10272a(500, 700);
        float a5 = C3238u.m10269a(0.5f, 0.5f);
        float a6 = C3238u.m10269a(0.5f, 0.5f);
        ArrayList arrayList = new ArrayList();
        int length = viewArr2.length;
        int i = 0;
        while (i < length) {
            View view = viewArr2[i];
            int i2 = i;
            int i3 = length;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(f13983a.m15441a(view, a, a2, a3, a4, a5, a6));
            i = i2 + 1;
            arrayList = arrayList2;
            length = i3;
            viewArr2 = viewArr;
        }
        ArrayList arrayList3 = arrayList;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList3);
        return animatorSet;
    }

    /* renamed from: a */
    private final AnimatorSet m15441a(View view, float f, float f2, long j, long j2, float f3, float f4) {
        view.addOnLayoutChangeListener(new C5431a(f3, f4));
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ROTATION, new float[]{view.getRotation() - f, view.getRotation() + f});
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(j);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{f2, 1.0f});
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setDuration(j2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{f2, 1.0f});
        ofFloat3.setRepeatMode(2);
        ofFloat3.setRepeatCount(-1);
        ofFloat3.setDuration(j2);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        return animatorSet;
    }
}
