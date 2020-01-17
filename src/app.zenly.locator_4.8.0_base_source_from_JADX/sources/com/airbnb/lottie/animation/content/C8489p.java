package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.model.content.C8579p;
import com.airbnb.lottie.model.content.C8579p.C8580a;
import com.airbnb.lottie.model.p284i.C8586a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.p */
public class C8489p implements Content, AnimationListener {

    /* renamed from: a */
    private final String f21701a;

    /* renamed from: b */
    private final boolean f21702b;

    /* renamed from: c */
    private final List<AnimationListener> f21703c = new ArrayList();

    /* renamed from: d */
    private final C8580a f21704d;

    /* renamed from: e */
    private final BaseKeyframeAnimation<?, Float> f21705e;

    /* renamed from: f */
    private final BaseKeyframeAnimation<?, Float> f21706f;

    /* renamed from: g */
    private final BaseKeyframeAnimation<?, Float> f21707g;

    public C8489p(C8586a aVar, C8579p pVar) {
        this.f21701a = pVar.mo23155b();
        this.f21702b = pVar.mo23159f();
        this.f21704d = pVar.mo23158e();
        this.f21705e = pVar.mo23157d().createAnimation();
        this.f21706f = pVar.mo23154a().createAnimation();
        this.f21707g = pVar.mo23156c().createAnimation();
        aVar.mo23182a(this.f21705e);
        aVar.mo23182a(this.f21706f);
        aVar.mo23182a(this.f21707g);
        this.f21705e.mo22897a((AnimationListener) this);
        this.f21706f.mo22897a((AnimationListener) this);
        this.f21707g.mo22897a((AnimationListener) this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22888a(AnimationListener animationListener) {
        this.f21703c.add(animationListener);
    }

    /* renamed from: b */
    public BaseKeyframeAnimation<?, Float> mo22889b() {
        return this.f21706f;
    }

    /* renamed from: c */
    public BaseKeyframeAnimation<?, Float> mo22890c() {
        return this.f21707g;
    }

    /* renamed from: d */
    public BaseKeyframeAnimation<?, Float> mo22891d() {
        return this.f21705e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C8580a mo22892e() {
        return this.f21704d;
    }

    /* renamed from: f */
    public boolean mo22893f() {
        return this.f21702b;
    }

    public String getName() {
        return this.f21701a;
    }

    public void onValueChanged() {
        for (int i = 0; i < this.f21703c.size(); i++) {
            ((AnimationListener) this.f21703c.get(i)).onValueChanged();
        }
    }

    public void setContents(List<Content> list, List<Content> list2) {
    }
}
