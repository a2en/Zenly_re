package p333g.p382g.p383a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.ObservableTransformer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p406n.C12789c;

/* renamed from: g.g.a.b */
public class C12125b {

    /* renamed from: b */
    static final Object f31549b = new Object();

    /* renamed from: a */
    C12130c f31550a;

    /* renamed from: g.g.a.b$a */
    class C12126a implements ObservableTransformer<T, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String[] f31551a;

        /* renamed from: g.g.a.b$a$a */
        class C12127a implements Function<List<C12124a>, ObservableSource<Boolean>> {
            C12127a(C12126a aVar) {
            }

            /* renamed from: a */
            public ObservableSource<Boolean> apply(List<C12124a> list) throws Exception {
                if (list.isEmpty()) {
                    return C12279e.m32633q();
                }
                for (C12124a aVar : list) {
                    if (!aVar.f31547b) {
                        return C12279e.m32626e(Boolean.valueOf(false));
                    }
                }
                return C12279e.m32626e(Boolean.valueOf(true));
            }
        }

        C12126a(String[] strArr) {
            this.f31551a = strArr;
        }

        public ObservableSource<Boolean> apply(C12279e<T> eVar) {
            return C12125b.this.m32004a(eVar, this.f31551a).mo36415a(this.f31551a.length).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C12127a<Object,Object>(this));
        }
    }

    /* renamed from: g.g.a.b$b */
    class C12128b implements ObservableTransformer<T, C12124a> {

        /* renamed from: a */
        final /* synthetic */ String[] f31553a;

        C12128b(String[] strArr) {
            this.f31553a = strArr;
        }

        public ObservableSource<C12124a> apply(C12279e<T> eVar) {
            return C12125b.this.m32004a(eVar, this.f31553a);
        }
    }

    /* renamed from: g.g.a.b$c */
    class C12129c implements Function<Object, C12279e<C12124a>> {

        /* renamed from: e */
        final /* synthetic */ String[] f31555e;

        C12129c(String[] strArr) {
            this.f31555e = strArr;
        }

        public C12279e<C12124a> apply(Object obj) throws Exception {
            return C12125b.this.m32007g(this.f31555e);
        }
    }

    public C12125b(Activity activity) {
        this.f31550a = m32005b(activity);
    }

    /* renamed from: b */
    private C12130c m32005b(Activity activity) {
        C12130c a = m32000a(activity);
        if (!(a == null)) {
            return a;
        }
        C12130c cVar = new C12130c();
        FragmentManager fragmentManager = activity.getFragmentManager();
        fragmentManager.beginTransaction().add(cVar, "RxPermissions").commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
        return cVar;
    }

    /* renamed from: f */
    private C12279e<?> m32006f(String... strArr) {
        for (String a : strArr) {
            if (!this.f31550a.mo35917a(a)) {
                return C12279e.m32633q();
            }
        }
        return C12279e.m32626e(f31549b);
    }

    /* access modifiers changed from: private */
    @TargetApi(23)
    /* renamed from: g */
    public C12279e<C12124a> m32007g(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            C12130c cVar = this.f31550a;
            StringBuilder sb = new StringBuilder();
            sb.append("Requesting permission ");
            sb.append(str);
            cVar.mo35921e(sb.toString());
            if (mo35907a(str)) {
                arrayList.add(C12279e.m32626e(new C12124a(str, true, false)));
            } else if (mo35909b(str)) {
                arrayList.add(C12279e.m32626e(new C12124a(str, false, false)));
            } else {
                C12789c b = this.f31550a.mo35918b(str);
                if (b == null) {
                    arrayList2.add(str);
                    b = C12789c.m33462s();
                    this.f31550a.mo35914a(str, b);
                }
                arrayList.add(b);
            }
        }
        if (!arrayList2.isEmpty()) {
            mo35912e((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return C12279e.m32629g((ObservableSource<? extends ObservableSource<? extends T>>) C12279e.m32623b((Iterable<? extends T>) arrayList));
    }

    /* renamed from: c */
    public C12279e<Boolean> mo35910c(String... strArr) {
        return C12279e.m32626e(f31549b).mo36427a(mo35905a(strArr));
    }

    /* renamed from: d */
    public C12279e<C12124a> mo35911d(String... strArr) {
        return C12279e.m32626e(f31549b).mo36427a(mo35908b(strArr));
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(23)
    /* renamed from: e */
    public void mo35912e(String[] strArr) {
        C12130c cVar = this.f31550a;
        StringBuilder sb = new StringBuilder();
        sb.append("requestPermissionsFromFragment ");
        sb.append(TextUtils.join(", ", strArr));
        cVar.mo35921e(sb.toString());
        this.f31550a.mo35915a(strArr);
    }

    /* renamed from: a */
    private C12130c m32000a(Activity activity) {
        return (C12130c) activity.getFragmentManager().findFragmentByTag("RxPermissions");
    }

    /* renamed from: a */
    public <T> ObservableTransformer<T, Boolean> mo35905a(String... strArr) {
        return new C12126a(strArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C12279e<C12124a> m32004a(C12279e<?> eVar, String... strArr) {
        if (strArr != null && strArr.length != 0) {
            return m32003a(eVar, m32006f(strArr)).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C12129c<Object,Object>(strArr));
        }
        throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
    }

    /* renamed from: b */
    public <T> ObservableTransformer<T, C12124a> mo35908b(String... strArr) {
        return new C12128b(strArr);
    }

    /* renamed from: a */
    private C12279e<?> m32003a(C12279e<?> eVar, C12279e<?> eVar2) {
        if (eVar == null) {
            return C12279e.m32626e(f31549b);
        }
        return C12279e.m32621b((ObservableSource<? extends T>) eVar, (ObservableSource<? extends T>) eVar2);
    }

    /* renamed from: b */
    public boolean mo35909b(String str) {
        return mo35906a() && this.f31550a.mo35920d(str);
    }

    /* renamed from: a */
    public boolean mo35907a(String str) {
        return !mo35906a() || this.f31550a.mo35919c(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo35906a() {
        return VERSION.SDK_INT >= 23;
    }
}
