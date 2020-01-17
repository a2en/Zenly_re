package app.zenly.locator.debug;

import com.crashlytics.android.C9252a;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p387h.p388a.C12143a.C12145b;

/* renamed from: app.zenly.locator.debug.a */
public final class C3438a extends C12145b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9970a(int i, String str, String str2, Throwable th) {
        C12932j.m33818b(str2, "message");
        if (!(i == 2 || i == 3 || i == 4 || i == 5)) {
            if (th != null) {
                String message = th.getMessage();
                if (message != null && C13029r.m34022a((CharSequence) message, (CharSequence) "context canceled", false, 2, (Object) null)) {
                    return;
                }
            }
            C9252a.m22272a(i, str, str2);
            if (th == null) {
                Exception exc = new Exception(str2);
                StackTraceElement[] stackTrace = exc.getStackTrace();
                C12932j.m33815a((Object) stackTrace, "exception.stackTrace");
                List a = C12840k.m33570a((Object[]) stackTrace, 1);
                Object obj = a.get(0);
                C12932j.m33815a(obj, "stackTrace[0]");
                String fileName = ((StackTraceElement) obj).getFileName();
                ArrayList arrayList = new ArrayList();
                for (Object next : a) {
                    StackTraceElement stackTraceElement = (StackTraceElement) next;
                    C12932j.m33815a((Object) stackTraceElement, "it");
                    if (!C12932j.m33817a((Object) stackTraceElement.getFileName(), (Object) fileName)) {
                        arrayList.add(next);
                    }
                }
                Object[] array = arrayList.toArray(new StackTraceElement[0]);
                if (array != null) {
                    exc.setStackTrace((StackTraceElement[]) array);
                    C9252a.m22276a((Throwable) exc);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                C9252a.m22276a(th);
            }
        }
    }
}
