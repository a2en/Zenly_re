package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.p289q.C8658h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.b */
public class C8473b {

    /* renamed from: a */
    private List<C8489p> f21588a = new ArrayList();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22883a(C8489p pVar) {
        this.f21588a.add(pVar);
    }

    /* renamed from: a */
    public void mo22882a(Path path) {
        for (int size = this.f21588a.size() - 1; size >= 0; size--) {
            C8658h.m20201a(path, (C8489p) this.f21588a.get(size));
        }
    }
}
