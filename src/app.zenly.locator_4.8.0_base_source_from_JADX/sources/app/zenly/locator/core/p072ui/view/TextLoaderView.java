package app.zenly.locator.core.p072ui.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import app.zenly.locator.R;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.ui.view.TextLoaderView */
public final class TextLoaderView extends View {

    /* renamed from: e */
    private final ObjectAnimator f8680e;

    public TextLoaderView(Context context) {
        this(context, null, 0, 6, null);
    }

    public TextLoaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TextLoaderView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            this.f8680e.start();
        } else if (i == 4 || i == 8) {
            this.f8680e.end();
        }
    }

    public TextLoaderView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        setBackgroundResource(R.drawable.smooth_rect_blue_medium_cr250);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.SCALE_X, new float[]{1.0f, 1.2f, 1.0f});
        C12932j.m33815a((Object) ofFloat, "ObjectAnimator.ofFloat(t…s, SCALE_X, 1f, 1.2f, 1f)");
        this.f8680e = ofFloat;
        this.f8680e.setRepeatCount(-1);
        this.f8680e.setRepeatMode(2);
        this.f8680e.setDuration(800);
        this.f8680e.setInterpolator(C7657c.m18649e());
    }
}
