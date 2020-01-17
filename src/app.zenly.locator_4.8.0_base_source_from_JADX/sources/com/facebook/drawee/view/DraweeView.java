package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.facebook.common.internal.C9532i;
import com.facebook.common.internal.C9532i.C9534b;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.view.C9624a.C9625a;
import com.facebook.imagepipeline.systrace.FrescoSystrace;

public class DraweeView<DH extends DraweeHierarchy> extends ImageView {

    /* renamed from: j */
    private static boolean f25073j = false;

    /* renamed from: e */
    private final C9625a f25074e = new C9625a();

    /* renamed from: f */
    private float f25075f = 0.0f;

    /* renamed from: g */
    private C9626b<DH> f25076g;

    /* renamed from: h */
    private boolean f25077h = false;

    /* renamed from: i */
    private boolean f25078i = false;

    public DraweeView(Context context) {
        super(context);
        m23631a(context);
    }

    /* renamed from: a */
    private void m23631a(Context context) {
        try {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("DraweeView#init");
            }
            if (!this.f25077h) {
                boolean z = true;
                this.f25077h = true;
                this.f25076g = C9626b.m23645a(null, context);
                if (VERSION.SDK_INT >= 21) {
                    ColorStateList imageTintList = getImageTintList();
                    if (imageTintList == null) {
                        if (FrescoSystrace.m24705c()) {
                            FrescoSystrace.m24702a();
                        }
                        return;
                    }
                    setColorFilter(imageTintList.getDefaultColor());
                }
                if (!f25073j || context.getApplicationInfo().targetSdkVersion < 24) {
                    z = false;
                }
                this.f25078i = z;
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
            }
        } finally {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        }
    }

    /* renamed from: e */
    private void m23632e() {
        if (this.f25078i) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                drawable.setVisible(getVisibility() == 0, false);
            }
        }
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        f25073j = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26043b() {
        this.f25076g.mo26083f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo26044c() {
        mo26042a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo26045d() {
        mo26043b();
    }

    public float getAspectRatio() {
        return this.f25075f;
    }

    public DraweeController getController() {
        return this.f25076g.mo26074a();
    }

    public DH getHierarchy() {
        return this.f25076g.mo26079b();
    }

    public Drawable getTopLevelDrawable() {
        return this.f25076g.mo26080c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m23632e();
        mo26044c();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m23632e();
        mo26045d();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m23632e();
        mo26044c();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C9625a aVar = this.f25074e;
        aVar.f25081a = i;
        aVar.f25082b = i2;
        C9624a.m23643a(aVar, this.f25075f, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        C9625a aVar2 = this.f25074e;
        super.onMeasure(aVar2.f25081a, aVar2.f25082b);
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m23632e();
        mo26045d();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f25076g.mo26078a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m23632e();
    }

    public void setAspectRatio(float f) {
        if (f != this.f25075f) {
            this.f25075f = f;
            requestLayout();
        }
    }

    public void setController(DraweeController draweeController) {
        this.f25076g.mo26076a(draweeController);
        super.setImageDrawable(this.f25076g.mo26080c());
    }

    public void setHierarchy(DH dh) {
        this.f25076g.mo26077a(dh);
        super.setImageDrawable(this.f25076g.mo26080c());
    }

    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        m23631a(getContext());
        this.f25076g.mo26076a((DraweeController) null);
        super.setImageBitmap(bitmap);
    }

    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        m23631a(getContext());
        this.f25076g.mo26076a((DraweeController) null);
        super.setImageDrawable(drawable);
    }

    @Deprecated
    public void setImageResource(int i) {
        m23631a(getContext());
        this.f25076g.mo26076a((DraweeController) null);
        super.setImageResource(i);
    }

    @Deprecated
    public void setImageURI(Uri uri) {
        m23631a(getContext());
        this.f25076g.mo26076a((DraweeController) null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.f25078i = z;
    }

    public String toString() {
        C9534b a = C9532i.m23262a((Object) this);
        C9626b<DH> bVar = this.f25076g;
        a.mo25665a("holder", (Object) bVar != null ? bVar.toString() : "<no holder set>");
        return a.toString();
    }

    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23631a(context);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23631a(context);
    }

    @TargetApi(21)
    public DraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m23631a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26042a() {
        this.f25076g.mo26082e();
    }
}
