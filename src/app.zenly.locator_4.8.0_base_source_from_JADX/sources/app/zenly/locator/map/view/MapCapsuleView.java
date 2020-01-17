package app.zenly.locator.map.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C0680h;
import app.zenly.android.base.widget.C1315a;
import app.zenly.locator.C3891l;
import app.zenly.locator.C3892m;
import app.zenly.locator.R;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;

public final class MapCapsuleView extends ConstraintLayout {

    /* renamed from: A */
    private int f11765A;

    /* renamed from: B */
    private HashMap f11766B;

    /* renamed from: z */
    private int f11767z;

    public MapCapsuleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MapCapsuleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ MapCapsuleView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = R.attr.mapCapsuleViewStyle;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: c */
    public View mo2261c(int i) {
        if (this.f11766B == null) {
            this.f11766B = new HashMap();
        }
        View view = (View) this.f11766B.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f11766B.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Drawable getIconBackground() {
        ImageView imageView = (ImageView) mo2261c(C3891l.iv_icon);
        C12932j.m33815a((Object) imageView, "iv_icon");
        return imageView.getBackground();
    }

    public final Drawable getIconSrc() {
        ImageView imageView = (ImageView) mo2261c(C3891l.iv_icon);
        C12932j.m33815a((Object) imageView, "iv_icon");
        return imageView.getDrawable();
    }

    public final int getIconTint() {
        return this.f11767z;
    }

    public final CharSequence getText() {
        TextView textView = (TextView) mo2261c(C3891l.tv_text);
        C12932j.m33815a((Object) textView, "tv_text");
        return textView.getText();
    }

    public final int getTextColor() {
        TextView textView = (TextView) mo2261c(C3891l.tv_text);
        C12932j.m33815a((Object) textView, "tv_text");
        return textView.getCurrentTextColor();
    }

    public final Drawable getTextEndIconSrc() {
        TextView textView = (TextView) mo2261c(C3891l.tv_text);
        C12932j.m33815a((Object) textView, "tv_text");
        return textView.getCompoundDrawablesRelative()[2];
    }

    public final int getTextIconTint() {
        return this.f11765A;
    }

    public final Drawable getTextStartIconSrc() {
        TextView textView = (TextView) mo2261c(C3891l.tv_text);
        C12932j.m33815a((Object) textView, "tv_text");
        return textView.getCompoundDrawablesRelative()[0];
    }

    public final CharSequence getTitle() {
        TextView textView = (TextView) mo2261c(C3891l.tv_title);
        C12932j.m33815a((Object) textView, "tv_title");
        return textView.getText();
    }

    public final int getTitleColor() {
        TextView textView = (TextView) mo2261c(C3891l.tv_title);
        C12932j.m33815a((Object) textView, "tv_title");
        return textView.getCurrentTextColor();
    }

    public final void setIconBackground(Drawable drawable) {
        ImageView imageView = (ImageView) mo2261c(C3891l.iv_icon);
        C12932j.m33815a((Object) imageView, "iv_icon");
        imageView.setBackground(drawable);
    }

    public final void setIconSrc(Drawable drawable) {
        ((ImageView) mo2261c(C3891l.iv_icon)).setImageDrawable(drawable);
    }

    public final void setIconTint(int i) {
        this.f11767z = i;
        ImageView imageView = (ImageView) mo2261c(C3891l.iv_icon);
        C12932j.m33815a((Object) imageView, "iv_icon");
        imageView.setImageTintList(i != 0 ? ColorStateList.valueOf(i) : null);
    }

    public final void setText(CharSequence charSequence) {
        TextView textView = (TextView) mo2261c(C3891l.tv_text);
        String str = "tv_text";
        C12932j.m33815a((Object) textView, str);
        textView.setText(charSequence);
        TextView textView2 = (TextView) mo2261c(C3891l.tv_text);
        C12932j.m33815a((Object) textView2, str);
        int i = 0;
        if (charSequence == null || charSequence.length() == 0) {
            i = 8;
        }
        textView2.setVisibility(i);
    }

    public final void setTextColor(int i) {
        ((TextView) mo2261c(C3891l.tv_text)).setTextColor(i);
    }

    public final void setTextEndIconSrc(Drawable drawable) {
        TextView textView = (TextView) mo2261c(C3891l.tv_text);
        C12932j.m33815a((Object) textView, "tv_text");
        C1315a.m6318a(textView, (Drawable) null, (Drawable) null, drawable, (Drawable) null, 11, (Object) null);
    }

    public final void setTextIconTint(int i) {
        this.f11765A = i;
        C0680h.m3178a((TextView) mo2261c(C3891l.tv_text), i != 0 ? ColorStateList.valueOf(i) : null);
    }

    public final void setTextStartIconSrc(Drawable drawable) {
        TextView textView = (TextView) mo2261c(C3891l.tv_text);
        C12932j.m33815a((Object) textView, "tv_text");
        C1315a.m6318a(textView, drawable, (Drawable) null, (Drawable) null, (Drawable) null, 14, (Object) null);
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = (TextView) mo2261c(C3891l.tv_title);
        String str = "tv_title";
        C12932j.m33815a((Object) textView, str);
        textView.setText(charSequence);
        TextView textView2 = (TextView) mo2261c(C3891l.tv_title);
        C12932j.m33815a((Object) textView2, str);
        int i = 0;
        if (charSequence == null || charSequence.length() == 0) {
            i = 8;
        }
        textView2.setVisibility(i);
    }

    public final void setTitleColor(int i) {
        ((TextView) mo2261c(C3891l.tv_title)).setTextColor(i);
    }

    public MapCapsuleView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.map_view_capsule, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3892m.MapCapsuleView, i, 0);
        setIconBackground(obtainStyledAttributes.getDrawable(0));
        setIconSrc(obtainStyledAttributes.getDrawable(1));
        setIconTint(obtainStyledAttributes.getColor(2, 0));
        setTitle(obtainStyledAttributes.getString(8));
        setTitleColor(obtainStyledAttributes.getColor(9, 0));
        setText(obtainStyledAttributes.getString(3));
        setTextColor(obtainStyledAttributes.getColor(4, 0));
        setTextStartIconSrc(obtainStyledAttributes.getDrawable(7));
        setTextEndIconSrc(obtainStyledAttributes.getDrawable(5));
        setTextIconTint(obtainStyledAttributes.getColor(6, 0));
        obtainStyledAttributes.recycle();
    }
}
