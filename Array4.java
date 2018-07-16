import java.util.Scanner;
public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,a,b,a1,b1,i;
System.out.println("enter the elements");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
int[]inputArray=new int[n];
for(i=0;i<n;i++){
	inputArray[i]=ja.nextInt();
    }
a=a1=b=b1=inputArray[0];
/*for(i=1;i<n;i++){
	if(inputArray[i]>a){
		a1=a;
		a=inputArray[i];
	}
else if(inputArray[i]>a1){
	a1=inputArray[i];
}
}
System.out.println("maximum no is:"+a);*/
//System.out.println("2nd maximum no is:"+a1);
for(i=0;i<n;i++){
	if(inputArray[i]<b){
		b1=b;
		b=inputArray[i];
		}
	else if(inputArray[i]<b1){
		b=inputArray[i];
		}
}
System.out.println(" mini no is:"+b);
//System.out.println("2nd mini no is:"+b1);
	}

}
