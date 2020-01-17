package p333g.p357d.p358a.p361b.p362l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p214e.p228e.C7584g;

/* renamed from: g.d.a.b.l.h */
public class C12084h {

    /* renamed from: a */
    private final C7584g<String, C12085i> f31473a = new C7584g<>();

    /* renamed from: a */
    public C12085i mo35795a(String str) {
        if (mo35797b(str)) {
            return (C12085i) this.f31473a.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public boolean mo35797b(String str) {
        return this.f31473a.get(str) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12084h.class != obj.getClass()) {
            return false;
        }
        return this.f31473a.equals(((C12084h) obj).f31473a);
    }

    public int hashCode() {
        return this.f31473a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(C12084h.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.f31473a);
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo35796a(String str, C12085i iVar) {
        this.f31473a.put(str, iVar);
    }

    /* renamed from: a */
    public long mo35794a() {
        int size = this.f31473a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C12085i iVar = (C12085i) this.f31473a.mo19601d(i);
            j = Math.max(j, iVar.mo35801a() + iVar.mo35803b());
        }
        return j;
    }

    /* renamed from: a */
    public static C12084h m31884a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return m31883a(context, resourceId);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C12084h m31883a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m31885a((List<Animator>) ((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m31885a((List<Animator>) arrayList);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            Log.w("MotionSpec", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    private static C12084h m31885a(List<Animator> list) {
        C12084h hVar = new C12084h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m31886a(hVar, (Animator) list.get(i));
        }
        return hVar;
    }

    /* renamed from: a */
    private static void m31886a(C12084h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.mo35796a(objectAnimator.getPropertyName(), C12085i.m31891a((ValueAnimator) objectAnimator));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Animator must be an ObjectAnimator: ");
        sb.append(animator);
        throw new IllegalArgumentException(sb.toString());
    }
}
