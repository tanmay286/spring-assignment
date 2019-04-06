package com.capgemini.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.capgemini.spring.organization.*;
import java.util.*; 
import java.io.*;

@Configuration
public class AppConfig {
	
	public List<String> getDirectors(){
		List<String> directors = new ArrayList<>();
 		directors.add("John");
		directors.add("Jane");
		return directors;
	}

	public Set<String> getBranches(){
		Set<String> branches = new HashSet<>();
 		branches.add("admin");
		branches.add("hr");
		return branches;
	}

	public Map<String,String> getBranchHead(){
		Map<String,String> branchHead = new HashMap<>();
 		branchHead.put("admin","John");
		branchHead.put("hr","Jane");
		return branchHead;
	}

	public Properties getIpAddresses(){
		Properties ipAddress = new Properties();
		ipAddress.put("admin", "192.168.1.1");
		ipAddress.put("hr", "192.168.1.2");
		return ipAddress;
	}
	public Properties getDatabaseDetails(){
		Properties databaseDetails = new Properties();
		FileReader reader = null;
		try {

			reader = new FileReader("src/dbConfig.properties");
			databaseDetails.load(reader);
	
		} 
		catch (IOException ex) {
			ex.printStackTrace();
		} 
		return databaseDetails;
	}

	public AddressConfig getAddress(){
		AddressConfig address = new AddressConfig("101","Airoli","Mumbai","Maharashtra");
		return address;
	}	

	@Bean("organization")
	public OrganizationConfig organization(){
		OrganizationConfig organization = new OrganizationConfig();
		organization.setOrgId(101);
		organization.setOrgName("Capgemini");
		organization.setMarketPrice(20000);
		organization.setAddress(getAddress());
		organization.setDirectors(getDirectors());
		organization.setBranches(getBranches());
		organization.setBranchHead(getBranchHead());
		organization.setIpAddresses(getIpAddresses());
		organization.setDatabaseDetails(getDatabaseDetails());
		return organization;
	}
}