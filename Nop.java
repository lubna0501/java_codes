package chaining;

public class Nop {
    int num;
        int remainder, temp, sum=0,product = 1,rNum=0;
    public Nop(int num){

            this.num = num;
        }
        public void SumOfDigit(){

            temp = num;
            while (temp!=0){
                remainder = temp % 10;
                sum = sum + remainder;
                temp = temp / 10;
            }
            System.out.println("Sum of digits of Number '"+num+"'': "+sum);
        }
        public void ProductOfDigit(){
            temp = num;
            while (temp!=0){
                remainder = temp % 10;
                product = product * remainder;
                temp = temp / 10;
            }
            System.out.println("Product of digits of Number '"+num+"'': "+product);
        }
        public void PalindromeOrNot(){
            int numm = num;
            int oNum = num;

            while (numm != 0) {
                remainder = numm % 10;
                rNum = rNum * 10 + remainder;
                numm = numm/10;
            }
            if (oNum == rNum) {
                System.out.println("Given " + oNum + " is Palindrome.");
            }
            else {
                System.out.println(oNum + " is not Palindrome.");
            }
        }
        public void Reverse() {
            int numm = num;
            int reverse=0;
            while (numm != 0) {

                remainder = numm % 10;
                reverse = reverse * 10 + remainder;
                numm = numm/10;
            }

            System.out.println("The reverse of the given number is: " + reverse);
        }
    }

