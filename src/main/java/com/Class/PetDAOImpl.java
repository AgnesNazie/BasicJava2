package com.Class;

public class PetDAOImpl implements PetDAO {
    @Override
    public void savePet(Pet pet) {
        System.out.println("Save pet " + pet.getName());
    }

    @Override
    public Pet findPetById(int id) {
        System.out.println("find pet with id :" + id);
        return new Pet(id, "UNKNOWN", "UNKNOWN");
    }

    @Override
    public void deletePet(int id) {
        System.out.println("Deleting pet with id: " + id);

    }
}
