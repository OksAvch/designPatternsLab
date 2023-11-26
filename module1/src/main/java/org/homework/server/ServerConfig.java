package org.homework.server;

import org.homework.server.entity.AccessLevel;
import org.homework.server.entity.ConfigData;
import org.homework.server.entity.User;
import org.homework.server.exception.InitializeServerException;
import org.homework.server.util.ConfigParser;

import java.util.Optional;

public class ServerConfig {
    private static ServerConfig instance;
    private static ConfigData configData;

    private static final String configFilePath = "./src/main/resources/config.yml";

    public static ServerConfig getInstance() {
        if (instance == null) {
            instance = new ServerConfig();
        }
        return instance;
    }

    private ServerConfig() {
        ConfigParser configParser = ConfigParser.getInstance();
        configData = configParser.parseConfigData(configFilePath);

        if(configData.getUsersAccess().isEmpty()){
            throw new InitializeServerException();
        }
    }

    public Optional<AccessLevel> getUserAccessLevel(User u) {
        return Optional.ofNullable(configData.getUsersAccess().get(u.getName()));
    }

    public Optional<AccessLevel> getResourceAccessLevel(String resource) {
        return Optional.ofNullable(configData.getResourcesAccess().get(resource));
    }
}
