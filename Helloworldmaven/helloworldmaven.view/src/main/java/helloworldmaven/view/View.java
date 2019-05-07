package helloworldmaven.view;

import helloworldmaven.contract.IView;

public class View implements IView{

	@Override
	public void displayMessage(String message) {
		System.out.println(message);
		}
	
	

}
