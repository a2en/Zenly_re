package app.zenly.android.base.widget.p007c.p008a;

import androidx.constraintlayout.motion.widget.C0364q.C0366b;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.base.widget.c.a.a */
public class C1319a implements TransitionListener {
    public boolean allowsTransition(C0366b bVar) {
        C12932j.m33818b(bVar, "transition");
        return true;
    }

    public void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f) {
        C12932j.m33818b(motionLayout, "motionLayout");
    }

    public void onTransitionStarted(MotionLayout motionLayout, int i, int i2) {
        C12932j.m33818b(motionLayout, "motionLayout");
    }

    public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean z, float f) {
        C12932j.m33818b(motionLayout, "motionLayout");
    }
}
