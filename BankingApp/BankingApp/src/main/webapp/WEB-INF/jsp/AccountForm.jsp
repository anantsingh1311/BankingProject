<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Form</title>
</head>
<body>
	<div align="center">
		<h1>Account Form</h1>
		<f:form action="saveAccount" modelAttribute="account">
			<table border="1">
				<tr>
					<td>Customer Id<f:input path="accountCustomer" class="Account" value="${acc.accountCustomer}" /></td>




				</tr>


				<tr>
					<td>Account Holder<f:input path="accountHolder"
							class="Account" value="${acc.accountHolder}" /></td>
				</tr>
				<tr>
					<td>Account Type<f:select path="accountType">
							<f:options items="${accountType}" />
						</f:select></td>
				</tr>
				<tr>
					<td>Date To be Opened On<f:input type="date"
							path="accountDateOpen" class="Account"
							value="${acc.accountDateOpen}" /></td>
				</tr>
				<tr>
					<td>Balance<f:input path="accountBalance" class="Account"
							value="${acc.accountBalance}" /></td>
				</tr>
				<tr>
					<td>Branch<f:input path="accountBranch" class="Account"
							value="${acc.accountBranch}" /></td>
				</tr>

				<tr>
					<td><input type="submit" />
					<td>
				</tr>
			</table>
		</f:form>

		<table border=1>

			<td>${Account.accountId}</td>
			<td>${Account.accountHolder}</td>
			<td>${Account.accountType}</td>
			<td>${Account.accountDateOpen}</td>
			<td>${Account.accountBalance}</td>
			<td>${Account.Branch.accountBranch}</td>
			<c:forEach items="${Accounts}" var="acc">

				<tr>
					<td>${acc.accountId}</td>
					<td>${acc.accountHolder}</td>
					<td>${acc.accountType}</td>
					<td>${acc.accountDateOpen}</td>
					<td>${acc.accountBalance}</td>
					<td>${acc.accountBranch}</td>
				</tr>

			</c:forEach>

		</table>

	</div>

</body>
</html>