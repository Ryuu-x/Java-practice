
// Program to print half pyramid using * // 

// public class pyramid 
// {
//     public static void main(String[] args)    
//     {
//         for(int i = 0; i < 5; i++)
//         {
//             for(int j = 0; j <= i; j++)
//             {
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }

// Program to print half pyramid a using numbers // 

//  public class pyramid
//  {
//     public static void main(String[] args)
//     {
//         for(int i = 0; i <= 5; i++)
//         {
//             for(int j = 1; j <= i; j++)
//             {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
//  }

// Program to print half pyramid using alphabets // 

// public class pyramid {

//     public static void main(String[] args) 
//     {
//       char last = 'E', alphabet = 'A';

//       for(int i = 1; i <= (last - 'A' + 1); i++)
//       {
//         for(int j = 1; j <= i; j++)
//         {
//             System.out.print(alphabet + " ");
//         }
//         ++alphabet;

//         System.out.println();
//       }
//     }

// }

// Inverted half pyramid using * // 

// public class pyramid
// {
//     public static void main(String[] args)
//     {
//         for(int i = 0; i < 5; i++)
//         {
//             for(int j = 5; j > i; j--)
//             {
//                 System.out.print(" *");
//             }

//             System.out.println();
//         }
//     }
// }

// Program to print full pyramid using * // 
//  * redo Samaj nahi aya pura * // 

public class pyramid {
    public static void main(String[] args) {
        int k  = 0;

        for (int i = 1; i <= 5; i++, k = 0) {
            for (int space = 1; space <= 5 - i; space++) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) 
            {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}