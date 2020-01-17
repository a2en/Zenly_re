package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.d */
public class C1097d implements ListUpdateCallback {

    /* renamed from: e */
    final ListUpdateCallback f4210e;

    /* renamed from: f */
    int f4211f = 0;

    /* renamed from: g */
    int f4212g = -1;

    /* renamed from: h */
    int f4213h = -1;

    /* renamed from: i */
    Object f4214i = null;

    public C1097d(ListUpdateCallback listUpdateCallback) {
        this.f4210e = listUpdateCallback;
    }

    /* renamed from: a */
    public void mo5641a() {
        int i = this.f4211f;
        if (i != 0) {
            if (i == 1) {
                this.f4210e.onInserted(this.f4212g, this.f4213h);
            } else if (i == 2) {
                this.f4210e.onRemoved(this.f4212g, this.f4213h);
            } else if (i == 3) {
                this.f4210e.onChanged(this.f4212g, this.f4213h, this.f4214i);
            }
            this.f4214i = null;
            this.f4211f = 0;
        }
    }

    public void onChanged(int i, int i2, Object obj) {
        if (this.f4211f == 3) {
            int i3 = this.f4212g;
            int i4 = this.f4213h;
            if (i <= i3 + i4) {
                int i5 = i + i2;
                if (i5 >= i3 && this.f4214i == obj) {
                    int i6 = i4 + i3;
                    this.f4212g = Math.min(i, i3);
                    this.f4213h = Math.max(i6, i5) - this.f4212g;
                    return;
                }
            }
        }
        mo5641a();
        this.f4212g = i;
        this.f4213h = i2;
        this.f4214i = obj;
        this.f4211f = 3;
    }

    public void onInserted(int i, int i2) {
        if (this.f4211f == 1) {
            int i3 = this.f4212g;
            if (i >= i3) {
                int i4 = this.f4213h;
                if (i <= i3 + i4) {
                    this.f4213h = i4 + i2;
                    this.f4212g = Math.min(i, i3);
                    return;
                }
            }
        }
        mo5641a();
        this.f4212g = i;
        this.f4213h = i2;
        this.f4211f = 1;
    }

    public void onMoved(int i, int i2) {
        mo5641a();
        this.f4210e.onMoved(i, i2);
    }

    public void onRemoved(int i, int i2) {
        if (this.f4211f == 2) {
            int i3 = this.f4212g;
            if (i3 >= i && i3 <= i + i2) {
                this.f4213h += i2;
                this.f4212g = i;
                return;
            }
        }
        mo5641a();
        this.f4212g = i;
        this.f4213h = i2;
        this.f4211f = 2;
    }
}
