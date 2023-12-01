<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Anant's Bank</title>
</head>
<body>
	<div align='center'>
		<h1 align="center">Branches</h1>
		<f:form action="saveBranch" modelAttribute="branch">
			<br>
			<table border="1">
				<tr>
					<td>Branch Id:<f:input path="branchId" class='Branch' /></td>
					<td><f:errors path="branchId" /></td>
				<tr>
				<tr>
					<td>Branch Name:<f:input path="branchName" class='Branch' /></td>
					<td><f:errors path="branchName" /></td>
				</tr>
				<tr>
					<td>Branch Address:<f:input type='text'
							path="branchAddress.addressLine1" id='branchAddress'
							class='Branch' /></td>
				</tr>
				<tr>
					<td>Branch Address Line 2:<f:input type='text'
							path="branchAddress.addressLine2" id='branchAddress2'
							class='Branch' /></td>
				</tr>
				<tr>
					<td>Branch City:<f:input type='text' id='branchCity'
							path="branchAddress.city" class='Branch' /></td>
				</tr>
				<tr>
					<td>Branch Sate:<f:input type='text' id='branchName'
							path="branchAddress.state" class='Branch' /></td>
				</tr>
				<tr>
					<td>Branch Country:<f:input type='text' id='branchCountry'
							path="branchAddress.country" class='Branch' /></td>
				</tr>
				<tr>
					<td>Branch ZIP code:<f:input type='text' id='branchZipcode'
							path="branchAddress.zipcode" class='Branch' /></td>
				</tr>
				<tr>
					<td><input type="submit" />
					<td>
				</tr>
			</table>
		</f:form>
		<br>****${branches.size()}
		<table border=1>
		
		<td>${branch.branchId}</td> <td>${branch.branchName}</td> <td>${branch.branchAddress.addressLine1}</td><td>${branch.branchAddress.addressLine2}</td>
		<c:forEach items="${branches}" var="branch">
		
		<tr>
		<td>${branch.branchId}</td> <td>${branch.branchName}</td> <td>${branch.branchAddress.addressLine1}</td><td>${branch.branchAddress.addressLine2}</td>
		</tr>
		
		</c:forEach>
		
		</table>
	</div>





</body>
</html>