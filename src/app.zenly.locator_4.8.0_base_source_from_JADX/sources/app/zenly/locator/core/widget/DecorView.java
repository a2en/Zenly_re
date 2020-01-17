package app.zenly.locator.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.view.InAppNotificationContainer;
import kotlin.jvm.internal.C12932j;

public final class DecorView extends FrameLayout {
    public DecorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DecorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DecorView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final ViewGroup getContentView() {
        View findViewById = findViewById(R.id.content);
        C12932j.m33815a((Object) findViewById, "findViewById(R.id.content)");
        return (ViewGroup) findViewById;
    }

    public final InAppNotificationContainer getInAppNotificationContainer() {
        View findViewById = findViewById(R.id.in_app_notification_container);
        C12932j.m33815a((Object) findViewById, "findViewById(R.id.in_app_notification_container)");
        return (InAppNotificationContainer) findViewById;
    }

    public DecorView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
    }
}
