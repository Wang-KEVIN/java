import javax.swing.*;
import java.awt.*;
class WinGrid extends JFrame{
	GridLayout grid;
	WinGrid(){
		grid = new GridLayout(12,12);
		setLayout(grid);
		Label label[][] = new Label[12][12];
		for(int i = 0;i<12;i++){
			for(int j = 0;j<12;j++){
				label[i][j] = new Label();
					if((i+j)%2==0)
						label[i][j].setBackground(Color.black);
	  				else
						label[i][j].setBackground(Color.white);
	  				add(label[i][j]);
				}
		}
		setBounds(10,10,260,260);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		validate();
	}
}
public class qipan{
	public static void main(String args[]){
		new WinGrid();
	}
}