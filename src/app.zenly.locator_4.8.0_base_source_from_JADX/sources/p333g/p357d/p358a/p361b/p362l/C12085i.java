package p333g.p357d.p358a.p361b.p362l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: g.d.a.b.l.i */
public class C12085i {

    /* renamed from: a */
    private long f31474a = 0;

    /* renamed from: b */
    private long f31475b = 300;

    /* renamed from: c */
    private TimeInterpolator f31476c = null;

    /* renamed from: d */
    private int f31477d = 0;

    /* renamed from: e */
    private int f31478e = 1;

    public C12085i(long j, long j2) {
        this.f31474a = j;
        this.f31475b = j2;
    }

    /* renamed from: a */
    public void mo35802a(Animator animator) {
        animator.setStartDelay(mo35801a());
        animator.setDuration(mo35803b());
        animator.setInterpolator(mo35804c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo35805d());
            valueAnimator.setRepeatMode(mo35806e());
        }
    }

    /* renamed from: b */
    public long mo35803b() {
        return this.f31475b;
    }

    /* renamed from: c */
    public TimeInterpolator mo35804c() {
        TimeInterpolator timeInterpolator = this.f31476c;
        return timeInterpolator != null ? timeInterpolator : C12077a.f31461b;
    }

    /* renamed from: d */
    public int mo35805d() {
        return this.f31477d;
    }

    /* renamed from: e */
    public int mo35806e() {
        return this.f31478e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12085i.class != obj.getClass()) {
            return false;
        }
        C12085i iVar = (C12085i) obj;
        if (mo35801a() == iVar.mo35801a() && mo35803b() == iVar.mo35803b() && mo35805d() == iVar.mo35805d() && mo35806e() == iVar.mo35806e()) {
            return mo35804c().getClass().equals(iVar.mo35804c().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (mo35801a() ^ (mo35801a() >>> 32))) * 31) + ((int) (mo35803b() ^ (mo35803b() >>> 32)))) * 31) + mo35804c().getClass().hashCode()) * 31) + mo35805d()) * 31) + mo35806e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(C12085i.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(mo35801a());
        sb.append(" duration: ");
        sb.append(mo35803b());
        sb.append(" interpolator: ");
        sb.append(mo35804c().getClass());
        sb.append(" repeatCount: ");
        sb.append(mo35805d());
        sb.append(" repeatMode: ");
        sb.append(mo35806e());
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: b */
    private static TimeInterpolator m31892b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C12077a.f31461b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C12077a.f31462c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            interpolator = C12077a.f31463d;
        }
        return interpolator;
    }

    /* renamed from: a */
    public long mo35801a() {
        return this.f31474a;
    }

    /* renamed from: a */
    static C12085i m31891a(ValueAnimator valueAnimator) {
        C12085i iVar = new C12085i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m31892b(valueAnimator));
        iVar.f31477d = valueAnimator.getRepeatCount();
        iVar.f31478e = valueAnimator.getRepeatMode();
        return iVar;
    }

    public C12085i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f31474a = j;
        this.f31475b = j2;
        this.f31476c = timeInterpolator;
    }
}
