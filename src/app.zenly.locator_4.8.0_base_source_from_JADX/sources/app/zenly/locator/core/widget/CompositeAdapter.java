package app.zenly.locator.core.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1071i;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class CompositeAdapter extends C1069g<C1085v> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<C3248b> f9040a = new ArrayList(3);

    /* renamed from: b */
    private final Map<C1069g, C3248b> f9041b = new HashMap(3);

    /* renamed from: c */
    private final NavigableMap<Integer, C3248b> f9042c = new TreeMap();

    /* renamed from: d */
    private final Map<String, C3250d> f9043d = new HashMap();

    /* renamed from: e */
    private final SparseArray<C3250d> f9044e = new SparseArray<>();

    /* renamed from: f */
    private int f9045f = 0;

    /* renamed from: g */
    private boolean f9046g = false;

    /* renamed from: h */
    private C3251e f9047h = new C3251e(this, 1);

    /* renamed from: i */
    private C1071i f9048i = new C3247a();

    public interface AdapterTypeProvider {
        String getAdapterType();
    }

    /* renamed from: app.zenly.locator.core.widget.CompositeAdapter$a */
    class C3247a extends C1071i {
        C3247a() {
        }

        /* renamed from: a */
        public void mo5419a() {
            CompositeAdapter.this.m10292a();
        }

        /* renamed from: b */
        public void mo5423b(int i, int i2) {
            CompositeAdapter.this.m10292a();
        }

        /* renamed from: c */
        public void mo5424c(int i, int i2) {
            CompositeAdapter.this.m10292a();
        }

        /* renamed from: a */
        public void mo5420a(int i, int i2) {
            CompositeAdapter.this.m10292a();
        }

        /* renamed from: a */
        public void mo5422a(int i, int i2, Object obj) {
            CompositeAdapter.this.m10292a();
        }

        /* renamed from: a */
        public void mo5421a(int i, int i2, int i3) {
            CompositeAdapter.this.m10292a();
        }
    }

    /* renamed from: app.zenly.locator.core.widget.CompositeAdapter$b */
    class C3248b {

        /* renamed from: a */
        final C1069g f9050a;

        /* renamed from: b */
        final String f9051b;

        /* renamed from: c */
        C3249c f9052c;

        /* renamed from: d */
        int f9053d = -1;

        /* renamed from: e */
        int f9054e = -1;

        C3248b(C1069g gVar, String str) {
            this.f9050a = gVar;
            this.f9051b = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo9667a(int i) {
            return i - this.f9053d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo9669b(int i) {
            return i + this.f9053d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo9671c(int i) {
            this.f9053d = i;
            this.f9054e = this.f9050a.getItemCount();
            return this.f9054e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9668a() {
            if (this.f9052c == null) {
                this.f9052c = new C3249c(this);
                this.f9050a.registerAdapterDataObserver(this.f9052c);
                C1069g gVar = this.f9050a;
                if (gVar instanceof CompositeAdapter) {
                    for (C3248b a : ((CompositeAdapter) gVar).f9040a) {
                        a.mo9668a();
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo9670b() {
            C3249c cVar = this.f9052c;
            if (cVar != null) {
                this.f9050a.unregisterAdapterDataObserver(cVar);
                this.f9052c = null;
                C1069g gVar = this.f9050a;
                if (gVar instanceof CompositeAdapter) {
                    for (C3248b b : ((CompositeAdapter) gVar).f9040a) {
                        b.mo9670b();
                    }
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.core.widget.CompositeAdapter$c */
    class C3249c extends C1071i {

        /* renamed from: a */
        final C3248b f9056a;

        C3249c(C3248b bVar) {
            this.f9056a = bVar;
        }

        /* renamed from: a */
        public void mo5419a() {
            CompositeAdapter.this.m10292a();
            CompositeAdapter.this.notifyDataSetChanged();
        }

        /* renamed from: b */
        public void mo5423b(int i, int i2) {
            CompositeAdapter.this.m10292a();
            CompositeAdapter.this.notifyItemRangeInserted(this.f9056a.mo9669b(i), i2);
        }

        /* renamed from: c */
        public void mo5424c(int i, int i2) {
            CompositeAdapter.this.m10292a();
            CompositeAdapter.this.notifyItemRangeRemoved(this.f9056a.mo9669b(i), i2);
        }

        /* renamed from: a */
        public void mo5420a(int i, int i2) {
            CompositeAdapter.this.m10292a();
            CompositeAdapter.this.notifyItemRangeChanged(this.f9056a.mo9669b(i), i2);
        }

        /* renamed from: a */
        public void mo5422a(int i, int i2, Object obj) {
            CompositeAdapter.this.m10292a();
            CompositeAdapter.this.notifyItemRangeChanged(this.f9056a.mo9669b(i), i2, obj);
        }

        /* renamed from: a */
        public void mo5421a(int i, int i2, int i3) {
            CompositeAdapter.this.m10292a();
            int b = this.f9056a.mo9669b(i);
            for (int i4 = 0; i4 < i3; i4++) {
                CompositeAdapter.this.notifyItemMoved(b + i4, i2 + i4);
            }
        }
    }

    /* renamed from: app.zenly.locator.core.widget.CompositeAdapter$d */
    class C3250d {

        /* renamed from: a */
        final Set<C1069g> f9058a = Collections.newSetFromMap(new WeakHashMap(2));

        /* renamed from: b */
        final C3252f f9059b = new C3252f(CompositeAdapter.this);

        /* renamed from: c */
        final C3251e f9060c;

        C3250d(C3251e eVar) {
            this.f9060c = eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo9672a(int i) {
            return this.f9059b.f9064b.get(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo9673b(int i) {
            int i2 = this.f9059b.f9063a.get(i, 0);
            if (i2 != 0) {
                return i2;
            }
            int a = this.f9060c.m10318a();
            this.f9059b.f9063a.put(i, a);
            this.f9059b.f9064b.put(a, i);
            return a;
        }
    }

    /* renamed from: app.zenly.locator.core.widget.CompositeAdapter$e */
    private class C3251e {

        /* renamed from: a */
        private int f9062a;

        C3251e(CompositeAdapter compositeAdapter, int i) {
            this.f9062a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int m10318a() {
            int i = this.f9062a;
            this.f9062a = i + 1;
            return i;
        }
    }

    /* renamed from: app.zenly.locator.core.widget.CompositeAdapter$f */
    class C3252f {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public SparseIntArray f9063a = new SparseIntArray();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public SparseIntArray f9064b = new SparseIntArray();

        C3252f(CompositeAdapter compositeAdapter) {
        }
    }

    public int getItemCount() {
        m10292a();
        return this.f9045f;
    }

    public long getItemId(int i) {
        C3248b a = m10291a(i);
        return a.f9050a.getItemId(a.mo9667a(i));
    }

    public int getItemViewType(int i) {
        return m10290a(i, this.f9043d, this.f9044e, this.f9047h);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        m10294a(this, true);
        registerAdapterDataObserver(this.f9048i);
    }

    public void onBindViewHolder(C1085v vVar, int i) {
        C3248b a = m10291a(i);
        a.f9050a.onBindViewHolder(vVar, a.mo9667a(i));
    }

    public C1085v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C3250d dVar = (C3250d) this.f9044e.get(i);
        return ((C1069g) dVar.f9058a.iterator().next()).onCreateViewHolder(viewGroup, dVar.mo9672a(i));
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        m10294a(this, false);
        unregisterAdapterDataObserver(this.f9048i);
    }

    public void onViewRecycled(C1085v vVar) {
        int adapterPosition = vVar.getAdapterPosition();
        if (adapterPosition != -1) {
            m10291a(adapterPosition).f9050a.onViewRecycled(vVar);
        }
    }

    /* renamed from: b */
    private String m10295b(C1069g gVar) {
        if (gVar instanceof AdapterTypeProvider) {
            String adapterType = ((AdapterTypeProvider) gVar).getAdapterType();
            if (adapterType != null) {
                return adapterType;
            }
        }
        return gVar.getClass().toString();
    }

    /* renamed from: a */
    public void mo9665a(C1069g gVar) {
        mo9664a(this.f9040a.size(), gVar, null);
    }

    /* renamed from: a */
    public void mo9664a(int i, C1069g gVar, String str) {
        if (str == null) {
            str = m10295b(gVar);
        }
        C3248b bVar = new C3248b(gVar, str);
        if (!this.f9041b.containsKey(gVar)) {
            this.f9040a.add(i, bVar);
            this.f9041b.put(gVar, bVar);
            if (gVar instanceof CompositeAdapter) {
                ((CompositeAdapter) gVar).f9046g = this.f9046g;
            }
            if (this.f9046g) {
                m10292a();
                bVar.mo9668a();
                notifyItemRangeInserted(bVar.f9053d, bVar.f9054e);
                return;
            }
            return;
        }
        throw new InvalidParameterException("The adapter is already present in the CompoundAdapter");
    }

    public void onBindViewHolder(C1085v vVar, int i, List<Object> list) {
        C3248b a = m10291a(i);
        a.f9050a.onBindViewHolder(vVar, a.mo9667a(i), list);
    }

    /* renamed from: a */
    private int m10290a(int i, Map<String, C3250d> map, SparseArray<C3250d> sparseArray, C3251e eVar) {
        C3248b a = m10291a(i);
        int a2 = a.mo9667a(i);
        C1069g gVar = a.f9050a;
        if (gVar instanceof CompositeAdapter) {
            return ((CompositeAdapter) gVar).m10290a(a2, map, sparseArray, eVar);
        }
        int itemViewType = gVar.getItemViewType(a2);
        C3250d dVar = (C3250d) map.get(a.f9051b);
        if (dVar == null) {
            dVar = new C3250d(eVar);
            map.put(a.f9051b, dVar);
        }
        if (!dVar.f9058a.contains(a.f9050a)) {
            dVar.f9058a.add(a.f9050a);
        }
        int b = dVar.mo9673b(itemViewType);
        sparseArray.put(b, dVar);
        return b;
    }

    /* renamed from: a */
    private void m10294a(CompositeAdapter compositeAdapter, boolean z) {
        compositeAdapter.f9046g = z;
        for (C3248b bVar : compositeAdapter.f9040a) {
            if (z) {
                bVar.mo9668a();
            } else {
                bVar.mo9670b();
            }
            C1069g gVar = bVar.f9050a;
            if (gVar instanceof CompositeAdapter) {
                m10294a((CompositeAdapter) gVar, z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10292a() {
        this.f9042c.clear();
        int i = 0;
        for (C3248b bVar : this.f9040a) {
            this.f9042c.put(Integer.valueOf(i), bVar);
            i += bVar.mo9671c(i);
        }
        this.f9045f = i;
    }

    /* renamed from: a */
    private C3248b m10291a(int i) {
        return (C3248b) this.f9042c.floorEntry(Integer.valueOf(i)).getValue();
    }
}
