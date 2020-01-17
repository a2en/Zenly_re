package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import p214e.p215a.C7529i;

/* renamed from: androidx.appcompat.view.b */
public class C0143b extends ContextWrapper {

    /* renamed from: a */
    private int f444a;

    /* renamed from: b */
    private Theme f445b;

    /* renamed from: c */
    private LayoutInflater f446c;

    /* renamed from: d */
    private Configuration f447d;

    /* renamed from: e */
    private Resources f448e;

    public C0143b() {
        super(null);
    }

    /* renamed from: b */
    private Resources m501b() {
        if (this.f448e == null) {
            Configuration configuration = this.f447d;
            if (configuration == null) {
                this.f448e = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                this.f448e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f448e;
    }

    /* renamed from: c */
    private void m502c() {
        boolean z = this.f445b == null;
        if (z) {
            this.f445b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f445b.setTo(theme);
            }
        }
        mo616a(this.f445b, this.f444a, z);
    }

    /* renamed from: a */
    public int mo615a() {
        return this.f444a;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m501b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f446c == null) {
            this.f446c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f446c;
    }

    public Theme getTheme() {
        Theme theme = this.f445b;
        if (theme != null) {
            return theme;
        }
        if (this.f444a == 0) {
            this.f444a = C7529i.Theme_AppCompat_Light;
        }
        m502c();
        return this.f445b;
    }

    public void setTheme(int i) {
        if (this.f444a != i) {
            this.f444a = i;
            m502c();
        }
    }

    public C0143b(Context context, int i) {
        super(context);
        this.f444a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo616a(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public C0143b(Context context, Theme theme) {
        super(context);
        this.f445b = theme;
    }
}
