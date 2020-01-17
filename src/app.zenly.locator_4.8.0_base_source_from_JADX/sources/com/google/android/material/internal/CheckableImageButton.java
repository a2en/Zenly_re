package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.C0615a;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0628c;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import p214e.p215a.C7521a;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: h */
    private static final int[] f28100h = {16842912};

    /* renamed from: g */
    private boolean f28101g;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C10780a extends C0615a {
        C10780a() {
        }

        /* renamed from: a */
        public void mo3292a(View view, C0628c cVar) {
            super.mo3292a(view, cVar);
            cVar.mo3332b(true);
            cVar.mo3337c(CheckableImageButton.this.isChecked());
        }

        /* renamed from: b */
        public void mo3296b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3296b(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean isChecked() {
        return this.f28101g;
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f28101g) {
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f28100h.length), f28100h);
        }
        return super.onCreateDrawableState(i);
    }

    public void setChecked(boolean z) {
        if (this.f28101g != z) {
            this.f28101g = z;
            refreshDrawableState();
            sendAccessibilityEvent(ItemAnimator.FLAG_MOVED);
        }
    }

    public void toggle() {
        setChecked(!this.f28101g);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7521a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewCompat.m2824a((View) this, (C0615a) new C10780a());
    }
}
