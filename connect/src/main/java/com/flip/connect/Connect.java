package com.flip.connect;

import android.content.Context;

/**
 * Created by JGabrielFreitas on 04/04/17.
 */

public class Connect {
    private static final Connect instance = new Connect();
    private ConnectConfigurations connectConfigurations;
    private String uniqueId;

    public static Connect getInstance() {
        return instance;
    }

    public static void initializer(ConnectConfigurations configurations) {
        getInstance().connectConfigurations = configurations;
    }

    public String getClientId() {
        return connectConfigurations.getClientId();
    }

    public String getHost() {
        return connectConfigurations.getHost();
    }

    public String getSchema() {
        return connectConfigurations.getSchema();
    }

    public String getClientSecret() {
        return connectConfigurations.getClientSecret();
    }

    public String getPublicToken() {
        return connectConfigurations.getPublicToken();
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
}
