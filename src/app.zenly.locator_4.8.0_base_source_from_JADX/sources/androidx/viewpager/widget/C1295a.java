package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.viewpager.widget.a */
public abstract class C1295a {

    /* renamed from: a */
    private final DataSetObservable f4864a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f4865b;

    /* renamed from: a */
    public float mo6401a(int i) {
        return 1.0f;
    }

    /* renamed from: a */
    public int mo6402a(Object obj) {
        return -1;
    }

    /* renamed from: a */
    public abstract Object mo4281a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public void mo4282a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Deprecated
    /* renamed from: a */
    public void mo6405a(View view) {
    }

    /* renamed from: a */
    public void mo4284a(ViewGroup viewGroup, int i, Object obj) {
        mo6406a((View) viewGroup, i, obj);
        throw null;
    }

    /* renamed from: a */
    public abstract boolean mo4285a(View view, Object obj);

    /* renamed from: b */
    public Parcelable mo4286b() {
        return null;
    }

    @Deprecated
    /* renamed from: b */
    public void mo6408b(View view) {
    }

    @Deprecated
    /* renamed from: b */
    public void mo6409b(View view, int i, Object obj) {
    }

    /* renamed from: b */
    public void mo4288b(ViewGroup viewGroup) {
        mo6408b((View) viewGroup);
    }

    /* renamed from: c */
    public void mo6410c(DataSetObserver dataSetObserver) {
        this.f4864a.unregisterObserver(dataSetObserver);
    }

    public abstract int getCount();

    /* renamed from: a */
    public void mo4283a(ViewGroup viewGroup) {
        mo6405a((View) viewGroup);
    }

    /* renamed from: b */
    public void mo4289b(ViewGroup viewGroup, int i, Object obj) {
        mo6409b((View) viewGroup, i, obj);
    }

    @Deprecated
    /* renamed from: a */
    public void mo6406a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6407b(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f4865b = dataSetObserver;
        }
    }

    /* renamed from: a */
    public void mo6403a() {
        synchronized (this) {
            if (this.f4865b != null) {
                this.f4865b.onChanged();
            }
        }
        this.f4864a.notifyChanged();
    }

    /* renamed from: a */
    public void mo6404a(DataSetObserver dataSetObserver) {
        this.f4864a.registerObserver(dataSetObserver);
    }
}
