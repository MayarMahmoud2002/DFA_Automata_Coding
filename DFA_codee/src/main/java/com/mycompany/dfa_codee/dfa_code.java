
package com.mycompany.dfa_codee;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class dfa_code {
    public void check ( String DFA )
    {
//         DFA = DFA.replaceAll("\n", " ");
		DFA= DFA.replaceAll(" +", " ");
        
		String words[]=DFA.split(" ");
                
                if (words.length == 4 )
                {
                if ( words[0].equals("1"))
                {
                   
                 if ( words[1].equals("1") && words[2].equals("0"))
                {
                     if ( words[3].equals("1") || words[3].equals("0") )
                     {
                         System.out.println("Accepted");
                         return ;
                     }
                }
                 else if ( words[1].equals("0") && words[2].equals("1"))
                {
                     if ( words[3].equals("1") || words[3].equals("0"))
                     {
                         System.out.println("Accepted");
                         return ;
                     }
                }
                }    
                }
                
                System.out.println("rejected");
    }

    public static void main(String[] args) {
    
        dfa_code d = new dfa_code() ;
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        d.check(str);
        
    }   
}
