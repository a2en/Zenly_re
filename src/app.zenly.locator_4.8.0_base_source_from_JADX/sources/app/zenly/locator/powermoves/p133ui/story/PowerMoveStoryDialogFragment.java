package app.zenly.locator.powermoves.p133ui.story;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0818n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0889u;
import androidx.lifecycle.C0890v;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.navigation.C0951d;
import androidx.navigation.fragment.C0957a;
import androidx.viewpager.widget.C1295a;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.C1293i;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import app.zenly.android.feature.base.app.C1320a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.powermoves.p127b.C4984a;
import app.zenly.locator.powermoves.p129d.C4995a;
import app.zenly.locator.powermoves.p129d.C5007c;
import app.zenly.locator.powermoves.p129d.p130d.C5016d;
import app.zenly.locator.powermoves.p129d.p131e.C5017a;
import java.util.HashMap;
import java.util.List;
import kotlin.C12899i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: app.zenly.locator.powermoves.ui.story.PowerMoveStoryDialogFragment */
public final class PowerMoveStoryDialogFragment extends C1320a {

    /* renamed from: v */
    static final /* synthetic */ KProperty[] f13102v;

    /* renamed from: r */
    private C5007c f13103r;

    /* renamed from: s */
    private C4995a f13104s;

    /* renamed from: t */
    private final C0951d f13105t = new C0951d(C12946x.m33834a(C5064f.class), new C5044a(this));

    /* renamed from: u */
    private HashMap f13106u;

    /* renamed from: app.zenly.locator.powermoves.ui.story.PowerMoveStoryDialogFragment$a */
    public static final class C5044a extends C12933k implements Function0<Bundle> {

        /* renamed from: f */
        final /* synthetic */ Fragment f13107f;

        public C5044a(Fragment fragment) {
            this.f13107f = fragment;
            super(0);
        }

        public final Bundle invoke() {
            Bundle arguments = this.f13107f.getArguments();
            if (arguments != null) {
                return arguments;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this.f13107f);
            sb.append(" has null arguments");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.story.PowerMoveStoryDialogFragment$b */
    private static final class C5045b extends C0818n {

        /* renamed from: i */
        private final List<C4984a> f13108i;

        public C5045b(FragmentManager fragmentManager, List<C4984a> list) {
            C12932j.m33818b(fragmentManager, "fm");
            C12932j.m33818b(list, "powerMoves");
            super(fragmentManager, 1);
            this.f13108i = list;
        }

        /* renamed from: b */
        public Fragment mo4309b(int i) {
            return C5048a.f13113n.mo12303a(i, ((C4984a) this.f13108i.get(i)).mo12216e());
        }

        public int getCount() {
            return this.f13108i.size();
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.story.PowerMoveStoryDialogFragment$c */
    static final class C5046c<T> implements Observer<C5016d> {

        /* renamed from: a */
        final /* synthetic */ PowerMoveStoryDialogFragment f13109a;

        C5046c(PowerMoveStoryDialogFragment powerMoveStoryDialogFragment) {
            this.f13109a = powerMoveStoryDialogFragment;
        }

        /* renamed from: a */
        public final void onChanged(C5016d dVar) {
            if (dVar != null) {
                int i = C5063e.f13136a[dVar.ordinal()];
                if (i == 1) {
                    this.f13109a.m14450j();
                } else if (i == 2) {
                    this.f13109a.m14448h();
                } else if (i == 3) {
                    this.f13109a.m14449i();
                } else if (i == 4) {
                    this.f13109a.m14446f();
                }
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
    }

    /* renamed from: app.zenly.locator.powermoves.ui.story.PowerMoveStoryDialogFragment$d */
    public static final class C5047d extends C1293i {

        /* renamed from: a */
        final /* synthetic */ List f13110a;

        /* renamed from: b */
        final /* synthetic */ PowerMoveStoryDialogFragment f13111b;

        C5047d(List list, PowerMoveStoryDialogFragment powerMoveStoryDialogFragment) {
            this.f13110a = list;
            this.f13111b = powerMoveStoryDialogFragment;
        }

        public void onPageSelected(int i) {
            PowerMoveStoryDialogFragment.m14442b(this.f13111b).mo12253a((C4984a) this.f13110a.get(i));
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(PowerMoveStoryDialogFragment.class), "args", "getArgs()Lapp/zenly/locator/powermoves/ui/story/PowerMoveStoryDialogFragmentArgs;");
        C12946x.m33839a((C12940r) sVar);
        f13102v = new KProperty[]{sVar};
    }

    /* renamed from: b */
    public static final /* synthetic */ C5007c m14442b(PowerMoveStoryDialogFragment powerMoveStoryDialogFragment) {
        C5007c cVar = powerMoveStoryDialogFragment.f13103r;
        if (cVar != null) {
            return cVar;
        }
        C12932j.m33820c("vm");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m14446f() {
        C0957a.m4290a(this).mo4647d();
    }

    /* renamed from: g */
    private final C5064f m14447g() {
        C0951d dVar = this.f13105t;
        KProperty kProperty = f13102v[0];
        return (C5064f) dVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m14448h() {
        ViewPager viewPager = (ViewPager) mo12299a(C3891l.playersViewPager);
        String str = "playersViewPager";
        C12932j.m33815a((Object) viewPager, str);
        C1295a adapter = viewPager.getAdapter();
        if (adapter != null) {
            int count = adapter.getCount();
            ViewPager viewPager2 = (ViewPager) mo12299a(C3891l.playersViewPager);
            C12932j.m33815a((Object) viewPager2, str);
            int currentItem = viewPager2.getCurrentItem() + 1;
            if (count == currentItem) {
                C0957a.m4290a(this).mo4647d();
            } else {
                ((ViewPager) mo12299a(C3891l.playersViewPager)).mo6328a(currentItem, true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m14449i() {
        ViewPager viewPager = (ViewPager) mo12299a(C3891l.playersViewPager);
        C12932j.m33815a((Object) viewPager, "playersViewPager");
        int currentItem = viewPager.getCurrentItem();
        if (currentItem > 0) {
            ((ViewPager) mo12299a(C3891l.playersViewPager)).mo6328a(currentItem - 1, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m14450j() {
        C5007c cVar = this.f13103r;
        String str = "vm";
        if (cVar != null) {
            C5017a e = cVar.mo12255e();
            Object e2 = e.mo12263e();
            C12899i iVar = e2 != null ? e2 instanceof C12899i : true ? (C12899i) e.mo12263e() : null;
            if (iVar != null) {
                List list = (List) iVar.mo37202a();
                int intValue = ((Number) iVar.mo37203b()).intValue();
                FragmentManager childFragmentManager = getChildFragmentManager();
                C12932j.m33815a((Object) childFragmentManager, "childFragmentManager");
                C5045b bVar = new C5045b(childFragmentManager, list);
                ViewPager viewPager = (ViewPager) mo12299a(C3891l.playersViewPager);
                C12932j.m33815a((Object) viewPager, "playersViewPager");
                viewPager.setAdapter(bVar);
                ((ViewPager) mo12299a(C3891l.playersViewPager)).mo6328a(intValue, false);
                C5007c cVar2 = this.f13103r;
                if (cVar2 != null) {
                    cVar2.mo12253a((C4984a) list.get(intValue));
                    ((ViewPager) mo12299a(C3891l.playersViewPager)).mo6331a((OnPageChangeListener) new C5047d(list, this));
                    return;
                }
                C12932j.m33820c(str);
                throw null;
            }
            return;
        }
        C12932j.m33820c(str);
        throw null;
    }

    /* renamed from: a */
    public View mo12299a(int i) {
        if (this.f13106u == null) {
            this.f13106u = new HashMap();
        }
        View view = (View) this.f13106u.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f13106u.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: c */
    public int mo4208c() {
        return 2132083176;
    }

    /* renamed from: e */
    public void mo6506e() {
        HashMap hashMap = this.f13106u;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0889u a = C0890v.m4098a(requireActivity()).mo4415a(C5007c.class);
        C12932j.m33815a((Object) a, "ViewModelProviders.of(re…oryViewModel::class.java)");
        this.f13103r = (C5007c) a;
        C0889u a2 = C0890v.m4098a(requireActivity()).mo4415a(C4995a.class);
        C12932j.m33815a((Object) a2, "ViewModelProviders.of(re…eedViewModel::class.java)");
        this.f13104s = (C4995a) a2;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.dialog_fragment_power_move_story, viewGroup, false);
    }

    public void onDestroyView() {
        C4995a aVar = this.f13104s;
        if (aVar != null) {
            aVar.mo12240g();
            super.onDestroyView();
            mo6506e();
            return;
        }
        C12932j.m33820c("parentVm");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        C5007c cVar = this.f13103r;
        String str = "vm";
        if (cVar != null) {
            cVar.mo12255e().mo12261b((LifecycleOwner) this, (Observer<? super A>) new C5046c<Object>(this));
            C5007c cVar2 = this.f13103r;
            if (cVar2 != null) {
                cVar2.mo12254b(m14447g().mo12314a());
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
