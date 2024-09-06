package org.homework.server;

import java.util.Optional;
import org.homework.server.entity.AccessLevel;
import org.homework.server.entity.ConfigData;
import org.homework.server.entity.User;
import org.homework.server.exception.InitializeServerException;


public class ServerConfig {
    private static final String CONFIG_FILE_PATH = "./src/main/resources/config.yml";
    private static ConfigData configData;

    private ServerConfig() {
        ConfigParser configParser = ConfigParser.getInstance();
        configData = configParser.parseConfigData(CONFIG_FILE_PATH);

        if (configData.usersAccess().isEmpty()) {
            throw new InitializeServerException();
        }
    }

    //thread save singleton Option 3
    public static ServerConfig getInstance() {
        return Singleton.INSTANCE;
    }

    public Optional<AccessLevel> getUserAccessLevel(User u) {
        return Optional.ofNullable(configData.usersAccess().get(u.name()));
    }

    public Optional<AccessLevel> getResourceAccessLevel(String resource) {
        return Optional.ofNullable(configData.resourcesAccess().get(resource));
    }

    private static class Singleton {
        private static final ServerConfig INSTANCE = new ServerConfig();
    }
}
