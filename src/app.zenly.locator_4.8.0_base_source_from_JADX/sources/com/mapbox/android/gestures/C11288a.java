package com.mapbox.android.gestures;

import android.content.Context;
import android.view.MotionEvent;
import com.mapbox.android.gestures.MoveGestureDetector.OnMoveGestureListener;
import com.mapbox.android.gestures.MultiFingerTapGestureDetector.OnMultiFingerTapGestureListener;
import com.mapbox.android.gestures.RotateGestureDetector.OnRotateGestureListener;
import com.mapbox.android.gestures.ShoveGestureDetector.OnShoveGestureListener;
import com.mapbox.android.gestures.StandardGestureDetector.StandardOnGestureListener;
import com.mapbox.android.gestures.StandardScaleGestureDetector.StandardOnScaleGestureListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: com.mapbox.android.gestures.a */
public class C11288a {

    /* renamed from: a */
    private final List<Set<Integer>> f29157a;

    /* renamed from: b */
    private final List<C11289b> f29158b;

    /* renamed from: c */
    private final StandardGestureDetector f29159c;

    /* renamed from: d */
    private final StandardScaleGestureDetector f29160d;

    /* renamed from: e */
    private final RotateGestureDetector f29161e;

    /* renamed from: f */
    private final ShoveGestureDetector f29162f;

    /* renamed from: g */
    private final MultiFingerTapGestureDetector f29163g;

    /* renamed from: h */
    private final MoveGestureDetector f29164h;

    /* renamed from: i */
    private final SidewaysShoveGestureDetector f29165i;

    public C11288a(Context context) {
        this(context, true);
    }

    /* renamed from: g */
    private void m29037g() {
        for (C11289b bVar : this.f29158b) {
            boolean z = bVar instanceof MultiFingerTapGestureDetector;
            if (z) {
                ((C11292e) bVar).mo32819b(C11296i.mapbox_defaultMutliFingerSpanThreshold);
            }
            if (bVar instanceof StandardScaleGestureDetector) {
                ((StandardScaleGestureDetector) bVar).mo32777c(C11296i.mapbox_defaultScaleSpanSinceStartThreshold);
            }
            if (bVar instanceof ShoveGestureDetector) {
                ShoveGestureDetector shoveGestureDetector = (ShoveGestureDetector) bVar;
                shoveGestureDetector.mo32746c(C11296i.mapbox_defaultShovePixelThreshold);
                shoveGestureDetector.mo32744b(20.0f);
            }
            if (bVar instanceof SidewaysShoveGestureDetector) {
                SidewaysShoveGestureDetector sidewaysShoveGestureDetector = (SidewaysShoveGestureDetector) bVar;
                sidewaysShoveGestureDetector.mo32755c(C11296i.mapbox_defaultShovePixelThreshold);
                sidewaysShoveGestureDetector.mo32753b(20.0f);
            }
            if (z) {
                MultiFingerTapGestureDetector multiFingerTapGestureDetector = (MultiFingerTapGestureDetector) bVar;
                multiFingerTapGestureDetector.mo32736c(C11296i.mapbox_defaultMultiTapMovementThreshold);
                multiFingerTapGestureDetector.mo32733a(150);
            }
            if (bVar instanceof RotateGestureDetector) {
                ((RotateGestureDetector) bVar).mo32739b(15.3f);
            }
        }
    }

    /* renamed from: a */
    public boolean mo32798a(MotionEvent motionEvent) {
        boolean z = false;
        for (C11289b b : this.f29158b) {
            if (b.mo32808b(motionEvent)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public MoveGestureDetector mo32799b() {
        return this.f29164h;
    }

    /* renamed from: c */
    public List<Set<Integer>> mo32800c() {
        return this.f29157a;
    }

    /* renamed from: d */
    public RotateGestureDetector mo32801d() {
        return this.f29161e;
    }

    /* renamed from: e */
    public ShoveGestureDetector mo32802e() {
        return this.f29162f;
    }

    /* renamed from: f */
    public StandardScaleGestureDetector mo32803f() {
        return this.f29160d;
    }

    public C11288a(Context context, boolean z) {
        this(context, new ArrayList(), z);
    }

    public C11288a(Context context, List<Set<Integer>> list, boolean z) {
        this.f29157a = new ArrayList();
        this.f29158b = new ArrayList();
        this.f29157a.addAll(list);
        this.f29161e = new RotateGestureDetector(context, this);
        this.f29160d = new StandardScaleGestureDetector(context, this);
        this.f29162f = new ShoveGestureDetector(context, this);
        this.f29165i = new SidewaysShoveGestureDetector(context, this);
        this.f29163g = new MultiFingerTapGestureDetector(context, this);
        this.f29164h = new MoveGestureDetector(context, this);
        this.f29159c = new StandardGestureDetector(context, this);
        this.f29158b.add(this.f29161e);
        this.f29158b.add(this.f29160d);
        this.f29158b.add(this.f29162f);
        this.f29158b.add(this.f29165i);
        this.f29158b.add(this.f29163g);
        this.f29158b.add(this.f29164h);
        this.f29158b.add(this.f29159c);
        if (z) {
            m29037g();
        }
    }

    /* renamed from: a */
    public void mo32794a(StandardOnGestureListener standardOnGestureListener) {
        this.f29159c.mo32805a(standardOnGestureListener);
    }

    /* renamed from: a */
    public void mo32795a(StandardOnScaleGestureListener standardOnScaleGestureListener) {
        this.f29160d.mo32805a(standardOnScaleGestureListener);
    }

    /* renamed from: a */
    public void mo32792a(OnRotateGestureListener onRotateGestureListener) {
        this.f29161e.mo32805a(onRotateGestureListener);
    }

    /* renamed from: a */
    public void mo32793a(OnShoveGestureListener onShoveGestureListener) {
        this.f29162f.mo32805a(onShoveGestureListener);
    }

    /* renamed from: a */
    public void mo32791a(OnMultiFingerTapGestureListener onMultiFingerTapGestureListener) {
        this.f29163g.mo32805a(onMultiFingerTapGestureListener);
    }

    /* renamed from: a */
    public void mo32790a(OnMoveGestureListener onMoveGestureListener) {
        this.f29164h.mo32805a(onMoveGestureListener);
    }

    /* renamed from: a */
    public List<C11289b> mo32789a() {
        return this.f29158b;
    }

    @SafeVarargs
    /* renamed from: a */
    public final void mo32797a(Set<Integer>... setArr) {
        mo32796a(Arrays.asList(setArr));
    }

    /* renamed from: a */
    public void mo32796a(List<Set<Integer>> list) {
        this.f29157a.clear();
        this.f29157a.addAll(list);
    }
}
