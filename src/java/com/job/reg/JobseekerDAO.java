/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.reg;


import java.util.List;
/**
 *
 * @author mvaikundam
 */
public interface JobseekerDAO {
   
    public void saveJobSeeker(Jobseeker jobseeker);
    public List<Jobseeker> getDetails();
 
}
    
