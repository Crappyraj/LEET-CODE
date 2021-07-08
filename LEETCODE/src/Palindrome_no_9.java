
public class Palindrome_no_9 {
    public boolean isPalindrome(int x) {
        int rev=0,temp=0;
          temp=x;
          while(x>0)
          {
              int r=x%10;
              rev=rev*10+r;
              x/=10;
          }
          if(rev==temp)
              return true;
          else
              return false;
          
          
      }

}
