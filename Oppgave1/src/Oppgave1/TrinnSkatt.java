package Oppgave1;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class TrinnSkatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//En trinnskatt (tidligere toppskatt) er en progressiv skatt p� brutto l�nn 
		//som beregnes n�r inntekten er h�yere enn 164 100kr.
	
		
		int l�nn=Integer.parseInt(showInputDialog("brutto l�nn:"));
		
		if (l�nn<=164100) {
			double skatt1= l�nn* 0.00;
			showMessageDialog(null, "Skatt du betaller er :" + skatt1);
		}else if(l�nn<=230950) {
			double skatt2= l�nn* (0.93/100);
			showMessageDialog(null, "Skatt du betater er :" + skatt2 );
		}else if(l�nn<=580650) {
			double skatt3= l�nn* (2.41/100);
			showMessageDialog(null, "Skatt du betaler er :" + skatt3);
		}else if(l�nn<=934050) {
			double skatt4= l�nn*(11.52/100);
			showMessageDialog(null, "Skatt du betaller er:" + skatt4);
		}else if(l�nn>=934051) {
			double skatt5=l�nn*(14.52/100);
			showMessageDialog(null, "Skatt du betaler er :" + skatt5);
		}
		
	}

	}


