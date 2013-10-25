
package org.telegram.api;

import org.telegram.tl.*;
import java.io.*;

import static org.telegram.tl.StreamingUtils.*;
public class TLContact extends TLObject {

    public static final int CLASS_ID = 0xf911c994;

    public int getClassId() {
        return CLASS_ID;
    }


    protected int userId;

    protected boolean mutual;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int value) {
        this.userId = value;
    }

    public boolean getMutual() {
        return mutual;
    }

    public void setMutual(boolean value) {
        this.mutual = value;
    }


    @Override
    public void serializeBody(OutputStream stream) throws IOException {

        writeInt(this.userId, stream);
        writeTLBool(this.mutual, stream);
    }


    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {

        this.userId = readInt(stream);
        this.mutual = readTLBool(stream);
    }

}
