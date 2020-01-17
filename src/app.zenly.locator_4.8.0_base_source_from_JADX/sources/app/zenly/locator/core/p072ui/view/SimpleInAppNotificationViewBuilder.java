package app.zenly.locator.core.p072ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.locator.C3892m;
import app.zenly.locator.R;
import java.util.Locale;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p260i.C7685b;
import p250f.p251a.p252a.p253a.p260i.p261f.C7690a;
import p250f.p251a.p252a.p253a.p260i.p261f.C7691b;
import p250f.p251a.p252a.p263b.p279d.C7770f;

/* renamed from: app.zenly.locator.core.ui.view.SimpleInAppNotificationViewBuilder */
public final class SimpleInAppNotificationViewBuilder {

    /* renamed from: a */
    private Drawable f8662a;

    /* renamed from: b */
    private Drawable f8663b;

    /* renamed from: c */
    private String f8664c;

    /* renamed from: d */
    private String f8665d;

    @SuppressLint({"CustomViewStyleable", "PrivateResource"})
    /* renamed from: app.zenly.locator.core.ui.view.SimpleInAppNotificationViewBuilder$SimpleInAppNotificationView */
    private static final class SimpleInAppNotificationView extends AppCompatTextView {

        /* renamed from: e */
        private final C7690a f8666e;

        /* renamed from: f */
        private final C7691b f8667f;

        /* renamed from: g */
        private final C7690a f8668g;

        /* renamed from: h */
        private final C7691b f8669h;

        /* renamed from: i */
        private final int f8670i;

        public /* synthetic */ SimpleInAppNotificationView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
            if ((i2 & 2) != 0) {
                attributeSet = null;
            }
            if ((i2 & 4) != 0) {
                i = R.attr.inAppNotificationViewStyle;
            }
            this(context, attributeSet, i);
        }

        /* renamed from: a */
        public final int mo9435a() {
            return this.f8670i;
        }

        public SimpleInAppNotificationView(Context context, AttributeSet attributeSet, int i) {
            C12932j.m33818b(context, "context");
            super(context, attributeSet, i);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3892m.SimpleInAppNotificationView, i, 0);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(5);
            C7690a aVar = null;
            this.f8666e = colorStateList != null ? new C7690a(colorStateList, null, 2, null) : null;
            this.f8667f = new C7691b(context, obtainStyledAttributes.getResourceId(4, C7770f.TextAppearance_SecondaryBody));
            ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(3);
            if (colorStateList2 != null) {
                aVar = new C7690a(colorStateList2, null, 2, null);
            }
            this.f8668g = aVar;
            this.f8669h = new C7691b(context, obtainStyledAttributes.getResourceId(2, C7770f.TextAppearance_TertiaryBody));
            this.f8670i = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                setSupportCompoundDrawablesTintList(obtainStyledAttributes.getColorStateList(0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final void mo9436a(String str, String str2) {
            C12932j.m33818b(str, "title");
            C12932j.m33818b(str2, "message");
            C7685b bVar = new C7685b();
            String str3 = "(this as java.lang.String).toUpperCase(locale)";
            String str4 = "textLocale";
            if (!TextUtils.isEmpty(str)) {
                C7690a aVar = this.f8666e;
                if (aVar != null) {
                    bVar.mo19897a((Object) aVar);
                }
                bVar.mo19897a((Object) this.f8667f);
                if (this.f8667f.mo19905a().mo19818d()) {
                    Locale textLocale = getTextLocale();
                    C12932j.m33815a((Object) textLocale, str4);
                    String upperCase = str.toUpperCase(textLocale);
                    C12932j.m33815a((Object) upperCase, str3);
                    bVar.mo19896a((CharSequence) upperCase);
                } else {
                    bVar.mo19896a((CharSequence) str);
                }
                bVar.mo19899c();
                if (this.f8666e != null) {
                    bVar.mo19899c();
                }
                if (!TextUtils.isEmpty(str2)) {
                    bVar.mo19894a(10);
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                C7690a aVar2 = this.f8668g;
                if (aVar2 != null) {
                    bVar.mo19897a((Object) aVar2);
                }
                bVar.mo19897a((Object) this.f8669h);
                if (this.f8669h.mo19905a().mo19818d()) {
                    Locale textLocale2 = getTextLocale();
                    C12932j.m33815a((Object) textLocale2, str4);
                    String upperCase2 = str2.toUpperCase(textLocale2);
                    C12932j.m33815a((Object) upperCase2, str3);
                    bVar.mo19896a((CharSequence) upperCase2);
                } else {
                    bVar.mo19896a((CharSequence) str2);
                }
                bVar.mo19899c();
                if (this.f8668g != null) {
                    bVar.mo19899c();
                }
            }
            setText(bVar.mo19893a());
        }
    }

    /* renamed from: a */
    public final SimpleInAppNotificationViewBuilder mo9432a(Drawable drawable) {
        this.f8662a = drawable;
        return this;
    }

    /* renamed from: b */
    public final SimpleInAppNotificationViewBuilder mo9434b(String str) {
        this.f8664c = str;
        return this;
    }

    /* renamed from: a */
    public final SimpleInAppNotificationViewBuilder mo9433a(String str) {
        this.f8665d = str;
        return this;
    }

    /* renamed from: a */
    public final View mo9431a(Context context) {
        C12932j.m33818b(context, "context");
        SimpleInAppNotificationView simpleInAppNotificationView = new SimpleInAppNotificationView(context, null, 0, 6, null);
        String str = this.f8664c;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = this.f8665d;
        if (str3 != null) {
            str2 = str3;
        }
        simpleInAppNotificationView.mo9436a(str, str2);
        simpleInAppNotificationView.setCompoundDrawablesRelativeWithIntrinsicBounds(this.f8662a, (Drawable) null, this.f8663b, (Drawable) null);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.setMargins(simpleInAppNotificationView.mo9435a(), simpleInAppNotificationView.mo9435a(), simpleInAppNotificationView.mo9435a(), simpleInAppNotificationView.mo9435a());
        simpleInAppNotificationView.setLayoutParams(layoutParams);
        return simpleInAppNotificationView;
    }
}
