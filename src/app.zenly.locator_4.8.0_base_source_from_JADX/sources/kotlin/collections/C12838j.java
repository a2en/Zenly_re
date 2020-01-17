package kotlin.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.collections.j */
class C12838j extends C12836i {
    /* renamed from: a */
    public static <T> List<T> m33557a(T[] tArr) {
        C12932j.m33818b(tArr, "$this$asList");
        List<T> a = C12842l.m33588a(tArr);
        C12932j.m33815a((Object) a, "ArraysUtilJVM.asList(this)");
        return a;
    }

    /* renamed from: b */
    public static final <T> void m33563b(T[] tArr) {
        C12932j.m33818b(tArr, "$this$sort");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Object[] m33562a(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        m33561a(objArr, objArr2, i, i2, i3);
        return objArr2;
    }

    /* renamed from: a */
    public static final <T> T[] m33561a(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        C12932j.m33818b(tArr, "$this$copyInto");
        C12932j.m33818b(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m33559a(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        m33558a(fArr, f, i, i2);
    }

    /* renamed from: a */
    public static final void m33558a(float[] fArr, float f, int i, int i2) {
        C12932j.m33818b(fArr, "$this$fill");
        Arrays.fill(fArr, i, i2, f);
    }

    /* renamed from: a */
    public static final <T> void m33560a(T[] tArr, Comparator<? super T> comparator) {
        C12932j.m33818b(tArr, "$this$sortWith");
        C12932j.m33818b(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
