package app.zenly.locator.onboarding;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5345b;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.support.model.C5704c;
import app.zenly.locator.support.model.C5704c.C5705a;
import app.zenly.locator.support.p194u0.C5917a;
import com.bluelinelabs.conductor.C8819d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.onboarding.f3 */
public final class C4798f3 extends ZenlyController {

    /* renamed from: P */
    private TextView f12706P;

    /* renamed from: Q */
    private C4800b f12707Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public C5345b f12708R;

    /* renamed from: app.zenly.locator.onboarding.f3$a */
    private enum C4799a {
        OTHER(C5345b.OTHER, R.string.support_deletion_done_reasons_other);
        

        /* renamed from: e */
        private final C5345b f12711e;

        /* renamed from: f */
        private final int f12712f;

        private C4799a(C5345b bVar, int i) {
            this.f12711e = bVar;
            this.f12712f = i;
        }

        /* renamed from: a */
        public final C5345b mo12035a() {
            return this.f12711e;
        }

        /* renamed from: b */
        public final int mo12036b() {
            return this.f12712f;
        }
    }

    /* renamed from: app.zenly.locator.onboarding.f3$b */
    private static final class C4800b extends C1069g<C5705a> {

        /* renamed from: a */
        private final List<C5704c> f12713a;

        /* renamed from: b */
        private final Consumer<C5704c> f12714b;

        public C4800b(List<C5704c> list, Consumer<C5704c> consumer) {
            C12932j.m33818b(list, "models");
            C12932j.m33818b(consumer, "action");
            this.f12713a = list;
            this.f12714b = consumer;
        }

        /* renamed from: a */
        public void onBindViewHolder(C5705a aVar, int i) {
            C12932j.m33818b(aVar, "holder");
            aVar.mo13372a((C5704c) this.f12713a.get(i));
        }

        public int getItemCount() {
            return this.f12713a.size();
        }

        public C5705a onCreateViewHolder(ViewGroup viewGroup, int i) {
            C12932j.m33818b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_support_option_checkable, viewGroup, false);
            C12932j.m33815a((Object) inflate, "view");
            return new C5705a(inflate, this.f12714b);
        }
    }

    /* renamed from: app.zenly.locator.onboarding.f3$c */
    static final class C4801c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ TextView f12715e;

        /* renamed from: f */
        final /* synthetic */ C4798f3 f12716f;

        C4801c(TextView textView, C4798f3 f3Var) {
            this.f12715e = textView;
            this.f12716f = f3Var;
        }

        public final void onClick(View view) {
            C5499a aVar = C5498a.f14119e;
            Context context = this.f12715e.getContext();
            C12932j.m33815a((Object) context, "context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f12716f.m14053B();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.f3$d */
    static final class C4802d extends C12933k implements Function0<C5345b> {

        /* renamed from: f */
        final /* synthetic */ C4798f3 f12717f;

        C4802d(C4798f3 f3Var) {
            this.f12717f = f3Var;
            super(0);
        }

        public final C5345b invoke() {
            return this.f12717f.f12708R;
        }
    }

    /* renamed from: app.zenly.locator.onboarding.f3$e */
    static final class C4803e<T> implements Consumer<C5704c> {

        /* renamed from: e */
        final /* synthetic */ C4798f3 f12718e;

        /* renamed from: f */
        final /* synthetic */ View f12719f;

        C4803e(C4798f3 f3Var, View view) {
            this.f12718e = f3Var;
            this.f12719f = view;
        }

        /* renamed from: a */
        public final void accept(C5704c cVar) {
            C5499a aVar = C5498a.f14119e;
            View view = this.f12719f;
            C12932j.m33815a((Object) view, "view");
            Context context = view.getContext();
            C12932j.m33815a((Object) context, "view.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            C4798f3 f3Var = this.f12718e;
            C12932j.m33815a((Object) cVar, "it");
            f3Var.m14057a(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m14053B() {
        C5343a.m15160U().mo12815a(this.f12708R);
        mo23946k().mo23997a((C8819d) this);
    }

    /* renamed from: C */
    private final void m14054C() {
        TextView textView = this.f12706P;
        String str = "sendButton";
        if (textView == null) {
            C12932j.m33820c(str);
            throw null;
        } else if (!textView.isShown()) {
            TextView textView2 = this.f12706P;
            if (textView2 != null) {
                textView2.setAlpha(0.0f);
                TextView textView3 = this.f12706P;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    TextView textView4 = this.f12706P;
                    if (textView4 != null) {
                        textView4.animate().alpha(1.0f);
                    } else {
                        C12932j.m33820c(str);
                        throw null;
                    }
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_delete_account_reason, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.send);
        TextView textView = (TextView) findViewById;
        textView.setOnClickListener(new C4801c(textView, this));
        C12932j.m33815a((Object) findViewById, "view.findViewById<TextVi…)\n            }\n        }");
        this.f12706P = textView;
        List<C4799a> h = C12840k.m33583h(C4799a.values());
        h.remove(C4799a.OTHER);
        Collections.shuffle(h);
        h.add(C4799a.OTHER);
        ArrayList arrayList = new ArrayList(C12850p.m33647a(h, 10));
        for (C4799a aVar : h) {
            arrayList.add(new C5704c(aVar.mo12035a(), aVar.mo12036b(), new C4802d(this)));
        }
        this.f12707Q = new C4800b(arrayList, new C4803e(this, inflate));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.container);
        recyclerView.mo5045a((C1074l) new C5917a(recyclerView.getResources().getDimensionPixelOffset(R.dimen.spacing_200)));
        recyclerView.setNestedScrollingEnabled(false);
        C4800b bVar = this.f12707Q;
        if (bVar != null) {
            recyclerView.setAdapter(bVar);
            View findViewById2 = inflate.findViewById(R.id.description);
            C12932j.m33815a((Object) findViewById2, "view.findViewById<TextView>(R.id.description)");
            TextView textView2 = (TextView) findViewById2;
            C12932j.m33815a((Object) inflate, "view");
            Context context = inflate.getContext();
            C12932j.m33815a((Object) context, "view.context");
            textView2.setText(C7709b.m18762a(context, R.string.support_deletion_done_subtitle));
            return inflate;
        }
        C12932j.m33820c("reasonsAdapter");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m14057a(C5704c cVar) {
        this.f12708R = cVar.mo13371b();
        C4800b bVar = this.f12707Q;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
            m14054C();
            return;
        }
        C12932j.m33820c("reasonsAdapter");
        throw null;
    }
}
