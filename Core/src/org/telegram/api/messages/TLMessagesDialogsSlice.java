
package org.telegram.api.messages;


import org.telegram.tl.*;
import java.io.*;

import static org.telegram.tl.StreamingUtils.*;

public class TLMessagesDialogsSlice extends TLAbsDialogs {
    public static final int CLASS_ID = 0x71e094f3;

    public int getClassId() {
        return CLASS_ID;
    }


    protected int count;

    protected org.telegram.tl.TLVector<org.telegram.api.TLDialog> dialogs;

    protected org.telegram.tl.TLVector<org.telegram.api.TLAbsMessage> messages;

    protected org.telegram.tl.TLVector<org.telegram.api.TLAbsChat> chats;

    protected org.telegram.tl.TLVector<org.telegram.api.TLAbsUser> users;


    public int getCount() {
        return count;
    }

    public void setCount(int value) {
        this.count = value;
    }

    public org.telegram.tl.TLVector<org.telegram.api.TLDialog> getDialogs() {
        return dialogs;
    }

    public void setDialogs(org.telegram.tl.TLVector<org.telegram.api.TLDialog> value) {
        this.dialogs = value;
    }

    public org.telegram.tl.TLVector<org.telegram.api.TLAbsMessage> getMessages() {
        return messages;
    }

    public void setMessages(org.telegram.tl.TLVector<org.telegram.api.TLAbsMessage> value) {
        this.messages = value;
    }

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

        writeInt(this.count, stream);
        writeTLVector(this.dialogs, stream);
        writeTLVector(this.messages, stream);
        writeTLVector(this.chats, stream);
        writeTLVector(this.users, stream);
    }


    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {

        this.count = readInt(stream);
        this.dialogs = readTLVector(stream, context);
        this.messages = readTLVector(stream, context);
        this.chats = readTLVector(stream, context);
        this.users = readTLVector(stream, context);
    }

}
