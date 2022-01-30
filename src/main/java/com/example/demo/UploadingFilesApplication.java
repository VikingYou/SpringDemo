package com.example.demo;

import com.example.demo.uploadingfiles.storage.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class UploadingFilesApplication {
    public static void main(String[] args) {
        SpringApplication.run(UploadingFilesApplication.class, args);
    }
}
