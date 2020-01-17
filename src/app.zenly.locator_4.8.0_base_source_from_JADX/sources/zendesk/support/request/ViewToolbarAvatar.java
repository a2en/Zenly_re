package zendesk.support.request;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.core.util.C0603e;
import com.squareup.picasso.Picasso;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p333g.p384h.p385a.C12131a;
import p333g.p384h.p385a.C12133c;
import p333g.p384h.p385a.C12134d;
import p333g.p384h.p385a.C12136f;
import zendesk.support.UiUtils;
import zendesk.support.ZendeskAvatarView;

class ViewToolbarAvatar extends FrameLayout {
    private static final int[] IMAGE_VIEW_IDS = {C12136f.zs_request_toolbar_avatar_1, C12136f.zs_request_toolbar_avatar_2, C12136f.zs_request_toolbar_avatar_3, C12136f.zs_request_toolbar_avatar_4, C12136f.zs_request_toolbar_avatar_5};
    private final List<ZendeskAvatarView> avatarViews;
    private int imageRadius;
    private int strokeColor;
    private int strokeWidth;
    private List<C0603e<String, String>> userInfo;

    public ViewToolbarAvatar(Context context) {
        this(context, null);
    }

    private void bindData(Picasso picasso) {
        for (int i = 0; i < this.avatarViews.size(); i++) {
            ZendeskAvatarView zendeskAvatarView = (ZendeskAvatarView) this.avatarViews.get(i);
            if (i < this.userInfo.size()) {
                C0603e eVar = (C0603e) this.userInfo.get(i);
                if (C12017g.m31658b((String) eVar.f2729a)) {
                    zendeskAvatarView.showUserWithAvatarImage(picasso, (String) eVar.f2729a, (String) eVar.f2730b, this.imageRadius);
                } else {
                    zendeskAvatarView.showUserWithName((String) eVar.f2730b);
                }
                zendeskAvatarView.setVisibility(0);
            } else {
                zendeskAvatarView.setVisibility(8);
            }
        }
    }

    private ZendeskAvatarView createAndAddView(int i) {
        ZendeskAvatarView zendeskAvatarView = new ZendeskAvatarView(getContext());
        zendeskAvatarView.setId(IMAGE_VIEW_IDS[i]);
        zendeskAvatarView.setStroke(this.strokeColor, this.strokeWidth);
        int i2 = this.imageRadius * 2;
        int i3 = i * 2 * (i2 / 3);
        LayoutParams layoutParams = new LayoutParams(i2, i2);
        layoutParams.gravity = 8388613;
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginEnd(i3);
        } else {
            layoutParams.setMargins(0, 0, i3, 0);
        }
        addView(zendeskAvatarView, layoutParams);
        return zendeskAvatarView;
    }

    /* access modifiers changed from: 0000 */
    public void setImageUrls(Picasso picasso, List<C0603e<String, String>> list) {
        if (list.size() > 5) {
            this.userInfo = list.subList(0, 5);
        } else {
            this.userInfo = C12010a.m31632a(list);
        }
        Collections.reverse(this.userInfo);
        bindData(picasso);
    }

    public ViewToolbarAvatar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewToolbarAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.avatarViews = new ArrayList(5);
        this.userInfo = new ArrayList(5);
        this.imageRadius = context.getResources().getDimensionPixelOffset(C12134d.zs_request_toolbar_avatar_radius);
        this.strokeWidth = context.getResources().getDimensionPixelOffset(C12134d.zs_request_toolbar_avatar_stroke_width);
        this.strokeColor = UiUtils.themeAttributeToColor(C12131a.colorPrimary, getContext(), C12133c.zs_request_fallback_color_primary);
        for (int i2 = 0; i2 < 5; i2++) {
            ZendeskAvatarView createAndAddView = createAndAddView(i2);
            createAndAddView.setVisibility(8);
            this.avatarViews.add(createAndAddView);
        }
    }
}
