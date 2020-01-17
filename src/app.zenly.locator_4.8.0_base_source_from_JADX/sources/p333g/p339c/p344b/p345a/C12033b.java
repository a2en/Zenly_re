package p333g.p339c.p344b.p345a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: g.c.b.a.b */
public class C12033b {

    /* renamed from: a */
    private static volatile Integer f31341a;

    /* renamed from: a */
    private static void m31701a(ArrayList<Integer> arrayList, int i) {
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    private static int m31703b(Context context) {
        long a = C12031a.m31695a(context);
        if (a == -1) {
            return m31700a(context);
        }
        if (a <= 805306368) {
            return C12031a.m31698c() <= 1 ? 2009 : 2010;
        }
        int i = 2012;
        if (a <= 1073741824) {
            if (C12031a.m31691a() < 1300000) {
                i = 2011;
            }
            return i;
        } else if (a <= 1610612736) {
            if (C12031a.m31691a() >= 1800000) {
                i = 2013;
            }
            return i;
        } else if (a <= 2147483648L) {
            return 2013;
        } else {
            if (a <= 3221225472L) {
                return 2014;
            }
            return a <= 5368709120L ? 2015 : 2016;
        }
    }

    /* renamed from: c */
    public static int m31704c(Context context) {
        if (f31341a == null) {
            synchronized (C12033b.class) {
                if (f31341a == null) {
                    f31341a = Integer.valueOf(m31703b(context));
                }
            }
        }
        return f31341a.intValue();
    }

    /* renamed from: d */
    private static int m31705d(Context context) {
        long a = C12031a.m31695a(context);
        if (a <= 0) {
            return -1;
        }
        if (a <= 201326592) {
            return 2008;
        }
        if (a <= 304087040) {
            return 2009;
        }
        if (a <= 536870912) {
            return 2010;
        }
        if (a <= 1073741824) {
            return 2011;
        }
        if (a <= 1610612736) {
            return 2012;
        }
        return a <= 2147483648L ? 2013 : 2014;
    }

    /* renamed from: a */
    private static int m31700a(Context context) {
        ArrayList arrayList = new ArrayList();
        m31701a(arrayList, m31702b());
        m31701a(arrayList, m31699a());
        m31701a(arrayList, m31705d(context));
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        int size = (arrayList.size() / 2) - 1;
        return ((Integer) arrayList.get(size)).intValue() + ((((Integer) arrayList.get(size + 1)).intValue() - ((Integer) arrayList.get(size)).intValue()) / 2);
    }

    /* renamed from: b */
    private static int m31702b() {
        int c = C12031a.m31698c();
        if (c < 1) {
            return -1;
        }
        if (c == 1) {
            return 2008;
        }
        return c <= 3 ? 2011 : 2012;
    }

    /* renamed from: a */
    private static int m31699a() {
        long a = (long) C12031a.m31691a();
        if (a == -1) {
            return -1;
        }
        if (a <= 528000) {
            return 2008;
        }
        if (a <= 620000) {
            return 2009;
        }
        if (a <= 1020000) {
            return 2010;
        }
        if (a <= 1220000) {
            return 2011;
        }
        if (a <= 1520000) {
            return 2012;
        }
        return a <= 2020000 ? 2013 : 2014;
    }
}
