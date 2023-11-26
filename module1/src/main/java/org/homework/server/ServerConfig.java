package org.homework.server;

import org.homework.server.entity.AccessLevel;
import org.homework.server.entity.ConfigData;
import org.homework.server.entity.User;
import org.homework.server.exception.InitializeServerException;

import java.util.Optional;

public class ServerConfig {
    private static ConfigData configData;

    private static final String CONFIG_FILE_PATH = "./src/main/resources/config.yml";

    //thread save singleton Option 3
    public static ServerConfig getInstance() {
        return Singleton.INSTANCE;
    }

    private ServerConfig() {
        ConfigParser configParser = ConfigParser.getInstance();
        configData = configParser.parseConfigData(CONFIG_FILE_PATH);

        if (configData.getUsersAccess().isEmpty()) {
            throw new InitializeServerException();
        }
    }

    public Optional<AccessLevel> getUserAccessLevel(User u) {
        return Optional.ofNullable(configData.getUsersAccess().get(u.getName()));
    }

    public Optional<AccessLevel> getResourceAccessLevel(String resource) {
        return Optional.ofNullable(configData.getResourcesAccess().get(resource));
    }

    private static class Singleton {
        private static final ServerConfig INSTANCE = new ServerConfig();
    }
}
