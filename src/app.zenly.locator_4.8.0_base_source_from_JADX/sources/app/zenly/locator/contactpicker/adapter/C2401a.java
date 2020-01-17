package app.zenly.locator.contactpicker.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import app.zenly.locator.contactpicker.adapter.p061m.C2418a;
import app.zenly.locator.p135r.p137b1.C5139b;

/* renamed from: app.zenly.locator.contactpicker.adapter.a */
/* compiled from: lambda */
public final /* synthetic */ class C2401a implements OnClickListener {

    /* renamed from: e */
    private final /* synthetic */ ContactAdapter f7221e;

    /* renamed from: f */
    private final /* synthetic */ C2418a f7222f;

    /* renamed from: g */
    private final /* synthetic */ C5139b f7223g;

    public /* synthetic */ C2401a(ContactAdapter contactAdapter, C2418a aVar, C5139b bVar) {
        this.f7221e = contactAdapter;
        this.f7222f = aVar;
        this.f7223g = bVar;
    }

    public final void onClick(View view) {
        this.f7221e.mo8339b(this.f7222f, this.f7223g, view);
    }
}
