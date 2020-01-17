package com.bluelinelabs.conductor.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.C8809a;
import com.bluelinelabs.conductor.C8831g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LifecycleHandler extends Fragment implements ActivityLifecycleCallbacks {

    /* renamed from: n */
    private static final Map<Activity, LifecycleHandler> f22949n = new HashMap();

    /* renamed from: e */
    private Activity f22950e;

    /* renamed from: f */
    private boolean f22951f;

    /* renamed from: g */
    private boolean f22952g;

    /* renamed from: h */
    private boolean f22953h;

    /* renamed from: i */
    private boolean f22954i;

    /* renamed from: j */
    private SparseArray<String> f22955j = new SparseArray<>();

    /* renamed from: k */
    private SparseArray<String> f22956k = new SparseArray<>();

    /* renamed from: l */
    private ArrayList<PendingPermissionRequest> f22957l = new ArrayList<>();

    /* renamed from: m */
    private final Map<Integer, C8809a> f22958m = new HashMap();

    private static class PendingPermissionRequest implements Parcelable {
        public static final Creator<PendingPermissionRequest> CREATOR = new C8840a();

        /* renamed from: e */
        final String f22959e;

        /* renamed from: f */
        final String[] f22960f;

        /* renamed from: g */
        final int f22961g;

        /* renamed from: com.bluelinelabs.conductor.internal.LifecycleHandler$PendingPermissionRequest$a */
        static class C8840a implements Creator<PendingPermissionRequest> {
            C8840a() {
            }

            public PendingPermissionRequest createFromParcel(Parcel parcel) {
                return new PendingPermissionRequest(parcel);
            }

            public PendingPermissionRequest[] newArray(int i) {
                return new PendingPermissionRequest[i];
            }
        }

        PendingPermissionRequest(String str, String[] strArr, int i) {
            this.f22959e = str;
            this.f22960f = strArr;
            this.f22961g = i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f22959e);
            parcel.writeStringArray(this.f22960f);
            parcel.writeInt(this.f22961g);
        }

        PendingPermissionRequest(Parcel parcel) {
            this.f22959e = parcel.readString();
            this.f22960f = parcel.createStringArray();
            this.f22961g = parcel.readInt();
        }
    }

    public LifecycleHandler() {
        setRetainInstance(true);
        setHasOptionsMenu(true);
    }

    /* renamed from: a */
    private static LifecycleHandler m21077a(Activity activity) {
        LifecycleHandler lifecycleHandler = (LifecycleHandler) f22949n.get(activity);
        if (lifecycleHandler == null) {
            lifecycleHandler = (LifecycleHandler) activity.getFragmentManager().findFragmentByTag("LifecycleHandler");
        }
        if (lifecycleHandler != null) {
            lifecycleHandler.m21080c(activity);
        }
        return lifecycleHandler;
    }

    /* renamed from: b */
    public static LifecycleHandler m21078b(Activity activity) {
        LifecycleHandler a = m21077a(activity);
        if (a == null) {
            a = new LifecycleHandler();
            activity.getFragmentManager().beginTransaction().add(a, "LifecycleHandler").commit();
        }
        a.m21080c(activity);
        return a;
    }

    /* renamed from: c */
    private void m21080c(Activity activity) {
        this.f22950e = activity;
        if (!this.f22951f) {
            this.f22951f = true;
            activity.getApplication().registerActivityLifecycleCallbacks(this);
            f22949n.put(activity, this);
        }
    }

    /* renamed from: d */
    private void m21081d() {
        if (!this.f22954i) {
            this.f22954i = true;
            for (C8831g q : mo24038b()) {
                q.mo24017q();
            }
        }
    }

    /* renamed from: e */
    private void m21082e() {
        if (!this.f22953h) {
            this.f22953h = true;
            for (int size = this.f22957l.size() - 1; size >= 0; size--) {
                PendingPermissionRequest pendingPermissionRequest = (PendingPermissionRequest) this.f22957l.remove(size);
                mo24037a(pendingPermissionRequest.f22959e, pendingPermissionRequest.f22960f, pendingPermissionRequest.f22961g);
            }
        }
        Iterator it = new ArrayList(this.f22958m.values()).iterator();
        while (it.hasNext()) {
            ((C8809a) it.next()).mo23872l();
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f22950e == null && m21077a(activity) == this) {
            this.f22950e = activity;
            Iterator it = new ArrayList(this.f22958m.values()).iterator();
            while (it.hasNext()) {
                ((C8809a) it.next()).mo23872l();
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        f22949n.remove(activity);
    }

    public void onActivityPaused(Activity activity) {
        if (this.f22950e == activity) {
            for (C8831g b : mo24038b()) {
                b.mo24001b(activity);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        String str = (String) this.f22956k.get(i);
        if (str != null) {
            for (C8831g a : mo24038b()) {
                a.mo23993a(str, i, i2, intent);
            }
        }
    }

    public void onActivityResumed(Activity activity) {
        if (this.f22950e == activity) {
            for (C8831g c : mo24038b()) {
                c.mo24004c(activity);
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (this.f22950e == activity) {
            m21081d();
            for (C8831g gVar : mo24038b()) {
                Bundle bundle2 = new Bundle();
                gVar.mo23866b(bundle2);
                StringBuilder sb = new StringBuilder();
                sb.append("LifecycleHandler.routerState");
                sb.append(gVar.mo24006d());
                bundle.putBundle(sb.toString(), bundle2);
            }
        }
    }

    public void onActivityStarted(Activity activity) {
        if (this.f22950e == activity) {
            this.f22954i = false;
            for (C8831g d : mo24038b()) {
                d.mo24007d(activity);
            }
        }
    }

    public void onActivityStopped(Activity activity) {
        if (this.f22950e == activity) {
            m21081d();
            for (C8831g e : mo24038b()) {
                e.mo24010e(activity);
            }
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f22952g = false;
        m21082e();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            StringSparseArrayParceler stringSparseArrayParceler = (StringSparseArrayParceler) bundle.getParcelable("LifecycleHandler.permissionRequests");
            this.f22955j = stringSparseArrayParceler != null ? stringSparseArrayParceler.mo24062a() : new SparseArray<>();
            StringSparseArrayParceler stringSparseArrayParceler2 = (StringSparseArrayParceler) bundle.getParcelable("LifecycleHandler.activityRequests");
            this.f22956k = stringSparseArrayParceler2 != null ? stringSparseArrayParceler2.mo24062a() : new SparseArray<>();
            ArrayList<PendingPermissionRequest> parcelableArrayList = bundle.getParcelableArrayList("LifecycleHandler.pendingPermissionRequests");
            if (parcelableArrayList == null) {
                parcelableArrayList = new ArrayList<>();
            }
            this.f22957l = parcelableArrayList;
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        for (C8831g a : mo24038b()) {
            a.mo23989a(menu, menuInflater);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Activity activity = this.f22950e;
        if (activity != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
            f22949n.remove(this.f22950e);
            m21079c();
            this.f22950e = null;
        }
    }

    public void onDetach() {
        super.onDetach();
        this.f22953h = false;
        m21079c();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        for (C8831g a : mo24038b()) {
            if (a.mo23995a(menuItem)) {
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        for (C8831g a : mo24038b()) {
            a.mo23988a(menu);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        String str = (String) this.f22955j.get(i);
        if (str != null) {
            for (C8831g a : mo24038b()) {
                a.mo23994a(str, i, strArr, iArr);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("LifecycleHandler.permissionRequests", new StringSparseArrayParceler(this.f22955j));
        bundle.putParcelable("LifecycleHandler.activityRequests", new StringSparseArrayParceler(this.f22956k));
        bundle.putParcelableArrayList("LifecycleHandler.pendingPermissionRequests", this.f22957l);
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        for (C8831g b : mo24038b()) {
            Boolean b2 = b.mo23999b(str);
            if (b2 != null) {
                return b2.booleanValue();
            }
        }
        return super.shouldShowRequestPermissionRationale(str);
    }

    /* renamed from: a */
    public C8831g mo24032a(ViewGroup viewGroup, Bundle bundle) {
        C8809a aVar = (C8809a) this.f22958m.get(Integer.valueOf(m21076a(viewGroup)));
        if (aVar == null) {
            aVar = new C8809a();
            aVar.mo23861a(this, viewGroup);
            if (bundle != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("LifecycleHandler.routerState");
                sb.append(aVar.mo24006d());
                Bundle bundle2 = bundle.getBundle(sb.toString());
                if (bundle2 != null) {
                    aVar.mo23860a(bundle2);
                }
            }
            this.f22958m.put(Integer.valueOf(m21076a(viewGroup)), aVar);
        } else {
            aVar.mo23861a(this, viewGroup);
        }
        return aVar;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f22952g = false;
        m21082e();
    }

    /* renamed from: b */
    public List<C8831g> mo24038b() {
        return new ArrayList(this.f22958m.values());
    }

    /* renamed from: c */
    private void m21079c() {
        if (!this.f22952g) {
            this.f22952g = true;
            if (this.f22950e != null) {
                for (C8831g a : mo24038b()) {
                    a.mo23858a(this.f22950e);
                }
            }
        }
    }

    /* renamed from: a */
    public Activity mo24031a() {
        return this.f22950e;
    }

    /* renamed from: a */
    private static int m21076a(ViewGroup viewGroup) {
        return viewGroup.getId();
    }

    /* renamed from: a */
    public void mo24034a(String str, int i) {
        this.f22956k.put(i, str);
    }

    /* renamed from: a */
    public void mo24033a(String str) {
        for (int size = this.f22956k.size() - 1; size >= 0; size--) {
            SparseArray<String> sparseArray = this.f22956k;
            if (str.equals(sparseArray.get(sparseArray.keyAt(size)))) {
                this.f22956k.removeAt(size);
            }
        }
    }

    /* renamed from: a */
    public void mo24035a(String str, Intent intent, int i) {
        mo24034a(str, i);
        startActivityForResult(intent, i);
    }

    /* renamed from: a */
    public void mo24036a(String str, Intent intent, int i, Bundle bundle) {
        mo24034a(str, i);
        startActivityForResult(intent, i, bundle);
    }

    @TargetApi(23)
    /* renamed from: a */
    public void mo24037a(String str, String[] strArr, int i) {
        if (this.f22953h) {
            this.f22955j.put(i, str);
            requestPermissions(strArr, i);
            return;
        }
        this.f22957l.add(new PendingPermissionRequest(str, strArr, i));
    }
}
