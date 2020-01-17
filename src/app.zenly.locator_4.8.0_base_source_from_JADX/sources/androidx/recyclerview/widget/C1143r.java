package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;

/* renamed from: androidx.recyclerview.widget.r */
class C1143r {
    /* renamed from: a */
    static int m5604a(C1082s sVar, C1136o oVar, View view, View view2, LayoutManager layoutManager, boolean z, boolean z2) {
        int i;
        if (layoutManager.mo5278e() == 0 || sVar.mo5482a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(layoutManager.mo5298l(view), layoutManager.mo5298l(view2));
        int max = Math.max(layoutManager.mo5298l(view), layoutManager.mo5298l(view2));
        if (z2) {
            i = Math.max(0, (sVar.mo5482a() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(oVar.mo5746a(view2) - oVar.mo5753d(view))) / ((float) (Math.abs(layoutManager.mo5298l(view) - layoutManager.mo5298l(view2)) + 1)))) + ((float) (oVar.mo5756f() - oVar.mo5753d(view))));
    }

    /* renamed from: b */
    static int m5605b(C1082s sVar, C1136o oVar, View view, View view2, LayoutManager layoutManager, boolean z) {
        if (layoutManager.mo5278e() == 0 || sVar.mo5482a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return sVar.mo5482a();
        }
        return (int) ((((float) (oVar.mo5746a(view2) - oVar.mo5753d(view))) / ((float) (Math.abs(layoutManager.mo5298l(view) - layoutManager.mo5298l(view2)) + 1))) * ((float) sVar.mo5482a()));
    }

    /* renamed from: a */
    static int m5603a(C1082s sVar, C1136o oVar, View view, View view2, LayoutManager layoutManager, boolean z) {
        if (layoutManager.mo5278e() == 0 || sVar.mo5482a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(layoutManager.mo5298l(view) - layoutManager.mo5298l(view2)) + 1;
        }
        return Math.min(oVar.mo5758g(), oVar.mo5746a(view2) - oVar.mo5753d(view));
    }
}
