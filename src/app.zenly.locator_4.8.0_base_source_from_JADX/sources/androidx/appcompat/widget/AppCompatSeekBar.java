package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p214e.p215a.C7521a;

public class AppCompatSeekBar extends SeekBar {

    /* renamed from: e */
    private final C0257i f872e;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7521a.seekBarStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f872e.mo1917b();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f872e.mo1918c();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f872e.mo1915a(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f872e = new C0257i(this);
        this.f872e.mo1914a(attributeSet, i);
    }
}
