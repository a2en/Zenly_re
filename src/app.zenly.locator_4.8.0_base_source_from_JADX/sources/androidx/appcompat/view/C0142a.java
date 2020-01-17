package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.ViewConfiguration;
import p214e.p215a.C7521a;
import p214e.p215a.C7522b;
import p214e.p215a.C7524d;
import p214e.p215a.C7530j;

/* renamed from: androidx.appcompat.view.a */
public class C0142a {

    /* renamed from: a */
    private Context f443a;

    private C0142a(Context context) {
        this.f443a = context;
    }

    /* renamed from: a */
    public static C0142a m493a(Context context) {
        return new C0142a(context);
    }

    /* renamed from: b */
    public int mo609b() {
        return this.f443a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: c */
    public int mo610c() {
        Configuration configuration = this.f443a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    /* renamed from: d */
    public int mo611d() {
        return this.f443a.getResources().getDimensionPixelSize(C7524d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: e */
    public int mo612e() {
        TypedArray obtainStyledAttributes = this.f443a.obtainStyledAttributes(null, C7530j.ActionBar, C7521a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C7530j.ActionBar_height, 0);
        Resources resources = this.f443a.getResources();
        if (!mo613f()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C7524d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean mo613f() {
        return this.f443a.getResources().getBoolean(C7522b.abc_action_bar_embed_tabs);
    }

    /* renamed from: g */
    public boolean mo614g() {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f443a).hasPermanentMenuKey();
    }

    /* renamed from: a */
    public boolean mo608a() {
        return this.f443a.getApplicationInfo().targetSdkVersion < 14;
    }
}
