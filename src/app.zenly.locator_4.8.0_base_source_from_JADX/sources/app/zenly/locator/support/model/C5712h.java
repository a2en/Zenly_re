package app.zenly.locator.support.model;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3242w;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p389io.reactivex.functions.Consumer;
import zendesk.support.Section;

/* renamed from: app.zenly.locator.support.model.h */
public class C5712h implements HelpCenterModel {

    /* renamed from: a */
    private final Section f14514a;

    /* renamed from: app.zenly.locator.support.model.h$a */
    public static final class C5713a extends C5702b<C5712h> {

        /* renamed from: d */
        private final Context f14515d;

        public C5713a(View view, Consumer<C5712h> consumer) {
            C12932j.m33818b(view, "view");
            C12932j.m33818b(consumer, "action");
            super(view, consumer);
            this.f14515d = view.getContext();
        }

        /* renamed from: a */
        public void mo13378a(C5712h hVar) {
            C12932j.m33818b(hVar, "model");
            super.mo13369a(hVar);
            if (hVar instanceof C5708e) {
                TextView textView = this.f14503a;
                Context context = this.f14515d;
                String str = "context";
                C12932j.m33815a((Object) context, str);
                textView.setText(C7709b.m18762a(context, R.string.support_main_subject_places));
                this.f14504b.setVisibility(0);
                TextView textView2 = this.f14504b;
                Context context2 = this.f14515d;
                C12932j.m33815a((Object) context2, str);
                textView2.setText(C7709b.m18762a(context2, R.string.support_report_places_subtitle));
                return;
            }
            TextView textView3 = this.f14503a;
            Section a = hVar.mo13377a();
            if (a != null) {
                textView3.setText(C3242w.m10277a(a.getName()));
                this.f14504b.setVisibility(8);
                return;
            }
            C12932j.m33814a();
            throw null;
        }
    }

    public C5712h() {
        this(null, 1, null);
    }

    public C5712h(Section section) {
        this.f14514a = section;
    }

    /* renamed from: a */
    public final Section mo13377a() {
        return this.f14514a;
    }

    public /* synthetic */ C5712h(Section section, int i, C12928f fVar) {
        if ((i & 1) != 0) {
            section = null;
        }
        this(section);
    }
}
