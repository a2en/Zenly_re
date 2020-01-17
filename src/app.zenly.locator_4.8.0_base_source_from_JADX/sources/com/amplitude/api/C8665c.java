package com.amplitude.api;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.util.Pair;
import com.android.volley.toolbox.C8733j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.C13325v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amplitude.api.c */
public class C8665c {
    /* access modifiers changed from: private */

    /* renamed from: N */
    public static final C8681d f22256N = C8681d.m20309a();

    /* renamed from: A */
    private long f22257A;

    /* renamed from: B */
    private long f22258B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f22259C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f22260D;

    /* renamed from: E */
    private boolean f22261E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f22262F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f22263G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f22264H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public AtomicBoolean f22265I;

    /* renamed from: J */
    AtomicBoolean f22266J;

    /* renamed from: K */
    String f22267K;

    /* renamed from: L */
    C8694m f22268L;

    /* renamed from: M */
    C8694m f22269M;

    /* renamed from: a */
    protected Context f22270a;

    /* renamed from: b */
    protected C13325v f22271b;

    /* renamed from: c */
    protected C8683f f22272c;

    /* renamed from: d */
    protected String f22273d;

    /* renamed from: e */
    protected String f22274e;

    /* renamed from: f */
    protected String f22275f;

    /* renamed from: g */
    protected String f22276g;

    /* renamed from: h */
    private boolean f22277h;

    /* renamed from: i */
    private boolean f22278i;

    /* renamed from: j */
    protected boolean f22279j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f22280k;

    /* renamed from: l */
    private boolean f22281l;

    /* renamed from: m */
    C8692k f22282m;

    /* renamed from: n */
    JSONObject f22283n;

    /* renamed from: o */
    protected String f22284o;

    /* renamed from: p */
    long f22285p;

    /* renamed from: q */
    long f22286q;

    /* renamed from: r */
    long f22287r;

    /* renamed from: s */
    long f22288s;

    /* renamed from: t */
    long f22289t;

    /* renamed from: u */
    long f22290u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C8684g f22291v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f22292w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f22293x;

    /* renamed from: y */
    private int f22294y;

    /* renamed from: z */
    private long f22295z;

    /* renamed from: com.amplitude.api.c$a */
    class C8666a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Context f22296e;

        /* renamed from: f */
        final /* synthetic */ boolean f22297f;

        /* renamed from: g */
        final /* synthetic */ String f22298g;

        /* renamed from: h */
        final /* synthetic */ String f22299h;

        /* renamed from: i */
        final /* synthetic */ C8665c f22300i;

        /* renamed from: com.amplitude.api.c$a$a */
        class C8667a implements DatabaseResetListener {
            C8667a() {
            }

            public void onDatabaseReset(SQLiteDatabase sQLiteDatabase) {
                C8666a aVar = C8666a.this;
                String str = "store";
                C8665c.this.f22272c.mo23387a(sQLiteDatabase, str, "device_id", aVar.f22300i.f22276g);
                C8666a aVar2 = C8666a.this;
                C8665c.this.f22272c.mo23387a(sQLiteDatabase, str, "user_id", aVar2.f22300i.f22275f);
                C8666a aVar3 = C8666a.this;
                C8683f fVar = C8665c.this.f22272c;
                String str2 = "long_store";
                fVar.mo23387a(sQLiteDatabase, str2, "opt_out", Long.valueOf(aVar3.f22300i.f22280k ? 1 : 0));
                C8666a aVar4 = C8666a.this;
                C8665c.this.f22272c.mo23387a(sQLiteDatabase, str2, "previous_session_id", Long.valueOf(aVar4.f22300i.f22285p));
                C8666a aVar5 = C8666a.this;
                C8665c.this.f22272c.mo23387a(sQLiteDatabase, str2, "last_event_time", Long.valueOf(aVar5.f22300i.f22289t));
            }
        }

        C8666a(Context context, boolean z, String str, String str2, C8665c cVar) {
            this.f22296e = context;
            this.f22297f = z;
            this.f22298g = str;
            this.f22299h = str2;
            this.f22300i = cVar;
        }

        public void run() {
            C8665c cVar = C8665c.this;
            if (!cVar.f22279j) {
                try {
                    if (cVar.f22274e.equals("$default_instance")) {
                        C8665c.m20235a(this.f22296e);
                        C8665c.m20238b(this.f22296e);
                    }
                    C8665c.this.f22271b = new C13325v();
                    C8665c.this.f22291v = new C8684g(this.f22296e);
                    C8665c.this.f22276g = C8665c.this.m20258l();
                    if (this.f22297f) {
                        C8687h.m20402b().mo23432a(C8665c.this.f22271b, this.f22298g, C8665c.this.f22276g);
                    }
                    C8665c.this.f22291v.mo23428p();
                    String str = "user_id";
                    if (this.f22299h != null) {
                        this.f22300i.f22275f = this.f22299h;
                        C8665c.this.f22272c.mo23403c(str, this.f22299h);
                    } else {
                        this.f22300i.f22275f = C8665c.this.f22272c.mo23406d(str);
                    }
                    Long c = C8665c.this.f22272c.mo23404c("opt_out");
                    C8665c.this.f22280k = c != null && c.longValue() == 1;
                    C8665c.this.f22290u = C8665c.this.m20227a("previous_session_id", -1);
                    if (C8665c.this.f22290u >= 0) {
                        C8665c.this.f22285p = C8665c.this.f22290u;
                    }
                    C8665c.this.f22286q = C8665c.this.m20227a("sequence_number", 0);
                    C8665c.this.f22287r = C8665c.this.m20227a("last_event_id", -1);
                    C8665c.this.f22288s = C8665c.this.m20227a("last_identify_id", -1);
                    C8665c.this.f22289t = C8665c.this.m20227a("last_event_time", -1);
                    C8665c.this.f22272c.mo23395a((DatabaseResetListener) new C8667a());
                    C8665c.this.f22279j = true;
                } catch (CursorWindowAllocationException e) {
                    C8665c.f22256N.mo23381b("com.amplitude.api.AmplitudeClient", String.format("Failed to initialize Amplitude SDK due to: %s", new Object[]{e.getMessage()}));
                    C8687h.m20402b().mo23431a("Failed to initialize Amplitude SDK", e);
                    this.f22300i.f22273d = null;
                }
            }
        }
    }

    /* renamed from: com.amplitude.api.c$b */
    class C8668b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C8665c f22303e;

        C8668b(C8665c cVar) {
            this.f22303e = cVar;
        }

        public void run() {
            if (!C8693l.m20451a(this.f22303e.f22273d)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C8684g.m20354q());
                sb.append("R");
                C8665c.this.mo23345b(sb.toString());
            }
        }
    }

    /* renamed from: com.amplitude.api.c$c */
    class C8669c implements Runnable {
        C8669c() {
        }

        public void run() {
            if (!C8693l.m20451a(C8665c.this.f22273d)) {
                C8665c.this.mo23356e();
            }
        }
    }

    /* renamed from: com.amplitude.api.c$d */
    class C8670d implements Runnable {
        C8670d() {
        }

        public void run() {
            C8665c.this.f22265I.set(false);
            C8665c.this.mo23356e();
        }
    }

    /* renamed from: com.amplitude.api.c$e */
    class C8671e implements Runnable {

        /* renamed from: e */
        final /* synthetic */ String f22307e;

        /* renamed from: f */
        final /* synthetic */ long f22308f;

        /* renamed from: g */
        final /* synthetic */ long f22309g;

        C8671e(String str, long j, long j2) {
            this.f22307e = str;
            this.f22308f = j;
            this.f22309g = j2;
        }

        public void run() {
            C8665c cVar = C8665c.this;
            cVar.mo23340a(cVar.f22271b, this.f22307e, this.f22308f, this.f22309g);
        }
    }

    /* renamed from: com.amplitude.api.c$f */
    class C8672f implements Runnable {

        /* renamed from: e */
        final /* synthetic */ long f22311e;

        /* renamed from: f */
        final /* synthetic */ long f22312f;

        /* renamed from: com.amplitude.api.c$f$a */
        class C8673a implements Runnable {
            C8673a() {
            }

            public void run() {
                C8665c cVar = C8665c.this;
                cVar.mo23349b(cVar.f22259C);
            }
        }

        C8672f(long j, long j2) {
            this.f22311e = j;
            this.f22312f = j2;
        }

        public void run() {
            long j = this.f22311e;
            if (j >= 0) {
                C8665c.this.f22272c.mo23407d(j);
            }
            long j2 = this.f22312f;
            if (j2 >= 0) {
                C8665c.this.f22272c.mo23409f(j2);
            }
            C8665c.this.f22266J.set(false);
            if (C8665c.this.f22272c.mo23402c() > ((long) C8665c.this.f22292w)) {
                C8665c.this.f22268L.mo23477a(new C8673a());
                return;
            }
            C8665c.this.f22259C = false;
            C8665c cVar = C8665c.this;
            cVar.f22260D = cVar.f22293x;
        }
    }

    /* renamed from: com.amplitude.api.c$g */
    class C8674g implements Runnable {
        C8674g() {
        }

        public void run() {
            C8665c.this.f22266J.set(false);
            C8665c.this.mo23349b(true);
        }
    }

    /* renamed from: com.amplitude.api.c$h */
    class C8675h implements Runnable {
        C8675h() {
        }

        public void run() {
            if (C8665c.this.f22291v != null) {
                C8665c.this.f22291v.mo23413a(false);
                return;
            }
            throw new IllegalStateException("Must initialize before acting on location listening.");
        }
    }

    /* renamed from: com.amplitude.api.c$i */
    class C8676i implements Runnable {

        /* renamed from: e */
        final /* synthetic */ String f22317e;

        /* renamed from: f */
        final /* synthetic */ JSONObject f22318f;

        /* renamed from: g */
        final /* synthetic */ JSONObject f22319g;

        /* renamed from: h */
        final /* synthetic */ JSONObject f22320h;

        /* renamed from: i */
        final /* synthetic */ JSONObject f22321i;

        /* renamed from: j */
        final /* synthetic */ JSONObject f22322j;

        /* renamed from: k */
        final /* synthetic */ long f22323k;

        /* renamed from: l */
        final /* synthetic */ boolean f22324l;

        C8676i(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j, boolean z) {
            this.f22317e = str;
            this.f22318f = jSONObject;
            this.f22319g = jSONObject2;
            this.f22320h = jSONObject3;
            this.f22321i = jSONObject4;
            this.f22322j = jSONObject5;
            this.f22323k = j;
            this.f22324l = z;
        }

        public void run() {
            if (!C8693l.m20451a(C8665c.this.f22273d)) {
                C8665c.this.mo23315a(this.f22317e, this.f22318f, this.f22319g, this.f22320h, this.f22321i, this.f22322j, this.f22323k, this.f22324l);
            }
        }
    }

    /* renamed from: com.amplitude.api.c$j */
    class C8677j implements Runnable {

        /* renamed from: e */
        final /* synthetic */ long f22326e;

        C8677j(long j) {
            this.f22326e = j;
        }

        public void run() {
            if (!C8693l.m20451a(C8665c.this.f22273d)) {
                C8665c.this.mo23352c(this.f22326e);
                C8665c.this.f22263G = false;
                if (C8665c.this.f22264H) {
                    C8665c.this.mo23356e();
                }
                C8665c cVar = C8665c.this;
                cVar.f22272c.mo23403c("device_id", cVar.f22276g);
                C8665c cVar2 = C8665c.this;
                cVar2.f22272c.mo23403c("user_id", cVar2.f22275f);
                C8665c cVar3 = C8665c.this;
                cVar3.f22272c.mo23389a("opt_out", Long.valueOf(cVar3.f22280k ? 1 : 0));
                C8665c cVar4 = C8665c.this;
                cVar4.f22272c.mo23389a("previous_session_id", Long.valueOf(cVar4.f22285p));
                C8665c cVar5 = C8665c.this;
                cVar5.f22272c.mo23389a("last_event_time", Long.valueOf(cVar5.f22289t));
            }
        }
    }

    /* renamed from: com.amplitude.api.c$k */
    class C8678k implements Runnable {

        /* renamed from: e */
        final /* synthetic */ long f22328e;

        C8678k(long j) {
            this.f22328e = j;
        }

        public void run() {
            if (!C8693l.m20451a(C8665c.this.f22273d)) {
                C8665c.this.mo23363h(this.f22328e);
                C8665c.this.f22263G = true;
            }
        }
    }

    /* renamed from: com.amplitude.api.c$l */
    class C8679l implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C8665c f22330e;

        /* renamed from: f */
        final /* synthetic */ boolean f22331f;

        /* renamed from: g */
        final /* synthetic */ String f22332g;

        C8679l(C8665c cVar, boolean z, String str) {
            this.f22330e = cVar;
            this.f22331f = z;
            this.f22332g = str;
        }

        public void run() {
            if (!C8693l.m20451a(this.f22330e.f22273d)) {
                if (this.f22331f && C8665c.this.f22262F) {
                    C8665c.this.m20245e("session_end");
                }
                C8665c cVar = this.f22330e;
                String str = this.f22332g;
                cVar.f22275f = str;
                C8665c.this.f22272c.mo23403c("user_id", str);
                if (this.f22331f) {
                    long b = C8665c.this.mo23343b();
                    C8665c.this.m20255j(b);
                    C8665c.this.mo23352c(b);
                    if (C8665c.this.f22262F) {
                        C8665c.this.m20245e("session_start");
                    }
                }
            }
        }
    }

    /* renamed from: com.amplitude.api.c$m */
    class C8680m implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C8665c f22334e;

        /* renamed from: f */
        final /* synthetic */ String f22335f;

        C8680m(C8665c cVar, String str) {
            this.f22334e = cVar;
            this.f22335f = str;
        }

        public void run() {
            if (!C8693l.m20451a(this.f22334e.f22273d)) {
                C8665c cVar = this.f22334e;
                String str = this.f22335f;
                cVar.f22276g = str;
                C8665c.this.f22272c.mo23403c("device_id", str);
            }
        }
    }

    public C8665c() {
        this(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m20255j(long j) {
        this.f22285p = j;
        mo23361g(j);
    }

    /* renamed from: k */
    private void m20256k(long j) {
        if (this.f22262F) {
            m20245e("session_end");
        }
        m20255j(j);
        mo23352c(j);
        if (this.f22262F) {
            m20245e("session_start");
        }
    }

    /* renamed from: l */
    private void m20259l(long j) {
        if (!this.f22265I.getAndSet(true)) {
            this.f22268L.mo23478a(new C8670d(), j);
        }
    }

    public C8665c(String str) {
        this.f22277h = false;
        this.f22278i = false;
        this.f22279j = false;
        this.f22280k = false;
        this.f22281l = false;
        this.f22282m = new C8692k();
        this.f22285p = -1;
        this.f22286q = 0;
        this.f22287r = -1;
        this.f22288s = -1;
        this.f22289t = -1;
        this.f22290u = -1;
        this.f22292w = 30;
        this.f22293x = 50;
        this.f22294y = C8733j.DEFAULT_IMAGE_TIMEOUT_MS;
        this.f22295z = 30000;
        this.f22257A = 300000;
        this.f22258B = 1800000;
        this.f22259C = false;
        this.f22260D = this.f22293x;
        this.f22261E = false;
        this.f22262F = false;
        this.f22263G = false;
        this.f22264H = true;
        this.f22265I = new AtomicBoolean(false);
        this.f22266J = new AtomicBoolean(false);
        this.f22267K = "https://api.amplitude.com/";
        this.f22268L = new C8694m("logThread");
        this.f22269M = new C8694m("httpThread");
        this.f22274e = C8693l.m20453b(str);
        this.f22268L.start();
        this.f22269M.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo23355d(String str) {
        if (!C8693l.m20451a(str)) {
            return mo23342a("logEvent()");
        }
        f22256N.mo23381b("com.amplitude.api.AmplitudeClient", "Argument eventType cannot be null or blank in logEvent()");
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo23357e(long j) {
        this.f22289t = j;
        this.f22272c.mo23389a("last_event_time", Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo23359f(long j) {
        this.f22288s = j;
        this.f22272c.mo23389a("last_identify_id", Long.valueOf(j));
    }

    /* renamed from: g */
    public C8665c mo23360g() {
        this.f22278i = true;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo23362h() {
        this.f22261E = true;
    }

    /* renamed from: i */
    private boolean m20252i(long j) {
        return j - this.f22289t < (this.f22261E ? this.f22257A : this.f22258B);
    }

    /* renamed from: j */
    private Set<String> m20254j() {
        HashSet hashSet = new HashSet();
        hashSet.add("");
        hashSet.add("9774d56d682e549c");
        hashSet.add("unknown");
        hashSet.add("000000000000000");
        hashSet.add("Android");
        hashSet.add("DEFACE");
        hashSet.add("00000000-0000-0000-0000-000000000000");
        return hashSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public String m20258l() {
        Set j = m20254j();
        String str = "device_id";
        String d = this.f22272c.mo23406d(str);
        if (!C8693l.m20451a(d) && !j.contains(d)) {
            return d;
        }
        if (!this.f22277h && this.f22278i && !this.f22291v.mo23426n()) {
            String a = this.f22291v.mo23412a();
            if (!C8693l.m20451a(a) && !j.contains(a)) {
                this.f22272c.mo23403c(str, a);
                return a;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C8684g.m20354q());
        sb.append("R");
        String sb2 = sb.toString();
        this.f22272c.mo23403c(str, sb2);
        return sb2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo23348b(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j, boolean z) {
        C8676i iVar = new C8676i(str, jSONObject != null ? C8693l.m20450a(jSONObject) : jSONObject, jSONObject2 != null ? C8693l.m20450a(jSONObject2) : jSONObject2, jSONObject3 != null ? C8693l.m20450a(jSONObject3) : jSONObject3, jSONObject4 != null ? C8693l.m20450a(jSONObject4) : jSONObject4, jSONObject5 != null ? C8693l.m20450a(jSONObject5) : jSONObject5, j, z);
        mo23331a((Runnable) iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public long mo23350c() {
        this.f22286q++;
        this.f22272c.mo23389a("sequence_number", Long.valueOf(this.f22286q));
        return this.f22286q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo23361g(long j) {
        this.f22290u = j;
        this.f22272c.mo23389a("previous_session_id", Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo23363h(long j) {
        if (m20257k()) {
            if (m20252i(j)) {
                mo23352c(j);
                return false;
            }
            m20256k(j);
            return true;
        } else if (m20252i(j)) {
            long j2 = this.f22290u;
            if (j2 == -1) {
                m20256k(j);
                return true;
            }
            m20255j(j2);
            mo23352c(j);
            return false;
        } else {
            m20256k(j);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m20245e(String str) {
        if (mo23342a(String.format("sendSessionEvent('%s')", new Object[]{str})) && m20257k()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("special", str);
                mo23315a(str, null, jSONObject, null, null, null, this.f22289t, false);
            } catch (JSONException e) {
                C8687h.m20402b().mo23431a(String.format("Failed to generate API Properties JSON for session event %s", new Object[]{str}), e);
            }
        }
    }

    /* renamed from: f */
    public static String m20248f(String str) {
        return str.length() <= 1024 ? str : str.substring(0, 1024);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo23354d(long j) {
        this.f22287r = j;
        this.f22272c.mo23389a("last_event_id", Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo23352c(long j) {
        if (m20257k()) {
            mo23357e(j);
        }
    }

    /* renamed from: f */
    public void mo23358f() {
        if (mo23342a("uploadEvents()")) {
            this.f22268L.mo23477a(new C8669c());
        }
    }

    /* renamed from: k */
    private boolean m20257k() {
        return this.f22285p >= 0;
    }

    /* renamed from: d */
    public C8665c mo23353d() {
        if (!mo23342a("regenerateDeviceId()")) {
            return this;
        }
        mo23331a((Runnable) new C8668b(this));
        return this;
    }

    /* renamed from: a */
    public C8665c mo23319a(Context context, String str) {
        mo23320a(context, str, (String) null);
        return this;
    }

    /* renamed from: c */
    public C8665c mo23351c(String str) {
        mo23322a(str, false);
        return this;
    }

    /* renamed from: a */
    public C8665c mo23320a(Context context, String str, String str2) {
        mo23321a(context, str, str2, (String) null, false);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo23344b(String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        if (C8693l.m20451a(jSONObject2)) {
            f22256N.mo23381b("com.amplitude.api.AmplitudeClient", String.format("Detected empty event string for event type %s, skipping", new Object[]{str}));
            return -1;
        }
        String str2 = "$identify";
        String str3 = "$groupidentify";
        if (str.equals(str2) || str.equals(str3)) {
            this.f22288s = this.f22272c.mo23399b(jSONObject2);
            mo23359f(this.f22288s);
        } else {
            this.f22287r = this.f22272c.mo23388a(jSONObject2);
            mo23354d(this.f22287r);
        }
        int min = Math.min(Math.max(1, this.f22294y / 10), 20);
        if (this.f22272c.mo23384a() > ((long) this.f22294y)) {
            C8683f fVar = this.f22272c;
            fVar.mo23407d(fVar.mo23385a((long) min));
        }
        if (this.f22272c.mo23396b() > ((long) this.f22294y)) {
            C8683f fVar2 = this.f22272c;
            fVar2.mo23409f(fVar2.mo23397b((long) min));
        }
        long c = this.f22272c.mo23402c();
        int i = this.f22292w;
        if (c % ((long) i) != 0 || c < ((long) i)) {
            m20259l(this.f22295z);
        } else {
            mo23356e();
        }
        return (str.equals(str2) || str.equals(str3)) ? this.f22288s : this.f22287r;
    }

    /* renamed from: a */
    public synchronized C8665c mo23321a(Context context, String str, String str2, String str3, boolean z) {
        if (context == null) {
            f22256N.mo23381b("com.amplitude.api.AmplitudeClient", "Argument context cannot be null in initialize()");
            return this;
        } else if (C8693l.m20451a(str)) {
            f22256N.mo23381b("com.amplitude.api.AmplitudeClient", "Argument apiKey cannot be null or blank in initialize()");
            return this;
        } else {
            this.f22270a = context.getApplicationContext();
            this.f22273d = str;
            this.f22272c = C8683f.m20318a(this.f22270a, this.f22274e);
            if (C8693l.m20451a(str3)) {
                str3 = "Android";
            }
            this.f22284o = str3;
            C8666a aVar = new C8666a(context, z, str, str2, this);
            mo23331a((Runnable) aVar);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23356e() {
        mo23349b(false);
        C8687h.m20402b().mo23429a();
    }

    /* renamed from: a */
    public C8665c mo23318a(Application application) {
        if (!this.f22261E && mo23342a("enableForegroundTracking()") && VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(new C8664b(this));
        }
        return this;
    }

    /* renamed from: a */
    public C8665c mo23317a() {
        mo23331a((Runnable) new C8675h());
        return this;
    }

    /* renamed from: a */
    public C8665c mo23323a(boolean z) {
        this.f22262F = z;
        return this;
    }

    /* renamed from: a */
    public void mo23336a(String str, JSONObject jSONObject) {
        mo23339a(str, jSONObject, false);
    }

    /* renamed from: a */
    public void mo23339a(String str, JSONObject jSONObject, boolean z) {
        mo23338a(str, jSONObject, (JSONObject) null, z);
    }

    /* renamed from: a */
    public void mo23338a(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        mo23337a(str, jSONObject, jSONObject2, mo23343b(), z);
    }

    /* renamed from: a */
    public void mo23337a(String str, JSONObject jSONObject, JSONObject jSONObject2, long j, boolean z) {
        if (mo23355d(str)) {
            mo23348b(str, jSONObject, null, null, jSONObject2, null, j, z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo23347b(long j) {
        mo23331a((Runnable) new C8677j(j));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x021a A[Catch:{ JSONException -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0220 A[Catch:{ JSONException -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x022b A[Catch:{ JSONException -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0231 A[Catch:{ JSONException -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x023c A[Catch:{ JSONException -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0242 A[Catch:{ JSONException -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x024d A[Catch:{ JSONException -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0253 A[Catch:{ JSONException -> 0x025f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo23315a(java.lang.String r17, org.json.JSONObject r18, org.json.JSONObject r19, org.json.JSONObject r20, org.json.JSONObject r21, org.json.JSONObject r22, long r23, boolean r25) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = r18
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            com.amplitude.api.d r8 = f22256N
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Logged event to Amplitude: "
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "com.amplitude.api.AmplitudeClient"
            r8.mo23378a(r10, r9)
            boolean r8 = r1.f22280k
            r11 = -1
            if (r8 == 0) goto L_0x002d
            return r11
        L_0x002d:
            boolean r8 = r1.f22262F
            r13 = 0
            if (r8 == 0) goto L_0x0044
            java.lang.String r8 = "session_start"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L_0x0042
            java.lang.String r8 = "session_end"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x0044
        L_0x0042:
            r8 = 1
            goto L_0x0045
        L_0x0044:
            r8 = 0
        L_0x0045:
            if (r8 != 0) goto L_0x0054
            if (r25 != 0) goto L_0x0054
            boolean r8 = r1.f22263G
            if (r8 != 0) goto L_0x0051
            r1.mo23363h(r6)
            goto L_0x0054
        L_0x0051:
            r1.mo23352c(r6)
        L_0x0054:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r14 = "event_type"
            java.lang.Object r15 = r16.mo23324a(r17)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r14, r15)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r14 = "timestamp"
            r8.put(r14, r6)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r6 = "user_id"
            java.lang.String r7 = r1.f22275f     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo23324a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r6 = "device_id"
            java.lang.String r7 = r1.f22276g     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo23324a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r6 = "session_id"
            if (r25 == 0) goto L_0x0083
            r14 = r11
            goto L_0x0085
        L_0x0083:
            long r14 = r1.f22285p     // Catch:{ JSONException -> 0x0261 }
        L_0x0085:
            r8.put(r6, r14)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r6 = "uuid"
            java.util.UUID r7 = java.util.UUID.randomUUID()     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.toString()     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r6 = "sequence_number"
            long r14 = r16.mo23350c()     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r14)     // Catch:{ JSONException -> 0x0261 }
            com.amplitude.api.k r6 = r1.f22282m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo23476l()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x00b5
            java.lang.String r6 = "version_name"
            com.amplitude.api.g r7 = r1.f22291v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo23424l()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo23324a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x00b5:
            com.amplitude.api.k r6 = r1.f22282m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo23473i()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x00cc
            java.lang.String r6 = "os_name"
            com.amplitude.api.g r7 = r1.f22291v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo23422j()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo23324a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x00cc:
            com.amplitude.api.k r6 = r1.f22282m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo23474j()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x00e3
            java.lang.String r6 = "os_version"
            com.amplitude.api.g r7 = r1.f22291v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo23423k()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo23324a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x00e3:
            com.amplitude.api.k r6 = r1.f22282m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo23468d()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x00fa
            java.lang.String r6 = "device_brand"
            com.amplitude.api.g r7 = r1.f22291v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo23414b()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo23324a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x00fa:
            com.amplitude.api.k r6 = r1.f22282m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo23469e()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x0111
            java.lang.String r6 = "device_manufacturer"
            com.amplitude.api.g r7 = r1.f22291v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo23419g()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo23324a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x0111:
            com.amplitude.api.k r6 = r1.f22282m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo23470f()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x0128
            java.lang.String r6 = "device_model"
            com.amplitude.api.g r7 = r1.f22291v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo23420h()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo23324a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x0128:
            com.amplitude.api.k r6 = r1.f22282m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo23466b()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x013f
            java.lang.String r6 = "carrier"
            com.amplitude.api.g r7 = r1.f22291v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo23415c()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo23324a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x013f:
            com.amplitude.api.k r6 = r1.f22282m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo23467c()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x0156
            java.lang.String r6 = "country"
            com.amplitude.api.g r7 = r1.f22291v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo23416d()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo23324a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x0156:
            com.amplitude.api.k r6 = r1.f22282m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo23471g()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x016d
            java.lang.String r6 = "language"
            com.amplitude.api.g r7 = r1.f22291v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo23418f()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo23324a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x016d:
            com.amplitude.api.k r6 = r1.f22282m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo23475k()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x017c
            java.lang.String r6 = "platform"
            java.lang.String r7 = r1.f22284o     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x017c:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0261 }
            r6.<init>()     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = "name"
            java.lang.String r14 = "amplitude-android"
            r6.put(r7, r14)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = "version"
            java.lang.String r14 = "2.21.0"
            r6.put(r7, r14)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = "library"
            r8.put(r7, r6)     // Catch:{ JSONException -> 0x0261 }
            if (r19 != 0) goto L_0x019c
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0261 }
            r6.<init>()     // Catch:{ JSONException -> 0x0261 }
            goto L_0x019e
        L_0x019c:
            r6 = r19
        L_0x019e:
            org.json.JSONObject r7 = r1.f22283n     // Catch:{ JSONException -> 0x0261 }
            if (r7 == 0) goto L_0x01b1
            org.json.JSONObject r7 = r1.f22283n     // Catch:{ JSONException -> 0x0261 }
            int r7 = r7.length()     // Catch:{ JSONException -> 0x0261 }
            if (r7 <= 0) goto L_0x01b1
            java.lang.String r7 = "tracking_options"
            org.json.JSONObject r14 = r1.f22283n     // Catch:{ JSONException -> 0x0261 }
            r6.put(r7, r14)     // Catch:{ JSONException -> 0x0261 }
        L_0x01b1:
            com.amplitude.api.k r7 = r1.f22282m     // Catch:{ JSONException -> 0x0261 }
            boolean r7 = r7.mo23472h()     // Catch:{ JSONException -> 0x0261 }
            if (r7 == 0) goto L_0x01df
            com.amplitude.api.g r7 = r1.f22291v     // Catch:{ JSONException -> 0x0261 }
            android.location.Location r7 = r7.mo23421i()     // Catch:{ JSONException -> 0x0261 }
            if (r7 == 0) goto L_0x01df
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0261 }
            r14.<init>()     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r15 = "lat"
            double r11 = r7.getLatitude()     // Catch:{ JSONException -> 0x0261 }
            r14.put(r15, r11)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r11 = "lng"
            r12 = r10
            double r9 = r7.getLongitude()     // Catch:{ JSONException -> 0x025f }
            r14.put(r11, r9)     // Catch:{ JSONException -> 0x025f }
            java.lang.String r7 = "location"
            r6.put(r7, r14)     // Catch:{ JSONException -> 0x025f }
            goto L_0x01e0
        L_0x01df:
            r12 = r10
        L_0x01e0:
            com.amplitude.api.k r7 = r1.f22282m     // Catch:{ JSONException -> 0x025f }
            boolean r7 = r7.mo23465a()     // Catch:{ JSONException -> 0x025f }
            if (r7 == 0) goto L_0x01fb
            com.amplitude.api.g r7 = r1.f22291v     // Catch:{ JSONException -> 0x025f }
            java.lang.String r7 = r7.mo23412a()     // Catch:{ JSONException -> 0x025f }
            if (r7 == 0) goto L_0x01fb
            java.lang.String r7 = "androidADID"
            com.amplitude.api.g r9 = r1.f22291v     // Catch:{ JSONException -> 0x025f }
            java.lang.String r9 = r9.mo23412a()     // Catch:{ JSONException -> 0x025f }
            r6.put(r7, r9)     // Catch:{ JSONException -> 0x025f }
        L_0x01fb:
            java.lang.String r7 = "limit_ad_tracking"
            com.amplitude.api.g r9 = r1.f22291v     // Catch:{ JSONException -> 0x025f }
            boolean r9 = r9.mo23426n()     // Catch:{ JSONException -> 0x025f }
            r6.put(r7, r9)     // Catch:{ JSONException -> 0x025f }
            java.lang.String r7 = "gps_enabled"
            com.amplitude.api.g r9 = r1.f22291v     // Catch:{ JSONException -> 0x025f }
            boolean r9 = r9.mo23425m()     // Catch:{ JSONException -> 0x025f }
            r6.put(r7, r9)     // Catch:{ JSONException -> 0x025f }
            java.lang.String r7 = "api_properties"
            r8.put(r7, r6)     // Catch:{ JSONException -> 0x025f }
            java.lang.String r6 = "event_properties"
            if (r0 != 0) goto L_0x0220
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x025f }
            r0.<init>()     // Catch:{ JSONException -> 0x025f }
            goto L_0x0224
        L_0x0220:
            org.json.JSONObject r0 = r1.mo23346b(r0)     // Catch:{ JSONException -> 0x025f }
        L_0x0224:
            r8.put(r6, r0)     // Catch:{ JSONException -> 0x025f }
            java.lang.String r0 = "user_properties"
            if (r3 != 0) goto L_0x0231
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x025f }
            r3.<init>()     // Catch:{ JSONException -> 0x025f }
            goto L_0x0235
        L_0x0231:
            org.json.JSONObject r3 = r1.mo23346b(r3)     // Catch:{ JSONException -> 0x025f }
        L_0x0235:
            r8.put(r0, r3)     // Catch:{ JSONException -> 0x025f }
            java.lang.String r0 = "groups"
            if (r4 != 0) goto L_0x0242
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x025f }
            r3.<init>()     // Catch:{ JSONException -> 0x025f }
            goto L_0x0246
        L_0x0242:
            org.json.JSONObject r3 = r1.mo23346b(r4)     // Catch:{ JSONException -> 0x025f }
        L_0x0246:
            r8.put(r0, r3)     // Catch:{ JSONException -> 0x025f }
            java.lang.String r0 = "group_properties"
            if (r5 != 0) goto L_0x0253
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x025f }
            r3.<init>()     // Catch:{ JSONException -> 0x025f }
            goto L_0x0257
        L_0x0253:
            org.json.JSONObject r3 = r1.mo23346b(r5)     // Catch:{ JSONException -> 0x025f }
        L_0x0257:
            r8.put(r0, r3)     // Catch:{ JSONException -> 0x025f }
            long r11 = r1.mo23344b(r2, r8)     // Catch:{ JSONException -> 0x025f }
            goto L_0x028e
        L_0x025f:
            r0 = move-exception
            goto L_0x0263
        L_0x0261:
            r0 = move-exception
            r12 = r10
        L_0x0263:
            com.amplitude.api.d r3 = f22256N
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r13] = r2
            java.lang.String r5 = r0.toString()
            r6 = 1
            r4[r6] = r5
            java.lang.String r5 = "JSON Serialization of event type %s failed, skipping: %s"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r5 = r12
            r3.mo23381b(r5, r4)
            com.amplitude.api.h r3 = com.amplitude.api.C8687h.m20402b()
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r13] = r2
            java.lang.String r2 = "Failed to JSON serialize event type %s"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            r3.mo23431a(r2, r0)
            r11 = -1
        L_0x028e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.C8665c.mo23315a(java.lang.String, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, long, boolean):long");
    }

    /* renamed from: b */
    public JSONObject mo23346b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        String str = "com.amplitude.api.AmplitudeClient";
        if (jSONObject.length() > 1000) {
            f22256N.mo23383d(str, "Warning: too many properties (more than 1000), ignoring");
            return new JSONObject();
        }
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            try {
                Object obj = jSONObject.get(str2);
                if (!str2.equals("$receipt")) {
                    if (!str2.equals("$receiptSig")) {
                        if (obj.getClass().equals(String.class)) {
                            jSONObject.put(str2, m20248f((String) obj));
                        } else if (obj.getClass().equals(JSONObject.class)) {
                            jSONObject.put(str2, mo23346b((JSONObject) obj));
                        } else if (obj.getClass().equals(JSONArray.class)) {
                            jSONObject.put(str2, mo23326a((JSONArray) obj));
                        }
                    }
                }
                jSONObject.put(str2, obj);
            } catch (JSONException e) {
                f22256N.mo23381b(str, e.toString());
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public C8665c mo23345b(String str) {
        Set j = m20254j();
        if (mo23342a("setDeviceId()") && !C8693l.m20451a(str) && !j.contains(str)) {
            mo23331a((Runnable) new C8680m(this, str));
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo23349b(boolean z) {
        String str = "Failed to update server";
        String str2 = "com.amplitude.api.AmplitudeClient";
        if (!this.f22280k && !this.f22281l && !this.f22266J.getAndSet(true)) {
            long min = Math.min((long) (z ? this.f22260D : this.f22293x), this.f22272c.mo23402c());
            if (min <= 0) {
                this.f22266J.set(false);
                return;
            }
            try {
                Pair a = mo23316a(this.f22272c.mo23393a(this.f22287r, min), this.f22272c.mo23401b(this.f22288s, min), min);
                if (((JSONArray) a.second).length() == 0) {
                    this.f22266J.set(false);
                    return;
                }
                long longValue = ((Long) ((Pair) a.first).first).longValue();
                long longValue2 = ((Long) ((Pair) a.first).second).longValue();
                String jSONArray = ((JSONArray) a.second).toString();
                C8694m mVar = this.f22269M;
                C8671e eVar = new C8671e(jSONArray, longValue, longValue2);
                mVar.mo23477a(eVar);
            } catch (JSONException e) {
                this.f22266J.set(false);
                f22256N.mo23381b(str2, e.toString());
                C8687h.m20402b().mo23431a(str, e);
            } catch (CursorWindowAllocationException e2) {
                this.f22266J.set(false);
                f22256N.mo23381b(str2, String.format("Caught Cursor window exception during event upload, deferring upload: %s", new Object[]{e2.getMessage()}));
                C8687h.m20402b().mo23431a(str, e2);
            }
        }
    }

    /* renamed from: b */
    static boolean m20240b(Context context, String str, String str2) {
        String str3 = ".optOut";
        String str4 = ".userId";
        String str5 = ".deviceId";
        String str6 = ".previousSessionId";
        String str7 = ".";
        String str8 = "com.amplitude.api.AmplitudeClient";
        String str9 = "com.amplitude.api";
        if (str == null) {
            try {
                str = C8682e.class.getPackage().getName();
            } catch (Exception unused) {
                str = str9;
            }
        }
        if (str2 == null) {
            str2 = str9;
        }
        try {
            if (str2.equals(str)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str7);
            sb.append(context.getPackageName());
            String sb2 = sb.toString();
            SharedPreferences sharedPreferences = context.getSharedPreferences(sb2, 0);
            if (sharedPreferences.getAll().size() == 0) {
                return false;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(str7);
            sb3.append(context.getPackageName());
            String sb4 = sb3.toString();
            Editor edit = context.getSharedPreferences(sb4, 0).edit();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(str6);
            if (sharedPreferences.contains(sb5.toString())) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(str6);
                edit.putLong("com.amplitude.api.previousSessionId", sharedPreferences.getLong(sb6.toString(), -1));
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            sb7.append(str5);
            if (sharedPreferences.contains(sb7.toString())) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(str5);
                edit.putString("com.amplitude.api.deviceId", sharedPreferences.getString(sb8.toString(), null));
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            sb9.append(str4);
            if (sharedPreferences.contains(sb9.toString())) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(str4);
                edit.putString("com.amplitude.api.userId", sharedPreferences.getString(sb10.toString(), null));
            }
            StringBuilder sb11 = new StringBuilder();
            sb11.append(str);
            sb11.append(str3);
            if (sharedPreferences.contains(sb11.toString())) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(str3);
                edit.putBoolean("com.amplitude.api.optOut", sharedPreferences.getBoolean(sb12.toString(), false));
            }
            edit.apply();
            sharedPreferences.edit().clear().apply();
            C8681d dVar = f22256N;
            StringBuilder sb13 = new StringBuilder();
            sb13.append("Upgraded shared preferences from ");
            sb13.append(sb2);
            sb13.append(" to ");
            sb13.append(sb4);
            dVar.mo23382c(str8, sb13.toString());
            return true;
        } catch (Exception e) {
            f22256N.mo23379a(str8, "Error upgrading shared preferences", e);
            C8687h.m20402b().mo23431a("Failed to upgrade shared prefs", e);
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public long m20227a(String str, long j) {
        Long c = this.f22272c.mo23404c(str);
        return c == null ? j : c.longValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23327a(long j) {
        mo23331a((Runnable) new C8678k(j));
    }

    /* renamed from: a */
    public void mo23332a(String str, int i, double d, String str2, String str3) {
        if (mo23342a("logRevenue()")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("special", "revenue_amount");
                String str4 = str;
                jSONObject.put("productId", str);
                int i2 = i;
                jSONObject.put("quantity", i);
                jSONObject.put("price", d);
                jSONObject.put("receipt", str2);
                jSONObject.put("receiptSig", str3);
            } catch (JSONException e) {
                C8687h.m20402b().mo23431a("Failed to generate API Properties JSON for revenue event", e);
            }
            mo23348b("revenue_amount", null, jSONObject, null, null, null, mo23343b(), false);
        }
    }

    /* renamed from: b */
    static boolean m20238b(Context context) {
        return m20239b(context, (String) null);
    }

    /* renamed from: b */
    static boolean m20239b(Context context, String str) {
        if (str == null) {
            str = "com.amplitude.api";
        }
        C8683f a = C8683f.m20317a(context);
        String str2 = "device_id";
        String d = a.mo23406d(str2);
        Long c = a.mo23404c("previous_session_id");
        Long c2 = a.mo23404c("last_event_time");
        if (!C8693l.m20451a(d) && c != null && c2 != null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(context.getPackageName());
        SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
        m20231a(sharedPreferences, "com.amplitude.api.deviceId", (String) null, a, str2);
        SharedPreferences sharedPreferences2 = sharedPreferences;
        C8683f fVar = a;
        m20230a(sharedPreferences2, "com.amplitude.api.lastEventTime", -1, fVar, "last_event_time");
        m20230a(sharedPreferences2, "com.amplitude.api.lastEventId", -1, fVar, "last_event_id");
        m20230a(sharedPreferences2, "com.amplitude.api.lastIdentifyId", -1, fVar, "last_identify_id");
        m20230a(sharedPreferences2, "com.amplitude.api.previousSessionId", -1, fVar, "previous_session_id");
        m20231a(sharedPreferences, "com.amplitude.api.userId", (String) null, a, "user_id");
        m20232a(sharedPreferences, "com.amplitude.api.optOut", false, a, "opt_out");
        return true;
    }

    /* renamed from: a */
    public void mo23330a(C8691j jVar) {
        if (mo23342a("logRevenueV2()") && jVar != null && jVar.mo23460a()) {
            mo23336a("revenue_amount", jVar.mo23462b());
        }
    }

    /* renamed from: a */
    public void mo23341a(JSONObject jSONObject) {
        if (!(jSONObject == null || jSONObject.length() == 0 || !mo23342a("setUserProperties"))) {
            JSONObject b = mo23346b(jSONObject);
            if (b.length() != 0) {
                C8690i iVar = new C8690i();
                Iterator keys = b.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    try {
                        iVar.mo23441a(str, b.get(str));
                    } catch (JSONException e) {
                        f22256N.mo23381b("com.amplitude.api.AmplitudeClient", e.toString());
                        C8687h.m20402b().mo23431a(String.format("Failed to set user property %s", new Object[]{str}), e);
                    }
                }
                mo23328a(iVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo23343b() {
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo23328a(C8690i iVar) {
        mo23329a(iVar, false);
    }

    /* renamed from: a */
    public void mo23329a(C8690i iVar, boolean z) {
        if (iVar != null && iVar.f22375a.length() != 0 && mo23342a("identify()")) {
            mo23348b("$identify", null, null, iVar.f22375a, null, null, mo23343b(), z);
        }
    }

    /* renamed from: a */
    public void mo23333a(String str, Object obj) {
        JSONObject jSONObject;
        if (mo23342a("setGroup()") && !C8693l.m20451a(str)) {
            try {
                jSONObject = new JSONObject().put(str, obj);
            } catch (JSONException e) {
                f22256N.mo23381b("com.amplitude.api.AmplitudeClient", e.toString());
                C8687h.m20402b().mo23431a(String.format("Failed to generate Group JSON for groupType: %s", new Object[]{str}), e);
                jSONObject = null;
            }
            C8690i iVar = new C8690i();
            iVar.mo23441a(str, obj);
            mo23348b("$identify", null, null, iVar.f22375a, jSONObject, null, mo23343b(), false);
        }
    }

    /* renamed from: a */
    public void mo23334a(String str, Object obj, C8690i iVar) {
        mo23335a(str, obj, iVar, false);
    }

    /* renamed from: a */
    public void mo23335a(String str, Object obj, C8690i iVar, boolean z) {
        JSONObject jSONObject;
        String str2 = str;
        C8690i iVar2 = iVar;
        if (iVar2 != null && iVar2.f22375a.length() != 0) {
            if (mo23342a("groupIdentify()") && !C8693l.m20451a(str)) {
                try {
                    Object obj2 = obj;
                    jSONObject = new JSONObject().put(str, obj);
                } catch (JSONException e) {
                    f22256N.mo23381b("com.amplitude.api.AmplitudeClient", e.toString());
                    C8687h.m20402b().mo23431a(String.format("Failed to generate Group Identify JSON Object for groupType %s", new Object[]{str2}), e);
                    jSONObject = null;
                }
                mo23348b("$groupidentify", null, null, null, jSONObject, iVar2.f22375a, mo23343b(), z);
            }
        }
    }

    /* renamed from: a */
    public JSONArray mo23326a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return new JSONArray();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj.getClass().equals(String.class)) {
                jSONArray.put(i, m20248f((String) obj));
            } else if (obj.getClass().equals(JSONObject.class)) {
                jSONArray.put(i, mo23346b((JSONObject) obj));
            } else if (obj.getClass().equals(JSONArray.class)) {
                jSONArray.put(i, mo23326a((JSONArray) obj));
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public C8665c mo23322a(String str, boolean z) {
        if (!mo23342a("setUserId()")) {
            return this;
        }
        mo23331a((Runnable) new C8679l(this, z, str));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Pair<Pair<Long, Long>, JSONArray> mo23316a(List<JSONObject> list, List<JSONObject> list2, long j) throws JSONException {
        long j2;
        long j3;
        List<JSONObject> list3 = list;
        List<JSONObject> list4 = list2;
        JSONArray jSONArray = new JSONArray();
        long j4 = -1;
        long j5 = -1;
        while (true) {
            if (((long) jSONArray.length()) >= j) {
                break;
            }
            boolean isEmpty = list.isEmpty();
            boolean isEmpty2 = list2.isEmpty();
            if (isEmpty && isEmpty2) {
                f22256N.mo23383d("com.amplitude.api.AmplitudeClient", String.format("mergeEventsAndIdentifys: number of events and identifys less than expected by %d", new Object[]{Long.valueOf(j - ((long) jSONArray.length()))}));
                break;
            }
            String str = "event_id";
            if (isEmpty2) {
                JSONObject jSONObject = (JSONObject) list.remove(0);
                j2 = jSONObject.getLong(str);
                jSONArray.put(jSONObject);
            } else {
                if (isEmpty) {
                    JSONObject jSONObject2 = (JSONObject) list4.remove(0);
                    j3 = jSONObject2.getLong(str);
                    jSONArray.put(jSONObject2);
                } else {
                    String str2 = "sequence_number";
                    if (!((JSONObject) list.get(0)).has(str2) || ((JSONObject) list.get(0)).getLong(str2) < ((JSONObject) list4.get(0)).getLong(str2)) {
                        JSONObject jSONObject3 = (JSONObject) list.remove(0);
                        j2 = jSONObject3.getLong(str);
                        jSONArray.put(jSONObject3);
                    } else {
                        JSONObject jSONObject4 = (JSONObject) list4.remove(0);
                        j3 = jSONObject4.getLong(str);
                        jSONArray.put(jSONObject4);
                    }
                }
                j5 = j3;
            }
            j4 = j2;
        }
        return new Pair<>(new Pair(Long.valueOf(j4), Long.valueOf(j5)), jSONArray);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23340a(okhttp3.C13325v r16, java.lang.String r17, long r18, long r20) {
        /*
            r15 = this;
            r7 = r15
            r1 = r17
            r3 = r18
            r5 = r20
            java.lang.String r8 = "Exception:"
            java.lang.String r9 = "Failed to post upload request"
            java.lang.String r10 = "com.amplitude.api.AmplitudeClient"
            java.lang.String r2 = "2"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = ""
            r0.append(r11)
            long r12 = r15.mo23343b()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x004f }
            r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x004f }
            r0.append(r2)     // Catch:{ UnsupportedEncodingException -> 0x004f }
            java.lang.String r13 = r7.f22273d     // Catch:{ UnsupportedEncodingException -> 0x004f }
            r0.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x004f }
            r0.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x004f }
            r0.append(r12)     // Catch:{ UnsupportedEncodingException -> 0x004f }
            java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x004f }
            g.a.a.a r13 = new g.a.a.a     // Catch:{ UnsupportedEncodingException -> 0x004f }
            r13.<init>()     // Catch:{ UnsupportedEncodingException -> 0x004f }
            java.lang.String r14 = "UTF-8"
            byte[] r0 = r0.getBytes(r14)     // Catch:{ UnsupportedEncodingException -> 0x004f }
            byte[] r0 = r13.digest(r0)     // Catch:{ UnsupportedEncodingException -> 0x004f }
            java.lang.String r11 = r15.mo23325a(r0)     // Catch:{ UnsupportedEncodingException -> 0x004f }
            goto L_0x0062
        L_0x004f:
            r0 = move-exception
            com.amplitude.api.d r13 = f22256N
            java.lang.String r14 = r0.toString()
            r13.mo23381b(r10, r14)
            com.amplitude.api.h r13 = com.amplitude.api.C8687h.m20402b()
            java.lang.String r14 = "Failed to compute checksum for upload request"
            r13.mo23431a(r14, r0)
        L_0x0062:
            okhttp3.p$a r0 = new okhttp3.p$a
            r0.<init>()
            java.lang.String r13 = "v"
            r0.mo38250a(r13, r2)
            java.lang.String r2 = r7.f22273d
            java.lang.String r13 = "client"
            r0.mo38250a(r13, r2)
            java.lang.String r2 = "e"
            r0.mo38250a(r2, r1)
            java.lang.String r1 = "upload_time"
            r0.mo38250a(r1, r12)
            java.lang.String r1 = "checksum"
            r0.mo38250a(r1, r11)
            okhttp3.p r0 = r0.mo38251a()
            r11 = 0
            okhttp3.y$a r1 = new okhttp3.y$a     // Catch:{ IllegalArgumentException -> 0x01bf }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x01bf }
            java.lang.String r2 = r7.f22267K     // Catch:{ IllegalArgumentException -> 0x01bf }
            r1.mo38402b(r2)     // Catch:{ IllegalArgumentException -> 0x01bf }
            r1.mo38399a(r0)     // Catch:{ IllegalArgumentException -> 0x01bf }
            okhttp3.y r0 = r1.mo38400a()     // Catch:{ IllegalArgumentException -> 0x01bf }
            r12 = 1
            r1 = r16
            okhttp3.Call r0 = r1.newCall(r0)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            okhttp3.a0 r0 = r0.execute()     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            okhttp3.b0 r1 = r0.mo37789a()     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            java.lang.String r1 = r1.mo37830g()     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            java.lang.String r2 = "success"
            boolean r2 = r1.equals(r2)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            if (r2 == 0) goto L_0x00d4
            com.amplitude.api.m r0 = r7.f22268L     // Catch:{ ConnectException -> 0x00d1, UnknownHostException -> 0x00ce, IOException -> 0x00cb, AssertionError -> 0x00c8, Exception -> 0x00c5 }
            com.amplitude.api.c$f r13 = new com.amplitude.api.c$f     // Catch:{ ConnectException -> 0x00d1, UnknownHostException -> 0x00ce, IOException -> 0x00cb, AssertionError -> 0x00c8, Exception -> 0x00c5 }
            r1 = r13
            r2 = r15
            r3 = r18
            r5 = r20
            r1.<init>(r3, r5)     // Catch:{ ConnectException -> 0x00d1, UnknownHostException -> 0x00ce, IOException -> 0x00cb, AssertionError -> 0x00c8, Exception -> 0x00c5 }
            r0.mo23477a(r13)     // Catch:{ ConnectException -> 0x00d1, UnknownHostException -> 0x00ce, IOException -> 0x00cb, AssertionError -> 0x00c8, Exception -> 0x00c5 }
            goto L_0x01b7
        L_0x00c5:
            r0 = move-exception
            goto L_0x0175
        L_0x00c8:
            r0 = move-exception
            goto L_0x0184
        L_0x00cb:
            r0 = move-exception
            goto L_0x0193
        L_0x00ce:
            r0 = move-exception
            goto L_0x01a6
        L_0x00d1:
            r0 = move-exception
            goto L_0x01b0
        L_0x00d4:
            java.lang.String r2 = "invalid_api_key"
            boolean r2 = r1.equals(r2)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            if (r2 == 0) goto L_0x00e5
            com.amplitude.api.d r0 = f22256N     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            java.lang.String r1 = "Invalid API key, make sure your API key is correct in initialize()"
            r0.mo23381b(r10, r1)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            goto L_0x0171
        L_0x00e5:
            java.lang.String r2 = "bad_checksum"
            boolean r2 = r1.equals(r2)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            if (r2 == 0) goto L_0x00f6
            com.amplitude.api.d r0 = f22256N     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            java.lang.String r1 = "Bad checksum, post request was mangled in transit, will attempt to reupload later"
            r0.mo23383d(r10, r1)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            goto L_0x0171
        L_0x00f6:
            java.lang.String r2 = "request_db_write_failed"
            boolean r2 = r1.equals(r2)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            if (r2 == 0) goto L_0x0106
            com.amplitude.api.d r0 = f22256N     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            java.lang.String r1 = "Couldn't write to request database on server, will attempt to reupload later"
            r0.mo23383d(r10, r1)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            goto L_0x0171
        L_0x0106:
            int r0 = r0.mo37793d()     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            r2 = 413(0x19d, float:5.79E-43)
            if (r0 != r2) goto L_0x0156
            boolean r0 = r7.f22259C     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            if (r0 == 0) goto L_0x012a
            int r0 = r7.f22260D     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            if (r0 != r12) goto L_0x012a
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0121
            com.amplitude.api.f r2 = r7.f22272c     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            r2.mo23405c(r3)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
        L_0x0121:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x012a
            com.amplitude.api.f r0 = r7.f22272c     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            r0.mo23408e(r5)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
        L_0x012a:
            r7.f22259C = r12     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            com.amplitude.api.f r0 = r7.f22272c     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            long r0 = r0.mo23384a()     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            int r1 = (int) r0     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            int r0 = r7.f22260D     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            double r0 = (double) r0     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            int r0 = (int) r0     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            r7.f22260D = r0     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            com.amplitude.api.d r0 = f22256N     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            java.lang.String r1 = "Request too large, will decrease size and attempt to reupload"
            r0.mo23383d(r10, r1)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            com.amplitude.api.m r0 = r7.f22268L     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            com.amplitude.api.c$g r1 = new com.amplitude.api.c$g     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            r1.<init>()     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            r0.mo23477a(r1)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            goto L_0x0171
        L_0x0156:
            com.amplitude.api.d r0 = f22256N     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            r2.<init>()     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            java.lang.String r3 = "Upload failed, "
            r2.append(r3)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            r2.append(r1)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            java.lang.String r1 = ", will attempt to reupload later"
            r2.append(r1)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            java.lang.String r1 = r2.toString()     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
            r0.mo23383d(r10, r1)     // Catch:{ ConnectException -> 0x01ae, UnknownHostException -> 0x01a4, IOException -> 0x0191, AssertionError -> 0x0182, Exception -> 0x0173 }
        L_0x0171:
            r12 = 0
            goto L_0x01b7
        L_0x0173:
            r0 = move-exception
            r12 = 0
        L_0x0175:
            com.amplitude.api.d r1 = f22256N
            r1.mo23379a(r10, r8, r0)
            com.amplitude.api.h r1 = com.amplitude.api.C8687h.m20402b()
            r1.mo23431a(r9, r0)
            goto L_0x01b7
        L_0x0182:
            r0 = move-exception
            r12 = 0
        L_0x0184:
            com.amplitude.api.d r1 = f22256N
            r1.mo23379a(r10, r8, r0)
            com.amplitude.api.h r1 = com.amplitude.api.C8687h.m20402b()
            r1.mo23431a(r9, r0)
            goto L_0x01b7
        L_0x0191:
            r0 = move-exception
            r12 = 0
        L_0x0193:
            com.amplitude.api.d r1 = f22256N
            java.lang.String r2 = r0.toString()
            r1.mo23381b(r10, r2)
            com.amplitude.api.h r1 = com.amplitude.api.C8687h.m20402b()
            r1.mo23431a(r9, r0)
            goto L_0x01b7
        L_0x01a4:
            r0 = move-exception
            r12 = 0
        L_0x01a6:
            com.amplitude.api.h r1 = com.amplitude.api.C8687h.m20402b()
            r1.mo23431a(r9, r0)
            goto L_0x01b7
        L_0x01ae:
            r0 = move-exception
            r12 = 0
        L_0x01b0:
            com.amplitude.api.h r1 = com.amplitude.api.C8687h.m20402b()
            r1.mo23431a(r9, r0)
        L_0x01b7:
            if (r12 != 0) goto L_0x01be
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f22266J
            r0.set(r11)
        L_0x01be:
            return
        L_0x01bf:
            r0 = move-exception
            com.amplitude.api.d r1 = f22256N
            java.lang.String r2 = r0.toString()
            r1.mo23381b(r10, r2)
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.f22266J
            r1.set(r11)
            com.amplitude.api.h r1 = com.amplitude.api.C8687h.m20402b()
            java.lang.String r2 = "Failed to build upload request"
            r1.mo23431a(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.C8665c.mo23340a(okhttp3.v, java.lang.String, long, long):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23331a(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        C8694m mVar = this.f22268L;
        if (currentThread != mVar) {
            mVar.mo23477a(runnable);
        } else {
            runnable.run();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo23324a(Object obj) {
        return obj == null ? JSONObject.NULL : obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized boolean mo23342a(String str) {
        if (this.f22270a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("context cannot be null, set context with initialize() before calling ");
            sb.append(str);
            f22256N.mo23381b("com.amplitude.api.AmplitudeClient", sb.toString());
            return false;
        } else if (!C8693l.m20451a(this.f22273d)) {
            return true;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("apiKey cannot be null or empty, set apiKey with initialize() before calling ");
            sb2.append(str);
            f22256N.mo23381b("com.amplitude.api.AmplitudeClient", sb2.toString());
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo23325a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            cArr2[i2] = cArr[b >>> 4];
            cArr2[i2 + 1] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    /* renamed from: a */
    static boolean m20235a(Context context) {
        return m20240b(context, null, null);
    }

    /* renamed from: a */
    private static void m20230a(SharedPreferences sharedPreferences, String str, long j, C8683f fVar, String str2) {
        if (fVar.mo23404c(str2) == null) {
            fVar.mo23389a(str2, Long.valueOf(sharedPreferences.getLong(str, j)));
            sharedPreferences.edit().remove(str).apply();
        }
    }

    /* renamed from: a */
    private static void m20231a(SharedPreferences sharedPreferences, String str, String str2, C8683f fVar, String str3) {
        if (C8693l.m20451a(fVar.mo23406d(str3))) {
            String string = sharedPreferences.getString(str, str2);
            if (!C8693l.m20451a(string)) {
                fVar.mo23403c(str3, string);
                sharedPreferences.edit().remove(str).apply();
            }
        }
    }

    /* renamed from: a */
    private static void m20232a(SharedPreferences sharedPreferences, String str, boolean z, C8683f fVar, String str2) {
        if (fVar.mo23404c(str2) == null) {
            fVar.mo23389a(str2, Long.valueOf(sharedPreferences.getBoolean(str, z) ? 1 : 0));
            sharedPreferences.edit().remove(str).apply();
        }
    }
}
