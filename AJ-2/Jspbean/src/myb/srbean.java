package myb;
public class srbean
{
private String language;
private String uid;

public void setUid(String uid) {
	this.uid=uid;
}
public String getUid()
{
	return uid;
}
public void setLanguage(String la)
{
this.language=la;
}
public String getLanguage()
{
return language;
}
public String getComment()
{
if(language.equals("java"))
return "The King Of Object Oriented Language";


if(language.equals("dotnet"))
return "MicroSoft Technology";

else
return "Sorry No Details";
}
public String getCommentID()
{
if(uid.equals("1"))
return "The uid is 1";


if(uid.equals("2"))
return "The uid is 2";

else
return "Sorry No details";
}
}