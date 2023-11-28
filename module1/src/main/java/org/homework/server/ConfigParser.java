package org.homework.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.File;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.homework.server.entity.ConfigData;
import org.homework.server.exception.InitializeServerException;

@Slf4j
public class ConfigParser {
    private static ConfigParser instance;

    private ConfigParser() {
    }

    //thread not save singleton Option 1
    public static ConfigParser getInstance() {
        if (instance == null) {
            instance = new ConfigParser();
        }
        return instance;
    }

    public ConfigData parseConfigData(String path) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        log.debug("Configuration file {} is about to be loaded", path);
        try {
            return mapper.readValue(new File(path), ConfigData.class);
        } catch (IOException e) {
            throw new InitializeServerException(e);
        }
    }
}
