package controller;
import model.Decode;
import model.Tags;

public class Test {

	
	public void test() {

		String s = Decode.getMessage(Tags.CHAT_MSG_OPEN_TAG + "msg" + Tags.CHAT_MSG_CLOSE_TAG);
		System.out.println(s);
	}

}
