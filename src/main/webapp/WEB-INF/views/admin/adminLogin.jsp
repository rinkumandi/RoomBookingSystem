<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form action="home" commandName="loginUser">
	<table>
		<tr>
			<td colspan="2" align="center"><h2>Login</h2></td>
		</tr>
		<tr>
			<td>User Id:</td>
			<td><form:input path="userId" /></td>
			<td><form:errors path="userId"></form:errors></td>
		</tr>

		<tr>
			<td>Password:</td>
			<td><form:password path="password" /></td>
			<td><form:errors path="password"></form:errors></td>
		</tr>

		<tr>
			<td colspan="2" align="center"><input type="submit"
				value="LOG IN" /></td>
		</tr>
	</table>
</form:form>
${NOTFOUND} ${DID_NOT_MATCH}
