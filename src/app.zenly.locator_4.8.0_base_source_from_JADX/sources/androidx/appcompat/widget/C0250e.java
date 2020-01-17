package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import p214e.p215a.C7521a;
import p214e.p215a.C7523c;
import p214e.p215a.C7525e;
import p214e.p215a.p216k.p217a.C7531a;
import p214e.p234h.p235e.C7614a;

/* renamed from: androidx.appcompat.widget.e */
public final class C0250e {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Mode f1146b = Mode.SRC_IN;

    /* renamed from: c */
    private static C0250e f1147c;

    /* renamed from: a */
    private C0271q f1148a;

    /* renamed from: androidx.appcompat.widget.e$a */
    static class C0251a implements C0276e {

        /* renamed from: a */
        private final int[] f1149a = {C7525e.abc_textfield_search_default_mtrl_alpha, C7525e.abc_textfield_default_mtrl_alpha, C7525e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f1150b = {C7525e.abc_ic_commit_search_api_mtrl_alpha, C7525e.abc_seekbar_tick_mark_material, C7525e.abc_ic_menu_share_mtrl_alpha, C7525e.abc_ic_menu_copy_mtrl_am_alpha, C7525e.abc_ic_menu_cut_mtrl_alpha, C7525e.abc_ic_menu_selectall_mtrl_alpha, C7525e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f1151c = {C7525e.abc_textfield_activated_mtrl_alpha, C7525e.abc_textfield_search_activated_mtrl_alpha, C7525e.abc_cab_background_top_mtrl_alpha, C7525e.abc_text_cursor_material, C7525e.abc_text_select_handle_left_mtrl_dark, C7525e.abc_text_select_handle_middle_mtrl_dark, C7525e.abc_text_select_handle_right_mtrl_dark, C7525e.abc_text_select_handle_left_mtrl_light, C7525e.abc_text_select_handle_middle_mtrl_light, C7525e.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d */
        private final int[] f1152d = {C7525e.abc_popup_background_mtrl_mult, C7525e.abc_cab_background_internal_bg, C7525e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f1153e = {C7525e.abc_tab_indicator_material, C7525e.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f1154f = {C7525e.abc_btn_check_material, C7525e.abc_btn_radio_material, C7525e.abc_btn_check_material_anim, C7525e.abc_btn_radio_material_anim};

        C0251a() {
        }

        /* renamed from: a */
        private ColorStateList m975a(Context context) {
            return m979b(context, 0);
        }

        /* renamed from: b */
        private ColorStateList m978b(Context context) {
            return m979b(context, C0287v.m1189b(context, C7521a.colorAccent));
        }

        /* renamed from: c */
        private ColorStateList m980c(Context context) {
            return m979b(context, C0287v.m1189b(context, C7521a.colorButtonNormal));
        }

        /* renamed from: d */
        private ColorStateList m981d(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList c = C0287v.m1190c(context, C7521a.colorSwitchThumbNormal);
            if (c == null || !c.isStateful()) {
                iArr[0] = C0287v.f1298b;
                iArr2[0] = C0287v.m1186a(context, C7521a.colorSwitchThumbNormal);
                iArr[1] = C0287v.f1301e;
                iArr2[1] = C0287v.m1189b(context, C7521a.colorControlActivated);
                iArr[2] = C0287v.f1302f;
                iArr2[2] = C0287v.m1189b(context, C7521a.colorSwitchThumbNormal);
            } else {
                iArr[0] = C0287v.f1298b;
                iArr2[0] = c.getColorForState(iArr[0], 0);
                iArr[1] = C0287v.f1301e;
                iArr2[1] = C0287v.m1189b(context, C7521a.colorControlActivated);
                iArr[2] = C0287v.f1302f;
                iArr2[2] = c.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: a */
        public Drawable mo1900a(C0271q qVar, Context context, int i) {
            if (i != C7525e.abc_cab_background_top_material) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{qVar.mo1994a(context, C7525e.abc_cab_background_internal_bg), qVar.mo1994a(context, C7525e.abc_cab_background_top_mtrl_alpha)});
        }

        /* renamed from: b */
        private ColorStateList m979b(Context context, int i) {
            int b = C0287v.m1189b(context, C7521a.colorControlHighlight);
            return new ColorStateList(new int[][]{C0287v.f1298b, C0287v.f1300d, C0287v.f1299c, C0287v.f1302f}, new int[]{C0287v.m1186a(context, C7521a.colorButtonNormal), C7614a.m18492b(b, i), C7614a.m18492b(b, i), i});
        }

        /* renamed from: a */
        private void m976a(Drawable drawable, int i, Mode mode) {
            if (C0262m.m1079a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0250e.f1146b;
            }
            drawable.setColorFilter(C0250e.m967a(i, mode));
        }

        /* renamed from: a */
        private boolean m977a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public ColorStateList mo1898a(Context context, int i) {
            if (i == C7525e.abc_edit_text_material) {
                return C7531a.m18132b(context, C7523c.abc_tint_edittext);
            }
            if (i == C7525e.abc_switch_track_mtrl_alpha) {
                return C7531a.m18132b(context, C7523c.abc_tint_switch_track);
            }
            if (i == C7525e.abc_switch_thumb_material) {
                return m981d(context);
            }
            if (i == C7525e.abc_btn_default_mtrl_shape) {
                return m980c(context);
            }
            if (i == C7525e.abc_btn_borderless_material) {
                return m975a(context);
            }
            if (i == C7525e.abc_btn_colored_material) {
                return m978b(context);
            }
            if (i == C7525e.abc_spinner_mtrl_am_alpha || i == C7525e.abc_spinner_textfield_background_material) {
                return C7531a.m18132b(context, C7523c.abc_tint_spinner);
            }
            if (m977a(this.f1150b, i)) {
                return C0287v.m1190c(context, C7521a.colorControlNormal);
            }
            if (m977a(this.f1153e, i)) {
                return C7531a.m18132b(context, C7523c.abc_tint_default);
            }
            if (m977a(this.f1154f, i)) {
                return C7531a.m18132b(context, C7523c.abc_tint_btn_checkable);
            }
            if (i == C7525e.abc_seekbar_thumb_material) {
                return C7531a.m18132b(context, C7523c.abc_tint_seek_thumb);
            }
            return null;
        }

        /* renamed from: b */
        public boolean mo1902b(Context context, int i, Drawable drawable) {
            if (i == C7525e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m976a(layerDrawable.findDrawableByLayerId(16908288), C0287v.m1189b(context, C7521a.colorControlNormal), C0250e.f1146b);
                m976a(layerDrawable.findDrawableByLayerId(16908303), C0287v.m1189b(context, C7521a.colorControlNormal), C0250e.f1146b);
                m976a(layerDrawable.findDrawableByLayerId(16908301), C0287v.m1189b(context, C7521a.colorControlActivated), C0250e.f1146b);
                return true;
            } else if (i != C7525e.abc_ratingbar_material && i != C7525e.abc_ratingbar_indicator_material && i != C7525e.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m976a(layerDrawable2.findDrawableByLayerId(16908288), C0287v.m1186a(context, C7521a.colorControlNormal), C0250e.f1146b);
                m976a(layerDrawable2.findDrawableByLayerId(16908303), C0287v.m1189b(context, C7521a.colorControlActivated), C0250e.f1146b);
                m976a(layerDrawable2.findDrawableByLayerId(16908301), C0287v.m1189b(context, C7521a.colorControlActivated), C0250e.f1146b);
                return true;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1901a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0250e.f1146b
                int[] r1 = r6.f1149a
                boolean r1 = r6.m977a(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0018
                int r2 = p214e.p215a.C7521a.colorControlNormal
            L_0x0014:
                r1 = r0
                r8 = 1
                r0 = -1
                goto L_0x0049
            L_0x0018:
                int[] r1 = r6.f1151c
                boolean r1 = r6.m977a(r1, r8)
                if (r1 == 0) goto L_0x0023
                int r2 = p214e.p215a.C7521a.colorControlActivated
                goto L_0x0014
            L_0x0023:
                int[] r1 = r6.f1152d
                boolean r1 = r6.m977a(r1, r8)
                if (r1 == 0) goto L_0x002e
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002e:
                int r1 = p214e.p215a.C7525e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x0040
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = r0
                r0 = r8
                r8 = 1
                goto L_0x0049
            L_0x0040:
                int r1 = p214e.p215a.C7525e.abc_dialog_material_background
                if (r8 != r1) goto L_0x0045
                goto L_0x0014
            L_0x0045:
                r1 = r0
                r8 = 0
                r0 = -1
                r2 = 0
            L_0x0049:
                if (r8 == 0) goto L_0x0066
                boolean r8 = androidx.appcompat.widget.C0262m.m1079a(r9)
                if (r8 == 0) goto L_0x0055
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0055:
                int r7 = androidx.appcompat.widget.C0287v.m1189b(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0250e.m967a(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r3) goto L_0x0065
                r9.setAlpha(r0)
            L_0x0065:
                return r5
            L_0x0066:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0250e.C0251a.mo1901a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: a */
        public Mode mo1899a(int i) {
            if (i == C7525e.abc_switch_thumb_material) {
                return Mode.MULTIPLY;
            }
            return null;
        }
    }

    /* renamed from: b */
    public static synchronized C0250e m969b() {
        C0250e eVar;
        synchronized (C0250e.class) {
            if (f1147c == null) {
                m970c();
            }
            eVar = f1147c;
        }
        return eVar;
    }

    /* renamed from: c */
    public static synchronized void m970c() {
        synchronized (C0250e.class) {
            if (f1147c == null) {
                f1147c = new C0250e();
                f1147c.f1148a = C0271q.m1117a();
                f1147c.f1148a.mo1998a((C0276e) new C0251a());
            }
        }
    }

    /* renamed from: a */
    public synchronized Drawable mo1894a(Context context, int i) {
        return this.f1148a.mo1994a(context, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Drawable mo1895a(Context context, int i, boolean z) {
        return this.f1148a.mo1995a(context, i, z);
    }

    /* renamed from: a */
    public synchronized void mo1896a(Context context) {
        this.f1148a.mo1997a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized ColorStateList mo1897b(Context context, int i) {
        return this.f1148a.mo2000b(context, i);
    }

    /* renamed from: a */
    static void m968a(Drawable drawable, C0289x xVar, int[] iArr) {
        C0271q.m1119a(drawable, xVar, iArr);
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m967a(int i, Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0250e.class) {
            a = C0271q.m1113a(i, mode);
        }
        return a;
    }
}
