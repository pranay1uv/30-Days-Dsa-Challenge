class Solution {
    public int findComplement(int num) {
        // Input is Integer
        // output is Integer
        // i have to return the 1s complement of num
        // Logic to be devised
        // convert the decimalform of num into binary form and store it in string
        // How do i convert
        int rem = 0;
        StringBuilder s = new StringBuilder("");
        while(num>0){
            rem = num%2;
            s.append(rem);
            num /= 2;
        }
        s.reverse();// Now the num has become a binaryNumber

        int value = 0;
        int count = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '0'){
                value += 1 * Math.pow(2,count);
            }
            count++;
        }return value;
        // char[] ch = s.toString().toCharArray();
        // int count = 0;
        // int value = 0;
        
        // return value-1;
    }
}