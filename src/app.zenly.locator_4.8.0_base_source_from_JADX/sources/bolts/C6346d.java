package bolts;

/* renamed from: bolts.d */
public class C6346d<TResult> {

    /* renamed from: a */
    private final Task<TResult> f15901a = new Task<>();

    /* renamed from: a */
    public Task<TResult> mo14194a() {
        return this.f15901a;
    }

    /* renamed from: b */
    public boolean mo14199b(TResult tresult) {
        return this.f15901a.mo14182a(tresult);
    }

    /* renamed from: c */
    public boolean mo14200c() {
        return this.f15901a.mo14187f();
    }

    /* renamed from: a */
    public void mo14196a(TResult tresult) {
        if (!mo14199b(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    /* renamed from: b */
    public boolean mo14198b(Exception exc) {
        return this.f15901a.mo14181a(exc);
    }

    /* renamed from: b */
    public void mo14197b() {
        if (!mo14200c()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    /* renamed from: a */
    public void mo14195a(Exception exc) {
        if (!mo14198b(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }
}
