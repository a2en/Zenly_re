package p213co.znly.cardgenerator;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: co.znly.cardgenerator.a */
class C6350a {

    /* renamed from: a */
    private MediaMuxer f15921a;

    /* renamed from: b */
    private List<C6352b> f15922b = new ArrayList();

    /* renamed from: co.znly.cardgenerator.a$b */
    private class C6352b {

        /* renamed from: a */
        int f15923a;

        /* renamed from: b */
        MediaExtractor f15924b;

        private C6352b(C6350a aVar) {
            this.f15923a = -1;
            this.f15924b = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo14222a() {
            MediaExtractor mediaExtractor = this.f15924b;
            if (mediaExtractor != null) {
                mediaExtractor.release();
                this.f15924b = null;
            }
        }
    }

    C6350a(MediaMuxer mediaMuxer) {
        this.f15921a = mediaMuxer;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14220a(MediaExtractor mediaExtractor) {
        MediaFormat trackFormat = mediaExtractor.getTrackFormat(0);
        C6352b bVar = new C6352b();
        bVar.f15924b = mediaExtractor;
        bVar.f15923a = this.f15921a.addTrack(trackFormat);
        this.f15922b.add(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo14221b() {
        ByteBuffer allocate = ByteBuffer.allocate(262144);
        BufferInfo bufferInfo = new BufferInfo();
        for (C6352b bVar : this.f15922b) {
            int i = bVar.f15923a;
            MediaExtractor mediaExtractor = bVar.f15924b;
            mediaExtractor.selectTrack(0);
            mediaExtractor.seekTo(0, 2);
            while (true) {
                bufferInfo.offset = 0;
                bufferInfo.size = mediaExtractor.readSampleData(allocate, 0);
                if (bufferInfo.size >= 0) {
                    bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                    bufferInfo.flags = mediaExtractor.getSampleFlags();
                    this.f15921a.writeSampleData(i, allocate, bufferInfo);
                    mediaExtractor.advance();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14219a() {
        for (C6352b a : this.f15922b) {
            a.mo14222a();
        }
        this.f15922b.clear();
    }
}
