package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class prototypeTest implements Cloneable,Serializable {

	private static final long serialVersionUID=1L;
	
	private String string;
	
	private SerializableObject obj;
	
	/*浅复制*/
	public Object clone() throws CloneNotSupportedException{
		prototypeTest proto=(prototypeTest)super.clone();
		return proto;
	}
	
	/*深复制*/
	public Object deepClone() throws IOException,ClassNotFoundException{
		
		/*写入当前对象的二进制流*/
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(this);
		
	/*读出当前对象的二进制流*/
	ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
	ObjectInputStream ois=new ObjectInputStream(bis);
	return ois.readObject();
	}
	
	
	public void SetString(String string){
		this.string=string;
	}
	
	public String getString(){
		return string;
	}
	
	public SerializableObject getObj(){
	   return obj;	
	}
	
	public void  setObj(SerializableObject obj){
		this.obj=obj;
	}
	
	
	
}
