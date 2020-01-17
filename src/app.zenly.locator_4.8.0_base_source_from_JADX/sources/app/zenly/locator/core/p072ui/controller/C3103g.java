package app.zenly.locator.core.p072ui.controller;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.dynamicanimation.animation.C0727c;
import androidx.dynamicanimation.animation.C0730f;
import androidx.dynamicanimation.animation.C0731g;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener;
import app.zenly.android.base.view.C1311b;
import app.zenly.android.feature.base.model.Avatar;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.glide.C2484h;
import app.zenly.locator.core.glide.p067j.C2490c;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.controller.DraggableDialogController.C3094d;
import app.zenly.locator.core.p072ui.controller.DraggableDialogController.ExitListener;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.request.C9224d;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

/* renamed from: app.zenly.locator.core.ui.controller.g */
public final class C3103g extends DraggableDialogController {

    /* renamed from: n0 */
    private ImageView f8559n0;

    /* renamed from: o0 */
    private ImageView f8560o0;

    /* renamed from: p0 */
    private TextView f8561p0;

    /* renamed from: q0 */
    private TextView f8562q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public ScrollView f8563r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public View f8564s0;

    /* renamed from: t0 */
    private TextView f8565t0;

    /* renamed from: u0 */
    private TextView f8566u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public View f8567v0;

    /* renamed from: w0 */
    private TextView f8568w0;

    /* renamed from: x0 */
    private TextView f8569x0;

    /* renamed from: y0 */
    private AnimatorSet f8570y0;

    /* renamed from: app.zenly.locator.core.ui.controller.g$a */
    class C3104a extends AnimatorListenerAdapter {
        C3104a() {
        }

        /* renamed from: a */
        public /* synthetic */ void mo9327a(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            C3103g.this.f8567v0.setVisibility(0);
            C3103g.this.f8567v0.setScaleX(0.0f);
            C3103g.this.f8567v0.setScaleY(0.0f);
            C3103g gVar = C3103g.this;
            gVar.m9710a(gVar.f8567v0, (C0727c<View>) DynamicAnimation.f2981n, (OnAnimationEndListener) null);
            C3103g gVar2 = C3103g.this;
            gVar2.m9710a(gVar2.f8567v0, (C0727c<View>) DynamicAnimation.f2982o, (OnAnimationEndListener) null);
        }

        public void onAnimationEnd(Animator animator) {
            C3103g.this.f8564s0.setVisibility(0);
            C3103g.this.f8564s0.setScaleX(0.0f);
            C3103g.this.f8564s0.setScaleY(0.0f);
            C3103g gVar = C3103g.this;
            gVar.m9710a(gVar.f8564s0, (C0727c<View>) DynamicAnimation.f2981n, (OnAnimationEndListener) new C3100d(this));
            C3103g gVar2 = C3103g.this;
            gVar2.m9710a(gVar2.f8564s0, (C0727c<View>) DynamicAnimation.f2982o, (OnAnimationEndListener) null);
        }
    }

    /* renamed from: app.zenly.locator.core.ui.controller.g$b */
    class C3105b implements OnLayoutChangeListener {
        C3105b() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            if (C3103g.this.f8563r0.getChildAt(0) != null && C3103g.this.f8563r0.getChildAt(0).getHeight() <= C3103g.this.f8563r0.getHeight()) {
                C3103g.this.f8563r0.setOnTouchListener(C3103g.this);
            }
        }
    }

    /* renamed from: app.zenly.locator.core.ui.controller.g$c */
    public static final class C3106c extends C3094d {

        /* renamed from: c */
        final Context f8573c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f8574d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f8575e = 8388627;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f8576f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Avatar f8577g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f8578h = 0;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f8579i = false;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f8580j = 0;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public View f8581k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Drawable f8582l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public String f8583m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public String f8584n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public String f8585o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public String f8586p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public OnClickListener f8587q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public OnClickListener f8588r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public boolean f8589s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public int f8590t = 0;

        public C3106c(Context context) {
            this.f8573c = context;
            LayoutInflater.from(context);
        }

        /* renamed from: a */
        public C3106c mo9300a(ExitListener exitListener) {
            super.mo9300a(exitListener);
            return this;
        }

        /* renamed from: b */
        public C3103g mo9344b() {
            return new C3103g(this, null);
        }

        /* renamed from: c */
        public C3106c mo9346c(String str) {
            this.f8574d = str;
            return this;
        }

        /* renamed from: d */
        public C3106c mo9347d(int i) {
            this.f8590t = i;
            return this;
        }

        /* renamed from: e */
        public C3106c mo9348e(int i) {
            mo9341b(this.f8573c.getString(i));
            return this;
        }

        /* renamed from: f */
        public C3106c mo9349f(int i) {
            mo9346c(this.f8573c.getString(i));
            return this;
        }

        /* renamed from: g */
        public C3106c mo9350g(int i) {
            this.f8575e = i;
            return this;
        }

        /* renamed from: a */
        public C3106c mo9301a(boolean z) {
            super.mo9301a(z);
            return this;
        }

        /* renamed from: b */
        public C3106c mo9339b(int i) {
            this.f8578h = i;
            return this;
        }

        /* renamed from: c */
        public C3106c mo9345c(int i) {
            mo9338a(this.f8573c.getString(i), null, null);
            return this;
        }

        /* renamed from: a */
        public C3106c mo9334a(UserProto$User userProto$User) {
            this.f8577g = C2884f.m9355a(userProto$User);
            return this;
        }

        /* renamed from: b */
        public C3106c mo9343b(boolean z) {
            this.f8579i = z;
            return this;
        }

        /* renamed from: a */
        public C3106c mo9331a(int i) {
            this.f8580j = i;
            return this;
        }

        /* renamed from: b */
        public C3106c mo9340b(int i, Object... objArr) {
            mo9346c(this.f8573c.getString(i, objArr));
            return this;
        }

        /* renamed from: a */
        public C3106c mo9332a(int i, Object... objArr) {
            mo9341b(this.f8573c.getString(i, objArr));
            return this;
        }

        /* renamed from: b */
        public C3106c mo9341b(String str) {
            this.f8576f = str;
            return this;
        }

        /* renamed from: a */
        public C3106c mo9333a(View view) {
            this.f8581k = view;
            return this;
        }

        /* renamed from: b */
        public C3106c mo9342b(String str, String str2, OnClickListener onClickListener) {
            this.f8585o = str;
            this.f8586p = str2;
            this.f8588r = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C3106c mo9335a(String str) {
            mo9338a(str, null, null);
            return this;
        }

        /* renamed from: a */
        public C3106c mo9337a(String str, String str2) {
            mo9338a(str, str2, null);
            return this;
        }

        /* renamed from: a */
        public C3106c mo9338a(String str, String str2, OnClickListener onClickListener) {
            this.f8583m = str;
            this.f8584n = str2;
            this.f8587q = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C3106c mo9336a(String str, OnClickListener onClickListener) {
            mo9342b(str, null, onClickListener);
            return this;
        }

        /* renamed from: a */
        public C3106c mo9330a() {
            this.f8589s = true;
            return this;
        }
    }

    /* synthetic */ C3103g(C3106c cVar, C3104a aVar) {
        this(cVar);
    }

    /* renamed from: E */
    private void m9707E() {
        this.f8561p0.setAlpha(0.0f);
        this.f8563r0.setAlpha(0.0f);
        this.f8564s0.setVisibility(4);
        this.f8567v0.setVisibility(4);
        this.f8570y0 = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f8561p0, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat.setStartDelay(300);
        ofFloat.setDuration(600);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f8563r0, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat2.setStartDelay(600);
        ofFloat2.setDuration(600);
        this.f8570y0.playSequentially(new Animator[]{ofFloat, ofFloat2});
        this.f8570y0.addListener(new C3104a());
        this.f8570y0.start();
    }

    /* renamed from: d */
    private void m9719d(C3106c cVar) {
        String g = cVar.f8574d;
        if (!TextUtils.isEmpty(g)) {
            this.f8561p0.setVisibility(0);
            this.f8561p0.setText(g);
            this.f8561p0.setGravity(cVar.f8575e);
        }
    }

    /* renamed from: e */
    private void m9720e(View view) {
        if (view == null) {
            this.f8563r0.setVisibility(8);
            return;
        }
        this.f8563r0.setVisibility(0);
        this.f8563r0.addOnLayoutChangeListener(new C3105b());
        C1311b.m6278a(view);
        this.f8563r0.addView(view);
    }

    public C3103g() {
    }

    /* renamed from: b */
    private void m9716b(C3106c cVar) {
        if (cVar.f8577g != null) {
            this.f8559n0.setVisibility(0);
            new C2477e(this.f8559n0.getContext()).load(cVar.f8577g).into(this.f8559n0);
        } else if (C7674a.m18692a(cVar.f8578h)) {
            this.f8559n0.setVisibility(0);
            C2484h a = C2476d.m8582a(this.f8559n0.getContext()).m8717a(Integer.valueOf(cVar.f8578h));
            if (cVar.f8579i) {
                a.m8693a(((C9224d) new C9224d().mo8516a((Transformation<Bitmap>) new C2490c<Bitmap>())).mo8525e());
            }
            a.mo24173a(this.f8559n0);
        }
    }

    /* renamed from: c */
    public void mo7066c(View view) {
        AnimatorSet animatorSet = this.f8570y0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f8563r0.removeAllViews();
        super.mo7066c(view);
    }

    private C3103g(C3106c cVar) {
        super(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C3106c cVar = (C3106c) this.f8535h0;
        View a = super.mo9295a((int) R.layout.controller_generic_dialog, layoutInflater, viewGroup);
        a.findViewById(R.id.content_container).setClipToOutline(true);
        this.f8559n0 = (ImageView) a.findViewById(R.id.dialog_header_image);
        this.f8560o0 = (ImageView) a.findViewById(R.id.dialog_background_image);
        this.f8561p0 = (TextView) a.findViewById(R.id.dialog_title);
        this.f8562q0 = (TextView) a.findViewById(R.id.dialog_subtitle);
        this.f8563r0 = (ScrollView) a.findViewById(R.id.dialog_additional_view);
        this.f8564s0 = a.findViewById(R.id.dialog_button_primary);
        this.f8565t0 = (TextView) a.findViewById(R.id.dialog_button_primary_title);
        this.f8566u0 = (TextView) a.findViewById(R.id.dialog_button_primary_subtitle);
        this.f8567v0 = a.findViewById(R.id.dialog_button_tertiary);
        this.f8568w0 = (TextView) a.findViewById(R.id.dialog_button_tertiary_title);
        this.f8569x0 = (TextView) a.findViewById(R.id.dialog_button_tertiary_subtitle);
        viewGroup.setClipChildren(false);
        m9716b(cVar);
        m9711a(cVar);
        m9719d(cVar);
        m9718c(cVar);
        m9720e(cVar.f8581k);
        m9713a(cVar.f8583m, cVar.f8584n, cVar.f8590t, cVar.f8587q);
        m9714a(cVar.f8585o, cVar.f8586p, cVar.f8588r);
        if (cVar.f8582l != null) {
            m9709a(cVar.f8582l);
        }
        if (cVar.f8589s) {
            m9707E();
        }
        return a;
    }

    /* renamed from: c */
    private void m9718c(C3106c cVar) {
        String j = cVar.f8576f;
        if (!TextUtils.isEmpty(j)) {
            this.f8562q0.setVisibility(0);
            this.f8562q0.setText(j);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo9326b(OnClickListener onClickListener, View view) {
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        mo7192B();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9710a(View view, C0727c<View> cVar, OnAnimationEndListener onAnimationEndListener) {
        C0731g gVar = new C0731g();
        gVar.mo3684c(200.0f);
        gVar.mo3680a(0.5f);
        C0730f fVar = new C0730f(view, cVar);
        fVar.mo3672a(gVar);
        fVar.mo3613a(onAnimationEndListener);
        fVar.mo3677g(1.0f);
    }

    /* renamed from: a */
    private void m9711a(C3106c cVar) {
        if (C7674a.m18692a(cVar.f8580j)) {
            this.f8560o0.setImageResource(cVar.f8580j);
            this.f8560o0.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m9713a(String str, String str2, int i, OnClickListener onClickListener) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            this.f8564s0.setVisibility(0);
            this.f8565t0.setText(str);
            this.f8565t0.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
            if (str2 != null) {
                this.f8566u0.setVisibility(0);
                this.f8566u0.setText(str2);
            } else {
                this.f8566u0.setVisibility(8);
            }
            this.f8564s0.setOnClickListener(new C3101e(this, onClickListener));
            return;
        }
        this.f8564s0.setVisibility(8);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9325a(OnClickListener onClickListener, View view) {
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        mo7192B();
    }

    /* renamed from: a */
    private void m9709a(Drawable drawable) {
        this.f8564s0.setBackground(drawable);
    }

    /* renamed from: a */
    private void m9714a(String str, String str2, OnClickListener onClickListener) {
        if (!TextUtils.isEmpty(str)) {
            this.f8567v0.setVisibility(0);
            this.f8568w0.setText(str);
            if (str2 != null) {
                this.f8569x0.setVisibility(0);
                this.f8569x0.setText(str2);
            } else {
                this.f8569x0.setVisibility(8);
            }
            this.f8567v0.setOnClickListener(new C3102f(this, onClickListener));
            return;
        }
        this.f8567v0.setVisibility(8);
    }
}
