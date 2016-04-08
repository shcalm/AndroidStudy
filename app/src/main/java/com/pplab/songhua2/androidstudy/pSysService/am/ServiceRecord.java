package com.pplab.songhua2.androidstudy.pSysService.am;

import com.pplab.songhua2.androidstudy.pContext.Intent;

import java.util.AbstractCollection;

/**
 * Created by songhua2 on 2016/4/8.
 */
public class ServiceRecord {
    public Object packageName;
    public String userId;
    public long lastActivity;
    public boolean startRequested;
    public boolean delayedStop;
    public AbstractCollection<StartItem> pendingStarts;
    public String app;

    public Object makeNextStartId() {
    }

    public class StartItem {
        public StartItem(ServiceRecord r, boolean b, Object makeNextStartId, Intent service, NeededUriGrants neededGrants) {
        }
    }
}
