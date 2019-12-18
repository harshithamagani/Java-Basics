package com.codingdojo;

class Solution {
    
    public int value(char s){
        if(s == 'I' || s == 'i'){
           return 1; 
        }
        if(s == 'V' || s == 'v'){
            return 5;
        }
        if(s == 'X' || s =='x'){
            return 10;
        }
        if(s == 'L' || s == 'l'){
            return 50;
        }
        if(s == 'C' || s == 'c'){
            return 100;
        }
        if(s == 'D' || s == 'd'){
            return 500;
        }
        if(s == 'M' || s == 'm'){
            return 1000;
        }
		return 0;
    }
    
    public int romanToInt(String s) {
        int result = 0;
            for(int i=0;i<s.length();i++){
                int num1 = value(s.charAt(i));
                int num2 = value(s.charAt(i+1));
                
                if(num1 >= num2){
                    result = result + num1;
                }
                else{
                    i++;
                    result = result +(num1 - num2);
                }
            }
            return result;
    }
    
    public static void main(String[] args) {
		
	}
}
