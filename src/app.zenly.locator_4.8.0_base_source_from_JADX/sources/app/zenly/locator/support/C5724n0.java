package app.zenly.locator.support;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.p004os.C0564b;
import app.zenly.locator.R;
import app.zenly.locator.core.models.C2877d;
import app.zenly.locator.core.util.C3221j;
import app.zenly.locator.core.util.C3224l;
import app.zenly.locator.p143s.p147k.C5441d;
import app.zenly.locator.p143s.p148l.C5448c;
import com.appsflyer.share.Constants;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C12956q;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.ranges.C12963e;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7082d3;
import p213co.znly.models.services.C7973a0;
import p213co.znly.models.services.C7991b0;
import p213co.znly.models.services.C7991b0.C7992a;
import p213co.znly.models.services.C8040e0;
import p213co.znly.models.services.C8088h0;
import p213co.znly.models.services.C8088h0.C8089a;
import p213co.znly.models.services.C8363x;
import p213co.znly.models.services.C8393z;
import p213co.znly.models.services.C8393z.C8394a;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p387h.p388a.C12143a;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12291g;
import p389io.reactivex.CompletableEmitter;
import p389io.reactivex.CompletableOnSubscribe;
import p389io.reactivex.CompletableSource;
import p389io.reactivex.ObservableEmitter;
import p389io.reactivex.ObservableOnSubscribe;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.SingleEmitter;
import p389io.reactivex.SingleOnSubscribe;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p406n.C12787b;
import p389io.reactivex.p406n.C12789c;
import p389io.reactivex.p406n.C12791d;
import p389io.reactivex.schedulers.C12802a;
import zendesk.core.JwtIdentity;
import zendesk.core.Zendesk;
import zendesk.support.Article;
import zendesk.support.ArticleVote;
import zendesk.support.Category;
import zendesk.support.HelpCenterProvider;
import zendesk.support.ProviderStore;
import zendesk.support.Request;
import zendesk.support.RequestStatus;
import zendesk.support.Section;
import zendesk.support.Support;

/* renamed from: app.zenly.locator.support.n0 */
public final class C5724n0 {

    /* renamed from: l */
    static final /* synthetic */ KProperty[] f14526l;

    /* renamed from: m */
    public static final C5728b f14527m = new C5728b(null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f14528a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12787b f14529b;

    /* renamed from: c */
    private final C12275b f14530c = new C12275b();

    /* renamed from: d */
    private final C12789c<Request> f14531d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<? extends Request> f14532e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<C8363x> f14533f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Map<C5730c, List<Section>> f14534g;

    /* renamed from: h */
    private final Lazy f14535h;

    /* renamed from: i */
    private final Lazy f14536i;

    /* renamed from: j */
    private final C12791d<Map<String, C2877d>> f14537j;

    /* renamed from: k */
    private final C12279e<List<Request>> f14538k;

    /* renamed from: app.zenly.locator.support.n0$a */
    public enum C5725a {
        UNKNOWN(new C12963e(Integer.MIN_VALUE, 12), "userage_unknown");
        

        /* renamed from: i */
        public static final C5726a f14541i = null;

        /* renamed from: e */
        private final C12963e f14542e;

        /* renamed from: f */
        private final String f14543f;

        /* renamed from: app.zenly.locator.support.n0$a$a */
        public static final class C5726a {
            private C5726a() {
            }

            /* renamed from: a */
            public final C5725a mo13411a(int i) {
                C5725a aVar;
                C5725a[] values = C5725a.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i2];
                    if (aVar.mo13409a().mo37346a(i)) {
                        break;
                    }
                    i2++;
                }
                return aVar != null ? aVar : C5725a.UNKNOWN;
            }

            public /* synthetic */ C5726a(C12928f fVar) {
                this();
            }
        }

        static {
            f14541i = new C5726a(null);
        }

        private C5725a(C12963e eVar, String str) {
            this.f14542e = eVar;
            this.f14543f = str;
        }

        /* renamed from: a */
        public final C12963e mo13409a() {
            return this.f14542e;
        }

        /* renamed from: b */
        public final String mo13410b() {
            return this.f14543f;
        }
    }

    /* renamed from: app.zenly.locator.support.n0$a0 */
    static final class C5727a0<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C5727a0 f14544e = new C5727a0();

        C5727a0() {
        }

        /* renamed from: a */
        public final Map<String, C2877d> apply(List<C2877d> list) {
            C12932j.m33818b(list, "list");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : list) {
                C2877d dVar = (C2877d) next;
                C12932j.m33815a((Object) dVar, "viewed");
                linkedHashMap.put(dVar.getId(), next);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: app.zenly.locator.support.n0$b */
    public static final class C5728b {
        private C5728b() {
        }

        /* renamed from: a */
        public final int mo13413a(RequestStatus requestStatus) {
            C12932j.m33818b(requestStatus, "status");
            switch (C5784o0.f14655a[requestStatus.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return R.string.support_main_status_opened;
                case 5:
                    return R.string.support_main_status_solved;
                case 6:
                    return R.string.support_main_status_closed;
                default:
                    return C7674a.f19294a;
            }
        }

        public /* synthetic */ C5728b(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.support.n0$b0 */
    static final /* synthetic */ class C5729b0 extends C12931i implements Function1<Map<String, C2877d>, C12956q> {
        C5729b0(C12791d dVar) {
            super(1, dVar);
        }

        /* renamed from: a */
        public final void mo13414a(Map<String, C2877d> map) {
            C12932j.m33818b(map, "p1");
            ((C12791d) this.f33505f).onNext(map);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C12791d.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final String getName() {
            return "onNext";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo13414a((Map) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.support.n0$c */
    public enum C5730c {
        TROUBLESHOOTING(360000034387L, "troubleshooting"),
        DISCOVER(360000035628L, "about_zenly");
        
        /* access modifiers changed from: private */

        /* renamed from: l */
        public static boolean f14548l;

        /* renamed from: m */
        public static final C5731a f14549m = null;

        /* renamed from: e */
        private String f14550e;

        /* renamed from: f */
        private String f14551f;

        /* renamed from: g */
        private final long f14552g;

        /* renamed from: h */
        private final String f14553h;

        /* renamed from: app.zenly.locator.support.n0$c$a */
        public static final class C5731a {
            private C5731a() {
            }

            /* renamed from: a */
            public final boolean mo13423a() {
                return C5730c.f14548l;
            }

            public /* synthetic */ C5731a(C12928f fVar) {
                this();
            }

            /* renamed from: a */
            public final void mo13422a(boolean z) {
                C5730c.f14548l = z;
            }

            /* renamed from: a */
            public final C5730c mo13421a(long j) {
                C5730c cVar;
                C5730c[] values = C5730c.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        cVar = null;
                        break;
                    }
                    cVar = values[i];
                    if (cVar.mo13415a() == j) {
                        break;
                    }
                    i++;
                }
                if (cVar != null) {
                    return cVar;
                }
                throw new IllegalArgumentException();
            }
        }

        static {
            f14549m = new C5731a(null);
        }

        private C5730c(long j, String str) {
            this.f14552g = j;
            this.f14553h = str;
        }

        /* renamed from: b */
        public final String mo13417b() {
            return this.f14553h;
        }

        /* renamed from: c */
        public final String mo13419c() {
            return this.f14551f;
        }

        /* renamed from: d */
        public final String mo13420d() {
            return this.f14550e;
        }

        /* renamed from: a */
        public final long mo13415a() {
            return this.f14552g;
        }

        /* renamed from: b */
        public final void mo13418b(String str) {
            this.f14550e = str;
        }

        /* renamed from: a */
        public final void mo13416a(String str) {
            this.f14551f = str;
        }
    }

    /* renamed from: app.zenly.locator.support.n0$c0 */
    static final class C5732c0<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5732c0 f14554e = new C5732c0();

        C5732c0() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Failed loading cache from disk", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.support.n0$d */
    public enum C5733d {
        REPORT_A_PROBLEM(360000024428L, R.string.support_main_subject_problem_report, R.string.support_create_button_report, "support_main_subject_problem_report"),
        SEND_FEEDBACK(360000025767L, R.string.support_main_subject_feedback, R.string.support_create_button_feedback, "support_main_subject_feedback"),
        ASK_A_QUESTION(360000036188L, R.string.support_main_subject_question, R.string.support_create_button_question, "support_main_subject_question"),
        REPORT_USER(896707, R.string.support_main_subject_user_report, C7674a.f19294a, "support_main_subject_user_report"),
        REPORT_MESSAGE(896707, R.string.support_main_subject_message_report, C7674a.f19294a, "support_main_subject_message_report"),
        CHANGE_PHONE_NUMBER(360001652154L, R.string.support_create_button_phonenumber, R.string.support_create_button_phonenumber, "support_main_subject_change_number"),
        DELETE_ACCOUNT(0, C7674a.f19294a, R.string.support_create_button_delete, ""),
        PLACES(360000114528L, R.string.support_main_subject_places, C7674a.f19294a, "support_main_subject_places");
        

        /* renamed from: r */
        public static final C5734a f14564r = null;

        /* renamed from: e */
        private final long f14565e;

        /* renamed from: f */
        private final int f14566f;

        /* renamed from: g */
        private final int f14567g;

        /* renamed from: h */
        private final String f14568h;

        /* renamed from: app.zenly.locator.support.n0$d$a */
        public static final class C5734a {
            private C5734a() {
            }

            /* renamed from: a */
            public final C5733d mo13429a(String str) {
                C5733d[] values;
                for (C5733d dVar : C5733d.values()) {
                    if (C12932j.m33817a((Object) dVar.mo13428d(), (Object) str)) {
                        return dVar;
                    }
                }
                return null;
            }

            public /* synthetic */ C5734a(C12928f fVar) {
                this();
            }
        }

        static {
            f14564r = new C5734a(null);
        }

        private C5733d(long j, int i, int i2, String str) {
            this.f14565e = j;
            this.f14566f = i;
            this.f14567g = i2;
            this.f14568h = str;
        }

        /* renamed from: a */
        public static final C5733d m16152a(String str) {
            return f14564r.mo13429a(str);
        }

        /* renamed from: a */
        public final int mo13425a() {
            return this.f14567g;
        }

        /* renamed from: b */
        public final long mo13426b() {
            return this.f14565e;
        }

        /* renamed from: c */
        public final int mo13427c() {
            return this.f14566f;
        }

        /* renamed from: d */
        public final String mo13428d() {
            return this.f14568h;
        }
    }

    /* renamed from: app.zenly.locator.support.n0$d0 */
    static final /* synthetic */ class C5735d0 extends C12931i implements Function1<Map<String, C2877d>, C12956q> {
        C5735d0(C12791d dVar) {
            super(1, dVar);
        }

        /* renamed from: a */
        public final void mo13430a(Map<String, C2877d> map) {
            C12932j.m33818b(map, "p1");
            ((C12791d) this.f33505f).onNext(map);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C12791d.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final String getName() {
            return "onNext";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo13430a((Map) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.support.n0$e */
    public static final class C5736e {

        /* renamed from: a */
        private final C5738f f14569a;

        /* renamed from: b */
        private final String f14570b;

        /* renamed from: c */
        private final Long f14571c;

        /* renamed from: d */
        private final String f14572d;

        public C5736e(C5738f fVar, String str, Long l, String str2) {
            C12932j.m33818b(fVar, "reason");
            this.f14569a = fVar;
            this.f14570b = str;
            this.f14571c = l;
            this.f14572d = str2;
        }

        /* renamed from: a */
        public final String mo13431a() {
            return this.f14570b;
        }

        /* renamed from: b */
        public final String mo13432b() {
            return this.f14572d;
        }

        /* renamed from: c */
        public final Long mo13433c() {
            return this.f14571c;
        }

        /* renamed from: d */
        public final C5738f mo13434d() {
            return this.f14569a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f14572d, (java.lang.Object) r3.f14572d) != false) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0033
                boolean r0 = r3 instanceof app.zenly.locator.support.C5724n0.C5736e
                if (r0 == 0) goto L_0x0031
                app.zenly.locator.support.n0$e r3 = (app.zenly.locator.support.C5724n0.C5736e) r3
                app.zenly.locator.support.n0$f r0 = r2.f14569a
                app.zenly.locator.support.n0$f r1 = r3.f14569a
                boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.lang.String r0 = r2.f14570b
                java.lang.String r1 = r3.f14570b
                boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.lang.Long r0 = r2.f14571c
                java.lang.Long r1 = r3.f14571c
                boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.lang.String r0 = r2.f14572d
                java.lang.String r3 = r3.f14572d
                boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
                if (r3 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r3 = 0
                return r3
            L_0x0033:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.support.C5724n0.C5736e.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C5738f fVar = this.f14569a;
            int i = 0;
            int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
            String str = this.f14570b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            Long l = this.f14571c;
            int hashCode3 = (hashCode2 + (l != null ? l.hashCode() : 0)) * 31;
            String str2 = this.f14572d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("WrongPlaceDetails(reason=");
            sb.append(this.f14569a);
            sb.append(", message=");
            sb.append(this.f14570b);
            sb.append(", placeId=");
            sb.append(this.f14571c);
            sb.append(", placeAddress=");
            sb.append(this.f14572d);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C5736e(C5738f fVar, String str, Long l, String str2, int i, C12928f fVar2) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                l = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            this(fVar, str, l, str2);
        }
    }

    /* renamed from: app.zenly.locator.support.n0$e0 */
    static final class C5737e0<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C5724n0 f14573e;

        C5737e0(C5724n0 n0Var) {
            this.f14573e = n0Var;
        }

        /* renamed from: a */
        public final C12279e<Boolean> apply(Map<String, C2877d> map) {
            C12932j.m33818b(map, "map");
            return this.f14573e.m16111j().mo13016b(map.values());
        }
    }

    /* renamed from: app.zenly.locator.support.n0$f */
    public enum C5738f {
        MISSING_PLACE_HOME("support_places_toolong_home", R.string.support_places_missing),
        MISSING_PLACE_SCHOOL("support_places_toolong_school", R.string.support_places_missing),
        MISSING_PLACE_WORK("support_places_toolong_work", R.string.support_places_missing),
        HOME_REMOVE("support_places_remove_home", R.string.support_places_wrong_home),
        HOME_SWAP1("support_places_swap1_home", R.string.support_places_actual_work),
        HOME_SWAP2("support_places_swap2_home", R.string.support_places_actual_school),
        HOME_HIDE("support_places_hide_home", R.string.support_places_hide_place),
        HOME_OTHER("support_places_other_home", R.string.support_places_other_home),
        SCHOOL_REMOVE("support_places_remove_school", R.string.support_places_wrong_school),
        SCHOOL_SWAP1("support_places_swap1_school", R.string.support_places_actual_home),
        SCHOOL_SWAP2("support_places_swap2_school", R.string.support_places_actual_work),
        SCHOOL_HIDE("support_places_hide_school", R.string.support_places_hide_place),
        SCHOOL_OTHER("support_places_other_school", R.string.support_places_other_school),
        WORK_REMOVE("support_places_remove_work", R.string.support_places_wrong_work),
        WORK_SWAP1("support_places_swap1_work", R.string.support_places_actual_home),
        WORK_SWAP2("support_places_swap2_work", R.string.support_places_actual_school),
        WORK_HIDE("support_places_hide_work", R.string.support_places_hide_place),
        WORK_OTHER("support_places_other_work", R.string.support_places_other_work);
        

        /* renamed from: e */
        private final String f14593e;

        /* renamed from: f */
        private final int f14594f;

        private C5738f(String str, int i) {
            this.f14593e = str;
            this.f14594f = i;
        }

        /* renamed from: a */
        public final String mo13439a() {
            return this.f14593e;
        }

        /* renamed from: b */
        public final int mo13440b() {
            return this.f14594f;
        }
    }

    /* renamed from: app.zenly.locator.support.n0$f0 */
    static final class C5739f0<T> implements Consumer<Boolean> {

        /* renamed from: e */
        public static final C5739f0 f14595e = new C5739f0();

        C5739f0() {
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C12143a.m32027a("Cache saved: %b", bool);
        }
    }

    /* renamed from: app.zenly.locator.support.n0$g */
    static final class C5740g extends C12933k implements Function1<List<C7991b0>, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5724n0 f14596f;

        /* renamed from: g */
        final /* synthetic */ C8363x f14597g;

        /* renamed from: h */
        final /* synthetic */ C8363x f14598h;

        /* renamed from: i */
        final /* synthetic */ C5733d f14599i;

        C5740g(C5724n0 n0Var, C8363x xVar, C8363x xVar2, C5733d dVar) {
            this.f14596f = n0Var;
            this.f14597g = xVar;
            this.f14598h = xVar2;
            this.f14599i = dVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo13442a(List<C7991b0> list) {
            C12932j.m33818b(list, "fields");
            C8363x xVar = this.f14597g;
            if (xVar != null) {
                C5724n0 n0Var = this.f14596f;
                String id = xVar.getId();
                C12932j.m33815a((Object) id, "subCategory.id");
                C7991b0 a = n0Var.m16094a(360000049907L, id);
                C12932j.m33815a((Object) a, "createCustomField(CATEGO…FIELD_ID, subCategory.id)");
                list.add(a);
                return;
            }
            C8363x xVar2 = this.f14598h;
            if (xVar2 != null) {
                C5724n0 n0Var2 = this.f14596f;
                String id2 = xVar2.getId();
                C12932j.m33815a((Object) id2, "category.id");
                C7991b0 a2 = n0Var2.m16094a(360000049907L, id2);
                C12932j.m33815a((Object) a2, "createCustomField(CATEGORY_FIELD_ID, category.id)");
                list.add(a2);
            } else if (this.f14599i == C5733d.ASK_A_QUESTION) {
                C7991b0 a3 = this.f14596f.m16094a(360000049907L, "subcategory_ask_a_qestion");
                C12932j.m33815a((Object) a3, "createCustomField(CATEGO…ION_CATEGORY_FIELD_VALUE)");
                list.add(a3);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo13442a((List) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.support.n0$g0 */
    static final class C5741g0<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5741g0 f14600e = new C5741g0();

        C5741g0() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Failed saving proto cache", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.support.n0$h */
    static final class C5742h extends C12933k implements Function1<List<C7991b0>, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5724n0 f14601f;

        /* renamed from: g */
        final /* synthetic */ Map f14602g;

        C5742h(C5724n0 n0Var, Map map) {
            this.f14601f = n0Var;
            this.f14602g = map;
            super(1);
        }

        /* renamed from: a */
        public final void mo13444a(List<C7991b0> list) {
            C12932j.m33818b(list, "fields");
            C5736e eVar = (C5736e) this.f14602g.get(Integer.valueOf(1));
            String str = "createCustomField(PROBLE…_FIELD_ID, it.reason.key)";
            if (eVar != null) {
                C7991b0 a = this.f14601f.m16094a(360000360367L, eVar.mo13434d().mo13439a());
                C12932j.m33815a((Object) a, str);
                list.add(a);
                this.f14601f.m16104a(list, eVar);
            }
            C5736e eVar2 = (C5736e) this.f14602g.get(Integer.valueOf(3));
            if (eVar2 != null) {
                C7991b0 a2 = this.f14601f.m16094a(360000360587L, eVar2.mo13434d().mo13439a());
                C12932j.m33815a((Object) a2, str);
                list.add(a2);
                this.f14601f.m16104a(list, eVar2);
            }
            C5736e eVar3 = (C5736e) this.f14602g.get(Integer.valueOf(2));
            if (eVar3 != null) {
                C7991b0 a3 = this.f14601f.m16094a(360000360567L, eVar3.mo13434d().mo13439a());
                C12932j.m33815a((Object) a3, str);
                list.add(a3);
                this.f14601f.m16104a(list, eVar3);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo13444a((List) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.support.n0$h0 */
    static final class C5743h0<T> implements Consumer<List<? extends C8363x>> {

        /* renamed from: e */
        public static final C5743h0 f14603e = new C5743h0();

        C5743h0() {
        }

        /* renamed from: a */
        public final void accept(List<C8363x> list) {
        }
    }

    /* renamed from: app.zenly.locator.support.n0$i */
    static final class C5744i extends C12933k implements Function1<List<C7991b0>, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5724n0 f14604f;

        /* renamed from: g */
        final /* synthetic */ List f14605g;

        /* renamed from: h */
        final /* synthetic */ List f14606h;

        C5744i(C5724n0 n0Var, List list, List list2) {
            this.f14604f = n0Var;
            this.f14605g = list;
            this.f14606h = list2;
            super(1);
        }

        /* renamed from: a */
        public final void mo13446a(List<C7991b0> list) {
            C12932j.m33818b(list, "fields");
            C7991b0 a = this.f14604f.m16095a(360000413148L, this.f14605g);
            C12932j.m33815a((Object) a, "createCustomField(HELPCE…helpCenterEntryPointPath)");
            list.add(a);
            C7991b0 a2 = this.f14604f.m16095a(360000413168L, this.f14606h);
            C12932j.m33815a((Object) a2, "createCustomField(HELPCE… helpCenterExitPointPath)");
            list.add(a2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo13446a((List) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.support.n0$i0 */
    static final class C5745i0 extends C12933k implements Function0<C12291g<Support>> {

        /* renamed from: f */
        final /* synthetic */ C5724n0 f14607f;

        /* renamed from: app.zenly.locator.support.n0$i0$a */
        static final class C5746a<V> implements Callable<T> {

            /* renamed from: e */
            public static final C5746a f14608e = new C5746a();

            C5746a() {
            }

            public final Support call() {
                return Support.INSTANCE;
            }
        }

        C5745i0(C5724n0 n0Var) {
            this.f14607f = n0Var;
            super(0);
        }

        public final C12291g<Support> invoke() {
            return this.f14607f.f14529b.mo36347a((SingleSource<T>) C12291g.m32769c((Callable<? extends T>) C5746a.f14608e));
        }
    }

    /* renamed from: app.zenly.locator.support.n0$j */
    static final class C5747j<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C5747j f14609e = new C5747j();

        C5747j() {
        }

        /* renamed from: a */
        public final List<C8363x> apply(C8040e0 e0Var) {
            C12932j.m33818b(e0Var, "response");
            return e0Var.getCategoriesList();
        }
    }

    /* renamed from: app.zenly.locator.support.n0$j0 */
    static final class C5748j0<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C5724n0 f14610e;

        /* renamed from: app.zenly.locator.support.n0$j0$a */
        static final class C5749a<T> implements ObservableOnSubscribe<T> {

            /* renamed from: a */
            final /* synthetic */ C5748j0 f14611a;

            /* renamed from: b */
            final /* synthetic */ Support f14612b;

            /* renamed from: app.zenly.locator.support.n0$j0$a$a */
            public static final class C5750a extends C12008e<List<? extends Request>> {

                /* renamed from: a */
                final /* synthetic */ C5749a f14613a;

                /* renamed from: b */
                final /* synthetic */ ObservableEmitter f14614b;

                C5750a(C5749a aVar, ObservableEmitter observableEmitter) {
                    this.f14613a = aVar;
                    this.f14614b = observableEmitter;
                }

                public void onError(ErrorResponse errorResponse) {
                    ObservableEmitter observableEmitter = this.f14614b;
                    if (errorResponse != null) {
                        observableEmitter.tryOnError(new Exception(errorResponse.getReason()));
                    } else {
                        C12932j.m33814a();
                        throw null;
                    }
                }

                /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
                    if (kotlin.jvm.internal.C12932j.m33811a(r2.intValue(), 0) > 0) goto L_0x004a;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
                /* JADX WARNING: Removed duplicated region for block: B:23:0x000e A[SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onSuccess(java.util.List<? extends zendesk.support.Request> r9) {
                    /*
                        r8 = this;
                        java.lang.String r0 = "requests"
                        kotlin.jvm.internal.C12932j.m33818b(r9, r0)
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        java.util.Iterator r9 = r9.iterator()
                    L_0x000e:
                        boolean r1 = r9.hasNext()
                        if (r1 == 0) goto L_0x0055
                        java.lang.Object r1 = r9.next()
                        r2 = r1
                        zendesk.support.Request r2 = (zendesk.support.Request) r2
                        app.zenly.locator.support.n0$d$a r3 = app.zenly.locator.support.C5724n0.C5733d.f14564r
                        java.lang.String r4 = r2.getSubject()
                        app.zenly.locator.support.n0$d r3 = r3.mo13429a(r4)
                        zendesk.support.RequestStatus r4 = r2.getStatus()
                        zendesk.support.RequestStatus r5 = zendesk.support.RequestStatus.Closed
                        r6 = 1
                        r7 = 0
                        if (r4 != r5) goto L_0x0031
                    L_0x002f:
                        r6 = 0
                        goto L_0x004a
                    L_0x0031:
                        app.zenly.locator.support.n0$d r4 = app.zenly.locator.support.C5724n0.C5733d.REPORT_USER
                        if (r3 == r4) goto L_0x003a
                        app.zenly.locator.support.n0$d r4 = app.zenly.locator.support.C5724n0.C5733d.REPORT_MESSAGE
                        if (r3 == r4) goto L_0x003a
                        goto L_0x004a
                    L_0x003a:
                        java.lang.Integer r2 = r2.getCommentCount()
                        if (r2 == 0) goto L_0x0050
                        int r2 = r2.intValue()
                        int r2 = kotlin.jvm.internal.C12932j.m33811a(r2, r7)
                        if (r2 <= 0) goto L_0x002f
                    L_0x004a:
                        if (r6 == 0) goto L_0x000e
                        r0.add(r1)
                        goto L_0x000e
                    L_0x0050:
                        kotlin.jvm.internal.C12932j.m33814a()
                        r9 = 0
                        throw r9
                    L_0x0055:
                        app.zenly.locator.support.n0$j0$a r9 = r8.f14613a
                        app.zenly.locator.support.n0$j0 r9 = r9.f14611a
                        app.zenly.locator.support.n0 r9 = r9.f14610e
                        r9.f14532e = r0
                        io.reactivex.ObservableEmitter r9 = r8.f14614b
                        r9.onNext(r0)
                        io.reactivex.ObservableEmitter r9 = r8.f14614b
                        r9.onComplete()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.support.C5724n0.C5748j0.C5749a.C5750a.onSuccess(java.util.List):void");
                }
            }

            C5749a(C5748j0 j0Var, Support support) {
                this.f14611a = j0Var;
                this.f14612b = support;
            }

            public final void subscribe(ObservableEmitter<List<Request>> observableEmitter) {
                C12932j.m33818b(observableEmitter, "emitter");
                List d = this.f14611a.f14610e.f14532e;
                if (d != null) {
                    observableEmitter.onNext(d);
                }
                ProviderStore provider = this.f14612b.provider();
                if (provider != null) {
                    provider.requestProvider().getAllRequests(new C5750a(this, observableEmitter));
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            }
        }

        C5748j0(C5724n0 n0Var) {
            this.f14610e = n0Var;
        }

        /* renamed from: a */
        public final C12279e<List<Request>> apply(Support support) {
            C12932j.m33818b(support, "support");
            return C12279e.m32602a((ObservableOnSubscribe<T>) new C5749a<T>(this, support));
        }
    }

    /* renamed from: app.zenly.locator.support.n0$k */
    static final class C5751k<T> implements Consumer<List<C8363x>> {

        /* renamed from: e */
        final /* synthetic */ C5724n0 f14615e;

        C5751k(C5724n0 n0Var) {
            this.f14615e = n0Var;
        }

        /* renamed from: a */
        public final void accept(List<C8363x> list) {
            C5724n0 n0Var = this.f14615e;
            C12932j.m33815a((Object) list, "categories");
            n0Var.f14533f = list;
        }
    }

    /* renamed from: app.zenly.locator.support.n0$k0 */
    static final class C5752k0 extends C12933k implements Function0<C5441d<C2877d>> {

        /* renamed from: f */
        final /* synthetic */ C5724n0 f14616f;

        C5752k0(C5724n0 n0Var) {
            this.f14616f = n0Var;
            super(0);
        }

        public final C5441d<C2877d> invoke() {
            return new C5441d<>(this.f14616f.f14528a, "support_tickets_viewed", C2877d.getDefaultInstance());
        }
    }

    /* renamed from: app.zenly.locator.support.n0$l */
    static final class C5753l<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ long f14617e;

        /* renamed from: app.zenly.locator.support.n0$l$a */
        static final class C5754a<T> implements SingleOnSubscribe<T> {

            /* renamed from: a */
            final /* synthetic */ C5753l f14618a;

            /* renamed from: b */
            final /* synthetic */ Support f14619b;

            /* renamed from: app.zenly.locator.support.n0$l$a$a */
            public static final class C5755a extends C12008e<Article> {

                /* renamed from: a */
                final /* synthetic */ SingleEmitter f14620a;

                C5755a(SingleEmitter singleEmitter) {
                    this.f14620a = singleEmitter;
                }

                public void onError(ErrorResponse errorResponse) {
                    C12932j.m33818b(errorResponse, "error");
                    SingleEmitter singleEmitter = this.f14620a;
                    String reason = errorResponse.getReason();
                    if (reason == null) {
                        reason = "failed to retrieve help center article";
                    }
                    singleEmitter.tryOnError(new Exception(reason));
                }

                public void onSuccess(Article article) {
                    C12932j.m33818b(article, "article");
                    this.f14620a.onSuccess(article);
                }
            }

            C5754a(C5753l lVar, Support support) {
                this.f14618a = lVar;
                this.f14619b = support;
            }

            public final void subscribe(SingleEmitter<Article> singleEmitter) {
                C12932j.m33818b(singleEmitter, "emitter");
                ProviderStore provider = this.f14619b.provider();
                if (provider != null) {
                    HelpCenterProvider helpCenterProvider = provider.helpCenterProvider();
                    if (helpCenterProvider != null) {
                        helpCenterProvider.getArticle(Long.valueOf(this.f14618a.f14617e), new C5755a(singleEmitter));
                        return;
                    }
                }
                singleEmitter.tryOnError(new Exception("failed to retrieve help center article, no provider"));
            }
        }

        C5753l(long j) {
            this.f14617e = j;
        }

        /* renamed from: a */
        public final C12291g<Article> apply(Support support) {
            C12932j.m33818b(support, "support");
            return C12291g.m32760a((SingleOnSubscribe<T>) new C5754a<T>(this, support));
        }
    }

    /* renamed from: app.zenly.locator.support.n0$l0 */
    static final class C5756l0<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C5756l0 f14621e = new C5756l0();

        C5756l0() {
        }

        /* renamed from: a */
        public final boolean mo13457a(C7082d3 d3Var) {
            C12932j.m33818b(d3Var, "event");
            return d3Var.getUnseenTickets();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo13457a((C7082d3) obj));
        }
    }

    /* renamed from: app.zenly.locator.support.n0$m */
    static final class C5757m<T, R> implements Function<Support, CompletableSource> {

        /* renamed from: e */
        final /* synthetic */ long f14622e;

        /* renamed from: app.zenly.locator.support.n0$m$a */
        static final class C5758a implements CompletableOnSubscribe {

            /* renamed from: a */
            final /* synthetic */ C5757m f14623a;

            /* renamed from: b */
            final /* synthetic */ Support f14624b;

            /* renamed from: app.zenly.locator.support.n0$m$a$a */
            public static final class C5759a extends C12008e<ArticleVote> {

                /* renamed from: a */
                final /* synthetic */ CompletableEmitter f14625a;

                C5759a(CompletableEmitter completableEmitter) {
                    this.f14625a = completableEmitter;
                }

                public void onError(ErrorResponse errorResponse) {
                    C12932j.m33818b(errorResponse, "error");
                    CompletableEmitter completableEmitter = this.f14625a;
                    String reason = errorResponse.getReason();
                    if (reason == null) {
                        reason = "failed to down-vote help center article";
                    }
                    completableEmitter.tryOnError(new Exception(reason));
                }

                public void onSuccess(ArticleVote articleVote) {
                    C12932j.m33818b(articleVote, "vote");
                    this.f14625a.onComplete();
                }
            }

            C5758a(C5757m mVar, Support support) {
                this.f14623a = mVar;
                this.f14624b = support;
            }

            public final void subscribe(CompletableEmitter completableEmitter) {
                C12932j.m33818b(completableEmitter, "emitter");
                ProviderStore provider = this.f14624b.provider();
                if (provider != null) {
                    HelpCenterProvider helpCenterProvider = provider.helpCenterProvider();
                    if (helpCenterProvider != null) {
                        helpCenterProvider.downvoteArticle(Long.valueOf(this.f14623a.f14622e), new C5759a(completableEmitter));
                        return;
                    }
                }
                completableEmitter.tryOnError(new Exception("failed to down-vote help center article, no provider"));
            }
        }

        C5757m(long j) {
            this.f14622e = j;
        }

        /* renamed from: a */
        public final C12271b apply(Support support) {
            C12932j.m33818b(support, "support");
            return C12271b.m32503a((CompletableOnSubscribe) new C5758a(this, support));
        }
    }

    /* renamed from: app.zenly.locator.support.n0$n */
    static final class C5760n<T, R> implements Function<Support, CompletableSource> {

        /* renamed from: e */
        final /* synthetic */ long f14626e;

        /* renamed from: app.zenly.locator.support.n0$n$a */
        static final class C5761a implements CompletableOnSubscribe {

            /* renamed from: a */
            final /* synthetic */ C5760n f14627a;

            /* renamed from: b */
            final /* synthetic */ Support f14628b;

            /* renamed from: app.zenly.locator.support.n0$n$a$a */
            public static final class C5762a extends C12008e<ArticleVote> {

                /* renamed from: a */
                final /* synthetic */ CompletableEmitter f14629a;

                C5762a(CompletableEmitter completableEmitter) {
                    this.f14629a = completableEmitter;
                }

                public void onError(ErrorResponse errorResponse) {
                    C12932j.m33818b(errorResponse, "error");
                    CompletableEmitter completableEmitter = this.f14629a;
                    String reason = errorResponse.getReason();
                    if (reason == null) {
                        reason = "failed to up-vote help center article";
                    }
                    completableEmitter.tryOnError(new Exception(reason));
                }

                public void onSuccess(ArticleVote articleVote) {
                    C12932j.m33818b(articleVote, "vote");
                    this.f14629a.onComplete();
                }
            }

            C5761a(C5760n nVar, Support support) {
                this.f14627a = nVar;
                this.f14628b = support;
            }

            public final void subscribe(CompletableEmitter completableEmitter) {
                C12932j.m33818b(completableEmitter, "emitter");
                ProviderStore provider = this.f14628b.provider();
                if (provider != null) {
                    HelpCenterProvider helpCenterProvider = provider.helpCenterProvider();
                    if (helpCenterProvider != null) {
                        helpCenterProvider.upvoteArticle(Long.valueOf(this.f14627a.f14626e), new C5762a(completableEmitter));
                        return;
                    }
                }
                completableEmitter.tryOnError(new Exception("failed to up-vote help center article, no provider"));
            }
        }

        C5760n(long j) {
            this.f14626e = j;
        }

        /* renamed from: a */
        public final C12271b apply(Support support) {
            C12932j.m33818b(support, "support");
            return C12271b.m32503a((CompletableOnSubscribe) new C5761a(this, support));
        }
    }

    /* renamed from: app.zenly.locator.support.n0$o */
    static final class C5763o<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        public static final C5763o f14630e = new C5763o();

        /* renamed from: app.zenly.locator.support.n0$o$a */
        static final class C5764a<T> implements ObservableOnSubscribe<T> {

            /* renamed from: a */
            final /* synthetic */ Support f14631a;

            /* renamed from: app.zenly.locator.support.n0$o$a$a */
            public static final class C5765a extends C12008e<List<? extends Category>> {

                /* renamed from: a */
                final /* synthetic */ ObservableEmitter f14632a;

                C5765a(ObservableEmitter observableEmitter) {
                    this.f14632a = observableEmitter;
                }

                public void onError(ErrorResponse errorResponse) {
                    C12932j.m33818b(errorResponse, "error");
                    ObservableEmitter observableEmitter = this.f14632a;
                    String reason = errorResponse.getReason();
                    if (reason == null) {
                        reason = "failed to retrieve help center categories";
                    }
                    observableEmitter.tryOnError(new Exception(reason));
                }

                public void onSuccess(List<? extends Category> list) {
                    C5730c cVar;
                    C12932j.m33818b(list, "categories");
                    for (Category category : list) {
                        C5730c[] values = C5730c.values();
                        int length = values.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                cVar = null;
                                break;
                            }
                            cVar = values[i];
                            long a = cVar.mo13415a();
                            Long id = category.getId();
                            if (id != null && a == id.longValue()) {
                                break;
                            }
                            i++;
                        }
                        if (cVar != null) {
                            cVar.mo13418b(category.getName());
                            cVar.mo13416a(category.getDescription());
                        }
                    }
                    C5730c.f14549m.mo13422a(true);
                    this.f14632a.onNext(C12840k.m33582g(C5730c.values()));
                    this.f14632a.onComplete();
                }
            }

            C5764a(Support support) {
                this.f14631a = support;
            }

            public final void subscribe(ObservableEmitter<List<C5730c>> observableEmitter) {
                C12932j.m33818b(observableEmitter, "emitter");
                ProviderStore provider = this.f14631a.provider();
                if (provider != null) {
                    HelpCenterProvider helpCenterProvider = provider.helpCenterProvider();
                    if (helpCenterProvider != null) {
                        helpCenterProvider.getCategories(new C5765a(observableEmitter));
                        return;
                    }
                }
                observableEmitter.tryOnError(new Exception("failed to retrieve help center categories, no provider"));
            }
        }

        C5763o() {
        }

        /* renamed from: a */
        public final C12279e<List<C5730c>> apply(Support support) {
            C12932j.m33818b(support, "support");
            return C12279e.m32602a((ObservableOnSubscribe<T>) new C5764a<T>(support));
        }
    }

    /* renamed from: app.zenly.locator.support.n0$p */
    static final class C5766p<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C5724n0 f14633e;

        /* renamed from: f */
        final /* synthetic */ C5730c f14634f;

        /* renamed from: app.zenly.locator.support.n0$p$a */
        static final class C5767a<T> implements ObservableOnSubscribe<T> {

            /* renamed from: a */
            final /* synthetic */ C5766p f14635a;

            /* renamed from: b */
            final /* synthetic */ Support f14636b;

            /* renamed from: app.zenly.locator.support.n0$p$a$a */
            public static final class C5768a extends C12008e<List<? extends Section>> {

                /* renamed from: a */
                final /* synthetic */ C5767a f14637a;

                /* renamed from: b */
                final /* synthetic */ ObservableEmitter f14638b;

                C5768a(C5767a aVar, ObservableEmitter observableEmitter) {
                    this.f14637a = aVar;
                    this.f14638b = observableEmitter;
                }

                public void onError(ErrorResponse errorResponse) {
                    C12932j.m33818b(errorResponse, "error");
                    ObservableEmitter observableEmitter = this.f14638b;
                    String reason = errorResponse.getReason();
                    if (reason == null) {
                        reason = "failed to retrieve help center sections";
                    }
                    observableEmitter.tryOnError(new Exception(reason));
                }

                public void onSuccess(List<? extends Section> list) {
                    C12932j.m33818b(list, "sections");
                    this.f14637a.f14635a.f14633e.f14534g.put(this.f14637a.f14635a.f14634f, list);
                    this.f14638b.onNext(list);
                    this.f14638b.onComplete();
                }
            }

            C5767a(C5766p pVar, Support support) {
                this.f14635a = pVar;
                this.f14636b = support;
            }

            public final void subscribe(ObservableEmitter<List<Section>> observableEmitter) {
                C12932j.m33818b(observableEmitter, "emitter");
                ProviderStore provider = this.f14636b.provider();
                if (provider != null) {
                    HelpCenterProvider helpCenterProvider = provider.helpCenterProvider();
                    if (helpCenterProvider != null) {
                        helpCenterProvider.getSections(Long.valueOf(this.f14635a.f14634f.mo13415a()), new C5768a(this, observableEmitter));
                        return;
                    }
                }
                observableEmitter.tryOnError(new Exception("failed to retrieve help center sections, no provider"));
            }
        }

        C5766p(C5724n0 n0Var, C5730c cVar) {
            this.f14633e = n0Var;
            this.f14634f = cVar;
        }

        /* renamed from: a */
        public final C12279e<List<Section>> apply(Support support) {
            C12932j.m33818b(support, "support");
            return C12279e.m32602a((ObservableOnSubscribe<T>) new C5767a<T>(this, support));
        }
    }

    /* renamed from: app.zenly.locator.support.n0$q */
    static final class C5769q<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ long f14639e;

        /* renamed from: app.zenly.locator.support.n0$q$a */
        static final class C5770a<T> implements SingleOnSubscribe<T> {

            /* renamed from: a */
            final /* synthetic */ C5769q f14640a;

            /* renamed from: b */
            final /* synthetic */ Support f14641b;

            /* renamed from: app.zenly.locator.support.n0$q$a$a */
            public static final class C5771a extends C12008e<Section> {

                /* renamed from: a */
                final /* synthetic */ SingleEmitter f14642a;

                C5771a(SingleEmitter singleEmitter) {
                    this.f14642a = singleEmitter;
                }

                /* renamed from: a */
                public void onSuccess(Section section) {
                    C12932j.m33818b(section, "section");
                    this.f14642a.onSuccess(section);
                }

                public void onError(ErrorResponse errorResponse) {
                    C12932j.m33818b(errorResponse, "error");
                    SingleEmitter singleEmitter = this.f14642a;
                    String reason = errorResponse.getReason();
                    if (reason == null) {
                        reason = "failed to retrieve help center section";
                    }
                    singleEmitter.tryOnError(new Exception(reason));
                }
            }

            C5770a(C5769q qVar, Support support) {
                this.f14640a = qVar;
                this.f14641b = support;
            }

            public final void subscribe(SingleEmitter<Section> singleEmitter) {
                C12932j.m33818b(singleEmitter, "emitter");
                ProviderStore provider = this.f14641b.provider();
                if (provider != null) {
                    HelpCenterProvider helpCenterProvider = provider.helpCenterProvider();
                    if (helpCenterProvider != null) {
                        helpCenterProvider.getSection(Long.valueOf(this.f14640a.f14639e), new C5771a(singleEmitter));
                        return;
                    }
                }
                singleEmitter.tryOnError(new Exception("failed to retrieve help center section, no provider"));
            }
        }

        C5769q(long j) {
            this.f14639e = j;
        }

        /* renamed from: a */
        public final C12291g<Section> apply(Support support) {
            C12932j.m33818b(support, "support");
            return C12291g.m32760a((SingleOnSubscribe<T>) new C5770a<T>(this, support));
        }
    }

    /* renamed from: app.zenly.locator.support.n0$r */
    static final class C5772r<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ long f14643e;

        /* renamed from: app.zenly.locator.support.n0$r$a */
        static final class C5773a<T> implements ObservableOnSubscribe<T> {

            /* renamed from: a */
            final /* synthetic */ C5772r f14644a;

            /* renamed from: b */
            final /* synthetic */ Support f14645b;

            /* renamed from: app.zenly.locator.support.n0$r$a$a */
            public static final class C5774a extends C12008e<List<? extends Article>> {

                /* renamed from: a */
                final /* synthetic */ ObservableEmitter f14646a;

                C5774a(ObservableEmitter observableEmitter) {
                    this.f14646a = observableEmitter;
                }

                public void onError(ErrorResponse errorResponse) {
                    C12932j.m33818b(errorResponse, "error");
                    ObservableEmitter observableEmitter = this.f14646a;
                    String reason = errorResponse.getReason();
                    if (reason == null) {
                        reason = "failed to retrieve help center section articles";
                    }
                    observableEmitter.tryOnError(new Exception(reason));
                }

                public void onSuccess(List<? extends Article> list) {
                    C12932j.m33818b(list, "articles");
                    this.f14646a.onNext(list);
                    this.f14646a.onComplete();
                }
            }

            C5773a(C5772r rVar, Support support) {
                this.f14644a = rVar;
                this.f14645b = support;
            }

            public final void subscribe(ObservableEmitter<List<Article>> observableEmitter) {
                C12932j.m33818b(observableEmitter, "emitter");
                ProviderStore provider = this.f14645b.provider();
                if (provider != null) {
                    HelpCenterProvider helpCenterProvider = provider.helpCenterProvider();
                    if (helpCenterProvider != null) {
                        helpCenterProvider.getArticles(Long.valueOf(this.f14644a.f14643e), new C5774a(observableEmitter));
                        return;
                    }
                }
                observableEmitter.tryOnError(new Exception("failed to retrieve help center section articles, no provider"));
            }
        }

        C5772r(long j) {
            this.f14643e = j;
        }

        /* renamed from: a */
        public final C12279e<List<Article>> apply(Support support) {
            C12932j.m33818b(support, "support");
            return C12279e.m32602a((ObservableOnSubscribe<T>) new C5773a<T>(this, support));
        }
    }

    /* renamed from: app.zenly.locator.support.n0$s */
    public static final class C5775s<T1, T2, R> implements BiFunction<Request, Map<String, C2877d>, R> {
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
            if (r0 != null) goto L_0x001d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final R apply(zendesk.support.Request r4, java.util.Map<java.lang.String, app.zenly.locator.core.models.C2877d> r5) {
            /*
                r3 = this;
                java.util.Map r5 = (java.util.Map) r5
                zendesk.support.Request r4 = (zendesk.support.Request) r4
                java.lang.String r0 = r4.getId()
                java.lang.Object r0 = r5.get(r0)
                app.zenly.locator.core.models.d r0 = (app.zenly.locator.core.models.C2877d) r0
                if (r0 == 0) goto L_0x0019
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$Builder r0 = r0.toBuilder()
                app.zenly.locator.core.models.d$a r0 = (app.zenly.locator.core.models.C2877d.C2878a) r0
                if (r0 == 0) goto L_0x0019
                goto L_0x001d
            L_0x0019:
                app.zenly.locator.core.models.d$a r0 = app.zenly.locator.core.models.C2877d.newBuilder()
            L_0x001d:
                java.lang.String r4 = r4.getId()
                r0.mo8937a(r4)
                long r1 = java.lang.System.currentTimeMillis()
                co.znly.core.vendor.com.google.protobuf.Timestamp r4 = app.zenly.locator.core.util.C3245z.m10282a(r1)
                r0.mo8936a(r4)
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite r4 = r0.build()
                java.lang.String r0 = "build()"
                kotlin.jvm.internal.C12932j.m33815a(r4, r0)
                app.zenly.locator.core.models.d r4 = (app.zenly.locator.core.models.C2877d) r4
                java.lang.String r0 = "(map[ticket.id]?.toBuild…d()\n                    }"
                kotlin.jvm.internal.C12932j.m33815a(r4, r0)
                java.lang.String r0 = r4.getId()
                java.lang.String r1 = "viewed.id"
                kotlin.jvm.internal.C12932j.m33815a(r0, r1)
                r5.put(r0, r4)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.support.C5724n0.C5775s.apply(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: app.zenly.locator.support.n0$t */
    static final class C5776t<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5776t f14647e = new C5776t();

        C5776t() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "zendesk feedback categories pre-fetch failed", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.support.n0$u */
    static final class C5777u<T> implements Consumer<List<? extends C5730c>> {

        /* renamed from: e */
        public static final C5777u f14648e = new C5777u();

        C5777u() {
        }

        /* renamed from: a */
        public final void accept(List<? extends C5730c> list) {
        }
    }

    /* renamed from: app.zenly.locator.support.n0$v */
    static final class C5778v<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5778v f14649e = new C5778v();

        C5778v() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "zendesk troubleshooting sections pre-fetch failed", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.support.n0$w */
    static final class C5779w<T> implements Consumer<List<? extends Section>> {

        /* renamed from: e */
        public static final C5779w f14650e = new C5779w();

        C5779w() {
        }

        /* renamed from: a */
        public final void accept(List<? extends Section> list) {
        }
    }

    /* renamed from: app.zenly.locator.support.n0$x */
    static final class C5780x<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5780x f14651e = new C5780x();

        C5780x() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "zendesk troubleshooting sections pre-fetch failed", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.support.n0$y */
    static final class C5781y<T> implements Consumer<List<? extends Section>> {

        /* renamed from: e */
        public static final C5781y f14652e = new C5781y();

        C5781y() {
        }

        /* renamed from: a */
        public final void accept(List<? extends Section> list) {
        }
    }

    /* renamed from: app.zenly.locator.support.n0$z */
    static final class C5782z<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5782z f14653e = new C5782z();

        C5782z() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "zendesk discover sections pre-fetch failed", new Object[0]);
        }
    }

    static {
        Class<C5724n0> cls = C5724n0.class;
        C12941s sVar = new C12941s(C12946x.m33834a((Class) cls), "ticketsStatusCache", "getTicketsStatusCache()Lapp/zenly/locator/core/content/RxProtobufCache;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a((Class) cls), "supportInstance", "getSupportInstance()Lio/reactivex/Single;");
        C12946x.m33839a((C12940r) sVar2);
        f14526l = new KProperty[]{sVar, sVar2};
    }

    public C5724n0(Context context) {
        C12932j.m33818b(context, "_context");
        this.f14528a = context.getApplicationContext();
        C12787b d = C12787b.m33458d();
        C12932j.m33815a((Object) d, "CompletableSubject.create()");
        this.f14529b = d;
        C12789c<Request> s = C12789c.m33462s();
        C12932j.m33815a((Object) s, "PublishSubject.create<Request>()");
        this.f14531d = s;
        this.f14533f = C12848o.m33640a();
        this.f14534g = new LinkedHashMap();
        this.f14535h = C12896f.m33751a(new C5752k0(this));
        this.f14536i = C12896f.m33751a(new C5745i0(this));
        C12791d<Map<String, C2877d>> g = C12791d.m33470g(1);
        C12932j.m33815a((Object) g, "ReplaySubject.createWith….SupportTicketViewed>>(1)");
        this.f14537j = g;
        C12279e<List<Request>> c = m16110i().mo36548c((Function<? super T, ? extends ObservableSource<? extends R>>) new C5748j0<Object,Object>(this));
        C12932j.m33815a((Object) c, "supportInstance.flatMapO…       })\n        }\n    }");
        this.f14538k = c;
    }

    /* renamed from: a */
    public static final int m16092a(RequestStatus requestStatus) {
        return f14527m.mo13413a(requestStatus);
    }

    /* renamed from: i */
    private final C12291g<Support> m16110i() {
        Lazy lazy = this.f14536i;
        KProperty kProperty = f14526l[1];
        return (C12291g) lazy.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final C5441d<C2877d> m16111j() {
        Lazy lazy = this.f14535h;
        KProperty kProperty = f14526l[0];
        return (C5441d) lazy.getValue();
    }

    /* renamed from: f */
    public final void mo13406f() {
        Zendesk zendesk2 = Zendesk.INSTANCE;
        Context context = this.f14528a;
        C12932j.m33815a((Object) context, "context");
        zendesk2.init(context.getApplicationContext(), this.f14528a.getString(R.string.config_zendesk_url), this.f14528a.getString(R.string.config_zendesk_id), this.f14528a.getString(R.string.config_zendesk_token));
        Support.INSTANCE.init(Zendesk.INSTANCE);
        Zendesk.INSTANCE.setIdentity(new JwtIdentity(C5448c.m15478a().zendeskGetJWTToken()));
        this.f14529b.onComplete();
    }

    /* renamed from: g */
    public final void mo13407g() {
        Disposable a = m16111j().mo13014a().mo36501i(C5727a0.f14544e).mo36412a((Consumer<? super T>) new C5786p0<Object>(new C5729b0(this.f14537j)), (Consumer<? super Throwable>) C5732c0.f14554e);
        C12932j.m33815a((Object) a, "ticketsStatusCache.get()…ading cache from disk\") }");
        C12773a.m33432a(a, this.f14530c);
        C12279e a2 = this.f14531d.mo36426a((ObservableSource<? extends U>) this.f14537j, (BiFunction<? super T, ? super U, ? extends R>) new C5775s<Object,Object,Object>());
        C12932j.m33815a((Object) a2, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        Disposable a3 = a2.mo36455b((Consumer<? super T>) new C5786p0<Object>(new C5735d0(this.f14537j))).mo36428a(C12802a.m33491b()).mo36509m(new C5737e0(this)).mo36412a((Consumer<? super T>) C5739f0.f14595e, (Consumer<? super Throwable>) C5741g0.f14600e);
        C12932j.m33815a((Object) a3, "ticketViewed\n           …o cache\") }\n            )");
        C12773a.m33432a(a3, this.f14530c);
        Disposable a4 = mo13399b().mo36412a((Consumer<? super T>) C5743h0.f14603e, (Consumer<? super Throwable>) C5776t.f14647e);
        C12932j.m33815a((Object) a4, "feedbackCategories.subsc…etch failed\") }\n        )");
        C12773a.m33432a(a4, this.f14530c);
        Disposable a5 = mo13404e().mo36412a((Consumer<? super T>) C5777u.f14648e, (Consumer<? super Throwable>) C5778v.f14649e);
        C12932j.m33815a((Object) a5, "helpCenterCategories().s…etch failed\") }\n        )");
        C12773a.m33432a(a5, this.f14530c);
        Disposable a6 = mo13393a(C5730c.TROUBLESHOOTING).mo36412a((Consumer<? super T>) C5779w.f14650e, (Consumer<? super Throwable>) C5780x.f14651e);
        String str = "helpCenterCategorySectio…etch failed\") }\n        )";
        C12932j.m33815a((Object) a6, str);
        C12773a.m33432a(a6, this.f14530c);
        Disposable a7 = mo13393a(C5730c.DISCOVER).mo36412a((Consumer<? super T>) C5781y.f14652e, (Consumer<? super Throwable>) C5782z.f14653e);
        C12932j.m33815a((Object) a7, str);
        C12773a.m33432a(a7, this.f14530c);
    }

    /* renamed from: h */
    public final C12279e<Boolean> mo13408h() {
        C12279e<Boolean> l = C5448c.m15478a().zendeskUnseenStatusRealtimeStream().mo36501i(C5756l0.f14621e).mo36506l();
        C12932j.m33815a((Object) l, "ZenlyCoreProvider.get().…ickets }\n        .share()");
        return l;
    }

    /* renamed from: c */
    public final C12279e<List<Request>> mo13401c() {
        return this.f14538k;
    }

    /* renamed from: d */
    public final C12791d<Map<String, C2877d>> mo13403d() {
        return this.f14537j;
    }

    /* renamed from: e */
    public final C12279e<List<C5730c>> mo13404e() {
        if (C5730c.f14549m.mo13423a()) {
            C12279e<List<C5730c>> e = C12279e.m32626e(C12840k.m33582g(C5730c.values()));
            C12932j.m33815a((Object) e, "Observable.just(HelpCent…tegory.values().toList())");
            return e;
        }
        C12279e<List<C5730c>> c = m16110i().mo36548c((Function<? super T, ? extends ObservableSource<? extends R>>) C5763o.f14630e);
        C12932j.m33815a((Object) c, "supportInstance.flatMapO…          }\n            }");
        return c;
    }

    /* renamed from: b */
    public final C12279e<List<C8363x>> mo13399b() {
        C12279e<List<C8363x>> b = C5448c.m15478a().zendeskGetFeedbackCategories().mo36501i(C5747j.f14609e).mo36455b((Consumer<? super T>) new C5751k<Object>(this));
        if (this.f14533f.isEmpty()) {
            C12932j.m33815a((Object) b, "query");
            return b;
        }
        C12279e e = C12279e.m32626e(this.f14533f);
        C12932j.m33815a((Object) e, "Observable.just(feedbackCategoriesCache)");
        C12279e<List<C8363x>> a = C12279e.m32604a((ObservableSource<? extends T>) e, (ObservableSource<? extends T>) b);
        C12932j.m33815a((Object) a, "Observable.concat(cache, query)");
        return a;
    }

    /* renamed from: c */
    public final C12271b mo13400c(long j) {
        C12271b b = m16110i().mo36542b((Function<? super T, ? extends CompletableSource>) new C5760n<Object,Object>(j));
        C12932j.m33815a((Object) b, "supportInstance.flatMapC…ovider\"))\n        }\n    }");
        return b;
    }

    /* renamed from: d */
    public final C12291g<Section> mo13402d(long j) {
        C12291g<Section> a = m16110i().mo36538a((Function<? super T, ? extends SingleSource<? extends R>>) new C5769q<Object,Object>(j));
        C12932j.m33815a((Object) a, "supportInstance.flatMap …ovider\"))\n        }\n    }");
        return a;
    }

    /* renamed from: e */
    public final C12279e<List<Article>> mo13405e(long j) {
        C12279e<List<Article>> c = m16110i().mo36548c((Function<? super T, ? extends ObservableSource<? extends R>>) new C5772r<Object,Object>(j));
        C12932j.m33815a((Object) c, "supportInstance.flatMapO…ovider\"))\n        }\n    }");
        return c;
    }

    /* renamed from: a */
    public final void mo13396a() {
        this.f14530c.mo36401a();
    }

    /* renamed from: a */
    public final void mo13397a(Request request) {
        C12932j.m33818b(request, "ticket");
        this.f14531d.onNext(request);
    }

    /* renamed from: a */
    public final C8393z mo13390a(C5733d dVar, C8363x xVar, C8363x xVar2, String str) {
        C12932j.m33818b(dVar, "subject");
        return m16098a(dVar, str, (Function1<? super List<C7991b0>, C12956q>) new C5740g<Object,C12956q>(this, xVar2, xVar, dVar));
    }

    /* renamed from: a */
    public final C8393z mo13389a(Context context, C5733d dVar, Map<Integer, C5736e> map) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(dVar, "subject");
        C12932j.m33818b(map, "wrongPlaces");
        return m16098a(dVar, m16101a(context, map), (Function1<? super List<C7991b0>, C12956q>) new C5742h<Object,C12956q>(this, map));
    }

    /* renamed from: b */
    public final C12271b mo13398b(long j) {
        C12271b b = m16110i().mo36542b((Function<? super T, ? extends CompletableSource>) new C5757m<Object,Object>(j));
        C12932j.m33815a((Object) b, "supportInstance.flatMapC…ovider\"))\n        }\n    }");
        return b;
    }

    /* renamed from: a */
    private final String m16101a(Context context, Map<Integer, C5736e> map) {
        Integer valueOf = Integer.valueOf(1);
        if (map.containsKey(valueOf)) {
            return m16100a(context, (int) R.string.support_places_main_home, (C5736e) C12835h0.m33552b(map, valueOf));
        }
        if (map.containsKey(Integer.valueOf(3))) {
            return m16100a(context, (int) R.string.support_places_main_school, (C5736e) C12835h0.m33552b(map, Integer.valueOf(3)));
        }
        return map.containsKey(Integer.valueOf(2)) ? m16100a(context, (int) R.string.support_places_main_work, (C5736e) C12835h0.m33552b(map, Integer.valueOf(2))) : "";
    }

    /* renamed from: a */
    private final String m16100a(Context context, int i, C5736e eVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(i));
        String b = eVar.mo13432b();
        if (!(b == null || b.length() == 0)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" - ");
            sb2.append(eVar.mo13432b());
            sb.append(sb2.toString());
        }
        sb.append(" :");
        String str2 = "append(value)";
        C12932j.m33815a((Object) sb, str2);
        C13024m.m33992a(sb);
        if (eVar.mo13434d() == C5738f.HOME_OTHER) {
            str = eVar.mo13431a();
        } else {
            str = context.getString(eVar.mo13434d().mo13440b());
        }
        sb.append(str);
        C12932j.m33815a((Object) sb, str2);
        C13024m.m33992a(sb);
        C13024m.m33992a(sb);
        C13024m.m33992a(sb);
        String sb3 = sb.toString();
        C12932j.m33815a((Object) sb3, "StringBuilder().apply {\n…ln()\n        }.toString()");
        return sb3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16104a(List<C7991b0> list, C5736e eVar) {
        if (eVar.mo13433c() != null) {
            C7991b0 a = m16094a(360030036374L, String.valueOf(eVar.mo13433c().longValue()));
            C12932j.m33815a((Object) a, "createCustomField(PLACE_…tails.placeId.toString())");
            list.add(a);
        }
        if (eVar.mo13432b() != null) {
            C7991b0 a2 = m16094a(360030036394L, eVar.mo13432b());
            C12932j.m33815a((Object) a2, "createCustomField(PLACE_…laceDetails.placeAddress)");
            list.add(a2);
        }
    }

    /* renamed from: a */
    public final C8393z mo13392a(C5733d dVar, List<? extends C5931y> list, List<? extends C5931y> list2, String str) {
        C12932j.m33818b(dVar, "subject");
        C12932j.m33818b(list, "helpCenterEntryPointPath");
        C12932j.m33818b(list2, "helpCenterExitPointPath");
        return m16098a(dVar, str, (Function1<? super List<C7991b0>, C12956q>) new C5744i<Object,C12956q>(this, list, list2));
    }

    /* renamed from: a */
    public final C8393z mo13391a(C5733d dVar, String str) {
        C12932j.m33818b(dVar, "subject");
        return m16099a(this, dVar, str, null, 4, null);
    }

    /* renamed from: a */
    static /* synthetic */ C8393z m16099a(C5724n0 n0Var, C5733d dVar, String str, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return n0Var.m16098a(dVar, str, function1);
    }

    /* renamed from: a */
    private final C8393z m16098a(C5733d dVar, String str, Function1<? super List<C7991b0>, C12956q> function1) {
        Context context = this.f14528a;
        String str2 = "context";
        C12932j.m33815a((Object) context, str2);
        String str3 = "";
        Locale locale = new Locale(str3, C3221j.m10213a(context));
        Context context2 = this.f14528a;
        C12932j.m33815a((Object) context2, str2);
        Resources resources = context2.getResources();
        C12932j.m33815a((Object) resources, "context.resources");
        Locale a = C0564b.m2670a(resources.getConfiguration()).mo3161a(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(m16094a(114101716433L, "android"));
        String a2 = C3224l.m10222a();
        C12932j.m33815a((Object) a2, "DebugUtils.getAndroidVersion()");
        arrayList.add(m16094a(360000052368L, a2));
        String a3 = C3224l.m10223a(this.f14528a);
        C12932j.m33815a((Object) a3, "DebugUtils.getAppVersionName(context)");
        arrayList.add(m16094a(360000050047L, a3));
        String version = C5448c.m15478a().version();
        C12932j.m33815a((Object) version, "ZenlyCoreProvider.get().version()");
        arrayList.add(m16094a(360000111767L, version));
        String displayCountry = locale.getDisplayCountry(Locale.US);
        C12932j.m33815a((Object) displayCountry, "countryLocale.getDisplayCountry(Locale.US)");
        arrayList.add(m16094a(360000049747L, displayCountry));
        C12932j.m33815a((Object) a, "currentLocale");
        String language = a.getLanguage();
        C12932j.m33815a((Object) language, "currentLocale.language");
        arrayList.add(m16094a(360000050027L, language));
        C5726a aVar = C5725a.f14541i;
        UserProto$User userMeCache = C5448c.m15478a().userMeCache();
        arrayList.add(m16094a(360000318148L, aVar.mo13411a(userMeCache != null ? C5788q0.m16194b(userMeCache) : -1).mo13410b()));
        if (function1 != null) {
            C12956q qVar = (C12956q) function1.invoke(arrayList);
        }
        C8394a newBuilder = C8393z.newBuilder();
        C8089a newBuilder2 = C8088h0.newBuilder();
        C12932j.m33815a((Object) newBuilder2, "this");
        newBuilder2.mo22140b(dVar.mo13428d());
        if (str == null) {
            str = str3;
        }
        newBuilder2.mo22139a(str);
        newBuilder2.mo22138a((Iterable<? extends C7991b0>) arrayList);
        newBuilder2.mo22137a(dVar.mo13426b());
        newBuilder.mo22341a((C8088h0) newBuilder2.build());
        GeneratedMessageLite build = newBuilder.build();
        C12932j.m33815a((Object) build, "ZendeskProto.ZendeskCrea…build()\n        }.build()");
        return (C8393z) build;
    }

    /* renamed from: a */
    public final C12279e<C7973a0> mo13394a(C8393z zVar) {
        C12932j.m33818b(zVar, "request");
        C12279e<C7973a0> zendeskCreateTicket = C5448c.m15478a().zendeskCreateTicket(zVar);
        C12932j.m33815a((Object) zendeskCreateTicket, "ZenlyCoreProvider.get().…deskCreateTicket(request)");
        return zendeskCreateTicket;
    }

    /* renamed from: a */
    public final C12279e<List<Section>> mo13393a(C5730c cVar) {
        C12932j.m33818b(cVar, "category");
        C12279e<List<Section>> c = m16110i().mo36548c((Function<? super T, ? extends ObservableSource<? extends R>>) new C5766p<Object,Object>(this, cVar));
        C12932j.m33815a((Object) c, "supportInstance.flatMapO…)\n            }\n        }");
        List list = (List) this.f14534g.get(cVar);
        if (list == null) {
            return c;
        }
        C12279e<List<Section>> a = C12279e.m32604a((ObservableSource<? extends T>) C12279e.m32626e(list), (ObservableSource<? extends T>) c);
        C12932j.m33815a((Object) a, "Observable.concat(Observ…le.just(sections), query)");
        return a;
    }

    /* renamed from: a */
    public final C12291g<Article> mo13395a(long j) {
        C12291g<Article> a = m16110i().mo36538a((Function<? super T, ? extends SingleSource<? extends R>>) new C5753l<Object,Object>(j));
        C12932j.m33815a((Object) a, "supportInstance.flatMap …ovider\"))\n        }\n    }");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C7991b0 m16094a(long j, String str) {
        C7992a newBuilder = C7991b0.newBuilder();
        C12932j.m33815a((Object) newBuilder, "this");
        newBuilder.setId(j);
        newBuilder.mo22054a(str);
        return (C7991b0) newBuilder.build();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C7991b0 m16095a(long j, List<? extends C5931y> list) {
        C7992a newBuilder = C7991b0.newBuilder();
        C12932j.m33815a((Object) newBuilder, "this");
        newBuilder.setId(j);
        newBuilder.mo22054a(C12857w.m33662a(list, Constants.URL_PATH_DELIMITER, null, null, 0, null, null, 62, null));
        return (C7991b0) newBuilder.build();
    }
}
