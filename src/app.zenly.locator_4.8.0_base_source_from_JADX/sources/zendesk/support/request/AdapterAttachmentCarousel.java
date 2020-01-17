package zendesk.support.request;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import com.squareup.picasso.C11892t;
import com.squareup.picasso.Picasso;
import java.util.Collections;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12140j;
import zendesk.suas.Dispatcher;

class AdapterAttachmentCarousel extends C1069g<CarouselViewHolder> {
    /* access modifiers changed from: private */

    /* renamed from: af */
    public final ActionFactory f35212af;
    private final AttachmentHelper attachmentHelper;
    /* access modifiers changed from: private */
    public final Dispatcher dispatcher;
    private final Picasso picasso;
    private final OnRemoveListener removeListener = new OnRemoveListener() {
        public void onRemove(StateRequestAttachment stateRequestAttachment) {
            AdapterAttachmentCarousel.this.dispatcher.dispatch(AdapterAttachmentCarousel.this.f35212af.deselectAttachment(Collections.singletonList(StateRequestAttachment.convert(stateRequestAttachment))));
        }
    };

    static abstract class CarouselViewHolder extends C1085v {

        interface OnRemoveListener {
            void onRemove(StateRequestAttachment stateRequestAttachment);
        }

        CarouselViewHolder(View view) {
            super(view);
        }

        /* access modifiers changed from: 0000 */
        public abstract void bind(StateRequestAttachment stateRequestAttachment, OnRemoveListener onRemoveListener);
    }

    static class FileAttachmentViewHolder extends CarouselViewHolder {
        private final ImageView appIcon = ((ImageView) this.itemView.findViewById(C12136f.request_attachment_carousel_file_icon));
        private final TextView appName = ((TextView) this.itemView.findViewById(C12136f.request_attachment_carousel_file_app_name));
        private final View container = this.itemView.findViewById(C12136f.request_attachment_file_carousel_container);
        private final TextView name = ((TextView) this.itemView.findViewById(C12136f.request_attachment_carousel_file_title));
        private final View remove = this.itemView.findViewById(C12136f.request_attachment_carousel_remove);

        FileAttachmentViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C12138h.zs_request_carousel_file, viewGroup, false));
        }

        /* access modifiers changed from: 0000 */
        public void bind(final StateRequestAttachment stateRequestAttachment, final OnRemoveListener onRemoveListener) {
            Context context = this.itemView.getContext();
            ResolveInfo appInfoForFile = UtilsAttachment.getAppInfoForFile(context, stateRequestAttachment.getName());
            this.appIcon.setImageDrawable(UtilsAttachment.getAppIcon(context, appInfoForFile));
            this.appName.setText(UtilsAttachment.getAppName(context, appInfoForFile));
            this.name.setText(stateRequestAttachment.getName());
            this.remove.setOnClickListener(new OnClickListener(this) {
                public void onClick(View view) {
                    onRemoveListener.onRemove(stateRequestAttachment);
                }
            });
            this.remove.setContentDescription(context.getString(C12140j.zs_request_attachment_carousel_remove_attachment_accessibility, new Object[]{stateRequestAttachment.getName()}));
            this.container.setContentDescription(context.getString(C12140j.zs_request_attachment_carousel_attachment_accessibility, new Object[]{stateRequestAttachment.getName()}));
        }
    }

    static class ImageAttachmentViewHolder extends CarouselViewHolder {
        private final View container = this.itemView.findViewById(C12136f.request_attachment_image_carousel_container);
        private final ImageView imageView = ((ImageView) this.itemView.findViewById(C12136f.request_attachment_carousel_image));
        private final Picasso picasso;
        private final View remove = this.itemView.findViewById(C12136f.request_attachment_carousel_remove);

        ImageAttachmentViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup, Picasso picasso2) {
            super(layoutInflater.inflate(C12138h.zs_request_carousel_image, viewGroup, false));
            this.picasso = picasso2;
        }

        /* access modifiers changed from: 0000 */
        public void bind(final StateRequestAttachment stateRequestAttachment, final OnRemoveListener onRemoveListener) {
            C11892t a = this.picasso.mo35026a(stateRequestAttachment.getParsedLocalUri());
            a.mo35161b();
            a.mo35155a();
            a.mo35158a(this.imageView);
            this.remove.setOnClickListener(new OnClickListener(this) {
                public void onClick(View view) {
                    onRemoveListener.onRemove(stateRequestAttachment);
                }
            });
            Context context = this.itemView.getContext();
            this.remove.setContentDescription(context.getString(C12140j.zs_request_attachment_carousel_remove_attachment_accessibility, new Object[]{stateRequestAttachment.getName()}));
            this.container.setContentDescription(context.getString(C12140j.zs_request_attachment_carousel_attachment_accessibility, new Object[]{stateRequestAttachment.getName()}));
        }
    }

    AdapterAttachmentCarousel(AttachmentHelper attachmentHelper2, Picasso picasso2, ActionFactory actionFactory, Dispatcher dispatcher2) {
        this.attachmentHelper = attachmentHelper2;
        this.picasso = picasso2;
        this.f35212af = actionFactory;
        this.dispatcher = dispatcher2;
        setHasStableIds(true);
    }

    public int getItemCount() {
        return this.attachmentHelper.getSelectedAttachments().size();
    }

    public long getItemId(int i) {
        return (long) ((StateRequestAttachment) this.attachmentHelper.getSelectedAttachments().get(i)).getLocalUri().hashCode();
    }

    public int getItemViewType(int i) {
        return UtilsAttachment.isImageAttachment((StateRequestAttachment) this.attachmentHelper.getSelectedAttachments().get(i)) ? 2 : 1;
    }

    public void onBindViewHolder(CarouselViewHolder carouselViewHolder, int i) {
        carouselViewHolder.bind((StateRequestAttachment) this.attachmentHelper.getSelectedAttachments().get(i), this.removeListener);
    }

    public CarouselViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new FileAttachmentViewHolder(from, viewGroup);
        }
        if (i != 2) {
            return null;
        }
        return new ImageAttachmentViewHolder(from, viewGroup, this.picasso);
    }
}
