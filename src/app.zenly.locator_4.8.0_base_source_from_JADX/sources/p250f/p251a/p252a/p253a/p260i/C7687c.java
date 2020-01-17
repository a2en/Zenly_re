package p250f.p251a.p252a.p253a.p260i;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.C7653b;

/* renamed from: f.a.a.a.i.c */
public final class C7687c {

    /* renamed from: a */
    public static final C7687c f19315a = new C7687c();

    private C7687c() {
    }

    /* renamed from: a */
    public static final String m18719a(Context context, List<?> list) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(list, "tokens");
        return f19315a.m18720a(context, list, C7653b.cldr_miscellaneous_list_andList_2, C7653b.cldr_miscellaneous_list_andList_start, C7653b.cldr_miscellaneous_list_andList_middle, C7653b.cldr_miscellaneous_list_andList_end);
    }

    /* renamed from: b */
    public static final String m18721b(Context context, List<?> list) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(list, "tokens");
        return f19315a.m18720a(context, list, C7653b.cldr_miscellaneous_list_narrowUnitList_2, C7653b.cldr_miscellaneous_list_narrowUnitList_start, C7653b.cldr_miscellaneous_list_narrowUnitList_middle, C7653b.cldr_miscellaneous_list_narrowUnitList_end);
    }

    /* renamed from: c */
    public static final String m18722c(Context context, List<?> list) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(list, "tokens");
        return f19315a.m18720a(context, list, C7653b.cldr_miscellaneous_list_shortUnitList_2, C7653b.cldr_miscellaneous_list_shortUnitList_start, C7653b.cldr_miscellaneous_list_shortUnitList_middle, C7653b.cldr_miscellaneous_list_shortUnitList_end);
    }

    /* renamed from: a */
    private final String m18720a(Context context, List<?> list, int i, int i2, int i3, int i4) {
        int size = list.size();
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return String.valueOf(list.get(0));
        }
        if (size != 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(list.get(0)));
            sb.append(context.getString(i2));
            int i5 = size - 1;
            sb.append(TextUtils.join(context.getString(i3), list.subList(1, i5)));
            sb.append(context.getString(i4));
            sb.append(list.get(i5));
            return sb.toString();
        }
        String join = TextUtils.join(context.getString(i), list);
        C12932j.m33815a((Object) join, "TextUtils.join(context.getString(two), tokens)");
        return join;
    }
}
