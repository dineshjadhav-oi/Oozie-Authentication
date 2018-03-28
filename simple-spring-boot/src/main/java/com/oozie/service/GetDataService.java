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
	    HttpSpnegoConnection httpSpnegoConnection=new HttpSpnegoConnection();
	    httpSpnegoConnection.getConnection();
	AuthOozieClient wc=new AuthOozieClient("http://10.0.0.42:12000/oozie","KERBEROS");//use your own oozie url
	 coordinatorJob = wc.getCoordJobInfo("0000002-180316055126995-oozie-oozi-C");
	}catch (OozieClientException e) {
	    e.printStackTrace();
	}catch (Exception e) {
	    e.printStackTrace();
	}
	return coordinatorJob;
    }
}
