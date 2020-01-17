package app.zenly.locator.modals.p121o2;

import android.content.Context;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.ImageView;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import p213co.znly.models.C7339i;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.modals.o2.d */
public class C4645d extends C4644c {

    /* renamed from: m */
    private AvatarLoader f12362m;

    /* renamed from: app.zenly.locator.modals.o2.d$a */
    class C4646a implements OnLayoutChangeListener {
        C4646a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C4645d.this.removeOnLayoutChangeListener(this);
            C4645d dVar = C4645d.this;
            dVar.onVisibilityChanged(dVar, dVar.getVisibility());
        }
    }

    public C4645d(Context context) {
        super(context);
        this.f12362m = new C2477e(context);
        addOnLayoutChangeListener(new C4646a());
    }

    public ImageView getAvatarView() {
        return this.f12354e;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f12362m.clear(this.f12354e);
        super.onDetachedFromWindow();
    }

    public void setContact(C7339i iVar) {
        if (this.f12354e != null) {
            this.f12362m.load(C2884f.m9357a(iVar)).into(this.f12354e);
        }
    }

    public void setUser(UserProto$User userProto$User) {
        if (this.f12354e != null) {
            this.f12362m.load(C2884f.m9355a(userProto$User)).into(this.f12354e);
        }
    }
}
