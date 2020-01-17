package zendesk.support.request;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.C0540a;
import androidx.core.view.p005q.C0668b;
import com.squareup.picasso.Picasso;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p333g.p384h.p385a.C12133c;
import p333g.p384h.p385a.C12137g;
import p333g.p384h.p385a.C12140j;
import zendesk.belvedere.C13489a;
import zendesk.suas.Dispatcher;

class CellBindHelper {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("d MMMM yyyy", Locale.getDefault());
    /* access modifiers changed from: private */

    /* renamed from: af */
    public final ActionFactory f35214af;
    private final CellAttachmentLoadingUtil attachmentUtil;
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public final Dispatcher dispatcher;
    private final String today;
    private final String yesterday;

    CellBindHelper(Context context2, Picasso picasso, ActionFactory actionFactory, Dispatcher dispatcher2) {
        this.context = context2;
        this.f35214af = actionFactory;
        this.dispatcher = dispatcher2;
        this.attachmentUtil = new CellAttachmentLoadingUtil(picasso, context2);
        this.today = context2.getString(C12140j.request_message_date_today);
        this.yesterday = context2.getString(C12140j.request_message_date_yesterday);
    }

    private boolean basicCellChecks(CellType$Base cellType$Base, CellType$Base cellType$Base2) {
        if (cellType$Base == cellType$Base2) {
            return true;
        }
        return cellType$Base.getPositionType() == cellType$Base2.getPositionType() && cellType$Base.getClass().isInstance(cellType$Base2);
    }

    private int getPixelForDp(int i) {
        if (i != 0) {
            return this.context.getResources().getDimensionPixelOffset(i);
        }
        return 0;
    }

    private boolean nullSafeEquals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* access modifiers changed from: private */
    public void openAttachment(Context context2, StateRequestAttachment stateRequestAttachment) {
        Intent a = C13489a.m35734a(context2).mo38862a(stateRequestAttachment.getParsedLocalUri(), stateRequestAttachment.getMimeType());
        if (context2.getPackageManager().queryIntentActivities(a, 0).size() > 0) {
            context2.startActivity(a);
        }
    }

    /* access modifiers changed from: 0000 */
    public void addOnClickListenerForFileAttachment(View view, final StateRequestAttachment stateRequestAttachment) {
        if (stateRequestAttachment.isAvailableLocally()) {
            view.setAlpha(1.0f);
            view.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    CellBindHelper.this.openAttachment(view.getContext(), stateRequestAttachment);
                }
            });
            return;
        }
        view.setAlpha(((float) this.context.getResources().getInteger(C12137g.zs_request_file_attachment_downloading_cell_alpha)) / 100.0f);
        view.setOnClickListener(new OnClickListener() {
            private final String toastMessage = CellBindHelper.this.context.getString(C12140j.request_file_attachment_download_in_progress);

            public void onClick(View view) {
                Toast.makeText(view.getContext(), this.toastMessage, 0).show();
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void addOnClickListenerForImageAttachment(View view, final StateRequestAttachment stateRequestAttachment) {
        if (stateRequestAttachment.isAvailableLocally()) {
            view.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    CellBindHelper.this.openAttachment(view.getContext(), stateRequestAttachment);
                }
            });
        } else {
            view.setOnClickListener(null);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean areAgentCellContentsTheSame(CellType$Agent cellType$Agent, CellType$Base cellType$Base) {
        if (!basicCellChecks(cellType$Agent, cellType$Base) || !(cellType$Base instanceof CellType$Agent)) {
            return false;
        }
        CellType$Agent cellType$Agent2 = (CellType$Agent) cellType$Base;
        boolean z = true;
        boolean z2 = cellType$Agent.getAgent().getId() == cellType$Agent2.getAgent().getId();
        boolean equals = cellType$Agent.getAgent().getName().equals(cellType$Agent2.getAgent().getName());
        boolean z3 = cellType$Agent.isAgentNameVisible() == cellType$Agent2.isAgentNameVisible();
        if (!z2 || !equals || !z3) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public boolean areAttachmentCellContentsTheSame(CellType$Attachment cellType$Attachment, CellType$Base cellType$Base) {
        boolean z = false;
        if (!basicCellChecks(cellType$Attachment, cellType$Base) || !(cellType$Base instanceof CellType$Attachment)) {
            return false;
        }
        StateRequestAttachment attachment = cellType$Attachment.getAttachment();
        StateRequestAttachment attachment2 = ((CellType$Attachment) cellType$Base).getAttachment();
        boolean nullSafeEquals = nullSafeEquals(attachment.getLocalFile(), attachment2.getLocalFile());
        boolean nullSafeEquals2 = nullSafeEquals(attachment.getLocalUri(), attachment2.getLocalUri());
        boolean nullSafeEquals3 = nullSafeEquals(attachment.getUrl(), attachment2.getUrl());
        if (nullSafeEquals && nullSafeEquals2 && nullSafeEquals3) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public boolean areMessageContentsTheSame(CellType$Message cellType$Message, CellType$Base cellType$Base) {
        if (basicCellChecks(cellType$Message, cellType$Base) && (cellType$Base instanceof CellType$Message)) {
            return cellType$Message.getMessage().equals(((CellType$Message) cellType$Base).getMessage());
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean areStatefulCellContentsTheSame(CellType$Stateful cellType$Stateful, CellType$Base cellType$Base) {
        boolean z = false;
        if (!basicCellChecks(cellType$Stateful, cellType$Base) || !(cellType$Base instanceof CellType$Stateful)) {
            return false;
        }
        CellType$Stateful cellType$Stateful2 = (CellType$Stateful) cellType$Base;
        boolean z2 = cellType$Stateful.isErrorShown() == cellType$Stateful2.isErrorShown();
        boolean z3 = cellType$Stateful.isMarkedAsDelivered() == cellType$Stateful2.isMarkedAsDelivered();
        boolean z4 = cellType$Stateful.getErrorGroupMessages().size() == cellType$Stateful2.getErrorGroupMessages().size();
        boolean z5 = cellType$Stateful.isLastErrorCellOfBlock() == cellType$Stateful2.isLastErrorCellOfBlock();
        if (z2 && z3 && z4 && z5) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public void bindAgentName(TextView textView, boolean z, StateRequestUser stateRequestUser) {
        if (z) {
            textView.setVisibility(0);
            textView.setText(stateRequestUser.getName());
            return;
        }
        textView.setVisibility(4);
    }

    /* access modifiers changed from: 0000 */
    public void bindAppInfo(ResolveInfo resolveInfo, TextView textView, ImageView imageView) {
        textView.setText(UtilsAttachment.getAppName(this.context, resolveInfo));
        imageView.setImageDrawable(UtilsAttachment.getAppIcon(this.context, resolveInfo));
    }

    /* access modifiers changed from: 0000 */
    public void bindDate(TextView textView, Date date) {
        String str;
        if (UtilsDate.isToday(date)) {
            str = this.today;
        } else if (UtilsDate.isYesterday(date)) {
            str = this.yesterday;
        } else {
            str = DATE_FORMAT.format(date);
        }
        textView.setText(str.toUpperCase(Locale.getDefault()));
    }

    /* access modifiers changed from: 0000 */
    public void bindImage(ImageView imageView, StateRequestAttachment stateRequestAttachment) {
        this.attachmentUtil.bindImage(imageView, stateRequestAttachment);
    }

    /* access modifiers changed from: 0000 */
    public void bindStatusLabel(TextView textView, boolean z, boolean z2) {
        int i;
        int i2 = -1;
        int i3 = 0;
        if (z) {
            i2 = C12133c.zs_request_cell_label_color_error;
            i = C12140j.request_messages_status_error;
        } else if (z2) {
            i2 = C12133c.zs_request_cell_label_color;
            i = C12140j.request_message_status_delivered;
        } else {
            i3 = 4;
            i = -1;
        }
        if (i2 > 0) {
            textView.setTextColor(C0540a.m2536a(this.context, i2));
        }
        if (i > 0) {
            textView.setText(i);
        }
        textView.clearAnimation();
        if (i3 == 0 && i3 != textView.getVisibility()) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(250);
            alphaAnimation.setInterpolator(C0668b.m3090a(0.0f, 0.0f, 0.2f, 1.0f));
            textView.startAnimation(alphaAnimation);
        }
        textView.setVisibility(i3);
    }

    /* access modifiers changed from: 0000 */
    public int colorForError(boolean z) {
        int i;
        if (z) {
            i = C12133c.zs_request_user_background_color_error;
        } else {
            i = C12133c.zs_request_user_background_color;
        }
        return C0540a.m2536a(this.context, i);
    }

    /* access modifiers changed from: 0000 */
    public int colorForErrorImage(boolean z) {
        if (z) {
            return C0540a.m2536a(this.context, C12133c.zs_request_user_background_image_color_error);
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public OnClickListener errorClickListener(boolean z, final List<StateMessage> list) {
        if (z) {
            return new OnClickListener() {
                public void onClick(View view) {
                    CellBindHelper.this.dispatcher.dispatch(CellBindHelper.this.f35214af.showRetryDialog(list));
                }
            };
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public ResolveInfo getAppInfo(String str) {
        return UtilsAttachment.getAppInfoForFile(this.context, str);
    }

    /* access modifiers changed from: 0000 */
    public Rect getInsets(int i, int i2, int i3, int i4) {
        return new Rect(getPixelForDp(i), getPixelForDp(i2), getPixelForDp(i3), getPixelForDp(i4));
    }
}
