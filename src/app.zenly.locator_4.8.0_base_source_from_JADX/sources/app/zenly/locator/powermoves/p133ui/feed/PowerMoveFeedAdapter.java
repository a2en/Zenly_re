package app.zenly.locator.powermoves.p133ui.feed;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0540a;
import androidx.recyclerview.widget.C1112g;
import androidx.recyclerview.widget.C1112g.C1114b;
import androidx.recyclerview.widget.C1112g.C1115c;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p160v.p161b.C5521c;
import app.zenly.locator.p143s.p162w.p165e.C5577a;
import app.zenly.locator.p143s.p162w.p165e.C5577a.C5583b;
import app.zenly.locator.p143s.p162w.p165e.C5577a.C5584c.C5586b;
import app.zenly.locator.powermoves.p127b.C4984a;
import app.zenly.locator.powermoves.p127b.C4984a.C4985a;
import app.zenly.locator.powermoves.p127b.C4987b;
import com.bumptech.glide.C8865i;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlinx.android.extensions.LayoutContainer;

/* renamed from: app.zenly.locator.powermoves.ui.feed.PowerMoveFeedAdapter */
public final class PowerMoveFeedAdapter extends C1069g<C5023b> {

    /* renamed from: a */
    private final List<C4984a> f13064a = new ArrayList();

    /* renamed from: b */
    private final ItemClickListener f13065b;

    /* renamed from: app.zenly.locator.powermoves.ui.feed.PowerMoveFeedAdapter$ItemClickListener */
    public interface ItemClickListener {
        void onItemClick(C4984a aVar);
    }

    /* renamed from: app.zenly.locator.powermoves.ui.feed.PowerMoveFeedAdapter$a */
    public static final class C5022a extends C1114b {

        /* renamed from: a */
        private final List<C4984a> f13066a;

        /* renamed from: b */
        private final List<C4984a> f13067b;

        public C5022a(List<C4984a> list, List<C4984a> list2) {
            C12932j.m33818b(list, "oldPms");
            C12932j.m33818b(list2, "newPms");
            this.f13066a = list;
            this.f13067b = list2;
        }

        public boolean areContentsTheSame(int i, int i2) {
            return ((C4984a) this.f13066a.get(i)).mo12218f() == ((C4984a) this.f13067b.get(i2)).mo12218f();
        }

        public boolean areItemsTheSame(int i, int i2) {
            return C12932j.m33817a((Object) ((C4984a) this.f13066a.get(i)).mo12216e(), (Object) ((C4984a) this.f13067b.get(i2)).mo12216e());
        }

        public int getNewListSize() {
            return this.f13067b.size();
        }

        public int getOldListSize() {
            return this.f13066a.size();
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.feed.PowerMoveFeedAdapter$b */
    public static final class C5023b extends C1085v implements LayoutContainer {

        /* renamed from: a */
        private C5577a f13068a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Function0<C12956q> f13069b = new C5024a(this);

        /* renamed from: c */
        private final View f13070c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final ItemClickListener f13071d;

        /* renamed from: e */
        private HashMap f13072e;

        /* renamed from: app.zenly.locator.powermoves.ui.feed.PowerMoveFeedAdapter$b$a */
        static final class C5024a extends C12933k implements Function0<C12956q> {

            /* renamed from: f */
            final /* synthetic */ C5023b f13073f;

            C5024a(C5023b bVar) {
                this.f13073f = bVar;
                super(0);
            }

            public final void invoke() {
                TextureView textureView = (TextureView) this.f13073f.mo12273a(C3891l.feed_video);
                if (textureView != null) {
                    textureView.setAlpha(1.0f);
                }
                ImageView imageView = (ImageView) this.f13073f.mo12273a(C3891l.feed_thumbnail);
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
            }
        }

        /* renamed from: app.zenly.locator.powermoves.ui.feed.PowerMoveFeedAdapter$b$b */
        static final class C5025b implements OnPreparedListener {

            /* renamed from: a */
            final /* synthetic */ C5023b f13074a;

            /* renamed from: app.zenly.locator.powermoves.ui.feed.PowerMoveFeedAdapter$b$b$a */
            public static final class C5026a implements Runnable {

                /* renamed from: e */
                final /* synthetic */ Function0 f13075e;

                public C5026a(Function0 function0) {
                    this.f13075e = function0;
                }

                public final void run() {
                    this.f13075e.invoke();
                }
            }

            C5025b(C5023b bVar) {
                this.f13074a = bVar;
            }

            public final void onPrepared(MediaPlayer mediaPlayer) {
                TextureView textureView = (TextureView) this.f13074a.mo12273a(C3891l.feed_video);
                C12932j.m33815a((Object) textureView, "feed_video");
                textureView.postDelayed(new C5026a(this.f13074a.f13069b), 500);
            }
        }

        /* renamed from: app.zenly.locator.powermoves.ui.feed.PowerMoveFeedAdapter$b$c */
        static final class C5027c implements OnClickListener {

            /* renamed from: e */
            final /* synthetic */ C5023b f13076e;

            /* renamed from: f */
            final /* synthetic */ C4984a f13077f;

            C5027c(C5023b bVar, C4984a aVar) {
                this.f13076e = bVar;
                this.f13077f = aVar;
            }

            public final void onClick(View view) {
                this.f13076e.f13071d.onItemClick(this.f13077f);
            }
        }

        public C5023b(View view, ItemClickListener itemClickListener) {
            C12932j.m33818b(view, "containerView");
            C12932j.m33818b(itemClickListener, "listener");
            super(view);
            this.f13070c = view;
            this.f13071d = itemClickListener;
            ConstraintLayout constraintLayout = (ConstraintLayout) mo12273a(C3891l.feed_item);
            C12932j.m33815a((Object) constraintLayout, "feed_item");
            constraintLayout.setClipToOutline(true);
        }

        /* renamed from: a */
        public View mo12273a(int i) {
            if (this.f13072e == null) {
                this.f13072e = new HashMap();
            }
            View view = (View) this.f13072e.get(Integer.valueOf(i));
            if (view == null) {
                View containerView = getContainerView();
                if (containerView == null) {
                    return null;
                }
                view = containerView.findViewById(i);
                this.f13072e.put(Integer.valueOf(i), view);
            }
            return view;
        }

        public View getContainerView() {
            return this.f13070c;
        }

        /* renamed from: a */
        public final void mo12275a(C4984a aVar) {
            C12932j.m33818b(aVar, "powerMove");
            ((TextView) mo12273a(C3891l.feed_title)).setText(aVar.mo12219g());
            ((TextView) mo12273a(C3891l.feed_duration)).setText(C5521c.m15668a(TimeUnit.SECONDS.toMillis((long) aVar.mo12215d()), false));
            String str = "feed_unread_marker";
            if (aVar.mo12218f() == C4985a.READ) {
                mo12273a(C3891l.feed_unread_overlay).setBackgroundResource(R.drawable.gradient_blue_black);
                View a = mo12273a(C3891l.feed_unread_marker);
                C12932j.m33815a((Object) a, str);
                a.setVisibility(8);
            } else {
                View a2 = mo12273a(C3891l.feed_unread_overlay);
                View a3 = mo12273a(C3891l.feed_unread_overlay);
                C12932j.m33815a((Object) a3, "feed_unread_overlay");
                a2.setBackgroundColor(C0540a.m2536a(a3.getContext(), (int) R.color.blue_black_o70));
                View a4 = mo12273a(C3891l.feed_unread_marker);
                C12932j.m33815a((Object) a4, str);
                a4.setVisibility(0);
            }
            C4987b b = aVar.mo12212b();
            ImageView imageView = (ImageView) mo12273a(C3891l.feed_thumbnail);
            C12932j.m33815a((Object) imageView, "feed_thumbnail");
            imageView.setVisibility(0);
            ((C8865i) Glide.m21130a(getContainerView()).mo8545a(b.mo12231d()).mo8537b()).mo24173a((ImageView) mo12273a(C3891l.feed_thumbnail));
            TextureView textureView = (TextureView) mo12273a(C3891l.feed_video);
            String str2 = "feed_video";
            C12932j.m33815a((Object) textureView, str2);
            textureView.setAlpha(0.0f);
            C5577a aVar2 = this.f13068a;
            if (aVar2 != null) {
                aVar2.mo13190a();
            }
            TextureView textureView2 = (TextureView) mo12273a(C3891l.feed_video);
            C12932j.m33815a((Object) textureView2, str2);
            Uri b2 = b.mo12229b();
            C12932j.m33815a((Object) b2, "video.preview");
            C5577a aVar3 = new C5577a(textureView2, new C5586b(b2), true, C5583b.CROP);
            aVar3.mo13192a((OnPreparedListener) new C5025b(this));
            this.f13068a = aVar3;
            getContainerView().setOnClickListener(new C5027c(this, aVar));
        }

        /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0<kotlin.q>, kotlin.jvm.functions.Function0] */
        /* JADX WARNING: type inference failed for: r1v2 */
        /* JADX WARNING: type inference failed for: r2v0, types: [app.zenly.locator.powermoves.ui.feed.a] */
        /* JADX WARNING: type inference failed for: r1v4 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo12274a() {
            /*
                r3 = this;
                app.zenly.locator.s.w.e.a r0 = r3.f13068a
                r1 = 0
                if (r0 == 0) goto L_0x0008
                r0.mo13192a(r1)
            L_0x0008:
                r3.f13068a = r1
                int r0 = app.zenly.locator.C3891l.feed_video
                android.view.View r0 = r3.mo12273a(r0)
                android.view.TextureView r0 = (android.view.TextureView) r0
                kotlin.jvm.functions.Function0<kotlin.q> r1 = r3.f13069b
                if (r1 == 0) goto L_0x001c
                app.zenly.locator.powermoves.ui.feed.a r2 = new app.zenly.locator.powermoves.ui.feed.a
                r2.<init>(r1)
                r1 = r2
            L_0x001c:
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r0.removeCallbacks(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.powermoves.p133ui.feed.PowerMoveFeedAdapter.C5023b.mo12274a():void");
        }
    }

    public PowerMoveFeedAdapter(ItemClickListener itemClickListener) {
        C12932j.m33818b(itemClickListener, "listener");
        this.f13065b = itemClickListener;
    }

    /* renamed from: a */
    public void onBindViewHolder(C5023b bVar, int i) {
        C12932j.m33818b(bVar, "holder");
        bVar.mo12275a((C4984a) this.f13064a.get(i));
    }

    public int getItemCount() {
        return this.f13064a.size();
    }

    /* renamed from: a */
    public void onViewRecycled(C5023b bVar) {
        C12932j.m33818b(bVar, "holder");
        bVar.mo12274a();
        super.onViewRecycled(bVar);
    }

    public C5023b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C12932j.m33818b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_powermove_feed, viewGroup, false);
        C12932j.m33815a((Object) inflate, "view");
        return new C5023b(inflate, this.f13065b);
    }

    /* renamed from: a */
    public final void mo12271a(List<C4984a> list) {
        C12932j.m33818b(list, "pms");
        C1115c a = C1112g.m5467a(new C5022a(this.f13064a, list));
        C12932j.m33815a((Object) a, "DiffUtil.calculateDiff(D…allback(powerMoves, pms))");
        this.f13064a.clear();
        this.f13064a.addAll(list);
        a.mo5697a((C1069g) this);
    }
}
