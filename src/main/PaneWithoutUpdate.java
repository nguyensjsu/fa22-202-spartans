
public class PaneWithoutUpdate extends DecoratorPane {

	PaneWithoutUpdate(Component pane) {
		super(pane);
	}

	@Override
	public void decorate() {
		super.decorate();
		NewButton newbtn = new NewButton("New");
		super.addButtons(newbtn);
	}
}
