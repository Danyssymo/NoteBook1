package edu.examples.java_classes.main;

import edu.examples.java_classes.controller.Controller;
import edu.examples.java_classes.dao.impl.FileNoteBookDao;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();
		FileNoteBookDao dao = new FileNoteBookDao();
		
		String request;
		String response;
		
		request = "ADD\nntitle=Книга\ncontent=Туманность Андромеды";
		response = controller.doAction(request);
		System.out.println(response);

		request = "ADD\ntitle=Журнал\nсоntent=Туманность Андромеды";
		response = controller.doAction(request);
		System.out.println(response);

		request = "ADD\ntitle=Лист\nсоntent=Туманность Андромеды";
		response = controller.doAction(request);
		System.out.println(response);

		request = "ADD\ntitle=Книга\nсоntent=Туманность Андромеды";
		response = controller.doAction(request);
		System.out.println(response);

		request = "OUTPUT\n";
		response = controller.doAction(request);
		System.out.println(response);

	}

}
