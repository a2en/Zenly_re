package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C1112g.C1114b;
import androidx.recyclerview.widget.C1112g.C1115c;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public class AsyncListDiffer<T> {

    /* renamed from: h */
    private static final Executor f3893h = new C1049b();

    /* renamed from: a */
    private final ListUpdateCallback f3894a;

    /* renamed from: b */
    final C1095c<T> f3895b;

    /* renamed from: c */
    Executor f3896c;

    /* renamed from: d */
    private final List<ListListener<T>> f3897d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private List<T> f3898e;

    /* renamed from: f */
    private List<T> f3899f = Collections.emptyList();

    /* renamed from: g */
    int f3900g;

    public interface ListListener<T> {
        void onCurrentListChanged(List<T> list, List<T> list2);
    }

    /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$a */
    class C1046a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ List f3901e;

        /* renamed from: f */
        final /* synthetic */ List f3902f;

        /* renamed from: g */
        final /* synthetic */ int f3903g;

        /* renamed from: h */
        final /* synthetic */ Runnable f3904h;

        /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$a$a */
        class C1047a extends C1114b {
            C1047a() {
            }

            public boolean areContentsTheSame(int i, int i2) {
                Object obj = C1046a.this.f3901e.get(i);
                Object obj2 = C1046a.this.f3902f.get(i2);
                if (obj != null && obj2 != null) {
                    return AsyncListDiffer.this.f3895b.mo5638b().mo5698a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            public boolean areItemsTheSame(int i, int i2) {
                Object obj = C1046a.this.f3901e.get(i);
                Object obj2 = C1046a.this.f3902f.get(i2);
                if (obj != null && obj2 != null) {
                    return AsyncListDiffer.this.f3895b.mo5638b().mo5699b(obj, obj2);
                }
                return obj == null && obj2 == null;
            }

            public Object getChangePayload(int i, int i2) {
                Object obj = C1046a.this.f3901e.get(i);
                Object obj2 = C1046a.this.f3902f.get(i2);
                if (obj != null && obj2 != null) {
                    return AsyncListDiffer.this.f3895b.mo5638b().mo5700c(obj, obj2);
                }
                throw new AssertionError();
            }

            public int getNewListSize() {
                return C1046a.this.f3902f.size();
            }

            public int getOldListSize() {
                return C1046a.this.f3901e.size();
            }
        }

        /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$a$b */
        class C1048b implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C1115c f3907e;

            C1048b(C1115c cVar) {
                this.f3907e = cVar;
            }

            public void run() {
                C1046a aVar = C1046a.this;
                AsyncListDiffer asyncListDiffer = AsyncListDiffer.this;
                if (asyncListDiffer.f3900g == aVar.f3903g) {
                    asyncListDiffer.mo4920a(aVar.f3902f, this.f3907e, aVar.f3904h);
                }
            }
        }

        C1046a(List list, List list2, int i, Runnable runnable) {
            this.f3901e = list;
            this.f3902f = list2;
            this.f3903g = i;
            this.f3904h = runnable;
        }

        public void run() {
            AsyncListDiffer.this.f3896c.execute(new C1048b(C1112g.m5467a(new C1047a())));
        }
    }

    /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$b */
    private static class C1049b implements Executor {

        /* renamed from: a */
        final Handler f3909a = new Handler(Looper.getMainLooper());

        C1049b() {
        }

        public void execute(Runnable runnable) {
            this.f3909a.post(runnable);
        }
    }

    public AsyncListDiffer(ListUpdateCallback listUpdateCallback, C1095c<T> cVar) {
        this.f3894a = listUpdateCallback;
        this.f3895b = cVar;
        if (cVar.mo5639c() != null) {
            this.f3896c = cVar.mo5639c();
        } else {
            this.f3896c = f3893h;
        }
    }

    /* renamed from: b */
    private void m4674b(List<T> list, Runnable runnable) {
        for (ListListener onCurrentListChanged : this.f3897d) {
            onCurrentListChanged.onCurrentListChanged(list, this.f3899f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public List<T> mo4917a() {
        return this.f3899f;
    }

    /* renamed from: a */
    public void mo4919a(List<T> list) {
        mo4921a(list, null);
    }

    /* renamed from: a */
    public void mo4921a(List<T> list, Runnable runnable) {
        int i = this.f3900g + 1;
        this.f3900g = i;
        List<T> list2 = this.f3898e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
            }
            return;
        }
        List<T> list3 = this.f3899f;
        if (list == null) {
            int size = list2.size();
            this.f3898e = null;
            this.f3899f = Collections.emptyList();
            this.f3894a.onRemoved(0, size);
            m4674b(list3, runnable);
        } else if (list2 == null) {
            this.f3898e = list;
            this.f3899f = Collections.unmodifiableList(list);
            this.f3894a.onInserted(0, list.size());
            m4674b(list3, runnable);
        } else {
            Executor a = this.f3895b.mo5637a();
            C1046a aVar = new C1046a(list2, list, i, runnable);
            a.execute(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4920a(List<T> list, C1115c cVar, Runnable runnable) {
        List<T> list2 = this.f3899f;
        this.f3898e = list;
        this.f3899f = Collections.unmodifiableList(list);
        cVar.mo5696a(this.f3894a);
        m4674b(list2, runnable);
    }

    /* renamed from: a */
    public void mo4918a(ListListener<T> listListener) {
        this.f3897d.add(listListener);
    }
}
