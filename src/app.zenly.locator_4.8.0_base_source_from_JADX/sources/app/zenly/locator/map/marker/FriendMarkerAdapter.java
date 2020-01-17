package app.zenly.locator.map.marker;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import app.zenly.locator.p143s.p146j.C5432b;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import p250f.p251a.p252a.p253a.p254d.C7657c;

public class FriendMarkerAdapter extends MarkerAdapter<C4167b0, AvatarMarkerView> {

    /* renamed from: h */
    private ValueAnimator f10914h = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: i */
    private final LinkedList<C4167b0> f10915i = new LinkedList<>();

    /* renamed from: j */
    private FriendMarkerAdapterListener f10916j;

    /* renamed from: k */
    private final AnimatorUpdateListener f10917k = new C4230m(this);

    /* renamed from: l */
    private final AnimatorListener f10918l = new C4141a();

    public interface FriendMarkerAdapterListener {
        void onPopupAnimationEnd();
    }

    /* renamed from: app.zenly.locator.map.marker.FriendMarkerAdapter$a */
    class C4141a extends C5432b {
        C4141a() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            if (!z) {
                FriendMarkerAdapter.this.mo10875d();
            }
        }
    }

    public FriendMarkerAdapter() {
        super("FriendMarkerAdapter");
        this.f10914h.setInterpolator(C7657c.m18649e());
        this.f10914h.addUpdateListener(this.f10917k);
        this.f10914h.addListener(this.f10918l);
    }

    /* renamed from: a */
    public void mo10871a(FriendMarkerAdapterListener friendMarkerAdapterListener) {
        this.f10916j = friendMarkerAdapterListener;
    }

    /* renamed from: b */
    public void mo10874b(C4167b0 b0Var) {
        if (this.f10914h != null) {
            this.f10915i.remove(b0Var);
        }
        super.mo10909d(b0Var);
    }

    /* renamed from: d */
    public void mo10875d() {
        ValueAnimator valueAnimator = this.f10914h;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.f10914h.cancel();
        }
        this.f10914h = null;
        Iterator it = this.f10915i.iterator();
        while (it.hasNext()) {
            ((C4167b0) it.next()).mo11021L();
        }
        this.f10915i.clear();
        FriendMarkerAdapterListener friendMarkerAdapterListener = this.f10916j;
        if (friendMarkerAdapterListener != null) {
            friendMarkerAdapterListener.onPopupAnimationEnd();
        }
    }

    /* renamed from: a */
    public void mo10872a(C4167b0 b0Var) {
        if (this.f10914h == null) {
            b0Var.mo11021L();
        } else if (mo10900a(b0Var.mo11116o()) == null) {
            this.f10915i.addLast(b0Var);
        }
        super.mo10904a(b0Var);
    }

    /* renamed from: a */
    public void mo10873a(boolean z) {
        ValueAnimator valueAnimator = this.f10914h;
        if (valueAnimator != null && !valueAnimator.isStarted()) {
            this.f10914h.setDuration(z ? 2000 : 0);
            this.f10914h.start();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo10870a(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float size = (float) mo10901a().size();
        if (size > 0.0f) {
            Collections.sort(this.f10915i, C4233n.f11357e);
            while ((size - ((float) this.f10915i.size())) / size < floatValue) {
                C4167b0 b0Var = (C4167b0) this.f10915i.pollFirst();
                if (b0Var != null) {
                    b0Var.mo11021L();
                }
            }
        }
    }
}
