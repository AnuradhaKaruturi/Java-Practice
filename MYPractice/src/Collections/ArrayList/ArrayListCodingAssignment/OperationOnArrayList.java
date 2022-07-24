package Collections.ArrayList.ArrayListCodingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OperationOnArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of TestCases :");
        int no_of_testcases = sc.nextInt();

        while(no_of_testcases--  >  0)
        {
        ArrayList<Integer> list = new ArrayList<Integer>();
         
        System.out.println("enter number of queries :");
        int quires = sc.nextInt();

            while(quires--  >  0){

                char c = sc.next().charAt(0);

                if(c == 'a'){
                    int num = sc.nextInt();
                    insert(list, num);
                }

                else if(c == 'b'){
                   Collections.sort(list);
                   System.out.println(list);
                }

                else if(c == 'c'){
                   Collections.reverse(list);
                   System.out.println(list);
                }

                else if(c == 'd'){
                   System.out.println(list.size());
                }

               else  if(c == 'e'){
                for(Integer i: list)
                {
                    System.out.print(i + " ");
                }
                }

                else if (c == 'f'){
                   Collections.sort(list,Collections.reverseOrder());
                   System.out.println(list);
                }

            }
         }
            sc.close();
    }

    private static void insert(ArrayList<Integer> list, int num) {
        list.add(num);
    }
    
}

/*Output
enter number of TestCases :
1
enter number of queries :
4
a
50
a
30
a
90
b
PS D:\AllJavaFiles\JAVAREVISIONPRACTICEMartoApr>  d:; cd 'd:\AllJavaFiles\JAVAREVISIONPRACTICEMartoApr'; & 'C:\Program Files\Eclipse Adoptium\jdk-8.0.322.6-hotspot\bin\java.exe' '-cp' 'C:\Users\anura\AppData\Roaming\Code\User\workspaceStorage\013968f8702d4241fe7fe4a3d5ecb592\redhat.java\jdt_ws\JAVAREVISIONPRACTICEMartoApr_377d7444\bin' 'Collections.ArrayList.ArrayListCodingAssignment.OperationOnArrayList' 
enter number of TestCases :
1
enter number of queries :
5
a
60
a
43
a
89
b
[]
 d:; cd 'd:\AllJavaFiles\JAVAREVISIONPRACTICEMartoApr'; & 'C:\Program Files\Eclipse Adoptium\jdk-8.0.322.6-hotspot\bin\java.exe' '-cp' 'C:\Users\anura\AppData\Roaming\Code\User\workspaceStorage\013968f8702d4241fe7fe4a3d5ecb592\redhat.java\jdt_ws\JAVAREVISIONPRACTICEMartoApr_377d7444\bin' 'Collections.ArrayList.ArrayListCodingAssignment.OperationOnArrayList' 
0
PS D:\AllJavaFiles\JAVAREVISIONPRACTICEMartoApr>  d:; cd 'd:\AllJavaFiles\JAVAREVISIONPRACTICEMartoApr'; & 'C:\Program Files\Eclipse Adoptium\jdk-8.0.322.6-hotspot\bin\java.exe' '-cp' 'C:\Users\anura\AppData\Roaming\Code\User\workspaceStorage\013968f8702d4241fe7fe4a3d5ecb592\redhat.java\jdt_ws\JAVAREVISIONPRACTICEMartoApr_377d7444\bin' 'Collections.ArrayList.ArrayListCodingAssignment.OperationOnArrayList'
enter number of TestCases :
1
enter number of queries :
6
a
79
a
3
a  
67
a 
12
b
[3, 12, 67, 79]
f
[79, 67, 12, 3]
*/