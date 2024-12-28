import  java.util.*;

// issue with a letter appearing twice

public class WordGame {
    public static String[] listOfWords = {"About", "Alert", "Argue", "Beach",
    "Above", "Alike", "Arise", "Began",
    "Abuse", "Alive", "Array", "Begin",
    "Actor", "Allow", "Aside", "Begun",
    "Acute", "Alone", "Asset", "Being",
    "Admit", "Along", "Audio", "Below",
    "Adopt", "Alter", "Audit", "Bench",
    "Adult", "Among", "Avoid", "Billy",
    "After", "Anger", "Award", "Birth",
    "Again", "Angle", "Aware", "Black",
    "Agent", "Angry", "Badly", "Blame",
    "Agree", "Apart", "Baker", "Blind",
    "Ahead", "Apple", "Bases", "Block",
    "Alarm", "Apply", "Basic", "Blood",
    "Album", "Arena", "Basis", "Board",
    "Boost", "Buyer", "China", "Cover",
    "Booth", "Cable", "Chose", "Craft",
    "Bound", "Calif", "Civil", "Crash",
    "Brain", "Carry", "Claim", "Cream",
    "Brand", "Catch", "Class", "Crime",
    "Bread", "Cause", "Clean", "Cross",
    "Break", "Chain", "Clear", "Crowd",
    "Breed", "Chair", "Click", "Crown",
    "Brief", "Chart", "Clock", "Curve",
    "Bring", "Chase", "Close", "Cycle",
    "Broad", "Cheap", "Coach", "Daily",
    "Broke", "Check", "Coast", "Dance",
    "Brown", "Chest", "Could", "Dated",
    "Build", "Chief", "Count", "Dealt",
    "Built", "Child", "Court", "Death",
    "Debut", "Entry", "Forth", "Group",
    "Delay", "Equal", "Forty", "Grown",
    "Depth", "Error", "Forum", "Guard",
    "Doing", "Event", "Found", "Guess",
    "Doubt", "Every", "Frame", "Guest",
    "Dozen", "Exact", "Frank", "Guide",
    "Draft", "Exist", "Fraud", "Happy",
    "Drama", "Extra", "Fresh", "Harry",
    "Drawn", "Faith", "Front", "Heart",
    "Dream", "False", "Fruit", "Heavy",
    "Dress", "Fault", "Fully", "Hence",
    "Drill", "Fibre", "Funny", "Night",
    "Drink", "Field", "Giant", "Horse",
    "Drive", "Fifth", "Given", "Hotel",
    "Drove", "Fifty", "Glass", "House",
    "Dying", "Fight", "Globe", "Human",
    "Eager", "Final", "Going", "Ideal",
    "Early", "First", "Grace", "Image",
    "Earth", "Fixed", "Grade", "Index",
    "Eight", "Flash", "Grand", "Inner",
    "Elite", "Fleet", "Grant", "Input",
    "Empty", "Floor", "Grass", "Issue",
    "Enemy", "Fluid", "Great", "Irony",
    "Enjoy", "Focus", "Green", "Juice",
    "Enter", "Force", "Gross", "Joint",
    "Judge", "Metal", "Media", "Newly",
    "Known", "Local", "Might", "Noise",
    "Label", "Logic", "Minor", "North",
    "Large", "Loose", "Minus", "Noted",
    "Laser", "Lower", "Mixed", "Novel",
    "Later", "Lucky", "Model", "Nurse",
    "Laugh", "Lunch", "Money", "Occur",
    "Layer", "Lying", "Month", "Ocean",
    "Learn", "Magic", "Moral", "Offer",
    "Lease", "Major", "Motor", "Often",
    "Least", "Maker", "Mount", "Order",
    "Leave", "March", "Mouse", "Other",
    "Legal", "Music", "Mouth", "Ought",
    "Level", "Match", "Movie", "Paint",
    "Light", "Mayor", "Needs", "Paper",
    "Limit", "Meant", "Never", "Party",
    "Peace", "Power", "Radio", "Round",
    "Panel", "Press", "Raise", "Route",
    "Phase", "Price", "Range", "Royal",
    "Phone", "Pride", "Rapid", "Rural",
    "Photo", "Prime", "Ratio", "Scale",
    "Piece", "Print", "Reach", "Scene",
    "Pilot", "Prior", "Ready", "Scope",
    "Pitch", "Prize", "Refer", "Score",
    "Place", "Proof", "Right", "Sense",
    "Plain", "Proud", "Rival", "Serve",
    "Plane", "Prove", "River", "Seven",
    "Plant", "Queen", "Quick", "Shall",
    "Plate", "Sixth", "Stand", "Shape",
    "Point", "Quiet", "Roman", "Share",
    "Pound", "Quite", "Rough", "Sharp",
    "Sheet", "Spare", "Style", "Times",
    "Shelf", "Speak", "Sugar", "Tired",
    "Shell", "Speed", "Suite", "Title",
    "Shift", "Spend", "Super", "Today",
    "Shirt", "Spent", "Sweet", "Topic",
    "Shock", "Split", "Table", "Total",
    "Shoot", "Spoke", "Taken", "Touch",
    "Short", "Sport", "Taste", "Tough",
    "Shown", "Staff", "Taxes", "Tower",
    "Sight", "Stage", "Teach", "Track",
    "Since", "Stake", "Teeth", "Trade",
    "Sixty", "Start", "TexAs", "Treat",
    "Sized", "State", "Thank", "Trend",
    "Skill", "Steam", "Their", "Trial",
    "Sleep", "Steel", "Theme", "Truck",
    "Slide", "Stick", "There", "Truly",
    "Small", "Still", "Thing", "Truth",
    "Smart", "Stock", "These", "Twice",
    "Smile", "Stone", "Thick", "Under",
    "Smith", "Stood", "Thing", "Truth",
    "Smoke", "Store", "Think", "Truck",
    "Solid", "Storm", "Third", "Truth",
    "Solve", "Story", "Those", "Twice",
    "Sorry", "Strip", "Three", "Under",
    "Sound", "Stuck", "Threw", "Undue",
    "South", "Study", "Throw", "Union",
    "Space", "Stuff", "Tight", "Unity",
    "Upset", "Whole", "Waste", "Wound",
    "Urban", "Whose", "Watch", "Write",
    "Usage", "Woman", "Water", "Wrong",
    "Usual", "Train", "Wheel", "Wrote",
    "Valid", "World", "Where", "Yield",
    "Value", "Worry", "Which", "Young",
    "Video", "Worse", "While", "Youth",
    "Virus", "Worst", "White", "Worth",
    "Visit", "Would", "Vital", "Voice"
    };
    public static void main(String[] args) { 
        boolean correct=false; 
        String enteredWord, chosenWord;
        char[] correctPos = new char[5];
        char[] wrongPos = new char[5];
        boolean[] flag = new boolean[5];
        int csize=-1,wsize=-1;
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        chosenWord = listOfWords[random.nextInt(listOfWords.length)];
        
        chosenWord = chosenWord.toLowerCase();
        
        // System.out.println("Chosen Word: " + chosenWord);

        for(int i=0;i<5;i++){
            System.out.println("Enter a 5 letter word:");
            enteredWord = sc.nextLine();

            enteredWord = enteredWord.toLowerCase();

            if (chosenWord.compareTo(enteredWord) == 0) {
                System.out.println("Correct");
                // System.out.println();
                // System.out.println();
                // System.out.print("Wanna play again(y/n):");
                correct =true;
                break;
            }
            for (int j = 0; j < 5; j++) {
                if ( chosenWord.charAt(j) == enteredWord.charAt(j) ) {
                    correctPos[++csize] = enteredWord.charAt(j);
                    flag[j] = true;
                }
            }

            for (int j = 0; j < 5; j++) {
                if ( !flag[j] && chosenWord.contains(String.valueOf(enteredWord.charAt(j))) ) {
                    wrongPos[++wsize] = enteredWord.charAt(j);
                }
            }
            if(csize!=-1){
                System.out.print("Letters at correct position: ");
                for (int l = 0; l <= csize; l++) {
                    System.out.print(correctPos[l]);
                }
                System.out.println();
            }
            if(wsize!=-1){
                System.out.print("Letters at wrong position: ");
                for (int l = 0; l <= wsize; l++) {
                    System.out.print(wrongPos[l]);
                }
                System.out.println();
            }
            csize = wsize = -1;
            for(int k=0;k<5;k++) {
                flag[k] = false;
            }
        }
        if(!correct){
            System.out.println("The correct word is " + chosenWord);
            System.out.println("Failure");
        }
        sc.close();
    }
}
