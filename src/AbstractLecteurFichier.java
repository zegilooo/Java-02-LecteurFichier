import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public abstract class AbstractLecteurFichier implements InterfaceLecteurFichier {

	protected String file_name;
	protected ArrayList<String> content;
	protected File file;
	protected FileInputStream fis = null;
	
	public AbstractLecteurFichier(String file_name){
		this.file_name = file_name;
		this.content = new ArrayList<String>();
	}
	
	public boolean open_and_check() {
		this.file = new File(file_name);		
		return (file.exists() && file.canRead() && file.isFile());
	}

	public void read_file() {
		try{
			this.fis = new FileInputStream(file);	
			int octet = 0;
			while (octet !=  -1 ) {
			   octet = fis.read();
			   char caractere = (char) octet;
			   this.content.add(Character.toString(caractere));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(this.fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}
	abstract public void show();
}
