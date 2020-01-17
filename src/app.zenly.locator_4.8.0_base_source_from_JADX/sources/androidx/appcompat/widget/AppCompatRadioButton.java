package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundButton;
import p214e.p215a.C7521a;
import p214e.p215a.p216k.p217a.C7531a;

public class AppCompatRadioButton extends RadioButton implements TintableCompoundButton, TintableBackgroundView {

    /* renamed from: e */
    private final C0248d f868e;

    /* renamed from: f */
    private final C0244c f869f;

    /* renamed from: g */
    private final C0259k f870g;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7521a.radioButtonStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0244c cVar = this.f869f;
        if (cVar != null) {
            cVar.mo1866a();
        }
        C0259k kVar = this.f870g;
        if (kVar != null) {
            kVar.mo1921a();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0248d dVar = this.f868e;
        return dVar != null ? dVar.mo1883a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0244c cVar = this.f869f;
        if (cVar != null) {
            return cVar.mo1872b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0244c cVar = this.f869f;
        if (cVar != null) {
            return cVar.mo1874c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0248d dVar = this.f868e;
        if (dVar != null) {
            return dVar.mo1888b();
        }
        return null;
    }

    public Mode getSupportButtonTintMode() {
        C0248d dVar = this.f868e;
        if (dVar != null) {
            return dVar.mo1889c();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0244c cVar = this.f869f;
        if (cVar != null) {
            cVar.mo1870a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0244c cVar = this.f869f;
        if (cVar != null) {
            cVar.mo1867a(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0248d dVar = this.f868e;
        if (dVar != null) {
            dVar.mo1890d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0244c cVar = this.f869f;
        if (cVar != null) {
            cVar.mo1873b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0244c cVar = this.f869f;
        if (cVar != null) {
            cVar.mo1869a(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0248d dVar = this.f868e;
        if (dVar != null) {
            dVar.mo1885a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(Mode mode) {
        C0248d dVar = this.f868e;
        if (dVar != null) {
            dVar.mo1886a(mode);
        }
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(C0288w.m1192b(context), attributeSet, i);
        this.f868e = new C0248d(this);
        this.f868e.mo1887a(attributeSet, i);
        this.f869f = new C0244c(this);
        this.f869f.mo1871a(attributeSet, i);
        this.f870g = new C0259k(this);
        this.f870g.mo1928a(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C7531a.m18133c(getContext(), i));
    }
}
