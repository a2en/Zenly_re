package zendesk.support.request;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import com.zendesk.util.C12010a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ViewAlmostRealProgressBar extends ProgressBar {
    public static final List<Step> DONT_STOP_MOVING = Arrays.asList(new Step[]{new Step(60, 4000), new Step(90, 15000)});
    private StateAwareAnimator finishAnimator;
    private Handler handler = new Handler(Looper.getMainLooper());
    private StateAwareAnimator progressAnimator;
    /* access modifiers changed from: private */
    public Runnable startDebounceRunnable;
    /* access modifiers changed from: private */
    public List<Step> steps;
    /* access modifiers changed from: private */
    public Runnable stopDebounceRunnable;

    static class State extends BaseSavedState {
        public static final Creator<State> CREATOR = new Creator<State>() {
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            public State[] newArray(int i) {
                return new State[i];
            }
        };
        /* access modifiers changed from: private */
        public final int progress;
        /* access modifiers changed from: private */
        public final List<Step> steps;

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.progress);
            parcel.writeTypedList(this.steps);
        }

        public State(Parcelable parcelable, int i, List<Step> list) {
            super(parcelable);
            this.progress = i;
            this.steps = list;
        }

        private State(Parcel parcel) {
            super(parcel);
            this.progress = parcel.readInt();
            this.steps = new ArrayList();
            parcel.readTypedList(this.steps, Step.CREATOR);
        }
    }

    private static class StateAwareAnimator extends AnimatorListenerAdapter {
        private final Animator animatorSet;
        private boolean ended = false;
        private boolean started = false;

        StateAwareAnimator(Animator animator) {
            this.animatorSet = animator;
            this.animatorSet.addListener(this);
        }

        /* access modifiers changed from: 0000 */
        public Animator get() {
            return this.animatorSet;
        }

        /* access modifiers changed from: 0000 */
        public boolean isEnded() {
            return this.ended;
        }

        /* access modifiers changed from: 0000 */
        public boolean isStarted() {
            return this.started;
        }

        public void onAnimationCancel(Animator animator) {
            this.started = false;
            this.ended = true;
        }

        public void onAnimationEnd(Animator animator) {
            this.started = false;
            this.ended = true;
        }

        public void onAnimationRepeat(Animator animator) {
            this.started = true;
            this.ended = false;
        }

        public void onAnimationStart(Animator animator) {
            this.started = true;
            this.ended = false;
        }
    }

    static class Step implements Parcelable, Comparable<Step> {
        public static final Creator<Step> CREATOR = new Creator<Step>() {
            public Step createFromParcel(Parcel parcel) {
                return new Step(parcel);
            }

            public Step[] newArray(int i) {
                return new Step[i];
            }
        };
        /* access modifiers changed from: private */
        public final int target;
        /* access modifiers changed from: private */
        public final long time;

        Step(int i, long j) {
            this.target = i;
            this.time = j;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.target);
            parcel.writeLong(this.time);
        }

        public int compareTo(Step step) {
            return this.target - step.target;
        }

        Step(Parcel parcel) {
            this.target = parcel.readInt();
            this.time = parcel.readLong();
        }
    }

    static {
        Collections.singletonList(new Step(60, 4000));
    }

    public ViewAlmostRealProgressBar(Context context) {
        super(context);
    }

    private Step adjustTime(int i, int i2, Step step) {
        float f = (float) (i - i2);
        return new Step(step.target, (long) (((float) step.time) * (1.0f - (f / ((float) (step.target - i2))))));
    }

    private StateAwareAnimator endAnimation(long j) {
        Animator progressAnimator2 = progressAnimator(getProgress(), 100, j);
        Animator progressBarAlphaAnimator = progressBarAlphaAnimator(1.0f, 0.0f, 100);
        Animator progressAnimator3 = progressAnimator(100, 0, 0);
        Animator progressBarAlphaAnimator2 = progressBarAlphaAnimator(0.0f, 1.0f, 0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(progressAnimator2).before(progressBarAlphaAnimator);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(progressAnimator3).before(progressBarAlphaAnimator2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setDuration(j);
        animatorSet3.play(animatorSet).before(animatorSet2);
        return new StateAwareAnimator(animatorSet3);
    }

    /* access modifiers changed from: private */
    public void finishAnimation(long j) {
        StateAwareAnimator stateAwareAnimator = this.progressAnimator;
        if (stateAwareAnimator != null) {
            stateAwareAnimator.get().cancel();
            this.progressAnimator = null;
            this.finishAnimator = endAnimation(j);
            this.finishAnimator.get().start();
        }
    }

    /* access modifiers changed from: private */
    public void kickOffAnimation(List<Step> list, int i) {
        if (this.progressAnimator == null) {
            long j = 0;
            StateAwareAnimator stateAwareAnimator = this.finishAnimator;
            if (stateAwareAnimator != null && stateAwareAnimator.isStarted() && !this.finishAnimator.isEnded()) {
                j = this.finishAnimator.get().getDuration();
            }
            this.finishAnimator = null;
            this.progressAnimator = startAnimation(list, i, j);
            this.progressAnimator.get().start();
        }
    }

    private Animator progressAnimator(int i, int i2, long j) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "progress", new int[]{i, i2});
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(j);
        return ofInt;
    }

    private Animator progressBarAlphaAnimator(float f, float f2, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{f, f2});
        ofFloat.setDuration(j);
        return ofFloat;
    }

    private void restoreProgress(State state) {
        if (state.progress > 0) {
            ArrayList arrayList = new ArrayList(state.steps);
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (Step step : state.steps) {
                if (state.progress < step.target) {
                    arrayList2.add(step);
                } else {
                    i = step.target;
                }
            }
            if (C12010a.m31639b((Collection<Type>) arrayList2)) {
                arrayList2.add(0, adjustTime(state.progress, i, (Step) arrayList2.remove(0)));
            }
            kickOffAnimation(arrayList2, state.progress);
            this.steps = arrayList;
            return;
        }
        setProgress(0);
    }

    private StateAwareAnimator startAnimation(List<Step> list, int i, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Step step : list) {
            Animator progressAnimator2 = progressAnimator(i, step.target, step.time);
            int access$500 = step.target;
            arrayList.add(progressAnimator2);
            i = access$500;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(arrayList);
        animatorSet.setStartDelay(j);
        return new StateAwareAnimator(animatorSet);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            restoreProgress(state);
            parcelable = state.getSuperState();
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        if (this.progressAnimator != null && this.stopDebounceRunnable == null) {
            return new State(super.onSaveInstanceState(), getProgress(), this.steps);
        }
        setProgress(0);
        return super.onSaveInstanceState();
    }

    public void start(final List<Step> list) {
        Runnable runnable = this.stopDebounceRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
            this.stopDebounceRunnable = null;
        } else if (this.startDebounceRunnable == null) {
            this.startDebounceRunnable = new Runnable() {
                public void run() {
                    ViewAlmostRealProgressBar.this.startDebounceRunnable = null;
                    List a = C12010a.m31632a(list);
                    Collections.sort(a);
                    ViewAlmostRealProgressBar.this.steps = a;
                    ViewAlmostRealProgressBar viewAlmostRealProgressBar = ViewAlmostRealProgressBar.this;
                    viewAlmostRealProgressBar.kickOffAnimation(viewAlmostRealProgressBar.steps, 0);
                }
            };
            this.handler.postDelayed(this.startDebounceRunnable, 100);
        }
    }

    public void stop(final long j) {
        Runnable runnable = this.startDebounceRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
            this.startDebounceRunnable = null;
        } else if (this.stopDebounceRunnable == null) {
            this.stopDebounceRunnable = new Runnable() {
                public void run() {
                    ViewAlmostRealProgressBar.this.stopDebounceRunnable = null;
                    ViewAlmostRealProgressBar.this.finishAnimation(j);
                }
            };
            this.handler.postDelayed(this.stopDebounceRunnable, 200);
        }
    }

    public ViewAlmostRealProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ViewAlmostRealProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
