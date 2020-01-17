package app.zenly.locator.core.p072ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import app.zenly.android.base.view.C1311b;
import app.zenly.locator.core.p072ui.view.particles.C3160b;
import app.zenly.locator.core.p072ui.view.particles.C3178g;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation;
import app.zenly.locator.core.p072ui.view.particles.ParticlePathAnimation;
import app.zenly.locator.core.p072ui.view.particles.ParticlePathAnimation.OnAnimationListener;
import app.zenly.locator.core.p072ui.view.particles.ParticleView;
import app.zenly.locator.core.p072ui.view.particles.ParticlesGroupEmojisAnimation;
import app.zenly.locator.core.p072ui.view.particles.ParticlesGroupEmojisAnimation.OnNewParticleStartedCallback;
import app.zenly.locator.core.util.C3200e0;
import java.util.List;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.ui.view.PingParticleView */
public final class PingParticleView extends ParticleView {

    /* renamed from: v */
    private SizeF f8650v;

    /* renamed from: app.zenly.locator.core.ui.view.PingParticleView$a */
    public static class C3129a {

        /* renamed from: a */
        public final String f8651a;

        /* renamed from: b */
        public final Bitmap f8652b;

        /* renamed from: c */
        public final int f8653c;

        public C3129a(String str, Bitmap bitmap, int i) {
            this.f8651a = str;
            this.f8652b = bitmap;
            this.f8653c = i;
        }
    }

    public PingParticleView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9420a() {
        super.mo9420a();
        float a = (float) C3200e0.m10183a(getContext(), 30);
        this.f8650v = new SizeF(a, a);
    }

    public PingParticleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PingParticleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo9421a(Bitmap bitmap, PointF pointF) {
        C3178g gVar = new C3178g(pointF, this.f8650v);
        gVar.mo9489a(bitmap, 1);
        mo9542a((ParticleAnimation) gVar);
        gVar.mo9509q();
    }

    /* renamed from: a */
    public void mo9423a(List<C3129a> list, PointF pointF) {
        C3160b bVar = new C3160b(pointF);
        bVar.mo9565a(this.f8650v.getWidth(), this.f8650v.getHeight());
        bVar.mo9570a(C7657c.m18643b());
        bVar.mo9574b(C7657c.m18642a(1.3f));
        bVar.mo9567a(Math.round(((float) getHeight()) * 0.25f), Math.round(((float) getHeight()) * 0.75f));
        bVar.mo9566a(0.25f, 0.75f, 2.0f, 6.0f);
        bVar.mo9568a(900);
        bVar.mo9572b(0.4f, 0.7f);
        for (C3129a aVar : list) {
            bVar.mo9489a(aVar.f8652b, aVar.f8653c);
        }
        mo9542a((ParticleAnimation) bVar);
        bVar.mo9509q();
    }

    /* renamed from: a */
    public void mo9422a(PointF pointF, PointF pointF2, Bitmap bitmap, float f, OnAnimationListener onAnimationListener) {
        ParticlePathAnimation particlePathAnimation = new ParticlePathAnimation(pointF, pointF2, new SizeF(f, f), onAnimationListener);
        particlePathAnimation.mo9489a(bitmap, 1);
        mo9542a((ParticleAnimation) particlePathAnimation);
        particlePathAnimation.mo9509q();
    }

    /* renamed from: a */
    public ParticlesGroupEmojisAnimation mo9419a(Bitmap bitmap, View view, int i, OnAnimationListener onAnimationListener, OnNewParticleStartedCallback onNewParticleStartedCallback) {
        C1311b.m6281a(view, new Point(view.getMeasuredWidth() / 2, 0), this);
        ParticlesGroupEmojisAnimation particlesGroupEmojisAnimation = new ParticlesGroupEmojisAnimation(view, this, new SizeF(((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f), onAnimationListener, onNewParticleStartedCallback);
        particlesGroupEmojisAnimation.mo9489a(bitmap, i);
        mo9542a((ParticleAnimation) particlesGroupEmojisAnimation);
        particlesGroupEmojisAnimation.mo9509q();
        return particlesGroupEmojisAnimation;
    }
}
