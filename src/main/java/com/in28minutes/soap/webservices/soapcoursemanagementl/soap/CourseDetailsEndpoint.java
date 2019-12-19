package com.in28minutes.soap.webservices.soapcoursemanagementl.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.in28minutes.courses.CourseDetails;
import com.in28minutes.courses.GetCourseDetailsRequest;
import com.in28minutes.courses.GetCourseDetailsResponse;
import com.in28minutes.soap.webservices.soapcoursemanagementl.soap.bean.Course;
import com.in28minutes.soap.webservices.soapcoursemanagementl.soap.service.CourseDetailsService;

@Endpoint
public class CourseDetailsEndpoint {
	
	@Autowired
	CourseDetailsService service;

	// method
	// input - GetCourseDetailsRequest
	// output - GetCourseDetailsResponse
	// we want the endpoint to support a namespace of http://in28minutes.com/courses
	// if a request comes with the above namespace and the name
	// GetCourseDetailsRequest
	// only the method
	// GetCourseDetailsRequest only the processCourseDetailsRequest method should be
	// called because the method can take
	// the request process it and return a response
	// we need to tell spring that when it comes a request with the above namespace
	// and name it should
	// process it with the below method. We do that by using the annotation Payload.
	// one of the things that the method should do it will need to take the XML and
	// map it to
	// this java class. The request format is the GetCourseDetailsRequest. We need
	// another annotation the
	// @RequestPayload
	// Οonce you get the response you will need to convert it to XML. you do that by
	// addint the annotation
	// ResponsePayload. In order to convert the object response to XML

	@PayloadRoot(namespace = "http://in28minutes.com/courses", localPart = "GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse processCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest request) {

		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		
		Course course = service.findById(request.getId());

		CourseDetails courseDetails = new CourseDetails();
		
		courseDetails.setId(course.getId());
		
		courseDetails.setName(course.getName());
		
		courseDetails.setDescription(course.getDescription());
		
		response.setCourseDetails(courseDetails);

		return response;
	}
}
