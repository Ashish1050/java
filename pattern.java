// public class pattern {

//     public static void main(String[] args) {
//         int n =7;
//         for( int line=1; line<=n;line++){
//             for ( int star=1; star<=n-line+1;star++){
//               System.err.print("7");
              
//             }
//             System.out.println();
//         }
//     }
// }
// print Characyter patern
public class pattern {

    public static void main(String[] args) {
        char ch = 'A';
        int n = 4;
        for( int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}

