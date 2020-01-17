package app.zenly.locator.chat;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.C0122a.C0123a;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.core.content.C0540a;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.android.base.view.C1311b;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.R;
import app.zenly.locator.chat.content.C1946c;
import app.zenly.locator.chat.content.C1949d;
import app.zenly.locator.chat.content.MediaHandler;
import app.zenly.locator.chat.content.MemberHandler;
import app.zenly.locator.chat.content.MessageHandler;
import app.zenly.locator.chat.content.MessageWindowHandler;
import app.zenly.locator.chat.p059r5.C2309e;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.p072ui.view.C3137b;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.core.widget.CircleProgressView;
import app.zenly.locator.media.C4471u0;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p151o.p152c.C5470b;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p160v.p161b.C5518b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p213co.znly.models.C7354j0;
import p213co.znly.models.PingProto$Conversation.C6818b;
import p213co.znly.models.PingProto$Ping2.C6824b;
import p213co.znly.models.PingProto$Ping2.C6824b.C6826b;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;
import p250f.p251a.p252a.p253a.p260i.C7685b;
import p250f.p251a.p252a.p253a.p260i.C7687c;
import p250f.p251a.p252a.p253a.p260i.p261f.C7690a;
import p250f.p251a.p252a.p253a.p260i.p261f.C7691b;
import p250f.p251a.p252a.p263b.p279d.C7770f;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p416me.saket.bettermovementmethod.BetterLinkMovementMethod;
import p416me.saket.bettermovementmethod.BetterLinkMovementMethod.OnLinkClickListener;
import p416me.saket.bettermovementmethod.BetterLinkMovementMethod.OnLinkLongClickListener;

/* renamed from: app.zenly.locator.chat.u4 */
public final class C2335u4 extends C1069g<C1085v> {

    /* renamed from: p */
    private static final long f7050p = TimeUnit.MINUTES.toSeconds(15);

    /* renamed from: q */
    private static final RelativeSizeSpan f7051q = new RelativeSizeSpan(2.0f);

    /* renamed from: a */
    private final C7685b f7052a = new C7685b();

    /* renamed from: b */
    private final C1956d5 f7053b;

    /* renamed from: c */
    private final C1893c5 f7054c;

    /* renamed from: d */
    private final boolean f7055d;

    /* renamed from: e */
    private final Context f7056e;

    /* renamed from: f */
    private final C2345v4 f7057f;

    /* renamed from: g */
    private final MessageHandler f7058g;

    /* renamed from: h */
    private final MessageHandler f7059h;

    /* renamed from: i */
    private final MessageWindowHandler f7060i;

    /* renamed from: j */
    private final MessageHandler f7061j;

    /* renamed from: k */
    private final MemberHandler f7062k;

    /* renamed from: l */
    private final MediaHandler f7063l;

    /* renamed from: m */
    private String f7064m = null;

    /* renamed from: n */
    private final ZenlySchedulers f7065n = C1351e.m6372a(C2382x4.f7181b.mo19916a("adapter"));

    /* renamed from: o */
    private final int f7066o;

    /* renamed from: app.zenly.locator.chat.u4$a */
    static /* synthetic */ class C2336a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7067a = new int[C6826b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                co.znly.models.PingProto$Ping2$b$b[] r0 = p213co.znly.models.PingProto$Ping2.C6824b.C6826b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7067a = r0
                int[] r0 = f7067a     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.models.PingProto$Ping2$b$b r1 = p213co.znly.models.PingProto$Ping2.C6824b.C6826b.TEXT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f7067a     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.models.PingProto$Ping2$b$b r1 = p213co.znly.models.PingProto$Ping2.C6824b.C6826b.MEDIA     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.chat.C2335u4.C2336a.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.chat.u4$b */
    public static class C2337b extends C1085v {

        /* renamed from: a */
        final LinearLayout f7068a;

        /* renamed from: b */
        final View f7069b;

        /* renamed from: c */
        final TextView f7070c;

        /* renamed from: d */
        final TextView f7071d;

        /* renamed from: e */
        final TextView f7072e;

        /* renamed from: f */
        final View f7073f;

        /* renamed from: g */
        final View f7074g;

        /* renamed from: h */
        final ImageView f7075h;

        /* renamed from: i */
        final TextView f7076i;

        /* renamed from: j */
        final View f7077j;

        /* renamed from: k */
        final ImageView f7078k;

        /* renamed from: l */
        final TextView f7079l;

        /* renamed from: m */
        final ImageView f7080m;

        /* renamed from: n */
        final ProgressBar f7081n;

        /* renamed from: o */
        final FrameLayout f7082o;

        /* renamed from: p */
        final TextView f7083p;

        /* renamed from: q */
        final TextView f7084q;

        /* renamed from: r */
        final C1946c f7085r;

        /* renamed from: s */
        final View f7086s;

        /* renamed from: t */
        final CircleProgressView f7087t;

        /* renamed from: u */
        final AvatarLoader f7088u;

        /* renamed from: v */
        final C12275b f7089v;

        /* synthetic */ C2337b(View view, C2336a aVar) {
            this(view);
        }

        private C2337b(View view) {
            super(view);
            this.f7089v = new C12275b();
            this.f7068a = (LinearLayout) view;
            this.f7069b = view.findViewById(R.id.message_header);
            this.f7070c = (TextView) view.findViewById(R.id.message_timestamp);
            this.f7071d = (TextView) view.findViewById(R.id.message_new);
            this.f7072e = (TextView) view.findViewById(R.id.author_name);
            this.f7073f = view.findViewById(R.id.message_start_spacer);
            this.f7074g = view.findViewById(R.id.message_end_spacer);
            this.f7075h = (ImageView) view.findViewById(R.id.author_avatar);
            this.f7076i = (TextView) view.findViewById(R.id.message_content_text);
            this.f7077j = view.findViewById(R.id.message_content_image_layout);
            this.f7078k = (ImageView) view.findViewById(R.id.message_content_image);
            this.f7079l = (TextView) view.findViewById(R.id.message_status);
            this.f7080m = (ImageView) view.findViewById(R.id.message_status_icon);
            this.f7081n = (ProgressBar) view.findViewById(R.id.message_status_progress);
            this.f7082o = (FrameLayout) view.findViewById(R.id.message_cursors);
            this.f7083p = (TextView) view.findViewById(R.id.message_datetime);
            this.f7084q = (TextView) view.findViewById(R.id.message_readers);
            this.f7088u = new C2477e(view.getContext());
            this.f7085r = new C1946c(this.f7078k, (ProgressBar) view.findViewById(R.id.message_content_image_progress));
            this.f7086s = view.findViewById(R.id.message_content_image_status);
            this.f7087t = (CircleProgressView) view.findViewById(R.id.message_content_image_timer);
        }
    }

    /* renamed from: app.zenly.locator.chat.u4$c */
    enum C2338c {
        AVATAR,
        CURSORS,
        HEADER,
        STATUS,
        COLLAPSE,
        EXPAND
    }

    /* renamed from: app.zenly.locator.chat.u4$d */
    private static class C2339d extends C1085v {

        /* renamed from: a */
        final TextView f7097a;

        /* synthetic */ C2339d(View view, C2336a aVar) {
            this(view);
        }

        private C2339d(View view) {
            super(view);
            this.f7097a = (TextView) view;
        }
    }

    C2335u4(Context context, C1956d5 d5Var, C1893c5 c5Var, MessageHandler messageHandler, MessageHandler messageHandler2, MessageWindowHandler messageWindowHandler, MessageHandler messageHandler3, MemberHandler memberHandler, MediaHandler mediaHandler, boolean z) {
        this.f7056e = context;
        this.f7053b = d5Var;
        this.f7054c = c5Var;
        this.f7058g = messageHandler;
        this.f7059h = messageHandler2;
        this.f7060i = messageWindowHandler;
        this.f7061j = messageHandler3;
        this.f7062k = memberHandler;
        this.f7063l = mediaHandler;
        this.f7055d = z;
        this.f7057f = new C2345v4(this);
        this.f7066o = context.getResources().getDimensionPixelSize(R.dimen.spacing_75);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m8322a(TextView textView, String str) {
        return true;
    }

    /* renamed from: b */
    private C1085v m8326b(ViewGroup viewGroup) {
        return new C2339d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_chat_conversation_system_message, viewGroup, false), null);
    }

    /* renamed from: d */
    private void m8336d(C2337b bVar, C1949d dVar) {
        int i;
        if (dVar.mo7715f()) {
            i = 8388613;
            m8328b(bVar, 1);
            bVar.f7073f.setVisibility(0);
            bVar.f7074g.setVisibility(8);
        } else {
            i = 8388611;
            m8328b(bVar, 0);
            bVar.f7073f.setVisibility(8);
            bVar.f7074g.setVisibility(0);
        }
        bVar.f7068a.setGravity(i);
    }

    /* renamed from: e */
    private void m8337e(C2337b bVar, C1949d dVar) {
        if (m8323a(dVar)) {
            Collection b = this.f7053b.mo7769i().mo7616b();
            Map a = this.f7053b.mo7769i().mo7612a();
            ArrayList arrayList = new ArrayList();
            Iterator it = b.iterator();
            int i = 0;
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                C6818b bVar2 = (C6818b) it.next();
                if (!bVar2.getUserUuid().equals(dVar.f6311d.getUserUuid()) && !C2309e.m8217a(bVar2)) {
                    String str = (String) a.get(bVar2.getUserUuid());
                    if (str == null || str.compareTo(dVar.f6310c.getUuid()) < 0) {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(bVar2.getNickname());
                    }
                    i++;
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                bVar.f7084q.setText(R.string.gchat_states_sent);
            } else if (size != i) {
                Context context = bVar.f7084q.getContext();
                bVar.f7084q.setText(context.getString(R.string.gchat_states_seen_part, new Object[]{C7687c.m18719a(context, arrayList)}));
            } else if (this.f7055d) {
                bVar.f7084q.setText(R.string.gchat_states_seen_all);
            } else {
                bVar.f7084q.setText(R.string.gchat_states_read);
            }
            bVar.f7084q.setVisibility(0);
            return;
        }
        bVar.f7084q.setVisibility(8);
    }

    /* renamed from: f */
    private void m8338f(C2337b bVar, C1949d dVar) {
        int i = 0;
        bVar.f7081n.setVisibility((!dVar.mo7716g() || !dVar.mo7714e()) ? 8 : 0);
        if (dVar.mo7715f() && dVar.mo7716g() && !dVar.mo7714e()) {
            bVar.f7079l.setVisibility(0);
            bVar.f7079l.setText(null);
            bVar.f7080m.setImageResource(R.drawable.ic_inbox_sending_size_16);
        } else if (dVar.mo7715f() && dVar.mo7713d()) {
            bVar.f7079l.setVisibility(0);
            TextView textView = bVar.f7079l;
            textView.setText(m8310a(textView.getContext()));
            bVar.f7080m.setImageResource(R.drawable.ic_inbox_error_size_16);
        } else if (dVar.mo7715f() && dVar.mo7711c() && this.f7057f.mo8247c(dVar)) {
            boolean a = this.f7053b.mo7739a(dVar);
            bVar.f7079l.setVisibility(8);
            bVar.f7079l.setText(null);
            ImageView imageView = bVar.f7080m;
            if (!a) {
                i = R.drawable.ic_inbox_sent_size_16;
            }
            imageView.setImageResource(i);
        } else if (dVar.mo7715f() || !dVar.mo7709b()) {
            bVar.f7079l.setVisibility(8);
            bVar.f7080m.setImageResource(0);
        } else {
            bVar.f7079l.setVisibility(0);
            bVar.f7079l.setText(R.string.chat_reportdialog_title_messagereported);
            bVar.f7080m.setImageResource(0);
        }
    }

    /* renamed from: g */
    private void m8339g(C2337b bVar, C1949d dVar) {
        int i;
        Context context = bVar.itemView.getContext();
        boolean f = dVar.mo7715f();
        int i2 = R.color.white;
        if (f) {
            i = R.color.transparent;
        } else if (dVar.mo7709b()) {
            i = R.color.gray_heavy;
        } else {
            i = C2285q4.m8183a(dVar.f6311d.getUserUuid(), this.f7055d);
            i2 = R.color.blue_black;
        }
        bVar.f7072e.setTextColor(C0540a.m2536a(context, i));
        int a = C0540a.m2536a(context, i2);
        bVar.f7076i.setTextColor(a);
        bVar.f7076i.setLinkTextColor(a);
        C6824b content = dVar.f6310c.getContent(0);
        int i3 = C2336a.f7067a[content.getType().ordinal()];
        if (i3 == 1) {
            if (dVar.f6312e) {
                C1311b.m6279a((View) bVar.f7076i, 0);
            }
            m8313a(bVar.f7076i, (Drawable) null);
        } else if (i3 == 2) {
            if (m8333b(content.getMedia())) {
                m8313a(bVar.f7076i, C5470b.m15559a(context, 2131231234, a));
            } else {
                m8313a(bVar.f7076i, (Drawable) null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2345v4 mo8227a() {
        return this.f7057f;
    }

    /* renamed from: c */
    public /* synthetic */ void mo8234c(C2337b bVar, View view) {
        int adapterPosition = bVar.getAdapterPosition();
        if (adapterPosition != -1) {
            C1949d a = this.f7057f.mo8235a(adapterPosition);
            if (a.mo7713d()) {
                this.f7061j.invoke(a);
            } else {
                this.f7063l.invoke(a.f6310c.getContent(0).getMedia(), bVar.f7078k);
            }
        }
    }

    public int getItemCount() {
        return this.f7057f.mo8245c();
    }

    public int getItemViewType(int i) {
        return this.f7057f.mo8235a(i).mo7717h() ? 1 : 2;
    }

    public void onBindViewHolder(C1085v vVar, int i) {
        if (vVar.getItemViewType() == 1) {
            m8320a((C2339d) vVar, i);
        } else {
            m8314a((C2337b) vVar, i);
        }
    }

    public C1085v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 1 ? m8326b(viewGroup) : m8311a(viewGroup);
    }

    public void onViewRecycled(C1085v vVar) {
        if (vVar.getItemViewType() == 2) {
            C2337b bVar = (C2337b) vVar;
            bVar.f7089v.mo36401a();
            bVar.f7085r.mo7698a();
            bVar.f7069b.setBackground(null);
            bVar.f7078k.setTransitionName(null);
            C3137b.m9859a((ViewGroup) bVar.f7082o, bVar.f7088u);
        }
    }

    /* renamed from: a */
    private C1085v m8311a(ViewGroup viewGroup) {
        C2337b bVar = new C2337b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_chat_conversation_message, viewGroup, false), null);
        bVar.f7075h.setOnClickListener(new C2100n0(this, bVar));
        BetterLinkMovementMethod a = BetterLinkMovementMethod.m34357a();
        a.mo37717a((OnLinkLongClickListener) C2192p0.f6733a);
        a.mo37716a((OnLinkClickListener) C2114o0.f6612a);
        bVar.f7076i.setMovementMethod(a);
        bVar.f7076i.setOnClickListener(new C2028k0(this, bVar));
        bVar.f7078k.setOnClickListener(new C2080l0(this, bVar));
        C2092m0 m0Var = new C2092m0(this, bVar, viewGroup);
        bVar.f7076i.setOnLongClickListener(m0Var);
        bVar.f7076i.setHapticFeedbackEnabled(false);
        bVar.f7078k.setOnLongClickListener(m0Var);
        bVar.f7078k.setHapticFeedbackEnabled(false);
        return bVar;
    }

    public void onBindViewHolder(C1085v vVar, int i, List<Object> list) {
        if (vVar.getItemViewType() == 1) {
            m8320a((C2339d) vVar, i);
        } else {
            m8315a((C2337b) vVar, i, list);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo8233b(C2337b bVar, View view) {
        int adapterPosition = bVar.getAdapterPosition();
        if (adapterPosition != -1) {
            C1949d a = this.f7057f.mo8235a(adapterPosition);
            if (a.mo7713d()) {
                this.f7061j.invoke(a);
            } else {
                String str = this.f7064m;
                if (str != null) {
                    C1949d a2 = this.f7057f.mo8236a(str);
                    if (a2 != null) {
                        this.f7057f.mo8240a(a2, (Object) C2338c.COLLAPSE);
                    }
                }
                if (a.mo7716g() || m8323a(a)) {
                    this.f7064m = null;
                } else {
                    this.f7064m = a.f6310c.getUuid();
                    this.f7057f.mo8240a(a, (Object) C2338c.EXPAND);
                }
            }
        }
    }

    /* renamed from: c */
    private void m8334c(C2337b bVar, C1949d dVar) {
        if (m8323a(dVar)) {
            TextView textView = bVar.f7083p;
            textView.setText(C5518b.m15655c(textView.getContext(), TimeUnit.SECONDS.toMillis(dVar.f6310c.getCreatedAt().getSeconds())));
            bVar.f7083p.setVisibility(0);
            return;
        }
        bVar.f7083p.setVisibility(8);
    }

    /* renamed from: c */
    private boolean m8335c(C1949d dVar, C1949d dVar2) {
        return dVar2 == null || m8325a(dVar, dVar2);
    }

    /* renamed from: b */
    private List<C1949d> m8327b(int i) {
        LinkedList linkedList = new LinkedList();
        for (int i2 = i + 1; i2 < this.f7057f.mo8245c() && linkedList.size() < 10; i2++) {
            C1949d a = this.f7057f.mo8235a(i2);
            if (!a.mo7717h()) {
                linkedList.addFirst(a);
            }
        }
        LinkedList linkedList2 = new LinkedList();
        for (int i3 = i - 1; i3 >= 0 && linkedList2.size() < 10; i3--) {
            C1949d a2 = this.f7057f.mo8235a(i3);
            if (!a2.mo7717h()) {
                linkedList2.addLast(a2);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(linkedList);
        arrayList.add(this.f7057f.mo8235a(i));
        arrayList.addAll(linkedList2);
        return arrayList;
    }

    /* renamed from: a */
    public /* synthetic */ void mo8230a(C2337b bVar, View view) {
        int adapterPosition = bVar.getAdapterPosition();
        if (adapterPosition != -1) {
            this.f7062k.invoke(this.f7057f.mo8235a(adapterPosition).f6311d.getUserUuid());
        }
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo8231a(C2337b bVar, ViewGroup viewGroup, View view) {
        int adapterPosition = bVar.getAdapterPosition();
        if (adapterPosition == -1) {
            return false;
        }
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.MEDIUM, C5500b.CHAT);
        m8312a(viewGroup.getContext(), this.f7057f.mo8235a(adapterPosition), m8327b(adapterPosition));
        return true;
    }

    /* renamed from: a */
    private void m8312a(Context context, C1949d dVar, List<C1949d> list) {
        int i = C2336a.f7067a[dVar.f6310c.getContent(0).getType().ordinal()];
        if (i == 1) {
            int i2 = dVar.mo7715f() ? R.array.text_message_from_self_options_array : dVar.mo7709b() ? R.array.text_message_options_array_without_report : R.array.text_message_options_array;
            C0123a aVar = new C0123a(context);
            aVar.mo529a(i2, (OnClickListener) new C2011j0(this, dVar, list));
            aVar.mo550c();
        } else if (i == 2) {
            int i3 = dVar.mo7715f() ? R.array.media_message_from_self_options_array : dVar.mo7709b() ? R.array.media_message_options_array_without_report : R.array.media_message_options_array;
            C0123a aVar2 = new C0123a(context);
            aVar2.mo529a(i3, (OnClickListener) new C1990g0(this, dVar, list));
            aVar2.mo550c();
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo8232b(C1949d dVar, List list, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            this.f7059h.invoke(dVar);
        } else if (i == 1) {
            this.f7060i.invoke(dVar, list);
        }
    }

    /* renamed from: b */
    private void m8330b(C2337b bVar, C1949d dVar, int i) {
        String str;
        int i2;
        boolean z = true;
        C1949d a = i == getItemCount() - 1 ? null : this.f7057f.mo8235a(i + 1);
        boolean b = this.f7057f.mo8244b(dVar);
        boolean c = m8335c(dVar, a);
        boolean b2 = m8332b(dVar, a);
        int i3 = 0;
        boolean z2 = c || b2;
        if (!this.f7055d || dVar.mo7715f() || !z2) {
            z = false;
        }
        Context context = bVar.f7070c.getContext();
        int i4 = 8;
        bVar.f7069b.setVisibility((c || b) ? 0 : 8);
        bVar.f7070c.setVisibility((c || b) ? 0 : 8);
        bVar.f7071d.setVisibility((!c || !b) ? 8 : 0);
        if (b) {
            C1964e5.m7690a(bVar.f7070c);
        } else {
            bVar.f7070c.setBackground(null);
        }
        if (c || b) {
            TextView textView = bVar.f7070c;
            if (!c) {
                str = context.getString(R.string.chat_label_new_messages);
            } else {
                str = C5518b.m15655c(context, TimeUnit.SECONDS.toMillis(dVar.f6310c.getCreatedAt().getSeconds()));
            }
            textView.setText(str);
            if (b) {
                i2 = C0540a.m2536a(context, (int) R.color.white);
            } else {
                i2 = C7678c.m18702a(context, (int) R.attr.zenlyTextColorTertiary);
            }
            bVar.f7070c.setTextColor(i2);
        }
        TextView textView2 = bVar.f7072e;
        if (z) {
            i4 = 0;
        }
        textView2.setVisibility(i4);
        if (z) {
            bVar.f7072e.setText(dVar.f6311d.getNickname());
        }
        LinearLayout linearLayout = bVar.f7068a;
        int paddingLeft = linearLayout.getPaddingLeft();
        if (b2 && !c) {
            i3 = this.f7066o;
        }
        linearLayout.setPadding(paddingLeft, i3, bVar.f7068a.getPaddingRight(), bVar.f7068a.getPaddingBottom());
    }

    /* renamed from: a */
    public /* synthetic */ void mo8229a(C1949d dVar, List list, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            this.f7058g.invoke(dVar);
        } else if (i == 1) {
            this.f7059h.invoke(dVar);
        } else if (i == 2) {
            this.f7060i.invoke(dVar, list);
        }
    }

    /* renamed from: a */
    private void m8320a(C2339d dVar, int i) {
        dVar.f7097a.setText(this.f7057f.mo8235a(i).f6310c.getContent(0).getText());
    }

    /* renamed from: a */
    private void m8314a(C2337b bVar, int i) {
        C1949d a = this.f7057f.mo8235a(i);
        m8336d(bVar, a);
        m8339g(bVar, a);
        m8330b(bVar, a, i);
        m8317a(bVar, a, i);
        m8316a(bVar, a);
        m8338f(bVar, a);
        m8329b(bVar, a);
        m8334c(bVar, a);
        m8337e(bVar, a);
    }

    /* renamed from: a */
    private void m8315a(C2337b bVar, int i, List<Object> list) {
        if (list == null || list.isEmpty()) {
            onBindViewHolder(bVar, i);
            return;
        }
        C1949d a = this.f7057f.mo8235a(i);
        if (list.contains(C2338c.HEADER)) {
            m8330b(bVar, a, i);
        }
        if (list.contains(C2338c.AVATAR)) {
            m8317a(bVar, a, i);
        }
        if (list.contains(C2338c.STATUS)) {
            m8338f(bVar, a);
        }
        if (list.contains(C2338c.CURSORS)) {
            m8338f(bVar, a);
            m8329b(bVar, a);
            m8337e(bVar, a);
        }
        if (list.contains(C2338c.EXPAND) || list.contains(C2338c.COLLAPSE)) {
            m8334c(bVar, a);
            m8337e(bVar, a);
        }
    }

    /* renamed from: b */
    private boolean m8333b(C7354j0 j0Var) {
        boolean z = false;
        if (C3245z.m10286e(j0Var.getValidUntil())) {
            return false;
        }
        if (C3245z.m10288g(j0Var.getValidUntil()) < C5448c.m15478a().timeNow().getTime()) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private void m8329b(C2337b bVar, C1949d dVar) {
        List list = (List) this.f7053b.mo7772l().get(dVar.f6310c.getUuid());
        if (list == null || list.size() == 0) {
            bVar.f7082o.setVisibility(4);
            return;
        }
        bVar.f7082o.setVisibility(0);
        C12279e e = C12279e.m32623b((Iterable<? extends T>) list).mo36487e(3);
        C1893c5 c5Var = this.f7054c;
        c5Var.getClass();
        bVar.f7089v.add(e.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C1873a<Object,Object>(c5Var)).mo36511n().mo36535a((C12286f) this.f7065n.getMainThread()).mo36533a((Consumer<? super T>) new C1983f0<Object>(bVar, list), (Consumer<? super Throwable>) C1997h0.f6406e));
    }

    /* renamed from: a */
    private void m8317a(C2337b bVar, C1949d dVar, int i) {
        int i2 = 0;
        boolean z = !dVar.mo7715f() && m8324a(dVar, i);
        ImageView imageView = bVar.f7075h;
        if (!z) {
            i2 = 4;
        }
        imageView.setVisibility(i2);
        if (z) {
            bVar.f7089v.add(this.f7054c.mo7623a(dVar.f6311d.getUserUuid()).mo36428a((C12286f) this.f7065n.getMainThread()).mo36476d((Consumer<? super T>) new C2004i0<Object>(bVar)));
        }
    }

    /* renamed from: b */
    private void m8328b(C2337b bVar, int i) {
        LayoutParams layoutParams = (LayoutParams) bVar.f7076i.getLayoutParams();
        float f = (float) i;
        layoutParams.f2165z = f;
        bVar.f7076i.setLayoutParams(layoutParams);
        LayoutParams layoutParams2 = (LayoutParams) bVar.f7077j.getLayoutParams();
        layoutParams2.f2165z = f;
        bVar.f7077j.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    private void m8316a(C2337b bVar, C1949d dVar) {
        C6824b content = dVar.f6310c.getContent(0);
        int i = C2336a.f7067a[content.getType().ordinal()];
        if (i == 1) {
            if (dVar.f6312e) {
                C7685b bVar2 = this.f7052a;
                bVar2.mo19898b();
                bVar2.mo19897a((Object) f7051q);
                bVar2.mo19896a((CharSequence) content.getText());
                bVar2.mo19899c();
                bVar.f7076i.setText(bVar2.mo19893a());
            } else {
                bVar.f7076i.setText(content.getText());
            }
            bVar.f7076i.setVisibility(0);
            bVar.f7078k.setVisibility(8);
            bVar.f7086s.setVisibility(8);
        } else if (i == 2) {
            if (m8333b(content.getMedia())) {
                bVar.f7076i.setVisibility(0);
                bVar.f7076i.setText(R.string.chat_label_expired_photo);
                bVar.f7078k.setVisibility(8);
                bVar.f7086s.setVisibility(8);
                return;
            }
            bVar.f7076i.setVisibility(8);
            bVar.f7078k.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = bVar.f7078k.getLayoutParams();
            layoutParams.height = m8309a(content.getMedia());
            bVar.f7078k.setLayoutParams(layoutParams);
            bVar.f7085r.mo7699a(content.getMedia());
            if (!C3245z.m10286e(content.getMedia().getValidUntil())) {
                bVar.f7086s.setVisibility(0);
                bVar.f7087t.mo9658a(C4471u0.m13250a(content.getMedia().getCreatedAt(), content.getMedia().getValidUntil()), 100.0f);
            } else {
                bVar.f7086s.setVisibility(8);
            }
            bVar.f7078k.setTransitionName(bVar.f7078k.getContext().getString(R.string.transition_image, new Object[]{content.getMedia().getUuid()}));
        }
    }

    /* renamed from: b */
    private boolean m8332b(C1949d dVar, C1949d dVar2) {
        return dVar2 == null || dVar2.mo7717h() || !dVar.mo7710b(dVar2);
    }

    /* renamed from: a */
    private int m8309a(C7354j0 j0Var) {
        int i = j0Var.getOriginalWidth() > j0Var.getOriginalHeight() ? R.dimen.chat_image_thumbnail_height_landscape : j0Var.getOriginalHeight() > j0Var.getOriginalWidth() ? R.dimen.chat_image_thumbnail_height_portrait : R.dimen.chat_image_thumbnail_height_square;
        return this.f7056e.getResources().getDimensionPixelSize(i);
    }

    /* renamed from: a */
    private static Spanned m8310a(Context context) {
        C7685b bVar = new C7685b();
        bVar.mo19896a((CharSequence) context.getString(R.string.chat_status_error_message_failed));
        bVar.mo19896a((CharSequence) " • ");
        bVar.mo19897a((Object) new C7690a(context, (int) R.color.orange));
        bVar.mo19897a((Object) new C7691b(context, C7770f.TextAppearance_Subtitle));
        bVar.mo19896a((CharSequence) context.getString(R.string.chat_status_error_message_retry));
        bVar.mo19899c();
        bVar.mo19899c();
        return bVar.mo19893a();
    }

    /* renamed from: a */
    public C2396z4 mo8228a(int i) {
        C1949d a = this.f7057f.mo8235a(i);
        if (a.f6312e) {
            return C2396z4.NONE;
        }
        if (a.mo7709b() || a.mo7713d()) {
            return C2396z4.DISABLED;
        }
        if (a.mo7715f()) {
            return C2396z4.GRADIENT;
        }
        return C2396z4.SOLID;
    }

    /* renamed from: a */
    private boolean m8324a(C1949d dVar, int i) {
        boolean z = true;
        if (i == 0) {
            return true;
        }
        C1949d a = this.f7057f.mo8235a(i - 1);
        if (!a.mo7717h() && dVar.mo7710b(a) && !m8325a(a, dVar)) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m8325a(C1949d dVar, C1949d dVar2) {
        return dVar.f6310c.getCreatedAt().getSeconds() - dVar2.f6310c.getCreatedAt().getSeconds() > f7050p;
    }

    /* renamed from: a */
    private boolean m8323a(C1949d dVar) {
        return TextUtils.equals(this.f7064m, dVar.f6310c.getUuid());
    }

    /* renamed from: a */
    private static void m8313a(TextView textView, Drawable drawable) {
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }
}
