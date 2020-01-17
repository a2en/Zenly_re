package zendesk.commonui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class AvatarView extends FrameLayout {
    public AvatarView(Context context) {
        this(context, null, 0);
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FrameLayout.inflate(context, C13557h.zui_view_avatar, this);
        Resources resources = getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C13554e.zui_avatar_view_outline);
        int a = C13562m.m35899a(C13552c.colorPrimary, context, C13553d.zui_color_primary);
        ImageView imageView = (ImageView) findViewById(C13555f.zui_avatar_image);
        TextView textView = (TextView) findViewById(C13555f.zui_avatar_letter);
        Picasso.m31064a(context);
        resources.getDimensionPixelSize(C13554e.zui_avatar_view_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13559j.AvatarView);
        resources.getIntArray(obtainStyledAttributes.getResourceId(C13559j.AvatarView_colorPalette, C13551b.zui_avatar_view__background_color_palette));
        obtainStyledAttributes.getDimensionPixelSize(C13559j.AvatarView_outlineSize, dimensionPixelOffset);
        obtainStyledAttributes.getColor(C13559j.AvatarView_outlineColor, a);
        obtainStyledAttributes.recycle();
    }
}
