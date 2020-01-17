package p389io.reactivex.internal.util;

import java.io.Serializable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.internal.util.i */
public enum C12760i {
    COMPLETE;

    /* renamed from: io.reactivex.internal.util.i$a */
    static final class C12761a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;

        /* renamed from: e */
        final Disposable f33273e;

        C12761a(Disposable disposable) {
            this.f33273e = disposable;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationLite.Disposable[");
            sb.append(this.f33273e);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: io.reactivex.internal.util.i$b */
    static final class C12762b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: e */
        final Throwable f33274e;

        C12762b(Throwable th) {
            this.f33274e = th;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12762b)) {
                return false;
            }
            return C12324b.m32837a((Object) this.f33274e, (Object) ((C12762b) obj).f33274e);
        }

        public int hashCode() {
            return this.f33274e.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationLite.Error[");
            sb.append(this.f33274e);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: io.reactivex.internal.util.i$c */
    static final class C12763c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;

        /* renamed from: e */
        final Subscription f33275e;

        C12763c(Subscription subscription) {
            this.f33275e = subscription;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationLite.Subscription[");
            sb.append(this.f33275e);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static Object m33361a() {
        return COMPLETE;
    }

    /* renamed from: b */
    public static <T> T m33368b(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static <T> boolean m33369b(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        } else if (obj instanceof C12762b) {
            observer.onError(((C12762b) obj).f33274e);
            return true;
        } else if (obj instanceof C12761a) {
            observer.onSubscribe(((C12761a) obj).f33273e);
            return false;
        } else {
            observer.onNext(obj);
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m33370c(Object obj) {
        return obj == COMPLETE;
    }

    /* renamed from: d */
    public static boolean m33371d(Object obj) {
        return obj instanceof C12762b;
    }

    /* renamed from: e */
    public static <T> Object m33372e(T t) {
        return t;
    }

    public String toString() {
        return "NotificationLite.Complete";
    }

    /* renamed from: a */
    public static Object m33363a(Throwable th) {
        return new C12762b(th);
    }

    /* renamed from: a */
    public static Object m33364a(Subscription subscription) {
        return new C12763c(subscription);
    }

    /* renamed from: a */
    public static Object m33362a(Disposable disposable) {
        return new C12761a(disposable);
    }

    /* renamed from: a */
    public static Throwable m33365a(Object obj) {
        return ((C12762b) obj).f33274e;
    }

    /* renamed from: a */
    public static <T> boolean m33366a(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        } else if (obj instanceof C12762b) {
            observer.onError(((C12762b) obj).f33274e);
            return true;
        } else {
            observer.onNext(obj);
            return false;
        }
    }

    /* renamed from: a */
    public static <T> boolean m33367a(Object obj, Subscriber<? super T> subscriber) {
        if (obj == COMPLETE) {
            subscriber.onComplete();
            return true;
        } else if (obj instanceof C12762b) {
            subscriber.onError(((C12762b) obj).f33274e);
            return true;
        } else if (obj instanceof C12763c) {
            subscriber.onSubscribe(((C12763c) obj).f33275e);
            return false;
        } else {
            subscriber.onNext(obj);
            return false;
        }
    }
}
