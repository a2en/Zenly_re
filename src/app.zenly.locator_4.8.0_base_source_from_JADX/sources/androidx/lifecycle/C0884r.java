package androidx.lifecycle;

import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.r */
public final class C0884r {

    /* renamed from: a */
    final Map<String, Object> f3494a;

    /* renamed from: b */
    private final SavedStateProvider f3495b;

    /* renamed from: androidx.lifecycle.r$a */
    class C0885a implements SavedStateProvider {
        C0885a() {
        }

        public Bundle saveState() {
            Set<String> keySet = C0884r.this.f3494a.keySet();
            ArrayList arrayList = new ArrayList(keySet.size());
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (String str : keySet) {
                arrayList.add(str);
                arrayList2.add(C0884r.this.f3494a.get(str));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    static {
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        clsArr[4] = Integer.TYPE;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        clsArr[27] = VERSION.SDK_INT >= 21 ? Size.class : Integer.TYPE;
        clsArr[28] = VERSION.SDK_INT >= 21 ? SizeF.class : Integer.TYPE;
    }

    public C0884r(Map<String, Object> map) {
        new HashMap();
        this.f3495b = new C0885a();
        this.f3494a = new HashMap(map);
    }

    /* renamed from: a */
    static C0884r m4081a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new C0884r();
        }
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new C0884r(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
        }
        return new C0884r(hashMap);
    }

    public C0884r() {
        new HashMap();
        this.f3495b = new C0885a();
        this.f3494a = new HashMap();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public SavedStateProvider mo4489a() {
        return this.f3495b;
    }
}
