package app.zenly.locator.p143s.p147k;

import android.annotation.Nullable;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: app.zenly.locator.s.k.e */
public abstract class C5442e {

    /* renamed from: e */
    static final /* synthetic */ KProperty[] f14008e;

    /* renamed from: a */
    private final Lazy f14009a = C12896f.m33751a(new C5445c(this));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f14010b;

    /* renamed from: c */
    private final String f14011c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f14012d;

    /* renamed from: app.zenly.locator.s.k.e$a */
    public static final class C5443a {
        private C5443a() {
        }

        public /* synthetic */ C5443a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.s.k.e$b */
    private static final class C5444b implements SharedPreferences {

        /* renamed from: a */
        private final /* synthetic */ SharedPreferences f14013a;

        public C5444b(SharedPreferences sharedPreferences) {
            C12932j.m33818b(sharedPreferences, "innerPreferences");
            this.f14013a = sharedPreferences;
        }

        /* renamed from: a */
        private final Void m15466a() {
            throw new UnsupportedOperationException("Read only shared preferences");
        }

        public boolean contains(String str) {
            return this.f14013a.contains(str);
        }

        public Editor edit() {
            m15466a();
            throw null;
        }

        public Map<String, ?> getAll() {
            return this.f14013a.getAll();
        }

        public boolean getBoolean(String str, boolean z) {
            return this.f14013a.getBoolean(str, z);
        }

        public float getFloat(String str, float f) {
            return this.f14013a.getFloat(str, f);
        }

        public int getInt(String str, int i) {
            return this.f14013a.getInt(str, i);
        }

        public long getLong(String str, long j) {
            return this.f14013a.getLong(str, j);
        }

        @Nullable
        public String getString(String str, @Nullable String str2) {
            return this.f14013a.getString(str, str2);
        }

        @Nullable
        public Set<String> getStringSet(String str, @Nullable Set<String> set) {
            return this.f14013a.getStringSet(str, set);
        }

        public void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
            m15466a();
            throw null;
        }

        public void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
            m15466a();
            throw null;
        }
    }

    /* renamed from: app.zenly.locator.s.k.e$c */
    static final class C5445c extends C12933k implements Function0<SharedPreferences> {

        /* renamed from: f */
        final /* synthetic */ C5442e f14014f;

        C5445c(C5442e eVar) {
            this.f14014f = eVar;
            super(0);
        }

        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f14014f.f14010b.getSharedPreferences(this.f14014f.mo13017a(), 0);
            String str = "zenly:version";
            int i = sharedPreferences.getInt(str, 0);
            if (i != this.f14014f.f14012d) {
                Editor edit = sharedPreferences.edit();
                String str2 = "editor";
                if (i == 0) {
                    try {
                        C5442e eVar = this.f14014f;
                        C12932j.m33815a((Object) edit, str2);
                        eVar.mo12993a(edit);
                    } catch (Throwable th) {
                        edit.apply();
                        throw th;
                    }
                } else {
                    String str3 = "prefs";
                    if (i < this.f14014f.f14012d) {
                        C5442e eVar2 = this.f14014f;
                        C12932j.m33815a((Object) sharedPreferences, str3);
                        C5444b bVar = new C5444b(sharedPreferences);
                        C12932j.m33815a((Object) edit, str2);
                        eVar2.mo12994b(bVar, edit, i, this.f14014f.f14012d);
                    } else {
                        C5442e eVar3 = this.f14014f;
                        C12932j.m33815a((Object) sharedPreferences, str3);
                        C5444b bVar2 = new C5444b(sharedPreferences);
                        C12932j.m33815a((Object) edit, str2);
                        eVar3.mo13018a(bVar2, edit, i, this.f14014f.f14012d);
                        throw null;
                    }
                }
                edit.apply();
                sharedPreferences.edit().putInt(str, this.f14014f.f14012d).apply();
            }
            return sharedPreferences;
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C5442e.class), "sharedPreferences", "getSharedPreferences()Landroid/content/SharedPreferences;");
        C12946x.m33839a((C12940r) sVar);
        f14008e = new KProperty[]{sVar};
        new C5443a(null);
    }

    public C5442e(Context context, String str, int i) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(str, "name");
        this.f14010b = context;
        this.f14011c = str;
        this.f14012d = i;
        boolean z = false;
        if (this.f14011c.length() > 0) {
            if (this.f14012d >= 1) {
                z = true;
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append("Version must be >= 1, was ");
                sb.append(this.f14012d);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            return;
        }
        throw new IllegalArgumentException("Name must not be empty".toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12993a(Editor editor) {
        C12932j.m33818b(editor, "editor");
    }

    /* renamed from: b */
    public final SharedPreferences mo13019b() {
        Lazy lazy = this.f14009a;
        KProperty kProperty = f14008e[0];
        return (SharedPreferences) lazy.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo12994b(SharedPreferences sharedPreferences, Editor editor, int i, int i2);

    /* renamed from: a */
    public final String mo13017a() {
        return this.f14011c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13018a(SharedPreferences sharedPreferences, Editor editor, int i, int i2) {
        C12932j.m33818b(sharedPreferences, "prefs");
        C12932j.m33818b(editor, "editor");
        StringBuilder sb = new StringBuilder();
        sb.append("Can't downgrade preference from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        throw new UnsupportedOperationException(sb.toString());
    }
}
