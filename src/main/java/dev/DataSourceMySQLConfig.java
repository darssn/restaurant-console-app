package dev;



import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration

public class DataSourceMySQLConfig {
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
		// TODO mettre à jour les informations de connexion à la base de données
		
		
		dataSource.setUrl("jdbc:mariadb://bjpkdvythc3ljofp2yfj-mysql.services.clever-cloud.com:3306/bjpkdvythc3ljofp2yfj") ;
		dataSource.setUsername("u9rni7pw2fznq8ji");
		dataSource.setPassword("YwHrxs72xra3BbTJAvWf");
		return dataSource;
		}
	

	
	
	
}
