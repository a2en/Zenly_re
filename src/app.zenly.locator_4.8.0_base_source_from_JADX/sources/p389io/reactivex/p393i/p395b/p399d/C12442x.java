package p389io.reactivex.p393i.p395b.p399d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.d.x */
public final class C12442x<T, R> extends C12291g<R> {

    /* renamed from: e */
    final SingleSource<? extends T>[] f32269e;

    /* renamed from: f */
    final Function<? super Object[], ? extends R> f32270f;

    /* renamed from: io.reactivex.i.b.d.x$a */
    final class C12443a implements Function<T, R> {
        C12443a() {
        }

        public R apply(T t) throws Exception {
            R apply = C12442x.this.f32270f.apply(new Object[]{t});
            C12324b.m32836a(apply, "The zipper returned a null value");
            return apply;
        }
    }

    /* renamed from: io.reactivex.i.b.d.x$b */
    static final class C12444b<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -5556924161382950569L;

        /* renamed from: e */
        final SingleObserver<? super R> f32272e;

        /* renamed from: f */
        final Function<? super Object[], ? extends R> f32273f;

        /* renamed from: g */
        final C12445c<T>[] f32274g;

        /* renamed from: h */
        final Object[] f32275h;

        C12444b(SingleObserver<? super R> singleObserver, int i, Function<? super Object[], ? extends R> function) {
            super(i);
            this.f32272e = singleObserver;
            this.f32273f = function;
            C12445c<T>[] cVarArr = new C12445c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new C12445c<>(this, i2);
            }
            this.f32274g = cVarArr;
            this.f32275h = new Object[i];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36620a(T t, int i) {
            this.f32275h[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    Object apply = this.f32273f.apply(this.f32275h);
                    C12324b.m32836a(apply, "The zipper returned a null value");
                    this.f32272e.onSuccess(apply);
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    this.f32272e.onError(th);
                }
            }
        }

        public void dispose() {
            if (getAndSet(0) > 0) {
                for (C12445c<T> a : this.f32274g) {
                    a.mo36622a();
                }
            }
        }

        public boolean isDisposed() {
            return get() <= 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36619a(int i) {
            C12445c<T>[] cVarArr = this.f32274g;
            int length = cVarArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2].mo36622a();
            }
            while (true) {
                i++;
                if (i < length) {
                    cVarArr[i].mo36622a();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36621a(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                mo36619a(i);
                this.f32272e.onError(th);
                return;
            }
            C12768a.m33415b(th);
        }
    }

    /* renamed from: io.reactivex.i.b.d.x$c */
    static final class C12445c<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* renamed from: e */
        final C12444b<T, ?> f32276e;

        /* renamed from: f */
        final int f32277f;

        C12445c(C12444b<T, ?> bVar, int i) {
            this.f32276e = bVar;
            this.f32277f = i;
        }

        /* renamed from: a */
        public void mo36622a() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public void onError(Throwable th) {
            this.f32276e.mo36621a(th, this.f32277f);
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this, disposable);
        }

        public void onSuccess(T t) {
            this.f32276e.mo36620a(t, this.f32277f);
        }
    }

    public C12442x(SingleSource<? extends T>[] singleSourceArr, Function<? super Object[], ? extends R> function) {
        this.f32269e = singleSourceArr;
        this.f32270f = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super R> singleObserver) {
        SingleSource<? extends T>[] singleSourceArr = this.f32269e;
        int length = singleSourceArr.length;
        int i = 0;
        if (length == 1) {
            singleSourceArr[0].subscribe(new C12425a(singleObserver, new C12443a()));
            return;
        }
        C12444b bVar = new C12444b(singleObserver, length, this.f32270f);
        singleObserver.onSubscribe(bVar);
        while (i < length && !bVar.isDisposed()) {
            SingleSource<? extends T> singleSource = singleSourceArr[i];
            if (singleSource == null) {
                bVar.mo36621a((Throwable) new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                singleSource.subscribe(bVar.f32274g[i]);
                i++;
            }
        }
    }
}
