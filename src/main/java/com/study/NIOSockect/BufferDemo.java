package com.study.NIOSockect;

import java.nio.ByteBuffer;

public class BufferDemo {

    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        System.out.println(String.format("初始化：capacity容量：%s，position位置：%s，limit限制：%s", byteBuffer.capacity(), byteBuffer.position(), byteBuffer.limit()));
        byteBuffer.put((byte) 1);
        byteBuffer.put((byte) 2);
        byteBuffer.put((byte) 3);
        System.out.println(String.format("初始化：capacity容量：%s，position位置：%s，limit限制：%s", byteBuffer.capacity(), byteBuffer.position(), byteBuffer.limit()));
        byteBuffer.flip();
        System.out.println(String.format("初始化：capacity容量：%s，position位置：%s，limit限制：%s", byteBuffer.capacity(), byteBuffer.position(), byteBuffer.limit()));

    }
}
