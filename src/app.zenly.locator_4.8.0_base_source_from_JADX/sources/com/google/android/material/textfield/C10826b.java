package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C0680h;
import androidx.legacy.widget.Space;
import java.util.ArrayList;
import java.util.List;
import p333g.p357d.p358a.p361b.C12069d;
import p333g.p357d.p358a.p361b.C12071f;
import p333g.p357d.p358a.p361b.p362l.C12077a;
import p333g.p357d.p358a.p361b.p362l.C12078b;

/* renamed from: com.google.android.material.textfield.b */
final class C10826b {

    /* renamed from: a */
    private final Context f28332a;

    /* renamed from: b */
    private final TextInputLayout f28333b;

    /* renamed from: c */
    private LinearLayout f28334c;

    /* renamed from: d */
    private int f28335d;

    /* renamed from: e */
    private FrameLayout f28336e;

    /* renamed from: f */
    private int f28337f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Animator f28338g;

    /* renamed from: h */
    private final float f28339h = ((float) this.f28332a.getResources().getDimensionPixelSize(C12069d.design_textinput_caption_translate_y));
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f28340i;

    /* renamed from: j */
    private int f28341j;

    /* renamed from: k */
    private CharSequence f28342k;

    /* renamed from: l */
    private boolean f28343l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public TextView f28344m;

    /* renamed from: n */
    private int f28345n;

    /* renamed from: o */
    private CharSequence f28346o;

    /* renamed from: p */
    private boolean f28347p;

    /* renamed from: q */
    private TextView f28348q;

    /* renamed from: r */
    private int f28349r;

    /* renamed from: s */
    private Typeface f28350s;

    /* renamed from: com.google.android.material.textfield.b$a */
    class C10827a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f28351a;

        /* renamed from: b */
        final /* synthetic */ TextView f28352b;

        /* renamed from: c */
        final /* synthetic */ int f28353c;

        /* renamed from: d */
        final /* synthetic */ TextView f28354d;

        C10827a(int i, TextView textView, int i2, TextView textView2) {
            this.f28351a = i;
            this.f28352b = textView;
            this.f28353c = i2;
            this.f28354d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            C10826b.this.f28340i = this.f28351a;
            C10826b.this.f28338g = null;
            TextView textView = this.f28352b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f28353c == 1 && C10826b.this.f28344m != null) {
                    C10826b.this.f28344m.setText(null);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f28354d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C10826b(TextInputLayout textInputLayout) {
        this.f28332a = textInputLayout.getContext();
        this.f28333b = textInputLayout;
    }

    /* renamed from: d */
    private TextView m27909d(int i) {
        if (i == 1) {
            return this.f28344m;
        }
        if (i != 2) {
            return null;
        }
        return this.f28348q;
    }

    /* renamed from: e */
    private boolean m27910e(int i) {
        if (i != 1 || this.f28344m == null || TextUtils.isEmpty(this.f28342k)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m27911m() {
        return (this.f28334c == null || this.f28333b.getEditText() == null) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo31418a(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo31423b(CharSequence charSequence) {
        mo31419b();
        this.f28346o = charSequence;
        this.f28348q.setText(charSequence);
        if (this.f28340i != 2) {
            this.f28341j = 2;
        }
        m27904a(this.f28340i, this.f28341j, m27908a(this.f28348q, charSequence));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo31426c() {
        return m27910e(this.f28341j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public ColorStateList mo31429f() {
        TextView textView = this.f28344m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public CharSequence mo31430g() {
        return this.f28346o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo31431h() {
        TextView textView = this.f28348q;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo31432i() {
        this.f28342k = null;
        mo31419b();
        if (this.f28340i == 1) {
            if (!this.f28347p || TextUtils.isEmpty(this.f28346o)) {
                this.f28341j = 0;
            } else {
                this.f28341j = 2;
            }
        }
        m27904a(this.f28340i, this.f28341j, m27908a(this.f28344m, (CharSequence) null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo31433j() {
        mo31419b();
        if (this.f28340i == 2) {
            this.f28341j = 0;
        }
        m27904a(this.f28340i, this.f28341j, m27908a(this.f28348q, (CharSequence) null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo31434k() {
        return this.f28343l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo31435l() {
        return this.f28347p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo31425c(int i) {
        this.f28349r = i;
        TextView textView = this.f28348q;
        if (textView != null) {
            C0680h.m3189d(textView, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public CharSequence mo31427d() {
        return this.f28342k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo31428e() {
        TextView textView = this.f28344m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31416a(CharSequence charSequence) {
        mo31419b();
        this.f28342k = charSequence;
        this.f28344m.setText(charSequence);
        if (this.f28340i != 1) {
            this.f28341j = 1;
        }
        m27904a(this.f28340i, this.f28341j, m27908a(this.f28344m, charSequence));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo31419b() {
        Animator animator = this.f28338g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo31422b(TextView textView, int i) {
        if (this.f28334c != null) {
            if (mo31418a(i)) {
                FrameLayout frameLayout = this.f28336e;
                if (frameLayout != null) {
                    this.f28337f--;
                    m27905a((ViewGroup) frameLayout, this.f28337f);
                    this.f28336e.removeView(textView);
                    this.f28335d--;
                    m27905a((ViewGroup) this.f28334c, this.f28335d);
                }
            }
            this.f28334c.removeView(textView);
            this.f28335d--;
            m27905a((ViewGroup) this.f28334c, this.f28335d);
        }
    }

    /* renamed from: a */
    private boolean m27908a(TextView textView, CharSequence charSequence) {
        return ViewCompat.m2804D(this.f28333b) && this.f28333b.isEnabled() && (this.f28341j != this.f28340i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: a */
    private void m27904a(int i, int i2, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f28338g = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i3 = i;
            int i4 = i2;
            m27907a(arrayList2, this.f28347p, this.f28348q, 2, i3, i4);
            m27907a(arrayList2, this.f28343l, this.f28344m, 1, i3, i4);
            C12078b.m31873a(animatorSet, arrayList);
            C10827a aVar = new C10827a(i2, m27909d(i), i, m27909d(i2));
            animatorSet.addListener(aVar);
            animatorSet.start();
        } else {
            m27903a(i, i2);
        }
        this.f28333b.mo31338c();
        this.f28333b.mo31336b(z);
        this.f28333b.mo31339d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo31424b(boolean z) {
        if (this.f28347p != z) {
            mo31419b();
            if (z) {
                this.f28348q = new AppCompatTextView(this.f28332a);
                this.f28348q.setId(C12071f.textinput_helper_text);
                Typeface typeface = this.f28350s;
                if (typeface != null) {
                    this.f28348q.setTypeface(typeface);
                }
                this.f28348q.setVisibility(4);
                ViewCompat.m2850f(this.f28348q, 1);
                mo31425c(this.f28349r);
                mo31415a(this.f28348q, 1);
            } else {
                mo31433j();
                mo31422b(this.f28348q, 1);
                this.f28348q = null;
                this.f28333b.mo31338c();
                this.f28333b.mo31339d();
            }
            this.f28347p = z;
        }
    }

    /* renamed from: a */
    private void m27903a(int i, int i2) {
        if (i != i2) {
            if (i2 != 0) {
                TextView d = m27909d(i2);
                if (d != null) {
                    d.setVisibility(0);
                    d.setAlpha(1.0f);
                }
            }
            if (i != 0) {
                TextView d2 = m27909d(i);
                if (d2 != null) {
                    d2.setVisibility(4);
                    if (i == 1) {
                        d2.setText(null);
                    }
                }
            }
            this.f28340i = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo31420b(int i) {
        this.f28345n = i;
        TextView textView = this.f28344m;
        if (textView != null) {
            this.f28333b.mo31332a(textView, i);
        }
    }

    /* renamed from: a */
    private void m27907a(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(m27901a(textView, i3 == i));
                if (i3 == i) {
                    list.add(m27900a(textView));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo31421b(ColorStateList colorStateList) {
        TextView textView = this.f28348q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: a */
    private ObjectAnimator m27901a(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C12077a.f31460a);
        return ofFloat;
    }

    /* renamed from: a */
    private ObjectAnimator m27900a(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f28339h, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C12077a.f31463d);
        return ofFloat;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31412a() {
        if (m27911m()) {
            ViewCompat.m2818a(this.f28334c, ViewCompat.m2866s(this.f28333b.getEditText()), 0, ViewCompat.m2865r(this.f28333b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31415a(TextView textView, int i) {
        if (this.f28334c == null && this.f28336e == null) {
            this.f28334c = new LinearLayout(this.f28332a);
            this.f28334c.setOrientation(0);
            this.f28333b.addView(this.f28334c, -1, -2);
            this.f28336e = new FrameLayout(this.f28332a);
            this.f28334c.addView(this.f28336e, -1, new LayoutParams(-2, -2));
            this.f28334c.addView(new Space(this.f28332a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f28333b.getEditText() != null) {
                mo31412a();
            }
        }
        if (mo31418a(i)) {
            this.f28336e.setVisibility(0);
            this.f28336e.addView(textView);
            this.f28337f++;
        } else {
            this.f28334c.addView(textView, i);
        }
        this.f28334c.setVisibility(0);
        this.f28335d++;
    }

    /* renamed from: a */
    private void m27905a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31417a(boolean z) {
        if (this.f28343l != z) {
            mo31419b();
            if (z) {
                this.f28344m = new AppCompatTextView(this.f28332a);
                this.f28344m.setId(C12071f.textinput_error);
                Typeface typeface = this.f28350s;
                if (typeface != null) {
                    this.f28344m.setTypeface(typeface);
                }
                mo31420b(this.f28345n);
                this.f28344m.setVisibility(4);
                ViewCompat.m2850f(this.f28344m, 1);
                mo31415a(this.f28344m, 0);
            } else {
                mo31432i();
                mo31422b(this.f28344m, 0);
                this.f28344m = null;
                this.f28333b.mo31338c();
                this.f28333b.mo31339d();
            }
            this.f28343l = z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31414a(Typeface typeface) {
        if (typeface != this.f28350s) {
            this.f28350s = typeface;
            m27906a(this.f28344m, typeface);
            m27906a(this.f28348q, typeface);
        }
    }

    /* renamed from: a */
    private void m27906a(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31413a(ColorStateList colorStateList) {
        TextView textView = this.f28344m;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
