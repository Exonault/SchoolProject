package src;

public class MainMenu
{
    public static void main(String[] args)
    {
<<<<<<< HEAD
=======
        JFrame frame = new JFrame();
		
		
		frame.setBounds(0, 0, 600,480);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		JMenu CalcMenu = new JMenu("Calculators");
		menuBar.add(CalcMenu);	
		
		JMenuItem PrCalc = new JMenuItem("Programming Calculator");
		CalcMenu.add(PrCalc);
		JMenuItem ScCalc = new JMenuItem("Scientific Calculator");
		CalcMenu.add(ScCalc);
		JMenuItem StCalc = new JMenuItem("Standart Calculator");
		CalcMenu.add(StCalc);
        //slojete kodovete ot drygite LayoutiNaCalcolatorite otdolo:
        
        
        
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
>>>>>>> ebec912903c177656422be2c37c1043879be2ff8
    }
}
