<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
	table{
	margin : auto;
	background-color : LightSeaGreen;
	}
</style>
</head>
<body style="background-color : Beige">
<h1 style="text-align : center;">Update Book</h1>
<form action="updateSave" method="post">
		<table style="with: 50%" border="2">
			<tr>
				<td>Title</td>
				<td><input type="text" value="${note.noteTitle}" /></td>
			</tr>
			<tr>
				<td>Content</td>
				<td><input type="text" value="${note.noteContent}" /></td>
			</tr>
			<tr>
				<td>Status</td>
				<td><input type="text" value="${note.noteStatus}" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"	value="Update Note" /></td>
			</tr>

		</table>
	</form>

</body>
</html>