import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        Calculator_Method cal_m = new Calculator_Method();

        boolean run=true;
        
        
        while(run){
            int choice;
            
            System.out.println("\n\n\t\t------------==|Basic Calculator|==-----------");
            System.out.println("\n\n\t\t\t    ==>Enter your choice<==\n\n");
            System.out.println("1.Sum\t         2.Substruct\t 3.Multiplication\t 4.Division\t 5.Modulas");
            System.out.println("6.Factorial\t 7.Sqrt\t\t 8.Cos\t\t\t 9.Sin\t\t 10.Tan");
            System.out.println("11.Squre\t 12.Cube\t 13.Power\t\t 14.nPr\t\t 15.nCr");
            System.out.println("16.Abs\t\t 17.Base_2_log\t 18.Base_10_log\t\t 19.PI_Cal \t 20.ToDegree\t");
            System.out.println("21.ToRadiant\t 22.Inverse\t 23.cosh \t\t 24.sinh \t 25.tanh\t");
            System.out.println("\n-----------------------==| 26.Exit From Programe |==-----------------------------");
            
            choice = scn.nextInt();

            switch(choice){
                case 1:
                    System.out.println("-------------Menue "+choice+" Selected Sum Calculation--------------\n");
                    System.out.println("Enter num1: ");
                    cal_m.x = scn.nextDouble();
                    System.out.println("Enter num2: ");
                    cal_m.y = scn.nextDouble();

                    System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                    System.out.println(" \t\t\t\t The Sum is: "+cal_m.sum(cal_m.x, cal_m.y));  
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                    break;

                case 2:
                System.out.println("-------------Menue "+choice+" Selected Substructor Calculation--------------\n");
                    System.out.println("Enter num1: ");
                    cal_m.x = scn.nextDouble();
                    System.out.println("Enter num2: ");
                    cal_m.y = scn.nextDouble();
                    System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                    System.out.println(" \t\t\t\t The substruct is: "+cal_m.substruct(cal_m.x, cal_m.y)); 
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                    break;

                case 3:
                System.out.println("-------------Menue "+choice+" Selected Multiplication Calculation--------------\n");
                    System.out.println("Enter num1: ");
                    cal_m.x = scn.nextDouble();
                    System.out.println("Enter num2: ");
                    cal_m.y = scn.nextDouble(); 

                    System.out.println(" \t\t\t\t The Multiplication is: "+cal_m.mul(cal_m.x, cal_m.y));  
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                    break;

                case 4:
                    System.out.println("-------------Menue "+choice+" Selected Div Calculation--------------\n");
                    System.out.println("Enter num1: ");
                    cal_m.x = scn.nextDouble();
                    System.out.println("Enter num2: ");
                    cal_m.y = scn.nextDouble();

                    System.out.println(" \t\t\t\t The Divistion is: "+cal_m.div(cal_m.x, cal_m.y)); 
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");

                    break;

                case 5:
                    System.out.println("-------------Menue "+choice+" Selected Modulation Calculation--------------\n");
                    System.out.println("Enter num1: ");
                    cal_m.x = scn.nextDouble();
                    System.out.println("Enter num2: ");
                    cal_m.y = scn.nextDouble();

                    System.out.println(" \t\t\t\t The Modulation is: "+cal_m.mod(cal_m.x, cal_m.y));  
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                    break;

                case 6:
                System.out.println("-------------Menue "+choice+" Selected Factorial Calculation--------------\n");
                    System.out.println("Enter Factorial value: ");
                    cal_m.x = scn.nextDouble();
                    System.out.println(" \t\t\t\t The Factorial is: "+cal_m.fact_f(cal_m.x)); 
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                    break;

                case 7:
                    System.out.println("-------------Menue "+choice+" Selected Squart Calculation--------------\n");
                    System.out.println("Enter Sqrt value: ");
                    cal_m.x = scn.nextDouble();
                    System.out.println(" \t\t\t\t The Sum is: "+cal_m.Squre_f(cal_m.x)); 
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                    break;
                
                case 8:
                    System.out.println("-------------Menue "+choice+" Selected Cos Calculation--------------\n");
                    System.out.println("Enter Cos value: ");
                    cal_m.x = scn.nextDouble();
                    System.out.println(" \t\t\t\t The Cos is: "+cal_m.Cos(cal_m.x)); 
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                break;
                
                case 9:
                    System.out.println("-------------Menue "+choice+" Selected Sin Calculation--------------\n");
                    System.out.println("Enter Sin value: ");
                    cal_m.x = scn.nextDouble();
                    System.out.println(" \t\t\t\t The sin is: "+cal_m.Sin(cal_m.x)); 
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                break;


                case 10:
                    System.out.println("-------------Menue "+choice+" Selected Tan Calculation--------------\n");
                    System.out.println("Enter Tan value: ");
                    cal_m.x = scn.nextDouble();
                    System.out.println(" \t\t\t\t The Tan is: "+cal_m.Tan(cal_m.x)); 
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                break;

                case 11:
                System.out.println("-------------Menue "+choice+" Selected Squre Calculation--------------\n");
                //System.out.println("-------------Menue One Selected squre Calculation--------------\n");
                System.out.println("Enter num: ");
                cal_m.x = scn.nextDouble();

                
                System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                System.out.println(" \t\t\t\t The Squre is: "+cal_m.Squre_f(cal_m.x)); 
                System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");

                break;

                case 12:
                System.out.println("-------------Menue "+choice+" Selected Qubic Calculation--------------\n");
                System.out.println("Enter num: ");
                cal_m.x = scn.nextDouble();
                // System.out.println("Enter num2: ");
                // cal_m.y = scn.nextDouble();

                System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                System.out.println(" \t\t\t\t The Qube is: "+cal_m.Qube_f(cal_m.x));  
                System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                break;

                case 13:
                
                    System.out.println("-------------Menue "+choice+" Selected Power Calculation--------------\n");
                    System.out.println("Enter num: ");
                    cal_m.x = scn.nextDouble();
                    System.out.println("Enter power: ");
                    cal_m.y = scn.nextDouble();

                    System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                    System.out.println(" \t\t\t The power is"+cal_m.x+" to the power " +cal_m.y+" is: " + cal_m.Pow_f(cal_m.x, cal_m.y));  
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                break;

                case 14:
                    System.out.println("-------------Menue "+choice+" Selected nPr Calculation--------------\n");
                    System.out.println("Enter n: ");
                    cal_m.x = scn.nextDouble();
                    System.out.println("Enter r: ");
                    cal_m.y = scn.nextDouble();

                    System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                    System.out.println(" \t\t\t The N Permutiation R is: " + cal_m.nPr(cal_m.x, cal_m.y));  
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                break;

                case 15:
                    System.out.println("-------------Menue "+choice+" Selected nCr Calculation--------------\n");
                    System.out.println("Enter n: ");
                    cal_m.x = scn.nextDouble();
                    System.out.println("Enter r: ");
                    cal_m.y = scn.nextDouble();

                    System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                    System.out.println(" \t\t\t The N Combination R is: " + cal_m.nCr(cal_m.x, cal_m.y));  
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");

                break;

                case 16:
                    System.out.println("-------------Menue "+choice+" Selected Abs Calculation--------------\n");
                    System.out.println("Enter numb: ");
                    cal_m.x = scn.nextDouble();
                    // System.out.println("Enter r: ");
                    // cal_m.y = scn.nextDouble();

                    System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                    System.out.println(" \t\t\t The Absulate is: " + cal_m.Abs_f(cal_m.x));  
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                break;

                case 17:
                    System.out.println("-------------Menue "+choice+" Selected Base 2 Log Calculation--------------\n");
                    System.out.println("Enter num: ");
                    cal_m.x = scn.nextDouble();
                    // System.out.println("Enter r: ");
                    // cal_m.y = scn.nextDouble();

                    System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                    System.out.println(" \t\t\t Base 2 log is : " + cal_m.log_2_base_f(cal_m.x)); 
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                break;

                case 18:
                    System.out.println("-------------Menue "+choice+" Selected Log Function Calculation--------------\n");
                    System.out.println("Enter num: ");
                    cal_m.x = scn.nextDouble();
                    System.out.println("Enter num2: ");
                    cal_m.y = scn.nextDouble();

                    System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                    System.out.println(" \t\t\t The log of num is: " + cal_m.log_f(cal_m.x, cal_m.y)); 
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                break;

                case 19:
                    System.out.println("-------------Menue "+choice+" Selected PI Calculation--------------\n");
                    System.out.println("Enter num: ");
                    cal_m.x = scn.nextDouble();
                    // System.out.println("Enter num2: ");
                    // cal_m.y = scn.nextDouble();

                    System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                    System.out.println(" \t\t\t The PI Calculation is: " + cal_m.PI_f(cal_m.x)); 
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                break;

                case 20:
                    System.out.println("-------------Menue "+choice+" Selected Dgree Calculation--------------\n");
                    System.out.println("Enter radiant: ");
                    cal_m.x = scn.nextDouble();
                    // System.out.println("Enter num2: ");
                    // cal_m.y = scn.nextDouble();

                    System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                    System.out.println(" \t\t\t The dehree is: " + cal_m.Degree_f(cal_m.x)); 
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                break;

                case 21:
                    System.out.println("-------------Menue "+choice+" Selected Radian Calculation--------------\n");
                    System.out.println("Enter degree: ");
                    cal_m.x = scn.nextDouble();
                    // System.out.println("Enter num2: ");
                    // cal_m.y = scn.nextDouble();

                    System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                    System.out.println(" \t\t\t The radian is: " + cal_m.Radian_f(cal_m.x)); 
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                break;

                case 22:
                    System.out.println("-------------Menue "+choice+" Selected Inverse Calculation--------------\n");
                    System.out.println("Enter num: ");
                    cal_m.x = scn.nextDouble();
                    System.out.println("Enter inverse: ");
                    cal_m.y = scn.nextDouble();

                    System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                    System.out.println(" \t\t\t The inverse is: " + cal_m.Pow_f(cal_m.x, cal_m.y)); 
                    System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                break;

                case 23:
                System.out.println("-------------Menue "+choice+" Selected Sin_h Calculation--------------\n");
                System.out.println("Enter num: ");
                cal_m.x = scn.nextDouble();
                // System.out.println("Enter num2: ");
                // cal_m.y = scn.nextDouble();

                System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                System.out.println(" \t\t\t The sinh is: " + cal_m.Sinh(cal_m.x)); 
                System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                break;

                case 24:
                System.out.println("-------------Menue "+choice+" Selected Cos_h Calculation--------------\n");
                System.out.println("Enter num: ");
                cal_m.x = scn.nextDouble();
                // System.out.println("Enter num2: ");
                // cal_m.y = scn.nextDouble();

                System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                System.out.println(" \t\t\t The cos is: " + cal_m.Cosh(cal_m.x)); 
                System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                break;

                case 25:
                System.out.println("-------------Menue "+choice+" Selected Tan_h Calculation--------------\n");
                System.out.println("Enter num tan_h: ");
                cal_m.x = scn.nextDouble();
                // System.out.println("Enter num2: ");
                // cal_m.y = scn.nextDouble();

                System.out.println("\t\t\t-------->>-| Result Is -|<<--------\n");
                System.out.println(" \t\t\t The tanh is: " + cal_m.Tanh(cal_m.x)); 
                System.out.println(" \n\t\t ============(  Sum Process Finised )============ ");
                break;

                case 26:
                    System.exit(1);

                default:
                    System.out.println("Invalid Press !");
            }

            System.out.println("---|Do you wnat to Run agin press 1 and exit press 0|---");
            System.out.print("=========>>> press: ");
            int ch;
            ch= scn.nextInt();
            switch(ch){
                case 1:
                    run = true;
                break;
                case 0:
                    run = false;
                break;
                default:
                    System.out.println("Invalid press! sorry !");
                    System.exit(1);
                
            }
        }
    }
}