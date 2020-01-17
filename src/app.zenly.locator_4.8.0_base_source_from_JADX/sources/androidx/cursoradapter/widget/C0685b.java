package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: androidx.cursoradapter.widget.b */
class C0685b extends Filter {

    /* renamed from: a */
    C0686a f2927a;

    /* renamed from: androidx.cursoradapter.widget.b$a */
    interface C0686a {
        /* renamed from: a */
        Cursor mo2080a(CharSequence charSequence);

        /* renamed from: a */
        void mo2083a(Cursor cursor);

        CharSequence convertToString(Cursor cursor);

        Cursor getCursor();
    }

    C0685b(C0686a aVar) {
        this.f2927a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f2927a.convertToString((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f2927a.mo2080a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor cursor = this.f2927a.getCursor();
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            this.f2927a.mo2083a((Cursor) obj);
        }
    }
}
