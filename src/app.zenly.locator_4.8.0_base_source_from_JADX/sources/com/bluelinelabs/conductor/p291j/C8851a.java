package com.bluelinelabs.conductor.p291j;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C1295a;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import java.util.ArrayList;

/* renamed from: com.bluelinelabs.conductor.j.a */
public abstract class C8851a extends C1295a {

    /* renamed from: c */
    private final C8819d f22978c;

    /* renamed from: d */
    private int f22979d = Integer.MAX_VALUE;

    /* renamed from: e */
    private SparseArray<Bundle> f22980e = new SparseArray<>();

    /* renamed from: f */
    private SparseArray<C8831g> f22981f = new SparseArray<>();

    /* renamed from: g */
    private ArrayList<Integer> f22982g = new ArrayList<>();

    /* renamed from: h */
    private C8831g f22983h;

    public C8851a(C8819d dVar) {
        this.f22978c = dVar;
    }

    /* renamed from: a */
    public Object mo4281a(ViewGroup viewGroup, int i) {
        C8831g a = this.f22978c.mo23897a(viewGroup, m21109a(viewGroup.getId(), mo24080b(i)));
        if (!a.mo24012j()) {
            Bundle bundle = (Bundle) this.f22980e.get(i);
            if (bundle != null) {
                a.mo23860a(bundle);
                this.f22980e.remove(i);
                this.f22982g.remove(Integer.valueOf(i));
            }
        }
        a.mo24018r();
        mo8132a(a, i);
        if (a != this.f22983h) {
            for (C8836h a2 : a.mo24000b()) {
                a2.mo24022a().mo23935c(true);
            }
        }
        this.f22981f.put(i, a);
        return a;
    }

    /* renamed from: a */
    public abstract void mo8132a(C8831g gVar, int i);

    /* renamed from: b */
    public long mo24080b(int i) {
        return (long) i;
    }

    /* renamed from: b */
    public void mo4289b(ViewGroup viewGroup, int i, Object obj) {
        C8831g gVar = (C8831g) obj;
        C8831g gVar2 = this.f22983h;
        if (gVar != gVar2) {
            if (gVar2 != null) {
                for (C8836h a : gVar2.mo24000b()) {
                    a.mo24022a().mo23935c(true);
                }
            }
            if (gVar != null) {
                for (C8836h a2 : gVar.mo24000b()) {
                    a2.mo24022a().mo23935c(false);
                }
            }
            this.f22983h = gVar;
        }
    }

    /* renamed from: c */
    public C8831g mo24081c(int i) {
        return (C8831g) this.f22981f.get(i);
    }

    /* renamed from: c */
    private void m21110c() {
        while (this.f22980e.size() > this.f22979d) {
            this.f22980e.remove(((Integer) this.f22982g.remove(0)).intValue());
        }
    }

    /* renamed from: b */
    public Parcelable mo4286b() {
        Bundle bundle = new Bundle();
        bundle.putSparseParcelableArray("RouterPagerAdapter.savedStates", this.f22980e);
        bundle.putInt("RouterPagerAdapter.maxPagesToStateSave", this.f22979d);
        bundle.putIntegerArrayList("RouterPagerAdapter.savedPageHistory", this.f22982g);
        return bundle;
    }

    /* renamed from: a */
    public void mo4284a(ViewGroup viewGroup, int i, Object obj) {
        C8831g gVar = (C8831g) obj;
        Bundle bundle = new Bundle();
        gVar.mo23866b(bundle);
        this.f22980e.put(i, bundle);
        this.f22982g.remove(Integer.valueOf(i));
        this.f22982g.add(Integer.valueOf(i));
        m21110c();
        this.f22978c.mo23914a(gVar);
        this.f22981f.remove(i);
    }

    /* renamed from: a */
    public boolean mo4285a(View view, Object obj) {
        for (C8836h a : ((C8831g) obj).mo24000b()) {
            if (a.mo24022a().mo23948m() == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo4282a(Parcelable parcelable, ClassLoader classLoader) {
        Bundle bundle = (Bundle) parcelable;
        if (parcelable != null) {
            this.f22980e = bundle.getSparseParcelableArray("RouterPagerAdapter.savedStates");
            this.f22979d = bundle.getInt("RouterPagerAdapter.maxPagesToStateSave");
            this.f22982g = bundle.getIntegerArrayList("RouterPagerAdapter.savedPageHistory");
        }
    }

    /* renamed from: a */
    private static String m21109a(int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }
}
