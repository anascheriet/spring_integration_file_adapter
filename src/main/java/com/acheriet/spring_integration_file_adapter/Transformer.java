package com.acheriet.spring_integration_file_adapter;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class Transformer {
    public String transform(String filePath) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        return "Output Data: \n" + content;
    }
}
