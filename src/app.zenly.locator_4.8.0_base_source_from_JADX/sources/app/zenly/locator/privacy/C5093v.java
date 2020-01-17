package app.zenly.locator.privacy;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import app.zenly.locator.R;
import app.zenly.locator.privacy.model.C5082d;
import app.zenly.locator.privacy.view.PaddedGridView;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p213co.znly.models.C6980c3.C6981a;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.privacy.v */
public class C5093v {

    /* renamed from: a */
    private final Context f13177a;

    /* renamed from: b */
    private final Map<C5082d, List<Pair<UserProto$User, C6981a>>> f13178b;

    /* renamed from: c */
    private C5082d[] f13179c;

    /* renamed from: d */
    private final int f13180d;

    /* renamed from: e */
    private final DataSetObservable f13181e = new DataSetObservable();

    public C5093v(Context context, int i, Map<C5082d, List<Pair<UserProto$User, C6981a>>> map) {
        this.f13177a = context;
        this.f13180d = i;
        this.f13178b = map;
        this.f13179c = new C5082d[map.keySet().size()];
        for (C5082d dVar : map.keySet()) {
            int ordinal = dVar.ordinal();
            C5082d[] dVarArr = this.f13179c;
            if (ordinal < dVarArr.length) {
                dVarArr[ordinal] = dVar;
            }
        }
    }

    /* renamed from: a */
    public void mo12338a(Map<C5082d, List<Pair<UserProto$User, C6981a>>> map) {
        this.f13179c = new C5082d[map.keySet().size()];
        for (C5082d dVar : map.keySet()) {
            int ordinal = dVar.ordinal();
            C5082d[] dVarArr = this.f13179c;
            if (ordinal < dVarArr.length) {
                dVarArr[ordinal] = dVar;
            }
        }
    }

    /* renamed from: b */
    public void mo12341b(DataSetObserver dataSetObserver) {
        this.f13181e.unregisterObserver(dataSetObserver);
    }

    /* renamed from: b */
    public void mo12340b() {
        this.f13181e.notifyChanged();
    }

    /* renamed from: b */
    public View mo12339b(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f13177a.getSystemService("layout_inflater")).inflate(this.f13180d, null);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.titleIcon);
        C5082d dVar = (C5082d) mo12336a(i).getKey();
        ((TextView) view.findViewById(R.id.title)).setText(dVar.f13159f);
        imageView.setImageResource(dVar.f13158e);
        viewGroup.addView(view, -1, -2);
        return view;
    }

    /* renamed from: a */
    public void mo12337a(DataSetObserver dataSetObserver) {
        this.f13181e.registerObserver(dataSetObserver);
    }

    /* renamed from: a */
    public int mo12333a() {
        return this.f13178b.keySet().size();
    }

    /* renamed from: a */
    public Entry<C5082d, List<Pair<UserProto$User, C6981a>>> mo12336a(int i) {
        for (Entry<C5082d, List<Pair<UserProto$User, C6981a>>> entry : this.f13178b.entrySet()) {
            if (((C5082d) entry.getKey()).ordinal() == i) {
                return entry;
            }
        }
        return null;
    }

    /* renamed from: a */
    public PaddedGridView mo12335a(int i, View view, ViewGroup viewGroup) {
        PaddedGridView paddedGridView = view instanceof PaddedGridView ? (PaddedGridView) view : null;
        if (paddedGridView == null) {
            paddedGridView = new PaddedGridView(this.f13177a);
            paddedGridView.setAdapter(mo12334a((List) this.f13178b.get(this.f13179c[i])));
        }
        viewGroup.addView(paddedGridView, -1, -2);
        return paddedGridView;
    }

    /* renamed from: b */
    public boolean mo12342b(int i) {
        return ((List) mo12336a(i).getValue()).isEmpty();
    }

    /* renamed from: a */
    public BaseAdapter mo12334a(List<Pair<UserProto$User, C6981a>> list) {
        return new C5119x(this.f13177a, list);
    }
}
