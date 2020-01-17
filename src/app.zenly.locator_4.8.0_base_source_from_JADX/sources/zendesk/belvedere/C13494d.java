package zendesk.belvedere;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: zendesk.belvedere.d */
class C13494d extends C1069g<C1085v> {

    /* renamed from: a */
    private List<C13499b> f35000a = new ArrayList();

    /* renamed from: b */
    private List<C13499b> f35001b = new ArrayList();

    /* renamed from: c */
    private List<C13499b> f35002c = new ArrayList();

    /* renamed from: zendesk.belvedere.d$a */
    class C13495a extends C1085v {
        C13495a(C13494d dVar, View view) {
            super(view);
        }
    }

    /* renamed from: zendesk.belvedere.d$b */
    interface C13496b {
        /* renamed from: a */
        void mo38875a();

        /* renamed from: a */
        boolean mo38876a(C13499b bVar);
    }

    C13494d() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38872a(List<C13499b> list) {
        m35744a(this.f35000a, list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo38874b(List<MediaResult> list) {
        ArrayList<C13499b> arrayList = new ArrayList<>(this.f35001b);
        HashSet hashSet = new HashSet();
        for (MediaResult e : list) {
            hashSet.add(e.mo38846e());
        }
        for (C13499b bVar : arrayList) {
            bVar.mo38880a(hashSet.contains(bVar.mo38882c().mo38846e()));
        }
        m35744a(this.f35000a, arrayList);
    }

    public int getItemCount() {
        return this.f35002c.size();
    }

    public long getItemId(int i) {
        return ((C13499b) this.f35002c.get(i)).mo38878a();
    }

    public int getItemViewType(int i) {
        return ((C13499b) this.f35002c.get(i)).mo38881b();
    }

    public void onBindViewHolder(C1085v vVar, int i) {
        ((C13499b) this.f35002c.get(i)).mo38879a(vVar.itemView);
    }

    public C1085v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C13495a(this, LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38873a(C13499b bVar) {
        m35744a(Collections.singletonList(bVar), this.f35001b);
    }

    /* renamed from: a */
    private void m35744a(List<C13499b> list, List<C13499b> list2) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        this.f35000a = list;
        this.f35001b = list2;
        this.f35002c = arrayList;
    }
}
