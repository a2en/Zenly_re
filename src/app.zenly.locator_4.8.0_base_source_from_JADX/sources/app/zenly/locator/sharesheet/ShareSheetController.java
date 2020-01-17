package app.zenly.locator.sharesheet;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.paging.C1018f;
import androidx.paging.C1018f.C1022d;
import androidx.paging.C1018f.C1024f.C1025a;
import androidx.paging.C1026g;
import androidx.recyclerview.widget.C1112g.C1116d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1333c;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout.OnScreenBarLayoutReady;
import app.zenly.android.feature.polenta.widget.SearchBar;
import app.zenly.locator.C4958p;
import app.zenly.locator.R;
import app.zenly.locator.core.app.C2454e;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.helper.C2509b;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.util.C3205g;
import app.zenly.locator.core.widget.C3269g;
import app.zenly.locator.core.widget.CompositeAdapter;
import app.zenly.locator.core.widget.ShowMoreAdapter;
import app.zenly.locator.core.widget.ShowMoreAdapter.ShowMoreCallbacks;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.p017a0.p041t.C1684a;
import app.zenly.locator.p135r.C5192t0;
import app.zenly.locator.p135r.p137b1.C5138a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p160v.p161b.C5541h;
import app.zenly.locator.sharesheet.p167e0.C5617a;
import app.zenly.locator.sharesheet.p167e0.C5621b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p213co.znly.models.C7339i;
import p213co.znly.models.PingProto$Conversation.C6818b;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7052a2;
import p213co.znly.models.core.C7117i;
import p214e.p228e.C7571a;
import p214e.p228e.C7573b;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;
import p389io.reactivex.C12279e;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p390h.p392c.C12295a;

public class ShareSheetController extends ZenlyController {
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public static final Integer f14272x0 = Integer.valueOf(1);
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public static final Integer f14273y0 = Integer.valueOf(2);
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public static final C1116d<C5138a> f14274z0 = new C5591c();

    /* renamed from: P */
    private final Set<String> f14275P = new C7573b();

    /* renamed from: Q */
    private final Map<String, C7117i> f14276Q = new C7571a();

    /* renamed from: R */
    private final Set<Object> f14277R = new C7573b();

    /* renamed from: S */
    private final ArrayList<C5607q> f14278S = new ArrayList<>();

    /* renamed from: T */
    private final ArrayList<C5599i> f14279T = new ArrayList<>();

    /* renamed from: U */
    private final ArrayList<SocialNetworkSelectable> f14280U = new ArrayList<>();

    /* renamed from: V */
    private final C12275b f14281V = new C12275b();

    /* renamed from: W */
    private final C12275b f14282W = new C12275b();

    /* renamed from: X */
    private final List<String> f14283X;

    /* renamed from: Y */
    private final List<String> f14284Y;

    /* renamed from: Z */
    private final int f14285Z;

    /* renamed from: a0 */
    private final boolean f14286a0;

    /* renamed from: b0 */
    private final boolean f14287b0;

    /* renamed from: c0 */
    private final boolean f14288c0;

    /* renamed from: d0 */
    private C12279e<CharSequence> f14289d0;

    /* renamed from: e0 */
    private ScreenBarLayout f14290e0;

    /* renamed from: f0 */
    private SearchBar f14291f0;

    /* renamed from: g0 */
    private RecyclerView f14292g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public RecyclerView f14293h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public AvatarLoader f14294i0;

    /* renamed from: j0 */
    private CompositeAdapter f14295j0;

    /* renamed from: k0 */
    private CompositeAdapter f14296k0;

    /* renamed from: l0 */
    private C5602l f14297l0;

    /* renamed from: m0 */
    private C5592d f14298m0;

    /* renamed from: n0 */
    private C5598h f14299n0;

    /* renamed from: o0 */
    private C5606p f14300o0;

    /* renamed from: p0 */
    private C5606p f14301p0;

    /* renamed from: q0 */
    private C5596f f14302q0;

    /* renamed from: r0 */
    private C5597g f14303r0;

    /* renamed from: s0 */
    private TextView f14304s0;

    /* renamed from: t0 */
    private OnTargetSelectedListener f14305t0;

    /* renamed from: u0 */
    private OnContactSelectedListener f14306u0;

    /* renamed from: v0 */
    private boolean f14307v0;

    /* renamed from: w0 */
    private FriendStore f14308w0;

    public interface OnContactSelectedListener {
        void onContactSelected(C5138a aVar);
    }

    public interface OnTargetSelectedListener {
        void onTargetSelected(String[] strArr);
    }

    public interface SocialNetworkSelectable {
        void setSocialNetworkSelected(Object obj, boolean z);
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$a */
    class C5589a extends C2509b {
        C5589a() {
        }

        /* renamed from: a */
        public void mo7322a(View view) {
            C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            ShareSheetController.this.m15812G();
        }
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$b */
    class C5590b implements OnScreenBarLayoutReady {
        C5590b() {
        }

        public void onReady() {
            ShareSheetController.this.m15813H();
        }
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$c */
    static class C5591c extends C1116d<C5138a> {
        C5591c() {
        }

        /* renamed from: a */
        public boolean mo5698a(C5138a aVar, C5138a aVar2) {
            return TextUtils.equals(aVar.f13317a, aVar2.f13317a);
        }

        /* renamed from: b */
        public boolean mo5699b(C5138a aVar, C5138a aVar2) {
            String str = aVar.f13319c;
            if (str != null) {
                return str.equals(aVar2.f13319c);
            }
            String str2 = aVar.f13318b;
            if (str2 != null) {
                return str2.equals(aVar2.f13318b);
            }
            return false;
        }
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$d */
    private class C5592d extends C1069g<C5594b> implements C5607q {

        /* renamed from: e */
        private final C5593a f14311e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final List<C2936a0> f14312f;

        /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$d$a */
        private class C5593a extends C1069g<C5603m> implements C5607q {
            private C5593a() {
            }

            /* renamed from: a */
            public void onBindViewHolder(C5603m mVar, int i) {
                C2936a0 a0Var = (C2936a0) C5592d.this.f14312f.get(i);
                mVar.f14337b.setChecked(ShareSheetController.this.m15846e(a0Var.mo9074a().getUuid()));
                mVar.itemView.setOnClickListener(new C5616e(this, mVar));
                mVar.f14338c = a0Var.mo9074a();
                ShareSheetController.this.f14294i0.load(C2884f.m9355a(a0Var.mo9074a())).withPlaceholderStrategy(C1333c.DisplayName).into(mVar.f14336a);
            }

            public int getItemCount() {
                return C5592d.this.f14312f.size();
            }

            /* synthetic */ C5593a(C5592d dVar, C5589a aVar) {
                this();
            }

            public C5603m onCreateViewHolder(ViewGroup viewGroup, int i) {
                return new C5603m(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.selection_with_checkmark, viewGroup, false));
            }

            /* renamed from: a */
            public /* synthetic */ void mo13235a(C5603m mVar, View view) {
                C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
                UserProto$User userProto$User = mVar.f14338c;
                if (userProto$User != null) {
                    ShareSheetController.this.m15827a(userProto$User);
                }
            }

            /* renamed from: a */
            public void onBindViewHolder(C5603m mVar, int i, List<Object> list) {
                if (list.isEmpty()) {
                    onBindViewHolder(mVar, i);
                } else if (list.contains(ShareSheetController.f14272x0)) {
                    mVar.f14337b.setChecked(true);
                } else if (list.contains(ShareSheetController.f14273y0)) {
                    mVar.f14337b.setChecked(false);
                }
            }

            /* renamed from: a */
            public void onViewRecycled(C5603m mVar) {
                mVar.mo13257a();
            }

            /* renamed from: a */
            private int m15871a(List<C2936a0> list, String str) {
                for (int i = 0; i < list.size(); i++) {
                    if (str.equals(((C2936a0) list.get(i)).mo9074a().getUuid())) {
                        return i;
                    }
                }
                return -1;
            }

            /* renamed from: a */
            public void mo13230a(UserProto$User userProto$User, boolean z) {
                int a = m15871a(C5592d.this.f14312f, userProto$User.getUuid());
                if (a != -1) {
                    notifyItemChanged(a, z ? ShareSheetController.f14272x0 : ShareSheetController.f14273y0);
                }
            }
        }

        /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$d$b */
        class C5594b extends C1085v {

            /* renamed from: a */
            final RecyclerView f14315a;

            C5594b(C5592d dVar, View view) {
                super(view);
                this.f14315a = (RecyclerView) view.findViewById(R.id.recycler_view);
                this.f14315a.setHasFixedSize(true);
                this.f14315a.setLayoutManager(new StaggeredGridLayoutManager(4, 1));
            }
        }

        private C5592d() {
            this.f14311e = new C5593a(this, null);
            this.f14312f = new ArrayList();
        }

        /* renamed from: a */
        public void onBindViewHolder(C5594b bVar, int i) {
        }

        public int getItemCount() {
            return this.f14312f.isEmpty() ^ true ? 1 : 0;
        }

        /* renamed from: a */
        public void mo13231a(List<C2936a0> list) {
            this.f14312f.clear();
            this.f14312f.addAll(list.subList(0, Math.min(list.size(), 8)));
            notifyDataSetChanged();
        }

        public C5594b onCreateViewHolder(ViewGroup viewGroup, int i) {
            C5594b bVar = new C5594b(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_share_best_friends, viewGroup, false));
            bVar.f14315a.setAdapter(this.f14311e);
            return bVar;
        }

        /* synthetic */ C5592d(ShareSheetController shareSheetController, C5589a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo13230a(UserProto$User userProto$User, boolean z) {
            this.f14311e.mo13230a(userProto$User, z);
        }
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$e */
    public static class C5595e {

        /* renamed from: a */
        private final C3197d f14316a = new C3197d(new Bundle());

        /* renamed from: a */
        public C5595e mo13237a(ArrayList<String> arrayList) {
            this.f14316a.mo9611a("KEY_EXCLUDED_USERS", arrayList);
            return this;
        }

        /* renamed from: a */
        public C5595e mo13236a(int i) {
            this.f14316a.mo9607a("KEY_ACTION_TITLE", i);
            return this;
        }

        /* renamed from: a */
        public ShareSheetController mo13238a() {
            return new ShareSheetController(this.f14316a.mo9605a());
        }
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$f */
    private class C5596f extends C1069g<C5600j> {

        /* renamed from: a */
        private final ArrayList<C5138a> f14317a;

        private C5596f() {
            this.f14317a = new ArrayList<>();
        }

        /* renamed from: a */
        public void mo13241a(List<C5138a> list) {
            this.f14317a.clear();
            this.f14317a.addAll(list);
            notifyDataSetChanged();
        }

        public int getItemCount() {
            return this.f14317a.size();
        }

        public C5600j onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5600j(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_user_selection, viewGroup, false));
        }

        /* synthetic */ C5596f(ShareSheetController shareSheetController, C5589a aVar) {
            this();
        }

        /* renamed from: a */
        public void onBindViewHolder(C5600j jVar, int i) {
            ShareSheetController.this.m15817a(jVar, (C5138a) this.f14317a.get(i));
        }

        /* renamed from: a */
        public void onViewRecycled(C5600j jVar) {
            jVar.mo13251a();
        }
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$g */
    private class C5597g extends C1026g<C5138a, C5600j> {
        C5597g() {
            super(ShareSheetController.f14274z0);
        }

        /* renamed from: a */
        public void onBindViewHolder(C5600j jVar, int i) {
            C5138a aVar = (C5138a) mo4869a(i);
            if (aVar != null) {
                ShareSheetController.this.m15817a(jVar, aVar);
            } else {
                jVar.mo13251a();
            }
        }

        public C5600j onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5600j(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_user_selection, viewGroup, false));
        }

        /* renamed from: a */
        public void onViewRecycled(C5600j jVar) {
            jVar.mo13251a();
        }
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$h */
    private class C5598h extends C1069g<C5600j> implements C5607q, C5599i, ShowMoreCallbacks {

        /* renamed from: e */
        private final List<C7117i> f14320e;

        /* renamed from: f */
        private int f14321f;

        private C5598h() {
            this.f14320e = new ArrayList();
        }

        /* renamed from: b */
        private void m15891b(C5600j jVar, C7117i iVar) {
            C6818b others = iVar.getOthers(0);
            jVar.f14326d.setText(others.getNickname());
            jVar.f14323a.setVisibility(0);
            ShareSheetController.this.m15816a(jVar.f14323a, iVar.getAvatars(0));
            C3200e0.m10184a((View[]) jVar.f14324b, 8);
            jVar.f14325c.setChecked(ShareSheetController.this.m15846e(others.getUserUuid()));
            jVar.itemView.setOnClickListener(new C5625h(this, jVar));
            jVar.f14328f.add(C5448c.m15478a().userPublicStream(others.getUserUuid()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C5624g<Object>(jVar), (Consumer<? super Throwable>) C5623f.f14368e));
        }

        /* renamed from: a */
        public void onBindViewHolder(C5600j jVar, int i) {
            C7117i a = m15886a(i);
            if (a.getIsGroup()) {
                m15888a(jVar, a);
            } else {
                m15891b(jVar, a);
            }
        }

        public boolean canShowMore() {
            return this.f14321f < this.f14320e.size();
        }

        public int getItemCount() {
            return this.f14321f;
        }

        public void onShowMoreClick() {
            int i = this.f14321f;
            this.f14321f = Math.min(this.f14320e.size(), this.f14321f + 15);
            notifyItemRangeInserted(i, this.f14321f - i);
        }

        public C5600j onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5600j(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_conversation_selection, viewGroup, false));
        }

        /* synthetic */ C5598h(ShareSheetController shareSheetController, C5589a aVar) {
            this();
        }

        /* renamed from: a */
        private void m15888a(C5600j jVar, C7117i iVar) {
            jVar.f14326d.setText(iVar.getName());
            jVar.f14323a.setVisibility(4);
            C3200e0.m10184a((View[]) jVar.f14324b, 0);
            ShareSheetController.this.m15831a(jVar.f14324b, iVar.getAvatarsList());
            jVar.f14325c.setChecked(ShareSheetController.this.m15844d(iVar.getInboxUuid()));
            jVar.itemView.setOnClickListener(new C5626i(this, iVar));
        }

        /* renamed from: a */
        public /* synthetic */ void mo13248a(C7117i iVar, View view) {
            C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            ShareSheetController.this.m15828a(iVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo13247a(C5600j jVar, View view) {
            C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            UserProto$User userProto$User = jVar.f14329g;
            if (userProto$User != null) {
                ShareSheetController.this.m15827a(userProto$User);
            }
        }

        /* renamed from: b */
        private int m15890b(List<C7117i> list, String str) {
            for (int i = 0; i < list.size(); i++) {
                C7117i iVar = (C7117i) list.get(i);
                if (!iVar.getIsGroup() && str.equals(iVar.getOthers(0).getUserUuid())) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: a */
        public void onBindViewHolder(C5600j jVar, int i, List<Object> list) {
            if (list.isEmpty()) {
                onBindViewHolder(jVar, i);
            } else if (list.contains(ShareSheetController.f14272x0)) {
                jVar.f14325c.setChecked(true);
            } else if (list.contains(ShareSheetController.f14273y0)) {
                jVar.f14325c.setChecked(false);
            }
        }

        /* renamed from: a */
        private C7117i m15886a(int i) {
            return (C7117i) this.f14320e.get(i);
        }

        /* renamed from: a */
        public void onViewRecycled(C5600j jVar) {
            jVar.mo13251a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo13250a(List<C7117i> list) {
            this.f14320e.clear();
            this.f14320e.addAll(list);
            this.f14321f = Math.min(15, this.f14320e.size());
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public void mo13230a(UserProto$User userProto$User, boolean z) {
            int b = m15890b(this.f14320e, userProto$User.getUuid());
            if (b != -1) {
                notifyItemChanged(b, z ? ShareSheetController.f14272x0 : ShareSheetController.f14273y0);
            }
        }

        /* renamed from: a */
        private int m15885a(List<C7117i> list, String str) {
            for (int i = 0; i < list.size(); i++) {
                C7117i iVar = (C7117i) list.get(i);
                if (iVar.getIsGroup() && str.equals(iVar.getInboxUuid())) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: a */
        public void mo13249a(C7117i iVar, boolean z) {
            int a = m15885a(this.f14320e, iVar.getInboxUuid());
            if (a != -1) {
                notifyItemChanged(a, z ? ShareSheetController.f14272x0 : ShareSheetController.f14273y0);
            }
        }
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$i */
    private interface C5599i {
        /* renamed from: a */
        void mo13249a(C7117i iVar, boolean z);
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$j */
    private class C5600j extends C1085v {

        /* renamed from: a */
        final ImageView f14323a;

        /* renamed from: b */
        final ImageView[] f14324b = new ImageView[2];

        /* renamed from: c */
        final CheckBox f14325c;

        /* renamed from: d */
        final TextView f14326d;

        /* renamed from: e */
        final TextView f14327e;

        /* renamed from: f */
        final C12275b f14328f;
        /* access modifiers changed from: 0000 */

        /* renamed from: g */
        public UserProto$User f14329g;

        C5600j(View view) {
            super(view);
            this.f14323a = (ImageView) view.findViewById(R.id.avatar);
            this.f14324b[0] = (ImageView) view.findViewById(R.id.group_avatar_1);
            this.f14324b[1] = (ImageView) view.findViewById(R.id.group_avatar_2);
            this.f14326d = (TextView) view.findViewById(R.id.title);
            this.f14327e = (TextView) view.findViewById(R.id.subtitle);
            this.f14327e.setVisibility(8);
            this.f14325c = (CheckBox) view.findViewById(R.id.check_box);
            this.f14328f = new C12275b();
        }

        /* renamed from: a */
        public void mo13251a() {
            ShareSheetController.this.m15815a(this.f14323a);
            ShareSheetController.this.m15830a(this.f14324b);
            this.itemView.setOnClickListener(null);
            this.f14326d.setText(null);
            this.f14327e.setText(null);
            this.f14328f.mo36401a();
            this.f14329g = null;
        }
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$k */
    private static final class C5601k {

        /* renamed from: a */
        final List<UserProto$User> f14331a;

        /* renamed from: b */
        final String f14332b;

        /* synthetic */ C5601k(List list, String str, C5589a aVar) {
            this(list, str);
        }

        private C5601k(List<UserProto$User> list, String str) {
            this.f14331a = list;
            this.f14332b = str;
        }
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$l */
    private class C5602l extends C1069g<C5604n> implements C5607q, C5599i, SocialNetworkSelectable {

        /* renamed from: e */
        private final ArrayList<Object> f14333e = new ArrayList<>();

        /* renamed from: f */
        private final C5605o f14334f = new C5605o(ShareSheetController.this, null);

        C5602l() {
            setHasStableIds(true);
        }

        public int getItemCount() {
            return this.f14333e.size();
        }

        public long getItemId(int i) {
            Object obj = this.f14333e.get(i);
            if (obj instanceof UserProto$User) {
                return this.f14334f.mo13259b(((UserProto$User) obj).getUuid()).longValue();
            } else if (obj instanceof C7117i) {
                return this.f14334f.mo13259b(((C7117i) obj).getInboxUuid()).longValue();
            } else if (C5615d0.m15936b(obj)) {
                return this.f14334f.mo13259b(C5615d0.m15933a(obj)).longValue();
            } else {
                return super.getItemId(i);
            }
        }

        public void setSocialNetworkSelected(Object obj, boolean z) {
            if (z) {
                m15910a(obj);
                ShareSheetController.this.f14293h0.mo5120h(this.f14333e.size() - 1);
                return;
            }
            for (int i = 0; i < this.f14333e.size(); i++) {
                if (obj.equals(this.f14333e.get(i))) {
                    m15902a(i);
                    return;
                }
            }
        }

        public C5604n onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5604n(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.selection_with_image, viewGroup, false));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m15908a(UserProto$User userProto$User) {
            this.f14333e.add(userProto$User);
            this.f14334f.mo13258a(userProto$User.getUuid());
            notifyItemInserted(this.f14333e.size() - 1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m15909a(C7117i iVar) {
            this.f14333e.add(iVar);
            this.f14334f.mo13258a(iVar.getInboxUuid());
            notifyItemInserted(this.f14333e.size() - 1);
        }

        /* renamed from: a */
        private void m15910a(Object obj) {
            this.f14333e.add(obj);
            this.f14334f.mo13258a(C5615d0.m15933a(obj));
            notifyItemInserted(this.f14333e.size() - 1);
        }

        /* renamed from: a */
        private void m15902a(int i) {
            this.f14333e.remove(i);
            notifyItemRemoved(i);
        }

        /* renamed from: a */
        public void onBindViewHolder(C5604n nVar, int i) {
            Object obj = this.f14333e.get(i);
            if (obj instanceof UserProto$User) {
                m15905a(nVar, (UserProto$User) obj);
            } else if (obj instanceof C7117i) {
                m15906a(nVar, (C7117i) obj);
            } else if (C5615d0.m15936b(obj)) {
                m15907a(nVar, obj);
            }
        }

        /* renamed from: a */
        private void m15905a(C5604n nVar, UserProto$User userProto$User) {
            nVar.f14336a.setVisibility(0);
            C3200e0.m10184a((View[]) nVar.f14340e, 8);
            ShareSheetController.this.f14294i0.load(C2884f.m9355a(userProto$User)).withPlaceholderStrategy(C1333c.DisplayName).into(nVar.f14336a);
            nVar.itemView.setOnClickListener(new C5631n(this, userProto$User));
        }

        /* renamed from: a */
        public /* synthetic */ void mo13254a(UserProto$User userProto$User, View view) {
            C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            ShareSheetController.this.m15827a(userProto$User);
        }

        /* renamed from: a */
        private void m15906a(C5604n nVar, C7117i iVar) {
            nVar.f14336a.setVisibility(4);
            C3200e0.m10184a((View[]) nVar.f14340e, 0);
            ShareSheetController.this.m15831a(nVar.f14340e, iVar.getAvatarsList());
            nVar.itemView.setOnClickListener(new C5630m(this, iVar));
        }

        /* renamed from: a */
        public /* synthetic */ void mo13255a(C7117i iVar, View view) {
            C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            ShareSheetController.this.m15828a(iVar);
        }

        /* renamed from: a */
        private void m15907a(C5604n nVar, Object obj) {
            nVar.f14336a.setVisibility(0);
            C3200e0.m10184a((View[]) nVar.f14340e, 8);
            C5615d0.m15934a(nVar.f14336a, obj);
            nVar.itemView.setOnClickListener(new C5632o(this, obj));
        }

        /* renamed from: a */
        public /* synthetic */ void mo13256a(Object obj, View view) {
            C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            ShareSheetController.this.m15836b(obj);
        }

        /* renamed from: a */
        public void onViewRecycled(C5604n nVar) {
            nVar.mo13257a();
        }

        /* renamed from: a */
        public void mo13230a(UserProto$User userProto$User, boolean z) {
            if (z) {
                m15908a(userProto$User);
                ShareSheetController.this.f14293h0.mo5120h(this.f14333e.size() - 1);
                return;
            }
            int i = 0;
            while (i < this.f14333e.size()) {
                Object obj = this.f14333e.get(i);
                if (!(obj instanceof UserProto$User) || !((UserProto$User) obj).getUuid().equals(userProto$User.getUuid())) {
                    i++;
                } else {
                    m15902a(i);
                    return;
                }
            }
        }

        /* renamed from: a */
        public void mo13249a(C7117i iVar, boolean z) {
            if (z) {
                m15909a(iVar);
                ShareSheetController.this.f14293h0.mo5120h(this.f14333e.size() - 1);
                return;
            }
            int i = 0;
            while (i < this.f14333e.size()) {
                Object obj = this.f14333e.get(i);
                if (!(obj instanceof C7117i) || !((C7117i) obj).getInboxUuid().equals(iVar.getInboxUuid())) {
                    i++;
                } else {
                    m15902a(i);
                    return;
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$m */
    private class C5603m extends C1085v {

        /* renamed from: a */
        final ImageView f14336a;

        /* renamed from: b */
        final CheckBox f14337b;

        /* renamed from: c */
        UserProto$User f14338c;

        public C5603m(View view) {
            super(view);
            this.f14336a = (ImageView) view.findViewById(R.id.image);
            this.f14337b = (CheckBox) view.findViewById(R.id.check_box);
        }

        /* renamed from: a */
        public void mo13257a() {
            ShareSheetController.this.m15815a(this.f14336a);
            this.itemView.setOnClickListener(null);
            this.f14338c = null;
        }
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$n */
    private class C5604n extends C5603m {

        /* renamed from: e */
        final ImageView[] f14340e = new ImageView[2];

        public C5604n(View view) {
            super(view);
            this.f14340e[0] = (ImageView) view.findViewById(R.id.group_avatar_1);
            this.f14340e[1] = (ImageView) view.findViewById(R.id.group_avatar_2);
        }

        /* renamed from: a */
        public void mo13257a() {
            super.mo13257a();
            ShareSheetController.this.m15830a(this.f14340e);
        }
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$o */
    private class C5605o {

        /* renamed from: a */
        private final Map<String, Long> f14342a;

        /* renamed from: b */
        private long f14343b;

        private C5605o(ShareSheetController shareSheetController) {
            this.f14342a = new C7571a();
            this.f14343b = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo13258a(String str) {
            if (!this.f14342a.containsKey(str)) {
                this.f14342a.put(str, Long.valueOf(this.f14343b));
                this.f14343b++;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Long mo13259b(String str) {
            return (Long) this.f14342a.get(str);
        }

        /* synthetic */ C5605o(ShareSheetController shareSheetController, C5589a aVar) {
            this(shareSheetController);
        }
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$p */
    private class C5606p extends C1069g<C5600j> implements C5607q {

        /* renamed from: e */
        private final C5541h f14344e = new C5541h();

        /* renamed from: f */
        private final Comparator<UserProto$User> f14345f;

        /* renamed from: g */
        private final List<UserProto$User> f14346g = new ArrayList();

        /* renamed from: h */
        private String f14347h = "";

        C5606p(Context context) {
            this.f14345f = C3205g.m10196e(C7713f.m18776a(context));
        }

        /* renamed from: b */
        private int m15923b(List<UserProto$User> list, String str) {
            for (int i = 0; i < list.size(); i++) {
                if (str.equals(((UserProto$User) list.get(i)).getUuid())) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: a */
        public void onBindViewHolder(C5600j jVar, int i) {
            m15922a(jVar, (UserProto$User) this.f14346g.get(i));
        }

        public int getItemCount() {
            return this.f14346g.size();
        }

        /* renamed from: a */
        public void onBindViewHolder(C5600j jVar, int i, List<Object> list) {
            if (list.isEmpty()) {
                onBindViewHolder(jVar, i);
            } else if (list.contains(ShareSheetController.f14272x0)) {
                jVar.f14325c.setChecked(true);
            } else if (list.contains(ShareSheetController.f14273y0)) {
                jVar.f14325c.setChecked(false);
            }
        }

        public C5600j onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5600j(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_user_selection, viewGroup, false));
        }

        /* renamed from: a */
        private void m15922a(C5600j jVar, UserProto$User userProto$User) {
            ShareSheetController.this.m15816a(jVar.f14323a, userProto$User);
            C3200e0.m10184a((View[]) jVar.f14324b, 8);
            this.f14344e.mo13161a(jVar.f14326d, userProto$User.getName(), this.f14347h);
            jVar.f14325c.setChecked(ShareSheetController.this.m15846e(userProto$User.getUuid()));
            jVar.itemView.setOnClickListener(new C5633p(this, userProto$User));
        }

        /* renamed from: a */
        public /* synthetic */ void mo13263a(UserProto$User userProto$User, View view) {
            C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            ShareSheetController.this.m15827a(userProto$User);
        }

        /* renamed from: a */
        public void onViewRecycled(C5600j jVar) {
            jVar.mo13251a();
        }

        /* renamed from: a */
        public void mo13264a(List<UserProto$User> list) {
            mo13265a(list, "");
        }

        /* renamed from: a */
        public void mo13265a(List<UserProto$User> list, String str) {
            this.f14346g.clear();
            this.f14346g.addAll(list);
            this.f14347h = str;
            Collections.sort(this.f14346g, this.f14345f);
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public void mo13230a(UserProto$User userProto$User, boolean z) {
            int b = m15923b(this.f14346g, userProto$User.getUuid());
            if (b != -1) {
                notifyItemChanged(b, z ? ShareSheetController.f14272x0 : ShareSheetController.f14273y0);
            }
        }
    }

    /* renamed from: app.zenly.locator.sharesheet.ShareSheetController$q */
    private interface C5607q {
        /* renamed from: a */
        void mo13230a(UserProto$User userProto$User, boolean z);
    }

    public ShareSheetController(Bundle bundle) {
        List<String> list;
        super(bundle);
        String str = "KEY_PRESELECTED_TARGETS";
        if (bundle.containsKey(str)) {
            list = bundle.getStringArrayList(str);
        } else {
            list = Collections.emptyList();
        }
        this.f14283X = list;
        String str2 = "KEY_EXCLUDED_USERS";
        this.f14284Y = bundle.containsKey(str2) ? bundle.getStringArrayList(str2) : Collections.emptyList();
        this.f14285Z = bundle.getInt("KEY_ACTION_TITLE");
        this.f14286a0 = bundle.getBoolean("KEY_WITH_CONTACTS", false);
        this.f14287b0 = bundle.getBoolean("KEY_WITH_PUBLIC_SHARE", false);
        this.f14288c0 = bundle.getBoolean("KEY_FLATTEN_CONVERSATIONS", true);
    }

    /* renamed from: E */
    private int m15810E() {
        return this.f14275P.size() + this.f14276Q.size() + this.f14277R.size();
    }

    /* renamed from: F */
    private void m15811F() {
        int E = m15810E();
        boolean z = E > 0;
        ScreenBarLayout screenBarLayout = this.f14290e0;
        screenBarLayout.mo6880b(z ? 0 : screenBarLayout.getCollapsibleHeight());
        if (z) {
            this.f14304s0.setText(this.f14304s0.getContext().getString(this.f14285Z, new Object[]{Integer.valueOf(E)}));
            this.f14304s0.setVisibility(0);
            return;
        }
        this.f14304s0.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m15812G() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f14275P);
        if (this.f14288c0) {
            for (C7117i othersList : this.f14276Q.values()) {
                for (C6818b userUuid : othersList.getOthersList()) {
                    hashSet.add(userUuid.getUserUuid());
                }
            }
        } else {
            for (C7117i inboxUuid : this.f14276Q.values()) {
                hashSet.add(inboxUuid.getInboxUuid());
            }
        }
        String[] strArr = (String[]) hashSet.toArray(new String[hashSet.size()]);
        OnTargetSelectedListener onTargetSelectedListener = this.f14305t0;
        if (onTargetSelectedListener != null) {
            onTargetSelectedListener.onTargetSelected(strArr);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m15813H() {
        this.f14282W.add(this.f14308w0.friendsMap().mo36487e(1).mo36428a(C12295a.m32802a()).mo36476d((Consumer<? super T>) new C5614d<Object>(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m15846e(String str) {
        return this.f14275P.contains(str);
    }

    /* renamed from: h */
    static /* synthetic */ boolean m15849h(String str) throws Exception {
        return !TextUtils.isEmpty(str);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m15844d(String str) {
        return this.f14276Q.containsKey(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        this.f14282W.mo36401a();
        this.f14292g0.setAdapter(null);
        super.mo7066c(view);
    }

    /* renamed from: b */
    public /* synthetic */ void mo13224b(CharSequence charSequence) throws Exception {
        this.f14292g0.mo5096g(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m15836b(Object obj) {
        boolean z = !m15833a(obj);
        if (z) {
            this.f14277R.add(obj);
        } else {
            this.f14277R.remove(obj);
        }
        Iterator it = this.f14280U.iterator();
        while (it.hasNext()) {
            ((SocialNetworkSelectable) it.next()).setSocialNetworkSelected(obj, z);
        }
        m15811F();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f14281V.mo36401a();
        this.f14305t0 = null;
        this.f14306u0 = null;
        super.mo7053d(view);
    }

    /* renamed from: c */
    static /* synthetic */ String m15840c(CharSequence charSequence) throws Exception {
        return charSequence.toString().trim().split("\n")[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (mo23947l() instanceof OnTargetSelectedListener) {
            this.f14305t0 = (OnTargetSelectedListener) mo23947l();
        } else if (mo23920b() instanceof OnTargetSelectedListener) {
            this.f14305t0 = (OnTargetSelectedListener) mo23920b();
        }
        if (mo23947l() instanceof OnContactSelectedListener) {
            this.f14306u0 = (OnContactSelectedListener) mo23947l();
        } else if (mo23920b() instanceof OnContactSelectedListener) {
            this.f14306u0 = (OnContactSelectedListener) mo23920b();
        }
        C5621b bVar = new C5621b(this.f14308w0, this.f14284Y, C3205g.m10196e(C7713f.m18776a(view.getContext())));
        C12275b bVar2 = this.f14281V;
        C12279e a = bVar.mo13271a().mo36428a(C12295a.m32802a());
        C5606p pVar = this.f14300o0;
        pVar.getClass();
        bVar2.add(a.mo36412a((Consumer<? super T>) new C5611b0<Object>(pVar), (Consumer<? super Throwable>) C5612c.f14353e));
        if (this.f14307v0) {
            this.f14281V.add(this.f14308w0.bestFriends().mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C5610b<Object>(this), (Consumer<? super Throwable>) C5634q.f14385e));
            C5617a aVar = new C5617a(C5448c.m15478a(), this.f14308w0, C3205g.m10189a().reversed());
            C12275b bVar3 = this.f14281V;
            C12279e a2 = aVar.mo13267a().mo36428a(C12295a.m32802a());
            C5598h hVar = this.f14299n0;
            hVar.getClass();
            bVar3.add(a2.mo36412a((Consumer<? super T>) new C5613c0<Object>(hVar), (Consumer<? super Throwable>) C5642y.f14394e));
        }
        C12279e l = this.f14289d0.mo36455b((Consumer<? super T>) new C5640w<Object>(this)).mo36501i(C5636s.f14388e).mo36459b((Predicate<? super T>) C5627j.f14374e).mo36506l();
        this.f14281V.add(l.mo36510n(C5639v.f14391e).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C5608a<Object>(this), (Consumer<? super Throwable>) C5629l.f14376e));
        if (this.f14286a0) {
            this.f14281V.add(l.mo36509m(C5641x.f14393e).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C5638u<Object>(this), (Consumer<? super Throwable>) C5609a0.f14350e));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        this.f14308w0 = C3015a.m9526a(context).provideFriendStore();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_share_sheet, viewGroup, false);
        this.f14294i0 = new C2477e(inflate.getContext());
        this.f14290e0 = (ScreenBarLayout) inflate.findViewById(R.id.search_bar_layout);
        this.f14291f0 = (SearchBar) inflate.findViewById(R.id.search_bar);
        this.f14295j0 = new CompositeAdapter();
        this.f14296k0 = new CompositeAdapter();
        this.f14297l0 = new C5602l();
        this.f14293h0 = (RecyclerView) inflate.findViewById(R.id.selection_list);
        this.f14293h0.setAdapter(this.f14297l0);
        this.f14293h0.setHasFixedSize(true);
        C4958p.m14306a(viewGroup.getContext()).mo12155a("prefs:tweaks:newShareSheetEnabled", true);
        this.f14307v0 = true;
        if (this.f14307v0) {
            if (this.f14287b0 && C3444a.m10686a(mo9304A()).mo6511a("feature:userPublicShare")) {
                C1069g a = C5615d0.m15932a(inflate.getContext());
                if (a != null) {
                    C5615d0.m15935a(a, (Consumer) new C5637t(this));
                    this.f14295j0.mo9665a((C1069g) C3269g.m10376a(R.string.commons_label_socialmedia, a));
                    this.f14295j0.mo9665a(a);
                    this.f14280U.add(this.f14297l0);
                    this.f14280U.add((SocialNetworkSelectable) a);
                }
            }
            this.f14298m0 = new C5592d(this, null);
            this.f14295j0.mo9665a((C1069g) C3269g.m10376a(R.string.commons_label_best_friends, this.f14298m0));
            this.f14295j0.mo9665a((C1069g) this.f14298m0);
            this.f14299n0 = new C5598h(this, null);
            this.f14295j0.mo9665a((C1069g) C3269g.m10376a(R.string.commons_label_recent, this.f14299n0));
            this.f14295j0.mo9665a((C1069g) this.f14299n0);
            this.f14295j0.mo9665a((C1069g) ShowMoreAdapter.m10362a((C1069g) this.f14299n0));
            this.f14278S.add(this.f14298m0);
            this.f14278S.add(this.f14299n0);
            this.f14279T.add(this.f14299n0);
        }
        this.f14300o0 = new C5606p(viewGroup.getContext());
        this.f14295j0.mo9665a((C1069g) C3269g.m10376a(R.string.commons_label_friends, this.f14300o0));
        this.f14295j0.mo9665a((C1069g) this.f14300o0);
        this.f14301p0 = new C5606p(viewGroup.getContext());
        this.f14296k0.mo9665a((C1069g) C3269g.m10376a(R.string.commons_label_friends, this.f14301p0));
        this.f14296k0.mo9665a((C1069g) this.f14301p0);
        this.f14278S.add(this.f14297l0);
        this.f14278S.add(this.f14300o0);
        this.f14278S.add(this.f14301p0);
        this.f14279T.add(this.f14297l0);
        if (this.f14286a0) {
            C1025a aVar = new C1025a();
            aVar.mo4865a(true);
            aVar.mo4864a(16);
            aVar.mo4867b(16);
            aVar.mo4868c(16);
            C1022d dVar = new C1022d(new C5192t0(), aVar.mo4866a());
            dVar.mo4863b(C2454e.m8570b());
            dVar.mo4861a(C2454e.m8569a());
            C1018f a2 = dVar.mo4862a();
            this.f14303r0 = new C5597g();
            this.f14303r0.mo4871b(a2);
            this.f14295j0.mo9665a((C1069g) C3269g.m10376a(R.string.commons_label_contacts, this.f14303r0));
            this.f14295j0.mo9665a((C1069g) this.f14303r0);
            this.f14302q0 = new C5596f(this, null);
            this.f14296k0.mo9665a((C1069g) C3269g.m10376a(R.string.commons_label_contacts, this.f14302q0));
            this.f14296k0.mo9665a((C1069g) this.f14302q0);
        }
        this.f14292g0 = (RecyclerView) inflate.findViewById(R.id.list);
        this.f14292g0.setAdapter(this.f14295j0);
        this.f14292g0.setItemAnimator(null);
        this.f14292g0.setLayoutAnimation(null);
        this.f14292g0.setHasFixedSize(true);
        inflate.findViewById(R.id.primary_action_layout);
        this.f14304s0 = (TextView) inflate.findViewById(R.id.primary_action);
        this.f14304s0.setOnClickListener(new C5589a());
        this.f14289d0 = C1684a.m7016a(this.f14291f0).mo36455b((Consumer<? super T>) new C5628k<Object>(this)).mo36452b(C12295a.m32802a()).mo36503j().mo36947s();
        this.f14290e0.setOnScreenBarLayoutReady(new C5590b());
        return inflate;
    }

    /* renamed from: a */
    public /* synthetic */ void mo13223a(Map map) throws Exception {
        for (String str : this.f14283X) {
            C2936a0 a0Var = (C2936a0) map.get(str);
            if (a0Var != null) {
                this.f14275P.add(a0Var.mo9074a().getUuid());
                this.f14297l0.m15908a(a0Var.mo9074a());
            } else {
                C7117i chatGetConversationCache = C5448c.m15478a().chatGetConversationCache(str);
                if (chatGetConversationCache != null) {
                    this.f14276Q.put(chatGetConversationCache.getInboxUuid(), chatGetConversationCache);
                    this.f14297l0.m15909a(chatGetConversationCache);
                }
            }
        }
        m15811F();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15827a(UserProto$User userProto$User) {
        boolean z = !m15846e(userProto$User.getUuid());
        if (z) {
            this.f14275P.add(userProto$User.getUuid());
        } else {
            this.f14275P.remove(userProto$User.getUuid());
        }
        Iterator it = this.f14278S.iterator();
        while (it.hasNext()) {
            ((C5607q) it.next()).mo13230a(userProto$User, z);
        }
        m15811F();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15828a(C7117i iVar) {
        boolean z = !m15844d(iVar.getInboxUuid());
        if (z) {
            this.f14276Q.put(iVar.getInboxUuid(), iVar);
        } else {
            this.f14276Q.remove(iVar.getInboxUuid());
        }
        Iterator it = this.f14279T.iterator();
        while (it.hasNext()) {
            ((C5599i) it.next()).mo13249a(iVar, z);
        }
        m15811F();
    }

    /* renamed from: a */
    private boolean m15833a(Object obj) {
        return this.f14277R.contains(obj);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13222a(List list) throws Exception {
        this.f14298m0.mo13231a(list);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13221a(CharSequence charSequence) throws Exception {
        if (TextUtils.isEmpty(charSequence.toString().trim())) {
            C1069g adapter = this.f14292g0.getAdapter();
            CompositeAdapter compositeAdapter = this.f14295j0;
            if (adapter != compositeAdapter) {
                this.f14292g0.setAdapter(compositeAdapter);
                return;
            }
            return;
        }
        C1069g adapter2 = this.f14292g0.getAdapter();
        CompositeAdapter compositeAdapter2 = this.f14296k0;
        if (adapter2 != compositeAdapter2) {
            this.f14292g0.setAdapter(compositeAdapter2);
        }
    }

    /* renamed from: a */
    static /* synthetic */ C5601k m15814a(String str, List list) throws Exception {
        return new C5601k(list, str, null);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13219a(C5601k kVar) throws Exception {
        this.f14301p0.mo13265a(kVar.f14331a, kVar.f14332b);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13220a(C7052a2 a2Var) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (C7339i a : a2Var.getContactsList()) {
            arrayList.add(C5138a.m14651a(a));
        }
        this.f14302q0.mo13241a((List<C5138a>) arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15817a(C5600j jVar, C5138a aVar) {
        this.f14294i0.load(C2884f.m9357a(aVar.f13320d)).into(jVar.f14323a);
        C3200e0.m10184a((View[]) jVar.f14324b, 8);
        jVar.f14325c.setVisibility(8);
        jVar.f14326d.setText(aVar.f13317a);
        jVar.itemView.setOnClickListener(new C5635r(this, aVar));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13218a(C5138a aVar, View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        OnContactSelectedListener onContactSelectedListener = this.f14306u0;
        if (onContactSelectedListener != null) {
            onContactSelectedListener.onContactSelected(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15816a(ImageView imageView, UserProto$User userProto$User) {
        this.f14294i0.load(C2884f.m9355a(userProto$User)).into(imageView);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15831a(ImageView[] imageViewArr, List<UserProto$User> list) {
        for (int i = 0; i < imageViewArr.length; i++) {
            m15816a(imageViewArr[i], (UserProto$User) list.get(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15815a(ImageView imageView) {
        this.f14294i0.clear(imageView);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15830a(ImageView[] imageViewArr) {
        for (ImageView a : imageViewArr) {
            m15815a(a);
        }
    }
}
