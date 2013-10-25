
package org.telegram.api.contacts;


import org.telegram.tl.*;
import java.io.*;

import static org.telegram.tl.StreamingUtils.*;

public class TLContactsBlocked extends TLAbsBlocked {
    public static final int CLASS_ID = 0x1c138d15;

    public int getClassId() {
        return CLASS_ID;
    }


    protected org.telegram.tl.TLVector<org.telegram.api.TLContactBlocked> blocked;

    protected org.telegram.tl.TLVector<org.telegram.api.TLAbsUser> users;


    public org.telegram.tl.TLVector<org.telegram.api.TLContactBlocked> getBlocked() {
        return blocked;
    }

    public void setBlocked(org.telegram.tl.TLVector<org.telegram.api.TLContactBlocked> value) {
        this.blocked = value;
    }

    public org.telegram.tl.TLVector<org.telegram.api.TLAbsUser> getUsers() {
        return users;
    }

    public void setUsers(org.telegram.tl.TLVector<org.telegram.api.TLAbsUser> value) {
        this.users = value;
    }


    @Override
    public void serializeBody(OutputStream stream) throws IOException {

        writeTLVector(this.blocked, stream);
        writeTLVector(this.users, stream);
    }


    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {

        this.blocked = readTLVector(stream, context);
        this.users = readTLVector(stream, context);
    }

}
