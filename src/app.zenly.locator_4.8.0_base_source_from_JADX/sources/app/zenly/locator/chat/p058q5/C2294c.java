package app.zenly.locator.chat.p058q5;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.chat.view.MediaEditText;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import kotlinx.android.extensions.LayoutContainer;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p263b.p264a.p265d.C7697b;

/* renamed from: app.zenly.locator.chat.q5.c */
public final class C2294c implements LayoutContainer {

    /* renamed from: a */
    private boolean f6954a;

    /* renamed from: b */
    private final ValueAnimator f6955b = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: c */
    private int f6956c;

    /* renamed from: d */
    private final View f6957d;

    /* renamed from: e */
    private HashMap f6958e;

    /* renamed from: app.zenly.locator.chat.q5.c$a */
    static final class C2295a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C2294c f6959a;

        /* renamed from: b */
        final /* synthetic */ int f6960b;

        C2295a(C2294c cVar, int i) {
            this.f6959a = cVar;
            this.f6960b = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C12932j.m33815a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.f6959a.mo8156a(C3891l.compose_unread_count);
                String str = "compose_unread_count";
                C12932j.m33815a((Object) appCompatTextView, str);
                appCompatTextView.setAlpha(floatValue);
                MediaEditText mediaEditText = (MediaEditText) this.f6959a.mo8156a(C3891l.compose_input);
                String str2 = "compose_input";
                C12932j.m33815a((Object) mediaEditText, str2);
                float f = 1.0f - floatValue;
                mediaEditText.setAlpha(f);
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) this.f6959a.mo8156a(C3891l.compose_unread_count);
                C12932j.m33815a((Object) appCompatTextView2, str);
                appCompatTextView2.setTranslationX(((float) (-this.f6960b)) * f);
                MediaEditText mediaEditText2 = (MediaEditText) this.f6959a.mo8156a(C3891l.compose_input);
                C12932j.m33815a((Object) mediaEditText2, str2);
                mediaEditText2.setTranslationX(((float) this.f6960b) * floatValue);
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) this.f6959a.mo8156a(C3891l.compose_unread_count);
                C12932j.m33815a((Object) appCompatTextView3, str);
                appCompatTextView3.setVisibility(floatValue > 0.0f ? 0 : 8);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: app.zenly.locator.chat.q5.c$b */
    public static final class C2296b {
        private C2296b() {
        }

        public /* synthetic */ C2296b(C12928f fVar) {
            this();
        }
    }

    static {
        new C2296b(null);
    }

    public C2294c(View view, OnClickListener onClickListener) {
        C12932j.m33818b(view, "containerView");
        C12932j.m33818b(onClickListener, "onClickListener");
        this.f6957d = view;
        ((AppCompatTextView) mo8156a(C3891l.compose_unread_count)).setOnClickListener(onClickListener);
        int dimensionPixelOffset = getContainerView().getResources().getDimensionPixelOffset(R.dimen.spacing_150);
        ValueAnimator valueAnimator = this.f6955b;
        valueAnimator.setDuration(300);
        valueAnimator.setInterpolator(C7657c.m18643b());
        valueAnimator.addUpdateListener(new C2295a(this, dimensionPixelOffset));
    }

    /* renamed from: a */
    private final void m8197a() {
        if (this.f6954a) {
            this.f6954a = false;
            this.f6955b.reverse();
        }
    }

    /* renamed from: a */
    public View mo8156a(int i) {
        if (this.f6958e == null) {
            this.f6958e = new HashMap();
        }
        View view = (View) this.f6958e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f6958e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b */
    public final void mo8157b(int i) {
        if (this.f6956c != i) {
            this.f6956c = i;
            if (this.f6956c > 0) {
                AppCompatTextView appCompatTextView = (AppCompatTextView) mo8156a(C3891l.compose_unread_count);
                String str = "compose_unread_count";
                C12932j.m33815a((Object) appCompatTextView, str);
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo8156a(C3891l.compose_unread_count);
                C12932j.m33815a((Object) appCompatTextView2, str);
                Resources resources = appCompatTextView2.getResources();
                int i2 = this.f6956c;
                appCompatTextView.setText(resources.getQuantityString(R.plurals.chat_label_newmessages, i2, new Object[]{Integer.valueOf(i2)}));
                m8198b();
            } else {
                m8197a();
            }
        }
    }

    public View getContainerView() {
        return this.f6957d;
    }

    /* renamed from: b */
    private final void m8198b() {
        if (!this.f6954a) {
            this.f6954a = true;
            this.f6955b.start();
            return;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo8156a(C3891l.compose_unread_count);
        appCompatTextView.setScaleX(0.8f);
        appCompatTextView.setScaleY(0.8f);
        C7697b.m18730a(appCompatTextView, 0, null, 3, null);
    }
}
