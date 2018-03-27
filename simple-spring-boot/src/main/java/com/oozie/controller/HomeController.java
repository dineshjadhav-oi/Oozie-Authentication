package com.oozie.controller;

import org.apache.oozie.client.CoordinatorJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oozie.service.GetDataService;

/**
 * @author Jerry Conde, webmaster@javapointers.com
 * @since 8/9/2016
 */
@Configuration
@RestController
@RequestMapping(value = "/scheduler")
public class HomeController {
@Autowired
GetDataService getDataService;


@ResponseBody
@RequestMapping(value = "/jobInfo", method= RequestMethod.GET)
    public ResponseEntity<CoordinatorJob> jobInfo()  {
	CoordinatorJob coordinatorJob=getDataService.jobInfo();
	
	return new ResponseEntity<CoordinatorJob> (coordinatorJob, HttpStatus.OK);
    }
}
