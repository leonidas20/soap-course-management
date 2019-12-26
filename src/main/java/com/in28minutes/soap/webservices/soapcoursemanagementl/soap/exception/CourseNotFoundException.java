package com.in28minutes.soap.webservices.soapcoursemanagementl.soap.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

import javassist.SerialVersionUID;

@SoapFault(faultCode = FaultCode.CUSTOM, customFaultCode = "{http://in28minutes.com/courses}001_COURSE_NOT_FOUND")
public class CourseNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 9012240188184841796L;

	public CourseNotFoundException(String message) {
		super(message);
	}
}