package Oppgave1;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class TrinnSkatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//En trinnskatt (tidligere toppskatt) er en progressiv skatt på brutto lønn 
		//som beregnes når inntekten er høyere enn 164 100kr.
	
		
		int lønn=Integer.parseInt(showInputDialog("brutto lønn:"));
		
		if (lønn<=164100) {
			double skatt1= lønn* 0.00;
			showMessageDialog(null, "Skatt du betaller er :" + skatt1);
		}else if(lønn<=230950) {
			double skatt2= lønn* (0.93/100);
			showMessageDialog(null, "Skatt du betater er :" + skatt2 );
		}else if(lønn<=580650) {
			double skatt3= lønn* (2.41/100);
			showMessageDialog(null, "Skatt du betaler er :" + skatt3);
		}else if(lønn<=934050) {
			double skatt4= lønn*(11.52/100);
			showMessageDialog(null, "Skatt du betaller er:" + skatt4);
		}else if(lønn>=934051) {
			double skatt5=lønn*(14.52/100);
			showMessageDialog(null, "Skatt du betaler er :" + skatt5);
		}
		
	}

	}


