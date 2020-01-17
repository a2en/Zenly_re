package app.zenly.locator.userprofile.p198me.p203k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0540a;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1333c;
import app.zenly.android.feature.base.model.C1334a.C1335a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.util.C3194b0;
import app.zenly.locator.core.widget.CircleProgressView;
import app.zenly.locator.friendshipfacts.p099l.C3808b;
import app.zenly.locator.userprofile.p198me.p200h.C6090d;
import app.zenly.locator.userprofile.p198me.p204l.C6137d;
import com.snap.p327ui.event.EventDispatcher;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12948z;
import p213co.znly.models.UserProto$BestFriend.C6918b;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.userprofile.me.k.c */
public final class C6118c extends C7717d<C6137d> {

    /* renamed from: e */
    private AvatarLoader f15380e;

    /* renamed from: f */
    private HashMap f15381f;

    /* renamed from: app.zenly.locator.userprofile.me.k.c$a */
    static final class C6119a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6118c f15382e;

        /* renamed from: f */
        final /* synthetic */ C6137d f15383f;

        C6119a(C6118c cVar, C6137d dVar) {
            this.f15382e = cVar;
            this.f15383f = dVar;
        }

        public final void onClick(View view) {
            EventDispatcher a = this.f15382e.mo34491a();
            UserProto$User friend = this.f15383f.mo13973f().getFriend();
            C12932j.m33815a((Object) friend, "model.bestFriend.friend");
            String uuid = friend.getUuid();
            C12932j.m33815a((Object) uuid, "model.bestFriend.friend.uuid");
            a.dispatch(new C6090d(uuid, C3808b.m11290c(this.f15383f.mo13973f())));
        }
    }

    /* renamed from: a */
    public View mo13947a(int i) {
        if (this.f15381f == null) {
            this.f15381f = new HashMap();
        }
        View view = (View) this.f15381f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f15381f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        this.f15380e = new C2477e(context);
        view.setClipToOutline(true);
    }

    /* renamed from: f */
    public void mo6954f() {
        AvatarLoader avatarLoader = this.f15380e;
        if (avatarLoader != null) {
            ImageView imageView = (ImageView) mo13947a(C3891l.my_profile_image);
            C12932j.m33815a((Object) imageView, "my_profile_image");
            avatarLoader.clear(imageView);
            super.mo6954f();
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C6137d dVar, C6137d dVar2) {
        String str;
        C6137d dVar3 = dVar;
        C12932j.m33818b(dVar3, "model");
        Context context = mo34493b().getContext();
        C12932j.m33815a((Object) context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.corner_radius_300);
        AvatarLoader avatarLoader = this.f15380e;
        if (avatarLoader != null) {
            UserProto$User friend = dVar.mo13973f().getFriend();
            String str2 = "model.bestFriend.friend";
            C12932j.m33815a((Object) friend, str2);
            Request withCorners = avatarLoader.load(C2884f.m9355a(friend)).withFillColor(R.color.gray).withPlaceholderStrategy(C1333c.DisplayName).withCorners(new C1335a((float) dimensionPixelSize));
            ImageView imageView = (ImageView) mo13947a(C3891l.my_profile_image);
            C12932j.m33815a((Object) imageView, "my_profile_image");
            withCorners.into(imageView);
            View a = mo13947a(C3891l.my_profile_streak_background_protection);
            C12932j.m33815a((Object) a, "my_profile_streak_background_protection");
            UserProto$User friend2 = dVar.mo13973f().getFriend();
            C12932j.m33815a((Object) friend2, str2);
            a.setVisibility(C3194b0.m10163a(friend2) ? 0 : 8);
            UserProto$User friend3 = dVar.mo13973f().getFriend();
            C12932j.m33815a((Object) friend3, str2);
            int i = C3194b0.m10163a(friend3) ? R.attr.zenlyColorBackground : R.attr.zenlyAvatarPlaceholderForegroundColor;
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo13947a(C3891l.my_profile_streak);
            Context context2 = mo34493b().getContext();
            C12932j.m33815a((Object) context2, "itemView.context");
            appCompatTextView.setTextColor(C7678c.m18702a(context2, i));
            String str3 = "my_profile_streak";
            String str4 = "my_profile_streak_timer";
            String str5 = "my_profile_streak_img";
            if (C3808b.m11290c(dVar.mo13973f())) {
                ImageView imageView2 = (ImageView) mo13947a(C3891l.my_profile_streak_img);
                C12932j.m33815a((Object) imageView2, str5);
                imageView2.setVisibility(0);
                ImageView imageView3 = (ImageView) mo13947a(C3891l.my_profile_streak_img);
                C12932j.m33815a((Object) imageView3, str5);
                m16923a(imageView3, 2131231475, R.color.pink);
                CircleProgressView circleProgressView = (CircleProgressView) mo13947a(C3891l.my_profile_streak_timer);
                C12932j.m33815a((Object) circleProgressView, str4);
                circleProgressView.setVisibility(8);
                int d = C3808b.m11291d(dVar.mo13973f());
                if (d == 0) {
                    ((AppCompatTextView) mo13947a(C3891l.my_profile_streak)).setText(R.string.profile_bestFriends_duration_new);
                } else {
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo13947a(C3891l.my_profile_streak);
                    C12932j.m33815a((Object) appCompatTextView2, str3);
                    appCompatTextView2.setText(C7706a.m18754a(context, d, 0, 4, (Object) null));
                }
            } else if (C3808b.m11289b(dVar.mo13973f())) {
                ImageView imageView4 = (ImageView) mo13947a(C3891l.my_profile_streak_img);
                C12932j.m33815a((Object) imageView4, str5);
                imageView4.setVisibility(0);
                ImageView imageView5 = (ImageView) mo13947a(C3891l.my_profile_streak_img);
                C12932j.m33815a((Object) imageView5, str5);
                m16923a(imageView5, R.drawable.icon_star_offset_size_16, R.color.yellow);
                CircleProgressView circleProgressView2 = (CircleProgressView) mo13947a(C3891l.my_profile_streak_timer);
                C12932j.m33815a((Object) circleProgressView2, str4);
                circleProgressView2.setVisibility(8);
                ((AppCompatTextView) mo13947a(C3891l.my_profile_streak)).setText(R.string.profile_bestFriends_duration_new);
            } else {
                Integer e = C3808b.m11292e(dVar.mo13973f());
                long hours = TimeUnit.DAYS.toHours(1);
                if (e != null) {
                    String str6 = str4;
                    long intValue = (long) e.intValue();
                    if (0 <= intValue && hours >= intValue) {
                        ImageView imageView6 = (ImageView) mo13947a(C3891l.my_profile_streak_img);
                        C12932j.m33815a((Object) imageView6, str5);
                        imageView6.setVisibility(8);
                        CircleProgressView circleProgressView3 = (CircleProgressView) mo13947a(C3891l.my_profile_streak_timer);
                        C12932j.m33815a((Object) circleProgressView3, str6);
                        circleProgressView3.setVisibility(0);
                        ((CircleProgressView) mo13947a(C3891l.my_profile_streak_timer)).mo9658a(100.0f - ((((float) e.intValue()) * 100.0f) / ((float) hours)), 100.0f);
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) mo13947a(C3891l.my_profile_streak);
                        C12932j.m33815a((Object) appCompatTextView3, str3);
                        C12948z zVar = C12948z.f33530a;
                        Locale a2 = C7713f.m18776a(context);
                        C6918b facts = dVar.mo13973f().getFacts();
                        C12932j.m33815a((Object) facts, "model.bestFriend.facts");
                        Object[] objArr = {Integer.valueOf(facts.getCurrentWeekStreak())};
                        String format = String.format(a2, "%d", Arrays.copyOf(objArr, objArr.length));
                        C12932j.m33815a((Object) format, "java.lang.String.format(locale, format, *args)");
                        appCompatTextView3.setText(format);
                    } else {
                        str = str6;
                    }
                } else {
                    str = str4;
                }
                ImageView imageView7 = (ImageView) mo13947a(C3891l.my_profile_streak_img);
                C12932j.m33815a((Object) imageView7, str5);
                imageView7.setVisibility(0);
                ImageView imageView8 = (ImageView) mo13947a(C3891l.my_profile_streak_img);
                C12932j.m33815a((Object) imageView8, str5);
                m16923a(imageView8, R.drawable.icon_star_offset_size_16, R.color.yellow);
                CircleProgressView circleProgressView4 = (CircleProgressView) mo13947a(C3891l.my_profile_streak_timer);
                C12932j.m33815a((Object) circleProgressView4, str);
                circleProgressView4.setVisibility(8);
                AppCompatTextView appCompatTextView32 = (AppCompatTextView) mo13947a(C3891l.my_profile_streak);
                C12932j.m33815a((Object) appCompatTextView32, str3);
                C12948z zVar2 = C12948z.f33530a;
                Locale a22 = C7713f.m18776a(context);
                C6918b facts2 = dVar.mo13973f().getFacts();
                C12932j.m33815a((Object) facts2, "model.bestFriend.facts");
                Object[] objArr2 = {Integer.valueOf(facts2.getCurrentWeekStreak())};
                String format2 = String.format(a22, "%d", Arrays.copyOf(objArr2, objArr2.length));
                C12932j.m33815a((Object) format2, "java.lang.String.format(locale, format, *args)");
                appCompatTextView32.setText(format2);
            }
            mo34493b().setOnClickListener(new C6119a(this, dVar3));
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }

    /* renamed from: a */
    private final void m16923a(ImageView imageView, int i, int i2) {
        imageView.setImageResource(i);
        imageView.setImageTintList(ColorStateList.valueOf(C0540a.m2536a(imageView.getContext(), i2)));
    }
}
