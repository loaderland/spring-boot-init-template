package top.sharehome.springbootinittemplate.config.datasource.ds;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class CenterDataSourceConfig {
//    @Bean
//    @Primary
//    @ConfigurationProperties("datasource.center")
//    public DataSourceProperties centerDatasourceProperties() {
//        return new DataSourceProperties();
//    }
//
//    @Bean
//    @Primary
//    @ConfigurationProperties("datasource.center.configuration")
//    public DataSource centerDataSource() {
//        return centerDatasourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
//    }
}
