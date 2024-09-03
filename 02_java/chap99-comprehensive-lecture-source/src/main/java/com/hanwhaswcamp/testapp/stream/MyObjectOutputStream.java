package com.hanwhaswcamp.testapp.stream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream {

    public MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    /* 유저 정보를 추가 입력하여 파일에 쓸 때는 stream header 정보가 줄력되지 않도록 메소드 재작성 */
    @Override
    protected void writeStreamHeader() throws IOException {
//        super.writeStreamHeader();
    }

}
