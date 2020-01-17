package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.appcompat.app.C0122a;
import androidx.appcompat.app.C0122a.C0123a;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import p214e.p215a.C7527g;

/* renamed from: androidx.appcompat.view.menu.g */
class C0167g implements OnKeyListener, OnClickListener, OnDismissListener, Callback {

    /* renamed from: e */
    private MenuBuilder f657e;

    /* renamed from: f */
    private C0122a f658f;

    /* renamed from: g */
    C0164e f659g;

    /* renamed from: h */
    private Callback f660h;

    public C0167g(MenuBuilder menuBuilder) {
        this.f657e = menuBuilder;
    }

    /* renamed from: a */
    public void mo907a(IBinder iBinder) {
        MenuBuilder menuBuilder = this.f657e;
        C0123a aVar = new C0123a(menuBuilder.mo752e());
        this.f659g = new C0164e(aVar.mo543b(), C7527g.abc_list_menu_item_layout);
        this.f659g.setCallback(this);
        this.f657e.mo719a((MenuPresenter) this.f659g);
        aVar.mo536a(this.f659g.mo888a(), (OnClickListener) this);
        View i = menuBuilder.mo760i();
        if (i != null) {
            aVar.mo534a(i);
        } else {
            aVar.mo533a(menuBuilder.mo756g());
            aVar.mo547b(menuBuilder.mo758h());
        }
        aVar.mo532a((OnKeyListener) this);
        this.f658f = aVar.mo542a();
        this.f658f.setOnDismissListener(this);
        LayoutParams attributes = this.f658f.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f658f.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f657e.mo723a((MenuItem) (C0169i) this.f659g.mo888a().getItem(i), 0);
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (z || menuBuilder == this.f657e) {
            mo906a();
        }
        Callback callback = this.f660h;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f659g.onCloseMenu(this.f657e, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window = this.f658f.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                Window window2 = this.f658f.getWindow();
                if (window2 != null) {
                    View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.f657e.mo722a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f657e.performShortcut(i, keyEvent, 0);
    }

    public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
        Callback callback = this.f660h;
        if (callback != null) {
            return callback.onOpenSubMenu(menuBuilder);
        }
        return false;
    }

    /* renamed from: a */
    public void mo906a() {
        C0122a aVar = this.f658f;
        if (aVar != null) {
            aVar.dismiss();
        }
    }
}
