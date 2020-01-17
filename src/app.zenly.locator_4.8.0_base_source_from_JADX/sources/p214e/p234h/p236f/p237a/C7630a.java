package p214e.p234h.p236f.p237a;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;
import java.util.WeakHashMap;

/* renamed from: e.h.f.a.a */
public final class C7630a {

    /* renamed from: b */
    private static final WeakHashMap<Context, C7630a> f19210b = new WeakHashMap<>();

    /* renamed from: a */
    private final Context f19211a;

    private C7630a(Context context) {
        this.f19211a = context;
    }

    /* renamed from: a */
    public static C7630a m18582a(Context context) {
        C7630a aVar;
        synchronized (f19210b) {
            aVar = (C7630a) f19210b.get(context);
            if (aVar == null) {
                aVar = new C7630a(context);
                f19210b.put(context, aVar);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public Display mo19749a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return ((DisplayManager) this.f19211a.getSystemService("display")).getDisplay(i);
        }
        Display defaultDisplay = ((WindowManager) this.f19211a.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay.getDisplayId() == i) {
            return defaultDisplay;
        }
        return null;
    }
}
