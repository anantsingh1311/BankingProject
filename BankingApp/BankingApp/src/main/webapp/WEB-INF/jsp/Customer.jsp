<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
</head>
<body>
	<div align="center">
		<h1>Customer Form</h1>
		<f:form action="saveCustomer" modelAttribute="customer">

			<br>

			<table border=1>
				<tr>
					<td>Customer Id:<f:input path="customerId" class='Customer' value="${customer.customerId}"/></td>
					<td><f:errors path="customerId" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Name:<f:input path="customerName" class='Customer'  value="${customer.customerName}" /></td>
					<td><f:errors path="customerName" cssClass="error" /></td>
				</tr>
				<tr>
				<%-- <form:radiobutton path="sex" value="M"/>Male 
<form:radiobutton path="sex" value="F"/>Female  --%>
					<td>Gender:<f:radiobutton path="customerGender" class='Customer' value="M"/>Male<f:radiobutton path="customerGender" class='Customer' value="F"/>Female</td>
					<td><f:errors path="customerGender" cssClass="error" /></td>
				</tr>
				<tr>
					<td>DOB:<f:input type ="date" path="customerDob" class='Customer' /></td>
					<td><f:errors path="customerDob" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Mobile:<f:input path="customerMobileNum" class='Customer'  value="${customer.customerMobileNum}"/></td>
					<td><f:errors path="customerMobileNum" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Address Line 1:<f:input path="customerAddress.addressLine1" class='Customer'  value="${customer.customerAddress.addressLine1}" /></td>
					<td><f:errors path="customerAddress.addressLine1" cssClass="error" /></td>
					
				</tr>
				<tr>
					<td>Address Line 2:<f:input path="customerAddress.addressLine2" class='Customer' value="${customer.customerAddress.addressLine2}" /></td>
					<td><f:errors path="customerAddress.addressLine2" cssClass="error" /></td>
					
				</tr>
				<tr>
					<td>City:<f:input path="customerAddress.city" class='Customer' value = "${customer.customerAddress.city}"/></td>
					<td><f:errors path="customerAddress.city" cssClass="error" /></td>
				</tr>
				<tr>
					<td>State:<f:input path="customerAddress.state" class='Customer' value="${customer.customerAddress.state}"/></td>
					<td><f:errors path="customerAddress.state" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Country:<f:input path="customerAddress.country" class='Customer' value="${customer.customerAddress.country}"/></td>
					<td><f:errors path="customerAddress.country" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Zip-code:<f:input path="customerAddress.zipcode" class='Customer' value="${customer.customerAddress.zipcode}"/></td>
					<td><f:errors path="customerAddress.zipcode" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Id Proof(Real-Id):<f:input path="realId" class='Customer' value="${customer.realId}"/></td>
					<td><f:errors path="realId" cssClass="error" /></td>
				</tr>
				<tr>
					<td><input type="submit" />
					<td>
				</tr>
			</table>
		</f:form>
		<table border=1>

			<tr>
				<td>${customer.customerId}</td>
				<td>${customer.customerName}</td>
				<td>${customer.customerGender}</td>
				<td>${customer.customerMobileNum}</td>
				<td>${customer.customerAddress.city}</td>
				<td>${customer.customerDob}</td>
			</tr>
			<c:forEach items="${customers}" var="customer">
				<tr>
					<td>${customer.customerId}</td>
					<td>${customer.customerName}</td>
					<td>${customer.customerGender}</td>
					<td>${customer.customerMobileNum}</td>
					<td>${customer.customerAddress.city}</td>
					<td>${customer.customerDob}</td>
				</tr>
			</c:forEach>

		</table>
	</div>

</body>
</html>