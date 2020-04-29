import java.awt.*;  
class Awt_Ass{  
	public static void main(String args[]){
//////////////////Creating Frame//////////////////////////////////  
    Frame f= new Frame("IT Department");    
///////////////Text Area/////////////////////////////////////////
 	TextArea area = new TextArea("Welcome To IT Department");  
    	area.setBounds(500,50, 300,100);  
    	f.add(area);  
///////////////Checkboxes////////////////////////////////////////
    Checkbox checkbox1 = new Checkbox("B.Tech");  
    	checkbox1.setBounds(500,150, 80,50);  
    Checkbox checkbox2 = new Checkbox("M.Tech", true);  
    	checkbox2.setBounds(500,200,80,50); 
    	f.add(checkbox1);  
    	f.add(checkbox2);  
//////////////Choice For Btech///////////////////////////////////
     Choice b_tech=new Choice();  
       	b_tech.setBounds(600,160, 100,40);  
       	b_tech.add("Select"); b_tech.add("1");  b_tech.add("2");b_tech.add("3");b_tech.add("4");  
       	b_tech.add("5");b_tech.add("6");b_tech.add("7");b_tech.add("8");
        f.add(b_tech);  
//////////////Choice For Mtech///////////////////////////////////
     Choice m_tech=new Choice();  
       	m_tech.setBounds(600,210,100,40);  
  		m_tech.add("Select");m_tech.add("1");m_tech.add("2");m_tech.add("3");m_tech.add("4");  
        f.add(m_tech);  
///////////////Setting Layout/////////////////////////////////////
    	f.setSize(1000,1800);f.setLayout(null);f.setVisible(true);  
	}  
}  