package Chapter3.Browser;

import java.util.Stack;

public class BrowserModel {
	
	BrowserView view;
	Stack<Integer> past;
	Stack<Integer> future;
	
	int position;

	public BrowserModel(BrowserView view) {
		this.view = view;
		past = new Stack<Integer>();
		future = new Stack<Integer>();
		position = 0;
	}

	public void followLink(int n) {
		view.update(n);
		past.push(position);
		position = n;
		future.clear();
	}

	public boolean hasBack() {
		return !past.isEmpty();
	}

	public boolean hasForward() {
		return !future.empty();
	}

	public void home() {
		view.update(0);
		past.push(position);
		position = 0;
		future.clear();
	}

	public void back() {
		int i = (int)past.pop();
		future.push(position);
		position = i;
		view.update(i);
	}

	public void forward() {
		int i = (int)future.pop();
		past.push(position);
		position = i;
		view.update(i);
	}

}
