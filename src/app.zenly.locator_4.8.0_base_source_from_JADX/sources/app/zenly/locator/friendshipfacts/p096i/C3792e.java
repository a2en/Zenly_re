package app.zenly.locator.friendshipfacts.p096i;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.C0540a;
import androidx.recyclerview.widget.C1120h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import app.zenly.locator.R;
import com.snap.p327ui.recycling.C11719b;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.friendshipfacts.i.e */
public final class C3792e extends C11719b {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        super.mo6953b(view);
        RecyclerView g = mo34490g();
        C12932j.m33815a((Object) g, "backingRecyclerView");
        C1120h hVar = new C1120h(g.getContext(), 0);
        Drawable c = C0540a.m2546c(view.getContext(), R.drawable.spacer_150);
        if (c != null) {
            hVar.mo5702a(c);
            mo34490g().mo5045a((C1074l) hVar);
            return;
        }
        C12932j.m33814a();
        throw null;
    }
}
