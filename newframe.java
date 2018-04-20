import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newframe extends JFrame implements ActionListener 
{
	JFrame f;
  
	JMenuBar mb;    
	JMenu file,edit,help;    
	JMenuItem cut,copy,paste,selectAll;    
	JTextArea ta;    
	newframe()
	{
		super("Welcome");

		f= new JFrame();
		cut=new JMenuItem("cut");    
		copy=new JMenuItem("copy");    
		paste=new JMenuItem("paste");    
		selectAll=new JMenuItem("selectAll");
	    
		cut.addActionListener(this);    
		copy.addActionListener(this);    
		paste.addActionListener(this);    
		selectAll.addActionListener(this);    
	
		mb=new JMenuBar();    
	
		file=new JMenu("File");    
		edit=new JMenu("Edit");    
		help=new JMenu("Help");     
		
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);    
		
		mb.add(file);
		mb.add(edit);
		mb.add(help);    
		
		f.add(mb);
		f.add(ta);    
		
		f.setJMenuBar(mb);  
    
		f.setSize(1000,600);    
		setLocation(230,100);
		f.setLayout(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);   

	}
	public void actionPerformed(ActionEvent e) 
	{    
		if(e.getSource()==cut)    
			ta.cut();    
		if(e.getSource()==paste)    
			ta.paste();    
		if(e.getSource()==copy)    
			ta.copy();    
		if(e.getSource()==selectAll)    
			ta.selectAll();    
	}

	public static void main(String[] args) 
	{
		new newframe();
	}
}