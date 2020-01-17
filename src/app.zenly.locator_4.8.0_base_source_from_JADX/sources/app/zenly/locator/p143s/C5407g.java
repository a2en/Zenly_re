package app.zenly.locator.p143s;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import app.zenly.android.feature.base.migration.C1324a;
import app.zenly.android.feature.base.migration.C1325b;
import app.zenly.locator.p143s.p147k.C5442e;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: app.zenly.locator.s.g */
public final class C5407g {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C5407g f13965c;

    /* renamed from: d */
    public static final C5408a f13966d = new C5408a(null);

    /* renamed from: a */
    private final ArrayList<C5409b> f13967a;

    /* renamed from: b */
    private final SharedPreferences f13968b;

    /* renamed from: app.zenly.locator.s.g$a */
    public static final class C5408a {
        private C5408a() {
        }

        /* renamed from: a */
        public final C5407g mo12991a(Context context) {
            C12932j.m33818b(context, "context");
            if (C5407g.f13965c == null) {
                C5407g.f13965c = new C5407g(context, null);
            }
            C5407g m = C5407g.f13965c;
            if (m != null) {
                return m;
            }
            C12932j.m33814a();
            throw null;
        }

        public /* synthetic */ C5408a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.s.g$b */
    public static abstract class C5409b {
        /* renamed from: a */
        public void mo12992a(C5407g gVar, int i) {
            C12932j.m33818b(gVar, "prefs");
        }

        /* renamed from: b */
        public void mo11008b(C5407g gVar, int i) {
            C12932j.m33818b(gVar, "prefs");
        }
    }

    /* renamed from: app.zenly.locator.s.g$c */
    private static final class C5410c extends C5442e {

        /* renamed from: g */
        static final /* synthetic */ KProperty[] f13969g;

        /* renamed from: f */
        private final Lazy f13970f = C12896f.m33751a(C5413c.f13973f);

        /* renamed from: app.zenly.locator.s.g$c$a */
        public static final class C5411a {
            private C5411a() {
            }

            public /* synthetic */ C5411a(C12928f fVar) {
                this();
            }
        }

        /* renamed from: app.zenly.locator.s.g$c$b */
        private static final class C5412b {

            /* renamed from: a */
            private final SharedPreferences f13971a;

            /* renamed from: b */
            private final Editor f13972b;

            public C5412b(SharedPreferences sharedPreferences, Editor editor) {
                C12932j.m33818b(sharedPreferences, "prefs");
                C12932j.m33818b(editor, "editor");
                this.f13971a = sharedPreferences;
                this.f13972b = editor;
            }

            /* renamed from: a */
            public final Editor mo12995a() {
                return this.f13972b;
            }

            /* renamed from: b */
            public final SharedPreferences mo12996b() {
                return this.f13971a;
            }
        }

        /* renamed from: app.zenly.locator.s.g$c$c */
        static final class C5413c extends C12933k implements Function0<C1325b<C5412b>> {

            /* renamed from: f */
            public static final C5413c f13973f = new C5413c();

            /* renamed from: app.zenly.locator.s.g$c$c$a */
            public static final class C5414a extends C1324a<C5412b> {
                public C5414a(int i, int i2, int i3, int i4) {
                    super(i3, i4);
                }

                /* renamed from: a */
                public void mo6516a(C5412b bVar) {
                    bVar.mo12995a().remove("discoverExitTweak");
                }
            }

            /* renamed from: app.zenly.locator.s.g$c$c$b */
            public static final class C5415b extends C1324a<C5412b> {
                public C5415b(int i, int i2, int i3, int i4) {
                    super(i3, i4);
                }

                /* renamed from: a */
                public void mo6516a(C5412b bVar) {
                    C5412b bVar2 = bVar;
                }
            }

            /* renamed from: app.zenly.locator.s.g$c$c$c */
            public static final class C5416c extends C1324a<C5412b> {
                public C5416c(int i, int i2, int i3, int i4) {
                    super(i3, i4);
                }

                /* renamed from: a */
                public void mo6516a(C5412b bVar) {
                    bVar.mo12995a().remove("smsLastFailure");
                }
            }

            /* renamed from: app.zenly.locator.s.g$c$c$d */
            public static final class C5417d extends C1324a<C5412b> {
                public C5417d(int i, int i2, int i3, int i4) {
                    super(i3, i4);
                }

                /* renamed from: a */
                public void mo6516a(C5412b bVar) {
                    bVar.mo12995a().remove("appUpdateDownloadId");
                }
            }

            /* renamed from: app.zenly.locator.s.g$c$c$e */
            public static final class C5418e extends C1324a<C5412b> {
                public C5418e(int i, int i2, int i3, int i4) {
                    super(i3, i4);
                }

                /* renamed from: a */
                public void mo6516a(C5412b bVar) {
                    bVar.mo12995a().remove("prefs:phoneSettingsOnboardingStepCompleted");
                }
            }

            /* renamed from: app.zenly.locator.s.g$c$c$f */
            public static final class C5419f extends C1324a<C5412b> {
                public C5419f(int i, int i2, int i3, int i4) {
                    super(i3, i4);
                }

                /* renamed from: a */
                public void mo6516a(C5412b bVar) {
                    C5412b bVar2 = bVar;
                    String str = "mapType";
                    int i = bVar2.mo12996b().getInt(str, -1);
                    if (i == 3) {
                        bVar2.mo12995a().putInt(str, 2);
                    } else if (i == 4) {
                        bVar2.mo12995a().putInt(str, 3);
                    }
                }
            }

            /* renamed from: app.zenly.locator.s.g$c$c$g */
            public static final class C5420g extends C1324a<C5412b> {
                public C5420g(int i, int i2, int i3, int i4) {
                    super(i3, i4);
                }

                /* renamed from: a */
                public void mo6516a(C5412b bVar) {
                    bVar.mo12995a().remove("timeTogetherCategory");
                }
            }

            /* renamed from: app.zenly.locator.s.g$c$c$h */
            public static final class C5421h extends C1324a<C5412b> {
                public C5421h(int i, int i2, int i3, int i4) {
                    super(i3, i4);
                }

                /* renamed from: a */
                public void mo6516a(C5412b bVar) {
                    C5412b bVar2 = bVar;
                    bVar2.mo12995a().remove("prefs:tweaks:creationGroupChatName");
                    bVar2.mo12995a().remove("prefs:tweaks:mandatoryGroupChatName");
                }
            }

            /* renamed from: app.zenly.locator.s.g$c$c$i */
            public static final class C5422i extends C1324a<C5412b> {
                public C5422i(int i, int i2, int i3, int i4) {
                    super(i3, i4);
                }

                /* renamed from: a */
                public void mo6516a(C5412b bVar) {
                    bVar.mo12995a().remove("prefs:tweaks:broadcastV2");
                }
            }

            C5413c() {
                super(0);
            }

            public final C1325b<C5412b> invoke() {
                return new C1325b<>((C1324a<T>[]) new C1324a[]{new C5414a(1, 2, 1, 2), new C5415b(2, 3, 2, 3), new C5416c(3, 4, 3, 4), new C5417d(4, 5, 4, 5), new C5418e(5, 6, 5, 6), new C5419f(6, 7, 6, 7), new C5420g(7, 8, 7, 8), new C5421h(8, 9, 8, 9), new C5422i(9, 10, 9, 10)});
            }
        }

        static {
            C12941s sVar = new C12941s(C12946x.m33834a(C5410c.class), "migrationHandler", "getMigrationHandler()Lapp/zenly/android/feature/base/migration/MigrationHandler;");
            C12946x.m33839a((C12940r) sVar);
            f13969g = new KProperty[]{sVar};
            new C5411a(null);
        }

        public C5410c(Context context) {
            C12932j.m33818b(context, "context");
            super(context, "ZenlyLocalPrefs", 10);
        }

        /* renamed from: c */
        private final C1325b<C5412b> m15418c() {
            Lazy lazy = this.f13970f;
            KProperty kProperty = f13969g[0];
            return (C1325b) lazy.getValue();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo12993a(Editor editor) {
            C12932j.m33818b(editor, "editor");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo12994b(SharedPreferences sharedPreferences, Editor editor, int i, int i2) {
            C12932j.m33818b(sharedPreferences, "prefs");
            C12932j.m33818b(editor, "editor");
            m15418c().mo6518a(new C5412b(sharedPreferences, editor), i, i2);
        }
    }

    private C5407g(Context context) {
        this.f13967a = new ArrayList<>();
        this.f13968b = new C5410c(context).mo13019b();
    }

    /* renamed from: a */
    public static final C5407g m15386a(Context context) {
        return f13966d.mo12991a(context);
    }

    /* renamed from: b */
    public final void mo12975b(int i) {
        m15388a("cameraOrientation", i);
    }

    /* renamed from: c */
    public final void mo12978c(int i) {
        m15388a("mapProvider", i);
    }

    /* renamed from: d */
    public final int mo12979d() {
        return this.f13968b.getInt("cameraOrientation", 0);
    }

    /* renamed from: e */
    public final int mo12981e() {
        return this.f13968b.getInt("mapProvider", 2);
    }

    /* renamed from: f */
    public final int mo12983f() {
        return this.f13968b.getInt("mapType", 3);
    }

    /* renamed from: g */
    public final int mo12985g() {
        return this.f13968b.getInt("notificationChannelsVersion", 0);
    }

    /* renamed from: h */
    public final SharedPreferences mo12986h() {
        return this.f13968b;
    }

    /* renamed from: i */
    public final String mo12987i() {
        return this.f13968b.getString("smsVerificationCode", null);
    }

    /* renamed from: j */
    public final int mo12988j() {
        return this.f13968b.getInt("distanceUnits", 1);
    }

    /* renamed from: k */
    public final boolean mo12989k() {
        return this.f13968b.getBoolean("userJustDeletedAccount", false);
    }

    /* renamed from: l */
    public final void mo12990l() {
        String str = "bumpHintCount";
        m15388a(str, this.f13968b.getInt(str, 0) + 1);
        m15389a("bumpHintLastTime", C5447b.m15475b(C5448c.m15478a()));
    }

    /* renamed from: a */
    public final int mo12969a() {
        return this.f13968b.getInt("appVersionCode", 0);
    }

    /* renamed from: b */
    public final int mo12974b() {
        return this.f13968b.getInt("bumpHintCount", 0);
    }

    /* renamed from: c */
    public final long mo12977c() {
        return C5447b.m15473a(C5448c.m15478a(), this.f13968b.getLong("bumpHintLastTime", 0));
    }

    /* renamed from: d */
    public final void mo12980d(int i) {
        m15388a("mapType", i);
        Iterator it = this.f13967a.iterator();
        while (it.hasNext()) {
            ((C5409b) it.next()).mo11008b(this, i);
        }
    }

    /* renamed from: e */
    public final void mo12982e(int i) {
        m15388a("notificationChannelsVersion", i);
    }

    /* renamed from: f */
    public final void mo12984f(int i) {
        m15388a("distanceUnits", i);
        Iterator it = this.f13967a.iterator();
        while (it.hasNext()) {
            ((C5409b) it.next()).mo12992a(this, i);
        }
    }

    /* renamed from: a */
    public final void mo12970a(int i) {
        m15388a("appVersionCode", i);
    }

    /* renamed from: b */
    public final void mo12976b(C5409b bVar) {
        C12932j.m33818b(bVar, "listener");
        this.f13967a.remove(bVar);
    }

    public /* synthetic */ C5407g(Context context, C12928f fVar) {
        this(context);
    }

    /* renamed from: a */
    public final void mo12972a(String str) {
        m15390a("smsVerificationCode", str);
    }

    /* renamed from: a */
    public final void mo12973a(boolean z) {
        m15391a("userJustDeletedAccount", z);
    }

    /* renamed from: a */
    private final void m15391a(String str, boolean z) {
        Editor edit = this.f13968b.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putBoolean(str, z);
        edit.apply();
    }

    /* renamed from: a */
    private final void m15388a(String str, int i) {
        Editor edit = this.f13968b.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putInt(str, i);
        edit.apply();
    }

    /* renamed from: a */
    private final void m15389a(String str, long j) {
        Editor edit = this.f13968b.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putLong(str, j);
        edit.apply();
    }

    /* renamed from: a */
    private final void m15390a(String str, String str2) {
        Editor edit = this.f13968b.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putString(str, str2);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo12971a(C5409b bVar) {
        C12932j.m33818b(bVar, "listener");
        if (!this.f13967a.contains(bVar)) {
            this.f13967a.add(bVar);
        }
    }
}
