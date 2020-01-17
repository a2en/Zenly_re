package zendesk.commonui;

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

public class AlmostRealProgressBar extends ProgressBar {

    /* renamed from: e */
    private C13544a f35080e;

    /* renamed from: f */
    private C13544a f35081f;

    /* renamed from: g */
    private List<Step> f35082g;

    /* renamed from: h */
    private Runnable f35083h;

    static class State extends BaseSavedState {
        public static final Creator<State> CREATOR = new C13542a();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final int f35084e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final List<Step> f35085f;

        /* renamed from: zendesk.commonui.AlmostRealProgressBar$State$a */
        static class C13542a implements Creator<State> {
            C13542a() {
            }

            public State createFromParcel(Parcel parcel) {
                return new State(parcel, null);
            }

            public State[] newArray(int i) {
                return new State[i];
            }
        }

        /* synthetic */ State(Parcel parcel, C13550a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f35084e);
            parcel.writeTypedList(this.f35085f);
        }

        public State(Parcelable parcelable, int i, List<Step> list) {
            super(parcelable);
            this.f35084e = i;
            this.f35085f = list;
        }

        private State(Parcel parcel) {
            super(parcel);
            this.f35084e = parcel.readInt();
            this.f35085f = new ArrayList();
            parcel.readTypedList(this.f35085f, Step.CREATOR);
        }
    }

    static class Step implements Parcelable, Comparable<Step> {
        public static final Creator<Step> CREATOR = new C13543a();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final int f35086e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final long f35087f;

        /* renamed from: zendesk.commonui.AlmostRealProgressBar$Step$a */
        static class C13543a implements Creator<Step> {
            C13543a() {
            }

            public Step createFromParcel(Parcel parcel) {
                return new Step(parcel);
            }

            public Step[] newArray(int i) {
                return new Step[i];
            }
        }

        Step(int i, long j) {
            this.f35086e = i;
            this.f35087f = j;
        }

        /* renamed from: a */
        public int compareTo(Step step) {
            return this.f35086e - step.f35086e;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f35086e);
            parcel.writeLong(this.f35087f);
        }

        Step(Parcel parcel) {
            this.f35086e = parcel.readInt();
            this.f35087f = parcel.readLong();
        }
    }

    /* renamed from: zendesk.commonui.AlmostRealProgressBar$a */
    private static class C13544a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final Animator f35088a;

        /* renamed from: b */
        private boolean f35089b = false;

        /* renamed from: c */
        private boolean f35090c = false;

        C13544a(Animator animator) {
            this.f35088a = animator;
            this.f35088a.addListener(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Animator mo38926a() {
            return this.f35088a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo38927b() {
            return this.f35090c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo38928c() {
            return this.f35089b;
        }

        public void onAnimationCancel(Animator animator) {
            this.f35089b = false;
            this.f35090c = true;
        }

        public void onAnimationEnd(Animator animator) {
            this.f35089b = false;
            this.f35090c = true;
        }

        public void onAnimationRepeat(Animator animator) {
            this.f35089b = true;
            this.f35090c = false;
        }

        public void onAnimationStart(Animator animator) {
            this.f35089b = true;
            this.f35090c = false;
        }
    }

    static {
        Collections.singletonList(new Step(60, 4000));
        Arrays.asList(new Step[]{new Step(60, 4000), new Step(90, 15000)});
    }

    public AlmostRealProgressBar(Context context) {
        super(context);
        new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    private void m35860a(List<Step> list, int i) {
        if (this.f35080e == null) {
            long j = 0;
            C13544a aVar = this.f35081f;
            if (aVar != null && aVar.mo38928c() && !this.f35081f.mo38927b()) {
                j = this.f35081f.mo38926a().getDuration();
            }
            this.f35081f = null;
            this.f35080e = m35859a(list, i, j);
            this.f35080e.mo38926a().start();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            m35861a(state);
            parcelable = state.getSuperState();
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        if (this.f35080e != null && this.f35083h == null) {
            return new State(super.onSaveInstanceState(), getProgress(), this.f35082g);
        }
        setProgress(0);
        return super.onSaveInstanceState();
    }

    public AlmostRealProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Handler(Looper.getMainLooper());
    }

    public AlmostRealProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    private C13544a m35859a(List<Step> list, int i, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Step step : list) {
            Animator a = m35857a(i, step.f35086e, step.f35087f);
            int b = step.f35086e;
            arrayList.add(a);
            i = b;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(arrayList);
        animatorSet.setStartDelay(j);
        return new C13544a(animatorSet);
    }

    /* renamed from: a */
    private void m35861a(State state) {
        if (state.f35084e > 0) {
            ArrayList arrayList = new ArrayList(state.f35085f);
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (Step step : state.f35085f) {
                if (state.f35084e < step.f35086e) {
                    arrayList2.add(step);
                } else {
                    i = step.f35086e;
                }
            }
            if (C12010a.m31639b((Collection<Type>) arrayList2)) {
                arrayList2.add(0, m35858a(state.f35084e, i, (Step) arrayList2.remove(0)));
            }
            m35860a(arrayList2, state.f35084e);
            this.f35082g = arrayList;
            return;
        }
        setProgress(0);
    }

    /* renamed from: a */
    private Step m35858a(int i, int i2, Step step) {
        float f = (float) (i - i2);
        return new Step(step.f35086e, (long) (((float) step.f35087f) * (1.0f - (f / ((float) (step.f35086e - i2))))));
    }

    /* renamed from: a */
    private Animator m35857a(int i, int i2, long j) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "progress", new int[]{i, i2});
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(j);
        return ofInt;
    }
}
