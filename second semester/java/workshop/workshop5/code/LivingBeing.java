
//Interface LivingBeing
interface LivingBeingg {
 void specialFeature();
}

//Class Fish implementing LivingBeing interface
class Fish implements LivingBeingg {
 @Override
 public void specialFeature() {
     System.out.println("Fish can breathe underwater.");
 }
}

//Class Bird implementing LivingBeing interface
class Bird implements LivingBeingg {
 @Override
 public void specialFeature() {
     System.out.println("Birds can fly.");
 }
}

public class LivingBeing {
 public static void main(String[] args) {
     // Creating instances of Fish and Bird
     Fish fish = new Fish();
     Bird bird = new Bird();

     // Calling specialFeature method for Fish and Bird
     fish.specialFeature();
     bird.specialFeature();
 }
}
