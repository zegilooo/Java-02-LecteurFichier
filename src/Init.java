
public class Init {

	public static void main(String[] args) {
		String file_name = "file.txt";
		System.out.print("------------------ À l'endroit : "+file_name+"=>");
		show_file(file_name);
		System.out.print("\n\n");
		System.out.print("------------------ À l'envers : "+file_name+"=>");
		show_file_reverse(file_name);
		System.out.print("\n\n");
		System.out.print("------------------ En palindrome : "+file_name+"=>");
		show_file_palindrome(file_name);
	}
	
	public static void show_file(String file_name){
		LecteurFichier lf = new LecteurFichier(file_name);
		if(lf.open_and_check()){
			lf.read_file();
			lf.show();
		}
	}
	
	public static void show_file_reverse(String file_name){
		LecteurFichierReverse lf = new LecteurFichierReverse(file_name);
		if(lf.open_and_check()){
			lf.read_file();
			lf.show();
		}
	}	
	
	public static void show_file_palindrome(String file_name){
		LecteurFichierPalindrome lf = new LecteurFichierPalindrome(file_name);
		if(lf.open_and_check()){
			lf.read_file();
			lf.show();
		}
	}
	
}
