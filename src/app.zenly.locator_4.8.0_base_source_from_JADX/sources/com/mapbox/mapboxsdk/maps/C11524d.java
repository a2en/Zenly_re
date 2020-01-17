package com.mapbox.mapboxsdk.maps;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import com.mapbox.mapboxsdk.C11445b;
import com.mapbox.mapboxsdk.C11451d;
import com.mapbox.mapboxsdk.C11468j;
import com.mapbox.mapboxsdk.C11469k;
import com.mapbox.mapboxsdk.attribution.C11441a;
import com.mapbox.mapboxsdk.attribution.C11443c.C11444a;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.style.sources.Source;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.mapbox.mapboxsdk.maps.d */
public class C11524d implements OnClickListener, DialogInterface.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Context f29854e;

    /* renamed from: f */
    private final MapboxMap f29855f;

    /* renamed from: g */
    private Set<C11441a> f29856g;

    /* renamed from: h */
    private AlertDialog f29857h;

    /* renamed from: com.mapbox.mapboxsdk.maps.d$a */
    class C11525a implements DialogInterface.OnClickListener {
        C11525a(C11524d dVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            TelemetryDefinition d = C11451d.m29569d();
            if (d != null) {
                d.setUserTelemetryRequestState(true);
            }
            dialogInterface.cancel();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.d$b */
    class C11526b implements DialogInterface.OnClickListener {
        C11526b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C11524d dVar = C11524d.this;
            dVar.m29987a(dVar.f29854e.getResources().getString(C11469k.mapbox_telemetryLink));
            dialogInterface.cancel();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.d$c */
    class C11527c implements DialogInterface.OnClickListener {
        C11527c(C11524d dVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            TelemetryDefinition d = C11451d.m29569d();
            if (d != null) {
                d.setUserTelemetryRequestState(false);
            }
            dialogInterface.cancel();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.d$d */
    private static class C11528d {

        /* renamed from: a */
        private final MapboxMap f29859a;

        /* renamed from: b */
        private final WeakReference<Context> f29860b;

        C11528d(MapboxMap mapboxMap, Context context) {
            this.f29859a = mapboxMap;
            this.f29860b = new WeakReference<>(context);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Set<C11441a> m29994a() {
            Context context = (Context) this.f29860b.get();
            if (context == null) {
                return Collections.emptySet();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f29859a.mo33571h() != null) {
                for (Source source : this.f29859a.mo33571h().mo33759b()) {
                    if (!source.getAttribution().isEmpty()) {
                        arrayList.add(source.getAttribution());
                    }
                }
            }
            C11444a aVar = new C11444a(context);
            aVar.mo33309a(true);
            aVar.mo33312b(true);
            aVar.mo33313c(true);
            aVar.mo33310a((String[]) arrayList.toArray(new String[arrayList.size()]));
            return aVar.mo33311a().mo33307a();
        }
    }

    public C11524d(Context context, MapboxMap mapboxMap) {
        this.f29854e = context;
        this.f29855f = mapboxMap;
    }

    /* renamed from: b */
    private String[] m29990b() {
        ArrayList arrayList = new ArrayList();
        for (C11441a a : this.f29856g) {
            arrayList.add(a.mo33295a());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: c */
    private void m29991c() {
        Builder builder = new Builder(this.f29854e);
        builder.setTitle(C11469k.mapbox_attributionTelemetryTitle);
        builder.setMessage(C11469k.mapbox_attributionTelemetryMessage);
        builder.setPositiveButton(C11469k.mapbox_attributionTelemetryPositive, new C11525a(this));
        builder.setNeutralButton(C11469k.mapbox_attributionTelemetryNeutral, new C11526b());
        builder.setNegativeButton(C11469k.mapbox_attributionTelemetryNegative, new C11527c(this));
        builder.show();
    }

    public void onClick(View view) {
        this.f29856g = new C11528d(this.f29855f, view.getContext()).m29994a();
        Context context = this.f29854e;
        if (!(context instanceof Activity ? ((Activity) context).isFinishing() : false)) {
            mo33803a(m29990b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33803a(String[] strArr) {
        Builder builder = new Builder(this.f29854e);
        builder.setTitle(C11469k.mapbox_attributionsDialogTitle);
        builder.setAdapter(new ArrayAdapter(this.f29854e, C11468j.mapbox_attribution_list_item, strArr), this);
        this.f29857h = builder.show();
    }

    /* renamed from: b */
    private void m29989b(int i) {
        Set<C11441a> set = this.f29856g;
        String c = ((C11441a[]) set.toArray(new C11441a[set.size()]))[i].mo33297c();
        if (c.contains("https://apps.mapbox.com/feedback")) {
            c = m29985a(this.f29855f.mo33541a());
        }
        m29987a(c);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (m29988a(i)) {
            m29991c();
        } else {
            m29989b(i);
        }
    }

    /* renamed from: a */
    public void mo33802a() {
        AlertDialog alertDialog = this.f29857h;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f29857h.dismiss();
        }
    }

    /* renamed from: a */
    private boolean m29988a(int i) {
        return i == m29990b().length - 1;
    }

    /* renamed from: a */
    private String m29985a(CameraPosition cameraPosition) {
        if (cameraPosition == null) {
            return "https://apps.mapbox.com/feedback";
        }
        return String.format(Locale.getDefault(), "https://apps.mapbox.com/feedback/#/%f/%f/%d", new Object[]{Double.valueOf(cameraPosition.target.mo33336b()), Double.valueOf(cameraPosition.target.mo33334a()), Integer.valueOf((int) cameraPosition.zoom)});
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m29987a(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.f29854e.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this.f29854e, C11469k.mapbox_attributionErrorNoBrowser, 1).show();
            C11445b.m29552a((Throwable) e);
        }
    }
}
