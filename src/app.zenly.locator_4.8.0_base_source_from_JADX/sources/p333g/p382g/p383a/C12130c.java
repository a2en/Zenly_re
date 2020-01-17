package p333g.p382g.p383a;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import p389io.reactivex.p406n.C12789c;

/* renamed from: g.g.a.c */
public class C12130c extends Fragment {

    /* renamed from: e */
    private Map<String, C12789c<C12124a>> f31557e = new HashMap();

    /* renamed from: f */
    private boolean f31558f;

    /* access modifiers changed from: 0000 */
    @TargetApi(23)
    /* renamed from: a */
    public void mo35915a(String[] strArr) {
        requestPermissions(strArr, 42);
    }

    /* renamed from: b */
    public C12789c<C12124a> mo35918b(String str) {
        return (C12789c) this.f31557e.get(str);
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(23)
    /* renamed from: c */
    public boolean mo35919c(String str) {
        return getActivity().checkSelfPermission(str) == 0;
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(23)
    /* renamed from: d */
    public boolean mo35920d(String str) {
        return getActivity().getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo35921e(String str) {
        if (this.f31558f) {
            Log.d("RxPermissions", str);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @TargetApi(23)
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 42) {
            boolean[] zArr = new boolean[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                zArr[i2] = shouldShowRequestPermissionRationale(strArr[i2]);
            }
            mo35916a(strArr, iArr, zArr);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35916a(String[] strArr, int[] iArr, boolean[] zArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("onRequestPermissionsResult  ");
            sb.append(strArr[i]);
            mo35921e(sb.toString());
            C12789c cVar = (C12789c) this.f31557e.get(strArr[i]);
            if (cVar == null) {
                Log.e("RxPermissions", "RxPermissions.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                return;
            }
            this.f31557e.remove(strArr[i]);
            cVar.onNext(new C12124a(strArr[i], iArr[i] == 0, zArr[i]));
            cVar.onComplete();
        }
    }

    /* renamed from: a */
    public boolean mo35917a(String str) {
        return this.f31557e.containsKey(str);
    }

    /* renamed from: a */
    public C12789c<C12124a> mo35914a(String str, C12789c<C12124a> cVar) {
        return (C12789c) this.f31557e.put(str, cVar);
    }
}
