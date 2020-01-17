package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.Path.FillType;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.model.content.C8574n;
import com.airbnb.lottie.model.content.C8579p.C8580a;
import com.airbnb.lottie.model.p284i.C8586a;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.n */
public class C8487n implements C8482j, AnimationListener {

    /* renamed from: a */
    private final Path f21689a = new Path();

    /* renamed from: b */
    private final String f21690b;

    /* renamed from: c */
    private final boolean f21691c;

    /* renamed from: d */
    private final C8515e f21692d;

    /* renamed from: e */
    private final BaseKeyframeAnimation<?, Path> f21693e;

    /* renamed from: f */
    private boolean f21694f;

    /* renamed from: g */
    private C8473b f21695g = new C8473b();

    public C8487n(C8515e eVar, C8586a aVar, C8574n nVar) {
        this.f21690b = nVar.mo23138a();
        this.f21691c = nVar.mo23140c();
        this.f21692d = eVar;
        this.f21693e = nVar.mo23139b().createAnimation();
        aVar.mo23182a(this.f21693e);
        this.f21693e.mo22897a((AnimationListener) this);
    }

    /* renamed from: b */
    private void m19582b() {
        this.f21694f = false;
        this.f21692d.invalidateSelf();
    }

    /* renamed from: a */
    public Path mo22884a() {
        if (this.f21694f) {
            return this.f21689a;
        }
        this.f21689a.reset();
        if (this.f21691c) {
            this.f21694f = true;
            return this.f21689a;
        }
        this.f21689a.set((Path) this.f21693e.mo22903f());
        this.f21689a.setFillType(FillType.EVEN_ODD);
        this.f21695g.mo22882a(this.f21689a);
        this.f21694f = true;
        return this.f21689a;
    }

    public String getName() {
        return this.f21690b;
    }

    public void onValueChanged() {
        m19582b();
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            Content content = (Content) list.get(i);
            if (content instanceof C8489p) {
                C8489p pVar = (C8489p) content;
                if (pVar.mo22892e() == C8580a.SIMULTANEOUSLY) {
                    this.f21695g.mo22883a(pVar);
                    pVar.mo22888a(this);
                }
            }
        }
    }
}
