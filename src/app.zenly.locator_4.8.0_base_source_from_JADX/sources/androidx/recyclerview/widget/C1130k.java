package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C1079p;
import androidx.recyclerview.widget.RecyclerView.C1082s;

/* renamed from: androidx.recyclerview.widget.k */
class C1130k {

    /* renamed from: a */
    boolean f4334a = true;

    /* renamed from: b */
    int f4335b;

    /* renamed from: c */
    int f4336c;

    /* renamed from: d */
    int f4337d;

    /* renamed from: e */
    int f4338e;

    /* renamed from: f */
    int f4339f = 0;

    /* renamed from: g */
    int f4340g = 0;

    /* renamed from: h */
    boolean f4341h;

    /* renamed from: i */
    boolean f4342i;

    C1130k() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5728a(C1082s sVar) {
        int i = this.f4336c;
        return i >= 0 && i < sVar.mo5482a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LayoutState{mAvailable=");
        sb.append(this.f4335b);
        sb.append(", mCurrentPosition=");
        sb.append(this.f4336c);
        sb.append(", mItemDirection=");
        sb.append(this.f4337d);
        sb.append(", mLayoutDirection=");
        sb.append(this.f4338e);
        sb.append(", mStartLine=");
        sb.append(this.f4339f);
        sb.append(", mEndLine=");
        sb.append(this.f4340g);
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo5727a(C1079p pVar) {
        View d = pVar.mo5470d(this.f4336c);
        this.f4336c += this.f4337d;
        return d;
    }
}
