package com.oozie.service;

import org.apache.log4j.Logger;
import org.apache.oozie.client.AuthOozieClient;
import org.apache.oozie.client.CoordinatorJob;
import org.apache.oozie.client.OozieClient;
import org.apache.oozie.client.OozieClientException;
import org.springframework.stereotype.Service;

@Service
public class GetDataService {
    private static final Logger LOGGER = Logger.getLogger(GetDataService.class);
    private static final String CONTEXT = "context";
    public CoordinatorJob jobInfo() {
	CoordinatorJob coordinatorJob=null;
	try{
	AuthOozieClient wc=new AuthOozieClient("http://localhost:12000/oozie");//use your own oozie url
	 coordinatorJob = wc.getCoordJobInfo("coordId");
	}catch (OozieClientException e) {
	    e.printStackTrace();
	}
	return coordinatorJob;
    }
}
