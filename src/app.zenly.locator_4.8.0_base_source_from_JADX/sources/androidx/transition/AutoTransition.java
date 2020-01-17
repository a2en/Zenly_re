package androidx.transition;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        m5771r();
    }

    /* renamed from: r */
    private void m5771r() {
        mo6055b(1);
        mo6054a((Transition) new Fade(2));
        mo6054a((Transition) new ChangeBounds());
        mo6054a((Transition) new Fade(1));
    }
}
