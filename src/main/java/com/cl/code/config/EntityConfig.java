package com.cl.code.config;

import com.cl.code.entity.UserData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chengliang
 * @since 2022/10/26 17:19
 */
@Configuration
public class EntityConfig {

    @Bean
    public UserData tableData() {
        return new UserData(1L, "chengliang", 18);
    }


}
