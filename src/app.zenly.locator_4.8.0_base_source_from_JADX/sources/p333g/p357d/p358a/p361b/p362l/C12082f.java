package p333g.p357d.p358a.p361b.p362l;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: g.d.a.b.l.f */
public class C12082f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f31469a = new Matrix();

    public C12082f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f31469a.set(imageView.getImageMatrix());
        return this.f31469a;
    }
}
