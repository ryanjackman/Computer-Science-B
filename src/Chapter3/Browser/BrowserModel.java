package Chapter3.Browser;

public class BrowserModel {
	
	BrowserView view;
	int n;

	public BrowserModel(BrowserView view) {
		this.view = view;
		n = 0;
	}

	public void followLink(int n) {
		view.update(n);
		this.n = n;
	}

	public boolean hasBack() {
		return !(n == 0);
	}

	public boolean hasForward() {
		return !(n == view.getLength() - 1);
	}

	public void home() {
		view.update(0);
		n = 0;
	}

	public void back() {
		view.update(--n);
	}

	public void forward() {
		view.update(++n);
	}

}
