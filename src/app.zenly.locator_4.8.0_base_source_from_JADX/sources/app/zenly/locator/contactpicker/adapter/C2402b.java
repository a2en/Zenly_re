package app.zenly.locator.contactpicker.adapter;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import app.zenly.locator.contactpicker.adapter.p061m.C2418a;
import app.zenly.locator.p135r.p137b1.C5139b;

/* renamed from: app.zenly.locator.contactpicker.adapter.b */
/* compiled from: lambda */
public final /* synthetic */ class C2402b implements OnClickListener {

    /* renamed from: e */
    private final /* synthetic */ ContactAdapter f7224e;

    /* renamed from: f */
    private final /* synthetic */ C2418a f7225f;

    /* renamed from: g */
    private final /* synthetic */ C5139b f7226g;

    public /* synthetic */ C2402b(ContactAdapter contactAdapter, C2418a aVar, C5139b bVar) {
        this.f7224e = contactAdapter;
        this.f7225f = aVar;
        this.f7226g = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f7224e.mo8330a(this.f7225f, this.f7226g, dialogInterface, i);
    }
}
