package app.zenly.locator.support.model;

import android.view.View;
import android.widget.TextView;
import app.zenly.locator.R;
import app.zenly.locator.support.C5724n0.C5730c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.support.model.g */
public final class C5710g implements HelpCenterModel {

    /* renamed from: a */
    private final C5730c f14513a;

    /* renamed from: app.zenly.locator.support.model.g$a */
    public static final class C5711a extends C5714i<C5710g> {
        public C5711a(View view, Consumer<C5710g> consumer) {
            C12932j.m33818b(view, "view");
            C12932j.m33818b(consumer, "action");
            super(view, consumer);
        }

        /* renamed from: a */
        public void mo13376a(C5710g gVar) {
            int i;
            C12932j.m33818b(gVar, "model");
            super.mo13380a(gVar);
            View view = this.itemView;
            if (view != null) {
                TextView textView = (TextView) view;
                int i2 = C5709f.f14512a[gVar.mo13375a().ordinal()];
                if (i2 == 1) {
                    i = R.string.support_helpcenter_troubleshooting_create_ticket;
                } else if (i2 == 2) {
                    i = R.string.support_survey_keepGoing;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                textView.setText(i);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    public C5710g(C5730c cVar) {
        C12932j.m33818b(cVar, "category");
        this.f14513a = cVar;
    }

    /* renamed from: a */
    public final C5730c mo13375a() {
        return this.f14513a;
    }
}
