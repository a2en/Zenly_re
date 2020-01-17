package zendesk.support;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import androidx.core.content.C0540a;
import com.squareup.picasso.C11892t;
import com.squareup.picasso.Picasso;
import com.zendesk.util.C12017g;
import p333g.p384h.p385a.C12133c;
import p333g.p384h.p385a.C12135e;
import p333g.p384h.p385a.C12136f;

public class ZendeskAvatarView extends FrameLayout {
    private static final int[] AVATAR_COLORS = {C12133c.zs_avatar_view_color_01, C12133c.zs_avatar_view_color_02, C12133c.zs_avatar_view_color_03, C12133c.zs_avatar_view_color_04, C12133c.zs_avatar_view_color_05, C12133c.zs_avatar_view_color_06, C12133c.zs_avatar_view_color_07, C12133c.zs_avatar_view_color_08, C12133c.zs_avatar_view_color_09, C12133c.zs_avatar_view_color_10, C12133c.zs_avatar_view_color_11, C12133c.zs_avatar_view_color_12, C12133c.zs_avatar_view_color_13, C12133c.zs_avatar_view_color_14, C12133c.zs_avatar_view_color_15, C12133c.zs_avatar_view_color_16, C12133c.zs_avatar_view_color_17, C12133c.zs_avatar_view_color_18, C12133c.zs_avatar_view_color_19};
    private boolean enableOutline;
    private ImageView imageView;
    private int strokeColor;
    private int strokeWidth;
    private TextView textView;

    public ZendeskAvatarView(Context context) {
        this(context, null, 0);
    }

    private Drawable getBackgroundShape(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(C0540a.m2536a(getContext(), i));
        if (!this.enableOutline) {
            return shapeDrawable;
        }
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable2.getPaint();
        paint.setStyle(Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(this.strokeColor);
        paint.setStrokeWidth((float) this.strokeWidth);
        return new LayerDrawable(new Drawable[]{shapeDrawable, new InsetDrawable(shapeDrawable2, this.strokeWidth / 2)});
    }

    private int getColorId(Object obj) {
        return AVATAR_COLORS[Math.abs(obj.hashCode() % AVATAR_COLORS.length)];
    }

    private void initViews() {
        this.textView = new TextView(getContext());
        this.textView.setId(C12136f.zs_avatar_view_text_view);
        this.textView.setTextColor(C0540a.m2536a(getContext(), C12133c.zs_avatar_text_color));
        this.textView.setGravity(17);
        this.textView.setTextSize(2, 16.0f);
        this.imageView = new ImageView(getContext());
        this.imageView.setId(C12136f.zs_avatar_view_image_view);
        addView(this.textView);
        addView(this.imageView);
    }

    private void setTextView(String str) {
        setBackground(getBackgroundShape(getColorId(str)));
        this.textView.setText(String.valueOf(Character.toUpperCase(str.charAt(0))));
    }

    public void setStroke(int i, int i2) {
        this.strokeColor = i;
        this.strokeWidth = i2;
        this.enableOutline = true;
    }

    public void showUserWithAvatarImage(Picasso picasso, String str, String str2, int i) {
        this.imageView.setVisibility(0);
        this.imageView.setImageResource(C12133c.zs_color_transparent);
        if (C12017g.m31658b(str2)) {
            this.textView.setVisibility(0);
            setTextView(str2);
        }
        this.imageView.setScaleType(ScaleType.FIT_CENTER);
        C11892t a = picasso.mo35028a(str);
        int i2 = i * 2;
        a.mo35156a(i2, i2);
        a.mo35155a();
        a.mo35163d();
        a.mo35157a(PicassoTransformations.getRoundWithBorderTransformation(i, this.strokeColor, this.strokeWidth));
        a.mo35158a(this.imageView);
    }

    public void showUserWithIdentifier(Object obj) {
        if (obj != null) {
            setBackground(getBackgroundShape(getColorId(obj)));
            this.imageView.setScaleType(ScaleType.CENTER);
            this.imageView.setImageResource(C12135e.zs_request_list_account_icon);
            this.textView.setVisibility(4);
            this.imageView.setVisibility(0);
        }
    }

    public void showUserWithName(String str) {
        if (C12017g.m31658b(str)) {
            setTextView(str);
            this.textView.setVisibility(0);
            this.imageView.setVisibility(4);
        }
    }

    public ZendeskAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ZendeskAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.enableOutline = false;
        this.strokeColor = 0;
        this.strokeWidth = 0;
        initViews();
    }
}
