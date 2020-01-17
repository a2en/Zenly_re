package app.zenly.locator.core.manager.p070t5;

import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.models.C2898q;
import java.util.ArrayList;

/* renamed from: app.zenly.locator.core.manager.t5.b */
public class C2832b<T extends C2898q> {

    /* renamed from: a */
    private int f8072a;

    /* renamed from: b */
    private T f8073b;

    /* renamed from: c */
    private ArrayList<C2896p> f8074c = new ArrayList<>();

    /* renamed from: d */
    private ArrayList<C2896p> f8075d = new ArrayList<>();

    public C2832b() {
    }

    /* renamed from: a */
    public static boolean m9308a(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: a */
    public void mo8861a(int i) {
        this.f8072a = i | this.f8072a;
    }

    /* renamed from: b */
    public void mo8865b(C2896p pVar) {
        mo8861a(8);
        this.f8075d.add(pVar);
    }

    /* renamed from: c */
    public T mo8866c() {
        return this.f8073b;
    }

    /* renamed from: d */
    public ArrayList<C2896p> mo8867d() {
        return this.f8075d;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (m9308a(this.f8072a, 1)) {
            arrayList.add("EVENT_CREATE_GATHERING");
        }
        if (m9308a(this.f8072a, 2)) {
            arrayList.add("EVENT_DESTROY_GATHERING");
        }
        if (m9308a(this.f8072a, 4)) {
            arrayList.add("EVENT_ADD_MEMBERS");
        }
        if (m9308a(this.f8072a, 8)) {
            arrayList.add("EVENT_REMOVE_MEMBERS");
        }
        if (m9308a(this.f8072a, 16)) {
            arrayList.add("EVENT_UPDATE_VALIDITY");
        }
        if (m9308a(this.f8072a, 32)) {
            arrayList.add("EVENT_UPDATE_CONTAINS_USER");
        }
        if (m9308a(this.f8072a, 64)) {
            arrayList.add("EVENT_UPDATE_POSITION");
        }
        if (m9308a(this.f8072a, 128)) {
            arrayList.add("EVENT_UPDATE_SIZE");
        }
        if (m9308a(this.f8072a, 256)) {
            arrayList.add("EVENT_UPDATE_TYPE");
        }
        if (m9308a(this.f8072a, 512)) {
            arrayList.add("EVENT_UPDATE_SCORE_RANK");
        }
        if (m9308a(this.f8072a, 1024)) {
            arrayList.add("EVENT_UPDATE_NOTIFICATIONS");
        }
        if (m9308a(this.f8072a, ItemAnimator.FLAG_MOVED)) {
            arrayList.add("EVENT_UPDATE_SIGNIFICANT_PLACE");
        }
        if (m9308a(this.f8072a, 4096)) {
            arrayList.add("EVENT_UPDATE_BUBBLE");
        }
        return String.format("GatheringEvent {gathering: %s, event: %s }", new Object[]{Integer.valueOf(this.f8073b.f8224a), arrayList.toString()});
    }

    /* renamed from: a */
    public void mo8863a(T t) {
        this.f8073b = t;
    }

    /* renamed from: a */
    public void mo8862a(C2896p pVar) {
        mo8861a(4);
        this.f8074c.add(pVar);
    }

    /* renamed from: b */
    public int mo8864b() {
        return this.f8072a;
    }

    public C2832b(int i, T t) {
        this.f8072a = i;
        this.f8073b = t;
    }

    /* renamed from: a */
    public ArrayList<C2896p> mo8860a() {
        return this.f8074c;
    }
}
