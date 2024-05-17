package sample.spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;

import ch.qos.logback.access.tomcat.LogbackValve;
import jakarta.servlet.http.Cookie;

@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        String empty = new String();

        Cookie c = new Cookie("COOKIENAME",
                "sensitivedata");
        c.setSecure(false);

        List<String> Bbb = new ArrayList<>();
        Bbb.add("empty");

        boolean flg = true;

        if (flg) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8,
                9, 10, 11, 12, 13, 14, 15, 16, 17,
                18, 19, 20, 21, 23, 24, 25, 26,
                27, 28, 29, 30};
        Arrays.asList(numbers).stream().filter(
                numberrrrrrrrrr -> numberrrrrrrrrr.length == 2)
                .collect(Collectors.toList());

        SpringApplication.run(
                HelloApplication.class, args);
    }

    @Bean
    TomcatServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcatServletWebServerFactory =
                new TomcatServletWebServerFactory();
        LogbackValve valve = new LogbackValve();
        valve.setFilename(
                LogbackValve.DEFAULT_FILENAME);
        tomcatServletWebServerFactory
                .addContextValves(valve);
        return tomcatServletWebServerFactory;
    }
}
