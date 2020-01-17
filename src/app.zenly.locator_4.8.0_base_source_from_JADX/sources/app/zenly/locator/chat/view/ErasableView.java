package app.zenly.locator.chat.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import app.zenly.locator.core.util.C3200e0;
import kotlin.jvm.internal.C12932j;
import kotlin.ranges.C12960c;

public final class ErasableView extends FrameLayout {

    /* renamed from: e */
    private final Paint f7138e;

    /* renamed from: f */
    private C2358a f7139f;

    /* renamed from: g */
    private boolean f7140g;

    /* renamed from: h */
    private Float f7141h;

    /* renamed from: i */
    private float f7142i;

    /* renamed from: j */
    private float f7143j;

    /* renamed from: app.zenly.locator.chat.view.ErasableView$a */
    public static final class C2357a {

        /* renamed from: app.zenly.locator.chat.view.ErasableView$a$a */
        private static final class C2358a {

            /* renamed from: a */
            private final Bitmap f7144a;

            /* renamed from: b */
            private final Canvas f7145b;

            /* renamed from: c */
            private final int[] f7146c;

            public C2358a(Bitmap bitmap, Canvas canvas, int[] iArr) {
                C12932j.m33818b(bitmap, "image");
                C12932j.m33818b(canvas, "canvas");
                C12932j.m33818b(iArr, "rowPixels");
                this.f7144a = bitmap;
                this.f7145b = canvas;
                this.f7146c = iArr;
            }

            /* renamed from: a */
            public final Canvas mo8294a() {
                return this.f7145b;
            }

            /* renamed from: b */
            public final Bitmap mo8295b() {
                return this.f7144a;
            }

            /* renamed from: c */
            public final int[] mo8296c() {
                return this.f7146c;
            }
        }

        private C2357a() {
        }

        public /* synthetic */ C2357a(C12928f fVar) {
            this();
        }
    }

    static {
        new C2357a(null);
    }

    public ErasableView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ErasableView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ErasableView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    private final void m8412a(Canvas canvas, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            canvas.drawPoint(x, y, this.f7138e);
            m8411a();
        } else if (action == 1) {
            canvas.drawLine(this.f7142i, this.f7143j, x, y, this.f7138e);
            m8411a();
        } else if (action == 2 && Math.hypot(((double) x) - ((double) this.f7142i), ((double) y) - ((double) this.f7143j)) >= ((double) 4.0f)) {
            canvas.drawLine(this.f7142i, this.f7143j, x, y, this.f7138e);
            m8411a();
        }
    }

    public void draw(Canvas canvas) {
        C12932j.m33818b(canvas, "canvas");
        if (this.f7140g) {
            C2358a aVar = this.f7139f;
            if (aVar == null) {
                Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Config.ARGB_8888);
                C12932j.m33815a((Object) createBitmap, "bitmap");
                C2358a aVar2 = new C2358a(createBitmap, new Canvas(createBitmap), new int[getWidth()]);
                super.draw(aVar2.mo8294a());
                this.f7139f = aVar2;
                aVar = aVar2;
            }
            canvas.drawBitmap(aVar.mo8295b(), 0.0f, 0.0f, new Paint());
            return;
        }
        super.draw(canvas);
    }

    public final float getDiscovery() {
        float f;
        Float f2 = this.f7141h;
        if (f2 != null) {
            return f2.floatValue();
        }
        C2358a aVar = this.f7139f;
        if (aVar != null) {
            int width = aVar.mo8295b().getWidth();
            int height = aVar.mo8295b().getHeight();
            C12960c a = C12973l.m33888a((C12960c) C12973l.m33894d(0, height), 4);
            int first = a.getFirst();
            int last = a.getLast();
            int a2 = a.mo37336a();
            if (a2 < 0 ? first >= last : first <= last) {
                int i = first;
                f = 0.0f;
                while (true) {
                    int i2 = i;
                    aVar.mo8295b().getPixels(aVar.mo8296c(), 0, width, 0, i, width, 1);
                    C12960c a3 = C12973l.m33888a((C12960c) C12973l.m33894d(0, width), 4);
                    int first2 = a3.getFirst();
                    int last2 = a3.getLast();
                    int a4 = a3.mo37336a();
                    if (a4 < 0 ? first2 >= last2 : first2 <= last2) {
                        while (true) {
                            if (Color.alpha(aVar.mo8296c()[first2]) == 0) {
                                f += 1.0f;
                            }
                            if (first2 == last2) {
                                break;
                            }
                            first2 += a4;
                        }
                    }
                    int i3 = i2;
                    if (i3 == last) {
                        break;
                    }
                    i = i3 + a2;
                }
            } else {
                f = 0.0f;
            }
            float pow = (f * ((float) Math.pow((double) ((float) 4), (double) 2))) / ((float) (width * height));
            this.f7141h = Float.valueOf(pow);
            return pow;
        }
        throw new IllegalStateException();
    }

    public final boolean getErasable() {
        return this.f7140g;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C12932j.m33818b(motionEvent, "event");
        C2358a aVar = this.f7139f;
        if (aVar != null) {
            m8412a(aVar.mo8294a(), motionEvent);
        }
        this.f7142i = motionEvent.getX();
        this.f7143j = motionEvent.getY();
        return true;
    }

    public final void setErasable(boolean z) {
        if (this.f7140g != z) {
            this.f7140g = z;
            if (!z) {
                this.f7139f = null;
            }
            setFocusable(z);
            setClickable(z);
            setWillNotDraw(!z);
        }
    }

    public ErasableView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        paint.setStrokeCap(Cap.ROUND);
        paint.setStrokeWidth(C3200e0.m10181a(context, 48.0f));
        this.f7138e = paint;
    }

    /* renamed from: a */
    private final void m8411a() {
        invalidate();
        this.f7141h = null;
    }
}
