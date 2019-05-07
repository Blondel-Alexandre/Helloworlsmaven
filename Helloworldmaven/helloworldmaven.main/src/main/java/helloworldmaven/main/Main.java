package helloworldmaven.main;

import helloworldmaven.controller.Controller;
import helloworldmaven.model.Model;
import helloworldmaven.view.View;

public class Main {

	public static void main(String[] args) {
		
		Model model = new Model();
		View view = new View();
		
		Controller controller = new Controller(view, model);
		
		controller.run();

	}

}
