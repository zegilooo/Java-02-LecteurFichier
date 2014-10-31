
public class LecteurFichier extends AbstractLecteurFichier{

	public LecteurFichier(String file_name){
		super(file_name);
	}

	public void show() {
		for(int i = 0; i < this.content.size(); i++){
			System.out.print(this.content.get(i));
		}
	}
	
}
