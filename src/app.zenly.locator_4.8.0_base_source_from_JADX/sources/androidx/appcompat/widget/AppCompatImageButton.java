package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;
import p214e.p215a.C7521a;

public class AppCompatImageButton extends ImageButton implements TintableBackgroundView, TintableImageSourceView {

    /* renamed from: e */
    private final C0244c f859e;

    /* renamed from: f */
    private final C0255g f860f;

    public AppCompatImageButton(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0244c cVar = this.f859e;
        if (cVar != null) {
            cVar.mo1866a();
        }
        C0255g gVar = this.f860f;
        if (gVar != null) {
            gVar.mo1905a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0244c cVar = this.f859e;
        if (cVar != null) {
            return cVar.mo1872b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0244c cVar = this.f859e;
        if (cVar != null) {
            return cVar.mo1874c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0255g gVar = this.f860f;
        if (gVar != null) {
            return gVar.mo1910b();
        }
        return null;
    }

    public Mode getSupportImageTintMode() {
        C0255g gVar = this.f860f;
        if (gVar != null) {
            return gVar.mo1911c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f860f.mo1912d() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0244c cVar = this.f859e;
        if (cVar != null) {
            cVar.mo1870a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0244c cVar = this.f859e;
        if (cVar != null) {
            cVar.mo1867a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0255g gVar = this.f860f;
        if (gVar != null) {
            gVar.mo1905a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0255g gVar = this.f860f;
        if (gVar != null) {
            gVar.mo1905a();
        }
    }

    public void setImageResource(int i) {
        this.f860f.mo1906a(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0255g gVar = this.f860f;
        if (gVar != null) {
            gVar.mo1905a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0244c cVar = this.f859e;
        if (cVar != null) {
            cVar.mo1873b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0244c cVar = this.f859e;
        if (cVar != null) {
            cVar.mo1869a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0255g gVar = this.f860f;
        if (gVar != null) {
            gVar.mo1907a(colorStateList);
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        C0255g gVar = this.f860f;
        if (gVar != null) {
            gVar.mo1908a(mode);
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7521a.imageButtonStyle);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(C0288w.m1192b(context), attributeSet, i);
        this.f859e = new C0244c(this);
        this.f859e.mo1871a(attributeSet, i);
        this.f860f = new C0255g(this);
        this.f860f.mo1909a(attributeSet, i);
    }
}
