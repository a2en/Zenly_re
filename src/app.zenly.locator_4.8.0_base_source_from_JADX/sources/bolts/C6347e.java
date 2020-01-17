package bolts;

import bolts.Task.UnobservedExceptionHandler;

/* renamed from: bolts.e */
class C6347e {

    /* renamed from: a */
    private Task<?> f15902a;

    public C6347e(Task<?> task) {
        this.f15902a = task;
    }

    /* renamed from: a */
    public void mo14201a() {
        this.f15902a = null;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            Task<?> task = this.f15902a;
            if (task != null) {
                UnobservedExceptionHandler g = Task.m17423g();
                if (g != null) {
                    g.unobservedException(task, new UnobservedTaskException(task.mo14180a()));
                }
            }
        } finally {
            super.finalize();
        }
    }
}
