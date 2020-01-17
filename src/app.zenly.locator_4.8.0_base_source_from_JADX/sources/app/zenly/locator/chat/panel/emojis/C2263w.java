package app.zenly.locator.chat.panel.emojis;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.C1112g.C1116d;
import androidx.recyclerview.widget.C1132m;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.R;
import app.zenly.locator.chat.C2382x4;
import app.zenly.locator.chat.p059r5.C2306d;
import app.zenly.locator.chat.panel.emojis.gesture.RecyclerViewItemGestureHelper;
import app.zenly.locator.chat.panel.emojis.p057f0.C2238a;
import app.zenly.locator.chat.panel.emojis.p057f0.C2241c;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.C2485i;
import app.zenly.locator.p143s.p151o.p152c.C5470b;
import java.util.ArrayList;
import java.util.List;
import p213co.znly.models.services.C8307u3;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;

/* renamed from: app.zenly.locator.chat.panel.emojis.w */
public class C2263w extends C1132m<C2238a, C1085v> {

    /* renamed from: g */
    private static final Object f6898g = new Object();

    /* renamed from: c */
    private final ZenlySchedulers f6899c = C1351e.m6372a(C2382x4.f7181b.mo19916a("emojiPackAdapter"));

    /* renamed from: d */
    private final C2236e0 f6900d;

    /* renamed from: e */
    private final RecyclerViewItemGestureHelper f6901e;

    /* renamed from: f */
    private float f6902f;

    /* renamed from: app.zenly.locator.chat.panel.emojis.w$a */
    class C2264a extends C1116d<C2238a> {
        C2264a() {
        }

        /* renamed from: a */
        public boolean mo5698a(C2238a aVar, C2238a aVar2) {
            return aVar.equals(aVar2);
        }

        /* renamed from: b */
        public boolean mo5699b(C2238a aVar, C2238a aVar2) {
            return TextUtils.equals(aVar.mo8098c(), aVar2.mo8098c());
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.w$b */
    static class C2265b extends C1085v {

        /* renamed from: a */
        public ImageView f6903a;

        /* renamed from: b */
        public C2485i f6904b;

        C2265b(View view) {
            super(view);
            this.f6903a = (ImageView) view.findViewById(R.id.emoji);
            this.f6904b = C2476d.m8582a(view.getContext());
        }
    }

    C2263w(C2236e0 e0Var, RecyclerViewItemGestureHelper recyclerViewItemGestureHelper, float f) {
        super(new C2264a());
        this.f6900d = e0Var;
        this.f6901e = recyclerViewItemGestureHelper;
        this.f6902f = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8122a(float f) {
        this.f6902f = f;
        notifyItemRangeChanged(0, getItemCount(), f6898g);
    }

    /* renamed from: b */
    public C2238a mo8125b(int i) {
        return (C2238a) mo5739a(i);
    }

    public int getItemViewType(int i) {
        return mo5739a(i) == C2238a.f6847e ? 1 : 0;
    }

    public void onBindViewHolder(C1085v vVar, int i, List<Object> list) {
        if (list.contains(f6898g)) {
            m8125a((C2265b) vVar, i);
        } else {
            onBindViewHolder(vVar, i);
        }
    }

    public C1085v onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_emoji, viewGroup, false);
        C2265b bVar = new C2265b(inflate);
        if (i == 1) {
            bVar.f6903a.setImageDrawable(C5470b.m15559a(inflate.getContext(), 2131231314, C7678c.m18702a(inflate.getContext(), (int) R.attr.zenlyWidgetColorBackground)));
        } else {
            this.f6901e.mo8110a(inflate);
        }
        return bVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo8124a(C2265b bVar, View view) {
        bVar.f6903a.setImageResource(2131231305);
        this.f6900d.mo8091a();
    }

    public void onBindViewHolder(C1085v vVar, int i) {
        C2265b bVar = (C2265b) vVar;
        m8125a(bVar, i);
        if (vVar.getItemViewType() == 0) {
            C2238a aVar = (C2238a) mo5739a(i);
            if (aVar.mo8099d()) {
                bVar.itemView.setOnClickListener(new C2217a(this, bVar));
                bVar.f6903a.setImageResource(2131231304);
                return;
            }
            C2306d.m8214a(bVar.f6904b, aVar.mo8096a(), bVar.f6903a, this.f6899c.getMainThread());
        }
    }

    /* renamed from: a */
    private void m8125a(C2265b bVar, int i) {
        int i2 = i / 4;
        bVar.f6903a.setTranslationY(((float) (-bVar.itemView.getResources().getDimensionPixelSize(R.dimen.spacing_200))) * (((float) i2) + 0.5f) * this.f6902f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8123a(C2241c cVar) {
        C8307u3[] u3VarArr;
        ArrayList arrayList = new ArrayList();
        if (cVar.f6856a) {
            arrayList.add(C2238a.f6848f);
        }
        for (C8307u3 u3Var : cVar.f6864i) {
            if (arrayList.size() == 12) {
                break;
            }
            String uuid = u3Var.getUuid();
            String utf8 = u3Var.getUtf8();
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.f6862g);
            sb.append(u3Var.getUuid());
            sb.append(cVar.f6863h);
            arrayList.add(new C2238a(uuid, utf8, sb.toString()));
        }
        while (arrayList.size() < 12) {
            arrayList.add(C2238a.f6847e);
        }
        mo5740a((List<T>) arrayList);
    }
}
