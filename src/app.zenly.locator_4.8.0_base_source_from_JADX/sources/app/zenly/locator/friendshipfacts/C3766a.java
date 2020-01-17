package app.zenly.locator.friendshipfacts;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Rect;
import android.preference.PreferenceManager;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.base.scheduling.C1342b;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.polenta.widget.EmptyView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.cards.C1798a;
import app.zenly.locator.cards.CardSwitcherActivity;
import app.zenly.locator.cards.CardSwitcherActivity.C1767a;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.store.C3034i;
import app.zenly.locator.core.store.C3045k;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.store.p071di.StoreModule;
import app.zenly.locator.friendshipfacts.p097j.C3797a;
import app.zenly.locator.friendshipfacts.p097j.C3798b;
import app.zenly.locator.friendshipfacts.p097j.C3799c;
import app.zenly.locator.friendshipfacts.p099l.C3809c;
import app.zenly.locator.friendshipfacts.p100m.C3816f;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.bluelinelabs.conductor.C8819d;
import com.snap.p327ui.event.C11700c;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.adapter.C11705b;
import com.snap.p327ui.recycling.factory.C11727c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.friendshipfacts.a */
public final class C3766a extends ZenlyController {

    /* renamed from: P */
    private final C12275b f10071P = new C12275b();

    /* renamed from: Q */
    private C11705b f10072Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final C12785a<Integer> f10073R;

    /* renamed from: S */
    private final ZenlySchedulers f10074S;

    /* renamed from: T */
    private C3773d f10075T;

    /* renamed from: U */
    private SharedPreferences f10076U;

    /* renamed from: app.zenly.locator.friendshipfacts.a$a */
    public final class C3767a {
        public C3767a() {
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C3798b bVar) {
            C12932j.m33818b(bVar, "event");
            String str = "TST_FILTER_MODE";
            int i = 2;
            if (C3766a.m11224b(C3766a.this).getInt(str, 2) == 2) {
                i = 3;
            }
            Editor edit = C3766a.m11224b(C3766a.this).edit();
            C12932j.m33815a((Object) edit, "this");
            edit.putInt(str, i);
            edit.apply();
            C3766a.this.f10073R.onNext(Integer.valueOf(i));
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C3797a aVar) {
            List<C3809c> list;
            C12932j.m33818b(aVar, "event");
            C3809c a = aVar.mo10363a();
            if (a.mo10388b() < 0) {
                C5343a.m15160U().mo12798M();
                list = C3766a.m11220a(C3766a.this).mo10340b();
            } else {
                C5343a.m15160U().mo12799N();
                list = C3766a.m11220a(C3766a.this).mo10341c();
            }
            Activity A = C3766a.this.mo9304A();
            C12932j.m33815a((Object) A, "requireActivity()");
            C5498a.m15602a(C5498a.f14119e.mo13125a(A), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            C1767a aVar2 = CardSwitcherActivity.f5873p;
            ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
            for (C3809c a2 : list) {
                arrayList.add(C1798a.m7228a(a2));
            }
            aVar2.mo7358a(A, arrayList, list.indexOf(a), 301);
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C3799c cVar) {
            C12932j.m33818b(cVar, "event");
            C3766a.this.m11223a(cVar.mo10364a());
        }
    }

    /* renamed from: app.zenly.locator.friendshipfacts.a$b */
    static final class C3768b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3766a f10078e;

        C3768b(C3766a aVar) {
            this.f10078e = aVar;
        }

        public final void onClick(View view) {
            C8819d l = this.f10078e.mo23947l();
            if (l != null) {
                NavigationContract navigationContract = (NavigationContract) l;
                C12932j.m33815a((Object) view, "it");
                navigationContract.handleFriendshipFactsPlaceholderActionClick(view.getContext());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.core.contracts.NavigationContract");
        }
    }

    /* renamed from: app.zenly.locator.friendshipfacts.a$c */
    static final class C3769c<T> implements Predicate<UserProto$User> {

        /* renamed from: e */
        public static final C3769c f10079e = new C3769c();

        C3769c() {
        }

        /* renamed from: a */
        public final boolean test(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "it");
            return userProto$User.getFriendsCount() >= 8;
        }
    }

    /* renamed from: app.zenly.locator.friendshipfacts.a$d */
    static final class C3770d<T> implements Consumer<UserProto$User> {

        /* renamed from: e */
        final /* synthetic */ ViewGroup f10080e;

        /* renamed from: f */
        final /* synthetic */ View f10081f;

        C3770d(ViewGroup viewGroup, View view) {
            this.f10080e = viewGroup;
            this.f10081f = view;
        }

        /* renamed from: a */
        public final void accept(UserProto$User userProto$User) {
            this.f10080e.removeView(this.f10081f);
        }
    }

    public C3766a() {
        C12785a<Integer> u = C12785a.m33447u();
        C12932j.m33815a((Object) u, "BehaviorSubject.create<Int>()");
        this.f10073R = u;
        this.f10074S = C1351e.m6372a(C3771b.f10082b.mo19916a("adapter"));
    }

    /* renamed from: a */
    public static final /* synthetic */ C3773d m11220a(C3766a aVar) {
        C3773d dVar = aVar.f10075T;
        if (dVar != null) {
            return dVar;
        }
        C12932j.m33820c("friendshipFactsSection");
        throw null;
    }

    /* renamed from: b */
    public static final /* synthetic */ SharedPreferences m11224b(C3766a aVar) {
        SharedPreferences sharedPreferences = aVar.f10076U;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        C12932j.m33820c("sharedPreferences");
        throw null;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C3891l.recycler_view);
        C12932j.m33815a((Object) recyclerView, "view.recycler_view");
        recyclerView.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(C3891l.friendship_facts_locked);
        if (constraintLayout != null) {
            constraintLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo10333r() {
        this.f10071P.mo36401a();
        super.mo10333r();
    }

    /* renamed from: b */
    private final LinkedHashMap<Integer, String> m11225b(Context context, C3816f fVar) {
        long j;
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        UserProto$User e = fVar.mo10400f().mo10382e();
        boolean z = fVar.mo10401g() % TimeUnit.HOURS.toMillis(1) > 0;
        if (z) {
            j = TimeUnit.MILLISECONDS.toHours(fVar.mo10401g());
        } else {
            j = TimeUnit.MILLISECONDS.toMinutes(fVar.mo10401g());
        }
        int i = z ? fVar.mo10404j() ? R.plurals.timetogether_hidden_modal_timespent : R.plurals.timetogether_hidden_modal_timespent_short : fVar.mo10404j() ? R.plurals.timetogether_hidden_modal_timespent_min : R.plurals.timetogether_hidden_modal_timespent_min_short;
        String quantityString = context.getResources().getQuantityString(i, (int) j, new Object[]{Long.valueOf(j), e.getName()});
        C12932j.m33815a((Object) quantityString, "context.resources.getQua…      user.name\n        )");
        linkedHashMap.put(Integer.valueOf(2131231409), quantityString);
        if (fVar.mo10400f().mo10379b() > 0) {
            String string = context.getString(R.string.timetogether_hidden_modal_streak, new Object[]{e.getName(), Integer.valueOf(fVar.mo10400f().mo10379b())});
            C12932j.m33815a((Object) string, "context.getString(\n     …iend.streak\n            )");
            linkedHashMap.put(Integer.valueOf(2131231448), string);
        } else if (fVar.mo10400f().mo10384f()) {
            String string2 = context.getString(R.string.timetogether_hidden_modal_ghost, new Object[]{e.getName()});
            C12932j.m33815a((Object) string2, "context.getString(\n     …, user.name\n            )");
            linkedHashMap.put(Integer.valueOf(2131231587), string2);
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        C12932j.m33818b(layoutInflater2, "inflater");
        C12932j.m33818b(viewGroup2, "container");
        boolean z = false;
        View inflate = layoutInflater2.inflate(R.layout.controller_friendship_facts, viewGroup2, false);
        if (inflate != null) {
            ViewGroup viewGroup3 = (ViewGroup) inflate;
            RecyclerView recyclerView = (RecyclerView) viewGroup3.findViewById(C3891l.recycler_view);
            C11727c cVar = new C11727c(C12846n.m33635a(C3781e.class));
            C11700c cVar2 = new C11700c();
            cVar2.mo34449b(new C3767a());
            this.f10071P.add(cVar2);
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(mo23920b());
            C12932j.m33815a((Object) defaultSharedPreferences, "PreferenceManager.getDef…aredPreferences(activity)");
            this.f10076U = defaultSharedPreferences;
            C12785a<Integer> aVar = this.f10073R;
            SharedPreferences sharedPreferences = this.f10076U;
            if (sharedPreferences != null) {
                aVar.onNext(Integer.valueOf(sharedPreferences.getInt("TST_FILTER_MODE", 2)));
                Activity A = mo9304A();
                String str = "requireActivity()";
                C12932j.m33815a((Object) A, str);
                int c = C2666b.m9049a(A).mo8764b().mo8756b().f8250a.mo8940c();
                if (c < 8) {
                    z = true;
                }
                if (z) {
                    m11221a(c, viewGroup3);
                }
                C5343a.m15160U().mo12887g(z);
                Activity A2 = mo9304A();
                C12932j.m33815a((Object) A2, str);
                StoreModule a = C3015a.m9526a(A2);
                Activity A3 = mo9304A();
                C12932j.m33815a((Object) A3, str);
                EventDispatcher a2 = cVar2.mo34447a();
                String str2 = "bus.eventDispatcher";
                C12932j.m33815a((Object) a2, str2);
                ZenlyCore a3 = C5448c.m15478a();
                C3034i provideFriendStore = a.provideFriendStore();
                C3045k provideFriendshipStore = a.provideFriendshipStore();
                C12279e a4 = this.f10073R.mo36428a((C12286f) this.f10074S.getComputation());
                C12932j.m33815a((Object) a4, "tstFilterModeSubject.obs…n(schedulers.computation)");
                String str3 = str2;
                ViewGroup viewGroup4 = viewGroup3;
                C3773d dVar = r4;
                C3773d dVar2 = new C3773d(A3, cVar, a2, a3, provideFriendStore, provideFriendshipStore, a4);
                this.f10075T = dVar;
                EventDispatcher a5 = cVar2.mo34447a();
                C12932j.m33815a((Object) a5, str3);
                C1342b computation = this.f10074S.getComputation();
                C1342b mainThread = this.f10074S.getMainThread();
                C3773d dVar3 = this.f10075T;
                if (dVar3 != null) {
                    C11705b bVar = new C11705b(cVar, a5, computation, mainThread, C12846n.m33635a(dVar3), null, 32, null);
                    this.f10072Q = bVar;
                    C12932j.m33815a((Object) recyclerView, "recyclerView");
                    C11705b bVar2 = this.f10072Q;
                    String str4 = "adapter";
                    if (bVar2 != null) {
                        recyclerView.setAdapter(bVar2);
                        recyclerView.setHasFixedSize(true);
                        recyclerView.setItemAnimator(null);
                        C11705b bVar3 = this.f10072Q;
                        if (bVar3 != null) {
                            C12773a.m33432a(bVar3.mo34464b(), this.f10071P);
                            Activity A4 = mo9304A();
                            C12932j.m33815a((Object) A4, str);
                            C3772c.m11231a(A4).provideFriendshipFactsPrefs().onFriendshipFactsVisited();
                            return viewGroup4;
                        }
                        C12932j.m33820c(str4);
                        throw null;
                    }
                    C12932j.m33820c(str4);
                    throw null;
                }
                C12932j.m33820c("friendshipFactsSection");
                throw null;
            }
            C12932j.m33820c("sharedPreferences");
            throw null;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    private final void m11221a(int i, ViewGroup viewGroup) {
        int i2 = 8 - i;
        View inflate = ((ViewStub) viewGroup.findViewById(C3891l.locked_state_stub)).inflate();
        C12932j.m33815a((Object) inflate, "lockedStateView");
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(C3891l.subtitle);
        C12932j.m33815a((Object) appCompatTextView, "lockedStateView.subtitle");
        Activity A = mo9304A();
        String str = "requireActivity()";
        C12932j.m33815a((Object) A, str);
        appCompatTextView.setText(C7709b.m18762a(A, R.string.tst_emptystate_subtitle));
        EmptyView emptyView = (EmptyView) inflate.findViewById(C3891l.empty_view);
        Activity A2 = mo9304A();
        C12932j.m33815a((Object) A2, str);
        String string = viewGroup.getResources().getString(R.string.tst_emptystate_message_bold);
        C12932j.m33815a((Object) string, "rootView.resources.getSt…_emptystate_message_bold)");
        emptyView.setSubtitle((CharSequence) C7709b.m18763a(A2, R.string.tst_emptystate_message, string));
        EmptyView emptyView2 = (EmptyView) inflate.findViewById(C3891l.empty_view);
        Activity A3 = mo9304A();
        C12932j.m33815a((Object) A3, str);
        String quantityString = A3.getResources().getQuantityString(R.plurals.tst_emptystate_cta, i2, new Object[]{Integer.valueOf(i2)});
        C12932j.m33815a((Object) quantityString, "requireActivity().resour… missingFriends\n        )");
        emptyView2.setActionText(quantityString);
        ((EmptyView) inflate.findViewById(C3891l.empty_view)).setOnActionClickListener(new C3768b(this));
        ViewCompat.m2809I(inflate);
        Disposable d = C5448c.m15478a().userMeStream().mo36428a((C12286f) this.f10074S.getComputation()).mo36459b((Predicate<? super T>) C3769c.f10079e).mo36487e(1).mo36428a((C12286f) this.f10074S.getMainThread()).mo36476d((Consumer<? super T>) new C3770d<Object>(viewGroup, inflate));
        C12932j.m33815a((Object) d, "ZenlyCoreProvider.get().…dStateView)\n            }");
        C12773a.m33432a(d, this.f10071P);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11223a(C3816f fVar) {
        Activity A = mo9304A();
        C12932j.m33815a((Object) A, "requireActivity()");
        C3106c cVar = new C3106c(A);
        cVar.mo9334a(fVar.mo10400f().mo10382e());
        cVar.mo9346c(fVar.mo10400f().mo10382e().getName());
        cVar.mo9350g(17);
        cVar.mo9333a(m11219a((Context) A, fVar));
        cVar.mo9345c((int) R.string.commons_button_ok);
        cVar.mo9301a(true).mo9344b().mo9296j(A);
    }

    /* renamed from: a */
    private final View m11219a(Context context, C3816f fVar) {
        LinkedHashMap b = m11225b(context, fVar);
        LayoutInflater from = LayoutInflater.from(new ContextThemeWrapper(context, 2132083208));
        View inflate = from.inflate(R.layout.dialog_content_list, null);
        if (inflate != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            for (Entry entry : b.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                String str = (String) entry.getValue();
                View inflate2 = from.inflate(R.layout.list_item_dialog, linearLayout, false);
                View findViewById = inflate2.findViewById(R.id.image);
                if (findViewById != null) {
                    ((ImageView) findViewById).setImageResource(intValue);
                    View findViewById2 = inflate2.findViewById(R.id.subtitle);
                    if (findViewById2 != null) {
                        ((TextView) findViewById2).setText(str);
                        linearLayout.addView(inflate2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
                }
            }
            return linearLayout;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.android.base.widget.LinearLayout");
    }
}
