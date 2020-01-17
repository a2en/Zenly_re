package com.snap.p327ui.recycling.factory;

import android.os.Build.VERSION;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: com.snap.ui.recycling.factory.b */
public class C11726b {
    /* renamed from: a */
    public static void m30817a(boolean z) {
        if (!z) {
            int i = VERSION.SDK_INT;
            if (i < 24 || i >= 26) {
                return;
            }
        }
        m30816a();
    }

    /* renamed from: a */
    public static void m30816a() {
        try {
            Field declaredField = LayoutInflater.class.getDeclaredField("sConstructorMap");
            declaredField.setAccessible(true);
            Field declaredField2 = Field.class.getDeclaredField("accessFlags");
            declaredField2.setAccessible(true);
            declaredField2.setInt(declaredField, declaredField.getModifiers() & -17);
            declaredField.set(null, new C11725a());
        } catch (Exception unused) {
        }
    }
}
