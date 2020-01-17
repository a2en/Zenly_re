package zendesk.belvedere;

import android.util.SparseArray;

/* renamed from: zendesk.belvedere.j */
class C13519j {

    /* renamed from: a */
    private SparseArray<MediaResult> f35060a = new SparseArray<>();

    C13519j() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo38892a() {
        int b;
        synchronized (this) {
            b = m35798b();
            this.f35060a.put(b, MediaResult.m35715i());
        }
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public MediaResult mo38895b(int i) {
        MediaResult mediaResult;
        synchronized (this) {
            mediaResult = (MediaResult) this.f35060a.get(i);
        }
        return mediaResult;
    }

    /* renamed from: b */
    private int m35798b() {
        for (int i = 1600; i < 1650; i++) {
            if (this.f35060a.get(i) == null) {
                return i;
            }
        }
        C13480L.m35692a("Belvedere", "No slot free. Clearing registry.");
        this.f35060a.clear();
        return m35798b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38893a(int i) {
        synchronized (this) {
            this.f35060a.remove(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38894a(int i, MediaResult mediaResult) {
        synchronized (this) {
            this.f35060a.put(i, mediaResult);
        }
    }
}
