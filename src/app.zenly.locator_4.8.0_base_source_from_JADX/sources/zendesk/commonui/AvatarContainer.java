package zendesk.commonui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zendesk.func.ZFunc1;
import com.zendesk.util.C12010a;
import java.util.Arrays;
import java.util.List;

public class AvatarContainer extends FrameLayout {

    /* renamed from: e */
    private static final List<Integer> f35098e = Arrays.asList(new Integer[]{Integer.valueOf(C13555f.zui_first_avatar), Integer.valueOf(C13555f.zui_second_avatar), Integer.valueOf(C13555f.zui_third_avatar), Integer.valueOf(C13555f.zui_fourth_avatar), Integer.valueOf(C13555f.zui_fifth_avatar)});

    /* renamed from: zendesk.commonui.AvatarContainer$a */
    class C13545a implements ZFunc1<Integer, AvatarView> {
        C13545a() {
        }

        /* renamed from: a */
        public AvatarView apply(Integer num) {
            return (AvatarView) AvatarContainer.this.findViewById(num.intValue());
        }
    }

    public AvatarContainer(Context context) {
        super(context);
        m35874a(context);
    }

    /* renamed from: a */
    private void m35874a(Context context) {
        FrameLayout.inflate(context, C13557h.zui_view_avatar_container, this);
        C12010a.m31637b(f35098e, new C13545a());
    }

    public AvatarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m35874a(context);
    }

    public AvatarContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m35874a(context);
    }

    public AvatarContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m35874a(context);
    }
}
