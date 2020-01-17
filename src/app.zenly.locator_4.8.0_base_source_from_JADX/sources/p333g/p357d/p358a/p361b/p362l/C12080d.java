package p333g.p357d.p358a.p361b.p362l;

import android.util.Property;
import android.view.ViewGroup;
import p333g.p357d.p358a.p361b.C12071f;

/* renamed from: g.d.a.b.l.d */
public class C12080d extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f31466a = new C12080d("childrenAlpha");

    private C12080d(String str) {
        super(Float.class, str);
    }

    /* renamed from: a */
    public Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(C12071f.mtrl_internal_children_alpha_tag);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    /* renamed from: a */
    public void set(ViewGroup viewGroup, Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(C12071f.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
