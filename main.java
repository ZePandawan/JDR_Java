import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		create_perso test = new create_perso();
		infos_persos haha = new infos_persos();
		sauvegarde test2 = new sauvegarde();
		test2.inFile();
		System.out.println(test.toString());
	}

}
