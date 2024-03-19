package top.sharehome.springbootinittemplate.config.datasource.ds;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class WarehouseDataSourceConfig {
//    @Bean
//    @Primary
//    @ConfigurationProperties("datasource.warehouse")
//    public DataSourceProperties warehouseDatasourceProperties() {
//        return new DataSourceProperties();
//    }
//
//    @Bean
//    @Primary
//    @ConfigurationProperties("datasource.warehouse.configuration")
//    public DataSource warehouseDataSource() {
//        return warehouseDatasourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
//    }
}
