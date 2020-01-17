package dev.entite;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PlatMapper implements RowMapper<Plat>{

	@Override
	public Plat mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plat p = new Plat();
		p.setId(rs.getInt("id"));
		p.setNom(rs.getString("nom"));
		p.setPrixEnCentimesEuros(rs.getInt("prix"));
				
		return p;
	}
	
	

}
