package verticalSplitView;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class SplitView extends JFrame{

	private static final long serialVersionUID = 1L;
		
	SplitView frame;
	SplitViewModel model;
	SplitViewController controller;
	
	JPanel TopBrowserPane;
	JPanel bottonBrowserPane;
	
	JSplitPane splitPane;
	
	public SplitView(SplitViewModel model, SplitViewController controller){
		EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	frame = new SplitView();
                	frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
	}
	
	public SplitView() {
		super("Split View");
		
		//initialize frame size and layout
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(300, 100, 800, 600);
		
		TopBrowserPane = new JPanel();
		bottonBrowserPane = new JPanel();
		
		splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
				TopBrowserPane, bottonBrowserPane);
		
		splitPane.setOneTouchExpandable(true);
		
		
		getContentPane().add(splitPane, BorderLayout.CENTER);
		

	}

}
