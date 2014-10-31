
public class LecteurFichierReverse extends LecteurFichier {
	
	public LecteurFichierReverse(String file_name){
		super(file_name);
	}
	
	public void show() {
		for(int i = this.content.size()-1; i >=0 ; i--){
			System.out.print(this.content.get(i));
		}
	}
}
