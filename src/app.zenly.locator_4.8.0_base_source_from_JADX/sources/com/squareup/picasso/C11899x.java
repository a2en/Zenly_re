package com.squareup.picasso;

import java.io.PrintWriter;

/* renamed from: com.squareup.picasso.x */
public class C11899x {

    /* renamed from: a */
    public final int f30875a;

    /* renamed from: b */
    public final int f30876b;

    /* renamed from: c */
    public final long f30877c;

    /* renamed from: d */
    public final long f30878d;

    /* renamed from: e */
    public final long f30879e;

    /* renamed from: f */
    public final long f30880f;

    /* renamed from: g */
    public final long f30881g;

    /* renamed from: h */
    public final long f30882h;

    /* renamed from: i */
    public final long f30883i;

    /* renamed from: j */
    public final long f30884j;

    /* renamed from: k */
    public final int f30885k;

    /* renamed from: l */
    public final int f30886l;

    /* renamed from: m */
    public final int f30887m;

    /* renamed from: n */
    public final long f30888n;

    public C11899x(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f30875a = i;
        this.f30876b = i2;
        this.f30877c = j;
        this.f30878d = j2;
        this.f30879e = j3;
        this.f30880f = j4;
        this.f30881g = j5;
        this.f30882h = j6;
        this.f30883i = j7;
        this.f30884j = j8;
        this.f30885k = i3;
        this.f30886l = i4;
        this.f30887m = i5;
        this.f30888n = j9;
    }

    /* renamed from: a */
    public void mo35182a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f30875a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f30876b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.f30876b) / ((float) this.f30875a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f30877c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f30878d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f30885k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f30879e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f30882h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f30886l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f30880f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f30887m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f30881g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f30883i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f30884j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StatsSnapshot{maxSize=");
        sb.append(this.f30875a);
        sb.append(", size=");
        sb.append(this.f30876b);
        sb.append(", cacheHits=");
        sb.append(this.f30877c);
        sb.append(", cacheMisses=");
        sb.append(this.f30878d);
        sb.append(", downloadCount=");
        sb.append(this.f30885k);
        sb.append(", totalDownloadSize=");
        sb.append(this.f30879e);
        sb.append(", averageDownloadSize=");
        sb.append(this.f30882h);
        sb.append(", totalOriginalBitmapSize=");
        sb.append(this.f30880f);
        sb.append(", totalTransformedBitmapSize=");
        sb.append(this.f30881g);
        sb.append(", averageOriginalBitmapSize=");
        sb.append(this.f30883i);
        sb.append(", averageTransformedBitmapSize=");
        sb.append(this.f30884j);
        sb.append(", originalBitmapCount=");
        sb.append(this.f30886l);
        sb.append(", transformedBitmapCount=");
        sb.append(this.f30887m);
        sb.append(", timeStamp=");
        sb.append(this.f30888n);
        sb.append('}');
        return sb.toString();
    }
}
