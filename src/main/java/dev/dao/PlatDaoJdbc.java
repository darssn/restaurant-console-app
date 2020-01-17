package dev.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dev.entite.Plat;
import dev.entite.PlatMapper;

@Repository
public class PlatDaoJdbc implements IPlatDao {
	
	private JdbcTemplate jdbcTemplate;
	
	
	public PlatDaoJdbc(DataSource datasource){
		
		this.jdbcTemplate = new JdbcTemplate(datasource) ;
		
	}

	@Override
	public List<Plat> listerPlats() {
		
		String sql = "SELECT * FROM plat";
		
		return this.jdbcTemplate.query(sql,new PlatMapper());
		
	
		
		
	}

	@Override
	public void ajouterPlat(String nomPlat, Integer prixPlat) {
		// TODO Auto-generated method stub
		
	}

}
