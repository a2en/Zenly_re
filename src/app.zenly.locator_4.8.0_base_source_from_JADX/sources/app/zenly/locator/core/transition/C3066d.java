package app.zenly.locator.core.transition;

import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.transition.d */
public final class C3066d {
    static {
        new C3066d();
    }

    private C3066d() {
    }

    /* renamed from: a */
    public static final Transition m9601a() {
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.mo6006a(C3059a.f8465X.mo9250a());
        changeBounds.mo6005a(1000);
        return changeBounds;
    }

    /* renamed from: b */
    public static final TransitionSet m9602b() {
        C3059a aVar = new C3059a();
        Fade fade = new Fade();
        fade.mo6018a(aVar.mo6039h());
        fade.mo6006a(C7657c.m18645c());
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.mo6054a((Transition) fade);
        transitionSet.mo6054a((Transition) aVar);
        transitionSet.mo6005a(1000);
        transitionSet.mo6055b(0);
        C12932j.m33815a((Object) transitionSet, "TransitionSet()\n        …ionSet.ORDERING_TOGETHER)");
        return transitionSet;
    }
}
