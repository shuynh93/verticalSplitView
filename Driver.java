package verticalSplitView;

public class Driver{

	public static void main(String[] args) {
		//construct Model
		SplitViewModel model = new SplitViewModel();
		//model.setNumSides( 6 );
		
		//construct Controller
		SplitViewController controller = new SplitViewController(model);
		
		//construct View	
		SplitView view = new SplitView(model, controller);
	
	}

}
