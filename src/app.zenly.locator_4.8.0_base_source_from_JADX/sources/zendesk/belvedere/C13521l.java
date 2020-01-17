package zendesk.belvedere;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: zendesk.belvedere.l */
class C13521l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C13526m f35064a;

    /* renamed from: b */
    private C13524c f35065b = null;

    /* renamed from: zendesk.belvedere.l$a */
    class C13522a implements C13524c {

        /* renamed from: a */
        final /* synthetic */ Context f35066a;

        /* renamed from: b */
        final /* synthetic */ List f35067b;

        /* renamed from: c */
        final /* synthetic */ C13525d f35068c;

        C13522a(Context context, List list, C13525d dVar) {
            this.f35066a = context;
            this.f35067b = list;
            this.f35068c = dVar;
        }

        /* renamed from: a */
        public void mo38901a(Map<String, Boolean> map, List<String> list) {
            List a = C13521l.this.m35813a(this.f35066a, this.f35067b);
            if (C13521l.this.m35820a(this.f35066a)) {
                this.f35068c.mo38754a(a);
            } else {
                this.f35068c.mo38753a();
            }
        }
    }

    /* renamed from: zendesk.belvedere.l$b */
    class C13523b implements C13524c {

        /* renamed from: a */
        final /* synthetic */ C13524c f35070a;

        C13523b(C13524c cVar) {
            this.f35070a = cVar;
        }

        /* renamed from: a */
        public void mo38901a(Map<String, Boolean> map, List<String> list) {
            for (String a : list) {
                C13521l.this.f35064a.mo38902a(a);
            }
            this.f35070a.mo38901a(map, list);
            C13521l.this.m35818a((C13524c) null);
        }
    }

    /* renamed from: zendesk.belvedere.l$c */
    private interface C13524c {
        /* renamed from: a */
        void mo38901a(Map<String, Boolean> map, List<String> list);
    }

    /* renamed from: zendesk.belvedere.l$d */
    interface C13525d {
        /* renamed from: a */
        void mo38753a();

        /* renamed from: a */
        void mo38754a(List<MediaIntent> list);
    }

    C13521l(Context context) {
        this.f35064a = new C13526m(context);
    }

    /* renamed from: b */
    private List<String> m35823b(Context context) {
        ArrayList arrayList = new ArrayList();
        String str = "android.permission.READ_EXTERNAL_STORAGE";
        boolean z = !this.f35064a.mo38903b(str);
        if (!m35820a(context) && z) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo38900a(Fragment fragment, int i, String[] strArr, int[] iArr) {
        if (i != 9842) {
            return false;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArr[i2] == 0) {
                hashMap.put(strArr[i2], Boolean.valueOf(true));
            } else if (iArr[i2] == -1) {
                hashMap.put(strArr[i2], Boolean.valueOf(false));
                if (!fragment.shouldShowRequestPermissionRationale(strArr[i2])) {
                    arrayList.add(strArr[i2]);
                }
            }
        }
        C13524c cVar = this.f35065b;
        if (cVar != null) {
            cVar.mo38901a(hashMap, arrayList);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38899a(Fragment fragment, List<MediaIntent> list, C13525d dVar) {
        Context context = fragment.getContext();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m35823b(context));
        arrayList.addAll(m35814a(list));
        if (m35820a(context) && arrayList.isEmpty()) {
            dVar.mo38754a(m35813a(context, list));
        } else if (m35820a(context) || !arrayList.isEmpty()) {
            m35817a(fragment, (List<String>) arrayList, (C13524c) new C13522a(context, list, dVar));
        } else {
            dVar.mo38753a();
        }
    }

    /* renamed from: a */
    private void m35817a(Fragment fragment, List<String> list, C13524c cVar) {
        m35818a((C13524c) new C13523b(cVar));
        fragment.requestPermissions((String[]) list.toArray(new String[list.size()]), 9842);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public List<MediaIntent> m35813a(Context context, List<MediaIntent> list) {
        ArrayList arrayList = new ArrayList();
        for (MediaIntent mediaIntent : list) {
            if (mediaIntent.mo38830d()) {
                if (TextUtils.isEmpty(mediaIntent.mo38828b())) {
                    arrayList.add(mediaIntent);
                } else if (m35821a(context, mediaIntent.mo38828b())) {
                    arrayList.add(mediaIntent);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<String> m35814a(List<MediaIntent> list) {
        ArrayList arrayList = new ArrayList();
        for (MediaIntent mediaIntent : list) {
            if (!TextUtils.isEmpty(mediaIntent.mo38828b()) && !this.f35064a.mo38903b(mediaIntent.mo38828b()) && mediaIntent.mo38830d()) {
                arrayList.add(mediaIntent.mo38828b());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m35820a(Context context) {
        boolean z = VERSION.SDK_INT < 19;
        boolean a = m35821a(context, "android.permission.READ_EXTERNAL_STORAGE");
        if (z || a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m35821a(Context context, String str) {
        return C13527n.m35834b(context, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m35818a(C13524c cVar) {
        this.f35065b = cVar;
    }
}
