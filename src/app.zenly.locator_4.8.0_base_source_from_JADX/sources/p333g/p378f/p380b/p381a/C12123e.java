package p333g.p378f.p380b.p381a;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* renamed from: g.f.b.a.e */
public class C12123e {
    /* renamed from: a */
    public static void m31999a() {
        String str = "accessFlags";
        int i = VERSION.SDK_INT;
        if (i < 28 && i >= 21) {
            try {
                Field declaredField = Typeface.class.getDeclaredField("sTypefaceCache");
                declaredField.setAccessible(true);
                try {
                    Field declaredField2 = Field.class.getDeclaredField(str);
                    declaredField2.setAccessible(true);
                    declaredField2.setInt(declaredField, declaredField.getModifiers() & -17);
                } catch (NoSuchFieldException unused) {
                    Field declaredField3 = Field.class.getDeclaredField("artField");
                    declaredField3.setAccessible(true);
                    Field declaredField4 = Class.forName("java.lang.reflect.ArtField").getDeclaredField(str);
                    declaredField4.setAccessible(true);
                    declaredField4.setInt(declaredField3.get(declaredField), declaredField.getModifiers() & -17);
                }
                if (declaredField.get(null) instanceof LongSparseArray) {
                    declaredField.set(null, new C12120b(3));
                } else {
                    declaredField.set(null, new C12122d(3));
                }
            } catch (Exception unused2) {
            }
        }
    }
}
