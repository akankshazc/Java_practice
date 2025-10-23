package hf_7;

public class Vet {
    public void giveShot(Animal a) {
        // give a shot to the Animal at
        // the other end of the 'a' parameter
        a.makeNoise();
    }

    public static void main(String[] args) {
        PetOwner p = new PetOwner();
        p.start();
    }
}

class PetOwner {
    public void start() {
        Vet vet = new Vet();
        Dog dog = new Dog();
        Hippo hippo = new Hippo();

        vet.giveShot(dog);
        vet.giveShot(hippo);
    }
}
