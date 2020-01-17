package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.C0607i;

/* renamed from: androidx.appcompat.widget.j */
final class C0258j {

    /* renamed from: a */
    private TextView f1171a;

    /* renamed from: b */
    private TextClassifier f1172b;

    C0258j(TextView textView) {
        C0607i.m2773a(textView);
        this.f1171a = textView;
    }

    /* renamed from: a */
    public void mo1920a(TextClassifier textClassifier) {
        this.f1172b = textClassifier;
    }

    /* renamed from: a */
    public TextClassifier mo1919a() {
        TextClassifier textClassifier = this.f1172b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1171a.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            textClassifier = TextClassifier.NO_OP;
        }
        return textClassifier;
    }
}
