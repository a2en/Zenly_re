package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.cursoradapter.widget.c */
public abstract class C0687c extends C0682a {

    /* renamed from: m */
    private int f2928m;

    /* renamed from: n */
    private int f2929n;

    /* renamed from: o */
    private LayoutInflater f2930o;

    @Deprecated
    public C0687c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f2929n = i;
        this.f2928m = i;
        this.f2930o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo3532a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2930o.inflate(this.f2929n, viewGroup, false);
    }

    /* renamed from: b */
    public View mo2085b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2930o.inflate(this.f2928m, viewGroup, false);
    }
}
