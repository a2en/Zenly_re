package app.zenly.locator.core.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.locator.core.widget.CompositeAdapter.AdapterTypeProvider;

public class SingleAdapter<T extends C1085v> extends C1069g<T> implements AdapterTypeProvider {

    /* renamed from: e */
    private final Creator<T> f9103e;

    /* renamed from: f */
    private final Binder<T> f9104f;

    /* renamed from: g */
    private long f9105g;

    /* renamed from: h */
    private boolean f9106h = true;

    public interface Binder<T extends C1085v> {
        void bindViewHolder(T t);
    }

    public interface Creator<T extends C1085v> {
        T createViewHolder(ViewGroup viewGroup);
    }

    public interface Delegate<T extends C1085v> extends Creator<T>, Binder<T> {
    }

    public SingleAdapter(Delegate<T> delegate) {
        this.f9103e = delegate;
        this.f9104f = delegate;
        this.f9105g = -1;
    }

    /* renamed from: a */
    public void mo9717a(boolean z) {
        if (this.f9106h != z) {
            this.f9106h = z;
            notifyDataSetChanged();
        }
    }

    public String getAdapterType() {
        return this.f9103e.getClass().toString();
    }

    public int getItemCount() {
        return this.f9106h ? 1 : 0;
    }

    public long getItemId(int i) {
        return this.f9105g;
    }

    public void onBindViewHolder(T t, int i) {
        Binder<T> binder = this.f9104f;
        if (binder != null) {
            binder.bindViewHolder(t);
        }
    }

    public T onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f9103e.createViewHolder(viewGroup);
    }

    public SingleAdapter(Creator<T> creator, Binder<T> binder) {
        this.f9103e = creator;
        this.f9104f = binder;
        this.f9105g = -1;
    }
}
