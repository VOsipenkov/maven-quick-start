package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public int countWords(String words){
	  String[] separatedWords = StringUtils.split(words, ' ');
	  return separatedWords == null ? 0 : separatedWords.length;
	}

    public void greeting(){
		List<String> list = new ArrayList<>();
		list.add("greeting!");
		list.forEach(System.out::println);
	}
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
     	Application app = new Application();
	    app.greeting();
		int count = app.countWords("hello my friends!");
		System.out.println("there are " + count + " words");
    }
}