package androidx.paging;

import androidx.recyclerview.widget.C1112g;
import androidx.recyclerview.widget.C1112g.C1114b;
import androidx.recyclerview.widget.C1112g.C1115c;
import androidx.recyclerview.widget.C1112g.C1116d;
import androidx.recyclerview.widget.ListUpdateCallback;

/* renamed from: androidx.paging.i */
class C1030i {

    /* renamed from: androidx.paging.i$a */
    static class C1031a extends C1114b {

        /* renamed from: a */
        final /* synthetic */ C1028h f3866a;

        /* renamed from: b */
        final /* synthetic */ int f3867b;

        /* renamed from: c */
        final /* synthetic */ C1028h f3868c;

        /* renamed from: d */
        final /* synthetic */ C1116d f3869d;

        /* renamed from: e */
        final /* synthetic */ int f3870e;

        /* renamed from: f */
        final /* synthetic */ int f3871f;

        C1031a(C1028h hVar, int i, C1028h hVar2, C1116d dVar, int i2, int i3) {
            this.f3866a = hVar;
            this.f3867b = i;
            this.f3868c = hVar2;
            this.f3869d = dVar;
            this.f3870e = i2;
            this.f3871f = i3;
        }

        public boolean areContentsTheSame(int i, int i2) {
            Object obj = this.f3866a.get(i + this.f3867b);
            C1028h hVar = this.f3868c;
            Object obj2 = hVar.get(i2 + hVar.mo4884e());
            if (obj == obj2) {
                return true;
            }
            if (obj == null || obj2 == null) {
                return false;
            }
            return this.f3869d.mo5698a(obj, obj2);
        }

        public boolean areItemsTheSame(int i, int i2) {
            Object obj = this.f3866a.get(i + this.f3867b);
            C1028h hVar = this.f3868c;
            Object obj2 = hVar.get(i2 + hVar.mo4884e());
            if (obj == obj2) {
                return true;
            }
            if (obj == null || obj2 == null) {
                return false;
            }
            return this.f3869d.mo5699b(obj, obj2);
        }

        public Object getChangePayload(int i, int i2) {
            Object obj = this.f3866a.get(i + this.f3867b);
            C1028h hVar = this.f3868c;
            Object obj2 = hVar.get(i2 + hVar.mo4884e());
            if (obj == null || obj2 == null) {
                return null;
            }
            return this.f3869d.mo5700c(obj, obj2);
        }

        public int getNewListSize() {
            return this.f3871f;
        }

        public int getOldListSize() {
            return this.f3870e;
        }
    }

    /* renamed from: androidx.paging.i$b */
    private static class C1032b implements ListUpdateCallback {

        /* renamed from: e */
        private final int f3872e;

        /* renamed from: f */
        private final ListUpdateCallback f3873f;

        C1032b(int i, ListUpdateCallback listUpdateCallback) {
            this.f3872e = i;
            this.f3873f = listUpdateCallback;
        }

        public void onChanged(int i, int i2, Object obj) {
            this.f3873f.onChanged(i + this.f3872e, i2, obj);
        }

        public void onInserted(int i, int i2) {
            this.f3873f.onInserted(i + this.f3872e, i2);
        }

        public void onMoved(int i, int i2) {
            ListUpdateCallback listUpdateCallback = this.f3873f;
            int i3 = this.f3872e;
            listUpdateCallback.onMoved(i + i3, i2 + i3);
        }

        public void onRemoved(int i, int i2) {
            this.f3873f.onRemoved(i + this.f3872e, i2);
        }
    }

    /* renamed from: a */
    static <T> C1115c m4628a(C1028h<T> hVar, C1028h<T> hVar2, C1116d<T> dVar) {
        int a = hVar.mo4873a();
        C1031a aVar = new C1031a(hVar, a, hVar2, dVar, (hVar.size() - a) - hVar.mo4880b(), (hVar2.size() - hVar2.mo4873a()) - hVar2.mo4880b());
        return C1112g.m5468a(aVar, true);
    }

    /* renamed from: a */
    static <T> void m4629a(ListUpdateCallback listUpdateCallback, C1028h<T> hVar, C1028h<T> hVar2, C1115c cVar) {
        int b = hVar.mo4880b();
        int b2 = hVar2.mo4880b();
        int a = hVar.mo4873a();
        int a2 = hVar2.mo4873a();
        if (b == 0 && b2 == 0 && a == 0 && a2 == 0) {
            cVar.mo5696a(listUpdateCallback);
            return;
        }
        if (b > b2) {
            int i = b - b2;
            listUpdateCallback.onRemoved(hVar.size() - i, i);
        } else if (b < b2) {
            listUpdateCallback.onInserted(hVar.size(), b2 - b);
        }
        if (a > a2) {
            listUpdateCallback.onRemoved(0, a - a2);
        } else if (a < a2) {
            listUpdateCallback.onInserted(0, a2 - a);
        }
        if (a2 != 0) {
            cVar.mo5696a((ListUpdateCallback) new C1032b(a2, listUpdateCallback));
        } else {
            cVar.mo5696a(listUpdateCallback);
        }
    }

    /* renamed from: a */
    static int m4627a(C1115c cVar, C1028h hVar, C1028h hVar2, int i) {
        int e = i - hVar.mo4884e();
        if (e >= 0 && e < hVar.mo4890j()) {
            for (int i2 = 0; i2 < 30; i2++) {
                int i3 = ((i2 / 2) * (i2 % 2 == 1 ? -1 : 1)) + e;
                if (i3 >= 0 && i3 < hVar.mo4890j()) {
                    int a = cVar.mo5695a(i3);
                    if (a != -1) {
                        return a + hVar2.mo4884e();
                    }
                }
            }
        }
        return Math.max(0, Math.min(i, hVar2.size() - 1));
    }
}
