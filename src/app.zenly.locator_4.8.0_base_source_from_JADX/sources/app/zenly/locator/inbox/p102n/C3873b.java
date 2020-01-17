package app.zenly.locator.inbox.p102n;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0122a.C0123a;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0540a;
import androidx.core.widget.C0680h;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.chat.content.C1949d;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.view.C3137b;
import app.zenly.locator.inbox.C3842g;
import app.zenly.locator.inbox.C3843h;
import app.zenly.locator.inbox.C3844i;
import app.zenly.locator.inbox.p103o.C3884a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p160v.p161b.C5518b;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PingProto$Ping2.C6824b;
import p213co.znly.models.PingProto$Ping2.C6824b.C6826b;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7117i;
import p213co.znly.models.core.C7117i.C7119b;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;
import p250f.p251a.p252a.p263b.p279d.C7770f;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.inbox.n.b */
public final class C3873b extends C7717d<C3884a> {

    /* renamed from: e */
    private AvatarLoader f10273e;

    /* renamed from: f */
    private final ZenlySchedulers f10274f = C1351e.m6372a(C3844i.f10228b.mo19916a("cursors"));

    /* renamed from: g */
    private final C12275b f10275g = new C12275b();

    /* renamed from: app.zenly.locator.inbox.n.b$a */
    static final class C3874a<T> implements Consumer<List<UserProto$User>> {

        /* renamed from: e */
        final /* synthetic */ FrameLayout f10276e;

        /* renamed from: f */
        final /* synthetic */ C3873b f10277f;

        /* renamed from: g */
        final /* synthetic */ List f10278g;

        C3874a(FrameLayout frameLayout, C3873b bVar, List list) {
            this.f10276e = frameLayout;
            this.f10277f = bVar;
            this.f10278g = list;
        }

        /* renamed from: a */
        public final void accept(List<UserProto$User> list) {
            FrameLayout frameLayout = this.f10276e;
            C12932j.m33815a((Object) frameLayout, "it");
            AvatarLoader a = C3873b.m11407a(this.f10277f);
            C12932j.m33815a((Object) list, "users");
            C3137b.m9861a(frameLayout, a, list, this.f10278g.size(), false, 8, null);
        }
    }

    /* renamed from: app.zenly.locator.inbox.n.b$b */
    static final class C3875b<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ FrameLayout f10279e;

        /* renamed from: f */
        final /* synthetic */ C3873b f10280f;

        C3875b(FrameLayout frameLayout, C3873b bVar, List list) {
            this.f10279e = frameLayout;
            this.f10280f = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            FrameLayout frameLayout = this.f10279e;
            C12932j.m33815a((Object) frameLayout, "it");
            C3137b.m9861a(frameLayout, C3873b.m11407a(this.f10280f), C12848o.m33640a(), 0, false, 12, null);
            C12143a.m32032b(th, "Could not load user avatars", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.inbox.n.b$c */
    static final class C3876c<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        public static final C3876c f10281e = new C3876c();

        C3876c() {
        }

        /* renamed from: a */
        public final C12279e<UserProto$User> apply(String str) {
            C12932j.m33818b(str, "it");
            return C5448c.m15478a().userPublicStream(str).mo36487e(1).mo36466c((ObservableSource<? extends T>) C12279e.m32633q());
        }
    }

    /* renamed from: app.zenly.locator.inbox.n.b$d */
    static final class C3877d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3873b f10282e;

        /* renamed from: f */
        final /* synthetic */ View f10283f;

        C3877d(C3873b bVar, View view) {
            this.f10282e = bVar;
            this.f10283f = view;
        }

        public final void onClick(View view) {
            C5499a aVar = C5498a.f14119e;
            Context context = this.f10283f.getContext();
            C12932j.m33815a((Object) context, "itemView.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f10282e.mo34491a().dispatch(new C3842g(C3873b.m11410b(this.f10282e)));
        }
    }

    /* renamed from: app.zenly.locator.inbox.n.b$e */
    static final class C3878e implements OnLongClickListener {

        /* renamed from: e */
        final /* synthetic */ C3873b f10284e;

        /* renamed from: f */
        final /* synthetic */ View f10285f;

        /* renamed from: app.zenly.locator.inbox.n.b$e$a */
        static final class C3879a implements DialogInterface.OnClickListener {

            /* renamed from: e */
            final /* synthetic */ C3878e f10286e;

            C3879a(C3878e eVar) {
                this.f10286e = eVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    this.f10286e.f10284e.mo34491a().dispatch(new C3843h(C3873b.m11410b(this.f10286e.f10284e)));
                }
            }
        }

        C3878e(C3873b bVar, View view) {
            this.f10284e = bVar;
            this.f10285f = view;
        }

        public final boolean onLongClick(View view) {
            C5499a aVar = C5498a.f14119e;
            C12932j.m33815a((Object) view, "it");
            Context context = view.getContext();
            C12932j.m33815a((Object) context, "it.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.MEDIUM, C5500b.CHAT, 0, 4, null);
            C0123a aVar2 = new C0123a(this.f10285f.getContext());
            aVar2.mo529a((int) R.array.conversation_options_array, (DialogInterface.OnClickListener) new C3879a(this));
            aVar2.mo542a().show();
            return true;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AvatarLoader m11407a(C3873b bVar) {
        AvatarLoader avatarLoader = bVar.f10273e;
        if (avatarLoader != null) {
            return avatarLoader;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }

    /* renamed from: b */
    public static final /* synthetic */ C3884a m11410b(C3873b bVar) {
        return (C3884a) bVar.mo34494c();
    }

    /* renamed from: f */
    public void mo6954f() {
        AvatarLoader avatarLoader = this.f10273e;
        String str = "avatarLoader";
        if (avatarLoader != null) {
            ImageView imageView = (ImageView) mo34493b().findViewById(C3891l.avatar);
            C12932j.m33815a((Object) imageView, "itemView.avatar");
            avatarLoader.clear(imageView);
            AvatarLoader avatarLoader2 = this.f10273e;
            if (avatarLoader2 != null) {
                ImageView imageView2 = (ImageView) mo34493b().findViewById(C3891l.group_avatar_1);
                C12932j.m33815a((Object) imageView2, "itemView.group_avatar_1");
                avatarLoader2.clear(imageView2);
                AvatarLoader avatarLoader3 = this.f10273e;
                if (avatarLoader3 != null) {
                    ImageView imageView3 = (ImageView) mo34493b().findViewById(C3891l.group_avatar_2);
                    C12932j.m33815a((Object) imageView3, "itemView.group_avatar_2");
                    avatarLoader3.clear(imageView3);
                    this.f10275g.mo36401a();
                    FrameLayout frameLayout = (FrameLayout) mo34493b().findViewById(C3891l.message_cursors);
                    C12932j.m33815a((Object) frameLayout, "itemView.message_cursors");
                    AvatarLoader avatarLoader4 = this.f10273e;
                    if (avatarLoader4 != null) {
                        C3137b.m9859a((ViewGroup) frameLayout, avatarLoader4);
                        super.mo6954f();
                        return;
                    }
                    C12932j.m33820c(str);
                    throw null;
                }
                C12932j.m33820c(str);
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33820c(str);
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        this.f10273e = new C2477e(context);
        view.setHapticFeedbackEnabled(false);
        view.setOnClickListener(new C3877d(this, view));
        view.setOnLongClickListener(new C3878e(this, view));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3884a aVar, C3884a aVar2) {
        List list;
        C12932j.m33818b(aVar, "model");
        View b = mo34493b();
        AppCompatTextView appCompatTextView = (AppCompatTextView) b.findViewById(C3891l.time);
        C12932j.m33815a((Object) appCompatTextView, "time");
        appCompatTextView.setVisibility(8);
        FrameLayout frameLayout = (FrameLayout) b.findViewById(C3891l.status_container);
        C12932j.m33815a((Object) frameLayout, "status_container");
        frameLayout.setVisibility(8);
        ImageView imageView = (ImageView) b.findViewById(C3891l.status);
        C12932j.m33815a((Object) imageView, "status");
        imageView.setVisibility(8);
        TextView textView = (TextView) b.findViewById(C3891l.unread_indicator);
        C12932j.m33815a((Object) textView, "unread_indicator");
        textView.setVisibility(8);
        FrameLayout frameLayout2 = (FrameLayout) b.findViewById(C3891l.group_avatar);
        C12932j.m33815a((Object) frameLayout2, "group_avatar");
        frameLayout2.setVisibility(8);
        FrameLayout frameLayout3 = (FrameLayout) b.findViewById(C3891l.message_cursors);
        C12932j.m33815a((Object) frameLayout3, "message_cursors");
        frameLayout3.setVisibility(4);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo34493b().findViewById(C3891l.title);
        C12932j.m33815a((Object) appCompatTextView2, "itemView.title");
        appCompatTextView2.setText(aVar.mo10479g());
        String str = "avatarLoader";
        String str2 = "itemView.avatar";
        if (aVar.mo10478f().getIsGroup()) {
            ImageView imageView2 = (ImageView) mo34493b().findViewById(C3891l.avatar);
            C12932j.m33815a((Object) imageView2, str2);
            imageView2.setVisibility(8);
            FrameLayout frameLayout4 = (FrameLayout) mo34493b().findViewById(C3891l.group_avatar);
            C12932j.m33815a((Object) frameLayout4, "itemView.group_avatar");
            frameLayout4.setVisibility(0);
            if (aVar.mo10478f().getAvatarsList().size() < 2) {
                List avatarsList = aVar.mo10478f().getAvatarsList();
                C12932j.m33815a((Object) avatarsList, "model.conversation.avatarsList");
                list = C12857w.m33670b((Collection) avatarsList, (Iterable) C12857w.m33675c((Iterable) C12848o.m33643b((Object[]) new UserProto$User[]{UserProto$User.getDefaultInstance(), UserProto$User.getDefaultInstance()}), 2));
            } else {
                list = aVar.mo10478f().getAvatarsList();
            }
            AvatarLoader avatarLoader = this.f10273e;
            if (avatarLoader != null) {
                Object obj = list.get(0);
                C12932j.m33815a(obj, "users[0]");
                Request load = avatarLoader.load(C2884f.m9355a((UserProto$User) obj));
                ImageView imageView3 = (ImageView) mo34493b().findViewById(C3891l.group_avatar_1);
                String str3 = "itemView.group_avatar_1";
                C12932j.m33815a((Object) imageView3, str3);
                load.into(imageView3);
                TypedValue typedValue = new TypedValue();
                ImageView imageView4 = (ImageView) mo34493b().findViewById(C3891l.group_avatar_1);
                C12932j.m33815a((Object) imageView4, str3);
                Context context = imageView4.getContext();
                C12932j.m33815a((Object) context, "itemView.group_avatar_1.context");
                context.getTheme().resolveAttribute(R.attr.zenlyColorBackground, typedValue, true);
                AvatarLoader avatarLoader2 = this.f10273e;
                if (avatarLoader2 != null) {
                    Object obj2 = list.get(1);
                    C12932j.m33815a(obj2, "users[1]");
                    Request withBorder = avatarLoader2.load(C2884f.m9355a((UserProto$User) obj2)).withBorder(R.dimen.stroke_50, typedValue.resourceId);
                    ImageView imageView5 = (ImageView) mo34493b().findViewById(C3891l.group_avatar_2);
                    C12932j.m33815a((Object) imageView5, "itemView.group_avatar_2");
                    withBorder.into(imageView5);
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            ImageView imageView6 = (ImageView) mo34493b().findViewById(C3891l.avatar);
            C12932j.m33815a((Object) imageView6, str2);
            imageView6.setVisibility(0);
            AvatarLoader avatarLoader3 = this.f10273e;
            if (avatarLoader3 != null) {
                Object obj3 = aVar.mo10478f().getAvatarsList().get(0);
                C12932j.m33815a(obj3, "model.conversation.avatarsList[0]");
                Request load2 = avatarLoader3.load(C2884f.m9355a((UserProto$User) obj3));
                ImageView imageView7 = (ImageView) mo34493b().findViewById(C3891l.avatar);
                C12932j.m33815a((Object) imageView7, str2);
                load2.into(imageView7);
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        }
        if (aVar.mo10482j() != null) {
            m11409a(aVar, aVar.mo10482j());
            m11408a(aVar);
            m11411b(aVar);
            return;
        }
        ((AppCompatTextView) mo34493b().findViewById(C3891l.subtitle)).setText(R.string.inbox_inboxcell_label_startconversation);
        m11408a(aVar);
    }

    /* renamed from: b */
    private final void m11411b(C3884a aVar) {
        int i;
        Context context = mo34493b().getContext();
        int nbPing = aVar.mo10478f().getNbPing() + aVar.mo10478f().getNbChat();
        int i2 = 0;
        boolean z = nbPing > 0;
        if (z) {
            TextView textView = (TextView) mo34493b().findViewById(C3891l.unread_indicator);
            textView.setVisibility(0);
            C12932j.m33815a((Object) context, "context");
            textView.setText(C7706a.m18752a(context, nbPing, 9));
        } else {
            TextView textView2 = (TextView) mo34493b().findViewById(C3891l.unread_indicator);
            C12932j.m33815a((Object) textView2, "itemView.unread_indicator");
            textView2.setVisibility(8);
        }
        List a = z ? C12848o.m33640a() : aVar.mo10484l();
        FrameLayout frameLayout = (FrameLayout) mo34493b().findViewById(C3891l.message_cursors);
        C12932j.m33815a((Object) frameLayout, "it");
        frameLayout.setVisibility(0);
        if (a.isEmpty()) {
            AvatarLoader avatarLoader = this.f10273e;
            if (avatarLoader != null) {
                C3137b.m9861a(frameLayout, avatarLoader, C12848o.m33640a(), 0, false, 12, null);
            } else {
                C12932j.m33820c("avatarLoader");
                throw null;
            }
        } else {
            Disposable a2 = C12279e.m32623b((Iterable<? extends T>) a).mo36487e((long) 3).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) C3876c.f10281e).mo36511n().mo36535a((C12286f) this.f10274f.getMainThread()).mo36533a((Consumer<? super T>) new C3874a<Object>(frameLayout, this, a), (Consumer<? super Throwable>) new C3875b<Object>(frameLayout, this, a));
            C12932j.m33815a((Object) a2, "Observable.fromIterable(…      }\n                )");
            C12773a.m33432a(a2, this.f10275g);
        }
        C7119b lastMsgState = aVar.mo10478f().getLastMsgState();
        if (aVar.mo10485m()) {
            if (lastMsgState != null) {
                int i3 = C3872a.f10272c[lastMsgState.ordinal()];
                if (i3 == 1) {
                    i = R.drawable.ic_inbox_sending_size_16;
                } else if (i3 == 2) {
                    i = R.drawable.ic_inbox_error_size_16;
                } else if (i3 == 3) {
                    i = R.drawable.ic_inbox_sent_size_16;
                }
            }
            i = C7674a.f19294a;
        } else {
            i = C7674a.f19294a;
        }
        String str = "itemView.status";
        if (!C7674a.m18692a(i) || (lastMsgState == C7119b.LAST_MSG_STATE_READ && !a.isEmpty())) {
            ImageView imageView = (ImageView) mo34493b().findViewById(C3891l.status);
            C12932j.m33815a((Object) imageView, str);
            imageView.setVisibility(8);
        } else {
            ((ImageView) mo34493b().findViewById(C3891l.status)).setImageResource(i);
            ImageView imageView2 = (ImageView) mo34493b().findViewById(C3891l.status);
            C12932j.m33815a((Object) imageView2, str);
            imageView2.setVisibility(0);
        }
        FrameLayout frameLayout2 = (FrameLayout) mo34493b().findViewById(C3891l.status_container);
        C12932j.m33815a((Object) frameLayout2, "itemView.status_container");
        if (!z && !C7674a.m18692a(i) && !(!a.isEmpty())) {
            i2 = 8;
        }
        frameLayout2.setVisibility(i2);
        mo34493b().setActivated(z);
        C0680h.m3189d((AppCompatTextView) mo34493b().findViewById(C3891l.title), z ? C7770f.TextAppearance_PrimaryBody : C7770f.TextAppearance_SecondaryBody);
        ((AppCompatTextView) mo34493b().findViewById(C3891l.subtitle)).setTextColor(C0540a.m2536a(context, (int) R.color.blue_black));
        C0680h.m3189d((AppCompatTextView) mo34493b().findViewById(C3891l.subtitle), z ? C7770f.TextAppearance_InboxSubtitleUnread : C7770f.TextAppearance_TertiaryBody);
        ((AppCompatTextView) mo34493b().findViewById(C3891l.subtitle)).setTextColor(C0540a.m2543b(context, (int) R.color.inbox_text_secondary));
    }

    /* renamed from: a */
    private final void m11409a(C3884a aVar, C1949d dVar) {
        Resources resources = mo34493b().getResources();
        C7117i f = aVar.mo10478f();
        C6824b content = dVar.f6310c.getContent(0);
        String str = null;
        String str2 = "content";
        if (dVar.mo7715f()) {
            C12932j.m33815a((Object) content, str2);
            C6826b type = content.getType();
            if (type != null) {
                int i = C3872a.f10270a[type.ordinal()];
                if (i == 1) {
                    str = resources.getString(R.string.inbox_inboxcell_label_emojis_sent);
                } else if (i == 2) {
                    str = aVar.mo10480h() ? resources.getString(R.string.inbox_inboxcell_label_error_picture_send) : resources.getString(R.string.inbox_inboxcell_label_picture_sent);
                } else if (i == 3) {
                    str = content.getText();
                }
            }
        } else {
            C12932j.m33815a((Object) content, str2);
            C6826b type2 = content.getType();
            if (type2 != null) {
                int i2 = C3872a.f10271b[type2.ordinal()];
                if (i2 == 1) {
                    str = f.getNbPing() > 0 ? resources.getString(R.string.inbox_inboxcell_label_pingreceivedunread) : resources.getString(R.string.inbox_inboxcell_label_pingreceivedread);
                } else if (i2 == 2) {
                    str = resources.getString(R.string.inbox_inboxcell_label_picture_received);
                } else if (i2 == 3) {
                    str = content.getText();
                }
            }
        }
        String str3 = "itemView.subtitle";
        if (str == null || str.length() == 0) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo34493b().findViewById(C3891l.subtitle);
            C12932j.m33815a((Object) appCompatTextView, str3);
            appCompatTextView.setVisibility(8);
            return;
        }
        if (dVar.mo7709b() && !dVar.mo7715f()) {
            str = resources.getString(R.string.chat_reportdialog_title_messagereported);
        } else if (dVar.mo7708a()) {
            str = resources.getString(R.string.chat_deletedialog_title_messagedeleted);
        } else if (!dVar.mo7717h()) {
            if (aVar.mo10485m()) {
                str = resources.getString(R.string.inbox_inboxcell_label_from_you, new Object[]{str});
                C12932j.m33815a((Object) str, "res.getString(R.string.i…ell_label_from_you, text)");
            } else if (aVar.mo10478f().getIsGroup() && aVar.mo10483k() != null) {
                str = resources.getString(R.string.inbox_inboxcell_label_from_other, new Object[]{aVar.mo10483k().getNickname(), str});
                C12932j.m33815a((Object) str, "res.getString(R.string.i…ageAuthor.nickname, text)");
            }
        }
        C12932j.m33815a((Object) str, "when {\n                l…          }\n            }");
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo34493b().findViewById(C3891l.subtitle);
        C12932j.m33815a((Object) appCompatTextView2, str3);
        appCompatTextView2.setText(str);
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) mo34493b().findViewById(C3891l.subtitle);
        C12932j.m33815a((Object) appCompatTextView3, str3);
        appCompatTextView3.setVisibility(0);
    }

    /* renamed from: a */
    private final void m11408a(C3884a aVar) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo34493b().findViewById(C3891l.time);
        String str = "itemView.time";
        C12932j.m33815a((Object) appCompatTextView, str);
        Context context = mo34493b().getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Timestamp modifiedAt = aVar.mo10478f().getModifiedAt();
        C12932j.m33815a((Object) modifiedAt, "model.conversation.modifiedAt");
        appCompatTextView.setText(C5518b.m15650b(context, timeUnit.toMillis(modifiedAt.getSeconds())));
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo34493b().findViewById(C3891l.time);
        C12932j.m33815a((Object) appCompatTextView2, str);
        appCompatTextView2.setVisibility(0);
    }
}
