<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validate_fileupload()
{	
	var fileName=document.UploadForm.file.value;
    var file_extension = fileName.split('.').pop();

    if(file_extension =="xml" || file_extension=="XML")
    {
            return true; // valid file extension
    }
    else
    {
    	alert("Upload .xml file only");	
    	return false;
    }
    
}
</script>
</head>
<body>
		<html:form action="Upload" onsubmit="return validate_fileupload();">
			Upload XML File: <html:file property="file" name="UploadForm" /><br/>
				<html:submit value="Submit" />
		</html:form>
</body>
</html>