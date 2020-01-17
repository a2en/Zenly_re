package p416me.everything.android.p417ui.overscroll;

import android.view.MotionEvent;

/* renamed from: me.everything.android.ui.overscroll.OverScrollBounceEffectDecoratorBase$IDecoratorState */
public interface OverScrollBounceEffectDecoratorBase$IDecoratorState {
    int getStateId();

    void handleEntryTransition(OverScrollBounceEffectDecoratorBase$IDecoratorState overScrollBounceEffectDecoratorBase$IDecoratorState);

    boolean handleMoveTouchEvent(MotionEvent motionEvent);

    boolean handleUpOrCancelTouchEvent(MotionEvent motionEvent);
}
