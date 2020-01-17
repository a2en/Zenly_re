package app.zenly.locator.phonesettings.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0657l;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2476d;
import com.bumptech.glide.load.engine.C8978i;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.collections.C12844m;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

public final class WizardView extends ConstraintLayout {

    /* renamed from: A */
    private final ViewGroup f12965A;

    /* renamed from: B */
    private final TextView f12966B;

    /* renamed from: C */
    private HashMap f12967C;

    /* renamed from: z */
    private final AnimatorSet f12968z;

    /* renamed from: app.zenly.locator.phonesettings.view.WizardView$a */
    public static final class C4960a implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AnimatorSet f12969a;

        public C4960a(AnimatorSet animatorSet) {
            this.f12969a = animatorSet;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            this.f12969a.start();
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: app.zenly.locator.phonesettings.view.WizardView$b */
    public static final class C4961b {
        private C4961b() {
        }

        public /* synthetic */ C4961b(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.phonesettings.view.WizardView$c */
    public static final class C4962c {

        /* renamed from: a */
        private final int f12970a;

        /* renamed from: b */
        private final int f12971b;

        /* renamed from: c */
        private final boolean f12972c;

        /* renamed from: d */
        private final boolean f12973d;

        /* renamed from: e */
        private final boolean f12974e;

        public C4962c(int i, int i2, boolean z, boolean z2, boolean z3) {
            this.f12970a = i;
            this.f12971b = i2;
            this.f12972c = z;
            this.f12973d = z2;
            this.f12974e = z3;
        }

        /* renamed from: a */
        public final int mo12167a() {
            return this.f12970a;
        }

        /* renamed from: b */
        public final boolean mo12168b() {
            return this.f12972c;
        }

        /* renamed from: c */
        public final boolean mo12169c() {
            return this.f12974e;
        }

        /* renamed from: d */
        public final int mo12170d() {
            return this.f12971b;
        }

        /* renamed from: e */
        public final boolean mo12171e() {
            return this.f12973d;
        }

        public /* synthetic */ C4962c(int i, int i2, boolean z, boolean z2, boolean z3, int i3, C12928f fVar) {
            if ((i3 & 1) != 0) {
                i = C7674a.f19294a;
            }
            int i4 = i;
            if ((i3 & 2) != 0) {
                i2 = C7674a.f19294a;
            }
            this(i4, i2, z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? true : z3);
        }
    }

    /* renamed from: app.zenly.locator.phonesettings.view.WizardView$d */
    public static final class C4963d implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ SwitchCompat f12975a;

        /* renamed from: b */
        final /* synthetic */ boolean f12976b;

        public C4963d(SwitchCompat switchCompat, boolean z) {
            this.f12975a = switchCompat;
            this.f12976b = z;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
            this.f12975a.setChecked(this.f12976b);
        }
    }

    /* renamed from: app.zenly.locator.phonesettings.view.WizardView$e */
    public static final class C4964e implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ SwitchCompat f12977a;

        /* renamed from: b */
        final /* synthetic */ boolean f12978b;

        public C4964e(SwitchCompat switchCompat, boolean z) {
            this.f12977a = switchCompat;
            this.f12978b = z;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            this.f12977a.setChecked(!this.f12978b);
            this.f12977a.jumpDrawablesToCurrentState();
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    static {
        new C4961b(null);
    }

    public WizardView(Context context) {
        this(context, null, 0, 6, null);
    }

    public WizardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ WizardView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo2248a() {
        View view = (View) C12990j.m33931d(C0657l.m3059a(this.f12965A));
        AnimatorSet animatorSet = this.f12968z;
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(C3891l.item_wizard_switch);
        C12932j.m33815a((Object) switchCompat, "item_wizard_switch");
        animatorSet.play(m14312a(this, switchCompat, false, 2, null));
        this.f12968z.start();
    }

    /* renamed from: b */
    public final void mo2256b() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object next : C0657l.m3059a(this.f12965A)) {
            int i2 = i + 1;
            if (i >= 0) {
                View view = (View) next;
                view.setVisibility(0);
                SwitchCompat switchCompat = (SwitchCompat) view.findViewById(C3891l.item_wizard_switch);
                String str = "view.item_wizard_switch";
                C12932j.m33815a((Object) switchCompat, str);
                switchCompat.setChecked(true);
                SwitchCompat switchCompat2 = (SwitchCompat) view.findViewById(C3891l.item_wizard_switch);
                C12932j.m33815a((Object) switchCompat2, str);
                ValueAnimator a = m14311a(switchCompat2, false);
                a.setStartDelay(((long) i2) * 1000);
                a.setDuration((((long) (this.f12965A.getChildCount() - i)) * 1000) + 1000);
                arrayList.add(a);
                i = i2;
            } else {
                C12844m.m33616c();
                throw null;
            }
        }
        this.f12968z.playTogether(arrayList);
        this.f12968z.start();
    }

    /* renamed from: c */
    public View mo2261c(int i) {
        if (this.f12967C == null) {
            this.f12967C = new HashMap();
        }
        View view = (View) this.f12967C.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f12967C.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final void mo12158c() {
        this.f12968z.cancel();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C12932j.m33818b(motionEvent, "ev");
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C12932j.m33818b(motionEvent, "event");
        return true;
    }

    public final void setDescription(CharSequence charSequence) {
        C12932j.m33818b(charSequence, "text");
        this.f12966B.setText(charSequence);
    }

    public final void setItems(C4962c... cVarArr) {
        C12932j.m33818b(cVarArr, "items");
        this.f12968z.cancel();
        this.f12965A.removeAllViews();
        m14313a(cVarArr);
    }

    public WizardView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new C4960a(animatorSet));
        this.f12968z = animatorSet;
        View.inflate(context, R.layout.view_wizard, this);
        C12932j.m33815a((Object) (ScrollView) mo2261c(C3891l.wizard_scrollview), "wizard_scrollview");
        LinearLayout linearLayout = (LinearLayout) mo2261c(C3891l.wizard_container);
        C12932j.m33815a((Object) linearLayout, "wizard_container");
        this.f12965A = linearLayout;
        TextView textView = (TextView) mo2261c(C3891l.wizard_description);
        C12932j.m33815a((Object) textView, "wizard_description");
        this.f12966B = textView;
    }

    /* renamed from: a */
    static /* synthetic */ ValueAnimator m14312a(WizardView wizardView, SwitchCompat switchCompat, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return wizardView.m14311a(switchCompat, z);
    }

    /* renamed from: a */
    private final ValueAnimator m14311a(SwitchCompat switchCompat, boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(1000);
        ofFloat.setStartDelay(1000);
        ofFloat.addListener(new C4963d(switchCompat, z));
        ofFloat.addListener(new C4964e(switchCompat, z));
        C12932j.m33815a((Object) ofFloat, "ValueAnimator.ofFloat(0f…)\n            }\n        }");
        return ofFloat;
    }

    /* renamed from: a */
    private final void m14313a(C4962c[] cVarArr) {
        for (C4962c cVar : cVarArr) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.list_item_wizard, this.f12965A, false);
            String str = "view";
            if (C7674a.m18692a(cVar.mo12167a())) {
                C12932j.m33815a((Object) inflate, str);
                ImageView imageView = (ImageView) inflate.findViewById(C3891l.item_wizard_icon);
                C12932j.m33815a((Object) imageView, "icon");
                imageView.setVisibility(0);
                C2476d.m8582a(imageView.getContext()).m8717a(Integer.valueOf(cVar.mo12167a())).mo8541d().m8691a(C8978i.f23423a).mo24173a(imageView);
            }
            if (C7674a.m18692a(cVar.mo12170d())) {
                C12932j.m33815a((Object) inflate, str);
                ((TextView) inflate.findViewById(C3891l.item_wizard_text)).setText(cVar.mo12170d());
            }
            C12932j.m33815a((Object) inflate, str);
            TextView textView = (TextView) inflate.findViewById(C3891l.item_wizard_subtext);
            C12932j.m33815a((Object) textView, "view.item_wizard_subtext");
            int i = 8;
            textView.setVisibility(cVar.mo12168b() ? 0 : 8);
            SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(C3891l.item_wizard_switch);
            String str2 = "view.item_wizard_switch";
            C12932j.m33815a((Object) switchCompat, str2);
            if (cVar.mo12169c()) {
                i = 0;
            }
            switchCompat.setVisibility(i);
            SwitchCompat switchCompat2 = (SwitchCompat) inflate.findViewById(C3891l.item_wizard_switch);
            C12932j.m33815a((Object) switchCompat2, str2);
            switchCompat2.setChecked(cVar.mo12171e());
            this.f12965A.addView(inflate);
        }
    }
}
