package org.homework.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.homework.server.entity.ConfigData;
import org.homework.server.exception.InitializeServerException;

import java.io.File;
import java.io.IOException;

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

        try {
            return mapper.readValue(new File(path), ConfigData.class);
        } catch (IOException e) {
            throw new InitializeServerException(e);
        }
    }
}
