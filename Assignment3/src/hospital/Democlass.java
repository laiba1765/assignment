package hospital;
import javax.swing.JOptionPane;
public class Democlass 
{
	public static void main(String[] args) 
	{
		
		String str="";
		String str1="";
		String str2;
		 int no;
		 int x;
		 char c,f;
		general.Date k[]=new general.Date[6];
		general.Time t[]=new general.Time[6];
		Doctor d[]=new Doctor[5];
		indoorPatient i[]=new indoorPatient[5];
		outdoorPatient j[]=new outdoorPatient[5];	
		k[0]=new general.Date(8,9,2020);
		k[1]=new general.Date(18,10,2007);
		k[2]=new general.Date(26,10,2000);		
		t[0]=new general.Time(8,8,"am");
		t[1]=new general.Time(10,12,"pm");
		t[2]=new general.Time(13,45,"pm");
		d[0]=new Doctor("ayesha","6789543256","986","female","crdic","cardiologists");
		d[1]=new Doctor("ali","611014275336","986497","male","asthma","Allergists");
		d[2]=new Doctor("umer","6894275336","986497","male","derma","dermatologist");
		d[3]=new Doctor("hamza","789914275336","9906497","male","endo","endocrinologist");
		i[0]=new indoorPatient("laiba","111123-890","0300-678905","female","698A",40,9,6,4,d[0],8000,k[1]);
		i[1]=new indoorPatient("shehneela","7","8999","female","8A",25,5,8,6,d[1],5000,k[0]);	
		i[2]=new indoorPatient("nadia","8","8779","female","10A",20,9,8,6,d[1],9000,k[0]);	
		j[0]=new outdoorPatient("haida","34567-9019856-2","0317-670000888","female","999A",20,5000,d[0],t[0],k[1]);	
		j[1]=new outdoorPatient("waleed","56789-95019856-2","0312-8907654","male","98A",21,4000,d[0],t[0],k[1]);	
	do
	{
		JOptionPane.showMessageDialog(null, "0:---------Add an indoor patient-----------.\n 1:-----------------Add an outdoor patient----------.\n"
			+"2:--------------See the list of all doctors-----------.\n 3:----------Search a doctor by name or department-----------.\n"
			+ "4:------------See the list of all indoor patients-----------.\n 5:------------See the list of all appointments on a certain day----------\n"
			+ "6:----------See the list of appointments of a certain doctor--------\n 7:------Change the date or time of appointment of a certain patient--------,"
			,"OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
		 str2=JOptionPane.showInputDialog("Select number from 0 to 7:");
		  no=Integer.parseInt(str2);
		if(no==0)
		{
			indoorPatient y=new indoorPatient();
			y.addInDoor("Ali","9","80 g-7","male","7A",20,2,7,9,d[1],5000,k[0]);	
		}
		else if(no==1)
		{
			outdoorPatient z=new outdoorPatient();
			z.addOutdoorPatient("wali", "78909787-7895433", "0312-54875271", "male","467A G-7", 23, 2000,d[1] ,t[1],k[2]);	
		}
		else if(no==2)
		{
			Doctor w=new Doctor();
			w.displayDoc(d);
		}
		else if(no==3)
		{
			JOptionPane.showMessageDialog(null, "1:-----Search doctor by Name----------.\n 2:------Search doctor by Department------.\n","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
			str2=JOptionPane.showInputDialog("Select a num from 1 and 2");
			  x=Integer.parseInt(str2);
			  Doctor w=new Doctor();
			  if(x==1)
			  {
				  str2=JOptionPane.showInputDialog("-------enter Doctor Name-------- :");
			      if(w.searchName(str2, d))
			    	  JOptionPane.showMessageDialog(null, "Doctor exists ","SEARCH RESULTS",JOptionPane.WARNING_MESSAGE);
			      else
			    	  JOptionPane.showMessageDialog(null, "Doctor does not exists ","SEARCH RESULTS",JOptionPane.WARNING_MESSAGE);
			  }
			  else if(x==2)
			  {
				  str2=JOptionPane.showInputDialog(" ----enter Department Name---- :");
				  if(w.searchDepartment(str2, d)==true)
					  JOptionPane.showMessageDialog(null, "Department exists ","SEARCH RESULTS",JOptionPane.WARNING_MESSAGE);
				  else
				  JOptionPane.showMessageDialog(null, "Department does not exists ","SEARCH RESULTS",JOptionPane.WARNING_MESSAGE);
			  }
			  else
				  JOptionPane.showMessageDialog(null, "Option is not available","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
		}
		else if(no==4)
		{
			indoorPatient y=new indoorPatient();
			y.displayIP(i);
		}
		else if(no==5)
		{
			indoorPatient y=new indoorPatient();
			outdoorPatient z=new outdoorPatient();
			str2=JOptionPane.showInputDialog("enter day:");
			x=Integer.parseInt(str2);
			str=y.appointments(x,i);
			str=str+z.appointments(x, j);
			 JOptionPane.showMessageDialog(null,str,"APPOINTMENT ON CERTAIN DATE",JOptionPane.WARNING_MESSAGE);
		}
		else if(no==6)
		{
			String s;
			indoorPatient y=new indoorPatient();
			outdoorPatient z=new outdoorPatient();
			str2=JOptionPane.showInputDialog(" ---enter Doctor name--- :");
			s=y.appointDoctor(str2,i);
			s=s+z.appointDoctor(str2,j);
			 JOptionPane.showMessageDialog(null,s,"APPOINTMENT WITH CERTAIN DOCTOR",JOptionPane.WARNING_MESSAGE);
		}
		else if(no==7)
		{
			indoorPatient y=new indoorPatient();
			outdoorPatient z=new outdoorPatient();
			JOptionPane.showMessageDialog(null, "i:Change date of indoorPatient.\no:Change time of outdoor patient.\n","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
			str2=JOptionPane.showInputDialog("Select character from 'i' or 'o'");
			  c=str2.charAt(0);
			  if(c=='i')
			  {
				  str="Original Date:"+i[1].getDatee();
				  y.dChanger(i[1]);
				  str=str+"Updated Date:"+i[1].getDatee();
				  JOptionPane.showMessageDialog(null,str,"UPDATION ",JOptionPane.WARNING_MESSAGE);
			  }
			  else if(c=='o')
			  {
				  JOptionPane.showMessageDialog(null, ":Change time.\n","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
				  str2=JOptionPane.showInputDialog("Select character t ");
				  f=str2.charAt(0);
				  
				   if(f=='t')
				  {
					  str="Original Time:"+j[1].getTimee();
					  z.tChanger(j[1]);
					  str=str+"Updated Time:"+j[1].getTimee();
					  JOptionPane.showMessageDialog(null,str,"UPDATION ",JOptionPane.WARNING_MESSAGE);
				  }
				  else
					  JOptionPane.showMessageDialog(null, "Option is not available","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
			  }
			  else
				  JOptionPane.showMessageDialog(null, "Option is not available","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);				  
		}
		
	}while(no!=0);	
}
}

