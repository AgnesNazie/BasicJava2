package com.Class;

public class PetDoaTest {
    public static void main(String[] args) {
        // create a new PetDAO object
        PetDAO petDAO = new PetDAOImpl();

        // create a pet object
        Pet myPet = new Pet(1, "Bingo", "Dog");

        //save pet
        petDAO.savePet(myPet);

        //find pet
        Pet foundPet = petDAO.findPetById(1);
        System.out.println("Found pet :" + foundPet);

        //delete pet
        petDAO.deletePet(1);

    }
}
