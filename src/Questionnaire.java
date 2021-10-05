import java.util.Scanner;

public class Questionnaire {
   private static String[] userResPonse = new String[20];
   private static int countA;
   private static int countB;

    public static void main(String[] args) {
       // printQuestions();
        answersQuestions();
        displayAnswer();
        calculateAnswer();
        getPersonalityTrait();
    }

        public static String[] printQuestions(){
            String questions  =  """
                                            A                                                                   B
                           1. expend energy, enjoy groups,                                      conserve energy, enjoy one-on-one:
                           2. interpret literally,                                              look for meaning and possibilities:
                           3. logical, thinking, questioning,                                   empathetic, feeling, accomodating:
                           4. organized, orderly,                                               flexible, adaptable:
                           5. more outgoing, think out loud,                                    more reserved, think to yourself:
                           6. practical, realistic, experiential,                               imaginative, innovative, theoretical:  
                           7. candid, straigth forward, frank,                                  tactful, kind, encouraging:
                           8. plan, schedule                                                    unplanned, spontaneous:
                           9. seek many tasks, public activities, interaction with others,      seek private, solitary activities with quiet to concentrate:
                           10 standard, usual, conventional,                                    different, novel, unique:
                           11.firm, tend to criticize, hold the line,                           gentle, tend to appreciate, conciliate:
                           12.regulated, structured,                                            easygoing, "live", "let live":
                           13.external, communicative, express yourself,                        internal, reticent, keep to yourself:
                           14.focus on here-and-now,                                            look to the future, global perspective, "big picture":
                           15.tough-minded, just,                                               tender-hearted, merciful:
                           16.preparation, plan ahead,                                          go with the flow, adapt as you go:
                           17.active initiative,                                                reflective, delibrate:
                           18.facts, things, "what is",                                         ideas, dreams, "what could be", philosophical:
                           19.matter of fact, issue-oriented,                                   sensitive, people-oriented, compassionate:
                           20.control, govern,                                                  latitude, freedom:
""";
            return questions.split(":", 20);
        }

    public static void answersQuestions() {
        String[] questions = printQuestions();
        Scanner input = new Scanner(System.in);
        userResPonse = new String[questions.length];
        System.out.println("Choose the option which best describe you");
        for (int row = 0; row < questions.length; row++) {
            System.out.println(questions[row]);
                 String userinput = input.next();
                userResPonse[row] = userinput;
            while (!(userinput.equalsIgnoreCase("A") || userinput.equalsIgnoreCase("B"))){
                    System.out.println("Select option A or B");
                userinput = input.next();
                }
        }
    }

    public static void displayAnswer()
    {
        for (int row = 1; row < userResPonse.length; row+=4){
//            System.out.println("-".repeat(55));
            System.out.printf("%d", row);
            if(userResPonse[row-1].equalsIgnoreCase("a")){
                System.out.printf("%6s", "A");
            }
            else {
                System.out.printf("%6s", "B");
            }
            System.out.printf("%d",row+1);
            if(userResPonse[row].equalsIgnoreCase("a")){
                System.out.printf("%6s", "A");
            }
            else {
                System.out.printf("%6s", "B");
            }
            System.out.printf("%d",row+2);
            if(userResPonse[row+1].equalsIgnoreCase("a")){
                System.out.printf("%6s", "A");
            }
            else {
                System.out.printf("%6s", "B");
            }
            System.out.printf("%d",row+3);
            if(userResPonse[row].equalsIgnoreCase("a")){
                System.out.printf("%6s", "A");
            }
            else {
                System.out.printf("%6s", "B");
            }
            System.out.println();
            }
        System.out.println();
    }

    private static void calculateAnswer() {
        for (int row = 0; row < 4; row++) {
            countA = 0;
            countB = 0;
            if (userResPonse[row].equalsIgnoreCase("A")) {
                countA++;
            } else countB++;

            if (userResPonse[row + 4].equalsIgnoreCase("A")) {
                countA++;
            } else countB++;
            if (userResPonse[row + 8].equalsIgnoreCase("A")) {
                countA++;
            } else countB++;
            if (userResPonse[row + 12].equalsIgnoreCase("A")) {
                countA++;
            } else countB++;
            if (userResPonse[row + 16].equalsIgnoreCase("A")) {
                countA++;
            } else countB++;
            System.out.printf("%5s%5s%n", countA + " ", countB);

        }
    }

    public static void getPersonalityTrait() {
            for (int row = 0; row < 4; row++) {
                switch (row) {
                    case 0 -> {
                        if (countA > countB) {
                            System.out.println("Extrovert");
                        } else
                            System.out.println("Introvert");
                    }
                    case 1 -> {
                        if (countA > countB) {
                            System.out.println("Sensing");
                        } else System.out.println("Intuition");
                    }
                    case 2 -> {
                        if (countA > countB) {
                            System.out.println("Thinking");
                        } else System.out.println("Feeling");
                    }
                    case 3 -> {
                        if (countA > countB) {
                            System.out.println("Judging");
                        } else System.out.println("Perceiving");
                    }
                }
            }
        }
    }