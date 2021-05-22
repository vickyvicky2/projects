package VirtualAssistant;
import java.util.*;
 /**
 * Virtual Assistant FINAL PROJECT
 * @author Victoria Aguilar
 * due 5/18/2021
 */

public class VirtualAssistant {
    
    public static void main(String args[]) {
   
        VirtualAssistant assistant = new VirtualAssistant();
        assistant.Run();
        
    } //end main 
   
  
    protected Scanner scanner = new Scanner(System.in);
    
    public String userName;
    
    public ArrayList<String> favoritePeople;
    
    public ArrayList<String> joke;
    
    protected ArrayList<String> weather;
    
    protected int ramdomWeatherReport;
   
    //gets users name 
    protected String getName(){
       
        System.out.print("Please enter your name:");
        return this.scanner.nextLine();
    }
   
    //asks for favorite people 
    protected ArrayList<String> getFavoritePeople(){
       
        ArrayList<String> favPeople = new ArrayList<>();

        System.out.println("How Many people would you like me to remember?");
        int t = this.scanner.nextInt();

        System.out.println("Please enter their names");
        this.scanner.nextLine();
       
        //loop to add the names of favorite people 
        for(int i = 0; i<t; i++) {
            System.out.print(i+1 + ")");
            String name = scanner.nextLine();
            favPeople.add(name);
        }

        return favPeople;
    }
   
   //displays goodbye message 
    protected void GoodbyeMessage(){
        System.out.println("Goodbye" + this.userName + "!");
    }
   
   //solves math problem that user inputs 
    protected void DoMath (){
        System.out.println("What would you like me to solve?");
       
        String problem = this.scanner.nextLine();
        
        //removes spaces 
        problem = problem.replaceAll("\\s", "");
       
       
       //solves addition  
        if(problem.contains("+")) {
           
            Integer[] numbers = BreakProblem(problem, "\\+");
            int answer = numbers[0] + numbers[1];
            System.out.println("Answer: " + answer);
           
           //solves substraction
        } else if (problem.contains("-")){
            Integer[] numbers = BreakProblem(problem, "-");
            int answer = numbers[0] - numbers[1];
            System.out.println("Answer: " + answer);
           
           //solves multiplication
        } else if (problem.contains("*")){
            Integer[] numbers = BreakProblem(problem, "\\*");
            int answer = numbers[0] * numbers[1];
            System.out.println("Answer: " + answer);
           
           //solves division 
        } else if (problem.contains("/")){
            Integer[] numbers = BreakProblem(problem, "/");
            int answer = numbers[0] / numbers[1];
            System.out.println("Answer: " + answer);    
            
        } else if (problem.contains("%")){
            Integer[] numbers = BreakProblem(problem, "%");
            int answer = numbers[1] % numbers[0];
            System.out.println("Answer: " + answer);    
        } else {
           
            //display error if user inputs invalid problem 
            System.out.println("There is an error in your problem :(");
        }
    }
   
    //divides String into ints 
    protected Integer[] BreakProblem(String problem, String operator){
       
        
        String[] stringNumbers = problem.split(operator);
       
    
        Integer[] numbers = {Integer.parseInt(stringNumbers[0]),
                             Integer.parseInt(stringNumbers[1])};
       
        //returns array to be used in DoMath
        return numbers;
    }
   
    //learns joke from user 
    protected void LearnJoke() {
       
        //deletes previous joke if a new one is added 
        this.joke.clear();
       
        System.out.println("Tell me a knock-knock joke to learn!");
        this.scanner.nextLine();
        
        System.out.println("Who's there?");
        
        this.joke.add(this.scanner.nextLine());
        
        System.out.println(this.joke.get(0) + " who?");
        
        this.joke.add(this.scanner.nextLine());
       
        System.out.println("You are so funny " + this.userName + "!");
    }
   
   //displays learned joke 
    protected void TellJoke(){
       
        System.out.println("knock knock");
        this.scanner.nextLine();
        System.out.println(this.joke.get(0));
        this.scanner.nextLine();
        System.out.println(this.joke.get(1));
    }
   
    //makes array for weather report 
    protected ArrayList<String> MakeWeatherArray() {
       
        
        ArrayList<String> weatherArr = new ArrayList<>();
       
        weatherArr.add("Description: cold\n" +
            "Temperature: extremely cold\n" +
            "High: -7°F (-22°C)\n" +
            "Low: -19°F (-29°C)\n" +
            "Relative: Colder than normal\n" +
            "Wind Force: moderate\n" +
            "Wind Speed: 20 mph (32 kph)\n");

        weatherArr.add("Description: beautiful\n" +
            "Temperature: warm\n" +
            "High: 82°F (27°C)\n" +
            "Low: 63°F (17°C)\n" +
            "Relative: warmer than normal\n" +
            "Wind Force: light\n" +
            "Wind Speed: 10 mph (16 kph)\n");

        weatherArr.add("Description: Windy\n" +
            "Temperature: very hot\n" +
            "High: 95°F (35°C)\n" +
            "Low: 73°F (23°C)\n" +
            "Relative: warmer than normal\n" +
            "Wind Force: strong\n" +
            "Wind Speed: 69 mph (111 kph)\n");
       
        return weatherArr;
    }
   
    //displays random weather report 
    protected void TellWeather() {
     
        if(this.ramdomWeatherReport == -1){
            this.ramdomWeatherReport = (int)(Math.random() * ((3 - 1) + 1));
        }
        
        System.out.println(this.weather.get(this.ramdomWeatherReport));
    }
   
    //simulates messages 
    protected void CheckMessages(){
       
        String[] messageContentArr = {"Hey, don't forget tomorrow's test!",
                                       "Why aren't you replying to my messages???",
                                       "Good Morning! Have a nice day! I hope to see you soon."
                                      };
        
        //chooses random number and then chooses random person for the messages 
        int ramdomMessageContent = (int)(Math.random() * ((3 - 1) + 1));
        String randomFavPeople = this.favoritePeople.get(this.favoritePeople.size()-1);
       
        System.out.println("From: " + randomFavPeople);
        System.out.println("Content:");
        System.out.println("\t" + messageContentArr[ramdomMessageContent]);
    }  
   
    //prints menu
    protected void PrintMenu(boolean tellJoke){
 
        if(tellJoke) {
            System.out.println
            ("\n*-----------------------------*\n"
            +"1. Do Math\n"
            +"2. Learn a Knock-Knock Joke\n"
            +"3. What's the Weather?\n"
            +"4. Check Messages\n"
            +"5. Goodbye\n"
            +"*-----------------------------*\n"
            );
        }else{
            System.out.println
            ("\n*-----------------------------*\n"
            +"1. Do Math\n"
            +"2. Learn a Knock-Knock Joke\n"
            +"3. What's the Weather?\n"
            +"4. Check Messages\n"
            +"5. Goodbye\n"
            +"6. Tell a Knock-Knock Joke\n"
            +"*-----------------------------*\n"
            );
        }
    }
    public void Setup() {
        System.out.println("Welcome to your Virtual Assistant");
        this.userName = getName();
        this.favoritePeople = getFavoritePeople();
        this.weather = MakeWeatherArray();
        this.joke = new ArrayList<>();
        this.ramdomWeatherReport = -1;
    }
   
    //executes virtual assistant 
    public void Run(){
       this.Setup();
       
       boolean exit = false;
       
       while(!exit){
       
        System.out.println("How can I assist you " + this.userName + "?\n");
       
        
        //checks which menu to use, depending on whether the assistant knows a new joke, or it does not
        if(!this.joke.isEmpty()){
            PrintMenu(false);
        }else{
            PrintMenu(true);
        }
        int option = this.scanner.nextInt();
        this.scanner.nextLine();
       
        switch(option){
            case 1:
                this.DoMath();
                break;
            case 2:
                this.LearnJoke();
                break;
            case 3:
                this.TellWeather();
                break;
            case 4:
                this.CheckMessages();
                break;
            case 5:
                this.GoodbyeMessage();
                exit = true;
                break;
            case 6:
                this.TellJoke();
                break;
            default:
               System.out.println("No valid option.");
        }
       }
    }
   
} //end class 
