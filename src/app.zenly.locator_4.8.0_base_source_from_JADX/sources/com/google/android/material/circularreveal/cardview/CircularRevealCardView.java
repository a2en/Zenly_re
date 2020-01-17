package com.google.android.material.circularreveal.cardview;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;
import com.google.android.material.circularreveal.C10762b;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.circularreveal.CircularRevealWidget.C10759e;

public class CircularRevealCardView extends CardView implements CircularRevealWidget {

    /* renamed from: n */
    private final C10762b f28023n;

    public void buildCircularRevealCache() {
        this.f28023n.mo31029a();
        throw null;
    }

    public void destroyCircularRevealCache() {
        this.f28023n.mo31034b();
        throw null;
    }

    public void draw(Canvas canvas) {
        C10762b bVar = this.f28023n;
        if (bVar == null) {
            super.draw(canvas);
        } else {
            bVar.mo31031a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f28023n.mo31035c();
        throw null;
    }

    public int getCircularRevealScrimColor() {
        this.f28023n.mo31036d();
        throw null;
    }

    public C10759e getRevealInfo() {
        this.f28023n.mo31037e();
        throw null;
    }

    public boolean isOpaque() {
        C10762b bVar = this.f28023n;
        if (bVar == null) {
            return super.isOpaque();
        }
        bVar.mo31038f();
        throw null;
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f28023n.mo31032a(drawable);
        throw null;
    }

    public void setCircularRevealScrimColor(int i) {
        this.f28023n.mo31030a(i);
        throw null;
    }

    public void setRevealInfo(C10759e eVar) {
        this.f28023n.mo31033a(eVar);
        throw null;
    }
}
