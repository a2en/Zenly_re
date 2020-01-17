package com.crashlytics.android.core;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.crashlytics.android.answers.C9256b;
import com.crashlytics.android.answers.EventLogger;
import com.crashlytics.android.core.LogFileManager.DirectoryProvider;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.Logger;
import p389io.fabric.sdk.android.services.common.C12180h;
import p389io.fabric.sdk.android.services.common.C12183i.C12184a;
import p389io.fabric.sdk.android.services.common.C12183i.C12185b;
import p389io.fabric.sdk.android.services.common.C12186j;
import p389io.fabric.sdk.android.services.common.C12187k;
import p389io.fabric.sdk.android.services.common.C12195p;
import p389io.fabric.sdk.android.services.network.HttpRequestFactory;
import p389io.fabric.sdk.android.services.persistence.FileStore;
import p389io.fabric.sdk.android.services.settings.C12253e;
import p389io.fabric.sdk.android.services.settings.C12261m;
import p389io.fabric.sdk.android.services.settings.C12263o;
import p389io.fabric.sdk.android.services.settings.C12264p;
import p389io.fabric.sdk.android.services.settings.C12266r;
import p389io.fabric.sdk.android.services.settings.Settings;

/* renamed from: com.crashlytics.android.core.k */
class C9337k {

    /* renamed from: s */
    static final FilenameFilter f24210s = new C9361k("BeginSession");

    /* renamed from: t */
    static final FilenameFilter f24211t = new C9372r();

    /* renamed from: u */
    static final FileFilter f24212u = new C9373s();

    /* renamed from: v */
    static final Comparator<File> f24213v = new C9374t();

    /* renamed from: w */
    static final Comparator<File> f24214w = new C9375u();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final Pattern f24215x = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");

    /* renamed from: y */
    private static final Map<String, String> f24216y = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");

    /* renamed from: z */
    private static final String[] f24217z = {"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};

    /* renamed from: a */
    private final AtomicInteger f24218a = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9382l f24219b;

    /* renamed from: c */
    private final C9331j f24220c;

    /* renamed from: d */
    private final HttpRequestFactory f24221d;

    /* renamed from: e */
    private final C12195p f24222e;

    /* renamed from: f */
    private final C9320g0 f24223f;

    /* renamed from: g */
    private final FileStore f24224g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C9303a f24225h;

    /* renamed from: i */
    private final C9349f0 f24226i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final LogFileManager f24227j;

    /* renamed from: k */
    private final C9394c f24228k;

    /* renamed from: l */
    private final C9393b f24229l;

    /* renamed from: m */
    private final C9416v f24230m;

    /* renamed from: n */
    private final C9408r0 f24231n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final String f24232o;

    /* renamed from: p */
    private final C9306b f24233p;

    /* renamed from: q */
    private final EventLogger f24234q;

    /* renamed from: r */
    private C9403q f24235r;

    /* renamed from: com.crashlytics.android.core.k$a */
    class C9338a implements Callable<Void> {

        /* renamed from: e */
        final /* synthetic */ String f24236e;

        /* renamed from: f */
        final /* synthetic */ String f24237f;

        /* renamed from: g */
        final /* synthetic */ String f24238g;

        C9338a(String str, String str2, String str3) {
            this.f24236e = str;
            this.f24237f = str2;
            this.f24238g = str3;
        }

        public Void call() throws Exception {
            new C9304a0(C9337k.this.mo25147c()).mo25062a(C9337k.this.m22614o(), new C9415u0(this.f24236e, this.f24237f, this.f24238g));
            return null;
        }
    }

    /* renamed from: com.crashlytics.android.core.k$a0 */
    private interface C9339a0 {
        /* renamed from: a */
        void mo25157a(C9318g gVar) throws Exception;
    }

    /* renamed from: com.crashlytics.android.core.k$b */
    class C9340b implements Callable<Void> {

        /* renamed from: e */
        final /* synthetic */ Map f24240e;

        C9340b(Map map) {
            this.f24240e = map;
        }

        public Void call() throws Exception {
            new C9304a0(C9337k.this.mo25147c()).mo25063a(C9337k.this.m22614o(), this.f24240e);
            return null;
        }
    }

    /* renamed from: com.crashlytics.android.core.k$b0 */
    private static final class C9341b0 implements C9405b {
        private C9341b0() {
        }

        /* renamed from: a */
        public C12266r mo25159a() {
            return Settings.m32463d().mo36256a();
        }

        /* synthetic */ C9341b0(C9361k kVar) {
            this();
        }
    }

    /* renamed from: com.crashlytics.android.core.k$c */
    class C9342c implements Callable<Void> {
        C9342c() {
        }

        public Void call() throws Exception {
            C9337k.this.m22612m();
            return null;
        }
    }

    /* renamed from: com.crashlytics.android.core.k$c0 */
    static class C9343c0 implements FilenameFilter {

        /* renamed from: a */
        private final String f24243a;

        public C9343c0(String str) {
            this.f24243a = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.f24243a) && !str.endsWith(".cls_temp");
        }
    }

    /* renamed from: com.crashlytics.android.core.k$d */
    class C9344d implements Callable<Boolean> {

        /* renamed from: e */
        final /* synthetic */ C12264p f24244e;

        C9344d(C12264p pVar) {
            this.f24244e = pVar;
        }

        public Boolean call() throws Exception {
            String str = "CrashlyticsCore";
            if (C9337k.this.mo25150f()) {
                C12154c.m32113f().mo35954d(str, "Skipping session finalization because a crash has already occurred.");
                return Boolean.FALSE;
            }
            C12154c.m32113f().mo35954d(str, "Finalizing previously open sessions.");
            C9337k.this.m22566a(this.f24244e, true);
            C12154c.m32113f().mo35954d(str, "Closed all previously open sessions");
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.crashlytics.android.core.k$d0 */
    private interface C9345d0 {
        /* renamed from: a */
        void mo25163a(FileOutputStream fileOutputStream) throws Exception;
    }

    /* renamed from: com.crashlytics.android.core.k$e */
    class C9346e implements Runnable {
        C9346e() {
        }

        public void run() {
            C9337k kVar = C9337k.this;
            kVar.mo25143a(kVar.m22584a((FilenameFilter) new C9347e0()));
        }
    }

    /* renamed from: com.crashlytics.android.core.k$e0 */
    static class C9347e0 implements FilenameFilter {
        C9347e0() {
        }

        public boolean accept(File file, String str) {
            return C9315f.f24173h.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    /* renamed from: com.crashlytics.android.core.k$f */
    class C9348f implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Set f24247a;

        C9348f(C9337k kVar, Set set) {
            this.f24247a = set;
        }

        public boolean accept(File file, String str) {
            if (str.length() < 35) {
                return false;
            }
            return this.f24247a.contains(str.substring(0, 35));
        }
    }

    /* renamed from: com.crashlytics.android.core.k$f0 */
    private static final class C9349f0 implements DirectoryProvider {

        /* renamed from: a */
        private final FileStore f24248a;

        public C9349f0(FileStore fileStore) {
            this.f24248a = fileStore;
        }

        public File getLogFileDir() {
            File file = new File(this.f24248a.getFilesDir(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* renamed from: com.crashlytics.android.core.k$g */
    class C9350g implements Callable<Boolean> {

        /* renamed from: e */
        final /* synthetic */ C9399o f24249e;

        C9350g(C9399o oVar) {
            this.f24249e = oVar;
        }

        public Boolean call() throws Exception {
            TreeSet<File> treeSet = this.f24249e.f24355a;
            String c = C9337k.this.m22615p();
            if (c != null && !treeSet.isEmpty()) {
                File file = (File) treeSet.first();
                if (file != null) {
                    C9337k kVar = C9337k.this;
                    kVar.m22555a(kVar.f24219b.mo36008b(), file, c);
                }
            }
            C9337k.this.m22576a((Set<File>) treeSet);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.crashlytics.android.core.k$g0 */
    private static final class C9351g0 implements C9395d {

        /* renamed from: a */
        private final C12161g f24251a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C9320g0 f24252b;

        /* renamed from: c */
        private final C12263o f24253c;

        /* renamed from: com.crashlytics.android.core.k$g0$a */
        class C9352a implements C9328d {
            C9352a() {
            }

            /* renamed from: a */
            public void mo25122a(boolean z) {
                C9351g0.this.f24252b.mo25114a(z);
            }
        }

        /* renamed from: com.crashlytics.android.core.k$g0$b */
        class C9353b implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C9324i f24255e;

            C9353b(C9351g0 g0Var, C9324i iVar) {
                this.f24255e = iVar;
            }

            public void run() {
                this.f24255e.mo25118c();
            }
        }

        public C9351g0(C12161g gVar, C9320g0 g0Var, C12263o oVar) {
            this.f24251a = gVar;
            this.f24252b = g0Var;
            this.f24253c = oVar;
        }

        /* renamed from: a */
        public boolean mo25168a() {
            Activity a = this.f24251a.mo36013d().mo35978a();
            if (a == null || a.isFinishing()) {
                return true;
            }
            C9324i a2 = C9324i.m22531a(a, this.f24253c, new C9352a());
            a.runOnUiThread(new C9353b(this, a2));
            C12154c.m32113f().mo35954d("CrashlyticsCore", "Waiting for user opt-in.");
            a2.mo25116a();
            return a2.mo25117b();
        }
    }

    /* renamed from: com.crashlytics.android.core.k$h */
    class C9354h implements C9339a0 {

        /* renamed from: a */
        final /* synthetic */ String f24256a;

        /* renamed from: b */
        final /* synthetic */ String f24257b;

        /* renamed from: c */
        final /* synthetic */ long f24258c;

        C9354h(C9337k kVar, String str, String str2, long j) {
            this.f24256a = str;
            this.f24257b = str2;
            this.f24258c = j;
        }

        /* renamed from: a */
        public void mo25157a(C9318g gVar) throws Exception {
            C9400o0.m22746a(gVar, this.f24256a, this.f24257b, this.f24258c);
        }
    }

    /* renamed from: com.crashlytics.android.core.k$h0 */
    private final class C9355h0 implements C9394c {
        private C9355h0() {
        }

        /* renamed from: a */
        public File[] mo25170a() {
            return C9337k.this.mo25152h();
        }

        /* renamed from: b */
        public File[] mo25171b() {
            return C9337k.this.mo25148d().listFiles();
        }

        /* renamed from: c */
        public File[] mo25172c() {
            return C9337k.this.mo25151g();
        }

        /* synthetic */ C9355h0(C9337k kVar, C9361k kVar2) {
            this();
        }
    }

    /* renamed from: com.crashlytics.android.core.k$i */
    class C9356i implements C9345d0 {

        /* renamed from: a */
        final /* synthetic */ String f24260a;

        /* renamed from: b */
        final /* synthetic */ String f24261b;

        /* renamed from: c */
        final /* synthetic */ long f24262c;

        /* renamed from: com.crashlytics.android.core.k$i$a */
        class C9357a extends HashMap<String, Object> {
            C9357a() {
                put("session_id", C9356i.this.f24260a);
                put("generator", C9356i.this.f24261b);
                put("started_at_seconds", Long.valueOf(C9356i.this.f24262c));
            }
        }

        C9356i(C9337k kVar, String str, String str2, long j) {
            this.f24260a = str;
            this.f24261b = str2;
            this.f24262c = j;
        }

        /* renamed from: a */
        public void mo25163a(FileOutputStream fileOutputStream) throws Exception {
            fileOutputStream.write(new JSONObject(new C9357a()).toString().getBytes());
        }
    }

    /* renamed from: com.crashlytics.android.core.k$i0 */
    private final class C9358i0 implements C9393b {
        private C9358i0() {
        }

        /* renamed from: a */
        public boolean mo25173a() {
            return C9337k.this.mo25150f();
        }

        /* synthetic */ C9358i0(C9337k kVar, C9361k kVar2) {
            this();
        }
    }

    /* renamed from: com.crashlytics.android.core.k$j */
    class C9359j implements C9339a0 {

        /* renamed from: a */
        final /* synthetic */ String f24265a;

        /* renamed from: b */
        final /* synthetic */ String f24266b;

        /* renamed from: c */
        final /* synthetic */ String f24267c;

        /* renamed from: d */
        final /* synthetic */ String f24268d;

        /* renamed from: e */
        final /* synthetic */ int f24269e;

        C9359j(String str, String str2, String str3, String str4, int i) {
            this.f24265a = str;
            this.f24266b = str2;
            this.f24267c = str3;
            this.f24268d = str4;
            this.f24269e = i;
        }

        /* renamed from: a */
        public void mo25157a(C9318g gVar) throws Exception {
            C9400o0.m22748a(gVar, this.f24265a, C9337k.this.f24225h.f24154a, this.f24266b, this.f24267c, this.f24268d, this.f24269e, C9337k.this.f24232o);
        }
    }

    /* renamed from: com.crashlytics.android.core.k$j0 */
    private static final class C9360j0 implements Runnable {

        /* renamed from: e */
        private final Context f24271e;

        /* renamed from: f */
        private final C9388l0 f24272f;

        /* renamed from: g */
        private final C9391m0 f24273g;

        public C9360j0(Context context, C9388l0 l0Var, C9391m0 m0Var) {
            this.f24271e = context;
            this.f24272f = l0Var;
            this.f24273g = m0Var;
        }

        public void run() {
            if (C12180h.m32263b(this.f24271e)) {
                C12154c.m32113f().mo35954d("CrashlyticsCore", "Attempting to send crash report at time of crash...");
                this.f24273g.mo25214a(this.f24272f);
            }
        }
    }

    /* renamed from: com.crashlytics.android.core.k$k */
    static class C9361k extends C9343c0 {
        C9361k(String str) {
            super(str);
        }

        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(".cls");
        }
    }

    /* renamed from: com.crashlytics.android.core.k$k0 */
    static class C9362k0 implements FilenameFilter {

        /* renamed from: a */
        private final String f24274a;

        public C9362k0(String str) {
            this.f24274a = str;
        }

        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f24274a);
            sb.append(".cls");
            boolean z = false;
            if (str.equals(sb.toString())) {
                return false;
            }
            if (str.contains(this.f24274a) && !str.endsWith(".cls_temp")) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: com.crashlytics.android.core.k$l */
    class C9363l implements C9345d0 {

        /* renamed from: a */
        final /* synthetic */ String f24275a;

        /* renamed from: b */
        final /* synthetic */ String f24276b;

        /* renamed from: c */
        final /* synthetic */ String f24277c;

        /* renamed from: d */
        final /* synthetic */ String f24278d;

        /* renamed from: e */
        final /* synthetic */ int f24279e;

        /* renamed from: com.crashlytics.android.core.k$l$a */
        class C9364a extends HashMap<String, Object> {
            C9364a() {
                put("app_identifier", C9363l.this.f24275a);
                put("api_key", C9337k.this.f24225h.f24154a);
                put("version_code", C9363l.this.f24276b);
                put("version_name", C9363l.this.f24277c);
                put("install_uuid", C9363l.this.f24278d);
                put("delivery_mechanism", Integer.valueOf(C9363l.this.f24279e));
                put("unity_version", TextUtils.isEmpty(C9337k.this.f24232o) ? "" : C9337k.this.f24232o);
            }
        }

        C9363l(String str, String str2, String str3, String str4, int i) {
            this.f24275a = str;
            this.f24276b = str2;
            this.f24277c = str3;
            this.f24278d = str4;
            this.f24279e = i;
        }

        /* renamed from: a */
        public void mo25163a(FileOutputStream fileOutputStream) throws Exception {
            fileOutputStream.write(new JSONObject(new C9364a()).toString().getBytes());
        }
    }

    /* renamed from: com.crashlytics.android.core.k$m */
    class C9365m implements C9339a0 {

        /* renamed from: a */
        final /* synthetic */ boolean f24282a;

        C9365m(C9337k kVar, boolean z) {
            this.f24282a = z;
        }

        /* renamed from: a */
        public void mo25157a(C9318g gVar) throws Exception {
            C9400o0.m22749a(gVar, VERSION.RELEASE, VERSION.CODENAME, this.f24282a);
        }
    }

    /* renamed from: com.crashlytics.android.core.k$n */
    class C9366n implements C9345d0 {

        /* renamed from: a */
        final /* synthetic */ boolean f24283a;

        /* renamed from: com.crashlytics.android.core.k$n$a */
        class C9367a extends HashMap<String, Object> {
            C9367a() {
                put("version", VERSION.RELEASE);
                put("build_version", VERSION.CODENAME);
                put("is_rooted", Boolean.valueOf(C9366n.this.f24283a));
            }
        }

        C9366n(C9337k kVar, boolean z) {
            this.f24283a = z;
        }

        /* renamed from: a */
        public void mo25163a(FileOutputStream fileOutputStream) throws Exception {
            fileOutputStream.write(new JSONObject(new C9367a()).toString().getBytes());
        }
    }

    /* renamed from: com.crashlytics.android.core.k$o */
    class C9368o implements C9339a0 {

        /* renamed from: a */
        final /* synthetic */ int f24285a;

        /* renamed from: b */
        final /* synthetic */ int f24286b;

        /* renamed from: c */
        final /* synthetic */ long f24287c;

        /* renamed from: d */
        final /* synthetic */ long f24288d;

        /* renamed from: e */
        final /* synthetic */ boolean f24289e;

        /* renamed from: f */
        final /* synthetic */ Map f24290f;

        /* renamed from: g */
        final /* synthetic */ int f24291g;

        C9368o(C9337k kVar, int i, int i2, long j, long j2, boolean z, Map map, int i3) {
            this.f24285a = i;
            this.f24286b = i2;
            this.f24287c = j;
            this.f24288d = j2;
            this.f24289e = z;
            this.f24290f = map;
            this.f24291g = i3;
        }

        /* renamed from: a */
        public void mo25157a(C9318g gVar) throws Exception {
            C9400o0.m22739a(gVar, this.f24285a, Build.MODEL, this.f24286b, this.f24287c, this.f24288d, this.f24289e, this.f24290f, this.f24291g, Build.MANUFACTURER, Build.PRODUCT);
        }
    }

    /* renamed from: com.crashlytics.android.core.k$p */
    class C9369p implements C9345d0 {

        /* renamed from: a */
        final /* synthetic */ int f24292a;

        /* renamed from: b */
        final /* synthetic */ int f24293b;

        /* renamed from: c */
        final /* synthetic */ long f24294c;

        /* renamed from: d */
        final /* synthetic */ long f24295d;

        /* renamed from: e */
        final /* synthetic */ boolean f24296e;

        /* renamed from: f */
        final /* synthetic */ Map f24297f;

        /* renamed from: g */
        final /* synthetic */ int f24298g;

        /* renamed from: com.crashlytics.android.core.k$p$a */
        class C9370a extends HashMap<String, Object> {
            C9370a() {
                put("arch", Integer.valueOf(C9369p.this.f24292a));
                put("build_model", Build.MODEL);
                put("available_processors", Integer.valueOf(C9369p.this.f24293b));
                put("total_ram", Long.valueOf(C9369p.this.f24294c));
                put("disk_space", Long.valueOf(C9369p.this.f24295d));
                put("is_emulator", Boolean.valueOf(C9369p.this.f24296e));
                put("ids", C9369p.this.f24297f);
                put("state", Integer.valueOf(C9369p.this.f24298g));
                put("build_manufacturer", Build.MANUFACTURER);
                put("build_product", Build.PRODUCT);
            }
        }

        C9369p(C9337k kVar, int i, int i2, long j, long j2, boolean z, Map map, int i3) {
            this.f24292a = i;
            this.f24293b = i2;
            this.f24294c = j;
            this.f24295d = j2;
            this.f24296e = z;
            this.f24297f = map;
            this.f24298g = i3;
        }

        /* renamed from: a */
        public void mo25163a(FileOutputStream fileOutputStream) throws Exception {
            fileOutputStream.write(new JSONObject(new C9370a()).toString().getBytes());
        }
    }

    /* renamed from: com.crashlytics.android.core.k$q */
    class C9371q implements C9339a0 {

        /* renamed from: a */
        final /* synthetic */ C9415u0 f24300a;

        C9371q(C9337k kVar, C9415u0 u0Var) {
            this.f24300a = u0Var;
        }

        /* renamed from: a */
        public void mo25157a(C9318g gVar) throws Exception {
            C9415u0 u0Var = this.f24300a;
            C9400o0.m22747a(gVar, u0Var.f24378a, u0Var.f24379b, u0Var.f24380c);
        }
    }

    /* renamed from: com.crashlytics.android.core.k$r */
    static class C9372r implements FilenameFilter {
        C9372r() {
        }

        public boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(".cls");
        }
    }

    /* renamed from: com.crashlytics.android.core.k$s */
    static class C9373s implements FileFilter {
        C9373s() {
        }

        public boolean accept(File file) {
            return file.isDirectory() && file.getName().length() == 35;
        }
    }

    /* renamed from: com.crashlytics.android.core.k$t */
    static class C9374t implements Comparator<File> {
        C9374t() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    }

    /* renamed from: com.crashlytics.android.core.k$u */
    static class C9375u implements Comparator<File> {
        C9375u() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    }

    /* renamed from: com.crashlytics.android.core.k$v */
    class C9376v implements C9404a {
        C9376v() {
        }

        /* renamed from: a */
        public void mo25182a(C9405b bVar, Thread thread, Throwable th, boolean z) {
            C9337k.this.mo25136a(bVar, thread, th, z);
        }
    }

    /* renamed from: com.crashlytics.android.core.k$w */
    class C9377w implements Callable<Void> {

        /* renamed from: e */
        final /* synthetic */ Date f24302e;

        /* renamed from: f */
        final /* synthetic */ Thread f24303f;

        /* renamed from: g */
        final /* synthetic */ Throwable f24304g;

        /* renamed from: h */
        final /* synthetic */ C9405b f24305h;

        /* renamed from: i */
        final /* synthetic */ boolean f24306i;

        C9377w(Date date, Thread thread, Throwable th, C9405b bVar, boolean z) {
            this.f24302e = date;
            this.f24303f = thread;
            this.f24304g = th;
            this.f24305h = bVar;
            this.f24306i = z;
        }

        public Void call() throws Exception {
            C12261m mVar;
            C12264p pVar;
            C9337k.this.f24219b.mo25195l();
            C9337k.this.m22592b(this.f24302e, this.f24303f, this.f24304g);
            C12266r a = this.f24305h.mo25159a();
            if (a != null) {
                pVar = a.f31917b;
                mVar = a.f31919d;
            } else {
                pVar = null;
                mVar = null;
            }
            boolean z = false;
            if ((mVar == null || mVar.f31893e) || this.f24306i) {
                C9337k.this.m22554a(this.f24302e.getTime());
            }
            C9337k.this.mo25137a(pVar);
            C9337k.this.m22612m();
            if (pVar != null) {
                C9337k.this.mo25134a(pVar.f31911g);
            }
            if (C12186j.m32286a(C9337k.this.f24219b.mo36008b()).mo36071a() && !C9337k.this.m22600c(a)) {
                z = true;
            }
            if (z) {
                C9337k.this.m22591b(a);
            }
            return null;
        }
    }

    /* renamed from: com.crashlytics.android.core.k$x */
    class C9378x implements Callable<Void> {

        /* renamed from: e */
        final /* synthetic */ long f24308e;

        /* renamed from: f */
        final /* synthetic */ String f24309f;

        C9378x(long j, String str) {
            this.f24308e = j;
            this.f24309f = str;
        }

        public Void call() throws Exception {
            if (!C9337k.this.mo25150f()) {
                C9337k.this.f24227j.mo25046a(this.f24308e, this.f24309f);
            }
            return null;
        }
    }

    /* renamed from: com.crashlytics.android.core.k$y */
    class C9379y implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Date f24311e;

        /* renamed from: f */
        final /* synthetic */ Thread f24312f;

        /* renamed from: g */
        final /* synthetic */ Throwable f24313g;

        C9379y(Date date, Thread thread, Throwable th) {
            this.f24311e = date;
            this.f24312f = thread;
            this.f24313g = th;
        }

        public void run() {
            if (!C9337k.this.mo25150f()) {
                C9337k.this.m22575a(this.f24311e, this.f24312f, this.f24313g);
            }
        }
    }

    /* renamed from: com.crashlytics.android.core.k$z */
    private static class C9380z implements FilenameFilter {
        private C9380z() {
        }

        public boolean accept(File file, String str) {
            return !C9337k.f24211t.accept(file, str) && C9337k.f24215x.matcher(str).matches();
        }

        /* synthetic */ C9380z(C9361k kVar) {
            this();
        }
    }

    C9337k(C9382l lVar, C9331j jVar, HttpRequestFactory httpRequestFactory, C12195p pVar, C9320g0 g0Var, FileStore fileStore, C9303a aVar, C9413t0 t0Var, C9306b bVar, EventLogger eventLogger) {
        this.f24219b = lVar;
        this.f24220c = jVar;
        this.f24221d = httpRequestFactory;
        this.f24222e = pVar;
        this.f24223f = g0Var;
        this.f24224g = fileStore;
        this.f24225h = aVar;
        this.f24232o = t0Var.mo25217a();
        this.f24233p = bVar;
        this.f24234q = eventLogger;
        Context b = lVar.mo36008b();
        this.f24226i = new C9349f0(fileStore);
        this.f24227j = new LogFileManager(b, this.f24226i);
        this.f24228k = new C9355h0(this, null);
        this.f24229l = new C9358i0(this, null);
        this.f24230m = new C9416v(b);
        this.f24231n = new C9307b0(1024, new C9381k0(10));
    }

    /* renamed from: b */
    private File[] m22596b(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m22612m() throws Exception {
        Date date = new Date();
        String eVar = new C9313e(this.f24222e).toString();
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append("Opening a new session with ID ");
        sb.append(eVar);
        f.mo35954d("CrashlyticsCore", sb.toString());
        m22574a(eVar, date);
        m22603d(eVar);
        m22608f(eVar);
        m22606e(eVar);
        this.f24227j.mo25048a(eVar);
    }

    /* renamed from: n */
    private boolean m22613n() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public String m22614o() {
        File[] q = m22616q();
        if (q.length > 0) {
            return m22553a(q[0]);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public String m22615p() {
        File[] q = m22616q();
        if (q.length > 1) {
            return m22553a(q[1]);
        }
        return null;
    }

    /* renamed from: q */
    private File[] m22616q() {
        File[] i = mo25153i();
        Arrays.sort(i, f24213v);
        return i;
    }

    /* renamed from: r */
    private void m22617r() {
        File d = mo25148d();
        if (d.exists()) {
            File[] a = m22582a(d, (FilenameFilter) new C9347e0());
            Arrays.sort(a, Collections.reverseOrder());
            HashSet hashSet = new HashSet();
            for (int i = 0; i < a.length && hashSet.size() < 4; i++) {
                hashSet.add(m22553a(a[i]));
            }
            m22579a(m22595b(d), (Set<String>) hashSet);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public File[] mo25152h() {
        return m22583a(f24212u);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public File[] mo25153i() {
        return m22584a(f24210s);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo25154j() {
        this.f24220c.mo25127a((Callable<T>) new C9342c<T>());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo25155k() {
        this.f24230m.mo25228b();
    }

    /* renamed from: c */
    private void m22598c(File file) {
        if (file.isDirectory()) {
            for (File c : file.listFiles()) {
                m22598c(c);
            }
        }
        file.delete();
    }

    /* renamed from: d */
    private void m22603d(String str) throws Exception {
        String c = this.f24222e.mo36085c();
        C9303a aVar = this.f24225h;
        String str2 = aVar.f24158e;
        String str3 = aVar.f24159f;
        String str4 = c;
        String str5 = str2;
        String str6 = str3;
        String d = this.f24222e.mo36086d();
        int a = C12187k.m32289a(this.f24225h.f24156c).mo36073a();
        C9359j jVar = new C9359j(str4, str5, str6, d, a);
        m22572a(str, "SessionApp", (C9339a0) jVar);
        C9363l lVar = new C9363l(str4, str5, str6, d, a);
        m22573a(str, "SessionApp.json", (C9345d0) lVar);
    }

    /* renamed from: e */
    private void m22606e(String str) throws Exception {
        String str2 = str;
        Context b = this.f24219b.mo36008b();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int a = C12180h.m32236a();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b2 = C12180h.m32259b();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean l = C12180h.m32278l(b);
        int i = a;
        int i2 = availableProcessors;
        long j = b2;
        long j2 = blockCount;
        boolean z = l;
        Map e = this.f24222e.mo36087e();
        long j3 = b2;
        C9368o oVar = r0;
        int f = C12180h.m32272f(b);
        C9368o oVar2 = new C9368o(this, i, i2, j, j2, z, e, f);
        m22572a(str2, "SessionDevice", (C9339a0) oVar);
        C9369p pVar = new C9369p(this, i, i2, j3, j2, z, e, f);
        m22573a(str2, "SessionDevice.json", (C9345d0) pVar);
    }

    /* renamed from: f */
    private void m22608f(String str) throws Exception {
        boolean m = C12180h.m32279m(this.f24219b.mo36008b());
        m22572a(str, "SessionOS", (C9339a0) new C9365m(this, m));
        m22573a(str, "SessionOS.json", (C9345d0) new C9366n(this, m));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public File[] mo25151g() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, m22582a(mo25145b(), f24211t));
        Collections.addAll(linkedList, m22582a(mo25149e(), f24211t));
        Collections.addAll(linkedList, m22582a(mo25147c(), f24211t));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo25146b(C12264p pVar) {
        return ((Boolean) this.f24220c.mo25128b(new C9344d(pVar))).booleanValue();
    }

    /* renamed from: b */
    private File[] m22595b(File file) {
        return m22596b(file.listFiles());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo25150f() {
        C9403q qVar = this.f24235r;
        return qVar != null && qVar.mo25222a();
    }

    /* renamed from: b */
    private void m22588b(int i) {
        HashSet hashSet = new HashSet();
        File[] q = m22616q();
        int min = Math.min(i, q.length);
        for (int i2 = 0; i2 < min; i2++) {
            hashSet.add(m22553a(q[i2]));
        }
        this.f24227j.mo25049a((Set<String>) hashSet);
        m22579a(m22584a((FilenameFilter) new C9380z(null)), (Set<String>) hashSet);
    }

    /* renamed from: c */
    private File[] m22601c(String str) {
        return m22584a((FilenameFilter) new C9362k0(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public File mo25147c() {
        return this.f24224g.getFilesDir();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m22600c(C12266r rVar) {
        boolean z = false;
        if (rVar == null) {
            return false;
        }
        if (rVar.f31919d.f31889a && !this.f24223f.mo25115a()) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25140a(UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        mo25154j();
        this.f24235r = new C9403q(new C9376v(), new C9341b0(null), z, uncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(this.f24235r);
    }

    /* renamed from: c */
    private static void m22599c(String str, String str2) {
        C9256b bVar = (C9256b) C12154c.m32104a(C9256b.class);
        if (bVar == null) {
            C12154c.m32113f().mo35954d("CrashlyticsCore", "Answers is not available");
        } else {
            bVar.mo24959a(new C12184a(str, str2));
        }
    }

    /* renamed from: g */
    private void m22610g(String str) throws Exception {
        m22572a(str, "SessionUser", (C9339a0) new C9371q(this, m22586b(str)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public File mo25148d() {
        return new File(mo25147c(), "invalidClsFiles");
    }

    /* renamed from: d */
    private static void m22604d(String str, String str2) {
        C9256b bVar = (C9256b) C12154c.m32104a(C9256b.class);
        if (bVar == null) {
            C12154c.m32113f().mo35954d("CrashlyticsCore", "Answers is not available");
        } else {
            bVar.mo24960a(new C12185b(str, str2));
        }
    }

    /* renamed from: b */
    private void m22593b(byte[] bArr, File file) throws IOException {
        if (bArr != null && bArr.length > 0) {
            m22577a(bArr, file);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo25136a(C9405b bVar, Thread thread, Throwable th, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics is handling uncaught exception \"");
        sb.append(th);
        sb.append("\" from thread ");
        sb.append(thread.getName());
        C12154c.m32113f().mo35954d("CrashlyticsCore", sb.toString());
        this.f24230m.mo25227a();
        Date date = new Date();
        C9331j jVar = this.f24220c;
        C9377w wVar = new C9377w(date, thread, th, bVar, z);
        jVar.mo25128b(wVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public File mo25149e() {
        return new File(mo25147c(), "nonfatal-sessions");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m22592b(Date date, Thread thread, Throwable th) {
        C9315f fVar;
        String str = "CrashlyticsCore";
        String str2 = "Failed to close fatal exception file output stream.";
        String str3 = "Failed to flush to session begin file.";
        C9318g gVar = null;
        try {
            String o = m22614o();
            if (o == null) {
                C12154c.m32113f().mo35957e(str, "Tried to write a fatal exception while no session was open.", null);
                C12180h.m32255a((Flushable) null, str3);
                C12180h.m32254a((Closeable) null, str2);
                return;
            }
            m22599c(o, th.getClass().getName());
            File c = mo25147c();
            StringBuilder sb = new StringBuilder();
            sb.append(o);
            sb.append("SessionCrash");
            fVar = new C9315f(c, sb.toString());
            try {
                gVar = C9318g.m22478a((OutputStream) fVar);
                m22559a(gVar, date, thread, th, "crash", true);
            } catch (Exception e) {
                e = e;
            }
            C12180h.m32255a((Flushable) gVar, str3);
            C12180h.m32254a((Closeable) fVar, str2);
        } catch (Exception e2) {
            e = e2;
            fVar = null;
            try {
                C12154c.m32113f().mo35957e(str, "An error occurred in the fatal exception logger", e);
                C12180h.m32255a((Flushable) gVar, str3);
                C12180h.m32254a((Closeable) fVar, str2);
            } catch (Throwable th2) {
                th = th2;
                C12180h.m32255a((Flushable) gVar, str3);
                C12180h.m32254a((Closeable) fVar, str2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fVar = null;
            C12180h.m32255a((Flushable) gVar, str3);
            C12180h.m32254a((Closeable) fVar, str2);
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25133a(float f, C12266r rVar) {
        if (rVar == null) {
            C12154c.m32113f().mo35967w("CrashlyticsCore", "Could not send reports. Settings are not available.");
            return;
        }
        C12253e eVar = rVar.f31916a;
        new C9391m0(this.f24225h.f24154a, m22552a(eVar.f31874d, eVar.f31875e), this.f24228k, this.f24229l).mo25213a(f, m22600c(rVar) ? new C9351g0(this.f24219b, this.f24223f, rVar.f31918c) : new C9392a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25135a(long j, String str) {
        this.f24220c.mo25127a((Callable<T>) new C9378x<T>(j, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25141a(Thread thread, Throwable th) {
        this.f24220c.mo25126a((Runnable) new C9379y(new Date(), thread, th));
    }

    /* renamed from: b */
    private byte[] m22594b(String str, String str2) {
        File c = mo25147c();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return C9314e0.m22472d(new File(c, sb.toString()));
    }

    /* renamed from: b */
    private C9415u0 m22586b(String str) {
        if (mo25150f()) {
            return new C9415u0(this.f24219b.mo25200q(), this.f24219b.mo25201r(), this.f24219b.mo25199p());
        }
        return new C9304a0(mo25147c()).mo25065c(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25139a(String str, String str2, String str3) {
        this.f24220c.mo25127a((Callable<T>) new C9338a<T>(str, str2, str3));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25142a(Map<String, String> map) {
        this.f24220c.mo25127a((Callable<T>) new C9340b<T>(map));
    }

    /* renamed from: a */
    static String m22553a(File file) {
        return file.getName().substring(0, 35);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25137a(C12264p pVar) throws Exception {
        m22566a(pVar, false);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=int, for r5v0, types: [boolean, int] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m22566a(p389io.fabric.sdk.android.services.settings.C12264p r4, int r5) throws java.lang.Exception {
        /*
            r3 = this;
            int r0 = r5 + 8
            r3.m22588b(r0)
            java.io.File[] r0 = r3.m22616q()
            int r1 = r0.length
            java.lang.String r2 = "CrashlyticsCore"
            if (r1 > r5) goto L_0x0018
            io.fabric.sdk.android.Logger r4 = p389io.fabric.sdk.android.C12154c.m32113f()
            java.lang.String r5 = "No open sessions to be closed."
            r4.mo35954d(r2, r5)
            return
        L_0x0018:
            r1 = r0[r5]
            java.lang.String r1 = m22553a(r1)
            r3.m22610g(r1)
            if (r4 != 0) goto L_0x002d
            io.fabric.sdk.android.Logger r4 = p389io.fabric.sdk.android.C12154c.m32113f()
            java.lang.String r5 = "Unable to close session. Settings are not loaded."
            r4.mo35954d(r2, r5)
            return
        L_0x002d:
            int r4 = r4.f31907c
            r3.m22578a(r0, r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.C9337k.m22566a(io.fabric.sdk.android.services.settings.p, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public File mo25145b() {
        return new File(mo25147c(), "fatal-sessions");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m22591b(C12266r rVar) {
        if (rVar == null) {
            C12154c.m32113f().mo35967w("CrashlyticsCore", "Cannot send reports. Settings are unavailable.");
            return;
        }
        Context b = this.f24219b.mo36008b();
        C12253e eVar = rVar.f31916a;
        C9391m0 m0Var = new C9391m0(this.f24225h.f24154a, m22552a(eVar.f31874d, eVar.f31875e), this.f24228k, this.f24229l);
        for (File p0Var : mo25151g()) {
            this.f24220c.mo25126a((Runnable) new C9360j0(b, new C9402p0(p0Var, f24216y), m0Var));
        }
    }

    /* renamed from: a */
    private void m22578a(File[] fileArr, int i, int i2) {
        String str = "CrashlyticsCore";
        C12154c.m32113f().mo35954d(str, "Closing open sessions.");
        while (i < fileArr.length) {
            File file = fileArr[i];
            String a = m22553a(file);
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("Closing session: ");
            sb.append(a);
            f.mo35954d(str, sb.toString());
            m22567a(file, a, i2);
            i++;
        }
    }

    /* renamed from: a */
    private void m22556a(C9315f fVar) {
        if (fVar != null) {
            try {
                fVar.mo25078a();
            } catch (IOException e) {
                C12154c.m32113f().mo35957e("CrashlyticsCore", "Error closing session file stream in the presence of an exception", e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22576a(Set<File> set) {
        for (File c : set) {
            m22598c(c);
        }
    }

    /* renamed from: a */
    private void m22570a(String str) {
        for (File delete : m22601c(str)) {
            delete.delete();
        }
    }

    /* renamed from: a */
    private File[] m22583a(FileFilter fileFilter) {
        return m22596b(mo25147c().listFiles(fileFilter));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public File[] m22584a(FilenameFilter filenameFilter) {
        return m22582a(mo25147c(), filenameFilter);
    }

    /* renamed from: a */
    private File[] m22582a(File file, FilenameFilter filenameFilter) {
        return m22596b(file.listFiles(filenameFilter));
    }

    /* renamed from: a */
    private void m22571a(String str, int i) {
        File c = mo25147c();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("SessionEvent");
        C9419v0.m22782a(c, new C9343c0(sb.toString()), i, f24214w);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25134a(int i) {
        int a = i - C9419v0.m22781a(mo25145b(), i, f24214w);
        C9419v0.m22782a(mo25147c(), f24211t, a - C9419v0.m22781a(mo25149e(), a, f24214w), f24214w);
    }

    /* renamed from: a */
    private void m22579a(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = f24215x.matcher(name);
            String str = "CrashlyticsCore";
            if (!matcher.matches()) {
                Logger f = C12154c.m32113f();
                StringBuilder sb = new StringBuilder();
                sb.append("Deleting unknown file: ");
                sb.append(name);
                f.mo35954d(str, sb.toString());
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                Logger f2 = C12154c.m32113f();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Trimming session file: ");
                sb2.append(name);
                f2.mo35954d(str, sb2.toString());
                file.delete();
            }
        }
    }

    /* renamed from: a */
    private File[] m22585a(String str, File[] fileArr, int i) {
        if (fileArr.length <= i) {
            return fileArr;
        }
        C12154c.m32113f().mo35954d("CrashlyticsCore", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i)}));
        m22571a(str, i);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("SessionEvent");
        return m22584a((FilenameFilter) new C9343c0(sb.toString()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25132a() {
        this.f24220c.mo25126a((Runnable) new C9346e());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25143a(File[] fileArr) {
        String str;
        File[] a;
        HashSet hashSet = new HashSet();
        int length = fileArr.length;
        int i = 0;
        while (true) {
            str = "CrashlyticsCore";
            if (i >= length) {
                break;
            }
            File file = fileArr[i];
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("Found invalid session part file: ");
            sb.append(file);
            f.mo35954d(str, sb.toString());
            hashSet.add(m22553a(file));
            i++;
        }
        if (!hashSet.isEmpty()) {
            File d = mo25148d();
            if (!d.exists()) {
                d.mkdir();
            }
            for (File file2 : m22584a((FilenameFilter) new C9348f(this, hashSet))) {
                Logger f2 = C12154c.m32113f();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Moving session file: ");
                sb2.append(file2);
                f2.mo35954d(str, sb2.toString());
                if (!file2.renameTo(new File(d, file2.getName()))) {
                    Logger f3 = C12154c.m32113f();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Could not move session file. Deleting ");
                    sb3.append(file2);
                    f3.mo35954d(str, sb3.toString());
                    file2.delete();
                }
            }
            m22617r();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22555a(Context context, File file, String str) throws IOException {
        byte[] b = C9314e0.m22468b(file);
        byte[] a = C9314e0.m22465a(file);
        byte[] b2 = C9314e0.m22469b(file, context);
        String str2 = "CrashlyticsCore";
        if (b == null || b.length == 0) {
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("No minidump data found in directory ");
            sb.append(file);
            f.mo35967w(str2, sb.toString());
            return;
        }
        m22599c(str, "<native-crash: minidump>");
        byte[] b3 = m22594b(str, "BeginSession.json");
        byte[] b4 = m22594b(str, "SessionApp.json");
        byte[] b5 = m22594b(str, "SessionDevice.json");
        byte[] b6 = m22594b(str, "SessionOS.json");
        byte[] d = C9314e0.m22472d(new C9304a0(mo25147c()).mo25064b(str));
        LogFileManager logFileManager = new LogFileManager(this.f24219b.mo36008b(), this.f24226i, str);
        byte[] c = logFileManager.mo25051c();
        logFileManager.mo25045a();
        byte[] d2 = C9314e0.m22472d(new C9304a0(mo25147c()).mo25061a(str));
        File file2 = new File(this.f24224g.getFilesDir(), str);
        if (!file2.mkdir()) {
            C12154c.m32113f().mo35954d(str2, "Couldn't create native sessions directory");
            return;
        }
        m22593b(b, new File(file2, "minidump"));
        m22593b(a, new File(file2, "metadata"));
        m22593b(b2, new File(file2, "binaryImages"));
        m22593b(b3, new File(file2, "session"));
        m22593b(b4, new File(file2, "app"));
        m22593b(b5, new File(file2, "device"));
        m22593b(b6, new File(file2, "os"));
        m22593b(d, new File(file2, "user"));
        m22593b(c, new File(file2, "logs"));
        m22593b(d2, new File(file2, "keys"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo25144a(C9399o oVar) {
        if (oVar == null) {
            return true;
        }
        return ((Boolean) this.f24220c.mo25128b(new C9350g(oVar))).booleanValue();
    }

    /* renamed from: a */
    private void m22577a(byte[] bArr, File file) throws IOException {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.finish();
                C12180h.m32253a((Closeable) gZIPOutputStream2);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                C12180h.m32253a((Closeable) gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C12180h.m32253a((Closeable) gZIPOutputStream);
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22575a(Date date, Thread thread, Throwable th) {
        C9315f fVar;
        String str = "Failed to close non-fatal file output stream.";
        String str2 = "Failed to flush to non-fatal file.";
        String o = m22614o();
        C9318g gVar = null;
        String str3 = "CrashlyticsCore";
        if (o == null) {
            C12154c.m32113f().mo35957e(str3, "Tried to write a non-fatal exception while no session was open.", null);
            return;
        }
        m22604d(o, th.getClass().getName());
        try {
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("Crashlytics is logging non-fatal exception \"");
            sb.append(th);
            sb.append("\" from thread ");
            sb.append(thread.getName());
            f.mo35954d(str3, sb.toString());
            String b = C12180h.m32260b(this.f24218a.getAndIncrement());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(o);
            sb2.append("SessionEvent");
            sb2.append(b);
            fVar = new C9315f(mo25147c(), sb2.toString());
            try {
                C9318g a = C9318g.m22478a((OutputStream) fVar);
                try {
                    m22559a(a, date, thread, th, "error", false);
                    C12180h.m32255a((Flushable) a, str2);
                } catch (Exception e) {
                    e = e;
                    gVar = a;
                    try {
                        C12154c.m32113f().mo35957e(str3, "An error occurred in the non-fatal exception logger", e);
                        C12180h.m32255a((Flushable) gVar, str2);
                        C12180h.m32254a((Closeable) fVar, str);
                        m22571a(o, 64);
                    } catch (Throwable th2) {
                        th = th2;
                        C12180h.m32255a((Flushable) gVar, str2);
                        C12180h.m32254a((Closeable) fVar, str);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gVar = a;
                    C12180h.m32255a((Flushable) gVar, str2);
                    C12180h.m32254a((Closeable) fVar, str);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C12154c.m32113f().mo35957e(str3, "An error occurred in the non-fatal exception logger", e);
                C12180h.m32255a((Flushable) gVar, str2);
                C12180h.m32254a((Closeable) fVar, str);
                m22571a(o, 64);
            }
        } catch (Exception e3) {
            e = e3;
            fVar = null;
            C12154c.m32113f().mo35957e(str3, "An error occurred in the non-fatal exception logger", e);
            C12180h.m32255a((Flushable) gVar, str2);
            C12180h.m32254a((Closeable) fVar, str);
            m22571a(o, 64);
        } catch (Throwable th4) {
            th = th4;
            fVar = null;
            C12180h.m32255a((Flushable) gVar, str2);
            C12180h.m32254a((Closeable) fVar, str);
            throw th;
        }
        C12180h.m32254a((Closeable) fVar, str);
        try {
            m22571a(o, 64);
        } catch (Exception e4) {
            C12154c.m32113f().mo35957e(str3, "An error occurred when trimming non-fatal files.", e4);
        }
    }

    /* renamed from: a */
    private void m22572a(String str, String str2, C9339a0 a0Var) throws Exception {
        C9315f fVar;
        String str3 = "Failed to close session ";
        String str4 = "Failed to flush to session ";
        String str5 = " file.";
        C9318g gVar = null;
        try {
            File c = mo25147c();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            fVar = new C9315f(c, sb.toString());
            try {
                gVar = C9318g.m22478a((OutputStream) fVar);
                a0Var.mo25157a(gVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(str2);
                sb2.append(str5);
                C12180h.m32255a((Flushable) gVar, sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(str2);
                sb3.append(str5);
                C12180h.m32254a((Closeable) fVar, sb3.toString());
            } catch (Throwable th) {
                th = th;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str4);
                sb4.append(str2);
                sb4.append(str5);
                C12180h.m32255a((Flushable) gVar, sb4.toString());
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str3);
                sb5.append(str2);
                sb5.append(str5);
                C12180h.m32254a((Closeable) fVar, sb5.toString());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fVar = null;
            StringBuilder sb42 = new StringBuilder();
            sb42.append(str4);
            sb42.append(str2);
            sb42.append(str5);
            C12180h.m32255a((Flushable) gVar, sb42.toString());
            StringBuilder sb52 = new StringBuilder();
            sb52.append(str3);
            sb52.append(str2);
            sb52.append(str5);
            C12180h.m32254a((Closeable) fVar, sb52.toString());
            throw th;
        }
    }

    /* renamed from: a */
    private void m22573a(String str, String str2, C9345d0 d0Var) throws Exception {
        String str3 = " file.";
        String str4 = "Failed to close ";
        FileOutputStream fileOutputStream = null;
        try {
            File c = mo25147c();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(c, sb.toString()));
            try {
                d0Var.mo25163a(fileOutputStream2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(str2);
                sb2.append(str3);
                C12180h.m32254a((Closeable) fileOutputStream2, sb2.toString());
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str4);
                sb3.append(str2);
                sb3.append(str3);
                C12180h.m32254a((Closeable) fileOutputStream, sb3.toString());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            StringBuilder sb32 = new StringBuilder();
            sb32.append(str4);
            sb32.append(str2);
            sb32.append(str3);
            C12180h.m32254a((Closeable) fileOutputStream, sb32.toString());
            throw th;
        }
    }

    /* renamed from: a */
    private void m22574a(String str, Date date) throws Exception {
        String str2 = str;
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{this.f24219b.mo24945h()});
        long time = date.getTime() / 1000;
        C9354h hVar = new C9354h(this, str2, format, time);
        m22572a(str, "BeginSession", (C9339a0) hVar);
        C9356i iVar = new C9356i(this, str2, format, time);
        m22573a(str, "BeginSession.json", (C9345d0) iVar);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v2, types: [boolean]
      assigns: []
      uses: [boolean, ?[int, byte, short, char]]
      mth insns count: 75
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22559a(com.crashlytics.android.core.C9318g r25, java.util.Date r26, java.lang.Thread r27, java.lang.Throwable r28, java.lang.String r29, boolean r30) throws java.lang.Exception {
        /*
            r24 = this;
            r0 = r24
            com.crashlytics.android.core.s0 r5 = new com.crashlytics.android.core.s0
            com.crashlytics.android.core.r0 r1 = r0.f24231n
            r2 = r28
            r5.<init>(r2, r1)
            com.crashlytics.android.core.l r1 = r0.f24219b
            android.content.Context r1 = r1.mo36008b()
            long r2 = r26.getTime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r6
            java.lang.Float r16 = p389io.fabric.sdk.android.services.common.C12180h.m32271e(r1)
            com.crashlytics.android.core.v r4 = r0.f24230m
            boolean r4 = r4.mo25229c()
            int r17 = p389io.fabric.sdk.android.services.common.C12180h.m32238a(r1, r4)
            boolean r18 = p389io.fabric.sdk.android.services.common.C12180h.m32273g(r1)
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r13 = r4.orientation
            long r6 = p389io.fabric.sdk.android.services.common.C12180h.m32259b()
            long r8 = p389io.fabric.sdk.android.services.common.C12180h.m32239a(r1)
            long r19 = r6 - r8
            java.io.File r4 = android.os.Environment.getDataDirectory()
            java.lang.String r4 = r4.getPath()
            long r21 = p389io.fabric.sdk.android.services.common.C12180h.m32240a(r4)
            java.lang.String r4 = r1.getPackageName()
            android.app.ActivityManager$RunningAppProcessInfo r12 = p389io.fabric.sdk.android.services.common.C12180h.m32242a(r4, r1)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.lang.StackTraceElement[] r7 = r5.f24371c
            com.crashlytics.android.core.a r4 = r0.f24225h
            java.lang.String r15 = r4.f24155b
            io.fabric.sdk.android.services.common.p r4 = r0.f24222e
            java.lang.String r14 = r4.mo36085c()
            r4 = 0
            if (r30 == 0) goto L_0x00a1
            java.util.Map r8 = java.lang.Thread.getAllStackTraces()
            int r10 = r8.size()
            java.lang.Thread[] r10 = new java.lang.Thread[r10]
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0078:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x009e
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r23 = r11.getKey()
            java.lang.Thread r23 = (java.lang.Thread) r23
            r10[r4] = r23
            com.crashlytics.android.core.r0 r6 = r0.f24231n
            java.lang.Object r11 = r11.getValue()
            java.lang.StackTraceElement[] r11 = (java.lang.StackTraceElement[]) r11
            java.lang.StackTraceElement[] r6 = r6.mo25067a(r11)
            r9.add(r6)
            r6 = 1
            int r4 = r4 + r6
            goto L_0x0078
        L_0x009e:
            r6 = 1
            r8 = r10
            goto L_0x00a5
        L_0x00a1:
            r6 = 1
            java.lang.Thread[] r4 = new java.lang.Thread[r4]
            r8 = r4
        L_0x00a5:
            java.lang.String r4 = "com.crashlytics.CollectCustomKeys"
            boolean r1 = p389io.fabric.sdk.android.services.common.C12180h.m32258a(r1, r4, r6)
            if (r1 != 0) goto L_0x00b3
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            goto L_0x00c8
        L_0x00b3:
            com.crashlytics.android.core.l r1 = r0.f24219b
            java.util.Map r1 = r1.mo25197n()
            if (r1 == 0) goto L_0x00c8
            int r4 = r1.size()
            if (r4 <= r6) goto L_0x00c8
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>(r1)
            r10 = r4
            goto L_0x00c9
        L_0x00c8:
            r10 = r1
        L_0x00c9:
            com.crashlytics.android.core.LogFileManager r11 = r0.f24227j
            r1 = r25
            r4 = r29
            r6 = r27
            com.crashlytics.android.core.C9400o0.m22740a(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.C9337k.m22559a(com.crashlytics.android.core.g, java.util.Date, java.lang.Thread, java.lang.Throwable, java.lang.String, boolean):void");
    }

    /* renamed from: a */
    private void m22567a(File file, String str, int i) {
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append("Collecting session parts for ID ");
        sb.append(str);
        String str2 = "CrashlyticsCore";
        f.mo35954d(str2, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("SessionCrash");
        File[] a = m22584a((FilenameFilter) new C9343c0(sb2.toString()));
        boolean z = a != null && a.length > 0;
        C12154c.m32113f().mo35954d(str2, String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z)}));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("SessionEvent");
        File[] a2 = m22584a((FilenameFilter) new C9343c0(sb3.toString()));
        boolean z2 = a2 != null && a2.length > 0;
        C12154c.m32113f().mo35954d(str2, String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z2)}));
        if (z || z2) {
            m22568a(file, str, m22585a(str, a2, i), z ? a[0] : null);
        } else {
            Logger f2 = C12154c.m32113f();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("No events present for session ID ");
            sb4.append(str);
            f2.mo35954d(str2, sb4.toString());
        }
        Logger f3 = C12154c.m32113f();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Removing session part files for ID ");
        sb5.append(str);
        f3.mo35954d(str2, sb5.toString());
        m22570a(str);
    }

    /* renamed from: a */
    private void m22568a(File file, String str, File[] fileArr, File file2) {
        C9315f fVar;
        String str2 = str;
        File file3 = file2;
        String str3 = "Failed to close CLS file";
        String str4 = "CrashlyticsCore";
        String str5 = "Error flushing session file stream";
        boolean z = file3 != null;
        File b = z ? mo25145b() : mo25149e();
        if (!b.exists()) {
            b.mkdirs();
        }
        try {
            fVar = new C9315f(b, str2);
            try {
                C9318g a = C9318g.m22478a((OutputStream) fVar);
                Logger f = C12154c.m32113f();
                StringBuilder sb = new StringBuilder();
                sb.append("Collecting SessionStart data for session ID ");
                sb.append(str2);
                f.mo35954d(str4, sb.toString());
                m22557a(a, file);
                a.mo25093a(4, new Date().getTime() / 1000);
                a.mo25095a(5, z);
                a.mo25109d(11, 1);
                a.mo25092a(12, 3);
                m22558a(a, str2);
                m22560a(a, fileArr, str2);
                if (z) {
                    m22557a(a, file3);
                }
                C12180h.m32255a((Flushable) a, str5);
                C12180h.m32254a((Closeable) fVar, str3);
            } catch (Exception e) {
                e = e;
                try {
                    Logger f2 = C12154c.m32113f();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to write session file for session ID: ");
                    sb2.append(str2);
                    f2.mo35957e(str4, sb2.toString(), e);
                    C12180h.m32255a((Flushable) null, str5);
                    m22556a(fVar);
                } catch (Throwable th) {
                    th = th;
                    C12180h.m32255a((Flushable) null, str5);
                    C12180h.m32254a((Closeable) fVar, str3);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            fVar = null;
            Logger f22 = C12154c.m32113f();
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Failed to write session file for session ID: ");
            sb22.append(str2);
            f22.mo35957e(str4, sb22.toString(), e);
            C12180h.m32255a((Flushable) null, str5);
            m22556a(fVar);
        } catch (Throwable th2) {
            th = th2;
            fVar = null;
            C12180h.m32255a((Flushable) null, str5);
            C12180h.m32254a((Closeable) fVar, str3);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m22560a(C9318g gVar, File[] fileArr, String str) {
        String str2 = "CrashlyticsCore";
        Arrays.sort(fileArr, C12180h.f31663d);
        for (File file : fileArr) {
            try {
                C12154c.m32113f().mo35954d(str2, String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, file.getName()}));
                m22557a(gVar, file);
            } catch (Exception e) {
                C12154c.m32113f().mo35957e(str2, "Error writting non-fatal to session.", e);
            }
        }
    }

    /* renamed from: a */
    private void m22558a(C9318g gVar, String str) throws IOException {
        String[] strArr;
        for (String str2 : f24217z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(".cls");
            File[] a = m22584a((FilenameFilter) new C9343c0(sb.toString()));
            String str3 = " data for session ID ";
            String str4 = "CrashlyticsCore";
            if (a.length == 0) {
                Logger f = C12154c.m32113f();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't find ");
                sb2.append(str2);
                sb2.append(str3);
                sb2.append(str);
                f.mo35957e(str4, sb2.toString(), null);
            } else {
                Logger f2 = C12154c.m32113f();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Collecting ");
                sb3.append(str2);
                sb3.append(str3);
                sb3.append(str);
                f2.mo35954d(str4, sb3.toString());
                m22557a(gVar, a[0]);
            }
        }
    }

    /* renamed from: a */
    private static void m22557a(C9318g gVar, File file) throws IOException {
        FileInputStream fileInputStream;
        String str = "Failed to close file input stream.";
        if (!file.exists()) {
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to include a file that doesn't exist: ");
            sb.append(file.getName());
            f.mo35957e("CrashlyticsCore", sb.toString(), null);
            return;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                m22569a((InputStream) fileInputStream, gVar, (int) file.length());
                C12180h.m32254a((Closeable) fileInputStream, str);
            } catch (Throwable th) {
                th = th;
                C12180h.m32254a((Closeable) fileInputStream, str);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            C12180h.m32254a((Closeable) fileInputStream, str);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m22569a(InputStream inputStream, C9318g gVar, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = inputStream.read(bArr, i2, bArr.length - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        gVar.mo25100a(bArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25138a(C12266r rVar) {
        if (rVar.f31919d.f31893e) {
            boolean register = this.f24233p.register();
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("Registered Firebase Analytics event listener for breadcrumbs: ");
            sb.append(register);
            f.mo35954d("CrashlyticsCore", sb.toString());
        }
    }

    /* renamed from: a */
    private C9409s m22552a(String str, String str2) {
        String b = C12180h.m32261b(this.f24219b.mo36008b(), "com.crashlytics.ApiEndpoint");
        return new C9321h(new C9414u(this.f24219b, b, str, this.f24221d), new C9312d0(this.f24219b, b, str2, this.f24221d));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22554a(long j) {
        String str = "CrashlyticsCore";
        if (m22613n()) {
            C12154c.m32113f().mo35954d(str, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return;
        }
        if (this.f24234q != null) {
            C12154c.m32113f().mo35954d(str, "Logging Crashlytics event to Firebase");
            Bundle bundle = new Bundle();
            bundle.putInt("_r", 1);
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", j);
            this.f24234q.logEvent("clx", "_ae", bundle);
        } else {
            C12154c.m32113f().mo35954d(str, "Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
        }
    }
}
