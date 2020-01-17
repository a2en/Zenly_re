package p250f.p251a.p252a.p263b.p275c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.paging.C1026g;
import androidx.recyclerview.widget.C1112g.C1116d;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import java.util.List;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p250f.p251a.p252a.p263b.p275c.p276l.C7762c;
import p250f.p251a.p252a.p263b.p275c.p277m.C7763a;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: f.a.a.b.c.a */
public final class C7724a extends C1026g<C7763a, C7728d> {

    /* renamed from: i */
    private static final C1116d<C7763a> f19347i = new C7725a();

    /* renamed from: c */
    private int f19348c = 100;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C7751k f19349d = new C7751k(this.f19350e);

    /* renamed from: e */
    private final Context f19350e;

    /* renamed from: f */
    private final C7762c f19351f;

    /* renamed from: g */
    private final boolean f19352g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Function1<C7763a, C12956q> f19353h;

    /* renamed from: f.a.a.b.c.a$a */
    public static final class C7725a extends C1116d<C7763a> {
        C7725a() {
        }

        /* renamed from: a */
        public boolean mo5698a(C7763a aVar, C7763a aVar2) {
            C12932j.m33818b(aVar, "oldItem");
            C12932j.m33818b(aVar2, "newItem");
            return C12932j.m33817a((Object) aVar, (Object) aVar2);
        }

        /* renamed from: b */
        public boolean mo5699b(C7763a aVar, C7763a aVar2) {
            C12932j.m33818b(aVar, "oldItem");
            C12932j.m33818b(aVar2, "newItem");
            return aVar.mo19972a() == aVar2.mo19972a();
        }
    }

    /* renamed from: f.a.a.b.c.a$b */
    public static final class C7726b {
        private C7726b() {
        }

        public /* synthetic */ C7726b(C12928f fVar) {
            this();
        }
    }

    /* renamed from: f.a.a.b.c.a$c */
    private static final class C7727c {

        /* renamed from: a */
        public static final C7727c f19354a = new C7727c();

        private C7727c() {
        }
    }

    /* renamed from: f.a.a.b.c.a$d */
    public static final class C7728d extends C1085v {

        /* renamed from: a */
        private Disposable f19355a;

        /* renamed from: b */
        private final ImageView f19356b;

        /* renamed from: c */
        private final TextView f19357c;

        public C7728d(View view) {
            C12932j.m33818b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(C7747g.thumbnail);
            C12932j.m33815a((Object) findViewById, "itemView.findViewById(R.id.thumbnail)");
            this.f19356b = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C7747g.selection_index);
            C12932j.m33815a((Object) findViewById2, "itemView.findViewById(R.id.selection_index)");
            this.f19357c = (TextView) findViewById2;
        }

        /* renamed from: a */
        public final Disposable mo19930a() {
            return this.f19355a;
        }

        /* renamed from: b */
        public final TextView mo19932b() {
            return this.f19357c;
        }

        /* renamed from: c */
        public final ImageView mo19933c() {
            return this.f19356b;
        }

        /* renamed from: a */
        public final void mo19931a(Disposable disposable) {
            this.f19355a = disposable;
        }
    }

    /* renamed from: f.a.a.b.c.a$e */
    static final class C7729e<T> implements Consumer<Drawable> {

        /* renamed from: e */
        final /* synthetic */ C7724a f19358e;

        /* renamed from: f */
        final /* synthetic */ C7728d f19359f;

        /* renamed from: g */
        final /* synthetic */ C7763a f19360g;

        C7729e(C7724a aVar, C7728d dVar, C7763a aVar2) {
            this.f19358e = aVar;
            this.f19359f = dVar;
            this.f19360g = aVar2;
        }

        /* renamed from: a */
        public final void accept(Drawable drawable) {
            View view = this.f19359f.itemView;
            C12932j.m33815a((Object) view, "holder.itemView");
            view.setClickable(!C12932j.m33817a((Object) drawable, (Object) this.f19358e.f19349d.mo19956a()));
            this.f19359f.mo19933c().setImageDrawable(drawable);
            this.f19358e.m18781a(this.f19360g, this.f19359f);
        }
    }

    /* renamed from: f.a.a.b.c.a$f */
    static final class C7730f implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C7724a f19361e;

        /* renamed from: f */
        final /* synthetic */ C7728d f19362f;

        C7730f(C7724a aVar, C7728d dVar) {
            this.f19361e = aVar;
            this.f19362f = dVar;
        }

        public final void onClick(View view) {
            C7763a a = C7724a.m18778a(this.f19361e, this.f19362f.getAdapterPosition());
            if (a != null) {
                C12932j.m33815a((Object) a, "getItem(holder.adapterPo…return@setOnClickListener");
                this.f19361e.f19353h.invoke(a);
            }
        }
    }

    static {
        new C7726b(null);
    }

    public C7724a(Context context, C7762c cVar, boolean z, Function1<? super C7763a, C12956q> function1) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(cVar, "selection");
        C12932j.m33818b(function1, "onItemClick");
        super(f19347i);
        this.f19350e = context;
        this.f19351f = cVar;
        this.f19352g = z;
        this.f19353h = function1;
    }

    /* renamed from: a */
    public static final /* synthetic */ C7763a m18778a(C7724a aVar, int i) {
        return (C7763a) aVar.mo4869a(i);
    }

    /* renamed from: b */
    public final void mo19927b(int i) {
        if (i != this.f19348c) {
            this.f19348c = i;
            notifyDataSetChanged();
        }
    }

    public C7728d onCreateViewHolder(ViewGroup viewGroup, int i) {
        C12932j.m33818b(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f19350e).inflate(C7748h.list_item_media_picker, viewGroup, false);
        C12932j.m33815a((Object) inflate, "LayoutInflater.from(cont…ia_picker, parent, false)");
        C7728d dVar = new C7728d(inflate);
        dVar.itemView.setOnClickListener(new C7730f(this, dVar));
        return dVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(C7728d dVar, int i) {
        C12932j.m33818b(dVar, "holder");
        onBindViewHolder(dVar, i, C12848o.m33640a());
    }

    /* renamed from: b */
    private final void m18783b(C7763a aVar, C7728d dVar) {
        int i = this.f19348c;
        View view = dVar.itemView;
        String str = "holder.itemView";
        C12932j.m33815a((Object) view, str);
        if (i != view.getLayoutParams().height) {
            View view2 = dVar.itemView;
            C12932j.m33815a((Object) view2, str);
            view2.getLayoutParams().height = this.f19348c;
            dVar.itemView.requestLayout();
        }
        Disposable a = dVar.mo19930a();
        if (a != null) {
            a.dispose();
        }
        C7751k kVar = this.f19349d;
        int i2 = this.f19348c;
        dVar.mo19931a(kVar.mo19957a(aVar, new Size(i2, i2)).mo36544b(C12802a.m33490a()).mo36535a(C12295a.m32802a()).mo36551d((Consumer<? super T>) new C7729e<Object>(this, dVar, aVar)));
    }

    /* renamed from: a */
    public void onBindViewHolder(C7728d dVar, int i, List<? extends Object> list) {
        C12932j.m33818b(dVar, "holder");
        C12932j.m33818b(list, "payloads");
        C7763a aVar = (C7763a) mo4869a(i);
        if (aVar != null) {
            C12932j.m33815a((Object) aVar, "getItem(position) ?: return");
            if (list.contains(C7727c.f19354a)) {
                m18781a(aVar, dVar);
            } else {
                m18783b(aVar, dVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo19923a(int i, int i2) {
        notifyItemRangeChanged(i, i2, C7727c.f19354a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18781a(C7763a aVar, C7728d dVar) {
        int a = this.f19351f.mo19965a(aVar);
        if (a < 0 || !this.f19352g) {
            dVar.mo19932b().setVisibility(8);
        } else {
            TextView b = dVar.mo19932b();
            b.setVisibility(0);
            View view = dVar.itemView;
            C12932j.m33815a((Object) view, "holder.itemView");
            Context context = view.getContext();
            C12932j.m33815a((Object) context, "holder.itemView.context");
            b.setText(C7706a.m18754a(context, a + 1, 0, 4, (Object) null));
        }
        dVar.mo19933c().setAlpha(a >= 0 ? 0.5f : 1.0f);
    }

    /* renamed from: a */
    public void onViewRecycled(C7728d dVar) {
        C12932j.m33818b(dVar, "holder");
        Disposable a = dVar.mo19930a();
        if (a != null) {
            a.dispose();
        }
        View view = dVar.itemView;
        C12932j.m33815a((Object) view, "holder.itemView");
        view.setClickable(false);
        dVar.mo19933c().setImageDrawable(null);
        dVar.mo19932b().setVisibility(8);
        dVar.mo19933c().setAlpha(1.0f);
        super.onViewRecycled(dVar);
    }
}
