package app.zenly.android.feature.spam.prevention;

import android.view.View;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.spam.prevention.model.SpammedUser;
import app.zenly.android.feature.spam.prevention.p016m.C1467a;
import app.zenly.android.feature.spam.prevention.repository.SpamPreventionRepository;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7712e;
import p389io.reactivex.C12279e;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.C12292a;

/* renamed from: app.zenly.android.feature.spam.prevention.i */
public final class C1461i extends C12292a implements ObservableSectionController {

    /* renamed from: f */
    private final SpamPreventionRepository f5270f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final AvatarLoader f5271g;

    /* renamed from: app.zenly.android.feature.spam.prevention.i$a */
    static final class C1462a<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C1461i f5272e;

        C1462a(C1461i iVar) {
            this.f5272e = iVar;
        }

        /* renamed from: a */
        public final Seekable<C11722a> apply(List<? extends SpammedUser> list) {
            C12932j.m33818b(list, "it");
            C7712e eVar = C7712e.f19340a;
            ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
            for (SpammedUser aVar : list) {
                arrayList.add(new C1467a(aVar, this.f5272e.f5271g));
            }
            return eVar.mo19922a((List<? extends C11722a>) arrayList, new C11722a(C1463j.SPAM_INFO));
        }
    }

    public C1461i(SpamPreventionRepository spamPreventionRepository, AvatarLoader avatarLoader) {
        C12932j.m33818b(spamPreventionRepository, "spamPreventionRepository");
        C12932j.m33818b(avatarLoader, "avatarLoader");
        this.f5270f = spamPreventionRepository;
        this.f5271g = avatarLoader;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e<Seekable<C11722a>> i = this.f5270f.getSpammedUsers().mo36501i(new C1462a(this));
        C12932j.m33815a((Object) i, "spamPreventionRepository…          )\n            }");
        return i;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }
}
