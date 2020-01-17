package p389io.reactivex.disposables;

/* renamed from: io.reactivex.disposables.e */
final class C12278e extends C12277d<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    C12278e(Runnable runnable) {
        super(runnable);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RunnableDisposable(disposed=");
        sb.append(isDisposed());
        sb.append(", ");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36400a(Runnable runnable) {
        runnable.run();
    }
}
