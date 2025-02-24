package dio.me.App;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.DoubleStream;

import static java.util.stream.DoubleStream.builder;

@Configuration
public class OpenApiConfig {
    @Bean
    public DoubleStream.Builder publicApi() {
        DoubleStream GroupedOpenApi;
        return builder();

    }

    private class GroupedOpenApi {
    }
}

