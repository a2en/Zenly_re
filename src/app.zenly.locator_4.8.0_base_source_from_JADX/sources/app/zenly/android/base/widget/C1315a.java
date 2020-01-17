package app.zenly.android.base.widget;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.widget.TextView;
import androidx.core.content.C0540a;
import java.util.Arrays;
import kotlin.C12898h;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p250f.p251a.p252a.p253a.C7652a;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

/* renamed from: app.zenly.android.base.widget.a */
public final class C1315a {

    /* renamed from: a */
    private static final ColorDrawable f4923a = new ColorDrawable();

    /* renamed from: app.zenly.android.base.widget.a$a */
    static final class C1316a extends C12933k implements Function0<Drawable[]> {

        /* renamed from: f */
        final /* synthetic */ TextView f4924f;

        C1316a(TextView textView) {
            this.f4924f = textView;
            super(0);
        }

        public final Drawable[] invoke() {
            return this.f4924f.getCompoundDrawablesRelative();
        }
    }

    /* renamed from: app.zenly.android.base.widget.a$b */
    static final class C1317b extends C12933k implements Function0<Drawable[]> {

        /* renamed from: f */
        final /* synthetic */ TextView f4925f;

        C1317b(TextView textView) {
            this.f4925f = textView;
            super(0);
        }

        public final Drawable[] invoke() {
            return this.f4925f.getCompoundDrawablesRelative();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m6316a(TextView textView, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = C7652a.drawable_sentinel;
        }
        if ((i5 & 2) != 0) {
            i2 = C7652a.drawable_sentinel;
        }
        if ((i5 & 4) != 0) {
            i3 = C7652a.drawable_sentinel;
        }
        if ((i5 & 8) != 0) {
            i4 = C7652a.drawable_sentinel;
        }
        m6315a(textView, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static final void m6315a(TextView textView, int i, int i2, int i3, int i4) {
        C12932j.m33818b(textView, "$this$updateCompoundDrawablesRelativeWithIntrinsicBounds");
        Lazy a = C12896f.m33750a(C12898h.NONE, new C1316a(textView));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(m6314a(textView, i, a, 0), m6314a(textView, i2, a, 1), m6314a(textView, i3, a, 2), m6314a(textView, i4, a, 3));
    }

    /* renamed from: a */
    private static final Drawable m6314a(TextView textView, int i, Lazy<Drawable[]> lazy, int i2) {
        if (!C7674a.m18692a(i)) {
            return null;
        }
        if (i == C7652a.drawable_sentinel) {
            return ((Drawable[]) lazy.getValue())[i2];
        }
        return C0540a.m2546c(textView.getContext(), i);
    }

    /* renamed from: a */
    public static /* synthetic */ void m6318a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = f4923a;
        }
        if ((i & 2) != 0) {
            drawable2 = f4923a;
        }
        if ((i & 4) != 0) {
            drawable3 = f4923a;
        }
        if ((i & 8) != 0) {
            drawable4 = f4923a;
        }
        m6317a(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: a */
    public static final void m6317a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        C12932j.m33818b(textView, "$this$updateCompoundDrawablesRelativeWithIntrinsicBounds");
        Lazy a = C12896f.m33750a(C12898h.NONE, new C1317b(textView));
        if (drawable == f4923a) {
            drawable = ((Drawable[]) a.getValue())[0];
        }
        if (drawable2 == f4923a) {
            drawable2 = ((Drawable[]) a.getValue())[1];
        }
        if (drawable3 == f4923a) {
            drawable3 = ((Drawable[]) a.getValue())[2];
        }
        if (drawable4 == f4923a) {
            drawable4 = ((Drawable[]) a.getValue())[3];
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: a */
    public static final void m6319a(TextView textView, InputFilter inputFilter) {
        C12932j.m33818b(textView, "$this$addFilter");
        C12932j.m33818b(inputFilter, "filter");
        InputFilter[] filters = textView.getFilters();
        C12932j.m33815a((Object) filters, "filters");
        Object[] copyOf = Arrays.copyOf(filters, textView.getFilters().length + 1);
        C12932j.m33815a((Object) copyOf, "java.util.Arrays.copyOf(this, newSize)");
        InputFilter[] inputFilterArr = (InputFilter[]) copyOf;
        inputFilterArr[textView.getFilters().length] = inputFilter;
        textView.setFilters(inputFilterArr);
    }
}
