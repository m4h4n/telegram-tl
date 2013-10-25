
package org.telegram.api.messages;


import org.telegram.tl.*;
import java.io.*;

import static org.telegram.tl.StreamingUtils.*;

public class TLMessagesStatedMessage extends TLAbsStatedMessage {
    public static final int CLASS_ID = 0xd07ae726;

    public int getClassId() {
        return CLASS_ID;
    }


    protected org.telegram.tl.TLVector<org.telegram.api.TLAbsChat> chats;

    protected org.telegram.tl.TLVector<org.telegram.api.TLAbsUser> users;


    public org.telegram.tl.TLVector<org.telegram.api.TLAbsChat> getChats() {
        return chats;
    }

    public void setChats(org.telegram.tl.TLVector<org.telegram.api.TLAbsChat> value) {
        this.chats = value;
    }

    public org.telegram.tl.TLVector<org.telegram.api.TLAbsUser> getUsers() {
        return users;
    }

    public void setUsers(org.telegram.tl.TLVector<org.telegram.api.TLAbsUser> value) {
        this.users = value;
    }


    @Override
    public void serializeBody(OutputStream stream) throws IOException {

        writeTLObject(this.message, stream);
        writeTLVector(this.chats, stream);
        writeTLVector(this.users, stream);
        writeInt(this.pts, stream);
        writeInt(this.seq, stream);
    }


    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {

        this.message = (org.telegram.api.TLAbsMessage)readTLObject(stream, context);
        this.chats = readTLVector(stream, context);
        this.users = readTLVector(stream, context);
        this.pts = readInt(stream);
        this.seq = readInt(stream);
    }

}
