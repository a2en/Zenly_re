package app.zenly.locator.userprofile.p198me.p203k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.style.CharacterStyle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p160v.p161b.C5521c;
import app.zenly.locator.userprofile.p198me.p200h.C6093g;
import app.zenly.locator.userprofile.p198me.p204l.C6141h;
import app.zenly.locator.userprofile.p198me.view.LineGraphView;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;
import p250f.p251a.p252a.p253a.p260i.p261f.C7690a;
import p250f.p251a.p252a.p253a.p260i.p261f.C7691b;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;
import p250f.p251a.p252a.p263b.p279d.C7770f;

/* renamed from: app.zenly.locator.userprofile.me.k.g */
public final class C6127g extends C7717d<C6141h> {

    /* renamed from: e */
    private List<? extends CharacterStyle> f15394e;

    /* renamed from: f */
    private HashMap f15395f;

    /* renamed from: app.zenly.locator.userprofile.me.k.g$a */
    static final class C6128a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6127g f15396e;

        C6128a(C6127g gVar) {
            this.f15396e = gVar;
        }

        public final void onClick(View view) {
            this.f15396e.mo34491a().dispatch(C6093g.f15333a);
        }
    }

    /* renamed from: a */
    public View mo13960a(int i) {
        if (this.f15395f == null) {
            this.f15395f = new HashMap();
        }
        View view = (View) this.f15395f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f15395f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        view.setOnClickListener(new C6128a(this));
        Context context = view.getContext();
        CharacterStyle[] characterStyleArr = new CharacterStyle[2];
        C12932j.m33815a((Object) context, "context");
        characterStyleArr[0] = new C7691b(context, C7770f.TextAppearance_LCD);
        ColorStateList b = C7678c.m18704b(context, R.attr.zenlyTextColorPrimary);
        if (b != null) {
            characterStyleArr[1] = new C7690a(b, null, 2, null);
            this.f15394e = C12848o.m33643b((Object[]) characterStyleArr);
            return;
        }
        C12932j.m33814a();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C6141h hVar, C6141h hVar2) {
        C12932j.m33818b(hVar, "model");
        int f = 8 - hVar.mo13978f();
        String str = "profile_friendship_facts_locked";
        String str2 = "profile_friendship_facts_subtitle";
        String str3 = "profile_friendship_facts_trend";
        if (f <= 0) {
            mo34493b().setClipToOutline(true);
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo13960a(C3891l.profile_friendship_facts_subtitle);
            C12932j.m33815a((Object) appCompatTextView, str2);
            Context context = mo34493b().getContext();
            C12932j.m33815a((Object) context, "itemView.context");
            long h = hVar.mo13980h();
            List<? extends CharacterStyle> list = this.f15394e;
            if (list != null) {
                appCompatTextView.setText(C5521c.m15670b(context, h, list));
                ImageView imageView = (ImageView) mo13960a(C3891l.profile_friendship_facts_locked);
                C12932j.m33815a((Object) imageView, str);
                imageView.setVisibility(8);
                if (hVar.mo13979g().size() > 1) {
                    LineGraphView lineGraphView = (LineGraphView) mo13960a(C3891l.profile_friendship_facts_trend);
                    C12932j.m33815a((Object) lineGraphView, str3);
                    lineGraphView.setVisibility(0);
                    ((LineGraphView) mo13960a(C3891l.profile_friendship_facts_trend)).setPoints(C12857w.m33676c((Collection) hVar.mo13979g()));
                    return;
                }
                LineGraphView lineGraphView2 = (LineGraphView) mo13960a(C3891l.profile_friendship_facts_trend);
                C12932j.m33815a((Object) lineGraphView2, str3);
                lineGraphView2.setVisibility(8);
                return;
            }
            C12932j.m33820c("textStyles");
            throw null;
        }
        mo34493b().setClipToOutline(false);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo13960a(C3891l.profile_friendship_facts_subtitle);
        C12932j.m33815a((Object) appCompatTextView2, str2);
        appCompatTextView2.setText(mo34493b().getResources().getQuantityString(R.plurals.profile_friendshipFacts_locked_subtitle, f, new Object[]{Integer.valueOf(f)}));
        ImageView imageView2 = (ImageView) mo13960a(C3891l.profile_friendship_facts_locked);
        C12932j.m33815a((Object) imageView2, str);
        imageView2.setVisibility(0);
        LineGraphView lineGraphView3 = (LineGraphView) mo13960a(C3891l.profile_friendship_facts_trend);
        C12932j.m33815a((Object) lineGraphView3, str3);
        lineGraphView3.setVisibility(8);
    }
}
