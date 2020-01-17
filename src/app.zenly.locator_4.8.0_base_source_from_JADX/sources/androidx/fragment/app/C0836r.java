package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p004os.CancellationSignal;
import androidx.core.view.C0647i;
import androidx.core.view.C0656k;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.r */
public abstract class C0836r {

    /* renamed from: androidx.fragment.app.r$a */
    class C0837a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ int f3389e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3390f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f3391g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f3392h;

        /* renamed from: i */
        final /* synthetic */ ArrayList f3393i;

        C0837a(C0836r rVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3389e = i;
            this.f3390f = arrayList;
            this.f3391g = arrayList2;
            this.f3392h = arrayList3;
            this.f3393i = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f3389e; i++) {
                ViewCompat.m2828a((View) this.f3390f.get(i), (String) this.f3391g.get(i));
                ViewCompat.m2828a((View) this.f3392h.get(i), (String) this.f3393i.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.r$b */
    class C0838b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ ArrayList f3394e;

        /* renamed from: f */
        final /* synthetic */ Map f3395f;

        C0838b(C0836r rVar, ArrayList arrayList, Map map) {
            this.f3394e = arrayList;
            this.f3395f = map;
        }

        public void run() {
            int size = this.f3394e.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f3394e.get(i);
                String t = ViewCompat.m2867t(view);
                if (t != null) {
                    ViewCompat.m2828a(view, C0836r.m3943a(this.f3395f, t));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.r$c */
    class C0839c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ ArrayList f3396e;

        /* renamed from: f */
        final /* synthetic */ Map f3397f;

        C0839c(C0836r rVar, ArrayList arrayList, Map map) {
            this.f3396e = arrayList;
            this.f3397f = map;
        }

        public void run() {
            int size = this.f3396e.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f3396e.get(i);
                ViewCompat.m2828a(view, (String) this.f3397f.get(ViewCompat.m2867t(view)));
            }
        }
    }

    /* renamed from: a */
    public abstract Object mo4329a(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4364a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    public abstract void mo4330a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo4332a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo4333a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo4334a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo4335a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo4336a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo4337a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a */
    public abstract boolean mo4338a(Object obj);

    /* renamed from: b */
    public abstract Object mo4339b(Object obj);

    /* renamed from: b */
    public abstract Object mo4340b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo4341b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo4342b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo4343b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo4344c(Object obj);

    /* renamed from: c */
    public abstract void mo4345c(Object obj, View view);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ArrayList<String> mo4363a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(ViewCompat.m2867t(view));
            ViewCompat.m2828a(view, (String) null);
        }
        return arrayList2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4365a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String t = ViewCompat.m2867t(view2);
            arrayList4.add(t);
            if (t != null) {
                ViewCompat.m2828a(view2, (String) null);
                String str = (String) map.get(t);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        ViewCompat.m2828a((View) arrayList2.get(i2), t);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C0837a aVar = new C0837a(this, size, arrayList2, arrayList3, arrayList, arrayList4);
        C0647i.m3033a(view, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4368a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0656k.m3057a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mo4368a(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4369a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String t = ViewCompat.m2867t(view);
            if (t != null) {
                map.put(t, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo4369a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4366a(View view, ArrayList<View> arrayList, Map<String, String> map) {
        C0647i.m3033a(view, new C0838b(this, arrayList, map));
    }

    /* renamed from: a */
    public void mo4331a(Fragment fragment, Object obj, CancellationSignal cancellationSignal, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4367a(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        C0647i.m3033a(viewGroup, new C0839c(this, arrayList, map));
    }

    /* renamed from: a */
    protected static void m3944a(List<View> list, View view) {
        int size = list.size();
        if (!m3946a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m3946a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m3946a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected static boolean m3945a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    static String m3943a(Map<String, String> map, String str) {
        for (Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }
}
