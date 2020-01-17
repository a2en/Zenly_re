package app.zenly.locator.contactpicker.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import app.zenly.locator.contactpicker.adapter.p061m.C2418a;
import app.zenly.locator.p135r.p137b1.C5139b;

/* renamed from: app.zenly.locator.contactpicker.adapter.h */
/* compiled from: lambda */
public final /* synthetic */ class C2408h implements OnClickListener {

    /* renamed from: e */
    private final /* synthetic */ ContactAdapter f7235e;

    /* renamed from: f */
    private final /* synthetic */ C2418a f7236f;

    /* renamed from: g */
    private final /* synthetic */ C5139b f7237g;

    public /* synthetic */ C2408h(ContactAdapter contactAdapter, C2418a aVar, C5139b bVar) {
        this.f7235e = contactAdapter;
        this.f7236f = aVar;
        this.f7237g = bVar;
    }

    public final void onClick(View view) {
        this.f7235e.mo8331a(this.f7236f, this.f7237g, view);
    }
}
