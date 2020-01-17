package app.zenly.android.feature.spam.prevention.p014k;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.spam.prevention.C1450b;
import app.zenly.android.feature.spam.prevention.p015l.C1466a;
import app.zenly.android.feature.spam.prevention.p016m.C1467a;
import com.snap.p327ui.recycling.C11721c;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.spam.prevention.k.a */
public final class C1464a extends C11721c<C1467a> {

    /* renamed from: app.zenly.android.feature.spam.prevention.k.a$a */
    static final class C1465a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1464a f5278e;

        /* renamed from: f */
        final /* synthetic */ C1467a f5279f;

        C1465a(C1464a aVar, C1467a aVar2) {
            this.f5278e = aVar;
            this.f5279f = aVar2;
        }

        public final void onClick(View view) {
            this.f5278e.mo34491a().dispatch(new C1466a(this.f5279f.mo6961g().getFriendRequestId()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
    }

    /* renamed from: f */
    public void mo6954f() {
        AvatarLoader f = ((C1467a) mo34494c()).mo6960f();
        ImageView imageView = (ImageView) mo34493b().findViewById(C1450b.avatar);
        C12932j.m33815a((Object) imageView, "itemView.avatar");
        f.clear(imageView);
        super.mo6954f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C1467a aVar, C1467a aVar2) {
        C12932j.m33818b(aVar, "model");
        TextView textView = (TextView) mo34493b().findViewById(C1450b.title);
        C12932j.m33815a((Object) textView, "itemView.title");
        textView.setText(aVar.mo6961g().getName());
        ((AppCompatImageButton) mo34493b().findViewById(C1450b.cancel_btn)).setOnClickListener(new C1465a(this, aVar));
        Request load = aVar.mo6960f().load(aVar.mo6961g().getAvatar());
        ImageView imageView = (ImageView) mo34493b().findViewById(C1450b.avatar);
        C12932j.m33815a((Object) imageView, "itemView.avatar");
        load.into(imageView);
    }
}
