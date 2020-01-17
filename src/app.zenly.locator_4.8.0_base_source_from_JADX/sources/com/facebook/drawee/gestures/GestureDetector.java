package com.facebook.drawee.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public class GestureDetector {

    /* renamed from: a */
    ClickListener f25066a;

    /* renamed from: b */
    final float f25067b;

    /* renamed from: c */
    boolean f25068c;

    /* renamed from: d */
    boolean f25069d;

    /* renamed from: e */
    long f25070e;

    /* renamed from: f */
    float f25071f;

    /* renamed from: g */
    float f25072g;

    public interface ClickListener {
        boolean onClick();
    }

    public GestureDetector(Context context) {
        this.f25067b = (float) ViewConfiguration.get(context).getScaledTouchSlop();
        mo26027a();
    }

    /* renamed from: a */
    public static GestureDetector m23625a(Context context) {
        return new GestureDetector(context);
    }

    /* renamed from: b */
    public boolean mo26030b() {
        return this.f25068c;
    }

    /* renamed from: c */
    public void mo26031c() {
        this.f25068c = false;
        this.f25069d = false;
    }

    /* renamed from: a */
    public void mo26027a() {
        this.f25066a = null;
        mo26031c();
    }

    /* renamed from: a */
    public void mo26028a(ClickListener clickListener) {
        this.f25066a = clickListener;
    }

    /* renamed from: a */
    public boolean mo26029a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f25068c = true;
            this.f25069d = true;
            this.f25070e = motionEvent.getEventTime();
            this.f25071f = motionEvent.getX();
            this.f25072g = motionEvent.getY();
        } else if (action == 1) {
            this.f25068c = false;
            if (Math.abs(motionEvent.getX() - this.f25071f) > this.f25067b || Math.abs(motionEvent.getY() - this.f25072g) > this.f25067b) {
                this.f25069d = false;
            }
            if (this.f25069d && motionEvent.getEventTime() - this.f25070e <= ((long) ViewConfiguration.getLongPressTimeout())) {
                ClickListener clickListener = this.f25066a;
                if (clickListener != null) {
                    clickListener.onClick();
                }
            }
            this.f25069d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f25068c = false;
                this.f25069d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f25071f) > this.f25067b || Math.abs(motionEvent.getY() - this.f25072g) > this.f25067b) {
            this.f25069d = false;
        }
        return true;
    }
}
