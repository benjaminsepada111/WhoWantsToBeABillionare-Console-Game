import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
public class WhoWantsToBeABillionaireGame{
public static void main(String[] args){
boolean fifty2Used = false;
boolean audience = false;
boolean swits = false;
boolean times2 = false;
Scanner sc = new Scanner(System.in);

Start();

System.out.print("\n\n\nPlease Enter your name: ");
String name = sc.nextLine();
System.out.print("\nEnter your age: ");
int age = sc.nextInt();


try{

FileWriter fileR = new FileWriter("C:\\Users\\Benjamin\\Desktop\\List.txt",true);
BufferedWriter buffR = new BufferedWriter(fileR);

buffR.write(name);
buffR.newLine();

buffR.close();
fileR.close();

}
catch(IOException e){
System.out.println("The Error: " + e.getMessage());
}
String rep;

do{
System.out.println("\n\t\t\t\t\t\t    WELCOME TO THE GAME ");
System.out.print("\t\t\t\t\t\t-----------------------------");
System.out.println("\n\nPLAYER NAME: " + name);
System.out.println("\nAGE: "+ age);

System.out.println("\n\t\t\t\t\t\t       DISCRIPTION ");
System.out.print("\n\n>  The objective of the game is for the contestant to progress through a predetermined number of questions,typically 15,with increasing difficulty.Each question is associated with a monetary prize,and the contestant must provide the correct answer to move on to the next question and increase their winnings.");
System.out.println("\n\n> The questions are usually diverse and cover a wide range of topics such as general knowledge, current affairs, history, science, sports, and more. Multiple-choice options are provided for each question, typically four options labeled A, B, C, and D. The contestant must select the correct answer by choosing the corresponding option.");
System.out.println("\n\n> When the prize or reward does not reach 400,000, you will receive a larger sum of money. However, if the prize does amount to 400,000, you will receive the designated prizes. In case you make a mistake, you will be awarded 20,000. Additionally, you have the option to claim your money.");
System.out.println("\n\n> IMPORTANT NOTE!!!! LIFELINES SHOULD ONLY BE USED ONE TIME TO AVOID DISQUALIFICATION IN YOUR GAME");
System.out.println("\n\n> IMPORTANT NOTE!!!! MAKE SURE TO ENTER THE CORRECT KEY TO AVOID ERRORS IN YOUR GAME");
System.out.println("\n(50:50) \t(AUDIENCE) \t (SWITCH) \t (x2)");
System.out.print("----------------------------------------------------------");
System.out.println("\nPRIZES LIST");
System.out.println("\n15: 2,000,000");
System.out.println("14: 1,000,000");
System.out.println("13: 600,000");
System.out.println("12: 400,000");
System.out.println("11: 250,000");
System.out.println("10: 150,000");
System.out.println("9:  100,000");
System.out.println("8:  70,000");
System.out.println("7:  50,000");
System.out.println("6:  35,000");
System.out.println("5:  20,000");
System.out.println("4:  10,000");
System.out.println("3:  5,000");
System.out.println("2:  3,000");
System.out.println("1:  1,000");

System.out.print("\n> Please Input START to Start The game");
System.out.print("\n> Please Input HELP to help");
System.out.print("\n> Please Input QUIT to Exit");

Scanner a = new Scanner(System.in);
System.out.print("\n\nEnter your Option: ");
String option = a.nextLine();

if(option.equals("START")|| option.equals("start") || option.equals("Start")){
Scanner s = new Scanner(System.in);
int reward1 = 0;

System.out.print("\033[H\033[2J");
System.out.flush();

System.out.print("\n\t\t\t\t\tWELCOME PLEASE CHOOSE THE ANSWER CORRECTLY");

lifelines();
question1();
System.out.println("\nA. Shooting Guard                  C. Point Guard");
System.out.println("\nB. Center                          D. Small Backward");
System.out.print("\n\nAnswer: ");
int answer = s.next().charAt(0);

if(answer == 'd' || answer =='D'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 1,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=1000;
}
else if(answer == '1' && !fifty2Used)
{
fifty2Used = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.print("\n\t\t\t\t\tWELCOME PLEASE CHOOSE THE ANSWER CORRECTLY");
lifelines();
question1();
System.out.println("\nB. Center                          D. Small Backward");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
if(answer == 'D' || answer =='d'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 1,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=1000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 1,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}else if(answer == '2' && !audience){
audience = true;
Scanner audienceA = new Scanner(System.in);

System.out.println("\nAUDIENCE?");
System.out.println("\nPLEASE ASK YOUR AUDIENCE WHAT IS THE ANSWER?");
System.out.print("\n\nAnswer: ");
int answerA = audienceA.next().charAt(0);

if(answerA == 'D' || answerA == 'd'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 1,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=1000;
}else{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 1,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '3' && !swits)
{
swits = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\nFor 1,000 Pesos");
switss();
System.out.println("\nA. Null                          C. Nuggets");
System.out.println("\nB. Nets                          D. National");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 1,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=1000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 0 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '4' && !times2)
{
times2 = true;
System.out.print("\033[H\033[2J");
System.out.flush();
lifelines();
question1();
System.out.println("\nA. Shooting Guard                  C. Point Guard");
System.out.println("\nB. Center                          D. Small Backward");
System.out.print("\n\nFirst Answer: ");
answer = s.next().charAt(0);
System.out.print("\n\nSecond Answer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 1,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=1000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 0 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}

}
else if(answer == '5')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 0 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
else if(answer == 'a' || answer == 'A' ||answer == 'b' ||answer == 'B' ||answer == 'c' ||answer == 'C')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 1,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\tYOU HAVE BEEN DISQUALIFIED PLEASE READ THE DISCRIPTION OR THE RULES OF THE GAME");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}

lifelines();
question2();
System.out.println("\nA. Sydney                 C. Canberra");
System.out.println("\nB. Melbourne              D. Perth");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);


if(answer == 'c' || answer =='C'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 3,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=2000;
}
else if(answer == '1' && !fifty2Used)
{
fifty2Used = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.print("\n\t\t\t\t\tWELCOME PLEASE CHOOSE THE ANSWER CORRECTLY");
lifelines();
question2();
System.out.println("\nA. Sydney                 C. Canberra");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'C' || answer =='c')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 3,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=2000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 1,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '2' && !audience)
{
audience = true;
System.out.println("\nAUDIENCE?");
System.out.println("\nPLEASE ASK YOUR AUDIENCE WHAT IS THE ANSWER?");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'c' || answer == 'C'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 3,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=2000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 1,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}

}
else if(answer == '3' && !swits)
{
swits = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\nFor 3,000 Pesos");
switss();
System.out.println("\nA. Null                          C. Nuggets");
System.out.println("\nB. Nets                          D. National");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 3,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=2000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 1,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}

}
else if(answer == '4' && !times2)
{
times2 = true;
System.out.print("\033[H\033[2J");
System.out.flush();
lifelines();
question2();
System.out.println("\nA. Sydney                 C. Canberra");
System.out.println("\nB. Melbourne              D. Perth");
System.out.print("\n\nFirst Answer: ");
answer = s.next().charAt(0);
System.out.print("\n\nSecond Answer: ");
answer = s.next().charAt(0);
if(answer == 'c' || answer == 'C')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 3,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=2000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 1,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '5')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 1,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
else if(answer == 'a' || answer == 'A' ||answer == 'b' ||answer == 'B' ||answer == 'd' ||answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 1,000 PESOS");
System.out.print("\t\t\t\t\t---------------------------------------");
return;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\tYOU HAVE BEEN DISQUALIFIED PLEASE READ THE DISCRIPTION OR THE RULES OF THE GAME");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}

lifelines();
question3();
System.out.println("\nA. Vincent van Gogh                  C. Leonardo da Vinci");
System.out.println("\nB. Pablo Picasso                     D. Michelangelo");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'c' || answer =='C')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 5,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=2000;
}
else if(answer == '1' && !fifty2Used)
{
fifty2Used = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.print("\n\t\t\t\t\tWELCOME PLEASE CHOOSE THE ANSWER CORRECTLY");
lifelines();
question3();
System.out.println("\nA. Vincent van Gogh                  C. Leonardo da Vinci");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'C' || answer =='c')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 5,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=2000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 3,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '2' && !audience)
{
audience = true;
System.out.println("\nAUDIENCE?");
System.out.println("\nPLEASE ASK YOUR AUDIENCE WHAT IS THE ANSWER?");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'c' || answer == 'C')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 5,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=2000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 3,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}

}
else if(answer == '3' && !swits)
{
swits = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\nFor 5,000 Pesos");
switss();
System.out.println("\nA. Null                          C. Nuggets");
System.out.println("\nB. Nets                          D. National");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 5,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=2000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 3,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}

}
else if(answer == '4' && !times2)
{
times2 = true;
System.out.print("\033[H\033[2J");
System.out.flush();
lifelines();
question3();
System.out.println("\nA. Vincent van Gogh                  C. Leonardo da Vinci");
System.out.println("\nB. Pablo Picasso                     D. Michelangelo");
System.out.print("\n\nFirst Answer: ");
answer = s.next().charAt(0);
System.out.print("\n\nSecond Answer: ");
answer = s.next().charAt(0);
if(answer == 'c' || answer == 'C')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 5,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=2000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 3,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '5')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 3,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
else if(answer == 'a' || answer == 'A' ||answer == 'b' ||answer == 'B' ||answer == 'd' ||answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 3,000 PESOS");
System.out.print("\t\t\t\t\t---------------------------------------");
return;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\tYOU HAVE BEEN DISQUALIFIED PLEASE READ THE DISCRIPTION OR THE RULES OF THE GAME");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
















lifelines();
question4();
System.out.println("\nA. Ang Day                 C. Ang Hang");
System.out.println("\nB. Ang Pow                 D. Ang Kong");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'b' || answer =='B'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 10,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=5000;
}
else if(answer == '1' && !fifty2Used)
{
fifty2Used = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.print("\n\t\t\t\t\tWELCOME PLEASE CHOOSE THE ANSWER CORRECTLY");
lifelines();
question4();
System.out.println("\nB. Ang Pow                 D. Ang Kong");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'b' || answer =='B')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 10,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=5000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 5,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '2' && !audience)
{
audience = true;
System.out.println("\nAUDIENCE?");
System.out.println("\nPLEASE ASK YOUR AUDIENCE WHAT IS THE ANSWER?");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'b' || answer == 'B'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 10,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=5000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 5,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '3' && !swits)
{
swits = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\nFor 10,000 Pesos");
switss();
System.out.println("\nA. Null                          C. Nuggets");
System.out.println("\nB. Nets                          D. National");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 10,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=5000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 5,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}

}
else if(answer == '4' && !times2)
{
times2 = true;
System.out.print("\033[H\033[2J");
System.out.flush();
lifelines();
question4();
System.out.println("\nA. Ang Day                 C. Ang Hang");
System.out.println("\nB. Ang Pow                 D. Ang Kong");
System.out.print("\n\nFirst Answer: ");
answer = s.next().charAt(0);
System.out.print("\n\nSecond Answer: ");
answer = s.next().charAt(0);
if(answer == 'b' || answer == 'B')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 10,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=5000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 5,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '5')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 5,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
else if(answer == 'a' || answer == 'A' ||answer == 'c' ||answer == 'C' ||answer == 'd' ||answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 5,000 PESOS");
System.out.print("\t\t\t\t\t---------------------------------------");
return;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\tYOU HAVE BEEN DISQUALIFIED PLEASE READ THE DISCRIPTION OR THE RULES OF THE GAME");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}











lifelines();
question5();
System.out.println("\nA. Pork barrel                   C. Beef Barrel");
System.out.println("\nB. Chicken Barrel                D. Barrel Barrel");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'a' || answer =='A'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 20,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=10000;
}
else if(answer == '1' && !fifty2Used)
{
fifty2Used = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.print("\n\t\t\t\t\tWELCOME PLEASE CHOOSE THE ANSWER CORRECTLY");
lifelines();
question5();

System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
System.out.println("\nA. Pork barrel                   C. Beef Barrel");
if(answer == 'a' || answer =='A')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 20,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=10000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 10,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '2' && !audience)
{
audience = true;
System.out.println("\nAUDIENCE?");
System.out.println("\nPLEASE ASK YOUR AUDIENCE WHAT IS THE ANSWER?");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'a' || answer == 'A'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 20,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=10000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 10,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '3' && !swits)
{
swits = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\nFor 20,000 Pesos");
switss();
System.out.println("\nA. Null                          C. Nuggets");
System.out.println("\nB. Nets                          D. National");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 20,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=10000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 10,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}

}
else if(answer == '4' && !times2)
{
times2 = true;
System.out.print("\033[H\033[2J");
System.out.flush();
lifelines();
question5();
System.out.println("\nA. Pork barrel                   C. Beef Barrel");
System.out.println("\nB. Chicken Barrel                D. Barrel Barrel");
System.out.print("\n\nFirst Answer: ");
answer = s.next().charAt(0);
System.out.print("\n\nSecond Answer: ");
answer = s.next().charAt(0);
if(answer == 'a' || answer == 'A')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 20,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=10000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 10,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '5')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 10,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
else if(answer == 'b' || answer == 'B' ||answer == 'c' ||answer == 'C' ||answer == 'd' ||answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 10,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\tYOU HAVE BEEN DISQUALIFIED PLEASE READ THE DISCRIPTION OR THE RULES OF THE GAME");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}

lifelines();
question6();
System.out.println("\nA. Dog                   C. Kangaroo");
System.out.println("\nB. Cat                   D. Rabbit");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'a' || answer =='A'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 35,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=15000;
}
else if(answer == '1' && !fifty2Used)
{
fifty2Used = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.print("\n\t\t\t\t\tWELCOME PLEASE CHOOSE THE ANSWER CORRECTLY");
lifelines();
question6();
System.out.println("\nA. Dog                   C. Kangaroo");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'a' || answer =='A')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 35,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=15000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '2' && !audience)
{
audience = true;
System.out.println("\nAUDIENCE?");
System.out.println("\nPLEASE ASK YOUR AUDIENCE WHAT IS THE ANSWER?");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'a' || answer == 'A'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 35,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=15000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '3' && !swits)
{
swits = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\nFor 35,000 Pesos");
switss();
System.out.println("\nA. Null                          C. Nuggets");
System.out.println("\nB. Nets                          D. National");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 35,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=15000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '4' && !times2)
{
times2 = true;
System.out.print("\033[H\033[2J");
System.out.flush();
lifelines();
question6();
System.out.println("\nA. Dog                   C. Kangaroo");
System.out.println("\nB. Cat                   D. Rabbit");
System.out.print("\n\nFirst Answer: ");
answer = s.next().charAt(0);
System.out.print("\n\nSecond Answer: ");
answer = s.next().charAt(0);
if(answer == 'a' || answer == 'A')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 35,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=15000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '5')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
else if(answer == 'b' || answer == 'B' ||answer == 'c' ||answer == 'C' ||answer == 'd' ||answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\tYOU HAVE BEEN DISQUALIFIED PLEASE READ THE DISCRIPTION OR THE RULES OF THE GAME");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}

lifelines();
question7();
System.out.println("\nA. Argus                     C. Cerberus");
System.out.println("\nB. Cyclops                   D. Minotaur");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'a' || answer =='A'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 50,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=15000;
}
else if(answer == '1' && !fifty2Used)
{
fifty2Used = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.print("\n\t\t\t\t\tWELCOME PLEASE CHOOSE THE ANSWER CORRECTLY");
lifelines();
question7();
System.out.println("\nA. Argus                     C. Cerberus");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'a' || answer =='A')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 50,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=15000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 35,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '2' && !audience)
{
audience = true;
System.out.println("\nAUDIENCE?");
System.out.println("\nPLEASE ASK YOUR AUDIENCE WHAT IS THE ANSWER?");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'a' || answer == 'A'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 50,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=15000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 35,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '3' && !swits)
{
swits = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\nFor 50,000 Pesos");
switss();
System.out.println("\nA. Null                          C. Nuggets");
System.out.println("\nB. Nets                          D. National");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 50,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=15000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 35,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '4' && !times2)
{
times2 = true;
System.out.print("\033[H\033[2J");
System.out.flush();
lifelines();
question7();
System.out.println("\nA. Argus                     C. Cerberus");
System.out.println("\nB. Cyclops                   D. Minotaur");
System.out.print("\n\nFirst Answer: ");
answer = s.next().charAt(0);
System.out.print("\n\nSecond Answer: ");
answer = s.next().charAt(0);
if(answer == 'a' || answer == 'A')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 50,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=15000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 35,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '5')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 35,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
else if(answer == 'b' || answer == 'B' ||answer == 'c' ||answer == 'C' ||answer == 'd' ||answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 35,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\tYOU HAVE BEEN DISQUALIFIED PLEASE READ THE DISCRIPTION OR THE RULES OF THE GAME");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}






lifelines();
question8();
System.out.println("\nA. Auxillary Gene                  C. Augmented gene");
System.out.println("\nB. Drone Gene                      D. Opertor gene");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'a' || answer =='A'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 70,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=20000;
}
else if(answer == '1' && !fifty2Used)
{
fifty2Used = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.print("\n\t\t\t\t\tWELCOME PLEASE CHOOSE THE ANSWER CORRECTLY");
lifelines();
question8();
System.out.println("\nA. Auxillary Gene                  C. Augmented gene");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'a' || answer =='A')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 70,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=20000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 50,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '2' && !audience)
{
audience = true;
System.out.println("\nAUDIENCE?");
System.out.println("\nPLEASE ASK YOUR AUDIENCE WHAT IS THE ANSWER?");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'a' || answer == 'A'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 70,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=20000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 50,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '3' && !swits)
{
swits = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\nFor 70,000 Pesos");
switss();
System.out.println("\nA. Null                          C. Nuggets");
System.out.println("\nB. Nets                          D. National");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 70,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=20000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 50,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '4' && !times2)
{
times2 = true;
System.out.print("\033[H\033[2J");
System.out.flush();
lifelines();
question8();
System.out.println("\nA. Auxillary Gene                  C. Augmented gene");
System.out.println("\nB. Drone Gene                      D. Opertor gene");
System.out.print("\n\nFirst Answer: ");
answer = s.next().charAt(0);
System.out.print("\n\nSecond Answer: ");
answer = s.next().charAt(0);
if(answer == 'a' || answer == 'A')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 70,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=20000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 50,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '5')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 50,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
else if(answer == 'b' || answer == 'B' ||answer == 'c' ||answer == 'C' ||answer == 'd' ||answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 50,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\tYOU HAVE BEEN DISQUALIFIED PLEASE READ THE DISCRIPTION OR THE RULES OF THE GAME");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}




lifelines();
question9();
System.out.println("\nA. Hyperoia                    C. Glaucoma");
System.out.println("\nB. Myopia                      D. Progeria");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'b' || answer =='B'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 100,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=30000;
}
else if(answer == '1' && !fifty2Used)
{
fifty2Used = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.print("\n\t\t\t\t\tWELCOME PLEASE CHOOSE THE ANSWER CORRECTLY");
lifelines();
question9();
System.out.println("\nB. Myopia                      D. Progeria");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'b' || answer =='B')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 100,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=30000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 70,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '2' && !audience)
{
audience = true;
System.out.println("\nAUDIENCE?");
System.out.println("\nPLEASE ASK YOUR AUDIENCE WHAT IS THE ANSWER?");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'b' || answer == 'B'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 100,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=30000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 70,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '3' && !swits)
{
swits = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\nFor 100,000 Pesos");
switss();
System.out.println("\nA. Null                          C. Nuggets");
System.out.println("\nB. Nets                          D. National");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 100,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=30000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 70,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '4' && !times2)
{
times2 = true;
System.out.print("\033[H\033[2J");
System.out.flush();
lifelines();
question8();
System.out.println("\nA. Hyperoia                    C. Glaucoma");
System.out.println("\nB. Myopia                      D. Progeria");
System.out.print("\n\nFirst Answer: ");
answer = s.next().charAt(0);
System.out.print("\n\nSecond Answer: ");
answer = s.next().charAt(0);
if(answer == 'b' || answer == 'B')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 100,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=30000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 70,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '5')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 70,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
else if(answer == 'a' || answer == 'A' ||answer == 'c' ||answer == 'C' ||answer == 'd' ||answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 70,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\tYOU HAVE BEEN DISQUALIFIED PLEASE READ THE DISCRIPTION OR THE RULES OF THE GAME");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}

lifelines();
question10();
System.out.println("\nA. Marco Polo                        C. Sir Frances Drake");
System.out.println("\nB. Ferdinand Magellan                D. Christopher Columbos");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'b' || answer =='B'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 150,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=50000;
}
else if(answer == '1' && !fifty2Used)
{
fifty2Used = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.print("\n\t\t\t\t\tWELCOME PLEASE CHOOSE THE ANSWER CORRECTLY");
lifelines();
question9();
System.out.println("\nB. Ferdinand Magellan                D. Christopher Columbos");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'b' || answer =='B')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 150,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=50000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 100,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '2' && !audience)
{
audience = true;
System.out.println("\nAUDIENCE?");
System.out.println("\nPLEASE ASK YOUR AUDIENCE WHAT IS THE ANSWER?");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'b' || answer == 'B'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 150,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=50000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 100,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '3' && !swits)
{
swits = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\nFor 150,000 Pesos");
switss();
System.out.println("\nA. Null                          C. Nuggets");
System.out.println("\nB. Nets                          D. National");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 150,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=50000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 100,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '4' && !times2)
{
times2 = true;
System.out.print("\033[H\033[2J");
System.out.flush();
lifelines();
question10();
System.out.println("\nA. Marco Polo                        C. Sir Frances Drake");
System.out.println("\nB. Ferdinand Magellan                D. Christopher Columbos");
System.out.print("\n\nFirst Answer: ");
answer = s.next().charAt(0);
System.out.print("\n\nSecond Answer: ");
answer = s.next().charAt(0);
if(answer == 'b' || answer == 'B')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 150,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=50000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 100,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '5')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 100,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
else if(answer == 'b' || answer == 'B' ||answer == 'c' ||answer == 'C' ||answer == 'd' ||answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 100,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\tYOU HAVE BEEN DISQUALIFIED PLEASE READ THE DISCRIPTION OR THE RULES OF THE GAME");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}






lifelines();
question11();
System.out.println("\nA. Justin Timberlake                C. Eminem");
System.out.println("\nB. Lady Gaga                        D. Robin Thicke");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'a' || answer =='A'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 250,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=100000;
}
else if(answer == '1' && !fifty2Used)
{
fifty2Used = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.print("\n\t\t\t\t\tWELCOME PLEASE CHOOSE THE ANSWER CORRECTLY");
lifelines();
question9();
System.out.println("\nA. Justin Timberlake                C. Eminem");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'a' || answer =='A')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 250,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=100000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 150,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '2' && !audience)
{
audience = true;
System.out.println("\nAUDIENCE?");
System.out.println("\nPLEASE ASK YOUR AUDIENCE WHAT IS THE ANSWER?");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'a' || answer == 'A'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 250,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=100000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 150,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '3' && !swits)
{
swits = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\nFor 250,000 Pesos");
switss();
System.out.println("\nA. Null                          C. Nuggets");
System.out.println("\nB. Nets                          D. National");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 250,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=100000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 150,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '4' && !times2)
{
times2 = true;
System.out.print("\033[H\033[2J");
System.out.flush();
lifelines();
question11();
System.out.println("\nA. Justin Timberlake                C. Eminem");
System.out.println("\nB. Lady Gaga                        D. Robin Thicke");
System.out.print("\n\nFirst Answer: ");
answer = s.next().charAt(0);
System.out.print("\n\nSecond Answer: ");
answer = s.next().charAt(0);
if(answer == 'a' || answer == 'A')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 250,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=100000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 150,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '5')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 150,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
else if(answer == 'b' || answer == 'B' ||answer == 'c' ||answer == 'C' ||answer == 'd' ||answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 150,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\tYOU HAVE BEEN DISQUALIFIED PLEASE READ THE DISCRIPTION OR THE RULES OF THE GAME");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}







lifelines();
question12();
System.out.println("\nA. Somnambulism                C. Sleep Apnea");
System.out.println("\nB. Twitching                   D. Nose Bleeding");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'B' || answer =='b'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 400,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=150000;
}
else if(answer == '1' && !fifty2Used)
{
fifty2Used = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.print("\n\t\t\t\t\tWELCOME PLEASE CHOOSE THE ANSWER CORRECTLY");
lifelines();
question12();
System.out.println("\nB. Twitching                   D. Nose Bleeding");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'b' || answer =='B')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 400,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=150000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '2' && !audience)
{
audience = true;
System.out.println("\nAUDIENCE?");
System.out.println("\nPLEASE ASK YOUR AUDIENCE WHAT IS THE ANSWER?");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'B' || answer == 'b'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 400,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=150000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '3' && !swits)
{
swits = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\nFor 400,000 Pesos");
switss();
System.out.println("\nA. Null                          C. Nuggets");
System.out.println("\nB. Nets                          D. National");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 400,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=150000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '4' && !times2)
{
times2 = true;
System.out.print("\033[H\033[2J");
System.out.flush();
lifelines();
question11();
System.out.println("\nA. Somnambulism                C. Sleep Apnea");
System.out.println("\nB. Twitching                   D. Nose Bleeding");
System.out.print("\n\nFirst Answer: ");
answer = s.next().charAt(0);
System.out.print("\n\nSecond Answer: ");
answer = s.next().charAt(0);
if(answer == 'b' || answer == 'B')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 400,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=150000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '5')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 250,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
else if(answer == 'a' || answer == 'A' ||answer == 'c' ||answer == 'C' ||answer == 'd' ||answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\tYOU HAVE BEEN DISQUALIFIED PLEASE READ THE DISCRIPTION OR THE RULES OF THE GAME");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}







lifelines();
question13();
System.out.println("\nA. Lily of the valley                C. Witch Hazel");
System.out.println("\nB. Angel Trumpet                     D. Night Lock");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'D' || answer =='d'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 600,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=200000;
}
else if(answer == '1' && !fifty2Used)
{
fifty2Used = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.print("\n\t\t\t\t\tWELCOME PLEASE CHOOSE THE ANSWER CORRECTLY");
lifelines();
question13();
System.out.println("\nB. Angel Trumpet                     D. Night Lock");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'd' || answer =='D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 600,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=200000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '2' && !audience)
{
audience = true;
System.out.println("\nAUDIENCE?");
System.out.println("\nPLEASE ASK YOUR AUDIENCE WHAT IS THE ANSWER?");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'd' || answer == 'D'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 600,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=200000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '3' && !swits)
{
swits = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\nFor 600,000 Pesos");
switss();
System.out.println("\nA. Null                          C. Nuggets");
System.out.println("\nB. Nets                          D. National");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 600,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=200000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '4' && !times2)
{
times2 = true;
System.out.print("\033[H\033[2J");
System.out.flush();
lifelines();
question13();
System.out.println("\nA. Lily of the valley                C. Witch Hazel");
System.out.println("\nB. Angel Trumpet                     D. Night Lock");
System.out.print("\n\nFirst Answer: ");
answer = s.next().charAt(0);
System.out.print("\n\nSecond Answer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 600,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=200000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '5')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 400,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
else if(answer == 'b' || answer == 'B' ||answer == 'c' ||answer == 'C' ||answer == 'a' ||answer == 'A')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\tYOU HAVE BEEN DISQUALIFIED PLEASE READ THE DISCRIPTION OR THE RULES OF THE GAME");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}






lifelines();
question14();
System.out.println("\nA. Dog                     C. Cat");
System.out.println("\nB. Cow                     D. Goat");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'b' || answer =='B'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCONGRATULATIONS TO YOU, YOU OWN 1,000,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=400000;
}
else if(answer == '1' && !fifty2Used)
{
fifty2Used = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.print("\n\t\t\t\t\tWELCOME PLEASE CHOOSE THE ANSWER CORRECTLY");
lifelines();
question14();
System.out.println("\nB. Cow                     D. Goat");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'b' || answer =='B')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 1,000,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=400000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '2' && !audience)
{
audience = true;
System.out.println("\nAUDIENCE?");
System.out.println("\nPLEASE ASK YOUR AUDIENCE WHAT IS THE ANSWER?");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'b' || answer == 'B'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 1,000,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=400000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '3' && !swits)
{
swits = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\nFor 1,000,000 Pesos");
switss();
System.out.println("\nA. Null                          C. Nuggets");
System.out.println("\nB. Nets                          D. National");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 1,000,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=400000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '4' && !times2)
{
times2 = true;
System.out.print("\033[H\033[2J");
System.out.flush();
lifelines();
question14();
System.out.println("\nA. Dog                     C. Cat");
System.out.println("\nB. Cow                     D. Goat");
System.out.print("\n\nFirst Answer: ");
answer = s.next().charAt(0);
System.out.print("\n\nSecond Answer: ");
answer = s.next().charAt(0);
if(answer == 'b' || answer == 'B')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 1,000,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=400000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}


else if(answer == '5')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 600,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
else if(answer == 'a' || answer == 'A' ||answer == 'c' ||answer == 'C' ||answer == 'd' ||answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\tYOU HAVE BEEN DISQUALIFIED PLEASE READ THE DISCRIPTION OR THE RULES OF THE GAME");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}

lifelines();
question15();
System.out.println("\nA. Buenos Aires,Argentina                     C. Nairobi,Kenya");
System.out.println("\nB. Frankfurt,Germany                          D. Barcelona,Spain");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'c' || answer =='C'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCONGRATULATIONS TO YOU, YOU OWN 2,000,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=1000000;
}
else if(answer == '1' && !fifty2Used)
{
fifty2Used = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.print("\n\t\t\t\t\tWELCOME PLEASE CHOOSE THE ANSWER CORRECTLY");
lifelines();
question15();

System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
System.out.println("\nA. Buenos Aires,Argentina                     C. Nairobi,Kenya");
if(answer == 'c' || answer =='C')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 2,000,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=1000000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '2' && !audience)
{
audience = true;
System.out.println("\nAUDIENCE?");
System.out.println("\nPLEASE ASK YOUR AUDIENCE WHAT IS THE ANSWER?");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);

if(answer == 'c' || answer == 'C'){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 2,000,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=1000000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}
else if(answer == '3' && !swits)
{
swits = true;
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\nFor 2,000,000 Pesos");
switss();
System.out.println("\nA. Null                          C. Nuggets");
System.out.println("\nB. Nets                          D. National");
System.out.print("\n\nAnswer: ");
answer = s.next().charAt(0);
if(answer == 'd' || answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 2,000,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=1000000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}
else if(answer == '4' && !times2)
{
times2 = true;
System.out.print("\033[H\033[2J");
System.out.flush();
lifelines();
question15();
System.out.println("\nA. Buenos Aires,Argentina                     C. Nairobi,Kenya");
System.out.println("\nB. Frankfurt,Germany                          D. Barcelona,Spain");
System.out.print("\n\nFirst Answer: ");
answer = s.next().charAt(0);
System.out.print("\n\nSecond Answer: ");
answer = s.next().charAt(0);
if(answer == 'c' || answer == 'C')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCORRECT, YOU OWN 2,000,000 PESOS");
System.out.print("\t\t\t\t\t\t-----------------------------");
reward1+=1000000;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tSORRY, YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t\t-----------------------------");
return;
}
}

else if(answer == '5')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\t\tCONGRATIOLATIONS, YOU OWN 1,000,000 PESOS");
System.out.println("\t\t\t\t\t\t---------------------------------------------");
return;
}
else if(answer == 'b' || answer == 'B' ||answer == 'a' ||answer == 'A' ||answer == 'd' ||answer == 'D')
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\t\t\tSORRY WRONG ANSWER YOU OWN 20,000 PESOS");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
else
{
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\t\t\tYOU HAVE BEEN DISQUALIFIED PLEASE READ THE DISCRIPTION OR THE RULES OF THE GAME");
System.out.println("\t\t\t\t\t---------------------------------------");
return;
}
}

if(option.equals("help") || option.equals("HELP")){
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("\n\n> The game will check if your answer is correct. If you are correct, you will proceed to the next question. If your answer is incorrect, you may lose the game or be allowed to continue with a lower amount of money. As you progress through the game, the questions will become more challenging, requiring deeper knowledge or critical thinking.");
System.out.print("\n\n> Throughout the game, you may have the opportunity to use lifelines to assist you in answering difficult questions. Lifelines are typically limited in number and can provide hints or eliminate incorrect options. Common lifelines include 50:50(eliminating two incorrect options), Phone a Friend (seeking help from a knowledgeable person), and Ask the Audience (polling the studio audience for their opinion).");
}
else if(option.equals("quit") || option.equals("QUIT")){

System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("BYE BYE " + name + " THANK YOU FO PLAYING LOVE U MWUAAA ");
}
else
{
System.out.print("\n ");
return;
}

Scanner r = new Scanner(System.in);
System.out.print("\n\nPlease input BACK to go in the option: ");
rep = r.nextLine();
System.out.print("\033[H\033[2J");
System.out.flush();
}while(rep.equals("BACK") || rep.equals("back"));
}
static void Start(){
System.out.println("\n\t\t\t\t\t\tWHO WANTS TO BE A BILLIONAIRE");
System.out.print("\t\t\t\t\t\t-----------------------------");
}
static void question1(){
System.out.println("\n\nFor 1,000 Pesos");
System.out.println("\nWhich of the following is not a position in basketball?");
}
static void lifelines(){
System.out.println("\n\n>> YOUR LIFELINES");
System.out.println("\n\n   1 \t             2 \t            3 \t             4\t           5");
System.out.println("(50:50) \t(AUDIENCE) \t (SWITCH) \t   (x2) \t(CLAIM)");
System.out.print("-------------------------------------------------------------------------");
}
static void question2(){
System.out.println("\n\nFor 3,000 Pesos");
System.out.println("\nWhat is the capital city of Australia?");
}
static void question3(){
System.out.println("\n\nFor 5,000 Pesos");
System.out.println("\nWho painted the Mona Lisa?");
}
static void question4(){
System.out.println("\n\nFor 10,000 Pesos");
System.out.println("\nIn Chinese tradition, what is the red packet that contains money called?");
}
static void question5(){
System.out.println("\n\nFor 20,000 Pesos");
System.out.println("\nPriority development assistance is also known by what name?");
}
static void question6(){
System.out.println("\n\nFor 35,000 Pesos");
System.out.println("\nk-9 refers to what animal?");
}
static void question7(){
System.out.println("\n\nFor 50,000 Pesos");
System.out.println("\nIn greek mythology what is the name of the giant with 100 eyes?");
}
static void question8(){
System.out.println("\n\nFor 70,000 Pesos");
System.out.println("\nWhat is the first gene in a gene sequence called?");
}
static void question9(){
System.out.println("\n\nFor 100,000 Pesos");
System.out.println("\nWhat is the scientific term for nearsightedness?");
}
static void question10(){
System.out.println("\n\nFor 150,000 Pesos");
System.out.println("\nAntonio pigafetta is the chronicler of anyone who travels?");
}
static void question11(){
System.out.println("\n\nFor 250,000 Pesos");
System.out.println("\nAt the MTV Music video awards who won the 2013 music video of the year?");
}
static void question12(){
System.out.println("\n\nFor 400,000 Pesos");
System.out.println("\nWhat involuntary movement is seen in a person with tourette's syndrome?");
}
static void question13(){
System.out.println("\n\nFor 600,000 Pesos");
System.out.println("\nIn the movie Hunger Games, What are the poisonous berries that Katniss and Peeta tried to eat?");
}
static void question14(){
System.out.println("\n\nFor 1,000,000 Pesos");
System.out.println("\nHolstein spots are found in What animal?");
}
static void question15(){
System.out.println("\n\nFor 2,000,000 Pesos");
System.out.println("\nIn which country was born the winner of 100 Tour de France, Chris Froome?");
}
static void switss(){
System.out.print("\nYOU USED SWItCH LIFELINE");
System.out.println("\n\nWhat is the meaning of N in the NBA?");
}
}