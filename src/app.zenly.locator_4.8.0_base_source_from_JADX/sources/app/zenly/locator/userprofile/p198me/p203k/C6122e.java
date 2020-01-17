package app.zenly.locator.userprofile.p198me.p203k;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p156s.C5509a;
import app.zenly.locator.userprofile.p198me.p204l.C6139f;
import com.android.volley.toolbox.C8733j;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12948z;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p250f.p251a.p252a.p263b.p264a.p268g.C7705a;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.userprofile.me.k.e */
public final class C6122e extends C7717d<C6139f> {

    /* renamed from: e */
    private HashMap f15387e;

    /* renamed from: app.zenly.locator.userprofile.me.k.e$a */
    static final class C6123a implements OnClickListener {

        /* renamed from: e */
        public static final C6123a f15388e = new C6123a();

        C6123a() {
        }

        public final void onClick(View view) {
            C12932j.m33815a((Object) view, "it");
            Context context = view.getContext();
            C12932j.m33815a((Object) context, "it.context");
            C5509a.m15628b(context, (int) R.raw.sound_love);
        }
    }

    /* renamed from: a */
    public View mo13953a(int i) {
        if (this.f15387e == null) {
            this.f15387e = new HashMap();
        }
        View view = (View) this.f15387e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f15387e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        ((AppCompatTextView) mo13953a(C3891l.setting_heart_text)).setOnClickListener(C6123a.f15388e);
    }

    /* renamed from: b */
    private final String m16934b(int i) {
        String[] months = new DateFormatSymbols().getMonths();
        if (1 > i || 12 < i) {
            return "";
        }
        String str = months[i];
        C12932j.m33815a((Object) str, "months[monthNumber]");
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C6139f fVar, C6139f fVar2) {
        C12932j.m33818b(fVar, "model");
        if (!TextUtils.isEmpty(fVar.mo13977f().getName())) {
            String name = fVar.mo13977f().getName();
            C12932j.m33815a((Object) name, "model.user.name");
            String a = m16933a(name);
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo13953a(C3891l.setting_heart_text);
            String str = "setting_heart_text";
            C12932j.m33815a((Object) appCompatTextView, str);
            String string = appCompatTextView.getContext().getString(R.string.settings_home_label_zheart, new Object[]{a});
            C12932j.m33815a((Object) string, "setting_heart_text.conte…abel_zheart, yourInitial)");
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo13953a(C3891l.setting_heart_text);
            C12932j.m33815a((Object) appCompatTextView2, str);
            appCompatTextView2.setText(string);
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long time = new Date().getTime();
        Timestamp createdAt = fVar.mo13977f().getCreatedAt();
        String str2 = "model.user.createdAt";
        C12932j.m33815a((Object) createdAt, str2);
        long j = (long) C8733j.DEFAULT_IMAGE_TIMEOUT_MS;
        int days = (int) timeUnit.toDays(time - (createdAt.getSeconds() * j));
        Calendar instance = Calendar.getInstance();
        C12932j.m33815a((Object) instance, "cal");
        Timestamp createdAt2 = fVar.mo13977f().getCreatedAt();
        C12932j.m33815a((Object) createdAt2, str2);
        instance.setTime(new Date(createdAt2.getSeconds() * j));
        String b = m16934b(instance.get(2));
        int i = instance.get(1);
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) mo13953a(C3891l.setting_heart_description);
        String str3 = "setting_heart_description";
        C12932j.m33815a((Object) appCompatTextView3, str3);
        C12948z zVar = C12948z.f33530a;
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) mo13953a(C3891l.setting_heart_description);
        C12932j.m33815a((Object) appCompatTextView4, str3);
        String string2 = appCompatTextView4.getContext().getString(R.string.settings_home_content_strokeofgenius);
        C12932j.m33815a((Object) string2, "setting_heart_descriptio…e_content_strokeofgenius)");
        Object[] objArr = {b, String.valueOf(i), Integer.valueOf(days)};
        String format = String.format(string2, Arrays.copyOf(objArr, objArr.length));
        C12932j.m33815a((Object) format, "java.lang.String.format(format, *args)");
        appCompatTextView3.setText(format);
    }

    /* renamed from: a */
    private final String m16933a(String str) {
        String a = C7705a.m18750a(str);
        if (a != null) {
            String upperCase = a.toUpperCase();
            C12932j.m33815a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            return upperCase;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
