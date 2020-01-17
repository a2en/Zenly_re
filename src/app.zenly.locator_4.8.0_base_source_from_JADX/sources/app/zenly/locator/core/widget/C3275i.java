package app.zenly.locator.core.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import app.zenly.locator.core.helper.C2508a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

/* renamed from: app.zenly.locator.core.widget.i */
public final class C3275i {

    /* renamed from: app.zenly.locator.core.widget.i$a */
    public static final class C3276a extends C2508a {

        /* renamed from: g */
        final /* synthetic */ C3277j f9129g;

        /* renamed from: h */
        final /* synthetic */ TextViewLinkAction f9130h;

        C3276a(C3277j jVar, String str, SpannableString spannableString, TextView textView, List list, int i, TextViewLinkAction textViewLinkAction) {
            this.f9129g = jVar;
            this.f9130h = textViewLinkAction;
            super(0, 1, null);
        }

        /* renamed from: a */
        public void mo8582a(View view) {
            C12932j.m33818b(view, "v");
            TextViewLinkAction a = this.f9129g.mo9726a();
            if (a == null) {
                a = this.f9130h;
            }
            a.execute(this.f9129g);
        }
    }

    /* renamed from: a */
    public static final void m10384a(TextView textView, int i) {
        C12932j.m33818b(textView, "$this$setTextOrNull");
        if (C7674a.m18692a(i)) {
            textView.setText(i);
        } else {
            textView.setText("");
        }
    }

    /* renamed from: a */
    public static final void m10386a(TextView textView, CharSequence charSequence) {
        C12932j.m33818b(textView, "$this$setTextAndVisibility");
        if (!(charSequence == null || charSequence.length() == 0)) {
            textView.setVisibility(0);
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
    }

    /* renamed from: a */
    public static final void m10385a(TextView textView, int i, List<C3277j> list, TextViewLinkAction textViewLinkAction) {
        TextView textView2 = textView;
        List<C3277j> list2 = list;
        C12932j.m33818b(textView2, "$this$addLinks");
        C12932j.m33818b(list2, "links");
        C12932j.m33818b(textViewLinkAction, "defaultAction");
        Context context = textView.getContext();
        if (context != null) {
            for (C3277j a : list) {
                a.mo9727a(context);
            }
            ArrayList arrayList = new ArrayList(C12850p.m33647a(list2, 10));
            for (C3277j b : list) {
                arrayList.add(b.mo9728b());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String string = context.getString(i, Arrays.copyOf(array, array.length));
                C12932j.m33815a((Object) string, "getString(textId, *links…it.text }.toTypedArray())");
                SpannableString spannableString = new SpannableString(string);
                for (C3277j jVar : list) {
                    String b2 = jVar.mo9728b();
                    if (b2 != null) {
                        int a2 = C13029r.m34009a((CharSequence) string, b2, 0, false, 6, (Object) null);
                        while (a2 >= 0) {
                            C3276a aVar = r0;
                            int i2 = a2;
                            C3276a aVar2 = new C3276a(jVar, string, spannableString, textView, list, i, textViewLinkAction);
                            String b3 = jVar.mo9728b();
                            if (b3 != null) {
                                spannableString.setSpan(aVar, i2, i2 + b3.length(), 33);
                                UnderlineSpan underlineSpan = new UnderlineSpan();
                                String b4 = jVar.mo9728b();
                                if (b4 != null) {
                                    spannableString.setSpan(underlineSpan, i2, i2 + b4.length(), 0);
                                    String b5 = jVar.mo9728b();
                                    if (b5 != null) {
                                        a2 = C13029r.m34009a((CharSequence) string, b5, i2 + 1, false, 4, (Object) null);
                                        List<C3277j> list3 = list;
                                    } else {
                                        C12932j.m33814a();
                                        throw null;
                                    }
                                } else {
                                    C12932j.m33814a();
                                    throw null;
                                }
                            } else {
                                C12932j.m33814a();
                                throw null;
                            }
                        }
                        List<C3277j> list4 = list;
                    } else {
                        C12932j.m33814a();
                        throw null;
                    }
                }
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                textView2.setText(spannableString);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
