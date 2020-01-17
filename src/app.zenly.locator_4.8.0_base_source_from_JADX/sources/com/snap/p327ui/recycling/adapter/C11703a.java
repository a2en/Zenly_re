package com.snap.p327ui.recycling.adapter;

import android.os.CancellationSignal;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import com.google.common.collect.C10904p;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.AdapterViewType;
import com.snap.p327ui.recycling.factory.C11727c;
import com.snap.p327ui.recycling.factory.C11730d;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;

/* renamed from: com.snap.ui.recycling.adapter.a */
public class C11703a extends C1069g<C11730d> implements ViewModelAdapter {

    /* renamed from: e */
    private final C11727c f30330e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final EventDispatcher f30331f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Seekable<? extends C11722a> f30332g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final SparseArray<CancellationSignal> f30333h;

    /* renamed from: i */
    private final boolean f30334i;

    /* renamed from: com.snap.ui.recycling.adapter.a$a */
    class C11704a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ CancellationSignal f30335e;

        /* renamed from: f */
        final /* synthetic */ C11730d f30336f;

        /* renamed from: g */
        final /* synthetic */ boolean f30337g;

        C11704a(CancellationSignal cancellationSignal, C11730d dVar, boolean z) {
            this.f30335e = cancellationSignal;
            this.f30336f = dVar;
            this.f30337g = z;
        }

        public void run() {
            if (!this.f30335e.isCanceled()) {
                int adapterPosition = this.f30336f.getAdapterPosition();
                C11703a.this.f30333h.remove(adapterPosition);
                if (adapterPosition != -1) {
                    this.f30336f.mo34510a((C11722a) C11703a.this.f30332g.get(adapterPosition), C11703a.this.f30331f, null);
                    if (this.f30337g) {
                        this.f30336f.itemView.setVisibility(0);
                        this.f30336f.itemView.setAlpha(0.0f);
                        this.f30336f.itemView.animate().alpha(1.0f).withLayer().setDuration(100);
                    }
                }
            }
        }
    }

    public C11703a(C11727c cVar, EventDispatcher eventDispatcher) {
        this(cVar, eventDispatcher, false);
    }

    public AdapterViewType getItemAdapterViewType(int i) {
        return ((C11722a) this.f30332g.get(i)).mo10146d();
    }

    public int getItemCount() {
        return this.f30332g.size();
    }

    public long getItemId(int i) {
        return ((C11722a) this.f30332g.get(i)).mo34500c();
    }

    public C11722a getItemViewModel(int i) {
        return (C11722a) this.f30332g.get(i);
    }

    public int getItemViewType(int i) {
        return this.f30330e.mo34540a(((C11722a) this.f30332g.get(i)).mo10146d());
    }

    public C11703a(C11727c cVar, EventDispatcher eventDispatcher, boolean z) {
        this.f30332g = C11751f.m30859a();
        this.f30333h = new SparseArray<>();
        this.f30330e = cVar;
        this.f30331f = eventDispatcher;
        this.f30334i = z;
        setHasStableIds(true);
    }

    /* renamed from: a */
    public void onBindViewHolder(C11730d dVar, int i) {
        if (!this.f30334i || dVar.mo34546b()) {
            dVar.mo34510a((C11722a) this.f30332g.get(i), this.f30331f, null);
            return;
        }
        LayoutParams layoutParams = dVar.itemView.getLayoutParams();
        boolean z = layoutParams.width == -2 || layoutParams.height == -2;
        if (z) {
            dVar.itemView.setVisibility(4);
        }
        CancellationSignal cancellationSignal = new CancellationSignal();
        dVar.itemView.post(new C11704a(cancellationSignal, dVar, z));
        this.f30333h.put(dVar.getAdapterPosition(), cancellationSignal);
    }

    public C11730d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f30330e.mo34542a(viewGroup.getContext(), i, viewGroup);
    }

    /* renamed from: a */
    public void onViewRecycled(C11730d dVar) {
        m30737a(dVar.getAdapterPosition());
        if (dVar.mo34545a() != null) {
            dVar.mo34512d();
        }
    }

    /* renamed from: a */
    private void m30737a(int i) {
        CancellationSignal cancellationSignal = (CancellationSignal) this.f30333h.get(i);
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        this.f30333h.remove(i);
    }

    /* renamed from: a */
    public void mo34459a(Seekable<? extends C11722a> seekable) {
        if (!(seekable instanceof C10904p) || seekable != this.f30332g) {
            Seekable<? extends C11722a> seekable2 = this.f30332g;
            this.f30332g = seekable;
            m30738a(seekable2, seekable);
        }
    }

    /* renamed from: a */
    private void m30738a(Seekable<? extends C11722a> seekable, Seekable<? extends C11722a> seekable2) {
        int size = seekable.size();
        int size2 = seekable2.size();
        int max = Math.max(size, size2);
        int i = 0;
        while (i < max) {
            if (i >= size2) {
                int i2 = size - size2;
                for (int i3 = i; i3 < i + i2; i3++) {
                    m30737a(i3);
                }
                notifyItemRangeRemoved(i, i2);
                return;
            } else if (i >= size) {
                notifyItemRangeInserted(i, size2 - size);
                return;
            } else {
                C11722a aVar = (C11722a) seekable2.get(i);
                C11722a aVar2 = (C11722a) seekable.get(i);
                if (!aVar.mo34499b(aVar2) || !aVar.mo7088a(aVar2)) {
                    m30737a(i);
                    notifyItemChanged(i);
                }
                i++;
            }
        }
    }
}
