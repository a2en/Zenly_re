package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C0680h;
import com.google.android.material.internal.C10793g;
import com.google.android.material.internal.C10794h;
import p214e.p215a.p216k.p217a.C7531a;
import p333g.p357d.p358a.p361b.C12067b;
import p333g.p357d.p358a.p361b.C12075j;
import p333g.p357d.p358a.p361b.C12076k;
import p333g.p357d.p358a.p361b.p364n.C12088a;

public class MaterialButton extends AppCompatButton {

    /* renamed from: g */
    private final C10752b f27962g;

    /* renamed from: h */
    private int f27963h;

    /* renamed from: i */
    private Mode f27964i;

    /* renamed from: j */
    private ColorStateList f27965j;

    /* renamed from: k */
    private Drawable f27966k;

    /* renamed from: l */
    private int f27967l;

    /* renamed from: m */
    private int f27968m;

    /* renamed from: n */
    private int f27969n;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12067b.materialButtonStyle);
    }

    /* renamed from: a */
    private boolean m27450a() {
        return ViewCompat.m2862o(this) == 1;
    }

    /* renamed from: b */
    private boolean m27451b() {
        C10752b bVar = this.f27962g;
        return bVar != null && !bVar.mo30757g();
    }

    /* renamed from: c */
    private void m27452c() {
        Drawable drawable = this.f27966k;
        if (drawable != null) {
            this.f27966k = drawable.mutate();
            C0559a.m2642a(this.f27966k, this.f27965j);
            Mode mode = this.f27964i;
            if (mode != null) {
                C0559a.m2645a(this.f27966k, mode);
            }
            int i = this.f27967l;
            if (i == 0) {
                i = this.f27966k.getIntrinsicWidth();
            }
            int i2 = this.f27967l;
            if (i2 == 0) {
                i2 = this.f27966k.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f27966k;
            int i3 = this.f27968m;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        C0680h.m3180a(this, this.f27966k, null, null, null);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m27451b()) {
            return this.f27962g.mo30741a();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f27966k;
    }

    public int getIconGravity() {
        return this.f27969n;
    }

    public int getIconPadding() {
        return this.f27963h;
    }

    public int getIconSize() {
        return this.f27967l;
    }

    public ColorStateList getIconTint() {
        return this.f27965j;
    }

    public Mode getIconTintMode() {
        return this.f27964i;
    }

    public ColorStateList getRippleColor() {
        if (m27451b()) {
            return this.f27962g.mo30748b();
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (m27451b()) {
            return this.f27962g.mo30751c();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m27451b()) {
            return this.f27962g.mo30754d();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (m27451b()) {
            return this.f27962g.mo30755e();
        }
        return super.getSupportBackgroundTintList();
    }

    public Mode getSupportBackgroundTintMode() {
        if (m27451b()) {
            return this.f27962g.mo30756f();
        }
        return super.getSupportBackgroundTintMode();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (VERSION.SDK_INT < 21 && m27451b()) {
            this.f27962g.mo30746a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (VERSION.SDK_INT == 21) {
            C10752b bVar = this.f27962g;
            if (bVar != null) {
                bVar.mo30743a(i4 - i2, i3 - i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f27966k != null && this.f27969n == 2) {
            int measureText = (int) getPaint().measureText(getText().toString());
            int i3 = this.f27967l;
            if (i3 == 0) {
                i3 = this.f27966k.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - measureText) - ViewCompat.m2865r(this)) - i3) - this.f27963h) - ViewCompat.m2866s(this)) / 2;
            if (m27450a()) {
                measuredWidth = -measuredWidth;
            }
            if (this.f27968m != measuredWidth) {
                this.f27968m = measuredWidth;
                m27452c();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (m27451b()) {
            this.f27962g.mo30742a(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!m27451b()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.i("MaterialButton", "Setting a custom background is not supported.");
            this.f27962g.mo30758h();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C7531a.m18133c(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCornerRadius(int i) {
        if (m27451b()) {
            this.f27962g.mo30749b(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m27451b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f27966k != drawable) {
            this.f27966k = drawable;
            m27452c();
        }
    }

    public void setIconGravity(int i) {
        this.f27969n = i;
    }

    public void setIconPadding(int i) {
        if (this.f27963h != i) {
            this.f27963h = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C7531a.m18133c(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f27967l != i) {
            this.f27967l = i;
            m27452c();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f27965j != colorStateList) {
            this.f27965j = colorStateList;
            m27452c();
        }
    }

    public void setIconTintMode(Mode mode) {
        if (this.f27964i != mode) {
            this.f27964i = mode;
            m27452c();
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C7531a.m18132b(getContext(), i));
    }

    /* access modifiers changed from: 0000 */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m27451b()) {
            this.f27962g.mo30744a(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m27451b()) {
            setRippleColor(C7531a.m18132b(getContext(), i));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m27451b()) {
            this.f27962g.mo30750b(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m27451b()) {
            setStrokeColor(C7531a.m18132b(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m27451b()) {
            this.f27962g.mo30752c(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m27451b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m27451b()) {
            this.f27962g.mo30753c(colorStateList);
        } else if (this.f27962g != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (m27451b()) {
            this.f27962g.mo30747a(mode);
        } else if (this.f27962g != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray c = C10793g.m27778c(context, attributeSet, C12076k.MaterialButton, i, C12075j.Widget_MaterialComponents_Button, new int[0]);
        this.f27963h = c.getDimensionPixelSize(C12076k.MaterialButton_iconPadding, 0);
        this.f27964i = C10794h.m27780a(c.getInt(C12076k.MaterialButton_iconTintMode, -1), Mode.SRC_IN);
        this.f27965j = C12088a.m31903a(getContext(), c, C12076k.MaterialButton_iconTint);
        this.f27966k = C12088a.m31904b(getContext(), c, C12076k.MaterialButton_icon);
        this.f27969n = c.getInteger(C12076k.MaterialButton_iconGravity, 1);
        this.f27967l = c.getDimensionPixelSize(C12076k.MaterialButton_iconSize, 0);
        this.f27962g = new C10752b(this);
        this.f27962g.mo30745a(c);
        c.recycle();
        setCompoundDrawablePadding(this.f27963h);
        m27452c();
    }
}
