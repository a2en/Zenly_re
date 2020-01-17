package p333g.p357d.p358a.p361b.p362l;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: g.d.a.b.l.e */
public class C12081e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f31467b = new C12081e();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f31468a = new WeakHashMap<>();

    private C12081e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f31468a.containsKey(drawable)) {
            return (Integer) this.f31468a.get(drawable);
        }
        return Integer.valueOf(255);
    }

    /* renamed from: a */
    public void set(Drawable drawable, Integer num) {
        if (VERSION.SDK_INT < 19) {
            this.f31468a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
