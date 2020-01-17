package app.zenly.locator.privacy.view;

import android.widget.TextView;
import app.zenly.locator.privacy.view.PaddedGridView.SelectionListener;

/* renamed from: app.zenly.locator.privacy.view.a */
/* compiled from: lambda */
public final /* synthetic */ class C5108a implements SelectionListener {

    /* renamed from: a */
    private final /* synthetic */ ContactsCategorizationView f13247a;

    /* renamed from: b */
    private final /* synthetic */ TextView f13248b;

    public /* synthetic */ C5108a(ContactsCategorizationView contactsCategorizationView, TextView textView) {
        this.f13247a = contactsCategorizationView;
        this.f13248b = textView;
    }

    public final void onItemCheckedStateChanged(PaddedGridView paddedGridView, int i, boolean z) {
        this.f13247a.mo12352a(this.f13248b, paddedGridView, i, z);
    }
}
