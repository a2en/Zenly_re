package app.zenly.locator.p017a0.p030q.p033e;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.p017a0.p030q.p031c.C1618a;
import app.zenly.locator.p017a0.p030q.p034f.C1646b;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.a0.q.e.b */
public final class C1638b extends C7717d<C1646b> {

    /* renamed from: e */
    private HashMap f5652e;

    /* renamed from: app.zenly.locator.a0.q.e.b$a */
    static final class C1639a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1638b f5653e;

        C1639a(C1638b bVar) {
            this.f5653e = bVar;
        }

        public final void onClick(View view) {
            this.f5653e.mo34491a().dispatch(C1618a.f5614a);
        }
    }

    /* renamed from: a */
    public View mo7220a(int i) {
        if (this.f5652e == null) {
            this.f5652e = new HashMap();
        }
        View view = (View) this.f5652e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f5652e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo7220a(C3891l.btn_primary_action);
        appCompatTextView.setText(R.string.settings_manageFriends_emptyFriends_button);
        appCompatTextView.setOnClickListener(new C1639a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C1646b bVar, C1646b bVar2) {
        C12932j.m33818b(bVar, "model");
        TextView textView = (TextView) mo7220a(C3891l.explanation_text);
        C12932j.m33815a((Object) textView, "explanation_text");
        Context context = mo34493b().getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        textView.setText(C7709b.m18762a(context, bVar.mo7236f()));
    }
}
