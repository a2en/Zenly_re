package app.zenly.locator.friendshipfacts.p096i;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1333c;
import app.zenly.android.feature.base.model.C1334a.C1336b;
import app.zenly.locator.C3891l;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.friendshipfacts.p100m.C3814d;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.friendshipfacts.i.c */
public final class C3789c extends C7717d<C3814d> {

    /* renamed from: e */
    private AvatarLoader f10116e;

    /* renamed from: f */
    private HashMap f10117f;

    /* renamed from: a */
    public View mo10352a(int i) {
        if (this.f10117f == null) {
            this.f10117f = new HashMap();
        }
        View view = (View) this.f10117f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f10117f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        this.f10116e = new C2477e(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3814d dVar, C3814d dVar2) {
        C12932j.m33818b(dVar, "model");
        Context context = mo34493b().getContext();
        String str = "record_subtitle";
        String str2 = "record_streak_value";
        String str3 = "record_name";
        String str4 = "record_avatar";
        if (dVar.mo10398f() == null) {
            ImageView imageView = (ImageView) mo10352a(C3891l.record_avatar);
            C12932j.m33815a((Object) imageView, str4);
            imageView.setVisibility(8);
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo10352a(C3891l.record_subtitle);
            C12932j.m33815a((Object) appCompatTextView, str);
            appCompatTextView.setVisibility(8);
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo10352a(C3891l.record_name);
            C12932j.m33815a((Object) appCompatTextView2, str3);
            appCompatTextView2.setVisibility(8);
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) mo10352a(C3891l.record_streak_value);
            C12932j.m33815a((Object) appCompatTextView3, str2);
            appCompatTextView3.setVisibility(8);
            return;
        }
        ImageView imageView2 = (ImageView) mo10352a(C3891l.record_avatar);
        C12932j.m33815a((Object) imageView2, str4);
        imageView2.setVisibility(0);
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) mo10352a(C3891l.record_subtitle);
        C12932j.m33815a((Object) appCompatTextView4, str);
        appCompatTextView4.setVisibility(0);
        AppCompatTextView appCompatTextView5 = (AppCompatTextView) mo10352a(C3891l.record_name);
        C12932j.m33815a((Object) appCompatTextView5, str3);
        appCompatTextView5.setVisibility(0);
        AppCompatTextView appCompatTextView6 = (AppCompatTextView) mo10352a(C3891l.record_streak_value);
        C12932j.m33815a((Object) appCompatTextView6, str2);
        appCompatTextView6.setVisibility(0);
        AvatarLoader avatarLoader = this.f10116e;
        if (avatarLoader != null) {
            Request withCorners = avatarLoader.load(C2884f.m9355a(dVar.mo10398f().mo10368b())).withPlaceholderStrategy(C1333c.DisplayName).withCorners(new C1336b(0.4f));
            ImageView imageView3 = (ImageView) mo10352a(C3891l.record_avatar);
            C12932j.m33815a((Object) imageView3, str4);
            withCorners.into(imageView3);
            AppCompatTextView appCompatTextView7 = (AppCompatTextView) mo10352a(C3891l.record_name);
            C12932j.m33815a((Object) appCompatTextView7, str3);
            appCompatTextView7.setText(dVar.mo10398f().mo10368b().getName());
            AppCompatTextView appCompatTextView8 = (AppCompatTextView) mo10352a(C3891l.record_streak_value);
            C12932j.m33815a((Object) appCompatTextView8, str2);
            C12932j.m33815a((Object) context, "context");
            appCompatTextView8.setText(C7706a.m18754a(context, Math.abs(dVar.mo10398f().mo10367a()), 0, 4, (Object) null));
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }
}
