package p389io.reactivex.p393i.p395b.p398c;

import java.util.concurrent.Callable;
import p389io.reactivex.Observer;
import p389io.reactivex.SingleSource;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p395b.p399d.C12440w;

/* renamed from: io.reactivex.i.b.c.d */
final class C12396d {
    /* renamed from: a */
    static <T, R> boolean m32890a(Object obj, Function<? super T, ? extends SingleSource<? extends R>> function, Observer<? super R> observer) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        SingleSource singleSource = null;
        try {
            Object call = ((Callable) obj).call();
            if (call != null) {
                Object apply = function.apply(call);
                C12324b.m32836a(apply, "The mapper returned a null SingleSource");
                singleSource = (SingleSource) apply;
            }
            if (singleSource == null) {
                C12459c.m32982a(observer);
            } else {
                singleSource.subscribe(C12440w.m32918b(observer));
            }
            return true;
        } catch (Throwable th) {
            C12285a.m32748b(th);
            C12459c.m32985a(th, observer);
            return true;
        }
    }
}
