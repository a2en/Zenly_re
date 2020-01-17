package p213co.znly.cardgenerator;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import com.android.volley.toolbox.C8733j;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: co.znly.cardgenerator.c */
class C6354c {

    /* renamed from: a */
    private int f15929a;

    /* renamed from: b */
    private int f15930b;

    /* renamed from: c */
    private MediaCodec f15931c;

    /* renamed from: d */
    private C6353b f15932d;

    /* renamed from: e */
    private BufferInfo f15933e;

    /* renamed from: f */
    private C6356b f15934f;

    /* renamed from: g */
    private C6350a f15935g;

    /* renamed from: h */
    private MediaMuxer f15936h;

    /* renamed from: i */
    private boolean f15937i;

    /* renamed from: j */
    private int f15938j = 0;

    /* renamed from: k */
    private int f15939k = 0;

    /* renamed from: co.znly.cardgenerator.c$b */
    private class C6356b {

        /* renamed from: a */
        int f15940a;

        private C6356b(C6354c cVar) {
            this.f15940a = -1;
        }
    }

    C6354c(int i, int i2, String str, int i3, int i4) {
        this.f15929a = i;
        this.f15930b = i2;
        this.f15933e = new BufferInfo();
        this.f15934f = new C6356b();
        this.f15937i = false;
        String str2 = "video/avc";
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str2, this.f15929a, this.f15930b);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", i4);
        createVideoFormat.setInteger("frame-rate", i3);
        createVideoFormat.setInteger("i-frame-interval", 1);
        try {
            this.f15931c = MediaCodec.createEncoderByType(str2);
            this.f15931c.configure(createVideoFormat, null, null, 1);
            this.f15932d = new C6353b(this.f15931c.createInputSurface());
            this.f15931c.start();
            this.f15939k++;
            try {
                this.f15936h = new MediaMuxer(str, 0);
                this.f15935g = new C6350a(this.f15936h);
            } catch (IOException e) {
                throw new RuntimeException("Failed to create media muxer!", e);
            }
        } catch (Exception e2) {
            throw new RuntimeException("Failed to create video encoder!", e2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C6350a mo14227a() {
        return this.f15935g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo14228b() {
        m17481a(this.f15931c, this.f15933e, this.f15934f, false, C8733j.DEFAULT_IMAGE_TIMEOUT_MS);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo14229c() {
        m17481a(this.f15931c, this.f15933e, this.f15934f, true, C8733j.DEFAULT_IMAGE_TIMEOUT_MS);
        MediaCodec mediaCodec = this.f15931c;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.f15931c.release();
            this.f15931c = null;
        }
        C6353b bVar = this.f15932d;
        if (bVar != null) {
            bVar.mo14225b();
            this.f15932d = null;
        }
        C6350a aVar = this.f15935g;
        if (aVar != null) {
            aVar.mo14219a();
            this.f15935g = null;
        }
        MediaMuxer mediaMuxer = this.f15936h;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            this.f15936h.release();
            this.f15936h = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo14230d() {
        return this.f15930b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C6353b mo14231e() {
        return this.f15932d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo14232f() {
        return this.f15929a;
    }

    /* renamed from: a */
    private void m17481a(MediaCodec mediaCodec, BufferInfo bufferInfo, C6356b bVar, boolean z, int i) {
        if (z) {
            mediaCodec.signalEndOfInputStream();
        }
        while (true) {
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, (long) i);
            if (dequeueOutputBuffer != -1) {
                String str = "VideoEncoder";
                if (dequeueOutputBuffer != -2) {
                    String str2 = ")";
                    if (dequeueOutputBuffer < 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected encoder status (status: ");
                        sb.append(dequeueOutputBuffer);
                        sb.append(str2);
                        Log.w(str, sb.toString());
                    } else {
                        ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                        if (outputBuffer != null) {
                            if ((bufferInfo.flags & 2) != 0) {
                                bufferInfo.size = 0;
                            }
                            if (bufferInfo.size != 0) {
                                if (this.f15937i) {
                                    outputBuffer.position(bufferInfo.offset);
                                    outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                                    this.f15936h.writeSampleData(bVar.f15940a, outputBuffer, bufferInfo);
                                } else {
                                    throw new RuntimeException("Encoder's muxer was not started!");
                                }
                            }
                            mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                            if ((bufferInfo.flags & 4) != 0) {
                                if (!z) {
                                    Log.w(str, "Encoder unexpectedly reached end of stream!");
                                    return;
                                }
                                return;
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Failed to retrieve valid output buffer from encoder (status: ");
                            sb2.append(dequeueOutputBuffer);
                            sb2.append(str2);
                            throw new RuntimeException(sb2.toString());
                        }
                    }
                } else if (!this.f15937i) {
                    bVar.f15940a = this.f15936h.addTrack(mediaCodec.getOutputFormat());
                    int i2 = this.f15938j + 1;
                    this.f15938j = i2;
                    if (i2 == this.f15939k) {
                        Log.d(str, "All tracks added, starting muxer");
                        this.f15936h.start();
                        this.f15937i = true;
                    }
                } else {
                    throw new RuntimeException("Encoder's muxer was already started!");
                }
            } else {
                return;
            }
        }
    }
}
