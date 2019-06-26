
public class Driver {

	public static void main(String[] args) {
		// using factory
		Manger m1 = (Manger) Employee.getInstance("manager");
		BaseEmployee b1 = (BaseEmployee) Employee.getInstance("BaseEmployee");
		// test Observer
		Task[] t = new Task[3];
		t[0] = new Task();
		t[1] = new Task();
		t[2] = new Task();
		b1.setTasks(t);
		t[0].registerObserver(m1);
		t[0].setId(5778);
		t[0].notifyObservers();
		for (int i = 0; i < m1.getNotifications().size(); i++) {

			System.out.println(m1.getNotifications().get(i));
		}
	}

}
