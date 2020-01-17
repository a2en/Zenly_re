package app.zenly.locator.chat;

import androidx.recyclerview.widget.C1148u;
import androidx.recyclerview.widget.C1151v;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import app.zenly.locator.chat.content.C1949d;
import app.zenly.locator.core.util.C3219h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.chat.v4 */
public final class C2345v4 {

    /* renamed from: a */
    private final C12785a<String> f7103a = C12785a.m33447u();

    /* renamed from: b */
    private final Map<String, C1949d> f7104b = new ConcurrentHashMap();

    /* renamed from: c */
    private final Map<String, C1949d> f7105c = new ConcurrentHashMap();

    /* renamed from: d */
    private final C1069g f7106d;

    /* renamed from: e */
    private final C1148u<C1949d> f7107e;

    /* renamed from: f */
    private C1949d f7108f = null;

    /* renamed from: g */
    private C1949d f7109g = null;

    /* renamed from: app.zenly.locator.chat.v4$a */
    class C2346a extends C1151v<C1949d> {
        C2346a(C2345v4 v4Var, C1069g gVar) {
            super(gVar);
        }

        /* renamed from: d */
        public Object mo5800c(C1949d dVar, C1949d dVar2) {
            if (dVar.mo7716g() != dVar2.mo7716g()) {
                return C2338c.STATUS;
            }
            return null;
        }

        /* renamed from: a */
        public boolean mo5798a(C1949d dVar, C1949d dVar2) {
            return dVar.mo7712c(dVar2);
        }

        /* renamed from: b */
        public boolean mo5799b(C1949d dVar, C1949d dVar2) {
            if (!dVar.mo7715f() || !dVar2.mo7715f()) {
                return dVar.f6310c.getUuid().equals(dVar2.f6310c.getUuid());
            }
            boolean z = true;
            if (!dVar.f6310c.getClientUuid().isEmpty() && dVar.f6310c.getClientUuid().equals(dVar2.f6310c.getClientUuid())) {
                return true;
            }
            if (dVar.f6310c.getUuid().isEmpty() || !dVar.f6310c.getUuid().equals(dVar2.f6310c.getUuid())) {
                z = false;
            }
            return z;
        }

        /* renamed from: c */
        public int compare(C1949d dVar, C1949d dVar2) {
            return dVar2.mo7706a(dVar);
        }
    }

    C2345v4(C1069g gVar) {
        this.f7106d = gVar;
        this.f7107e = new C1148u<>(C1949d.class, new C2346a(this, gVar));
    }

    /* renamed from: f */
    private void m8350f() {
        C1949d dVar;
        int i = 0;
        while (true) {
            if (i >= this.f7107e.mo5795c()) {
                dVar = null;
                break;
            }
            dVar = (C1949d) this.f7107e.mo5790a(i);
            if (dVar.mo7715f() && dVar.mo7711c()) {
                break;
            }
            i++;
        }
        this.f7108f = dVar;
        C1949d dVar2 = this.f7108f;
        if (dVar2 != null) {
            mo8240a(dVar2, (Object) C2338c.STATUS);
        }
    }

    /* renamed from: g */
    private C1949d m8351g(C1949d dVar) {
        C1949d dVar2 = (C1949d) this.f7104b.get(dVar.f6310c.getUuid());
        if (dVar2 != null) {
            return dVar2;
        }
        C1949d dVar3 = (C1949d) this.f7105c.get(dVar.f6310c.getClientUuid());
        if (dVar3 != null) {
            return dVar3;
        }
        return null;
    }

    /* renamed from: h */
    private boolean m8352h(C1949d dVar) {
        C1949d dVar2 = this.f7108f;
        return dVar2 == null || C3219h.m10210a(dVar2.f6310c.getCreatedAt(), dVar.f6310c.getCreatedAt()) < 0;
    }

    /* renamed from: i */
    private void m8353i(C1949d dVar) {
        if (dVar.f6310c.getUuid().isEmpty() && dVar.f6310c.getClientUuid().isEmpty()) {
            C12143a.m32037e("Message must have either uuid or client uuid.", new Object[0]);
        }
        if (!dVar.f6310c.getUuid().isEmpty()) {
            this.f7104b.put(dVar.f6310c.getUuid(), dVar);
            this.f7103a.onNext(dVar.f6310c.getUuid());
        }
        if (!dVar.f6310c.getClientUuid().isEmpty()) {
            this.f7105c.put(dVar.f6310c.getClientUuid(), dVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8240a(C1949d dVar, Object obj) {
        int b = this.f7107e.mo5793b(dVar);
        if (b != -1) {
            this.f7106d.notifyItemChanged(b, obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public List<C1949d> mo8243b(String str) {
        C1949d a = mo8236a(str);
        if (a == null) {
            return Collections.emptyList();
        }
        int b = this.f7107e.mo5793b(a);
        ArrayList arrayList = new ArrayList();
        for (int i = b - 1; i >= 0; i--) {
            C1949d a2 = mo8235a(i);
            if (!a2.mo7708a() && !a2.mo7715f()) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo8245c() {
        return this.f7107e.mo5795c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo8249d(C1949d dVar) {
        mo8240a(dVar, (Object) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C1949d mo8250e() {
        if (mo8245c() > 0) {
            return mo8235a(mo8245c() - 1);
        }
        return null;
    }

    /* renamed from: c */
    public C12279e<List<C1949d>> mo8246c(String str) {
        return this.f7103a.mo36501i(new C2281q0(this, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C1949d mo8248d() {
        if (mo8245c() > 0) {
            return mo8235a(0);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo8251e(C1949d dVar) {
        this.f7104b.remove(dVar.f6310c.getUuid());
        this.f7105c.remove(dVar.f6310c.getClientUuid());
        this.f7103a.onNext(dVar.f6310c.getUuid());
        int b = this.f7107e.mo5793b(dVar);
        C1949d dVar2 = null;
        C1949d dVar3 = b < mo8245c() + -1 ? (C1949d) this.f7107e.mo5790a(b + 1) : null;
        if (b > 0) {
            dVar2 = (C1949d) this.f7107e.mo5790a(b - 1);
        }
        this.f7107e.mo5796c(dVar);
        if (dVar3 != null) {
            mo8240a(dVar3, (Object) C2338c.AVATAR);
        }
        if (dVar2 != null) {
            mo8240a(dVar2, (Object) C2338c.HEADER);
        }
        if (dVar.mo7715f() && dVar.mo7711c() && mo8247c(dVar)) {
            m8350f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1949d mo8235a(int i) {
        return (C1949d) this.f7107e.mo5790a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo8247c(C1949d dVar) {
        C1949d dVar2 = this.f7108f;
        return dVar2 != null && dVar2.mo7706a(dVar) == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1949d mo8236a(String str) {
        return (C1949d) this.f7104b.get(str);
    }

    /* renamed from: a */
    public /* synthetic */ List mo8237a(String str, String str2) throws Exception {
        return mo8243b(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8241a(List<C1949d> list) {
        C1949d e = mo8250e();
        C1949d d = mo8248d();
        try {
            this.f7107e.mo5791a();
            for (C1949d a : list) {
                mo8239a(a);
            }
            if (e != null) {
                mo8240a(e, (Object) C2338c.HEADER);
            }
            if (d != null && !d.mo7715f()) {
                C1949d a2 = mo8235a(0);
                if (a2 != null && a2.mo7710b(d)) {
                    mo8240a(d, (Object) C2338c.AVATAR);
                }
            }
        } finally {
            this.f7107e.mo5794b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo8252f(C1949d dVar) {
        this.f7109g = dVar;
        m8349b(mo8242b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo8244b(C1949d dVar) {
        if (dVar != null) {
            C1949d dVar2 = this.f7109g;
            if (dVar2 != null && dVar2.mo7706a(dVar) == 0) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo8242b() {
        C1949d dVar = this.f7109g;
        if (dVar != null) {
            return this.f7107e.mo5793b(dVar);
        }
        return -1;
    }

    /* renamed from: b */
    private void m8349b(int i) {
        if (i != -1) {
            C1949d a = mo8235a(i);
            if (a != null) {
                mo8240a(a, (Object) C2338c.HEADER);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8239a(C1949d dVar) {
        C1949d g = m8351g(dVar);
        if (g == null) {
            C12143a.m32027a("Adding item with message %s with client uuid %s, with uuid %s", dVar.f6310c.getContent(0).getText(), dVar.f6310c.getClientUuid(), dVar.f6310c.getUuid());
            if (!dVar.mo7708a()) {
                this.f7107e.mo5789a(dVar);
            }
        } else {
            m8348a(g, dVar);
        }
        m8353i(dVar);
        if (!dVar.mo7708a() && dVar.mo7711c() && dVar.mo7715f() && m8352h(dVar)) {
            C1949d dVar2 = this.f7108f;
            if (dVar2 != null) {
                mo8240a(dVar2, (Object) C2338c.STATUS);
            }
            this.f7108f = dVar;
        }
    }

    /* renamed from: a */
    private void m8348a(C1949d dVar, C1949d dVar2) {
        int b = this.f7107e.mo5793b(dVar);
        if (b != -1) {
            C12143a.m32027a("Updating item with message %s with client uuid %s, with uuid %s", dVar2.f6310c.getContent(0).getText(), dVar2.f6310c.getClientUuid(), dVar2.f6310c.getUuid());
            if (dVar2.mo7708a()) {
                mo8251e(dVar);
            } else {
                this.f7107e.mo5792a(b, dVar2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8238a() {
        int b = mo8242b();
        this.f7109g = null;
        m8349b(b);
    }
}
