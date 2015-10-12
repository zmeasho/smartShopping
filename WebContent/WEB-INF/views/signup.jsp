<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<div class="row">
    <div class="col-lg-12">
        <section class="panel">
            <header class="panel-heading">
               Signup Here 
            </header>
            <div class="panel-body">

                <form:form modelAttribute="newUser" method="POST" enctype="utf8" class="form-horizontal">
	        			<div class= "caption">
	        				 <div class="form-group">
                             	<label class="col-sm-2 control-label" for="categoryName"><spring:message code="label.user.UserType" text="Type"></spring:message></label>
                                <div class="col-xs-4">
                                    <form:select id="selectCategory" name="categoryId" path="userType" multiple="single" class="form-control">
										<form:option value="customer">Customer</form:option>
										<form:option value="vendor">Vendor</form:option>
                                    </form:select>
                                </div>
                            </div>

	                        <div class="form-group">
	                            <label class="col-sm-2 control-label" for="fname"><spring:message code="label.user.firstName"></spring:message></label>
	                            <div class="col-xs-4">
	                                <form:input type="text" id ="fname" path="fname" class="form-control"/>
	                            </div>
	                        </div>
	                        <div class="form-group">
	                            <label class="col-sm-2 control-label" for="lname"><spring:message code="label.user.lastName"></spring:message></label>
	                            <div class="col-xs-4">
	                                <form:input type="text" id ="lname" path="lname" class="form-control"/>
	                            </div>
	                        </div>
	                        
	                        <div class="form-group">
	                            <label class="col-sm-2 control-label" for="email"><spring:message code="label.user.email"></spring:message></label>
	                            <div class="col-xs-4">
	                                <form:input type="text" id ="email" path="email" class="form-control"/>
	                            </div>
	                        </div>
	                        
	                        <div class="form-group">
	                            <label class="col-sm-2 control-label" for="phone"><spring:message code="label.user.phone"></spring:message></label>
	                            <div class="col-xs-4">
	                                <form:input type="text" id ="phone" path="phone" class="form-control"/>
	                            </div>
	                        </div>
	                        
	                        <div class="form-group">
	                            <label class="col-sm-2 control-label" for=street><spring:message code="label.user.address.str"></spring:message></label>
	                            <div class="col-xs-4">
	                                <form:input type="text" id ="street" path="address.street" class="form-control"/>
	                            </div>
	                        </div>
	                        
	                        <div class="form-group">
	                            <label class="col-sm-2 control-label" for=state><spring:message code="label.user.address.state"></spring:message></label>
	                            <div class="col-xs-4">
	                                <form:input type="text" id ="state" path="address.state" class="form-control"/>
	                            </div>
	                        </div>
	                        
	                        <div class="form-group">
	                            <label class="col-sm-2 control-label" for=zipcode><spring:message code="label.user.address.zip"></spring:message></label>
	                            <div class="col-xs-4">
	                                <form:input type="text" id ="zipcode" path="address.zipcode" class="form-control"/>
	                            </div>
	                        </div>
	                        
	                        <div class="form-group">
	                            <label class="col-sm-2 control-label" for=username><spring:message code="label.user.userName"></spring:message></label>
	                            <div class="col-xs-4">
	                                <form:input type="text" id ="username" path="credentials.username" class="form-control"/>
	                            </div>
	                        </div>
	                        
	                        <div class="form-group">
	                            <label class="col-sm-2 control-label" for=password><spring:message code="label.user.password"></spring:message></label>
	                            <div class="col-xs-4">
	                                <form:input type="password" id ="password" path="credentials.password" class="form-control"/>
	                            </div>
	                        </div>
	                        
	                        <div class="form-group">
	                            <label class="col-sm-2 control-label" for=verifyPassword><spring:message code="label.user.verifyPassword"></spring:message></label>
	                            <div class="col-xs-4">
	                                <form:input type="password" id ="verifyPassword" path="credentials.verifyPassword" class="form-control"/>
	                            </div>
	                        </div>
	                        
	                        <form:hidden path="credentials.authority[0].authority"  value="ROLE_USER" />
	                        
	                        <form:hidden path="credentials.enabled" value="TRUE"  />
	                        
	                      

                        <div class="form-group">
                            <div class="col-lg-offset-2 col-lg-10">
                                <button class="btn btn-danger" type="submit">Save</button>
                                <a href="list"><button class="btn btn-default" type="button">Cancel</button></a>
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </section>
    </div>
</div>
