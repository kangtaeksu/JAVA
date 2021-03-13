package kosta.mission;

import java.util.Scanner;

public class For_test {

	public static void main(String[] args) {

		// int arr[] = new int[25];
		// 1-1 성공
//		      for (int i = 0; i < arr.length; i++) {
//		         
//		            System.out.printf(i+1 +"\t");
//		            if((i+1)%5 == 0 ){
//		               System.out.println("\n");
//		            }else {
//		               continue;
//		            }

//		         }
		// 1_2 성공

//		      int arr[][] = new int[5][5];
//		      for (int i = 4; i >= 0; i--) {
//		         for (int j = 1; j <= 5; j++) {
		//
//		            System.out.print(5*i+j + "\t");
//		         }
//		         System.out.println();
//		      }

		// 1-3 성공
//		      int arr[] = new int[25];
//		            
//		            for (int i = 0; i < arr.length; i++) {
//		               
//		                  System.out.printf(2*i+1 +"\t");
//		                  if((i+1)%5 == 0 ){
//		                  System.out.println("\n");
//		               }else {
//		                  continue;
//		               }
		//
//		               }

		// 1_4 성공

//		      int arr[][] = new int[5][5];
//		      for (int i = 1; i <= 5; i++) {
//		         for (int j = 1; j <= i; j++) {
		//
//		            System.out.print(j + "\t");
//		         }
//		         System.out.println();
//		      }

		// 1-5성공

//		      int arr[][] = new int[5][5];
//		      int sum=0;
//		      for (int i = 1; i <= 5; i++) {
//		         for (int j = 1; j <= i; j++) {
//		            sum+=1;
//		            System.out.print(sum + "\t");
//		         }
//		         System.out.println();
//		      }
		// }

		// 1-6 성공
//		      int arr[][] = new int[5][5];
//		      
//		      for (int i = 5; i >= 0; i--) {
//		         for (int j = 1; j <= i; j++) {
//		            System.out.print(j + "\t");
//		         }
//		         System.out.println();
//		      }

		// 1-7 성공
//		      int arr[][] = new int[5][5];
//		      int sum=0;
//		      for (int i =5; i >= 0; i--) {
//		         for (int j = 1; j <= i; j++) {
//		            sum+=1;
//		            System.out.print(sum + "\t");
//		         }
//		         System.out.println();
//		      }

		// 1-8 성공
//		      int arr[][] = new int[5][5];
//		      int sum = 0;
//		      for (int i = 0; i < arr.length; i++) {
//		         for (int j = 0; j < arr[4].length; j++) {
//		            System.out.printf((i + 1)+j + "\t");
		//
//		         }
//		         System.out.println();
//		      }

//		      1-9  성공

		Scanner sc = new Scanner(System.in);
		System.out.print("num : ");
		int num = sc.nextInt();

		int arr[][] = new int[num][num];
		int j = 0;
		int count = 0;
		for (int i = num; i >= 0; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + count + "\t");
				if (j + count == num) {
					for (int m = 1; m <= count; m++) {
						System.out.print(m + "\t");
					}
					count++;
				}

			}
			System.out.println();
		}
		//
		// }
		// 1-10 성공
//		      int arr[][] = new int[5][5];
//		      int sum = 0;
//		      for (int i = 0; i < 6; i++) {
//		         for (int k = 5; k >= i+1; k--) {
//		            System.out.print("\t");
//		         }
		//
//		         for (int j = 1; j <= i; j++) {
//		            sum += 1;
//		            System.out.print(sum + "\t");
//		         }
//		         System.out.println();
//		      }

		// 2-1 성공
//		            int arr[] = new int[25];
//		            for (int i = 0; i < arr.length; i++) {
//		            
//		               System.out.print("*");
//		               if((i+1)%5 == 0 ){
//		                  System.out.println();
//		               }else {
//		                  continue;
//		               }
		//
		// }
		// 2-2 성공
//		            int arr[][] = new int[5][5];
//		            
//		            for (int i =1 ; i <= 5; i++) {
//		               for (int j = 1; j <= i; j++) {
//		                  System.out.print("*");
//		               }
//		               System.out.println();
//		            }

		// 2-3 성공
//		            int arr[][] = new int[5][5];
//		            
//		            for (int i = 5; i >= 0; i--) {
//		               for (int j = 1; j <= i; j++) {
//		                  System.out.print("*");
//		               }
//		               System.out.println();
//		            }

		// 2-4 답지찾아봄 ==공백과 별의 조합 성공

//		            for (int i = 0; i<5 ; i++) {
//		               for (int j = 1; j <=5- i; j++) {
//		                  System.out.print(" ");
//		               }
//		               for(int k=0; k<i*2+1;k++) {
//		                  System.out.print("*");
//		               }
//		            System.out.println();
//		            }

		// 2-5 ㅇ오래걸림
//		            for (int i = 0; i < 5; i++) {
//		               for (int j = 1; j <= 5 - i; j++) {
//		                  System.out.print(" ");
//		               }
//		               for (int k = 0; k < i * 2 + 1; k++) {
//		                  System.out.print("*");
//		               }
//		               System.out.println();
//		            }
		//
//		            for (int i = 1; i < 9; i++) {
//		               for (int j = 0; j <= i; j++) {
//		                  System.out.print(" ");
//		               }
//		               for (int k = 0; k > 2 * i - 9; k--) {
//		                  System.out.print("*");
//		               }
//		               System.out.println();

		// dff
//		      public static void main(String[] args) {
//		          int number=6;
//		            for (int i = 0; i<number; i++) {
//		              for(int e =0 ; e <number-i-1; e++) {
//		                System.out.print(" ");
//		              }
//		              for(int star=0; star<2*i+1;star++) {
//		                System.out.print("*");
//		              }
//		              System.out.println();
//		            }

//		            for(int i=number-2; i>=0; --i) {
//		              for(int e =0 ; e <number-i-1; e++) {
//		                System.out.print(" ");
//		              }
//		              for(int star=0; star<2*i+1;star++) {
//		                System.out.print("*");
//		              }        
//		              System.out.println();
//		            }

		// 2-6, 7,8 포기
//		            }
		// 2-9 성공
//		            char arr[][] = new char[7][7];
//		            for (int i = 0; i < arr.length; i++) {
//		               for (int j = 0; j < arr[6].length; j++) {
//		                  if((i== 0) || (i==6)){
//		                     System.out.print('$');
//		                     
//		                  }else if(j==0 || j==6){
//		                     System.out.print('$');
//		                  }else {
//		                     System.out.print('*');
//		                  }
//		               }
//		               System.out.println();
//		            }

		// 2-10성공
//		            Scanner sc =new Scanner(System.in);
//		            System.out.print("number : ");
//		            int num = sc.nextInt();
//		            
//		            for(int i=0; i<=num;i++) {
//		               for(int j=0; j<=i;j++) {
//		               if(j==0||j==i) {
//		               System.out.print("*");
//		            }else {
//		               System.out.print("@");
//		            }
//		               
//		            }
//		            System.out.println();
//		            }
//		            
//		            for(int i=num; i>=0;i--) {
//		               for(int j=0; j<=i;j++) {
//		               if(j==0||j==i) {
//		               System.out.print("*");
//		            }else {
//		               System.out.print("@");
//		            }
//		               
//		            }
//		            System.out.println();
//		            }
//		            

	}
}