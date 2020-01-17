package com.mapbox.android.gestures;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MoveGestureDetector extends C11295h<OnMoveGestureListener> {

    /* renamed from: z */
    private static final Set<Integer> f29119z = new HashSet();

    /* renamed from: t */
    private PointF f29120t;

    /* renamed from: u */
    private boolean f29121u;

    /* renamed from: v */
    float f29122v;

    /* renamed from: w */
    float f29123w;

    /* renamed from: x */
    private float f29124x;

    /* renamed from: y */
    private final Map<Integer, C11290c> f29125y = new HashMap();

    public interface OnMoveGestureListener {
        boolean onMove(MoveGestureDetector moveGestureDetector, float f, float f2);

        boolean onMoveBegin(MoveGestureDetector moveGestureDetector);

        void onMoveEnd(MoveGestureDetector moveGestureDetector, float f, float f2);
    }

    /* renamed from: com.mapbox.android.gestures.MoveGestureDetector$a */
    public static class C11281a implements OnMoveGestureListener {
    }

    static {
        f29119z.add(Integer.valueOf(13));
    }

    public MoveGestureDetector(Context context, C11288a aVar) {
        super(context, aVar);
    }

    /* renamed from: r */
    private void m28978r() {
        for (Integer intValue : this.f29189k) {
            int intValue2 = intValue.intValue();
            ((C11290c) this.f29125y.get(Integer.valueOf(intValue2))).mo32811a(mo32804a().getX(mo32804a().findPointerIndex(intValue2)), mo32804a().getY(mo32804a().findPointerIndex(intValue2)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32723a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f29125y.clear();
            } else if (actionMasked == 3) {
                this.f29125y.clear();
            } else if (actionMasked != 5) {
                if (actionMasked == 6) {
                    this.f29121u = true;
                    this.f29125y.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
                }
            }
            return super.mo32723a(motionEvent);
        }
        this.f29121u = true;
        this.f29125y.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new C11290c(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
        return super.mo32723a(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo32724d() {
        super.mo32724d();
        m28978r();
        if (mo32827o()) {
            PointF f = mo32821f();
            PointF pointF = this.f29120t;
            this.f29122v = pointF.x - f.x;
            this.f29123w = pointF.y - f.y;
            this.f29120t = f;
            if (!this.f29121u) {
                return ((OnMoveGestureListener) this.f29172g).onMove(this, this.f29122v, this.f29123w);
            }
            this.f29121u = false;
            return ((OnMoveGestureListener) this.f29172g).onMove(this, 0.0f, 0.0f);
        } else if (!mo32722a(13) || !((OnMoveGestureListener) this.f29172g).onMoveBegin(this)) {
            return false;
        } else {
            mo32825k();
            this.f29120t = mo32821f();
            this.f29121u = false;
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo32725h() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo32726j() {
        super.mo32726j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo32727l() {
        super.mo32727l();
        ((OnMoveGestureListener) this.f29172g).onMoveEnd(this, this.f29196r, this.f29197s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Set<Integer> mo32728p() {
        return f29119z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public boolean mo32729q() {
        for (C11290c cVar : this.f29125y.values()) {
            if (Math.abs(cVar.mo32810a()) < this.f29124x) {
                if (Math.abs(cVar.mo32812b()) >= this.f29124x) {
                }
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32722a(int i) {
        return super.mo32722a(i) && mo32729q();
    }
}
