package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import kotlin.C12918j;
import kotlin.C12918j.C12919a;
import kotlin.C12949k;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.p413v.C13041a;
import kotlinx.coroutines.CopyableThrowable;

/* renamed from: kotlinx.coroutines.internal.f */
public final class C13089f {

    /* renamed from: a */
    private static final int f33673a = m34160b(Throwable.class, -1);

    /* renamed from: b */
    private static final ReentrantReadWriteLock f33674b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> f33675c = new WeakHashMap<>();

    /* renamed from: kotlinx.coroutines.internal.f$a */
    public static final class C13090a extends C12933k implements Function1<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f33676f;

        public C13090a(Constructor constructor) {
            this.f33676f = constructor;
            super(1);
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            C12932j.m33818b(th, "e");
            try {
                C12919a aVar = C12918j.f33499e;
                Object newInstance = this.f33676f.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    C12918j.m33783a(obj);
                    if (C12918j.m33785c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C12919a aVar2 = C12918j.f33499e;
                obj = C12949k.m33848a(th2);
                C12918j.m33783a(obj);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$b */
    public static final class C13091b extends C12933k implements Function1<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f33677f;

        public C13091b(Constructor constructor) {
            this.f33677f = constructor;
            super(1);
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            C12932j.m33818b(th, "e");
            try {
                C12919a aVar = C12918j.f33499e;
                Object newInstance = this.f33677f.newInstance(new Object[]{th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    C12918j.m33783a(obj);
                    if (C12918j.m33785c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C12919a aVar2 = C12918j.f33499e;
                obj = C12949k.m33848a(th2);
                C12918j.m33783a(obj);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$c */
    public static final class C13092c extends C12933k implements Function1<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f33678f;

        public C13092c(Constructor constructor) {
            this.f33678f = constructor;
            super(1);
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            C12932j.m33818b(th, "e");
            try {
                C12919a aVar = C12918j.f33499e;
                Object newInstance = this.f33678f.newInstance(new Object[]{th.getMessage()});
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    C12918j.m33783a(th2);
                    obj = th2;
                    if (C12918j.m33785c(obj)) {
                        obj = 0;
                    }
                    return (Throwable) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                C12919a aVar2 = C12918j.f33499e;
                Object obj2 = C12949k.m33848a(th3);
                C12918j.m33783a(obj2);
                obj = obj2;
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$d */
    public static final class C13093d extends C12933k implements Function1<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f33679f;

        public C13093d(Constructor constructor) {
            this.f33679f = constructor;
            super(1);
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            C12932j.m33818b(th, "e");
            try {
                C12919a aVar = C12918j.f33499e;
                Object newInstance = this.f33679f.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    C12918j.m33783a(th2);
                    obj = th2;
                    if (C12918j.m33785c(obj)) {
                        obj = 0;
                    }
                    return (Throwable) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                C12919a aVar2 = C12918j.f33499e;
                Object obj2 = C12949k.m33848a(th3);
                C12918j.m33783a(obj2);
                obj = obj2;
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$e */
    public static final class C13094e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Constructor constructor = (Constructor) t2;
            String str = "it";
            C12932j.m33815a((Object) constructor, str);
            Integer valueOf = Integer.valueOf(constructor.getParameterTypes().length);
            Constructor constructor2 = (Constructor) t;
            C12932j.m33815a((Object) constructor2, str);
            return C12998b.m33940a(valueOf, Integer.valueOf(constructor2.getParameterTypes().length));
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$f */
    static final class C13095f extends C12933k implements Function1 {

        /* renamed from: f */
        public static final C13095f f33680f = new C13095f();

        C13095f() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(Throwable th) {
            C12932j.m33818b(th, "it");
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$g */
    static final class C13096g extends C12933k implements Function1 {

        /* renamed from: f */
        public static final C13096g f33681f = new C13096g();

        C13096g() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(Throwable th) {
            C12932j.m33818b(th, "it");
            return null;
        }
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m34158a(E e) {
        E e2;
        C12932j.m33818b(e, "exception");
        E e3 = null;
        if (e instanceof CopyableThrowable) {
            try {
                C12919a aVar = C12918j.f33499e;
                e2 = ((CopyableThrowable) e).createCopy();
                C12918j.m33783a(e2);
            } catch (Throwable th) {
                C12919a aVar2 = C12918j.f33499e;
                e2 = C12949k.m33848a(th);
                C12918j.m33783a(e2);
            }
            if (C12918j.m33785c(e2)) {
                e2 = null;
            }
            return (Throwable) e2;
        }
        ReadLock readLock = f33674b.readLock();
        readLock.lock();
        try {
            Function1 function1 = (Function1) f33675c.get(e.getClass());
            if (function1 != null) {
                return (Throwable) function1.invoke(e);
            }
            int i = 0;
            if (f33673a != m34160b(e.getClass(), i)) {
                ReentrantReadWriteLock reentrantReadWriteLock = f33674b;
                ReadLock readLock2 = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock2.unlock();
                }
                WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    f33675c.put(e.getClass(), C13095f.f33680f);
                    C12956q qVar = C12956q.f33541a;
                    writeLock.unlock();
                    return null;
                } finally {
                    while (i < readHoldCount) {
                        readLock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
            } else {
                Constructor[] constructors = e.getClass().getConstructors();
                C12932j.m33815a((Object) constructors, "exception.javaClass.constructors");
                Function1 function12 = null;
                for (Constructor constructor : C12840k.m33578c(constructors, new C13094e())) {
                    C12932j.m33815a((Object) constructor, "constructor");
                    function12 = m34159a(constructor);
                    if (function12 != null) {
                        break;
                    }
                }
                ReentrantReadWriteLock reentrantReadWriteLock2 = f33674b;
                ReadLock readLock3 = reentrantReadWriteLock2.readLock();
                int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount2; i3++) {
                    readLock3.unlock();
                }
                WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                writeLock2.lock();
                try {
                    f33675c.put(e.getClass(), function12 != null ? function12 : C13096g.f33681f);
                    C12956q qVar2 = C12956q.f33541a;
                    writeLock2.unlock();
                    if (function12 != null) {
                        e3 = (Throwable) function12.invoke(e);
                    }
                    return e3;
                } finally {
                    while (i < readHoldCount2) {
                        readLock3.lock();
                        i++;
                    }
                    writeLock2.unlock();
                }
            }
        } finally {
            readLock.unlock();
        }
    }

    /* renamed from: b */
    private static final int m34160b(Class<?> cls, int i) {
        Object obj;
        C13041a.m34048a(cls);
        try {
            C12919a aVar = C12918j.f33499e;
            obj = Integer.valueOf(m34157a(cls, 0, 1, null));
            C12918j.m33783a(obj);
        } catch (Throwable th) {
            C12919a aVar2 = C12918j.f33499e;
            obj = C12949k.m33848a(th);
            C12918j.m33783a(obj);
        }
        Integer valueOf = Integer.valueOf(i);
        if (C12918j.m33785c(obj)) {
            obj = valueOf;
        }
        return ((Number) obj).intValue();
    }

    /* renamed from: a */
    private static final Function1<Throwable, Throwable> m34159a(Constructor<?> constructor) {
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new C13093d(constructor);
        }
        if (length == 1) {
            Class cls = parameterTypes[0];
            if (C12932j.m33817a((Object) cls, (Object) Throwable.class)) {
                return new C13091b(constructor);
            }
            if (C12932j.m33817a((Object) cls, (Object) String.class)) {
                return new C13092c(constructor);
            }
        } else if (length == 2 && C12932j.m33817a((Object) parameterTypes[0], (Object) String.class) && C12932j.m33817a((Object) parameterTypes[1], (Object) Throwable.class)) {
            return new C13090a(constructor);
        }
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ int m34157a(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m34156a(cls, i);
    }

    /* renamed from: a */
    private static final int m34156a(Class<?> cls, int i) {
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            C12932j.m33815a((Object) declaredFields, "declaredFields");
            int i2 = 0;
            for (Field field : declaredFields) {
                C12932j.m33815a((Object) field, "it");
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }
}
