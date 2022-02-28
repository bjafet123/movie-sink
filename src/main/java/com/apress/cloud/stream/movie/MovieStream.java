package com.apress.cloud.stream.movie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Flux;

import java.util.function.Consumer;

@Log4j2
@Configuration
public class MovieStream {
   
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MovieStream.class);
	
	@Bean
    public Consumer<Flux<Movie>> log() {
        return movie -> movie.subscribe(actual -> log.info("Movie {}", actual));
    }
}
