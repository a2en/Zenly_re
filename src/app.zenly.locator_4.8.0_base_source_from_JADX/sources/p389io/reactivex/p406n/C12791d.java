package p389io.reactivex.p406n;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.util.C12760i;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.n.d */
public final class C12791d<T> extends C12798f<T> {

    /* renamed from: h */
    static final C12794c[] f33362h = new C12794c[0];

    /* renamed from: i */
    static final C12794c[] f33363i = new C12794c[0];

    /* renamed from: e */
    final C12793b<T> f33364e;

    /* renamed from: f */
    final AtomicReference<C12794c<T>[]> f33365f = new AtomicReference<>(f33362h);

    /* renamed from: g */
    boolean f33366g;

    /* renamed from: io.reactivex.n.d$a */
    static final class C12792a<T> extends AtomicReference<C12792a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* renamed from: e */
        final T f33367e;

        C12792a(T t) {
            this.f33367e = t;
        }
    }

    /* renamed from: io.reactivex.n.d$b */
    interface C12793b<T> {
        /* renamed from: a */
        void mo36978a(C12794c<T> cVar);

        /* renamed from: a */
        void mo36979a(Object obj);

        void add(T t);

        boolean compareAndSet(Object obj, Object obj2);
    }

    /* renamed from: io.reactivex.n.d$c */
    static final class C12794c<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 466549804534799122L;

        /* renamed from: e */
        final Observer<? super T> f33368e;

        /* renamed from: f */
        final C12791d<T> f33369f;

        /* renamed from: g */
        Object f33370g;

        /* renamed from: h */
        volatile boolean f33371h;

        C12794c(Observer<? super T> observer, C12791d<T> dVar) {
            this.f33368e = observer;
            this.f33369f = dVar;
        }

        public void dispose() {
            if (!this.f33371h) {
                this.f33371h = true;
                this.f33369f.mo36976b(this);
            }
        }

        public boolean isDisposed() {
            return this.f33371h;
        }
    }

    /* renamed from: io.reactivex.n.d$d */
    static final class C12795d<T> extends AtomicReference<Object> implements C12793b<T> {
        private static final long serialVersionUID = 1107649250281456395L;

        /* renamed from: e */
        final int f33372e;

        /* renamed from: f */
        int f33373f;

        /* renamed from: g */
        volatile C12792a<Object> f33374g;

        /* renamed from: h */
        C12792a<Object> f33375h;

        /* renamed from: i */
        volatile boolean f33376i;

        C12795d(int i) {
            C12324b.m32833a(i, "maxSize");
            this.f33372e = i;
            C12792a<Object> aVar = new C12792a<>(null);
            this.f33375h = aVar;
            this.f33374g = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36982a() {
            int i = this.f33373f;
            if (i > this.f33372e) {
                this.f33373f = i - 1;
                this.f33374g = (C12792a) this.f33374g.get();
            }
        }

        public void add(T t) {
            C12792a<Object> aVar = new C12792a<>(t);
            C12792a<Object> aVar2 = this.f33375h;
            this.f33375h = aVar;
            this.f33373f++;
            aVar2.set(aVar);
            mo36982a();
        }

        /* renamed from: b */
        public void mo36983b() {
            C12792a<Object> aVar = this.f33374g;
            if (aVar.f33367e != null) {
                C12792a<Object> aVar2 = new C12792a<>(null);
                aVar2.lazySet(aVar.get());
                this.f33374g = aVar2;
            }
        }

        /* renamed from: a */
        public void mo36979a(Object obj) {
            C12792a<Object> aVar = new C12792a<>(obj);
            C12792a<Object> aVar2 = this.f33375h;
            this.f33375h = aVar;
            this.f33373f++;
            aVar2.lazySet(aVar);
            mo36983b();
            this.f33376i = true;
        }

        /* renamed from: a */
        public void mo36978a(C12794c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                Observer<? super T> observer = cVar.f33368e;
                C12792a<Object> aVar = (C12792a) cVar.f33370g;
                if (aVar == null) {
                    aVar = this.f33374g;
                }
                int i = 1;
                while (!cVar.f33371h) {
                    C12792a<Object> aVar2 = (C12792a) aVar.get();
                    if (aVar2 != null) {
                        T t = aVar2.f33367e;
                        if (!this.f33376i || aVar2.get() != null) {
                            observer.onNext(t);
                            aVar = aVar2;
                        } else {
                            if (C12760i.m33370c(t)) {
                                observer.onComplete();
                            } else {
                                observer.onError(C12760i.m33365a((Object) t));
                            }
                            cVar.f33370g = null;
                            cVar.f33371h = true;
                            return;
                        }
                    } else if (aVar.get() != null) {
                        continue;
                    } else {
                        cVar.f33370g = aVar;
                        i = cVar.addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                cVar.f33370g = null;
            }
        }
    }

    /* renamed from: io.reactivex.n.d$e */
    static final class C12796e<T> extends AtomicReference<Object> implements C12793b<T> {
        private static final long serialVersionUID = -733876083048047795L;

        /* renamed from: e */
        final List<Object> f33377e;

        /* renamed from: f */
        volatile boolean f33378f;

        /* renamed from: g */
        volatile int f33379g;

        C12796e(int i) {
            C12324b.m32833a(i, "capacityHint");
            this.f33377e = new ArrayList(i);
        }

        /* renamed from: a */
        public void mo36984a() {
        }

        /* renamed from: a */
        public void mo36979a(Object obj) {
            this.f33377e.add(obj);
            mo36984a();
            this.f33379g++;
            this.f33378f = true;
        }

        public void add(T t) {
            this.f33377e.add(t);
            this.f33379g++;
        }

        /* renamed from: a */
        public void mo36978a(C12794c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                List<Object> list = this.f33377e;
                Observer<? super T> observer = cVar.f33368e;
                Integer num = (Integer) cVar.f33370g;
                int i = 0;
                if (num != null) {
                    i = num.intValue();
                } else {
                    cVar.f33370g = Integer.valueOf(0);
                }
                int i2 = 1;
                while (!cVar.f33371h) {
                    int i3 = this.f33379g;
                    while (i3 != i) {
                        if (cVar.f33371h) {
                            cVar.f33370g = null;
                            return;
                        }
                        Object obj = list.get(i);
                        if (this.f33378f) {
                            int i4 = i + 1;
                            if (i4 == i3) {
                                i3 = this.f33379g;
                                if (i4 == i3) {
                                    if (C12760i.m33370c(obj)) {
                                        observer.onComplete();
                                    } else {
                                        observer.onError(C12760i.m33365a(obj));
                                    }
                                    cVar.f33370g = null;
                                    cVar.f33371h = true;
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                        observer.onNext(obj);
                        i++;
                    }
                    if (i == this.f33379g) {
                        cVar.f33370g = Integer.valueOf(i);
                        i2 = cVar.addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                }
                cVar.f33370g = null;
            }
        }
    }

    C12791d(C12793b<T> bVar) {
        this.f33364e = bVar;
    }

    /* renamed from: f */
    public static <T> C12791d<T> m33469f(int i) {
        return new C12791d<>(new C12796e(i));
    }

    /* renamed from: g */
    public static <T> C12791d<T> m33470g(int i) {
        return new C12791d<>(new C12795d(i));
    }

    /* renamed from: s */
    public static <T> C12791d<T> m33471s() {
        return new C12791d<>(new C12796e(16));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12794c cVar = new C12794c(observer, this);
        observer.onSubscribe(cVar);
        if (!cVar.f33371h) {
            if (!mo36975a(cVar) || !cVar.f33371h) {
                this.f33364e.mo36978a(cVar);
            } else {
                mo36976b(cVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36976b(C12794c<T> cVar) {
        C12794c<T>[] cVarArr;
        C12794c[] cVarArr2;
        do {
            cVarArr = (C12794c[]) this.f33365f.get();
            if (cVarArr != f33363i && cVarArr != f33362h) {
                int length = cVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (cVarArr[i2] == cVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        cVarArr2 = f33362h;
                    } else {
                        C12794c[] cVarArr3 = new C12794c[(length - 1)];
                        System.arraycopy(cVarArr, 0, cVarArr3, 0, i);
                        System.arraycopy(cVarArr, i + 1, cVarArr3, i, (length - i) - 1);
                        cVarArr2 = cVarArr3;
                    }
                } else {
                    return;
                }
            }
        } while (!this.f33365f.compareAndSet(cVarArr, cVarArr2));
    }

    public void onComplete() {
        if (!this.f33366g) {
            this.f33366g = true;
            Object a = C12760i.m33361a();
            C12793b<T> bVar = this.f33364e;
            bVar.mo36979a(a);
            for (C12794c a2 : mo36977f(a)) {
                bVar.mo36978a(a2);
            }
        }
    }

    public void onError(Throwable th) {
        C12324b.m32836a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f33366g) {
            C12768a.m33415b(th);
            return;
        }
        this.f33366g = true;
        Object a = C12760i.m33363a(th);
        C12793b<T> bVar = this.f33364e;
        bVar.mo36979a(a);
        for (C12794c a2 : mo36977f(a)) {
            bVar.mo36978a(a2);
        }
    }

    public void onNext(T t) {
        C12324b.m32836a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f33366g) {
            C12793b<T> bVar = this.f33364e;
            bVar.add(t);
            for (C12794c a : (C12794c[]) this.f33365f.get()) {
                bVar.mo36978a(a);
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (this.f33366g) {
            disposable.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C12794c<T>[] mo36977f(Object obj) {
        if (this.f33364e.compareAndSet(null, obj)) {
            return (C12794c[]) this.f33365f.getAndSet(f33363i);
        }
        return f33363i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo36975a(C12794c<T> cVar) {
        C12794c[] cVarArr;
        C12794c[] cVarArr2;
        do {
            cVarArr = (C12794c[]) this.f33365f.get();
            if (cVarArr == f33363i) {
                return false;
            }
            int length = cVarArr.length;
            cVarArr2 = new C12794c[(length + 1)];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
        } while (!this.f33365f.compareAndSet(cVarArr, cVarArr2));
        return true;
    }
}
