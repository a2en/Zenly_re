package zendesk.support.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.squareup.picasso.C11892t;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.C11847d;
import com.squareup.picasso.Target;
import com.zendesk.logger.Logger;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12017g;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p333g.p384h.p385a.C12133c;
import p333g.p384h.p385a.C12134d;
import zendesk.support.PicassoTransformations;

class CellAttachmentLoadingUtil {
    /* access modifiers changed from: private */
    public final ImageLoadingLogic imageLoadingLogic;
    private final ImageSizingLogic imageSizingLogic;

    static class ImageLoadingLogic {
        private final Picasso picasso;

        private static class DefaultDisplayStrategy implements LoadingStrategy {
            private DefaultDisplayStrategy() {
            }

            public void load(ImageView imageView, ImageDimensions imageDimensions) {
            }
        }

        private static class DisplayImageFromLocalSource implements LoadingStrategy {
            private final C11892t requestCreator;

            public void load(ImageView imageView, ImageDimensions imageDimensions) {
                C11892t tVar = this.requestCreator;
                tVar.mo35163d();
                tVar.mo35162c();
                ImageLoadingLogic.loadImage(imageView, tVar, imageDimensions, null);
            }

            private DisplayImageFromLocalSource(C11892t tVar) {
                this.requestCreator = tVar;
            }
        }

        private static class DisplayImageFromWeb implements LoadingStrategy {
            final Picasso picasso;
            final String thumbnailUrl;
            final String url;

            public void load(final ImageView imageView, final ImageDimensions imageDimensions) {
                Context applicationContext = imageView.getContext().getApplicationContext();
                C11892t a = this.picasso.mo35028a(this.thumbnailUrl);
                a.mo35157a(PicassoTransformations.getBlurTransformation(applicationContext));
                ImageLoadingLogic.loadImage(imageView, a, imageDimensions, new Callback() {
                    public void onError() {
                        Logger.m31608a("RequestActivity", "Unable to load thumbnail. Url: '%s'", DisplayImageFromWeb.this.thumbnailUrl);
                        ImageView imageView = imageView;
                        DisplayImageFromWeb displayImageFromWeb = DisplayImageFromWeb.this;
                        C11892t a = displayImageFromWeb.picasso.mo35028a(displayImageFromWeb.url);
                        a.mo35163d();
                        ImageLoadingLogic.loadImage(imageView, a, imageDimensions, null);
                    }

                    public void onSuccess() {
                        ImageView imageView = imageView;
                        DisplayImageFromWeb displayImageFromWeb = DisplayImageFromWeb.this;
                        C11892t a = displayImageFromWeb.picasso.mo35028a(displayImageFromWeb.url);
                        a.mo35163d();
                        ImageLoadingLogic.loadImage(imageView, a, imageDimensions, null);
                    }
                });
            }

            private DisplayImageFromWeb(Picasso picasso2, String str, String str2) {
                this.picasso = picasso2;
                this.url = str;
                this.thumbnailUrl = str2;
            }
        }

        interface LoadingStrategy {
            void load(ImageView imageView, ImageDimensions imageDimensions);
        }

        ImageLoadingLogic(Picasso picasso2) {
            this.picasso = picasso2;
        }

        private LoadingStrategy getLoadingStrategy(StateRequestAttachment stateRequestAttachment) {
            if (stateRequestAttachment.getLocalFile() != null && stateRequestAttachment.getLocalFile().exists() && stateRequestAttachment.getLocalFile().length() > 0) {
                return new DisplayImageFromLocalSource(this.picasso.mo35027a(stateRequestAttachment.getLocalFile()));
            }
            if (C12017g.m31658b(stateRequestAttachment.getLocalUri()) && Uri.parse(stateRequestAttachment.getLocalUri()) != null) {
                return new DisplayImageFromLocalSource(this.picasso.mo35026a(stateRequestAttachment.getParsedLocalUri()));
            }
            if (C12017g.m31658b(stateRequestAttachment.getUrl()) && C12017g.m31658b(stateRequestAttachment.getThumbnailUrl())) {
                return new DisplayImageFromWeb(this.picasso, stateRequestAttachment.getUrl(), stateRequestAttachment.getThumbnailUrl());
            }
            Logger.m31608a("RequestActivity", "Can't load image. Id: %s", Long.valueOf(stateRequestAttachment.getId()));
            return new DefaultDisplayStrategy();
        }

        /* access modifiers changed from: private */
        public static void loadImage(ImageView imageView, C11892t tVar, ImageDimensions imageDimensions, Callback callback) {
            int imageWidth = imageDimensions.getImageWidth();
            int imageHeight = imageDimensions.getImageHeight();
            tVar.mo35157a(PicassoTransformations.getRoundedTransformation(imageView.getContext().getResources().getDimensionPixelOffset(C12134d.zs_request_attachment_corner_radius) / 2));
            tVar.mo35156a(imageWidth / 2, imageHeight / 2);
            tVar.mo35155a();
            tVar.mo35159a(imageView, callback);
        }

        /* access modifiers changed from: 0000 */
        public void initImageView(ImageView imageView) {
            this.picasso.mo35030a(imageView);
            imageView.setImageResource(C12133c.zs_color_transparent);
        }

        /* access modifiers changed from: 0000 */
        public boolean isImageLoading(ImageView imageView, StateRequestAttachment stateRequestAttachment) {
            Object tag = imageView.getTag();
            return (tag instanceof StateRequestAttachment) && ((StateRequestAttachment) tag).getId() == stateRequestAttachment.getId();
        }

        /* access modifiers changed from: 0000 */
        public void loadAttachment(ImageView imageView, StateRequestAttachment stateRequestAttachment, ImageDimensions imageDimensions) {
            getLoadingStrategy(stateRequestAttachment).load(imageView, imageDimensions);
        }

        /* access modifiers changed from: 0000 */
        public void setImageViewLoading(ImageView imageView, StateRequestAttachment stateRequestAttachment) {
            imageView.setTag(stateRequestAttachment);
        }
    }

    static class ImageSizingLogic {
        /* access modifiers changed from: private */
        public final Map<String, ImageDimensions> cachedDimensions = new HashMap();
        private final ImageDimensions maxSize;
        private final Picasso picasso;

        private static class DefaultStrategy implements DimensionStrategy {
            private DefaultStrategy() {
            }

            public void findDimensions(C12008e<ImageDimensions> eVar) {
                eVar.onSuccess(new ImageDimensions());
            }
        }

        interface DimensionStrategy {
            void findDimensions(C12008e<ImageDimensions> eVar);
        }

        private static class ExistingDimensions implements DimensionStrategy {
            private final int height;
            private final ImageDimensions maxSize;
            private final int width;

            ExistingDimensions(int i, int i2, ImageDimensions imageDimensions) {
                this.width = i;
                this.height = i2;
                this.maxSize = imageDimensions;
            }

            public void findDimensions(C12008e<ImageDimensions> eVar) {
                eVar.onSuccess(ImageSizingLogic.determineTargetDimensions(this.width, this.height, this.maxSize.getImageWidth(), this.maxSize.getImageHeight()));
            }
        }

        static class ImageDimensions {
            private int imageHeight = -1;
            private int imageWidth = -1;

            ImageDimensions(int i, int i2) {
                this.imageWidth = i;
                this.imageHeight = i2;
            }

            /* access modifiers changed from: 0000 */
            public boolean areKnown() {
                return (this.imageWidth == -1 || this.imageHeight == -1) ? false : true;
            }

            /* access modifiers changed from: 0000 */
            public int getImageHeight() {
                return this.imageHeight;
            }

            /* access modifiers changed from: 0000 */
            public int getImageWidth() {
                return this.imageWidth;
            }

            /* access modifiers changed from: 0000 */
            public void setDimensions(int i, int i2) {
                this.imageWidth = i;
                this.imageHeight = i2;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("ImageDimensions{width=");
                sb.append(this.imageWidth);
                sb.append(", height=");
                sb.append(this.imageHeight);
                sb.append('}');
                return sb.toString();
            }

            ImageDimensions() {
            }
        }

        private static class ReadFromBitmap implements DimensionStrategy {
            final File file;
            private final ImageDimensions maxSize;

            ReadFromBitmap(File file2, ImageDimensions imageDimensions) {
                this.maxSize = imageDimensions;
                this.file = file2;
            }

            private ImageDimensions loadImageDimensions(File file2) {
                ImageDimensions imageDimensions = new ImageDimensions();
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file2.getAbsolutePath(), options);
                imageDimensions.setDimensions(options.outWidth, options.outHeight);
                return imageDimensions;
            }

            public void findDimensions(C12008e<ImageDimensions> eVar) {
                ImageDimensions loadImageDimensions = loadImageDimensions(this.file);
                eVar.onSuccess(ImageSizingLogic.determineTargetDimensions(loadImageDimensions.getImageWidth(), loadImageDimensions.getImageHeight(), this.maxSize.getImageWidth(), this.maxSize.getImageHeight()));
            }
        }

        private static class ReadFromPicasso implements DimensionStrategy {
            /* access modifiers changed from: private */
            public static final List<Target> TARGET_REFERENCE_TRAP = new ArrayList();
            /* access modifiers changed from: private */
            public final ImageDimensions maxSize;
            private final C11892t requestCreator;

            public void findDimensions(final C12008e<ImageDimensions> eVar) {
                C137511 r0 = new Target() {
                    public void onBitmapFailed(Drawable drawable) {
                        Logger.m31608a("RequestActivity", "Unable to load image.", new Object[0]);
                        eVar.onSuccess(new ImageDimensions());
                        ReadFromPicasso.TARGET_REFERENCE_TRAP.remove(this);
                    }

                    public void onBitmapLoaded(Bitmap bitmap, C11847d dVar) {
                        eVar.onSuccess(ImageSizingLogic.determineTargetDimensions(bitmap.getWidth(), bitmap.getHeight(), ReadFromPicasso.this.maxSize.getImageWidth(), ReadFromPicasso.this.maxSize.getImageHeight()));
                        ReadFromPicasso.TARGET_REFERENCE_TRAP.remove(this);
                    }

                    public void onPrepareLoad(Drawable drawable) {
                    }
                };
                TARGET_REFERENCE_TRAP.add(r0);
                this.requestCreator.mo35160a((Target) r0);
            }

            private ReadFromPicasso(C11892t tVar, ImageDimensions imageDimensions) {
                this.requestCreator = tVar;
                this.maxSize = imageDimensions;
            }
        }

        ImageSizingLogic(Picasso picasso2, Context context) {
            this.picasso = picasso2;
            this.maxSize = getMaxSize(context);
        }

        private int calculateMaxWidth(Context context) {
            Resources resources = context.getResources();
            return (resources.getDisplayMetrics().widthPixels - resources.getDimensionPixelSize(C12134d.zs_request_message_composer_expanded_side_margin)) - resources.getDimensionPixelSize(C12134d.zs_request_message_margin_side);
        }

        static ImageDimensions determineTargetDimensions(int i, int i2, int i3, int i4) {
            ImageDimensions imageDimensions = new ImageDimensions();
            int i5 = (int) (((double) i3) / ((((double) i) * 1.0d) / ((double) i2)));
            if (i > i2) {
                if (i > i3) {
                    i = i3;
                    imageDimensions.setDimensions(i, Math.max(Math.min(i4, i5), 0));
                    return imageDimensions;
                }
            } else if (i2 > i5) {
                i = Math.min(i3, i);
                imageDimensions.setDimensions(i, Math.max(Math.min(i4, i5), 0));
                return imageDimensions;
            }
            i5 = i2;
            imageDimensions.setDimensions(i, Math.max(Math.min(i4, i5), 0));
            return imageDimensions;
        }

        private DimensionStrategy getDimensionStrategy(StateRequestAttachment stateRequestAttachment, ImageDimensions imageDimensions) {
            if (stateRequestAttachment.getHeight() > 0 && stateRequestAttachment.getWidth() > 0) {
                return new ExistingDimensions(stateRequestAttachment.getWidth(), stateRequestAttachment.getHeight(), imageDimensions);
            }
            if (C12017g.m31658b(stateRequestAttachment.getLocalUri()) && this.cachedDimensions.containsKey(stateRequestAttachment.getLocalUri())) {
                ImageDimensions imageDimensions2 = (ImageDimensions) this.cachedDimensions.get(stateRequestAttachment.getLocalUri());
                return new ExistingDimensions(imageDimensions2.getImageWidth(), imageDimensions2.getImageHeight(), imageDimensions);
            } else if (stateRequestAttachment.getLocalFile() != null && stateRequestAttachment.getLocalFile().exists() && stateRequestAttachment.getLocalFile().length() > 0) {
                return new ReadFromBitmap(stateRequestAttachment.getLocalFile(), imageDimensions);
            } else {
                if (C12017g.m31658b(stateRequestAttachment.getLocalUri()) && Uri.parse(stateRequestAttachment.getLocalUri()) != null) {
                    return new ReadFromPicasso(this.picasso.mo35026a(Uri.parse(stateRequestAttachment.getLocalUri())), imageDimensions);
                } else if (C12017g.m31658b(stateRequestAttachment.getUrl())) {
                    return new ReadFromPicasso(this.picasso.mo35028a(stateRequestAttachment.getUrl()), imageDimensions);
                } else {
                    Logger.m31608a("RequestActivity", "Can't load dimensions. Id: %s", Long.valueOf(stateRequestAttachment.getId()));
                    return new DefaultStrategy();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public ImageDimensions getMaxSize() {
            return this.maxSize;
        }

        /* access modifiers changed from: 0000 */
        public void loadDimensionsForAttachment(final StateRequestAttachment stateRequestAttachment, final C12008e<ImageDimensions> eVar) {
            getDimensionStrategy(stateRequestAttachment, this.maxSize).findDimensions(new C12008e<ImageDimensions>() {
                public void onError(ErrorResponse errorResponse) {
                }

                public void onSuccess(ImageDimensions imageDimensions) {
                    if (C12017g.m31658b(stateRequestAttachment.getLocalUri()) && imageDimensions.areKnown()) {
                        ImageSizingLogic.this.cachedDimensions.put(stateRequestAttachment.getLocalUri(), imageDimensions);
                    }
                    eVar.onSuccess(imageDimensions);
                }
            });
        }

        private ImageDimensions getMaxSize(Context context) {
            int calculateMaxWidth = calculateMaxWidth(context);
            return new ImageDimensions(calculateMaxWidth, (int) (((double) calculateMaxWidth) / 1.7777777777777777d));
        }
    }

    CellAttachmentLoadingUtil(Picasso picasso, Context context) {
        this.imageSizingLogic = new ImageSizingLogic(picasso, context);
        this.imageLoadingLogic = new ImageLoadingLogic(picasso);
    }

    /* access modifiers changed from: private */
    public void adjustImageViewDimensions(ImageView imageView, ImageDimensions imageDimensions) {
        LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = imageDimensions.getImageWidth();
        layoutParams.height = imageDimensions.getImageHeight();
        imageView.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    public void bindImage(final ImageView imageView, final StateRequestAttachment stateRequestAttachment) {
        if (!this.imageLoadingLogic.isImageLoading(imageView, stateRequestAttachment)) {
            this.imageLoadingLogic.setImageViewLoading(imageView, stateRequestAttachment);
            adjustImageViewDimensions(imageView, this.imageSizingLogic.getMaxSize());
            this.imageLoadingLogic.initImageView(imageView);
            this.imageSizingLogic.loadDimensionsForAttachment(stateRequestAttachment, new C12008e<ImageDimensions>() {
                public void onError(ErrorResponse errorResponse) {
                }

                public void onSuccess(ImageDimensions imageDimensions) {
                    if (imageDimensions.areKnown()) {
                        CellAttachmentLoadingUtil.this.adjustImageViewDimensions(imageView, imageDimensions);
                        CellAttachmentLoadingUtil.this.imageLoadingLogic.loadAttachment(imageView, stateRequestAttachment, imageDimensions);
                        return;
                    }
                    Logger.m31608a("RequestActivity", "Unable retrieve image size. Id: %s", Long.valueOf(stateRequestAttachment.getId()));
                }
            });
        }
    }
}
