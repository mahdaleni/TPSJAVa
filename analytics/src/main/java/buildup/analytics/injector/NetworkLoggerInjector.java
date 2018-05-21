package buildup.analytics.injector;

import buildup.analytics.bms.BluemixNetworkLogger;
import buildup.analytics.network.NetworkLogger;

public class NetworkLoggerInjector {

    private static NetworkLogger instance;

    public static NetworkLogger networkLogger() {
        if (instance != null) {
            return instance;
        }
        instance = new BluemixNetworkLogger();
        return instance;
    }
}
