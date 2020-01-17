package p389io.reactivex.p393i.p395b.p397b;

import p389io.reactivex.C12273d;
import p389io.reactivex.MaybeSource;
import p389io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

/* renamed from: io.reactivex.i.b.b.a */
abstract class C12346a<T, R> extends C12273d<R> implements HasUpstreamMaybeSource<T> {

    /* renamed from: e */
    protected final MaybeSource<T> f32051e;

    C12346a(MaybeSource<T> maybeSource) {
        this.f32051e = maybeSource;
    }

    public final MaybeSource<T> source() {
        return this.f32051e;
    }
}
