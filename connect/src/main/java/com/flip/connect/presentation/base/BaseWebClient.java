package com.flip.connect.presentation.base;

import android.webkit.WebViewClient;

/**
 * Created by JGabrielFreitas on 18/04/17.
 */

public abstract class BaseWebClient extends WebViewClient {

//    protected static final String TAG = "webclient";
//
//    protected void logCookies(String url) {
//        String cookies = CookieManager.getInstance().getCookie(url);
//        Log.e(TAG, "All the cookies in a string:" + cookies);
//    }
//
//
//    protected String getCookie(String siteName, String cookieName) {
//        String cookieValue = null;
//
//        CookieManager cookieManager = getInstance();
//        String cookies = cookieManager.getCookie(siteName);
//        if (cookies != null) {
//            String[] temp = cookies.split(";");
//            for (String ar1 : temp) {
//                if (ar1.contains(cookieName)) {
//                    String[] temp1 = ar1.split("=");
//                    cookieValue = temp1[1];
//                    break;
//                }
//            }
//        }
//        return cookieValue;
//    }
//
//    protected void clearCookies(Context context) {
//
//        if (SDK_INT >= LOLLIPOP_MR1) {
//            Log.d("webclient", "Using clearCookies code for API >=" + valueOf(LOLLIPOP_MR1));
//            getInstance().removeAllCookies(null);
//            getInstance().flush();
//        } else {
//            Log.d("webclient", "Using clearCookies code for API <" + valueOf(LOLLIPOP_MR1));
//            CookieSyncManager cookieSyncMngr = createInstance(context);
//            cookieSyncMngr.startSync();
//            CookieManager cookieManager = getInstance();
//            cookieManager.removeAllCookie();
//            cookieManager.removeSessionCookie();
//            cookieSyncMngr.stopSync();
//            cookieSyncMngr.sync();
//        }
//    }


}
