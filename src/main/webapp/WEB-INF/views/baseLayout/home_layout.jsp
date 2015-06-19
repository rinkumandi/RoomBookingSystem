<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title><tiles:insertAttribute name="title" ignore="true" /></title>
<center>
	<table border="1" width="1340">
		<tbody>
			<tr>
				<td colspan="2" height="100"><tiles:insertAttribute
						name="header" /></td>
			</tr>
			<tr>
				<td colspan="2" height="100"><tiles:insertAttribute name="menu" /></td>
			</tr>
			<tr>
				<td height="380"><tiles:insertAttribute name="body" /></td>
			</tr>
			<tr>
				<td colspan="2" height="30"><tiles:insertAttribute
						name="footer" /></td>
			</tr>
		</tbody>
	</table>
</center>