package com.cloudpos.utils;

import android.content.ServiceConnection;

public interface IAIDLListener {

    public static final int STATE_UNKNOW = -1;

    void serviceConnected(Object objService, ServiceConnection connection);

}
