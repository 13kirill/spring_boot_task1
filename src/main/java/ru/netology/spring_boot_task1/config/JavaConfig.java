package ru.netology.spring_boot_task1.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.spring_boot_task1.profile.DevProfile;
import ru.netology.spring_boot_task1.profile.ProductionProfile;
import ru.netology.spring_boot_task1.profile.SystemProfile;

@Configuration
public class JavaConfig {
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true")
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "false")
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}