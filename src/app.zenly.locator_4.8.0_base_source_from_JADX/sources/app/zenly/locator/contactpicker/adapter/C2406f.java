package app.zenly.locator.contactpicker.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import app.zenly.locator.contactpicker.adapter.p061m.C2418a;
import app.zenly.locator.p135r.p137b1.C5139b;

/* renamed from: app.zenly.locator.contactpicker.adapter.f */
/* compiled from: lambda */
public final /* synthetic */ class C2406f implements OnClickListener {

    /* renamed from: e */
    private final /* synthetic */ ContactAdapter f7230e;

    /* renamed from: f */
    private final /* synthetic */ C5139b f7231f;

    /* renamed from: g */
    private final /* synthetic */ C2418a f7232g;

    public /* synthetic */ C2406f(ContactAdapter contactAdapter, C5139b bVar, C2418a aVar) {
        this.f7230e = contactAdapter;
        this.f7231f = bVar;
        this.f7232g = aVar;
    }

    public final void onClick(View view) {
        this.f7230e.mo8334a(this.f7231f, this.f7232g, view);
    }
}
