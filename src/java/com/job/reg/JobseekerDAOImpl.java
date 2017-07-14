/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.reg;

import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

public class JobseekerDAOImpl implements JobseekerDAO {
    
    private JdbcTemplate jdbcTemplate;
 
    public JobseekerDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        
    }
 
    @Override
    public void saveJobSeeker(Jobseeker jobseeker)
    {

         String sql = "INSERT INTO jobseeker (name, email,password,mobile,course,specilization,yearOfPassing,Experience,KeySkills,currentLocation)"
                    + " VALUES (?, ?, ?, ?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, jobseeker.getName(), jobseeker.getEmailId(),jobseeker.getPassword(),jobseeker.getMobile(),
                            jobseeker.getCourse(),jobseeker.getSpecilization(),jobseeker.getYearOfPassing(),
                            jobseeker.getTotalExperience(),jobseeker.getKeySkills(),jobseeker.getCurrentLocation());
    }

public List<Jobseeker> getDetails() {
    String sql = "SELECT * FROM contact";
    List<Jobseeker> listContact = jdbcTemplate.query(sql, new RowMapper<Jobseeker>() {
 
        @Override
        public Jobseeker mapRow(ResultSet rs, int rowNum) throws SQLException {
            Jobseeker jobseeker = new Jobseeker();
 
            jobseeker.setName(rs.getString("name"));
            jobseeker.setEmailId(rs.getString("email"));
            jobseeker.setPassword(rs.getString("password"));
            jobseeker.setCourse(rs.getString("course"));
	    jobseeker.setSpecilization(rs.getString("specilization"));
	    jobseeker.setYearOfPassing(rs.getInt("yearOfPassing"));
	    jobseeker.setTotalExperience(rs.getInt("experience"));
	    jobseeker.setKeySkills(rs.getString("keyskills"));
            jobseeker.setCurrentLocation(rs.getString("currentLocation"));
 
            return jobseeker;
        }
 
    });
 
    return listContact;
}

}

    
 
