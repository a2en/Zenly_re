package app.zenly.locator.map.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import app.zenly.android.base.view.C1309a;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p146j.C5432b;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;

public class SplashView extends FrameLayout {

    /* renamed from: e */
    private final Paint f11828e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public View f11829f;

    /* renamed from: g */
    private Bitmap f11830g;

    /* renamed from: h */
    private int f11831h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public SplashViewListener f11832i;

    /* renamed from: j */
    private boolean f11833j;

    /* renamed from: k */
    private boolean f11834k;

    /* renamed from: l */
    private final ObjectAnimator f11835l;

    /* renamed from: m */
    private final AnimatorListener f11836m;

    public interface SplashViewListener {
        void onSplashAnimationEnd();

        void onSplashViewReady();
    }

    /* renamed from: app.zenly.locator.map.view.SplashView$a */
    class C4381a extends C5432b {
        C4381a() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            SplashView.this.f11829f.animate().cancel();
            SplashView.this.f11832i.onSplashAnimationEnd();
        }
    }

    public SplashView(Context context) {
        this(context, null);
    }

    private int getScreenHeight() {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public boolean isOpaque() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.drawBitmap(this.f11830g, ((float) (getWidth() - this.f11830g.getWidth())) / 2.0f, ((float) (this.f11831h - this.f11830g.getHeight())) / 2.0f, this.f11828e);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11831h = getScreenHeight();
        setPivotX((float) (getWidth() / 2));
        setPivotY((float) ((getHeight() / 2) + ((this.f11831h - getHeight()) / 2)));
        LayoutParams layoutParams = (LayoutParams) this.f11829f.getLayoutParams();
        layoutParams.topMargin = (this.f11831h - i2) / 2;
        this.f11829f.setLayoutParams(layoutParams);
        if (!this.f11833j) {
            this.f11833j = true;
            this.f11832i.onSplashViewReady();
            this.f11835l.start();
        }
    }

    public void setOnSplashViewListener(SplashViewListener splashViewListener) {
        this.f11832i = splashViewListener;
    }

    public SplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo11509a() {
        if (!this.f11834k) {
            this.f11834k = true;
            this.f11835l.pause();
            this.f11829f.animate().alpha(0.0f).setStartDelay(300).setDuration(300);
            float width = (((float) getWidth()) * 12.0f) / ((float) this.f11829f.getWidth());
            animate().setStartDelay(300).setDuration(500).scaleX(width).scaleY(width).setListener(this.f11836m);
        }
    }

    public SplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11828e = new Paint(1);
        this.f11834k = false;
        this.f11836m = new C4381a();
        View.inflate(getContext(), R.layout.map_view_splash, this);
        setClickable(true);
        setWillNotDraw(false);
        setLayerType(2, null);
        setBackgroundColor(C7678c.m18702a(getContext(), (int) R.attr.zenlyColorBackground));
        this.f11828e.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        this.f11830g = BitmapFactory.decodeResource(getResources(), 2131231787);
        this.f11829f = findViewById(R.id.logo);
        this.f11835l = ObjectAnimator.ofFloat(this, C1309a.f4895a, new float[]{1.0f, 1.0f, 1.1f, 1.0f});
        this.f11835l.setInterpolator(C7657c.m18643b());
        this.f11835l.setDuration(600);
        this.f11835l.setRepeatMode(1);
        this.f11835l.setRepeatCount(-1);
    }
}
