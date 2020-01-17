package app.zenly.android.feature.descendants.p011r;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.android.feature.descendants.C1386k;
import app.zenly.android.feature.descendants.Navigation;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.descendants.r.a */
public final class C1401a extends C1085v {

    /* renamed from: a */
    private final TextView f5051a;

    /* renamed from: app.zenly.android.feature.descendants.r.a$a */
    static final class C1402a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ Navigation f5052e;

        /* renamed from: f */
        final /* synthetic */ Activity f5053f;

        C1402a(Navigation navigation, Activity activity) {
            this.f5052e = navigation;
            this.f5053f = activity;
        }

        public final void onClick(View view) {
            this.f5052e.navigateToAddFriends(this.f5053f);
        }
    }

    public C1401a(Activity activity, Navigation navigation, View view) {
        C12932j.m33818b(activity, "activity");
        C12932j.m33818b(navigation, "navigation");
        C12932j.m33818b(view, "root");
        super(view);
        View findViewById = view.findViewById(C1386k.invite);
        C12932j.m33815a((Object) findViewById, "root.findViewById(R.id.invite)");
        this.f5051a = (TextView) findViewById;
        this.f5051a.setOnClickListener(new C1402a(navigation, activity));
    }
}
