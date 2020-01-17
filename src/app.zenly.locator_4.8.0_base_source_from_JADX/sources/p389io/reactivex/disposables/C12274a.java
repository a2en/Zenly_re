package p389io.reactivex.disposables;

import p389io.reactivex.functions.Action;
import p389io.reactivex.internal.util.C12757g;

/* renamed from: io.reactivex.disposables.a */
final class C12274a extends C12277d<Action> {
    private static final long serialVersionUID = -8219729196779211169L;

    C12274a(Action action) {
        super(action);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36400a(Action action) {
        try {
            action.run();
        } catch (Throwable th) {
            throw C12757g.m33354b(th);
        }
    }
}
