public class EscapeSequenceComments {
	
	public static void main (String[] args) {
		
		System.out.print ("Learn\tJava\n\tthe\nHard\tWay\n\n");
		System.out.print ("\tLearn Java the \"Hard\" Way!\n" );
		
		System.out.print ("Hello\n");
		System.out.print ("Jello\by\n");
		
		System.out.println ("Hard to believe, eh?");
		System.out.println ( "Surprised? /* abcde */ Or what did you expect?" );
		System.out./* Study Drills */println ( "\\ // -=- \\ //");
		System.out.println ( "\\\\ \\\\\\ \\\\\\\\" );
		System.out.println ( "I hope you understand \"escape sequences\" now.\n");
		
		}
	}	//putting a block comment in the middle of line 13 still allows it to compile.