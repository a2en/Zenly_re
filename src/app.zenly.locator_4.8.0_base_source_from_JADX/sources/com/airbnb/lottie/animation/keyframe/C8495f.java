package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import com.airbnb.lottie.model.content.C8563f;
import com.airbnb.lottie.model.content.C8571k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.f */
public class C8495f {

    /* renamed from: a */
    private final List<BaseKeyframeAnimation<C8571k, Path>> f21720a;

    /* renamed from: b */
    private final List<BaseKeyframeAnimation<Integer, Integer>> f21721b;

    /* renamed from: c */
    private final List<C8563f> f21722c;

    public C8495f(List<C8563f> list) {
        this.f21722c = list;
        this.f21720a = new ArrayList(list.size());
        this.f21721b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f21720a.add(((C8563f) list.get(i)).mo23095b().createAnimation());
            this.f21721b.add(((C8563f) list.get(i)).mo23096c().createAnimation());
        }
    }

    /* renamed from: a */
    public List<BaseKeyframeAnimation<C8571k, Path>> mo22910a() {
        return this.f21720a;
    }

    /* renamed from: b */
    public List<C8563f> mo22911b() {
        return this.f21722c;
    }

    /* renamed from: c */
    public List<BaseKeyframeAnimation<Integer, Integer>> mo22912c() {
        return this.f21721b;
    }
}
