package configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("java")
public class WebConfig extends WebMvcConfigurerAdapter {


//    @Bean
//    public UrlBasedViewResolver viewResolver () {
//        JtwigViewResolver viewResolver = new JtwigViewResolver();
//        viewResolver.setRenderer(JtwigRenderer.defaultRenderer());
//        viewResolver.setPrefix("web:/WEB-INF/jtwig/");
//        viewResolver.setSuffix(".html.twig");
//        return viewResolver;
//    }

    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
        registry.addResourceHandler("/resources/js/**").addResourceLocations("/resources/js/");
        registry.addResourceHandler("/resources/css/**").addResourceLocations("/resources/css/");
        registry.addResourceHandler("/resources/sass/**").addResourceLocations("/resources/sass/");

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/orders").setViewName("orders");

    }
}
