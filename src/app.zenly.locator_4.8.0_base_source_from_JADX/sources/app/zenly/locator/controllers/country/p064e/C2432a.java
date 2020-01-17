package app.zenly.locator.controllers.country.p064e;

import android.content.Context;
import android.view.View;
import app.zenly.locator.controllers.country.p066g.C2440a;
import app.zenly.locator.controllers.country.p066g.C2441b;
import app.zenly.locator.core.util.C3221j;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.text.Collator;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.C12899i;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.core.C7123i2;
import p333g.p378f.p380b.p381a.C12119a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function3;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.controllers.country.e.a */
public final class C2432a extends C12292a implements ObservableSectionController {

    /* renamed from: k */
    private static final Pattern f7314k = Pattern.compile("\\p{M}", 34);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12119a f7315f = new C12119a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f7316g;

    /* renamed from: h */
    private final C12279e<List<C7123i2>> f7317h;

    /* renamed from: i */
    private final C12279e<String> f7318i;

    /* renamed from: j */
    private final C12279e<CharSequence> f7319j;

    /* renamed from: app.zenly.locator.controllers.country.e.a$a */
    public static final class C2433a {
        private C2433a() {
        }

        public /* synthetic */ C2433a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.controllers.country.e.a$b */
    private static final class C2434b implements Comparable<C2434b> {

        /* renamed from: h */
        private static final Collator f7320h;

        /* renamed from: e */
        private final String f7321e;

        /* renamed from: f */
        private final int f7322f;

        /* renamed from: g */
        private final String f7323g;

        /* renamed from: app.zenly.locator.controllers.country.e.a$b$a */
        public static final class C2435a {
            private C2435a() {
            }

            public /* synthetic */ C2435a(C12928f fVar) {
                this();
            }
        }

        static {
            new C2435a(null);
            Collator instance = Collator.getInstance();
            instance.setStrength(1);
            f7320h = instance;
        }

        public C2434b(C7123i2 i2Var) {
            C12932j.m33818b(i2Var, "phoneRegion");
            String str = "";
            String displayCountry = new Locale(str, i2Var.getIsoCountryCode()).getDisplayCountry(Locale.getDefault());
            C12932j.m33815a((Object) displayCountry, "countryLocale.getDisplay…ntry(Locale.getDefault())");
            this.f7321e = displayCountry;
            this.f7322f = i2Var.getCountryDialingCode();
            String country = new Locale(str, i2Var.getIsoCountryCode()).getCountry();
            C12932j.m33815a((Object) country, "Locale(\"\", phoneRegion.isoCountryCode).country");
            this.f7323g = country;
        }

        /* renamed from: a */
        public final int mo8393a() {
            return this.f7322f;
        }

        /* renamed from: b */
        public final String mo8396b() {
            return this.f7323g;
        }

        /* renamed from: c */
        public final String mo8397c() {
            return this.f7321e;
        }

        /* renamed from: a */
        public int compareTo(C2434b bVar) {
            C12932j.m33818b(bVar, "other");
            return f7320h.compare(this.f7321e, bVar.f7321e);
        }

        /* renamed from: a */
        public final C2440a mo8395a(Context context, long j, String str) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(str, "selectedCountry");
            int a = C3221j.m10212a(context, this.f7323g);
            String str2 = this.f7321e;
            int i = this.f7322f;
            String str3 = this.f7323g;
            C2440a aVar = new C2440a(j, a, str2, i, str3, C12932j.m33817a((Object) str, (Object) str3));
            return aVar;
        }
    }

    /* renamed from: app.zenly.locator.controllers.country.e.a$c */
    public static final class C2436c<T1, T2, T3, R> implements Function3<T1, T2, T3, R> {

        /* renamed from: a */
        final /* synthetic */ C2432a f7324a;

        public C2436c(C2432a aVar) {
            this.f7324a = aVar;
        }

        public final R apply(T1 t1, T2 t2, T3 t3) {
            List list;
            CharSequence charSequence = (CharSequence) t3;
            String str = (String) t2;
            List<C7123i2> list2 = (List) t1;
            ArrayList arrayList = new ArrayList(C12850p.m33647a(list2, 10));
            for (C7123i2 bVar : list2) {
                arrayList.add(new C2434b(bVar));
            }
            List i = C12857w.m33688i((Iterable) arrayList);
            if (charSequence.length() == 0) {
                String a = C3221j.m10213a(this.f7324a.f7316g);
                Locale locale = Locale.getDefault();
                C12932j.m33815a((Object) locale, "Locale.getDefault()");
                String country = locale.getCountry();
                ArrayList<C2434b> arrayList2 = new ArrayList<>();
                for (Object next : i) {
                    if (C12848o.m33643b((Object[]) new String[]{str, a, country}).contains(((C2434b) next).mo8396b())) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C12850p.m33647a(arrayList2, 10));
                for (C2434b bVar2 : arrayList2) {
                    Context a2 = this.f7324a.f7316g;
                    C12119a b = this.f7324a.f7315f;
                    StringBuilder sb = new StringBuilder();
                    sb.append("headers:");
                    sb.append(bVar2.mo8396b());
                    arrayList3.add(bVar2.mo8395a(a2, b.mo35844a(sb.toString()), str));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object next2 : i) {
                    String b2 = this.f7324a.m8516b(((C2434b) next2).mo8397c());
                    if (b2 != null) {
                        String substring = b2.substring(0, 1);
                        C12932j.m33815a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        Object obj = linkedHashMap.get(substring);
                        if (obj == null) {
                            obj = new ArrayList();
                            linkedHashMap.put(substring, obj);
                        }
                        ((List) obj).add(next2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                List<C12899i> d = C12837i0.m33556d(linkedHashMap);
                ArrayList arrayList4 = new ArrayList();
                for (C12899i iVar : d) {
                    arrayList4.add(new C2441b(this.f7324a.f7315f.mo35844a((String) iVar.mo37204c()), (String) iVar.mo37204c()));
                    Iterable<C2434b> iterable = (Iterable) iVar.mo37205d();
                    ArrayList arrayList5 = new ArrayList(C12850p.m33647a(iterable, 10));
                    for (C2434b bVar3 : iterable) {
                        arrayList5.add(bVar3.mo8395a(this.f7324a.f7316g, this.f7324a.f7315f.mo35844a(bVar3.mo8396b()), str));
                    }
                    C12854t.m33651a((Collection) arrayList4, (Iterable) arrayList5);
                }
                list = C12857w.m33670b((Collection) arrayList3, (Iterable) C12857w.m33689j(arrayList4));
            } else {
                String a3 = C13028q.m33999a(this.f7324a.m8513a(charSequence.toString()), "+", "", false, 4, (Object) null);
                ArrayList<C2434b> arrayList6 = new ArrayList<>();
                for (Object next3 : i) {
                    C2434b bVar4 = (C2434b) next3;
                    String valueOf = String.valueOf(bVar4.mo8393a());
                    String a4 = this.f7324a.m8513a(bVar4.mo8397c());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(" ");
                    sb2.append(a3);
                    if (C13029r.m34022a((CharSequence) a4, (CharSequence) sb2.toString(), false, 2, (Object) null) || C13028q.m34003a(a4, a3, false, 2, null) || C13028q.m34003a(valueOf, a3, false, 2, null)) {
                        arrayList6.add(next3);
                    }
                }
                list = new ArrayList(C12850p.m33647a(arrayList6, 10));
                for (C2434b bVar5 : arrayList6) {
                    list.add(bVar5.mo8395a(this.f7324a.f7316g, this.f7324a.f7315f.mo35844a(bVar5.mo8396b()), str));
                }
            }
            return C11751f.m30863b(list);
        }
    }

    static {
        new C2433a(null);
    }

    public C2432a(Context context, C12279e<List<C7123i2>> eVar, C12279e<String> eVar2, C12279e<CharSequence> eVar3) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(eVar, "countriesObservable");
        C12932j.m33818b(eVar2, "selectedCountryObservable");
        C12932j.m33818b(eVar3, "queryObservable");
        this.f7316g = context;
        this.f7317h = eVar;
        this.f7318i = eVar2;
        this.f7319j = eVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12774b bVar = C12774b.f33320a;
        C12279e<Seekable<C11722a>> a = C12279e.m32609a((ObservableSource<? extends T1>) this.f7317h, (ObservableSource<? extends T2>) this.f7318i, (ObservableSource<? extends T3>) this.f7319j, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new C2436c<Object,Object,Object,Object>(this));
        C12932j.m33815a((Object) a, "Observables.combineLates….copyOf(items)\n\n        }");
        return a;
    }

    public void onViewBound(View view, C11722a aVar) {
        C12932j.m33818b(view, "itemView");
        C12932j.m33818b(aVar, "model");
    }

    public void onViewRecycled(View view, C11722a aVar) {
        C12932j.m33818b(view, "itemView");
        C12932j.m33818b(aVar, "viewModel");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String m8513a(String str) {
        String b = m8516b(str);
        Locale locale = Locale.getDefault();
        C12932j.m33815a((Object) locale, "Locale.getDefault()");
        if (b != null) {
            String lowerCase = b.toLowerCase(locale);
            C12932j.m33815a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m8516b(String str) {
        String replaceAll = f7314k.matcher(Normalizer.normalize(str, Form.NFD)).replaceAll("");
        C12932j.m33815a((Object) replaceAll, "NORMALIZE_PATTERN\n      …          .replaceAll(\"\")");
        return replaceAll;
    }
}
