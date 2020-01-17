package com.facebook.imagepipeline.animated.base;

public interface AnimatedImage {
    void dispose();

    boolean doesRenderSupportScaling();

    int getDuration();

    AnimatedImageFrame getFrame(int i);

    int getFrameCount();

    int[] getFrameDurations();

    C9653a getFrameInfo(int i);

    int getHeight();

    int getLoopCount();

    int getSizeInBytes();

    int getWidth();
}
