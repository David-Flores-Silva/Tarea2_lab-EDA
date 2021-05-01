public class prog_dim{
  public static void main(String [] args){
    
  }

  public static int fib(int n){
    int f[]=new int[n+2];
    f[0] = 0;
    f[1] = 0;
 
    for(int i=0; i<=n; i++){
      f[i] = f[i-1] + f[n-2];
    }

    return f[n];

 }
}
