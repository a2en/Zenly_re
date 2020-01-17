package com.google.android.material.circularreveal;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.google.android.material.circularreveal.CircularRevealWidget.C10759e;

public class CircularRevealFrameLayout extends FrameLayout implements CircularRevealWidget {

    /* renamed from: e */
    private final C10762b f28013e;

    public void buildCircularRevealCache() {
        this.f28013e.mo31029a();
        throw null;
    }

    public void destroyCircularRevealCache() {
        this.f28013e.mo31034b();
        throw null;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        C10762b bVar = this.f28013e;
        if (bVar == null) {
            super.draw(canvas);
        } else {
            bVar.mo31031a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f28013e.mo31035c();
        throw null;
    }

    public int getCircularRevealScrimColor() {
        this.f28013e.mo31036d();
        throw null;
    }

    public C10759e getRevealInfo() {
        this.f28013e.mo31037e();
        throw null;
    }

    public boolean isOpaque() {
        C10762b bVar = this.f28013e;
        if (bVar == null) {
            return super.isOpaque();
        }
        bVar.mo31038f();
        throw null;
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f28013e.mo31032a(drawable);
        throw null;
    }

    public void setCircularRevealScrimColor(int i) {
        this.f28013e.mo31030a(i);
        throw null;
    }

    public void setRevealInfo(C10759e eVar) {
        this.f28013e.mo31033a(eVar);
        throw null;
    }
}
