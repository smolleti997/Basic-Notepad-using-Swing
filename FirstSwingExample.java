
import java.io.File;
import java.net.URL;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  


public class FirstSwingExample extends JFrame implements ActionListener {  
	 JFrame frame;
	 JTextArea text ;
	 Object[] options = {"Excellent","Good", "Average","Bad","Very Poor"};
	 
	FirstSwingExample(){  
		// Creating the frame
	    frame=new JFrame("My Text Editor");   
	    // creating text area
	     text = new JTextArea();
	    //text.setBounds(0,0,1000,1000);
	    
	    JMenuBar menuBar = new JMenuBar();
	    
	    
	    JMenu file = new JMenu("File");
	    JMenu home = new JMenu("Home");
	    JMenu help = new JMenu("Help");
	    
	    JMenuItem n = new JMenuItem("New");
	    JMenuItem o = new JMenuItem("Open");
	    JMenuItem s = new JMenuItem("Save");
	    JMenuItem p = new JMenuItem("Print");
	    JMenuItem sh = new JMenuItem("Share");
	    JMenuItem e = new JMenuItem("Export");
	    JMenuItem c = new JMenuItem("Close");
	    
	    n.addActionListener(this);
	    o.addActionListener(this);
	    s.addActionListener(this);
	    p.addActionListener(this);
	    sh.addActionListener(this);
	    e.addActionListener(this);
	    c.addActionListener(this);
	    
	    
	    JMenuItem co = new JMenuItem("Copy");
	    JMenuItem pa = new JMenuItem("Paste");
	    JMenu f = new JMenu("Font Size");
	    JMenuItem st = new JMenuItem("Style");
	    
	    JMenuItem eight = new JMenuItem("8");
	    JMenuItem six = new JMenuItem("16");
	    JMenuItem thirty = new JMenuItem("32");
	    
	    
	    co.addActionListener(this);
	    pa.addActionListener(this);
	   // f.addActionListener(this);
	    st.addActionListener(this);
	 
	    eight.addActionListener(this);
	    six.addActionListener(this);
	    thirty.addActionListener(this);
	    
	    
	    JMenuItem fe = new JMenuItem("Feedback");
	    JMenuItem con = new JMenuItem("Contact Support");
	    JMenuItem sho = new JMenuItem("Show Training");
	    
	    fe.addActionListener(this);
	    con.addActionListener(this);
	    sho.addActionListener(this);
	    
	    
	    file.add(n);
	    file.add(o);
	    file.add(s);
	    file.add(p);
	    file.add(sh);
	    file.add(e);
	    file.add(c);
	    
	    home.add(co);
	    home.add(pa);
	    home.add(f);
	    home.add(st);
	  
	    f.add(eight);
	    f.add(six);
	    f.add(thirty);
	    
	    help.add(fe);
	    help.add(con);
	    help.add(sho);
	    
	    
	    menuBar.add(file);
	    menuBar.add(home);
	    menuBar.add(help);
	    frame.setJMenuBar(menuBar);
	    frame.add(text);
	    frame.setSize(1000,1000);  
        frame.setVisible(true);   

	    
	}  
	
	public void actionPerformed(ActionEvent eve) {
		String stri = eve.getActionCommand();
	if(stri.equals("New")) {
		text.setText(" ");
		
	   }
     if(stri.equals("Open")) {
		 // Create an object of JFileChooser class
        JFileChooser j = new JFileChooser("f:");

        // Invoke the showsOpenDialog function to show the save dialog
        int r = j.showOpenDialog(null);

        // If the user selects a file
        if (r == JFileChooser.APPROVE_OPTION) {
            // Set the label to the path of the selected directory
            File fi = new File(j.getSelectedFile().getAbsolutePath());}
        else
            JOptionPane.showMessageDialog(frame, "the user cancelled the operation");

	}
	 if(stri.equals("Save")) {
		 JFileChooser j = new JFileChooser("f:");
		 
         // Invoke the showsSaveDialog function to show the save dialog
         int r = j.showSaveDialog(null);

         if (r == JFileChooser.APPROVE_OPTION) {

             // Set the label to the path of the selected directory
             File fi = new File(j.getSelectedFile().getAbsolutePath());}
         else
             JOptionPane.showMessageDialog(frame, "the user cancelled the operation");
		
	}
	 if(stri.equals("Print")) {
		try {
            // print the file
            text.print();
        }
        catch (Exception evt) {
            JOptionPane.showMessageDialog(frame, evt.getMessage());
        }
		
	}

	 if(stri.equals("Share")) {
		System.out.println("1.Whatsapp  2.Email");
		System.out.println("Enter choice:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i==1) {
			System.out.println("enter the number");
			int j = sc.nextInt();
			
		}
		else {
			System.out.println("Enter the email id");
			String str = sc.next();
		}
		
		System.out.println("Sent");
	}

	 if(stri.equals("Export")) {
		System.out.println("1.PDF  2.docx");
		System.out.println("Enter choice:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i==1) {
			System.out.println("PDF is ready");
		}
		else {
			System.out.println("Document is ready");
		}
		
	}

	 if(stri.equals("Close")) {
		frame.setVisible(false);
	}

	 if(stri.equals("Copy")) {
		text.copy();
	}

	 if(stri.equals("Paste")) {
		text.paste();
	}

	 if(stri.equals("8")) {
		 
		 Font  f1  = new Font(Font.SERIF, Font.PLAIN,  8);
		 text.setFont(f1);
		
	}
	
	if(stri.equals("16")) {
		 Font  f1  = new Font(Font.SERIF, Font.PLAIN,  16);
		 text.setFont(f1);
		
	}
	 if(stri.equals("32")) {
		 Font  f1  = new Font(Font.SERIF, Font.PLAIN,  32);
		 text.setFont(f1);
		
	}

	 if(stri.equals("Style")) {
		Font  f4  = new Font(Font.DIALOG_INPUT,  Font.BOLD|Font.ITALIC, 15);
		text.setFont(f4);
	}



	 if(stri.equals("Feedback")) {

		 
       JOptionPane.showOptionDialog(frame, "Feedback","Feedback", JOptionPane.YES_NO_CANCEL_OPTION,
 JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
       
       
       JOptionPane.showMessageDialog(frame, "Thankyou for the feedback");
       
		
	}

	 if(stri.equals("Contact Support")) {
		//open("https://support.microsoft.com/contactus");
		try {
		    Desktop.getDesktop().browse(new URL("https://support.microsoft.com/contactus").toURI());
		} catch (Exception u) {}
	}

	 if(stri.equals("Show Training")) {
	
				try {
				    Desktop.getDesktop().browse(new URL("https://support.microsoft.com/en-us/office/word-for-windows-training-7bcd85e6-2c3d-4c3c-a2a5-5ed8847eae73").toURI());
				} catch (Exception u) {}
	}
	
     

	}
	
	

	public static void main(String[] args) {
		FirstSwingExample first = new FirstSwingExample();
	}
}  