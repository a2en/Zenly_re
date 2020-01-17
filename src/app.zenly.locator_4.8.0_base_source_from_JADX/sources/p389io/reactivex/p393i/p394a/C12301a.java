package p389io.reactivex.p393i.p394a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscription;
import p389io.reactivex.exceptions.OnErrorNotImplementedException;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Function3;
import p389io.reactivex.functions.Function4;
import p389io.reactivex.functions.Function5;
import p389io.reactivex.functions.Function6;
import p389io.reactivex.functions.Function8;
import p389io.reactivex.functions.LongConsumer;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.a.a */
public final class C12301a {

    /* renamed from: a */
    static final Function<Object, Object> f31979a = new C12316o();

    /* renamed from: b */
    public static final Runnable f31980b = new C12313l();

    /* renamed from: c */
    public static final Action f31981c = new C12310i();

    /* renamed from: d */
    static final Consumer<Object> f31982d = new C12311j();

    /* renamed from: e */
    public static final Consumer<Throwable> f31983e = new C12322u();

    /* renamed from: f */
    static final Comparator<Object> f31984f = new C12320s();

    /* renamed from: io.reactivex.i.a.a$a */
    static final class C12302a<T> implements Consumer<T> {

        /* renamed from: e */
        final Action f31985e;

        C12302a(Action action) {
            this.f31985e = action;
        }

        public void accept(T t) throws Exception {
            this.f31985e.run();
        }
    }

    /* renamed from: io.reactivex.i.a.a$b */
    static final class C12303b<T1, T2, R> implements Function<Object[], R> {

        /* renamed from: e */
        final BiFunction<? super T1, ? super T2, ? extends R> f31986e;

        C12303b(BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
            this.f31986e = biFunction;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f31986e.apply(objArr[0], objArr[1]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 2 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: io.reactivex.i.a.a$c */
    static final class C12304c<T1, T2, T3, R> implements Function<Object[], R> {

        /* renamed from: e */
        final Function3<T1, T2, T3, R> f31987e;

        C12304c(Function3<T1, T2, T3, R> function3) {
            this.f31987e = function3;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 3) {
                return this.f31987e.apply(objArr[0], objArr[1], objArr[2]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 3 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: io.reactivex.i.a.a$d */
    static final class C12305d<T1, T2, T3, T4, R> implements Function<Object[], R> {

        /* renamed from: e */
        final Function4<T1, T2, T3, T4, R> f31988e;

        C12305d(Function4<T1, T2, T3, T4, R> function4) {
            this.f31988e = function4;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 4) {
                return this.f31988e.apply(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 4 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: io.reactivex.i.a.a$e */
    static final class C12306e<T1, T2, T3, T4, T5, R> implements Function<Object[], R> {

        /* renamed from: e */
        private final Function5<T1, T2, T3, T4, T5, R> f31989e;

        C12306e(Function5<T1, T2, T3, T4, T5, R> function5) {
            this.f31989e = function5;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 5) {
                return this.f31989e.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 5 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: io.reactivex.i.a.a$f */
    static final class C12307f<T1, T2, T3, T4, T5, T6, R> implements Function<Object[], R> {

        /* renamed from: e */
        final Function6<T1, T2, T3, T4, T5, T6, R> f31990e;

        C12307f(Function6<T1, T2, T3, T4, T5, T6, R> function6) {
            this.f31990e = function6;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 6) {
                return this.f31990e.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 6 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: io.reactivex.i.a.a$g */
    static final class C12308g<T1, T2, T3, T4, T5, T6, T7, T8, R> implements Function<Object[], R> {

        /* renamed from: e */
        final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f31991e;

        C12308g(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8) {
            this.f31991e = function8;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 8) {
                return this.f31991e.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 8 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: io.reactivex.i.a.a$h */
    static final class C12309h<T> implements Callable<List<T>> {

        /* renamed from: e */
        final int f31992e;

        C12309h(int i) {
            this.f31992e = i;
        }

        public List<T> call() throws Exception {
            return new ArrayList(this.f31992e);
        }
    }

    /* renamed from: io.reactivex.i.a.a$i */
    static final class C12310i implements Action {
        C12310i() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: io.reactivex.i.a.a$j */
    static final class C12311j implements Consumer<Object> {
        C12311j() {
        }

        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: io.reactivex.i.a.a$k */
    static final class C12312k implements LongConsumer {
        C12312k() {
        }

        public void accept(long j) {
        }
    }

    /* renamed from: io.reactivex.i.a.a$l */
    static final class C12313l implements Runnable {
        C12313l() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: io.reactivex.i.a.a$m */
    static final class C12314m implements Consumer<Throwable> {
        C12314m() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            C12768a.m33415b(th);
        }
    }

    /* renamed from: io.reactivex.i.a.a$n */
    static final class C12315n implements Predicate<Object> {
        C12315n() {
        }

        public boolean test(Object obj) {
            return false;
        }
    }

    /* renamed from: io.reactivex.i.a.a$o */
    static final class C12316o implements Function<Object, Object> {
        C12316o() {
        }

        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: io.reactivex.i.a.a$p */
    static final class C12317p<T, U> implements Callable<U>, Function<T, U> {

        /* renamed from: e */
        final U f31993e;

        C12317p(U u) {
            this.f31993e = u;
        }

        public U apply(T t) throws Exception {
            return this.f31993e;
        }

        public U call() throws Exception {
            return this.f31993e;
        }
    }

    /* renamed from: io.reactivex.i.a.a$q */
    static final class C12318q<T> implements Function<List<T>, List<T>> {

        /* renamed from: e */
        final Comparator<? super T> f31994e;

        C12318q(Comparator<? super T> comparator) {
            this.f31994e = comparator;
        }

        /* renamed from: a */
        public List<T> mo36573a(List<T> list) {
            Collections.sort(list, this.f31994e);
            return list;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) throws Exception {
            List list = (List) obj;
            mo36573a(list);
            return list;
        }
    }

    /* renamed from: io.reactivex.i.a.a$r */
    static final class C12319r implements Consumer<Subscription> {
        C12319r() {
        }

        /* renamed from: a */
        public void accept(Subscription subscription) throws Exception {
            subscription.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: io.reactivex.i.a.a$s */
    static final class C12320s implements Comparator<Object> {
        C12320s() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: io.reactivex.i.a.a$t */
    static final class C12321t implements Callable<Object> {
        C12321t() {
        }

        public Object call() {
            return null;
        }
    }

    /* renamed from: io.reactivex.i.a.a$u */
    static final class C12322u implements Consumer<Throwable> {
        C12322u() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            C12768a.m33415b((Throwable) new OnErrorNotImplementedException(th));
        }
    }

    /* renamed from: io.reactivex.i.a.a$v */
    static final class C12323v implements Predicate<Object> {
        C12323v() {
        }

        public boolean test(Object obj) {
            return true;
        }
    }

    static {
        new C12314m();
        new C12312k();
        new C12323v();
        new C12315n();
        new C12321t();
        new C12319r();
    }

    /* renamed from: a */
    public static <T1, T2, R> Function<Object[], R> m32810a(BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C12324b.m32836a(biFunction, "f is null");
        return new C12303b(biFunction);
    }

    /* renamed from: b */
    public static <T> Function<T, T> m32819b() {
        return f31979a;
    }

    /* renamed from: c */
    public static <T> Comparator<T> m32821c() {
        return f31984f;
    }

    /* renamed from: b */
    public static <T, U> Function<T, U> m32820b(U u) {
        return new C12317p(u);
    }

    /* renamed from: a */
    public static <T1, T2, T3, R> Function<Object[], R> m32811a(Function3<T1, T2, T3, R> function3) {
        C12324b.m32836a(function3, "f is null");
        return new C12304c(function3);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, R> Function<Object[], R> m32812a(Function4<T1, T2, T3, T4, R> function4) {
        C12324b.m32836a(function4, "f is null");
        return new C12305d(function4);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, R> Function<Object[], R> m32813a(Function5<T1, T2, T3, T4, T5, R> function5) {
        C12324b.m32836a(function5, "f is null");
        return new C12306e(function5);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, R> Function<Object[], R> m32814a(Function6<T1, T2, T3, T4, T5, T6, R> function6) {
        C12324b.m32836a(function6, "f is null");
        return new C12307f(function6);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Function<Object[], R> m32815a(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8) {
        C12324b.m32836a(function8, "f is null");
        return new C12308g(function8);
    }

    /* renamed from: a */
    public static <T> Consumer<T> m32808a() {
        return f31982d;
    }

    /* renamed from: a */
    public static <T> Callable<T> m32818a(T t) {
        return new C12317p(t);
    }

    /* renamed from: a */
    public static <T> Callable<List<T>> m32817a(int i) {
        return new C12309h(i);
    }

    /* renamed from: a */
    public static <T> Consumer<T> m32809a(Action action) {
        return new C12302a(action);
    }

    /* renamed from: a */
    public static <T> Function<List<T>, List<T>> m32816a(Comparator<? super T> comparator) {
        return new C12318q(comparator);
    }
}
