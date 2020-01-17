package zendesk.support.request;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C10746a;
import java.util.List;
import p333g.p357d.p358a.p361b.C12071f;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;

class RetryDialog extends C10746a {
    private BottomSheetBehavior<FrameLayout> bottomSheetBehavior;
    /* access modifiers changed from: private */
    public Listener listener;
    /* access modifiers changed from: private */
    public final List<StateMessage> message;

    interface Listener {
        void onDeleteMessage(List<StateMessage> list);

        void onRetryMessage(List<StateMessage> list);
    }

    RetryDialog(Context context, List<StateMessage> list) {
        super(context);
        this.message = list;
        init();
    }

    private void init() {
        setContentView(C12138h.zs_request_dialog_retry);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.bottomSheetBehavior = initBottomSheet();
        initListener();
    }

    private BottomSheetBehavior<FrameLayout> initBottomSheet() {
        FrameLayout frameLayout = (FrameLayout) findViewById(C12071f.design_bottom_sheet);
        if (frameLayout != null) {
            try {
                return BottomSheetBehavior.m27416b(frameLayout);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private void initListener() {
        View findViewById = findViewById(C12136f.request_dialog_retry_delete);
        View findViewById2 = findViewById(C12136f.request_dialog_retry_retry);
        if (findViewById2 != null && findViewById != null) {
            findViewById.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    if (RetryDialog.this.listener != null) {
                        RetryDialog.this.listener.onDeleteMessage(RetryDialog.this.message);
                    }
                    RetryDialog.this.dismiss();
                }
            });
            findViewById2.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    if (RetryDialog.this.listener != null) {
                        RetryDialog.this.listener.onRetryMessage(RetryDialog.this.message);
                    }
                    RetryDialog.this.dismiss();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.mo30690c(3);
        }
    }

    public void setListener(Listener listener2) {
        this.listener = listener2;
    }
}
