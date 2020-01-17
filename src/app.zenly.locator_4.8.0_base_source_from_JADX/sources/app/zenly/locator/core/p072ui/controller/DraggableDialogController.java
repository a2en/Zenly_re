package app.zenly.locator.core.p072ui.controller;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Display;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import app.zenly.locator.R;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.p143s.p146j.C5432b;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8815b;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

/* renamed from: app.zenly.locator.core.ui.controller.DraggableDialogController */
public class DraggableDialogController extends ZenlyController implements OnTouchListener {

    /* renamed from: j0 */
    private static int f8513j0 = 250;

    /* renamed from: k0 */
    private static int f8514k0 = 250;

    /* renamed from: l0 */
    private static int f8515l0 = 200;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public static int f8516m0 = 50;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public int f8517P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public int f8518Q;

    /* renamed from: R */
    private float f8519R;

    /* renamed from: S */
    private float f8520S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public float f8521T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public float f8522U;

    /* renamed from: V */
    private int f8523V;

    /* renamed from: W */
    private float f8524W;

    /* renamed from: X */
    private float f8525X;

    /* renamed from: Y */
    private float f8526Y;

    /* renamed from: Z */
    private float f8527Z;

    /* renamed from: a0 */
    private GestureDetector f8528a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public int f8529b0;

    /* renamed from: c0 */
    private int f8530c0;

    /* renamed from: d0 */
    private boolean f8531d0;

    /* renamed from: e0 */
    private boolean f8532e0;

    /* renamed from: f0 */
    private boolean f8533f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public RelativeLayout f8534g0;

    /* renamed from: h0 */
    protected final C3094d f8535h0;

    /* renamed from: i0 */
    private final ExitListener f8536i0;

    /* renamed from: app.zenly.locator.core.ui.controller.DraggableDialogController$ExitListener */
    public interface ExitListener {
        void onExit();
    }

    /* renamed from: app.zenly.locator.core.ui.controller.DraggableDialogController$a */
    class C3091a implements OnLayoutChangeListener {

        /* renamed from: e */
        final /* synthetic */ View f8537e;

        C3091a(View view) {
            this.f8537e = view;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f8537e.removeOnLayoutChangeListener(this);
            DraggableDialogController draggableDialogController = DraggableDialogController.this;
            draggableDialogController.f8517P = draggableDialogController.f8534g0.getHeight();
            DraggableDialogController draggableDialogController2 = DraggableDialogController.this;
            draggableDialogController2.f8518Q = draggableDialogController2.f8534g0.getWidth();
            DraggableDialogController draggableDialogController3 = DraggableDialogController.this;
            draggableDialogController3.f8521T = ((float) draggableDialogController3.f8518Q) / 2.0f;
            DraggableDialogController draggableDialogController4 = DraggableDialogController.this;
            draggableDialogController4.f8522U = ((float) draggableDialogController4.f8517P) / 2.0f;
            DraggableDialogController.this.m9650E();
            C5498a.m15600a((Context) DraggableDialogController.this.mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        }
    }

    /* renamed from: app.zenly.locator.core.ui.controller.DraggableDialogController$b */
    class C3092b extends C5432b {
        C3092b() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            DraggableDialogController.this.m9652G();
        }
    }

    /* renamed from: app.zenly.locator.core.ui.controller.DraggableDialogController$c */
    class C3093c extends C5432b {
        C3093c() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            super.mo7336a(animator, z);
            DraggableDialogController.this.m9652G();
        }
    }

    /* renamed from: app.zenly.locator.core.ui.controller.DraggableDialogController$d */
    public static class C3094d {

        /* renamed from: a */
        boolean f8541a;

        /* renamed from: b */
        ExitListener f8542b;

        /* renamed from: a */
        public C3094d mo9301a(boolean z) {
            this.f8541a = z;
            return this;
        }

        /* renamed from: a */
        public C3094d mo9300a(ExitListener exitListener) {
            this.f8542b = exitListener;
            return this;
        }
    }

    /* renamed from: app.zenly.locator.core.ui.controller.DraggableDialogController$e */
    private class C3095e extends SimpleOnGestureListener {
        private C3095e() {
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!(motionEvent == null || motionEvent2 == null)) {
                float x = motionEvent2.getX() - motionEvent.getX();
                float y = motionEvent2.getY() - motionEvent.getY();
                if ((Math.abs(x) > 2.0f && Math.abs(f) > ((float) (DraggableDialogController.this.f8529b0 * 3))) || (((double) Math.abs(y)) > 0.5d && Math.abs(f2) > ((float) (DraggableDialogController.this.f8529b0 * 3)))) {
                    DraggableDialogController.this.m9668b(DraggableDialogController.f8516m0);
                    return true;
                }
            }
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            DraggableDialogController draggableDialogController = DraggableDialogController.this;
            if (draggableDialogController.f8535h0.f8541a) {
                boolean z = false;
                if (draggableDialogController.f8534g0.getChildCount() > 0) {
                    int i = 0;
                    while (true) {
                        if (i >= DraggableDialogController.this.f8534g0.getChildCount()) {
                            break;
                        } else if (C3200e0.m10185a(DraggableDialogController.this.f8534g0.getChildAt(i), motionEvent)) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z) {
                    DraggableDialogController.this.m9668b(DraggableDialogController.f8516m0);
                }
            }
            return super.onSingleTapUp(motionEvent);
        }

        /* synthetic */ C3095e(DraggableDialogController draggableDialogController, C3091a aVar) {
            this();
        }
    }

    public DraggableDialogController() {
        this(new C3094d());
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m9650E() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f8534g0, View.TRANSLATION_Y, new float[]{this.f8520S, 0.0f}).setDuration((long) f8513j0);
        duration.setInterpolator(C7657c.m18648d(0.5f));
        duration.start();
    }

    /* renamed from: F */
    private float m9651F() {
        return (this.f8520S * 3.0f) / 4.0f;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m9652G() {
        RelativeLayout relativeLayout = this.f8534g0;
        if (relativeLayout != null) {
            relativeLayout.setOnTouchListener(null);
        }
        if (mo23946k().mo24003c() > 0) {
            mo23946k().mo23997a((C8819d) this);
        }
        ExitListener exitListener = this.f8536i0;
        if (exitListener != null) {
            exitListener.onExit();
        }
    }

    /* renamed from: H */
    private float m9653H() {
        return 0.0f;
    }

    /* renamed from: I */
    private boolean m9654I() {
        return this.f8525X + this.f8522U > m9651F();
    }

    /* renamed from: J */
    private boolean m9655J() {
        return this.f8524W + this.f8521T < m9653H();
    }

    /* renamed from: K */
    private boolean m9656K() {
        return this.f8524W + this.f8521T > m9659N();
    }

    /* renamed from: L */
    private boolean m9657L() {
        return this.f8525X + this.f8522U < m9660O();
    }

    /* renamed from: M */
    private void m9658M() {
        if (m9655J()) {
            if (!this.f8531d0) {
                m9664a((long) f8515l0, this.f8534g0.getX() + this.f8524W, this.f8534g0.getY() + this.f8525X);
            }
        } else if (m9656K()) {
            if (!this.f8531d0) {
                m9664a((long) f8515l0, this.f8534g0.getX() + this.f8524W, this.f8534g0.getY() + this.f8525X);
            }
        } else if (m9657L()) {
            if (!this.f8531d0) {
                m9664a((long) f8515l0, this.f8534g0.getX() + this.f8524W, this.f8534g0.getY() + this.f8525X);
            }
        } else if (!m9654I()) {
            ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this.f8534g0, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f}), PropertyValuesHolder.ofFloat(View.ROTATION, new float[]{0.0f})}).setDuration((long) f8514k0);
            duration.setInterpolator(C7657c.m18648d(1.5f));
            duration.start();
            this.f8524W = 0.0f;
            this.f8525X = 0.0f;
            this.f8526Y = 0.0f;
            this.f8527Z = 0.0f;
        } else if (!this.f8531d0) {
            m9664a((long) f8515l0, this.f8534g0.getX() + this.f8524W, this.f8534g0.getY() + this.f8525X);
        }
    }

    /* renamed from: N */
    private float m9659N() {
        return this.f8519R;
    }

    /* renamed from: O */
    private float m9660O() {
        return this.f8520S / 4.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public void mo7192B() {
        m9665a((C5432b) new C3093c());
    }

    /* renamed from: C */
    public /* synthetic */ void mo9294C() {
        this.f8531d0 = false;
    }

    public boolean handleBack() {
        mo7192B();
        return true;
    }

    /* renamed from: j */
    public void mo9296j(Activity activity) {
        C8815b bVar = new C8815b(150);
        C8831g b = ((BaseActivity) activity).mo8413b();
        C8836h a = C8836h.m21058a((C8819d) this);
        a.mo24026b(bVar);
        a.mo24023a((ControllerChangeHandler) bVar);
        b.mo23991a(a);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f8528a0.onTouchEvent(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            int i = 0;
            if (action != 1) {
                if (action == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f8523V);
                    if (findPointerIndex != -1) {
                        float x = motionEvent.getX(findPointerIndex);
                        float f = x - this.f8526Y;
                        float y = motionEvent.getY(findPointerIndex) - this.f8527Z;
                        if (Math.abs(f) > ((float) this.f8530c0) || Math.abs(y) > ((float) this.f8530c0)) {
                            this.f8532e0 = true;
                        }
                        if (!this.f8532e0) {
                            return true;
                        }
                        this.f8524W = this.f8534g0.getTranslationX() + f;
                        this.f8525X = this.f8534g0.getTranslationY() + y;
                        float translationX = (this.f8534g0.getTranslationX() * 40.0f) / this.f8519R;
                        this.f8534g0.setTranslationX(this.f8524W);
                        this.f8534g0.setTranslationY(this.f8525X);
                        this.f8534g0.setRotation(translationX);
                    }
                } else if (action != 3) {
                    if (action != 5 && action == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f8523V) {
                            if (actionIndex == 0) {
                                i = 1;
                            }
                            this.f8526Y = motionEvent.getX(i);
                            this.f8527Z = motionEvent.getY(i);
                            this.f8523V = motionEvent.getPointerId(i);
                        }
                    }
                }
            }
            if (!this.f8532e0) {
                return true;
            }
            this.f8532e0 = false;
            this.f8523V = -1;
            m9658M();
        } else {
            int actionIndex2 = motionEvent.getActionIndex();
            float x2 = motionEvent.getX(actionIndex2);
            float y2 = motionEvent.getY(actionIndex2);
            this.f8523V = motionEvent.getPointerId(actionIndex2);
            this.f8526Y = x2;
            this.f8527Z = y2;
        }
        return true;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        this.f8534g0.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: w */
    public boolean mo7339w() {
        return false;
    }

    DraggableDialogController(C3094d dVar) {
        this.f8523V = -1;
        this.f8531d0 = false;
        this.f8533f0 = false;
        this.f8535h0 = dVar;
        this.f8536i0 = this.f8535h0.f8542b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9668b(int i) {
        if (!this.f8531d0) {
            this.f8531d0 = true;
            float x = this.f8534g0.getX() + this.f8524W;
            float y = this.f8534g0.getY() + this.f8525X;
            new Handler().postDelayed(new C3099c(this), (long) (i + 200));
            m9664a((long) i, x, y);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo9295a(0, layoutInflater, viewGroup);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo9295a(int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_draggable_dialog, viewGroup, false);
        this.f8534g0 = (RelativeLayout) inflate.findViewById(R.id.layout_info);
        if (C7674a.m18692a(i)) {
            layoutInflater.inflate(i, this.f8534g0, true);
        }
        inflate.addOnLayoutChangeListener(new C3091a(inflate));
        Display defaultDisplay = mo23920b().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.f8519R = (float) point.x;
        this.f8520S = (float) point.y;
        this.f8534g0.setOnTouchListener(this);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(viewGroup.getContext());
        this.f8529b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8530c0 = viewConfiguration.getScaledTouchSlop();
        this.f8528a0 = new GestureDetector(viewGroup.getContext(), new C3095e(this, null));
        return inflate;
    }

    /* renamed from: a */
    private void m9665a(C5432b bVar) {
        if (!this.f8533f0) {
            this.f8533f0 = true;
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f8534g0, View.TRANSLATION_Y, new float[]{0.0f, this.f8520S}).setDuration((long) f8513j0);
            duration.setInterpolator(C7657c.m18648d(0.5f));
            duration.addListener(bVar);
            duration.start();
        }
    }

    /* renamed from: a */
    private void m9664a(long j, float f, float f2) {
        this.f8534g0.animate().setDuration(j).setInterpolator(C7657c.m18641a()).x(f).y(f2).setListener(new C3092b());
    }
}
