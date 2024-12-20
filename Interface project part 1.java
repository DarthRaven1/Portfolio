    //Simple dog class created by Asher Lilly 
    //for Software and Programming Dev 2024 

    import java.util.Random; // this imports the the Random class that lets me use it
    import java.util.List; // this imports the the List class that lets me use it
    import java.util.ArrayList; // this imports the the ArrayList class that lets me use it
    import java.util.Collections;//this imports the Collections class that lets me use it
    
    public class Dog implements Comparable<Dog> {
          
        public void bark() { // this is the Bark behavior for the dogs
    
        };
    
        public void dig() { // this is the Dig behavior for the dogs
    
        };
    
        public void growl() { // this is the Growl behavior for the dogs
    
        };
    
    String name; // current name of the dog
        
        int birthYear; // year the dog was born
        
        String breed; // the breed of the dog
        
        String stateOfMind; // how the dog is feeling
         
         public Dog(String name, int birthYear, String breed, String stateOfMind) {//this calls the attributes in each dog object
         
         this.name = name;
         
         this.birthYear = birthYear;
        
        this.breed = breed;
        
        this.stateOfMind = stateOfMind;
        
     
      
         }; // end of dog constructor
        @Override
    public int compareTo(Dog otherDog) {// this determines which dog goes first based on the first letter of their name.
        return this.name.compareTo(otherDog.name);
        
    }
       
        public static void main(String args[]) { // this is the main method
        
            List<Dog> objects = new ArrayList<>(); // this initializes the dog array
        
     Dog dog1 = new Dog("Spot", 2022, "French Bulldog", "calm"); // this is the first dog.
    
        Dog dog2 = new Dog("Charlie", 2018, "Golden retriever", "calm"); // this is the second dog.
    
        Dog dog3 = new Dog("Beau", 2020, "Poodle", "calm"); // (Beau is pronounced Bow, like a bow tie, don't ask me why)
        
        Dog dog4 = new Dog("Max", 2014, "Border Collie", "calm"); // This is the fourth dog
        
        Dog dog5 = new Dog("Buddy", 2015, "Corgi", "calm"); // This is the fifth dog
        
        Dog dog6 = new Dog("Jack", 2009, "Beagle", "calm"); // This is the sixth dog
        
        Dog dog7 = new Dog("Jax", 2010, "French Bulldog", "calm"); // This is the seventh dog
        
        Dog dog8 = new Dog("Shadow", 2013, "Husky", "calm"); // This is the eighth dog
        
        Dog dog9 = new Dog("Bear", 2023, "Alaskan Malamute", "calm"); // This is the ninth dog
        
        Dog dog10 = new Dog("Snoopy", 2021, "Labrador Retriever", "calm"); // This is the tenth dog
    
    
        
        
        
        
    
        objects.add(dog1); // this adds the dog1 object
        
        objects.add(dog2); // this adds the dog2 object
        
        objects.add(dog3); // this adds the dog3 object
        
        objects.add(dog4); // this adds the dog4 object
        
        objects.add(dog5); // this adds the dog5 object
        
        objects.add(dog6); // this adds the dog6 object
        
        objects.add(dog7); // this adds the dog7 object
        
        objects.add(dog8); // this adds the dog8 object
        
        objects.add(dog9); // this adds the dog9 object
        
        objects.add(dog10); // this adds the dog10 object
        
        Collections.sort(objects);
        
            Random random1 = new Random(); // this whole thing (lines 65-69) is what randomizes the behaviors.
            
            int rand = 0;
    
                rand = random1.nextInt(10) + 1;
            
        
       
      for (Dog dog : objects) {
        boolean isBarking = random1.nextBoolean();
        boolean isDigging = random1.nextBoolean();
        boolean isGrowling = random1.nextBoolean();
        handleBehaviors(dog, isBarking, isDigging, isGrowling);
    }; // this calls the argument for the handleBehaviors method
       
        } // end of main method
        
      public static void handleBehaviors(Dog dog, boolean isBarking, boolean isDigging, boolean isGrowling) { // this prints the dog's individual names and what they are doing
        if (isBarking) {
            System.out.println(dog.name + " is barking!");
        }
        if (isDigging) {
            System.out.println(dog.name + " is digging holes in the yard!");
        }
        if (isGrowling) {
            System.out.println(dog.name + " is growling!");
        }
      } // end of handleBehaviors
        
        
        
        
        
        
        
        
        
    };// end of Dog class    
    
