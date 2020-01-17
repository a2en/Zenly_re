package androidx.core.content.p003c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutInfo.Builder;
import android.graphics.drawable.Drawable;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Set;

/* renamed from: androidx.core.content.c.a */
public class C0542a {

    /* renamed from: a */
    Context f2571a;

    /* renamed from: b */
    String f2572b;

    /* renamed from: c */
    Intent[] f2573c;

    /* renamed from: d */
    ComponentName f2574d;

    /* renamed from: e */
    CharSequence f2575e;

    /* renamed from: f */
    CharSequence f2576f;

    /* renamed from: g */
    CharSequence f2577g;

    /* renamed from: h */
    IconCompat f2578h;

    /* renamed from: i */
    boolean f2579i;

    /* renamed from: j */
    Person[] f2580j;

    /* renamed from: k */
    Set<String> f2581k;

    /* renamed from: l */
    boolean f2582l;

    /* renamed from: androidx.core.content.c.a$a */
    public static class C0543a {

        /* renamed from: a */
        private final C0542a f2583a = new C0542a();

        public C0543a(Context context, String str) {
            C0542a aVar = this.f2583a;
            aVar.f2571a = context;
            aVar.f2572b = str;
        }

        /* renamed from: a */
        public C0543a mo3078a(CharSequence charSequence) {
            this.f2583a.f2575e = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0543a mo3076a(Intent intent) {
            mo3079a(new Intent[]{intent});
            return this;
        }

        /* renamed from: a */
        public C0543a mo3079a(Intent[] intentArr) {
            this.f2583a.f2573c = intentArr;
            return this;
        }

        /* renamed from: a */
        public C0543a mo3077a(IconCompat iconCompat) {
            this.f2583a.f2578h = iconCompat;
            return this;
        }

        /* renamed from: a */
        public C0542a mo3080a() {
            if (!TextUtils.isEmpty(this.f2583a.f2575e)) {
                C0542a aVar = this.f2583a;
                Intent[] intentArr = aVar.f2573c;
                if (intentArr != null && intentArr.length != 0) {
                    return aVar;
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
    }

    C0542a() {
    }

    /* renamed from: b */
    private PersistableBundle m2551b() {
        PersistableBundle persistableBundle = new PersistableBundle();
        Person[] personArr = this.f2580j;
        if (personArr != null && personArr.length > 0) {
            persistableBundle.putInt("extraPersonCount", personArr.length);
            int i = 0;
            while (i < this.f2580j.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("extraPerson_");
                int i2 = i + 1;
                sb.append(i2);
                persistableBundle.putPersistableBundle(sb.toString(), this.f2580j[i].mo3013a());
                i = i2;
            }
        }
        persistableBundle.putBoolean("extraLongLived", this.f2582l);
        return persistableBundle;
    }

    /* renamed from: a */
    public ShortcutInfo mo3075a() {
        Builder intents = new Builder(this.f2571a, this.f2572b).setShortLabel(this.f2575e).setIntents(this.f2573c);
        IconCompat iconCompat = this.f2578h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.mo3109d());
        }
        if (!TextUtils.isEmpty(this.f2576f)) {
            intents.setLongLabel(this.f2576f);
        }
        if (!TextUtils.isEmpty(this.f2577g)) {
            intents.setDisabledMessage(this.f2577g);
        }
        ComponentName componentName = this.f2574d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f2581k;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setExtras(m2551b());
        return intents.build();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Intent mo3074a(Intent intent) {
        Intent[] intentArr = this.f2573c;
        String str = "android.intent.extra.shortcut.NAME";
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra(str, this.f2575e.toString());
        if (this.f2578h != null) {
            Drawable drawable = null;
            if (this.f2579i) {
                PackageManager packageManager = this.f2571a.getPackageManager();
                ComponentName componentName = this.f2574d;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.f2571a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f2578h.mo3105a(intent, drawable, this.f2571a);
        }
        return intent;
    }
}
