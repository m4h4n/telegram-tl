
package org.telegram.api.photos;


import org.telegram.tl.*;
import java.io.*;

import static org.telegram.tl.StreamingUtils.*;

public class TLPhotosPhotosSlice extends TLAbsPhotos {
    public static final int CLASS_ID = 0x15051f54;

    public int getClassId() {
        return CLASS_ID;
    }


    protected int count;

    protected org.telegram.tl.TLVector<org.telegram.api.TLAbsPhoto> photos;

    protected org.telegram.tl.TLVector<org.telegram.api.TLAbsUser> users;


    public int getCount() {
        return count;
    }

    public void setCount(int value) {
        this.count = value;
    }

    public org.telegram.tl.TLVector<org.telegram.api.TLAbsPhoto> getPhotos() {
        return photos;
    }

    public void setPhotos(org.telegram.tl.TLVector<org.telegram.api.TLAbsPhoto> value) {
        this.photos = value;
    }

    public org.telegram.tl.TLVector<org.telegram.api.TLAbsUser> getUsers() {
        return users;
    }

    public void setUsers(org.telegram.tl.TLVector<org.telegram.api.TLAbsUser> value) {
        this.users = value;
    }


    @Override
    public void serializeBody(OutputStream stream) throws IOException {

        writeInt(this.count, stream);
        writeTLVector(this.photos, stream);
        writeTLVector(this.users, stream);
    }


    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {

        this.count = readInt(stream);
        this.photos = readTLVector(stream, context);
        this.users = readTLVector(stream, context);
    }

}
