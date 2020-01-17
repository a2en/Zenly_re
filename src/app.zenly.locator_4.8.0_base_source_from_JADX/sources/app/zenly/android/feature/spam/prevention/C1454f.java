package app.zenly.android.feature.spam.prevention;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1071i;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.android.feature.polenta.widget.EmptyView;
import app.zenly.android.feature.spam.prevention.p015l.C1466a;
import app.zenly.android.feature.spam.prevention.repository.SpamPreventionRepository;
import com.snap.p327ui.event.C11700c;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.adapter.C11705b;
import com.snap.p327ui.recycling.factory.C11727c;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: app.zenly.android.feature.spam.prevention.f */
public final class C1454f extends C1321b {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12275b f5261f = new C12275b();

    /* renamed from: g */
    private C11705b f5262g;

    /* renamed from: h */
    private final C1456b f5263h = new C1456b();

    /* renamed from: i */
    private HashMap f5264i;

    /* renamed from: app.zenly.android.feature.spam.prevention.f$a */
    public static final class C1455a {
        private C1455a() {
        }

        public /* synthetic */ C1455a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.android.feature.spam.prevention.f$b */
    public final class C1456b extends C1071i {
        public C1456b() {
        }

        /* renamed from: a */
        public void mo5419a() {
            m6549b();
        }

        /* renamed from: b */
        public void mo5423b(int i, int i2) {
            m6549b();
        }

        /* renamed from: c */
        public void mo5424c(int i, int i2) {
            m6549b();
        }

        /* renamed from: b */
        private final void m6549b() {
            int itemCount = C1454f.m6546b(C1454f.this).getItemCount() - 1;
            String str = "progress_view";
            String str2 = "empty_view";
            String str3 = "recycler_view";
            String str4 = "cancel_all_btn";
            String str5 = "pending_invites";
            if (itemCount <= 0) {
                ((TextView) C1454f.this.mo6941a(C1450b.title)).setText(C1453e.spamPrevention_view_empty_title);
                TextView textView = (TextView) C1454f.this.mo6941a(C1450b.pending_invites);
                C12932j.m33815a((Object) textView, str5);
                textView.setVisibility(8);
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) C1454f.this.mo6941a(C1450b.cancel_all_btn);
                C12932j.m33815a((Object) appCompatImageButton, str4);
                appCompatImageButton.setVisibility(8);
                RecyclerView recyclerView = (RecyclerView) C1454f.this.mo6941a(C1450b.recycler_view);
                C12932j.m33815a((Object) recyclerView, str3);
                recyclerView.setVisibility(4);
                EmptyView emptyView = (EmptyView) C1454f.this.mo6941a(C1450b.empty_view);
                C12932j.m33815a((Object) emptyView, str2);
                emptyView.setVisibility(0);
                ProgressBar progressBar = (ProgressBar) C1454f.this.mo6941a(C1450b.progress_view);
                C12932j.m33815a((Object) progressBar, str);
                progressBar.setVisibility(4);
                return;
            }
            ((TextView) C1454f.this.mo6941a(C1450b.title)).setText(C1453e.spamPrevention_view_title);
            TextView textView2 = (TextView) C1454f.this.mo6941a(C1450b.pending_invites);
            C12932j.m33815a((Object) textView2, str5);
            textView2.setVisibility(0);
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) C1454f.this.mo6941a(C1450b.cancel_all_btn);
            C12932j.m33815a((Object) appCompatImageButton2, str4);
            appCompatImageButton2.setVisibility(0);
            TextView textView3 = (TextView) C1454f.this.mo6941a(C1450b.pending_invites);
            C12932j.m33815a((Object) textView3, str5);
            textView3.setText(C1454f.this.getResources().getQuantityString(C1452d.spamPrevention_view_header_invites, itemCount, new Object[]{Integer.valueOf(itemCount)}));
            RecyclerView recyclerView2 = (RecyclerView) C1454f.this.mo6941a(C1450b.recycler_view);
            C12932j.m33815a((Object) recyclerView2, str3);
            recyclerView2.setVisibility(0);
            EmptyView emptyView2 = (EmptyView) C1454f.this.mo6941a(C1450b.empty_view);
            C12932j.m33815a((Object) emptyView2, str2);
            emptyView2.setVisibility(4);
            ProgressBar progressBar2 = (ProgressBar) C1454f.this.mo6941a(C1450b.progress_view);
            C12932j.m33815a((Object) progressBar2, str);
            progressBar2.setVisibility(4);
        }

        /* renamed from: a */
        public void mo5421a(int i, int i2, int i3) {
            m6549b();
        }

        /* renamed from: a */
        public void mo5420a(int i, int i2) {
            m6549b();
        }

        /* renamed from: a */
        public void mo5422a(int i, int i2, Object obj) {
            m6549b();
        }
    }

    /* renamed from: app.zenly.android.feature.spam.prevention.f$c */
    public static final class C1457c {

        /* renamed from: a */
        private final SpamPreventionRepository f5266a;

        /* renamed from: b */
        private final C12275b f5267b;

        public C1457c(SpamPreventionRepository spamPreventionRepository, C12275b bVar) {
            C12932j.m33818b(spamPreventionRepository, "repository");
            C12932j.m33818b(bVar, "compositeDisposable");
            this.f5266a = spamPreventionRepository;
            this.f5267b = bVar;
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onCancelEvent(C1466a aVar) {
            C12932j.m33818b(aVar, "event");
            Disposable m = this.f5266a.cancelFriendRequest(aVar.mo6956a()).mo36508m();
            C12932j.m33815a((Object) m, "repository.cancelFriendR…t(event.uuid).subscribe()");
            C12773a.m33432a(m, this.f5267b);
        }
    }

    /* renamed from: app.zenly.android.feature.spam.prevention.f$d */
    static final class C1458d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1454f f5268e;

        /* renamed from: f */
        final /* synthetic */ SpamPreventionRepository f5269f;

        C1458d(C1454f fVar, SpamPreventionRepository spamPreventionRepository) {
            this.f5268e = fVar;
            this.f5269f = spamPreventionRepository;
        }

        public final void onClick(View view) {
            Disposable m = this.f5269f.cancelAllFriendRequests().mo36508m();
            C12932j.m33815a((Object) m, "spamPreventionRepository…endRequests().subscribe()");
            C12773a.m33432a(m, this.f5268e.f5261f);
        }
    }

    static {
        new C1455a(null);
    }

    /* renamed from: b */
    public static final /* synthetic */ C11705b m6546b(C1454f fVar) {
        C11705b bVar = fVar.f5262g;
        if (bVar != null) {
            return bVar;
        }
        C12932j.m33820c("spamPreventionAdapter");
        throw null;
    }

    /* renamed from: a */
    public View mo6941a(int i) {
        if (this.f5264i == null) {
            this.f5264i = new HashMap();
        }
        View view = (View) this.f5264i.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f5264i.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f5264i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C1451c.fragment_spam_prevention, viewGroup, false);
        C12932j.m33815a((Object) inflate, "inflater.inflate(R.layou…ention, container, false)");
        return inflate;
    }

    public void onDestroyView() {
        C11705b bVar = this.f5262g;
        if (bVar != null) {
            bVar.unregisterAdapterDataObserver(this.f5263h);
            this.f5261f.mo36401a();
            super.onDestroyView();
            mo6508a();
            return;
        }
        C12932j.m33820c("spamPreventionAdapter");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        C12932j.m33815a((Object) requireContext, "requireContext()");
        SpamPreventionModule a = C1459g.m6556a(requireContext);
        SpamPreventionRepository provideSpamPreventionRepository = a.provideSpamPreventionRepository();
        C1461i iVar = new C1461i(provideSpamPreventionRepository, a.provideAvatarLoader());
        ((AppCompatImageButton) mo6941a(C1450b.cancel_all_btn)).setOnClickListener(new C1458d(this, provideSpamPreventionRepository));
        C11700c cVar = new C11700c();
        cVar.mo34449b(new C1457c(provideSpamPreventionRepository, this.f5261f));
        this.f5261f.add(cVar);
        C11727c cVar2 = new C11727c(C12846n.m33635a(C1463j.class));
        EventDispatcher a2 = cVar.mo34447a();
        C12932j.m33815a((Object) a2, "bus.eventDispatcher");
        C12286f a3 = C12802a.m33490a();
        C12932j.m33815a((Object) a3, "Schedulers.computation()");
        C12286f a4 = C12295a.m32802a();
        C12932j.m33815a((Object) a4, "AndroidSchedulers.mainThread()");
        C11705b bVar = new C11705b(cVar2, a2, a3, a4, C12846n.m33635a(iVar), null, 32, null);
        this.f5262g = bVar;
        RecyclerView recyclerView = (RecyclerView) mo6941a(C1450b.recycler_view);
        String str = "recycler_view";
        C12932j.m33815a((Object) recyclerView, str);
        recyclerView.setVisibility(4);
        TextView textView = (TextView) mo6941a(C1450b.pending_invites);
        C12932j.m33815a((Object) textView, "pending_invites");
        textView.setVisibility(8);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo6941a(C1450b.cancel_all_btn);
        C12932j.m33815a((Object) appCompatImageButton, "cancel_all_btn");
        appCompatImageButton.setVisibility(8);
        EmptyView emptyView = (EmptyView) mo6941a(C1450b.empty_view);
        C12932j.m33815a((Object) emptyView, "empty_view");
        emptyView.setVisibility(4);
        ProgressBar progressBar = (ProgressBar) mo6941a(C1450b.progress_view);
        C12932j.m33815a((Object) progressBar, "progress_view");
        progressBar.setVisibility(0);
        ((RecyclerView) mo6941a(C1450b.recycler_view)).setHasFixedSize(true);
        RecyclerView recyclerView2 = (RecyclerView) mo6941a(C1450b.recycler_view);
        C12932j.m33815a((Object) recyclerView2, str);
        C11705b bVar2 = this.f5262g;
        String str2 = "spamPreventionAdapter";
        if (bVar2 != null) {
            recyclerView2.setAdapter(bVar2);
            RecyclerView recyclerView3 = (RecyclerView) mo6941a(C1450b.recycler_view);
            C12932j.m33815a((Object) recyclerView3, str);
            recyclerView3.setItemAnimator(null);
            C11705b bVar3 = this.f5262g;
            if (bVar3 != null) {
                bVar3.registerAdapterDataObserver(this.f5263h);
                C11705b bVar4 = this.f5262g;
                if (bVar4 != null) {
                    C12773a.m33432a(bVar4.mo34464b(), this.f5261f);
                } else {
                    C12932j.m33820c(str2);
                    throw null;
                }
            } else {
                C12932j.m33820c(str2);
                throw null;
            }
        } else {
            C12932j.m33820c(str2);
            throw null;
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        View[] viewArr;
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(view.getLeft(), rect.top, view.getRight(), view.getBottom());
        int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(C1449a.grid_size_600);
        RecyclerView recyclerView = (RecyclerView) mo6941a(C1450b.recycler_view);
        int i = rect.left;
        RecyclerView recyclerView2 = (RecyclerView) mo6941a(C1450b.recycler_view);
        C12932j.m33815a((Object) recyclerView2, "recycler_view");
        recyclerView.setPadding(i, recyclerView2.getPaddingTop(), rect.right, rect.bottom + dimensionPixelOffset);
        for (View view2 : new View[]{(EmptyView) mo6941a(C1450b.empty_view), (ProgressBar) mo6941a(C1450b.progress_view)}) {
            int i2 = rect.left;
            C12932j.m33815a((Object) view2, "it");
            view2.setPadding(i2, view2.getPaddingTop(), rect.right, rect.bottom);
        }
    }
}
