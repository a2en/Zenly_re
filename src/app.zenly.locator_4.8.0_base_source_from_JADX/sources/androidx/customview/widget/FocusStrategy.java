package androidx.customview.widget;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class FocusStrategy {

    public interface BoundsAdapter<T> {
        void obtainBounds(T t, Rect rect);
    }

    public interface CollectionAdapter<T, V> {
        V get(T t, int i);

        int size(T t);
    }

    /* renamed from: androidx.customview.widget.FocusStrategy$a */
    private static class C0690a<T> implements Comparator<T> {

        /* renamed from: e */
        private final Rect f2933e = new Rect();

        /* renamed from: f */
        private final Rect f2934f = new Rect();

        /* renamed from: g */
        private final boolean f2935g;

        /* renamed from: h */
        private final BoundsAdapter<T> f2936h;

        C0690a(boolean z, BoundsAdapter<T> boundsAdapter) {
            this.f2935g = z;
            this.f2936h = boundsAdapter;
        }

        public int compare(T t, T t2) {
            Rect rect = this.f2933e;
            Rect rect2 = this.f2934f;
            this.f2936h.obtainBounds(t, rect);
            this.f2936h.obtainBounds(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            int i3 = -1;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i4 = rect.left;
            int i5 = rect2.left;
            if (i4 < i5) {
                if (this.f2935g) {
                    i3 = 1;
                }
                return i3;
            } else if (i4 > i5) {
                if (!this.f2935g) {
                    i3 = 1;
                }
                return i3;
            } else {
                int i6 = rect.bottom;
                int i7 = rect2.bottom;
                if (i6 < i7) {
                    return -1;
                }
                if (i6 > i7) {
                    return 1;
                }
                int i8 = rect.right;
                int i9 = rect2.right;
                if (i8 < i9) {
                    if (this.f2935g) {
                        i3 = 1;
                    }
                    return i3;
                } else if (i8 <= i9) {
                    return 0;
                } else {
                    if (!this.f2935g) {
                        i3 = 1;
                    }
                    return i3;
                }
            }
        }
    }

    /* renamed from: a */
    private static int m3209a(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: a */
    public static <L, T> T m3210a(L l, CollectionAdapter<L, T> collectionAdapter, BoundsAdapter<T> boundsAdapter, T t, int i, boolean z, boolean z2) {
        int size = collectionAdapter.size(l);
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(collectionAdapter.get(l, i2));
        }
        Collections.sort(arrayList, new C0690a(z, boundsAdapter));
        if (i == 1) {
            return m3216b(t, arrayList, z2);
        }
        if (i == 2) {
            return m3212a(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: b */
    private static <T> T m3216b(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = size;
        } else {
            i = arrayList.indexOf(t);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: c */
    private static int m3219c(int i, Rect rect, Rect rect2) {
        return Math.max(0, m3220d(i, rect, rect2));
    }

    /* renamed from: d */
    private static int m3220d(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: e */
    private static int m3221e(int i, Rect rect, Rect rect2) {
        return Math.max(1, m3222f(i, rect, rect2));
    }

    /* renamed from: f */
    private static int m3222f(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: g */
    private static int m3223g(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    /* renamed from: b */
    private static boolean m3218b(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean z = false;
        if (!m3215a(rect, rect2, i)) {
            return false;
        }
        if (!m3215a(rect, rect3, i) || m3214a(i, rect, rect2, rect3)) {
            return true;
        }
        if (m3214a(i, rect, rect3, rect2)) {
            return false;
        }
        if (m3209a(m3219c(i, rect, rect2), m3223g(i, rect, rect2)) < m3209a(m3219c(i, rect, rect3), m3223g(i, rect, rect3))) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static <T> T m3212a(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = -1;
        } else {
            i = arrayList.lastIndexOf(t);
        }
        int i2 = i + 1;
        if (i2 < size) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: a */
    public static <L, T> T m3211a(L l, CollectionAdapter<L, T> collectionAdapter, BoundsAdapter<T> boundsAdapter, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t2 = null;
        int size = collectionAdapter.size(l);
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < size; i2++) {
            T t3 = collectionAdapter.get(l, i2);
            if (t3 != t) {
                boundsAdapter.obtainBounds(t3, rect3);
                if (m3218b(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = t3;
                }
            }
        }
        return t2;
    }

    /* renamed from: b */
    private static boolean m3217b(int i, Rect rect, Rect rect2) {
        boolean z = true;
        if (i == 17) {
            if (rect.left < rect2.right) {
                z = false;
            }
            return z;
        } else if (i == 33) {
            if (rect.top < rect2.bottom) {
                z = false;
            }
            return z;
        } else if (i == 66) {
            if (rect.right > rect2.left) {
                z = false;
            }
            return z;
        } else if (i == 130) {
            if (rect.bottom > rect2.top) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: a */
    private static boolean m3214a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean a = m3213a(i, rect, rect2);
        if (m3213a(i, rect, rect3) || !a) {
            return false;
        }
        boolean z = true;
        if (!m3217b(i, rect, rect3)) {
            return true;
        }
        if (!(i == 17 || i == 66 || m3219c(i, rect, rect2) < m3221e(i, rect, rect3))) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m3215a(Rect rect, Rect rect2, int i) {
        boolean z = true;
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 <= i3 && rect.left < i3) || rect.left <= rect2.left) {
                z = false;
            }
            return z;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 <= i5 && rect.top < i5) || rect.top <= rect2.top) {
                z = false;
            }
            return z;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 >= i7 && rect.right > i7) || rect.right >= rect2.right) {
                z = false;
            }
            return z;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 >= i9 && rect.bottom > i9) || rect.bottom >= rect2.bottom) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: a */
    private static boolean m3213a(int i, Rect rect, Rect rect2) {
        boolean z = true;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                z = false;
            }
            return z;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            z = false;
        }
        return z;
    }
}
