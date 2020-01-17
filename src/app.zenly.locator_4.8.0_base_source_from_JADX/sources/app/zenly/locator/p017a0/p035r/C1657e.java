package app.zenly.locator.p017a0.p035r;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.settings.view.SwitchMenuItem;
import app.zenly.locator.settings.view.SwitchMenuItem.OnCheckChangedListener;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7302f3;
import p213co.znly.models.UserProto$DisabledNotifications;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.a0.r.e */
public final class C1657e extends C1650a implements OnCheckChangedListener {

    /* renamed from: R */
    private View f5687R;

    /* renamed from: S */
    private View f5688S;

    /* renamed from: T */
    private SwitchMenuItem f5689T;

    /* renamed from: app.zenly.locator.a0.r.e$a */
    static final class C1658a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1657e f5690e;

        C1658a(C1657e eVar) {
            this.f5690e = eVar;
        }

        public final void onClick(View view) {
            C5499a aVar = C5498a.f14119e;
            Activity A = this.f5690e.mo9304A();
            C12932j.m33815a((Object) A, "requireActivity()");
            C5498a.m15602a(aVar.mo13125a(A), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f5690e.m6964C();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m6964C() {
        C8831g k = mo23946k();
        C8836h a = C8836h.m21058a((C8819d) new C1652c());
        a.mo24026b(new C8816c());
        a.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a);
    }

    public void onCheckChanged(SwitchMenuItem switchMenuItem, boolean z) {
        C12932j.m33818b(switchMenuItem, "view");
        SwitchMenuItem switchMenuItem2 = this.f5689T;
        if (switchMenuItem2 == null) {
            C12932j.m33820c("contactsOnZenly");
            throw null;
        } else if (C12932j.m33817a((Object) switchMenuItem, (Object) switchMenuItem2)) {
            mo7254a(C7302f3.NotificationContactJoined, z);
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        View view2 = this.f5687R;
        String str = "screenBarLayout";
        if (view2 != null) {
            int i = rect.left;
            int i2 = rect.top;
            int i3 = rect.right;
            if (view2 != null) {
                view2.setPadding(i, i2, i3, view2.getPaddingBottom());
                View view3 = this.f5688S;
                String str2 = "scrollView";
                if (view3 != null) {
                    int i4 = rect.left;
                    if (view3 != null) {
                        view3.setPadding(i4, view3.getPaddingTop(), rect.right, rect.bottom);
                    } else {
                        C12932j.m33820c(str2);
                        throw null;
                    }
                } else {
                    C12932j.m33820c(str2);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_notifications, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.screen_bar_layout);
        C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.screen_bar_layout)");
        this.f5687R = findViewById;
        View findViewById2 = inflate.findViewById(R.id.scroll_view);
        C12932j.m33815a((Object) findViewById2, "view.findViewById(R.id.scroll_view)");
        this.f5688S = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.switch_menu_item);
        C12932j.m33815a((Object) findViewById3, "view.findViewById(R.id.switch_menu_item)");
        this.f5689T = (SwitchMenuItem) findViewById3;
        SwitchMenuItem switchMenuItem = this.f5689T;
        if (switchMenuItem != null) {
            switchMenuItem.setOnCheckChangedListener(this);
            inflate.findViewById(R.id.friends_abroad_layout).setOnClickListener(new C1658a(this));
            C12932j.m33815a((Object) inflate, "view");
            return inflate;
        }
        C12932j.m33820c("contactsOnZenly");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7050a(Context context, UserProto$User userProto$User) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(userProto$User, "newUser");
        super.mo7050a(context, userProto$User);
        SwitchMenuItem switchMenuItem = this.f5689T;
        if (switchMenuItem != null) {
            UserProto$DisabledNotifications disabledNotifications = userProto$User.getDisabledNotifications();
            C12932j.m33815a((Object) disabledNotifications, "newUser.disabledNotifications");
            switchMenuItem.setChecked(C1651b.m6951a(disabledNotifications, C7302f3.NotificationContactJoined));
            return;
        }
        C12932j.m33820c("contactsOnZenly");
        throw null;
    }
}
