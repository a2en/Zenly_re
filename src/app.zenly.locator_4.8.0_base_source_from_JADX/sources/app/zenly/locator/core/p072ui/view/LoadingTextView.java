package app.zenly.locator.core.p072ui.view;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.C0554e;
import app.zenly.locator.R;
import kotlin.jvm.internal.C12932j;

@SuppressLint({"CustomViewStyleable"})
/* renamed from: app.zenly.locator.core.ui.view.LoadingTextView */
public final class LoadingTextView extends AppCompatTextView {

    /* renamed from: e */
    private final Drawable[] f8647e;

    /* renamed from: f */
    private final Drawable[] f8648f;

    /* renamed from: g */
    private final ObjectAnimator f8649g;

    public LoadingTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LoadingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ LoadingTextView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo9417a() {
        Drawable[] drawableArr = this.f8648f;
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawableArr[0], drawableArr[1], drawableArr[2], drawableArr[3]);
        this.f8649g.start();
    }

    /* renamed from: b */
    public final void mo9418b() {
        Drawable[] drawableArr = this.f8647e;
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawableArr[0], drawableArr[1], drawableArr[2], drawableArr[3]);
        this.f8649g.cancel();
    }

    public LoadingTextView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        C12932j.m33815a((Object) compoundDrawablesRelative, "compoundDrawablesRelative");
        this.f8647e = compoundDrawablesRelative;
        Drawable b = C0554e.m2609b(getResources(), R.drawable.rotate_spinner, null);
        if (b != null) {
            C12932j.m33815a((Object) b, "ResourcesCompat.getDrawa…e.rotate_spinner, null)!!");
            this.f8648f = (Drawable[]) this.f8647e.clone();
            this.f8648f[0] = b;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(b, "level", new int[]{0, 10000});
            ofInt.setDuration(1000);
            ofInt.setRepeatCount(-1);
            C12932j.m33815a((Object) ofInt, "ObjectAnimator.ofInt(sta…imator.INFINITE\n        }");
            this.f8649g = ofInt;
            return;
        }
        C12932j.m33814a();
        throw null;
    }
}
