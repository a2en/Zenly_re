package p389io.fabric.sdk.android.services.common;

import android.content.Context;
import java.lang.reflect.Method;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.Logger;

/* renamed from: io.fabric.sdk.android.services.common.n */
final class C12193n implements C12192m {

    /* renamed from: a */
    private final Method f31698a;

    /* renamed from: b */
    private final Object f31699b;

    private C12193n(Class cls, Object obj) throws NoSuchMethodException {
        this.f31699b = obj;
        this.f31698a = cls.getDeclaredMethod("isDataCollectionDefaultEnabled", new Class[0]);
    }

    /* renamed from: a */
    public static C12192m m32299a(Context context) {
        String str = "Fabric";
        try {
            Class loadClass = context.getClassLoader().loadClass("com.google.firebase.FirebaseApp");
            return new C12193n(loadClass, loadClass.getDeclaredMethod("getInstance", new Class[0]).invoke(loadClass, new Object[0]));
        } catch (ClassNotFoundException unused) {
            C12154c.m32113f().mo35954d(str, "Could not find class: com.google.firebase.FirebaseApp");
            return null;
        } catch (NoSuchMethodException e) {
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find method: ");
            sb.append(e.getMessage());
            f.mo35954d(str, sb.toString());
            return null;
        } catch (Exception e2) {
            C12154c.m32113f().mo35955d(str, "Unexpected error loading FirebaseApp instance.", e2);
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo36076a() {
        try {
            return ((Boolean) this.f31698a.invoke(this.f31699b, new Object[0])).booleanValue();
        } catch (Exception e) {
            C12154c.m32113f().mo35955d("Fabric", "Cannot check isDataCollectionDefaultEnabled on FirebaseApp.", e);
            return false;
        }
    }
}
