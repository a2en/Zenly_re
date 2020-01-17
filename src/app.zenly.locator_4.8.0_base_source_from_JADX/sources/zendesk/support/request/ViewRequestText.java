package zendesk.support.request;

import android.content.Context;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatTextView;

class ViewRequestText extends AppCompatTextView {
    public ViewRequestText(Context context) {
        super(context);
        init();
    }

    private void init() {
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart < 0 || selectionEnd < 0) {
            Selection.setSelection((Spannable) getText(), getText().length());
        } else if (selectionStart != selectionEnd && motionEvent.getActionMasked() == 0) {
            CharSequence text = getText();
            setText(null);
            setText(text);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ViewRequestText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ViewRequestText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
