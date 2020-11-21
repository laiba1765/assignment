package hospital;
import javax.swing.JOptionPane;
public class Doctor
{
private  String name;
private String cnic;
private String phone_no;
private String gender;
private String dep;
private String spec;
Doctor()
{
	name="";
	cnic="";
	phone_no="";
	gender="";
	dep="";
	spec="";
}
Doctor(String name,String cnic,String phone_no,String gender,String dep,String spec)
{
this.name=name;
this.cnic=cnic;
this.phone_no=phone_no;
this.gender=gender;
this.dep=dep;
this.spec=spec;
}
public void getter()
{
	name=JOptionPane.showInputDialog("-----Enter doctor name :");
	cnic=JOptionPane.showInputDialog("---------Enter doctor cnic :");
	phone_no=JOptionPane.showInputDialog("---------Enter doctor phone no :");
	gender=JOptionPane.showInputDialog("----------Enter doctor gender :");
	dep=JOptionPane.showInputDialog("----------Enter department name of doctor :");
	spec=JOptionPane.showInputDialog("-----------Enter specilization of doctor:");
}
public void setter(String name,String cnic,String phone_no,String gender,String dep,String spec)
{
	this.name=name;
	this.cnic=cnic;
	this.phone_no=phone_no;
	this.gender=gender;
	this.dep=dep;
	this.spec=spec;	
}
public void display()
{
	if(checkGender()==true)
	{
	JOptionPane.showMessageDialog(null,"---Name is:" +name,"Doctor",JOptionPane.WARNING_MESSAGE);
	JOptionPane.showMessageDialog(null,"----CNIC is :" +cnic,"Doctor",JOptionPane.WARNING_MESSAGE);
	
	JOptionPane.showMessageDialog(null,"-----Phone number is:(92)" +phone_no,"Doctor",JOptionPane.WARNING_MESSAGE);
	JOptionPane.showMessageDialog(null,"------Gender is:" +gender,"Doctor",JOptionPane.WARNING_MESSAGE);
	JOptionPane.showMessageDialog(null,"---------Department name is:" +dep,"Doctor",JOptionPane.WARNING_MESSAGE);
	JOptionPane.showMessageDialog(null,"--------Specilization is:" +spec,"Doctor",JOptionPane.WARNING_MESSAGE);	
	}
	
	else
	{
		JOptionPane.showMessageDialog(null,"---------Name is:" +name,"Doctor",JOptionPane.WARNING_MESSAGE);
	JOptionPane.showMessageDialog(null,"----------CNIC is :" +cnic,"Doctor",JOptionPane.WARNING_MESSAGE);

	JOptionPane.showMessageDialog(null,"-----------Phone number is:(92)" +phone_no,"Doctor",JOptionPane.WARNING_MESSAGE);
	JOptionPane.showMessageDialog(null,"-----------Department name is:" +dep,"Doctor",JOptionPane.WARNING_MESSAGE);
	JOptionPane.showMessageDialog(null,"--------------Specilization is:" +spec,"Doctor",JOptionPane.WARNING_MESSAGE);	
	}
		
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public String getCnic()
{
	return cnic;
}
public void setCnic(String cnic)
{
	this.cnic=cnic;
}
public String getPhone_no()
{
	return phone_no;
}
public void setPhone_no(String phone_no)
{
	this.phone_no=phone_no;
}
public String getGender()
{
	return gender;
}
public void setGender(String gender)
{
	this.gender=gender;
}
public String getDep()
{
	return dep;
}
public void setDep(String dep)
{
	this.dep=dep;
}
public String getSpec()
{
	return spec;
}
public void setSpec(String spec)
{
	this.spec=spec;
}
public String toString()
{
	String str;
	if(checkGender()==true)
	str=getName()+"(" +getGender()+ ")("+getSpec()+")\n"+getCnic()+"\n92-"+getPhone_no()+"("+getDep()+")\n";
	else
		str=getName()+"("+getSpec()+")\n"+getCnic()+"\n92-"+getPhone_no()+"("+getDep()+")\n";
	return str;
}
public boolean checkGender()
{
	if((((((gender=="male")||(gender=="Male")||(gender=="MALE")||(gender=="female")||(gender=="feMale")||(gender=="FEMALE"))))))
		return true;
	else
		return false;
}
public boolean searchName(String name,Doctor d[])
 {
	for(int i=0;i<d.length;i++)
	{
		if(d[i]!=null)
		{
			if(d[i].getName().compareTo(name)==0)
				return true;
		}
	}
	return false;
 }
public boolean searchDepartment(String dep,Doctor d[])
{
	
     for(int i=0;i<d.length;i++)
      {
	    if(d[i]!=null)
	     {
		  if(d[i].getDep().compareTo(dep)==0)
			return true;
	     }        
      }		
     return false;
}
public void displayDoc(Doctor d[])
{
	//it will display list of all the available doctors
	String str="";
	   String str2="Doctor ";
	for(int i=0;i<d.length;i++)
	{
			if(d[i]!=null)
				str=str+str2+(i+1)+" name is :::::"+d[i].getName()+"\n";
			else
				str=str+"";
	    
	}
		JOptionPane.showMessageDialog(null,""+str,"LIST OF DOCTOR NAMES",JOptionPane.WARNING_MESSAGE);}
}