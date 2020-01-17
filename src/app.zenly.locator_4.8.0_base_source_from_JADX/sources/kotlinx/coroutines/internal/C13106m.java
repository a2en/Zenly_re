package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import kotlin.C12899i;
import kotlin.C12918j;
import kotlin.C12918j.C12919a;
import kotlin.C12949k;
import kotlin.C12954o;
import kotlin.TypeCastException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.C13149u;

/* renamed from: kotlinx.coroutines.internal.m */
public final class C13106m {

    /* renamed from: a */
    private static final String f33698a;

    static {
        Object obj;
        Object obj2;
        try {
            C12919a aVar = C12918j.f33499e;
            Class cls = Class.forName("kotlin.coroutines.jvm.internal.a");
            C12932j.m33815a((Object) cls, "Class.forName(baseContinuationImplClass)");
            obj = cls.getCanonicalName();
            C12918j.m33783a(obj);
        } catch (Throwable th) {
            C12919a aVar2 = C12918j.f33499e;
            obj = C12949k.m33848a(th);
            C12918j.m33783a(obj);
        }
        if (C12918j.m33784b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f33698a = (String) obj;
        try {
            C12919a aVar3 = C12918j.f33499e;
            Class cls2 = Class.forName("kotlinx.coroutines.internal.m");
            C12932j.m33815a((Object) cls2, "Class.forName(stackTraceRecoveryClass)");
            obj2 = cls2.getCanonicalName();
            C12918j.m33783a(obj2);
        } catch (Throwable th2) {
            C12919a aVar4 = C12918j.f33499e;
            obj2 = C12949k.m33848a(th2);
            C12918j.m33783a(obj2);
        }
        if (C12918j.m33784b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str = (String) obj2;
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m34208a(E e, Continuation<?> continuation) {
        C12932j.m33818b(e, "exception");
        C12932j.m33818b(continuation, "continuation");
        return (!C13149u.m34327c() || !(continuation instanceof CoroutineStackFrame)) ? e : m34209a(e, (CoroutineStackFrame) continuation);
    }

    /* renamed from: b */
    public static final <E extends Throwable> E m34215b(E e) {
        C12932j.m33818b(e, "exception");
        if (!C13149u.m34327c()) {
            return e;
        }
        E cause = e.getCause();
        if (cause != null) {
            boolean z = true;
            if (!(!C12932j.m33817a((Object) cause.getClass(), (Object) e.getClass()))) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                C12932j.m33815a((Object) stackTrace, "exception.stackTrace");
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    C12932j.m33815a((Object) stackTraceElement, "it");
                    if (m34213a(stackTraceElement)) {
                        break;
                    }
                    i++;
                }
                if (z) {
                    return cause;
                }
            }
        }
        return e;
    }

    /* renamed from: a */
    private static final <E extends Throwable> E m34209a(E e, CoroutineStackFrame coroutineStackFrame) {
        C12899i a = m34211a(e);
        E e2 = (Throwable) a.mo37202a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) a.mo37203b();
        E a2 = C13089f.m34158a(e2);
        if (a2 == null) {
            return e;
        }
        ArrayDeque a3 = m34210a(coroutineStackFrame);
        if (a3.isEmpty()) {
            return e;
        }
        if (e2 != e) {
            m34212a(stackTraceElementArr, a3);
        }
        m34207a(e2, a2, a3);
        return a2;
    }

    /* renamed from: a */
    private static final <E extends Throwable> E m34207a(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m34206a("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        C12932j.m33815a((Object) stackTrace, "causeTrace");
        String str = f33698a;
        C12932j.m33815a((Object) str, "baseContinuationImplClassName");
        int a = m34205a(stackTrace, str);
        int i = 0;
        if (a == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e2.setStackTrace((StackTraceElement[]) array);
                return e2;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + a)];
        for (int i2 = 0; i2 < a; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        for (StackTraceElement stackTraceElement : arrayDeque) {
            stackTraceElementArr[a + i] = stackTraceElement;
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /* renamed from: a */
    private static final <E extends Throwable> C12899i<E, StackTraceElement[]> m34211a(E e) {
        boolean z;
        Throwable cause = e.getCause();
        if (cause == null || !C12932j.m33817a((Object) cause.getClass(), (Object) e.getClass())) {
            return C12954o.m33853a(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        C12932j.m33815a((Object) stackTrace, "currentTrace");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            C12932j.m33815a((Object) stackTraceElement, "it");
            if (m34213a(stackTraceElement)) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return C12954o.m33853a(cause, stackTrace);
        }
        return C12954o.m33853a(e, new StackTraceElement[0]);
    }

    /* renamed from: a */
    private static final ArrayDeque<StackTraceElement> m34210a(CoroutineStackFrame coroutineStackFrame) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (!(coroutineStackFrame instanceof CoroutineStackFrame)) {
                coroutineStackFrame = null;
            }
            if (coroutineStackFrame == null) {
                break;
            }
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                break;
            }
            StackTraceElement stackTraceElement2 = coroutineStackFrame.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
        return arrayDeque;
    }

    /* renamed from: a */
    public static final StackTraceElement m34206a(String str) {
        C12932j.m33818b(str, "message");
        StringBuilder sb = new StringBuilder();
        sb.append("\b\b\b(");
        sb.append(str);
        String sb2 = sb.toString();
        String str2 = "\b";
        return new StackTraceElement(sb2, str2, str2, -1);
    }

    /* renamed from: a */
    public static final boolean m34213a(StackTraceElement stackTraceElement) {
        C12932j.m33818b(stackTraceElement, "$this$isArtificial");
        String className = stackTraceElement.getClassName();
        C12932j.m33815a((Object) className, "className");
        return C13028q.m34003a(className, "\b\b\b", false, 2, null);
    }

    /* renamed from: a */
    private static final boolean m34214a(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C12932j.m33817a((Object) stackTraceElement.getMethodName(), (Object) stackTraceElement2.getMethodName()) && C12932j.m33817a((Object) stackTraceElement.getFileName(), (Object) stackTraceElement2.getFileName()) && C12932j.m33817a((Object) stackTraceElement.getClassName(), (Object) stackTraceElement2.getClassName());
    }

    /* renamed from: a */
    private static final void m34212a(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (m34213a(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 >= i2) {
            while (true) {
                StackTraceElement stackTraceElement = stackTraceElementArr[length2];
                Object last = arrayDeque.getLast();
                C12932j.m33815a(last, "result.last");
                if (m34214a(stackTraceElement, (StackTraceElement) last)) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i2) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static final int m34205a(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (C12932j.m33817a((Object) str, (Object) stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
}
