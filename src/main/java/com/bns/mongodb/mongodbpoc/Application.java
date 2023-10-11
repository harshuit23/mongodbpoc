package com.bns.mongodb.mongodbpoc;

import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableCaching
@EnableAutoConfiguration
public class Application {

              public static void main(String[] args) {
                             //System.setProperty("javax.net.debug", "all");

                             Security.addProvider(new BouncyCastleProvider());

                             new SpringApplicationBuilder(Application.class).run(args);
              }

}

