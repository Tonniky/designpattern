package Builder;

import java.awt.List;

public class Builder {

	private List<Sender> list=new List<Sender>();
	
	public void produceMailSender(int count){
		for(int i=0;i<count;i++){
			list.add(new MailSender());
		}
	}
	
	
	public void produceSmsSender(int count){
		for(int i=0;i<=100;i++){
			list.add(new SmsSender());
		}
	}
	
	

}
