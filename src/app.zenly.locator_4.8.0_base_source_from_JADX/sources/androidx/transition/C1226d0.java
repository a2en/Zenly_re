package androidx.transition;

import android.view.View;

/* renamed from: androidx.transition.d0 */
public abstract class C1226d0 extends C1239l {

    /* renamed from: a */
    private static final String[] f4623a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: a */
    public void mo6076a(C1241n nVar) {
        View view = nVar.f4646b;
        Integer num = (Integer) nVar.f4645a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        nVar.f4645a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        nVar.f4645a.put("android:visibilityPropagation:center", iArr);
    }

    /* renamed from: b */
    public int mo6078b(C1241n nVar) {
        if (nVar == null) {
            return 8;
        }
        Integer num = (Integer) nVar.f4645a.get("android:visibilityPropagation:visibility");
        if (num == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: c */
    public int mo6079c(C1241n nVar) {
        return m5947a(nVar, 0);
    }

    /* renamed from: d */
    public int mo6080d(C1241n nVar) {
        return m5947a(nVar, 1);
    }

    /* renamed from: a */
    public String[] mo6077a() {
        return f4623a;
    }

    /* renamed from: a */
    private static int m5947a(C1241n nVar, int i) {
        if (nVar == null) {
            return -1;
        }
        int[] iArr = (int[]) nVar.f4645a.get("android:visibilityPropagation:center");
        if (iArr == null) {
            return -1;
        }
        return iArr[i];
    }
}
