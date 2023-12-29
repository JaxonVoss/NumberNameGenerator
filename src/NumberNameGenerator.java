import java.util.Scanner;

public class NumberNameGenerator {
    static NumberNames numNames = new NumberNames();

    static void allPossibilities(String number){
        for(int i=0; i<numNames.numsAndNames[number.charAt(0)-49].size(); i++){
            for(int j=0; j<numNames.numsAndNames[number.charAt(1)-49].size(); j++){
                for(int k=0; k<numNames.numsAndNames[number.charAt(2)-49].size(); k++){
                    for(int l=0; l<numNames.numsAndNames[number.charAt(3)-49].size(); l++){
                        for(int m=0; m<numNames.numsAndNames[number.charAt(4)-49].size(); m++){
                            for(int n=0; n<numNames.numsAndNames[number.charAt(5)-49].size(); n++){
                                for(int o=0; o<numNames.numsAndNames[number.charAt(6)-49].size(); o++){
                                    System.out.println(numNames.numsAndNames[number.charAt(0)-49].get(i)+""+numNames.numsAndNames[number.charAt(1)-49].get(j)+""+numNames.numsAndNames[number.charAt(2)-49].get(k)+""+numNames.numsAndNames[number.charAt(3)-49].get(l)+""+numNames.numsAndNames[number.charAt(4)-49].get(m)+numNames.numsAndNames[number.charAt(5)-49].get(n)+""+numNames.numsAndNames[number.charAt(6)-49].get(o));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number;
        while(true) {
            System.out.print("Enter your seven digit number: ");
            number = in.next();

            if(number.length() == 7){
                break;
            }
            System.out.println("You must enter a seven digit number");
        }

        allPossibilities(number);
    }
}
